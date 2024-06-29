import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class125 {

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "J")
    public long field2200 = 0L;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lid;")
    private static class149 field2195 = class60.method382("Connecting to update server", (byte) 23);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lid;")
    public static class149 field2198 = field2195;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lug;")
    public class199 field2197;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lug;")
    public class199 field2203;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public static void method877(boolean arg0) {
        if (arg0) {
            field2199 = -16;
        }
        field2198 = null;
        field2195 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Lfi;")
    public static final class110 method878(int arg0, int arg1) {
        field2196++;
        class110 var2 = (class110) class118.field2004.method1293((long) arg0, false);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 8629) {
            byte[] var3 = class231.field4077.method1562(-809612665, arg0, 3);
            class110 var4 = new class110();
            if (var3 != null) {
                var4.method777((byte) -60, new class74(var3));
            }
            class118.field2004.method1295((long) arg0, var4, (byte) -71);
            return var4;
        } else {
            return null;
        }
    }
}
