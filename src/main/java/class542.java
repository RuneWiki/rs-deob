import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class542 {

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "[I")
    public static int[] field7924 = new int[2];

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Lqi;")
    public static class406 field7922 = new class406(16);

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "Lkn;")
    public static class530 field7925 = new class530("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static void method3181(int arg0) {
        if (arg0 <= 6) {
            field7924 = null;
        }
        field7925 = null;
        field7922 = null;
        field7924 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[BI)I")
    public static final int method3182(int arg0, byte[] arg1, int arg2) {
        if (arg2 != 0) {
            method3185(false, 8, -41, 14, 98, 112);
        }
        field7923++;
        return class106.method721(0, arg1, 20458, arg0);
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)[Ldu;")
    public static final class242[] method3183(int arg0) {
        if (arg0 != 28576) {
            field7925 = null;
        }
        field7919++;
        return new class242[] { class510.field7557, class485.field6765, class58.field730, class386.field5420, class330.field4821, class48.field548, class31.field364, class241.field3504, class461.field6447, class354.field5080, class496.field7023, class217.field3149, class334.field4847, class161.field2378, class486.field6778 };
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method3184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field7920++;
        if (arg2 == arg7) {
            class55.method461(0, arg7, arg3, arg4, arg1, arg0, arg5);
            return;
        }
        if (arg4 - arg7 >= class392.field5514 && arg4 + arg7 <= class518.field7624 && (arg1 - arg2) >= class303.field4422 && class353.field5062 >= (arg1 + arg2)) {
            class267.method1686(arg5, -1, arg7, arg4, arg2, arg1, arg3, arg0);
        } else {
            class180.method1117(arg3, arg4, arg7, (byte) -114, arg0, arg1, arg2, arg5);
        }
        if (arg6 > -90) {
            method3182(-59, null, 119);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZIIIII)V")
    public static final void method3185(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 97 % ((arg1 + 58) / 60);
        field7918++;
        long var7 = (long) (arg5 | (arg0 ? Integer.MIN_VALUE : 0));
        class167 var9 = (class167) class502.field7099.method2405(var7, -82);
        if (var9 == null) {
            var9 = new class167();
            class502.field7099.method2413(var7, var9, -1);
        }
        if (arg3 >= var9.field2432.length) {
            int[] var10 = new int[arg3 + 1];
            int[] var11 = new int[arg3 + 1];
            for (int var12 = 0; var12 < var9.field2432.length; var12++) {
                var10[var12] = var9.field2432[var12];
                var11[var12] = var9.field2433[var12];
            }
            for (int var13 = var9.field2432.length; var13 < arg3; var13++) {
                var10[var13] = -1;
                var11[var13] = 0;
            }
            var9.field2433 = var11;
            var9.field2432 = var10;
        }
        var9.field2432[arg3] = arg4;
        var9.field2433[arg3] = arg2;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
    public static final void method3186(int arg0, int arg1) {
        class322.field4640.method1087(1, arg0);
        field7921++;
        class188.field2699.method1087(1, arg0);
        class362.field5182.method1087(1, arg0);
        if (arg1 > 115) {
            class293.field4289.method1087(1, arg0);
            class62.field783.method1087(1, arg0);
        }
    }
}
