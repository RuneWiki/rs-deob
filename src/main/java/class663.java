import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class663 {

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "S")
    public short field9322;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public int field9319;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public int field9321;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
    public int field9327;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "Z")
    public boolean field9329;

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "I")
    public int field9326;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public int field9320;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "S")
    public short field9328;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "B")
    public byte field9324;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "S")
    public short field9323;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "Lqk;")
    public static class1 field9325 = new class1(72, 2);

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "[I")
    public static int[] field9330 = new int[4096];

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lib;III)V", line = 3)
    public static final void method3784(class723 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0) {
            method3785(-59);
        }
        field9318++;
        int[] var4 = new int[4];
        class335.method2121(var4, 0, var4.length, arg1);
        class764.method4220(arg3, 10, arg0, var4);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V", line = 32)
    public static void method3785(int arg0) {
        field9325 = null;
        int var1 = -61 % ((13 - arg0) / 54);
        field9330 = null;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 42)
    public class663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9322 = (short) arg5;
        this.field9319 = arg3;
        this.field9321 = arg2;
        this.field9327 = arg0;
        this.field9329 = arg10;
        this.field9326 = arg1;
        this.field9320 = arg11;
        this.field9328 = (short) arg4;
        this.field9324 = (byte) arg8;
        this.field9323 = (short) arg6;
    }
}
