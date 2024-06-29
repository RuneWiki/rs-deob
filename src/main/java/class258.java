import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class258 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Lli;")
    public static class185 field4588 = class245.method1649("Sprites geladen)3", 124);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field4587 = 0;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Lli;")
    public static class185 field4592 = class245.method1649("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 122);

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
    public static int[] field4591;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[[[B")
    public static byte[][][] field4590;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lja;")
    public static final class53 method1752(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        }
        field4589++;
        class53 var2 = (class53) class194.field3581.method82(-11, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class188.field3480.method1688(0, 0, arg1);
        class53 var4 = new class53(var3);
        var4.method1840(class282.field4979, (int[]) null);
        class194.field3581.method84(arg0 ^ 0x57, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static final void method1753(byte arg0) {
        field4594++;
        if (arg0 != -4) {
            field4588 = null;
        }
        try {
            if (class32.field527 == 1) {
                int var1 = class113.field2052.method326((byte) 78);
                if (var1 > 0 && class113.field2052.method322((byte) 8)) {
                    int var2 = var1 - class78.field1360;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class113.field2052.method346((byte) -78, var2);
                } else {
                    class113.field2052.method317(21629);
                    class113.field2052.method338(-26081);
                    class276.field4894 = null;
                    if (class241.field4303 == null) {
                        class32.field527 = 0;
                    } else {
                        class32.field527 = 2;
                    }
                    class163.field3054 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class113.field2052.method317(arg0 + 21633);
            class276.field4894 = null;
            class163.field3054 = null;
            class241.field4303 = null;
            class32.field527 = 0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method1754(int arg0) {
        field4588 = null;
        field4591 = null;
        field4590 = null;
        field4592 = null;
        if (arg0 < 67) {
            field4588 = null;
        }
    }
}
