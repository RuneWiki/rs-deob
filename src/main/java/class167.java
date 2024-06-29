import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class167 extends class101 {

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2506 = "slide:";

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "[I")
    public static int[] field2511 = new int[25];

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public int field2505;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "[I")
    public static int[] field2512;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1167(int arg0, int arg1) {
        if (class252.field3757 == arg1 && arg1 != 0) {
            class2 var2 = class168.field2521[arg1];
            var2.method3(class177.field2613);
        }
        if (arg0 != 26022) {
            field2506 = (String) null;
        }
        field2507++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V", line = 21)
    public static final void method1168(boolean arg0, int arg1) {
        field2510++;
        if (arg0) {
            field2506 = (String) null;
        }
        class142.field2141 = 20;
        class155.field2329 = 3;
        class255.field3874 = arg1;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 42)
    public static void method1169(int arg0) {
        field2512 = null;
        field2511 = null;
        int var1 = -28 % ((-arg0 - 29) / 60);
        field2506 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILof;IIIZ)V", line = 57)
    public static final void method1170(int arg0, class272 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2508++;
        if (class168.field2522 >= 50 || arg1.field4182 == null || arg1.field4182.length <= arg2 || arg1.field4182[arg2] == null) {
            return;
        }
        int var6 = arg1.field4182[arg2][0];
        int var7 = var6 >> 5 & 0x7;
        int var8 = var6 >> 8;
        if (arg1.field4182[arg2].length > 1) {
            int var9 = (int) ((double) arg1.field4182[arg2].length * Math.random());
            if (var9 > 0) {
                var8 = arg1.field4182[arg2][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg5) {
                class154.method1103(var7, var8, -91, 0);
            }
        } else if (class272.field4183 != 0) {
            class116.field1783[class168.field2522] = var8;
            class81.field1145[class168.field2522] = var7;
            int var11 = (arg4 - 64) / 128;
            class201.field3003[class168.field2522] = 0;
            class48.field608[class168.field2522] = null;
            int var12 = (arg0 + arg3) / 128;
            class309.field4693[class168.field2522] = (var11 << 16) + (var12 << 8) + var10;
            class168.field2522++;
        }
    }
}
