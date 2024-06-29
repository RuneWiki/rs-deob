import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class467 extends class403 {

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "Lpg;")
    private class333 field6755;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    private int field6757;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    private int field6748;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    private int field6752;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    private int field6758;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    private int field6753;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    private int field6749;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "[I")
    public static int[] field6751 = new int[14];

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "[F")
    public static float[] field6756 = new float[4];

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "Lrb;")
    public static class283 field6746 = new class283(102, 28);

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "Lhi;")
    public static class45 field6760 = new class45(14, 2);

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "Lgi;")
    private class490 field6754;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "Ljava/lang/String;")
    public static String field6761;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIZI)V")
    public static final void method2716(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field6759++;
        if (arg5 <= 29) {
            return;
        }
        long var6 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg1);
        class412 var8 = (class412) class349.field5071.method1592((byte) -25, var6);
        if (var8 == null) {
            var8 = new class412();
            class349.field5071.method1586(var8, var6, 1);
        }
        if (var8.field5865.length <= arg0) {
            int[] var9 = new int[arg0 + 1];
            int[] var10 = new int[arg0 + 1];
            for (int var11 = 0; var11 < var8.field5865.length; var11++) {
                var9[var11] = var8.field5865[var11];
                var10[var11] = var8.field5866[var11];
            }
            for (int var12 = var8.field5865.length; var12 < arg0; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field5866 = var10;
            var8.field5865 = var9;
        }
        var8.field5865[arg0] = arg3;
        var8.field5866[arg0] = arg2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIII)V")
    public static final void method2717(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6747++;
        int var6 = arg1 - arg5;
        int var7 = arg4 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class482.method2865(13156520, arg1, arg2, arg5, arg0);
            }
        } else if (var6 == 0) {
            class350.method2098(arg4, -82, arg0, arg5, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg0;
                arg0 = arg5;
                int var10 = arg4;
                arg4 = arg1;
                arg5 = var9;
                arg1 = var10;
            }
            if (arg0 > arg4) {
                int var11 = arg0;
                arg0 = arg4;
                int var12 = arg5;
                arg4 = var11;
                arg5 = arg1;
                arg1 = var12;
            }
            int var13 = arg5;
            int var14 = arg4 - arg0;
            int var15 = arg1 - arg5;
            if (arg3 >= -107) {
                method2719(7, 64, 16);
            }
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg5 >= arg1 ? -1 : 1;
            if (var8) {
                for (int var19 = arg0; var19 <= arg4; var19++) {
                    class42.field626[var19][var13] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg0; var18 <= arg4; var18++) {
                    var16 += var15;
                    class42.field626[var13][var18] = arg2;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
    public static void method2718(int arg0) {
        field6761 = null;
        field6756 = null;
        field6751 = null;
        field6746 = null;
        int var1 = 43 / ((41 - arg0) / 44);
        field6760 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
    public static final void method2719(int arg0, int arg1, int arg2) {
        class532 var3 = class103.field1632[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7833 != null) {
            var3.field7833 = null;
        }
        if (var3.field7835 != null) {
            var3.field7835 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lpg;IIIIII)V")
    public class467(class333 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6755 = arg0;
        this.field6757 = arg3;
        this.field6748 = arg2;
        this.field6752 = arg5;
        this.field6758 = arg4;
        this.field6753 = arg1;
        this.field6749 = arg6;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Lgi;")
    public final class490 method1915(byte arg0) {
        if (arg0 <= 95) {
            method2719(-102, -97, 7);
        }
        field6750++;
        if (this.field6754 == null) {
            class13.field141[3] = this.field6758;
            class13.field141[1] = this.field6748;
            class13.field141[4] = this.field6752;
            class13.field141[0] = this.field6753;
            class127 var2 = this.field6755.field3988;
            class13.field141[2] = this.field6757;
            class13.field141[5] = this.field6749;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method918(class13.field141[var5], 127)) {
                    return null;
                }
                class249 var7 = var2.method914(false, class13.field141[var5]);
                int var8 = var7.field3386 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field3388 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class215.field3056[var6] = var2.method915(var4, class13.field141[var6], 1.0F, (byte) 43, false, var4);
            }
            this.field6754 = new class490(this.field6755, 6407, var4, var3, class215.field3056);
        }
        return this.field6754;
    }
}
