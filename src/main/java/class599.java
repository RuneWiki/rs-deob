import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class599 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public int field8381;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Ljava/util/Random;")
    public static Random field8385 = new Random();

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field8386 = 1;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!ul", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8383++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public static final void method3401(byte arg0) {
        field8384++;
        class43 var1 = class220.field3227;
        synchronized (class220.field3227) {
            class220.field3227.method273(4);
        }
        class43 var2 = class23.field479;
        synchronized (class23.field479) {
            int var3 = 16 / ((arg0 - 6) / 46);
            class23.field479.method273(127);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method3402(int arg0) {
        field8385 = null;
        if (arg0 != -26493) {
            field8386 = 99;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)[I")
    public static final int[] method3403(int arg0) {
        if (arg0 == 1) {
            field8382++;
            return new int[] { class181.field2834, class673.field9341, class684.field9515 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V")
    public class599(int arg0) {
        this.field8381 = arg0;
    }
}
