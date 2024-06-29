import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class81 {

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    private int field1167 = 0;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    private int field1169 = -1;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Lbo;")
    private class16 field1164 = new class16();

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "Z")
    public boolean field1171 = false;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    private int field1163;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[Lc;")
    private class142[] field1158;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[[[I")
    private int[][][] field1156;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[[S")
    public static short[][] field1160 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "[[I")
    public static int[][] field1166 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1154 = 0;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
    public static int[] field1170 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V", line = 8)
    public final void method663(boolean arg0) {
        for (int var2 = 0; var2 < this.field1155; var2++) {
            this.field1156[var2][0] = null;
            this.field1156[var2][1] = null;
            this.field1156[var2][2] = null;
            this.field1156[var2] = (int[][]) null;
        }
        this.field1156 = (int[][][]) null;
        field1168++;
        this.field1158 = null;
        if (arg0) {
            this.field1164.method95(-30123);
            this.field1164 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 32)
    public static void method664(byte arg0) {
        if (arg0 != -3) {
            field1160 = (short[][]) ((short[][]) null);
        }
        field1170 = null;
        field1160 = (short[][]) null;
        field1166 = (int[][]) null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)[[[I", line = 55)
    public final int[][][] method665(byte arg0) {
        field1161++;
        if (this.field1163 != this.field1155) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1155; var2++) {
            this.field1158[var2] = class99.field1394;
        }
        if (arg0 >= -81) {
            field1166 = (int[][]) ((int[][]) null);
        }
        return this.field1156;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I", line = 84)
    public static int method666(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZII[B)Z", line = 97)
    public static final boolean method667(boolean arg0, int arg1, int arg2, byte[] arg3) {
        boolean var4 = arg0;
        class190 var5 = new class190(arg3);
        field1162++;
        int var6 = -1;
        label71: while (true) {
            int var7 = var5.method1332(32767);
            if (var7 == 0) {
                return var4;
            }
            boolean var8 = false;
            int var9 = 0;
            var6 += var7;
            while (true) {
                int var15;
                class261 var16;
                do {
                    int var13;
                    int var14;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var5.method1372(-123);
                                        if (var17 == 0) {
                                            continue label71;
                                        }
                                        var5.method1319(255);
                                    }
                                    int var10 = var5.method1372(-74);
                                    if (var10 == 0) {
                                        continue label71;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = var9 & 0x3F;
                                    int var12 = (var9 & 0xFC3) >> 6;
                                    var13 = arg2 + var12;
                                    var14 = arg1 + var11;
                                    var15 = var5.method1319(255) >> 2;
                                } while (var13 <= 0);
                            } while (var14 <= 0);
                        } while (var13 >= 103);
                    } while (var14 >= 103);
                    var16 = class30.method212(0, var6);
                } while (var15 == 22 && !class229.field3472 && var16.field3936 == 0 && var16.field3957 != 1 && !var16.field3958);
                var8 = true;
                if (!var16.method1918((byte) -64)) {
                    var4 = false;
                    class165.field2352++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(III)V", line = 291)
    public class81(int arg0, int arg1, int arg2) {
        this.field1155 = arg0;
        this.field1163 = arg1;
        this.field1158 = new class142[this.field1163];
        this.field1156 = new int[this.field1155][3][arg2];
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[[I", line = 186)
    public final int[][] method668(int arg0, int arg1) {
        field1159++;
        if (arg1 != 0) {
            this.method668(21, -33);
        }
        if (this.field1163 == this.field1155) {
            this.field1171 = this.field1158[arg0] == null;
            this.field1158[arg0] = class99.field1394;
            return this.field1156[arg0];
        } else if (this.field1155 == 1) {
            this.field1171 = this.field1169 != arg0;
            this.field1169 = arg0;
            return this.field1156[0];
        } else {
            class142 var3 = this.field1158[arg0];
            if (var3 == null) {
                this.field1171 = true;
                if (this.field1155 > this.field1167) {
                    var3 = new class142(arg0, this.field1167);
                    this.field1167++;
                } else {
                    class142 var4 = (class142) this.field1164.method94(false);
                    var3 = new class142(arg0, var4.field2061);
                    this.field1158[var4.field2059] = null;
                    var4.method876(8);
                }
                this.field1158[arg0] = var3;
            } else {
                this.field1171 = false;
            }
            this.field1164.method99(var3, (byte) 33);
            return this.field1156[var3.field2061];
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)Lka;", line = 257)
    public static final class107 method669(int arg0, int arg1) {
        class107 var2 = (class107) class236.field3545.method461((byte) 120, (long) arg1);
        field1165++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class131.field1923.method2520(class109.method830(arg0 + 22701, arg1), class206.method1511(255, arg1), (byte) -25);
        if (arg0 != 32) {
            method669(86, -97);
        }
        class107 var4 = new class107();
        var4.field1532 = arg1;
        if (var3 != null) {
            var4.method820(0, new class190(var3));
        }
        class236.field3545.method460(var4, arg0 ^ 0xFFFF9A37, (long) arg1);
        return var4;
    }
}
