import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class130 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lnj;")
    public static class317 field1764 = new class317();

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Lmn;")
    public static class162 field1767;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method808(int arg0, int arg1) {
        field1765++;
        if (arg0 == 100 && class526.field7760 > 0) {
            byte[] var2 = class525.field7745[--class526.field7760];
            class525.field7745[class526.field7760] = null;
            return var2;
        } else if (arg0 == 5000 && class268.field4296 > 0) {
            byte[] var3 = class397.field5997[--class268.field4296];
            class397.field5997[class268.field4296] = null;
            return var3;
        } else {
            if (arg1 > -106) {
                method811((byte) 81, null, 63);
            }
            if (arg0 == 30000 && class296.field4665 > 0) {
                byte[] var4 = class93.field1357[--class296.field4665];
                class93.field1357[class296.field4665] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static void method809(byte arg0) {
        if (arg0 > 90) {
            field1767 = null;
            field1764 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BII)B")
    public static final byte method810(byte arg0, int arg1, int arg2) {
        field1768++;
        if (arg0 != 102) {
            return -122;
        } else if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLgi;I)I")
    public static final int method811(byte arg0, class437 arg1, int arg2) {
        field1766++;
        if (arg0 != 50) {
            return 20;
        } else if (!client.method492(arg1).method2910(arg0 ^ 0xFFFFFFCD, arg2) && arg1.field6625 == null) {
            return -1;
        } else if (arg1.field6672 == null || arg1.field6672.length <= arg2) {
            return -1;
        } else {
            return arg1.field6672[arg2];
        }
    }
}
