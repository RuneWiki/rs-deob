import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class127 extends class212 {

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public int field2112 = 0;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "Lqe;")
    public static class168 field2107 = class66.method448(" )2> <col=ffff00>", -110);

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "Lrd;")
    public static class207 field2111;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(Z)V")
    public static void method861(boolean arg0) {
        field2107 = null;
        if (arg0) {
            field2111 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)V")
    public static final void method862(int arg0, int arg1) {
        field2110++;
        if (arg1 == -1 && !class147.field2574) {
            class99.method651(arg0 ^ 0xFFFFFFFE);
        } else if (arg1 != -1 && (class230.field3908 != arg1 || !class212.method1368(false)) && class93.field1464 != 0 && !class147.field2574) {
            class85.method565(class159.field2749, arg1, class93.field1464, 0, ~arg0, false, 2);
        }
        class230.field3908 = arg1;
        if (arg0 != 0) {
            method861(false);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLnh;)V")
    public final void method863(byte arg0, class112 arg1) {
        while (true) {
            int var3 = arg1.method758(true);
            if (var3 == 0) {
                if (arg0 != 65) {
                    field2107 = null;
                }
                field2106++;
                return;
            }
            this.method864(var3, arg1, arg0 - 46);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILnh;I)V")
    private final void method864(int arg0, class112 arg1, int arg2) {
        if (arg0 == 5) {
            this.field2112 = arg1.method731(false);
        }
        field2108++;
        if (arg2 < 2) {
            field2109 = -78;
        }
    }
}
