import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class262 {

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public int field4239 = -1;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Lrh;")
    public static class100 field4238 = null;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Z")
    public static boolean field4250 = false;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "B")
    public static byte field4248;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public int field4240;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public int field4243;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public int field4245;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Lka;")
    public static final class183 method1778(boolean arg0, int arg1) {
        field4246++;
        class183 var2 = (class183) class47.field590.method1693((long) arg1, 106);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class201.field3185.method928(30, (byte) 114, arg1);
        class183 var4 = new class183();
        if (var3 != null) {
            var4.method1271((byte) -85, arg1, new class96(var3));
        }
        if (arg0) {
            field4248 = 47;
        }
        class47.field590.method1694(true, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method1779(int arg0) {
        if (arg0 != 30) {
            field4248 = 3;
        }
        field4238 = null;
    }
}
