import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class148 {

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "B")
    private byte field2092;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Lbj;")
    public static class131 field2091 = new class131(64);

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Z")
    public static boolean field2094 = false;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I", line = 10)
    public final int method998(int arg0) {
        if (arg0 == 7) {
            field2090++;
            return this.field2092 & 0x7;
        } else {
            return -92;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I", line = 22)
    public final int method999(byte arg0) {
        field2097++;
        int var2 = 27 / ((arg0 - 72) / 43);
        return (this.field2092 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V", line = 33)
    public static void method1000(byte arg0) {
        field2091 = null;
        if (arg0 != 101) {
            field2091 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)I", line = 50)
    public static final int method1001(int arg0, int arg1, int arg2) {
        field2098++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (arg2 != 7) {
            field2091 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V", line = 75)
    public static final void method1002(int arg0) {
        class278.field3900 = null;
        class61.field846 = null;
        class89.field1241 = null;
        class366.field5158 = null;
        class239.field3413 = null;
        class452.field6309 = null;
        if (arg0 != -8) {
            return;
        }
        class279.field3915 = null;
        class22.field395 = null;
        class366.field5159 = null;
        class51.field711 = null;
        class159.field2234 = null;
        class144.field2061 = null;
        class65.field971 = null;
        class447.field6273 = null;
        class222.field3103 = null;
        class292.field4083 = null;
        class74.field1066 = null;
        field2095++;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 110)
    public class148() {
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lkh;)V", line = 112)
    public class148(class11 arg0) {
        this.field2092 = arg0.method162(-4436);
        this.field2100 = arg0.method174(255);
        this.field2102 = arg0.method185(25239);
        this.field2101 = arg0.method185(25239);
        this.field2093 = arg0.method185(25239);
        this.field2099 = arg0.method185(25239);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Lel;", line = 125)
    public static final class326 method1003(int arg0, int arg1) {
        field2096++;
        class326 var2 = (class326) class7.field102.method2637((long) arg1, 18620);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class190.field2617.method1745(arg1, (byte) -101, 5);
        class326 var4 = new class326();
        if (arg0 != 0) {
            method1000((byte) -93);
        }
        if (var3 != null) {
            var4.method2093(new class11(var3), -1);
        }
        class7.field102.method2633((byte) -120, var4, (long) arg1);
        return var4;
    }
}
