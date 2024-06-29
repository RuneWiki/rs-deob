import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class9 {

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Z")
    private boolean field177;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "Z")
    private boolean field206;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Leh;")
    public static class47 field176 = class195.method1282((byte) -4, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Leh;")
    public static class47 field188 = class195.method1282((byte) -4, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "Leh;")
    public static class47 field196 = class195.method1282((byte) -4, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Leh;")
    public static class47 field171 = class195.method1282((byte) -4, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Leh;")
    public static class47 field190 = class195.method1282((byte) -4, "<col=ff7000>");

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static int field211 = 0;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "[I")
    public static int[] field210 = new int[500];

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lnb;")
    private class119 field170;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "[I")
    public int[] field174;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "[I")
    private int[] field200;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "[I")
    private int[] field201;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "[I")
    public int[] field202;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "[I")
    public int[] field204;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "[Lnb;")
    private class119[] field175;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "[Ljava/lang/Object;")
    public Object[] field183;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "[[I")
    private int[][] field199;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "[[I")
    private int[][] field205;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field169;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)[B")
    public final byte[] method57(int arg0, int arg1, int arg2) {
        if (arg1 >= -26) {
            this.method80(-95, 70);
        }
        field168++;
        if (arg2 < 0 || arg2 >= this.field169.length || this.field169[arg2] == null || arg0 < 0 || arg0 >= this.field169[arg2].length) {
            return null;
        }
        if (this.field169[arg2][arg0] == null) {
            boolean var4 = this.method76(null, (byte) 112, arg2);
            if (!var4) {
                this.method66((byte) -28, arg2);
                boolean var5 = this.method76(null, (byte) 122, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        return class16.method173(false, this.field169[arg2][arg0], 67108863);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Z")
    public final boolean method58(int arg0) {
        field203++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field200.length; var3++) {
            int var4 = this.field200[var3];
            if (this.field183[var4] == null) {
                this.method66((byte) -28, var4);
                if (this.field183[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public final void method59(int arg0) {
        field173++;
        for (int var2 = 0; var2 < this.field169.length; var2++) {
            if (this.field169[var2] != null) {
                for (int var3 = 0; var3 < this.field169[var2].length; var3++) {
                    this.field169[var2][var3] = null;
                }
            }
        }
        if (arg0 < 110) {
            this.method74((byte) 42, null, null);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BII)Z")
    public final boolean method60(byte arg0, int arg1, int arg2) {
        field192++;
        int var4 = -125 % ((arg0 + 44) / 55);
        if (arg2 < 0 || this.field169.length <= arg2 || this.field169[arg2] == null || arg1 < 0 || this.field169[arg2].length <= arg1) {
            return false;
        } else if (this.field169[arg2][arg1] != null) {
            return true;
        } else if (this.field183[arg2] == null) {
            this.method66((byte) -28, arg2);
            return this.field183[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method63(-69, null);
        }
        field181++;
        return this.field205[arg1];
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLeh;)V")
    public final void method62(byte arg0, class47 arg1) {
        field195++;
        class47 var3 = arg1.method406(arg0 + 8);
        if (arg0 == -59) {
            int var4 = this.field170.method922(var3.method397((byte) 88), (byte) 40);
            if (var4 >= 0) {
                this.method70((byte) 125, var4);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[B)V")
    public final void method63(int arg0, byte[] arg1) {
        field187++;
        this.field208 = class61.method523(arg1, false, arg1.length);
        class68 var3 = new class68(class137.method998(arg1, 115));
        int var4 = var3.method604((byte) -43);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        int var5 = 0;
        if (var4 >= 6) {
            var3.method599((byte) 96);
        }
        int var6 = var3.method604((byte) 90);
        int var7 = -1;
        this.field179 = var3.method569(arg0 ^ 0xFFFFC435);
        this.field200 = new int[this.field179];
        for (int var8 = 0; var8 < this.field179; var8++) {
            this.field200[var8] = var5 += var3.method569(arg0 + 50123);
            if (var7 < this.field200[var8]) {
                var7 = this.field200[var8];
            }
        }
        this.field204 = new int[var7 + 1];
        this.field205 = new int[var7 + 1][];
        this.field202 = new int[var7 + 1];
        this.field169 = new Object[var7 + 1][];
        this.field183 = new Object[var7 + 1];
        this.field174 = new int[var7 + 1];
        if (var6 != 0) {
            this.field201 = new int[var7 + 1];
            for (int var9 = 0; var9 < var7 + 1; var9++) {
                this.field201[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field179; var10++) {
                this.field201[this.field200[var10]] = var3.method599((byte) 96);
            }
            this.field170 = new class119(this.field201);
        }
        for (int var11 = 0; var11 < this.field179; var11++) {
            this.field202[this.field200[var11]] = var3.method599((byte) 96);
        }
        if (arg0 != -23627) {
            this.method80(-61, 112);
        }
        for (int var12 = 0; var12 < this.field179; var12++) {
            this.field174[this.field200[var12]] = var3.method599((byte) 96);
        }
        for (int var13 = 0; var13 < this.field179; var13++) {
            this.field204[this.field200[var13]] = var3.method569(26496);
        }
        for (int var14 = 0; var14 < this.field179; var14++) {
            int var20 = -1;
            int var21 = 0;
            int var22 = this.field200[var14];
            int var23 = this.field204[var22];
            this.field205[var22] = new int[var23];
            for (int var24 = 0; var24 < var23; var24++) {
                int var25 = this.field205[var22][var24] = var21 += var3.method569(arg0 + 50123);
                if (var20 < var25) {
                    var20 = var25;
                }
            }
            this.field169[var22] = new Object[var20 + 1];
        }
        if (var6 == 0) {
            return;
        }
        this.field175 = new class119[var7 + 1];
        this.field199 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field179; var15++) {
            int var16 = this.field200[var15];
            int var17 = this.field204[var16];
            this.field199[var16] = new int[this.field169[var16].length];
            for (int var18 = 0; var18 < this.field169[var16].length; var18++) {
                this.field199[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                this.field199[var16][this.field205[var16][var19]] = var3.method599((byte) 96);
            }
            this.field175[var16] = new class119(this.field199[var16]);
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public static void method64(int arg0) {
        field188 = null;
        field196 = null;
        field210 = null;
        field176 = null;
        field171 = null;
        if (arg0 >= -127) {
            field210 = null;
        }
        field190 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class206 var20 = new class206(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class173.field3351[var21][arg1][arg2] == null) {
                    class173.field3351[var21][arg1][arg2] = new class152(var21, arg1, arg2);
                }
            }
            class173.field3351[arg0][arg1][arg2].field2973 = var20;
        } else if (arg3 == 1) {
            class206 var22 = new class206(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class173.field3351[var23][arg1][arg2] == null) {
                    class173.field3351[var23][arg1][arg2] = new class152(var23, arg1, arg2);
                }
            }
            class173.field3351[arg0][arg1][arg2].field2973 = var22;
        } else {
            class46 var24 = new class46(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class173.field3351[var25][arg1][arg2] == null) {
                    class173.field3351[var25][arg1][arg2] = new class152(var25, arg1, arg2);
                }
            }
            class173.field3351[arg0][arg1][arg2].field2994 = var24;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V")
    public void method66(byte arg0, int arg1) {
        field209++;
        if (arg0 != -28) {
            this.method78(null, 54, null);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(III)[B")
    public final byte[] method67(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field171 = null;
        }
        field180++;
        return this.method79(null, arg1 ^ 0xFFFFFFCF, arg2, arg0);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
    public final int method68(int arg0, int arg1) {
        if (arg0 <= 34) {
            return 118;
        } else {
            field172++;
            return this.field169[arg1].length;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)Z")
    public final boolean method69(int arg0, int arg1) {
        field198++;
        if (arg1 != 0) {
            return false;
        } else if (this.field169.length == 1) {
            return this.method60((byte) 104, arg0, 0);
        } else if (this.field169[arg0].length == 1) {
            return this.method60((byte) 60, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(BI)V")
    public void method70(byte arg0, int arg1) {
        field212++;
        if (arg0 != 125) {
            this.field174 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
    public final int method71(byte arg0) {
        int var2 = -37 % ((57 - arg0) / 36);
        field191++;
        return this.field169.length;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)[B")
    public final byte[] method72(int arg0, byte arg1) {
        if (arg1 != -98) {
            return null;
        }
        field186++;
        if (this.field169.length == 1) {
            return this.method67(0, -1, arg0);
        } else if (this.field169[arg0].length == 1) {
            return this.method67(arg0, -1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)Z")
    public final boolean method73(int arg0, boolean arg1) {
        field207++;
        if (this.field183[arg0] != null) {
            return true;
        }
        this.method66((byte) -28, arg0);
        if (this.field183[arg0] == null) {
            if (arg1) {
                this.method68(-9, 22);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLeh;Leh;)Z")
    public final boolean method74(byte arg0, class47 arg1, class47 arg2) {
        class47 var4 = arg2.method406(-54);
        field184++;
        if (arg0 == 98) {
            class47 var5 = arg1.method406(-115);
            int var6 = this.field170.method922(var4.method397((byte) 88), (byte) 85);
            int var7 = this.field175[var6].method922(var5.method397((byte) 88), (byte) 89);
            return this.method60((byte) 47, var7, var6);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Leh;I)I")
    public final int method75(class47 arg0, int arg1) {
        field178++;
        class47 var3 = arg0.method406(-107);
        return arg1 == 31499 ? this.field170.method922(var3.method397((byte) 88), (byte) 125) : -105;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([IBI)Z")
    private final boolean method76(int[] arg0, byte arg1, int arg2) {
        field182++;
        if (this.field183[arg2] == null) {
            return false;
        }
        int var4 = this.field204[arg2];
        int[] var5 = this.field205[arg2];
        Object[] var6 = this.field169[arg2];
        boolean var7 = true;
        if (arg1 < 88) {
            return false;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            if (var6[var5[var8]] == null) {
                var7 = false;
                break;
            }
        }
        if (var7) {
            return true;
        }
        byte[] var9;
        if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
            var9 = class16.method173(false, this.field183[arg2], 67108863);
        } else {
            var9 = class16.method173(true, this.field183[arg2], 67108863);
            class68 var10 = new class68(var9);
            var10.method560(var10.field1495.length, arg0, (byte) 66, 5);
        }
        byte[] var11;
        try {
            var11 = class137.method998(var9, 98);
        } catch (RuntimeException var28) {
            throw class18.method196(var28, "T3 - " + (arg0 != null) + "," + arg2 + "," + var9.length + "," + class61.method523(var9, false, var9.length) + "," + class61.method523(var9, false, var9.length - 2) + "," + this.field202[arg2] + "," + this.field208);
        }
        if (this.field177) {
            this.field183[arg2] = null;
        }
        if (var4 > 1) {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            int[] var15 = new int[var4];
            int var16 = var29 - var14 * 4 * var4;
            class68 var17 = new class68(var11);
            var17.field1454 = var16;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var17.method599((byte) 96);
                    var15[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var15[var22]];
                var15[var22] = 0;
            }
            var17.field1454 = var16;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var17.method599((byte) 96);
                    class128.method958(var11, var23, var21[var26], var15[var26], var25);
                    var23 += var25;
                    var15[var26] += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                if (this.field206) {
                    var6[var5[var27]] = var21[var27];
                } else {
                    var6[var5[var27]] = class56.method490(136, var21[var27], false);
                }
            }
        } else if (this.field206) {
            var6[var5[0]] = var11;
        } else {
            var6[var5[0]] = class56.method490(136, var11, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(ZZ)V")
    public class9(boolean arg0, boolean arg1) {
        this.field177 = arg0;
        this.field206 = arg1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Leh;IZ)I")
    public final int method77(class47 arg0, int arg1, boolean arg2) {
        class47 var4 = arg0.method406(-52);
        if (arg2) {
            field185++;
            return this.field175[arg1].method922(var4.method397((byte) 88), (byte) 93);
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Leh;ILeh;)[B")
    public final byte[] method78(class47 arg0, int arg1, class47 arg2) {
        field189++;
        class47 var4 = arg2.method406(-103);
        class47 var5 = arg0.method406(-48);
        if (arg1 != -2294) {
            this.method71((byte) -101);
        }
        int var6 = this.field170.method922(var4.method397((byte) 88), (byte) 122);
        int var7 = this.field175[var6].method922(var5.method397((byte) 88), (byte) 63);
        return this.method67(var6, -1, var7);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([IIII)[B")
    public final byte[] method79(int[] arg0, int arg1, int arg2, int arg3) {
        field194++;
        int var5 = 125 / ((arg1 + 70) / 45);
        if (arg3 < 0 || arg3 >= this.field169.length || this.field169[arg3] == null || arg2 < 0 || this.field169[arg3].length <= arg2) {
            return null;
        }
        if (this.field169[arg3][arg2] == null) {
            boolean var6 = this.method76(arg0, (byte) 93, arg3);
            if (!var6) {
                this.method66((byte) -28, arg3);
                boolean var7 = this.method76(arg0, (byte) 111, arg3);
                if (!var7) {
                    return null;
                }
            }
        }
        byte[] var8 = class16.method173(false, this.field169[arg3][arg2], 67108863);
        if (this.field206) {
            this.field169[arg3][arg2] = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(II)V")
    public final void method80(int arg0, int arg1) {
        if (arg0 >= -111) {
            this.method63(-83, null);
        }
        for (int var3 = 0; var3 < this.field169[arg1].length; var3++) {
            this.field169[arg1][var3] = null;
        }
        field197++;
    }
}
