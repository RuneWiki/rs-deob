import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class107 {

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lm;")
    public static class242 field1413 = new class242();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lir;")
    public static class185 field1408;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lir;")
    public static class185 field1412;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Lik;")
    public static class31 field1411;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static final void method809(int arg0) {
        field1409++;
        int var1 = -21 % ((arg0 - 37) / 62);
        for (int var2 = 0; var2 < class215.field2999; var2++) {
            class178 var3 = class63.method559(var2, (byte) -122);
            if (var3 != null && var3.field2389 == 0) {
                class385.field5632[var2] = 0;
                class100.field1325[var2] = 0;
            }
        }
        class377.field5517 = new class453(16);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lfb;B)V")
    public static final void method810(class341 arg0, byte arg1) {
        if (arg1 != -41) {
            return;
        }
        for (int var2 = 0; var2 < class230.field3156; var2++) {
            int var3 = arg0.method2223(-1);
            int var4 = arg0.method2239(-1076227960);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class53.field823[var3] != null) {
                class53.field823[var3].field5945 = var4;
            }
        }
        field1410++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method811(String arg0, int arg1) {
        field1406++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class391.field5714; var2++) {
            if (arg0.equalsIgnoreCase(class30.field488[var2])) {
                return true;
            }
        }
        if (arg1 != 65535) {
            field1412 = null;
        }
        return arg0.equalsIgnoreCase(class383.field5609.field4650);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static void method812(int arg0) {
        field1411 = null;
        field1412 = null;
        if (arg0 == 0) {
            field1413 = null;
            field1408 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILde;ILjava/awt/Canvas;Lwh;I)Ltj;")
    public static final class298 method813(int arg0, class364 arg1, int arg2, Canvas arg3, class288 arg4, int arg5) {
        field1407++;
        int var6 = -1;
        if (arg5 != 8) {
            field1413 = null;
        }
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class85.field1168[var7]) {
                var6 = var7;
                class85.field1168[var7] = true;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("No free toolkit instances");
        } else if (arg2 == 0) {
            return class211.method1386(arg4, arg3, 0, var6);
        } else if (arg2 == 1) {
            return class1.method3(arg4, var6, arg0, arg1, false, arg3);
        } else {
            throw new IllegalArgumentException("Unsupported mode");
        }
    }
}
