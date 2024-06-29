import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class239 extends class128 {

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "Lmk;")
    public class316 field3914;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "[I")
    public static int[] field3910 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field3912 = new String[100];

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "[I")
    public static int[] field3913 = new int[32];

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "Z")
    public static boolean field3915 = true;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)V", line = 7)
    public static final void method1683(int arg0, int arg1) {
        field3911++;
        if (arg0 != -20083) {
            method1683(-28, -120);
        }
        if (!class330.field5250) {
            arg1 = -1;
        }
        if (class99.field1608 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class92 var2 = class4.method23(arg1, (byte) -63);
            class309 var3 = var2.method799((byte) -52);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class85.field1369.method532(var3.field2969, var3.method1873(), new Point(var2.field1450, var2.field1453), var3.field2957, class42.field616, false);
                class99.field1608 = arg1;
            }
        }
        if (arg1 == -1 && class99.field1608 != -1) {
            class85.field1369.method532(-1, (int[]) null, new Point(), -1, class42.field616, false);
            class99.field1608 = -1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V", line = 52)
    public static void method1684(int arg0) {
        field3912 = null;
        field3910 = null;
        field3913 = null;
        if (arg0 != -1) {
            method1684(-24);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lmk;)V", line = 75)
    public class239(class316 arg0) {
        this.field3914 = arg0;
    }
}
