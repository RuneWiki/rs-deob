import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class360 extends class38 implements class511 {

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    private int field5342;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "[I")
    public static int[] field5339 = new int[6];

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "[I")
    public static int[] field5348 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Z")
    public static boolean field5338 = false;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Ltq;")
    public static class426 field5340 = new class426(13, 14);

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "Z")
    public static boolean field5350 = false;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    public static int field5351 = 0;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I", line = 10)
    public final int method2182(int arg0) {
        ++field5344;
        if (arg0 != -20232) {
            this.method2183(50);
        }
        return this.field5342;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lrl;ILjaggl/memory/NativeBuffer;IZ)V", line = 21)
    public class360(class487 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field5342 = arg1;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V", line = 31)
    public final void method296(int arg0) {
        ++field5349;
        if (arg0 != 1) {
            this.field5342 = 81;
        }
        super.field584.method2893((byte) 103, this);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)J", line = 44)
    public final long method2183(int arg0) {
        ++field5346;
        if (arg0 != 28914) {
            field5340 = null;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V", line = 56)
    public static final void method2184(int arg0) {
        ++field5347;
        class298.field4343.method791(((float) class118.field1533.field6913 * 0.1F + 0.7F) * 1.1523438F);
        class298.field4343.method799(class173.field2376, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        if (arg0 != 6) {
            method2184(89);
        }
        class298.field4343.method775(class420.field6205, -1, 256);
        class298.field4343.method783(class442.field6449);
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)V", line = 70)
    public static void method2185(int arg0) {
        field5339 = null;
        field5348 = null;
        if (arg0 != -60) {
            method2184(100);
        }
        field5340 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)I", line = 86)
    public final int method2186(byte arg0) {
        if (arg0 != 74) {
            field5350 = false;
        }
        ++field5343;
        return super.field579;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lrl;I[BIZ)V", line = 99)
    public class360(class487 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field5342 = arg1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[BZ)V", line = 107)
    public final void method2187(int arg0, int arg1, byte[] arg2, boolean arg3) {
        if (arg3) {
            this.method2182(40);
        }
        this.method299(arg2, arg0, 0);
        ++field5345;
        this.field5342 = arg1;
    }
}
