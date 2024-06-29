import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class492 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Z")
    public static boolean field6791 = false;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2754(int arg0) {
        field6793++;
        class192.method1277(-113);
        class247.method1527(class274.field3872.field879, -18905, 2, 22050);
        if (arg0 != 21486) {
            method2756(-23, (byte) -8);
        }
        class552.field7489 = class675.method3737(22050, class105.field1413, class503.field6878, 0, (byte) 123);
        class552.field7489.method2222((byte) 80, class140.field2049);
        class173.field2597 = class675.method3737(2048, class105.field1413, class503.field6878, 1, (byte) -102);
        class173.field2597.method2222((byte) 105, class135.field1907);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)Z", line = 25)
    public static final boolean method2755(int arg0) {
        field6795++;
        if (arg0 != 22050) {
            field6791 = true;
        }
        if (class340.field4947 < 1) {
            return false;
        } else {
            return class500.field6862 != class112.field1530 || class658.field9267 >= 2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "toString", descriptor = "()Ljava/lang/String;", line = 43)
    public final String toString() {
        field6792++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Lcc;", line = 53)
    public static final class670 method2756(int arg0, byte arg1) {
        int var2 = -93 / ((arg1 + 83) / 38);
        field6790++;
        class670[] var3 = class119.method855(15);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class670 var5 = var3[var4];
            if (var5.field9444 == arg0) {
                return var5;
            }
        }
        return null;
    }
}
