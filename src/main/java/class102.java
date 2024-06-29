import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class102 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lao;")
    public static class191 field1389 = new class191(110, -1);

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1391 = -1;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1392 = -1;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lvn;")
    public static class206 field1387;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Z", line = 13)
    public static final boolean method623(int arg0, int arg1) {
        field1390++;
        if (arg1 <= 110) {
            return true;
        } else {
            return arg0 == 9 || arg0 == 10 || arg0 == 11;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 24)
    public static void method624(byte arg0) {
        field1389 = null;
        int var1 = -10 % ((47 - arg0) / 35);
        field1387 = null;
    }
}
