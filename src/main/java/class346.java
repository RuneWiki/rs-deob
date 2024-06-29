import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class346 extends class333 {

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "J")
    public long field4649;

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "[I")
    public static int[] field4648 = new int[500];

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V")
    public static void method2062(byte arg0) {
        field4648 = null;
        if (arg0 != -92) {
            method2062((byte) 31);
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "()V")
    public class346() {
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(J)V")
    public class346(long arg0) {
        this.field4649 = arg0;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(II)V")
    public static final void method2063(int arg0, int arg1) {
        field4647++;
        if (!class255.method1506(arg1, (byte) 113)) {
            return;
        }
        if (arg0 != 24329) {
            field4648 = null;
        }
        class452[] var2 = class102.field1106[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class452 var4 = var2[var3];
            if (var4 != null) {
                var4.field6341 = 0;
                var4.field6470 = 1;
                var4.field6433 = 0;
            }
        }
    }
}
