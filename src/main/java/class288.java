import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class288 implements Runnable {

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Z")
    public boolean field4949 = true;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field4947 = new Object();

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "[I")
    public int[] field4958 = new int[500];

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public int field4957 = 0;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[I")
    public int[] field4959 = new int[500];

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lwa;")
    public static class75 field4950 = class66.method560("(U4", false);

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Lwa;")
    public static class75 field4951 = class66.method560("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", false);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "[I")
    public static int[] field4948 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Lwa;")
    public static class75 field4953 = class66.method560("Freie Welt", false);

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field4956 = 100;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Lwa;")
    public static class75 field4955 = class66.method560(" steht bereits auf Ihrer Freunde)2Liste(Q", false);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "F")
    public static float field4946;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "[I")
    public static int[] field4952;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 12)
    public static void method2022(int arg0) {
        field4950 = null;
        field4948 = null;
        field4953 = null;
        field4951 = null;
        field4952 = null;
        field4955 = null;
        if (arg0 != -19345) {
            method2022(-16);
        }
    }

    @OriginalMember(owner = "client!hk", name = "run", descriptor = "()V", line = 30)
    public final void run() {
        while (this.field4949) {
            Object var1 = this.field4947;
            synchronized (this.field4947) {
                if (this.field4957 < 500) {
                    this.field4958[this.field4957] = class66.field1135;
                    this.field4959[this.field4957] = class26.field351;
                    this.field4957++;
                }
            }
            class235.method1708(81, 50L);
        }
        field4954++;
    }
}
