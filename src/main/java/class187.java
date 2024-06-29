import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class187 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lhc;")
    public static class368 field2702 = new class368("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Z")
    public static boolean field2704 = false;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lij;")
    public static class316 field2710;

    static {
        Math.sqrt(8192.0D);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method1300(int arg0, boolean arg1) {
        field2707++;
        class26 var2 = class217.method1445(arg1, arg0, 7);
        var2.method164(12);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I", line = 16)
    public static int method1301(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Z", line = 27)
    public static final boolean method1302(int arg0) {
        field2709++;
        return class10.field78 == arg0 ? class105.field1477.method2413(arg0 + 77) : true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 39)
    public static final void method1303(byte arg0) {
        field2703++;
        if (class398.field5508) {
            return;
        }
        class398.field5508 = true;
        class68.field964 = true;
        int var1 = 62 / ((-arg0 - 45) / 57);
        if (class229.field3214) {
            class356.field4785 = (float) ((int) class356.field4785 + 47 & 0xFFFFFFF0);
        } else {
            class230.field3233 += (12.0F - class230.field3233) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBLij;)Llk;", line = 68)
    public static final class122 method1304(int arg0, byte arg1, class316 arg2) {
        field2706++;
        byte[] var3 = arg2.method1908((byte) -40, arg0);
        if (arg1 < 16) {
            method1303((byte) 113);
        }
        return var3 == null ? null : new class122(var3);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 86)
    public static void method1305(int arg0) {
        field2710 = null;
        field2702 = null;
        if (arg0 != 0) {
            field2704 = true;
        }
    }
}
