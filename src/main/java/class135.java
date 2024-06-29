import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class135 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLmd;)V", line = 7)
    public static final void method754(boolean arg0, class463 arg1) {
        field1651++;
        int var2 = arg1.field6408 - class335.field4358;
        int var3 = arg1.field6391 * 128 + (arg1.method2694(28146) * 64);
        int var4 = arg1.field6413 * 128 + arg1.method2694(28146) * 64;
        arg1.field6487 = 0;
        arg1.field8652 += (var4 - arg1.field8652) / var2;
        if (!arg0) {
            method754(true, null);
        }
        arg1.field8661 += (var3 - arg1.field8661) / var2;
        if (arg1.field6401 == 0) {
            arg1.method2705(8192, false);
        }
        if (arg1.field6401 == 1) {
            arg1.method2705(12288, false);
        }
        if (arg1.field6401 == 2) {
            arg1.method2705(0, false);
        }
        if (arg1.field6401 == 3) {
            arg1.method2705(4096, false);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V", line = 46)
    public class135(int arg0) {
        this.field1649 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "toString", descriptor = "()Ljava/lang/String;", line = 55)
    public final String toString() {
        field1652++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZC)Z", line = 63)
    public static final boolean method755(boolean arg0, char arg1) {
        if (arg0) {
            field1648++;
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V", line = 74)
    public static final void method756(int arg0, int arg1, int arg2) {
        field1650++;
        class557 var3 = class93.method564(arg1, -14073, arg2);
        var3.method3257(arg1 + 1942);
        var3.field8207 = arg0;
    }
}
