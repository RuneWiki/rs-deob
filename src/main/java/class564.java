import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class564 extends class362 {

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "Lmu;")
    public static class303 field7786 = new class303(62, 4);

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public static int field7787 = 1406;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public int field7781;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public int field7784;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "Lej;")
    public class124 field7780;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "Lua;")
    public class665 field7778;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public static void method3270(int arg0) {
        int var1 = -14 / ((73 - arg0) / 51);
        field7786 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lha;BJ)V")
    public static final void method3271(class59 arg0, byte arg1, long arg2) {
        class514.field7142 = 0;
        class302.field4204 = class464.field6515;
        class424.field6119 = 0;
        field7782++;
        class464.field6515 = 0;
        long var4 = class554.method3190(-53);
        class385 var6 = (class385) class286.field3996.method1301(8);
        if (arg1 <= 40) {
            return;
        }
        while (var6 != null) {
            if (var6.method2429(arg0, arg2)) {
                class424.field6119++;
            }
            var6 = (class385) class286.field3996.method1307((byte) -64);
        }
        if (class30.field782 && (arg2 % 100L) == 0L) {
            System.out.println("Particle system count: " + class286.field3996.method1303(0) + ", running: " + class424.field6119);
            System.out.println("Emitters: " + class514.field7142 + " Particles: " + class464.field6515 + ". Time taken: " + (class554.method3190(-112) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3272(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field7783++;
            return ((arg0 & 0x2000) != 0 | class444.method2671(arg1, arg0, -118) | class315.method2042(arg0, arg1, (byte) 94)) & class301.method1959((byte) 105, arg1, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
    public final void method3273(byte arg0) {
        field7779++;
        if (class530.field7315.length > class644.field8869 && arg0 == -45) {
            class530.field7315[class644.field8869++] = this;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public static final void method3274(int arg0) {
        if (arg0 != 1406) {
            return;
        }
        if (class272.field3822.method272()) {
            class272.field3822.method245(class458.field6458);
            class751.method4201(-1);
            if (class241.field3529) {
                class37.method474((byte) -99, class458.field6458);
            } else {
                Dimension var1 = class458.field6458.getSize();
                class272.field3822.method259(class458.field6458, var1.width, var1.height);
            }
            class272.field3822.method341(class458.field6458);
        } else {
            class171.method1284(false, (byte) 100, class693.field9368.field4468.method1099(-32350));
        }
        field7785++;
        class299.method1955(arg0 - 1347);
        class30.field778 = true;
    }
}
