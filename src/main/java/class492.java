import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class492 {

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field6972 = -1;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Z")
    public static boolean field6969 = false;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field6970 = 1;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Laea;")
    public static class550 field6975;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Ljb;")
    public class719 field6971;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 16)
    public static void method2865(int arg0) {
        field6975 = null;
        int var1 = 37 / ((-arg0 - 15) / 44);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)Z", line = 26)
    public static final boolean method2866(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            field6974++;
            return ((arg2 & 0x2000) != 0 | class710.method3920(arg1, arg2, -1) | class545.method3094(arg2, arg1, 29946)) & class34.method312(arg2, arg1, 16080);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ld;ZLjava/awt/Canvas;II)Lha;", line = 41)
    public static final class454 method2867(class96 arg0, boolean arg1, Canvas arg2, int arg3, int arg4) {
        if (arg1) {
            field6977++;
            return new class50(arg2, arg0, arg4, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 56)
    public static final void method2868(int arg0) {
        int var1 = 101 % ((arg0 + 36) / 53);
        for (class303 var2 = (class303) class274.field3460.method3245(false); var2 != null; var2 = (class303) class274.field3460.method3252(12938)) {
            if (var2.field3894) {
                var2.field3894 = false;
            } else {
                class623.method3410(var2.field3899, -128);
            }
        }
        field6973++;
    }
}
