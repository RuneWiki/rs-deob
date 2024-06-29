import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class173 {

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Loe;")
    private class57 field2819 = new class57();

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    private int field2836;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    private int field2837;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lhb;")
    private class155 field2828;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2818 = "wave2:";

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field2831 = 0;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "[[I")
    public static int[][] field2834 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2829 = "M";

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "F")
    public static float field2833;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
    public static int[] field2825;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[I")
    public static int[] field2835;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[Lbl;")
    public static class146[] field2821;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)I")
    public final int method1253(int arg0) {
        field2838++;
        int var2 = 0;
        if (arg0 != 12) {
            method1258(20, 113, -21);
        }
        for (class309 var3 = (class309) this.field2819.method389(0); var3 != null; var3 = (class309) this.field2819.method396(0)) {
            if (!var3.method133(false)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BJ)V")
    public final void method1254(byte arg0, long arg1) {
        if (arg0 > -53) {
            return;
        }
        field2826++;
        class309 var4 = (class309) this.field2828.method1059(0, arg1);
        if (var4 != null) {
            var4.method913(-3542);
            var4.method956(256);
            this.field2836++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public final void method1255(int arg0) {
        field2840++;
        if (arg0 >= -65) {
            method1258(100, 53, 34);
        }
        for (class309 var2 = (class309) this.field2819.method389(0); var2 != null; var2 = (class309) this.field2819.method396(0)) {
            if (var2.method133(false)) {
                var2.method913(-3542);
                var2.method956(256);
                this.field2836++;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static void method1256(int arg0) {
        field2835 = null;
        field2818 = null;
        field2834 = null;
        if (arg0 > -94) {
            field2834 = null;
        }
        field2825 = null;
        field2829 = null;
        field2821 = null;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public final void method1257(int arg0) {
        int var2 = 100 / ((-arg0 - 56) / 47);
        field2827++;
        this.field2819.method392(1);
        this.field2828.method1056(-107);
        this.field2836 = this.field2837;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)J")
    public static final long method1258(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        return var3 == null || var3.field2355 == null ? 0L : var3.field2355.field4185;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method1259(boolean arg0, int arg1, int arg2) {
        field2823++;
        if (arg0 && arg2 >= 0) {
            if (arg1 != 0) {
                field2831 = 96;
            }
            return class273.method1831(arg1 ^ 0xFFFFFF81, arg0, 10, arg2);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILbc;)V")
    public static final void method1260(int arg0, int arg1, class299 arg2) {
        int var3 = 58 / ((arg0 - 51) / 62);
        field2820++;
        class107 var4 = (class107) class234.field3763.method1059(0, (long) arg1);
        if (var4 == null) {
            return;
        }
        if (var4.field1699 != null) {
            class6.field68.method1594(var4.field1699);
            var4.field1699 = null;
        }
        var4.method913(-3542);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method1261(int arg0, long arg1) {
        field2839++;
        class309 var4 = (class309) this.field2828.method1059(0, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0 != 0) {
            method1260(15, -64, (class299) null);
        }
        Object var5 = var4.method134(-106);
        if (var5 == null) {
            var4.method913(-3542);
            var4.method956(256);
            this.field2836++;
            return null;
        }
        if (var4.method133(false)) {
            class30 var6 = new class30(var5);
            this.field2828.method1052(var4.field2012, (byte) -65, var6);
            this.field2819.method395(30985, var6);
            var6.field2169 = 0L;
            var4.method913(-3542);
            var4.method956(256);
        } else {
            this.field2819.method395(30985, var4);
            var4.field2169 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public final void method1262(int arg0, int arg1) {
        if (arg1 != 2736) {
            method1258(-114, 127, 13);
        }
        field2824++;
        if (class237.field3805 == null) {
            return;
        }
        for (class309 var3 = (class309) this.field2819.method389(arg1 ^ 0xAB0); var3 != null; var3 = (class309) this.field2819.method396(0)) {
            if (var3.method133(false)) {
                if (var3.method134(-88) == null) {
                    var3.method913(-3542);
                    var3.method956(256);
                    this.field2836++;
                }
            } else if ((++var3.field2169) > ((long) arg0)) {
                class309 var4 = class237.field3805.method1346(var3, arg1 - 2732);
                this.field2828.method1052(var3.field2012, (byte) -65, var4);
                class33.method220(126, var3, var4);
                var3.method913(-3542);
                var3.method956(256);
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)I")
    public static int method1263(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IJLjava/lang/Object;)V")
    public final void method1264(int arg0, long arg1, Object arg2) {
        this.method1254((byte) -91, arg1);
        field2822++;
        if (~this.field2836 == arg0) {
            class309 var5 = (class309) this.field2819.method390(arg0 - 68);
            var5.method913(-3542);
            var5.method956(256);
        } else {
            this.field2836--;
        }
        class30 var6 = new class30(arg2);
        this.field2828.method1052(arg1, (byte) -65, var6);
        this.field2819.method395(30985, var6);
        var6.field2169 = 0L;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
    public class173(int arg0) {
        this.field2836 = arg0;
        int var2 = 1;
        this.field2837 = arg0;
        while ((var2 + var2) < arg0) {
            var2 += var2;
        }
        this.field2828 = new class155(var2);
    }
}
