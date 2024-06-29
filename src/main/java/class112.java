import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class112 extends class62 {

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "Lbd;")
    private class11 field2819;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "Lpd;")
    public static class94 field2813 = class28.method249(96, "welle2:");

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "[I")
    public static int[] field2826 = new int[256];

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lpd;")
    private static class94 field2812 = class28.method249(116, "No reply from loginserver)3");

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "Lpd;")
    public static class94 field2825 = class28.method249(-48, "Freund hinzuf-Ugen");

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "Lpd;")
    public static class94 field2821 = field2812;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "Z")
    public static boolean field2829 = false;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "[I")
    public static int[] field2823 = new int[1000];

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "Lpd;")
    public static class94 field2836 = class28.method249(-61, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field2837 = 255;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    private int field2816;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Ltd;")
    private class118 field2834;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Lbd;")
    public static class11 field2832;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "Lc;")
    public static class16 field2835;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "Z")
    private boolean field2811;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "Z")
    private boolean field2820;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "[B")
    private byte[] field2833;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "[I")
    public static int[] field2828;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V", line = 14)
    public final void method383(byte arg0) {
        field2824++;
        if (this.field2834 == null) {
            return;
        }
        if (arg0 > -20) {
            field2837 = -120;
        }
        if (this.field2834.field2944 == 0) {
            return;
        }
        if (this.field2834.field2944 == 1) {
            class104 var2 = (class104) this.field2834.field2946;
            try {
                var2.method768(this.field2833.length, 83, 0, this.field2833);
                var2.method771(115);
                try {
                    class129.method1018(-23874, "midibox.loop=" + (this.field2820 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method773(1).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field2816 + ";", this.field2819.field277);
                    this.field2811 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method771(112);
                } catch (Exception var3) {
                }
            }
        }
        this.field2834 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI[BI)V", line = 59)
    public final void method385(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field2815++;
        this.field2834 = this.field2819.method68(arg1 + 127);
        if (this.field2834 == null) {
            return;
        }
        if (arg3 == 0) {
            arg3 = 1;
        }
        if (arg1 != -1) {
            this.method390(85, -83);
        }
        this.field2816 = class2.method15(arg3, false);
        this.field2833 = arg2;
        this.field2820 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)Lpd;", line = 82)
    public static final class94 method830(int arg0, boolean arg1) {
        field2827++;
        if (!arg1) {
            method831(true, -91);
        }
        return class4.method20(new class94[] { class51.method403(arg0 >> 24 & 0xFF, arg1), class20.field561, class51.method403(arg0 >> 16 & 0xFF, true), class20.field561, class51.method403(arg0 >> 8 & 0xFF, arg1), class20.field561, class51.method403(arg0 & 0xFF, true) }, true);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)V", line = 100)
    public static final void method831(boolean arg0, int arg1) {
        for (int var2 = 0; var2 < class115.field2906; var2++) {
            class80 var4 = class28.field803[class95.field2442[var2]];
            int var5 = (class95.field2442[var2] << 14) + 536870912;
            if (var4 != null && var4.method48((byte) -125) && var4.field2037.field2846 == arg0 && var4.field2037.method835(20385)) {
                int var6 = var4.field177 >> 7;
                int var7 = var4.field222 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field207 == 1 && (var4.field177 & 0x7F) == 64 && (var4.field222 & 0x7F) == 64) {
                        if (class92.field2356[var6][var7] == class23.field605) {
                            continue;
                        }
                        class92.field2356[var6][var7] = class23.field605;
                    }
                    if (!var4.field2037.field2844) {
                        var5 += Integer.MIN_VALUE;
                    }
                    class64.field1585.method177(class64.field1589, var4.field177, var4.field222, class25.method226(class64.field1589, var4.field222 + (var4.field207 - 1) * 64, (var4.field207 + -1) * 64 + var4.field177, (byte) -50), (var4.field207 - 1) * 64 + 60, var4, var4.field187, var5, var4.field200);
                }
            }
        }
        field2831++;
        int var3 = 41 / ((63 - arg1) / 52);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V", line = 153)
    public final void method390(int arg0, int arg1) {
        if (arg1 == 59) {
            field2830++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V", line = 163)
    public static void method832(int arg0) {
        field2825 = null;
        field2828 = null;
        field2813 = null;
        field2823 = null;
        field2821 = null;
        field2835 = null;
        if (arg0 != 64) {
            method833(63);
        }
        field2832 = null;
        field2826 = null;
        field2812 = null;
        field2836 = null;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V", line = 183)
    public final void method382(int arg0) {
        if (this.field2811) {
            try {
                class129.method1018(-23874, "midibox.src=\"c:/silence.mid\";", this.field2819.field277);
            } catch (Throwable var2) {
            }
            this.field2811 = false;
        }
        if (arg0 != 0) {
            this.field2811 = false;
        }
        this.field2834 = null;
        field2822++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 215)
    public final void method386(int arg0) {
        field2817++;
        if (arg0 != -8594) {
            this.field2819 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBI)V", line = 237)
    public final void method388(int arg0, byte arg1, int arg2) {
        field2814++;
        if (arg0 == 0) {
            arg0 = 1;
        }
        int var4 = class2.method15(arg0, false) - arg2;
        if (arg1 >= -15) {
            method831(false, 73);
        }
        if (this.field2834 != null) {
            this.field2816 = var4;
        } else if (this.field2811) {
            try {
                class129.method1018(-23874, "midibox.volume=" + var4 + ";", this.field2819.field277);
            } catch (Throwable var5) {
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lbd;)V", line = 283)
    public class112(class11 arg0) {
        this.field2819 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 292)
    public static final void method833(int arg0) {
        field2818++;
        for (int var1 = 0; var1 < class66.field1613; var1++) {
            int var2 = class81.field2060[var1];
            class80 var3 = class28.field803[var2];
            int var4 = class99.field2502.method943(-1025);
            if ((var4 & 0x1) != 0) {
                var3.field198 = class99.field2502.method961(arg0 ^ 0xFFFFFF5F);
                var3.field215 = class99.field2502.method938((byte) 120);
            }
            if ((var4 & 0x20) != 0) {
                int var5 = class99.field2502.method961(-73);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class99.field2502.method942(false);
                if (var3.field210 == var5 && var5 != -1) {
                    int var7 = class70.method519(5, var5).field1419;
                    if (var7 == 1) {
                        var3.field192 = var6;
                        var3.field164 = 0;
                        var3.field180 = 0;
                        var3.field214 = 0;
                    }
                    if (var7 == 2) {
                        var3.field164 = 0;
                    }
                } else if (var5 == -1 || var3.field210 == -1 || class70.method519(5, var5).field1418 >= class70.method519(5, var3.field210).field1418) {
                    var3.field164 = 0;
                    var3.field214 = 0;
                    var3.field210 = var5;
                    var3.field161 = var3.field162;
                    var3.field192 = var6;
                    var3.field180 = 0;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field190 = class99.field2502.method941(-957401312);
                int var8 = class99.field2502.method953((byte) -125);
                if (var3.field190 == 65535) {
                    var3.field190 = -1;
                }
                var3.field220 = 0;
                var3.field169 = var8 >> 16;
                var3.field211 = 0;
                var3.field233 = (var8 & 0xFFFF) + class26.field699;
                if (class26.field699 < var3.field233) {
                    var3.field211 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field205 = class99.field2502.method961(arg0 ^ 0xFFFFFF74);
                if (var3.field205 == 65535) {
                    var3.field205 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var9 = class99.field2502.method963(-15850);
                int var10 = class99.field2502.method963(-15850);
                var3.method49(class26.field699, var9, var10, -125);
                var3.field166 = class26.field699 + 300;
                var3.field212 = class99.field2502.method942(false);
                var3.field224 = class99.field2502.method963(-15850);
            }
            if ((var4 & 0x40) != 0) {
                var3.field186 = class99.field2502.method937(arg0 ^ 0xFE);
                var3.field189 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field2037 = class40.method301(class99.field2502.method938((byte) -105), (byte) 16);
                var3.field229 = var3.field2037.field2856;
                var3.field201 = var3.field2037.field2883;
                var3.field221 = var3.field2037.field2857;
                var3.field207 = var3.field2037.field2854;
                var3.field179 = var3.field2037.field2869;
                var3.field160 = var3.field2037.field2882;
                var3.field193 = var3.field2037.field2847;
                var3.field158 = var3.field2037.field2889;
                var3.field209 = var3.field2037.field2867;
            }
            if ((var4 & 0x8) != 0) {
                int var11 = class99.field2502.method958((byte) -95);
                int var12 = class99.field2502.method942(false);
                var3.method49(class26.field699, var11, var12, arg0 ^ 0x95);
                var3.field166 = class26.field699 + 300;
                var3.field212 = class99.field2502.method942(false);
                var3.field224 = class99.field2502.method963(-15850);
            }
        }
        if (arg0 != 255) {
            method833(-77);
        }
    }
}
