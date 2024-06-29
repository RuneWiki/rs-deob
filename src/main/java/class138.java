import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class138 extends class320 {

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field2290 = 0;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public int field2282;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public int field2293;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "Ljava/lang/String;")
    public String field2291;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "[Lak;")
    public static class182[] field2284;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "[Lkk;")
    public static class77[] field2289;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 11)
    public static final void method1147(String arg0, byte arg1) {
        field2292++;
        if (arg1 >= -9) {
            field2290 = -33;
        }
        if (class13.field191 != null) {
            class82.field1191++;
            class99.field1491.method1628((byte) -16, 171);
            class99.field1491.method273(0, class34.method354(arg0, (byte) 51));
            class99.field1491.method280(-18345, arg0);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method1148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 > -52) {
            return;
        }
        if (class317.field4884 == 1) {
            class324.field4983[class321.field4943 / 100].method17(class315.field4867 - 8, class204.field3155 + -8);
        }
        if (class317.field4884 == 2) {
            class324.field4983[(class321.field4943 / 100) + 4].method17(class315.field4867 - 8, class204.field3155 - 8);
        }
        class245.method1847((byte) 75);
        field2294++;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)I", line = 51)
    public static final int method1149(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)I", line = 66)
    public final int method1150(int arg0) {
        if (arg0 != 255) {
            field2289 = (class77[]) null;
        }
        field2286++;
        return (int) (this.field2734 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)J", line = 83)
    public final long method1151(int arg0) {
        if (arg0 != -19430) {
            this.method1151(9);
        }
        field2283++;
        return this.field4932 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V", line = 102)
    public final void method1152(int arg0) {
        field2288++;
        this.field4932 = class156.method1273((byte) -61) + 500L | Long.MIN_VALUE & this.field4932;
        if (arg0 < 123) {
            field2290 = 55;
        }
        class104.field1554.method438(true, this);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V", line = 114)
    public final void method1153(byte arg0) {
        if (arg0 != 50) {
            method1148(12, 114, -124, 47, 32);
        }
        this.field4932 |= Long.MIN_VALUE;
        field2285++;
        if (this.method1151(-19430) == 0L) {
            class158.field2531.method438(true, this);
        }
    }

    @OriginalMember(owner = "client!e", name = "i", descriptor = "(I)I", line = 128)
    public final int method1154(int arg0) {
        if (arg0 == -3) {
            field2281++;
            return (int) this.field2734;
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(II)V", line = 138)
    public class138(int arg0, int arg1) {
        this.field2734 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!e", name = "j", descriptor = "(I)V", line = 147)
    public static void method1155(int arg0) {
        field2284 = null;
        if (arg0 >= 1) {
            field2289 = null;
        }
    }
}
