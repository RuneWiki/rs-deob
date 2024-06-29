import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class417 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field5994 = 0;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Z")
    public static boolean field5998 = false;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[I")
    public static int[] field6001;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field5999;

    static {
        new class349("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field6000 = 0;
        field6001 = new int[] { 1, -1, -1, 1 };
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I", line = 3)
    public static final int method2629(int arg0, int arg1) {
        if (class199.field2847 != null) {
            class199.field2847.method1093(false);
            class199.field2847 = null;
        }
        field5995++;
        class222.field3181++;
        if (class222.field3181 > 4) {
            class222.field3181 = 0;
            class258.field3819 = 0;
            return arg1;
        }
        if (class299.field4344 == class165.field2364) {
            class299.field4344 = class118.field1608;
        } else {
            class299.field4344 = class165.field2364;
        }
        class258.field3819 = arg0;
        return -1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIB)V", line = 35)
    public static final void method2630(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 32) {
            return;
        }
        field5997++;
        int var6 = arg0 - arg1;
        int var7 = arg4 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class352.method2299(arg2, arg1, arg3, arg5 ^ 0x22, arg0);
            }
        } else if (var6 == 0) {
            class111.method676(arg3, arg2, arg5 ^ 0xFFFFFFDF, arg4, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                int var10 = arg4;
                arg2 = arg1;
                arg1 = var9;
                arg4 = arg0;
                arg0 = var10;
            }
            if (arg4 < arg2) {
                int var11 = arg2;
                int var12 = arg1;
                arg2 = arg4;
                arg1 = arg0;
                arg4 = var11;
                arg0 = var12;
            }
            int var13 = arg1;
            int var14 = arg4 - arg2;
            int var15 = arg0 - arg1;
            int var16 = -(var14 >> 1);
            int var17 = arg0 <= arg1 ? -1 : 1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg2; var19 <= arg4; var19++) {
                    class440.field6288[var19][var13] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg2; var18 <= arg4; var18++) {
                    class440.field6288[var13][var18] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 155)
    public static void method2631(boolean arg0) {
        if (!arg0) {
            field6001 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I", line = 174)
    public static int method2632(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
