import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class74 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Ldn;")
    public static class357 field1001;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Ldi;")
    public static class83 field1004;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lnj;")
    public static class162 field1005;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field998;

    static {
        new class466(null, "geschickt werden.", null, null);
        field999 = 0;
        field1003 = 0;
        field1001 = new class357("WTI", 5);
        field1004 = new class83(48, 11);
        field1005 = new class162(20);
        new class466("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method596(int arg0, int arg1) {
        if (arg1 != -1) {
            field1001 = null;
        }
        field1002++;
        return arg0 != 1 && arg0 != 7;
    }

    @OriginalMember(owner = "client!ri", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field998++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 24)
    public static void method597(byte arg0) {
        field1001 = null;
        field1004 = null;
        field1005 = null;
        if (arg0 != -109) {
            method596(-11, 41);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z[IIILeq;IIIIIIII[II)I", line = 42)
    public static final int method598(boolean arg0, int[] arg1, int arg2, int arg3, class141 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class367.field5382[var15][var35] = 0;
                class250.field3452[var15][var35] = 99999999;
            }
        }
        field1000++;
        boolean var16;
        if (arg3 == 1) {
            var16 = class222.method1379(arg7, arg14, arg9, arg6, 23469, arg4, arg8, arg10, arg11, arg12, arg5);
        } else if (arg3 == 2) {
            var16 = class93.method689(arg7, arg11, arg5, arg9, (byte) 52, arg8, arg6, arg4, arg10, arg14, arg12);
        } else {
            var16 = class167.method1106(arg11, arg14, arg7, arg4, arg3, arg12, (byte) 37, arg8, arg5, arg6, arg9, arg10);
        }
        int var17 = arg7 - 64;
        int var18 = arg14 - 64;
        int var19 = class489.field7139;
        int var20 = class64.field871;
        if (!var16) {
            if (!arg0) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg12 - var23; var24 <= arg12 + var23; var24++) {
                for (int var25 = arg9 - var23; var25 <= (arg9 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class250.field3452[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg12) {
                            var28 = arg12 - var24;
                        } else if (var24 > (arg12 + arg10 - 1)) {
                            var28 = var24 + 1 - arg10 - arg12;
                        }
                        int var29 = 0;
                        if (var25 < arg9) {
                            var29 = arg9 - var25;
                        } else if ((arg5 + arg9 - 1) < var25) {
                            var29 = var25 - (arg5 + arg9 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class250.field3452[var26][var27]) {
                            var21 = var30;
                            var20 = var25;
                            var22 = class250.field3452[var26][var27];
                            var19 = var24;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg7 == var19 && arg14 == var20) {
            return 0;
        }
        if (arg2 != -33) {
            field999 = -86;
        }
        byte var31 = 0;
        class223.field3172[var31] = var19;
        int var37 = var31 + 1;
        class446.field6579[var31] = var20;
        int var32;
        int var33 = var32 = class367.field5382[var19 - var17][var20 - var18];
        while (arg7 != var19 || arg14 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class223.field3172[var37] = var19;
                class446.field6579[var37++] = var20;
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
            var33 = class367.field5382[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg13[var34] = class223.field3172[var37];
            arg1[var34++] = class446.field6579[var37];
            if (arg13.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(II)V", line = 236)
    public class74(int arg0, int arg1) {
    }
}
