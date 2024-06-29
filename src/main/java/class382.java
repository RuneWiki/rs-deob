import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class382 extends class303 {

    @OriginalMember(owner = "client!el", name = "Jb", descriptor = "F")
    public static float field5684 = 1024.0F;

    @OriginalMember(owner = "client!el", name = "Kb", descriptor = "I")
    public static int field5685 = 0;

    @OriginalMember(owner = "client!el", name = "Nb", descriptor = "Ljava/lang/String;")
    public static String field5688 = null;

    @OriginalMember(owner = "client!el", name = "Pb", descriptor = "[I")
    public static int[] field5690 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!el", name = "Hb", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!el", name = "Ib", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!el", name = "Lb", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!el", name = "Mb", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!el", name = "Ob", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "(I)V", line = 3)
    public static final void method2418(int arg0) {
        ++field5689;
        if (class394.field5821.method513()) {
            class394.field5821.method466(class31.field503);
            class114.method840((byte) -55);
            class394.field5821.method500(class31.field503);
            class394.field5821.method523(class31.field503);
        } else {
            class470.method2803(class399.field5865, (byte) 78);
        }
        if (arg0 != 65535) {
            field5690 = null;
        }
        class67.method582(-25099);
    }

    @OriginalMember(owner = "client!el", name = "s", descriptor = "(B)V", line = 31)
    public static void method2419(byte arg0) {
        field5688 = null;
        if (arg0 < 98) {
            field5688 = null;
        }
        field5690 = null;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(I)V", line = 50)
    public class382(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(FB)V", line = 55)
    public final void method2420(float arg0, byte arg1) {
        ++field5687;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field4326[super.field4333++] = (byte) var3;
        super.field4326[super.field4333++] = (byte) (var3 >> 8);
        super.field4326[super.field4333++] = (byte) (var3 >> 16);
        super.field4326[super.field4333++] = (byte) (var3 >> 24);
        if (arg1 != 4) {
            field5688 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IF)V", line = 71)
    public final void method2421(int arg0, float arg1) {
        ++field5682;
        if (arg0 == 25785) {
            int var3 = NativeStream.floatToRawIntBits(arg1);
            super.field4326[super.field4333++] = (byte) (var3 >> 24);
            super.field4326[super.field4333++] = (byte) (var3 >> 16);
            super.field4326[super.field4333++] = (byte) (var3 >> 8);
            super.field4326[super.field4333++] = (byte) var3;
        }
    }
}
