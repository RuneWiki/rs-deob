import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class384 {

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    private int field5716 = 0;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "[Lcg;")
    public class86[] field5714;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public int field5701;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field5705 = -2;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "[I")
    public static int[] field5712 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lph;")
    public static class438 field5699 = new class438("WTQA", 2);

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Liu;")
    public static class390 field5715 = new class390(95, 1);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "J")
    private long field5709;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lcg;")
    private class86 field5700;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lcg;")
    private class86 field5717;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Lcg;")
    public final class86 method2308(byte arg0) {
        field5703++;
        if (this.field5716 > 0 && this.field5714[this.field5716 - 1] != this.field5717) {
            class86 var2 = this.field5717;
            this.field5717 = var2.field1179;
            return var2;
        }
        int var3 = -107 % ((68 - arg0) / 40);
        while (this.field5701 > this.field5716) {
            class86 var4 = this.field5714[this.field5716++].field1179;
            if (this.field5714[this.field5716 - 1] != var4) {
                this.field5717 = var4.field1179;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)Lcg;")
    public final class86 method2309(int arg0) {
        field5711++;
        if (this.field5700 == null) {
            return null;
        }
        int var2 = -86 / ((-arg0 - 13) / 45);
        class86 var3 = this.field5714[(int) (this.field5709 & (long) (this.field5701 - 1))];
        while (this.field5700 != var3) {
            if (this.field5700.field1177 == this.field5709) {
                class86 var4 = this.field5700;
                this.field5700 = this.field5700.field1179;
                return var4;
            }
            this.field5700 = this.field5700.field1179;
        }
        this.field5700 = null;
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BJ)Lcg;")
    public final class86 method2310(byte arg0, long arg1) {
        field5713++;
        int var4 = -84 % ((arg0 - 3) / 55);
        this.field5709 = arg1;
        class86 var5 = this.field5714[(int) ((long) (this.field5701 - 1) & arg1)];
        for (this.field5700 = var5.field1179; this.field5700 != var5; this.field5700 = this.field5700.field1179) {
            if (this.field5700.field1177 == arg1) {
                class86 var6 = this.field5700;
                this.field5700 = this.field5700.field1179;
                return var6;
            }
        }
        this.field5700 = null;
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)I")
    public final int method2311(byte arg0) {
        field5708++;
        return arg0 > -16 ? 64 : this.field5701;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)I")
    public static final int method2312(int arg0, byte arg1) {
        if (arg1 != -127) {
            field5715 = null;
        }
        field5698++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static void method2313(int arg0) {
        if (arg0 != -25267) {
            field5715 = null;
        }
        field5712 = null;
        field5699 = null;
        field5715 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)I")
    public final int method2314(boolean arg0) {
        field5704++;
        int var2 = 0;
        if (arg0) {
            return 0;
        }
        for (int var3 = 0; var3 < this.field5701; var3++) {
            class86 var4 = this.field5714[var3];
            for (class86 var5 = var4.field1179; var5 != var4; var5 = var5.field1179) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
    public final void method2315(byte arg0) {
        field5706++;
        if (arg0 > -94) {
            this.field5701 = -35;
        }
        for (int var2 = 0; var2 < this.field5701; var2++) {
            class86 var3 = this.field5714[var2];
            while (true) {
                class86 var4 = var3.field1179;
                if (var3 == var4) {
                    break;
                }
                var4.method536(false);
            }
        }
        this.field5700 = null;
        this.field5717 = null;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)Lcg;")
    public final class86 method2316(int arg0) {
        this.field5716 = 0;
        field5707++;
        return arg0 == 4999 ? this.method2308((byte) 4) : null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IJLcg;)V")
    public final void method2317(int arg0, long arg1, class86 arg2) {
        if (arg2.field1173 != null) {
            arg2.method536(false);
        }
        field5702++;
        class86 var5 = this.field5714[(int) (arg1 & (long) (this.field5701 + arg0))];
        arg2.field1173 = var5.field1173;
        arg2.field1179 = var5;
        arg2.field1173.field1179 = arg2;
        arg2.field1179.field1173 = arg2;
        arg2.field1177 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lcg;B)I")
    public final int method2318(class86[] arg0, byte arg1) {
        field5710++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5701; var4++) {
            class86 var6 = this.field5714[var4];
            for (class86 var7 = var6.field1179; var7 != var6; var7 = var7.field1179) {
                arg0[var3++] = var7;
            }
        }
        int var5 = 108 / ((-arg1 - 53) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
    public class384(int arg0) {
        this.field5714 = new class86[arg0];
        this.field5701 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class86 var3 = this.field5714[var2] = new class86();
            var3.field1173 = var3;
            var3.field1179 = var3;
        }
    }
}
