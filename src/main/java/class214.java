import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class class214 extends class589 {

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "Z")
    public boolean field2812 = false;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "I")
    public static int field2817 = -1;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "B")
    public byte field2809;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "B")
    public byte field2813;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!fq", name = "x", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "Lfq;")
    public class214 field2808;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "Z")
    public boolean field2804;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIILlp;)V", line = 10)
    public static final void method1384(int arg0, int arg1, int arg2, int arg3, class412 arg4) {
        field2801++;
        if (arg1 != 17617) {
            return;
        }
        for (class119 var5 = (class119) class197.field2555.method679((byte) -86); var5 != null; var5 = (class119) class197.field2555.method681(-107)) {
            if (var5.field1608 == arg2 && arg3 << 9 == var5.field1582 && (arg0 << 9) == var5.field1583 && var5.field1606.field5850 == arg4.field5850) {
                if (var5.field1599 != null) {
                    class701.field9285.method22(var5.field1599);
                    var5.field1599 = null;
                }
                if (var5.field1590 != null) {
                    class701.field9285.method22(var5.field1590);
                    var5.field1590 = null;
                }
                var5.method1102((byte) 118);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IB[Luaa;I)I", line = 50)
    public final int method1385(int arg0, byte arg1, class127[] arg2, int arg3) {
        if (arg1 > -57) {
            field2807 = 119;
        }
        field2814++;
        long var5 = class160.field2148[this.field2813][arg3][arg0];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg2[var9++] = class82.field1135[var10 - 1].field6422;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg2[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZ)V", line = 91)
    public static final void method1386(int arg0, boolean arg1) {
        field2818++;
        for (class119 var2 = (class119) class197.field2555.method679((byte) -86); var2 != null; var2 = (class119) class197.field2555.method681(arg0 - 72)) {
            if (var2.field1599 != null) {
                class701.field9285.method22(var2.field1599);
                var2.field1599 = null;
            }
            if (var2.field1590 != null) {
                class701.field9285.method22(var2.field1590);
                var2.field1590 = null;
            }
            var2.method1102((byte) 56);
        }
        if (arg0 != -1) {
            field2817 = -26;
        }
        if (!arg1) {
            return;
        }
        for (class119 var3 = (class119) class205.field2641.method679((byte) -86); var3 != null; var3 = (class119) class205.field2641.method681(arg0 - 41)) {
            if (var3.field1599 != null) {
                class701.field9285.method22(var3.field1599);
                var3.field1599 = null;
            }
            var3.method1102((byte) 54);
        }
        for (class119 var4 = (class119) class310.field4390.method1249((byte) -99); var4 != null; var4 = (class119) class310.field4390.method1246(true)) {
            if (var4.field1599 != null) {
                class701.field9285.method22(var4.field1599);
                var4.field1599 = null;
            }
            var4.method1102((byte) 81);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIBI)V", line = 164)
    public static final void method1387(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2805++;
        if (arg3 >= -120) {
            field2817 = 84;
        }
        if (arg0 != 8 && arg0 != 16) {
            class194 var5 = class443.field6387[arg1][arg2][arg4];
            if (var5 != null) {
                if (arg0 == 1) {
                    var5.field2530 = 0;
                } else if (arg0 == 2) {
                    var5.field2528 = 0;
                }
            }
            class183.method1237(8390);
            return;
        }
        for (int var6 = 0; var6 < class282.field4079; var6++) {
            class378 var7 = class135.field1833[var6];
            if (var7.field5524 == arg0 && var7.field5522 == arg2 && var7.field5513 == arg4 || var7.field5518 == arg2 && var7.field5513 == arg4) {
                if (class282.field4079 != var6) {
                    class421.method2533(class135.field1833, var6 + 1, class135.field1833, var6, -var6 - (1 - class135.field1833.length));
                }
                class282.field4079--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)I", line = 220)
    public int method117(byte arg0) {
        if (arg0 <= 105) {
            this.field2804 = true;
        }
        field2811++;
        return 0;
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(Lha;B)Lpia;")
    public abstract class104 method114(class66 arg0, byte arg1);

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)Z")
    public abstract boolean method1383(int arg0);

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(Z)I")
    public abstract int method767(boolean arg0);

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)Z")
    public abstract boolean method126(byte arg0);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILfq;BIILha;Z)V")
    public abstract void method129(int arg0, class214 arg1, byte arg2, int arg3, int arg4, class66 arg5, boolean arg6);

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "(I)Z")
    public abstract boolean method769(int arg0);

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(Lha;B)Lln;")
    public abstract class398 method119(class66 arg0, byte arg1);

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(B)I")
    public abstract int method774(byte arg0);

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "(I)V")
    public abstract void method127(int arg0);

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "(Lha;B)V")
    public abstract void method131(class66 arg0, byte arg1);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILha;II)Z")
    public abstract boolean method122(int arg0, class66 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B[Luaa;)I")
    public abstract int method1388(byte arg0, class127[] arg1);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lha;Z)Z")
    public abstract boolean method1389(class66 arg0, boolean arg1);

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "(I)Z")
    public abstract boolean method777(int arg0);
}
