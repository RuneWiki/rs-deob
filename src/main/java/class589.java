import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class589 {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Lmv;")
    public static class345 field8478;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lri;")
    public static class97 field8482;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method3361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field8479++;
        if (!class601.method3435(arg6, (byte) 76, arg7, arg0)) {
            return false;
        }
        int var10 = class296.field4440[1];
        int var11 = class296.field4440[2];
        int var12 = class296.field4440[0];
        if (!class601.method3435(arg9, (byte) 76, arg8, arg3)) {
            return false;
        }
        int var13 = class296.field4440[0];
        if (arg5 >= -117) {
            method3362(-115, 110, -30, (byte) 22, true);
        }
        int var14 = class296.field4440[2];
        int var15 = class296.field4440[1];
        if (class601.method3435(arg2, (byte) 76, arg1, arg4)) {
            int var16 = class296.field4440[1];
            int var17 = class296.field4440[0];
            int var18 = class296.field4440[2];
            return class146.method1164(var17, var18, var16, var11, var14, var15, var13, var12, var10, -22806);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIBZ)V")
    public static final void method3362(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field8480++;
        if (class90.field1654 == 0) {
            class11.method284(64, false);
        } else {
            class527.field7435 = class90.field1654;
            class294.method1959((byte) 110, 0);
        }
        class398.field5798 = arg2;
        class394.field5758 = arg0;
        class590.field8488 = arg4;
        int var5 = -120 % ((arg3 + 42) / 52);
        class407.method2477(arg1);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method3363(int arg0) {
        if (arg0 < 42) {
            method3361(-29, -115, -110, -84, 93, 81, -90, 27, 78, -31);
        }
        field8478 = null;
        field8482 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI[F)[F")
    public static final float[] method3364(byte arg0, int arg1, float[] arg2) {
        if (arg0 >= -98) {
            return null;
        } else {
            field8481++;
            float[] var3 = new float[arg1];
            class692.method3877(arg2, 0, var3, 0, arg1);
            return var3;
        }
    }
}
