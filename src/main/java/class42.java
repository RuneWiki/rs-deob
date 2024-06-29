import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class42 extends class395 {

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field619;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Lrb;")
    public static class283 field618 = new class283(33, 20);

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "Lqj;")
    public static class418 field624 = new class418();

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "F")
    public static float field622;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "Lgp;")
    public static class464 field623;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "[[I")
    public static int[][] field626;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)Z")
    public static final boolean method287(byte arg0) {
        field617++;
        if (arg0 != 27) {
            field622 = -0.9039838F;
        }
        try {
            return class425.method2534(false);
        } catch (IOException var4) {
            class279.method1615((byte) 113);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class322.field4426 == null ? -1 : class322.field4426.method1628(true)) + "," + (class530.field7804 == null ? -1 : class530.field7804.method1628(true)) + "," + (class72.field1037 == null ? -1 : class72.field1037.method1628(true)) + " - " + class399.field5722 + "," + (class110.field1775 + class81.field1158.field263[0]) + "," + (class81.field1158.field257[0] + class399.field5727) + " - ";
            for (int var3 = 0; class399.field5722 > var3 && var3 < 50; var3++) {
                var2 = var2 + class508.field7414.field4336[var3] + ",";
            }
            class187.method1255(var5, var2, -73);
            class384.method2276(arg0 ^ 0x1B, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(B)V")
    public static void method288(byte arg0) {
        field626 = null;
        field624 = null;
        if (arg0 != -42) {
            method288((byte) 28);
        }
        field623 = null;
        field618 = null;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method289(int arg0) {
        field621++;
        return arg0 == 20239 ? this.field619 : null;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class42(Object arg0, int arg1) {
        super(arg1);
        this.field619 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)Z")
    public final boolean method290(int arg0) {
        field620++;
        return arg0 < 102 ? false : false;
    }
}
