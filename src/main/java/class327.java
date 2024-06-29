import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class327 {

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public int field4739 = -1;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "Lvg;")
    public static class622 field4735 = new class622(4, 8);

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Llc;")
    public class653 field4738;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "Z")
    public static boolean field4736;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "[I")
    public int[] field4740;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field4741;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Z")
    public static final boolean method2019(int arg0, int arg1) {
        if (arg1 == -11) {
            field4737++;
            return arg0 == 3 || arg0 == 7 || arg0 == 10;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLjava/awt/Component;)Lnk;")
    public static final class430 method2020(byte arg0, Component arg1) {
        field4742++;
        int var2 = -63 / ((22 - arg0) / 50);
        return new class269(arg1);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public static void method2021(int arg0) {
        if (arg0 == -11) {
            field4735 = null;
        }
    }
}
