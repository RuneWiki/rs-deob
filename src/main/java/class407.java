import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class407 extends class224 {

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Lrl;")
    public static class672 field6278 = new class672(2, -1);

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field6284 = 0;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Lf;")
    private class702 field6277;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "Lf;")
    private class702 field6281;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Lf;")
    public class702 field6282;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "Lf;")
    private class702 field6285;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "Lf;")
    private class702 field6286;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "Lf;")
    private class702 field6289;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "Z")
    public static boolean field6291;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public final void method587(int arg0) {
        super.method587(arg0);
        ++field6292;
        class272 var2 = (class272) super.field3611;
        this.field6282 = class592.method3456(var2.field4387, true, super.field3612);
        this.field6285 = class592.method3456(var2.field4391, true, super.field3612);
        this.field6281 = class592.method3456(var2.field4389, true, super.field3612);
        this.field6289 = class592.method3456(var2.field4394, true, super.field3612);
        this.field6277 = class592.method3456(var2.field4392, true, super.field3612);
        this.field6286 = class592.method3456(var2.field4384, true, super.field3612);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Z")
    public static final boolean method2606(int arg0, int arg1, int arg2) {
        ++field6276;
        if (arg2 != -1) {
            return true;
        } else {
            return ~(2048 & arg0) != -1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)Z")
    public static final boolean method2607(int arg0) {
        int var1 = -14 % ((arg0 - -3) / 32);
        ++field6287;
        if (class184.field3108) {
            try {
                if ((Boolean) class358.method2403("showingVideoAd", class450.field6772, -29103)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
    public static final void method2608(int arg0) {
        ++field6293;
        if (~class528.field7706 != 0) {
            int var1 = class464.field6929.method451(1196);
            int var2 = class464.field6929.method454(arg0 + 63);
            class623 var3 = (class623) class655.field9149.method3465((byte) 107);
            if (var3 != null) {
                var1 = var3.method2600(25);
                var2 = var3.method2596(true);
            }
            class244.method1743((byte) -105, var1, 0, class259.field4147, class56.field732, 0, arg0, class528.field7706, 0, var2);
            if (class260.field4160 != null) {
                class389.method2528(0, var1, var2);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZIZ)V")
    public final void method583(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (!arg1) {
            method2610((class692[]) null, -119, -55);
        }
        if (arg3) {
            int[] var5 = new int[4];
            class627.field8857.method343(var5);
            class627.field8857.method352(arg0, arg2, super.field3611.field7317 + arg0, super.field3611.field7316 + arg2);
            int var6 = this.field6281.method1076();
            int var7 = this.field6281.method1079();
            int var8 = this.field6289.method1076();
            int var9 = this.field6289.method1079();
            this.field6281.method3960(arg0, (-var7 + super.field3611.field7316) / 2 + arg2);
            this.field6289.method3960(-var8 + arg0 + super.field3611.field7317, (-var9 + super.field3611.field7316) / 2 + arg2);
            class627.field8857.method352(arg0, arg2, arg0 - -super.field3611.field7317, this.field6277.method1079() + arg2);
            this.field6277.method3956(arg0 + var6, arg2, -var6 + super.field3611.field7317 + -var8, super.field3611.field7316);
            int var10 = this.field6286.method1079();
            class627.field8857.method352(arg0, arg2 - (-super.field3611.field7316 + var10), arg0 - -super.field3611.field7317, super.field3611.field7316 + arg2);
            this.field6286.method3956(arg0 - -var6, -var10 + arg2 + super.field3611.field7316, super.field3611.field7317 - var6 - var8, super.field3611.field7316);
            class627.field8857.method352(var5[0], var5[1], var5[2], var5[3]);
        }
        ++field6290;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZIII)V")
    public final void method582(boolean arg0, int arg1, int arg2, int arg3) {
        ++field6279;
        int var5 = this.field6281.method1076() + arg1;
        int var6 = arg1 - -super.field3611.field7317 + -this.field6289.method1076();
        int var7 = this.field6277.method1079() + arg3;
        int var8 = arg3 + (super.field3611.field7316 - this.field6286.method1079());
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = this.method1645(true) * var9 / 10000;
        int[] var12 = new int[4];
        class627.field8857.method343(var12);
        class627.field8857.method352(var5, var7, var5 - -var11, var8);
        this.method2589(var9, var5, -66, var7, var10);
        class627.field8857.method352(var5 + var11, var7, var6, var8);
        this.field6285.method3956(var5, var7, var9, var10);
        class627.field8857.method352(var12[arg2], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILr;IIII)V")
    public static final void method2609(int arg0, class167 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6288;
        arg1.method352(arg3, arg5, arg3 + arg4, arg5 - -arg2);
        arg1.method1355(arg5, arg3, arg2, arg4, -16777216, 1);
        if (class579.field8251 >= 100) {
            float var6 = (float) class378.field5888 / (float) class378.field5905;
            int var7 = arg4;
            int var8 = arg2;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg4 * var6);
            } else {
                var7 = (int) ((float) arg2 / var6);
            }
            int var9 = (arg4 - var7) / 2 + arg3;
            if (arg0 > -39) {
                method2607(-43);
            }
            int var10 = (-var8 + arg2) / 2 + arg5;
            if (class683.field9587 == null || ~class683.field9587.method1083() != ~arg4 || ~arg2 != ~class683.field9587.method1075()) {
                class378.method2475(class378.field5901, class378.field5902 + class378.field5888, class378.field5905 + class378.field5901, class378.field5902, var9, var10, var9 - -var7, var8 + var10);
                class378.method2491(arg1);
                class683.field9587 = arg1.method282(var9, var10, var7, var8, false);
            }
            class683.field9587.method3960(var9, var10);
            int var11 = class614.field8727 * var7 / class378.field5905;
            int var12 = class531.field7741 * var8 / class378.field5888;
            int var13 = class183.field3075 * var7 / class378.field5905 + var9;
            int var14 = -(class614.field8717 * var8 / class378.field5888) + -var12 + var8 + var10;
            int var15 = -1996554240;
            if (class99.field1647 == class34.field500) {
                var15 = -1996488705;
            }
            arg1.method335(var13, var14, var11, var12, var15, 1);
            arg1.method344(var13, var14, var11, var12, var15, 0);
            if (class471.field6976 > 0) {
                int var16;
                if (class442.field6729 > 50) {
                    var16 = -(class442.field6729 * 5) + 500;
                } else {
                    var16 = class442.field6729 * 5;
                }
                for (class143 var17 = (class143) class378.field5883.method3465((byte) -71); var17 != null; var17 = (class143) class378.field5883.method3469(0)) {
                    class257 var18 = class378.field5873.method3286(29982, var17.field2408);
                    if (class134.method1160(2, var18)) {
                        if (class516.field7497 == var17.field2408) {
                            int var19 = var17.field2406 * var7 / class378.field5905 + var9;
                            int var20 = (-var17.field2407 + class378.field5888) * var8 / class378.field5888 + var10;
                            arg1.method1355(var20 - 2, var19 + -2, 4, 4, var16 << 24 | 16776960, 1);
                        } else if (~class204.field3329 != 0 && class204.field3329 == var18.field4112) {
                            int var21 = var17.field2406 * var7 / class378.field5905 + var9;
                            int var22 = (class378.field5888 - var17.field2407) * var8 / class378.field5888 + var10;
                            arg1.method1355(var22 - 2, var21 - 2, 4, 4, var16 << 24 | 16776960, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([Lpn;II)V")
    public static final void method2610(class692[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class692 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field9699;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field9699 > (var7 & 1) + var6) {
                    class692 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method2610(arg0, arg1, var4 - 1);
            method2610(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Z")
    public final boolean method585(byte arg0) {
        ++field6283;
        if (!super.method585((byte) 126)) {
            return false;
        } else {
            class272 var2 = (class272) super.field3611;
            if (!super.field3612.method942(0, var2.field4387)) {
                return false;
            } else if (!super.field3612.method942(0, var2.field4391)) {
                return false;
            } else if (arg0 <= 119) {
                return true;
            } else if (!super.field3612.method942(0, var2.field4389)) {
                return false;
            } else if (!super.field3612.method942(0, var2.field4394)) {
                return false;
            } else if (!super.field3612.method942(0, var2.field4392)) {
                return false;
            } else {
                return super.field3612.method942(0, var2.field4384);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lri;Lri;Lgaa;)V")
    public class407(class97 arg0, class97 arg1, class272 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V")
    public void method2589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6280;
        int var6 = 101 / ((arg2 - 1) / 40);
        this.field6282.method3956(arg1, arg3, arg0, arg4);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
    public static void method2611(byte arg0) {
        field6278 = null;
        if (arg0 > -24) {
            field6291 = true;
        }
    }
}
