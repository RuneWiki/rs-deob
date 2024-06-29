import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class259 {

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public int field3600 = 0;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public int field3606 = 0;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lnj;")
    private class162 field3603 = new class162(64);

    @OriginalMember(owner = "client!es", name = "m", descriptor = "Ldt;")
    private class159 field3611 = null;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "Lmg;")
    private class101 field3607;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "Lmg;")
    private class101 field3599;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "[C")
    public static char[] field3610 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3609;

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(ILmg;Lmg;Ldt;)V", line = 153)
    public class259(int arg0, class101 arg1, class101 arg2, class159 arg3) {
        this.field3607 = arg1;
        this.field3611 = arg3;
        this.field3599 = arg2;
        if (this.field3607 != null) {
            this.field3606 = this.field3607.method753(1, -56);
        }
        if (this.field3599 != null) {
            this.field3600 = this.field3599.method753(1, -107);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(J[ILkl;B)Ljava/lang/String;", line = 10)
    public final String method1559(long arg0, int[] arg1, class55 arg2, byte arg3) {
        field3601++;
        if (this.field3611 != null) {
            String var6 = this.field3611.method1052(arg2, false, arg0, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg3 > -126) {
            method1562(50);
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)Lni;", line = 30)
    public final class361 method1560(int arg0, int arg1) {
        field3608++;
        class361 var3 = (class361) this.field3603.method1073((long) arg0, false);
        if (var3 != null) {
            return var3;
        }
        if (arg1 != -2621) {
            this.method1559(-32L, null, null, (byte) -111);
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field3599.method727(arg0 & 0x7FFF, 1, arg1 ^ 0xA4B);
        } else {
            var4 = this.field3607.method727(arg0, 1, 79);
        }
        class361 var5 = new class361();
        var5.field5275 = this;
        if (var4 != null) {
            var5.method2166(new class391(var4), -117);
        }
        if (arg0 >= 32768) {
            var5.method2170(-1);
        }
        this.field3603.method1072((long) arg0, var5, false);
        return var5;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II)Lkl;", line = 63)
    public static final class55 method1561(int arg0, int arg1) {
        if (arg0 != -15188) {
            field3610 = null;
        }
        field3604++;
        class55[] var2 = class282.method1676(-21924);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field655 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 99)
    public static void method1562(int arg0) {
        field3609 = null;
        int var1 = 115 % ((-arg0 - 50) / 61);
        field3610 = null;
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(II)V", line = 116)
    public static final void method1563(int arg0, int arg1) {
        field3602++;
        if (!class256.method1534(32554, arg1)) {
            return;
        }
        class150[] var2 = class495.field7226[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class150 var4 = var2[var3];
            if (var4 != null) {
                var4.field2240 = 0;
                var4.field2281 = 1;
                var4.field2267 = 0;
            }
        }
    }
}
