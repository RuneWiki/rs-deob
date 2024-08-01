import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bg")
public abstract class class18 {

    @OriginalMember(owner = "bg", name = "b", descriptor = "Z")
    private boolean field361;

    @OriginalMember(owner = "bg", name = "K", descriptor = "Z")
    private boolean field396;

    @OriginalMember(owner = "bg", name = "d", descriptor = "Llf;")
    private static class109 field363 = class35.method275("Too many incorrect logins from your address)3", 2);

    @OriginalMember(owner = "bg", name = "t", descriptor = "[I")
    public static int[] field379 = new int[25];

    @OriginalMember(owner = "bg", name = "y", descriptor = "[Lob;")
    public static class132[] field384 = new class132[6];

    @OriginalMember(owner = "bg", name = "a", descriptor = "Llf;")
    public static class109 field360 = field363;

    @OriginalMember(owner = "bg", name = "w", descriptor = "Llf;")
    public static class109 field382 = class35.method275("<col=c0ff00>", 2);

    @OriginalMember(owner = "bg", name = "c", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "bg", name = "g", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "bg", name = "h", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "bg", name = "i", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "bg", name = "k", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "bg", name = "l", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "bg", name = "o", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "bg", name = "p", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "bg", name = "q", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "bg", name = "r", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "bg", name = "s", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "bg", name = "u", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "bg", name = "v", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "bg", name = "x", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "bg", name = "z", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "bg", name = "C", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "bg", name = "E", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "bg", name = "F", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "bg", name = "G", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "bg", name = "H", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "bg", name = "J", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "bg", name = "L", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "bg", name = "M", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "bg", name = "O", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "bg", name = "P", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "bg", name = "Q", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "bg", name = "R", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "bg", name = "S", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "bg", name = "T", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "bg", name = "U", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "bg", name = "V", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "bg", name = "W", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "bg", name = "X", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "bg", name = "Z", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "bg", name = "f", descriptor = "Lig;")
    private class84 field365;

    @OriginalMember(owner = "bg", name = "e", descriptor = "[I")
    private int[] field364;

    @OriginalMember(owner = "bg", name = "j", descriptor = "[I")
    public int[] field369;

    @OriginalMember(owner = "bg", name = "A", descriptor = "[I")
    public int[] field386;

    @OriginalMember(owner = "bg", name = "B", descriptor = "[I")
    public int[] field387;

    @OriginalMember(owner = "bg", name = "D", descriptor = "[I")
    private int[] field389;

    @OriginalMember(owner = "bg", name = "m", descriptor = "[Lig;")
    private class84[] field372;

    @OriginalMember(owner = "bg", name = "N", descriptor = "[Ljava/lang/Object;")
    public Object[] field399;

    @OriginalMember(owner = "bg", name = "I", descriptor = "[[I")
    private int[][] field394;

    @OriginalMember(owner = "bg", name = "Y", descriptor = "[[I")
    private int[][] field410;

