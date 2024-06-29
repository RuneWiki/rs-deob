import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class428 {

    @OriginalMember(owner = "client!et", name = "b", descriptor = "Luh;")
    private class114 field6491 = new class114();

    @OriginalMember(owner = "client!et", name = "f", descriptor = "[I")
    public static int[] field6495 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!et", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field6500 = new String[8];

    @OriginalMember(owner = "client!et", name = "j", descriptor = "Lla;")
    public static class319 field6499 = new class319(73, 7);

    @OriginalMember(owner = "client!et", name = "m", descriptor = "[I")
    public static int[] field6502 = new int[16384];

    @OriginalMember(owner = "client!et", name = "l", descriptor = "[I")
    public static int[] field6501 = new int[16384];

    @OriginalMember(owner = "client!et", name = "p", descriptor = "[I")
    public static int[] field6505;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "Luh;")
    private class114 field6503;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6502[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field6501[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field6505 = new int[8];
        field6506 = 0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BII)V", line = 4)
    public static final void method2609(byte arg0, int arg1, int arg2) {
        field6490++;
        class486 var3 = class515.field7568[arg2][arg1];
        if (var3 != null) {
            class459.field6882 = var3.field7197;
            class511.field7509 = var3.field7201;
            class49.field703 = var3.field7190;
        }
        class466.method2801((byte) 55);
        if (arg0 != -128) {
            method2610(-65);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V", line = 24)
    public static void method2610(int arg0) {
        field6499 = null;
        if (arg0 != -11117) {
            return;
        }
        field6505 = null;
        field6502 = null;
        field6501 = null;
        field6495 = null;
        field6500 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Luh;", line = 42)
    public final class114 method2611(byte arg0) {
        if (arg0 < 31) {
            this.method2611((byte) -75);
        }
        field6497++;
        class114 var2 = this.field6491.field1580;
        if (this.field6491 == var2) {
            this.field6503 = null;
            return null;
        } else {
            this.field6503 = var2.field1580;
            return var2;
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)Luh;", line = 66)
    public final class114 method2612(int arg0) {
        if (arg0 != -6261) {
            return null;
        }
        field6498++;
        class114 var2 = this.field6491.field1580;
        if (this.field6491 == var2) {
            return null;
        } else {
            var2.method705(6511);
            return var2;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILuh;)V", line = 86)
    public final void method2613(int arg0, class114 arg1) {
        field6494++;
        if (arg1.field1582 != null) {
            arg1.method705(arg0 ^ 0x196C);
        }
        arg1.field1580 = this.field6491;
        arg1.field1582 = this.field6491.field1582;
        arg1.field1582.field1580 = arg1;
        if (arg0 != 3) {
            this.field6491 = null;
        }
        arg1.field1580.field1582 = arg1;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V", line = 104)
    public final void method2614(boolean arg0) {
        field6496++;
        while (true) {
            class114 var2 = this.field6491.field1580;
            if (this.field6491 == var2) {
                if (arg0) {
                    return;
                } else {
                    this.field6503 = null;
                    return;
                }
            }
            var2.method705(6511);
        }
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Luh;", line = 126)
    public final class114 method2615(int arg0) {
        field6492++;
        class114 var2 = this.field6503;
        if (this.field6491 == var2) {
            this.field6503 = null;
            return null;
        } else if (arg0 == -13153) {
            this.field6503 = var2.field1580;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)I", line = 156)
    public final int method2616(int arg0) {
        field6493++;
        int var2 = arg0;
        class114 var3 = this.field6491.field1580;
        while (this.field6491 != var3) {
            var3 = var3.field1580;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V", line = 196)
    public class428() {
        this.field6491.field1582 = this.field6491;
        this.field6491.field1580 = this.field6491;
    }
}
