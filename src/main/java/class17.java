import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FPSNPMMW")
public class class17 {

    @OriginalMember(owner = "FPSNPMMW", name = "a", descriptor = "B")
    private byte field723 = 55;

    @OriginalMember(owner = "FPSNPMMW", name = "f", descriptor = "I")
    public int field728 = -1;

    @OriginalMember(owner = "FPSNPMMW", name = "h", descriptor = "[I")
    public int[] field730 = new int[6];

    @OriginalMember(owner = "FPSNPMMW", name = "i", descriptor = "[I")
    public int[] field731 = new int[6];

    @OriginalMember(owner = "FPSNPMMW", name = "j", descriptor = "I")
    public int field732 = 128;

    @OriginalMember(owner = "FPSNPMMW", name = "k", descriptor = "I")
    public int field733 = 128;

    @OriginalMember(owner = "FPSNPMMW", name = "o", descriptor = "LGOPFMRDJ;")
    public static class22 field737 = new class22(639, 30);

    @OriginalMember(owner = "FPSNPMMW", name = "b", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "FPSNPMMW", name = "d", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "FPSNPMMW", name = "e", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "FPSNPMMW", name = "l", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "FPSNPMMW", name = "m", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "FPSNPMMW", name = "n", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "FPSNPMMW", name = "g", descriptor = "LHZCWGKOF;")
    public class24 field729;

    @OriginalMember(owner = "FPSNPMMW", name = "c", descriptor = "[LFPSNPMMW;")
    public static class17[] field725;

    @OriginalMember(owner = "FPSNPMMW", name = "a", descriptor = "(ZLXMRRKSSB;)V")
    public static void method204(boolean arg0, class60 arg1) {
        class62 var2 = new class62(arg1.method465("spotanim.dat", null), 49938);
        field724 = var2.method480();
        if (arg0) {
            return;
        }
        if (field725 == null) {
            field725 = new class17[field724];
        }
        for (int var3 = 0; var3 < field724; var3++) {
            if (field725[var3] == null) {
                field725[var3] = new class17();
            }
            field725[var3].field726 = var3;
            field725[var3].method205(var2, 168);
        }
    }

    @OriginalMember(owner = "FPSNPMMW", name = "a", descriptor = "(LXQPFGONL;I)V")
    public void method205(class62 arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method478();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field727 = arg0.method480();
                } else if (var4 == 2) {
                    this.field728 = arg0.method480();
                    if (class24.field813 != null) {
                        this.field729 = class24.field813[this.field728];
                    }
                } else if (var4 == 4) {
                    this.field732 = arg0.method480();
                } else if (var4 == 5) {
                    this.field733 = arg0.method480();
                } else if (var4 == 6) {
                    this.field734 = arg0.method480();
                } else if (var4 == 7) {
                    this.field735 = arg0.method478();
                } else if (var4 == 8) {
                    this.field736 = arg0.method478();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field730[var4 - 40] = arg0.method480();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field731[var4 - 50] = arg0.method480();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "FPSNPMMW", name = "a", descriptor = "()LITSMSHJO;")
    public class27 method206() {
        class27 var1 = (class27) field737.method220((long) this.field726);
        if (var1 != null) {
            return var1;
        }
        class27 var2 = class27.method238((byte) -10, this.field727);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field730[0] != 0) {
                var2.method252(this.field730[var3], this.field731[var3]);
            }
        }
        field737.method221((long) this.field726, this.field723, var2);
        return var2;
    }
}
