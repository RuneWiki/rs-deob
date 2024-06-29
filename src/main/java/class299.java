import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class299 extends class209 {

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "Luf;")
    public static class168 field5060 = class148.method1019(-1720, "floorshadows");

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Luf;")
    public static class168 field5072 = class148.method1019(-1720, "overlay");

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "Z")
    public static boolean field5074 = false;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "Ljava/util/Random;")
    public static Random field5075 = new Random();

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public int field5067;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public int field5070;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public int field5073;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    public int field5077;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "Luf;")
    public class168 field5063;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "Lwa;")
    public static class284 field5066;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "Lbd;")
    public static class82 field5076;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "[I")
    public int[] field5065;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "[I")
    public int[] field5068;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "[Luf;")
    public class168[] field5071;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "[Lkb;")
    public class80[] field5059;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)I", line = 16)
    public static final int method2048(boolean arg0) {
        field5064++;
        if (arg0) {
            method2049(-62);
        }
        return class102.field1583;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V", line = 36)
    public static void method2049(int arg0) {
        field5075 = null;
        field5060 = null;
        if (arg0 != -26907) {
            method2049(-59);
        }
        field5076 = null;
        field5066 = null;
        field5072 = null;
    }
}
