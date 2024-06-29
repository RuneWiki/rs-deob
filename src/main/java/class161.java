import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class161 {

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lwd;")
    private class97 field2730 = new class97(256);

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Lwd;")
    private class97 field2733 = new class97(256);

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lng;")
    private class121 field2726;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lng;")
    private class121 field2725;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
    public static int[] field2718 = new int[32];

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[I")
    public static int[] field2729 = new int[2000];

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Le;")
    public static class191 field2732;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lqk;")
    public static class6 field2734;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[[B")
    public static byte[][] field2731;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[II)Ltf;")
    public final class103 method1085(int arg0, int[] arg1, int arg2) {
        if (arg2 > -17) {
            return null;
        }
        field2721++;
        if (this.field2725.method798(-105) == 1) {
            return this.method1088(arg1, -31264, arg0, 0);
        } else if (this.field2725.method805((byte) 30, arg0) == 1) {
            return this.method1088(arg1, -31264, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[IBI)Ltf;")
    private final class103 method1086(int arg0, int[] arg1, byte arg2, int arg3) {
        field2722++;
        int var5 = (arg3 & 0xFFF << 4 | arg3 >>> 12) ^ arg0;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class103 var9 = (class103) this.field2733.method612(var7, true);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class77 var10 = class77.method497(this.field2726, arg3, arg0);
            if (arg2 != 34) {
                method1091(65);
            }
            if (var10 == null) {
                return null;
            }
            class103 var11 = var10.method498();
            this.field2733.method605(var7, -3, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field1698.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([III)Ltf;")
    public final class103 method1087(int[] arg0, int arg1, int arg2) {
        field2719++;
        if (this.field2726.method798(-82) == 1) {
            return this.method1086(arg1, arg0, (byte) 34, 0);
        } else if (this.field2726.method805((byte) 69, arg1) == 1) {
            return this.method1086(0, arg0, (byte) 34, arg1);
        } else {
            if (arg2 < 87) {
                this.field2725 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([IIII)Ltf;")
    private final class103 method1088(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = ((arg3 & 0xC0000FFF) << 4 | arg3 >>> 12) ^ arg2;
        field2724++;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        if (arg1 != -31264) {
            this.field2726 = null;
        }
        class103 var9 = (class103) this.field2733.method612(var7, true);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class108 var10 = (class108) this.field2730.method612(var7, true);
            if (var10 == null) {
                var10 = class108.method694(this.field2725, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field2730.method605(var7, -3, var10);
            }
            class103 var11 = var10.method699(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method655(63);
                this.field2733.method605(var7, -3, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIB)I")
    public static final int method1089(int arg0, int arg1, byte arg2) {
        field2727++;
        if (arg2 != -102) {
            method1091(-116);
        }
        int var3 = arg1 - 1 & arg0 >> 31;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Z")
    public static final boolean method1090(int arg0) {
        if (arg0 != -4072) {
            field2732 = null;
        }
        field2723++;
        try {
            return class190.method1303((byte) -100);
        } catch (IOException var4) {
            class219.method1488(arg0 + 4072);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class18.field235 + "," + class269.field4747 + "," + class218.field3840 + " - " + class253.field4486 + "," + (class175.field2946.field2953[0] + class225.field4061) + "," + (class175.field2946.field3014[0] + class193.field3474) + " - ";
            for (int var3 = 0; class253.field4486 > var3 && var3 < 50; var3++) {
                var2 = var2 + class107.field1776.field3995[var3] + ",";
            }
            class25.method182(var5, var2, true);
            class81.method517(arg0 + 3953);
            return true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static void method1091(int arg0) {
        field2729 = null;
        field2732 = null;
        field2734 = null;
        field2718 = null;
        if (arg0 != -692958913) {
            field2734 = null;
        }
        field2731 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Z")
    public static final boolean method1092(int arg0, int arg1, int arg2) {
        int var3 = class30.field426[arg0][arg1][arg2];
        if (-class10.field111 == var3) {
            return false;
        } else if (class10.field111 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class130.method883(var4 + 1, class12.field143[arg0][arg1][arg2], var5 + 1) && class130.method883(var4 + 128 - 1, class12.field143[arg0][arg1 + 1][arg2], var5 + 1) && class130.method883(var4 + 128 - 1, class12.field143[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class130.method883(var4 + 1, class12.field143[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class30.field426[arg0][arg1][arg2] = class10.field111;
                return true;
            } else {
                class30.field426[arg0][arg1][arg2] = -class10.field111;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lng;Lng;)V")
    public class161(class121 arg0, class121 arg1) {
        this.field2726 = arg0;
        this.field2725 = arg1;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2718[var1] = var0 - 1;
            var0 += var0;
        }
        field2732 = class54.method368("<col=40ff00>", 2047);
    }
}
