import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class615 {

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
    public int field8263 = -1;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "Lhj;")
    public static class596 field8265 = new class596(43, -1);

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
    public static int field8270 = 0;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "Ltja;")
    public static class288 field8271 = new class288(64);

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
    public static int field8272 = -50;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public int field8258;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public int field8259;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public int field8260;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public int field8261;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
    public int field8264;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "I")
    public int field8266;

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
    public int field8267;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
    public int field8268;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "Ldc;")
    public static class5 field8269;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V", line = 4)
    public static void method3481(int arg0) {
        field8265 = null;
        field8271 = null;
        field8269 = null;
        if (arg0 != -1) {
            field8265 = null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 23)
    public static final int method3482(String arg0, int arg1) {
        if (arg1 == 1) {
            field8257++;
            return arg0.length() + 1;
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V", line = 34)
    public static final void method3483(byte arg0) {
        field8262++;
        if (arg0 != -51) {
            method3482(null, -71);
        }
        int var1 = class118.field1503.field10650.method1600(0);
        if (var1 == 0) {
            class267.field3162 = null;
            class3.method99(0, 126);
        } else if (var1 == 1) {
            class380.method2222((byte) 0, -9);
            class3.method99(512, 127);
            if (class124.field1585 != null) {
                class712.method4035(arg0 + 175);
            }
        } else {
            class380.method2222((byte) (class471.field6571 - 4 & 0xFF), -104);
            class3.method99(2, 127);
        }
        class33.field517 = class581.field7921;
    }
}
