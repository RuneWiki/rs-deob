import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class341 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lnh;")
    private class128 field5428 = new class128();

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Ljo;")
    private class98 field5440 = new class98();

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    private int field5441;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    private int field5437;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Ltm;")
    private class79 field5442;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    public static int[] field5432 = new int[99];

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
    public static int[] field5434;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lul;")
    public static class51 field5438;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lno;")
    public static class5 field5443;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lcg;")
    public static class49 field5445;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Lte;", line = 12)
    public final class320 method2394(byte arg0) {
        int var2 = 76 / ((arg0 - 43) / 34);
        field5427++;
        return this.field5442.method736(2);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method2395(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5435++;
        class30 var5 = class99.method857((byte) -3, arg0, 4);
        var5.method277(true);
        if (arg3 == 99) {
            var5.field438 = arg2;
            var5.field441 = arg4;
            var5.field425 = arg1;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IJLnh;)V", line = 39)
    public final void method2396(int arg0, long arg1, class128 arg2) {
        if (this.field5441 == arg0) {
            class128 var5 = this.field5440.method852(arg0 + 14278);
            var5.method2195(-1);
            var5.method1067(arg0 ^ 0x9C40);
            if (this.field5428 == var5) {
                class128 var6 = this.field5440.method852(14278);
                var6.method2195(-1);
                var6.method1067(40000);
            }
        } else {
            this.field5441--;
        }
        field5429++;
        this.field5442.method725(arg1, arg2, 1);
        this.field5440.method851(arg2, (byte) -44);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 74)
    public static void method2397(boolean arg0) {
        field5438 = null;
        field5445 = null;
        field5432 = null;
        field5434 = null;
        field5443 = null;
        if (!arg0) {
            method2397(true);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Lte;", line = 88)
    public final class320 method2398(byte arg0) {
        field5433++;
        int var2 = -21 / ((arg0 - 29) / 37);
        return this.field5442.method727((byte) -110);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V", line = 100)
    public final void method2399(byte arg0) {
        field5430++;
        this.field5440.method845(arg0 ^ 0xC53);
        this.field5442.method734(1);
        if (arg0 != -101) {
            this.method2394((byte) -18);
        }
        this.field5428 = new class128();
        this.field5441 = this.field5437;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(JI)Lnh;", line = 115)
    public final class128 method2400(long arg0, int arg1) {
        field5431++;
        class128 var4 = (class128) this.field5442.method732(arg0, true);
        if (arg1 == 99) {
            if (var4 != null) {
                this.field5440.method851(var4, (byte) -44);
            }
            return var4;
        } else {
            return (class128) null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field5432[var1] = var0 / 4;
        }
        field5434 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
        field5436 = 0;
        field5439 = 1;
        field5438 = new class51(64);
        field5443 = new class5(5000);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V", line = 190)
    public class341(int arg0) {
        this.field5441 = arg0;
        this.field5437 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field5442 = new class79(var2);
    }
}
