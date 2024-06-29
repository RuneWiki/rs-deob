import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class237 {

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    private int field4004 = 0;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public int field3990;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "[Lei;")
    public class68[] field3998;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "J")
    private long field3999;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Lei;")
    private class68 field3991;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Lei;")
    private class68 field4002;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([Lei;I)I", line = 7)
    public final int method1628(class68[] arg0, int arg1) {
        int var3 = 0;
        if (arg1 < 63) {
            this.field3999 = -124L;
        }
        for (int var4 = 0; var4 < this.field3990; var4++) {
            class68 var5 = this.field3998[var4];
            for (class68 var6 = var5.field1129; var6 != var5; var6 = var6.field1129) {
                arg0[var3++] = var6;
            }
        }
        field3995++;
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 40)
    public final void method1629(int arg0) {
        field3992++;
        for (int var2 = arg0; var2 < this.field3990; var2++) {
            class68 var3 = this.field3998[var2];
            while (true) {
                class68 var4 = var3.field1129;
                if (var3 == var4) {
                    break;
                }
                var4.method499((byte) 64);
            }
        }
        this.field3991 = null;
        this.field4002 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Lei;", line = 75)
    public final class68 method1630(byte arg0) {
        if (arg0 != 56) {
            method1634((class134) null, -52, (class126) null);
        }
        field3993++;
        this.field4004 = 0;
        return this.method1632(-80);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZJ)Lei;", line = 88)
    public final class68 method1631(boolean arg0, long arg1) {
        field4003++;
        this.field3999 = arg1;
        class68 var4 = this.field3998[(int) (arg1 & (long) (this.field3990 - 1))];
        for (this.field3991 = var4.field1129; this.field3991 != var4; this.field3991 = this.field3991.field1129) {
            if (this.field3991.field1117 == arg1) {
                class68 var5 = this.field3991;
                this.field3991 = this.field3991.field1129;
                return var5;
            }
        }
        this.field3991 = null;
        if (arg0) {
            return (class68) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)Lei;", line = 118)
    public final class68 method1632(int arg0) {
        if (arg0 > -51) {
            this.method1630((byte) 6);
        }
        field4001++;
        if (this.field4004 > 0 && this.field3998[this.field4004 - 1] != this.field4002) {
            class68 var2 = this.field4002;
            this.field4002 = var2.field1129;
            return var2;
        }
        class68 var3;
        do {
            if (this.field4004 >= this.field3990) {
                return null;
            }
            var3 = this.field3998[this.field4004++].field1129;
        } while (this.field3998[this.field4004 - 1] == var3);
        this.field4002 = var3.field1129;
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)Lei;", line = 153)
    public final class68 method1633(int arg0) {
        field3997++;
        if (this.field3991 == null) {
            return null;
        }
        if (arg0 != 0) {
            this.field4004 = -102;
        }
        class68 var2 = this.field3998[(int) (this.field3999 & (long) (this.field3990 - 1))];
        while (this.field3991 != var2) {
            if (this.field3991.field1117 == this.field3999) {
                class68 var3 = this.field3991;
                this.field3991 = this.field3991.field1129;
                return var3;
            }
            this.field3991 = this.field3991.field1129;
        }
        this.field3991 = null;
        return null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lbb;ILce;)I", line = 184)
    public static final int method1634(class134 arg0, int arg1, class126 arg2) {
        field3994++;
        if (arg1 > -38) {
            field4000 = 76;
        }
        int var3 = arg0.field2299;
        arg0.method964(32768, arg2.field2140);
        arg0.field2299 += class63.field1068.method1918(arg0.field2282, arg2.field2140, arg2.field2158, arg0.field2299, 0, (byte) -118);
        return arg0.field2299 - var3;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)I", line = 210)
    public final int method1635(byte arg0) {
        int var2 = 0;
        if (arg0 <= 16) {
            this.method1628((class68[]) null, -107);
        }
        for (int var3 = 0; var3 < this.field3990; var3++) {
            class68 var4 = this.field3998[var3];
            class68 var5 = var4.field1129;
            while (var4 != var5) {
                var5 = var5.field1129;
                var2++;
            }
        }
        field3989++;
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILei;J)V", line = 245)
    public final void method1636(int arg0, class68 arg1, long arg2) {
        field3996++;
        if (arg1.field1114 != null) {
            arg1.method499((byte) 64);
        }
        class68 var5 = this.field3998[(int) (arg2 & (long) (this.field3990 - 1))];
        if (arg0 != 11311) {
            this.field4002 = (class68) null;
        }
        arg1.field1114 = var5.field1114;
        arg1.field1129 = var5;
        arg1.field1114.field1129 = arg1;
        arg1.field1117 = arg2;
        arg1.field1129.field1114 = arg1;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V", line = 265)
    public class237(int arg0) {
        this.field3990 = arg0;
        this.field3998 = new class68[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class68 var3 = this.field3998[var2] = new class68();
            var3.field1129 = var3;
            var3.field1114 = var3;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)I", line = 294)
    public final int method1637(boolean arg0) {
        if (arg0) {
            field3988++;
            return this.field3990;
        } else {
            return -83;
        }
    }
}
