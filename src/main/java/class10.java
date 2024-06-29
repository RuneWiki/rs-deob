import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class10 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public int field103 = 128;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public int field115 = 128;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field107 = -2;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field112 = 0;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field119;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field120;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method52(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lbc;B)V", line = 4)
    public final void method44(class10 arg0, byte arg1) {
        if (arg1 < 25) {
            field112 = -107;
        }
        this.field106 = arg0.field106;
        this.field114 = arg0.field114;
        this.field115 = arg0.field115;
        this.field111 = arg0.field111;
        this.field116 = arg0.field116;
        this.field103 = arg0.field103;
        field109++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Z", line = 22)
    public static final boolean method45(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method48(111);
        }
        field119++;
        return (class137.method853(arg0 - 1, arg2, arg1) | class517.method2969((byte) 108, arg1, arg2) | class382.method2301((byte) -15, arg2, arg1)) & class65.method492(arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILs;)V", line = 33)
    public static final void method46(int arg0, class402 arg1) {
        class517.field7282[arg0] = arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)I", line = 38)
    public static final int method47(int arg0, String arg1) {
        field105++;
        if (arg0 != -11482) {
            field113 = 98;
        }
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class727.field10184; var2++) {
            if (arg1.equalsIgnoreCase(class4.field34[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 63)
    public static final void method48(int arg0) {
        field104++;
        if (class223.field2944.field619.method444((byte) -126) == 0 && class553.field7772 != class223.field2946) {
            class367.method2253(class509.field7194, -128, 11, false, class108.field1336);
        } else if (arg0 >= 4) {
            class524.method3009(class458.field6407, 2);
            if (class609.field8437 != class223.field2946) {
                class652.method3516(-122);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLha;)V", line = 85)
    public static final void method49(byte arg0, class454 arg1) {
        if (arg0 != -72) {
            field113 = 86;
        }
        field108++;
        if (!(class573.field8011 >= 2 || class138.field1656) || class85.field1090 != null) {
            return;
        }
        String var2;
        if (class138.field1656 && class573.field8011 < 2) {
            var2 = class556.field7800 + class586.field8157.method3261(class416.field5920, (byte) 82) + class741.field10370 + " ->";
        } else if (class20.field259 && class333.field4297.method2924(-30303, 81) && class573.field8011 > 2) {
            var2 = class554.method3151(class750.field10502, false);
        } else {
            class718 var3 = class750.field10502;
            if (var3 == null) {
                return;
            }
            var2 = class554.method3151(var3, false);
            int[] var4 = null;
            if (class289.method1731(var3.field10134, (byte) -32)) {
                var4 = class190.field2488.method3944(256, (int) var3.field10137).field2141;
            } else if (var3.field10129 != -1) {
                var4 = class190.field2488.method3944(arg0 ^ 0xFFFFFEB8, var3.field10129).field2141;
            } else if (class589.method3275(var3.field10134, (byte) -88)) {
                class247 var7 = (class247) class563.field7875.method3248((long) ((int) var3.field10137), arg0 ^ 0xFFFFFFB8);
                if (var7 != null) {
                    class124 var8 = var7.field3158;
                    class155 var9 = var8.field1486;
                    if (var9.field1929 != null) {
                        var9 = var9.method968((byte) -76, class461.field6637);
                    }
                    if (var9 != null) {
                        var4 = var9.field1951;
                    }
                }
            } else if (class638.method3464(var3.field10134, arg0 ^ 0xFFFFFFD7)) {
                Object var5 = null;
                class290 var6;
                if (var3.field10134 == 1002) {
                    var6 = class358.field5112.method890((int) var3.field10137, false);
                } else {
                    var6 = class358.field5112.method890((int) (var3.field10137 >>> 32 & 0x7FFFFFFFL), false);
                }
                if (var6.field3685 != null) {
                    var6 = var6.method1739((byte) -120, class461.field6637);
                }
                if (var6 != null) {
                    var4 = var6.field3734;
                }
            }
            if (var4 != null) {
                var2 = var2 + class162.method1000(25078, var4);
            }
        }
        if (class573.field8011 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class573.field8011 - 2) + class586.field8150.method3261(class416.field5920, (byte) 82);
        }
        if (class267.field3382 != null) {
            class423 var11 = class267.field3382.method2704(arg1, 27006);
            if (var11 == null) {
                var11 = class100.field1234;
            }
            var11.method2516(class267.field3382.field6527, var2, class440.field6181, class733.field10239, class239.field3078, class267.field3382.field6514, class267.field3382.field6499, class289.field3681, class267.field3382.field6621, -106, class367.field5193, class267.field3382.field6569, class403.field5659, class267.field3382.field6566, class216.field2731);
            class266.method1600(class440.field6181[2], class440.field6181[1], class440.field6181[3], class440.field6181[0], (byte) -128);
        } else if (class223.field2942 != null && class702.field9902 == class400.field5535) {
            int var10 = class100.field1234.method2504(class289.field3681, class216.field2731, var2, 0, (byte) 50, class409.field5776 + 16, class349.field4521 + 4, 16777215, class367.field5193, class733.field10239);
            class266.method1600(class111.field1373.method453(-1, var2) + var10, class409.field5776, 16, class349.field4521 + 4, (byte) -128);
            return;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 199)
    public static final boolean method50(String arg0, byte arg1) {
        if (arg1 != -72) {
            field112 = 35;
        }
        field110++;
        return class600.method3305(arg0, field120 == null ? (field120 = method52("ws")) : field120, arg1 - 25632);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V", line = 240)
    public class10(int arg0) {
        this.field106 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIII)V", line = 248)
    private class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field111 = arg3;
        this.field115 = arg2;
        this.field116 = arg5;
        this.field103 = arg1;
        this.field114 = arg4;
        this.field106 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Lbc;", line = 225)
    public final class10 method51(byte arg0) {
        if (arg0 >= -90) {
            return null;
        } else {
            field118++;
            return new class10(this.field106, this.field103, this.field115, this.field111, this.field114, this.field116);
        }
    }
}
