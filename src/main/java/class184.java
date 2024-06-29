import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class184 extends class123 {

    @OriginalMember(owner = "client!ma", name = "lb", descriptor = "Lpj;")
    public static class237 field3224 = class33.method353("Eingabeprozedur geladen)3", 73);

    @OriginalMember(owner = "client!ma", name = "ob", descriptor = "Z")
    public static boolean field3227 = false;

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "I")
    public static int field3222 = 0;

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "I")
    public static int field3223 = -1;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ma", name = "nb", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ma", name = "pb", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ma", name = "qb", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ma", name = "rb", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ma", name = "mb", descriptor = "[Lgk;")
    public static class154[] field3225;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        ++field3229;
        int var3 = 6 % ((arg0 - 26) / 45);
        int[][] var4 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551 && this.method879((byte) -120)) {
            int[] var5 = var4[0];
            int var6 = arg1 % super.field2160 * super.field2160;
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            for (int var9 = 0; var9 < class106.field1862; ++var9) {
                int var10 = super.field2161[var9 % super.field2163 + var6];
                var8[var9] = class272.method1817(255, var10) << 4;
                var7[var9] = class272.method1817(var10 >> 4, 4080);
                var5[var9] = class272.method1817(16711680, var10) >> 12;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILpj;I)V")
    public static final void method1257(int arg0, class237 arg1, int arg2) {
        if (arg0 <= -34) {
            ++field3220;
            class270 var3 = class202.method1368(-15, 2, arg2);
            var3.method1793(13);
            var3.field4622 = arg1;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method1258(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field3228;
        if (arg0 != -3) {
            field3225 = null;
        }
        boolean var4 = true;
        class32 var5 = new class32(arg1);
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method333((byte) 88);
            if (~var7 == -1) {
                return var4;
            }
            boolean var8 = false;
            int var9 = 0;
            var6 += var7;
            while (true) {
                while (!var8) {
                    int var11 = var5.method303(-98);
                    if (~var11 == -1) {
                        continue label58;
                    }
                    var9 += var11 + -1;
                    int var12 = (4081 & var9) >> 6;
                    int var13 = 63 & var9;
                    int var14 = var5.method316((byte) 99) >> 2;
                    int var15 = arg3 + var13;
                    int var16 = var12 - -arg2;
                    if (var16 > 0 && var15 > 0 && ~var16 > -104 && var15 < 103) {
                        class28 var17 = class94.method700(-109, var6);
                        if (var14 != 22 || class22.field401 || var17.field535 != 0 || ~var17.field551 == -2 || var17.field521) {
                            var8 = true;
                            if (!var17.method252(arg0 ^ -95)) {
                                ++class144.field2597;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var5.method303(-118);
                if (~var10 == -1) {
                    break;
                }
                var5.method316((byte) -88);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3219;
        if (arg3 != -23853) {
            field3223 = -2;
        }
        if (~arg7 <= -2 && arg2 >= 1 && ~arg7 >= -103 && ~arg2 >= -103) {
            if (!class151.method1033((byte) -85) && (2 & class73.field1410[0][arg7][arg2]) == 0) {
                int var8 = arg1;
                if (~(class73.field1410[arg1][arg7][arg2] & 8) != -1) {
                    var8 = 0;
                }
                if (class214.field3647 != var8) {
                    return;
                }
            }
            int var9 = arg1;
            if (arg1 < 3 && ~(class73.field1410[1][arg7][arg2] & 2) == -3) {
                var9 = arg1 + 1;
            }
            class123.method877(arg1, (byte) -119, arg0, arg7, class146.field2613[arg1], var9, arg2);
            if (~arg5 <= -1) {
                boolean var10 = class22.field401;
                class22.field401 = true;
                class27.method242(arg7, arg2, (byte) 92, var9, arg4, arg5, arg6, false, arg1, false, class146.field2613[arg1]);
                class22.field401 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfa;Lfa;B)V")
    public static final void method1260(class239 arg0, class239 arg1, byte arg2) {
        class159.field2861 = arg1;
        ++field3226;
        if (arg2 != 30) {
            method1262(-62);
        }
        class242.field4254 = arg0;
        class202.field3462 = class159.field2861.method1638(3, (byte) -73);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII[Llj;[BZII)V")
    public static final void method1261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class25[] arg6, byte[] arg7, boolean arg8, int arg9, int arg10) {
        class32 var11 = new class32(arg7);
        ++field3221;
        int var12 = -1;
        if (arg9 != 8) {
            method1259(-83, -85, -105, -86, 54, 23, -6, 111);
        }
        while (true) {
            int var13 = var11.method333((byte) 60);
            if (~var13 == -1) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method303(70);
                if (~var15 == -1) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 63;
                int var17 = (4088 & var14) >> 6;
                int var18 = var14 >> 12;
                int var19 = var11.method316((byte) -44);
                int var20 = var19 >> 2;
                int var21 = var19 & 3;
                if (~arg0 == ~var18 && ~var17 <= ~arg10 && arg10 + 8 > var17 && var16 >= arg1 && ~(arg1 - -8) < ~var16) {
                    class28 var22 = class94.method700(-88, var12);
                    int var23 = arg4 - -class175.method1210(var22.field507, var16 & 7, var22.field571, (byte) -89, var21, arg3, 7 & var17);
                    int var24 = class160.method1129(arg3, var21, 7 & var16, var22.field571, var22.field507, (byte) -32, var17 & 7) + arg5;
                    if (~var23 < -1 && ~var24 < -1 && var23 < 103 && var24 < 103) {
                        class25 var25 = null;
                        if (!arg8) {
                            int var26 = arg2;
                            if (~(2 & class73.field1410[1][var23][var24]) == -3) {
                                var26 = arg2 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg6[var26];
                            }
                        }
                        class27.method242(var23, var24, (byte) 63, arg2, var20, var12, arg3 + var21 & 3, !arg8, arg2, arg8, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(I)V")
    public static void method1262(int arg0) {
        field3225 = null;
        field3224 = null;
        if (arg0 <= 40) {
            method1260((class239) null, (class239) null, (byte) -10);
        }
    }
}
