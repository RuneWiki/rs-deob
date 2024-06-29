import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public abstract class class27 {

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "Z")
    public boolean field380;

    @OriginalMember(owner = "mapview!oa", name = "v", descriptor = "Z")
    private boolean field395;

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "Lia;")
    public static class15 field375 = class28.method196("Sword Shop", false);

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "Lia;")
    public static class15 field381 = class28.method196("labels)3dat", false);

    @OriginalMember(owner = "mapview!oa", name = "l", descriptor = "Lia;")
    public static class15 field385 = class28.method196("-5bersicht", false);

    @OriginalMember(owner = "mapview!oa", name = "m", descriptor = "I")
    public static int field386 = -1;

    @OriginalMember(owner = "mapview!oa", name = "i", descriptor = "Lia;")
    public static class15 field382 = class28.method196("Rare Trees", false);

    @OriginalMember(owner = "mapview!oa", name = "o", descriptor = "Lia;")
    public static class15 field388 = class28.method196("Food Shop", false);

    @OriginalMember(owner = "mapview!oa", name = "r", descriptor = "[I")
    public static int[] field391 = new int[128];

    @OriginalMember(owner = "mapview!oa", name = "u", descriptor = "Lia;")
    public static class15 field394 = class28.method196("Combat Training", false);

    @OriginalMember(owner = "mapview!oa", name = "q", descriptor = "Lia;")
    public static class15 field390 = class28.method196("Jewellery", false);

    @OriginalMember(owner = "mapview!oa", name = "n", descriptor = "I")
    public static int field387 = 0;

    @OriginalMember(owner = "mapview!oa", name = "k", descriptor = "Lua;")
    public static class39 field384 = new class39();

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "mapview!oa", name = "j", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "mapview!oa", name = "t", descriptor = "Lo;")
    private class26 field393;

    @OriginalMember(owner = "mapview!oa", name = "y", descriptor = "Ljava/awt/Frame;")
    public static Frame field398;

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "[I")
    private int[] field376;

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "[I")
    private int[] field378;

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "[I")
    public int[] field379;

    @OriginalMember(owner = "mapview!oa", name = "w", descriptor = "[I")
    private int[] field396;

    @OriginalMember(owner = "mapview!oa", name = "x", descriptor = "[I")
    private int[] field397;

    @OriginalMember(owner = "mapview!oa", name = "s", descriptor = "[Lo;")
    private class26[] field392;

    @OriginalMember(owner = "mapview!oa", name = "p", descriptor = "[Ljava/lang/Object;")
    public Object[] field389;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "[[I")
    private int[][] field374;

    @OriginalMember(owner = "mapview!oa", name = "z", descriptor = "[[I")
    private int[][] field399;

    @OriginalMember(owner = "mapview!oa", name = "A", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field400;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(III)[B", line = 5)
    public final byte[] method183(int arg0, int arg1, int arg2) {
        if (arg2 <= 4) {
            this.method186(32, null, null);
        }
        return this.method189((byte) 38, null, arg0, arg1);
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(B[B)V", line = 20)
    public final void method184(byte arg0, byte[] arg1) {
        this.field383 = class10.method56(arg1, 0, arg1.length);
        class1 var3 = new class1(class25.method176(arg1, (byte) -15));
        int var4 = var3.method5(-2);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method7(18811);
        }
        int var5 = var3.method5(-2);
        this.field377 = var3.method1(-1119584920);
        this.field379 = new int[this.field377];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field377; var8++) {
            this.field379[var8] = var6 += var3.method1(-1119584920);
            if (this.field379[var8] > var7) {
                var7 = this.field379[var8];
            }
        }
        this.field400 = new Object[var7 + 1][];
        this.field396 = new int[var7 + 1];
        this.field374 = new int[var7 + 1][];
        this.field389 = new Object[var7 + 1];
        this.field378 = new int[var7 + 1];
        if (arg0 > -51) {
            field390 = null;
        }
        this.field397 = new int[var7 + 1];
        if (var5 != 0) {
            this.field376 = new int[var7 + 1];
            for (int var9 = 0; var9 < var7 + 1; var9++) {
                this.field376[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field377; var10++) {
                this.field376[this.field379[var10]] = var3.method7(18811);
            }
            this.field393 = new class26(this.field376);
        }
        for (int var11 = 0; var11 < this.field377; var11++) {
            this.field378[this.field379[var11]] = var3.method7(18811);
        }
        for (int var12 = 0; var12 < this.field377; var12++) {
            this.field397[this.field379[var12]] = var3.method7(18811);
        }
        for (int var13 = 0; var13 < this.field377; var13++) {
            this.field396[this.field379[var13]] = var3.method1(-1119584920);
        }
        for (int var14 = 0; var14 < this.field377; var14++) {
            int var15 = 0;
            int var16 = this.field379[var14];
            int var17 = -1;
            int var18 = this.field396[var16];
            this.field374[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field374[var16][var19] = var15 += var3.method1(-1119584920);
                if (var20 > var17) {
                    var17 = var20;
                }
            }
            this.field400[var16] = new Object[var17 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field399 = new int[var7 + 1][];
        this.field392 = new class26[var7 + 1];
        for (int var21 = 0; var21 < this.field377; var21++) {
            int var22 = this.field379[var21];
            int var23 = this.field396[var22];
            this.field399[var22] = new int[this.field400[var22].length];
            for (int var24 = 0; var24 < this.field400[var22].length; var24++) {
                this.field399[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                this.field399[var22][this.field374[var22][var25]] = var3.method7(18811);
            }
            this.field392[var22] = new class26(this.field399[var22]);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(II[I)Z", line = 209)
    private final boolean method185(int arg0, int arg1, int[] arg2) {
        if (this.field389[arg1] == null) {
            return false;
        }
        int var4 = this.field396[arg1];
        int[] var5 = this.field374[arg1];
        boolean var6 = true;
        Object[] var7 = this.field400[arg1];
        for (int var8 = 0; var8 < var4; var8++) {
            if (var7[var5[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        if (arg0 != -1) {
            field375 = null;
        }
        byte[] var9;
        if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
            var9 = class2.method13(false, this.field389[arg1], -1694648602);
        } else {
            var9 = class2.method13(true, this.field389[arg1], -1694648602);
            class1 var10 = new class1(var9);
            var10.method3(arg2, 5, arg0 ^ 0xFFFFFF00, var10.field4.length);
        }
        byte[] var11;
        try {
            var11 = class25.method176(var9, (byte) -15);
        } catch (RuntimeException var28) {
            throw class21.method151(var28, "T3 - " + (arg2 != null) + "," + arg1 + "," + var9.length + "," + class10.method56(var9, 0, var9.length) + "," + class10.method56(var9, ~arg0, var9.length - 2) + "," + this.field378[arg1] + "," + this.field383);
        }
        if (this.field380) {
            this.field389[arg1] = null;
        }
        if (var4 > 1) {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            int[] var15 = new int[var4];
            class1 var16 = new class1(var11);
            int var17 = var29 - var4 * var14 * 4;
            var16.field1 = var17;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var16.method7(arg0 + 18812);
                    var15[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var15[var22]];
                var15[var22] = 0;
            }
            var16.field1 = var17;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var16.method7(arg0 ^ 0xFFFFB684);
                    class23.method154(var11, var23, var21[var26], var15[var26], var25);
                    var23 += var25;
                    var15[var26] += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                if (this.field395) {
                    var7[var5[var27]] = var21[var27];
                } else {
                    var7[var5[var27]] = class19.method144(18002, var21[var27], false);
                }
            }
        } else if (this.field395) {
            var7[var5[0]] = var11;
        } else {
            var7[var5[0]] = class19.method144(class6.method29(arg0, -18003), var11, false);
        }
        return true;
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(ILia;Lia;)[B", line = 383)
    public final byte[] method186(int arg0, class15 arg1, class15 arg2) {
        class15 var4 = arg1.method100(115);
        class15 var5 = arg2.method100(-98);
        int var6 = this.field393.method179(5813, var4.method121((byte) -115));
        if (arg0 < 57) {
            this.method186(76, null, null);
        }
        int var7 = this.field392[var6].method179(5813, var5.method121((byte) -87));
        return this.method183(var6, var7, 53);
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Lia;B)I", line = 404)
    public final int method187(class15 arg0, byte arg1) {
        if (arg1 != 104) {
            field398 = null;
        }
        class15 var3 = arg0.method100(84);
        return this.field393.method179(5813, var3.method121((byte) 118));
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I)V", line = 415)
    public static void method188(int arg0) {
        field398 = null;
        field385 = null;
        if (arg0 != -1) {
            method192(null, 78);
        }
        field391 = null;
        field388 = null;
        field375 = null;
        field382 = null;
        field390 = null;
        field394 = null;
        field384 = null;
        field381 = null;
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(B[III)[B", line = 454)
    private final byte[] method189(byte arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 < 0 || arg2 >= this.field400.length || this.field400[arg2] == null || arg3 < 0 || this.field400[arg2].length <= arg3) {
            return null;
        }
        if (this.field400[arg2][arg3] == null) {
            boolean var5 = this.method185(-1, arg2, arg1);
            if (!var5) {
                this.method190(-21352, arg2);
                boolean var6 = this.method185(-1, arg2, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class2.method13(false, this.field400[arg2][arg3], -1694648602);
        if (arg0 != 38) {
            field385 = null;
        }
        if (this.field395) {
            this.field400[arg2][arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(II)V", line = 515)
    private final void method190(int arg0, int arg1) {
        if (arg0 != -21352) {
            this.field389 = null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(ILia;I)I", line = 525)
    public final int method191(int arg0, class15 arg1, int arg2) {
        class15 var4 = arg1.method100(-101);
        if (arg2 != 1) {
            field382 = null;
        }
        return this.field392[arg0].method179(5813, var4.method121((byte) -95));
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 548)
    public static final void method192(Component arg0, int arg1) {
        arg0.addMouseListener(field384);
        if (arg1 != 0) {
            field387 = -22;
        }
        arg0.addMouseMotionListener(field384);
        arg0.addFocusListener(field384);
    }

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "(ZZ)V", line = 565)
    public class27(boolean arg0, boolean arg1) {
        this.field380 = arg0;
        this.field395 = arg1;
    }
}
