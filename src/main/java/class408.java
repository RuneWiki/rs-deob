import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class408 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field5646 = 0;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Z")
    public static boolean field5647 = false;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILiq;)V", line = 9)
    public static final void method2354(int arg0, class430 arg1) {
        if (arg0 != 0) {
            field5647 = false;
        }
        arg1.field6262 = null;
        field5645++;
        if (class457.field6679 < 20) {
            class138.field1983.method2310(arg1, -21801);
            class457.field6679++;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lss;I)V", line = 32)
    public static final void method2355(class295 arg0, int arg1) {
        field5648++;
        if (class267.field3664 == arg0.field3995) {
            if (class75.field1089.field2693 == null) {
                arg0.field4045 = 0;
                arg0.field3948 = 0;
            } else {
                arg0.field4074 = 150;
                arg0.field4017 = (int) (Math.sin((double) class393.field5484 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field3948 = class202.field2880;
                arg0.field3965 = 5;
                arg0.field4045 = class145.method932(class75.field1089.field2693, -102);
                arg0.field4060 = class75.field1089.field328;
                arg0.field4018 = 0;
                arg0.field4078 = class75.field1089.field280;
                arg0.field4070 = class75.field1089.field326;
            }
        } else if (arg1 < 18) {
            field5647 = true;
        }
    }
}
