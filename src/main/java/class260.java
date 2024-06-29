import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class260 implements class409 {

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field3627 = 50;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3623 = new String[field3627];

    @OriginalMember(owner = "client!no", name = "e", descriptor = "[I")
    public static int[] field3625 = new int[field3627];

    @OriginalMember(owner = "client!no", name = "d", descriptor = "[I")
    public static int[] field3624 = new int[field3627];

    @OriginalMember(owner = "client!no", name = "j", descriptor = "[I")
    public static int[] field3630 = new int[field3627];

    @OriginalMember(owner = "client!no", name = "b", descriptor = "[I")
    public static int[] field3622 = new int[field3627];

    @OriginalMember(owner = "client!no", name = "k", descriptor = "[I")
    public static int[] field3631 = new int[field3627];

    @OriginalMember(owner = "client!no", name = "f", descriptor = "[I")
    public static int[] field3626 = new int[field3627];

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "Laj;")
    public static class300 field3621;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field3628;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V", line = 13)
    public static void method1682(boolean arg0) {
        field3623 = null;
        field3624 = null;
        field3628 = null;
        field3622 = null;
        field3621 = null;
        field3630 = null;
        field3626 = null;
        if (arg0) {
            field3626 = null;
        }
        field3631 = null;
        field3625 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([IIJLwi;)Ljava/lang/String;", line = 45)
    public final String method1683(int[] arg0, int arg1, long arg2, class340 arg3) {
        if (arg1 > -34) {
            return null;
        }
        field3629++;
        if (class170.field2469 == arg3) {
            class488 var6 = class96.field1401.method1295(arg0[0], false);
            return var6.method2907((int) arg2, (byte) 47);
        } else if (class10.field165 == arg3 || class405.field6117 == arg3) {
            class61 var7 = class84.field1154.method2451(-1, (int) arg2);
            return var7.field827;
        } else if (class278.field3847 == arg3 || class429.field6373 == arg3 || class472.field6897 == arg3) {
            return class96.field1401.method1295(arg0[0], false).method2907((int) arg2, (byte) 50);
        } else {
            return null;
        }
    }
}
