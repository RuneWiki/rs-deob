import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class677 {

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method3853(int arg0, byte[] arg1) {
        if (arg0 > -65) {
            field9619 = 76;
        }
        field9620++;
        class479 var2 = new class479(arg1);
        int var3 = var2.method2886(true);
        int var4 = var2.method2868(-67);
        if (var4 < 0 || !(class394.field5662 == 0 || class394.field5662 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2867(-290150072, var5, var4, 0);
            return var5;
        } else {
            int var6 = var2.method2868(-71);
            if (var6 < 0 || class394.field5662 != 0 && class394.field5662 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class130.method908(var7, var6, arg1, var4, 9);
            } else {
                class186 var8 = class342.field4705;
                synchronized (class342.field4705) {
                    class342.field4705.method1318(var7, var2, -107);
                }
            }
            return var7;
        }
    }
}
