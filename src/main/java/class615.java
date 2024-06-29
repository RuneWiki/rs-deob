import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class615 {

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public int field8632;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[B")
    private byte[] field8615;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lea;")
    public static class547 field8613 = new class547(89, 0);

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public int field8617;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public int field8621;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public int field8631;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lica;")
    public class663 field8618;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
    public int[] field8614;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
    public int[] field8616;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
    public int[] field8620;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "[I")
    public int[] field8623;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "[I")
    public int[] field8624;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[I")
    public int[] field8628;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "[Lica;")
    public class663[] field8627;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "[[B")
    public byte[][] field8630;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[[I")
    public int[][] field8622;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "[[I")
    public int[][] field8629;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lvha;IIII)V", line = 7)
    public static final void method3462(class685 arg0, int arg1, int arg2, int arg3, int arg4) {
        field8619++;
        class101 var5 = (class101) class197.field2353.method724(32);
        if (arg1 != -22015) {
            field8613 = null;
        }
        while (var5 != null) {
            if (var5.field1340 == arg3 && arg4 << 9 == var5.field1351 && arg2 << 9 == var5.field1347 && var5.field1355.field9541 == arg0.field9541) {
                if (var5.field1354 != null) {
                    class143.field1851.method2542(var5.field1354);
                    var5.field1354 = null;
                }
                if (var5.field1352 != null) {
                    class143.field1851.method2542(var5.field1352);
                    var5.field1352 = null;
                }
                var5.method315(87);
                return;
            }
            var5 = (class101) class197.field2353.method723(97);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 66)
    public static void method3463(byte arg0) {
        if (arg0 != 7) {
            method3462(null, -45, -88, 50, 116);
        }
        field8613 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([BI)V", line = 76)
    private final void method3464(byte[] arg0, int arg1) {
        field8625++;
        class611 var3 = new class611(class294.method1760(arg0, (byte) -84));
        int var4 = var3.method3428((byte) 23);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field8631 = 0;
        } else {
            this.field8631 = var3.method3418(-2);
        }
        int var5 = var3.method3428((byte) -127);
        boolean var6 = (var5 & 0x1) != 0;
        this.field8617 = var3.method3402((byte) 127);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        this.field8616 = new int[this.field8617];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field8617; var10++) {
            this.field8616[var10] = var8 += var3.method3402((byte) 127);
            if (this.field8616[var10] > var9) {
                var9 = this.field8616[var10];
            }
        }
        this.field8621 = var9 + 1;
        if (var7) {
            this.field8630 = new byte[this.field8621][];
        }
        this.field8623 = new int[this.field8621];
        this.field8622 = new int[this.field8621][];
        this.field8624 = new int[this.field8621];
        this.field8620 = new int[this.field8621];
        this.field8628 = new int[this.field8621];
        if (var6) {
            this.field8614 = new int[this.field8621];
            for (int var11 = 0; var11 < this.field8621; var11++) {
                this.field8614[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field8617; var12++) {
                this.field8614[this.field8616[var12]] = var3.method3418(-2);
            }
            this.field8618 = new class663(this.field8614);
        }
        for (int var13 = 0; var13 < this.field8617; var13++) {
            this.field8628[this.field8616[var13]] = var3.method3418(-2);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field8617; var14++) {
                byte[] var15 = new byte[64];
                var3.method3389(var15, true, 64, 0);
                this.field8630[this.field8616[var14]] = var15;
            }
        }
        if (arg1 != -7572) {
            return;
        }
        for (int var16 = 0; var16 < this.field8617; var16++) {
            this.field8620[this.field8616[var16]] = var3.method3418(-2);
        }
        for (int var17 = 0; var17 < this.field8617; var17++) {
            this.field8623[this.field8616[var17]] = var3.method3402((byte) 127);
        }
        for (int var18 = 0; var18 < this.field8617; var18++) {
            int var25 = this.field8616[var18];
            int var26 = this.field8623[var25];
            int var27 = 0;
            this.field8622[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field8622[var25][var29] = var27 += var3.method3402((byte) 127);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field8624[var25] = var28 + 1;
            if ((var28 + 1) == var26) {
                this.field8622[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field8627 = new class663[var9 + 1];
        this.field8629 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field8617; var19++) {
            int var20 = this.field8616[var19];
            int var21 = this.field8623[var20];
            this.field8629[var20] = new int[this.field8624[var20]];
            for (int var22 = 0; var22 < this.field8624[var20]; var22++) {
                this.field8629[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field8622[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field8622[var20][var23];
                }
                this.field8629[var20][var24] = var3.method3418(arg1 + 7570);
            }
            this.field8627[var20] = new class663(this.field8629[var20]);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z", line = 273)
    public static final boolean method3465(int arg0, int arg1) {
        if (arg0 > -68) {
            field8613 = null;
        }
        field8626++;
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "([BI[B)V", line = 285)
    public class615(byte[] arg0, int arg1, byte[] arg2) {
        this.field8632 = class173.method999(arg0.length, arg0, -30091);
        if (this.field8632 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field8615 = class721.method4054(0, (byte) -121, arg0, arg0.length);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field8615[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3464(arg0, -7572);
    }
}
