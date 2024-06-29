import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class20 {

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field518 = "Choose Option";

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lsf;")
    public static class124 field517 = new class124(50);

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "[I")
    public static int[] field537 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Lib;")
    public class109 field529;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "Lla;")
    public static class157 field535;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field519;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[I")
    public int[] field516;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "[I")
    public int[] field521;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "[I")
    public int[] field525;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[I")
    public int[] field526;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "[I")
    public int[] field527;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "[I")
    public int[] field531;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "[Lib;")
    public class109[] field536;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "[[I")
    public int[][] field524;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "[[I")
    public int[][] field530;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "[[I")
    public static int[][] field533;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Lic;", line = 11)
    public static final class135 method183(int arg0) {
        field515++;
        try {
            return arg0 == 200000 ? new class326() : (class135) null;
        } catch (Throwable var4) {
            try {
                return (class135) Class.forName("lo").getDeclaredConstructor().newInstance();
            } catch (Throwable var3) {
                return new class228();
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lec;B)V", line = 39)
    public static final void method184(class47 arg0, byte arg1) {
        field538++;
        class355.method2520(true, arg0, 200000);
        int var2 = 51 % ((46 - arg1) / 55);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 65)
    public static void method185(int arg0) {
        if (arg0 != 0) {
            field519 = (String) null;
        }
        field517 = null;
        field535 = null;
        field518 = null;
        field533 = (int[][]) null;
        field519 = null;
        field537 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([BI)V", line = 82)
    private final void method186(byte[] arg0, int arg1) {
        field522++;
        class146 var3 = new class146(class128.method915(arg0, 1));
        int var4 = var3.method1005((byte) 122);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field532 = 0;
        } else {
            this.field532 = var3.method1004(3);
        }
        int var5 = var3.method1005((byte) 122);
        int var6 = -1;
        int var7 = 0;
        this.field523 = var3.method989(69);
        this.field531 = new int[this.field523];
        for (int var8 = 0; var8 < this.field523; var8++) {
            this.field531[var8] = var7 += var3.method989(88);
            if (this.field531[var8] > var6) {
                var6 = this.field531[var8];
            }
        }
        this.field534 = var6 + 1;
        this.field527 = new int[this.field534];
        this.field526 = new int[this.field534];
        this.field516 = new int[this.field534];
        this.field530 = new int[this.field534][];
        this.field525 = new int[this.field534];
        if (var5 != 0) {
            this.field521 = new int[this.field534];
            for (int var9 = 0; var9 < this.field534; var9++) {
                this.field521[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field523; var10++) {
                this.field521[this.field531[var10]] = var3.method1004(3);
            }
            this.field529 = new class109(this.field521);
        }
        for (int var11 = 0; var11 < this.field523; var11++) {
            this.field526[this.field531[var11]] = var3.method1004(3);
        }
        for (int var12 = 0; var12 < this.field523; var12++) {
            this.field516[this.field531[var12]] = var3.method1004(3);
        }
        for (int var13 = 0; var13 < this.field523; var13++) {
            this.field525[this.field531[var13]] = var3.method989(81);
        }
        for (int var14 = 0; var14 < this.field523; var14++) {
            int var15 = this.field531[var14];
            int var16 = 0;
            int var17 = this.field525[var15];
            int var18 = -1;
            this.field530[var15] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field530[var15][var19] = var16 += var3.method989(79);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field527[var15] = var18 + 1;
            if ((var18 + 1) == var17) {
                this.field530[var15] = null;
            }
        }
        if (var5 != 0) {
            this.field536 = new class109[var6 + 1];
            this.field524 = new int[var6 + 1][];
            for (int var21 = 0; var21 < this.field523; var21++) {
                int var22 = this.field531[var21];
                int var23 = this.field525[var22];
                this.field524[var22] = new int[this.field527[var22]];
                for (int var24 = 0; var24 < this.field527[var22]; var24++) {
                    this.field524[var22][var24] = -1;
                }
                for (int var25 = 0; var25 < var23; var25++) {
                    int var26;
                    if (this.field530[var22] == null) {
                        var26 = var25;
                    } else {
                        var26 = this.field530[var22][var25];
                    }
                    this.field524[var22][var26] = var3.method1004(3);
                }
                this.field536[var22] = new class109(this.field524[var22]);
            }
        }
        if (arg1 <= 105) {
            this.method186((byte[]) null, 25);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([BI)V", line = 261)
    public class20(byte[] arg0, int arg1) {
        this.field528 = class44.method373(-11196, arg0, arg0.length);
        if (this.field528 != arg1) {
            throw new RuntimeException();
        }
        this.method186(arg0, 107);
    }
}
