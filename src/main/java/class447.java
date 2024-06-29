import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class447 {

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Loja;")
    public static class124 field6263 = new class124();

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[Lg;")
    public static class146[] field6264 = new class146[14];

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lpja;")
    public static class171 field6257;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZIIIII)V", line = 3)
    public static final void method2709(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class93.field1085 = arg4;
        field6260++;
        class423.field5878 = arg6;
        if (!arg1) {
            class426.field5950 = arg2;
            class400.field5654 = arg3;
            class399.field5646 = arg0;
            class141.field1802 = arg5;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 19)
    public static final void method2710(int arg0) {
        class579.field8132 = null;
        class535.field7400 = -1;
        class85.field1027 = null;
        class747.field10317 = null;
        class376.field5395 = null;
        class221.field3034 = null;
        class377.field5424 = null;
        field6259++;
        class96.field1127 = null;
        class166.field2118 = -1;
        class635.field8863 = -1;
        class593.field8350 = -1;
        if (arg0 != -20466) {
            method2714((byte) -25, true, -73, 25, -63);
        }
        class177.field2233.method3979(arg0 ^ 0xFFFFB80E);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lha;B)V", line = 46)
    public static final void method2711(class473 arg0, byte arg1) {
        if (arg1 > -41) {
            field6264 = null;
        }
        field6262++;
        if (class80.field900.method1036((byte) 115) == 0) {
            return;
        }
        if (class688.field9602.field8517.method2604((byte) -98) == 0) {
            for (class493 var4 = (class493) class80.field900.method1041(1048832); var4 != null; var4 = (class493) class80.field900.method1033(-1)) {
                class35.field367.method3053(arg0, false, var4.field6790, (byte) 56, var4.field6787, var4.field6794, arg0, false, class78.field878, var4.field6789 ? class724.field10031.field9993 : null, var4.field6795, var4.field6793);
                var4.method527(-11229);
            }
            class23.method99(100);
            return;
        }
        if (class7.field41 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class7.field41 = class713.method4003(class100.field1175, -49, class753.field10382, 0, 0, var2);
            class18.field123 = class7.field41.method179(class582.method3425(class170.field2160, 0, false, class128.field1671), class279.method1817(class149.field1968, class128.field1671, 0), true);
        }
        for (class493 var3 = (class493) class80.field900.method1041(1048832); var3 != null; var3 = (class493) class80.field900.method1033(-1)) {
            class35.field367.method3053(arg0, false, var3.field6790, (byte) 92, var3.field6787, var3.field6794, class7.field41, false, class18.field123, var3.field6789 ? class724.field10031.field9993 : null, var3.field6795, var3.field6793);
            var3.method527(-11229);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 98)
    public static void method2712(byte arg0) {
        field6263 = null;
        field6264 = null;
        field6257 = null;
        if (arg0 < 17) {
            method2711(null, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILae;Lae;Z)V", line = 111)
    public static final void method2713(int arg0, class283 arg1, class283 arg2, boolean arg3) {
        if (arg3) {
            field6258++;
            class395.field5615 = arg1;
            class517.field7110 = arg2;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BZIII)V", line = 125)
    public static final void method2714(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 2) {
            return;
        }
        field6261++;
        if (class688.field9602.field8517.method2604((byte) -98) == 0) {
            class25.method108(false, (byte) -112);
        } else {
            class545.field7587 = class688.field9602.field8517.method2604((byte) -98);
            class532.method3154(0, true, 1);
        }
        class269.field3898 = arg1;
        class124.field1632 = arg2;
        class302.field4403 = arg4;
        class46.method365(arg3);
    }
}
