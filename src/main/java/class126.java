import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class126 {

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "Z")
    public static boolean field1564 = false;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field1565 = -1;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "[Z")
    public static boolean[] field1570 = new boolean[5];

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1571 = null;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1572 = new String[100];

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIII)I")
    public static final int method677(int arg0, int arg1, int arg2, int arg3) {
        field1563++;
        int var4 = arg2 / arg0;
        int var5 = 90 / ((arg3 - 83) / 33);
        int var6 = arg2 & arg0 - 1;
        int var7 = arg1 / arg0;
        int var8 = arg1 & arg0 - 1;
        int var9 = class541.method3002(var7, 1, var4);
        int var10 = class541.method3002(var7, 1, var4 + 1);
        int var11 = class541.method3002(var7 + 1, 1, var4);
        int var12 = class541.method3002(var7 + 1, 1, var4 + 1);
        int var13 = class313.method1954(var9, var6, 212669616, var10, arg0);
        int var14 = class313.method1954(var11, var6, 212669616, var12, arg0);
        return class313.method1954(var13, var8, 212669616, var14, arg0);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Ln;ILkr;Ljava/awt/Canvas;I)Lqa;")
    public static final class167 method678(class473 arg0, int arg1, class329 arg2, Canvas arg3, int arg4) {
        field1569++;
        if (!class395.method2370(true)) {
            throw new RuntimeException("");
        } else if (class558.method3140("jaggl", (byte) -46)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, arg1, 24, 0, arg4);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class442 var8 = new class442(var5, arg3, var6, arg0, arg2, arg4);
            var8.method3326(arg1 - 125);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!gu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1566++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    public static final void method679(int arg0) {
        if (arg0 != 19454) {
            method677(80, 110, -45, -117);
        }
        class157.field2032 = class627.field9137.field2028 + class627.field9137.field2037 + 2;
        class478.field6726 = class621.field8953.field2028 + class621.field8953.field2037 + 2;
        field1568++;
        class14.field143 = new String[500];
        for (int var1 = 0; var1 < class14.field143.length; var1++) {
            class14.field143[var1] = "";
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    public static void method680(byte arg0) {
        field1572 = null;
        field1570 = null;
        if (arg0 > -36) {
            method679(-46);
        }
        field1571 = null;
    }
}
