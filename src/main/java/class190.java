import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class190 extends class172 {

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "[I")
    public static int[] field3404 = new int[99];

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Z")
    public static boolean field3406;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "[I")
    public static int[] field3409;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Lid;")
    private static class149 field3405;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "J")
    public static volatile long field3412;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "Lid;")
    private static class149 field3415;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Lid;")
    public static class149 field3410;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "Lid;")
    public static class149 field3413;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Lid;")
    public static class149 field3407;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public int field3403;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
    public abstract void method285(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
    public static void method1296(byte arg0) {
        field3413 = null;
        field3409 = null;
        field3410 = null;
        field3404 = null;
        field3415 = null;
        field3407 = null;
        if (arg0 == 127) {
            field3405 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
    public abstract void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
    public abstract void method276(int arg0, int arg1);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)V")
    public abstract void method280(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V")
    public abstract void method266(int arg0, int arg1);

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)V")
    public abstract void method263(int arg0, int arg1);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public abstract void method283(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZII)V")
    public final void method1297(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3402++;
        if (!arg2) {
            this.field3403 = -92;
        }
        int var6 = this.field3411 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field3401 << 3;
        int var9 = (arg1 << 4) + (var8 & 0xF);
        this.method288(var6, var8, var7, var9, arg0, arg4);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3404[var1] = var0 / 4;
        }
        field3406 = false;
        field3409 = new int[2];
        field3405 = class60.method382("Loaded title screen", (byte) 67);
        field3412 = 0L;
        field3415 = class60.method382("Members object", (byte) 68);
        field3410 = field3405;
        field3413 = class60.method382("<)4col> x", (byte) 112);
        field3407 = field3415;
    }
}
