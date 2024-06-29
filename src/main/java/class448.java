import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class448 extends class198 {

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "[[[I")
    public static int[][][] field6179 = new int[2][][];

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Lmca;")
    public static class41 field6175 = new class41("runescape", 0);

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "Ljava/lang/String;")
    private String field6181;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static void method2649(int arg0) {
        if (arg0 == -1) {
            field6179 = null;
            field6175 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILlm;)V")
    public final void method858(int arg0, class50 arg1) {
        if (arg0 != 3) {
            method2650(59, -81, 41);
        }
        field6178++;
        arg1.field702 = this.field6181;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLol;)V")
    public final void method855(boolean arg0, class431 arg1) {
        field6180++;
        this.field6181 = arg1.method2532((byte) -128);
        if (!arg0) {
            this.method858(-62, null);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
    public static final void method2650(int arg0, int arg1, int arg2) {
        field6177++;
        int var3 = class675.field9477.method2748(class563.field7822.method3281(class423.field5892, -1), 8364);
        int var5;
        if (class791.field10833) {
            for (class551 var7 = (class551) class496.field6807.method249(18371); var7 != null; var7 = (class551) class496.field6807.method254((byte) -64)) {
                int var10;
                if (var7.field7643 == 1) {
                    var10 = class160.method1224(-11691, (class554) var7.field7645.field332.field6213);
                } else {
                    var10 = class585.method3437(var7, (byte) -69);
                }
                if (var3 < var10) {
                    var3 = var10;
                }
            }
            class72.field1137 = (class233.field3393 ? 26 : 22) + class81.field1197 * 16;
            var3 += 8;
            var5 = class81.field1197 * 16 + 21;
        } else {
            for (class554 var4 = (class554) class521.field7310.method3731((byte) -81); var4 != null; var4 = (class554) class521.field7310.method3729((byte) -127)) {
                int var6 = class160.method1224(-11691, var4);
                if (var3 < var6) {
                    var3 = var6;
                }
            }
            class72.field1137 = class624.field8863 * 16 + (class233.field3393 ? 26 : 22);
            var3 += 8;
            var5 = class624.field8863 * 16 + 21;
        }
        int var8 = arg2 - (var3 / 2);
        if ((var8 + var3) > class709.field9923) {
            var8 = class709.field9923 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (field6174 < arg1 + var5) {
            var9 = field6174 - var5;
        }
        if (arg0 != -11241) {
            field6174 = -57;
        }
        class295.field4297 = var8;
        if (var9 < 0) {
            var9 = 0;
        }
        class383.field5382 = true;
        class414.field5678 = var3;
        class389.field5438 = var9;
    }
}
