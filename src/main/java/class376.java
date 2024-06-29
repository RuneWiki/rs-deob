import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class376 extends class264 {

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "Z")
    public boolean field5486 = false;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public int field5483 = -1;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "Lvq;")
    public static class24 field5489 = new class24(94, 8);

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field5491 = 0;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public int field5484;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public int field5487;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public int field5488;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public int field5495;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public int field5497;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "[Lae;")
    public static class285[] field5490;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIIIIIIIBI)V")
    public static final void method2377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte arg12, int arg13) {
        field5482++;
        class58 var15;
        if (arg7 >= 0) {
            int var14 = arg7 - 1;
            var15 = class364.field5260[var14];
        } else {
            int var16 = -arg7 - 1;
            if (class420.field6085 == var16) {
                var15 = class187.field2619;
            } else {
                var15 = class455.field6731[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        class178 var17 = class450.method2785(arg3, (byte) 88);
        int var18;
        int var19;
        if (arg0 == 1 || arg0 == 3) {
            var19 = var17.field2476;
            var18 = var17.field2533;
        } else {
            var18 = var17.field2476;
            var19 = var17.field2533;
        }
        int var20 = arg8 + (var19 >> 1);
        int var21 = (var19 + 1 >> 1) + arg8;
        int var22 = (var18 >> 1) + arg10;
        int var23 = (var18 + 1 >> 1) + arg10;
        class378 var24 = class215.field3069[arg2];
        int var25 = var24.method1429(var20, var22) + var24.method1429(var21, var22) - (-var24.method1429(var20, var23) + -var24.method1429(var21, var23)) >> 2;
        if (arg12 <= 97) {
            return;
        }
        class454 var26 = new class454();
        var26.field6683 = arg5;
        var26.field6682 = class388.field5665 + arg11;
        var26.field6694 = class388.field5665 + arg4;
        var26.field6702 = arg10;
        var26.field6701 = arg0;
        var26.field6691 = arg3;
        var26.field6695 = arg8;
        var26.field6700 = var15.field4960;
        if (arg1 > arg6) {
            int var27 = arg1;
            arg1 = arg6;
            arg6 = var27;
        }
        if (arg13 > arg9) {
            int var28 = arg13;
            arg13 = arg9;
            arg9 = var28;
        }
        var26.field6685 = arg8 + arg6;
        var26.field6696 = arg1 + arg8;
        var26.field6678 = var26.field6702 * 128 + var18 * 64;
        var26.field6679 = var25;
        var26.field6699 = var26.field6695 * 128 + (var19 * 64);
        var26.field6684 = arg9 + arg10;
        var26.field6689 = arg10 + arg13;
        class225.field3375.method2484(0, var26);
        var15.field787 = var26;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lat;I)Lch;")
    public static final class456 method2378(class256 arg0, int arg1) {
        if (arg1 != 17955) {
            field5491 = -128;
        }
        field5492++;
        return new class456(arg0.method1747((byte) 12), arg0.method1747((byte) 12), arg0.method1747((byte) 12), arg0.method1747((byte) 12), arg0.method1725((byte) 0), arg0.method1725((byte) 0), arg0.method1738((byte) 58));
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIIII)V")
    public static final void method2379(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5481++;
        int var6 = arg4;
        if (arg0) {
            while (var6 <= arg1) {
                class381.method2419((byte) 23, arg3, arg2, class323.field4774[var6], arg5);
                var6++;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public static void method2380(byte arg0) {
        field5489 = null;
        field5490 = null;
        if (arg0 >= -97) {
            method2381(85, 29);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2381(int arg0, int arg1) {
        field5494++;
        if (arg0 != -72770111) {
            method2380((byte) 62);
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZIZIBLat;IIII)V")
    public static final void method2382(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, byte arg6, class256 arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg6 >= -120) {
            field5489 = null;
        }
        field5493++;
        if (arg5 == 1) {
            arg10 = 1;
        } else if (arg5 == 2) {
            arg1 = 1;
            arg10 = 1;
        } else if (arg5 == 3) {
            arg1 = 1;
        }
        if (arg9 < 0 || class195.field2745 <= arg9 || arg0 < 0 || arg0 >= class78.field984) {
            while (true) {
                int var14 = arg7.method1738((byte) 116);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg7.method1738((byte) 106);
                    return;
                }
                if (var14 <= 49) {
                    arg7.method1738((byte) -62);
                }
            }
        }
        if (!arg4 && !arg2) {
            class131.field1790[arg11][arg9][arg0] = 0;
        }
        while (true) {
            int var12 = arg7.method1738((byte) 112);
            if (var12 == 0) {
                if (arg4) {
                    class264.field3910[0][arg1 + arg9][arg0 + arg10] = class28.field401[0].method1429(arg9 + arg1, arg0 + arg10);
                    return;
                } else if (arg11 == 0) {
                    class264.field3910[0][arg1 + arg9][arg0 + arg10] = -class454.method2818((byte) 23, arg3 + 556238, arg8 + 932731) * 8;
                    return;
                } else {
                    class264.field3910[arg11][arg1 + arg9][arg0 + arg10] = class264.field3910[arg11 - 1][arg1 + arg9][arg0 + arg10] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg7.method1738((byte) 102);
                if (arg4) {
                    class264.field3910[0][arg1 + arg9][arg0 + arg10] = var13 * 8 + class28.field401[0].method1429(arg1 + arg9, arg0 + arg10);
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg11 == 0) {
                    class264.field3910[0][arg9 + arg1][arg0 + arg10] = -var13 * 8;
                    return;
                }
                class264.field3910[arg11][arg1 + arg9][arg0 + arg10] = class264.field3910[arg11 - 1][arg1 + arg9][arg0 + arg10] - var13 * 8;
                return;
            }
            if (var12 <= 49) {
                if (arg2) {
                    arg7.method1738((byte) 86);
                } else {
                    class444.field6480[arg11][arg9][arg0] = arg7.method1728((byte) 95);
                    class427.field6211[arg11][arg9][arg0] = (byte) ((var12 - 2) / 4);
                    class316.field4632[arg11][arg9][arg0] = (byte) class386.method2438(var12 + arg5 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!arg4 && !arg2) {
                    class131.field1790[arg11][arg9][arg0] = (byte) (var12 - 49);
                }
            } else if (!arg2) {
                class82.field1007[arg11][arg9][arg0] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V")
    public class376(int arg0) {
        this.field5483 = arg0;
    }

    static {
        new class409("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
