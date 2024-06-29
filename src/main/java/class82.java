import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class82 extends class76 {

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field1250 = 2;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field1252 = 0;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Lnj;")
    public static class260 field1254 = new class260();

    @OriginalMember(owner = "client!d", name = "y", descriptor = "Luj;")
    public static class156 field1256 = new class156();

    @OriginalMember(owner = "client!d", name = "z", descriptor = "Lck;")
    public static class119 field1257 = class298.method1987((byte) 16, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lwi;")
    public static class23 field1251;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILml;I)V", line = 7)
    public static final void method560(int arg0, int arg1, class134 arg2, int arg3) {
        field1253++;
        if (class131.field2007 != null || class104.field1612 || arg2 == null || class96.method648(arg2, true) == null) {
            return;
        }
        if (arg3 != 2) {
            field1255 = -97;
        }
        class131.field2007 = arg2;
        class288.field4742 = class96.method648(arg2, true);
        class250.field4038 = arg0;
        class118.field1789 = arg1;
        class36.field521 = 0;
        class237.field3810 = false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)Loj;", line = 32)
    public static final class182 method561(int arg0, byte arg1) {
        field1248++;
        class182 var2 = (class182) class163.field2570.method524((byte) 118, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class81.field1245.method261(-1, 26, arg0);
        if (arg1 >= -98) {
            return (class182) null;
        }
        class182 var4 = new class182();
        if (var3 != null) {
            var4.method1160((byte) -114, new class3(var3));
        }
        class163.field2570.method527((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V", line = 58)
    public static void method562(byte arg0) {
        field1256 = null;
        field1251 = null;
        if (arg0 != 44) {
            method562((byte) -110);
        }
        field1257 = null;
        field1254 = null;
    }
}
