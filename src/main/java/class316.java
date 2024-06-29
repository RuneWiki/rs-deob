import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class316 {

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Z")
    public boolean field4369;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field4373 = 0;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field4377 = 1338;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "F")
    public static float field4370;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Ltc;")
    public class353 field4368;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Ltc;")
    public class353 field4371;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Z")
    public static boolean field4366;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Z")
    public boolean field4374;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 7)
    public final void method2044(boolean arg0) {
        if (this.field4368 != null) {
            this.field4368.method878(23315);
        }
        field4375++;
        this.field4374 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 19)
    public static final void method2045(byte arg0) {
        class93.field1640 = (int) ((double) class376.field5325 * 34.46D);
        class607.field8333 = 200;
        field4376++;
        if (arg0 != -9) {
            return;
        }
        class93.field1640 <<= 0x2;
        if (class272.field3822.method247()) {
            class93.field1640 += 512;
        }
        class69.method683(1, false);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Z", line = 43)
    public final boolean method2046(byte arg0) {
        if (arg0 >= -4) {
            this.method2044(true);
        }
        field4378++;
        return this.field4374 && !this.field4369;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Z)V", line = 62)
    public class316(boolean arg0) {
        this.field4369 = arg0;
    }
}
