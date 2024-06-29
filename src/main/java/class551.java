import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public abstract class class551 extends class623 {

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "Z")
    public volatile boolean field7751 = true;

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
    public static int field7754 = 0;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "Lmq;")
    public static class78 field7747 = new class78(90, 10);

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "J")
    public static long field7749;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "Z")
    public boolean field7746;

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "Z")
    public boolean field7750;

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "[I")
    public static int[] field7752;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V", line = 5)
    public static final void method3136(byte arg0) {
        class721.field10157.method776((byte) -77);
        if (arg0 != 86) {
            field7754 = 28;
        }
        field7748++;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V", line = 18)
    public static void method3137(int arg0) {
        field7752 = null;
        if (arg0 >= -48) {
            field7749 = -36L;
        }
        field7747 = null;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(II)I", line = 33)
    public static final int method3139(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
        field7753++;
        if (arg1 > -57) {
            method3139(24, 120);
        }
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)[B")
    public abstract byte[] method3138(int arg0);

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(B)I")
    public abstract int method3140(byte arg0);
}
