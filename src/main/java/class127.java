import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class127 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lda;")
    public static class275 field2250 = class255.method1672(119, "Hierhin gehen");

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[I")
    public static int[] field2254 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lda;")
    public static class275 field2253 = class255.method1672(109, "Mem:");

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lda;")
    public static class275 field2255 = class255.method1672(122, "<col=00ff80>");

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "J")
    public static volatile long field2256 = 0L;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lda;")
    private static class275 field2257 = class255.method1672(124, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lda;")
    public static class275 field2252 = field2257;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "[Lda;")
    public static class275[] field2258;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lfd;I)Lfd;")
    public static final class229 method915(class229 arg0, int arg1) {
        field2251++;
        if (arg0.field3992 != -1) {
            return class261.method1709(arg0.field3992, -115);
        }
        int var2 = arg0.field3879 >>> 16;
        class75 var3 = new class75(class267.field4633);
        class112 var4 = (class112) var3.method495(arg1 ^ 0x2F39536E);
        if (arg1 != 792285968) {
            return null;
        }
        while (var4 != null) {
            if (var4.field1977 == var2) {
                return class261.method1709((int) var4.field1707, -121);
            }
            var4 = (class112) var3.method494((byte) -67);
        }
        return null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static void method916(boolean arg0) {
        field2257 = null;
        field2250 = null;
        field2252 = null;
        field2255 = null;
        field2258 = null;
        field2253 = null;
        if (arg0) {
            field2254 = null;
        }
    }
}
