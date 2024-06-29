import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class129 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    private int field1897;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILca;I)V")
    public final void method888(int arg0, class54 arg1, int arg2) {
        if (arg2 != 0) {
            this.method890(15, -101, 28, (class54) null);
        }
        field1899++;
        while (true) {
            int var4 = arg1.method407(255);
            if (var4 == 0) {
                return;
            }
            this.method890(-127, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Lwh;")
    public final class289 method889(byte arg0) {
        field1900++;
        if (arg0 >= -103) {
            return null;
        }
        class289 var2 = (class289) class12.field183.method945((long) this.field1897, true);
        if (var2 != null) {
            return var2;
        }
        class289 var3 = class231.method1574(this.field1897, class214.field3289, 0, false);
        if (var3 != null) {
            class12.field183.method941(var3, (long) this.field1897, -8447);
        }
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIILca;)V")
    private final void method890(int arg0, int arg1, int arg2, class54 arg3) {
        if (arg1 == 1) {
            this.field1897 = arg3.method423(118);
        } else if (arg1 == 2) {
            this.field1898 = arg3.method407(255);
            this.field1896 = arg3.method407(255);
        }
        int var5 = -55 / ((arg0 + 9) / 45);
        field1895++;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
    public static final void method891(byte arg0) {
        class59.field975.method940(51);
        if (arg0 != -119) {
            method891((byte) 37);
        }
        field1894++;
    }
}
