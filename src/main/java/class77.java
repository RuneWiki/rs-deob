import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class77 extends class297 {

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Lel;")
    public static class218 field1203 = new class218();

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Lma;")
    public static class5 field1206 = class12.method119("headicons_pk", (byte) 53);

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field1205 = 0;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "Lma;")
    public static class5 field1207 = class12.method119("Weiter", (byte) 83);

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "Z")
    public static boolean field1208 = true;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Lma;")
    public static class5 field1209 = class12.method119(")4l=", (byte) 55);

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "Lma;")
    public static class5 field1210 = class12.method119(":clanreq:", (byte) 80);

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V", line = 5)
    public static void method535(byte arg0) {
        field1210 = null;
        if (arg0 != 31) {
            method535((byte) 106);
        }
        field1207 = null;
        field1203 = null;
        field1206 = null;
        field1209 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lwi;", line = 19)
    public static final class185 method536(int arg0, int arg1) {
        field1202++;
        class185 var2 = (class185) class106.field1568.method521((long) arg0, (byte) 80);
        if (arg1 <= 113) {
            field1210 = (class5) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class69.field1095.method1342(87, class50.method371(arg0, (byte) 99), class84.method565(arg0, true));
        class185 var4 = new class185();
        var4.field2893 = arg0;
        if (var3 != null) {
            var4.method1217(-10033, new class221(var3));
        }
        var4.method1219(0);
        if (!class8.field124 && var4.field2836) {
            var4.field2850 = null;
        }
        if (var4.field2845) {
            var4.field2911 = 0;
            var4.field2858 = false;
        }
        class106.field1568.method519((byte) -95, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V", line = 66)
    public class77(int arg0, int arg1) {
        this.field1200 = arg0;
        this.field1204 = arg1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILma;I)V", line = 92)
    public static final void method537(int arg0, class5 arg1, int arg2) {
        class70.field1101++;
        field1201++;
        class147.field2127.method1389((byte) 126, 133);
        class147.field2127.method1535(128, arg0);
        int var3 = 36 % ((arg2 + 2) / 56);
        class147.field2127.method1553(arg1.method69(-49), true);
    }
}
