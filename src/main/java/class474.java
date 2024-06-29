import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class474 {

    @OriginalMember(owner = "client!it", name = "a", descriptor = "[I")
    public static int[] field6691 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field6695;

    // $FF: synthetic field
    @OriginalMember(owner = "client!it", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field6696;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
    public static final void method2693(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field6692++;
            class217.field2771 = arg0 - class614.field8850;
            class124.field1543 = arg1 - class614.field8848;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lon;I)V")
    public static final void method2694(class596 arg0, int arg1) {
        if (arg1 != -14227) {
            field6691 = null;
        }
        field6694++;
        if (class199.field2605 == null) {
            return;
        }
        class246 var2 = null;
        if (arg0.field8602 == 0) {
            var2 = (class246) class146.method798(arg0.field8599, arg0.field8595, arg0.field8590);
        }
        if (arg0.field8602 == 1) {
            var2 = (class246) class234.method1474(arg0.field8599, arg0.field8595, arg0.field8590);
        }
        if (arg0.field8602 == 2) {
            var2 = (class246) class49.method273(arg0.field8599, arg0.field8595, arg0.field8590, field6696 == null ? (field6696 = method2697("vaa")) : field6696);
        }
        if (arg0.field8602 == 3) {
            var2 = (class246) class380.method2313(arg0.field8599, arg0.field8595, arg0.field8590);
        }
        if (var2 == null) {
            arg0.field8592 = 0;
            arg0.field8600 = 0;
            arg0.field8596 = -1;
        } else {
            arg0.field8596 = var2.method52(-17817);
            arg0.field8592 = var2.method57(arg1 - 14958);
            arg0.field8600 = var2.method60(1901);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public static void method2695(int arg0) {
        if (arg0 != 2) {
            method2694(null, 59);
        }
        field6691 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V")
    public static final void method2696(byte arg0, int arg1) {
        field6693++;
        class632 var2 = class641.method3699(-118, 14, arg1);
        int var3 = 78 % ((arg0 - 12) / 55);
        var2.method3655(0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2697(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
