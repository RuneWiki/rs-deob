import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class369 extends class161 {

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "[Lpfa;")
    public class249[] field5217;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "Lsv;")
    public static class570 field5215 = new class570(46, 3);

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Luf;I)V")
    public static final void method2205(class519 arg0, int arg1) {
        field5216++;
        class519 var2 = class188.method1357(arg0, (byte) 106);
        if (arg1 != 46) {
            method2206(40);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class709.field9923;
            var4 = class448.field6174;
        } else {
            var3 = var2.field7128;
            var4 = var2.field7255;
        }
        class58.method619(var3, var4, false, 5, arg0);
        class458.method2680(var3, 27797, var4, arg0);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
    public static void method2206(int arg0) {
        field5215 = null;
        if (arg0 != -23571) {
            field5215 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "([Lpfa;)V")
    public class369(class249[] arg0) {
        this.field5217 = arg0;
    }
}
