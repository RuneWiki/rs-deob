import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class16 {

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Loi;")
    public class43 field182;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "[Z")
    public static boolean[] field188;

    static {
        new class306("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)Luq;", line = 4)
    public static final class346 method79(boolean arg0) {
        if (arg0) {
            field186 = 12;
        }
        field183++;
        return class210.field3321;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lqs;ILqs;)I", line = 18)
    public static final int method80(class496 arg0, int arg1, class496 arg2) {
        field185++;
        int var3 = 0;
        if (arg2.method2929(class191.field2972, -59)) {
            var3++;
        }
        if (arg2.method2929(class471.field6994, -104)) {
            var3++;
        }
        if (arg2.method2929(class54.field874, -128)) {
            var3++;
        }
        if (arg0.method2929(class191.field2972, -127)) {
            var3++;
        }
        if (arg1 != 4) {
            method83(108, -44, -53, -121, 127, -19, -76, -40);
        }
        if (arg0.method2929(class471.field6994, -89)) {
            var3++;
        }
        if (arg0.method2929(class54.field874, arg1 - 59)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(Z)V", line = 53)
    public static void method81(boolean arg0) {
        if (!arg0) {
            field188 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 76)
    public static final String method82(int arg0, String[] arg1, int arg2, int arg3) {
        field184++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg1[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg3 + arg0;
            int var6 = 0;
            int var7 = arg0;
            if (arg2 <= 85) {
                field181 = -10;
            }
            while (var5 > var7) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
                var7++;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIIII)V", line = 140)
    public static final void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field187++;
        int var8 = class52.method367(arg4, class472.field6996, (byte) 127, class29.field460);
        int var9 = class52.method367(arg3, class472.field6996, (byte) -19, class29.field460);
        int var10 = class52.method367(arg2, class235.field4076, (byte) 108, class182.field2877);
        int var11 = class52.method367(arg6, class235.field4076, (byte) 124, class182.field2877);
        int var12 = class52.method367(arg0 + arg4, class472.field6996, (byte) 107, class29.field460);
        int var13 = class52.method367(arg3 - arg0, class472.field6996, (byte) 122, class29.field460);
        for (int var14 = var8; var14 < var12; var14++) {
            class357.method2291(var10, arg7, class209.field3294[var14], var11, -1);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class357.method2291(var10, arg7, class209.field3294[var15], var11, -1);
        }
        int var16 = class52.method367(arg0 + arg2, class235.field4076, (byte) -54, class182.field2877);
        int var17 = class52.method367(arg6 - arg0, class235.field4076, (byte) -90, class182.field2877);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class209.field3294[var18];
            class357.method2291(var10, arg7, var19, var16, -1);
            class357.method2291(var16, arg1, var19, var17, -1);
            class357.method2291(var17, arg7, var19, var11, -1);
        }
        if (arg5 != 4) {
            method83(124, -58, -75, 77, -94, -81, -48, 55);
        }
    }
}
