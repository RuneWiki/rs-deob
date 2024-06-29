import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class241 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "J")
    public long field4176 = 0L;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field4180 = 0;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field4188 = 0;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public int field4189;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lu;")
    public static class111 field4182;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lkb;")
    public class49 field4183;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lkb;")
    public class49 field4187;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1655(int arg0) {
        if (arg0 == 32484) {
            field4182 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILu;)Z")
    public static final boolean method1656(int arg0, int arg1, class111 arg2) {
        field4178++;
        byte[] var3 = arg2.method832(arg0, 4625);
        if (var3 == null) {
            return false;
        } else {
            class138.method1004(var3, arg1);
            return true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)Lcg;")
    public static final class156 method1657(boolean arg0) {
        field4181++;
        class158 var1 = new class158(class13.field194, class122.field2078, class96.field1591[0], class125.field2123[0], class221.field3837[0], class106.field1751[0], class67.field1100[0], class139.field2327);
        class111.method804((byte) -14);
        if (!arg0) {
            method1656(-99, 103, (class111) null);
        }
        return var1;
    }
}
