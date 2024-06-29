import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class109 extends class139 {

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "Ljl;")
    public class253 field1578;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "[[B")
    public static byte[][] field1570 = new byte[250][];

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field1571 = -1;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1574 = "rating: ";

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "[I")
    public static int[] field1572 = new int[32];

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1575 = "Examine";

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Lcc;")
    public static class216 field1577 = new class216(4);

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILpc;IIIIB)Lpc;")
    public static final class22 method805(int arg0, class22 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        long var7 = (long) arg2;
        class22 var9 = (class22) class78.field1127.method1553(var7, (byte) -109);
        field1576++;
        if (var9 == null) {
            class173 var10 = class173.method1281(class114.field1646, arg2, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1293(64, 768, -50, -10, -50);
            class78.field1127.method1551(var9, 0, var7);
        }
        int var11 = arg1.method146();
        if (arg6 > -91) {
            return null;
        }
        int var12 = arg1.method166();
        int var13 = arg1.method140();
        int var14 = arg1.method149();
        class22 var15 = var9.method158(true, true, true);
        if (arg3 != 0) {
            var15.method147(arg3);
        }
        class246 var16 = (class246) var15;
        if (arg0 != class129.method930(arg5 + var13, arg4 + var11, 61, class58.field826) || class129.method930(arg5 + var14, arg4 + var12, 89, class58.field826) != arg0) {
            for (int var17 = 0; var17 < var16.field4065; var17++) {
                var16.field4049[var17] += class129.method930(var16.field4047[var17] + arg5, var16.field4053[var17] - -arg4, 61, class58.field826) - arg0;
            }
            var16.field4061 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
    public static void method806(byte arg0) {
        field1575 = null;
        field1574 = null;
        field1570 = null;
        field1577 = null;
        if (arg0 > -124) {
            method805(-50, (class22) null, 23, -21, 57, -4, (byte) -78);
        }
        field1572 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V")
    public static final void method807(int arg0, int arg1, int arg2, int arg3) {
        field1573++;
        class201 var4 = class94.method738(-128, arg0, 9);
        var4.method1477(0);
        var4.field3226 = arg1;
        int var5 = -56 / ((arg2 + 42) / 34);
        var4.field3219 = arg3;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Ljl;)V")
    public class109(class253 arg0) {
        this.field1578 = arg0;
    }
}
