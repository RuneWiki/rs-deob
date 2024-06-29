import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class129 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2153 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "[I")
    public static int[] field2154 = new int[14];

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2155 = 0;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method975(int arg0) {
        field2154 = null;
        field2153 = null;
        int var1 = -82 / ((58 - arg0) / 48);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method976(int arg0, String arg1) {
        field2157++;
        if (arg0 < 77) {
            method977(-89, -27);
        }
        return class33.method209((byte) -26, 10, arg1, true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Lkm;")
    public static final class144 method977(int arg0, int arg1) {
        class144 var2 = (class144) class65.field976.method2099((byte) 125, (long) arg1);
        field2156++;
        if (arg0 != -8467) {
            field2155 = -99;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class135.field2204.method1868(arg1, 5, 1);
        class144 var4 = new class144();
        if (var3 != null) {
            var4.method1077(true, new class53(var3));
        }
        class65.field976.method2103(var4, -1, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)I")
    public static final int method978(byte arg0) {
        if (arg0 == -45) {
            field2152++;
            return 2;
        } else {
            return 71;
        }
    }
}
