import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class175 {

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Z")
    public static boolean field2397 = true;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2395 = "";

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lnq;")
    public static class268 field2398;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2393;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[BI)I")
    public static final int method1148(int arg0, int arg1, byte[] arg2, int arg3) {
        int var4 = 35 % (-arg1 / 32);
        field2392++;
        int var5 = -1;
        for (int var6 = arg3; var6 < arg0; var6++) {
            var5 = class382.field5455[(arg2[var6] ^ var5) & 0xFF] ^ var5 >>> 8;
        }
        return ~var5;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method1149(int arg0) {
        field2395 = null;
        field2393 = null;
        field2398 = null;
        int var1 = -79 / ((-arg0 - 5) / 55);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V")
    public static final void method1150(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 44) {
            method1151(95);
        }
        class46.field648.method155(15489, arg3);
        field2394++;
        class46.field648.method183(arg2, true);
        class46.field648.method178(arg1, -46);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static final void method1151(int arg0) {
        field2391++;
        if (arg0 == -1) {
            class243.field3449.method905((byte) 104);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)Laj;")
    public static final class170 method1152(byte arg0, int arg1) {
        field2396++;
        class149[] var2 = class432.field6100;
        synchronized (class432.field6100) {
            if (arg0 != 72) {
                field2393 = null;
            }
            class170 var3;
            if (class432.field6100.length <= arg1 || class432.field6100[arg1].method1006(arg0 - 62)) {
                var3 = new class170();
                var3.field2333 = new class84[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field2333[var4] = new class84();
                }
            } else {
                var3 = (class170) class432.field6100[arg1].method1008(7);
                var3.method1235((byte) -128);
                int var10002 = class16.field297[arg1]--;
            }
            return var3;
        }
    }
}
