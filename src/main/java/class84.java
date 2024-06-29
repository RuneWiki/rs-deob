import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class84 extends class583 {

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "Lrn;")
    public static class633 field1195 = new class633(40, -1);

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "Lbt;")
    public static class437 field1196 = new class437(12, 19);

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[B")
    private byte[] field1192;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)V", line = 7)
    public final void method529(int arg0, byte arg1, int arg2) {
        field1193++;
        int var4 = arg0 * 2;
        int var5 = arg1 & 0xFF;
        int var6 = -103 / ((arg2 - 54) / 63);
        int var10001 = var4;
        int var7 = var4 + 1;
        this.field1192[var10001] = (byte) (var5 * 3 >> 5);
        this.field1192[var7] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)[B", line = 23)
    public final byte[] method530(int arg0, int arg1, int arg2, int arg3) {
        this.field1192 = new byte[arg0 * arg3 * arg1 * 2];
        field1194++;
        if (arg2 != 23483) {
            field1195 = null;
        }
        this.method2291(arg0, arg1, false, arg3);
        return this.field1192;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 36)
    public class84() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V", line = 40)
    public static void method531(byte arg0) {
        field1196 = null;
        if (arg0 > -14) {
            method531((byte) 127);
        }
        field1195 = null;
    }
}
