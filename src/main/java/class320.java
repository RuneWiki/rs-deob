import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class320 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lhga;")
    public static class158 field4698 = new class158();

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILbw;)V")
    public static final void method2055(int arg0, class641 arg1) {
        field4701++;
        for (int var2 = arg0; var2 < class507.field7186; var2++) {
            int var3 = class305.field4526[var2];
            class602 var4 = class59.field1341[var3];
            int var5 = arg1.method732(arg0 - 559537960);
            if ((var5 & 0x20) != 0) {
                var5 += arg1.method732(arg0 ^ 0xDEA620D8) << 8;
            }
            if ((var5 & 0x4000) != 0) {
                var5 += arg1.method732(-559537960) << 16;
            }
            class232.method1568(var3, var4, arg0, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)I")
    public final int method2056(int arg0, int arg1, int arg2) {
        field4702++;
        int var4 = arg2 >= class506.field7173 ? arg2 : class506.field7173;
        if (class207.field3170 == this) {
            return 0;
        } else if (class557.field7890 == this) {
            return var4 - arg1;
        } else {
            if (arg0 <= 70) {
                field4698 = null;
            }
            return class158.field2691 == this ? (var4 - arg1) / 2 : 0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method2057(int arg0) {
        if (arg0 <= 0) {
            field4698 = null;
        }
        field4698 = null;
    }

    @OriginalMember(owner = "client!sc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4699++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ICI)I")
    public static final int method2058(int arg0, char arg1, int arg2) {
        field4700++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var4 = Character.toLowerCase(arg1);
            var3 = (var4 << 4) + 1;
        }
        if (arg0 != -20651) {
            method2058(87, 'k', -17);
        }
        return var3;
    }
}
