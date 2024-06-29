import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class155 extends class110 {

    @OriginalMember(owner = "client!he", name = "G", descriptor = "[I")
    public static int[] field2322 = new int[500];

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Laj;")
    public static class129 field2325;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        field2323++;
        if (this.field1695.field875) {
            int[] var4 = this.method764(0, true, arg1);
            int[] var5 = this.method764(1, true, arg1);
            int[] var6 = this.method764(2, true, arg1);
            for (int var7 = 0; var7 < class124.field1936; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        if (arg0 != 1) {
            field2325 = (class129) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V", line = 57)
    public static final void method1105(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2328++;
        int var5 = 0;
        int var6 = arg4;
        if (arg1 > -37) {
            field2329 = -28;
        }
        int var7 = -arg4;
        int var8 = class222.method1553(class184.field2761, (byte) -46, arg3 + arg4, class157.field2357);
        int var9 = -1;
        int var10 = class222.method1553(class184.field2761, (byte) -69, arg3 - arg4, class157.field2357);
        class315.method2160(class40.field488[arg0], arg2, var8, var10, 7);
        while (var6 > var5) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var6--;
                int var11 = arg0 - var6;
                var7 -= var6 << 1;
                int var12 = arg0 + var6;
                if (class185.field2769 <= var12 && class166.field2494 >= var11) {
                    int var13 = class222.method1553(class184.field2761, (byte) -49, arg3 + var5, class157.field2357);
                    int var14 = class222.method1553(class184.field2761, (byte) -40, arg3 - var5, class157.field2357);
                    if (var12 <= class166.field2494) {
                        class315.method2160(class40.field488[var12], arg2, var13, var14, 7);
                    }
                    if (class185.field2769 <= var11) {
                        class315.method2160(class40.field488[var11], arg2, var13, var14, 7);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (class185.field2769 <= var16 && class166.field2494 >= var15) {
                int var17 = class222.method1553(class184.field2761, (byte) -67, arg3 + var6, class157.field2357);
                int var18 = class222.method1553(class184.field2761, (byte) -86, arg3 - var6, class157.field2357);
                if (class166.field2494 >= var16) {
                    class315.method2160(class40.field488[var16], arg2, var17, var18, 7);
                }
                if (class185.field2769 <= var15) {
                    class315.method2160(class40.field488[var15], arg2, var17, var18, 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(I)V", line = 136)
    public static void method1106(int arg0) {
        field2325 = null;
        int var1 = 36 / ((arg0 - 46) / 55);
        field2322 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILre;I)V", line = 148)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg2 < -37) {
            if (arg0 == 0) {
                this.field1705 = arg1.method1787(false) == 1;
            }
            field2327++;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IZ)Lnd;", line = 169)
    public static final class234 method1107(int arg0, boolean arg1) {
        field2324++;
        if (!arg1) {
            return (class234) null;
        }
        class234 var2 = (class234) class284.field4295.method2180((long) arg0, (byte) 31);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class176.field2604.method1441(arg0, (byte) -44, 31);
        class234 var4 = new class234();
        if (var3 != null) {
            var4.method1607(new class263(var3), (byte) 108, arg0);
        }
        class284.field4295.method2175((long) arg0, var4, 125);
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)[[I", line = 195)
    public final int[][] method445(int arg0, boolean arg1) {
        field2326++;
        if (arg1) {
            method1107(18, false);
        }
        int[][] var3 = this.field1701.method1477((byte) 89, arg0);
        if (this.field1701.field3255) {
            int[] var4 = this.method764(2, true, arg0);
            int[][] var5 = this.method770(arg0, (byte) 102, 0);
            int[][] var6 = this.method770(arg0, (byte) 40, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class124.field1936; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + (var13[var16] * var18) >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + (var15[var16] * var18) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 276)
    public class155() {
        super(3, false);
    }
}
