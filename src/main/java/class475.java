import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class475 {

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "[I")
    public static int[] field6774 = new int[8];

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field6775 = 0;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "Z")
    public static boolean field6773;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
    public static void method2856(boolean arg0) {
        field6774 = null;
        if (!arg0) {
            method2856(true);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lig;I)Llk;")
    public static final class585 method2857(class244 arg0, int arg1) {
        field6776++;
        if (arg1 != 8) {
            return null;
        }
        int var2 = arg0.method1476(76);
        class388 var3 = class141.method888((byte) 102)[arg0.method1423(-13)];
        class219 var4 = class38.method181(119)[arg0.method1423(-104)];
        int var5 = arg0.method1466((byte) 31);
        int var6 = arg0.method1466((byte) 31);
        return new class585(var2, var3, var4, var5, var6);
    }
}
