import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class81 extends class208 {

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    private int field1302 = -32768;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Lsc;")
    public static class181 field1299 = class149.method967(255, ")1 ");

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Ldg;")
    public static class90 field1301;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method560(byte arg0) {
        if (arg0 == -62) {
            field1301 = null;
            field1299 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class249 var11 = class237.method1620(-29539, this.field1303).method655(this.field1304, 0, (class254) null, (byte) -48);
        field1305++;
        if (var11 != null) {
            var11.method194(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1302 = var11.method190();
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
    public final int method190() {
        field1300++;
        return this.field1302;
    }
}
