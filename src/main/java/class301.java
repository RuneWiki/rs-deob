import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class301 extends class358 {

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "I")
    public static int field4118 = 0;

    @OriginalMember(owner = "client!oq", name = "H", descriptor = "F")
    public static float field4121 = 0.0F;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!oq", name = "G", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!oq", name = "F", descriptor = "[B")
    private byte[] field4119;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBB)V")
    public final void method1916(int arg0, byte arg1, byte arg2) {
        field4117++;
        byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        int var5 = arg0 * 2;
        if (arg2 < 42) {
            field4118 = -58;
        }
        this.field4119[var5++] = var4;
        this.field4119[var5] = var4;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
    public class301() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII)[B")
    public final byte[] method1917(int arg0, int arg1, int arg2, int arg3) {
        field4120++;
        this.field4119 = new byte[arg0 * arg3 * arg2 * 2];
        this.method2367(arg3, arg0, true, arg2);
        int var5 = -78 % ((arg1 - 35) / 57);
        return this.field4119;
    }
}
