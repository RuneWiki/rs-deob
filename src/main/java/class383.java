import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class383 extends class596 {

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "[I")
    public int[] field4786;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "[I")
    public int[] field4789;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field4791 = 0;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Lwm;")
    public static class30 field4788;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "[Ls;")
    public static class358[] field4790;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 7)
    public static void method2197(byte arg0) {
        field4790 = null;
        field4788 = null;
        if (arg0 > -117) {
            method2197((byte) 27);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lmc;I)Lln;", line = 18)
    public static final class495 method2198(class234 arg0, int arg1) {
        field4787++;
        int var2 = arg0.method1553((byte) 89);
        if (arg1 != 0) {
            method2197((byte) 91);
        }
        return new class495(var2);
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(II[I[I)V", line = 37)
    public class383(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4786 = arg3;
        this.field4789 = arg2;
    }
}
