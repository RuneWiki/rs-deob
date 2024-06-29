import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class186 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2776 = "Use";

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field2778 = 0;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field2779 = 0;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Z")
    public static boolean field2783 = false;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "Lpg;")
    public static class320 field2787 = new class320(20);

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2789 = new String[1000];

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Ll;")
    public static class133 field2788;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "Lwj;")
    public static class270 field2785;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIZIII)V", line = 11)
    public static final void method1329(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        int var8 = arg1 - arg2;
        int var9 = arg0 + arg2;
        field2782++;
        int var10 = arg2 + arg3;
        int var11 = arg7 - arg2;
        int var12 = arg0;
        if (arg4) {
            method1329(18, -31, 88, -105, true, 112, 42, -45);
        }
        while (var12 < var9) {
            class272.method1876(class34.field525[var12], arg7, arg3, arg5, (byte) -63);
            var12++;
        }
        for (int var13 = arg1; var13 > var8; var13--) {
            class272.method1876(class34.field525[var13], arg7, arg3, arg5, (byte) -90);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class34.field525[var14];
            class272.method1876(var15, var10, arg3, arg5, (byte) -55);
            class272.method1876(var15, var11, var10, arg6, (byte) -75);
            class272.method1876(var15, arg7, var11, arg5, (byte) -48);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 54)
    public static void method1330(int arg0) {
        field2785 = null;
        field2788 = null;
        field2789 = null;
        field2776 = null;
        if (arg0 > 29) {
            field2787 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 68)
    public static final String method1331(long arg0, byte arg1) {
        if (arg1 != -50) {
            field2778 = -100;
        }
        field2781++;
        return class53.method444(1, arg0);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)I", line = 79)
    public static final int method1332(int arg0, boolean arg1) {
        field2784++;
        long var2 = class102.method743((byte) 97);
        if (arg0 != -11604) {
            method1332(125, true);
        }
        for (class65 var4 = arg1 ? (class65) class292.field4538.method1228(true) : (class65) class292.field4538.method1223((byte) 13); var4 != null; var4 = (class65) class292.field4538.method1223((byte) 13)) {
            if (var2 > (var4.field1022 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field1022 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field758;
                    class285.field4461[var5] = class225.field3589[var5];
                    var4.method403(1);
                    return var5;
                }
                var4.method403(1);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)I", line = 118)
    public static final int method1333(boolean arg0, int arg1) {
        field2777++;
        if (!arg0) {
            field2788 = (class133) null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Lgm;", line = 133)
    public static final class249 method1334(byte arg0) {
        field2780++;
        int var1 = class75.field1215[0] * class73.field1201[0];
        int[] var2 = new int[var1];
        byte[] var3 = class306.field4757[0];
        int var4 = -17 / ((arg0 + 49) / 41);
        for (int var5 = 0; var5 < var1; var5++) {
            var2[var5] = class63.field1002[class270.method1860(255, var3[var5])];
        }
        class249 var6 = new class249(class65.field1019, class228.field3627, class97.field1546[0], class320.field5001[0], class75.field1215[0], class73.field1201[0], var2);
        class7.method56((byte) 59);
        return var6;
    }
}
