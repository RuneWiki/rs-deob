import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class494 extends class383 {

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lqn;I)I", line = 4)
    public static final int method2991(class47 arg0, int arg1) {
        field7178++;
        int var2 = 0;
        if (arg0.method486(false, class522.field7551)) {
            var2++;
        }
        if (arg0.method486(false, class375.field4915)) {
            var2++;
        }
        if (arg0.method486(false, class87.field1086)) {
            var2++;
        }
        if (arg0.method486(false, class384.field5059)) {
            var2++;
        }
        if (arg0.method486(false, class227.field2910)) {
            var2++;
        }
        if (arg0.method486(false, class161.field2056)) {
            var2++;
        }
        if (arg0.method486(false, class59.field764)) {
            var2++;
        }
        if (arg0.method486(false, class411.field5869)) {
            var2++;
        }
        if (arg0.method486(false, class266.field3357)) {
            var2++;
        }
        if (arg0.method486(false, class348.field4488)) {
            var2++;
        }
        if (arg0.method486(false, class402.field5729)) {
            var2++;
        }
        if (arg0.method486(false, class68.field886)) {
            var2++;
        }
        if (arg0.method486(false, class327.field4135)) {
            var2++;
        }
        if (arg0.method486(false, class177.field2346)) {
            var2++;
        }
        if (arg0.method486(false, class354.field4545)) {
            var2++;
        }
        if (arg1 <= 31) {
            return -33;
        } else {
            if (arg0.method486(false, class80.field1027)) {
                var2++;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILjava/lang/String;)V", line = 76)
    public static final void method2992(byte arg0, int arg1, String arg2) {
        field7180++;
        class153 var3 = class75.method656(2, 255, arg1);
        if (arg0 > 4) {
            var3.method1003((byte) 110);
            var3.field1932 = arg2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 92)
    public static final void method2993(byte arg0) {
        field7181++;
        if (arg0 == -25) {
            class303.field3890.method348(class378.field4975, class379.field4988, class274.field3443);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZB)V", line = 110)
    public static final void method2994(boolean arg0, byte arg1) {
        field7179++;
        class139.method946(-26);
        if (!class480.method2931(class483.field7059, (byte) -84)) {
            return;
        }
        class2.field17++;
        int var2 = -127 / ((72 - arg1) / 39);
        if (class2.field17 < 50 && !arg0) {
            return;
        }
        class2.field17 = 0;
        if (!class178.field2348 && class64.field835 != null) {
            class386.field5074++;
            class282.method1669(class520.field7510, false);
            try {
                class64.field835.method2475(0, (byte) 118, class40.field511.field6631, class40.field511.field6618);
                class40.field511.field6631 = 0;
            } catch (IOException var3) {
                class178.field2348 = true;
            }
        }
        class139.method946(-101);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)J")
    public abstract long method2153(int arg0);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)I")
    public abstract int method2155(byte arg0);

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)I")
    public abstract int method2151(int arg0);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)I")
    public abstract int method2152(boolean arg0);
}
