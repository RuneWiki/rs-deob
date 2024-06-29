import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class739 extends class515 {

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Lat;")
    private class398 field10871 = new class398();

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    private int field10877 = 256;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    private int field10881 = 0;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    private int field10883 = 256;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    private int field10868;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "[Ljava/lang/String;")
    private static final String[] field10884 = new String[] { method5384(method5383("bR\u007f*")), method5384(method5383("gN=\u0000{")), method5384(method5383("w\t=h.")), method5384(method5383("gN=\f{")), method5384(method5383("gN=\b{")), method5384(method5383("gN=\u0002{")), method5384(method5383("gN=\u0003{")), method5384(method5383("gN=\n{")), method5384(method5383("{U")), method5384(method5383("gN=\u000f{")), method5384(method5383("gN=\u000e{")), method5384(method5383("gN=z:bNgx{")), method5384(method5383("gN=\u0007{")), method5384(method5383("gN=\u0017{")), method5384(method5383("gN=\u0001{")), method5384(method5383("gN=\u000b{")), method5384(method5383("gN=\r{")), method5384(method5383("gN=\u0016{")), method5384(method5383("gN=\u0005{")), method5384(method5383("gN=\t{")) };

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field10858;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field10859;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field10860;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public static int field10861;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public static int field10862;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field10863;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    public static int field10864;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field10865;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field10866;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field10867;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    public static int field10869;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field10870;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    public static int field10872;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public static int field10874;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public static int field10875;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field10876;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field10878;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
    private int field10882;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "Lhk;")
    public static class107 field10873;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Z")
    private boolean field10879;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "Z")
    private boolean field10880;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)I", line = 9)
    public final synchronized int method5371(int arg0) {
        try {
            if (arg0 < 69) {
                return -126;
            } else {
                field10863++;
                return this.field10881;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10884[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V", line = 22)
    public static final void method5372(int arg0) {
        try {
            field10862++;
            int var1 = class691.field9962;
            int[] var2 = class239.field3685;
            for (int var3 = arg0; var3 < var1; var3++) {
                class738 var4 = class33.field395[var2[var3]];
                if (var4 != null) {
                    class90.method884(1676468897, var4.method804(true), var4);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10884[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLmia;)V", line = 48)
    public final synchronized void method5373(byte arg0, class66 arg1) {
        try {
            if (arg0 > -49) {
                this.method5371(-121);
            }
            field10865++;
            while (this.field10881 >= 100) {
                this.field10871.method3219(-81);
                this.field10881--;
            }
            this.field10871.method3220(arg1, 0);
            this.field10881++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10884[5] + arg0 + ',' + (arg1 == null ? field10884[0] : field10884[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()I", line = 67)
    public final int method1108() {
        try {
            field10869++;
            return 1;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10884[14] + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V", line = 75)
    public final void method5374(int arg0, int arg1) {
        try {
            field10861++;
            this.field10883 = arg1;
            this.field10877 = arg1;
            if (arg0 != 1) {
                this.field10882 = -80;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10884[17] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V", line = 90)
    public final synchronized void method5375(boolean arg0, int arg1) {
        try {
            if (arg1 == 6) {
                field10859++;
                this.field10880 = arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10884[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 103)
    public final synchronized void method1116(int arg0) {
        try {
            field10872++;
            if (!this.field10880) {
                while (true) {
                    class66 var2 = this.method5381(-99);
                    if (var2 == null) {
                        if (this.field10879) {
                            this.method4173(-1);
                            class581.field8374.method4429(-89);
                        }
                        return;
                    }
                    if (var2.field904[0].length - this.field10882 > arg0) {
                        this.field10882 += arg0;
                        return;
                    }
                    arg0 -= var2.field904[0].length - this.field10882;
                    this.method5379((byte) 49);
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10884[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V", line = 144)
    public final synchronized void method5376(boolean arg0) {
        try {
            field10864++;
            this.field10879 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10884[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "(I)V", line = 152)
    public static void method5377(int arg0) {
        try {
            if (arg0 == 1) {
                field10873 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10884[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZID)Lmia;", line = 163)
    public final class66 method5378(boolean arg0, int arg1, double arg2) {
        try {
            if (!arg0) {
                return null;
            }
            field10860++;
            long var5 = (long) (this.field10868 << 0 | arg1);
            class66 var7 = (class66) class581.field8374.method4427(107, var5);
            if (var7 == null) {
                var7 = new class66(new short[this.field10868][arg1], arg2);
            } else {
                var7.field905 = arg2;
                class581.field8374.method4430((byte) 58, var5);
            }
            return var7;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field10884[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "([III)V", line = 188)
    public final synchronized void method1097(int[] arg0, int arg1, int arg2) {
        try {
            field10875++;
            if (!this.field10880) {
                if (this.method5381(-121) != null) {
                    int var4 = arg1 + arg2;
                    if (class426.field6729) {
                        var4 <<= 0x1;
                    }
                    byte var5 = 0;
                    byte var6 = 0;
                    if (this.field10868 == 2) {
                        var6 = 1;
                    }
                    while (arg1 < var4) {
                        class66 var7 = this.method5381(-100);
                        if (var7 == null) {
                            return;
                        }
                        short[][] var8 = var7.field904;
                        while (arg1 < var4 && var8[0].length > this.field10882) {
                            if (class426.field6729) {
                                arg0[arg1++] = var8[var5][this.field10882] * this.field10877;
                                arg0[arg1++] = var8[var6][this.field10882] * this.field10883;
                            } else {
                                int var10001 = arg1++;
                                arg0[var10001] += var8[var5][this.field10882] * this.field10877 + var8[var6][this.field10882] * this.field10883;
                            }
                            this.field10882++;
                        }
                        if (this.field10882 >= var8[0].length) {
                            this.method5379((byte) 116);
                        }
                    }
                } else if (this.field10879) {
                    this.method4173(-1);
                    class581.field8374.method4429(-115);
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field10884[1] + (arg0 == null ? field10884[0] : field10884[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 253)
    private final synchronized void method5379(byte arg0) {
        try {
            field10878++;
            if (arg0 <= 46) {
                field10858 = 122;
            }
            class66 var2 = this.method5381(-83);
            if (var2 != null) {
                var2.method4173(-1);
                this.field10881--;
                this.field10882 = 0;
                class581.field8374.method4428((byte) 42, var2, var2.method695(-12131));
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10884[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()Lef;", line = 273)
    public final class515 method1134() {
        try {
            field10866++;
            return null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10884[6] + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()Lef;", line = 282)
    public final class515 method1136() {
        try {
            field10874++;
            return null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10884[12] + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lha;IIIIIIZZ)V", line = 293)
    public static final void method5380(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class120.field1734 = arg0;
        class586.field8501 = arg1;
        class9.field103 = class586.field8501 > 1 && class120.field1734.method269();
        class165.field2688 = arg2;
        class152.field2131 = 0x1 << class165.field2688;
        class316.field5139 = class152.field2131 >> 1;
        Math.sqrt((double) (class316.field5139 * class316.field5139 + class316.field5139 * class316.field5139));
        class612.field8806 = arg3;
        class150.field2096 = arg4;
        class117.field1705 = arg5;
        class297.field4835 = arg6;
        class338.field5509 = class50.method512(false);
        class76.method791(true);
        class609.field8771 = new class290[arg3][class150.field2096][class117.field1705];
        class493.field7420 = new class293[arg3];
        if (arg7) {
            class192.field3020 = new int[class150.field2096][class117.field1705];
            class54.field691 = new byte[class150.field2096][class117.field1705];
            class148.field2073 = new short[class150.field2096][class117.field1705];
            class393.field6261 = new class290[1][class150.field2096][class117.field1705];
            class757.field11125 = new class293[1];
        } else {
            class192.field3020 = null;
            class54.field691 = null;
            class148.field2073 = null;
            class393.field6261 = null;
            class757.field11125 = null;
        }
        if (arg8) {
            class328.field5375 = new long[arg3][arg4][arg5];
            class782.field11417 = new class610[65535];
            class537.field7884 = new boolean[65535];
            class642.field9210 = 0;
        } else {
            class328.field5375 = null;
            class782.field11417 = null;
            class537.field7884 = null;
            class642.field9210 = 0;
        }
        class492.method3725(false);
        class42.field476 = new class693[2];
        class50.field608 = new class693[2];
        class570.field8262 = new class693[2];
        class651.field9327 = new class693[10000];
        class690.field9955 = 0;
        class360.field5810 = new class693[5000];
        class33.field391 = 0;
        class213.field3363 = new class185[5000];
        class251.field3843 = 0;
        class441.field6890 = new boolean[class297.field4835 + class297.field4835 + 1][class297.field4835 + class297.field4835 + 1];
        class483.field7334 = new boolean[class297.field4835 + class297.field4835 + 2][class297.field4835 + class297.field4835 + 2];
        class528.field7782 = new int[class297.field4835 + class297.field4835 + 2];
        class239.field3687 = class239.field3686;
        if (class9.field103) {
            class245.field3795 = new boolean[arg3][class297.field4835 + class297.field4835 + 1][class297.field4835 + class297.field4835 + 1];
            class590.field8555 = new boolean[arg3][][];
            if (class780.field11382 != null) {
                class189.method1760();
            }
            class780.field11382 = new class415[class586.field8501];
            class120.field1734.method147(class780.field11382.length + 1);
            class120.field1734.method234(0);
            for (int var9 = 0; var9 < class780.field11382.length; var9++) {
                class780.field11382[var9] = new class415(var9 + 1, class120.field1734);
                (new Thread(class780.field11382[var9], field10884[8] + var9)).start();
            }
            byte var10;
            if (class586.field8501 == 2) {
                var10 = 4;
                class582.field8380 = 2;
            } else if (class586.field8501 == 3) {
                var10 = 6;
                class582.field8380 = 3;
            } else {
                var10 = 8;
                class582.field8380 = 4;
            }
            class764.field11209 = new class172[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class764.field11209[var11] = new class172(class503.field7517[class586.field8501 - 2][var11]);
            }
        } else {
            class582.field8380 = 1;
        }
        class498.field7471 = new int[class582.field8380 - 1];
        class721.field10578 = new int[class582.field8380 - 1];
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I)V", line = 459)
    public class739(int arg0) {
        try {
            this.field10868 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10884[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)Lmia;", line = 415)
    private final synchronized class66 method5381(int arg0) {
        try {
            field10870++;
            if (arg0 >= -68) {
                this.field10877 = -99;
            }
            return (class66) this.field10871.method3228(11);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10884[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)D", line = 426)
    public final synchronized double method5382(int arg0) {
        try {
            field10867++;
            if (arg0 != 0) {
                this.method5373((byte) -118, null);
            }
            if (this.field10881 < 1) {
                return -1.0D;
            } else {
                class66 var2 = (class66) this.field10871.method3228(11);
                return var2 == null ? -1.0D : (double) (-((float) var2.field904[0].length / (float) class210.field3321)) + var2.field905;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10884[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5383(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5384(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
