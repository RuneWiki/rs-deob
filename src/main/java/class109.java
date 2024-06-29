import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class109 extends class224 {

    @OriginalMember(owner = "client!de", name = "t", descriptor = "[I")
    public static int[] field1886 = new int[100];

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Lid;")
    public static class149 field1885 = class60.method382("gelb:", (byte) 99);

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Lid;")
    public static class149 field1891 = class60.method382(":", (byte) 81);

    @OriginalMember(owner = "client!de", name = "v", descriptor = "[S")
    public static short[] field1888 = new short[256];

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Lid;")
    public static class149 field1892 = class60.method382(")1o", (byte) 61);

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "[I")
    public static int[] field1889;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Lpk;")
    public static final class100 method769(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class100 var4 = var3.field4048;
            var3.field4048 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public static void method770(int arg0) {
        if (arg0 != -17116) {
            field1892 = null;
        }
        field1886 = null;
        field1885 = null;
        field1891 = null;
        field1888 = null;
        field1892 = null;
        field1889 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lff;I)V")
    public static final void method771(class18 arg0, int arg1) {
        long var2 = 0L;
        if (arg0.field266 == 0) {
            var2 = class108.method756(arg0.field260, arg0.field263, arg0.field280);
        }
        if (arg0.field266 == 1) {
            var2 = class157.method1139(arg0.field260, arg0.field263, arg0.field280);
        }
        int var4 = -1;
        if (arg0.field266 == 2) {
            var2 = class165.method1210(arg0.field260, arg0.field263, arg0.field280);
        }
        field1890++;
        int var5 = arg1;
        int var6 = 0;
        if (arg0.field266 == 3) {
            var2 = class133.method931(arg0.field260, arg0.field263, arg0.field280);
        }
        if (var2 != 0L) {
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var5 = ((int) var2 & 0x392D10) >> 20;
            var6 = (int) var2 >> 14 & 0x1F;
        }
        arg0.field268 = var5;
        arg0.field270 = var6;
        arg0.field277 = var4;
    }
}
