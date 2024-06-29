import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class366 extends class306 {

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "[I")
    public static int[] field5134 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Luf;")
    public static class310 field5136;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "[J")
    public static long[] field5138;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "[I")
    public static int[] field5139;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "Z")
    public static boolean field5141;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "[B")
    private byte[] field5133;

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class366() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)V")
    public static void method2117(int arg0) {
        field5134 = null;
        if (arg0 >= -103) {
            method2119(111, 17);
        }
        field5136 = null;
        field5139 = null;
        field5138 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BBI)V")
    public final void method1737(byte arg0, byte arg1, int arg2) {
        field5132++;
        int var4 = arg2 * 2;
        byte var5 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5133[var10001] = var5;
        this.field5133[var6] = var5;
        if (arg0 != 80) {
            field5136 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)[B")
    public final byte[] method2118(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -501) {
            field5141 = true;
        }
        field5137++;
        this.field5133 = new byte[arg1 * arg2 * arg3 * 2];
        this.method1674(arg1, (byte) 51, arg2, arg3);
        return this.field5133;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)I")
    public static final int method2119(int arg0, int arg1) {
        return class453.field6629 == null ? 0 : class453.field6629[arg0][arg1] & 0xFFFFFF;
    }

    static {
        new class83(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field5136 = new class310(100, 14);
        field5138 = new long[32];
        field5139 = new int[1];
        field5140 = 0;
        field5141 = false;
    }
}
