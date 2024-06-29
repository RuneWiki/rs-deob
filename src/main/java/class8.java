import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 extends class70 {

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client!b", name = "sb", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!b", name = "yb", descriptor = "Ldc;")
    private class25 field172;

    @OriginalMember(owner = "client!b", name = "Ab", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!b", name = "vb", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!b", name = "tb", descriptor = "J")
    public static long field167 = 0L;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "Lic;")
    public static class59 field155 = class59.method433(0, "<img=1>");

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "Lic;")
    public static class59 field162 = class59.method433(0, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!b", name = "ub", descriptor = "Lic;")
    public static class59 field168 = class59.method433(0, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "I")
    public static int field164 = 0;

    @OriginalMember(owner = "client!b", name = "zb", descriptor = "Lic;")
    private static class59 field173 = class59.method433(0, "Select a world");

    @OriginalMember(owner = "client!b", name = "xb", descriptor = "Lic;")
    public static class59 field171 = field173;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!b", name = "wb", descriptor = "Lmd;")
    public static class87 field170;

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "[[I")
    public static int[][] field163;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(B)V")
    public static void method41(byte arg0) {
        field170 = null;
        field162 = null;
        field155 = null;
        field171 = null;
        field163 = null;
        field173 = null;
        field168 = null;
        int var1 = 27 / ((arg0 + 39) / 32);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZI)V")
    public static final void method42(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            method42(112, -70, true, 28);
        }
        if (class56.field1373 != 0 && arg0 != 0 && class68.field1703 < 50) {
            class75.field1855[class68.field1703] = arg1;
            class61.field1562[class68.field1703] = arg0;
            class38.field973[class68.field1703] = arg3;
            class4.field81[class68.field1703] = null;
            class22.field522[class68.field1703] = 0;
            class68.field1703++;
        }
        field157++;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(B)Lnb;")
    public final class92 method43(byte arg0) {
        field161++;
        if (this.field172 != null) {
            int var2 = class23.field561 - this.field169;
            if (var2 > 100 && this.field172.field639 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (this.field172.field610[this.field174] >= var2) {
                            break label51;
                        }
                        var2 -= this.field172.field610[this.field174];
                        this.field174++;
                    } while (this.field172.field625.length > this.field174);
                    this.field174 -= this.field172.field639;
                } while (this.field174 >= 0 && this.field174 < this.field172.field625.length);
                this.field172 = null;
            }
            this.field169 = class23.field561 - var2;
        }
        class19 var3 = class53.method397(this.field154, 13415);
        if (var3.field379 != null) {
            var3 = var3.method102(-19992);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field159 == 1 || this.field159 == 3) {
            var5 = var3.field434;
            var4 = var3.field418;
        } else {
            var4 = var3.field434;
            var5 = var3.field418;
        }
        int var6 = this.field158 + (var5 >> 1);
        int var7 = (var5 + 1 >> 1) + this.field158;
        int var8 = (var4 >> 1) + this.field156;
        int[][] var9 = class26.field695[this.field165];
        int var10 = this.field156 + (var4 + 1 >> 1);
        int var11 = var9[var6][var10] + var9[var7][var8] + var9[var7][var10] + var9[var6][var8] >> 2;
        if (arg0 <= 21) {
            return null;
        } else {
            int var12 = (this.field158 << 7) + (var5 << 6);
            int var13 = (this.field156 << 7) + (var4 << 6);
            return var3.method101(this.field174, var13, var11, var12, this.field172, -5665, this.field166, var9, this.field159);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIIIZLka;)V")
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class70 arg8) {
        this.field154 = arg0;
        this.field165 = arg3;
        this.field156 = arg5;
        this.field159 = arg2;
        this.field158 = arg4;
        this.field166 = arg1;
        if (arg6 != -1) {
            this.field172 = class49.method381(arg6, (byte) 105);
            this.field174 = 0;
            this.field169 = class23.field561 - 1;
            if (this.field172.field623 == 0 && arg8 != null && arg8 instanceof class8) {
                class8 var10 = (class8) arg8;
                if (this.field172 == var10.field172) {
                    this.field174 = var10.field174;
                    this.field169 = var10.field169;
                    return;
                }
            }
            if (arg7 && this.field172.field639 != -1) {
                this.field174 = (int) ((double) this.field172.field625.length * Math.random());
                this.field169 -= (int) (Math.random() * (double) this.field172.field610[this.field174]);
                return;
            }
        }
    }
}
