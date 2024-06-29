import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class120 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lad;")
    private static class5 field2971 = class88.method674("Prepared visibility map", 85);

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lad;")
    private static class5 field2973 = class88.method674("World", 31);

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field2978 = 0;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Z")
    public static volatile boolean field2979 = true;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field2972 = 0;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lad;")
    public static class5 field2988 = class88.method674("Fertigkeit)2", -59);

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lad;")
    private static class5 field2975 = class88.method674("Please reload this page)3", 60);

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lad;")
    public static class5 field2989 = field2971;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Lad;")
    public static class5 field2986 = field2973;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field2990 = 0;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field2987 = -1;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lad;")
    public static class5 field2977 = field2975;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field2993 = 0;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Z")
    public static boolean field2983 = false;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Lad;")
    public static class5 field2991 = class88.method674("backright1", 23);

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Lad;")
    public static class5 field2992 = class88.method674("leuchten2:", 78);

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lub;")
    public static class122 field2976;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lrd;Lrd;IIZ)Lqb;", line = 3)
    public static final class98 method947(class106 arg0, class106 arg1, int arg2, int arg3, boolean arg4) {
        field2985++;
        boolean var5 = true;
        int[] var6 = arg1.method847(arg2, arg3 + 6371);
        if (arg3 != 60) {
            return null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method852(arg2, 82, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg0.method852(0, arg3 + 42, var9);
                } else {
                    var10 = arg0.method852(var9, 71, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class98(arg1, arg0, arg2, arg4);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BIII)Z", line = 73)
    public static final boolean method948(byte arg0, int arg1, int arg2, int arg3) {
        field2984++;
        int var4 = arg1 >> 14 & 0x7FFF;
        int var5 = class42.field1065.method756(class54.field1344, arg3, arg2, arg1);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class70 var8 = class42.method357(var4, (byte) -42);
            int var9 = var8.field1692;
            if (var7 != 0) {
                var9 = (var9 >> 4 - var7) + (var9 << var7 & 0xF);
            }
            int var10;
            int var11;
            if (var7 == 0 || var7 == 2) {
                var11 = var8.field1693;
                var10 = var8.field1705;
            } else {
                var10 = var8.field1693;
                var11 = var8.field1705;
            }
            class129.method996((byte) 36, arg2, 2, true, class82.field1932.field49[0], var9, 0, 0, arg3, class82.field1932.field89[0], var11, var10);
        } else {
            class129.method996((byte) 111, arg2, 2, true, class82.field1932.field49[0], 0, var6 + 1, var7, arg3, class82.field1932.field89[0], 0, 0);
        }
        class54.field1364 = class104.field2524;
        class19.field520 = 2;
        int var12 = 126 / ((arg0 - 40) / 57);
        class61.field1511 = class4.field124;
        class69.field1638 = 0;
        return true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 127)
    public static void method949(byte arg0) {
        field2989 = null;
        field2992 = null;
        field2988 = null;
        field2986 = null;
        field2971 = null;
        field2977 = null;
        if (arg0 <= 52) {
            method952(null, -15);
        }
        field2975 = null;
        field2973 = null;
        field2976 = null;
        field2991 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIII)I", line = 154)
    public static final int method950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2974++;
        if ((arg2 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg5;
            arg5 = var7;
        }
        int var8 = arg0 & 0x3;
        if (arg6 == var8) {
            return arg3;
        } else if (var8 == 1) {
            return 7 + 1 - arg1 - arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg5;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 184)
    public static final void method951(boolean arg0) {
        for (class33 var1 = (class33) class20.field525.method180(0); var1 != null; var1 = (class33) class20.field525.method181(0)) {
            if (class54.field1344 != var1.field801 || var1.field813) {
                var1.method114(-3789);
            } else if (class69.field1636 >= var1.field815) {
                var1.method263(55, class98.field2382);
                if (var1.field813) {
                    var1.method114(-3789);
                } else {
                    class42.field1065.method755(var1.field801, var1.field804, var1.field818, var1.field812, 60, var1, 0, -1, false);
                }
            }
        }
        if (arg0) {
            method952(null, 114);
        }
        field2981++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lwa;I)V", line = 224)
    public static final void method952(class132 arg0, int arg1) {
        field2980++;
        int var2 = -1;
        int var3 = 0;
        if (arg0.field3198 == 0) {
            var3 = class42.field1065.method776(arg0.field3193, arg0.field3200, arg0.field3187);
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0.field3198 == 1) {
            var3 = class42.field1065.method741(arg0.field3193, arg0.field3200, arg0.field3187);
        }
        if (arg0.field3198 == 2) {
            var3 = class42.field1065.method780(arg0.field3193, arg0.field3200, arg0.field3187);
        }
        if (arg1 >= -127) {
            field2987 = 69;
        }
        if (arg0.field3198 == 3) {
            var3 = class42.field1065.method772(arg0.field3193, arg0.field3200, arg0.field3187);
        }
        if (var3 != 0) {
            var2 = var3 >> 14 & 0x7FFF;
            int var6 = class42.field1065.method756(arg0.field3193, arg0.field3200, arg0.field3187, var3);
            var5 = var6 >> 6 & 0x3;
            var4 = var6 & 0x1F;
        }
        arg0.field3194 = var2;
        arg0.field3188 = var4;
        arg0.field3185 = var5;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lad;BLad;Lad;)V", line = 278)
    public static final void method953(class5 arg0, byte arg1, class5 arg2, class5 arg3) {
        field2982++;
        class109.field2734 = arg0;
        class109.field2746 = arg3;
        class109.field2728 = arg2;
        if (arg1 <= 91) {
            method950(78, -119, 62, -42, -18, 47, -3);
        }
    }
}
