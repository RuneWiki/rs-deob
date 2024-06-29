import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class260 {

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Z")
    private boolean field3883 = false;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    private int field3876 = 32;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "J")
    private long field3885 = class381.method2281((byte) 110);

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    private int field3888 = 0;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    private int field3887 = 0;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "[Lbs;")
    private class160[] field3890 = new class160[8];

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "Z")
    private boolean field3892 = true;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    private int field3891 = 0;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "J")
    private long field3898 = 0L;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "[Lbs;")
    private class160[] field3895 = new class160[8];

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "J")
    private long field3896 = 0L;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    private int field3897 = 0;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Z")
    public static boolean field3869 = true;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3865 = 0;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lgn;")
    public static class526 field3886 = new class526(13, 3);

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "Luv;")
    public static class2 field3900 = new class2(70, -1);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public int field3893;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    private int field3899;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Lbs;")
    private class160 field3879;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lpl;")
    public static class462 field3873;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[I")
    public int[] field3877;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 5)
    public void method1626(int arg0) throws Exception {
        field3867++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 17)
    public final void method1627(int arg0) {
        this.field3892 = true;
        field3868++;
        if (arg0 != 10348) {
            this.field3897 = -95;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILbs;I)V", line = 29)
    private final void method1628(int arg0, class160 arg1, int arg2) {
        if (arg2 != 0) {
            this.method1630(null, 85);
        }
        field3866++;
        int var4 = arg0 >> 5;
        class160 var5 = this.field3890[var4];
        if (var5 == null) {
            this.field3895[var4] = arg1;
        } else {
            var5.field2398 = arg1;
        }
        this.field3890[var4] = arg1;
        arg1.field2397 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 52)
    public final synchronized void method1629(byte arg0) {
        if (class98.field1513 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class98.field1513.field3050[var3] == this) {
                    class98.field1513.field3050[var3] = null;
                }
                if (class98.field1513.field3050[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class98.field1513.field3055 = true;
                while (class98.field1513.field3054) {
                    class389.method2332(arg0 + 5, 50L);
                }
                class98.field1513 = null;
            }
        }
        field3880++;
        this.method1633();
        this.field3877 = null;
        this.field3883 = true;
        if (arg0 != 15) {
            this.method1635(19, false);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([II)V", line = 96)
    private final void method1630(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class116.field1749) {
            var3 = arg1 << 1;
        }
        class442.method2595(arg0, 0, var3);
        this.field3887 -= arg1;
        if (this.field3879 != null && this.field3887 <= 0) {
            this.field3887 += class208.field3009 >> 4;
            class504.method2980(0, this.field3879);
            this.method1628(this.field3879.method1132(), this.field3879, 0);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class160 var10 = null;
                        class160 var11 = this.field3895[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class329 var12 = var11.field2400;
                                if (var12 == null || var12.field5133 <= var8) {
                                    var11.field2399 = true;
                                    int var13 = var11.method1134();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field5133 += var13;
                                    }
                                    if (var4 >= this.field3876) {
                                        break label107;
                                    }
                                    class160 var14 = var11.method1131();
                                    if (var14 != null) {
                                        int var15 = var11.field2397;
                                        while (var14 != null) {
                                            this.method1628(var15 * var14.method1132() >> 8, var14, 0);
                                            var14 = var11.method1137();
                                        }
                                    }
                                    class160 var16 = var11.field2398;
                                    var11.field2398 = null;
                                    if (var10 == null) {
                                        this.field3895[var7] = var16;
                                    } else {
                                        var10.field2398 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3890[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2398;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class160 var18 = this.field3895[var17];
                this.field3895[var17] = this.field3890[var17] = null;
                while (var18 != null) {
                    class160 var19 = var18.field2398;
                    var18.field2398 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3887 < 0) {
            this.field3887 = 0;
        }
        if (this.field3879 != null) {
            this.field3879.method1136(arg0, 0, arg1);
        }
        this.field3885 = class381.method2281((byte) 109);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lbs;I)V", line = 256)
    public final synchronized void method1631(class160 arg0, int arg1) {
        if (arg1 >= -119) {
            method1636(36);
        }
        this.field3879 = arg0;
        field3872++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()V", line = 267)
    public void method1632() throws Exception {
        field3894++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()V", line = 274)
    public void method1633() {
        field3884++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 281)
    public final synchronized void method1634(byte arg0) {
        field3881++;
        if (this.field3883) {
            return;
        }
        long var2 = class381.method2281((byte) -118);
        try {
            if (arg0 <= 87) {
                this.field3893 = -17;
            }
            if (var2 > this.field3885 + 500000L) {
                this.field3885 = var2 - 500000L;
            }
            while (this.field3885 + 5000L < var2) {
                this.method1635(256, false);
                this.field3885 += (256000 / class208.field3009);
            }
        } catch (Exception var7) {
            this.field3885 = var2;
        }
        if (this.field3877 == null) {
            return;
        }
        try {
            if (this.field3896 != 0L) {
                if (var2 < this.field3896) {
                    return;
                }
                this.method1626(this.field3893);
                this.field3896 = 0L;
                this.field3892 = true;
            }
            int var4 = this.method1638();
            if (this.field3891 < (this.field3888 - var4)) {
                this.field3891 = this.field3888 - var4;
            }
            int var5 = this.field3899 + this.field3889;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3893) {
                this.field3893 += 1024;
                if (this.field3893 > 16384) {
                    this.field3893 = 16384;
                }
                this.method1633();
                this.method1626(this.field3893);
                var4 = 0;
                this.field3892 = true;
                if (this.field3893 < var5 + 256) {
                    var5 = this.field3893 - 256;
                    this.field3899 = var5 - this.field3889;
                }
            }
            while (var4 < var5) {
                this.method1630(this.field3877, 256);
                this.method1632();
                var4 += 256;
            }
            if (this.field3898 < var2) {
                if (this.field3892) {
                    this.field3892 = false;
                } else if (this.field3891 == 0 && this.field3897 == 0) {
                    this.method1633();
                    this.field3896 = var2 + 2000L;
                    return;
                } else {
                    this.field3899 = Math.min(this.field3897, this.field3891);
                    this.field3897 = this.field3891;
                }
                this.field3891 = 0;
                this.field3898 = var2 + 2000L;
            }
            this.field3888 = var4;
        } catch (Exception var6) {
            this.method1633();
            this.field3896 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V", line = 397)
    private final void method1635(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        this.field3887 -= arg0;
        field3878++;
        if (this.field3887 < 0) {
            this.field3887 = 0;
        }
        if (this.field3879 != null) {
            this.field3879.method1135(arg0);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 415)
    public static void method1636(int arg0) {
        if (arg0 == -11028) {
            field3886 = null;
            field3900 = null;
            field3873 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V", line = 427)
    public final synchronized void method1637(int arg0) {
        field3870++;
        this.field3892 = true;
        try {
            this.method1640();
        } catch (Exception var2) {
            this.method1633();
            this.field3896 = class381.method2281((byte) 69) + 2000L;
        }
        if (arg0 != 31394) {
            this.method1627(-30);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()I", line = 458)
    public int method1638() throws Exception {
        field3874++;
        return this.field3893;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 467)
    public void method1639(Component arg0) throws Exception {
        field3875++;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "()V", line = 476)
    public void method1640() throws Exception {
        field3882++;
    }
}
