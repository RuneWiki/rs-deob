import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class200 extends class320 {

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "J")
    public long field2927;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Lle;")
    public class200 field2923;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lle;")
    public class200 field2928;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)Z")
    public final boolean method1379(int arg0) {
        field2926++;
        if (arg0 < 115) {
            this.method1382(49);
        }
        return this.field2923 != null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1380(int arg0, int arg1, byte arg2) {
        if (arg2 != 40) {
            method1384((byte) 69, null);
        }
        field2929++;
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1381(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public final void method1382(int arg0) {
        if (arg0 != 7218) {
            return;
        }
        field2925++;
        if (this.field2923 != null) {
            this.field2923.field2928 = this.field2928;
            this.field2928.field2923 = this.field2923;
            this.field2928 = null;
            this.field2923 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1383(String arg0, int arg1, int arg2) {
        field2930++;
        class54 var3 = class442.method2651(arg2, 2, arg1 + 18487);
        var3.method480(0);
        var3.field931 = arg0;
        if (arg1 != -31695) {
            method1384((byte) -83, null);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1384(byte arg0, String arg1) {
        field2924++;
        if (class149.field2374 == null) {
            return;
        }
        class183.field2736++;
        class28.method321(class177.field2704, -5001);
        int var2 = -54 % ((arg0 - 31) / 59);
        class410.field6141.method1109(false, class217.method1444(arg1, -124));
        class410.field6141.method1089((byte) -89, arg1);
    }
}
