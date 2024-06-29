import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class118 {

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[S")
    public static short[] field1790 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Z")
    public static boolean field1789 = false;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[Lsj;")
    public static class50[] field1794 = new class50[14];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
    public static final void method859(int arg0, int arg1) {
        field1792++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class45.method382(arg1 + 5);
        } else if (arg0 == 2) {
            class296.method1976(arg1 - 16476);
        } else if (arg0 == 3) {
            class166.method1210(-101);
        } else {
            throw new RuntimeException();
        }
        if (arg1 != -4) {
            method862(42, 28);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lub;Ljava/lang/String;I)Lkm;")
    public static final class297 method860(class92 arg0, String arg1, int arg2) {
        int var3 = arg0.method717(104, arg1);
        field1793++;
        if (var3 == -1) {
            return new class297(0);
        }
        int[] var4 = arg0.method724(var3, -108);
        class297 var5 = new class297(var4.length);
        int var6 = 0;
        if (arg2 != 21382) {
            field1790 = null;
        }
        while (var5.field4783 > var6) {
            class31 var7 = new class31(arg0.method721((byte) -117, var3, var4[var6]));
            var5.field4797[var6] = var7.method262(11386);
            var5.field4780[var6] = var7.method266(-129);
            var5.field4796[var6] = var7.method300((byte) -30);
            var5.field4792[var6] = var7.method300((byte) -30);
            var6++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Lmk;")
    public static final class106 method861(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        return var3 == null || var3.field377 == null ? null : var3.field377;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public static final void method862(int arg0, int arg1) {
        if (arg1 < 103) {
            method861(-31, 71, 108);
        }
        field1791++;
        class198 var2 = (class198) class94.field1480.method2043((long) arg0, -1);
        if (var2 != null) {
            var2.method995((byte) -13);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)I")
    public static int method863(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method864(boolean arg0) {
        field1790 = null;
        field1794 = null;
        if (!arg0) {
            field1789 = false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method865(int arg0, String arg1, boolean arg2) {
        field1788++;
        if (arg2) {
            try {
                class135.field2021.getAppletContext().showDocument(new URL(class135.field2021.getCodeBase(), arg1), "_blank");
            } catch (Exception var3) {
            }
        } else {
            try {
                class289.method1926(true, "loggedout", class123.field1863.field63);
            } catch (Throwable var5) {
            }
            try {
                class135.field2021.getAppletContext().showDocument(new URL(class135.field2021.getCodeBase(), arg1), "_top");
            } catch (Exception var4) {
            }
        }
        if (arg0 < 21) {
            method862(-96, -16);
        }
    }
}
