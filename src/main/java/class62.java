import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class62 {

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Z")
    public boolean field906 = true;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    private int field905 = -1;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Lrl;")
    private class232 field900;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Laca;")
    private class219 field889;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Ldg;")
    private class19 field904;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Ljs;")
    private class174 field901;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lgga;")
    public static class226 field893 = new class226(14, 0);

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lgga;")
    public static class226 field898 = new class226(15, 4);

    @OriginalMember(owner = "client!k", name = "v", descriptor = "Lgga;")
    public static class226 field907 = new class226(16, -2);

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Lgga;")
    public static class226 field909 = new class226(17, 0);

    @OriginalMember(owner = "client!k", name = "y", descriptor = "Lgga;")
    public static class226 field910 = new class226(18, -2);

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lgga;")
    public static class226 field911 = new class226(19, -2);

    @OriginalMember(owner = "client!k", name = "A", descriptor = "Lgga;")
    public static class226 field912 = new class226(22, -2);

    @OriginalMember(owner = "client!k", name = "B", descriptor = "Lgga;")
    public static class226 field913 = new class226(23, 4);

    @OriginalMember(owner = "client!k", name = "C", descriptor = "Lgga;")
    public static class226 field914 = new class226(24, -1);

    @OriginalMember(owner = "client!k", name = "D", descriptor = "Lgga;")
    public static class226 field915 = new class226(26, 0);

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Lgga;")
    public static class226 field916 = new class226(27, 0);

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Lgga;")
    public static class226 field917 = new class226(28, -2);

    @OriginalMember(owner = "client!k", name = "G", descriptor = "[Lgga;")
    private static class226[] field918 = new class226[32];

    @OriginalMember(owner = "client!k", name = "i", descriptor = "B")
    public static byte field894;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field908;

    static {
        class226[] var0 = class745.method4146((byte) 126);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field918[var0[var1].field3032] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 3)
    private final void method436(byte arg0) {
        field899++;
        if (!this.field906) {
            return;
        }
        this.field906 = false;
        byte[] var2 = this.field889.field2862;
        int var3 = 0;
        int var4 = this.field889.field2872;
        int var5 = this.field889.field2872 * this.field892 + this.field895;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field904 != null && this.field905 == var3) {
            this.field906 = false;
            return;
        }
        this.field905 = var3;
        int var7 = this.field892 * var4 + this.field895;
        int var8 = 0;
        if (this.field900.method323(class38.field472, class401.field5747, (byte) -16)) {
            if (class35.field454 == null) {
                class35.field454 = new byte[16384];
            }
            byte[] var13 = class35.field454;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var7] == 0) {
                        int var16 = 0;
                        if (var2[var7 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var7 + var4] != 0) {
                            var16++;
                        }
                        var13[var8++] = (byte) (var16 * 17);
                    } else {
                        var13[var8++] = 68;
                    }
                    var7++;
                }
                var7 += this.field889.field2872 - 128;
            }
            if (this.field904 == null) {
                this.field904 = this.field900.method1416(class401.field5747, 128, false, true, class35.field454, 128);
                this.field904.method100(false, false, 63);
            } else {
                this.field904.method99(0, 128, 128, class401.field5747, class35.field454, 0, 0, true, 128);
            }
        } else {
            if (class454.field6299 == null) {
                class454.field6299 = new int[16384];
            }
            int[] var9 = class454.field6299;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var7] == 0) {
                        int var12 = 0;
                        if (var2[var7 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field889.field2872 - 128;
            }
            if (this.field904 == null) {
                this.field904 = this.field900.method1520(class454.field6299, 128, false, 128, (byte) -111);
                this.field904.method100(false, false, 44);
            } else {
                this.field904.method101(128, 128, class454.field6299, -28425, 0, 0, 128, 0);
            }
        }
        if (arg0 <= 77) {
            field907 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V", line = 173)
    public static void method437(byte arg0) {
        field916 = null;
        field893 = null;
        field917 = null;
        field918 = null;
        field915 = null;
        field914 = null;
        if (arg0 >= -48) {
            field909 = null;
        }
        field910 = null;
        field911 = null;
        field907 = null;
        field898 = null;
        field909 = null;
        field913 = null;
        field912 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I[BIB)Ljava/lang/String;", line = 195)
    public static final String method438(int arg0, byte[] arg1, int arg2, byte arg3) {
        field897++;
        char[] var4 = new char[arg0];
        int var5 = -128 / ((-arg3 - 54) / 51);
        int var6 = 0;
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg1[arg2 + var7] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = class587.field7990[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var6++] = (char) var8;
            }
        }
        return new String(var4, 0, var6);
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V", line = 237)
    public final void method439(byte arg0) {
        int var2 = -87 / ((arg0 + 21) / 32);
        field896++;
        this.method440(this.field901, (byte) -44, this.field886);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljs;BI)V", line = 255)
    public final void method440(class174 arg0, byte arg1, int arg2) {
        if (arg1 >= -14) {
            method442(105);
        }
        field902++;
        if (arg2 > 0) {
            this.method436((byte) 122);
            this.field900.method1458(399403340, this.field904);
            this.field900.method342(this.field887 + 1 - this.field888, 7, arg0, class542.field7529, arg2, this.field888, 0);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(JZ)V", line = 281)
    public static final void method441(long arg0, boolean arg1) {
        if (arg1) {
            method437((byte) 79);
        }
        field890++;
        int var3 = class750.field10314 + class388.field5601.field4410;
        int var4 = class605.field8177 + class388.field5601.field4418;
        if (class316.field4388 - var3 < -2000 || class316.field4388 - var3 > 2000 || class357.field5123 - var4 < -2000 || (class357.field5123 - var4) > 2000) {
            class357.field5123 = var4;
            class316.field4388 = var3;
        }
        if (class316.field4388 != var3) {
            int var5 = var3 - class316.field4388;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class316.field4388 += var6;
        }
        class589.field8028 += (float) arg0 * class679.field9449 / 6.0F;
        class596.field8093 += (float) arg0 * class244.field3622 / 6.0F;
        if (class357.field5123 != var4) {
            int var7 = var4 - class357.field5123;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class357.field5123 += var8;
        }
        class391.method2454(-125);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 370)
    public static final void method442(int arg0) {
        if (class140.field1995 < 102) {
            class140.field1995 += 6;
        }
        field903++;
        if (class236.field3487 != -1 && class131.field1832 < class97.method664((byte) -50)) {
            for (int var1 = class236.field3487; var1 < class452.field6260.length; var1++) {
                if (class452.field6260[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class452.field6260[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class261.method1772((byte) -117, "Pausing for " + var2 + " seconds...");
                    class236.field3487 = var1 + 1;
                    class131.field1832 = class97.method664((byte) -50) + (long) (var2 * 1000);
                    return;
                }
                class445.field6173 = class452.field6260[var1];
                class715.method4017((byte) 53, false);
            }
            class236.field3487 = -1;
        }
        if (class687.field9563 != 0) {
            class489.field6846 -= class687.field9563 * 5;
            if (class489.field6846 >= class537.field7437) {
                class489.field6846 = class537.field7437 - 1;
            }
            if (class489.field6846 < 0) {
                class489.field6846 = 0;
            }
            class687.field9563 = 0;
        }
        int var3 = 0;
        if (arg0 != 88) {
            return;
        }
        while (class1.field3 > var3) {
            class241 var4 = class434.field6050[var3];
            int var5 = var4.method1618(true);
            char var6 = var4.method1620(-2815);
            int var7 = var4.method1622(15078);
            if (var5 == 84) {
                class715.method4017((byte) 53, false);
            }
            if (var5 == 80) {
                class715.method4017((byte) 53, true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class430.field6017 != null) {
                    String var11 = "";
                    for (int var12 = class297.field4232.length - 1; var12 >= 0; var12--) {
                        if (class297.field4232[var12] != null && class297.field4232[var12].length() > 0) {
                            var11 = var11 + class297.field4232[var12] + '\n';
                        }
                    }
                    class430.field6017.setContents(new StringSelection(var11), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class430.field6017 != null) {
                    Transferable var8 = class430.field6017.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class494.method2992('\n', var9, arg0 ^ 0x59);
                                class238.method1607(29017, var10);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class507.field7045 > 0) {
                class445.field6173 = class445.field6173.substring(0, class507.field7045 - 1) + class445.field6173.substring(class507.field7045);
                class507.field7045--;
            } else if (var5 == 101 && class507.field7045 < class445.field6173.length()) {
                class445.field6173 = class445.field6173.substring(0, class507.field7045) + class445.field6173.substring(class507.field7045 + 1);
            } else if (var5 == 96 && class507.field7045 > 0) {
                class507.field7045--;
            } else if (var5 == 97 && class507.field7045 < class445.field6173.length()) {
                class507.field7045++;
            } else if (var5 == 102) {
                class507.field7045 = 0;
            } else if (var5 == 103) {
                class507.field7045 = class445.field6173.length();
            } else if (var5 == 104 && class214.field2808 < class297.field4232.length) {
                class214.field2808++;
                class495.method3000(arg0 - 211);
                class507.field7045 = class445.field6173.length();
            } else if (var5 == 105 && class214.field2808 > 0) {
                class214.field2808--;
                class495.method3000(-96);
                class507.field7045 = class445.field6173.length();
            } else if (class758.method4206(arg0 ^ 0xFFFFFFFD, var6) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class445.field6173 = class445.field6173.substring(0, class507.field7045) + class434.field6050[var3].method1620(-2815) + class445.field6173.substring(class507.field7045);
                class507.field7045++;
            }
            var3++;
        }
        class253.field3702 = 0;
        class1.field3 = 0;
        class235.method1566(16349);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)V", line = 571)
    public static final void method443(boolean arg0, int arg1) {
        field908++;
        if (arg0) {
            if (class544.field7545 != -1) {
                class634.method3553((byte) -52, class544.field7545);
            }
            for (class654 var2 = (class654) class259.field3747.method821((byte) 110); var2 != null; var2 = (class654) class259.field3747.method818(38)) {
                if (!var2.method550(false)) {
                    var2 = (class654) class259.field3747.method821((byte) 123);
                    if (var2 == null) {
                        break;
                    }
                }
                class39.method217((byte) 103, var2, true, false);
            }
            class544.field7545 = -1;
            class259.field3747 = new class130(8);
            class540.method3196(-27179);
            class544.field7545 = class12.field106;
            class304.method2002(false, 24615);
            class235.method1566(16349);
            class546.method3232(class544.field7545);
        }
        class605.field8178 = "";
        class707.field9849 = "";
        class701.field9775 = false;
        class231.method1373(0);
        class222.field3007 = -1;
        class272.method1830(class420.field5917, (byte) 126);
        class388.field5601 = new class96();
        class388.field5601.field7197[0] = class277.field4036 / 2;
        class388.field5601.field4410 = class277.field4036 * 512 / 2;
        class388.field5601.field4418 = class667.field9202 * 512 / 2;
        class388.field5601.field7198[0] = class667.field9202 / 2;
        class123.field1680 = 0;
        class671.field9282 = 0;
        if (arg1 <= 82) {
            method438(77, null, 69, (byte) 61);
        }
        if (class720.field10023 == 2) {
            class123.field1680 = class518.field7232 << 9;
            class671.field9282 = class395.field5684 << 9;
        } else {
            class433.method2675(3);
        }
        class124.method777((byte) 98);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lrl;Laca;Leha;IIIII)V", line = 648)
    public class62(class232 arg0, class219 arg1, class166 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field892 = arg7;
        this.field900 = arg0;
        this.field889 = arg1;
        this.field895 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field4814 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field2300[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field886 = 0;
            this.field904 = null;
        } else {
            this.field888 = Integer.MAX_VALUE;
            this.field887 = Integer.MIN_VALUE;
            this.field901 = this.field900.method294(false, (byte) -97);
            this.field901.method969(false, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field901.method968(true, (byte) 45);
                if (var15 != null) {
                    Stream var16 = this.field900.method1473(-1969469652, var15);
                    if (Stream.method2614()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field4814 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field2300[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field887) {
                                            this.field887 = var28;
                                        }
                                        if (this.field888 > var28) {
                                            this.field888 = var28;
                                        }
                                        var16.method2610(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field4814 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field2300[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field887 < var22) {
                                            this.field887 = var22;
                                        }
                                        if (var22 < this.field888) {
                                            this.field888 = var22;
                                        }
                                        var16.method2619(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method2613();
                    if (this.field901.method975(-33)) {
                        break;
                    }
                }
            }
            this.field886 = var10 / 3;
        }
    }
}
