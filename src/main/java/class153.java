import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class153 extends class78 implements class340 {

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Z")
    private boolean field2699 = false;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "I")
    private int field2730 = 50;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "Lcg;")
    private class49 field2726;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "Lcg;")
    private class49 field2713;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "Lnb;")
    private class341 field2723;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "Lnb;")
    private class341 field2718;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field2719 = 0;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field2720;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "(II)I", line = 4)
    public final int method1205(int arg0, int arg1) {
        if (arg1 != 32131) {
            method1223(108);
        }
        field2710++;
        return this.method721(0, arg0).field4480 & 0xFF;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lcg;Lcg;Lcg;IZ)V", line = 16)
    public class153(class49 arg0, class49 arg1, class49 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field2726 = arg0;
        this.field2713 = arg2;
        this.field2699 = arg4;
        this.field2730 = arg3;
        this.field2723 = new class341(this.field2730);
        if (class43.field680) {
            this.field2718 = new class341(this.field2730);
        } else {
            this.field2718 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)I", line = 34)
    public final int method1206(byte arg0, int arg1) {
        field2711++;
        int var3 = 41 % ((-arg0 - 69) / 32);
        return this.method721(0, arg1).field4493 & 0xFF;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)Z", line = 44)
    public final boolean method1207(int arg0, int arg1) {
        field2702++;
        int var3 = 9 % ((16 - arg1) / 50);
        return this.method721(0, arg0).field4481;
    }

    @OriginalMember(owner = "client!la", name = "k", descriptor = "(II)V", line = 54)
    public final void method1208(int arg0, int arg1) {
        field2729++;
        if (arg1 != 255) {
            this.method1225(false, -122);
        }
        this.field2730 = arg0;
        this.field2723 = new class341(this.field2730);
        if (class43.field680) {
            this.field2718 = new class341(this.field2730);
        } else {
            this.field2718 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 73)
    public static final byte[] method1209(String arg0, byte arg1) {
        field2705++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        int var4 = 22 / ((-arg1 - 69) / 33);
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (!(var6 <= '\u0000' || var6 >= '\u0080') || !(var6 < ' ' || var6 > 'ÿ')) {
                var3[var5] = (byte) var6;
            } else if (var6 == '€') {
                var3[var5] = -128;
            } else if (var6 == '‚') {
                var3[var5] = -126;
            } else if (var6 == 'ƒ') {
                var3[var5] = -125;
            } else if (var6 == '„') {
                var3[var5] = -124;
            } else if (var6 == '…') {
                var3[var5] = -123;
            } else if (var6 == '†') {
                var3[var5] = -122;
            } else if (var6 == '‡') {
                var3[var5] = -121;
            } else if (var6 == 'ˆ') {
                var3[var5] = -120;
            } else if (var6 == '‰') {
                var3[var5] = -119;
            } else if (var6 == 'Š') {
                var3[var5] = -118;
            } else if (var6 == '‹') {
                var3[var5] = -117;
            } else if (var6 == 'Œ') {
                var3[var5] = -116;
            } else if (var6 == 'Ž') {
                var3[var5] = -114;
            } else if (var6 == '‘') {
                var3[var5] = -111;
            } else if (var6 == '’') {
                var3[var5] = -110;
            } else if (var6 == '“') {
                var3[var5] = -109;
            } else if (var6 == '”') {
                var3[var5] = -108;
            } else if (var6 == '•') {
                var3[var5] = -107;
            } else if (var6 == '–') {
                var3[var5] = -106;
            } else if (var6 == '—') {
                var3[var5] = -105;
            } else if (var6 == '˜') {
                var3[var5] = -104;
            } else if (var6 == '™') {
                var3[var5] = -103;
            } else if (var6 == 'š') {
                var3[var5] = -102;
            } else if (var6 == '›') {
                var3[var5] = -101;
            } else if (var6 == 'œ') {
                var3[var5] = -100;
            } else if (var6 == 'ž') {
                var3[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var3[var5] = -97;
            } else {
                var3[var5] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(II)V", line = 210)
    public final void method1210(int arg0, int arg1) {
        this.method1215(arg0, this.field2699 || this.method721(0, arg0).field4473 ? 64 : 128, (byte) -70);
        field2721++;
        if (arg1 != 4880) {
            this.method1225(false, 5);
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(II)Z", line = 225)
    public final boolean method1211(int arg0, int arg1) {
        if (arg0 != 7149) {
            this.method1220(-63, -41);
        }
        field2709++;
        return this.field2699 || this.method721(0, arg1).field4473;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZF)[I", line = 241)
    public final int[] method1212(int arg0, boolean arg1, float arg2) {
        field2706++;
        class208 var4 = this.method1216(84, arg0);
        if (var4 == null) {
            return null;
        } else {
            var4.field3536 = arg1;
            return var4.method1549(this, this.field2713, arg2, this.field2699 || this.method721(0, arg0).field4473);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIII)V", line = 256)
    public static final void method1213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class108.method949(arg6, -12143);
        field2731++;
        int var7 = 0;
        int var8 = arg6 - arg5;
        int var9 = arg6;
        int var10 = -arg6;
        if (arg0 != -27367) {
            method1214(true, (String) null, 0);
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var11 = var8;
        int var12 = -var8;
        int[] var13 = class64.field1007[arg3];
        int var14 = -1;
        int var15 = -1;
        int var16 = arg4 + var8;
        int var17 = arg4 - var8;
        class317.method2184(var17, (byte) -109, var13, arg2, arg4 - arg6);
        class317.method2184(var16, (byte) 102, var13, arg1, var17);
        class317.method2184(arg4 + arg6, (byte) -98, var13, arg2, var16);
        while (var9 > var7) {
            var15 += 2;
            var10 += var15;
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class246.field3999[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 <= var9) {
                    int[] var18 = class64.field1007[arg3 + var9];
                    int[] var19 = class64.field1007[arg3 - var9];
                    int var20 = arg4 + var7;
                    int var21 = arg4 - var7;
                    class317.method2184(var20, (byte) 105, var18, arg2, var21);
                    class317.method2184(var20, (byte) 91, var19, arg2, var21);
                } else {
                    int[] var22 = class64.field1007[arg3 + var9];
                    int[] var23 = class64.field1007[arg3 - var9];
                    int var24 = class246.field3999[var9];
                    int var25 = arg4 + var7;
                    int var26 = arg4 - var7;
                    int var27 = arg4 + var24;
                    int var28 = arg4 - var24;
                    class317.method2184(var28, (byte) 94, var22, arg2, var26);
                    class317.method2184(var27, (byte) -70, var22, arg1, var28);
                    class317.method2184(var25, (byte) -116, var22, arg2, var27);
                    class317.method2184(var28, (byte) -105, var23, arg2, var26);
                    class317.method2184(var27, (byte) -78, var23, arg1, var28);
                    class317.method2184(var25, (byte) 95, var23, arg2, var27);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class64.field1007[arg3 + var7];
            int[] var30 = class64.field1007[arg3 - var7];
            int var31 = arg4 + var9;
            int var32 = arg4 - var9;
            if (var8 <= var7) {
                class317.method2184(var31, (byte) 104, var29, arg2, var32);
                class317.method2184(var31, (byte) -55, var30, arg2, var32);
            } else {
                int var33 = var11 >= var7 ? var11 : class246.field3999[var7];
                int var34 = arg4 - var33;
                int var35 = arg4 + var33;
                class317.method2184(var34, (byte) 122, var29, arg2, var32);
                class317.method2184(var35, (byte) -40, var29, arg1, var34);
                class317.method2184(var31, (byte) -83, var29, arg2, var35);
                class317.method2184(var34, (byte) 86, var30, arg2, var32);
                class317.method2184(var35, (byte) 96, var30, arg1, var34);
                class317.method2184(var31, (byte) -10, var30, arg2, var35);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 384)
    public static final void method1214(boolean arg0, String arg1, int arg2) {
        field2724++;
        boolean var3 = false;
        String var4 = class254.method1768(-2191, class132.method1086(-31109, arg1));
        for (int var5 = 0; var5 < class291.field4664; var5++) {
            class205 var6 = class135.field2359[class119.field2064[var5]];
            if (var6 != null && var6.field3491 != null && var6.field3491.equalsIgnoreCase(var4)) {
                if (arg2 == 1) {
                    class341.field5443.method26(66, 7);
                    class341.field5443.method2351(0, 0);
                    class238.field3900++;
                    class341.field5443.method2366(-109, class119.field2064[var5]);
                } else if (arg2 == 4) {
                    class341.field5443.method26(104, 7);
                    class197.field3361++;
                    class341.field5443.method2334((byte) 2, class119.field2064[var5]);
                    class341.field5443.method2351(0, 0);
                } else if (arg2 == 5) {
                    class155.field2758++;
                    class341.field5443.method26(99, 7);
                    class341.field5443.method2336(0, 15459);
                    class341.field5443.method2318(class119.field2064[var5], 118);
                } else if (arg2 == 6) {
                    class72.field1207++;
                    class341.field5443.method26(93, 7);
                    class341.field5443.method2318(class119.field2064[var5], 123);
                    class341.field5443.method2351(0, 0);
                } else if (arg2 == 7) {
                    class341.field5443.method26(73, 7);
                    class145.field2630++;
                    class341.field5443.method2351(0, 0);
                    class341.field5443.method2359(-805606200, class119.field2064[var5]);
                }
                var3 = true;
                break;
            }
        }
        if (!arg0) {
            method1209((String) null, (byte) -104);
        }
        if (!var3) {
            class170.method1339(0, class191.field3191 + var4, "", (byte) -98);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)V", line = 463)
    public final void method1215(int arg0, int arg1, byte arg2) {
        boolean var4 = false;
        if (arg2 != -70) {
            this.field2723 = (class341) null;
        }
        field2716++;
        class83.method749(this.method721(0, arg0).field4480 & 0xFF, this.method721(0, arg0).field4493 & 0xFF, 122);
        class208 var5 = this.method1216(84, arg0);
        if (var5 != null) {
            var4 = var5.method1546(this, this.field2713, arg1);
        }
        if (!var4) {
            class263 var6 = this.method1221(false, arg0);
            var6.method1817(-27060);
        }
    }

    @OriginalMember(owner = "client!la", name = "l", descriptor = "(II)Luc;", line = 494)
    private final class208 method1216(int arg0, int arg1) {
        field2717++;
        class208 var3 = (class208) this.field2723.method2400((long) arg1, 99);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2726.method441(false, arg1, 0);
        if (var4 == null) {
            return null;
        } else {
            class208 var5 = new class208(new class336(var4));
            int var6 = -125 % ((arg0 - 28) / 48);
            this.field2723.method2396(0, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IB)Lkj;", line = 516)
    public final class194 method711(int arg0, byte arg1) {
        field2733++;
        if (arg1 != 11) {
            field2719 = 59;
        }
        class208 var3 = this.method1216(81, arg0);
        return var3 == null ? null : var3.field3535;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(II)Z", line = 531)
    public final boolean method1217(int arg0, int arg1) {
        field2701++;
        return arg0 <= 45 ? true : this.method721(0, arg1).field4475;
    }

    @OriginalMember(owner = "client!la", name = "m", descriptor = "(II)V", line = 548)
    public final void method1218(int arg0, int arg1) {
        for (class208 var3 = (class208) this.field2723.method2394((byte) -86); var3 != null; var3 = (class208) this.field2723.method2398((byte) -93)) {
            if (var3.field3536) {
                var3.method1548(arg1);
                var3.field3536 = false;
            }
        }
        if (arg0 != 3) {
            this.method1222(-81, -9);
        }
        field2698++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZIZFI)Ln;", line = 572)
    public final class309 method1219(boolean arg0, int arg1, boolean arg2, float arg3, int arg4) {
        field2715++;
        if (!arg2) {
            return (class309) null;
        }
        class208 var6 = this.method1216(-70, arg4);
        if (var6 != null && var6.method1550(this, this.field2713)) {
            return arg0 ? var6.field3535.method1459(arg1, arg1, this, this.field2713, false, 13661, (double) arg3) : var6.field3535.method1455(this, arg1, false, 15109, (double) arg3, this.field2713, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(II)I", line = 599)
    public final int method1220(int arg0, int arg1) {
        if (arg1 >= -77) {
            return -95;
        } else {
            field2704++;
            return this.method721(0, arg0).field4491 & 0xFFFF;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(ZI)Ltd;", line = 610)
    private final class263 method1221(boolean arg0, int arg1) {
        field2725++;
        class263 var3 = (class263) this.field2718.method2400((long) arg1, 99);
        if (var3 != null) {
            return var3;
        }
        class263 var4 = new class263(this.method721(0, arg1).field4491 & 0xFFFF);
        if (arg0) {
            return (class263) null;
        } else {
            this.field2718.method2396(0, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)Z", line = 634)
    public final boolean method1222(int arg0, int arg1) {
        field2712++;
        if (arg0 < 68) {
            return false;
        } else {
            class208 var3 = this.method1216(-48, arg1);
            return var3 == null ? false : var3.method1550(this, this.field2713);
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 658)
    public static void method1223(int arg0) {
        field2720 = null;
        if (arg0 != 0) {
            field2719 = 44;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I", line = 670)
    public final int method1224(int arg0, int arg1) {
        field2732++;
        if (arg0 >= -17) {
            this.field2713 = (class49) null;
        }
        return this.method721(0, arg1).field4484 & 0xFF;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(ZI)V", line = 683)
    public final void method1225(boolean arg0, int arg1) {
        int var3 = -67 / ((arg1 + 23) / 60);
        this.field2699 = arg0;
        this.method1231((byte) 7);
        field2708++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)Z", line = 694)
    public final boolean method1226(int arg0, boolean arg1) {
        if (!arg1) {
            this.field2718 = (class341) null;
        }
        field2700++;
        return !this.method721(0, arg0).field4474;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)[I", line = 705)
    public final int[] method1227(int arg0, byte arg1) {
        field2728++;
        class208 var3 = this.method1216(80, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 <= 97) {
                this.method1230(-77, false);
            }
            return var3.method1547(this, this.field2713, this.field2699 || this.method721(0, arg0).field4473);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILlg;)V", line = 722)
    public static final void method1228(int arg0, int arg1, int arg2, class137 arg3) {
        field2714++;
        if (class204.field3473 != null || class207.field3515 || arg3 == null || class97.method842(arg3, (byte) -3) == null) {
            return;
        }
        class204.field3473 = arg3;
        if (arg0 != 2) {
            field2719 = -93;
        }
        class272.field4343 = class97.method842(arg3, (byte) -3);
        class42.field617 = 0;
        class242.field3958 = arg1;
        class291.field4653 = arg2;
        class170.field2956 = false;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([[IIIBII[[F[[FZILbl;IBI[[FI)V", line = 745)
    public static final void method1229(int[][] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, float[][] arg6, float[][] arg7, boolean arg8, int arg9, class337 arg10, int arg11, byte arg12, int arg13, float[][] arg14, int arg15) {
        int var16 = (arg2 << 8) + 255;
        int var17 = (arg1 << 8) + arg4;
        int[] var18 = class214.field3592[arg3];
        int var19 = (arg11 << 8) + 255;
        int[] var20 = null;
        int var21 = (arg15 << 8) + 255;
        int[] var22 = new int[var18.length >> 1];
        field2722++;
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class79.method737(arg6, var17, arg14, var16, var18[var23 + var23], false, -126, var21, arg9, (int[][]) null, var18[var23 + var23 + 1], arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
        }
        if (arg8) {
            if (arg3 == 1) {
                var20 = new int[6];
                int var25 = class79.method737(arg6, var17, arg14, var16, 64, true, arg4 ^ 0xFFFFFF30, var21, arg9, (int[][]) null, 128, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                int var26 = class79.method737(arg6, var17, arg14, var16, 128, true, arg4 ^ 0xFFFFFF35, var21, arg9, (int[][]) null, 64, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20[2] = var22[2];
                var20[3] = var25;
                var20[0] = var26;
                var20[5] = var22[2];
                var20[4] = var22[0];
                var20[1] = var25;
            } else if (arg3 == 2) {
                int var42 = class79.method737(arg6, var17, arg14, var16, 128, true, -45, var21, arg9, (int[][]) null, 128, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20 = new int[6];
                int var43 = class79.method737(arg6, var17, arg14, var16, 64, true, -101, var21, arg9, (int[][]) null, 0, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20[0] = var22[0];
                var20[3] = var42;
                var20[2] = var42;
                var20[5] = var22[0];
                var20[1] = var43;
                var20[4] = var22[1];
            } else if (arg3 == 3) {
                int var27 = class79.method737(arg6, var17, arg14, var16, 0, true, -115, var21, arg9, (int[][]) null, 128, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                int var28 = class79.method737(arg6, var17, arg14, var16, 64, true, -65, var21, arg9, (int[][]) null, 0, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20 = new int[] { var22[2], var22[1], var27, var27, var28, var22[2] };
            } else if (arg3 == 4) {
                var20 = new int[3];
                int var29 = class79.method737(arg6, var17, arg14, var16, 0, true, arg4 - 306, var21, arg9, (int[][]) null, 128, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20[0] = var22[3];
                var20[1] = var29;
                var20[2] = var22[0];
            } else if (arg3 == 5) {
                int var41 = class79.method737(arg6, var17, arg14, var16, 128, true, -115, var21, arg9, (int[][]) null, 128, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20 = new int[] { var22[2], var41, var22[3] };
            } else if (arg3 == 6) {
                int var30 = class79.method737(arg6, var17, arg14, var16, 128, true, -68, var21, arg9, (int[][]) null, 0, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20 = new int[6];
                int var31 = class79.method737(arg6, var17, arg14, var16, 128, true, -79, var21, arg9, (int[][]) null, 128, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20[1] = var30;
                var20[0] = var22[3];
                var20[3] = var31;
                var20[5] = var22[3];
                var20[2] = var31;
                var20[4] = var22[0];
            } else if (arg3 == 7) {
                var20 = new int[6];
                int var32 = class79.method737(arg6, var17, arg14, var16, 0, true, -60, var21, arg9, (int[][]) null, 128, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                int var33 = class79.method737(arg6, var17, arg14, var16, 128, true, -38, var21, arg9, (int[][]) null, 0, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20[3] = var32;
                var20[0] = var22[1];
                var20[2] = var32;
                var20[1] = var33;
                var20[5] = var22[1];
                var20[4] = var22[2];
            } else if (arg3 == 8) {
                int var34 = class79.method737(arg6, var17, arg14, var16, 0, true, -110, var21, arg9, (int[][]) null, 0, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20 = new int[] { var22[3], var34, var22[4] };
            } else if (arg3 == 9) {
                var20 = new int[15];
                int var35 = class79.method737(arg6, var17, arg14, var16, 128, true, -82, var21, arg9, (int[][]) null, 64, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                int var36 = class79.method737(arg6, var17, arg14, var16, 96, true, -98, var21, arg9, (int[][]) null, 32, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                int var37 = class79.method737(arg6, var17, arg14, var16, 64, true, arg4 - 363, var21, arg9, (int[][]) null, 0, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20[14] = var37;
                var20[9] = var36;
                var20[1] = var35;
                var20[12] = var36;
                var20[3] = var36;
                var20[11] = var22[1];
                var20[7] = var22[3];
                var20[0] = var36;
                var20[13] = var22[1];
                var20[5] = var22[3];
                var20[2] = var22[4];
                var20[4] = var22[4];
                var20[8] = var22[2];
                var20[10] = var22[2];
                var20[6] = var36;
            } else if (arg3 == 10) {
                var20 = new int[9];
                int var40 = class79.method737(arg6, var17, arg14, var16, 0, true, arg4 ^ 0xFFFFFF3B, var21, arg9, (int[][]) null, 128, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20[4] = var40;
                var20[5] = var22[4];
                var20[1] = var40;
                var20[6] = var22[4];
                var20[7] = var40;
                var20[0] = var22[2];
                var20[8] = var22[0];
                var20[2] = var22[3];
                var20[3] = var22[3];
            } else if (arg3 == 11) {
                var20 = new int[12];
                int var38 = class79.method737(arg6, var17, arg14, var16, 0, true, -102, var21, arg9, (int[][]) null, 64, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                int var39 = class79.method737(arg6, var17, arg14, var16, 128, true, -87, var21, arg9, (int[][]) null, 64, arg7, var19, arg13, arg12, arg0, arg10, 0.0F);
                var20[7] = var39;
                var20[1] = var38;
                var20[5] = var38;
                var20[8] = var38;
                var20[0] = var22[3];
                var20[3] = var22[3];
                var20[10] = var22[1];
                var20[11] = var39;
                var20[2] = var22[0];
                var20[6] = var22[2];
                var20[9] = var22[2];
                var20[4] = var22[2];
            }
        }
        arg10.method2381(arg5, arg13, arg9, var22, var20, false);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IZ)I", line = 1018)
    public final int method1230(int arg0, boolean arg1) {
        if (!arg1) {
            this.field2699 = true;
        }
        field2703++;
        return this.method721(0, arg0).field4477 & 0xFF;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 1030)
    public final void method1231(byte arg0) {
        this.field2723.method2399((byte) -101);
        if (this.field2718 != null) {
            this.field2718.method2399((byte) -101);
        }
        class208.field3523 = null;
        int var2 = -79 % ((-arg0 - 38) / 34);
        field2727++;
    }
}
