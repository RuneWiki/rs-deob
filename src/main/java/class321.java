import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class321 extends class381 {

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Z")
    public static boolean field4680 = false;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Z")
    public static boolean field4677 = false;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Liba;")
    public static class211 field4676 = new class211(70, 3);

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "F")
    public static float field4672;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "J")
    public long field4679;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Lmk;")
    public class321 field4673;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Lmk;")
    public class321 field4674;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "Lmq;")
    public static class71 field4681;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lr;I)V", line = 4)
    public static final void method1988(class98 arg0, int arg1) {
        if (arg1 != 21151) {
            field4677 = true;
        }
        for (class16 var2 = (class16) class165.field2320.method2370(-26173); var2 != null; var2 = (class16) class165.field2320.method2369((byte) 122)) {
            if (var2.field347) {
                var2.method122(arg0);
            }
        }
        field4675++;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V", line = 26)
    public final void method1989(byte arg0) {
        field4670++;
        if (this.field4673 == null) {
            return;
        }
        this.field4673.field4674 = this.field4674;
        this.field4674.field4673 = this.field4673;
        this.field4674 = null;
        this.field4673 = null;
        if (arg0 <= 32) {
            field4680 = true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 45)
    public static void method1990(int arg0) {
        field4676 = null;
        if (arg0 != -1) {
            field4677 = true;
        }
        field4681 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 59)
    public static final void method1991(int arg0) {
        class170.field2401.method711(((float) class335.field4872.field9501 * 0.1F + 0.7F) * 1.1523438F);
        field4671++;
        class170.field2401.method607(class20.field384, 0.69921875F, 1.2F, -200.0F, -240.0F, (float) arg0);
        class170.field2401.method718(class440.field6398, -1, 0);
        class170.field2401.method611(class329.field4779);
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)Z", line = 88)
    public final boolean method1992(int arg0) {
        field4678++;
        if (arg0 == -9513) {
            return this.field4673 != null;
        } else {
            return false;
        }
    }
}
