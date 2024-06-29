import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class205 {

    @OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
    private int field3053 = 0;

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "[Ljd;")
    public class496[] field3046;

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public static int field3037 = 0;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "Lnj;")
    public static class487 field3049 = new class487("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    public static int field3051 = 1401;

    @OriginalMember(owner = "client!ica", name = "t", descriptor = "I")
    public static int field3055 = 1407;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "J")
    private long field3048;

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "Ljd;")
    private class496 field3052;

    @OriginalMember(owner = "client!ica", name = "s", descriptor = "Ljd;")
    private class496 field3054;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)Ljd;", line = 11)
    public final class496 method1331(int arg0) {
        field3038++;
        if (arg0 == -1925) {
            this.field3053 = 0;
            return this.method1340((byte) -104);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)V", line = 27)
    public final void method1332(int arg0) {
        for (int var2 = 0; var2 < this.field3047; var2++) {
            class496 var3 = this.field3046[var2];
            while (true) {
                class496 var4 = var3.field7469;
                if (var3 == var4) {
                    break;
                }
                var4.method2997(1);
            }
        }
        field3041++;
        if (arg0 != -22538) {
            method1339(63);
        }
        this.field3052 = null;
        this.field3054 = null;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(JZ)Ljd;", line = 60)
    public final class496 method1333(long arg0, boolean arg1) {
        this.field3048 = arg0;
        field3042++;
        class496 var4 = this.field3046[(int) ((long) (this.field3047 - 1) & arg0)];
        for (this.field3052 = var4.field7469; this.field3052 != var4; this.field3052 = this.field3052.field7469) {
            if (this.field3052.field7465 == arg0) {
                class496 var5 = this.field3052;
                this.field3052 = this.field3052.field7469;
                return var5;
            }
        }
        this.field3052 = null;
        if (arg1) {
            this.method1337(55);
        }
        return null;
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)I", line = 91)
    public final int method1334(int arg0) {
        field3040++;
        return arg0 >= -46 ? 101 : this.field3047;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "([Ljd;I)I", line = 102)
    public final int method1335(class496[] arg0, int arg1) {
        field3043++;
        int var3 = arg1;
        for (int var4 = 0; var4 < this.field3047; var4++) {
            class496 var5 = this.field3046[var4];
            for (class496 var6 = var5.field7469; var6 != var5; var6 = var6.field7469) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "(I)V", line = 136)
    public static void method1336(int arg0) {
        field3049 = null;
        if (arg0 != 0) {
            method1339(8);
        }
    }

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "(I)I", line = 150)
    public final int method1337(int arg0) {
        field3044++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field3047; var3++) {
            class496 var4 = this.field3046[var3];
            for (class496 var5 = var4.field7469; var5 != var4; var5 = var5.field7469) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "(I)Ljd;", line = 178)
    public final class496 method1338(int arg0) {
        field3036++;
        if (this.field3052 == null) {
            return null;
        }
        class496 var2 = this.field3046[(int) ((long) (this.field3047 + arg0) & this.field3048)];
        while (this.field3052 != var2) {
            if (this.field3052.field7465 == this.field3048) {
                class496 var3 = this.field3052;
                this.field3052 = this.field3052.field7469;
                return var3;
            }
            this.field3052 = this.field3052.field7469;
        }
        this.field3052 = null;
        return null;
    }

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "(I)V", line = 209)
    public static final void method1339(int arg0) {
        field3045++;
        class621.field9076.method3099(45);
        class221.field3268.field6221 = 0;
        int var1 = -127 / ((-arg0 - 53) / 59);
        class223.field3280 = 0;
        class260.field3820 = null;
        class135.field1794 = null;
        class127.field1686 = null;
        class155.field1984 = null;
        class271.field4010.field6221 = 0;
        class285.field4194 = 0;
        class206.method1346(100);
        class156.field1993 = 0;
        class127.field1684 = 0;
        class625.field9168 = null;
        class578.field8521 = 0;
        class133.field1767 = null;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)Ljd;", line = 236)
    public final class496 method1340(byte arg0) {
        field3039++;
        if (this.field3053 > 0 && this.field3046[this.field3053 - 1] != this.field3054) {
            class496 var2 = this.field3054;
            this.field3054 = var2.field7469;
            return var2;
        }
        int var3 = -41 % ((arg0 + 11) / 48);
        while (this.field3053 < this.field3047) {
            class496 var4 = this.field3046[this.field3053++].field7469;
            if (this.field3046[this.field3053 - 1] != var4) {
                this.field3054 = var4.field7469;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Ljd;BJ)V", line = 267)
    public final void method1341(class496 arg0, byte arg1, long arg2) {
        int var5 = 46 % ((arg1 + 41) / 49);
        field3050++;
        if (arg0.field7466 != null) {
            arg0.method2997(1);
        }
        class496 var6 = this.field3046[(int) (arg2 & (long) (this.field3047 - 1))];
        arg0.field7466 = var6.field7466;
        arg0.field7469 = var6;
        arg0.field7466.field7469 = arg0;
        arg0.field7465 = arg2;
        arg0.field7469.field7466 = arg0;
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(I)V", line = 290)
    public class205(int arg0) {
        this.field3046 = new class496[arg0];
        this.field3047 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class496 var3 = this.field3046[var2] = new class496();
            var3.field7469 = var3;
            var3.field7466 = var3;
        }
    }
}
