import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class126 extends class525 {

    @OriginalMember(owner = "client!ov", name = "M", descriptor = "I")
    public static int field1982 = 0;

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "Lqt;")
    public static class459 field1970 = new class459(54, 3);

    @OriginalMember(owner = "client!ov", name = "O", descriptor = "Lge;")
    public static class511 field1984 = new class511(10);

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ov", name = "C", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ov", name = "G", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ov", name = "H", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ov", name = "I", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ov", name = "J", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ov", name = "N", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ov", name = "Q", descriptor = "Lqv;")
    public static class316 field1986;

    @OriginalMember(owner = "client!ov", name = "P", descriptor = "Ljava/lang/Object;")
    public static Object field1985;

    @OriginalMember(owner = "client!ov", name = "D", descriptor = "Ljava/lang/String;")
    public String field1973;

    @OriginalMember(owner = "client!ov", name = "E", descriptor = "[C")
    public char[] field1974;

    @OriginalMember(owner = "client!ov", name = "K", descriptor = "[C")
    public char[] field1980;

    @OriginalMember(owner = "client!ov", name = "F", descriptor = "[I")
    public int[] field1975;

    @OriginalMember(owner = "client!ov", name = "L", descriptor = "[I")
    public int[] field1981;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(CB)I")
    public final int method932(char arg0, byte arg1) {
        field1979++;
        if (this.field1981 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1981.length; var3++) {
            if (this.field1980[var3] == arg0) {
                return this.field1981[var3];
            }
        }
        if (arg1 != 45) {
            this.method933(null, 31);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lwn;I)V")
    public final void method933(class519 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3072((byte) -124);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.field1973 = null;
                }
                field1972++;
                return;
            }
            this.method934(var3, arg0, (byte) -36);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILwn;B)V")
    private final void method934(int arg0, class519 arg1, byte arg2) {
        if (arg2 != -36) {
            return;
        }
        field1983++;
        if (arg0 == 1) {
            this.field1973 = arg1.method3082((byte) 21);
        } else if (arg0 == 2) {
            int var7 = arg1.method3072((byte) -123);
            this.field1980 = new char[var7];
            this.field1981 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1981[var8] = arg1.method3018(566990904);
                byte var9 = arg1.method3034((byte) 96);
                this.field1980[var8] = var9 == 0 ? 0 : class221.method1501(var9, -23667);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method3072((byte) -127);
            this.field1975 = new int[var4];
            this.field1974 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1975[var5] = arg1.method3018(class288.method1845(arg2, -566990876));
                byte var6 = arg1.method3034((byte) 81);
                this.field1974[var5] = var6 == 0 ? 0 : class221.method1501(var6, -23667);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(IB)I")
    public static final int method935(int arg0, byte arg1) {
        field1978++;
        return arg1 == 86 ? arg0 & 0x7F : 78;
    }

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "(B)V")
    public final void method936(byte arg0) {
        if (this.field1975 != null) {
            for (int var2 = 0; var2 < this.field1975.length; var2++) {
                this.field1975[var2] = class442.method2600(this.field1975[var2], 32768);
            }
        }
        field1971++;
        if (arg0 >= -12) {
            method937(false, null, false, false);
        }
        if (this.field1981 != null) {
            for (int var3 = 0; var3 < this.field1981.length; var3++) {
                this.field1981[var3] = class442.method2600(this.field1981[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZLsw;ZZ)V")
    public static final void method937(boolean arg0, class541 arg1, boolean arg2, boolean arg3) {
        field1977++;
        int var4 = arg1.field7955;
        int var5 = (int) arg1.field863;
        arg1.method421(22071);
        if (arg2) {
            class409.method2430(var4, 106);
        }
        class472.method2800(var4, (byte) -76);
        class198 var6 = class154.method1087(var5, 2);
        if (var6 != null) {
            class284.method1832(-17067, var6);
        }
        class194.method1318(8);
        if (!arg0) {
            method938((byte) 6);
        }
        if (!arg3 && class188.field2765 != -1) {
            class504.method2943(class188.field2765, (byte) -39, 1);
        }
        class239 var7 = new class239(class220.field3370);
        for (class541 var8 = (class541) var7.method1580(!arg0); var8 != null; var8 = (class541) var7.method1582(true)) {
            if (!var8.method416((byte) -70)) {
                var8 = (class541) var7.method1580(false);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field7956 == 3) {
                int var9 = (int) var8.field863;
                if (var9 >>> 16 == var4) {
                    method937(arg0, var8, true, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "(B)V")
    public static void method938(byte arg0) {
        field1984 = null;
        field1986 = null;
        if (arg0 == -52) {
            field1985 = null;
            field1970 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IC)I")
    public final int method939(int arg0, char arg1) {
        field1976++;
        if (this.field1975 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 < 93) {
            this.method932('m', (byte) 75);
        }
        while (this.field1975.length > var3) {
            if (this.field1974[var3] == arg1) {
                return this.field1975[var3];
            }
            var3++;
        }
        return -1;
    }
}
