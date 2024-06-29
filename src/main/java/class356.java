import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class356 extends class452 {

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "Ltm;")
    public static class334 field5388 = new class334(118, 10);

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field5394 = 0;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "F")
    public static float field5389;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "[B")
    private byte[] field5391;

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 8)
    public class356() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V", line = 11)
    public static void method2275(boolean arg0) {
        field5388 = null;
        if (!arg0) {
            field5394 = 42;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Z", line = 24)
    public static final boolean method2276(int arg0, byte arg1) {
        field5390++;
        if (arg1 != 54) {
            field5389 = -0.17689006F;
        }
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)[B", line = 36)
    public final byte[] method2277(int arg0, int arg1, int arg2, int arg3) {
        field5395++;
        this.field5391 = new byte[arg0 * arg3 * 2 * arg1];
        this.method470(arg3, arg1, true, arg0);
        return arg2 < 90 ? null : this.field5391;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IB)Z", line = 50)
    public static final boolean method2278(int arg0, byte arg1) {
        field5392++;
        if (arg1 < 48) {
            field5389 = 0.51164746F;
        }
        return arg0 == 7 || arg0 == 9;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI)V", line = 67)
    public final void method2006(int arg0, byte arg1, int arg2) {
        field5393++;
        byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        int var5 = arg2 * 2;
        if (arg0 != -26325) {
            method2275(true);
        }
        this.field5391[var5++] = var4;
        this.field5391[var5] = var4;
    }
}
