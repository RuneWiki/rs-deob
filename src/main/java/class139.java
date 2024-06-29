import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class139 {

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public int field2264 = 0;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Lpi;")
    public static class201 field2259 = new class201(64);

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field2267 = 0;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2265 = "scroll:";

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Lbl;")
    public static final class272 method1047(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class272 var4 = var3.field5023;
            var3.field5023 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lhc;BI)V")
    private final void method1048(class53 arg0, byte arg1, int arg2) {
        if (arg2 == 5) {
            this.field2264 = arg0.method331(-107);
        }
        field2261++;
        int var4 = 3 % ((-arg1 - 25) / 59);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Lqk;")
    public static final class8 method1049(int arg0, int arg1) {
        field2260++;
        class8 var2 = (class8) class268.field4311.method1418((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class106.field1813.method1868(arg1, 3, 1);
        class8 var4 = new class8();
        if (arg0 >= -16) {
            method1049(106, -87);
        }
        if (var3 != null) {
            var4.method49((byte) 113, new class53(var3));
        }
        class268.field4311.method1421((long) arg1, var4, (byte) 59);
        return var4;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method1050(int arg0) {
        field2259 = null;
        if (arg0 == 5) {
            field2265 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lhc;Z)V")
    public final void method1051(class53 arg0, boolean arg1) {
        field2262++;
        if (!arg1) {
            this.method1051((class53) null, false);
        }
        while (true) {
            int var3 = arg0.method366(-16505);
            if (var3 == 0) {
                return;
            }
            this.method1048(arg0, (byte) 86, var3);
        }
    }
}
