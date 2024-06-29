import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class503 {

    @OriginalMember(owner = "client!et", name = "c", descriptor = "Lfr;")
    private class231 field7340 = new class231(64);

    @OriginalMember(owner = "client!et", name = "e", descriptor = "Lqs;")
    private class496 field7342;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "Lqs;")
    private class496 field7346;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Lpu;")
    public static class411 field7344 = new class411();

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "Ldc;")
    public static class235 field7338;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "[[B")
    public static byte[][] field7345;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2969(byte arg0) {
        field7341++;
        if (class13.method70(1001, class32.field515) || class7.method48((byte) -112, class32.field515)) {
            client.method461(5000, -1, class473.field7021 >> 10, class48.field764 >> 10);
        } else {
            int var1 = class302.field4850.field3159[0] >> 3;
            int var2 = class302.field4850.field3158[0] >> 3;
            if (var1 >= 0 && (class217.field3775 >> 3) > var1 && var2 >= 0 && (class277.field4548 >> 3) > var2) {
                client.method461(5000, -1, var1, var2);
            } else {
                client.method461(0, -1, class217.field3775 >> 4, class277.field4548 >> 4);
            }
        }
        class289.method1875(-90);
        class282.method1845((byte) -98);
        class319.method2021(255);
        class328.method2070(-257);
        if (arg0 < 1) {
            method2969((byte) -100);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I[S[Ljava/lang/String;)V", line = 36)
    public static final void method2970(int arg0, short[] arg1, String[] arg2) {
        field7343++;
        class86.method615(arg2.length - 1, arg2, true, 0, arg1);
        if (arg0 != 357232963) {
            method2970(-35, null, null);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Lcr;", line = 62)
    public final class121 method2971(int arg0, int arg1) {
        field7339++;
        class121 var3 = (class121) this.field7340.method1593((byte) 111, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field7342.method2926(arg1, -123, 0);
        } else {
            var4 = this.field7346.method2926(arg1 & 0x7FFF, -84, 0);
        }
        class121 var5 = new class121();
        if (var4 != null) {
            var5.method951(-1, new class23(var4));
        }
        if (arg0 != 5000) {
            method2969((byte) -106);
        }
        if (arg1 >= 32768) {
            var5.method955(-110);
        }
        this.field7340.method1595(var5, (long) arg1, (byte) -128);
        return var5;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V", line = 98)
    public static void method2972(int arg0) {
        if (arg0 <= 79) {
            field7338 = null;
        }
        field7338 = null;
        field7345 = null;
        field7344 = null;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(ILqs;Lqs;)V", line = 122)
    public class503(int arg0, class496 arg1, class496 arg2) {
        this.field7342 = arg1;
        this.field7346 = arg2;
        if (this.field7342 != null) {
            this.field7342.method2940(0, -10511);
        }
        if (this.field7346 != null) {
            this.field7346.method2940(0, -10511);
        }
    }
}
