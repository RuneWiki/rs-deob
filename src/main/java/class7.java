import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Lci;")
    private class30 field138 = new class30();

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Lm;")
    private class119 field146 = new class119();

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Llc;")
    private class112 field145;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field133 = 127;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field140 = -1;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lqc;")
    public static class162 field130;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Z")
    public static boolean field134;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "[I")
    public static int[] field132;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(JI)Lci;")
    public final class30 method46(long arg0, int arg1) {
        if (arg1 != 26580) {
            this.field144 = -53;
        }
        class30 var4 = (class30) this.field145.method677(arg1 ^ 0xFFFF92E9, arg0);
        field129++;
        if (var4 != null) {
            this.field146.method723(var4, true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Ln;")
    public final class129 method47(byte arg0) {
        field142++;
        return arg0 > -86 ? null : this.field145.method678(false);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method48(int arg0) {
        field132 = null;
        field130 = null;
        if (arg0 != -1) {
            field130 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB)V")
    public static final void method49(int arg0, int arg1, byte arg2) {
        field141++;
        int[] var3 = new int[4];
        int var4 = 1;
        int[] var5 = new int[4];
        var3[0] = arg0;
        int var6 = 31 / ((70 - arg2) / 47);
        var5[0] = arg1;
        for (int var7 = 0; var7 < 4; var7++) {
            if (class161.field3002[var7] != arg0) {
                var3[var4] = class161.field3002[var7];
                var5[var4] = class149.field2839[var7];
                var4++;
            }
        }
        class149.field2839 = var5;
        class161.field3002 = var3;
        class157.method1032(class198.field3861.length - 1, class149.field2839, (byte) 45, class198.field3861, 0, class161.field3002);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(JI)V")
    public final void method50(long arg0, int arg1) {
        field135++;
        if (arg1 != 4) {
            return;
        }
        class30 var4 = (class30) this.field145.method677(arg1 - 2759, arg0);
        if (var4 != null) {
            var4.method824((byte) -125);
            var4.method236((byte) 120);
            this.field144++;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Ln;")
    public final class129 method51(boolean arg0) {
        if (arg0) {
            field140 = -101;
        }
        field128++;
        return this.field145.method684((byte) -76);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILci;J)V")
    public final void method52(int arg0, class30 arg1, long arg2) {
        field139++;
        if (this.field144 == 0) {
            class30 var5 = this.field146.method722(116);
            var5.method824((byte) -123);
            var5.method236((byte) 120);
            if (this.field138 == var5) {
                class30 var6 = this.field146.method722(89);
                var6.method824((byte) -125);
                var6.method236((byte) 120);
            }
        } else {
            this.field144--;
        }
        this.field145.method675(arg2, arg1, false);
        this.field146.method723(arg1, true);
        if (arg0 != -3583) {
            this.field143 = -85;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public final void method53(int arg0) {
        if (arg0 != -51) {
            return;
        }
        while (true) {
            class30 var2 = this.field146.method722(arg0 + 120);
            if (var2 == null) {
                this.field144 = this.field143;
                field137++;
                return;
            }
            var2.method824((byte) -128);
            var2.method236((byte) 120);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
    public class7(int arg0) {
        int var2 = 1;
        this.field143 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field144 = arg0;
        this.field145 = new class112(var2);
    }
}
