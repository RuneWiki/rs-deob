import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class174 extends class499 {

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "Z")
    public boolean field2541 = true;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "Lff;")
    public static class9 field2540 = new class9(51, -1);

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!rn", name = "Q", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!rn", name = "R", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "Lte;")
    public class434 field2543;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "Lf;")
    public static class529 field2530;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "[I")
    private int[] field2539;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "[I")
    public int[] field2544;

    @OriginalMember(owner = "client!rn", name = "S", descriptor = "[Lf;")
    public static class529[] field2550;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field2531;

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "[[I")
    private int[][] field2533;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B[ILmd;)V")
    public final void method1164(byte arg0, int[] arg1, class379 arg2) {
        field2537++;
        if (this.field2539 == null) {
            return;
        }
        int var4 = -62 % ((arg0 - 61) / 52);
        for (int var5 = 0; var5 < this.field2539.length; var5++) {
            if (arg1.length <= var5) {
                return;
            }
            int var6 = this.method1171(var5, -86).field1050;
            if (var6 > 0) {
                arg2.method2221((long) arg1[var5], 90, var6);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lmd;II)V")
    private final void method1165(class379 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2531 = class482.method2781(arg0.method2218(-94), -22005, '<');
        } else if (arg2 == 2) {
            int var9 = arg0.method2238(255);
            this.field2544 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2544[var10] = arg0.method2212((byte) 83);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method2238(arg1 ^ 0xFFFFB547);
            this.field2539 = new int[var4];
            this.field2533 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2212((byte) 83);
                class70 var7 = class430.method2484((byte) -123, var6);
                if (var7 != null) {
                    this.field2539[var5] = var6;
                    this.field2533[var5] = new int[var7.field1044];
                    for (int var8 = 0; var8 < var7.field1044; var8++) {
                        this.field2533[var5][var8] = arg0.method2212((byte) 83);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field2541 = false;
        }
        field2532++;
        if (arg1 != -19016) {
            this.method1169(true);
        }
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(B)V")
    public static void method1166(byte arg0) {
        field2530 = null;
        if (arg0 > -107) {
            field2530 = null;
        }
        field2540 = null;
        field2550 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BII)I")
    public final int method1167(byte arg0, int arg1, int arg2) {
        if (arg0 != -80) {
            return -26;
        }
        field2548++;
        if (this.field2539 == null || arg1 < 0 || arg1 > this.field2539.length) {
            return -1;
        } else if (this.field2533[arg1] == null || arg2 < 0 || this.field2533[arg1].length < arg2) {
            return -1;
        } else {
            return this.field2533[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(B)I")
    public final int method1168(byte arg0) {
        int var2 = 87 % ((72 - arg0) / 38);
        field2536++;
        return this.field2539 == null ? 0 : this.field2539.length;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)V")
    public final void method1169(boolean arg0) {
        field2542++;
        if (arg0) {
            this.method1172(3);
        }
        if (this.field2544 != null) {
            for (int var2 = 0; var2 < this.field2544.length; var2++) {
                this.field2544[var2] = class191.method1230(this.field2544[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lmd;Z)Ljava/lang/String;")
    public final String method1170(class379 arg0, boolean arg1) {
        field2549++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2539 != null) {
            for (int var4 = 0; var4 < this.field2539.length; var4++) {
                var3.append(this.field2531[var4]);
                var3.append(this.field2543.method2502(this.field2533[var4], 32767, arg0.method2190(0, class430.method2484((byte) -128, this.field2539[var4]).field1045), this.method1171(var4, -72)));
            }
        }
        var3.append(this.field2531[this.field2531.length - 1]);
        return arg1 ? var3.toString() : null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Lra;")
    public final class70 method1171(int arg0, int arg1) {
        field2546++;
        if (arg1 > -59) {
            field2550 = null;
        }
        return this.field2539 == null || arg0 < 0 || arg0 > this.field2539.length ? null : class430.method2484((byte) 50, this.field2539[arg0]);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method1172(int arg0) {
        field2534++;
        if (arg0 != -27972) {
            return null;
        }
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2531 == null) {
            return "";
        }
        var2.append(this.field2531[0]);
        for (int var3 = 1; var3 < this.field2531.length; var3++) {
            var2.append("...");
            var2.append(this.field2531[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Z")
    public static final boolean method1173(int arg0, int arg1, int arg2) {
        field2535++;
        if (!class379.field5189) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & arg0;
        if (class238.field3185[var3] == null || class238.field3185[var3][var4] == null) {
            return false;
        }
        class403 var5 = class238.field3185[var3][var4];
        if (arg1 == -1 && var5.field5480 == 0) {
            for (class39 var6 = (class39) class415.field5733.method1672((byte) -105); var6 != null; var6 = (class39) class415.field5733.method1668(arg0 - 65536)) {
                if (var6.field590 == 46 || var6.field590 == 1007 || var6.field590 == 3 || var6.field590 == 12 || var6.field590 == 58) {
                    for (class403 var7 = class213.method1345((byte) 63, var6.field600); var7 != null; var7 = class298.method1744((byte) -88, var7)) {
                        if (var5.field5431 == var7.field5431) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class39 var8 = (class39) class415.field5733.method1672((byte) -125); var8 != null; var8 = (class39) class415.field5733.method1668(-1)) {
                if (var8.field598 == arg1 && var5.field5431 == var8.field600 && (var8.field590 == 46 || var8.field590 == 1007 || var8.field590 == 3 || var8.field590 == 12 || var8.field590 == 58)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILmd;)V")
    public final void method1174(int arg0, class379 arg1) {
        while (true) {
            int var3 = arg1.method2238(arg0 ^ 0xFFFFFF03);
            if (var3 == 0) {
                field2545++;
                if (arg0 != -4) {
                    field2530 = null;
                    return;
                }
                return;
            }
            this.method1165(arg1, -19016, var3);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIB)I")
    public static final int method1175(int arg0, int arg1, byte arg2) {
        field2538++;
        if (arg0 == 4 || arg0 == 5) {
            return class317.field4161[arg1 & 0x3];
        } else if (arg2 == 90) {
            return 256;
        } else {
            return -125;
        }
    }
}
