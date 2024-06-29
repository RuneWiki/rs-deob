import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class67 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public int field1138 = 5;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public int field1149 = -1;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public int field1147 = -1;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public int field1141 = -1;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public int field1142 = 99;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public int field1156 = -1;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Z")
    public boolean field1150 = false;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "Z")
    private boolean field1160 = false;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public int field1162 = 2;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public int field1139 = -1;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1137 = 1;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "Lmb;")
    public static class96 field1155 = class243.method1708("Starte 3D)2Softwarebibliothek)3", (byte) 121);

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "[I")
    private int[] field1136;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "[I")
    public int[] field1140;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "[I")
    public int[] field1143;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "[I")
    private int[] field1144;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "[Lrf;")
    public static class30[] field1153;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "[[I")
    public int[][] field1146;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILra;Lpk;I)Lra;")
    public final class35 method461(int arg0, int arg1, class35 arg2, class67 arg3, int arg4) {
        int var6 = this.field1140[arg0];
        field1145++;
        class247 var7 = class272.method1852(var6 >> 16, -1);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg3.method470(false, arg2, arg4);
        }
        int var9 = arg3.field1140[arg4];
        if (arg1 <= 25) {
            return null;
        }
        class247 var10 = class272.method1852(var9 >> 16, -1);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class35 var12 = arg2.method277(!var7.method1730(var8, 1), !this.field1160);
            var12.method265(var7, var8, this.field1160);
            return var12;
        } else {
            class35 var13 = arg2.method277(!var7.method1730(var8, 1) & !var10.method1730(var11, 1), !this.field1160 & !arg3.field1160);
            var13.method282(var7, var8, var10, var11, this.field1136, this.field1160 | arg3.field1160);
            return var13;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILra;II)Lra;")
    public final class35 method462(int arg0, class35 arg1, int arg2, int arg3) {
        int var5 = this.field1140[arg2];
        field1159++;
        class247 var6 = class272.method1852(var5 >> 16, -1);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method277(true, true);
        }
        int var8 = arg3 & 0x3;
        class35 var9 = arg1.method277(!var6.method1730(var7, 1), !this.field1160);
        if (var8 == 1) {
            var9.method279();
        } else if (var8 == 2) {
            var9.method273();
        } else if (var8 == 3) {
            var9.method281();
        }
        var9.method265(var6, var7, this.field1160);
        if (arg0 == var8) {
            var9.method281();
        } else if (var8 == 2) {
            var9.method273();
        } else if (var8 == 3) {
            var9.method279();
        }
        return var9;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZII)I")
    public static final int method463(int arg0, boolean arg1, int arg2, int arg3) {
        field1158++;
        int var4 = arg0 / arg2;
        int var5 = arg3 / arg2;
        int var6 = arg2 - 1 & arg3;
        int var7 = arg0 & arg2 - 1;
        int var8 = class2.method11(true, var4, var5);
        int var9 = class2.method11(arg1, var4 + 1, var5);
        int var10 = class2.method11(arg1, var4, var5 + 1);
        int var11 = class2.method11(true, var4 + 1, var5 + 1);
        int var12 = class252.method1753(var8, var9, arg2, var7, -110);
        int var13 = class252.method1753(var10, var11, arg2, var7, -60);
        return class252.method1753(var12, var13, arg2, var6, 113);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lra;IB)Lra;")
    public final class35 method464(class35 arg0, int arg1, byte arg2) {
        field1154++;
        int var4 = this.field1140[arg1];
        class247 var5 = class272.method1852(var4 >> 16, -1);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method275(true, true);
        }
        class35 var7 = arg0.method275(!var5.method1730(var6, 1), !this.field1160);
        var7.method265(var5, var6, this.field1160);
        if (arg2 != -47) {
            this.method461(114, -98, (class35) null, (class67) null, 127);
        }
        return var7;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public static void method465(boolean arg0) {
        if (arg0) {
            method465(true);
        }
        field1153 = null;
        field1155 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public final void method466(byte arg0) {
        if (this.field1147 == -1) {
            if (this.field1136 == null) {
                this.field1147 = 0;
            } else {
                this.field1147 = 2;
            }
        }
        field1161++;
        if (arg0 > -110) {
            this.method468((class239) null, 67);
        }
        if (this.field1156 != -1) {
            return;
        }
        if (this.field1136 == null) {
            this.field1156 = 0;
        } else {
            this.field1156 = 2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lrg;II)V")
    private final void method467(class239 arg0, int arg1, int arg2) {
        if (arg2 != -30902) {
            method465(true);
        }
        field1151++;
        if (arg1 == 1) {
            int var13 = arg0.method1663((byte) 104);
            this.field1143 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1143[var14] = arg0.method1663((byte) 93);
            }
            this.field1140 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field1140[var15] = arg0.method1663((byte) 66);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field1140[var16] += arg0.method1663((byte) 62) << 16;
            }
        } else if (arg1 == 2) {
            this.field1149 = arg0.method1663((byte) -119);
        } else if (arg1 == 3) {
            int var4 = arg0.method1651(arg2 ^ 0xFFFF9761);
            this.field1136 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1136[var5] = arg0.method1651(arg2 + 35041);
            }
            this.field1136[var4] = 9999999;
        } else if (arg1 == 4) {
            this.field1150 = true;
        } else if (arg1 == 5) {
            this.field1138 = arg0.method1651(4139);
        } else if (arg1 == 6) {
            this.field1141 = arg0.method1663((byte) -119);
        } else if (arg1 == 7) {
            this.field1139 = arg0.method1663((byte) -80);
        } else if (arg1 == 8) {
            this.field1142 = arg0.method1651(arg2 ^ 0xFFFF9761);
        } else if (arg1 == 9) {
            this.field1156 = arg0.method1651(4139);
        } else if (arg1 == 10) {
            this.field1147 = arg0.method1651(4139);
        } else if (arg1 == 11) {
            this.field1162 = arg0.method1651(arg2 + 35041);
        } else if (arg1 == 12) {
            int var10 = arg0.method1651(4139);
            this.field1144 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1144[var11] = arg0.method1663((byte) -122);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field1144[var12] = (arg0.method1663((byte) 113) << 16) + this.field1144[var12];
            }
        } else if (arg1 == 13) {
            int var6 = arg0.method1663((byte) 87);
            this.field1146 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1651(4139);
                if (var8 > 0) {
                    this.field1146[var7] = new int[var8];
                    this.field1146[var7][0] = arg0.method1660(-335289648);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field1146[var7][var9] = arg0.method1663((byte) 88);
                    }
                }
            }
            return;
        } else if (arg1 == 14) {
            this.field1160 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lrg;I)V")
    public final void method468(class239 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1651(4139);
            if (var3 == 0) {
                field1157++;
                if (arg1 != 0) {
                    this.field1146 = null;
                    return;
                }
                return;
            }
            this.method467(arg0, var3, -30902);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lra;II)Lra;")
    public final class35 method469(class35 arg0, int arg1, int arg2) {
        field1152++;
        int var4 = this.field1140[arg2];
        class247 var5 = class272.method1852(var4 >> 16, -1);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method277(true, true);
        }
        int var7 = 21 % ((-arg1 - 59) / 37);
        int var8 = 0;
        class247 var9 = null;
        if (this.field1144 != null && arg2 < this.field1144.length) {
            int var10 = this.field1144[arg2];
            var9 = class272.method1852(var10 >> 16, -1);
            var8 = var10 & 0xFFFF;
        }
        if (var9 == null || var8 == 65535) {
            class35 var12 = arg0.method277(!var5.method1730(var6, 1), !this.field1160);
            var12.method265(var5, var6, this.field1160);
            return var12;
        } else {
            class35 var11 = arg0.method277(!var5.method1730(var6, 1) & !var9.method1730(var8, 1), !this.field1160);
            var11.method265(var5, var6, this.field1160);
            var11.method265(var9, var8, this.field1160);
            return var11;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLra;I)Lra;")
    public final class35 method470(boolean arg0, class35 arg1, int arg2) {
        if (arg0) {
            this.method464((class35) null, 38, (byte) 35);
        }
        field1148++;
        int var4 = this.field1140[arg2];
        class247 var5 = class272.method1852(var4 >> 16, -1);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method277(true, true);
        } else {
            class35 var7 = arg1.method277(!var5.method1730(var6, 1), !this.field1160);
            var7.method265(var5, var6, this.field1160);
            return var7;
        }
    }
}
