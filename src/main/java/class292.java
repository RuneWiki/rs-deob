import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class292 extends class252 {

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "S")
    public static short field4782 = 205;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4789 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "Lad;")
    public static class275 field4790 = new class275(50);

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    public static int field4791 = 0;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public static int field4792 = -1;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public int field4778;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public int field4779;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public int field4780;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public int field4784;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "Lgi;")
    public static class164 field4783;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
    public abstract void method452(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V")
    public static final void method2013(int arg0) {
        field4788++;
        if (arg0 > -19) {
            method2016(-100, -121);
        }
        class45.field664.method1873(-7401);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V")
    public abstract void method444(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
    public abstract void method451(int arg0, int arg1);

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIIII)V")
    public final void method2014(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4787++;
        if (arg1 >= -36) {
            return;
        }
        int var6 = this.field4781 << 3;
        int var7 = (arg4 << 4) + (var6 & 0xF);
        int var8 = this.field4778 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        this.method454(var6, var8, var7, var9, arg3, arg2);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)V")
    public abstract void method450(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public static final void method2015(boolean arg0) {
        field4777++;
        if (!arg0) {
            return;
        }
        class49.field717 = null;
        class119.method822(-1, 0, 0, (byte) -60, class68.field1089, 0, class195.field3161, 0, class154.field2463);
        if (class49.field717 != null) {
            class219.method1493(0, -1412584499, class263.field4304.field3996, class49.field717, 0, class154.field2463, class137.field2217, class26.field474, class195.field3161, -121);
            class49.field717 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
    public abstract void method445(int arg0, int arg1);

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method2016(int arg0, int arg1) {
        if (arg1 < 36) {
            field4791 = -122;
        }
        field4785++;
        return class226.field3550[arg0].length() > 0 ? class188.field3083[arg0] + class70.field1127 + class226.field3550[arg0] : class188.field3083[arg0];
    }

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "(I)V")
    public static void method2017(int arg0) {
        field4783 = null;
        if (arg0 != -31370) {
            field4790 = null;
        }
        field4790 = null;
        field4789 = null;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(II)V")
    public abstract void method463(int arg0, int arg1);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIII)V")
    public abstract void method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
