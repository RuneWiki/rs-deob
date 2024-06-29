import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class142 {

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Lcd;")
    public static class64 field2498 = class44.method335((byte) 71, "welle2:");

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lig;")
    public static class168 field2496 = new class168(30);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lqm;ILqm;Lqm;Lqm;)V", line = 11)
    public static final void method1005(class222 arg0, int arg1, class222 arg2, class222 arg3, class222 arg4) {
        class103.field1899 = arg0;
        class120.field2172 = arg2;
        field2497++;
        class42.field686 = arg3;
        class288.field4928 = arg4;
        class272.field4675 = new class60[class42.field686.method1586(0)][];
        class60.field1076 = new boolean[class42.field686.method1586(0)];
        if (arg1 != -30089) {
            method1008(-2, (class64) null, -49, (class64) null, (class64) null);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Z", line = 28)
    public static final boolean method1006(int arg0, int arg1) {
        if (arg0 == -141) {
            field2500++;
            return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIIII)V", line = 47)
    public static final void method1007(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2495++;
        if (arg1 >= arg3) {
            for (int var5 = arg3; var5 < arg1; var5++) {
                class124.field2241[var5][arg4] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg3; var6++) {
                class124.field2241[var6][arg4] = arg2;
            }
        }
        if (arg0 != -92) {
            method1006(44, -117);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILcd;ILcd;Lcd;)V", line = 88)
    public static final void method1008(int arg0, class64 arg1, int arg2, class64 arg3, class64 arg4) {
        field2499++;
        class104.method767(arg0, arg3, 32406, arg2, arg4, arg1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V", line = 96)
    public static final void method1009(byte arg0, int arg1) {
        if (arg0 != -15) {
            method1005((class222) null, -67, (class222) null, (class222) null, (class222) null);
        }
        class112.field2072.method1197((byte) 53, arg1);
        field2494++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 107)
    public static void method1010(int arg0) {
        if (arg0 != -13514) {
            method1007((byte) 125, 96, -9, 120, -37);
        }
        field2498 = null;
        field2496 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)I", line = 124)
    public static final int method1011(int arg0, int arg1) {
        if (arg1 != 15700) {
            return -29;
        }
        field2502++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }
}
