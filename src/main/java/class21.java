import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class21 {

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Z")
    private boolean field311;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "Z")
    private boolean field329;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Lai;")
    public static class10 field324 = class44.method278("jlv", -25);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field323 = 0;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "Lai;")
    public static class10 field338 = class44.method278("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 115);

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field343 = 0;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Luh;")
    private class189 field318;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Lce;")
    public static class26 field322;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "[I")
    private int[] field317;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "[I")
    public int[] field335;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "[I")
    private int[] field337;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "[I")
    public int[] field345;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "[I")
    public int[] field348;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "[Luh;")
    private class189[] field312;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[Ljava/lang/Object;")
    public Object[] field309;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "[[I")
    private int[][] field334;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "[[I")
    private int[][] field342;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field314;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Z")
    public final boolean method135(int arg0, int arg1) {
        if (arg0 <= 98) {
            this.field309 = null;
        }
        field336++;
        if (this.field309[arg1] == null) {
            this.method152(false, arg1);
            return this.field309[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
    public final void method136(int arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field314[arg0].length; var3++) {
            this.field314[arg0][var3] = null;
        }
        if (arg1 != 45) {
            this.method151(79, (byte) 50);
        }
        field340++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B)V")
    public final void method137(int arg0, byte[] arg1) {
        field319++;
        this.field320 = class114.method763(arg1, true, arg1.length);
        class114 var3 = new class114(class180.method1159(7731, arg1));
        int var4 = var3.method767(true);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method761(arg0 ^ 0xFE);
        }
        int var5 = var3.method767(true);
        int var6 = -1;
        this.field331 = var3.method762((byte) 127);
        int var7 = 0;
        this.field317 = new int[this.field331];
        for (int var8 = 0; var8 < this.field331; var8++) {
            this.field317[var8] = var7 += var3.method762((byte) 89);
            if (this.field317[var8] > var6) {
                var6 = this.field317[var8];
            }
        }
        this.field314 = new Object[var6 + 1][];
        this.field335 = new int[arg0 + var6];
        this.field345 = new int[var6 + 1];
        this.field348 = new int[var6 + 1];
        this.field309 = new Object[var6 + 1];
        this.field342 = new int[var6 + 1][];
        if (var5 != 0) {
            this.field337 = new int[var6 + 1];
            for (int var9 = 0; var9 < var6 + 1; var9++) {
                this.field337[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field331; var10++) {
                this.field337[this.field317[var10]] = var3.method761(class34.method227(arg0, 254));
            }
            this.field318 = new class189(this.field337);
        }
        for (int var11 = 0; var11 < this.field331; var11++) {
            this.field345[this.field317[var11]] = var3.method761(255);
        }
        for (int var12 = 0; var12 < this.field331; var12++) {
            this.field335[this.field317[var12]] = var3.method761(arg0 + 254);
        }
        for (int var13 = 0; var13 < this.field331; var13++) {
            this.field348[this.field317[var13]] = var3.method762((byte) 118);
        }
        for (int var14 = 0; var14 < this.field331; var14++) {
            int var20 = 0;
            int var21 = this.field317[var14];
            int var22 = this.field348[var21];
            this.field342[var21] = new int[var22];
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                int var25 = this.field342[var21][var24] = var20 += var3.method762((byte) 116);
                if (var25 > var23) {
                    var23 = var25;
                }
            }
            this.field314[var21] = new Object[var23 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field334 = new int[var6 + 1][];
        this.field312 = new class189[var6 + 1];
        for (int var15 = 0; var15 < this.field331; var15++) {
            int var16 = this.field317[var15];
            int var17 = this.field348[var16];
            this.field334[var16] = new int[this.field314[var16].length];
            for (int var18 = 0; var18 < this.field314[var16].length; var18++) {
                this.field334[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                this.field334[var16][this.field342[var16][var19]] = var3.method761(255);
            }
            this.field312[var16] = new class189(this.field334[var16]);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Z")
    public final boolean method138(int arg0, int arg1) {
        if (arg1 != -493) {
            method146((byte) 17);
        }
        field305++;
        if (this.field314.length == 1) {
            return this.method150(arg0, 0, -92);
        } else if (this.field314[arg0].length == 1) {
            return this.method150(0, arg0, arg1 ^ 0x18F);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLai;)V")
    public final void method139(byte arg0, class10 arg1) {
        field308++;
        class10 var3 = arg1.method48(-34);
        int var4 = this.field318.method1211((byte) -111, var3.method35(101));
        if (var4 >= 0) {
            this.method148(var4, (byte) 112);
            if (arg0 < 86) {
                this.method151(-51, (byte) -73);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)[B")
    public final byte[] method140(byte arg0, int arg1) {
        field306++;
        if (this.field314.length == 1) {
            return this.method159((byte) 125, arg1, 0);
        } else if (this.field314[arg1].length == 1) {
            return this.method159((byte) -114, 0, arg1);
        } else {
            int var3 = -2 % ((3 - arg0) / 42);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[I)Z")
    private final boolean method141(int arg0, int arg1, int[] arg2) {
        field333++;
        if (this.field309[arg1] == null) {
            return false;
        }
        int var4 = this.field348[arg1];
        int[] var5 = this.field342[arg1];
        Object[] var6 = this.field314[arg1];
        boolean var7 = true;
        for (int var8 = arg0; var8 < var4; var8++) {
            if (var6[var5[var8]] == null) {
                var7 = false;
                break;
            }
        }
        if (var7) {
            return true;
        }
        byte[] var9;
        if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
            var9 = class153.method1040(this.field309[arg1], 27023, false);
        } else {
            var9 = class153.method1040(this.field309[arg1], arg0 + 27023, true);
            class114 var10 = new class114(var9);
            var10.method798(arg2, 5, -128, var10.field2160.length);
        }
        byte[] var11;
        try {
            var11 = class180.method1159(7731, var9);
        } catch (RuntimeException var28) {
            throw class106.method687(var28, "T3 - " + (arg2 != null) + "," + arg1 + "," + var9.length + "," + class114.method763(var9, true, var9.length) + "," + class114.method763(var9, true, var9.length - 2) + "," + this.field345[arg1] + "," + this.field320);
        }
        if (this.field329) {
            this.field309[arg1] = null;
        }
        if (var4 > 1) {
            int[] var13 = new int[var4];
            int var14 = var11.length;
            int var29 = var14 - 1;
            int var15 = var11[var29] & 0xFF;
            class114 var16 = new class114(var11);
            int var17 = var29 - var15 * 4 * var4;
            var16.field2170 = var17;
            for (int var18 = 0; var18 < var15; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var16.method761(255);
                    var13[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var13[var22]];
                var13[var22] = 0;
            }
            var16.field2170 = var17;
            int var23 = 0;
            for (int var24 = 0; var24 < var15; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var16.method761(255);
                    class12.method81(var11, var23, var21[var26], var13[var26], var25);
                    var23 += var25;
                    var13[var26] += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                if (this.field311) {
                    var6[var5[var27]] = var21[var27];
                } else {
                    var6[var5[var27]] = class11.method77(class34.method227(arg0, 136), false, var21[var27]);
                }
            }
        } else if (this.field311) {
            var6[var5[0]] = var11;
        } else {
            var6[var5[0]] = class11.method77(136, false, var11);
        }
        return true;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
    public final int method142(int arg0, int arg1) {
        if (arg1 >= -99) {
            field343 = 13;
        }
        field315++;
        return this.field314[arg0].length;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lai;ILai;)Z")
    public final boolean method143(class10 arg0, int arg1, class10 arg2) {
        class10 var4 = arg2.method48(-34);
        field330++;
        class10 var5 = arg0.method48(-34);
        if (arg1 > -51) {
            return false;
        } else {
            int var6 = this.field318.method1211((byte) -111, var4.method35(-96));
            int var7 = this.field312[var6].method1211((byte) -111, var5.method35(-93));
            return this.method150(var7, var6, -96);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public final void method144(int arg0) {
        field327++;
        if (arg0 != -19894) {
            this.method142(39, 29);
        }
        for (int var2 = 0; var2 < this.field314.length; var2++) {
            if (this.field314[var2] != null) {
                for (int var3 = 0; var3 < this.field314[var2].length; var3++) {
                    this.field314[var2][var3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static final void method145(int arg0) {
        int var1 = 10 % ((-arg0 - 77) / 44);
        class76.field1323.method635((byte) -86, 9);
        class56.field988++;
        class76.field1323.method783(0L, -113);
        field347++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method146(byte arg0) {
        if (arg0 == -23) {
            field338 = null;
            field322 = null;
            field324 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)[B")
    public final byte[] method147(int arg0, byte arg1, int arg2) {
        field328++;
        if (arg2 < 0 || arg2 >= this.field314.length || this.field314[arg2] == null || arg0 < 0 || this.field314[arg2].length <= arg0) {
            return null;
        }
        if (this.field314[arg2][arg0] == null) {
            boolean var4 = this.method141(0, arg2, null);
            if (!var4) {
                this.method152(false, arg2);
                boolean var5 = this.method141(0, arg2, null);
                if (!var5) {
                    return null;
                }
            }
        }
        if (arg1 != 110) {
            this.field317 = null;
        }
        return class153.method1040(this.field314[arg2][arg0], arg1 + 26913, false);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)V")
    public void method148(int arg0, byte arg1) {
        field316++;
        if (arg1 <= 92) {
            this.method147(-21, (byte) -66, 5);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lai;Lai;Z)[B")
    public final byte[] method149(class10 arg0, class10 arg1, boolean arg2) {
        field321++;
        class10 var4 = arg0.method48(-34);
        class10 var5 = arg1.method48(-34);
        int var6 = this.field318.method1211((byte) -111, var4.method35(-115));
        if (arg2) {
            this.field335 = null;
        }
        int var7 = this.field312[var6].method1211((byte) -111, var5.method35(-112));
        return this.method159((byte) 124, var7, var6);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
    public final boolean method150(int arg0, int arg1, int arg2) {
        field325++;
        if (arg1 < 0 || arg1 >= this.field314.length || this.field314[arg1] == null || arg0 < 0 || arg0 >= this.field314[arg1].length) {
            return false;
        } else if (this.field314[arg1][arg0] != null) {
            return true;
        } else if (this.field309[arg1] == null) {
            this.method152(false, arg1);
            if (this.field309[arg1] == null) {
                return arg2 > -21 ? false : false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(IB)[I")
    public final int[] method151(int arg0, byte arg1) {
        if (arg1 == -118) {
            field341++;
            return this.field342[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)V")
    public void method152(boolean arg0, int arg1) {
        if (arg0) {
            this.method158(106, null, 119, -28);
        }
        field346++;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)I")
    public final int method153(int arg0) {
        if (arg0 != -1) {
            this.method139((byte) -34, null);
        }
        field332++;
        return this.field314.length;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZLai;)I")
    public final int method154(int arg0, boolean arg1, class10 arg2) {
        if (arg1) {
            field310++;
            class10 var4 = arg2.method48(-34);
            return this.field312[arg0].method1211((byte) -111, var4.method35(-98));
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Z")
    public final boolean method155(int arg0) {
        if (arg0 != -15499) {
            this.field334 = null;
        }
        field344++;
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field317.length; var3++) {
            int var4 = this.field317[var3];
            if (this.field309[var4] == null) {
                this.method152(false, var4);
                if (this.field309[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILai;)I")
    public final int method156(int arg0, class10 arg1) {
        field313++;
        class10 var3 = arg1.method48(arg0 ^ 0xFFFFFFDE);
        return arg0 == 0 ? this.field318.method1211((byte) -111, var3.method35(-98)) : 50;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
    public static final void method157(int arg0) {
        field326++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class192 var1 = class30.field460;
            class82 var2;
            synchronized (class30.field460) {
                var2 = (class82) class131.field2484.method1232(false);
            }
            if (var2 == null) {
                return;
            }
            var2.field1429.method711((int) var2.field2291, var2.field1440, false, var2.field1439, 255);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[III)[B")
    public final byte[] method158(int arg0, int[] arg1, int arg2, int arg3) {
        field307++;
        if (arg0 > arg3 || arg3 >= this.field314.length || this.field314[arg3] == null || arg2 < 0 || this.field314[arg3].length <= arg2) {
            return null;
        }
        if (this.field314[arg3][arg2] == null) {
            boolean var5 = this.method141(0, arg3, arg1);
            if (!var5) {
                this.method152(false, arg3);
                boolean var6 = this.method141(0, arg3, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class153.method1040(this.field314[arg3][arg2], 27023, false);
        if (this.field311) {
            this.field314[arg3][arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)[B")
    public final byte[] method159(byte arg0, int arg1, int arg2) {
        field339++;
        int var4 = 37 % ((arg0 - 34) / 47);
        return this.method158(0, null, arg1, arg2);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ZZ)V")
    public class21(boolean arg0, boolean arg1) {
        this.field311 = arg1;
        this.field329 = arg0;
    }
}
