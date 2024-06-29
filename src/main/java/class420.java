import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class420 {

    @OriginalMember(owner = "client!no", name = "e", descriptor = "Lpn;")
    private class446 field5951 = new class446();

    @OriginalMember(owner = "client!no", name = "n", descriptor = "Lfk;")
    private class393 field5960 = new class393();

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    private int field5961;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    private int field5959;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "Lec;")
    private class129 field5958;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "[C")
    public static char[] field5948 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field5952 = -1;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "[[I")
    public static int[][] field5953 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!no", name = "q", descriptor = "Z")
    public static boolean field5963;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "Lno;")
    public static class420 field5962;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field5964;

    static {
        new class442("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field5963 = false;
        field5962 = new class420(64);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method2631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5947++;
        int var8 = arg7 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class231.field3341 - class63.field869) * var8 / 100 + class63.field869;
        int var10 = arg4 * var9 >> 8;
        int var11 = 16384 - arg3 & 0x3FFF;
        int var12 = 16384 - arg5 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class133.field1913[var11] * -var10 >> 15;
            var15 = class133.field1908[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class133.field1913[var12] * var15 >> 15;
            var15 = class133.field1908[var12] * var15 >> 15;
        }
        class106.field1447 = arg0 - var13;
        class20.field376 = arg6 - var15;
        class329.field4568 = arg3;
        class7.field107 = arg1 - var14;
        class155.field2192 = 0;
        class369.field5199 = arg5;
        int var16 = -109 % ((arg2 + 15) / 39);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lom;Lnq;Lnq;ILnq;)Z", line = 55)
    public static final boolean method2632(class210 arg0, class268 arg1, class268 arg2, int arg3, class268 arg4) {
        class345.field4691 = arg4;
        field5954++;
        class163.field2263 = arg2;
        class231.field3338 = arg1;
        int var5 = -72 / ((-arg3 - 42) / 47);
        class314.field4303 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLpn;J)V", line = 73)
    public final void method2633(byte arg0, class446 arg1, long arg2) {
        field5950++;
        if (this.field5959 == 0) {
            class446 var5 = this.field5960.method2481((byte) -78);
            var5.method2467((byte) 118);
            var5.method2783((byte) -122);
            if (this.field5951 == var5) {
                class446 var6 = this.field5960.method2481((byte) -78);
                var6.method2467((byte) -116);
                var6.method2783((byte) -122);
            }
        } else {
            this.field5959--;
        }
        this.field5958.method883((byte) -54, arg2, arg1);
        if (arg0 != -120) {
            method2638((class268) null, (byte) -97, (class268) null);
        }
        this.field5960.method2478(arg1, false);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 109)
    public static void method2634(int arg0) {
        if (arg0 != 111) {
            method2631(-105, -46, -67, 62, 74, -26, -63, 55);
        }
        field5962 = null;
        field5953 = null;
        field5948 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 121)
    public static final void method2635(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class161.field2247[var1] = false;
        }
        field5957++;
        if (arg0 <= 48) {
            method2638((class268) null, (byte) 111, (class268) null);
        }
        class139.field1982 = class20.field376;
        class42.field617 = class369.field5199;
        class335.field4609 = 0;
        class373.field5244 = class276.field3837;
        class211.field2955 = 0;
        class282.field3996 = -1;
        class13.field268 = class7.field107;
        class18.field322 = -1;
        class128.field1807 = 5;
        class239.field3412 = class106.field1447;
        class305.field4208 = class329.field4568;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 162)
    public final void method2636(int arg0) {
        field5964++;
        this.field5960.method2486(221);
        this.field5958.method888(125);
        this.field5951 = new class446();
        if (arg0 == 2) {
            this.field5959 = this.field5961;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(JI)Lpn;", line = 185)
    public final class446 method2637(long arg0, int arg1) {
        field5949++;
        if (arg1 != 18620) {
            return null;
        }
        class446 var4 = (class446) this.field5958.method886(arg0, 25651);
        if (var4 != null) {
            this.field5960.method2478(var4, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lnq;BLnq;)V", line = 213)
    public static final void method2638(class268 arg0, byte arg1, class268 arg2) {
        if (arg1 == 17) {
            field5955++;
            class314.field4298 = arg0;
            class44.field622 = arg2;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I)V", line = 435)
    public class420(int arg0) {
        this.field5961 = arg0;
        this.field5959 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field5958 = new class129(var2);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z[II[IIIIIIIIIIILhh;)I", line = 244)
    public static final int method2639(boolean arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class67 arg14) {
        field5956++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class362.field5005[var15][var35] = 0;
                class347.field4756[var15][var35] = 99999999;
            }
        }
        if (arg11 != 48) {
            return -18;
        }
        boolean var16;
        if (arg2 == 1) {
            var16 = class171.method1125(arg4, arg12, (byte) 104, arg14, arg5, arg8, arg9, arg10, arg6, arg7, arg13);
        } else if (arg2 == 2) {
            var16 = class252.method1686(arg9, arg5, arg13, arg12, arg8, arg10, arg14, arg4, 3, arg6, arg7);
        } else {
            var16 = class50.method421(arg12, arg9, arg13, arg4, arg14, arg10, arg5, arg6, -1, arg7, arg8, arg2);
        }
        int var17 = arg5 - 64;
        int var18 = arg8 - 64;
        int var19 = class198.field2736;
        int var20 = class364.field5136;
        if (!var16) {
            if (!arg0) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg13 - var23; var24 <= arg13 + var23; var24++) {
                for (int var25 = arg9 - var23; var25 <= (arg9 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class347.field4756[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg13) {
                            var28 = arg13 - var24;
                        } else if (var24 > arg13 + arg10 - 1) {
                            var28 = var24 + 1 - arg10 - arg13;
                        }
                        int var29 = 0;
                        if (var25 < arg9) {
                            var29 = arg9 - var25;
                        } else if (var25 > arg7 + arg9 - 1) {
                            var29 = var25 + 1 - arg9 - arg7;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class347.field4756[var26][var27]) {
                            var19 = var24;
                            var20 = var25;
                            var21 = var30;
                            var22 = class347.field4756[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg5 == var19 && arg8 == var20) {
            return 0;
        }
        byte var31 = 0;
        class212.field2963[var31] = var19;
        int var37 = var31 + 1;
        class450.field6300[var31] = var20;
        int var32;
        int var33 = var32 = class362.field5005[var19 - var17][var20 - var18];
        while (arg5 != var19 || arg8 != var20) {
            if (var32 != var33) {
                class212.field2963[var37] = var19;
                var32 = var33;
                class450.field6300[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class362.field5005[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg3[var34] = class212.field2963[var37];
            arg1[var34++] = class450.field6300[var37];
            if (arg3.length <= var34) {
                break;
            }
        }
        return var34;
    }
}
