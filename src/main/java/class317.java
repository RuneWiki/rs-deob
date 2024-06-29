import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class317 extends class196 {

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "Lkg;")
    public class113 field4779;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "[I")
    public static int[] field4778 = new int[256];

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4781 = "yellow:";

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "[[[B")
    public static byte[][][] field4780;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLcb;)V", line = 10)
    public static final void method2170(byte arg0, class218 arg1) {
        field4782++;
        int var2 = -1;
        if (arg0 != -30) {
            return;
        }
        long var3 = 0L;
        if (arg1.field3318 == 0) {
            var3 = class179.method1237(arg1.field3320, arg1.field3331, arg1.field3330);
        }
        int var5 = 0;
        if (arg1.field3318 == 1) {
            var3 = class74.method475(arg1.field3320, arg1.field3331, arg1.field3330);
        }
        if (arg1.field3318 == 2) {
            var3 = class73.method471(arg1.field3320, arg1.field3331, arg1.field3330);
        }
        if (arg1.field3318 == 3) {
            var3 = class316.method2165(arg1.field3320, arg1.field3331, arg1.field3330);
        }
        int var6 = 0;
        if (var3 != 0L) {
            var5 = ((int) var3 & 0x7CF06) >> 14;
            var2 = (int) (var3 >>> 32) & Integer.MAX_VALUE;
            var6 = (int) var3 >> 20 & 0x3;
        }
        arg1.field3326 = var5;
        arg1.field3315 = var2;
        arg1.field3329 = var6;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V", line = 56)
    public static void method2171(int arg0) {
        field4781 = null;
        if (arg0 != -21027) {
            field4781 = (String) null;
        }
        field4780 = (byte[][][]) null;
        field4778 = null;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lkg;)V", line = 75)
    public class317(class113 arg0) {
        this.field4779 = arg0;
    }
}
