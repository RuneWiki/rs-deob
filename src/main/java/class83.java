import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class83 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lfh;")
    public static class178 field1148 = new class178(5000);

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Leg;")
    public static class272 field1150 = new class272(4);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static final void method604(boolean arg0) {
        field1149++;
        if (arg0) {
            field1148 = null;
        }
        Container var1;
        if (class87.field1188 != null) {
            var1 = class87.field1188;
        } else if (class284.field4537 == null) {
            var1 = class250.field4006.field4090;
        } else {
            var1 = class284.field4537;
        }
        class207.field3337 = var1.getSize().width;
        class7.field107 = var1.getSize().height;
        if (class284.field4537 == var1) {
            Insets var2 = class284.field4537.getInsets();
            class207.field3337 -= var2.right + var2.left;
            class7.field107 -= var2.top + var2.bottom;
        }
        if (class195.method1321(true) >= 2) {
            class105.field1825 = 0;
            class18.field213 = 0;
            class97.field1469 = class7.field107;
            class107.field1856 = class207.field3337;
        } else {
            class18.field213 = 0;
            class97.field1469 = 503;
            class107.field1856 = 765;
            class105.field1825 = (class207.field3337 - 765) / 2;
        }
        class38.field458.setSize(class107.field1856, class97.field1469);
        if (class284.field4537 == var1) {
            Insets var3 = class284.field4537.getInsets();
            class38.field458.setLocation(class105.field1825 + var3.left, class18.field213 + var3.top);
        } else {
            class38.field458.setLocation(class105.field1825, class18.field213);
        }
        if (class113.field1944 != -1) {
            class260.method1708(true, 51);
        }
        class241.method1588(-99);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIILli;JZ)V")
    public static final void method605(int arg0, int arg1, int arg2, int arg3, class197 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class16 var8 = new class16();
        var8.field185 = arg4;
        var8.field190 = arg1 * 128 + 64;
        var8.field192 = arg2 * 128 + 64;
        var8.field195 = arg3;
        var8.field187 = arg5;
        if (class273.field4415[arg0][arg1][arg2] == null) {
            class273.field4415[arg0][arg1][arg2] = new class99(arg0, arg1, arg2);
        }
        class273.field4415[arg0][arg1][arg2].field1491 = var8;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZ)I")
    public static final int method606(boolean arg0, boolean arg1) {
        if (!arg1) {
            method606(true, true);
        }
        field1147++;
        long var2 = class182.method1253(20215);
        for (class100 var4 = arg0 ? (class100) class129.field2158.method465((byte) -116) : (class100) class129.field2158.method461((byte) -13); var4 != null; var4 = (class100) class129.field2158.method461((byte) -13)) {
            if (var2 > (var4.field1519 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field1519 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field962;
                    class214.field3454[var5] = class108.field1876[var5];
                    var4.method544(117);
                    return var5;
                }
                var4.method544(85);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method607(byte arg0) {
        field1150 = null;
        if (arg0 != 102) {
            method604(false);
        }
        field1148 = null;
    }
}
