import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class231 extends class77 {

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "Ldc;")
    public static class37 field4226 = class185.method1233((byte) 86, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field4224 = 0;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "Ldc;")
    public static class37 field4228 = class185.method1233((byte) 86, "Schlie-8en");

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "Z")
    public static boolean field4225 = false;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field4232 = 0;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "[Ldc;")
    public static class37[] field4234 = new class37[500];

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "B")
    public byte field4229;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "Ldj;")
    public class44 field4231;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
    public static final void method1494(byte arg0) {
        field4227++;
        if (arg0 >= -37) {
            field4234 = null;
        }
        Object var1 = class52.field1046;
        synchronized (class52.field1046) {
            if (class54.field1061 == 0) {
                class10.field130.method141(5, new class16(), (byte) 72);
            }
            class54.field1061 = 600;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
    public static void method1495(boolean arg0) {
        field4226 = null;
        field4228 = null;
        field4234 = null;
        if (arg0) {
            method1496(false, -110, 51, 38, 20, -75);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZIIIII)Lji;")
    public static final class106 method1496(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4233++;
        long var6 = ((long) arg5 << 38) + ((long) arg1 + ((long) arg2 << 16)) + (arg0 ? 137438953472L : 0L) + ((long) arg3 << 40);
        if (arg4 != 500) {
            return null;
        }
        class106 var8 = (class106) class19.field314.method87(-125, var6);
        if (var8 != null) {
            return var8;
        }
        class169.field3214 = false;
        class106 var9 = class107.method704(arg0, arg5, arg1, false, arg3, false, arg2, false);
        if (var9 != null && !class169.field3214) {
            class19.field314.method92(var6, var9, true);
        }
        return var9;
    }
}
