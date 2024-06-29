import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class39 extends class435 {

    @OriginalMember(owner = "client!is", name = "t", descriptor = "S")
    public static short field606 = 1;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "Lfg;")
    public static class18 field600 = new class18(5);

    @OriginalMember(owner = "client!is", name = "w", descriptor = "I")
    public static int field609 = 0;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "Ljava/lang/String;")
    public static String field610 = "scroll:";

    @OriginalMember(owner = "client!is", name = "z", descriptor = "Ljava/lang/String;")
    public static String field612 = " is already on your ignore list.";

    @OriginalMember(owner = "client!is", name = "A", descriptor = "Ljava/lang/String;")
    public static String field613 = "Loaded sprites";

    @OriginalMember(owner = "client!is", name = "y", descriptor = "Ljava/lang/String;")
    public static String field611 = "Loaded defaults";

    @OriginalMember(owner = "client!is", name = "o", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "Lpe;")
    public class390 field604;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V", line = 13)
    public static void method333(int arg0) {
        field613 = null;
        if (arg0 != -1) {
            field611 = null;
        }
        field600 = null;
        field610 = null;
        field612 = null;
        field611 = null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I", line = 28)
    public static final int method334(int arg0, int arg1) {
        int var2 = 91 / ((arg1 - 71) / 49);
        field608++;
        return arg0 == 16711935 ? -1 : class207.method1567(arg0, (byte) -91);
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)Lrr;", line = 46)
    public static final class198 method335(byte arg0) {
        int var1 = -35 / ((55 - arg0) / 48);
        field601++;
        if (class272.field4075 == null || class349.field4960 == null) {
            return null;
        }
        class349.field4960.method1626((byte) 123, class272.field4075);
        class198 var2 = (class198) class349.field4960.method1631((byte) -77);
        if (var2 == null) {
            return null;
        } else {
            class242 var3 = class1.method3(var2.field2883, 36);
            return var3 != null && var3.field3531 && var3.method1768(21) ? var2 : class126.method1064((byte) 111);
        }
    }
}
