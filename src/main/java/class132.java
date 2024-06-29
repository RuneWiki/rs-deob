import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class132 extends class260 {

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "Ltja;")
    public static class288 field1950 = new class288(3, 4);

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "[C")
    private static char[] field1958 = new char[64];

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "Ljw;")
    public static class581 field1959;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "Leba;")
    public static class615 field1949;

    static {
        for (int var0 = 0; var0 < 26; ++var0) {
            field1958[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; ~var1 > -53; ++var1) {
            field1958[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; ++var2) {
            field1958[var2] = (char) (var2 + -4);
        }
        field1958[63] = '/';
        field1958[62] = '+';
        field1959 = new class581(59, 1);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V", line = 4)
    public final void method2(boolean arg0) {
        if (!arg0) {
            ++field1952;
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)I", line = 15)
    public static final int method1050(int arg0, int arg1) {
        return class767.field10581 != null ? class767.field10581[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I", line = 19)
    public final int method1051(int arg0) {
        ++field1957;
        if (arg0 < 3) {
            field1958 = null;
        }
        return super.field3868;
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V", line = 30)
    public static final void method1052(int arg0) {
        ++field1954;
        class455 var1 = null;
        if (arg0 != 4) {
            method1050(-66, -25);
        }
        try {
            class615 var2 = class730.field10124.method617((byte) 120, "2", true);
            while (var2.field8321 == 0) {
                class438.method2636(true, 1L);
            }
            if (~var2.field8321 == -2) {
                var1 = (class455) var2.field8318;
                byte[] var3 = new byte[(int) var1.method2698(arg0 ^ -38)];
                int var5;
                for (int var4 = 0; ~var3.length < ~var4; var4 += var5) {
                    var5 = var1.method2703(var4, var3, var3.length - var4, (byte) -82);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class109.method826(arg0, new class376(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2702(-1);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V", line = 81)
    public static void method1053(int arg0) {
        field1958 = null;
        if (arg0 != 10399) {
            method1054(56, -1);
        }
        field1959 = null;
        field1950 = null;
        field1949 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)I", line = 97)
    public final int method4(int arg0, byte arg1) {
        ++field1955;
        int var3 = 117 % ((-53 - arg1) / 50);
        return 3;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(IB)V", line = 108)
    public final void method9(int arg0, byte arg1) {
        ++field1951;
        if (arg1 != -107) {
            method1053(37);
        }
        super.field3868 = arg0;
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(II)I", line = 119)
    public static final int method1054(int arg0, int arg1) {
        if (arg1 != 0) {
            method1053(-99);
        }
        ++field1953;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(ILfca;)V", line = 136)
    public class132(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)I", line = 140)
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            return 32;
        } else {
            ++field1956;
            return super.field3867.method740((byte) -116) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lfca;)V", line = 162)
    public class132(class92 arg0) {
        super(arg0);
    }
}
