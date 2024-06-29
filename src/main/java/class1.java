import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public abstract class class1 {

    @OriginalMember(owner = "mapview!a", name = "m", descriptor = "Z")
    private boolean field13;

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "Z")
    private boolean field2;

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Lna;")
    public static class26 field7 = class6.method40("Fishing Shop", 48);

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "Lna;")
    public static class26 field6 = class6.method40("Platebody Shop", 48);

    @OriginalMember(owner = "mapview!a", name = "u", descriptor = "J")
    public static long field21 = 0L;

    @OriginalMember(owner = "mapview!a", name = "n", descriptor = "Lna;")
    public static class26 field14 = class6.method40("Loading", 48);

    @OriginalMember(owner = "mapview!a", name = "x", descriptor = "I")
    public static int field24 = 0;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "mapview!a", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "mapview!a", name = "w", descriptor = "Ln;")
    private class25 field23;

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "[B")
    public static byte[] field8;

    @OriginalMember(owner = "mapview!a", name = "o", descriptor = "[I")
    public int[] field15;

    @OriginalMember(owner = "mapview!a", name = "p", descriptor = "[I")
    private int[] field16;

    @OriginalMember(owner = "mapview!a", name = "q", descriptor = "[I")
    private int[] field17;

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "[I")
    private int[] field3;

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "[I")
    private int[] field5;

    @OriginalMember(owner = "mapview!a", name = "l", descriptor = "[Ln;")
    private class25[] field12;

    @OriginalMember(owner = "mapview!a", name = "s", descriptor = "[Lo;")
    public static class27[] field19;

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "[Ljava/lang/Object;")
    public Object[] field9;

    @OriginalMember(owner = "mapview!a", name = "k", descriptor = "[[I")
    private int[][] field11;

    @OriginalMember(owner = "mapview!a", name = "v", descriptor = "[[I")
    private int[][] field22;

    @OriginalMember(owner = "mapview!a", name = "r", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field18;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(BIIII)V", line = 18)
    public static final void method1(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -339164858) {
            return;
        }
        int var5 = arg1 >> 6;
        int var6 = arg4 >> 6;
        if (class7.field88[arg2][var5][var6] == null) {
            class7.field88[arg2][var5][var6] = new byte[4096];
        }
        class7.field88[arg2][var5][var6][class8.method51(arg1 << 6, 4032) + class8.method51(arg4, 63)] = arg0;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([BZ)V", line = 40)
    public final void method2(byte[] arg0, boolean arg1) {
        this.field4 = class6.method45(103, arg0.length, arg0);
        class10 var3 = new class10(class13.method79(arg0, 90));
        int var4 = var3.method66(92);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method66(46);
        this.field1 = var3.method68((byte) 88);
        this.field15 = new int[this.field1];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field1; var8++) {
            this.field15[var8] = var6 += var3.method68((byte) -81);
            if (this.field15[var8] > var7) {
                var7 = this.field15[var8];
            }
        }
        this.field22 = new int[var7 + 1][];
        this.field9 = new Object[var7 + 1];
        this.field3 = new int[var7 + 1];
        this.field17 = new int[var7 + 1];
        this.field16 = new int[var7 + 1];
        this.field18 = new Object[var7 + 1][];
        if (var5 != 0) {
            this.field5 = new int[var7 + 1];
            for (int var9 = 0; var9 < this.field1; var9++) {
                this.field5[this.field15[var9]] = var3.method69((byte) 81);
            }
            this.field23 = new class25(this.field5);
        }
        if (arg1) {
            this.field2 = false;
        }
        for (int var10 = 0; var10 < this.field1; var10++) {
            this.field3[this.field15[var10]] = var3.method69((byte) 106);
        }
        for (int var11 = 0; var11 < this.field1; var11++) {
            this.field16[this.field15[var11]] = var3.method69((byte) 127);
        }
        for (int var12 = 0; var12 < this.field1; var12++) {
            this.field17[this.field15[var12]] = var3.method68((byte) 113);
        }
        for (int var13 = 0; var13 < this.field1; var13++) {
            int var14 = 0;
            int var15 = this.field15[var13];
            int var16 = -1;
            int var17 = this.field17[var15];
            this.field22[var15] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                int var19 = this.field22[var15][var18] = var14 += var3.method68((byte) -72);
                if (var19 > var16) {
                    var16 = var19;
                }
            }
            this.field18[var15] = new Object[var16 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field11 = new int[var7 + 1][];
        this.field12 = new class25[var7 + 1];
        for (int var20 = 0; var20 < this.field1; var20++) {
            int var21 = this.field15[var20];
            int var22 = this.field17[var21];
            this.field11[var21] = new int[this.field18[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field11[var21][this.field22[var21][var23]] = var3.method69((byte) 127);
            }
            this.field12[var21] = new class25(this.field11[var21]);
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(BLna;Lna;)[B", line = 183)
    public final byte[] method3(byte arg0, class26 arg1, class26 arg2) {
        class26 var4 = arg2.method190(106);
        class26 var5 = arg1.method190(arg0 - 90);
        if (arg0 != 3) {
            method8((byte) 33);
        }
        int var6 = this.field23.method171(var4.method193(true), arg0 ^ 0x3);
        int var7 = this.field12[var6].method171(var5.method193(true), 0);
        return this.method9(var7, var6, false);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([BB)V", line = 198)
    public static final void method4(byte[] arg0, byte arg1) {
        class10 var2 = new class10(arg0);
        var2.field119 = arg0.length - 2;
        class34.field444 = var2.method68((byte) 99);
        class9.field102 = new int[class34.field444];
        class4.field46 = new int[class34.field444];
        class19.field209 = new int[class34.field444];
        class33.field431 = new int[class34.field444];
        class11.field136 = new byte[class34.field444][];
        var2.field119 = arg0.length - class34.field444 * 8 - 7;
        class39.field510 = var2.method68((byte) -77);
        class22.field228 = var2.method68((byte) 106);
        int var3 = (var2.method66(arg1 ^ 0x18) & 0xFF) + 1;
        for (int var4 = 0; var4 < class34.field444; var4++) {
            class9.field102[var4] = var2.method68((byte) -128);
        }
        for (int var5 = 0; var5 < class34.field444; var5++) {
            class4.field46[var5] = var2.method68((byte) -71);
        }
        for (int var6 = 0; var6 < class34.field444; var6++) {
            class33.field431[var6] = var2.method68((byte) 112);
        }
        if (arg1 != 77) {
            field21 = -68L;
        }
        for (int var7 = 0; var7 < class34.field444; var7++) {
            class19.field209[var7] = var2.method68((byte) 118);
        }
        var2.field119 = arg0.length - class34.field444 * 8 - (var3 - 1) * 3 - 7;
        class8.field99 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class8.field99[var8] = var2.method71(-7782);
            if (class8.field99[var8] == 0) {
                class8.field99[var8] = 1;
            }
        }
        var2.field119 = 0;
        for (int var9 = 0; var9 < class34.field444; var9++) {
            int var10 = class19.field209[var9];
            int var11 = class33.field431[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class11.field136[var9] = var13;
            int var14 = var2.method66(73);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method70(-1);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var10; var17++) {
                        var13[var11 * var17 + var16] = var2.method70(-1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IB)V", line = 317)
    private final void method5(int arg0, byte arg1) {
        if (arg1 != -75) {
            this.method13(null, (byte) 3, 111, 112);
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B", line = 326)
    private static final byte[] method6(Object arg0, boolean arg1, boolean arg2) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return arg1 ? method12(var4, (byte) -94) : var4;
        } else if (arg0 instanceof class19) {
            class19 var3 = (class19) arg0;
            return var3.method120(59);
        } else {
            if (!arg2) {
                method8((byte) 127);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([IIZ)Z", line = 372)
    private final boolean method7(int[] arg0, int arg1, boolean arg2) {
        if (this.field9[arg1] == null) {
            return false;
        }
        if (arg2) {
            field20 = 127;
        }
        int var4 = this.field17[arg1];
        int[] var5 = this.field22[arg1];
        Object[] var6 = this.field18[arg1];
        boolean var7 = true;
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
            var9 = method6(this.field9[arg1], false, true);
        } else {
            var9 = method6(this.field9[arg1], true, !arg2);
            class10 var10 = new class10(var9);
            var10.method65(arg0, 122, var10.field122.length, 5);
        }
        byte[] var11;
        try {
            var11 = class13.method79(var9, 113);
        } catch (RuntimeException var28) {
            throw class14.method87(var28, "T3 - " + (arg0 != null) + "," + arg1 + "," + var9.length + "," + class6.method45(107, var9.length, var9) + "," + class6.method45(111, var9.length - 2, var9) + "," + this.field3[arg1] + "," + this.field4);
        }
        if (this.field13) {
            this.field9[arg1] = null;
        }
        if (var4 <= 1) {
            var6[var5[0]] = class14.method85(111, var11, false);
        } else {
            int[] var13 = new int[var4];
            int var14 = var11.length;
            int var29 = var14 - 1;
            int var15 = var11[var29] & 0xFF;
            int var16 = var29 - var4 * 4 * var15;
            class10 var17 = new class10(var11);
            var17.field119 = var16;
            for (int var18 = 0; var18 < var15; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var17.method69((byte) 106);
                    var13[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var13[var22]];
                var13[var22] = 0;
            }
            int var23 = 0;
            var17.field119 = var16;
            for (int var24 = 0; var24 < var15; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var17.method69((byte) 113);
                    class17.method109(var11, var23, var21[var26], var13[var26], var25);
                    var13[var26] += var25;
                    var23 += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                var6[var5[var27]] = class14.method85(-90, var21[var27], false);
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)V", line = 536)
    public static void method8(byte arg0) {
        field19 = null;
        field6 = null;
        field14 = null;
        field8 = null;
        if (arg0 <= -18) {
            field7 = null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIZ)[B", line = 565)
    public final byte[] method9(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method10(true, null);
        }
        return this.method13(null, (byte) -61, arg1, arg0);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(ZLna;)I", line = 581)
    public final int method10(boolean arg0, class26 arg1) {
        if (arg0) {
            field14 = null;
        }
        class26 var3 = arg1.method190(-72);
        return this.field23.method171(var3.method193(true), 0);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Lna;IB)I", line = 594)
    public final int method11(class26 arg0, int arg1, byte arg2) {
        class26 var4 = arg0.method190(-96);
        int var5 = 8 / ((21 - arg2) / 58);
        return this.field12[arg1].method171(var4.method193(true), 0);
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "([BB)[B", line = 609)
    public static final byte[] method12(byte[] arg0, byte arg1) {
        if (arg1 != -94) {
            field14 = null;
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class17.method109(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "mapview!a", name = "<init>", descriptor = "(ZZ)V", line = 648)
    public class1(boolean arg0, boolean arg1) {
        this.field13 = arg0;
        this.field2 = arg1;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([IBII)[B", line = 661)
    private final byte[] method13(int[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -61) {
            return (byte[]) null;
        } else if (arg2 < 0 || this.field18.length <= arg2 || this.field18[arg2] == null || arg3 < 0 || arg3 >= this.field18[arg2].length) {
            return null;
        } else {
            if (this.field18[arg2][arg3] == null) {
                boolean var5 = this.method7(arg0, arg2, false);
                if (!var5) {
                    this.method5(arg2, (byte) -75);
                    boolean var6 = this.method7(arg0, arg2, false);
                    if (!var6) {
                        return null;
                    }
                }
            }
            byte[] var7 = method6(this.field18[arg2][arg3], false, true);
            if (this.field2) {
                this.field18[arg2][arg3] = null;
            }
            return var7;
        }
    }
}
