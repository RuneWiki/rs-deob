import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class344 extends class673 {

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Z")
    public boolean field4473 = false;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "S")
    public short field4474;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public int field4472;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public int field4478;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public int field4476;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "Lkfa;")
    public static class549 field4479 = new class549(38, 3);

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Ljo;")
    public static class303 field4480;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(B)V", line = 16)
    public static final void method1915(byte arg0) {
        field4477++;
        if (arg0 != 121 || class108.field1255 == null) {
            return;
        }
        if (class108.field1255.field2437 == 1) {
            class108.field1255 = null;
            return;
        }
        if (class108.field1255.field2437 == 2) {
            class646.method3628(2, 1, class211.field2554, class470.field6565);
            class108.field1255 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(CZ)Z", line = 47)
    public static final boolean method1916(char arg0, boolean arg1) {
        field4471++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg1) {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V", line = 69)
    public static void method1917(int arg0) {
        field4480 = null;
        if (arg0 != 16439) {
            method1915((byte) -91);
        }
        field4479 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIZZ)V", line = 86)
    public class344(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field4474 = (short) arg3;
        this.field4472 = arg2;
        this.field4473 = arg5;
        this.field4478 = arg0;
        this.field4476 = arg1;
    }
}
