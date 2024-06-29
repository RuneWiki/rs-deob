import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class82 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Z")
    public static volatile boolean field1113 = true;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1119 = "Loaded input handler";

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Z")
    public static boolean field1117;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "[I")
    public static int[] field1120;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[[B")
    public static byte[][] field1114;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)Lbd;")
    public static final class191 method512(int arg0, byte arg1) {
        field1116++;
        class191 var2 = (class191) class172.field2398.method540((byte) -115, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 < 64) {
            return null;
        } else {
            byte[] var3 = class56.field803.method1576(-103, class23.method168(874807368, arg0), class204.method1298(-27703, arg0));
            class191 var4 = new class191();
            var4.field2639 = arg0;
            if (var3 != null) {
                var4.method1224((byte) -50, new class224(var3));
            }
            class172.field2398.method543(var4, (long) arg0, 858993459);
            return var4;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BIII)I")
    public static final int method513(byte arg0, int arg1, int arg2, int arg3) {
        field1118++;
        if ((class230.field3489[arg3][arg1][arg2] & 0x8) == 0) {
            if (arg0 < 124) {
                field1119 = null;
            }
            return arg3 <= 0 || (class230.field3489[1][arg1][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method514(int arg0) {
        field1120 = null;
        int var1 = 93 % ((arg0 + 24) / 63);
        field1119 = null;
        field1114 = null;
    }
}
