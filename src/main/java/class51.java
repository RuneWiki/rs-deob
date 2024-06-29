import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class51 extends class254 {

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Ljava/lang/String;")
    public static String field746 = "Created gameworld";

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field748 = -1;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "[I")
    public static int[] field755 = new int[4096];

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Lh;")
    public static class190 field749 = new class190(16);

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field756 = 0;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)Lkc;")
    public static final class31 method342(int arg0, int arg1) {
        field753++;
        class31 var2 = (class31) class279.field4449.method1501((long) arg0, (byte) 111);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class57.field875.method1538(class60.method394(-115, arg0), class114.method777((byte) -123, arg0), (byte) 54);
        class31 var4 = new class31();
        if (var3 != null) {
            var4.method222(new class114(var3), 0);
        }
        if (arg1 != 22771) {
            method342(-76, 117);
        }
        class279.field4449.method1499((long) arg0, -97, var4);
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static final void method343(int arg0) {
        class254.field3858.method257(false);
        class283.field4513.method257(false);
        field750++;
        if (arg0 != -1) {
            field748 = 35;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method344(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg0);
        field754++;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(II)V")
    public class51(int arg0, int arg1) {
        this.field751 = arg0;
        this.field752 = arg1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method345(byte arg0) {
        field746 = null;
        int var1 = 48 % ((-arg0 - 11) / 36);
        field755 = null;
        field749 = null;
    }
}
