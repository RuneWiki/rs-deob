import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class415 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field5887 = -1;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public int field5899 = -1;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field5888 = 0;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field5900 = 0;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lnq;")
    public static class268 field5889;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lnq;")
    public static class268 field5892;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lnq;")
    public static class268 field5897;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lbo;")
    public static class435 field5896;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field5901;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field5902;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field5903;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
    public int[] field5894;

    // $FF: synthetic method
    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2605(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2599(byte arg0) {
        field5890++;
        for (class380 var1 = (class380) class24.field414.method646(48); var1 != null; var1 = (class380) class24.field414.method641(false)) {
            if (var1.field5416 > 0) {
                var1.field5416--;
            }
            if (var1.field5416 != 0) {
                if (var1.field5418 > 0) {
                    var1.field5418--;
                }
                if (var1.field5418 == 0 && var1.field5422 >= 1 && var1.field5419 >= 1 && class211.field2954 - 2 >= var1.field5422 && var1.field5419 <= (class290.field4061 - 2) && (var1.field5424 < 0 || class192.method1249((byte) 73, var1.field5424, var1.field5414))) {
                    class438.method2757(var1.field5426, -1, var1.field5419, var1.field5413, var1.field5424, var1.field5422, var1.field5414, var1.field5420, false);
                    var1.field5418 = -1;
                    if (var1.field5424 == var1.field5417 && var1.field5417 == -1) {
                        var1.method2467((byte) -58);
                    } else if (var1.field5424 == var1.field5417 && var1.field5423 == var1.field5413 && var1.field5427 == var1.field5414) {
                        var1.method2467((byte) 121);
                    }
                }
            } else if (var1.field5417 < 0 || class192.method1249((byte) -86, var1.field5417, var1.field5427)) {
                class438.method2757(var1.field5426, -1, var1.field5419, var1.field5423, var1.field5417, var1.field5422, var1.field5427, var1.field5420, false);
                var1.method2467((byte) 117);
            }
        }
        int var2 = 82 / ((21 - arg0) / 61);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILkh;I)V", line = 63)
    public final void method2600(int arg0, class11 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method172((byte) 52);
            if (var4 == 0) {
                if (arg2 != -12262) {
                    return;
                }
                field5891++;
                return;
            }
            this.method2604(arg0, -128, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BZ)V", line = 91)
    public static final void method2601(byte arg0, boolean arg1) {
        field5895++;
        byte var2;
        byte[][] var3;
        if (arg1) {
            var2 = 1;
            var3 = class446.field6257;
        } else {
            var3 = class247.field3495;
            var2 = 4;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var3[var5];
            int var13 = class155.field2191[var5] >> 8;
            int var14 = class155.field2191[var5] & 0xFF;
            int var15 = var13 * 64 - class212.field2968;
            int var16 = var14 * 64 - class447.field6269;
            if (var12 != null) {
                class285.method1860(12);
                var11 = class62.method477(var2, arg1, class447.field6269, (byte) -120, var16, class426.field5999, var15, class64.field949, class212.field2968, var12);
            }
            if (!arg1 && (class218.field3021 / 8) == var13 && (class316.field4320 / 8) == var14) {
                if (var11 == null) {
                    class338.field4650 = null;
                } else {
                    class338.field4650 = class345.method2185(var11[0], var11[2], arg0 + 118, var11[3], var11[1]);
                    class403.field5719 = var11[4];
                }
            }
        }
        int var6 = 0;
        if (arg0 != -118) {
            field5896 = null;
        }
        while (var4 > var6) {
            int var7 = (class155.field2191[var6] >> 8) * 64 - class212.field2968;
            int var8 = (class155.field2191[var6] & 0xFF) * 64 - class447.field6269;
            byte[] var9 = var3[var6];
            if (var9 == null && class316.field4320 < 800) {
                class285.method1860(12);
                for (int var10 = 0; var10 < var2; var10++) {
                    class66.method510(var8, 64, 11091, var10, var7, 64);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBLko;Ljava/awt/Canvas;Lja;I)Luo;", line = 186)
    public static final class345 method2602(int arg0, byte arg1, class294 arg2, Canvas arg3, class152 arg4, int arg5) {
        field5893++;
        try {
            if (arg1 < 75) {
                method2599((byte) -52);
            }
            Class var6 = Class.forName("tb");
            Constructor var7 = var6.getConstructor(field5901 == null ? (field5901 = method2605("java.awt.Canvas")) : field5901, field5902 == null ? (field5902 = method2605("ja")) : field5902, Integer.TYPE, Integer.TYPE, field5903 == null ? (field5903 = method2605("ko")) : field5903);
            return (class345) var7.newInstance(arg3, arg4, Integer.valueOf(arg5), new Integer(arg0), arg2);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V", line = 217)
    public static void method2603(byte arg0) {
        field5892 = null;
        field5889 = null;
        field5897 = null;
        if (arg0 != -111) {
            method2601((byte) 77, true);
        }
        field5896 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILkh;I)V", line = 230)
    private final void method2604(int arg0, int arg1, class11 arg2, int arg3) {
        field5898++;
        int var5 = -31 / ((arg1 + 2) / 43);
        if (arg3 == 1) {
            this.field5899 = arg2.method174(255);
        } else if (arg3 == 2) {
            this.field5894 = new int[arg2.method172((byte) 52)];
            for (int var6 = 0; var6 < this.field5894.length; var6++) {
                this.field5894[var6] = arg2.method174(255);
            }
        } else if (arg3 == 3) {
            this.field5887 = arg2.method172((byte) 52);
            return;
        }
    }
}
