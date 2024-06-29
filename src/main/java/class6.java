import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 {

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Llc;")
    public static class86 field48 = new class86(64);

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field54 = -1;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field52 = "Loading fonts - ";

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field56 = "scroll:";

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Lhc;")
    public static class235 field49;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static final void method34(int arg0) {
        if (arg0 != -3) {
            return;
        }
        field45++;
        if (class240.field3666 == 0) {
            return;
        }
        try {
            if ((++class226.field3430) > 1500) {
                if (class290.field4567 != null) {
                    class290.field4567.method1958(arg0 + 5003);
                    class290.field4567 = null;
                }
                if (class217.field3275 >= 1) {
                    class240.field3666 = 0;
                    class274.field4241 = -5;
                    return;
                }
                class217.field3275++;
                if (class251.field3835 == class140.field1951) {
                    class251.field3835 = class43.field646;
                } else {
                    class251.field3835 = class140.field1951;
                }
                class226.field3430 = 0;
                class240.field3666 = 1;
            }
            if (class240.field3666 == 1) {
                class32.field498 = class200.field2784.method1637(class251.field3835, false, class141.field1960);
                class240.field3666 = 2;
            }
            if (class240.field3666 == 2) {
                if (class32.field498.field1663 == 2) {
                    throw new IOException();
                }
                if (class32.field498.field1663 != 1) {
                    return;
                }
                class290.field4567 = new class293((Socket) class32.field498.field1665, class200.field2784);
                class32.field498 = null;
                class290.field4567.method1967(class281.field4359.field3336, 0, class281.field4359.field3402, 0);
                if (class139.field1933 != null) {
                    class139.field1933.method857((byte) -36);
                }
                if (class234.field3537 != null) {
                    class234.field3537.method857((byte) -36);
                }
                int var1 = class290.field4567.method1959(-126);
                if (class139.field1933 != null) {
                    class139.field1933.method857((byte) -36);
                }
                if (class234.field3537 != null) {
                    class234.field3537.method857((byte) -36);
                }
                if (var1 != 101) {
                    class240.field3666 = 0;
                    class274.field4241 = var1;
                    class290.field4567.method1958(arg0 ^ 0xFFFFEC75);
                    class290.field4567 = null;
                    return;
                }
                class240.field3666 = 3;
            }
            if (class240.field3666 == 3 && class290.field4567.method1960(arg0 ^ 0x2) >= 2) {
                int var2 = class290.field4567.method1959(-106) << 8 | class290.field4567.method1959(-128);
                class30.method197((byte) -114, var2);
                if (class13.field130 == -1) {
                    class240.field3666 = 0;
                    class274.field4241 = 6;
                    class290.field4567.method1958(arg0 ^ 0xFFFFEC75);
                    class290.field4567 = null;
                } else {
                    class240.field3666 = 0;
                    class290.field4567.method1958(5000);
                    class290.field4567 = null;
                    class132.method899(6266);
                }
            }
        } catch (IOException var3) {
            if (class290.field4567 != null) {
                class290.field4567.method1958(5000);
                class290.field4567 = null;
            }
            if (class217.field3275 >= 1) {
                class274.field4241 = -4;
                class240.field3666 = 0;
            } else {
                class226.field3430 = 0;
                class217.field3275++;
                class240.field3666 = 1;
                if (class251.field3835 == class140.field1951) {
                    class251.field3835 = class43.field646;
                } else {
                    class251.field3835 = class140.field1951;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
    public static final void method35(int arg0, int arg1, int arg2) {
        class280 var3 = class181.method1180(arg0, 0, 1);
        var3.method1876(1840457248);
        int var4 = 106 / ((-arg1 - 51) / 48);
        var3.field4330 = arg2;
        field50++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)I")
    public static final int method36(int arg0, int arg1) {
        field53++;
        int var2 = -76 % ((arg1 + 13) / 35);
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)I")
    public static final int method37(int arg0, int arg1) {
        if (arg0 != 20383) {
            field52 = null;
        }
        field51++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static void method38(int arg0) {
        if (arg0 == -17994) {
            field56 = null;
            field49 = null;
            field48 = null;
            field52 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)Lpj;")
    public static final class255 method39(int arg0, int arg1) {
        field47++;
        class255 var2 = (class255) class221.field3312.method540((byte) -125, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class265.field3974.method1576(-87, arg0, arg1);
        class255 var4 = new class255();
        if (var3 != null) {
            var4.method1707(-1, arg1, new class224(var3));
        }
        class221.field3312.method543(var4, (long) arg1, 858993459);
        return var4;
    }
}
