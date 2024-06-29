import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class556 {

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "F")
    public static float field7728;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "Laga;")
    public static class661 field7732;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Law;")
    public static class672 field7727;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)Z")
    public static final boolean method3060(int arg0, int arg1) {
        field7731++;
        if (arg0 == 22 || arg0 == 47 || arg0 == 18 || arg0 == 51 || arg0 == 1009) {
            return true;
        } else if (arg0 == 19 || arg0 == 1008) {
            return true;
        } else {
            return arg1 != 21922;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZIII)Lpl;")
    public static final class612 method3061(boolean arg0, int arg1, int arg2, int arg3) {
        field7730++;
        if (arg2 != 1000000) {
            field7728 = -1.0759982F;
        }
        class676 var4 = null;
        if (class232.field2896 != null) {
            var4 = new class676(arg3, class232.field2896, class419.field5272[arg3], 1000000);
        }
        class654.field9227[arg3] = class89.field1261.method1616(arg3, class366.field4657, var4, (byte) 109);
        class654.field9227[arg3].method1735((byte) -95);
        return new class612(class654.field9227[arg3], arg0, arg1);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method3062(int arg0) {
        int var1 = 120 / ((arg0 - 30) / 62);
        field7727 = null;
        field7732 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(FIIFF)F")
    public static final float method3063(float arg0, int arg1, int arg2, float arg3, float arg4) {
        field7729++;
        int var5 = -82 % ((44 - arg1) / 62);
        float[] var6 = class263.field3288[arg2];
        return var6[2] * arg3 + var6[0] * arg4 + var6[1] * arg0;
    }
}
