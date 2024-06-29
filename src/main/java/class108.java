import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class108 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "[I")
    public static int[] field1665 = new int[5];

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBLn;Ljava/awt/Canvas;)Lqa;")
    public static final class207 method760(int arg0, byte arg1, class17 arg2, Canvas arg3) {
        field1662++;
        if (arg1 >= -69) {
            method762(false);
        }
        return new class583(arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Llm;Z)Z")
    public static final boolean method761(class425 arg0, boolean arg1) {
        boolean var2 = client.field3472 == class590.field8430;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method338(-25405);
        if (arg0.field6036 < 0 || arg0.field6028 < 0 || arg0.field6030 >= class332.field4447 || arg0.field6031 >= class34.field624) {
            return false;
        }
        for (int var6 = arg0.field6036; var6 <= arg0.field6030; var6++) {
            for (int var9 = arg0.field6028; var9 <= arg0.field6031; var9++) {
                class622 var10 = class452.method2656(arg0.field6035, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field6036) {
                        var11++;
                    }
                    if (var6 < arg0.field6030) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field6028) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field6031) {
                        var11 += 2;
                    }
                    class559 var12 = class525.method3025(arg0, var11, 15208);
                    class559 var13 = var10.field8973;
                    if (var13 == null) {
                        var10.field8973 = var12;
                    } else {
                        while (var13.field7736 != null) {
                            var13 = var13.field7736;
                        }
                        var13.field7736 = var12;
                    }
                    var10.field8983 = (byte) (var10.field8983 | var11);
                    if (var2 && (class473.field6662[var6][var9] & 0xFF000000) != 0) {
                        var3 = class473.field6662[var6][var9];
                        var4 = class246.field3418[var6][var9];
                        var5 = class590.field8423[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field6036; var7 <= arg0.field6030; var7++) {
                for (int var8 = arg0.field6028; var8 <= arg0.field6031; var8++) {
                    if ((class473.field6662[var7][var8] & 0xFF000000) == 0) {
                        class473.field6662[var7][var8] = var3;
                        class246.field3418[var7][var8] = var4;
                        class590.field8423[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class45.field858[class510.field7140++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public static final void method762(boolean arg0) {
        class639.field9301 = null;
        class58.field1054 = false;
        field1663++;
        class40.method413(-101);
        if (!arg0) {
            field1665 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
    public static final void method763(int arg0, byte arg1) {
        int var2 = -60 % ((arg1 + 11) / 61);
        field1661++;
        class314 var3 = class483.method2819(8, arg0, 21303);
        var3.method1962((byte) 0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method764(byte arg0) {
        field1665 = null;
        if (arg0 <= 48) {
            method764((byte) -18);
        }
    }
}
