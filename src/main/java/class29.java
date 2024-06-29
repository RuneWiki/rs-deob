import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field399 = 0;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "[I")
    public static int[] field401 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Leu;")
    public static class341 field397;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZIIII)V", line = 5)
    public static final void method169(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class305.field4525 = arg0;
        class84.field1331 = arg4;
        field398++;
        class27.field386 = arg5;
        class133.field2083 = arg3;
        class52.field964 = arg2;
        if (arg1) {
            return;
        }
        if (class84.field1331 >= 100) {
            int var6 = class133.field2083 * 128 + 64;
            int var7 = class52.field964 * 128 + 64;
            int var8 = class224.method1515(var6, var7, class123.field1944, -631749433) - class305.field4525;
            int var9 = var6 - class315.field4688;
            int var10 = var8 - class62.field1086;
            int var11 = var7 - class397.field5649;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class254.field3756 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class171.field2548 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class39.field835 = 0;
            if (class254.field3756 < 1024) {
                class254.field3756 = 1024;
            }
            if (class254.field3756 > 3072) {
                class254.field3756 = 3072;
            }
        }
        class294.field4381 = 2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 57)
    public static void method170(byte arg0) {
        field401 = null;
        if (arg0 >= 17) {
            field397 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z", line = 68)
    public static final boolean method171(int arg0, int arg1, int arg2) {
        field400++;
        if (arg0 != 3072) {
            method169(127, true, 34, -86, -91, -20);
        }
        return (arg2 & 0x10000) != 0;
    }
}
