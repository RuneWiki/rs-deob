import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class148 {

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    private int field2050;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!qk", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field2049++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII)Lrea;", line = 16)
    public static final class120 method953(int arg0, int arg1, int arg2, int arg3) {
        field2052++;
        class120 var4 = null;
        if (arg0 == arg2) {
            class332.field4257++;
            var4 = class292.method1716(class608.field8668, true, class193.field2798);
        }
        if (arg0 == 1) {
            var4 = class292.method1716(class608.field8668, true, class97.field1407);
            class485.field6552++;
        }
        var4.field1653.method154(false, class179.field2535 + arg1);
        var4.field1653.method175(class510.field7109 + arg3, arg2 ^ 0xFFFFBDF8);
        var4.field1653.method162((byte) -117, class196.field2837.method315(-76, 82) ? 1 : 0);
        class93.field1329 = arg3;
        class557.field7912 = false;
        class729.field10226 = arg1;
        class463.method2767(122);
        return var4;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 49)
    public static final void method954(int arg0) {
        field2048++;
        if (class96.field1401.method2140()) {
            class96.field1401.method2211(class438.field6016);
            class18.method93(-21347);
            if (class264.field3595) {
                class379.method2317(2, class438.field6016);
            } else {
                Dimension var1 = class438.field6016.getSize();
                class96.field1401.method2137(class438.field6016, var1.width, var1.height);
            }
            class96.field1401.method2095(class438.field6016);
        } else {
            class736.method4088((byte) 122, false, class674.field9500.field5158.method1006(0));
        }
        if (arg0 >= -57) {
            field2046 = -99;
        }
        class330.method1918(7);
        class380.field5357 = true;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(II)V", line = 82)
    public class148(int arg0, int arg1) {
        this.field2047 = arg1;
        this.field2050 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIILwp;)V", line = 92)
    public static final void method955(int arg0, int arg1, int arg2, int arg3, class527 arg4) {
        class38 var5 = class617.method3623(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field9490 = (arg1 << class509.field7106) + class457.field6297;
        arg4.field9502 = arg3;
        arg4.field9489 = (arg2 << class509.field7106) + class457.field6297;
        var5.field537 = arg4;
        int var6 = class52.field741 == class435.field5969 ? 1 : 0;
        if (arg4.method277(3)) {
            if (arg4.method283((byte) -36)) {
                class160.field2206[var6][class352.field4548[var6]++] = arg4;
                return;
            }
            class261.field3566[var6][class269.field3635[var6]++] = arg4;
            class380.field5357 = true;
            return;
        }
        class140.field1931[var6][class609.field8671[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I", line = 119)
    public final int method956(byte arg0) {
        field2051++;
        if (arg0 != 27) {
            field2046 = 104;
        }
        return this.field2050;
    }
}
