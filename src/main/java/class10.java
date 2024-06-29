import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 extends class103 {

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "[J")
    private long[] field254 = new long[10];

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lu;")
    public static class135 field236 = class87.method676((byte) -110, "(X100(U(Y");

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Lu;")
    public static class135 field241 = class87.method676((byte) -101, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Z")
    public static boolean field244 = false;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lu;")
    private static class135 field235 = class87.method676((byte) -85, "Loaded gamescreen");

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "Lu;")
    public static class135 field252 = class87.method676((byte) -42, "null");

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field242 = 0;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "Lu;")
    public static class135 field253 = field235;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "J")
    public static long field262 = 0L;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "J")
    private long field257;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Ls;")
    public static class123 field247;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Lae;")
    public static class6 field255;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "[Lbc;")
    public static class11[] field261;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)I")
    public final int method52(int arg0, int arg1, int arg2) {
        field256++;
        int var4 = this.field249;
        this.field249 = 300;
        int var5 = this.field245;
        this.field245 = 1;
        this.field257 = class14.method95(6);
        if (this.field254[this.field248] == 0L) {
            this.field245 = var5;
            this.field249 = var4;
        } else if (this.field254[this.field248] < this.field257) {
            this.field249 = (int) ((long) (arg2 * 2560) / (this.field257 - this.field254[this.field248]));
        }
        if (this.field249 < 25) {
            this.field249 = 25;
        }
        if (this.field249 > 256) {
            this.field249 = 256;
            this.field245 = (int) ((long) arg2 - (this.field257 - this.field254[this.field248]) / 10L);
        }
        if (this.field245 > arg2) {
            this.field245 = arg2;
        }
        this.field254[this.field248] = this.field257;
        this.field248 = (this.field248 + 1) % 10;
        if (this.field245 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field254[var6] != 0L) {
                    this.field254[var6] += this.field245;
                }
            }
        }
        int var7 = 0;
        if (this.field245 < arg0) {
            this.field245 = arg0;
        }
        class96.method795((long) this.field245, 112);
        while (this.field259 < 256) {
            this.field259 += this.field249;
            var7++;
        }
        if (arg1 <= 78) {
            return 62;
        } else {
            this.field259 &= 0xFF;
            return var7;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    public static final void method53(int arg0) {
        field240++;
        if (arg0 != 408) {
            method59((byte) -94, null);
        }
        if (class131.field3135 < 2 && class47.field1125 == 0 && !class8.field143) {
            return;
        }
        class135 var1;
        if (class47.field1125 == 1 && class131.field3135 < 2) {
            var1 = class107.method867(arg0 - 406, new class135[] { class108.field2607, class56.field1348, class141.field3433, class14.field349 });
        } else if (class8.field143 && class131.field3135 < 2) {
            var1 = class107.method867(2, new class135[] { class30.field741, class56.field1348, class4.field102, class14.field349 });
        } else {
            var1 = class108.field2599[class131.field3135 - 1];
        }
        if (class131.field3135 > 2) {
            var1 = class107.method867(arg0 ^ 0x19A, new class135[] { var1, class97.field2360, class68.method547(arg0 - 409, class131.field3135 + -2), class58.field1424 });
        }
        class63.field1579.method136(var1, 4, 15, 16777215, true, class126.field2998 / 1000);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public final void method54(byte arg0) {
        this.field245 = 1;
        this.field249 = 256;
        this.field259 = 0;
        field237++;
        this.field257 = class14.method95(119);
        int var2 = 0;
        if (arg0 >= 91) {
            while (var2 < 10) {
                this.field254[var2] = this.field257;
                var2++;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)Lhf;")
    public static final class55 method55(byte arg0, int arg1) {
        field243++;
        class55 var2 = (class55) class106.field2555.method239(arg0 + 9201, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class55.field1291.method324(0, arg1, 9);
        class55 var4 = new class55();
        var4.field1296 = arg1;
        if (var3 != null) {
            var4.method420(89, new class59(var3));
        }
        if (arg0 == 124) {
            var4.method422((byte) -35);
            class106.field2555.method241(var4, 0, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lba;B)V")
    public static final void method56(class9 arg0, byte arg1) {
        field250++;
        arg0.field159 = arg0.field232;
        if (arg0.field195 == 0) {
            arg0.field218 = 0;
            return;
        }
        if (arg0.field170 != -1 && arg0.field177 == 0) {
            class84 var2 = class17.method108(arg0.field170, 0);
            if (arg0.field187 > 0 && var2.field2004 == 0) {
                arg0.field218++;
                return;
            }
            if (arg0.field187 <= 0 && var2.field1986 == 0) {
                arg0.field218++;
                return;
            }
        }
        int var3 = arg0.field173;
        int var4 = arg0.field172;
        int var5 = arg0.field162[arg0.field195 - 1] * 128 + arg0.field210 * 64;
        int var6 = arg0.field192[arg0.field195 - 1] * 128 + arg0.field210 * 64;
        if (var6 - var3 > 256 || var6 - var3 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
            arg0.field173 = var6;
            arg0.field172 = var5;
            return;
        }
        if (var3 >= var6) {
            if (var6 < var3) {
                if (var4 < var5) {
                    arg0.field213 = 768;
                } else if (var5 < var4) {
                    arg0.field213 = 256;
                } else {
                    arg0.field213 = 512;
                }
            } else if (var5 > var4) {
                arg0.field213 = 1024;
            } else if (var5 < var4) {
                arg0.field213 = 0;
            }
        } else if (var4 < var5) {
            arg0.field213 = 1280;
        } else if (var5 >= var4) {
            arg0.field213 = 1536;
        } else {
            arg0.field213 = 1792;
        }
        int var7 = arg0.field191;
        int var8 = arg0.field213 - arg0.field230 & 0x7FF;
        int var9 = 4;
        boolean var10 = true;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field198;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field196;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field203;
        }
        if (var7 == -1) {
            var7 = arg0.field198;
        }
        arg0.field159 = var7;
        if (arg0 instanceof class111) {
            var10 = ((class111) arg0).field2697.field1317;
        }
        if (var10) {
            if (arg0.field230 != arg0.field213 && arg0.field227 == -1 && arg0.field216 != 0) {
                var9 = 2;
            }
            if (arg0.field195 > 2) {
                var9 = 6;
            }
            if (arg0.field195 > 3) {
                var9 = 8;
            }
            if (arg0.field218 > 0 && arg0.field195 > 1) {
                var9 = 8;
                arg0.field218--;
            }
        } else {
            if (arg0.field195 > 1) {
                var9 = 6;
            }
            if (arg0.field195 > 2) {
                var9 = 8;
            }
            if (arg0.field218 > 0 && arg0.field195 > 1) {
                arg0.field218--;
                var9 = 8;
            }
        }
        if (arg0.field206[arg0.field195 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 > var4) {
            arg0.field172 += var9;
            if (arg0.field172 > var5) {
                arg0.field172 = var5;
            }
        } else if (var4 > var5) {
            arg0.field172 -= var9;
            if (var5 > arg0.field172) {
                arg0.field172 = var5;
            }
        }
        if (arg1 != 5) {
            method56(null, (byte) -46);
        }
        if (var3 < var6) {
            arg0.field173 += var9;
            if (arg0.field173 > var6) {
                arg0.field173 = var6;
            }
        } else if (var3 > var6) {
            arg0.field173 -= var9;
            if (var6 > arg0.field173) {
                arg0.field173 = var6;
            }
        }
        if (arg0.field173 == var6 && arg0.field172 == var5) {
            arg0.field195--;
            if (arg0.field187 > 0) {
                arg0.field187--;
            }
        }
        if (var9 >= 8 && arg0.field198 == arg0.field159 && arg0.field178 != -1) {
            arg0.field159 = arg0.field178;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public final void method57(int arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field254[var2] = 0L;
        }
        field239++;
        if (arg0 != 32) {
            method60(-36);
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public static void method58(int arg0) {
        field252 = null;
        field241 = null;
        field253 = null;
        if (arg0 != 1) {
            return;
        }
        field255 = null;
        field235 = null;
        field261 = null;
        field236 = null;
        field247 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLg;)V")
    public static final void method59(byte arg0, class43 arg1) {
        class87.field2079 = arg1;
        field246++;
        if (arg0 != -104) {
            method60(-12);
        }
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)I")
    public static final int method60(int arg0) {
        field251++;
        if (arg0 >= -89) {
            field238 = 68;
        }
        return 19;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class10() {
        this.method54((byte) 100);
    }
}
