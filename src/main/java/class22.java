import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class22 extends class475 {

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public static int field415 = 1338;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BI)V")
    public static final void method156(byte arg0, int arg1) {
        class346.field4413 = arg1;
        if (arg0 > 30) {
            class203.field2665 = -1;
            field413++;
            class203.field2665 = -1;
            class60.method342((byte) 90);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V")
    public static final void method157(int arg0, int arg1) {
        field416++;
        if (arg1 != 31898) {
            field415 = 15;
        }
        class436 var2 = class459.method2712(3, arg0, -1759243680);
        var2.method2567(16013);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)Lum;")
    public static final class82 method158(int arg0, int arg1) {
        field414++;
        int var2 = -8 % ((arg1 - 30) / 54);
        class82[] var3 = class428.method2534(-1);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class82 var5 = var3[var4];
            if (var5.field1019 == arg0) {
                return var5;
            }
        }
        return null;
    }
}
