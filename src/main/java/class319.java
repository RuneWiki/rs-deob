import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class319 {

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "B")
    private byte field4818;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public int field4821;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field4815;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public int field4823;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Ljg;")
    public static class241 field4812 = new class241(64);

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field4819 = 0;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field4824 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Lpf;")
    public static class425 field4822 = new class425(50, 8);

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method1946(int arg0) {
        if (arg0 != 7146) {
            field4826 = -70;
        }
        field4812 = null;
        field4824 = null;
        field4822 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)I")
    public final int method1947(boolean arg0) {
        field4814++;
        if (!arg0) {
            method1948((class18) null, -22);
        }
        return (this.field4818 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lrc;I)Z")
    public static final boolean method1948(class18 arg0, int arg1) {
        field4817++;
        class85 var2 = class411.method2575(0, arg0.method7(true));
        if (var2.field1155 == -1) {
            return true;
        }
        class66 var3 = class198.method1181(var2.field1155, 34);
        if (arg1 > -42) {
            field4826 = -24;
        }
        return var3.field860 == -1 ? true : var3.method449(262144);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
    public final int method1949(int arg0) {
        if (arg0 < 102) {
            this.field4815 = -114;
        }
        field4820++;
        return this.field4818 & 0x7;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class319() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lef;)V")
    public class319(class385 arg0) {
        this.field4818 = arg0.method2341((byte) 54);
        this.field4813 = arg0.method2323(-120);
        this.field4821 = arg0.method2354(255);
        this.field4815 = arg0.method2354(255);
        this.field4823 = arg0.method2354(255);
        this.field4816 = arg0.method2354(255);
    }
}
