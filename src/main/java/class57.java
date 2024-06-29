import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class57 extends class2 {

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    private int field1099 = -32768;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    private int field1097;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    private int field1100;

    @OriginalMember(owner = "client!ff", name = "lb", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "client!ff", name = "ib", descriptor = "I")
    private int field1113;

    @OriginalMember(owner = "client!ff", name = "jb", descriptor = "I")
    private int field1114;

    @OriginalMember(owner = "client!ff", name = "mb", descriptor = "Lce;")
    private class26 field1117;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    private int field1102;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "Lob;")
    public static class141 field1095 = class175.method1195(40, "<col=ffffff>");

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field1094 = 0;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    public static volatile int field1106 = -1;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lob;")
    private static class141 field1107 = class175.method1195(40, "Loaded fonts");

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "Lob;")
    public static class141 field1098 = field1107;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "[I")
    public static int[] field1109 = new int[32];

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "J")
    public static long field1108 = 0L;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "[J")
    public static long[] field1110 = new long[100];

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ff", name = "ob", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ff", name = "pb", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lv;")
    public static class209 field1104;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "Z")
    public static boolean field1101;

    @OriginalMember(owner = "client!ff", name = "kb", descriptor = "[Lkc;")
    public static class102[] field1115;

    @OriginalMember(owner = "client!ff", name = "nb", descriptor = "[[[B")
    public static byte[][][] field1118;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()I")
    public final int method16() {
        field1119++;
        return this.field1099;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Laa;")
    private final class2 method387(boolean arg0) {
        field1120++;
        class54 var2 = class175.method1198(-14098, this.field1100);
        if (var2.field1024 != null) {
            var2 = var2.method372((byte) -3);
        }
        if (var2 == null) {
            return null;
        }
        if (this.field1117 != null) {
            int var3 = class20.field344 - this.field1103;
            if (var3 > 100 && this.field1117.field494 > 0) {
                int var4 = this.field1117.field499.length - this.field1117.field494;
                while (var4 > this.field1102 && var3 > this.field1117.field496[this.field1102]) {
                    var3 -= this.field1117.field496[this.field1102];
                    this.field1102++;
                }
                if (this.field1102 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field1117.field499.length; var6++) {
                        var5 += this.field1117.field496[var6];
                    }
                    var3 %= var5;
                }
            }
            label86: {
                do {
                    do {
                        if (this.field1117.field496[this.field1102] >= var3) {
                            break label86;
                        }
                        var3 -= this.field1117.field496[this.field1102];
                        this.field1102++;
                    } while (this.field1102 < this.field1117.field499.length);
                    this.field1102 -= this.field1117.field494;
                } while (this.field1102 >= 0 && this.field1102 < this.field1117.field499.length);
                this.field1117 = null;
            }
            this.field1103 = class20.field344 - var3;
        }
        int var7;
        int var8;
        if (this.field1114 == 1 || this.field1114 == 3) {
            var7 = var2.field1073;
            var8 = var2.field1079;
        } else {
            var7 = var2.field1079;
            var8 = var2.field1073;
        }
        int var9 = (var7 >> 1) + this.field1116;
        int var10 = (var7 + 1 >> 1) + this.field1116;
        int[][] var11 = class31.field617[this.field1093];
        int var12 = (var8 >> 1) + this.field1097;
        int var13 = (var8 + 1 >> 1) + this.field1097;
        int var14 = (this.field1116 << 7) + (var7 << 6);
        if (!arg0) {
            this.method387(true);
        }
        int var15 = var11[var9][var12] + var11[var10][var12] + var11[var9][var13] + var11[var10][var13] >> 2;
        int var16 = (this.field1097 << 7) + (var8 << 6);
        class161 var17;
        if (this.field1117 == null) {
            var17 = var2.method371(var14, this.field1113, false, this.field1114, var15, -9, var16, var11);
        } else {
            var17 = var2.method369(var16, this.field1114, this.field1102, var14, var11, var15, this.field1113, (byte) 49, this.field1117);
        }
        return var17 == null ? null : var17.field3121;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1112++;
        class2 var11 = this.method387(true);
        if (var11 != null) {
            var11.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1099 = var11.method16();
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
    public static void method388(boolean arg0) {
        field1104 = null;
        if (!arg0) {
            return;
        }
        field1109 = null;
        field1115 = null;
        field1098 = null;
        field1095 = null;
        field1118 = null;
        field1107 = null;
        field1110 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIIIIZLaa;)V")
    public class57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class2 arg8) {
        this.field1097 = arg5;
        this.field1100 = arg0;
        this.field1116 = arg4;
        this.field1093 = arg3;
        this.field1113 = arg1;
        this.field1114 = arg2;
        if (arg6 != -1) {
            this.field1117 = class114.method736(15619, arg6);
            this.field1103 = class20.field344 - 1;
            this.field1102 = 0;
            if (this.field1117.field493 == 0 && arg8 != null && arg8 instanceof class57) {
                class57 var10 = (class57) arg8;
                if (this.field1117 == var10.field1117) {
                    this.field1103 = var10.field1103;
                    this.field1102 = var10.field1102;
                    return;
                }
            }
            if (arg7 && this.field1117.field494 != -1) {
                this.field1102 = (int) ((double) this.field1117.field499.length * Math.random());
                this.field1103 -= (int) ((double) this.field1117.field496[this.field1102] * Math.random());
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)I")
    public static int method389(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
