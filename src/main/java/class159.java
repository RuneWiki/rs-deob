import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class159 {

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!kt", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field2007++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILaa;Lha;ILsba;II)V", line = 16)
    public static final void method952(int arg0, int arg1, int arg2, class487 arg3, class60 arg4, int arg5, class218 arg6, int arg7, int arg8) {
        if (arg5 != -2040004466) {
            method952(-86, 94, 35, null, null, 24, null, -1, -62);
        }
        field2004++;
        class292 var9 = class224.field2894.method1647(-72, arg1);
        if (var9 == null || !var9.field3863 || !var9.method1736(34, class386.field5455)) {
            return;
        }
        if (var9.field3903 != null) {
            int[] var10 = new int[var9.field3903.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var28;
                if (class8.field57 == 4) {
                    var28 = (int) class183.field2237 & 0x3FFF;
                } else {
                    var28 = (int) class183.field2237 + class514.field6956 & 0x3FFF;
                }
                int var29 = class15.field113[var28];
                int var30 = class15.field115[var28];
                if (class8.field57 != 4) {
                    var30 = var30 * 256 / (class283.field3747 + 256);
                    var29 = var29 * 256 / (class283.field3747 + 256);
                }
                var10[var11 * 2] = ((var9.field3903[var11 * 2 + 1] * 4 + arg8) * var29 + ((arg0 + (var9.field3903[var11 * 2] * 4)) * var30) >> 14) + arg6.field2781 / 2 + arg7;
                var10[var11 * 2 + 1] = arg6.field2718 / 2 + arg2 - ((var9.field3903[var11 * 2 + 1] * 4 + arg8) * var30 - (var9.field3903[var11 * 2] * 4 + arg0) * var29 >> 14);
            }
            class228.method1358(arg4, var10, var9.field3884, arg6.field2675, arg6.field2767);
            if (var9.field3885 <= 0) {
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    arg4.method433(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 1 + 2], var9.field3867[var9.field3862[var12] & 0xFF], 1, arg3, arg7, arg2);
                }
                arg4.method433(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field3867[var9.field3862[var9.field3862.length - 1] & 0xFF], 1, arg3, arg7, arg2);
            } else {
                for (int var13 = 0; var13 < var10.length / 2 - 1; var13++) {
                    int var21 = var10[var13 * 2];
                    int var22 = var10[var13 * 2 + 1];
                    int var23 = var10[(var13 + 1) * 2];
                    int var24 = var10[(var13 + 1) * 2 + 1];
                    if (var21 > var23) {
                        int var25 = var21;
                        var21 = var23;
                        int var26 = var22;
                        var22 = var24;
                        var23 = var25;
                        var24 = var26;
                    } else if (var21 == var23 && var22 > var24) {
                        int var27 = var22;
                        var22 = var24;
                        var24 = var27;
                    }
                    arg4.method409(var21, var22, var23, var24, var9.field3867[var9.field3862[var13] & 0xFF], 1, arg3, arg7, arg2, var9.field3885, var9.field3889, var9.field3857);
                }
                int var14 = var10[var10.length - 2];
                int var15 = var10[var10.length - 1];
                int var16 = var10[0];
                int var17 = var10[1];
                if (var16 < var14) {
                    int var19 = var14;
                    int var20 = var15;
                    var14 = var16;
                    var16 = var19;
                    var15 = var17;
                    var17 = var20;
                } else if (var14 == var16 && var15 > var17) {
                    int var18 = var15;
                    var15 = var17;
                    var17 = var18;
                }
                arg4.method409(var14, var15, var16, var17, var9.field3867[var9.field3862[var9.field3862.length - 1] & 0xFF], 1, arg3, arg7, arg2, var9.field3885, var9.field3889, var9.field3857);
            }
        }
        class680 var31 = null;
        if (var9.field3879 != -1) {
            var31 = var9.method1739((byte) 92, arg4, false);
            if (var31 != null) {
                class51.method301(arg2, arg8, arg7, arg6, arg3, arg0, (byte) -24, var31);
            }
        }
        if (var9.field3901 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method676();
        }
        class61 var33 = class497.field6764;
        class377 var34 = class86.field1180;
        if (var9.field3902 == 1) {
            var34 = class294.field3954;
            var33 = class399.field5650;
        }
        if (var9.field3902 == 2) {
            var34 = class616.field8643;
            var33 = class214.field2575;
        }
        class712.method3990(arg0, arg7, var34, arg2, arg6, var32, (byte) 109, var9.field3901, arg3, var9.field3894, arg8, var33);
        return;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(I)V", line = 190)
    public class159(int arg0) {
        this.field2006 = arg0;
    }
}
