import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class396 extends class156 {

    @OriginalMember(owner = "client!jba", name = "J", descriptor = "[[I")
    public static int[][] field5543 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!jba", name = "F", descriptor = "Lqe;")
    public static class465 field5539 = new class465(70, 3);

    @OriginalMember(owner = "client!jba", name = "O", descriptor = "Lqaa;")
    public static class27 field5548 = new class27(41, 11);

    @OriginalMember(owner = "client!jba", name = "D", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!jba", name = "G", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!jba", name = "I", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!jba", name = "K", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!jba", name = "L", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!jba", name = "M", descriptor = "I")
    public int field5546;

    @OriginalMember(owner = "client!jba", name = "N", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!jba", name = "H", descriptor = "Lpk;")
    public class195 field5541;

    @OriginalMember(owner = "client!jba", name = "E", descriptor = "[B")
    public byte[] field5538;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZI)V")
    public static final void method2456(boolean arg0, int arg1) {
        if (arg0) {
            if (~class401.field5610 != 0) {
                class397.method2465((byte) -95, class401.field5610);
            }
            for (class548 var2 = (class548) class310.field4383.method4209(false); var2 != null; var2 = (class548) class310.field4383.method4207(arg1 + 9357)) {
                if (!var2.method3618(arg1 ^ 112)) {
                    var2 = (class548) class310.field4383.method4209(false);
                    if (var2 == null) {
                        break;
                    }
                }
                class740.method4119(var2, true, false, 78);
            }
            class401.field5610 = -1;
            class310.field4383 = new class758(8);
            class494.method2976((byte) -85);
            class401.field5610 = class197.field2834;
            class319.method2050(~arg1, false);
            class237.method1608(true);
            class357.method2231(class401.field5610);
        }
        if (arg1 == -1) {
            ++field5537;
            class98.field1675 = true;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method2457(int arg0, boolean arg1, String arg2, String arg3) {
        class595.field8697 = arg0;
        class683.field9617 = 2;
        ++field5545;
        class592.method3398(arg1, arg3, arg2, (byte) 53);
    }

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "(I)V")
    public static void method2458(int arg0) {
        field5543 = null;
        if (arg0 <= 8) {
            method2459(80, 10);
        }
        field5539 = null;
        field5548 = null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)I")
    public static final int method2459(int arg0, int arg1) {
        ++field5542;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = -30 % ((54 - arg0) / 39);
        int var4 = arg1 * 6 + -61440;
        int var5 = (arg1 * var4 >> 12) + 40960;
        return var2 * var5 >> 12;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)[B")
    public final byte[] method1187(byte arg0) {
        ++field5547;
        if (super.field2336) {
            throw new RuntimeException();
        } else {
            if (arg0 >= -15) {
                this.field5538 = null;
            }
            return this.field5538;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)I")
    public final int method1185(boolean arg0) {
        if (arg0) {
            method2458(-90);
        }
        ++field5540;
        return super.field2336 ? 0 : 100;
    }
}
