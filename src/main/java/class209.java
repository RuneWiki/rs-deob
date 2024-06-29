import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class209 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public int field3006;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public int field3013;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "Lkm;")
    public static class133 field3022;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "[I")
    public static int[] field3002;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "[[B")
    public static byte[][] field3012;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIB)V", line = 5)
    public static final void method1469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3003++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class97.field1313 - class55.field743) * var8 / 100 + class55.field743;
        int var10 = arg3 * var9 >> 8;
        int var11 = 2048 - arg0 & 0x7FF;
        int var12 = 2048 - arg1 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var12 != 0) {
            int var16 = class184.field2538[var12];
            var14 = -var10 * var16 >> 16;
            int var17 = class184.field2532[var12];
            var15 = var10 * var17 >> 16;
        }
        if (var11 != 0) {
            int var18 = class184.field2532[var11];
            int var19 = class184.field2538[var11];
            var13 = var15 * var19 >> 16;
            var15 = var15 * var18 >> 16;
        }
        class236.field3347 = arg0;
        if (arg7 < 7) {
            method1471(98);
        }
        class198.field2820 = arg4 - var13;
        class204.field2944 = arg1;
        class101.field1394 = arg5 - var14;
        class275.field4123 = arg6 - var15;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lfj;I)V", line = 76)
    public static final void method1470(class241 arg0, int arg1) {
        if (arg1 != 0) {
            method1470((class241) null, 70);
        }
        field3014++;
        class98 var2 = (class98) class223.field3199.method111(arg1 ^ 0x4A, class77.method584(arg0.field3439, 88));
        if (var2 == null) {
            class134.method978(class251.field3603, arg0.field3768[0], (byte) -44, 0, arg0, arg0.field3706[0], (class329) null, (class302) null);
        } else {
            var2.method713((byte) -10);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 95)
    public static void method1471(int arg0) {
        if (arg0 == 12141) {
            field3002 = null;
            field3012 = (byte[][]) null;
            field3022 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 111)
    public static final void method1472(int arg0) {
        if (class183.field2521 != -1) {
            class28.method170((byte) 58, class183.field2521);
        }
        field3011++;
        for (int var1 = 0; var1 < class231.field3266; var1++) {
            if (class121.field1644[var1]) {
                class304.field4571[var1] = true;
            }
            class288.field4285[var1] = class121.field1644[var1];
            class121.field1644[var1] = false;
        }
        class271.field4051 = -1;
        if (class67.field908) {
            class287.field4275 = true;
        }
        class153.field2130 = -1;
        if (arg0 > -55) {
            return;
        }
        class170.field2320 = class329.field4966;
        class222.field3189 = null;
        if (class183.field2521 != -1) {
            class231.field3266 = 0;
            class186.method1303(false);
        }
        if (class67.field908) {
            class102.method748();
        } else {
            class38.method222();
        }
        class287.field4278 = 0;
    }
}
