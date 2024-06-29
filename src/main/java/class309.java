import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class309 {

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "[I")
    public static int[] field4089 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "[I")
    public static int[] field4091 = new int[14];

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
    public static final void method1816(int arg0) {
        class259.method1581();
        field4087++;
        if (arg0 < 58) {
            field4089 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(FIFF)I")
    public static final int method1817(float arg0, int arg1, float arg2, float arg3) {
        field4090++;
        if (arg1 > -27) {
            method1818(-92, 65, 78);
        }
        float var4 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var5 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var6 = arg3 < 0.0F ? -arg3 : arg3;
        if (var5 > var4 && var6 < var5) {
            return (arg0 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg3 > 0.0F ? 2 : 3;
        } else if (arg2 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)Z")
    public static final boolean method1818(int arg0, int arg1, int arg2) {
        if (arg1 != -25365) {
            method1816(56);
        }
        field4088++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
    public static void method1819(int arg0) {
        if (arg0 != 128) {
            field4086 = -112;
        }
        field4089 = null;
        field4091 = null;
    }
}
