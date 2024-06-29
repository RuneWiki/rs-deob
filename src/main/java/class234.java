import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class234 {

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "[I")
    public static int[] field3391 = new int[5];

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3392 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "Lat;")
    public static class378 field3393 = null;

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(FZFF)I")
    public static final int method1631(float arg0, boolean arg1, float arg2, float arg3) {
        field3394++;
        float var4 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var5 = arg0 < 0.0F ? -arg0 : arg0;
        if (arg1) {
            method1633(-85);
        }
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (var4 < var5 && var5 > var6) {
            return arg0 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg2 > 0.0F ? 2 : 3;
        } else if ((arg3 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
    public static final void method1632(int arg0) {
        int var1 = -114 % ((arg0 - 22) / 33);
        field3400++;
        class431.field6169.method1466(0);
        class704.field9498.method2342(2110355138);
        class376.field5331.method2342(2110355138);
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V")
    public static void method1633(int arg0) {
        field3392 = null;
        field3393 = null;
        if (arg0 != 0) {
            field3393 = null;
        }
        field3391 = null;
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)V")
    public static final void method1634(int arg0) {
        class112 var1 = class477.field6656;
        synchronized (class477.field6656) {
            class477.field6656.method996(-98);
        }
        field3399++;
        class112 var2 = class491.field6800;
        synchronized (class491.field6800) {
            class491.field6800.method996(arg0 + 4530);
        }
        if (arg0 != -4631) {
            field3398 = 37;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(B[SI)[S")
    public static final short[] method1635(byte arg0, short[] arg1, int arg2) {
        int var3 = 77 / ((arg0 + 32) / 47);
        field3395++;
        short[] var4 = new short[arg2];
        class363.method2318(arg1, 0, var4, 0, arg2);
        return var4;
    }
}
