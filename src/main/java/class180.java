import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class180 {

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "Ljo;")
    public static class351 field2722 = new class351(31, -1);

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "Ljo;")
    public static class351 field2724 = new class351(69, 11);

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "Z")
    public static boolean field2725 = false;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "Ltga;")
    public static class64 field2727 = new class64(512);

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "Lfda;")
    public static class336 field2729 = new class336();

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "Lpb;")
    public static class680 field2730 = new class680("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "[I")
    public static int[] field2728;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public static void method1356(int arg0) {
        field2730 = null;
        field2722 = null;
        field2728 = null;
        if (arg0 != -8234) {
            method1357((byte) 111);
        }
        field2724 = null;
        field2727 = null;
        field2729 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
    public static final void method1357(byte arg0) {
        int var1 = -2 / ((arg0 - 66) / 55);
        field2723++;
        for (int var2 = 0; var2 < class636.field8961; var2++) {
            class472 var4 = class458.field6558[var2];
            boolean var5 = false;
            if (var4.field6723 == null) {
                var4.field6728--;
                if (var4.field6728 >= (var4.method2793(-71) ? -1500 : -10)) {
                    if (var4.field6730 == 1 && var4.field6720 == null) {
                        var4.field6720 = class97.method683(class346.field5086, var4.field6724, 0);
                        if (var4.field6720 == null) {
                            continue;
                        }
                        var4.field6728 += var4.field6720.method682();
                    } else if (var4.method2793(-104) && (var4.field6736 == null || var4.field6722 == null)) {
                        if (var4.field6736 == null) {
                            var4.field6736 = class198.method1436(class641.field9035, var4.field6724);
                        }
                        if (var4.field6736 == null) {
                            continue;
                        }
                        if (var4.field6722 == null) {
                            var4.field6722 = var4.field6736.method1438(new int[] { 22050 });
                            if (var4.field6722 == null) {
                                continue;
                            }
                        }
                    }
                    if (var4.field6728 < 0) {
                        int var6 = 8192;
                        int var7;
                        if (var4.field6740 == 0) {
                            var7 = var4.field6733 * (var4.field6730 == 3 ? class145.field1852.field9009.method978((byte) -90) : class145.field1852.field9029.method978((byte) -119)) >> 2;
                        } else {
                            int var8 = (var4.field6740 & 0x39102C0) >> 24;
                            if (class251.field3549.field7710 == var8) {
                                int var9 = (var4.field6740 & 0xFF) << 9;
                                int var10 = class251.field3549.method2692((byte) -124) << 8;
                                int var11 = var4.field6740 >> 16 & 0xFF;
                                int var12 = (var11 << 9) + 256 - (class251.field3549.field7718 - var10);
                                int var13 = (var4.field6740 & 0xFFBD) >> 8;
                                int var14 = (var13 << 9) + var10 + 256 - class251.field3549.field7719;
                                int var15 = (Math.abs(var12) + Math.abs(var14)) - 512;
                                if (var15 > var9) {
                                    var4.field6728 = -99999;
                                    continue;
                                }
                                if (var15 < 0) {
                                    var15 = 0;
                                }
                                var7 = (var9 - var15) * class145.field1852.field9003.method978((byte) -69) * var4.field6733 / var9 >> 2;
                                if (var4.field6729 != null && var4.field6729 instanceof class778) {
                                    class778 var16 = (class778) var4.field6729;
                                    short var17 = var16.field10733;
                                    short var18 = var16.field10730;
                                }
                                if (var12 != 0 || var14 != 0) {
                                    int var19 = (-class118.field1478 - (int) (Math.atan2((double) var12, (double) var14) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                    if (var19 > 8192) {
                                        var19 = 16384 - var19;
                                    }
                                    int var20;
                                    if (var15 <= 0) {
                                        var20 = 8192;
                                    } else if (var15 < 4096) {
                                        var20 = (8192 - var15) / 4096 + 8192;
                                    } else {
                                        var20 = 16384;
                                    }
                                    var6 = (16384 - var20 >> 1) + var19 * var20 / 8192;
                                }
                            } else {
                                var7 = 0;
                            }
                        }
                        if (var7 > 0) {
                            class383 var21 = null;
                            if (var4.field6730 == 1) {
                                var21 = var4.field6720.method685().method2349(class789.field10832);
                            } else if (var4.method2793(-127)) {
                                var21 = var4.field6722;
                            }
                            class154 var22 = var4.field6723 = class154.method1191(var21, var4.field6727, var7, var6);
                            var22.method1203(var4.field6731 - 1);
                            class229.field3307.method3443(var22);
                        }
                    }
                } else {
                    var5 = true;
                }
            } else if (!var4.field6723.method3114(88)) {
                var5 = true;
            }
            if (var5) {
                class636.field8961--;
                for (int var23 = var2; var23 < class636.field8961; var23++) {
                    class458.field6558[var23] = class458.field6558[var23 + 1];
                }
                var2--;
            }
        }
        if (class709.field9995 && !class628.method3595(0)) {
            if (class145.field1852.field9012.method978((byte) -89) != 0 && class433.field6161 != -1) {
                if (class31.field420 == null) {
                    class452.method2719(class606.field8526, 0, false, 0, class145.field1852.field9012.method978((byte) -107), class433.field6161);
                } else {
                    class790.method4322(class606.field8526, false, class31.field420, true, class433.field6161, 0, class145.field1852.field9012.method978((byte) -98));
                }
            }
            class31.field420 = null;
            class709.field9995 = false;
        } else if (class145.field1852.field9012.method978((byte) -124) != 0 && class433.field6161 != -1 && !class628.method3595(0)) {
            class719.field10108++;
            class731 var3 = class155.method1222(260, class416.field5877, class237.field3417);
            var3.field10211.method879((byte) 97, class433.field6161);
            class533.method3088(var3, 0);
            class433.field6161 = -1;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
    public static final boolean method1358(int arg0, int arg1, int arg2) {
        field2726++;
        if (arg0 != 69) {
            method1358(-19, 93, 107);
        }
        return class697.method3931(arg1, arg2, 2226) || class141.method982(arg1, 3, arg2);
    }
}