    @OriginalMember(owner = "bg", name = "n", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field373;

    @OriginalMember(owner = "bg", name = "a", descriptor = "(III)[B")
    public final byte[] method147(int arg0, int arg1, int arg2) {
        field395++;
        if (arg0 != 0) {
            this.method171(-81, null, -58, -65);
        }
        return this.method171(46, null, arg2, arg1);
    }

    @OriginalMember(owner = "bg", name = "b", descriptor = "(III)[B")
    public final byte[] method148(int arg0, int arg1, int arg2) {
        field385++;
        if (arg2 < 0 || this.field373.length <= arg2 || this.field373[arg2] == null || arg0 < 0 || this.field373[arg2].length <= arg0) {
            return null;
        }
        if (this.field373[arg2][arg0] == null) {
            boolean var4 = this.method158(null, 0, arg2);
            if (!var4) {
                this.method152(arg2, 120);
                boolean var5 = this.method158(null, 0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        return arg1 < 25 ? null : class27.method225(false, this.field373[arg2][arg0], (byte) 87);
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(BI)[I")
    public final int[] method149(byte arg0, int arg1) {
        field376++;
        int[] var3 = this.field410[arg1];
        if (arg0 <= 76) {
            this.field365 = null;
        }
        if (var3 == null) {
            var3 = new int[this.field386[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(ZLbg;)V")
    public static final void method150(boolean arg0, class18 arg1) {
        class15.field286 = arg1;
        field380++;
        if (arg0) {
            field379 = null;
        }
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(BLlf;)I")
    public final int method151(byte arg0, class109 arg1) {
        field362++;
        class109 var3 = arg1.method776(-10180);
        if (arg0 != 106) {
            this.field386 = null;
        }
        return this.field365.method533((byte) -38, var3.method803(-105));
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(II)V")
    public void method152(int arg0, int arg1) {
        int var3 = 61 / ((-arg1 - 16) / 49);
        field398++;
    }

    @OriginalMember(owner = "bg", name = "b", descriptor = "(II)Z")
    public static final boolean method153(int arg0, int arg1) {
        if (arg1 == 16908) {
            field397++;
            return (arg0 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(BLlf;I)I")
    public final int method154(byte arg0, class109 arg1, int arg2) {
        field411++;
        class109 var4 = arg1.method776(-10180);
        if (arg0 >= -22) {
            this.method171(51, null, 65, 117);
        }
        return this.field372[arg2].method533((byte) -38, var4.method803(-103));
    }

    @OriginalMember(owner = "bg", name = "c", descriptor = "(III)J")
    public static final long method155(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        return var3 == null || var3.field31 == null ? 0L : var3.field31.field183;
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(ILlf;Llf;)[B")
    public final byte[] method156(int arg0, class109 arg1, class109 arg2) {
        class109 var4 = arg2.method776(-10180);
        class109 var5 = arg1.method776(-10180);
        field383++;
        int var6 = this.field365.method533((byte) -38, var4.method803(-125));
        if (arg0 <= 76) {
            this.field396 = true;
        }
        int var7 = this.field372[var6].method533((byte) -38, var5.method803(-60));
        return this.method147(0, var7, var6);
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(IB)V")
    public void method157(int arg0, byte arg1) {
        if (arg1 >= -32) {
            this.field373 = null;
        }
        field381++;
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "([III)Z")
    private final boolean method158(int[] arg0, int arg1, int arg2) {
        field366++;
        if (this.field399[arg2] == null) {
            return false;
        }
        int[] var4 = this.field410[arg2];
        int var5 = this.field386[arg2];
        Object[] var6 = this.field373[arg2];
        boolean var7 = true;
        for (int var8 = arg1; var8 < var5; var8++) {
            int var9;
            if (var4 == null) {
                var9 = var8;
            } else {
                var9 = var4[var8];
            }
            if (var6[var9] == null) {
                var7 = false;
                break;
            }
        }
        if (var7) {
            return true;
        }
        byte[] var10;
        if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
            var10 = class27.method225(false, this.field399[arg2], (byte) 87);
        } else {
            var10 = class27.method225(true, this.field399[arg2], (byte) 87);
            class86 var11 = new class86(var10);
            var11.method576((byte) 112, arg0, var11.field1808.length, 5);
        }
        byte[] var12;
        try {
            var12 = class134.method953((byte) -53, var10);
        } catch (RuntimeException var31) {
            throw class44.method308(var31, "T3 - " + (arg0 != null) + "," + arg2 + "," + var10.length + "," + class140.method998(-14629, var10, var10.length) + "," + class140.method998(-14629, var10, var10.length - 2) + "," + this.field387[arg2] + "," + this.field388);
        }
        if (this.field361) {
            this.field399[arg2] = null;
        }
        if (var5 > 1) {
            int var14 = var12.length;
            int[] var15 = new int[var5];
            int var32 = var14 - 1;
            int var16 = var12[var32] & 0xFF;
            class86 var17 = new class86(var12);
            int var18 = var32 - var16 * 4 * var5;
            var17.field1773 = var18;
            for (int var19 = 0; var19 < var16; var19++) {
                int var20 = 0;
                for (int var21 = 0; var21 < var5; var21++) {
                    var20 += var17.method582(15);
                    var15[var21] += var20;
                }
            }
            byte[][] var22 = new byte[var5][];
            for (int var23 = 0; var23 < var5; var23++) {
                var22[var23] = new byte[var15[var23]];
                var15[var23] = 0;
            }
            var17.field1773 = var18;
            int var24 = 0;
            for (int var25 = 0; var25 < var16; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var5; var27++) {
                    var26 += var17.method582(arg1 + 15);
                    class122.method878(var12, var24, var22[var27], var15[var27], var26);
                    var24 += var26;
                    var15[var27] += var26;
                }
            }
            for (int var28 = 0; var28 < var5; var28++) {
                int var29;
                if (var4 == null) {
                    var29 = var28;
                } else {
                    var29 = var4[var28];
                }
                if (this.field396) {
                    var6[var29] = var22[var28];
                } else {
                    var6[var29] = class187.method1270(28199, var22[var28], false);
                }
            }
        } else {
            int var30;
            if (var4 == null) {
                var30 = 0;
            } else {
                var30 = var4[0];
            }
            if (this.field396) {
                var6[var30] = var12;
            } else {
                var6[var30] = class187.method1270(arg1 + 28199, var12, false);
            }
        }
        return true;
    }

    @OriginalMember(owner = "bg", name = "b", descriptor = "(IB)Z")
    public final boolean method159(int arg0, byte arg1) {
        field368++;
        if (this.field399[arg0] != null) {
            return true;
        }
        this.method152(arg0, -84);
        if (arg1 != 103) {
            field379 = null;
        }
        return this.field399[arg0] != null;
    }

    @OriginalMember(owner = "bg", name = "b", descriptor = "(ILlf;Llf;)Z")
    public final boolean method160(int arg0, class109 arg1, class109 arg2) {
        field393++;
        if (arg0 != -1) {
            return true;
        }
        class109 var4 = arg1.method776(arg0 - 10179);
        class109 var5 = arg2.method776(-10180);
        int var6 = this.field365.method533((byte) -38, var4.method803(-105));
        int var7 = this.field372[var6].method533((byte) -38, var5.method803(-54));
        return this.method161(var7, var6, -116);
    }

    @OriginalMember(owner = "bg", name = "d", descriptor = "(III)Z")
    public final boolean method161(int arg0, int arg1, int arg2) {
        field374++;
        if (arg2 >= -107) {
            field382 = null;
        }
        if (arg1 < 0 || arg1 >= this.field373.length || this.field373[arg1] == null || arg0 < 0 || this.field373[arg1].length <= arg0) {
            return false;
        } else if (this.field373[arg1][arg0] != null) {
            return true;
        } else if (this.field399[arg1] == null) {
            this.method152(arg1, -114);
            return this.field399[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "bg", name = "c", descriptor = "(II)Lfc;")
    public static final class54 method162(int arg0, int arg1) {
        field370++;
        class54 var2 = (class54) class117.field2317.method1086((long) arg1, -102);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class15.field286.method147(0, arg1, 5);
        class54 var4 = new class54();
        if (var3 != null) {
            var4.method352(new class86(var3), -26780);
        }
        class117.field2317.method1082((long) arg1, 88, var4);
        if (arg0 > -81) {
            method153(-107, 53);
        }
        return var4;
    }

    @OriginalMember(owner = "bg", name = "d", descriptor = "(II)Z")
    public final boolean method163(int arg0, int arg1) {
        if (arg0 != -5526) {
            return true;
        }
        field409++;
        if (this.field373.length == 1) {
            return this.method161(arg1, 0, arg0 ^ 0x15E7);
        } else if (this.field373[arg1].length == 1) {
            return this.method161(0, arg1, -117);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(ZLlf;)V")
    public final void method164(boolean arg0, class109 arg1) {
        field392++;
        class109 var3 = arg1.method776(-10180);
        int var4 = this.field365.method533((byte) -38, var3.method803(-93));
        if (var4 >= 0) {
            if (!arg0) {
                this.method163(47, 73);
            }
            this.method157(var4, (byte) -76);
        }
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(I)V")
    public static final void method165(int arg0) {
        field400++;
        if (!class83.field1691) {
            return;
        }
        class10.field161 = null;
        class178.field3350 = null;
        class143.field2753 = null;
        class76.field1467 = null;
        class160.field3003 = null;
        class179.field3391 = null;
        class115.field2275 = null;
        class170.field3167 = null;
        class82.field1612 = null;
        class77.field1485 = null;
        class12.field179 = null;
        class34.field770 = null;
        class123.field2372 = null;
        class210.field4081 = null;
        class174.field3301 = null;
        class38.field819 = null;
        class51.field1033 = null;
        class158.field2965 = null;
        if (arg0 != 24831) {
            method150(false, null);
        }
        class128.field2488 = null;
        class190.field3641 = null;
        class83.field1689 = null;
        class98.field1986 = null;
        class49.method333(2, arg0 - 24830);
        class41.method297(arg0 ^ 0xFFFF9F00, true);
        class83.field1691 = false;
    }

    @OriginalMember(owner = "bg", name = "e", descriptor = "(II)V")
    public final void method166(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field373[arg0].length; var3++) {
            this.field373[arg0][var3] = null;
        }
        field407++;
        int var4 = -101 / ((57 - arg1) / 56);
    }

    @OriginalMember(owner = "bg", name = "b", descriptor = "(BI)I")
    public final int method167(byte arg0, int arg1) {
        if (arg0 < 6) {
            this.method173(109, 34);
        }
        field391++;
        return this.field373[arg1].length;
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(B)I")
    public final int method168(byte arg0) {
        field375++;
        return arg0 <= 92 ? 32 : this.field373.length;
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "([BI)V")
    public final void method169(byte[] arg0, int arg1) {
        field390++;
        this.field388 = class140.method998(-14629, arg0, arg0.length);
        class86 var3 = new class86(class134.method953((byte) -53, arg0));
        int var4 = var3.method598((byte) 125);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method582(arg1 - 5525);
        }
        int var5 = 0;
        int var6 = var3.method598((byte) 107);
        this.field377 = var3.method569(true);
        this.field389 = new int[this.field377];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field377; var8++) {
            this.field389[var8] = var5 += var3.method569(true);
            if (this.field389[var8] > var7) {
                var7 = this.field389[var8];
            }
        }
        this.field387 = new int[var7 + 1];
        this.field369 = new int[var7 + 1];
        this.field399 = new Object[var7 + 1];
        this.field386 = new int[var7 + 1];
        this.field410 = new int[var7 + 1][];
        this.field373 = new Object[var7 + 1][];
        if (var6 != 0) {
            this.field364 = new int[var7 + 1];
            for (int var9 = 0; var9 < var7 + 1; var9++) {
                this.field364[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field377; var10++) {
                this.field364[this.field389[var10]] = var3.method582(15);
            }
            this.field365 = new class84(this.field364);
        }
        for (int var11 = 0; var11 < this.field377; var11++) {
            this.field387[this.field389[var11]] = var3.method582(class24.method217(arg1, 5547));
        }
        for (int var12 = 0; var12 < this.field377; var12++) {
            this.field369[this.field389[var12]] = var3.method582(15);
        }
        for (int var13 = 0; var13 < this.field377; var13++) {
            this.field386[this.field389[var13]] = var3.method569(true);
        }
        for (int var14 = 0; var14 < this.field377; var14++) {
            int var21 = 0;
            int var22 = this.field389[var14];
            int var23 = this.field386[var22];
            this.field410[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field410[var22][var25] = var21 += var3.method569(true);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            if (var24 + 1 == var23) {
                this.field410[var22] = null;
            }
            this.field373[var22] = new Object[var24 + 1];
        }
        if (arg1 != 5540) {
            this.field386 = null;
        }
        if (var6 == 0) {
            return;
        }
        this.field394 = new int[var7 + 1][];
        this.field372 = new class84[var7 + 1];
        for (int var15 = 0; var15 < this.field377; var15++) {
            int var16 = this.field389[var15];
            int var17 = this.field386[var16];
            this.field394[var16] = new int[this.field373[var16].length];
            for (int var18 = 0; var18 < this.field373[var16].length; var18++) {
                this.field394[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field410[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field410[var16][var19];
                }
                this.field394[var16][var20] = var3.method582(class24.method217(arg1, 5547));
            }
            this.field372[var16] = new class84(this.field394[var16]);
        }
    }

    @OriginalMember(owner = "bg", name = "b", descriptor = "(B)Z")
    public final boolean method170(byte arg0) {
        if (arg0 != -68) {
            this.field377 = -53;
        }
        field405++;
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field389.length; var3++) {
            int var4 = this.field389[var3];
            if (this.field399[var4] == null) {
                this.method152(var4, -102);
                if (this.field399[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(I[III)[B")
    public final byte[] method171(int arg0, int[] arg1, int arg2, int arg3) {
        field367++;
        if (arg2 < 0 || arg2 >= this.field373.length || this.field373[arg2] == null || arg3 < 0 || this.field373[arg2].length <= arg3) {
            return null;
        }
        if (this.field373[arg2][arg3] == null) {
            boolean var5 = this.method158(arg1, 0, arg2);
            if (!var5) {
                this.method152(arg2, -76);
                boolean var6 = this.method158(arg1, 0, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg0 <= 25) {
            this.field373 = null;
        }
        byte[] var7 = class27.method225(false, this.field373[arg2][arg3], (byte) 87);
        if (this.field396) {
            this.field373[arg2][arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "bg", name = "b", descriptor = "(I)V")
    public static final void method172(int arg0) {
        field401++;
        class30 var1 = (class30) class13.field195.method1230(41);
        if (arg0 <= 108) {
            field379 = null;
        }
        while (var1 != null) {
            if (class72.field1405 != var1.field648 || var1.field653) {
                var1.method452(true);
            } else if (var1.field642 <= class143.field2754) {
                var1.method242(class193.field3694, (byte) -79);
                if (var1.field653) {
                    var1.method452(true);
                } else {
                    class95.method684(var1.field648, var1.field651, var1.field654, var1.field658, 60, var1, 0, -1L, false);
                }
            }
            var1 = (class30) class13.field195.method1234(-1);
        }
    }

    @OriginalMember(owner = "bg", name = "f", descriptor = "(II)[B")
    public final byte[] method173(int arg0, int arg1) {
        field402++;
        if (this.field373.length == 1) {
            return this.method147(0, arg1, 0);
        } else if (this.field373[arg1].length == 1) {
            return this.method147(arg0, 0, arg1);
        } else {
            if (arg0 != 0) {
                this.field373 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "bg", name = "c", descriptor = "(I)V")
    public final void method174(int arg0) {
        field406++;
        int var2 = 0;
        if (arg0 != 512) {
            this.field373 = null;
        }
        while (var2 < this.field373.length) {
            if (this.field373[var2] != null) {
                for (int var3 = 0; var3 < this.field373[var2].length; var3++) {
                    this.field373[var2][var3] = null;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "bg", name = "c", descriptor = "(B)V")
    public static void method175(byte arg0) {
        if (arg0 != 61) {
            method175((byte) 104);
        }
        field363 = null;
        field360 = null;
        field382 = null;
        field379 = null;
        field384 = null;
    }

    @OriginalMember(owner = "bg", name = "a", descriptor = "(Lbg;Llf;Lbg;ZLlf;)Ldb;")
    public static final class33 method176(class18 arg0, class109 arg1, class18 arg2, boolean arg3, class109 arg4) {
        if (arg3) {
            method150(false, null);
        }
        field404++;
        int var5 = arg0.method151((byte) 106, arg4);
        int var6 = arg0.method154((byte) -46, arg1, var5);
        return class90.method661((byte) -72, var5, var6, arg0, arg2);
    }

    @OriginalMember(owner = "bg", name = "<init>", descriptor = "(ZZ)V")
    public class18(boolean arg0, boolean arg1) {
        this.field361 = arg0;
        this.field396 = arg1;
    }
}
