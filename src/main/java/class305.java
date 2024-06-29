import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class305 extends class452 {

    @OriginalMember(owner = "client!oba", name = "D", descriptor = "I")
    public static int field4640 = 0;

    @OriginalMember(owner = "client!oba", name = "A", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!oba", name = "B", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!oba", name = "C", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "[B")
    private byte[] field4636;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(IBI)Z", line = 4)
    public static final boolean method2005(int arg0, byte arg1, int arg2) {
        field4637++;
        int var3 = -42 % ((-arg1 - 67) / 32);
        return (arg2 & 0x800) != 0 | class505.method3056(arg0, (byte) -128, arg2) || class515.method3082(arg2, arg0, 86);
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V", line = 15)
    public class305() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IBI)V", line = 18)
    public final void method2006(int arg0, byte arg1, int arg2) {
        field4639++;
        byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        if (arg0 != -26325) {
            return;
        }
        int var5 = arg2 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field4636[var10001] = var4;
        this.field4636[var6] = var4;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIII)[B", line = 39)
    public final byte[] method2007(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 90) {
            method2005(-54, (byte) -6, 86);
        }
        field4638++;
        this.field4636 = new byte[arg0 * arg1 * arg3 * 2];
        this.method470(arg3, arg1, true, arg0);
        return this.field4636;
    }
}
