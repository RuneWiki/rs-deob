import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class163 {

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2313 = "Allocated memory";

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[I")
    public static int[] field2318 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2309 = "Loading title screen - ";

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "F")
    public static float field2310;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "[[Z")
    public static boolean[][] field2312;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
    public static final void method1037(int arg0, int arg1) {
        if (arg1 != 128) {
            field2312 = null;
        }
        field2316++;
        class215.field3297.method943(arg0, true);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static final void method1038(byte arg0) {
        if (arg0 == -71) {
            class2.field1.method944(-75);
            class145.field1998.method944(109);
            field2315++;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIILsk;IJZ)Z")
    public static final boolean method1039(int arg0, int arg1, int arg2, int arg3, int arg4, class202 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class91.method592(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static final void method1040(int arg0) {
        field2319++;
        if (arg0 > class223.field3477) {
            class145.field2008 = -1;
            class170.field2422 = -1;
            class223.field3477 = 0;
        }
        if (class223.field3477 > class97.field1405) {
            class223.field3477 = class97.field1405;
            class170.field2422 = -1;
            class145.field2008 = -1;
        }
        if (class311.field5005 < 0) {
            class311.field5005 = 0;
            class170.field2422 = -1;
            class145.field2008 = -1;
        }
        if (class311.field5005 > class97.field1406) {
            class145.field2008 = -1;
            class170.field2422 = -1;
            class311.field5005 = class97.field1406;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static void method1041(int arg0) {
        if (arg0 == -1) {
            field2309 = null;
            field2312 = null;
            field2313 = null;
            field2318 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method1042(boolean arg0, byte arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field2314++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = 0;
        if (arg1 != -52) {
            method1041(-75);
        }
        while (class216.field3308 > var6) {
            class10 var9 = class281.method1822((byte) -94, var6);
            if ((!arg0 || var9.field122) && var9.field112 == -1 && var9.field148 == -1 && var9.field109 == 0 && var9.field147.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class34.field512 = null;
                    class21.field346 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
            var6++;
        }
        class34.field512 = var4;
        class21.field346 = var5;
        String[] var7 = new String[class21.field346];
        class101.field1456 = 0;
        for (int var8 = 0; var8 < class21.field346; var8++) {
            var7[var8] = class281.method1822((byte) -105, var4[var8]).field147;
        }
        class120.method778(-55, var7, class34.field512);
    }
}
