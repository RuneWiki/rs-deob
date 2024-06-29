import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class93 extends class287 {

    @OriginalMember(owner = "client!fq", name = "x", descriptor = "I")
    public static int field1525 = 0;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!fq", name = "y", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "Lew;")
    private class270 field1518;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "Z")
    public static boolean field1521;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "[[[I")
    public static int[][][] field1520;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZLjava/lang/String;)Ljava/lang/String;")
    public final String method759(int arg0, boolean arg1, String arg2) {
        if (arg1) {
            method761(127, null);
        }
        field1523++;
        if (this.field1518 == null) {
            return arg2;
        } else {
            class189 var4 = (class189) this.field1518.method1592((byte) -25, (long) arg0);
            return var4 == null ? arg2 : var4.field2777;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IILsv;)V")
    private final void method760(int arg0, int arg1, class319 arg2) {
        field1519++;
        if (arg1 != 0) {
            method761(-51, null);
        }
        if (arg0 != 249) {
            return;
        }
        int var4 = arg2.method1869(arg1 ^ 0xFFFFFFB1);
        if (this.field1518 == null) {
            int var5 = class274.method1604(var4, (byte) 25);
            this.field1518 = new class270(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method1869(-118) == 1;
            int var8 = arg2.method1852(1086280488);
            class476 var9;
            if (var7) {
                var9 = new class189(arg2.method1871(113));
            } else {
                var9 = new class437(arg2.method1863(-1));
            }
            this.field1518.method1586(var9, (long) var8, 1);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILsv;)Lds;")
    public static final class275 method761(int arg0, class319 arg1) {
        field1526++;
        if (arg0 < 23) {
            field1520 = null;
        }
        return new class275(arg1.method1847(18), arg1.method1847(101), arg1.method1847(49), arg1.method1847(35), arg1.method1852(1086280488), arg1.method1852(1086280488), arg1.method1869(-65));
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(ILsv;)V")
    public final void method762(int arg0, class319 arg1) {
        field1524++;
        int var3 = -39 / ((51 - arg0) / 39);
        while (true) {
            int var4 = arg1.method1869(-85);
            if (var4 == 0) {
                return;
            }
            this.method760(var4, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)V")
    public static void method763(int arg0) {
        field1520 = null;
        int var1 = 114 % ((arg0 + 37) / 59);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)I")
    public final int method764(int arg0, int arg1, int arg2) {
        field1522++;
        if (this.field1518 == null) {
            return arg2;
        } else {
            int var4 = -21 % ((arg1 - 65) / 35);
            class437 var5 = (class437) this.field1518.method1592((byte) -25, (long) arg0);
            return var5 == null ? arg2 : var5.field6308;
        }
    }
}
