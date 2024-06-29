import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class83 {

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Z")
    public boolean field1140 = false;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public int field1149 = -1;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public int field1156 = -1;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Z")
    public boolean field1143 = false;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public int field1152 = 99;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    public int field1164 = -1;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Z")
    public boolean field1146 = false;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Z")
    public boolean field1154 = false;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public int field1163 = 5;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public int field1147 = -1;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field1138 = -1;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public int field1166 = 2;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "J")
    public static long field1151 = 0L;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1139 = 0;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
    public int[] field1144;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[I")
    public int[] field1145;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "[I")
    private int[] field1158;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[Z")
    public boolean[] field1141;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "[[I")
    public static int[][] field1157;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "[[I")
    public int[][] field1159;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIBLts;II)Lts;", line = 3)
    public final class116 method664(int arg0, int arg1, byte arg2, class116 arg3, int arg4, int arg5) {
        field1148++;
        int var7 = this.field1144[arg4];
        int var8 = this.field1145[arg4];
        class182 var9 = class25.method153(0, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method907((byte) 1, arg1, true);
        }
        class182 var11 = null;
        if ((this.field1146 || class196.field2845) && arg5 != -1 && this.field1145.length > arg5) {
            int var12 = this.field1145[arg5];
            var11 = class25.method153(0, var12 >> 16);
            arg5 = var12 & 0xFFFF;
        }
        class182 var13 = null;
        class182 var14 = null;
        if (arg2 > -105) {
            return null;
        }
        int var15 = 0;
        int var16 = 0;
        if (this.field1158 != null) {
            if (this.field1158.length > arg4) {
                var15 = this.field1158[arg4];
                if (var15 != 65535) {
                    var13 = class25.method153(0, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1146 || class196.field2845) && arg5 != -1 && arg5 < this.field1158.length) {
                var16 = this.field1158[arg5];
                if (var16 != 65535) {
                    var14 = class25.method153(0, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1143) {
            arg1 |= 0x200;
        }
        if (var9.method1272((byte) 115, var10)) {
            arg1 |= 0x80;
        }
        if (var9.method1271(var10, (byte) 93)) {
            arg1 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method1272((byte) 125, var15)) {
                arg1 |= 0x80;
            }
            if (var13.method1271(var15, (byte) 93)) {
                arg1 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method1272((byte) 107, arg5)) {
                arg1 |= 0x80;
            }
            if (var11.method1271(arg5, (byte) 93)) {
                arg1 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method1272((byte) 115, var16)) {
                arg1 |= 0x80;
            }
            if (var14.method1271(var16, (byte) 93)) {
                arg1 |= 0x100;
            }
        }
        int var17 = arg1 | 0x20;
        class116 var18 = arg3.method907((byte) 1, var17, true);
        var18.method891(var7, this.field1143, 0, var10, arg5, var9, var11, 0, arg0 - 1);
        if (var13 != null) {
            var18.method891(var7, this.field1143, 0, var15, var16, var13, var14, 0, arg0 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IC)Z", line = 129)
    public static final boolean method665(int arg0, char arg1) {
        field1161++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            int var2 = 41 % ((-arg0 - 38) / 34);
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 157)
    public final void method666(int arg0) {
        if (arg0 < 102) {
            return;
        }
        field1150++;
        if (this.field1147 == -1) {
            if (this.field1141 == null) {
                this.field1147 = 0;
            } else {
                this.field1147 = 2;
            }
        }
        if (this.field1149 != -1) {
            return;
        }
        if (this.field1141 == null) {
            this.field1149 = 0;
        } else {
            this.field1149 = 2;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lrg;Z)V", line = 195)
    public final void method667(class366 arg0, boolean arg1) {
        if (!arg1) {
            field1139 = -1;
        }
        while (true) {
            int var3 = arg0.method2306((byte) 80);
            if (var3 == 0) {
                field1160++;
                return;
            }
            this.method670(-55, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZI)I", line = 223)
    public final int method668(int arg0, int arg1, boolean arg2, int arg3) {
        field1153++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = this.field1145[arg0];
        class182 var8 = null;
        class182 var9 = class25.method153(arg1, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1146 || class196.field2845) && arg3 != -1 && this.field1145.length > arg3) {
            int var11 = this.field1145[arg3];
            var8 = class25.method153(arg1, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1143) {
            var5 |= 0x200;
        }
        if (var9.method1272((byte) 118, var10)) {
            var5 |= 0x80;
        }
        if (var9.method1271(var10, (byte) 93)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method1272((byte) 105, var6)) {
                var5 |= 0x80;
            }
            if (var8.method1271(var6, (byte) 93)) {
                var5 |= 0x100;
            }
        }
        if (this.field1158 != null && arg2) {
            if (arg0 < this.field1158.length) {
                int var12 = this.field1158[arg0];
                if (var12 != 65535) {
                    class182 var13 = class25.method153(arg1, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1272((byte) 127, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1271(var14, (byte) 93)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field1146 || class196.field2845) && arg3 != -1 && arg3 < this.field1158.length) {
                int var15 = this.field1158[arg3];
                if (var15 != 65535) {
                    class182 var16 = class25.method153(0, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1272((byte) 120, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1271(var17, (byte) 93)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIIIIIBLts;)Lts;", line = 353)
    public final class116 method669(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class116 arg7) {
        field1162++;
        int var9 = this.field1144[arg2];
        int var10 = this.field1145[arg2];
        class182 var11 = class25.method153(0, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg7.method907((byte) 1, arg1, true);
        }
        class182 var13 = null;
        if ((this.field1146 || class196.field2845) && arg4 != -1 && this.field1145.length > arg4) {
            int var14 = this.field1145[arg4];
            var13 = class25.method153(0, var14 >> 16);
            arg4 = var14 & 0xFFFF;
        }
        if (this.field1143) {
            arg1 |= 0x200;
        }
        if (arg0 >= -110) {
            field1157 = null;
        }
        if (var11.method1272((byte) 117, var12)) {
            arg1 |= 0x80;
        }
        if (var11.method1271(var12, (byte) 93)) {
            arg1 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method1272((byte) 117, arg4)) {
                arg1 |= 0x80;
            }
            if (var13.method1271(arg4, (byte) 93)) {
                arg1 |= 0x100;
            }
        }
        int var15 = arg1 | 0x20;
        class116 var16 = arg7.method907(arg6, var15, true);
        var16.method891(var9, this.field1143, 0, var12, arg4, var11, var13, arg3, arg5 - 1);
        return var16;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILrg;)V", line = 436)
    private final void method670(int arg0, int arg1, class366 arg2) {
        if (arg1 == 1) {
            int var4 = arg2.method2297(13352);
            this.field1144 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1144[var5] = arg2.method2297(13352);
            }
            this.field1145 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1145[var6] = arg2.method2297(13352);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1145[var7] = (arg2.method2297(13352) << 16) + this.field1145[var7];
            }
        } else if (arg1 == 2) {
            this.field1164 = arg2.method2297(13352);
        } else if (arg1 == 3) {
            this.field1141 = new boolean[256];
            int var8 = arg2.method2306((byte) 30);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1141[arg2.method2306((byte) 36)] = true;
            }
        } else if (arg1 == 4) {
            this.field1154 = true;
        } else if (arg1 == 5) {
            this.field1163 = arg2.method2306((byte) 60);
        } else if (arg1 == 6) {
            this.field1138 = arg2.method2297(13352);
        } else if (arg1 == 7) {
            this.field1156 = arg2.method2297(13352);
        } else if (arg1 == 8) {
            this.field1152 = arg2.method2306((byte) 80);
        } else if (arg1 == 9) {
            this.field1147 = arg2.method2306((byte) 97);
        } else if (arg1 == 10) {
            this.field1149 = arg2.method2306((byte) 96);
        } else if (arg1 == 11) {
            this.field1166 = arg2.method2306((byte) 52);
        } else if (arg1 == 12) {
            int var14 = arg2.method2306((byte) 29);
            this.field1158 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field1158[var15] = arg2.method2297(13352);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field1158[var16] = (arg2.method2297(13352) << 16) + this.field1158[var16];
            }
        } else if (arg1 == 13) {
            int var10 = arg2.method2297(13352);
            this.field1159 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg2.method2306((byte) 101);
                if (var12 > 0) {
                    this.field1159[var11] = new int[var12];
                    this.field1159[var11][0] = arg2.method2263((byte) 10);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field1159[var11][var13] = arg2.method2297(13352);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field1143 = true;
        } else if (arg1 == 15) {
            this.field1146 = true;
        } else if (arg1 == 16) {
            this.field1140 = true;
        }
        int var17 = 48 / ((arg0 - 40) / 45);
        field1142++;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 593)
    public static void method671(int arg0) {
        field1157 = null;
        if (arg0 != -1) {
            field1157 = null;
        }
    }
}
