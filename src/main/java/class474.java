import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class474 extends class539 {

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    public int field6625 = 0;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "Lkb;")
    private class634 field6615;

    @OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
    public int field6626;

    @OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
    public int field6634;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Lgj;")
    private class580 field6607;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    public int field6624;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public int field6613;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "F")
    public float field6611;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "[I")
    private int[] field6622;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field6610 = 0;

    @OriginalMember(owner = "client!cn", name = "I", descriptor = "[I")
    public static int[] field6629 = new int[8];

    @OriginalMember(owner = "client!cn", name = "G", descriptor = "[Ljr;")
    public static class96[] field6627 = new class96[2048];

    @OriginalMember(owner = "client!cn", name = "H", descriptor = "B")
    public static byte field6628;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "F")
    public static float field6619;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!cn", name = "J", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!cn", name = "K", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!cn", name = "L", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!cn", name = "M", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "Liq;")
    private class555 field6618;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6623;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6609;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V", line = 7)
    public final void method2688(int arg0, int arg1) {
        field6621++;
        this.field6623.method3417(arg0 * 4 + 3);
        this.field6623.method3419(-1);
        if (arg1 != -1273) {
            method2690(-96, -126);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 19)
    public static final String method2689(int arg0, byte arg1) {
        field6614++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 <= 18) {
            return null;
        } else if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class9.field167.method42(class666.field9377, 19572) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class9.field169.method42(class666.field9377, 19572) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)Z", line = 48)
    public static final boolean method2690(int arg0, int arg1) {
        if (arg1 != -256197904) {
            method2691((byte) -26);
        }
        field6630++;
        if (class552.field7488[arg0]) {
            return true;
        } else if (class138.field1939.method945(arg0, -9969)) {
            int var2 = class138.field1939.method936(arg0, -118);
            if (var2 == 0) {
                class552.field7488[arg0] = true;
                return true;
            }
            if (class676.field9545[arg0] == null) {
                class676.field9545[arg0] = new class140[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class676.field9545[arg0][var3] == null) {
                    byte[] var4 = class138.field1939.method940(arg0, var3, 0);
                    if (var4 != null) {
                        class140 var5 = class676.field9545[arg0][var3] = new class140();
                        var5.field2100 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method988(new class96(var4), (byte) 62);
                    }
                }
            }
            class552.field7488[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 108)
    public static final void method2691(byte arg0) {
        for (class572 var1 = (class572) class240.field3451.method1270((byte) -25); var1 != null; var1 = (class572) class240.field3451.method1282(0)) {
            if (var1.field7700) {
                var1.method3150(19486);
            }
        }
        field6620++;
        for (class572 var2 = (class572) class572.field7692.method1270((byte) -25); var2 != null; var2 = (class572) class572.field7692.method1282(0)) {
            if (var2.field7700) {
                var2.method3150(19486);
            }
        }
        int var3 = 78 % ((-arg0 - 49) / 55);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI[I)V", line = 144)
    public final void method2692(byte arg0, int arg1, int[] arg2) {
        field6616++;
        if (arg0 != 59) {
            this.method2698(40, 101);
        }
        class659 var4 = this.field6607.method3202((byte) -62, this.field6625 * 3);
        Buffer var5 = var4.method779((byte) -20, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field6607.method3212(var5, (byte) 61);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3418()) {
            label99: for (int var18 = 0; var18 < arg1; var18++) {
                int var20 = arg2[var18];
                short[] var21 = this.field6615.field8893[var20];
                int var22 = this.field6622[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var21.length <= var24) {
                                continue label99;
                            }
                            if ((var22 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    var6.method3425(var26);
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label124: for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = arg2[var10];
                int var12 = this.field6622[var11];
                short[] var13 = this.field6615.field8893[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var13.length <= var15) {
                                continue label124;
                            }
                            if ((var12 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                    var6.method3416(var17);
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3426();
        if (!var4.method774(-22324) || var7 <= 0) {
            return;
        }
        this.field6607.method3183((this.field6615.field8880 & 0x7) != 0, 128, this.field6613, (this.field6615.field8880 & 0x8) != 0);
        if (this.field6607.field7972) {
            this.field6607.method410(Integer.MAX_VALUE, this.field6634, this.field6626, this.field6624);
        }
        class367 var19 = this.field6607.method3204(122);
        var19.method2154(1.0F / this.field6611, (byte) 69, 1.0F, 1.0F / this.field6611);
        this.field6607.method3201(-17, class133.field1868);
        this.field6607.method313(this.field6618, 15, 1);
        this.field6607.method348((byte) -62, this.field6615.field8922);
        this.field6607.method318(var9 + 1 - var8, arg0 ^ 0xF82, var7, var8, var4, class47.field697, 0);
        this.field6607.method3198((byte) -87);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(FIIBI)V", line = 301)
    public final void method2693(float arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (this.field6613 != -1) {
            class269 var6 = this.field6607.field9050.method588(-26679, this.field6613);
            int var7 = var6.field3820 & 0xFF;
            if (var7 != 0 && var6.field3803 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((var8 & 0xFF00) * var7 + ((arg1 & 0xFF00) * var10) & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field3810 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg1 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var14 >> 8) + (var12 << 8 & 0xFF00E7) + (var13 & 0xFF00);
            }
        }
        field6617++;
        this.field6623.method3417(arg4 * 4);
        if (arg0 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = (arg1 & 0xFF8C) >> 8;
            int var17 = (int) ((float) var15 * arg0);
            int var18 = arg1 & 0xFF;
            int var19 = (int) ((float) var16 * arg0);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var20 = (int) ((float) var18 * arg0);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var20 | var19 << 8 | var17 << 16;
        }
        if (arg3 != -111) {
            return;
        }
        if (this.field6607.field7999 == 0) {
            this.field6623.method3419((byte) arg1);
            this.field6623.method3419((byte) (arg1 >> 8));
            this.field6623.method3419((byte) (arg1 >> 16));
        } else {
            this.field6623.method3419((byte) (arg1 >> 16));
            this.field6623.method3419((byte) (arg1 >> 8));
            this.field6623.method3419((byte) arg1);
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V", line = 420)
    public static void method2694(byte arg0) {
        field6629 = null;
        field6627 = null;
        if (arg0 != -108) {
            field6627 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(III)Lfaa;", line = 432)
    public static final class140 method2695(int arg0, int arg1, int arg2) {
        if (arg0 != -12025) {
            return null;
        }
        field6631++;
        class140 var3 = class266.method1626(arg1, 125);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field2043 == null || arg2 >= var3.field2043.length) {
            return null;
        } else {
            return var3.field2043[arg2];
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(B)Z", line = 455)
    public static final boolean method2696(byte arg0) {
        field6635++;
        class539 var1 = class487.field6761.field2826.field7306;
        if (arg0 <= 64) {
            method2696((byte) 3);
        }
        if (var1 == null || class487.field6761.field2826 == var1) {
            return false;
        }
        class345 var2 = (class345) var1;
        if (var2.field4983 >= 2000) {
            var2.field4983 -= 2000;
        }
        return var2.field4983 == 1012;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIB)V", line = 481)
    public final void method2697(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = -113 % ((67 - arg3) / 35);
        this.field6622[this.field6615.field1918 * arg2 + arg0] = class266.method1624(this.field6622[this.field6615.field1918 * arg2 + arg0], 0x1 << arg1);
        field6633++;
        this.field6625++;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)V", line = 498)
    public final void method2698(int arg0, int arg1) {
        field6612++;
        if (arg1 == 26632) {
            this.field6609 = this.field6607.method3249(arg0 * 4, (byte) 85, true);
            this.field6623 = new Stream(this.field6609, 0, arg0 * 4);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/String;BII[BI)I", line = 512)
    public static final int method2699(String arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field6608++;
        int var6 = arg3 - arg2;
        int var7 = 58 / ((arg1 + 49) / 43);
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg0.charAt(arg2 + var8);
            if (var9 > '\u0000' && var9 < '\u0080' || var9 >= ' ' && var9 <= 'ÿ') {
                arg4[arg5 + var8] = (byte) var9;
            } else if (var9 == '€') {
                arg4[arg5 + var8] = -128;
            } else if (var9 == '‚') {
                arg4[arg5 + var8] = -126;
            } else if (var9 == 'ƒ') {
                arg4[arg5 + var8] = -125;
            } else if (var9 == '„') {
                arg4[arg5 + var8] = -124;
            } else if (var9 == '…') {
                arg4[arg5 + var8] = -123;
            } else if (var9 == '†') {
                arg4[arg5 + var8] = -122;
            } else if (var9 == '‡') {
                arg4[arg5 + var8] = -121;
            } else if (var9 == 'ˆ') {
                arg4[arg5 + var8] = -120;
            } else if (var9 == '‰') {
                arg4[arg5 + var8] = -119;
            } else if (var9 == 'Š') {
                arg4[arg5 + var8] = -118;
            } else if (var9 == '‹') {
                arg4[arg5 + var8] = -117;
            } else if (var9 == 'Œ') {
                arg4[arg5 + var8] = -116;
            } else if (var9 == 'Ž') {
                arg4[arg5 + var8] = -114;
            } else if (var9 == '‘') {
                arg4[arg5 + var8] = -111;
            } else if (var9 == '’') {
                arg4[arg5 + var8] = -110;
            } else if (var9 == '“') {
                arg4[arg5 + var8] = -109;
            } else if (var9 == '”') {
                arg4[arg5 + var8] = -108;
            } else if (var9 == '•') {
                arg4[arg5 + var8] = -107;
            } else if (var9 == '–') {
                arg4[arg5 + var8] = -106;
            } else if (var9 == '—') {
                arg4[arg5 + var8] = -105;
            } else if (var9 == '˜') {
                arg4[arg5 + var8] = -104;
            } else if (var9 == '™') {
                arg4[arg5 + var8] = -103;
            } else if (var9 == 'š') {
                arg4[arg5 + var8] = -102;
            } else if (var9 == '›') {
                arg4[arg5 + var8] = -101;
            } else if (var9 == 'œ') {
                arg4[arg5 + var8] = -100;
            } else if (var9 == 'ž') {
                arg4[arg5 + var8] = -98;
            } else if (var9 == 'Ÿ') {
                arg4[arg5 + var8] = -97;
            } else {
                arg4[arg5 + var8] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lkb;IIIII)V", line = 678)
    public class474(class634 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6615 = arg0;
        this.field6626 = arg4;
        this.field6634 = arg3;
        this.field6607 = this.field6615.field8881;
        this.field6624 = arg5;
        this.field6613 = arg1;
        this.field6611 = arg2;
        this.field6622 = new int[this.field6615.field1918 * this.field6615.field1916];
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZI)V", line = 652)
    public final void method2700(boolean arg0, int arg1) {
        field6632++;
        this.field6623.method3426();
        this.field6618 = this.field6607.method337((byte) -61, arg0);
        this.field6618.method1247(arg1 * 4, (byte) -64, 4, this.field6609);
        this.field6623 = null;
        this.field6609 = null;
    }
}
