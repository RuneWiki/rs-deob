import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class266 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field3944;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    private int field3942;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[I")
    public static int[] field3949 = new int[1];

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lqfa;")
    public static class85 field3943 = new class85(43, -2);

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1736(int arg0) {
        field3949 = null;
        field3943 = null;
        if (arg0 != 0) {
            field3949 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lpc;IIIZ)Z")
    public static final boolean method1737(class624 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3945++;
        if (!class337.field5036) {
            return false;
        } else if (class481.field6911 < 100) {
            return false;
        } else if (class649.method3708(arg3, -127, arg2, arg1)) {
            int var5 = arg3 << class30.field940;
            int var6 = arg1 << class30.field940;
            int var7 = class485.field6947[arg2].method551(arg3, arg1, (byte) -102) - 1;
            int var8 = arg0.method530(-114) + var7;
            if (arg0.field9020 == 1) {
                if (!class589.method3361(var6, var5, var8, var6, class576.field8369 + var6, -121, var7, var5, var5, var8)) {
                    return false;
                } else if (class589.method3361(var6, var5, var7, class576.field8369 + var6, class576.field8369 + var6, -119, var7, var5, var5, var8)) {
                    class448.field6453++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9020 == 2) {
                if (!class589.method3361(class576.field8369 + var6, var5, var8, class576.field8369 + var6, var6 - -class576.field8369, -119, var7, var5, class576.field8369 + var5, var8)) {
                    return false;
                } else if (class589.method3361(class576.field8369 + var6, class576.field8369 + var5, var8, class576.field8369 + var6, class576.field8369 + var6, -122, var7, var5, class576.field8369 + var5, var7)) {
                    class448.field6453++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9020 == 4) {
                if (!class589.method3361(var6, var5 + class576.field8369, var8, var6, class576.field8369 + var6, -128, var7, class576.field8369 + var5, class576.field8369 + var5, var8)) {
                    return false;
                } else if (class589.method3361(var6, var5 + class576.field8369, var7, class576.field8369 + var6, var6 - -class576.field8369, -127, var7, class576.field8369 + var5, class576.field8369 + var5, var8)) {
                    class448.field6453++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9020 == 8) {
                if (!class589.method3361(var6, var5, var8, var6, var6, -123, var7, var5, class576.field8369 + var5, var8)) {
                    return false;
                } else if (class589.method3361(var6, var5 + class576.field8369, var8, var6, var6, -127, var7, var5, class576.field8369 + var5, var7)) {
                    class448.field6453++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9020 == 16) {
                if (class498.method2974(class271.field4068, var8, var7, class271.field4068 + var6, 8963, var5, class271.field4068)) {
                    class448.field6453++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9020 != 32) {
                if (arg4) {
                    field3949 = null;
                }
                if (arg0.field9020 == 64) {
                    if (class498.method2974(class271.field4068, var8, var7, var6, 8963, class271.field4068 + var5, class271.field4068)) {
                        class448.field6453++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg0.field9020 != 128) {
                    return true;
                } else if (class498.method2974(class271.field4068, var8, var7, var6, 8963, var5, class271.field4068)) {
                    class448.field6453++;
                    return true;
                } else {
                    return false;
                }
            } else if (class498.method2974(class271.field4068, var8, var7, class271.field4068 + var6, 8963, class271.field4068 + var5, class271.field4068)) {
                class448.field6453++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3948++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIIIBILfh;)Z")
    public static final boolean method1738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, class605 arg10) {
        field3947++;
        int var11 = arg2;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg2 - var13;
        int var16 = arg9 - var14;
        class78.field1571[var13][var14] = 99;
        int var17 = 73 % ((-arg8 - 18) / 32);
        class284.field4218[var13][var14] = 0;
        byte var18 = 0;
        int var19 = 0;
        class89.field1641[var18] = arg2;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class257.field3795[var10001] = arg9;
        int[][] var20 = arg10.field8803;
        while (var27 != var19) {
            var12 = class257.field3795[var19];
            var11 = class89.field1641[var19];
            int var21 = var11 - var15;
            var19 = var19 + 1 & 0xFFF;
            int var22 = var12 - var16;
            int var23 = var12 - arg10.field8807;
            int var24 = var11 - arg10.field8796;
            if (arg7 == -4) {
                if (arg1 == var11 && arg6 == var12) {
                    class399.field5808 = var11;
                    class213.field3254 = var12;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class2.method187(arg3, arg6, var11, 2, 1, arg4, 1, var12, arg1)) {
                    class213.field3254 = var12;
                    class399.field5808 = var11;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg10.method3468(1, arg3, arg6, var12, arg4, -1, arg5, var11, 1, arg1)) {
                    class213.field3254 = var12;
                    class399.field5808 = var11;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg10.method3475(arg1, arg5, arg6, true, arg3, var12, 1, arg4, var11)) {
                    class399.field5808 = var11;
                    class213.field3254 = var12;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg10.method3478(arg1, arg7, 1, arg6, 6, arg0, var12, var11)) {
                    class399.field5808 = var11;
                    class213.field3254 = var12;
                    return true;
                }
            } else if (arg10.method3476(1, arg1, var12, arg7, arg6, arg0, var11, -72)) {
                class213.field3254 = var12;
                class399.field5808 = var11;
                return true;
            }
            int var26 = class284.field4218[var21][var22] + 1;
            if (var21 > 0 && class78.field1571[var21 - 1][var22] == 0 && (var20[var24 - 1][var23] & 0x42240000) == 0) {
                class89.field1641[var27] = var11 - 1;
                class257.field3795[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class78.field1571[var21 - 1][var22] = 2;
                class284.field4218[var21 - 1][var22] = var26;
            }
            if (var21 < 127 && class78.field1571[var21 + 1][var22] == 0 && (var20[var24 + 1][var23] & 0x60240000) == 0) {
                class89.field1641[var27] = var11 + 1;
                class257.field3795[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class78.field1571[var21 + 1][var22] = 8;
                class284.field4218[var21 + 1][var22] = var26;
            }
            if (var22 > 0 && class78.field1571[var21][var22 - 1] == 0 && (var20[var24][var23 - 1] & 0x40A40000) == 0) {
                class89.field1641[var27] = var11;
                class257.field3795[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class78.field1571[var21][var22 - 1] = 1;
                class284.field4218[var21][var22 - 1] = var26;
            }
            if (var22 < 127 && class78.field1571[var21][var22 + 1] == 0 && (var20[var24][var23 + 1] & 0x48240000) == 0) {
                class89.field1641[var27] = var11;
                class257.field3795[var27] = var12 + 1;
                class78.field1571[var21][var22 + 1] = 4;
                var27 = var27 + 1 & 0xFFF;
                class284.field4218[var21][var22 + 1] = var26;
            }
            if (var21 > 0 && var22 > 0 && class78.field1571[var21 - 1][var22 - 1] == 0 && (var20[var24 - 1][var23 - 1] & 0x43A40000) == 0 && (var20[var24 - 1][var23] & 0x42240000) == 0 && (var20[var24][var23 - 1] & 0x40A40000) == 0) {
                class89.field1641[var27] = var11 - 1;
                class257.field3795[var27] = var12 - 1;
                class78.field1571[var21 - 1][var22 - 1] = 3;
                var27 = var27 + 1 & 0xFFF;
                class284.field4218[var21 - 1][var22 - 1] = var26;
            }
            if (var21 < 127 && var22 > 0 && class78.field1571[var21 + 1][var22 - 1] == 0 && (var20[var24 + 1][var23 - 1] & 0x60E40000) == 0 && (var20[var24 + 1][var23] & 0x60240000) == 0 && (var20[var24][var23 - 1] & 0x40A40000) == 0) {
                class89.field1641[var27] = var11 + 1;
                class257.field3795[var27] = var12 - 1;
                class78.field1571[var21 + 1][var22 - 1] = 9;
                var27 = var27 + 1 & 0xFFF;
                class284.field4218[var21 + 1][var22 - 1] = var26;
            }
            if (var21 > 0 && var22 < 127 && class78.field1571[var21 - 1][var22 + 1] == 0 && (var20[var24 - 1][var23 + 1] & 0x4E240000) == 0 && (var20[var24 - 1][var23] & 0x42240000) == 0 && (var20[var24][var23 + 1] & 0x48240000) == 0) {
                class89.field1641[var27] = var11 - 1;
                class257.field3795[var27] = var12 + 1;
                class78.field1571[var21 - 1][var22 + 1] = 6;
                var27 = var27 + 1 & 0xFFF;
                class284.field4218[var21 - 1][var22 + 1] = var26;
            }
            if (var21 < 127 && var22 < 127 && class78.field1571[var21 + 1][var22 + 1] == 0 && (var20[var24 + 1][var23 + 1] & 0x78240000) == 0 && (var20[var24 + 1][var23] & 0x60240000) == 0 && (var20[var24][var23 + 1] & 0x48240000) == 0) {
                class89.field1641[var27] = var11 + 1;
                class257.field3795[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class78.field1571[var21 + 1][var22 + 1] = 12;
                class284.field4218[var21 + 1][var22 + 1] = var26;
            }
        }
        class399.field5808 = var11;
        class213.field3254 = var12;
        return false;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(II)V")
    public class266(int arg0, int arg1) {
        this.field3944 = arg1;
        this.field3942 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)I")
    public final int method1739(byte arg0) {
        field3946++;
        if (arg0 != -103) {
            field3943 = null;
        }
        return this.field3942;
    }
}
