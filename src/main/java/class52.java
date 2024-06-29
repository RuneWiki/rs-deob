import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class52 implements class68 {

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field731 = 255;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field730 = 0;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 5)
    public static final void method434(int arg0) {
        class333.field4591.method1188(arg0 ^ 0x73);
        field732++;
        int var1 = class333.field4591.method1186((byte) -97, arg0);
        if (var1 == 0) {
            return;
        }
        int var2 = class333.field4591.method1186((byte) -97, 2);
        if (var2 == 0) {
            class314.field4301[class438.field6171++] = 2047;
        } else if (var2 == 1) {
            int var3 = class333.field4591.method1186((byte) -97, 3);
            class412.field5841.method932(1, var3, (byte) 77);
            int var4 = class333.field4591.method1186((byte) -97, 1);
            if (var4 == 1) {
                class314.field4301[class438.field6171++] = 2047;
            }
        } else if (var2 == 2) {
            if (class333.field4591.method1186((byte) -97, 1) == 1) {
                int var5 = class333.field4591.method1186((byte) -97, 3);
                class412.field5841.method932(2, var5, (byte) 102);
                int var6 = class333.field4591.method1186((byte) -97, 3);
                class412.field5841.method932(2, var6, (byte) 104);
            } else {
                int var7 = class333.field4591.method1186((byte) -97, 3);
                class412.field5841.method932(0, var7, (byte) 79);
            }
            int var8 = class333.field4591.method1186((byte) -97, 1);
            if (var8 == 1) {
                class314.field4301[class438.field6171++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class333.field4591.method1186((byte) -97, 7);
            int var10 = class333.field4591.method1186((byte) -97, 7);
            int var11 = class333.field4591.method1186((byte) -97, 1);
            if (var11 == 1) {
                class314.field4301[class438.field6171++] = 2047;
            }
            class142.field2034 = class333.field4591.method1186((byte) -97, 2);
            int var12 = class333.field4591.method1186((byte) -97, 1);
            class412.field5841.method930(var10, var12 == 1, var9, -105, class142.field2034);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(J[III)Ljava/lang/String;", line = 92)
    public final String method435(long arg0, int[] arg1, int arg2, int arg3) {
        field729++;
        if (arg3 == 0) {
            class124 var6 = class277.method1808((byte) 59, arg1[0]);
            return var6.method839((int) arg0, (byte) -22);
        } else if (arg3 == 1 || arg3 == 10) {
            class360 var7 = class51.method433((byte) 87, (int) arg0);
            return var7.field4938;
        } else if (arg2 == arg3 || arg3 == 7 || arg3 == 11) {
            return class277.method1808((byte) 90, arg1[0]).method839((int) arg0, (byte) -62);
        } else {
            return null;
        }
    }
}
