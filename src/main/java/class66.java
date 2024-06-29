import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class66 {

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "[I")
    public int[] field851;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "[I")
    public int[] field856;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "[F")
    public static float[] field853 = new float[4];

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
    public static int[] field852 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field858 = -1;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Lap;")
    public static class335 field857 = new class335("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "[Lmv;")
    public static class254[] field850;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 3)
    public static void method587(byte arg0) {
        field853 = null;
        field852 = null;
        if (arg0 != -85) {
            field857 = null;
        }
        field857 = null;
        field850 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V", line = 30)
    public class66(int arg0) {
        this.field855 = arg0;
        this.field851 = new int[this.field855];
        this.field856 = new int[this.field855];
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 45)
    public static final void method588(int arg0) {
        field854++;
        if (!class407.field5817.method580(class377.field4959, (byte) -35) && class415.field5926 != class276.field3488) {
            class400.method2371(10, false, class169.field2170, false, class75.field963);
            return;
        }
        class510.method3050(class33.field416, 6);
        if (class365.field4746 != class276.field3488) {
            class211.method1310(true);
        }
        if (arg0 != 10) {
            method588(-117);
        }
    }
}
