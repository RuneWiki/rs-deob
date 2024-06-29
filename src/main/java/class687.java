import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class687 extends class71 {

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "F")
    public float field9556;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public int field9558;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public int field9554;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    private int field9564;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    private int field9562;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public int field9555;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "S")
    public static short field9561 = 205;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "Lww;")
    public static class288 field9560 = new class288(6, 1);

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field9563 = 0;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field9552;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field9559;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)I", line = 3)
    public final int method3866(byte arg0) {
        field9557++;
        return arg0 > -38 ? 108 : this.field9564;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)I", line = 14)
    public final int method3867(boolean arg0) {
        if (arg0) {
            this.method1730(-1.6277533F, (byte) 2);
        }
        field9552++;
        return this.field9554;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)I", line = 25)
    public final int method3868(int arg0) {
        if (arg0 != 6) {
            this.method3871(-102);
        }
        field9549++;
        return this.field9562;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 39)
    public static void method3869(int arg0) {
        field9560 = null;
        if (arg0 != -19758) {
            field9560 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)I", line = 51)
    public final int method3870(int arg0) {
        field9553++;
        if (arg0 <= 82) {
            this.method3867(false);
        }
        return this.field9555;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)F", line = 64)
    public final float method3871(int arg0) {
        field9550++;
        return arg0 == 16043 ? this.field9556 : -0.2916093F;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 83)
    public static final void method3872(int arg0, int arg1) {
        field9551++;
        if (arg1 <= -113) {
            class346 var2 = class299.method1976(0, 10, arg0);
            var2.method2208(-1719);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)I", line = 101)
    public final int method3873(byte arg0) {
        if (arg0 != -7) {
            field9561 = 126;
        }
        field9559++;
        return this.field9558;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IIIIIF)V", line = 119)
    public class687(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field9556 = arg5;
        this.field9558 = arg0;
        this.field9554 = arg1;
        this.field9564 = arg3;
        this.field9562 = arg4;
        this.field9555 = arg2;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
    public abstract void method1733(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(FB)V")
    public abstract void method1730(float arg0, byte arg1);
}
