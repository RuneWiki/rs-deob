import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class159 extends class55 {

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "Lw;")
    public class37 field2305;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "[I")
    public static int[] field2307 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "F")
    public static float field2310 = 128.0F;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "Ljava/lang/String;")
    public static String field2308 = "Continue";

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field2309 = -1;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
    public static void method1060(byte arg0) {
        field2308 = null;
        if (arg0 != -35) {
            method1061((class216) null, -75);
        }
        field2307 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lqi;I)Lil;")
    public static final class27 method1061(class216 arg0, int arg1) {
        field2303++;
        return arg1 <= 32 ? null : new class27(arg0.method1357((byte) 50), arg0.method1357((byte) 50), arg0.method1357((byte) 50), arg0.method1357((byte) 50), arg0.method1382(-127), arg0.method1407(107));
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lw;)V")
    public class159(class37 arg0) {
        this.field2305 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(JI)V")
    public static final void method1062(long arg0, int arg1) {
        field2306++;
        if (arg0 == 0L || arg1 < 12) {
            return;
        }
        for (int var3 = 0; var3 < class144.field2064; var3++) {
            if (class267.field3844[var3] == arg0) {
                class144.field2064--;
                for (int var4 = var3; var4 < class144.field2064; var4++) {
                    class82.field990[var4] = class82.field990[var4 + 1];
                    class143.field2046[var4] = class143.field2046[var4 + 1];
                    class59.field691[var4] = class59.field691[var4 + 1];
                    class267.field3844[var4] = class267.field3844[var4 + 1];
                    class274.field4102[var4] = class274.field4102[var4 + 1];
                    class287.field4455[var4] = class287.field4455[var4 + 1];
                }
                class79.field934 = class176.field2500;
                class123.field1763++;
                class94.field1259.method592(205, false);
                class94.field1259.method1379(-64, arg0);
                return;
            }
        }
    }
}
