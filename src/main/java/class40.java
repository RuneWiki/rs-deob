import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class40 {

    @OriginalMember(owner = "client!le", name = "o", descriptor = "[I")
    private int[] field631;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "[I")
    private int[] field635;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lsh;")
    private class196 field627;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lsh;")
    private class196 field619;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[Lsh;")
    private class196[] field620;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field623 = 3;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field624 = -1;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Ldf;")
    public static class51 field621 = class46.method233(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 100);

    @OriginalMember(owner = "client!le", name = "m", descriptor = "[[I")
    public static int[][] field629 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[I")
    public static int[] field626 = new int[100];

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Ldf;")
    public static class51 field636 = class46.method233("zap", 100);

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Ldf;")
    private static class51 field630 = class46.method233(" from your ignore list first)3", 100);

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Ldf;")
    public static class51 field634 = class46.method233("W-=hlen Sie eine Option", 100);

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Ldf;")
    public static class51 field637 = field630;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Z")
    public static boolean field622;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V")
    public static final void method201(boolean arg0, int arg1) {
        for (int var2 = 0; var2 < class218.field3788; var2++) {
            class83 var3 = class34.field512[class193.field3242[var2]];
            long var4 = (long) class193.field3242[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method646((byte) -54) && var3.field1392.field145 == arg0 && var3.field1392.method59((byte) -107)) {
                int var6 = var3.field4319 >> 7;
                int var7 = var3.field4348 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field4345 == 1 && (var3.field4319 & 0x7F) == 64 && (var3.field4348 & 0x7F) == 64) {
                        if (class101.field1683[var6][var7] == class182.field2994) {
                            continue;
                        }
                        class101.field1683[var6][var7] = class182.field2994;
                    }
                    if (!var3.field1392.field150) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field4328 = class207.method1424(class257.field4496, var3.field4319, (byte) 126, var3.field4348);
                    class78.method552(class257.field4496, var3.field4319, var3.field4348, var3.field4328, (var3.field4345 - 1) * 64 + 60, var3, var3.field4326, var4, var3.field4282);
                }
            }
        }
        if (arg1 != 64) {
            method204(0);
        }
        field632++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lu;ILj;)Z")
    public final boolean method202(class111 arg0, int arg1, class155 arg2) {
        field633++;
        for (int var4 = 0; var4 < this.field631.length; var4++) {
            if (!arg0.method827(this.field631[var4], -101)) {
                return false;
            }
        }
        if (arg1 != 1879) {
            field618 = 7;
        }
        for (int var5 = 0; var5 < this.field635.length; var5++) {
            if (!arg2.method461(arg1 ^ 0xFFFFF8A8, this.field635[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILu;IZDLj;BZ)[I")
    public final int[] method203(int arg0, class111 arg1, int arg2, boolean arg3, double arg4, class155 arg5, byte arg6, boolean arg7) {
        field617++;
        int[] var10 = new int[arg0 * arg2];
        class46.method238(arg4, false);
        if (arg6 < 117) {
            field622 = false;
        }
        class82.field1367 = arg1;
        class240.field4166 = arg5;
        class172.method1209(arg0, arg2, -99);
        for (int var11 = 0; var11 < this.field620.length; var11++) {
            this.field620[var11].method1389(arg0, arg2, -71);
        }
        int var12 = 0;
        int var13;
        byte var14;
        int var15;
        if (arg7) {
            var13 = -1;
            var14 = -1;
            var15 = arg2 - 1;
        } else {
            var14 = 1;
            var15 = 0;
            var13 = arg2;
        }
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg3) {
                var12 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field627.field3291) {
                int[] var22 = this.field627.method45(var16, 10565);
                var21 = var22;
                var20 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field627.method46((byte) 11, var16);
                var19 = var18[2];
                var20 = var18[1];
                var21 = var18[0];
            }
            for (int var23 = var15; var23 != var13; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var19[var23] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class265.field4633[var25];
                int var27 = class265.field4633[var24];
                int var28 = var21[var23] >> 4;
                if (var28 > 255) {
                    var28 = 255;
                }
                if (var28 < 0) {
                    var28 = 0;
                }
                int var29 = class265.field4633[var28];
                var10[var12++] = (var29 << 16) + (var27 << 8) + var26;
                if (arg3) {
                    var12 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field620.length; var17++) {
            this.field620[var17].method1177(-128);
        }
        return var10;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class40() {
        this.field631 = new int[0];
        this.field635 = new int[0];
        this.field627 = new class220();
        this.field627.field3277 = 1;
        this.field619 = new class220();
        this.field620 = new class196[] { this.field627, this.field619 };
        this.field619.field3277 = 1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static final void method204(int arg0) {
        field625++;
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class147.method1070(class31.field452, (byte) 127);
        class79.method557(class31.field452, (byte) 124);
        if (class130.field2182 != null) {
            class130.field2182.method1225(class31.field452, false);
        }
        class6.method26(27771);
        class188.method1342((byte) 118, class31.field452);
        class246.method1676(arg0 + 94, class31.field452);
        if (class130.field2182 != null) {
            class130.field2182.method1223((byte) -108, class31.field452);
        }
        class237.method1639((byte) -117);
        class13.field197 = (long) arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method205(byte arg0) {
        field629 = null;
        if (arg0 != 98) {
            return;
        }
        field637 = null;
        field626 = null;
        field634 = null;
        field636 = null;
        field621 = null;
        field630 = null;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Llb;)V")
    public class40(class121 arg0) {
        int var2 = arg0.method897(115);
        this.field620 = new class196[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class196 var16 = class53.method339((byte) 37, arg0);
            if (var16.method1176(2) >= 0) {
                var3++;
            }
            if (var16.method1372((byte) -100) >= 0) {
                var4++;
            }
            int var17 = var16.field3281.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method897(-81);
            }
            this.field620[var6] = var16;
        }
        this.field635 = new int[var4];
        this.field631 = new int[var3];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class196 var11 = this.field620[var9];
            int var12 = var11.field3281.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3281[var13] = this.field620[var5[var9][var13]];
            }
            int var14 = var11.method1176(2);
            int var15 = var11.method1372((byte) -118);
            if (var14 > 0) {
                this.field631[var7++] = var14;
            }
            if (var15 > 0) {
                this.field635[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field627 = this.field620[arg0.method897(108)];
        this.field619 = this.field620[arg0.method897(113)];
        Object var10 = null;
    }
}
