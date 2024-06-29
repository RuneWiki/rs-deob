import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class578 {

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "[I")
    public static int[] field7698 = new int[14];

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "Z")
    public static boolean field7699;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILfg;)I", line = 4)
    public static final int method3173(int arg0, class117 arg1) {
        field7696++;
        if (arg0 != 14) {
            field7699 = true;
        }
        String var2 = class690.method3834(arg1, (byte) -106);
        int[] var3 = null;
        if (class702.method3886(arg1.field1993, (byte) 34)) {
            var3 = class193.field2826.method1047((int) arg1.field1996, -1).field7654;
        } else if (arg1.field1992 != -1) {
            var3 = class193.field2826.method1047(arg1.field1992, -1).field7654;
        } else if (class264.method1611(arg1.field1993, false)) {
            class280 var6 = (class280) class616.field8143.method2918((long) ((int) arg1.field1996), (byte) 75);
            if (var6 != null) {
                class287 var7 = var6.field3983;
                class419 var8 = var7.field4052;
                if (var8.field5753 != null) {
                    var8 = var8.method2401(false, class80.field1261);
                }
                if (var8 != null) {
                    var3 = var8.field5791;
                }
            }
        } else if (class407.method2336(arg1.field1993, (byte) 124)) {
            Object var4 = null;
            class58 var5;
            if (arg1.field1993 == 1010) {
                var5 = class470.field6288.method1258((int) arg1.field1996, (byte) -47);
            } else {
                var5 = class470.field6288.method1258((int) (arg1.field1996 >>> 32 & 0x7FFFFFFFL), (byte) -113);
            }
            if (var5.field888 != null) {
                var5 = var5.method486((byte) -113, class80.field1261);
            }
            if (var5 != null) {
                var3 = var5.field811;
            }
        }
        if (var3 != null) {
            var2 = var2 + class179.method1201(-21130, var3);
        }
        int var9 = class193.field2823.method2838(class651.field8812, var2, (byte) -76);
        if (arg1.field2000) {
            var9 += class628.field8474.method1035() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V", line = 78)
    public static void method3174(int arg0) {
        if (arg0 <= 99) {
            method3173(-10, null);
        }
        field7698 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;II)V", line = 90)
    public static final void method3175(String arg0, boolean arg1, String arg2, int arg3, int arg4) {
        field7695++;
        class476.method2671(arg3, arg4, true, arg0, (byte) -65, arg2, arg1);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BLeh;)Lica;", line = 100)
    public static final class621 method3176(byte arg0, class335 arg1) {
        field7697++;
        int var2 = arg1.method2001((byte) -83);
        class212 var3 = class287.method1770(true)[arg1.method2034(255)];
        class679 var4 = class601.method3318(true)[arg1.method2034(255)];
        int var5 = -15 % ((6 - arg0) / 50);
        int var6 = arg1.method2022(-29089);
        int var7 = arg1.method2022(-29089);
        return new class621(var2, var3, var4, var6, var7);
    }
}
