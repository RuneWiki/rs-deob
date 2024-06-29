import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class348 extends class51 {

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public int field4789 = -1;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Lmc;")
    public static class78 field4793 = new class78(70, 3);

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Lnl;")
    public static class356 field4795;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Ljava/lang/String;")
    public String field4788;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Ljava/lang/String;")
    public String field4791;

    static {
        new class206("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field4797 = -1;
        field4799 = 0;
        field4795 = new class356();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIII)V", line = 5)
    public static final void method2149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg0 == ~arg8 && ~arg3 == ~arg5 && ~arg4 == ~arg7 && arg1 == arg2) {
            class90.method578(arg2, arg7, arg8, arg5, arg6, (byte) -123);
        } else {
            int var10 = arg8;
            int var11 = arg5;
            int var12 = arg8 * 3;
            int var13 = arg5 * 3;
            int var14 = arg0 * 3;
            int var15 = arg3 * 3;
            int var16 = arg4 * 3;
            int var17 = arg1 * 3;
            int var18 = arg7 - var16 + var14 - arg8;
            int var19 = arg2 - (-var15 + var17 - -arg5);
            int var20 = var16 - var14 + var12 + -var14;
            int var21 = -var15 + var17 - var15 + var13;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg8;
                int var34 = (var28 + var30 + var32 >> 12) + arg5;
                class90.method578(var34, var33, var10, var11, arg6, (byte) -125);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg9 <= 103) {
            method2154((byte) 113);
        }
        ++field4792;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILgq;Lgq;)V", line = 82)
    public static final void method2150(int arg0, int arg1, int arg2, class327 arg3, class327 arg4) {
        class491 var5 = class398.method2420(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6864 = arg3;
            var5.field6847 = arg4;
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V", line = 92)
    public static void method2151(int arg0) {
        field4793 = null;
        field4795 = null;
        if (arg0 != 65535) {
            method2153(false, (class32) null);
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)Lkh;", line = 106)
    public final class13 method2152(int arg0) {
        ++field4790;
        return arg0 != 1343648748 ? null : class94.field1399[super.field672];
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLbt;)V", line = 118)
    public static final void method2153(boolean arg0, class32 arg1) {
        ++field4794;
        if (arg0) {
            method2150(-19, 63, 79, (class327) null, (class327) null);
        }
        for (int var2 = 0; var2 < class52.field688; ++var2) {
            int var3 = arg1.method203((byte) -78);
            int var4 = arg1.method215((byte) 125);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class110.field1680[var3] != null) {
                class110.field1680[var3].field674 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 152)
    public static final void method2154(byte arg0) {
        class210.field2836 = new class105();
        if (arg0 >= 49) {
            ++field4787;
        }
    }
}
