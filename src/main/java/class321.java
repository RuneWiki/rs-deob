import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class class321 extends class674 {

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lem;")
    public static class206 field4385 = new class206(93, 10);

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Lhea;")
    public abstract class388 method1926(byte arg0);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public static void method1927(byte arg0) {
        field4385 = null;
        if (arg0 > -42) {
            field4385 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)V")
    public static final void method1928(int arg0, int arg1, byte arg2) {
        int var3 = 37 / ((90 - arg2) / 33);
        field4386++;
        if (class450.field6183 != 0) {
            if (arg0 >= 0) {
                class287.field3957[arg0] = arg1;
            } else {
                for (int var4 = 0; var4 < 16; var4++) {
                    class287.field3957[var4] = arg1;
                }
            }
        }
        class224.field3124.method2094(arg0, true, arg1);
    }
}
