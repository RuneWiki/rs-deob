import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class313 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
    public static int[] field5012 = new int[14];

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field5015 = 0;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5019 = " has logged in.";

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field5022 = 0;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5021 = "glow2:";

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field5023 = 0;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field5020 = 500;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
    public static int[] field5014;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2098(String arg0, byte arg1) {
        int var2 = -109 / ((-arg1 - 80) / 45);
        field5017++;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Lrh;")
    public static final class129 method2099(int arg0, int arg1) {
        field5018++;
        if (arg1 != 30085) {
            return null;
        }
        class129 var2 = (class129) class166.field2560.method1517((long) arg0, (byte) 107);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class118.field1708.method501(-2, arg0, 1);
        class129 var4 = new class129();
        var4.field1849 = arg0;
        if (var3 != null) {
            var4.method830(new class170(var3), (byte) 101);
        }
        var4.method827(-3);
        if (var4.field1857 == 2 && class144.field2149.method1064(-1, (long) arg0) == null) {
            class144.field2149.method1054(arg1 - 33595, new class178(class261.field4243), (long) arg0);
            class273.field4434[class261.field4243++] = var4;
        }
        class166.field2560.method1518(var4, (long) arg0, (byte) 75);
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lid;Lid;I)V")
    public static final void method2100(class247 arg0, class247 arg1, int arg2) {
        field5013++;
        if (arg0.field4017 != null) {
            arg0.method1764(arg2 + 64);
        }
        arg0.field4017 = arg1.field4017;
        if (arg2 != 0) {
            method2102((byte) 10);
        }
        arg0.field4013 = arg1;
        arg0.field4017.field4013 = arg0;
        arg0.field4013.field4017 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
    public static final void method2101(int arg0, boolean arg1) {
        field5016++;
        client.field3874.method1514(arg0, (byte) -55);
        if (!arg1) {
            field5019 = null;
        }
        class282.field4583.method1514(arg0, (byte) -55);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method2102(byte arg0) {
        field5012 = null;
        if (arg0 == 121) {
            field5014 = null;
            field5019 = null;
            field5021 = null;
        }
    }
}
