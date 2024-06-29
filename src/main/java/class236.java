import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class236 extends class235 {

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    private int field3316;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field3319 = 1;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "[B")
    public static byte[] field3322 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "[Ltn;")
    public class109[] field3315;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "[[B")
    private byte[][] field3321;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)Z", line = 5)
    public final boolean method1440(int arg0, int arg1) {
        field3312++;
        if (arg0 != 65280) {
            method1446(26);
        }
        return this.field3315[arg1].field1503;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILnr;Lqj;)V", line = 16)
    public static final void method1441(int arg0, class437 arg1, class238 arg2) {
        field3314++;
        if (class164.field2134) {
            return;
        }
        arg1.method2118(0);
        class39.field629 = arg1.method2166(class25.method220(arg2, class282.field4137), true);
        class39.field629.method1499((class345.field5120 - class39.field629.method1088()) / 2, (class274.field4034 - class39.field629.method1091()) / 2);
        class252.field3658 = arg1.method2166(class25.method220(arg2, class177.field2326), true);
        class252.field3658.method1499((class345.field5120 - class252.field3658.method1088()) / 2, 18);
        if (arg0 >= -122) {
            method1441(41, (class437) null, (class238) null);
        }
        class164.field2134 = true;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V", line = 39)
    public static final void method1442(int arg0) {
        class119.field1607 = new class249[class262.field3811.method1469((byte) 126)][];
        field3317++;
        if (arg0 != 0) {
            field3319 = -92;
        }
        class339.field4991 = new boolean[class262.field3811.method1469((byte) 47)];
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)Z", line = 58)
    public final boolean method1443(byte arg0, int arg1) {
        field3320++;
        return arg0 == 0 ? this.field3315[arg1].field1494 : true;
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)Z", line = 69)
    public final boolean method1444(int arg0) {
        field3313++;
        if (this.field3315 != null) {
            return true;
        }
        if (this.field3321 == null) {
            if (!class93.field1272.method1475(this.field3316, (byte) 42)) {
                return false;
            }
            int[] var2 = class93.field1272.method1457((byte) -114, this.field3316);
            this.field3321 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field3321[var3] = class93.field1272.method1472(var2[var3], this.field3316, 0);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field3321.length; var5++) {
            byte[] var14 = this.field3321[var5];
            int var15 = var14[1] & 0xFF | var14[0] & 0xFF << 8;
            var4 &= class16.field184.method1451(-116, var15);
        }
        if (!var4) {
            return false;
        } else if (arg0 == 1) {
            class408 var6 = new class408();
            int var7 = class93.field1272.method1476(this.field3316, (byte) -72);
            this.field3315 = new class109[var7];
            int[] var8 = class93.field1272.method1457((byte) -114, this.field3316);
            for (int var9 = 0; var9 < var8.length; var9++) {
                byte[] var10 = this.field3321[var9];
                int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
                class402 var12 = null;
                for (class402 var13 = (class402) var6.method2649(0); var13 != null; var13 = (class402) var6.method2656(0)) {
                    if (var13.field5977 == var11) {
                        var12 = var13;
                        break;
                    }
                }
                if (var12 == null) {
                    var12 = new class402(var11, class16.field184.method1466(var11, 37));
                    var6.method2660((byte) -128, var12);
                }
                this.field3315[var8[var9]] = new class109(var10, var12);
            }
            this.field3321 = null;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V", line = 164)
    public static final void method1445(int arg0, int arg1, int arg2) {
        if (arg1 != -4791) {
            method1446(-99);
        }
        class192.field2668[arg0] = arg2;
        field3318++;
        class28 var3 = (class28) class146.field1923.method954(-104, (long) arg0);
        if (var3 == null) {
            class28 var4 = new class28(class55.method375(arg1 + 878) + 500L);
            class146.field1923.method956(false, (long) arg0, var4);
        } else {
            var3.field492 = class55.method375(-3913) + 500L;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V", line = 190)
    public class236(int arg0) {
        this.field3316 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V", line = 198)
    public static void method1446(int arg0) {
        if (arg0 < 45) {
            method1446(73);
        }
        field3322 = null;
    }
}
