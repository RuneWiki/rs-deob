import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class102 extends class311 {

    @OriginalMember(owner = "client!af", name = "q", descriptor = "S")
    public short field1410;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "F")
    public static float field1411;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V")
    public static final void method778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class186 var7 = new class186();
        var7.field2699 = arg1 >> 7;
        var7.field2678 = arg2 >> 7;
        var7.field2682 = arg3 >> 7;
        var7.field2684 = arg4 >> 7;
        var7.field2695 = arg0;
        var7.field2691 = arg1;
        var7.field2689 = arg2;
        var7.field2688 = arg3;
        var7.field2681 = arg4;
        var7.field2674 = arg5;
        var7.field2677 = arg6;
        class150.field2178[class249.field3494++] = var7;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BB)Z")
    public static final boolean method779(byte[] arg0, byte arg1) {
        field1409++;
        class366 var2 = new class366(arg0);
        int var3 = var2.method2306((byte) 100);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method2306((byte) 61) == 1;
        if (arg1 != -8) {
            method779((byte[]) null, (byte) -61);
        }
        if (var4) {
            class34.method310(var2, (byte) 73);
        }
        class309.method1864(0, var2);
        return true;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class102() {
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(S)V")
    public class102(short arg0) {
        this.field1410 = arg0;
    }

    static {
        new class368("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
    }
}
