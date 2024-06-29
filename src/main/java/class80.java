import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class80 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field1193 = -1;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public int field1196 = -1;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field1195 = 99;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public int field1202 = -1;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public int field1197 = 5;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public int field1207 = 2;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Z")
    public boolean field1212 = false;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Z")
    public boolean field1204 = false;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Z")
    public boolean field1203 = false;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public int field1200 = -1;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Z")
    public boolean field1219 = false;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public int field1226 = -1;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field1205 = -2;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field1213 = 0;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Ltl;")
    public static class222 field1201 = new class222(260);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field1225 = 0;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[I")
    public int[] field1209;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "[I")
    private int[] field1210;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "[I")
    public int[] field1223;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "[I")
    public static int[] field1224;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[Z")
    public boolean[] field1194;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "[[I")
    public int[][] field1206;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILlf;B)Llf;", line = 4)
    public final class134 method585(int arg0, int arg1, int arg2, class134 arg3, byte arg4) {
        field1211++;
        if (arg4 < 46) {
            return (class134) null;
        }
        int var6 = this.field1223[arg1];
        int var7 = this.field1209[arg1];
        class90 var8 = class7.method50(128, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method507(true, true, true);
        }
        class90 var10 = null;
        if ((this.field1203 || class218.field3506) && arg0 != -1 && arg0 < this.field1209.length) {
            int var11 = this.field1209[arg0];
            var10 = class7.method50(128, var11 >> 16);
            arg0 = var11 & 0xFFFF;
        }
        class134 var12;
        if (var10 == null) {
            var12 = arg3.method507(!var8.method649(var9, 15869), !var8.method650(1, var9), !this.field1219);
        } else {
            var12 = arg3.method507(!var8.method649(var9, 15869) & !var10.method649(arg0, 15869), !var8.method650(1, var9) & !var10.method650(1, arg0), !this.field1219);
        }
        var12.method916(var8, var9, var10, arg0, arg2 - 1, var6, this.field1219);
        return var12;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIBLlf;)Llf;", line = 49)
    public final class134 method586(int arg0, int arg1, int arg2, int arg3, byte arg4, class134 arg5) {
        field1216++;
        int var7 = this.field1223[arg3];
        int var8 = this.field1209[arg3];
        class90 var9 = class7.method50(128, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method527(true, true, true);
        }
        int var11 = arg1 & 0x3;
        class90 var12 = null;
        if ((this.field1203 || class218.field3506) && arg0 != -1 && arg0 < this.field1209.length) {
            int var13 = this.field1209[arg0];
            var12 = class7.method50(arg4 + 47, var13 >> 16);
            arg0 = var13 & 0xFFFF;
        }
        class134 var14;
        if (var12 == null) {
            var14 = arg5.method527(!var9.method649(var10, arg4 + 15788), !var9.method650(1, var10), !this.field1219);
        } else {
            var14 = arg5.method527(!var9.method649(var10, 15869) & !var12.method649(arg0, 15869), !var9.method650(1, var10) & !var12.method650(1, arg0), !this.field1219);
        }
        if (class186.field2991 && this.field1219) {
            if (var11 == 1) {
                ((class75) var14).method529();
            } else if (var11 == 2) {
                ((class75) var14).method500();
            } else if (var11 == 3) {
                ((class75) var14).method523();
            }
        } else if (var11 == 1) {
            var14.method524();
        } else if (var11 == 2) {
            var14.method533();
        } else if (var11 == 3) {
            var14.method503();
        }
        var14.method916(var9, var10, var12, arg0, arg2 - 1, var7, this.field1219);
        if (class186.field2991 && this.field1219) {
            if (var11 == 1) {
                ((class75) var14).method523();
            } else if (var11 == 2) {
                ((class75) var14).method500();
            } else if (var11 == 3) {
                ((class75) var14).method529();
            }
        } else if (var11 == 1) {
            var14.method503();
        } else if (var11 == 2) {
            var14.method533();
        } else if (var11 == 3) {
            var14.method524();
        }
        if (arg4 != 81) {
            method589((byte) -121);
        }
        return var14;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 156)
    public final void method587(int arg0) {
        if (this.field1202 == -1) {
            if (this.field1194 == null) {
                this.field1202 = 0;
            } else {
                this.field1202 = 2;
            }
        }
        if (this.field1200 == -1) {
            if (this.field1194 == null) {
                this.field1200 = 0;
            } else {
                this.field1200 = 2;
            }
        }
        int var2 = -120 % ((arg0 + 54) / 62);
        field1218++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II[[ILwh;[[FIZ[[F[I[[FLmm;)V", line = 190)
    public static final void method588(int arg0, int arg1, int[][] arg2, class11 arg3, float[][] arg4, int arg5, boolean arg6, float[][] arg7, int[] arg8, float[][] arg9, class272 arg10) {
        field1199++;
        if (!arg6) {
            method591((byte) 105);
        }
        int[] var11 = new int[arg8.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg8[var12 + var12];
            int var14 = arg8[var12 + var12 + 1];
            if (arg5 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg5 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg5 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg9[arg0][arg1];
                var18 = arg7[arg0][arg1];
                var19 = arg4[arg0][arg1];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg9[arg0 + 1][arg1];
                var18 = arg7[arg0 + 1][arg1];
                var19 = arg4[arg0 + 1][arg1];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg9[arg0 + 1][arg1 + 1];
                var19 = arg4[arg0 + 1][arg1 + 1];
                var18 = arg7[arg0 + 1][arg1 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var18 = arg7[arg0][arg1 + 1];
                var17 = arg9[arg0][arg1 + 1];
                var19 = arg4[arg0][arg1 + 1];
            } else {
                float var20 = arg9[arg0][arg1];
                float var21 = arg7[arg0][arg1];
                float var22 = (float) var13 / 128.0F;
                float var23 = (float) var14 / 128.0F;
                float var24 = (arg7[arg0 + 1][arg1] - var21) * var22 + var21;
                float var25 = (arg9[arg0 + 1][arg1] - var20) * var22 + var20;
                float var26 = arg9[arg0][arg1 + 1];
                float var27 = arg4[arg0][arg1];
                float var28 = arg4[arg0][arg1 + 1];
                float var29 = (arg9[arg0 + 1][arg1 + 1] - var26) * var22 + var26;
                var17 = (var29 - var25) * var23 + var25;
                float var30 = (arg4[arg0 + 1][arg1] - var27) * var22 + var27;
                float var31 = (arg4[arg0 + 1][arg1 + 1] - var28) * var22 + var28;
                var19 = (var31 - var30) * var23 + var30;
                float var32 = arg7[arg0][arg1 + 1];
                float var33 = (arg7[arg0 + 1][arg1 + 1] - var32) * var22 + var32;
                var18 = (var33 - var24) * var23 + var24;
            }
            int var34 = class218.method1595(arg2, arg1, var13, 127, var14, arg0);
            int var35 = (arg0 << 7) + var13;
            int var36 = (arg1 << 7) + var14;
            var11[var12] = arg3.method65(arg10, var35, var34, var36, var19, var17, var18);
        }
        arg3.method64(var11);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 311)
    public static final void method589(byte arg0) {
        if (arg0 > -105) {
            return;
        }
        field1208++;
        int var1 = class28.field398;
        int var2 = class170.field2711;
        int var3 = class71.field910 - var2 - class160.field2601;
        int var4 = class35.field460 - var1 - class210.field3432;
        if (var2 <= 0 && var3 <= 0 && var1 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class113.field1688 != null) {
                var5 = class113.field1688;
            } else if (class161.field2635 == null) {
                var5 = class264.field4183.field68;
            } else {
                var5 = class161.field2635;
            }
            int var6 = 0;
            int var7 = 0;
            if (class161.field2635 == var5) {
                Insets var8 = class161.field2635.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var2 > 0) {
                var9.fillRect(var6, var7, var2, class35.field460);
            }
            if (var1 > 0) {
                var9.fillRect(var6, var7, class71.field910, var1);
            }
            if (var3 > 0) {
                var9.fillRect(class71.field910 + var6 - var3, var7, var3, class35.field460);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class35.field460 + var7 - var4, class71.field910, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V", line = 378)
    public static final void method590(int arg0, byte arg1) {
        field1222++;
        if (arg0 == -1 || !class204.method1498((byte) -124, arg0)) {
            return;
        }
        class160[] var2 = class21.field309[arg0];
        int var3 = 0;
        if (arg1 != -115) {
            field1213 = 31;
        }
        while (var3 < var2.length) {
            class160 var4 = var2[var3];
            if (var4.field2611 != null) {
                class247 var5 = new class247();
                var5.field3925 = var4.field2611;
                var5.field3931 = var4;
                class149.method1039(-1279, 2000000, var5);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 433)
    public static void method591(byte arg0) {
        field1224 = null;
        if (arg0 != -76) {
            method588(115, 69, (int[][]) ((int[][]) null), (class11) null, (float[][]) ((float[][]) null), 63, false, (float[][]) ((float[][]) null), (int[]) null, (float[][]) ((float[][]) null), (class272) null);
        }
        field1201 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILim;)V", line = 452)
    private final void method592(int arg0, int arg1, class192 arg2) {
        if (arg0 != 0) {
            this.field1219 = true;
        }
        if (arg1 == 1) {
            int var4 = arg2.method1396(arg0 ^ 0xFFFFFFAC);
            this.field1223 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1223[var5] = arg2.method1396(-113);
            }
            this.field1209 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1209[var6] = arg2.method1396(-31);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1209[var7] += arg2.method1396(-41) << 16;
            }
        } else if (arg1 == 2) {
            this.field1196 = arg2.method1396(-59);
        } else if (arg1 == 3) {
            this.field1194 = new boolean[256];
            int var8 = arg2.method1399(-1172389784);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1194[arg2.method1399(-1172389784)] = true;
            }
        } else if (arg1 == 4) {
            this.field1212 = true;
        } else if (arg1 == 5) {
            this.field1197 = arg2.method1399(-1172389784);
        } else if (arg1 == 6) {
            this.field1226 = arg2.method1396(-71);
        } else if (arg1 == 7) {
            this.field1193 = arg2.method1396(-88);
        } else if (arg1 == 8) {
            this.field1195 = arg2.method1399(-1172389784);
        } else if (arg1 == 9) {
            this.field1200 = arg2.method1399(-1172389784);
        } else if (arg1 == 10) {
            this.field1202 = arg2.method1399(-1172389784);
        } else if (arg1 == 11) {
            this.field1207 = arg2.method1399(-1172389784);
        } else if (arg1 == 12) {
            int var14 = arg2.method1399(arg0 - 1172389784);
            this.field1210 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field1210[var15] = arg2.method1396(-59);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field1210[var16] = (arg2.method1396(-53) << 16) + this.field1210[var16];
            }
        } else if (arg1 == 13) {
            int var10 = arg2.method1396(arg0 - 116);
            this.field1206 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg2.method1399(-1172389784);
                if (var12 > 0) {
                    this.field1206[var11] = new int[var12];
                    this.field1206[var11][0] = arg2.method1378(false);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field1206[var11][var13] = arg2.method1396(-43);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field1219 = true;
        } else if (arg1 == 15) {
            this.field1203 = true;
        } else if (arg1 == 16) {
            this.field1204 = true;
        }
        field1198++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZILlf;I)Llf;", line = 622)
    public final class134 method593(int arg0, boolean arg1, int arg2, class134 arg3, int arg4) {
        if (!arg1) {
            this.method585(-32, -93, -28, (class134) null, (byte) -91);
        }
        field1217++;
        int var6 = this.field1223[arg0];
        int var7 = this.field1209[arg0];
        class90 var8 = class7.method50(128, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method542(true, true, true);
        }
        class90 var10 = null;
        class90 var11 = null;
        if ((this.field1203 || class218.field3506) && arg2 != -1 && arg2 < this.field1209.length) {
            int var12 = this.field1209[arg2];
            var11 = class7.method50(128, var12 >> 16);
            arg2 = var12 & 0xFFFF;
        }
        class90 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field1210 != null) {
            if (arg0 < this.field1210.length) {
                var15 = this.field1210[arg0];
                if (var15 != 65535) {
                    var10 = class7.method50(128, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1203 || class218.field3506) && arg2 != -1 && this.field1210.length > arg2) {
                var14 = this.field1210[arg2];
                if (var14 != 65535) {
                    var13 = class7.method50(128, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method649(var9, 15869);
        boolean var17 = !var8.method650(1, var9);
        if (var10 != null) {
            var16 &= !var10.method649(var15, 15869);
            var17 &= !var10.method650(1, var15);
        }
        if (var11 != null) {
            var16 &= !var11.method649(arg2, 15869);
            var17 &= !var11.method650(1, arg2);
        }
        if (var13 != null) {
            var16 &= !var13.method649(var14, 15869);
            var17 &= !var13.method650(1, var14);
        }
        class134 var18 = arg3.method542(var16, var17, !this.field1219);
        var18.method916(var8, var9, var11, arg2, arg4 - 1, var6, this.field1219);
        if (var10 != null) {
            var18.method916(var10, var15, var13, var14, arg4 - 1, var6, this.field1219);
        }
        return var18;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)I", line = 726)
    public static final int method594(byte arg0, int arg1) {
        field1214++;
        int var2 = -82 % ((-arg0 - 55) / 48);
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lim;I)V", line = 747)
    public final void method595(class192 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1399(-1172389784);
            if (var3 == 0) {
                if (arg1 < 120) {
                    method588(-112, -95, (int[][]) ((int[][]) null), (class11) null, (float[][]) ((float[][]) null), 2, false, (float[][]) ((float[][]) null), (int[]) null, (float[][]) ((float[][]) null), (class272) null);
                }
                field1215++;
                return;
            }
            this.method592(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIILlf;)Llf;", line = 771)
    public final class134 method596(int arg0, int arg1, int arg2, int arg3, int arg4, class134 arg5) {
        if (arg1 != 23439) {
            return (class134) null;
        }
        int var7 = this.field1223[arg0];
        int var8 = this.field1209[arg0];
        field1220++;
        class90 var9 = class7.method50(128, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method542(true, true, true);
        }
        int var11 = arg4 & 0x3;
        class90 var12 = null;
        if ((this.field1203 || class218.field3506) && arg3 != -1 && arg3 < this.field1209.length) {
            int var13 = this.field1209[arg3];
            var12 = class7.method50(128, var13 >> 16);
            arg3 = var13 & 0xFFFF;
        }
        class134 var14;
        if (var12 == null) {
            var14 = arg5.method542(!var9.method649(var10, 15869), !var9.method650(1, var10), !this.field1219);
        } else {
            var14 = arg5.method542(!var9.method649(var10, arg1 - 7570) & !var12.method649(arg3, arg1 - 7570), !var9.method650(1, var10) & !var12.method650(1, arg3), !this.field1219);
        }
        if (this.field1219 && class186.field2991) {
            if (var11 == 1) {
                ((class75) var14).method529();
            } else if (var11 == 2) {
                ((class75) var14).method500();
            } else if (var11 == 3) {
                ((class75) var14).method523();
            }
        } else if (var11 == 1) {
            var14.method524();
        } else if (var11 == 2) {
            var14.method533();
        } else if (var11 == 3) {
            var14.method503();
        }
        var14.method916(var9, var10, var12, arg3, arg2 - 1, var7, this.field1219);
        if (this.field1219 && class186.field2991) {
            if (var11 == 1) {
                ((class75) var14).method523();
            } else if (var11 == 2) {
                ((class75) var14).method500();
            } else if (var11 == 3) {
                ((class75) var14).method529();
            }
        } else if (var11 == 1) {
            var14.method503();
        } else if (var11 == 2) {
            var14.method533();
        } else if (var11 == 3) {
            var14.method524();
        }
        return var14;
    }
}
