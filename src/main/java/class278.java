import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class278 {

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "[I")
    public static int[] field3936 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field3935 = 2;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "F")
    public static float field3938;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)Z")
    public static final boolean method1728(byte arg0) {
        field3937++;
        if (arg0 != 22) {
            return false;
        }
        if (class318.field4389) {
            try {
                class157.method1180((byte) 126, class492.field7063, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lek;I)V")
    public static final void method1729(class465 arg0, int arg1) {
        field3939++;
        if ((arg0.field6719.length - arg0.field6710) < 1) {
            return;
        }
        int var2 = arg0.method2705(-85);
        if (var2 < 0 || var2 > 1 || (arg0.field6719.length - arg0.field6710) < 2) {
            return;
        }
        int var3 = arg0.method2755((byte) -89);
        if (arg1 >= -88) {
            field3935 = -119;
        }
        if (var3 * 6 > arg0.field6719.length - arg0.field6710) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2755((byte) -75);
            int var6 = arg0.method2691((byte) -67);
            if (class384.field5620.length > var5 && class331.field4580[var5] && (class678.field9650.method1670(-59, var5).field8615 != '1' || var6 >= -1 && var6 <= 1)) {
                class384.field5620[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V")
    public static void method1730(boolean arg0) {
        field3936 = null;
        if (arg0) {
            method1728((byte) -99);
        }
    }
}
