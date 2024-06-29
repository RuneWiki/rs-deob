import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class85 extends class96 {

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
    public int field1164 = 0;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "Liu;")
    public static class390 field1167 = new class390(81, 28);

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!vr", name = "I", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "[I")
    public static int[] field1165;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Z")
    public static final boolean method532(int arg0, int arg1) {
        if (arg0 != 10607) {
            field1167 = null;
        }
        field1163++;
        return arg1 == 2 || arg1 == 3;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lae;B)V")
    public final void method533(class156 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method941((byte) 127);
            if (var3 == 0) {
                if (arg1 > -3) {
                    this.method533(null, (byte) -53);
                }
                field1168++;
                return;
            }
            this.method534(54, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILae;I)V")
    private final void method534(int arg0, class156 arg1, int arg2) {
        if (arg2 == 2) {
            this.field1164 = arg1.method993((byte) -78);
        }
        int var4 = -27 % ((arg0 + 75) / 46);
        field1162++;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public static void method535(int arg0) {
        field1167 = null;
        int var1 = -81 % ((arg0 + 19) / 60);
        field1165 = null;
    }
}
