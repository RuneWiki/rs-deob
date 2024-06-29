import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class45 extends class59 {

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Ldj;")
    private static class44 field854 = class89.method650(255, "Invalid username or password)3");

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Ldj;")
    public static class44 field852 = field854;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "[I")
    public static int[] field858 = new int[2048];

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Lih;")
    public static class95 field857 = new class95(30);

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field860 = 0;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "Ldj;")
    public static class44 field862 = class89.method650(255, "k");

    @OriginalMember(owner = "client!e", name = "x", descriptor = "J")
    public static volatile long field859 = 0L;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "Ldj;")
    public static class44 field863 = class89.method650(255, "null");

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field861 = 0;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Lve;")
    public static class225 field855;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Led;")
    public static final class49 method343(int arg0, byte arg1) {
        class49 var2 = (class49) class41.field771.method1178((long) arg0, 14176);
        field856++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class220.field3994.method1466(class162.method1049(arg0, 112), class183.method1150(93, arg0), (byte) -123);
        class49 var4 = new class49();
        if (var3 != null) {
            var4.method357(-92, new class66(var3));
        }
        int var5 = 52 / ((-arg1 - 9) / 63);
        class41.field771.method1183((byte) 93, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public static void method344(int arg0) {
        field862 = null;
        field858 = null;
        field852 = null;
        field857 = null;
        field854 = null;
        if (arg0 != 0) {
            field854 = null;
        }
        field855 = null;
        field863 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/awt/Component;II)Lai;")
    public static final class10 method345(int arg0, Component arg1, int arg2, int arg3) {
        field853++;
        try {
            Class var4 = Class.forName("fi");
            if (arg0 == -26981) {
                class10 var5 = (class10) var4.getDeclaredConstructor().newInstance();
                var5.method93(arg3, arg1, 13685, arg2);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class67 var6 = new class67();
            var6.method93(arg3, arg1, 13685, arg2);
            return var6;
        }
    }
}
