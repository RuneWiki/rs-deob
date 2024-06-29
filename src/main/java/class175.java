import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class175 extends class477 {

    @OriginalMember(owner = "client!uw", name = "D", descriptor = "[I")
    public static int[] field2204 = new int[2];

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "Lvi;")
    public static class560 field2203 = new class560(8);

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!uw", name = "E", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!uw", name = "F", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!uw", name = "H", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "Lpq;")
    public static class159 field2199;

    @OriginalMember(owner = "client!uw", name = "G", descriptor = "Lej;")
    public class229 field2207;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "Ljava/lang/String;")
    public String field2197;

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "[I")
    public int[] field2196;

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "[I")
    public int[] field2198;

    @OriginalMember(owner = "client!uw", name = "I", descriptor = "[Lnj;")
    public class436[] field2209;

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field2200;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)V", line = 8)
    public static final void method1162(int arg0, int arg1, int arg2) {
        field2202++;
        if (class42.method251(arg2, 0)) {
            if (arg1 != 2) {
                method1163(-50);
            }
            class622.method3400(arg0, class328.field4799[arg2], false);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V", line = 25)
    public static void method1163(int arg0) {
        field2203 = null;
        if (arg0 != 8) {
            method1163(-72);
        }
        field2199 = null;
        field2204 = null;
    }
}
