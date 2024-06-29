import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class203 {

    @OriginalMember(owner = "client!kea", name = "M", descriptor = "Lbs;")
    private class598 field2736 = null;

    @OriginalMember(owner = "client!kea", name = "z", descriptor = "Z")
    private boolean field2723;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "Lgs;")
    private class39 field2703;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
    public int field2708;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!kea", name = "t", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!kea", name = "u", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!kea", name = "v", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!kea", name = "w", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!kea", name = "x", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!kea", name = "y", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!kea", name = "A", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!kea", name = "B", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!kea", name = "C", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!kea", name = "D", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!kea", name = "F", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!kea", name = "G", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!kea", name = "H", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!kea", name = "I", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!kea", name = "J", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!kea", name = "K", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!kea", name = "L", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!kea", name = "N", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!kea", name = "O", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!kea", name = "E", descriptor = "Lkea;")
    public static class203 field2728;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "[Leba;")
    public static class511[] field2700;

    @OriginalMember(owner = "client!kea", name = "s", descriptor = "[Ljava/lang/Object;")
    private Object[] field2716;

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2714;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)I", line = 3)
    public final int method1279(int arg0, int arg1) {
        field2701++;
        if (!this.method1303((byte) 116)) {
            return -1;
        }
        if (arg1 != -21183) {
            this.method1285(-110, -36);
        }
        int var3 = this.field2736.field8745.method8(arg0, false);
        return this.method1287(false, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(II)V", line = 25)
    private final void method1280(int arg0, int arg1) {
        if (arg0 != -1) {
            return;
        }
        if (this.field2723) {
            this.field2716[arg1] = this.field2703.method208(arg1, 1);
        } else {
            this.field2716[arg1] = class295.method1981(class92.method583(arg0, 1052), this.field2703.method208(arg1, 1), false);
        }
        field2725++;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B", line = 44)
    public final byte[] method1281(byte arg0, String arg1, String arg2) {
        field2702++;
        if (!this.method1303((byte) 63)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        if (arg0 != -37) {
            return null;
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field2736.field8745.method8(class411.method2604(var4, false), false);
        if (this.method1287(false, var6)) {
            int var7 = this.field2736.field8739[var6].method8(class411.method2604(var5, false), false);
            return this.method1286(var7, var6, (byte) -49);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)I", line = 72)
    public final int method1282(int arg0) {
        if (arg0 >= -29) {
            return -94;
        } else {
            field2719++;
            return this.method1303((byte) 81) ? this.field2736.field8737.length : -1;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLjava/lang/String;)I", line = 90)
    public final int method1283(byte arg0, String arg1) {
        field2733++;
        if (!this.method1303((byte) 77)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2736.field8745.method8(class411.method2604(var3, false), false);
        if (this.method1287(false, var4)) {
            return arg0 > -22 ? 53 : var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBI)Z", line = 111)
    public final boolean method1284(int arg0, byte arg1, int arg2) {
        field2715++;
        if (!this.method1292(arg2, true, arg0)) {
            return false;
        } else if (this.field2714[arg0] != null && this.field2714[arg0][arg2] != null) {
            return true;
        } else if (this.field2716[arg0] == null) {
            this.method1280(-1, arg0);
            if (this.field2716[arg0] == null) {
                if (arg1 != 52) {
                    this.field2703 = null;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(II)[I", line = 137)
    public final int[] method1285(int arg0, int arg1) {
        field2707++;
        if (arg1 <= 72) {
            return null;
        } else if (this.method1287(false, arg0)) {
            int[] var3 = this.field2736.field8732[arg0];
            if (var3 == null) {
                var3 = new int[this.field2736.field8735[arg0]];
                int var4 = 0;
                while (var4 < var3.length) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIB)[B", line = 167)
    public final byte[] method1286(int arg0, int arg1, byte arg2) {
        if (arg2 != -49) {
            this.method1309(-74, 76);
        }
        field2699++;
        return this.method1297(false, arg0, null, arg1);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZI)Z", line = 179)
    private final boolean method1287(boolean arg0, int arg1) {
        field2729++;
        if (arg0) {
            this.method1282(-51);
        }
        if (!this.method1303((byte) 78)) {
            return false;
        } else if (arg1 >= 0 && this.field2736.field8737.length > arg1 && this.field2736.field8737[arg1] != 0) {
            return true;
        } else if (class360.field5100) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 204)
    public final boolean method1288(String arg0, String arg1, int arg2) {
        field2721++;
        if (!this.method1303((byte) 73)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field2736.field8745.method8(class411.method2604(var4, false), false);
        if (~var6 > arg2) {
            return false;
        } else {
            int var7 = this.field2736.field8739[var6].method8(class411.method2604(var5, false), false);
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 229)
    public final boolean method1289(String arg0, int arg1) {
        field2735++;
        if (this.method1303((byte) 101)) {
            int var3 = -33 % ((17 - arg1) / 48);
            String var4 = arg0.toLowerCase();
            int var5 = this.field2736.field8745.method8(class411.method2604(var4, false), false);
            return this.method1312(0, var5);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(II)V", line = 247)
    private final void method1290(int arg0, int arg1) {
        this.field2703.method207(arg0, (byte) -122);
        field2730++;
        if (arg1 != 8061) {
            this.field2714 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(II)I", line = 264)
    private final int method1291(int arg0, int arg1) {
        if (arg1 != -1) {
            this.field2716 = null;
        }
        field2720++;
        if (this.method1287(false, arg0)) {
            return this.field2716[arg0] == null ? this.field2703.method209(arg0, (byte) 96) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZI)Z", line = 286)
    private final boolean method1292(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field2703 = null;
        }
        field2698++;
        if (!this.method1303((byte) 125)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && this.field2736.field8737.length > arg2 && this.field2736.field8737[arg2] > arg0) {
            return true;
        } else if (class360.field5100) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V", line = 319)
    public final void method1293(int arg0) {
        field2738++;
        if (this.field2714 != null) {
            for (int var2 = 0; var2 < this.field2714.length; var2++) {
                this.field2714[var2] = null;
            }
        }
        if (arg0 != -23829) {
            this.method1280(-44, 62);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 342)
    public final boolean method1294(int arg0, String arg1) {
        field2713++;
        int var3 = -24 / ((-arg0 - 4) / 38);
        if (this.method1303((byte) 112)) {
            String var4 = arg1.toLowerCase();
            int var5 = this.field2736.field8745.method8(class411.method2604(var4, false), false);
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(I)V", line = 362)
    public static void method1295(int arg0) {
        if (arg0 >= -7) {
            field2728 = null;
        }
        field2728 = null;
        field2700 = null;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)I", line = 384)
    public final int method1296(byte arg0) {
        field2737++;
        if (arg0 <= 96) {
            this.field2714 = null;
        }
        if (!this.method1303((byte) 126)) {
            throw new IllegalStateException("");
        }
        return this.field2736.field8729;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZI[II)[B", line = 399)
    public final byte[] method1297(boolean arg0, int arg1, int[] arg2, int arg3) {
        field2705++;
        if (!this.method1292(arg1, !arg0, arg3)) {
            return null;
        }
        if (this.field2714[arg3] == null || this.field2714[arg3][arg1] == null) {
            boolean var5 = this.method1304(arg3, arg2, 0, arg1);
            if (!var5) {
                this.method1280(-1, arg3);
                boolean var6 = this.method1304(arg3, arg2, 0, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class89.method574(arg0, (byte) 95, this.field2714[arg3][arg1]);
        if (this.field2708 == 1) {
            this.field2714[arg3][arg1] = null;
            if (this.field2736.field8737[arg3] == 1) {
                this.field2714[arg3] = null;
            }
        } else if (this.field2708 == 2) {
            this.field2714[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZZ)V", line = 445)
    public final void method1298(int arg0, boolean arg1, boolean arg2) {
        field2712++;
        if (!this.method1303((byte) 87)) {
            return;
        }
        int var4 = 64 / ((-arg0 - 52) / 42);
        if (arg2) {
            this.field2736.field8740 = null;
            this.field2736.field8745 = null;
        }
        if (arg1) {
            this.field2736.field8739 = null;
            this.field2736.field8736 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V", line = 474)
    public final void method1299(int arg0) {
        field2732++;
        if (arg0 == 0 && this.field2716 != null) {
            for (int var2 = 0; var2 < this.field2716.length; var2++) {
                this.field2716[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBIIILvi;IIIII)Z", line = 498)
    public static final boolean method1300(int arg0, byte arg1, int arg2, int arg3, int arg4, class468 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2734++;
        int var11 = arg8;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        class464.field6901[var13][var14] = 99;
        int var16 = arg3 - var14;
        class223.field3137[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class110.field1357[var17] = arg8;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class448.field6691[var10001] = arg3;
        int[][] var19 = arg5.field6941;
        while (var26 != var18) {
            var12 = class448.field6691[var18];
            var11 = class110.field1357[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg5.field6949;
            int var23 = var12 - arg5.field6943;
            if (arg9 == -4) {
                if (arg4 == var11 && arg6 == var12) {
                    class52.field545 = var11;
                    class327.field4721 = var12;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class170.method980(arg4, arg1 ^ 0x26, 2, var12, arg0, arg6, var11, arg7, 2)) {
                    class327.field4721 = var12;
                    class52.field545 = var11;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg5.method2859(var11, 2, arg7, arg10, arg6, arg4, var12, (byte) -70, arg0, 2)) {
                    class327.field4721 = var12;
                    class52.field545 = var11;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg5.method2860(arg0, var12, (byte) 69, arg7, arg6, arg4, var11, arg10, 2)) {
                    class327.field4721 = var12;
                    class52.field545 = var11;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg5.method2873(arg9, 62, arg2, arg4, arg6, var12, var11, 2)) {
                    class327.field4721 = var12;
                    class52.field545 = var11;
                    return true;
                }
            } else if (arg5.method2872(arg4, (byte) -23, var12, var11, arg9, 2, arg6, arg2)) {
                class52.field545 = var11;
                class327.field4721 = var12;
                return true;
            }
            int var25 = class223.field3137[var20][var21] + 1;
            if (var20 > 0 && class464.field6901[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class110.field1357[var26] = var11 - 1;
                class448.field6691[var26] = var12;
                class464.field6901[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class223.field3137[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class464.field6901[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class110.field1357[var26] = var11 + 1;
                class448.field6691[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class464.field6901[var20 + 1][var21] = 8;
                class223.field3137[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class464.field6901[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class110.field1357[var26] = var11;
                class448.field6691[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class464.field6901[var20][var21 - 1] = 1;
                class223.field3137[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class464.field6901[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class110.field1357[var26] = var11;
                class448.field6691[var26] = var12 + 1;
                class464.field6901[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class223.field3137[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class464.field6901[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class110.field1357[var26] = var11 - 1;
                class448.field6691[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class464.field6901[var20 - 1][var21 - 1] = 3;
                class223.field3137[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class464.field6901[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class110.field1357[var26] = var11 + 1;
                class448.field6691[var26] = var12 - 1;
                class464.field6901[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class223.field3137[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class464.field6901[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class110.field1357[var26] = var11 - 1;
                class448.field6691[var26] = var12 + 1;
                class464.field6901[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class223.field3137[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class464.field6901[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class110.field1357[var26] = var11 + 1;
                class448.field6691[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class464.field6901[var20 + 1][var21 + 1] = 12;
                class223.field3137[var20 + 1][var21 + 1] = var25;
            }
        }
        if (arg1 != 44) {
            field2728 = null;
        }
        class327.field4721 = var12;
        class52.field545 = var11;
        return false;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 850)
    public final boolean method1301(String arg0, String arg1, int arg2) {
        field2711++;
        if (!this.method1303((byte) 65)) {
            return false;
        }
        if (arg2 != 12291) {
            this.field2736 = null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field2736.field8745.method8(class411.method2604(var4, false), false);
        if (this.method1287(false, var6)) {
            int var7 = this.field2736.field8739[var6].method8(class411.method2604(var5, false), false);
            return this.method1284(var6, (byte) 52, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 876)
    public final void method1302(boolean arg0, String arg1) {
        field2724++;
        if (!this.method1303((byte) 66)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2736.field8745.method8(class411.method2604(var3, false), false);
        this.method1290(var4, 8061);
        if (!arg0) {
            this.field2736 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)Z", line = 897)
    private final boolean method1303(byte arg0) {
        if (arg0 <= 54) {
            return true;
        }
        field2704++;
        if (this.field2736 == null) {
            this.field2736 = this.field2703.method211(102);
            if (this.field2736 == null) {
                return false;
            }
            this.field2714 = new Object[this.field2736.field8738][];
            this.field2716 = new Object[this.field2736.field8738];
        }
        return true;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I[III)Z", line = 926)
    private final boolean method1304(int arg0, int[] arg1, int arg2, int arg3) {
        field2706++;
        if (!this.method1287(false, arg0)) {
            return false;
        } else if (this.field2716[arg0] == null) {
            return false;
        } else {
            int var5 = this.field2736.field8735[arg0];
            int[] var6 = this.field2736.field8732[arg0];
            if (this.field2714[arg0] == null) {
                this.field2714[arg0] = new Object[this.field2736.field8737[arg0]];
            }
            Object[] var7 = this.field2714[arg0];
            boolean var8 = true;
            for (int var9 = arg2; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var11 = class89.method574(true, (byte) 70, this.field2716[arg0]);
                class194 var12 = new class194(var11);
                var12.method1228(var12.field2622.length, arg1, 61, 5);
            } else {
                var11 = class89.method574(false, (byte) 40, this.field2716[arg0]);
            }
            byte[] var13;
            try {
                var13 = class238.method1593(true, var11);
            } catch (RuntimeException var49) {
                throw class527.method3097(var49, "T3 - " + (arg1 != null) + "," + arg0 + "," + var11.length + "," + class513.method3047((byte) 115, var11, var11.length) + "," + class513.method3047((byte) 112, var11, var11.length - 2) + "," + this.field2736.field8731[arg0] + "," + this.field2736.field8729);
            }
            if (this.field2723) {
                this.field2716[arg0] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field2708 == 0) {
                    var7[var48] = class295.method1981(-1053, var13, false);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field2708 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * 4 * var32;
                class194 var34 = new class194(var13);
                int var35 = 0;
                int var36 = 0;
                var34.field2610 = var33;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method1178(-230315992);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg3 == var40) {
                            var36 = var40;
                            var35 += var38;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                var34.field2610 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method1178(arg2 - 230315992);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg3 == var47) {
                            class210.method1330(var13, var43, var41, var42, var45);
                            var42 += var45;
                        }
                        var43 += var45;
                    }
                }
                var7[var36] = var41;
            } else {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var16 * 4 * var5;
                class194 var18 = new class194(var13);
                int[] var19 = new int[var5];
                var18.field2610 = var17;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method1178(-230315992);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field2610 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method1178(-230315992);
                        class210.method1330(var13, var25, var23[var28], var19[var28], var27);
                        var19[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field2708 == 0) {
                        var7[var30] = class295.method1981(-1053, var23[var29], false);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(I)Z", line = 1206)
    public final boolean method1305(int arg0) {
        field2717++;
        if (!this.method1303((byte) 121)) {
            return false;
        }
        if (arg0 != 2) {
            this.field2703 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2736.field8733.length; var3++) {
            int var4 = this.field2736.field8733[var3];
            if (this.field2716[var4] == null) {
                this.method1280(-1, var4);
                if (this.field2716[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z)I", line = 1241)
    public final int method1306(boolean arg0) {
        field2727++;
        if (!this.method1303((byte) 110)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2716.length; var4++) {
            if (this.field2736.field8735[var4] > 0) {
                var2 += 100;
                var3 += this.method1291(var4, -1);
            }
        }
        if (var2 == 0) {
            return 100;
        }
        int var5 = var3 * 100 / var2;
        if (!arg0) {
            this.method1309(-119, -76);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "(II)V", line = 1281)
    public final void method1307(int arg0, int arg1) {
        if (arg1 <= 28) {
            this.field2716 = null;
        }
        field2726++;
        if (this.method1287(false, arg0) && this.field2714 != null) {
            this.field2714[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BI)[B", line = 1299)
    public final byte[] method1308(byte arg0, int arg1) {
        field2709++;
        if (!this.method1303((byte) 108)) {
            return null;
        } else if (this.field2736.field8737.length == 1) {
            return this.method1286(arg1, 0, (byte) -49);
        } else if (!this.method1287(false, arg1)) {
            return null;
        } else if (this.field2736.field8737[arg1] == 1) {
            return this.method1286(0, arg1, (byte) -49);
        } else {
            if (arg0 >= -125) {
                this.method1287(false, 89);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "(II)I", line = 1327)
    public final int method1309(int arg0, int arg1) {
        field2722++;
        if (this.method1287(false, arg1)) {
            if (arg0 != 1675886592) {
                field2700 = null;
            }
            return this.field2736.field8737[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 1343)
    public final int method1310(String arg0, int arg1) {
        if (arg1 != 1) {
            return 122;
        }
        field2710++;
        if (this.method1303((byte) 118)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field2736.field8745.method8(class411.method2604(var3, false), false);
            return this.method1291(var4, arg1 ^ 0xFFFFFFFE);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)Z", line = 1361)
    public final boolean method1311(int arg0, byte arg1) {
        field2731++;
        if (!this.method1303((byte) 91)) {
            return false;
        } else if (this.field2736.field8737.length == 1) {
            return this.method1284(0, (byte) 52, arg0);
        } else if (!this.method1287(false, arg0)) {
            return false;
        } else if (this.field2736.field8737[arg0] == 1) {
            return this.method1284(arg0, (byte) 52, 0);
        } else {
            if (arg1 != -93) {
                this.method1290(39, -118);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "(II)Z", line = 1390)
    public final boolean method1312(int arg0, int arg1) {
        field2718++;
        if (!this.method1287(false, arg1)) {
            return false;
        } else if (arg0 != 0) {
            return true;
        } else if (this.field2716[arg1] == null) {
            this.method1280(-1, arg1);
            return this.field2716[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lgs;ZI)V", line = 1421)
    public class203(class39 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field2723 = arg1;
        this.field2703 = arg0;
        this.field2708 = arg2;
    }
}
