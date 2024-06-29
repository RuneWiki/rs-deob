import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class436 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lsg;")
    public static class226 field6138;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lnn;")
    public static final class239 method2740(int arg0, int arg1, int arg2) {
        field6143++;
        class239 var3 = (class239) class74.field1052.method886((long) arg0 << 32 | (long) arg1, 25651);
        if (var3 == null) {
            var3 = new class239(arg0, arg1);
            class74.field1052.method883((byte) -54, var3.field5600, var3);
        }
        if (arg2 != -323285792) {
            method2744(-82, (byte) 62);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
    public static final void method2741(int arg0, int arg1) {
        field6139++;
        class131 var2 = class304.field4200;
        synchronized (class304.field4200) {
            class304.field4200.method901(arg1, 12223);
        }
        if (arg0 != 63) {
            method2740(-49, -73, -50);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
    public static final int method2742(int arg0) {
        if (arg0 == 2) {
            field6141++;
            return 2;
        } else {
            return -85;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method2743(byte arg0) {
        field6138 = null;
        if (arg0 < 95) {
            field6138 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)C")
    public static final char method2744(int arg0, byte arg1) {
        field6140++;
        if (arg0 != 63) {
            return (char) 65437;
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class95.field1335[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
