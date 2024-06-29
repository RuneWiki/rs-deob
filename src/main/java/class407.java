import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class407 implements class331 {

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Lwia;")
    public class791 field5544;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lwia;")
    private class791 field5546;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Lgi;")
    public class706 field5543;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field5535 = 100;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "Lfba;")
    public static class27 field5547 = new class27(18, 6);

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Lls;")
    public static class149 field5548 = new class149("LIVE", 0);

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "Lip;")
    public static class735 field5550 = new class735();

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "[I")
    public static int[] field5551 = new int[4];

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    private int field5537;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "J")
    private long field5545;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lda;")
    private class66 field5540;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)I")
    public static final int method2488(int arg0, int arg1, int arg2) {
        field5538++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (arg0 != 4) {
            method2488(64, -45, -45);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Z")
    public boolean method298(byte arg0) {
        field5536++;
        boolean var2 = true;
        if (arg0 != -98) {
            return false;
        }
        if (!this.field5544.method4349((byte) -102, this.field5543.field9840)) {
            var2 = false;
        }
        if (!this.field5546.method4349((byte) -102, this.field5543.field9840)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBIZ)V")
    public abstract void method1920(int arg0, byte arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)I")
    public final int method2489(int arg0) {
        field5542++;
        if (arg0 != 10000) {
            this.method297(-5);
        }
        int var2 = class590.field8323.method3144(arg0 ^ 0x3348);
        int var3 = var2 * 100;
        if (this.field5537 == var2 && var2 != 0) {
            int var4 = class590.field8323.method3141((byte) -1);
            if (var4 > var2) {
                long var5 = this.field5545 - class590.field8323.method3146((byte) -121);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class459.method2731(106) - this.field5545) * 10000L;
                    if (var9 >= var7) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + ((long) (var2 * 100)));
                    }
                }
            }
        } else {
            this.field5537 = var2;
            this.field5545 = class459.method2731(97);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZ)V")
    public abstract void method1919(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZ)V")
    public final void method299(boolean arg0, boolean arg1) {
        field5539++;
        int var3 = this.field5543.field9843.method703(this.field5543.field9833, class527.field7532, (byte) 35) + this.field5543.field9838;
        int var4 = this.field5543.field9845.method2781(this.field5543.field9837, 0, class296.field4307) + this.field5543.field9832;
        this.method1919(var4, var3, 7, arg0);
        if (arg1) {
            this.field5546 = null;
        }
        this.method1920(var3, (byte) 105, var4, arg0);
        String var5 = class590.field8323.method3145(true);
        if (class459.method2731(99) - this.field5545 > 10000L) {
            var5 = var5 + " (" + class590.field8323.method3143(-1).method369((byte) 82) + ")";
        }
        this.field5540.method566(var5, this.field5543.field9835, this.field5543.field9837 / 2 + this.field5543.field9834 + var4 + 4, 0, -1, var3 + (this.field5543.field9833 / 2));
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public void method297(int arg0) {
        int var2 = -93 % ((arg0 - 83) / 32);
        field5541++;
        class6 var3 = class119.method899(-30298, this.field5546, this.field5543.field9840);
        this.field5540 = class37.field491.method437(var3, class1.method2(this.field5544, this.field5543.field9840), true);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lwia;Lwia;Lgi;)V")
    public class407(class791 arg0, class791 arg1, class706 arg2) {
        this.field5544 = arg0;
        this.field5546 = arg1;
        this.field5543 = arg2;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
    public static void method2490(byte arg0) {
        field5547 = null;
        if (arg0 < -22) {
            field5548 = null;
            field5551 = null;
            field5550 = null;
        }
    }
}
