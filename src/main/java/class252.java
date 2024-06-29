import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class252 {

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "Z")
    private boolean field3881 = false;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    private int field3883 = 32;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "J")
    private long field3887 = class156.method1273((byte) -75);

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
    private int field3891 = 0;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
    private int field3895 = 0;

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "J")
    private long field3894 = 0L;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "[Lph;")
    private class169[] field3896 = new class169[8];

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "Z")
    private boolean field3900 = true;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "J")
    private long field3901 = 0L;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
    private int field3902 = 0;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    private int field3899 = 0;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "[Lph;")
    private class169[] field3903 = new class169[8];

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public static int field3882 = 0;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "[Lcj;")
    public static class210[] field3879 = new class210[50];

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "B")
    public static byte field3888 = 0;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
    private int field3893;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
    public int field3897;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "Lph;")
    private class169 field3885;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[I")
    public int[] field3871;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "[[B")
    public static byte[][] field3884;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([II)V", line = 6)
    private final void method1869(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class61.field946) {
            var3 = arg1 << 1;
        }
        class65.method638(arg0, 0, var3);
        this.field3895 -= arg1;
        if (this.field3885 != null && this.field3895 <= 0) {
            this.field3895 += class294.field4571 >> 4;
            class83.method744(this.field3885, (byte) 68);
            this.method1872((byte) 84, this.field3885, this.field3885.method56());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class169 var10 = null;
                        class169 var11 = this.field3903[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class80 var12 = var11.field2679;
                                if (var12 == null || var12.field1164 <= var8) {
                                    var11.field2677 = true;
                                    int var13 = var11.method88();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1164 += var13;
                                    }
                                    if (var4 >= this.field3883) {
                                        break label105;
                                    }
                                    class169 var14 = var11.method61();
                                    if (var14 != null) {
                                        int var15 = var11.field2676;
                                        while (var14 != null) {
                                            this.method1872((byte) 84, var14, var15 * var14.method56() >> 8);
                                            var14 = var11.method81();
                                        }
                                    }
                                    class169 var16 = var11.field2678;
                                    var11.field2678 = null;
                                    if (var10 == null) {
                                        this.field3903[var7] = var16;
                                    } else {
                                        var10.field2678 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3896[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2678;
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
                class169 var18 = this.field3903[var17];
                this.field3903[var17] = this.field3896[var17] = null;
                while (var18 != null) {
                    class169 var19 = var18.field2678;
                    var18.field2678 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3895 < 0) {
            this.field3895 = 0;
        }
        if (this.field3885 != null) {
            this.field3885.method47(arg0, 0, arg1);
        }
        this.field3887 = class156.method1273((byte) -39);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)I", line = 166)
    public static final int method1870(byte arg0, int arg1) {
        field3868++;
        return arg0 < 78 ? 9 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V", line = 177)
    private final void method1871(int arg0, int arg1) {
        field3892++;
        this.field3895 -= arg0;
        if (this.field3895 < arg1) {
            this.field3895 = 0;
        }
        if (this.field3885 != null) {
            this.field3885.method82(arg0);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()I", line = 197)
    public int method117() throws Exception {
        field3880++;
        return this.field3898;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLph;I)V", line = 208)
    private final void method1872(byte arg0, class169 arg1, int arg2) {
        if (arg0 != 84) {
            this.field3891 = -97;
        }
        int var4 = arg2 >> 5;
        class169 var5 = this.field3896[var4];
        field3890++;
        if (var5 == null) {
            this.field3903[var4] = arg1;
        } else {
            var5.field2678 = arg1;
        }
        this.field3896[var4] = arg1;
        arg1.field2676 = arg2;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)J", line = 234)
    public static final long method1873(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        return var3 == null || var3.field5065 == null ? 0L : var3.field5065.field4325;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 245)
    public void method116(int arg0) throws Exception {
        field3875++;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "()V", line = 253)
    public void method114() {
        field3869++;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V", line = 265)
    public final void method1874(int arg0) {
        field3876++;
        if (arg0 == 0) {
            this.field3900 = true;
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "()V", line = 280)
    public void method118() throws Exception {
        field3886++;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 290)
    public static final void method1875(String arg0, int arg1) {
        field3877++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg1 != -30184) {
            method1880((byte) -43);
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILph;)V", line = 303)
    public final synchronized void method1876(int arg0, class169 arg1) {
        this.field3885 = arg1;
        if (arg0 != 30555) {
            this.method1869((int[]) null, 98);
        }
        field3874++;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 315)
    public void method119(Component arg0) throws Exception {
        field3873++;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)V", line = 326)
    public final synchronized void method1877(int arg0) {
        field3872++;
        this.field3900 = true;
        int var2 = -7 % ((19 - arg0) / 50);
        try {
            this.method118();
        } catch (Exception var4) {
            this.method114();
            this.field3901 = class156.method1273((byte) -68) + 2000L;
        }
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "()V", line = 347)
    public void method115() throws Exception {
        field3889++;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 356)
    public final synchronized void method1878(byte arg0) {
        field3878++;
        if (this.field3881) {
            return;
        }
        int var2 = -85 / ((28 - arg0) / 51);
        long var3 = class156.method1273((byte) -115);
        try {
            if (var3 > (this.field3887 + 500000L)) {
                this.field3887 = var3 - 500000L;
            }
            while (var3 > this.field3887 + 5000L) {
                this.method1871(256, 0);
                this.field3887 += (long) (256000 / class294.field4571);
            }
        } catch (Exception var10) {
            this.field3887 = var3;
        }
        if (this.field3871 == null) {
            return;
        }
        try {
            if (this.field3901 != 0L) {
                if (var3 < this.field3901) {
                    return;
                }
                this.method116(this.field3898);
                this.field3900 = true;
                this.field3901 = 0L;
            }
            int var6 = this.method117();
            if (this.field3899 < (this.field3902 - var6)) {
                this.field3899 = this.field3902 - var6;
            }
            int var7 = this.field3897 + this.field3893;
            if (var7 + 256 > 16384) {
                var7 = 16128;
            }
            if ((var7 + 256) > this.field3898) {
                this.field3898 += 1024;
                var6 = 0;
                if (this.field3898 > 16384) {
                    this.field3898 = 16384;
                }
                this.method114();
                this.method116(this.field3898);
                if (var7 + 256 > this.field3898) {
                    var7 = this.field3898 - 256;
                    this.field3893 = var7 - this.field3897;
                }
                this.field3900 = true;
            }
            while (var6 < var7) {
                this.method1869(this.field3871, 256);
                this.method115();
                var6 += 256;
            }
            if (var3 > this.field3894) {
                if (this.field3900) {
                    this.field3900 = false;
                } else if (this.field3899 == 0 && this.field3891 == 0) {
                    this.method114();
                    this.field3901 = var3 + 2000L;
                    return;
                } else {
                    this.field3893 = Math.min(this.field3891, this.field3899);
                    this.field3891 = this.field3899;
                }
                this.field3899 = 0;
                this.field3894 = var3 + 2000L;
            }
            this.field3902 = var6;
        } catch (Exception var9) {
            this.method114();
            this.field3901 = var3 + 2000L;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V", line = 476)
    public final synchronized void method1879(boolean arg0) {
        if (class153.field2481 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class153.field2481.field1596[var3] == this) {
                    class153.field2481.field1596[var3] = null;
                }
                if (class153.field2481.field1596[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class153.field2481.field1593 = true;
                while (class153.field2481.field1598) {
                    class188.method1443(10, 50L);
                }
                class153.field2481 = null;
            }
        }
        this.method114();
        field3870++;
        this.field3871 = null;
        this.field3881 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)V", line = 518)
    public static void method1880(byte arg0) {
        field3879 = null;
        field3884 = (byte[][]) null;
        if (arg0 >= -37) {
            field3884 = (byte[][]) ((byte[][]) null);
        }
    }
}
