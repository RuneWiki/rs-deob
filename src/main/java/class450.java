import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class450 extends class276 {

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public int field6706;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    private int field6715;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    private int field6704;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "F")
    public float field6713;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public int field6712;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public int field6703;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "Lvv;")
    public static class313 field6707 = new class313(51, 6);

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)Lug;")
    public static final class322 method2693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6711++;
        long var7 = (long) arg6 * 76724863L ^ (long) arg2 * 32147369L ^ (long) arg4 * 475427L ^ (long) arg0 * 97549L ^ (long) arg1 * 67481L ^ (long) arg5 * 986053L;
        class322 var9 = (class322) class498.field7308.method1593((byte) 104, var7);
        if (var9 != null) {
            return var9;
        }
        class322 var10 = class533.field7842.method851(arg1, arg0, arg4, arg5, arg2, arg6);
        if (arg3 != 3424) {
            method2693(81, 110, -59, 107, -53, 65, -117);
        }
        class498.field7308.method1595(var10, var7, (byte) -105);
        return var10;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)I")
    public final int method2694(boolean arg0) {
        field6710++;
        if (arg0) {
            this.method2696((byte) -125);
        }
        return this.field6715;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBII)V")
    public abstract void method1111(int arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(FB)V")
    public abstract void method1109(float arg0, byte arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)I")
    public final int method2695(byte arg0) {
        if (arg0 > -23) {
            return -18;
        } else {
            field6702++;
            return this.field6704;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)I")
    public final int method2696(byte arg0) {
        field6705++;
        if (arg0 <= 117) {
            field6707 = null;
        }
        return this.field6712;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I")
    public final int method2697(int arg0) {
        field6708++;
        return arg0 < 117 ? -14 : this.field6703;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)F")
    public final float method2698(int arg0) {
        if (arg0 != 1865) {
            this.method2695((byte) 83);
        }
        field6709++;
        return this.field6713;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public static void method2699(int arg0) {
        field6707 = null;
        if (arg0 != 6) {
            field6707 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIF)V")
    public class450(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6706 = arg0;
        this.field6715 = arg3;
        this.field6704 = arg4;
        this.field6713 = arg5;
        this.field6712 = arg2;
        this.field6703 = arg1;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(Z)I")
    public final int method2700(boolean arg0) {
        if (arg0) {
            this.method2698(45);
        }
        field6714++;
        return this.field6706;
    }
}
