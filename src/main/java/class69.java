import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class69 extends class170 {

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    private int field1287 = 0;

    @OriginalMember(owner = "client!kg", name = "hb", descriptor = "[S")
    private short[] field1302 = new short[257];

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "Lmh;")
    private static class128 field1288 = class22.method156(122, "Hidden");

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "Lmh;")
    public static class128 field1291 = field1288;

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "Lmh;")
    public static class128 field1299 = class22.method156(126, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!kg", name = "ib", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "[I")
    private int[] field1296;

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "[I")
    private int[] field1300;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "[[I")
    private int[][] field1290;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V", line = 7)
    public static void method459(int arg0) {
        field1299 = null;
        if (arg0 != -2431) {
            method465((class249) null, -37, 31, -29, (byte) 56, 77, -65);
        }
        field1288 = null;
        field1291 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIBIIZ)V", line = 19)
    public static final void method460(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field1292++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (class247.field4247) {
            int var6 = arg4 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class298.field5081 + ((class225.field3926 - class298.field5081) * var6 / 100);
            if (var7 < class147.field2529) {
                var7 = class147.field2529;
            } else if (class30.field680 < var7) {
                var7 = class30.field680;
            }
            int var8 = arg4 * 512 * var7 / (arg0 * 334);
            if (var8 < class134.field2331) {
                short var9 = class134.field2331;
                var7 = arg0 * 334 * var9 / (arg4 * 512);
                if (var7 > class30.field680) {
                    var7 = class30.field680;
                    int var10 = arg4 * 512 * var7 / (var9 * 334);
                    int var11 = (arg0 - var10) / 2;
                    if (arg5) {
                        class269.method1879();
                        class269.method1878(arg1, arg3, var11, arg4, 0);
                        class269.method1878(arg0 + arg1 - var11, arg3, var11, arg4, 0);
                    }
                    arg0 -= var11 * 2;
                    arg1 += var11;
                }
            } else if (class22.field543 < var8) {
                short var12 = class22.field543;
                var7 = var12 * 334 * arg0 / (arg4 * 512);
                if (class147.field2529 > var7) {
                    var7 = class147.field2529;
                    int var13 = arg0 * 334 * var12 / (var7 * 512);
                    int var14 = (arg4 - var13) / 2;
                    if (arg5) {
                        class269.method1879();
                        class269.method1878(arg1, arg3, arg0, var14, 0);
                        class269.method1878(arg1, arg3 + arg4 - var14, arg0, var14, 0);
                    }
                    arg4 -= var14 * 2;
                    arg3 += var14;
                }
            }
            class86.field1506 = arg4 * var7 / 334;
        }
        class57.field1089 = (short) arg4;
        if (arg2 > -88) {
            method459(83);
        }
        class45.field911 = arg3;
        class140.field2403 = arg1;
        class116.field1951 = (short) arg0;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 215)
    public class69() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)[I", line = 128)
    public final int[] method69(byte arg0, int arg1) {
        field1286++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int[] var4 = this.method1142((byte) 44, 0, arg1);
            for (int var5 = 0; var5 < class185.field3225; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field1302[var6];
            }
        }
        if (arg0 != 85) {
            this.field1296 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V", line = 167)
    public final void method267(int arg0) {
        if (this.field1290 == null) {
            this.field1290 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field1301++;
        if (this.field1290.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (arg0 != -2718) {
            this.field1296 = (int[]) null;
        }
        if (this.field1287 == 2) {
            this.method461(-85);
        }
        class39.method265(6361);
        this.method464(-50);
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V", line = 195)
    private final void method461(int arg0) {
        field1289++;
        int[] var2 = this.field1290[0];
        int[] var3 = this.field1290[1];
        int[] var4 = this.field1290[this.field1290.length - 1];
        int[] var5 = this.field1290[this.field1290.length - 2];
        this.field1296 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
        if (arg0 <= -38) {
            this.field1300 = new int[] { var5[0] - (var4[0] - var5[0]), var5[1] + -var4[1] + var5[1] };
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB[I[Ljava/lang/Object;I)V", line = 229)
    public static final void method462(int arg0, byte arg1, int[] arg2, Object[] arg3, int arg4) {
        if (arg0 > arg4) {
            int var5 = arg4;
            int var6 = (arg0 + arg4) / 2;
            int var7 = arg2[var6];
            arg2[var6] = arg2[arg0];
            arg2[arg0] = var7;
            Object var8 = arg3[var6];
            arg3[var6] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if (arg2[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var5];
                    arg2[var5] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5++] = var11;
                }
            }
            arg2[arg0] = arg2[var5];
            arg2[var5] = var7;
            arg3[arg0] = arg3[var5];
            arg3[var5] = var8;
            method462(var5 - 1, (byte) -116, arg2, arg3, arg4);
            method462(arg0, (byte) 26, arg2, arg3, var5 + 1);
        }
        int var12 = -98 % ((arg1 + 50) / 57);
        field1297++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILbg;B)V", line = 290)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field1287 = arg1.method1325(7627);
            this.field1290 = new int[arg1.method1325(7627)][2];
            for (int var4 = 0; var4 < this.field1290.length; var4++) {
                this.field1290[var4][0] = arg1.method1308(-41);
                this.field1290[var4][1] = arg1.method1308(arg2 - 29);
            }
        }
        field1303++;
        if (arg2 != 13) {
            this.method267(-7);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)[I", line = 317)
    private final int[] method463(int arg0, int arg1) {
        field1294++;
        if (arg1 < 0) {
            return this.field1296;
        } else if (arg1 < this.field1290.length) {
            if (arg0 >= -119) {
                this.field1302 = (short[]) null;
            }
            return this.field1290[arg1];
        } else {
            return this.field1300;
        }
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V", line = 336)
    private final void method464(int arg0) {
        int var2 = -119 % ((53 - arg0) / 52);
        field1298++;
        int var3 = this.field1287;
        if (var3 == 2) {
            for (int var21 = 0; var21 < 257; var21++) {
                int var22 = var21 << 4;
                int var23;
                for (var23 = 1; var23 < this.field1290.length - 1 && var22 >= this.field1290[var23][0]; var23++) {
                }
                int[] var24 = this.field1290[var23 - 1];
                int[] var25 = this.field1290[var23];
                int var26 = this.method463(-126, var23 - 2)[1];
                int var27 = var24[1];
                int var28 = var25[1];
                int var29 = this.method463(-121, var23 + 1)[1];
                int var30 = (var22 - var24[0] << 12) / (var25[0] - var24[0]);
                int var31 = var28 - var26;
                int var32 = var29 - (var26 + var28 - var27);
                int var33 = var30 * var30 >> 12;
                int var34 = var26 - var32 - var27;
                int var36 = (var30 * var32 >> 12) * var33 >> 12;
                int var37 = var33 * var34 >> 12;
                int var38 = var30 * var31 >> 12;
                int var39 = var36 + var38 + var37 + var27;
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (var39 >= 32768) {
                    var39 = 32767;
                }
                this.field1302[var21] = (short) var39;
            }
        } else if (var3 == 1) {
            for (int var12 = 0; var12 < 257; var12++) {
                int var13 = var12 << 4;
                int var14;
                for (var14 = 1; this.field1290.length - 1 > var14 && var13 >= this.field1290[var14][0]; var14++) {
                }
                int[] var15 = this.field1290[var14 - 1];
                int[] var16 = this.field1290[var14];
                int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                int var18 = 4096 - class61.field1151[(var17 & 0x1FFE) >> 5] >> 1;
                int var19 = 4096 - var18;
                int var20 = var15[1] * var19 + (var16[1] * var18) >> 12;
                if (var20 <= -32768) {
                    var20 = -32767;
                }
                if (var20 >= 32768) {
                    var20 = 32767;
                }
                this.field1302[var12] = (short) var20;
            }
        } else {
            for (int var4 = 0; var4 < 257; var4++) {
                int var5 = var4 << 4;
                int var6;
                for (var6 = 1; var6 < this.field1290.length - 1 && this.field1290[var6][0] <= var5; var6++) {
                }
                int[] var7 = this.field1290[var6];
                int[] var8 = this.field1290[var6 - 1];
                int var9 = (var5 - var8[0] << 12) / (var7[0] - var8[0]);
                int var10 = 4096 - var9;
                int var11 = var8[1] * var10 + (var7[1] * var9) >> 12;
                if (var11 <= -32768) {
                    var11 = -32767;
                }
                if (var11 >= 32768) {
                    var11 = 32767;
                }
                this.field1302[var4] = (short) var11;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lid;IIIBII)V", line = 522)
    public static final void method465(class249 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        long var7 = 0L;
        if (arg4 != -90) {
            field1288 = (class128) null;
        }
        field1293++;
        if (arg1 == 0) {
            var7 = class201.method1402(arg3, arg2, arg6);
        } else if (arg1 == 1) {
            var7 = class84.method537(arg3, arg2, arg6);
        } else if (arg1 == 2) {
            var7 = class16.method125(arg3, arg2, arg6);
        } else if (arg1 == 3) {
            var7 = class240.method1633(arg3, arg2, arg6);
        }
        boolean var9 = true;
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        boolean var11 = false;
        class38 var12 = class239.method1629((byte) 79, var10);
        boolean var13 = false;
        int var14 = ((int) var7 & 0x7E381) >> 14;
        int var15 = (int) var7 >> 20 & 0x3;
        if (var12.method248(0)) {
            class89.method557(arg4 - 12743, arg6, arg3, arg2, var12);
        }
        if (var7 == 0L) {
            return;
        }
        class226 var16 = null;
        class226 var17 = null;
        if (arg1 == 0) {
            class65 var18 = class221.method1527(arg3, arg2, arg6);
            if (var18 != null) {
                var17 = var18.field1251;
                var16 = var18.field1252;
            }
            if (var12.field813 != 0) {
                arg0.method1735(var14, arg6, arg2, var12.field807, var15, 130);
            }
        } else if (arg1 == 1) {
            class161 var19 = class47.method326(arg3, arg2, arg6);
            if (var19 != null) {
                var16 = var19.field2761;
                var17 = var19.field2764;
            }
        } else if (arg1 == 2) {
            class5 var21 = class278.method1945(arg3, arg2, arg6);
            if (var21 != null) {
                var16 = var21.field105;
            }
            if (var12.field813 != 0 && (var12.field758 + arg2) < 104 && var12.field758 + arg6 < 104 && var12.field778 + arg2 < 104 && var12.field778 + arg6 < 104) {
                arg0.method1736(arg2, var12.field807, 98, var12.field778, arg6, var12.field758, var15);
            }
        } else if (arg1 == 3) {
            class92 var20 = class11.method89(arg3, arg2, arg6);
            if (var20 != null) {
                var16 = var20.field1572;
            }
            if (var12.field813 == 1) {
                arg0.method1729(arg2, arg6, -126);
            }
        }
        if (!class247.field4247 || !var12.field806) {
            return;
        }
        if (var14 == 2) {
            if (var16 instanceof class271) {
                ((class271) var16).method1911(arg4 ^ 0xFFFFCDEA);
            } else {
                class72.method480(var15 + 4, arg6, arg5, var12, 0, arg2, 0, -1, var14);
            }
            if ((var17 instanceof class271)) {
                ((class271) var17).method1911(arg4 ^ 0xFFFFCDEA);
            } else {
                class72.method480(var15 + 1 & 0x3, arg6, arg5, var12, 0, arg2, 0, -1, var14);
            }
        } else if (var14 == 5) {
            if ((var16 instanceof class271)) {
                ((class271) var16).method1911(12876);
            } else {
                class72.method480(var15, arg6, arg5, var12, class28.field597[var15] * 8, arg2, class226.field3952[var15] * 8, -1, 4);
            }
        } else if (var14 == 6) {
            if (var16 instanceof class271) {
                ((class271) var16).method1911(12876);
            } else {
                class72.method480(var15 + 4, arg6, arg5, var12, class99.field1727[var15] * 8, arg2, class158.field2712[var15] * 8, -1, 4);
            }
        } else if (var14 == 7) {
            if ((var16 instanceof class271)) {
                ((class271) var16).method1911(12876);
            } else {
                class72.method480((var15 + 2 & 0x3) + 4, arg6, arg5, var12, 0, arg2, 0, -1, 4);
            }
        } else if (var14 == 8) {
            if ((var16 instanceof class271)) {
                ((class271) var16).method1911(12876);
            } else {
                class72.method480(var15 + 4, arg6, arg5, var12, class99.field1727[var15] * 8, arg2, class158.field2712[var15] * 8, -1, 4);
            }
            if (var17 instanceof class271) {
                ((class271) var17).method1911(arg4 ^ 0xFFFFCDEA);
            } else {
                class72.method480((var15 + 2 & 0x3) + 4, arg6, arg5, var12, class99.field1727[var15] * 8, arg2, class158.field2712[var15] * 8, arg4 ^ 0x59, 4);
            }
        } else if (var14 == 11) {
            if ((var16 instanceof class271)) {
                ((class271) var16).method1911(12876);
            } else {
                class72.method480(var15 + 4, arg6, arg5, var12, 0, arg2, 0, -1, 10);
            }
        } else if (var16 instanceof class271) {
            ((class271) var16).method1911(arg4 + 12966);
        } else {
            class72.method480(var15, arg6, arg5, var12, 0, arg2, 0, arg4 ^ 0x59, var14);
        }
    }

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)I", line = 713)
    public static final int method466(int arg0) {
        field1295++;
        if (arg0 > -66) {
            method462(93, (byte) -39, (int[]) null, (Object[]) null, -6);
        }
        return 2;
    }
}
