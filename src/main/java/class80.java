import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class80 {

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    private int field1164 = 0;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "[Llj;")
    private class24[] field1163;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1146 = 0;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1143 = 0;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[[[I")
    public static int[][][] field1152 = new int[4][13][13];

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "[I")
    public static int[] field1155 = new int[5];

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Luf;")
    public static class168 field1158 = class148.method1019(-1720, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "J")
    private long field1145;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Llj;")
    private class24 field1144;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "Llj;")
    private class24 field1165;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Llj;", line = 5)
    public final class24 method488(int arg0) {
        field1139++;
        if (arg0 != 1) {
            method497(false, (class241) null);
        }
        if (this.field1164 > 0 && this.field1163[this.field1164 - 1] != this.field1165) {
            class24 var2 = this.field1165;
            this.field1165 = var2.field295;
            return var2;
        }
        class24 var3;
        do {
            if (this.field1151 <= this.field1164) {
                return null;
            }
            var3 = this.field1163[this.field1164++].field295;
        } while (this.field1163[this.field1164 - 1] == var3);
        this.field1165 = var3.field295;
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 45)
    public static void method489(boolean arg0) {
        field1152 = (int[][][]) null;
        if (!arg0) {
            field1158 = null;
            field1155 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Llj;JZ)V", line = 60)
    public final void method490(class24 arg0, long arg1, boolean arg2) {
        if (arg0.field293 != null) {
            arg0.method124((byte) 88);
        }
        if (!arg2) {
            return;
        }
        field1150++;
        class24 var5 = this.field1163[(int) ((long) (this.field1151 - 1) & arg1)];
        arg0.field295 = var5;
        arg0.field292 = arg1;
        arg0.field293 = var5.field293;
        arg0.field293.field295 = arg0;
        arg0.field295.field293 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 83)
    public static final void method491(byte arg0) {
        class261.field4427.method1429((byte) 120);
        field1160++;
        if (arg0 >= -13) {
            method494((class241) null, 83, (class241) null);
        }
        class39.field485.method1429((byte) 120);
        class64.field856.method1429((byte) 120);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I", line = 98)
    public static int method492(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JI)Llj;", line = 109)
    public final class24 method493(long arg0, int arg1) {
        field1141++;
        this.field1145 = arg0;
        class24 var4 = this.field1163[(int) (arg0 & (long) (this.field1151 - 1))];
        if (arg1 <= 39) {
            return (class24) null;
        }
        for (this.field1144 = var4.field295; this.field1144 != var4; this.field1144 = this.field1144.field295) {
            if (this.field1144.field292 == arg0) {
                class24 var5 = this.field1144;
                this.field1144 = this.field1144.field295;
                return var5;
            }
        }
        this.field1144 = null;
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ldk;ILdk;)V", line = 144)
    public static final void method494(class241 arg0, int arg1, class241 arg2) {
        field1148++;
        class194.field3155 = arg0;
        class79.field1128 = arg2;
        if (arg1 < 49) {
            field1143 = 94;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)I", line = 168)
    public final int method495(int arg0) {
        field1142++;
        if (arg0 != -17539) {
            this.field1145 = 95L;
        }
        return this.field1151;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)Llj;", line = 186)
    public final class24 method496(boolean arg0) {
        field1159++;
        if (this.field1144 == null) {
            return null;
        }
        class24 var2 = this.field1163[(int) (this.field1145 & (long) (this.field1151 - 1))];
        while (this.field1144 != var2) {
            if (this.field1144.field292 == this.field1145) {
                class24 var3 = this.field1144;
                this.field1144 = this.field1144.field295;
                return var3;
            }
            this.field1144 = this.field1144.field295;
        }
        this.field1144 = null;
        if (arg0) {
            return (class24) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLdk;)V", line = 220)
    public static final void method497(boolean arg0, class241 arg1) {
        class300.field5088 = arg1;
        field1149++;
        if (arg0) {
            field1152 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)I", line = 232)
    public final int method498(int arg0) {
        field1157++;
        if (arg0 != 23563) {
            return 60;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1151; var3++) {
            class24 var4 = this.field1163[var3];
            for (class24 var5 = var4.field295; var5 != var4; var5 = var5.field295) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Llj;", line = 266)
    public final class24 method499(byte arg0) {
        if (arg0 != -99) {
            this.field1164 = 93;
        }
        field1154++;
        this.field1164 = 0;
        return this.method488(1);
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V", line = 283)
    public final void method500(int arg0) {
        field1153++;
        for (int var2 = arg0; var2 < this.field1151; var2++) {
            class24 var3 = this.field1163[var2];
            while (true) {
                class24 var4 = var3.field295;
                if (var3 == var4) {
                    break;
                }
                var4.method124((byte) 17);
            }
        }
        this.field1144 = null;
        this.field1165 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[Llj;)I", line = 314)
    public final int method501(int arg0, class24[] arg1) {
        field1162++;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field1151; var4++) {
            class24 var5 = this.field1163[var4];
            for (class24 var6 = var5.field295; var6 != var5; var6 = var6.field295) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V", line = 348)
    public static final void method502(boolean arg0, int arg1) {
        class287.field4846 = new int[104];
        field1156++;
        class20.field250 = 99;
        class118.field1843 = new int[104];
        class128.field2004 = new int[104];
        class298.field5050 = new int[104];
        class171.field2793 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class153.field2389 = new byte[var2][104][104];
        class168.field2749 = new byte[var2][105][105];
        class291.field4912 = new byte[var2][104][104];
        if (arg1 < -81) {
            class105.field1614 = new byte[var2][104][104];
            class272.field4579 = new byte[var2][104][104];
            class58.field767 = new int[var2][105][105];
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZI)I", line = 377)
    public static final int method503(int arg0, boolean arg1, int arg2) {
        field1140++;
        int var3 = arg2 * 57 + arg0;
        if (arg1) {
            field1158 = (class168) null;
        }
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V", line = 391)
    public class80(int arg0) {
        this.field1163 = new class24[arg0];
        this.field1151 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class24 var3 = this.field1163[var2] = new class24();
            var3.field293 = var3;
            var3.field295 = var3;
        }
    }
}
