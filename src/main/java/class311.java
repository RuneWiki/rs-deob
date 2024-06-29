import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class311 extends class61 {

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public int field5316 = 0;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public int field5319 = 12800;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "Z")
    public boolean field5333 = true;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    public int field5325 = -1;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "I")
    public int field5336 = 0;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    public int field5330 = -1;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public int field5315 = 12800;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "Lwm;")
    public class152 field5328;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "Lwm;")
    public class152 field5318;

    @OriginalMember(owner = "client!ak", name = "fb", descriptor = "I")
    public int field5339;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public int field5323;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "Lek;")
    public class183 field5314;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "Lwm;")
    private static class152 field5332 = class157.method1048("Starting 3d Library", 98);

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "Lwm;")
    public static class152 field5320 = field5332;

    @OriginalMember(owner = "client!ak", name = "db", descriptor = "Z")
    public static volatile boolean field5337 = true;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "[Z")
    public static boolean[] field5317 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!ak", name = "eb", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "Ljd;")
    public static class140 field5322;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIIII)V", line = 5)
    public static final void method2152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 27 % ((arg4 + 6) / 57);
        if (class308.field5283 <= arg6 && class238.field3902 >= arg6 && arg3 >= class308.field5283 && class238.field3902 >= arg3 && arg0 >= class308.field5283 && class238.field3902 >= arg0 && class308.field5283 <= arg9 && arg9 <= class238.field3902 && arg7 >= class157.field2505 && class110.field1553 >= arg7 && arg1 >= class157.field2505 && arg1 <= class110.field1553 && arg5 >= class157.field2505 && arg5 <= class110.field1553 && arg2 >= class157.field2505 && class110.field1553 >= arg2) {
            class266.method1825(arg2, -48, arg6, arg1, arg5, arg3, arg8, arg9, arg7, arg0);
        } else {
            class30.method232(arg3, arg0, arg8, arg5, arg7, arg2, 3, arg9, arg1, arg6);
        }
        field5321++;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)Lth;", line = 21)
    public static final class86 method2153(byte arg0) {
        if (arg0 <= 125) {
            field5320 = (class152) null;
        }
        field5324++;
        try {
            return (class86) Class.forName("bf").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V", line = 41)
    public static final void method2154(int arg0) {
        class17.field235++;
        field5334++;
        class245.field4102.method1065(209, -45);
        if (arg0 != 8) {
            field5332 = (class152) null;
        }
        for (class122 var1 = (class122) class107.field1519.method1585(arg0 ^ 0xA63B6DB8); var1 != null; var1 = (class122) class107.field1519.method1581((byte) 110)) {
            if (var1.field1725 == 0) {
                class23.method197(var1, false, true);
            }
        }
        if (class127.field1858 != null) {
            class272.method1868(22889, class127.field1858);
            class127.field1858 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lwm;Lwm;IIIZI)V", line = 732)
    public class311(class152 arg0, class152 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field5328 = arg0;
        this.field5318 = arg1;
        this.field5330 = arg6;
        if (this.field5330 == 255) {
            this.field5330 = 0;
        }
        this.field5325 = arg4;
        this.field5333 = arg5;
        this.field5339 = arg2;
        this.field5323 = arg3;
        this.field5314 = new class183();
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V", line = 79)
    public static final void method2155(int arg0, boolean arg1) {
        if (arg0 > -16) {
            method2157(64, 80, -7, 6, 32, -115, 10, 32, -31, (byte) 26, false, 126);
        }
        byte var2;
        byte[][] var3;
        if (class217.field3516 && arg1) {
            var2 = 1;
            var3 = class133.field2041;
        } else {
            var2 = 4;
            var3 = class107.field1534;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class234.method1609(-128);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class148.field2271[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3ACE324) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = var8 >> 3 & 0x7FF;
                            int var12 = (var8 & 0xFFD252) >> 14;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class284.field4835.length; var14++) {
                                if (class284.field4835[var14] == var13 && var3[var14] != null) {
                                    var7 = true;
                                    class242.method1647(arg1, var6 * 8, -105, var9, var10, class135.field2076, (var12 & 0x7) * 8, var3[var14], var5 * 8, var4, (var11 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class113.method756(var4, true, 8, var6 * 8, 8, var5 * 8);
                    }
                }
            }
        }
        field5331++;
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V", line = 169)
    public final void method2156(int arg0) {
        field5313++;
        this.field5319 = 12800;
        this.field5316 = 0;
        this.field5315 = 12800;
        this.field5336 = 0;
        for (class31 var2 = (class31) this.field5314.method1221((byte) 59); var2 != null; var2 = (class31) this.field5314.method1223(104)) {
            if (this.field5319 > var2.field519) {
                this.field5319 = var2.field519;
            }
            if (var2.field527 > this.field5316) {
                this.field5316 = var2.field527;
            }
            if (var2.field521 > this.field5336) {
                this.field5336 = var2.field521;
            }
            if (this.field5315 > var2.field523) {
                this.field5315 = var2.field523;
            }
        }
        if (arg0 != 4095) {
            field5332 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIIIBZI)Z", line = 205)
    public static final boolean method2157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, boolean arg10, int arg11) {
        field5327++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class310.field5306[var12][var13] = 0;
                class269.field4533[var12][var13] = 99999999;
            }
        }
        int var14 = arg0;
        class310.field5306[arg4][arg0] = 99;
        class269.field4533[arg4][arg0] = 0;
        int var15 = arg4;
        int var16 = -75 / ((-arg9 - 8) / 61);
        byte var17 = 0;
        int var18 = 0;
        class160.field2552[var17] = arg4;
        boolean var19 = false;
        int var33 = var17 + 1;
        class258.field4430[var17] = arg0;
        int[][] var20 = class135.field2076[class23.field400].field384;
        while (var33 != var18) {
            var14 = class258.field4430[var18];
            var15 = class160.field2552[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg2 == var15 && arg5 == var14) {
                var19 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class135.field2076[class23.field400].method182(arg2, arg1 - 1, var14, arg5, 2, var15, -13385, arg6)) {
                    var19 = true;
                    break;
                }
                if (arg1 < 10 && class135.field2076[class23.field400].method174(2, arg2, arg5, var15, arg1 - 1, -1, var14, arg6)) {
                    var19 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg11 != 0 && class135.field2076[class23.field400].method176(arg5, var15, arg2, 2, (byte) 108, var14, arg7, arg8, arg11)) {
                var19 = true;
                break;
            }
            int var21 = class269.field4533[var15][var14] + 1;
            if (var15 > 0 && class310.field5306[var15 - 1][var14] == 0 && (var20[var15 - 1][var14] & 0x12C010E) == 0 && (var20[var15 - 1][var14 + 1] & 0x12C0138) == 0) {
                class160.field2552[var33] = var15 - 1;
                class258.field4430[var33] = var14;
                var33 = var33 + 1 & 0xFFF;
                class310.field5306[var15 - 1][var14] = 2;
                class269.field4533[var15 - 1][var14] = var21;
            }
            if (var15 < 102 && class310.field5306[var15 + 1][var14] == 0 && (var20[var15 + 2][var14] & 0x12C0183) == 0 && (var20[var15 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class160.field2552[var33] = var15 + 1;
                class258.field4430[var33] = var14;
                class310.field5306[var15 + 1][var14] = 8;
                var33 = var33 + 1 & 0xFFF;
                class269.field4533[var15 + 1][var14] = var21;
            }
            if (var14 > 0 && class310.field5306[var15][var14 - 1] == 0 && (var20[var15][var14 - 1] & 0x12C010E) == 0 && (var20[var15 + 1][var14 - 1] & 0x12C0183) == 0) {
                class160.field2552[var33] = var15;
                class258.field4430[var33] = var14 - 1;
                var33 = var33 + 1 & 0xFFF;
                class310.field5306[var15][var14 - 1] = 1;
                class269.field4533[var15][var14 - 1] = var21;
            }
            if (var14 < 102 && class310.field5306[var15][var14 + 1] == 0 && (var20[var15][var14 + 2] & 0x12C0138) == 0 && (var20[var15 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class160.field2552[var33] = var15;
                class258.field4430[var33] = var14 + 1;
                class310.field5306[var15][var14 + 1] = 4;
                var33 = var33 + 1 & 0xFFF;
                class269.field4533[var15][var14 + 1] = var21;
            }
            if (var15 > 0 && var14 > 0 && class310.field5306[var15 - 1][var14 - 1] == 0 && (var20[var15 - 1][var14] & 0x12C0138) == 0 && (var20[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var20[var15][var14 - 1] & 0x12C0183) == 0) {
                class160.field2552[var33] = var15 - 1;
                class258.field4430[var33] = var14 - 1;
                class310.field5306[var15 - 1][var14 - 1] = 3;
                class269.field4533[var15 - 1][var14 - 1] = var21;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var15 < 102 && var14 > 0 && class310.field5306[var15 + 1][var14 - 1] == 0 && (var20[var15 + 1][var14 - 1] & 0x12C010E) == 0 && (var20[var15 + 2][var14 - 1] & 0x12C0183) == 0 && (var20[var15 + 2][var14] & 0x12C01E0) == 0) {
                class160.field2552[var33] = var15 + 1;
                class258.field4430[var33] = var14 - 1;
                class310.field5306[var15 + 1][var14 - 1] = 9;
                var33 = var33 + 1 & 0xFFF;
                class269.field4533[var15 + 1][var14 - 1] = var21;
            }
            if (var15 > 0 && var14 < 102 && class310.field5306[var15 - 1][var14 + 1] == 0 && (var20[var15 - 1][var14 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][var14 + 2] & 0x12C0138) == 0 && (var20[var15][var14 + 2] & 0x12C01E0) == 0) {
                class160.field2552[var33] = var15 - 1;
                class258.field4430[var33] = var14 + 1;
                var33 = var33 + 1 & 0xFFF;
                class310.field5306[var15 - 1][var14 + 1] = 6;
                class269.field4533[var15 - 1][var14 + 1] = var21;
            }
            if (var15 < 102 && var14 < 102 && class310.field5306[var15 + 1][var14 + 1] == 0 && (var20[var15 + 1][var14 + 2] & 0x12C0138) == 0 && (var20[var15 + 2][var14 + 2] & 0x12C01E0) == 0 && (var20[var15 + 2][var14 + 1] & 0x12C0183) == 0) {
                class160.field2552[var33] = var15 + 1;
                class258.field4430[var33] = var14 + 1;
                class310.field5306[var15 + 1][var14 + 1] = 12;
                class269.field4533[var15 + 1][var14 + 1] = var21;
                var33 = var33 + 1 & 0xFFF;
            }
        }
        class226.field3671 = 0;
        if (!var19) {
            if (!arg10) {
                return false;
            }
            int var22 = 100;
            int var23 = 1000;
            byte var24 = 10;
            for (int var25 = arg2 - var24; var25 <= (arg2 + var24); var25++) {
                for (int var26 = arg5 - var24; var26 <= (arg5 + var24); var26++) {
                    if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && class269.field4533[var25][var26] < 100) {
                        int var27 = 0;
                        int var28 = 0;
                        if (arg5 > var26) {
                            var27 = arg5 - var26;
                        } else if ((arg5 + arg11 - 1) < var26) {
                            var27 = var26 + 1 - arg11 - arg5;
                        }
                        if (arg2 > var25) {
                            var28 = arg2 - var25;
                        } else if ((arg2 + arg7 - 1) < var25) {
                            var28 = var25 - (arg2 + arg7 - 1);
                        }
                        int var29 = var28 * var28 + (var27 * var27);
                        if (var23 > var29 || var23 == var29 && class269.field4533[var25][var26] < var22) {
                            var23 = var29;
                            var22 = class269.field4533[var25][var26];
                            var15 = var25;
                            var14 = var26;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg4 == var15 && arg0 == var14) {
                return false;
            }
            class226.field3671 = 1;
        }
        byte var30 = 0;
        class160.field2552[var30] = var15;
        int var34 = var30 + 1;
        class258.field4430[var30] = var14;
        int var31;
        int var32 = var31 = class310.field5306[var15][var14];
        while (arg4 != var15 || arg0 != var14) {
            if (var31 != var32) {
                var31 = var32;
                class160.field2552[var34] = var15;
                class258.field4430[var34++] = var14;
            }
            if ((var32 & 0x2) != 0) {
                var15++;
            } else if ((var32 & 0x8) != 0) {
                var15--;
            }
            if ((var32 & 0x1) != 0) {
                var14++;
            } else if ((var32 & 0x4) != 0) {
                var14--;
            }
            var32 = class310.field5306[var15][var14];
        }
        if (var34 > 0) {
            class170.method1118(arg3, (byte) 123, var34);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Z", line = 594)
    public final boolean method2158(int arg0, int arg1, int arg2) {
        field5335++;
        if (this.field5315 > arg1 || this.field5336 < arg1 || this.field5319 > arg0 || this.field5316 < arg0) {
            return false;
        }
        for (class31 var4 = (class31) this.field5314.method1221((byte) 69); var4 != null; var4 = (class31) this.field5314.method1223(67)) {
            if (var4.method236(arg1, arg2 + 128, arg0)) {
                return true;
            }
        }
        if (arg2 == 0) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)V", line = 628)
    public static void method2159(int arg0) {
        field5322 = null;
        field5320 = null;
        field5332 = null;
        field5317 = null;
        if (arg0 != -1) {
            method2155(-116, false);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILah;I)Ldc;", line = 645)
    public static final class109 method2160(int arg0, class205 arg1, int arg2) {
        field5329++;
        if (arg2 == 0) {
            return class52.method356((byte) 90, arg1, arg0) ? class106.method708(true) : null;
        } else {
            return (class109) null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lah;Lah;B)V", line = 663)
    public static final void method2161(class205 arg0, class205 arg1, byte arg2) {
        field5338++;
        class62.field941 = arg1;
        int var3 = -125 / ((arg2 + 60) / 44);
        class230.field3754 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 689)
    public static final void method2162(boolean arg0) {
        field5326++;
        if (class86.field1207 || class39.field638 == 2) {
            return;
        }
        try {
            class88.field1231.method1019(119, class44.field707);
            if (arg0) {
                field5332 = (class152) null;
            }
        } catch (Throwable var2) {
        }
    }
}
