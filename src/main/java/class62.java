import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class62 {

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    private int field863 = 1;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    private int field866 = 0;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
    private int field869 = 1;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
    private int field875 = 0;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "Ltm;")
    private class412 field871 = new class412();

    @OriginalMember(owner = "client!fw", name = "w", descriptor = "Z")
    private boolean field880 = true;

    @OriginalMember(owner = "client!fw", name = "x", descriptor = "Z")
    private boolean field881 = true;

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "Z")
    private boolean field884 = false;

    @OriginalMember(owner = "client!fw", name = "v", descriptor = "I")
    private int field879 = -1;

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "I")
    private int field883 = 0;

    @OriginalMember(owner = "client!fw", name = "D", descriptor = "Z")
    private boolean field887 = true;

    @OriginalMember(owner = "client!fw", name = "E", descriptor = "[Ltca;")
    private class184[] field888 = new class184[2];

    @OriginalMember(owner = "client!fw", name = "F", descriptor = "Z")
    private boolean field889 = true;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "Ldia;")
    private class246 field862;

    @OriginalMember(owner = "client!fw", name = "t", descriptor = "Lmj;")
    private class682 field877;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "Lmj;")
    private class682 field867;

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "Lmj;")
    private class682 field872;

    @OriginalMember(owner = "client!fw", name = "B", descriptor = "Ljw;")
    public static class581 field885 = new class581(75, 6);

    @OriginalMember(owner = "client!fw", name = "G", descriptor = "Lcf;")
    public static class631 field890 = new class631();

    @OriginalMember(owner = "client!fw", name = "I", descriptor = "I")
    public static int field892 = 0;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fw", name = "s", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!fw", name = "C", descriptor = "Ltca;")
    private class184 field886;

    @OriginalMember(owner = "client!fw", name = "H", descriptor = "Loq;")
    public static class380 field891;

    @OriginalMember(owner = "client!fw", name = "u", descriptor = "Lkq;")
    private class620 field878;

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "Lkq;")
    private class620 field882;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "Z")
    private boolean field870;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ldda;B)Z", line = 4)
    public final boolean method434(class404 arg0, byte arg1) {
        field865++;
        if (this.field867 != null) {
            if (arg0.method2230(256) || arg0.method2225(arg1 + 9630)) {
                this.field871.method2545(-128, arg0);
                this.method443(10);
                if (this.method438((byte) 31)) {
                    if (this.field869 != -1 && this.field863 != -1) {
                        arg0.method2231(arg1 ^ 0x7B, this.field863, this.field869);
                    }
                    arg0.field5865 = true;
                    return true;
                }
            }
            this.method444(arg0, (byte) -115);
        }
        return arg1 == 122 ? false : false;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V", line = 40)
    public final void method435(int arg0) {
        this.field882 = null;
        this.field888 = null;
        field860++;
        this.field867 = this.field872 = this.field877 = null;
        this.field878 = null;
        this.field886 = null;
        if (arg0 >= -13) {
            return;
        }
        if (!this.field871.method2540(false)) {
            for (class101 var2 = this.field871.method2551((byte) -108); var2 != this.field871.field5921; var2 = var2.field1412) {
                ((class404) var2).method2228(88);
            }
        }
        this.field869 = this.field863 = 1;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIZI)Z", line = 71)
    public final boolean method436(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field874++;
        if (!arg3) {
            this.field867 = null;
        }
        if (this.field867 == null || this.field871.method2540(false)) {
            return false;
        }
        if (this.field869 != arg1 || this.field863 != arg4) {
            this.field863 = arg4;
            this.field869 = arg1;
            for (class101 var6 = this.field871.method2551((byte) -108); var6 != this.field871.field5921; var6 = var6.field1412) {
                ((class404) var6).method2231(1, this.field863, this.field869);
            }
            this.field887 = true;
            this.field889 = true;
            this.field880 = true;
        }
        if (!this.method438((byte) 31)) {
            return false;
        }
        this.field870 = true;
        this.field866 = arg0;
        this.field875 = arg2;
        this.field862.method1638((byte) -23, this.field867);
        this.field867.method3795(68, 0);
        this.field862.method1607(-this.field866, this.field875 + this.field863 - this.field862.field3500, (byte) 103);
        return true;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V", line = 120)
    public final void method437(int arg0) {
        field864++;
        if (!this.field870) {
            return;
        }
        if (this.field872 != null) {
            this.field862.method1655(this.field872, true);
            int var2 = 16384;
            this.field862.method1636((byte) 126, this.field877);
            this.field872.method3786((byte) -126, 0);
            this.field877.method3795(arg0 ^ 0x3C, 0);
            if (this.field884) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field869, this.field863, 0, 0, this.field869, this.field863, var2, 9728);
            this.field862.method1654(arg0 + 2, this.field872);
            this.field862.method1616(this.field877, -1);
        }
        this.field862.method1603(116);
        this.field862.method1648(arg0, 0);
        this.field862.method1589(arg0 - 4, 1);
        this.field862.method543();
        int var3 = 0;
        int var4 = 1;
        class404 var6;
        for (class404 var5 = (class404) this.field871.method2551((byte) -108); var5 != null; var5 = var6) {
            var6 = (class404) this.field871.method2542(-121);
            int var7 = var5.method2517(arg0 + 121);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method2223((byte) 94, this.field886, var8, this.field888[var3]);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field862.method1621(this.field877, false);
                    this.field862.method1607(0, 0, (byte) 103);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field863);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field866, this.field875);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field866, this.field875 + this.field863);
                    OpenGL.glTexCoord2f((float) this.field869, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field869 + this.field866, this.field875 - -this.field863);
                    OpenGL.glTexCoord2f((float) this.field869, (float) this.field863);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field869 + this.field866, this.field875);
                    OpenGL.glEnd();
                } else {
                    this.field877.method3795(arg0 ^ 0x72, -(-var4));
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field863);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field863);
                    OpenGL.glTexCoord2f((float) this.field869, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field869, this.field863);
                    OpenGL.glTexCoord2f((float) this.field869, (float) this.field863);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field869, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
                var5.method2224(var8, (byte) -128);
            }
        }
        this.field870 = false;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)Z", line = 221)
    private final boolean method438(byte arg0) {
        if (arg0 != 31) {
            method440(-45, 95, null, -28, true, -102, null, 18, -12, -74, null, -112, -94, 9, 9);
        }
        if (this.field889) {
            if (this.field882 != null) {
                this.field882.method3406(true);
                this.field882 = null;
            }
            if (this.field886 != null) {
                this.field886.method47(120);
                this.field886 = null;
            }
            if (this.field872 != null) {
                this.field882 = new class620(this.field862, 6402, this.field869, this.field863, this.field862.field3512);
            }
            if (this.field884) {
                this.field886 = new class184(this.field862, 34037, 6402, this.field869, this.field863);
            } else if (this.field882 == null) {
                this.field882 = new class620(this.field862, 6402, this.field869, this.field863);
            }
            this.field880 = true;
            this.field881 = true;
            this.field889 = false;
        }
        field858++;
        if (this.field887) {
            if (this.field878 != null) {
                this.field878.method3406(true);
                this.field878 = null;
            }
            if (this.field888[0] != null) {
                this.field888[0].method47(101);
                this.field888[0] = null;
            }
            if (this.field888[1] != null) {
                this.field888[1].method47(arg0 ^ 0x70);
                this.field888[1] = null;
            }
            if (this.field872 != null) {
                this.field878 = new class620(this.field862, this.field879, this.field869, this.field863, this.field862.field3512);
            }
            this.field888[0] = new class184(this.field862, 34037, this.field879, this.field869, this.field863);
            this.field888[1] = this.field883 > 1 ? new class184(this.field862, 34037, this.field879, this.field869, this.field863) : null;
            this.field880 = true;
            this.field887 = false;
            this.field881 = true;
        }
        if (this.field880) {
            if (this.field872 == null) {
                this.field862.method1638((byte) -57, this.field877);
                this.field877.method3792(0, -10604);
                this.field877.method3792(1, -10604);
                this.field877.method3792(8, arg0 ^ 0xFFFFD68B);
                this.field877.method3789(0, (byte) -93, this.field888[0]);
                if (this.field883 > 1) {
                    this.field877.method3789(1, (byte) -93, this.field888[1]);
                }
                if (this.field884) {
                    this.field877.method3789(8, (byte) -93, this.field886);
                } else {
                    this.field877.method3794(-14736, this.field882, 8);
                }
                this.field862.method1621(this.field877, false);
            } else {
                this.field862.method1638((byte) -128, this.field877);
                this.field877.method3792(0, -10604);
                this.field877.method3792(1, -10604);
                this.field877.method3792(8, arg0 ^ 0xFFFFD68B);
                this.field877.method3789(0, (byte) -93, this.field888[0]);
                if (this.field883 > 1) {
                    this.field877.method3789(1, (byte) -93, this.field888[1]);
                }
                if (this.field884) {
                    this.field877.method3789(8, (byte) -93, this.field886);
                }
                this.field862.method1621(this.field877, false);
                this.field862.method1638((byte) -31, this.field872);
                this.field872.method3792(0, -10604);
                this.field872.method3792(8, -10604);
                this.field872.method3794(-14736, this.field878, 0);
                this.field872.method3794(-14736, this.field882, 8);
                this.field862.method1621(this.field872, false);
            }
            this.field881 = true;
            this.field880 = false;
        }
        if (this.field881) {
            this.field862.method1638((byte) -117, this.field867);
            this.field881 = !this.field867.method3787((byte) 11);
            this.field862.method1621(this.field867, false);
        }
        return !this.field881;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(B)Z", line = 350)
    public final boolean method439(byte arg0) {
        if (arg0 > -57) {
            this.method435(-115);
        }
        field868++;
        return this.field867 != null;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(II[IIZI[IIIILoga;IIII)I", line = 361)
    public static final int method440(int arg0, int arg1, int[] arg2, int arg3, boolean arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, class502 arg10, int arg11, int arg12, int arg13, int arg14) {
        field876++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var36 = 0; var36 < 128; var36++) {
                class393.field5803[var15][var36] = 0;
                class5.field48[var15][var36] = 99999999;
            }
        }
        boolean var16;
        if (arg1 == 1) {
            var16 = class617.method3387((byte) -118, arg11, arg10, arg13, arg5, arg7, arg0, arg14, arg12, arg3, arg8);
        } else if (arg1 == 2) {
            var16 = class760.method4218(arg13, arg7, arg11, arg8, arg3, arg0, arg14, -2878, arg5, arg10, arg12);
        } else {
            var16 = class82.method690(arg7, arg14, arg0, arg12, arg13, arg10, arg3, 0, arg1, arg5, arg8, arg11);
        }
        int var17 = arg5 - 64;
        int var18 = arg7 - 64;
        int var19 = class275.field4086;
        int var20 = class688.field9676;
        if (!var16) {
            if (!arg4) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg12 - var23; var24 <= arg12 + var23; var24++) {
                for (int var25 = arg0 - var23; var25 <= (arg0 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class5.field48[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg12 > var24) {
                            var28 = arg12 - var24;
                        } else if (arg12 + arg8 - 1 < var24) {
                            var28 = var24 + 1 - arg12 - arg8;
                        }
                        int var29 = 0;
                        if (var25 < arg0) {
                            var29 = arg0 - var25;
                        } else if (var25 > (arg11 + arg0 - 1)) {
                            var29 = var25 - (arg11 - 1) - arg0;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class5.field48[var26][var27]) {
                            var19 = var24;
                            var22 = class5.field48[var26][var27];
                            var21 = var30;
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg5 == var19 && arg7 == var20) {
            return 0;
        }
        byte var31 = 0;
        int var32 = 94 / ((-arg9 - 16) / 61);
        class85.field1191[var31] = var19;
        int var38 = var31 + 1;
        class23.field363[var31] = var20;
        int var33;
        int var34 = var33 = class393.field5803[var19 - var17][var20 - var18];
        while (arg5 != var19 || arg7 != var20) {
            if (var33 != var34) {
                var33 = var34;
                class85.field1191[var38] = var19;
                class23.field363[var38++] = var20;
            }
            if ((var34 & 0x1) != 0) {
                var20++;
            } else if ((var34 & 0x4) != 0) {
                var20--;
            }
            if ((var34 & 0x2) != 0) {
                var19++;
            } else if ((var34 & 0x8) != 0) {
                var19--;
            }
            var34 = class393.field5803[var19 - var17][var20 - var18];
        }
        int var35 = 0;
        while ((var38--) > 0) {
            arg6[var35] = class85.field1191[var38];
            arg2[var35++] = class23.field363[var38];
            if (arg6.length <= var35) {
                break;
            }
        }
        return var35;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZLaga;)I", line = 539)
    public static final int method441(boolean arg0, class696 arg1) {
        if (arg0) {
            return -68;
        }
        field859++;
        if (class202.field2675 == arg1) {
            return 9216;
        } else if (class335.field4869 == arg1) {
            return 34065;
        } else if (class451.field6282 == arg1) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V", line = 564)
    public static void method442(int arg0) {
        field890 = null;
        int var1 = 115 % ((arg0 + 50) / 59);
        field891 = null;
        field885 = null;
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Ldia;)V", line = 711)
    public class62(class246 arg0) {
        this.field862 = arg0;
        if (this.field862.field3617 && this.field862.field3653) {
            this.field867 = this.field877 = new class682(this.field862);
            if (this.field862.field3512 > 1 && this.field862.field3645 && this.field862.field3648) {
                this.field867 = this.field872 = new class682(this.field862);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "(I)V", line = 585)
    private final void method443(int arg0) {
        field873++;
        boolean var2 = false;
        int var3 = 0;
        if (arg0 != 10) {
            this.field875 = -100;
        }
        int var4 = 0;
        for (class404 var5 = (class404) this.field871.method2551((byte) -108); var5 != null; var5 = (class404) this.field871.method2542(-106)) {
            int var9 = var5.method2226(1);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method2517(119);
            var2 |= var5.method2518(1);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field879 != var6) {
            this.field887 = true;
            this.field879 = var6;
        }
        int var7 = this.field883 > 2 ? 2 : this.field883;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var7 != var8) {
            this.field880 = this.field887 = true;
        }
        if (this.field884 != var2) {
            this.field889 = true;
            this.field884 = var2;
        }
        this.field883 = var4;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(Ldda;B)V", line = 654)
    public final void method444(class404 arg0, byte arg1) {
        arg0.field5865 = false;
        if (arg1 >= -14) {
            this.method443(-127);
        }
        field861++;
        arg0.method2228(-8);
        arg0.method792((byte) -104);
        this.method443(10);
    }
}
