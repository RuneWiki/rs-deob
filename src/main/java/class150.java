import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class150 {

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "B")
    private byte field2671;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public int field2679;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Z")
    public static boolean field2669 = false;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Lke;")
    public static class256 field2680 = class316.method2202("Interfaces charg-Bes", 27626);

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field2682 = 3353893;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "F")
    public static float field2672;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "F")
    public static float field2678;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I", line = 5)
    public final int method1120(int arg0) {
        field2677++;
        if (arg0 != 7) {
            this.field2670 = 47;
        }
        return this.field2671 & 0x7;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 18)
    public static void method1121(int arg0) {
        field2680 = null;
        if (arg0 != -9) {
            field2672 = -0.37877277F;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)I", line = 39)
    public final int method1122(boolean arg0) {
        if (arg0) {
            field2676++;
            return (this.field2671 & 0x8) == 8 ? 1 : 0;
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I", line = 50)
    public static int method1123(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I[B)[B", line = 57)
    public static final byte[] method1124(int arg0, byte[] arg1) {
        field2681++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        if (arg0 != -9) {
            field2669 = true;
        }
        class299.method2092(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)I", line = 75)
    public static final int method1125(byte arg0, int arg1) {
        field2667++;
        int var2 = 84 % ((arg0 + 67) / 42);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V", line = 102)
    public static final void method1126(byte arg0) {
        class105.field1883.method2076(arg0 ^ 0xFFFFFFE9);
        if (arg0 != -78) {
            field2678 = 1.3310213F;
        }
        field2668++;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 119)
    public class150() {
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lra;)V", line = 127)
    public class150(class41 arg0) {
        this.field2671 = arg0.method323(9092);
        this.field2673 = arg0.method346(-16);
        this.field2670 = arg0.method327(4);
        this.field2675 = arg0.method327(4);
        this.field2679 = arg0.method327(4);
        this.field2674 = arg0.method327(4);
    }
}
