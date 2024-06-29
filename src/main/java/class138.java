import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class138 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    public static int[] field2253 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2255 = 2;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lsc;")
    public static class181 field2258 = class149.method967(255, "(U3");

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2259 = 0;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Z")
    public static boolean field2260 = true;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILtg;IBILo;I)V")
    public static final void method887(int arg0, class107 arg1, int arg2, byte arg3, int arg4, class175 arg5, int arg6) {
        field2257++;
        if (arg1 == null) {
            return;
        }
        if (arg3 != 92) {
            field2258 = null;
        }
        int var7 = class214.field3682 + class144.field2348 & 0x7FF;
        int var8 = Math.max(arg5.field3057 / 2, arg5.field3041 / 2) + 10;
        int var9 = arg2 * arg2 + arg4 * arg4;
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = class72.field1150[var7];
        int var11 = var10 * 256 / (class221.field3821 + 256);
        int var12 = class72.field1145[var7];
        int var13 = var12 * 256 / (class221.field3821 + 256);
        int var14 = arg4 * var13 - (arg2 * var11) >> 16;
        int var15 = arg2 * var13 + arg4 * var11 >> 16;
        ((class48) arg1).method338(arg6 + (arg5.field3057 / 2) - (-var15 - -(arg1.field1750 / 2)), arg0 - -(arg5.field3041 / 2) - var14 + -(arg1.field1758 / 2), arg5.field2968, arg5.field3055);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method888(byte arg0) {
        field2253 = null;
        field2258 = null;
        if (arg0 >= -42) {
            method889(62, (class11) null);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjb;)V")
    public static final void method889(int arg0, class11 arg1) {
        class228.field3918 = arg1.method107(class77.field1243, 125);
        field2254++;
        class128.field2124 = arg1.method107(class203.field3501, 3);
        class123.field2021 = arg1.method107(class262.field4570, 125);
        class194.field3400 = arg1.method107(class176.field3088, 127);
        class225.field3882 = arg1.method107(class222.field3829, 126);
        class76.field1224 = arg1.method107(class125.field2051, 126);
        class159.field2727 = arg1.method107(class107.field1741, 15);
        class210.field3610 = arg1.method107(class82.field1314, 126);
        class192.field3376 = arg1.method107(class16.field305, 5);
        class166.field2827 = arg1.method107(class51.field802, 127);
        class182.field3209 = arg1.method107(class39.field598, 124);
        class163.field2779 = arg1.method107(class47.field738, 124);
        class263.field4582 = arg1.method107(class73.field1160, -50);
        class83.field1332 = arg1.method107(class162.field2766, 125);
        class92.field1468 = arg1.method107(class181.field3151, 127);
        class264.field4613 = arg1.method107(class76.field1215, 124);
        if (arg0 < -103) {
            arg1.method107(class171.field2869, -122);
            class76.field1230 = arg1.method107(class45.field703, -61);
            class151.field2521 = arg1.method107(class97.field1560, -122);
        }
    }
}
