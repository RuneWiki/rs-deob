import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class class148 extends class256 {

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public int field2282;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "I")
    public int field2289;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public int field2281;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "[I")
    public static int[] field2284 = new int[5];

    @OriginalMember(owner = "client!js", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2283 = "glow3:";

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    public static int field2285 = 0;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V", line = 15)
    public static final void method1155(int arg0) {
        field2287++;
        if (arg0 != 5) {
            field2283 = null;
        }
        class18 var1 = class310.field4521;
        synchronized (class310.field4521) {
            class310.field4521.method112(0);
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(Z)Z", line = 34)
    public static final boolean method1156(boolean arg0) {
        if (arg0) {
            method1155(71);
        }
        field2288++;
        return class14.field221;
    }

    @OriginalMember(owner = "client!js", name = "f", descriptor = "(I)V", line = 48)
    public static void method1157(int arg0) {
        field2283 = null;
        field2284 = null;
        if (arg0 != 5) {
            field2285 = 8;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIII)V", line = 61)
    public class148(int arg0, int arg1, int arg2, int arg3) {
        this.field2282 = arg2;
        this.field2286 = arg1;
        this.field2289 = arg0;
        this.field2281 = arg3;
    }
}
