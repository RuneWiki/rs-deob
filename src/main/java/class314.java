import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class314 implements class126 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field4512 = 0;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[I")
    public static int[] field4515 = new int[200];

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[S")
    public static short[] field4516 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Llp;")
    public static class270 field4513 = new class270(9, 0, 4, 1);

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lcb;")
    public static class318 field4519 = new class318(98, -2);

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4521 = null;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field4520 = 0;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lpq;")
    public static class159 field4517;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Ljava/awt/Image;")
    public static Image field4518;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
    public static int[] field4522;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Ljv;")
    public final class606 method472(byte arg0) {
        field4514++;
        if (arg0 != -110) {
            this.field4511 = 29;
        }
        return class45.field601;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(I)V")
    public class314(int arg0) {
        this.field4511 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method2029(int arg0) {
        field4513 = null;
        field4518 = null;
        if (arg0 != 10187) {
            return;
        }
        field4516 = null;
        field4515 = null;
        field4517 = null;
        field4519 = null;
        field4522 = null;
        field4521 = null;
    }
}
