import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class372 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[[B")
    public static byte[][] field5199 = new byte[1000][];

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lam;")
    public static class286 field5203;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 6)
    public static final void method2241(int arg0, Component arg1) {
        arg1.addMouseListener(class110.field1351);
        field5202++;
        arg1.addMouseMotionListener(class110.field1351);
        arg1.addFocusListener(class110.field1351);
        if (arg0 != 0) {
            method2243(-50, 125, 24, -119, 84, (byte) 70, -110);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 26)
    public static final void method2242(int arg0) {
        field5200++;
        if (arg0 != 0) {
            method2242(108);
        }
        for (class303 var1 = (class303) class401.field5852.method814((byte) 90); var1 != null; var1 = (class303) class401.field5852.method827(-127)) {
            class421 var2 = var1.field4122;
            if (class263.field3592 != var2.field161 || class234.field3224 > var2.field6177) {
                var1.method1967(-1);
                var2.method2623((byte) -125);
            } else if (class234.field3224 >= var2.field6146) {
                if (var2.field6174 > 0) {
                    class91 var3 = class38.field397[var2.field6174 - 1];
                    if (var3 != null && var3.field152 >= 0 && (class315.field4214 * 128) > var3.field152 && var3.field154 >= 0 && var3.field154 < class340.field4549 * 128) {
                        var2.method2625(class234.field3224, -125, class201.method1098(var3.field152, var3.field154, var2.field161, (byte) 92) - var2.field6173, var3.field154, var3.field152);
                    }
                }
                if (var2.field6174 < 0) {
                    int var4 = -var2.field6174 - 1;
                    class158 var5;
                    if (class324.field4325 == var4) {
                        var5 = class427.field6264;
                    } else {
                        var5 = class85.field957[var4];
                    }
                    if (var5 != null && var5.field152 >= 0 && var5.field152 < (class315.field4214 * 128) && var5.field154 >= 0 && (class340.field4549 * 128) > var5.field154) {
                        var2.method2625(class234.field3224, -127, class201.method1098(var5.field152, var5.field154, var2.field161, (byte) -1) - var2.field6173, var5.field154, var5.field152);
                    }
                }
                var2.method2620(true, class259.field3526);
                class111.method590(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIBI)V", line = 88)
    public static final void method2243(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field5201++;
        class41[] var7 = class416.field5982;
        if (arg5 != -1) {
            field5203 = null;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class41 var9 = var7[var8];
            if (var9 != null && var9.field427 == 2) {
                class397.method2484((var9.field428 - class291.field3961 << 7) + var9.field423, arg3 >> 1, arg4 >> 1, arg2, var9.field421 * 2, arg0, (var9.field424 - class70.field767 << 7) + var9.field420, (byte) -75);
                if (class155.field1969[0] > -1 && class234.field3224 % 20 < 10) {
                    class209.field2845[var9.field435].method93(class155.field1969[0] + arg6 - 12, class155.field1969[1] + arg1 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V", line = 120)
    public static void method2244(int arg0) {
        field5203 = null;
        if (arg0 < 119) {
            method2242(61);
        }
        field5199 = null;
    }
}
