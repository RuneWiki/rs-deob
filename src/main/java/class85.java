import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class85 extends class243 {

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    private int field1173 = 4096;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    private int field1172 = 0;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "Lvg;")
    public static class54 field1174 = new class54(0);

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "[Lab;")
    public static class669[] field1176;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field1173 = arg1.method3402((byte) 127);
            }
        } else {
            this.field1172 = arg1.method3402((byte) 127);
        }
        ++field1175;
        if (arg2 >= -92) {
            this.method5(-115, -128);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field1171;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int[] var4 = this.method1462(arg1, 0, 0);
            for (int var5 = 0; var5 < class687.field9628; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field1172 && var6 <= this.field1173 ? 4096 : 0;
            }
        }
        if (arg0 != 255) {
            field1174 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
    public static void method621(int arg0) {
        field1176 = null;
        field1174 = null;
        if (arg0 != 10640) {
            field1176 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class85() {
        super(1, true);
    }
}
