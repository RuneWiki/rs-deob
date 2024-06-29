import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class257 {

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    private int field3773 = 32;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Z")
    private boolean field3770 = false;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "J")
    private long field3772 = class29.method174(27763);

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    private int field3788 = 0;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "[Lan;")
    private class3[] field3789 = new class3[8];

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "J")
    private long field3797 = 0L;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    private int field3790 = 0;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "J")
    private long field3799 = 0L;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "[Lan;")
    private class3[] field3792 = new class3[8];

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    private int field3802 = 0;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    private int field3800 = 0;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "Z")
    private boolean field3804 = true;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Ldj;")
    public static class44 field3785 = new class44();

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "Lqc;")
    public static class99 field3796 = new class99(30);

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "[I")
    public static int[] field3807 = new int[32768];

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    private int field3806;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Lkm;")
    public static class133 field3776;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Lan;")
    private class3 field3780;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "[I")
    public int[] field3775;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "[I")
    public static int[] field3805;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "[Lbd;")
    public static class177[] field3786;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([II)V", line = 4)
    private final void method1762(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class10.field93) {
            var3 = arg1 << 1;
        }
        class281.method1939(arg0, 0, var3);
        this.field3800 -= arg1;
        if (this.field3780 != null && this.field3800 <= 0) {
            this.field3800 += class273.field4085 >> 4;
            class230.method1597(true, this.field3780);
            this.method1763(this.field3780, 8, this.field3780.method13());
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
                        class3 var10 = null;
                        class3 var11 = this.field3789[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field23;
                                if (var12 == null || var12.field807 <= var8) {
                                    var11.field25 = true;
                                    int var13 = var11.method15();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field807 += var13;
                                    }
                                    if (var4 >= this.field3773) {
                                        break label105;
                                    }
                                    class3 var14 = var11.method12();
                                    if (var14 != null) {
                                        int var15 = var11.field24;
                                        while (var14 != null) {
                                            this.method1763(var14, 8, var15 * var14.method13() >> 8);
                                            var14 = var11.method17();
                                        }
                                    }
                                    class3 var16 = var11.field26;
                                    var11.field26 = null;
                                    if (var10 == null) {
                                        this.field3789[var7] = var16;
                                    } else {
                                        var10.field26 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3792[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field26;
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
                class3 var18 = this.field3789[var17];
                this.field3789[var17] = this.field3792[var17] = null;
                while (var18 != null) {
                    class3 var19 = var18.field26;
                    var18.field26 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3800 < 0) {
            this.field3800 = 0;
        }
        if (this.field3780 != null) {
            this.field3780.method16(arg0, 0, arg1);
        }
        this.field3772 = class29.method174(27763);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()I", line = 163)
    public int method768() throws Exception {
        field3798++;
        return this.field3803;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lan;II)V", line = 174)
    private final void method1763(class3 arg0, int arg1, int arg2) {
        field3778++;
        int var4 = arg2 >> 5;
        class3 var5 = this.field3792[var4];
        if (var5 == null) {
            this.field3789[var4] = arg0;
        } else {
            var5.field26 = arg0;
        }
        this.field3792[var4] = arg0;
        if (arg1 == 8) {
            arg0.field24 = arg2;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()V", line = 194)
    public void method767() {
        field3774++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V", line = 202)
    public static final void method1764(boolean arg0, int arg1) {
        if (arg0) {
            if (class183.field2521 != -1) {
                class155.method1119(class183.field2521, -117);
            }
            for (class48 var2 = (class48) class211.field3056.method110(0); var2 != null; var2 = (class48) class211.field3056.method115(arg1 + 14413)) {
                class290.method1991(true, (byte) 124, var2);
            }
            class183.field2521 = -1;
            class211.field3056 = new class17(8);
            class28.method173((byte) -123);
            class183.field2521 = class251.field3599;
            class134.method977(false, 128);
            class61.method410((byte) 127);
            class241.method1654(class183.field2521, (byte) -68);
        }
        field3787++;
        class42.field485 = -1;
        if (arg1 != -14413) {
            field3777 = 14;
        }
        class10.method57(0, class111.field1491);
        class173.field2356 = new class241();
        class173.field2356.field3745 = 3000;
        class173.field2356.field3679 = 3000;
        if (!class67.field908 && class39.field448 == 0) {
            class256.method1752(false, class204.field2948);
            class189.method1325(1, 10);
            return;
        }
        if (class343.field5168 == 2) {
            class198.field2820 = class314.field4737 << 7;
            class275.field4123 = class66.field870 << 7;
        } else {
            class78.method605(2);
        }
        if (class67.field908) {
            class207.method1463((byte) -103);
        }
        class271.method1875((byte) 123);
        class189.method1325(1, 28);
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "()V", line = 263)
    public void method764() throws Exception {
        field3793++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V", line = 270)
    private final void method1765(int arg0, int arg1) {
        field3784++;
        if (arg0 > -15) {
            this.field3799 = -79L;
        }
        this.field3800 -= arg1;
        if (this.field3800 < 0) {
            this.field3800 = 0;
        }
        if (this.field3780 != null) {
            this.field3780.method14(arg1);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 294)
    public final synchronized void method1766(byte arg0) {
        if (arg0 != -44) {
            this.method1771(-4);
        }
        field3783++;
        this.field3804 = true;
        try {
            this.method764();
        } catch (Exception var3) {
            this.method767();
            this.field3797 = class29.method174(arg0 + 27807) + 2000L;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 323)
    public static void method1767(byte arg0) {
        field3805 = null;
        field3796 = null;
        field3776 = null;
        field3785 = null;
        field3786 = null;
        int var1 = 77 / ((arg0 + 34) / 32);
        field3807 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 340)
    public final synchronized void method1768(boolean arg0) {
        field3771++;
        if (this.field3770) {
            return;
        }
        long var2 = class29.method174(27763);
        try {
            if (var2 > this.field3772 + 500000L) {
                this.field3772 = var2 - 500000L;
            }
            while (var2 > (this.field3772 + 5000L)) {
                this.method1765(-68, 256);
                this.field3772 += (long) (256000 / class273.field4085);
            }
        } catch (Exception var9) {
            this.field3772 = var2;
        }
        if (!arg0 || this.field3775 == null) {
            return;
        }
        try {
            if (this.field3797 != 0L) {
                if (this.field3797 > var2) {
                    return;
                }
                this.method763(this.field3803);
                this.field3804 = true;
                this.field3797 = 0L;
            }
            int var5 = this.method768();
            if (this.field3788 < (this.field3790 - var5)) {
                this.field3788 = this.field3790 - var5;
            }
            int var6 = this.field3806 + this.field3791;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (var6 + 256 > this.field3803) {
                var5 = 0;
                this.field3803 += 1024;
                if (this.field3803 > 16384) {
                    this.field3803 = 16384;
                }
                this.method767();
                this.method763(this.field3803);
                if ((var6 + 256) > this.field3803) {
                    var6 = this.field3803 - 256;
                    this.field3806 = var6 - this.field3791;
                }
                this.field3804 = true;
            }
            while (var5 < var6) {
                var5 += 256;
                this.method1762(this.field3775, 256);
                this.method766();
            }
            if (var2 > this.field3799) {
                if (this.field3804) {
                    this.field3804 = false;
                } else if (this.field3788 == 0 && this.field3802 == 0) {
                    this.method767();
                    this.field3797 = var2 + 2000L;
                    return;
                } else {
                    this.field3806 = Math.min(this.field3802, this.field3788);
                    this.field3802 = this.field3788;
                }
                this.field3788 = 0;
                this.field3799 = var2 + 2000L;
            }
            this.field3790 = var5;
        } catch (Exception var8) {
            this.method767();
            this.field3797 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLan;)V", line = 457)
    public final synchronized void method1769(boolean arg0, class3 arg1) {
        if (!arg0) {
            field3779++;
            this.field3780 = arg1;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 468)
    public void method765(Component arg0) throws Exception {
        field3782++;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V", line = 476)
    public final void method1770(byte arg0) {
        if (arg0 <= -38) {
            field3794++;
            this.field3804 = true;
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "()V", line = 487)
    public void method766() throws Exception {
        field3795++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 498)
    public void method763(int arg0) throws Exception {
        field3781++;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 505)
    public final synchronized void method1771(int arg0) {
        field3801++;
        if (class252.field3622 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class252.field3622.field256[var3] == this) {
                    class252.field3622.field256[var3] = null;
                }
                if (class252.field3622.field256[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class252.field3622.field262 = true;
                while (class252.field3622.field255) {
                    class186.method1304(10, 50L);
                }
                class252.field3622 = null;
            }
        }
        if (arg0 == 0) {
            this.method767();
            this.field3770 = true;
            this.field3775 = null;
        }
    }
}
