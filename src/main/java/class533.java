import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class533 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lgg;")
    public static class114 field7487 = new class114(8);

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public int field7488;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lrk;")
    public class277 field7491;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
    public int[] field7492;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([FII)[F")
    public static final float[] method3033(float[] arg0, int arg1, int arg2) {
        field7489++;
        float[] var3 = new float[arg2];
        if (arg1 == 8) {
            class617.method3387(arg0, 0, var3, 0, arg2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILop;)Z")
    public static final boolean method3034(int arg0, class559 arg1) {
        field7490++;
        class290 var2 = class358.field5112.method890(arg1.method735(24123), false);
        if (var2.field3736 == -1) {
            return true;
        }
        class128 var3 = class70.field946.method1483(var2.field3736, (byte) -1);
        if (var3.field1551 == -1) {
            return true;
        } else {
            if (arg0 > -54) {
                method3035(107);
            }
            return var3.method830(101);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method3035(int arg0) {
        field7487 = null;
        if (arg0 < 0) {
            field7487 = null;
        }
    }
}
