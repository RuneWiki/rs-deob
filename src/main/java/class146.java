import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Z")
    public static boolean field3192 = false;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[Lpe;")
    public static class109[] field3193 = new class109[100];

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Z")
    public static boolean field3194 = false;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3195 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Z")
    public static final boolean method1143(int arg0) {
        field3191++;
        return class55.field1118 == arg0 ? class156.field3606.method476(91) : true;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static void method1144(int arg0) {
        if (arg0 == 0) {
            field3193 = null;
        }
    }
}
