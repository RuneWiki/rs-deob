import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public abstract class class181 {

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "Lqv;")
    public static class316 field2668 = new class316(10, 8);

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "[S")
    public static short[] field2672 = new short[256];

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "Lqv;")
    public static class316 field2671 = new class316(25, 8);

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field2673 = 0;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "Lfh;")
    public static class470 field2674 = new class470("RC", 1);

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2670;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIII)Lkv;", line = 6)
    public static final class181 method1255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2667++;
        long var7 = (long) arg0 * 76724863L ^ (long) arg5 * 475427L ^ (long) arg3 * 97549L ^ (long) arg6 * 67481L ^ (long) arg1 * 986053L ^ (long) arg4 * 32147369L;
        class181 var9 = (class181) class293.field4369.method2982(arg2 ^ arg2, var7);
        if (var9 == null) {
            class181 var10 = class157.field2402.method218(arg6, arg3, arg5, arg1, arg4, arg0);
            class293.field4369.method2981(var10, 27, var7);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V", line = 32)
    public static final void method1256(int arg0, int arg1) {
        field2669++;
        class275 var2 = class213.method1433((byte) 67, 2, arg1);
        var2.method1774((byte) -100);
        int var3 = 39 % ((-arg0 - 79) / 47);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V", line = 44)
    public static void method1257(int arg0) {
        field2668 = null;
        field2671 = null;
        if (arg0 != 1) {
            method1256(-92, -90);
        }
        field2674 = null;
        field2670 = null;
        field2672 = null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvb;", line = 70)
    public static final class134 method1258(Throwable arg0, String arg1) {
        field2666++;
        class134 var2;
        if (arg0 instanceof class134) {
            var2 = (class134) arg0;
            var2.field2093 = var2.field2093 + ' ' + arg1;
        } else {
            var2 = new class134(arg0, arg1);
        }
        return var2;
    }
}
