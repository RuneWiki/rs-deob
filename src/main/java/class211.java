import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class211 extends class96 {

    @OriginalMember(owner = "client!on", name = "G", descriptor = "Z")
    public boolean field2984 = true;

    @OriginalMember(owner = "client!on", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2998 = null;

    @OriginalMember(owner = "client!on", name = "N", descriptor = "Z")
    public static boolean field2991 = false;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!on", name = "J", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!on", name = "K", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!on", name = "L", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!on", name = "O", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!on", name = "S", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!on", name = "T", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!on", name = "W", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!on", name = "X", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "Lhe;")
    public static class239 field2979;

    @OriginalMember(owner = "client!on", name = "P", descriptor = "Lhe;")
    public static class239 field2993;

    @OriginalMember(owner = "client!on", name = "V", descriptor = "Llb;")
    public class363 field2999;

    @OriginalMember(owner = "client!on", name = "M", descriptor = "[I")
    public int[] field2990;

    @OriginalMember(owner = "client!on", name = "R", descriptor = "[I")
    private int[] field2995;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field2980;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "[[I")
    private int[][] field2986;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(III)V")
    public static final void method1303(int arg0, int arg1, int arg2) {
        class468 var3 = class358.field5312[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6778 != null) {
            var3.field6778 = null;
        }
        if (var3.field6766 != null) {
            var3.field6766 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(B)Ljava/lang/String;")
    public final String method1304(byte arg0) {
        field2981++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2980 == null) {
            return "";
        }
        var2.append(this.field2980[0]);
        for (int var3 = 1; var3 < this.field2980.length; var3++) {
            var2.append("...");
            var2.append(this.field2980[var3]);
        }
        int var4 = -84 / ((arg0 + 66) / 32);
        return var2.toString();
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public final void method1305(int arg0) {
        if (this.field2990 != null) {
            for (int var2 = 0; var2 < this.field2990.length; var2++) {
                this.field2990[var2] = class51.method379(this.field2990[var2], 32768);
            }
        }
        if (arg0 != -15492) {
            method1312(false);
        }
        field2983++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILae;)Ljava/lang/String;")
    public final String method1306(int arg0, class156 arg1) {
        int var3 = 42 / ((arg0 - 5) / 40);
        field2985++;
        StringBuffer var4 = new StringBuffer(80);
        if (this.field2995 != null) {
            for (int var5 = 0; var5 < this.field2995.length; var5++) {
                var4.append(this.field2980[var5]);
                var4.append(this.field2999.method2216(this.field2986[var5], 0, arg1.method991(class459.method2671(-20439, this.field2995[var5]).field3137, true), this.method1309(var5, -1)));
            }
        }
        var4.append(this.field2980[this.field2980.length - 1]);
        return var4.toString();
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIII)V")
    public static final void method1307(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2982++;
        class79.field1108.field2018 = 0;
        class79.field1108.method947(-119, class58.field895.field5608);
        class79.field1108.method947(arg3 ^ 0xFFFFFF9F, arg2);
        class79.field1108.method947(-118, arg4);
        class79.field1108.method961(arg0, 1608339368);
        class79.field1108.method961(arg1, 1608339368);
        class497.field7577 = 1;
        class379.field5660 = -3;
        class455.field6628 = 0;
        class148.field1918 = arg3;
    }

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(I)I")
    public final int method1308(int arg0) {
        field3000++;
        if (this.field2995 == null) {
            return 0;
        } else if (arg0 >= -26) {
            return -125;
        } else {
            return this.field2995.length;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Lak;")
    public final class222 method1309(int arg0, int arg1) {
        field2994++;
        if (this.field2995 == null || arg0 < 0 || arg0 > this.field2995.length) {
            return null;
        } else {
            if (arg1 != -1) {
                this.method1305(25);
            }
            return class459.method2671(arg1 - 20438, this.field2995[arg0]);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lae;I)V")
    public final void method1310(class156 arg0, int arg1) {
        field2997++;
        while (true) {
            int var3 = arg0.method941((byte) 124);
            if (var3 == 0) {
                int var4 = 65 % ((-arg1 - 38) / 52);
                return;
            }
            this.method1311(arg0, -2, var3);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lae;II)V")
    private final void method1311(class156 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            this.field2980 = class452.method2628(arg0.method981(false), 0, '<');
        } else if (arg2 == 2) {
            int var9 = arg0.method941((byte) 124);
            this.field2990 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2990[var10] = arg0.method993((byte) -96);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method941((byte) 127);
            this.field2995 = new int[var4];
            this.field2986 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method993((byte) -108);
                class222 var7 = class459.method2671(-20439, var6);
                if (var7 != null) {
                    this.field2995[var5] = var6;
                    this.field2986[var5] = new int[var7.field3140];
                    for (int var8 = 0; var8 < var7.field3140; var8++) {
                        this.field2986[var5][var8] = arg0.method993((byte) -91);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field2984 = false;
        }
        field3001++;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(Z)V")
    public static void method1312(boolean arg0) {
        if (arg0) {
            field2989 = 116;
        }
        field2979 = null;
        field2993 = null;
        field2998 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lae;I[I)V")
    public final void method1313(class156 arg0, int arg1, int[] arg2) {
        field2987++;
        int var4 = -50 % ((-arg1 - 30) / 63);
        if (this.field2995 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field2995.length; var5++) {
            if (var5 >= arg2.length) {
                return;
            }
            int var6 = this.method1309(var5, -1).field3141;
            if (var6 > 0) {
                arg0.method973((long) arg2[var5], var6, -126);
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIZ)I")
    public final int method1314(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return 12;
        }
        field2988++;
        if (this.field2995 == null || arg1 < 0 || arg1 > this.field2995.length) {
            return -1;
        } else if (this.field2986[arg1] == null || arg0 < 0 || this.field2986[arg1].length < arg0) {
            return -1;
        } else {
            return this.field2986[arg1][arg0];
        }
    }
}
