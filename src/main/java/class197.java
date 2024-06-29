import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class197 {

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Lkl;")
    public static class68 field3168 = null;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "[Lc;")
    public static class136[] field3171 = new class136[50];

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3175 = "Starting 3d Library";

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "B")
    public static byte field3165;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lgn;")
    public static class257 field3163;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Lfc;")
    public static class274 field3167;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "[[[Lmj;")
    public static class47[][][] field3169;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)Led;", line = 18)
    public static final class267 method1263(int arg0) {
        if (arg0 < 99) {
            field3168 = (class68) null;
        }
        field3162++;
        try {
            return (class267) Class.forName("uh").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 35)
    public static void method1264(int arg0) {
        field3171 = null;
        field3168 = null;
        field3175 = null;
        field3163 = null;
        field3169 = (class47[][][]) null;
        field3167 = null;
        if (arg0 != 50) {
            method1263(61);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLkl;)Lkl;", line = 58)
    public static final class68 method1265(byte arg0, class68 arg1) {
        if (arg0 != -27) {
            method1263(-52);
        }
        field3166++;
        class68 var2 = client.method358(arg1);
        if (var2 == null) {
            var2 = arg1.field1441;
        }
        return var2;
    }
}
