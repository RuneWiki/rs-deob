import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class126 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Lsg;")
    public static class30 field2458 = class167.method1221((byte) 33, "leuchten2:");

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
    public static int[] field2453 = new int[25];

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field2457 = 0;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field2461 = 0;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field2462 = 0;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lmc;")
    public static class151 field2460;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lgi;")
    public static class179 field2459;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static void method945(boolean arg0) {
        field2458 = null;
        field2453 = null;
        field2460 = null;
        field2459 = null;
        if (arg0) {
            method945(true);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BILdl;I)V")
    public static final void method946(byte arg0, int arg1, class31 arg2, int arg3) {
        field2455++;
        if (class219.field3957 != 0 && class219.field3957 != 3 || !arg2.method307(0)) {
            return;
        }
        int var4 = arg2.field697[arg1];
        if (var4 > arg3 || arg2.field760[arg1] + var4 < arg3) {
            return;
        }
        int var5 = arg3 - arg2.field728 / 2;
        int var6 = arg1 - arg2.field670 / 2;
        int var7 = class147.field2811 + class110.field2202 & 0x7FF;
        int var8 = class213.field3849[var7];
        int var9 = class213.field3846[var7];
        if (arg0 >= -112) {
            field2462 = 20;
        }
        int var10 = (class50.field1139 + 256) * var8 >> 8;
        int var11 = (class50.field1139 + 256) * var9 >> 8;
        int var12 = var6 * var11 - (var5 * var10) >> 11;
        int var13 = var5 * var11 + var6 * var10 >> 11;
        int var14 = class247.field4394.field1336 - var12 >> 7;
        int var15 = class247.field4394.field1360 + var13 >> 7;
        if (class133.field2610 > 0 && class41.field1016[82] && class41.field1016[81]) {
            class172.method1264(class159.field2998, class22.field421 + var15, class196.field3547 + var14, 125);
            return;
        }
        boolean var16 = class96.method786(var15, 0, 0, 0, 1, 0, 0, true, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var14);
        if (!var16) {
            return;
        }
        class196.field3553.method76(5305, var5);
        class196.field3553.method76(5305, var6);
        class196.field3553.method97(class110.field2202, (byte) -2);
        class196.field3553.method76(5305, 57);
        class196.field3553.method76(5305, class147.field2811);
        class196.field3553.method76(5305, class50.field1139);
        class196.field3553.method76(5305, 89);
        class196.field3553.method97(class247.field4394.field1360, (byte) -2);
        class196.field3553.method97(class247.field4394.field1336, (byte) -2);
        class196.field3553.method76(5305, class1.field14);
        class196.field3553.method76(5305, 63);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static final void method947(byte arg0) {
        class251.field4436.method1652(-8259);
        field2454++;
        if (arg0 != 57) {
            field2460 = null;
        }
        class234.field4165.method1652(-8259);
        class75.field1665.method1652(-8259);
    }
}
