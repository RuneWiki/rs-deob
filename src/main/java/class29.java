import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class29 extends class302 {

    @OriginalMember(owner = "client!qaa", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field540;

    @OriginalMember(owner = "client!qaa", name = "D", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!qaa", name = "E", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!qaa", name = "F", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!qaa", name = "G", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!qaa", name = "A", descriptor = "Z")
    public static boolean field539;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "(I)Lsp;", line = 3)
    public static final class663 method186(int arg0) {
        field543++;
        int var1 = 116 % ((-arg0 - 42) / 63);
        try {
            return (class663) Class.forName("rfa").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class612();
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)Z", line = 17)
    public final boolean method187(int arg0) {
        if (arg0 != 0) {
            field539 = false;
        }
        field542++;
        return false;
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(III)Ltc;", line = 31)
    public static final class373 method188(int arg0, int arg1, int arg2) {
        class549 var3 = class325.field4448[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7463;
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lwf;Ljava/lang/Object;I)V", line = 42)
    public class29(class147 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field540 = arg1;
    }

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 50)
    public final Object method189(int arg0) {
        if (arg0 == 0) {
            field541++;
            return this.field540;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZIII)I", line = 63)
    public static final int method190(boolean arg0, int arg1, int arg2, int arg3) {
        field544++;
        int var4 = 7 % ((14 - arg2) / 47);
        class539 var5 = class210.method1479(arg0, -128, arg1);
        if (var5 == null) {
            return -1;
        } else if (arg3 >= 0 && arg3 < var5.field7320.length) {
            return var5.field7320[arg3];
        } else {
            return -1;
        }
    }
}
