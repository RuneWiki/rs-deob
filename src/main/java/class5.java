import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class5 extends class23 {

    @OriginalMember(owner = "client!vi", name = "gb", descriptor = "I")
    private int field64 = -1;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "[[I")
    public static int[][] field58 = new int[104][104];

    @OriginalMember(owner = "client!vi", name = "ib", descriptor = "Lqd;")
    public static class40 field66 = class147.method1106("_labels", (byte) -81);

    @OriginalMember(owner = "client!vi", name = "jb", descriptor = "I")
    public static int field67 = 10;

    @OriginalMember(owner = "client!vi", name = "kb", descriptor = "Lqd;")
    private static class40 field68 = class147.method1106("Loaded fonts", (byte) -66);

    @OriginalMember(owner = "client!vi", name = "pb", descriptor = "Lqd;")
    public static class40 field73 = field68;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!vi", name = "eb", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!vi", name = "fb", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!vi", name = "hb", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!vi", name = "lb", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!vi", name = "nb", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!vi", name = "ob", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!vi", name = "qb", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!vi", name = "rb", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!vi", name = "db", descriptor = "Lce;")
    public static class239 field61;

    @OriginalMember(owner = "client!vi", name = "mb", descriptor = "[I")
    public static int[] field70;

    @OriginalMember(owner = "client!vi", name = "sb", descriptor = "[I")
    public int[] field76;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[[I", line = 7)
    public int[][] method17(int arg0, int arg1) {
        field62++;
        if (arg0 <= 30) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field417.method1251(arg1, 122);
        if (this.field417.field2751 && this.method26(false)) {
            int[] var4 = var3[2];
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int var7 = this.field63 * (class271.field4497 == this.field72 ? arg1 : this.field72 * arg1 / class271.field4497);
            if (class52.field1007 == this.field63) {
                for (int var8 = 0; var8 < class52.field1007; var8++) {
                    int var9 = this.field76[var7++];
                    var4[var8] = class276.method1923(4080, var9 << 4);
                    var5[var8] = class276.method1923(65280, var9) >> 4;
                    var6[var8] = class276.method1923(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class52.field1007; var10++) {
                    int var11 = this.field63 * var10 / class52.field1007;
                    int var12 = this.field76[var7 + var11];
                    var4[var10] = class276.method1923(4080, var12 << 4);
                    var5[var10] = class276.method1923(var12 >> 4, 4080);
                    var6[var10] = class276.method1923(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 73)
    public final void method18(boolean arg0) {
        super.method18(arg0);
        field69++;
        this.field76 = null;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 83)
    public class5() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)I", line = 90)
    public final int method19(int arg0) {
        if (arg0 >= -40) {
            this.field64 = 103;
        }
        field56++;
        return this.field64;
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V", line = 104)
    public static final void method20(int arg0) {
        class48.field934 = new class199(32);
        field60++;
        if (arg0 < 77) {
            field73 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lce;Lce;Z)V", line = 116)
    public static final void method21(class239 arg0, class239 arg1, boolean arg2) {
        if (arg2) {
            class119.field2010 = arg0;
            class185.field2989 = arg1;
            field74++;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)I", line = 128)
    public static final int method22(int arg0, int arg1) {
        field59++;
        int var2 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        if (arg1 < 102) {
            field67 = 98;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILsd;)V", line = 144)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field65++;
        if (arg0 == 0) {
            this.field64 = arg2.method197(-1);
        }
        if (arg1 != 0) {
            this.field72 = 67;
        }
    }

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "(I)[Lmb;", line = 159)
    public static final class99[] method24(int arg0) {
        field57++;
        class99[] var1 = new class99[class121.field2108];
        for (int var2 = 0; var2 < class121.field2108; var2++) {
            int var3 = class210.field3356[var2] * class102.field1802[var2];
            byte[] var4 = class22.field387[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class171.field2797[class276.method1923(var4[var6], 255)];
            }
            var1[var2] = new class99(class102.field1799, class169.field2787, class12.field208[var2], class256.field4265[var2], class102.field1802[var2], class210.field3356[var2], var5);
        }
        if (arg0 <= 126) {
            field67 = -51;
        }
        class181.method1324(32);
        return var1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)V", line = 195)
    public static final void method25(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class19.field295.field478 = 0;
        field75++;
        if (arg1 < 67) {
            method21((class239) null, (class239) null, true);
        }
        class19.field295.method218(149, -19914);
        class19.field295.method218(arg3, -19914);
        class19.field295.method218(arg2, -19914);
        class19.field295.method209(16711680, arg0);
        class19.field295.method209(16711680, arg4);
        class272.field4520 = 1;
        class193.field3116 = 0;
        class189.field3069 = -3;
        class194.field3125 = 0;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)Z", line = 238)
    public final boolean method26(boolean arg0) {
        if (arg0) {
            return false;
        }
        field71++;
        if (this.field76 != null) {
            return true;
        } else if (this.field64 >= 0) {
            class99 var2 = class194.field3126 < 0 ? class258.method1809(0, this.field64, class297.field4956) : class55.method471(class297.field4956, 12267, class194.field3126, this.field64);
            var2.method749();
            this.field63 = var2.field2976;
            this.field72 = var2.field2981;
            this.field76 = var2.field1761;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 274)
    public static void method27(byte arg0) {
        field70 = null;
        field58 = (int[][]) null;
        field73 = null;
        field66 = null;
        int var1 = 92 / ((-arg0 - 5) / 55);
        field61 = null;
        field68 = null;
    }
}
