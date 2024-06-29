import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class268 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
    public static int[] field4102 = new int[4096];

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "[I")
    public static int[] field4107;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lae;")
    public static class174 field4105;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()I")
    public abstract int method106();

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIJILnl;)V")
    public abstract void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class97 arg10);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIII)V")
    public static final void method1767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 8) {
            method1770(68);
        }
        field4110++;
        int var8 = arg3 + 1;
        class154.method1028(-353, class216.field3264[arg3], arg2, arg1, arg5);
        int var9 = arg4 - 1;
        class154.method1028(-353, class216.field3264[arg4], arg2, arg1, arg5);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class216.field3264[var6];
            var7[arg1] = var7[arg5] = arg2;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V")
    public static final void method1768(int arg0, byte arg1) {
        class160.field2244.method536(111, arg0);
        field4104++;
        if (arg1 <= -73) {
            class57.field819.method536(-95, arg0);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)V")
    public static final void method1769(int arg0, byte arg1) {
        class221.field3319.method536(-57, arg0);
        class195.field2695.method536(-102, arg0);
        if (arg1 < -56) {
            field4108++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1770(int arg0) {
        field4102 = null;
        if (arg0 == 20572) {
            field4107 = null;
            field4105 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)V")
    public abstract void method170(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static final void method1771(byte arg0) {
        if (arg0 > -109) {
            field4107 = null;
        }
        field4101++;
        class41.field611.method546(-90762264);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Lsa;")
    public class268 method1772(int arg0, int arg1, int arg2) {
        field4103++;
        return this;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lsa;IIIZ)V")
    public void method1773(class268 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4106++;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()Z")
    public boolean method1774() {
        field4109++;
        return false;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4102[var0] = class83.method519(var0, (byte) 10);
        }
        field4107 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
    }
}
