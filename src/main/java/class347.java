import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class347 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public int field4651;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lol;")
    public static class272 field4655 = null;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method2064(int arg0) {
        if (arg0 > -95) {
            method2066(5, null, (byte) -42);
        }
        field4655 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
    public static final boolean method2065(int arg0, int arg1, int arg2) {
        if (arg1 != 393216) {
            field4655 = null;
        }
        field4653++;
        return (arg0 & 0x60000) != 0 | class5.method42(arg0, 1, arg2) || class102.method555(arg1 ^ 0xFFF9FF8E, arg2, arg0) || class106.method579(arg0, (byte) 84, arg2);
    }

    @OriginalMember(owner = "client!hb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4652++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I)V")
    public class347(int arg0) {
        this.field4651 = arg0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILnp;B)Ljava/lang/String;")
    public static final String method2066(int arg0, class115 arg1, byte arg2) {
        field4654++;
        try {
            int var3 = arg1.method662(true);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field1218 += class178.field1994.method3305(var4, (byte) -31, arg1.field1269, arg1.field1218, var3, 0);
            String var5 = class204.method1224(60, 0, var3, var4);
            int var6 = -86 / ((22 - arg2) / 58);
            return var5;
        } catch (Exception var7) {
            return "Cabbage";
        }
    }
}
