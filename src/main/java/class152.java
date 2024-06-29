import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class152 extends class179 {

    @OriginalMember(owner = "client!he", name = "W", descriptor = "Z")
    public static boolean field2723 = true;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "[I")
    public static int[] field2724 = new int[99];

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "[[Z")
    public static boolean[][] field2725;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "Lke;")
    public static class256 field2726;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method1138(int arg0, byte arg1) {
        field2719++;
        if (class279.field4863 == arg0 && arg0 != 0) {
            class217 var2 = class72.field1316[arg0];
            var2.method93(class39.field707);
        }
        if (arg1 != -100) {
            method1138(2, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I", line = 27)
    public final int[] method41(int arg0, int arg1) {
        field2721++;
        if (arg1 != -31598) {
            field2723 = false;
        }
        return class290.field5017;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIII)I", line = 41)
    public static final int method1139(boolean arg0, int arg1, int arg2, int arg3) {
        class185 var4 = (class185) class254.field4355.method1744((byte) 125, (long) arg3);
        field2718++;
        if (var4 == null) {
            return 0;
        } else if (arg2 == -4669) {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field3254.length; var6++) {
                if (var4.field3254[var6] >= 0 && class137.field2383 > var4.field3254[var6]) {
                    class36 var7 = class254.method1753(var4.field3254[var6], true);
                    if (var7.field621 != null) {
                        class6 var8 = (class6) var7.field621.method1744((byte) 123, (long) arg1);
                        if (var8 != null) {
                            if (arg0) {
                                var5 += var4.field3256[var6] * var8.field94;
                            } else {
                                var5 += var8.field94;
                            }
                        }
                    }
                }
            }
            return var5;
        } else {
            return 36;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 92)
    public class152() {
        super(0, true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLsh;)V", line = 102)
    public static final void method1140(byte arg0, class32 arg1) {
        field2722++;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        if (arg0 > -70) {
            method1142(17);
        }
        if (arg1.field517 == 0) {
            var5 = class308.method2141(arg1.field526, arg1.field525, arg1.field514);
        }
        if (arg1.field517 == 1) {
            var5 = class161.method1191(arg1.field526, arg1.field525, arg1.field514);
        }
        if (arg1.field517 == 2) {
            var5 = class229.method1560(arg1.field526, arg1.field525, arg1.field514);
        }
        if (arg1.field517 == 3) {
            var5 = client.method824(arg1.field526, arg1.field525, arg1.field514);
        }
        if (var5 != 0L) {
            var3 = (int) var5 >> 14 & 0x1F;
            var2 = Integer.MAX_VALUE & (int) (var5 >>> 32);
            var4 = ((int) var5 & 0x38FED1) >> 20;
        }
        arg1.field515 = var4;
        arg1.field521 = var2;
        arg1.field513 = var3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2724[var1] = var0 / 4;
        }
        field2725 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };
        field2726 = class316.method2202("::wm0", 27626);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILng;I)[Lrd;", line = 148)
    public static final class135[] method1141(int arg0, int arg1, class138 arg2, int arg3) {
        field2720++;
        if (class83.method611(arg3, arg0 ^ 0x79F1, arg2, arg1)) {
            if (arg0 != -31199) {
                field2725 = (boolean[][]) ((boolean[][]) null);
            }
            return class188.method1362(118);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "j", descriptor = "(I)V", line = 163)
    public static void method1142(int arg0) {
        field2724 = null;
        if (arg0 >= -114) {
            method1142(28);
        }
        field2725 = (boolean[][]) null;
        field2726 = null;
    }
}
