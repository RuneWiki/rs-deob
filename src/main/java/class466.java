import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class466 extends class82 {

    @OriginalMember(owner = "client!el", name = "O", descriptor = "Lrg;")
    public static class548 field6520 = new class548(63, -1);

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "Lcea;")
    public static class180 field6522 = new class180("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    public static int field6524 = 0;

    @OriginalMember(owner = "client!el", name = "V", descriptor = "[J")
    public static long[] field6527 = new long[32];

    @OriginalMember(owner = "client!el", name = "L", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!el", name = "U", descriptor = "[I")
    public static int[] field6526;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "[Lfo;")
    private class439[] field6518;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "(I)V", line = 3)
    public static void method2721(int arg0) {
        if (arg0 != 255) {
            field6522 = null;
        }
        field6527 = null;
        field6526 = null;
        field6522 = null;
        field6520 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IILos;)V", line = 18)
    public final void method198(int arg0, int arg1, class374 arg2) {
        int var4 = -80 / ((arg1 - -69) / 42);
        ++field6521;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field999 = arg2.method2129(-100) == 1;
                return;
            }
        } else {
            this.field6518 = new class439[arg2.method2129(-91)];
            for (int var5 = 0; this.field6518.length > var5; ++var5) {
                int var6 = arg2.method2129(-73);
                if (~var6 != -1) {
                    if (~var6 != -2) {
                        if (~var6 != -3) {
                            if (var6 == 3) {
                                this.field6518[var5] = class184.method1009(arg2, 122);
                            }
                        } else {
                            this.field6518[var5] = class166.method926(arg2, 1);
                        }
                    } else {
                        this.field6518[var5] = class53.method300(arg2, true);
                    }
                } else {
                    this.field6518[var5] = class507.method2912((byte) 122, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)[[I", line = 90)
    public final int[][] method481(int arg0, int arg1) {
        ++field6519;
        if (arg0 != 1000) {
            this.method198(88, -115, (class374) null);
        }
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (super.field992.field7962) {
            int var4 = class629.field9033;
            int var5 = class347.field4469;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field992.method3181(-1);
            this.method2722(var6, 0);
            for (int var8 = 0; ~class347.field4469 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class629.field9033 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class288.method1624(var15, 255) << 4;
                    var12[var14] = class288.method1624(65280, var15) >> 4;
                    var11[var14] = class288.method1624(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 155)
    public class466() {
        super(0, true);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([[II)V", line = 164)
    private final void method2722(int[][] arg0, int arg1) {
        ++field6525;
        int var3 = class629.field9033;
        int var4 = class347.field4469;
        class53.method303(-7783, arg0);
        class464.method2708(field6523, true, arg1, class129.field1590, 0);
        if (this.field6518 != null) {
            for (int var5 = 0; ~this.field6518.length < ~var5; ++var5) {
                class439 var6 = this.field6518[var5];
                int var7 = var6.field6077;
                int var8 = var6.field6076;
                if (var7 >= 0) {
                    if (var8 < 0) {
                        var6.method501(var4, (byte) -119, var3);
                    } else {
                        var6.method500((byte) 3, var4, var3);
                    }
                } else if (~var8 <= -1) {
                    var6.method498(var4, var3, 46);
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II)[I", line = 210)
    public final int[] method201(int arg0, int arg1) {
        ++field6517;
        if (arg1 != 12218) {
            this.field6518 = null;
        }
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            this.method2722(super.field990.method1568(false), arg1 ^ 12218);
        }
        return var3;
    }
}
