import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class475 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6992 = null;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Ldq;")
    public static class489 field6990 = new class489(5, -1);

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lvp;")
    public static class123 field6993;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
    public static int[] field6995;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field6994;

    static {
        new class180("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field6993 = new class123(20, 4);
        field6995 = new int[64];
        field6996 = 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method2841(int arg0, int arg1, int arg2) {
        field6991++;
        if (arg0 > -35) {
            return true;
        } else {
            return class416.method2562(arg1, (byte) 4, arg2) | (arg2 & 0x40000) != 0 || class108.method805(arg2, -79, arg1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)Z", line = 24)
    public static final boolean method2842(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class18.field287; var3++) {
            class322 var4 = class86.field1437[var3];
            if (var4.field4929 == 1) {
                int var5 = var4.field4939 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4941 * var5 >> 8) + var4.field4946;
                    int var7 = (var4.field4938 * var5 >> 8) + var4.field4937;
                    int var8 = (var4.field4933 * var5 >> 8) + var4.field4950;
                    int var9 = (var4.field4951 * var5 >> 8) + var4.field4944;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4929 == 2) {
                int var10 = arg0 - var4.field4939;
                if (var10 > 0) {
                    int var11 = (var4.field4941 * var10 >> 8) + var4.field4946;
                    int var12 = (var4.field4938 * var10 >> 8) + var4.field4937;
                    int var13 = (var4.field4933 * var10 >> 8) + var4.field4950;
                    int var14 = (var4.field4951 * var10 >> 8) + var4.field4944;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4929 == 3) {
                int var15 = var4.field4946 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4932 * var15 >> 8) + var4.field4939;
                    int var17 = (var4.field4930 * var15 >> 8) + var4.field4949;
                    int var18 = (var4.field4933 * var15 >> 8) + var4.field4950;
                    int var19 = (var4.field4951 * var15 >> 8) + var4.field4944;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4929 == 4) {
                int var20 = arg2 - var4.field4946;
                if (var20 > 0) {
                    int var21 = (var4.field4932 * var20 >> 8) + var4.field4939;
                    int var22 = (var4.field4930 * var20 >> 8) + var4.field4949;
                    int var23 = (var4.field4933 * var20 >> 8) + var4.field4950;
                    int var24 = (var4.field4951 * var20 >> 8) + var4.field4944;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4929 == 5) {
                int var25 = arg1 - var4.field4950;
                if (var25 > 0) {
                    int var26 = (var4.field4932 * var25 >> 8) + var4.field4939;
                    int var27 = (var4.field4930 * var25 >> 8) + var4.field4949;
                    int var28 = (var4.field4941 * var25 >> 8) + var4.field4946;
                    int var29 = (var4.field4938 * var25 >> 8) + var4.field4937;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 145)
    public static void method2843(int arg0) {
        field6992 = null;
        field6995 = null;
        field6993 = null;
        field6990 = null;
        if (arg0 != 8) {
            field6992 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[FFIIIIFFIF)V")
    public abstract void method363(int arg0, float[] arg1, float arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8, int arg9, float arg10);
}
