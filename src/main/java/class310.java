import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class310 {

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "B")
    private byte field4277;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public int field4279;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public int field4274;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public int field4275;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "[I")
    public static int[] field4280 = new int[6];

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Z")
    public static boolean field4281 = false;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lkda;")
    public static class328 field4271;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I")
    public final int method1891(int arg0) {
        field4276++;
        if (arg0 != 8) {
            field4271 = null;
        }
        return (this.field4277 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)I")
    public final int method1892(boolean arg0) {
        field4278++;
        if (arg0) {
            method1893(106);
        }
        return this.field4277 & 0x7;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class310() {
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public static final void method1893(int arg0) {
        class460.field6511.method3012((byte) 121);
        field4283++;
        class112.field1589.field2177 = 0;
        class632.field9278.field2177 = 0;
        class482.field6884 = null;
        class564.field8360 = null;
        class383.field5272 = null;
        int var1 = -89 / ((-arg0 - 60) / 48);
        class234.field3399 = null;
        class525.field7521 = 0;
        class554.field8256 = 0;
        class106.method784(-127);
        class125.field1764 = 0;
        class311.field4286 = 0;
        class455.field6428 = null;
        class499.field7078 = null;
        class304.field4180 = 0;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lgw;)V")
    public class310(class148 arg0) {
        this.field4277 = arg0.method1062(-21188);
        this.field4273 = arg0.method1045(true);
        this.field4279 = arg0.method1026(-917302120);
        this.field4272 = arg0.method1026(-917302120);
        this.field4274 = arg0.method1026(-917302120);
        this.field4275 = arg0.method1026(-917302120);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static void method1894(byte arg0) {
        field4271 = null;
        field4280 = null;
        if (arg0 != 108) {
            method1893(-57);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBI)I")
    public static final int method1895(int arg0, byte arg1, int arg2) {
        field4282++;
        if (arg0 == 4 || arg0 == 5) {
            return class46.field555[arg2 & 0x3];
        } else if (arg1 <= 124) {
            return -46;
        } else {
            return 256;
        }
    }
}
