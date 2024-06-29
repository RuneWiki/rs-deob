import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class51 extends class110 {

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "Lqd;")
    private class99 field1125;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "Llc;")
    public static class69 field1107 = class69.method470((byte) -124, "@gr2@");

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "[I")
    public static int[] field1106 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field1117 = 0;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field1124 = -1;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "[I")
    public static int[] field1110 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "[B")
    public static byte[] field1105 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "[I")
    public static int[] field1122 = new int[200];

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "[I")
    public static int[] field1102 = new int[99];

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field1126 = -1;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "J")
    public static long field1128;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "Lua;")
    private class116 field1127;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "Lqc;")
    public static class98 field1123;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "Z")
    private boolean field1116;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "Z")
    private boolean field1120;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "[B")
    private byte[] field1104;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "[I")
    public static int[] field1101;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBLqd;)V")
    public static final void method336(int arg0, byte arg1, class99 arg2) {
        class69.method493(arg2, arg1 ^ 0x62);
        if (arg1 == 118) {
            field1109++;
            if (arg0 > 0) {
                class103.field2240 = new class36(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZBI[B)V")
    public final void method3(boolean arg0, byte arg1, int arg2, byte[] arg3) {
        this.field1127 = this.field1125.method753(-73);
        if (arg1 >= -87) {
            this.field1104 = null;
        }
        field1114++;
        if (this.field1127 == null) {
            return;
        }
        if (arg2 == 0) {
            arg2 = 1;
        }
        this.field1103 = class121.method890(arg2, (byte) -121);
        this.field1104 = arg3;
        this.field1120 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public final void method4(int arg0) {
        if (this.field1116) {
            try {
                class58.method359(this.field1125.field2178, "midibox.src=\"c:\\silence.mid\";", 89);
            } catch (Throwable var2) {
            }
            this.field1116 = false;
        }
        if (arg0 > -107) {
            this.method5((byte) -70, -82, -67);
        }
        field1121++;
        this.field1127 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method1(int arg0) {
        field1113++;
        if (arg0 < 94) {
            this.field1103 = -86;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)V")
    public final void method5(byte arg0, int arg1, int arg2) {
        field1108++;
        if (arg1 == 0) {
            arg1 = 1;
        }
        int var4 = class121.method890(arg1, (byte) -113) - arg2;
        if (arg0 >= -81) {
            this.field1116 = true;
        }
        if (this.field1127 != null) {
            this.field1103 = var4;
        } else if (this.field1116) {
            try {
                class58.method359(this.field1125.field2178, "midibox.volume=" + var4 + ";", 107);
                return;
            } catch (Throwable var5) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        field1115++;
        if (this.field1127 == null || (this.field1127.field2504 == 0 || !arg0)) {
            return;
        }
        if (this.field1127.field2504 == 1) {
            class97 var2 = (class97) this.field1127.field2505;
            try {
                var2.method737(this.field1104, this.field1104.length, 0, (byte) -11);
                var2.method735(0);
                try {
                    class58.method359(this.field1125.field2178, "midibox.loop=" + (this.field1120 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method733(107).getPath() + "\"; midibox.volume=" + this.field1103 + ";", 84);
                    this.field1116 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method735(0);
                } catch (Exception var3) {
                }
            }
        }
        this.field1127 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IJ)V")
    public static final void method337(int arg0, long arg1) {
        field1111++;
        if (arg1 == 0L) {
            return;
        }
        if (class104.field2271 >= 100) {
            class87.method619(class13.field258, true, 0, class49.field992);
            return;
        }
        class69 var3 = class49.method322(101, arg1).method460(false);
        for (int var4 = arg0; var4 < class104.field2271; var4++) {
            if (class22.field470[var4] == arg1) {
                class87.method619(class46.method305(arg0 + 20025, new class69[] { var3, class18.field374 }), true, 0, class49.field992);
                return;
            }
        }
        for (int var5 = 0; var5 < class43.field852; var5++) {
            if (class56.field1186[var5] == arg1) {
                class87.method619(class46.method305(20025, new class69[] { class66.field1385, var3, class76.field1714 }), true, 0, class49.field992);
                return;
            }
        }
        class24.field496++;
        class22.field470[class104.field2271++] = arg1;
        class110.field2418 = true;
        class26.field557.method178(arg0 - 5, 186);
        class26.field557.method664(arg1, 40);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public final void method6(byte arg0) {
        if (arg0 > -106) {
            this.method1(101);
        }
        field1118++;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public static void method338(int arg0) {
        field1110 = null;
        field1102 = null;
        field1105 = null;
        if (arg0 != -5683) {
            return;
        }
        field1123 = null;
        field1107 = null;
        field1106 = null;
        field1122 = null;
        field1101 = null;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lqd;)V")
    public class51(class99 arg0) {
        this.field1125 = arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1102[var1] = var0 / 4;
        }
        field1130 = -1;
        field1128 = 0L;
    }
}
