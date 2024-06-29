import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class64 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lo;")
    public class227 field998 = new class227();

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "[I")
    public static int[] field999 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Z")
    public static boolean field1001 = true;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Lul;")
    public static class51 field1009 = new class51(30);

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Lo;")
    private class227 field1010;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1004;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "[[I")
    public static int[][] field1007;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 7)
    public static void method602(int arg0) {
        field999 = null;
        if (arg0 == -2282) {
            field1004 = null;
            field1009 = null;
            field1007 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 261)
    public class64() {
        this.field998.field3817 = this.field998;
        this.field998.field3821 = this.field998;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILo;)V", line = 33)
    public final void method603(int arg0, class227 arg1) {
        field1003++;
        if (arg1.field3821 != null) {
            arg1.method1650((byte) -72);
        }
        arg1.field3821 = this.field998.field3821;
        arg1.field3817 = this.field998;
        arg1.field3821.field3817 = arg1;
        if (arg0 != 17354) {
            field1009 = (class51) null;
        }
        arg1.field3817.field3821 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)Lo;", line = 53)
    public final class227 method604(int arg0) {
        field1002++;
        class227 var2 = this.field998.field3817;
        if (this.field998 == var2) {
            this.field1010 = null;
            return null;
        } else {
            int var3 = -58 / ((67 - arg0) / 38);
            this.field1010 = var2.field3817;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZII)I", line = 78)
    public static final int method605(int arg0, boolean arg1, int arg2, int arg3) {
        field1011++;
        if (!arg1) {
            method605(19, false, -64, -37);
        }
        if ((class152.field2683[arg2][arg3][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (class152.field2683[1][arg3][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)Lo;", line = 98)
    public final class227 method606(int arg0) {
        class227 var2 = this.field1010;
        field1000++;
        if (this.field998 == var2) {
            this.field1010 = null;
            return null;
        }
        this.field1010 = var2.field3817;
        if (arg0 != 8364) {
            this.field998 = (class227) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V", line = 122)
    public static final void method607(int arg0) {
        int var1 = class177.field3014.method2223(class5.field74);
        field1005++;
        int var2 = 0;
        if (arg0 >= -57) {
            method608((char) 65464, true);
        }
        while (var2 < class293.field4708) {
            int var3 = class177.field3014.method2223(class352.method2453(var2, 27884));
            if (var3 > var1) {
                var1 = var3;
            }
            var2++;
        }
        var1 += 8;
        int var4 = class172.field2980 - (var1 / 2);
        int var5 = class293.field4708 * 15 + 21;
        if (var1 + var4 > class313.field4973) {
            var4 = class313.field4973 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var6 = class67.field1087;
        if (class188.field3152 < (var5 + var6)) {
            var6 = class188.field3152 - var5;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class17.field267 == 1) {
            if (class70.field1151 == class172.field2980 && class67.field1087 == class127.field2198) {
                class292.field4678 = (class177.field3007 ? 26 : 22) + class293.field4708 * 15;
                class68.field1114 = var1;
                class213.field3590 = var4;
                class17.field267 = 0;
                class207.field3515 = true;
                class42.field621 = var6;
            }
        } else if (class218.field3635 == class172.field2980 && class67.field1087 == class226.field3812) {
            class17.field267 = 0;
            class292.field4678 = (class177.field3007 ? 26 : 22) + class293.field4708 * 15;
            class213.field3590 = var4;
            class68.field1114 = var1;
            class42.field621 = var6;
            class207.field3515 = true;
        } else {
            class17.field267 = 1;
            class70.field1151 = class218.field3635;
            class127.field2198 = class226.field3812;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(CZ)Z", line = 216)
    public static final boolean method608(char arg0, boolean arg1) {
        field1008++;
        if (!arg1) {
            return true;
        } else if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V", line = 243)
    public final void method609(int arg0) {
        while (true) {
            class227 var2 = this.field998.field3817;
            if (this.field998 == var2) {
                this.field1010 = null;
                if (arg0 != 144) {
                    method605(-97, false, -2, -49);
                }
                field1006++;
                return;
            }
            var2.method1650((byte) -116);
        }
    }
}
