import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class258 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "J")
    public long field4076 = 0L;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "Z")
    public static boolean field4086 = false;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Lmi;")
    public static class227 field4074 = new class227(16);

    @OriginalMember(owner = "client!el", name = "t", descriptor = "[I")
    public static int[] field4090 = new int[5];

    @OriginalMember(owner = "client!el", name = "s", descriptor = "Lmi;")
    public static class227 field4089 = new class227(128);

    @OriginalMember(owner = "client!el", name = "w", descriptor = "Z")
    public static boolean field4093 = false;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "[J")
    public static long[] field4095 = new long[500];

    @OriginalMember(owner = "client!el", name = "v", descriptor = "Lmi;")
    public static class227 field4092 = new class227(64);

    @OriginalMember(owner = "client!el", name = "A", descriptor = "Z")
    public static boolean field4097 = false;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public int field4075;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public int field4077;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public int field4078;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public int field4080;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public int field4081;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public int field4082;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public int field4085;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Lkm;")
    public class162 field4071;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "[I")
    public static int[] field4091;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 8)
    public static void method1824(byte arg0) {
        field4095 = null;
        if (arg0 != -13) {
            method1826((class221) null, -81, 110);
        }
        field4089 = null;
        field4092 = null;
        field4091 = null;
        field4090 = null;
        field4074 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmj;", line = 25)
    public static final class315 method1825(Throwable arg0, String arg1) {
        field4072++;
        class315 var2;
        if ((arg0 instanceof class315)) {
            var2 = (class315) arg0;
            var2.field5196 = var2.field5196 + ' ' + arg1;
        } else {
            var2 = new class315(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lnm;II)Lad;", line = 48)
    public static final class197 method1826(class221 arg0, int arg1, int arg2) {
        field4088++;
        if (arg2 == 28291) {
            byte[] var3 = arg0.method1513(arg1, true);
            return var3 == null ? null : new class197(var3);
        } else {
            return (class197) null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZ)V", line = 70)
    public static final void method1827(int arg0, boolean arg1) {
        for (class250 var2 = (class250) class250.field3988.method1081(9); var2 != null; var2 = (class250) class250.field3988.method1083((byte) 113)) {
            if (var2.field3983 != null) {
                class28.field434.method1412(var2.field3983);
                var2.field3983 = null;
            }
            if (var2.field3985 != null) {
                class28.field434.method1412(var2.field3985);
                var2.field3985 = null;
            }
            var2.method1131(8);
        }
        field4079++;
        if (arg1) {
            for (class250 var3 = (class250) class49.field701.method1081(arg0 - 82); var3 != null; var3 = (class250) class49.field701.method1083((byte) 113)) {
                if (var3.field3983 != null) {
                    class28.field434.method1412(var3.field3983);
                    var3.field3983 = null;
                }
                var3.method1131(arg0 ^ 0xD);
            }
            for (class250 var4 = (class250) class109.field1586.method27(127); var4 != null; var4 = (class250) class109.field1586.method34(arg0 ^ 0xD)) {
                if (var4.field3983 != null) {
                    class28.field434.method1412(var4.field3983);
                    var4.field3983 = null;
                }
                var4.method1131(arg0 + 3);
            }
        }
        if (arg0 != 5) {
            method1825((Throwable) null, (String) null);
        }
    }
}
