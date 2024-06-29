import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class562 extends InputStream {

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field8013;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Lql;")
    public static class738 field8014;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)Lkr;")
    public static final class748 method3279(int arg0) {
        int var1 = -35 % ((-arg0 - 39) / 35);
        field8012++;
        try {
            return (class748) Class.forName("hn").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class431();
        }
    }

    @OriginalMember(owner = "client!tv", name = "read", descriptor = "()I")
    public final int read() {
        class277.method1759(30000L, 90);
        field8015++;
        return -1;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIII)I")
    public static final int method3280(byte arg0, int arg1, int arg2, int arg3) {
        field8011++;
        if ((class60.field847[arg2][arg1][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg0 == 99) {
            return arg2 <= 0 || (class60.field847[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 81;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILria;BIII)Z")
    public static final boolean method3281(int arg0, int arg1, class286 arg2, byte arg3, int arg4, int arg5, int arg6) {
        field8013++;
        if (!class24.field247 || !class587.field8325) {
            return false;
        } else if (class357.field5193 < 100) {
            return false;
        } else if (arg4 != arg5 || arg1 != arg6) {
            if (arg3 != -54) {
                field8014 = null;
            }
            for (int var7 = arg5; var7 <= arg4; var7++) {
                for (int var8 = arg1; var8 <= arg6; var8++) {
                    if (class70.field986[arg0][var7][var8] == -class440.field6515) {
                        return false;
                    }
                }
            }
            if (class43.method298(120, arg2)) {
                class619.field8704++;
                return true;
            } else {
                return false;
            }
        } else if (!class361.method2249(arg1, 54, arg5, arg0)) {
            return false;
        } else if (class43.method298(arg3 ^ 0xFFFFFFB2, arg2)) {
            class619.field8704++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
    public static final void method3282(boolean arg0) {
        class673.method3850(class609.field8613, (byte) 86);
        field8010++;
        class95.field1353++;
        if (class354.field5151 && class172.field2674) {
            if (!arg0) {
                int var1 = 0;
                int var2 = 0;
                if (class419.field6265) {
                    var1 = class210.method1422(true);
                    var2 = class407.method2589((byte) -45);
                }
                int var3 = class632.field8840.method2697(4212) + var1;
                int var4 = var2 + class632.field8840.method2698(0);
                int var5 = var4 - class289.field4114;
                int var6 = var3 - class612.field8649;
                if (var6 < class339.field4933) {
                    var6 = class339.field4933;
                }
                if (var5 < class242.field3518) {
                    var5 = class242.field3518;
                }
                if (var6 + class609.field8613.field549 > class339.field4933 - -class531.field7570.field549) {
                    var6 = class531.field7570.field549 + class339.field4933 - class609.field8613.field549;
                }
                if (class609.field8613.field574 + var5 > class242.field3518 + class531.field7570.field574) {
                    var5 = class242.field3518 + class531.field7570.field574 - class609.field8613.field574;
                }
                int var7 = var6 + class531.field7570.field527 - class339.field4933;
                int var8 = var5 + class531.field7570.field554 - class242.field3518;
                if (class632.field8840.method2701(16384)) {
                    if (class609.field8613.field597 < class95.field1353) {
                        int var10 = var6 - class249.field3612;
                        int var11 = var5 - class112.field1564;
                        if (class609.field8613.field535 < var10 || var10 < -class609.field8613.field535 || class609.field8613.field535 < var11 || (-class609.field8613.field535) > var11) {
                            class439.field6503 = true;
                        }
                    }
                    if (class609.field8613.field624 != null && class439.field6503) {
                        class177 var12 = new class177();
                        var12.field2737 = class609.field8613.field624;
                        var12.field2734 = var8;
                        var12.field2743 = class609.field8613;
                        var12.field2741 = var7;
                        class709.method4025(var12);
                    }
                } else {
                    if (class439.field6503) {
                        class148.method1087(-34848);
                        if (class609.field8613.field615 != null) {
                            class177 var9 = new class177();
                            var9.field2741 = var7;
                            var9.field2737 = class609.field8613.field615;
                            var9.field2743 = class609.field8613;
                            var9.field2745 = class177.field2752;
                            var9.field2734 = var8;
                            class709.method4025(var9);
                        }
                        if (class177.field2752 != null && client.method1887(class609.field8613) != null) {
                            class338.method2156(-117, class609.field8613, class177.field2752);
                        }
                    } else if ((class190.field2881 == 1 || class268.method1716((byte) -57)) && class68.field969 > 2) {
                        class249.method1648(class612.field8649 + class249.field3612, class289.field4114 + class112.field1564, -128);
                    } else if (class267.method1713((byte) -114)) {
                        class249.method1648(class612.field8649 + class249.field3612, class289.field4114 + class112.field1564, -127);
                    }
                    class609.field8613 = null;
                }
            }
        } else if (class95.field1353 > 1) {
            class609.field8613 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
    public static void method3283(int arg0) {
        field8014 = null;
        if (arg0 < 122) {
            method3282(true);
        }
    }
}
