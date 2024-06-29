import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class602 extends class148 {

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "[I")
    public static int[] field8391 = new int[4];

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "F")
    public static float field8396 = 1.0F;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "[B")
    private byte[] field8390;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method3387(boolean arg0, int arg1, Object arg2) {
        if (arg1 > -119) {
            return null;
        }
        field8395++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class611.method3425(var3, 0) : var3;
        } else if (arg2 instanceof class59) {
            class59 var4 = (class59) arg2;
            return var4.method490(9);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lba;B)V")
    public static final void method3388(class352 arg0, byte arg1) {
        if (arg1 != 28) {
            return;
        }
        field8392++;
        class118.field1592.method1441(arg0, 0);
        arg0.field4681 = arg0.field4686.field6892;
        arg0.field4686.field6892 = 0;
        class412.field5847 += arg0.field4681;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class602() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BII)V")
    public final void method1081(byte arg0, int arg1, int arg2) {
        field8394++;
        byte var4 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var5 = arg2 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field8390[var10001] = var4;
        if (arg1 != -12027) {
            method3392((byte) -124);
        }
        this.field8390[var6] = var4;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V")
    public static void method3389(byte arg0) {
        if (arg0 == 69) {
            field8391 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(BII)I")
    public static final int method3390(byte arg0, int arg1, int arg2) {
        field8398++;
        if (arg0 >= -2) {
            field8396 = 1.3775223F;
        }
        int var3 = arg1 - 1 & arg2 >> 31;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3391(int arg0, int arg1, int arg2, int arg3) {
        this.field8390 = new byte[arg2 * arg3 * 2 * arg0];
        field8397++;
        if (arg1 == 63) {
            this.method1792(arg2, (byte) -124, arg3, arg0);
            return this.field8390;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)[Loh;")
    public static final class370[] method3392(byte arg0) {
        field8393++;
        return arg0 <= 104 ? null : new class370[] { class417.field5884, class543.field7377, class373.field5025, class643.field8874, class364.field4801, class444.field6144, class129.field1846, class198.field2803, client.field3715, class659.field9161 };
    }
}
