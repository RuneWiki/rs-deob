import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class5 extends class12 {

    @OriginalMember(owner = "client!v", name = "tb", descriptor = "Lda;")
    public static class275 field72 = class255.method1672(100, "Ausw-=hlen");

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
    public static int field64 = -1;

    @OriginalMember(owner = "client!v", name = "sb", descriptor = "I")
    public static int field71 = -2;

    @OriginalMember(owner = "client!v", name = "vb", descriptor = "Lda;")
    public static class275 field74 = class255.method1672(96, "loc");

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "I")
    public static int field69 = -1;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "Lma;")
    public static class105 field68;

    @OriginalMember(owner = "client!v", name = "ub", descriptor = "Lrh;")
    public static class21 field73;

    @OriginalMember(owner = "client!v", name = "rb", descriptor = "[Ljg;")
    public static class37[] field70;

    @OriginalMember(owner = "client!v", name = "wb", descriptor = "[[S")
    public static short[][] field75;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "(I)V")
    public static void method19(int arg0) {
        field74 = null;
        field72 = null;
        if (arg0 != -27565) {
            method20(124, 12, 93);
        }
        field73 = null;
        field70 = null;
        field68 = null;
        field75 = null;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(III)V")
    public static final void method20(int arg0, int arg1, int arg2) {
        ++field65;
        class84 var3 = class118.field2122[class159.field2790][arg2][arg0];
        if (var3 == null) {
            class107.method794(class159.field2790, arg2, arg0);
        } else {
            int var4 = -99999999;
            class256 var5 = null;
            for (class256 var6 = (class256) var3.method550(arg1 + 6327); var6 != null; var6 = (class256) var3.method545(104)) {
                class245 var13 = class210.method1352(49, var6.field4507.field1567);
                int var14 = var13.field4313;
                if (var13.field4321 == 1) {
                    var14 = (var6.field4507.field1563 + 1) * var14;
                }
                if (var14 > var4) {
                    var5 = var6;
                    var4 = var14;
                }
            }
            if (arg1 != -6356) {
                field64 = 80;
            }
            if (var5 == null) {
                class107.method794(class159.field2790, arg2, arg0);
            } else {
                var3.method558((byte) 126, var5);
                class92 var7 = null;
                class256 var8 = (class256) var3.method550(arg1 ^ 6306);
                class92 var9 = null;
                while (var8 != null) {
                    class92 var12 = var8.field4507;
                    if (var5.field4507.field1567 != var12.field1567) {
                        if (var7 == null) {
                            var7 = var12;
                        }
                        if (var7.field1567 != var12.field1567 && var9 == null) {
                            var9 = var12;
                        }
                    }
                    var8 = (class256) var3.method545(104);
                }
                long var10 = (long) ((arg0 << 7) + (arg2 - -1610612736));
                class76.method500(class159.field2790, arg2, arg0, class89.method647(arg0 * 128 + 64, class159.field2790, arg2 * 128 - -64, 9), var5.field4507, var10, var7, var9);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            this.method21(false, 23);
        }
        ++field66;
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007 && this.method53(1852089508)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field181 * super.field181;
            for (int var8 = 0; ~class65.field1070 < ~var8; ++var8) {
                int var9 = super.field189[var8 % super.field182 + var7];
                var6[var8] = class19.method98(4080, var9 << 4);
                var5[var8] = class19.method98(var9 >> 4, 4080);
                var4[var8] = class19.method98(16711680, var9) >> 12;
            }
        }
        return var3;
    }
}
