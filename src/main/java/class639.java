import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class639 extends class184 {

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "Lwu;")
    private class373 field8969;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "Lraa;")
    private class609 field8966;

    @OriginalMember(owner = "client!qt", name = "F", descriptor = "Llw;")
    private class662 field8977;

    @OriginalMember(owner = "client!qt", name = "J", descriptor = "I")
    private int field8981;

    @OriginalMember(owner = "client!qt", name = "C", descriptor = "I")
    private int field8974;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    private int field8964;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "I")
    private int field8967;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "[[F")
    private float[][] field8970;

    @OriginalMember(owner = "client!qt", name = "D", descriptor = "[[F")
    private float[][] field8975;

    @OriginalMember(owner = "client!qt", name = "B", descriptor = "[[F")
    private float[][] field8973;

    @OriginalMember(owner = "client!qt", name = "A", descriptor = "I")
    private int field8972;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "Ljf;")
    private class216 field8960;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "Lll;")
    private class366 field8961;

    @OriginalMember(owner = "client!qt", name = "I", descriptor = "Lhe;")
    private class372 field8980;

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8971;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8963;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    private int field8958;

    @OriginalMember(owner = "client!qt", name = "H", descriptor = "Z")
    public static boolean field8979 = false;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!qt", name = "E", descriptor = "[[S")
    public static short[][] field8976;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)V")
    public static final void method3668(int arg0, byte arg1) {
        field8965++;
        if (arg1 <= 26) {
            field8979 = false;
        }
        class538.field7692 = arg0;
        class93.field1289.method809(true);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIII)V")
    private final void method3669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8968++;
        long var8 = -1L;
        int var10 = (arg0 << this.field8977.field3955) + arg3;
        int var11 = (arg4 << this.field8977.field3955) + arg6;
        int var12 = this.field8977.method1786(var11, (byte) 113, var10);
        if ((arg3 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class184 var13 = this.field8980.method2287(var8, (byte) -117);
            if (var13 != null) {
                this.method3671(6511, ((class250) var13).field3618);
                return;
            }
        }
        short var14 = (short) (this.field8958++);
        if (var8 != -1L) {
            this.field8980.method2278((byte) -77, var8, new class250(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg6 == 0) {
            var15 = this.field8970[arg1][arg5];
            var16 = this.field8975[arg1][arg5];
            var17 = this.field8973[arg1][arg5];
        } else if (this.field8977.field3965 == arg3 && arg6 == 0) {
            var15 = this.field8970[arg1 + 1][arg5];
            var17 = this.field8973[arg1 + 1][arg5];
            var16 = this.field8975[arg1 + 1][arg5];
        } else if (this.field8977.field3965 == arg3 && this.field8977.field3965 == arg6) {
            var15 = this.field8970[arg1 + 1][arg5 + 1];
            var17 = this.field8973[arg1 + 1][arg5 + 1];
            var16 = this.field8975[arg1 + 1][arg5 + 1];
        } else if (arg3 == 0 && this.field8977.field3965 == arg6) {
            var15 = this.field8970[arg1][arg5 + 1];
            var17 = this.field8973[arg1][arg5 + 1];
            var16 = this.field8975[arg1][arg5 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field8977.field3965;
            float var19 = (float) arg6 / (float) this.field8977.field3965;
            float var20 = this.field8973[arg1][arg5];
            float var21 = this.field8970[arg1][arg5];
            float var22 = this.field8975[arg1][arg5];
            float var23 = this.field8973[arg1 + 1][arg5];
            float var24 = this.field8970[arg1 + 1][arg5];
            float var25 = this.field8975[arg1 + 1][arg5];
            float var26 = (this.field8970[arg1][arg5 + 1] - var21) * var18 + var21;
            float var27 = (this.field8975[arg1][arg5 + 1] - var22) * var18 + var22;
            float var28 = (this.field8973[arg1 + 1][arg5 + 1] - var23) * var18 + var23;
            float var29 = (this.field8973[arg1][arg5 + 1] - var20) * var18 + var20;
            float var30 = (this.field8970[arg1 + 1][arg5 + 1] - var24) * var18 + var24;
            float var31 = (this.field8975[arg1 + 1][arg5 + 1] - var25) * var18 + var25;
            var17 = (var28 - var29) * var19 + var29;
            var15 = (var30 - var26) * var19 + var26;
            var16 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field8966.method3533(false) - var10);
        if (arg2 < 30) {
            this.method3669(55, -76, 71, 40, -55, 95, 113);
        }
        float var33 = (float) (this.field8966.method3536(24108) - var12);
        float var34 = (float) (this.field8966.method3531(20597) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field8966.method3537(6490);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var38 + var15 * var39 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8966.method3534(-118);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF0B) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3869()) {
            this.field8971.method3863((float) var10);
            this.field8971.method3863((float) var12);
            this.field8971.method3863((float) var11);
        } else {
            this.field8971.method3864((float) var10);
            this.field8971.method3864((float) var12);
            this.field8971.method3864((float) var11);
        }
        if (this.field8969.field5629 == 0) {
            this.field8971.method3871(var47);
            this.field8971.method3871(var46);
            this.field8971.method3871(var45);
        } else {
            this.field8971.method3871(var45);
            this.field8971.method3871(var46);
            this.field8971.method3871(var47);
        }
        this.field8971.method3871(255);
        this.method3671(6511, var14);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[[ZIB)V")
    public final void method3670(int arg0, int arg1, boolean[][] arg2, int arg3, byte arg4) {
        field8959++;
        if (this.field8960 == null || this.field8981 > (arg0 + arg3) || arg3 - arg0 > this.field8974 || this.field8964 > (arg0 + arg1) || this.field8967 < arg1 - arg0) {
            return;
        }
        for (int var6 = this.field8964; var6 <= this.field8967; var6++) {
            for (int var7 = this.field8981; var7 <= this.field8974; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg1;
                if (-arg0 < var8 && arg0 > var8 && var9 > -arg0 && arg0 > var9 && arg2[arg0 + var8][arg0 + var9]) {
                    this.field8969.method2371((byte) ((int) (this.field8966.method3535((byte) -41) * 255.0F)), (byte) -37);
                    this.field8969.method2389(0, (byte) -64, this.field8961);
                    this.field8969.method2368(this.field8969.field5661, (byte) 110);
                    this.field8969.method2325(this.field8972 / 3, 0, this.field8958, 0, this.field8960, -8, class506.field7196);
                    return;
                }
            }
        }
        if (arg4 != -106) {
            this.field8973 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IS)V")
    private final void method3671(int arg0, short arg1) {
        if (arg0 != 6511) {
            this.method3669(118, 31, 24, 94, -71, -21, -103);
        }
        if (Stream.method3869()) {
            this.field8963.method3861(arg1);
        } else {
            this.field8963.method3858(arg1);
        }
        field8978++;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public static void method3672(int arg0) {
        field8976 = null;
        int var1 = -90 % ((67 - arg0) / 49);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)[I")
    public static final int[] method3673(byte arg0) {
        field8962++;
        return arg0 > -55 ? null : new int[] { class567.field8053, class357.field5182, class649.field9148 };
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lwu;Llw;Lraa;[I)V")
    public class639(class373 arg0, class662 arg1, class609 arg2, int[] arg3) {
        this.field8969 = arg0;
        this.field8966 = arg2;
        this.field8977 = arg1;
        int var5 = this.field8966.method3537(6490) - (arg1.field3965 >> 1);
        this.field8981 = this.field8966.method3533(false) - var5 >> arg1.field3955;
        this.field8974 = var5 + this.field8966.method3533(false) >> arg1.field3955;
        this.field8964 = this.field8966.method3531(20597) - var5 >> arg1.field3955;
        this.field8967 = var5 + this.field8966.method3531(20597) >> arg1.field3955;
        int var6 = this.field8974 + 1 - this.field8981;
        int var7 = this.field8967 + 1 - this.field8964;
        this.field8970 = new float[var6 + 1][var7 + 1];
        this.field8975 = new float[var6 + 1][var7 + 1];
        this.field8973 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field8964 + var8;
            if (var27 > 0 && var27 < this.field8977.field3962 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field8981 + var28;
                    if (var29 > 0 && (this.field8977.field3963 - 1) > var29) {
                        int var30 = arg1.method1787(var29 + 1, 19646, var27) - arg1.method1787(var29 - 1, 19646, var27);
                        int var31 = arg1.method1787(var29, 19646, var27 + 1) - arg1.method1787(var29, 19646, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field8973[var28][var8] = (float) var30 * var32;
                        this.field8970[var28][var8] = var32 * -256.0F;
                        this.field8975[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8964; var10 <= this.field8967; var10++) {
            if (var10 >= 0 && var10 < arg1.field3962) {
                for (int var23 = this.field8981; var23 <= this.field8974; var23++) {
                    if (var23 >= 0 && var23 < arg1.field3963) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field9251[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field8972 += 3;
                                    }
                                }
                            } else {
                                this.field8972 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8974 - this.field8981;
            }
        }
        if (this.field8972 <= 0) {
            this.field8960 = null;
            this.field8961 = null;
        } else {
            this.field8980 = new class372(class432.method2684(this.field8972, -21774));
            this.field8960 = this.field8969.method2362(64, false);
            this.field8960.method1458((byte) 91, this.field8972);
            NativeHeapBuffer var11 = this.field8969.method2342(this.field8972 * 16, 4194, false);
            this.field8971 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field8960.method1457(true, -116);
                } while (var12 == null);
                this.field8963 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field8964; var15 <= this.field8967; var15++) {
                    if (var15 >= 0 && arg1.field3962 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field8981; var17 <= this.field8974; var17++) {
                            if (var17 >= 0 && var17 < arg1.field3963) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field9251[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field9257[var17][var15];
                                        int[] var21 = arg1.field9264[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3669(var17, var16, 36, var20[var22], var15, var14, var21[var22]);
                                                    var22++;
                                                    this.method3669(var17, var16, 88, var20[var22], var15, var14, var21[var22]);
                                                    var22++;
                                                    this.method3669(var17, var16, 60, var20[var22], var15, var14, var21[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3669(var17, var16, 60, 0, var15, var14, 0);
                                        this.method3669(var17, var16, 50, arg1.field3965, var15, var14, 0);
                                        this.method3669(var17, var16, 53, 0, var15, var14, arg1.field3965);
                                    } else if (var18 == 2) {
                                        this.method3669(var17, var16, 96, arg1.field3965, var15, var14, 0);
                                        this.method3669(var17, var16, 59, arg1.field3965, var15, var14, arg1.field3965);
                                        this.method3669(var17, var16, 72, 0, var15, var14, 0);
                                    } else if (var18 == 5) {
                                        this.method3669(var17, var16, 75, arg1.field3965, var15, var14, arg1.field3965);
                                        this.method3669(var17, var16, 115, 0, var15, var14, arg1.field3965);
                                        this.method3669(var17, var16, 107, arg1.field3965, var15, var14, 0);
                                    } else if (var18 == 4) {
                                        this.method3669(var17, var16, 50, 0, var15, var14, arg1.field3965);
                                        this.method3669(var17, var16, 69, 0, var15, var14, 0);
                                        this.method3669(var17, var16, 103, arg1.field3965, var15, var14, arg1.field3965);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field8974 - this.field8981;
                    }
                    var14++;
                }
                this.field8963.method3872();
                if (this.field8960.method1459(-26499)) {
                    this.field8971.method3872();
                    this.field8961 = this.field8969.method2384(false, 108);
                    this.field8961.method1285(16, var11, this.field8958 * 16, 6265);
                    break;
                }
                this.field8971.method3859(0);
                this.field8980.method2289(1393);
            }
        }
        this.field8963 = null;
        this.field8971 = null;
        this.field8980 = null;
        this.field8973 = this.field8970 = this.field8975 = null;
    }
}
