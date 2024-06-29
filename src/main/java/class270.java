import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class270 extends class275 {

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field4254 = 0;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field4252 = 0;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Ldh;")
    public static class179 field4255 = new class179(4);

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Z")
    public static boolean field4257 = false;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field4258 = -1;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lqn;", line = 10)
    public static final class226 method1962(int arg0, int arg1) {
        field4253++;
        class226 var2 = (class226) class311.field4809.method1239((byte) -112, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class85.field1086.method1199(28815, arg1, 1);
        class226 var4 = new class226();
        if (arg0 > -74) {
            field4255 = (class179) null;
        }
        if (var3 != null) {
            var4.method1558(new class107(var3), (byte) 116, arg1);
        }
        class311.field4809.method1243(var4, (long) arg1, -29282);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 46)
    public static void method1963(int arg0) {
        if (arg0 == 4) {
            field4255 = null;
        }
    }
}
