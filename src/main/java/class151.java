import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class151 extends InputStream {

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2337 = "glow1:";

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2340 = "Loaded textures";

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "[I")
    public static int[] field2334;

    @OriginalMember(owner = "client!v", name = "read", descriptor = "()I")
    public final int read() {
        class42.method354(30000L, false);
        field2333++;
        return -1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ICI)I")
    public static final int method1020(int arg0, char arg1, int arg2) {
        field2330++;
        int var3 = -38 / ((arg0 - 57) / 40);
        int var4 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var4 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var4 = 1762;
        }
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V")
    public static final void method1021(int arg0, byte arg1) {
        if (arg1 != -48) {
            method1025(109);
        }
        if (class189.field3018 == null || arg0 > class189.field3018.length) {
            class189.field3018 = new int[arg0];
        }
        field2336++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static final void method1022(byte arg0) {
        class188.field3006.method808(true);
        for (int var1 = 0; var1 < 32; var1++) {
            class202.field3155[var1] = 0L;
        }
        if (arg0 <= 64) {
            method1020(-91, (char) 65482, -95);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class197.field3095[var2] = 0L;
        }
        class113.field1778 = 0;
        field2338++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static void method1023(boolean arg0) {
        field2340 = null;
        field2334 = null;
        if (!arg0) {
            field2334 = null;
        }
        field2337 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
    public static final int method1024(int arg0, int arg1) {
        if (arg0 != 255) {
            method1023(false);
        }
        field2335++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static final void method1025(int arg0) {
        class246.method1663(arg0 + 223, class292.field4606);
        field2331++;
        class205.field3192++;
        if (class166.field2516 && class224.field3521) {
            int var1 = class188.field3012;
            int var2 = class108.field1719;
            int var3 = var1 - class184.field2781;
            int var4 = var2 - class210.field3255;
            if (class21.field319 > var4) {
                var4 = class21.field319;
            }
            if (class8.field179 > var3) {
                var3 = class8.field179;
            }
            if ((class292.field4606.field2922 + var3) > (class8.field179 + class53.field822.field2922)) {
                var3 = class8.field179 + class53.field822.field2922 - class292.field4606.field2922;
            }
            if (arg0 == 32) {
                if (class21.field319 + class53.field822.field2928 < var4 - -class292.field4606.field2928) {
                    var4 = class53.field822.field2928 + class21.field319 - class292.field4606.field2928;
                }
                int var5 = var4 - class126.field1983;
                int var6 = var3 - class227.field3555;
                int var7 = class292.field4606.field2836;
                if (class205.field3192 > class292.field4606.field2988 && (var7 < var6 || -var7 > var6 || var7 < var5 || -var7 > var5)) {
                    class34.field548 = true;
                }
                int var8 = var4 + class53.field822.field2887 - class21.field319;
                int var9 = var3 - (class8.field179 - class53.field822.field3008);
                if (class292.field4606.field2845 != null && class34.field548) {
                    class39 var10 = new class39();
                    var10.field657 = class292.field4606;
                    var10.field647 = class292.field4606.field2845;
                    var10.field652 = var8;
                    var10.field656 = var9;
                    class243.method1648((byte) 111, var10);
                }
                if (class3.field50 == 0) {
                    if (class34.field548) {
                        if (class292.field4606.field2957 != null) {
                            class39 var11 = new class39();
                            var11.field657 = class292.field4606;
                            var11.field652 = var8;
                            var11.field647 = class292.field4606.field2957;
                            var11.field651 = class71.field1136;
                            var11.field656 = var9;
                            class243.method1648((byte) 53, var11);
                        }
                        if (class71.field1136 != null && client.method1052(class292.field4606) != null) {
                            class85.field1399++;
                            class292.field4607.method1251(27, (byte) -87);
                            class292.field4607.method286(class292.field4606.field2856, true);
                            class292.field4607.method301(0, class292.field4606.field2977);
                            class292.field4607.method294((byte) 101, class71.field1136.field2977);
                            class292.field4607.method330(class71.field1136.field2856, 1003752392);
                        }
                    } else if ((class189.field3020 == 1 || class34.method270(class220.field3450 - 1, (byte) 125)) && class220.field3450 > 2) {
                        class88.method711(6588);
                    } else if (class220.field3450 > 0) {
                        class100.method775(2);
                    }
                    class292.field4606 = null;
                }
            }
        } else if (class205.field3192 > 1) {
            class292.field4606 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
    public static final void method1026(int arg0, int arg1) {
        field2332++;
        if (arg0 != 27) {
            method1022((byte) 8);
        }
        class287.field4523.method1778(arg1, -24);
    }
}
