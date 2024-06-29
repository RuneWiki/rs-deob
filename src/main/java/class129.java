import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class129 extends class313 {

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "Z")
    public static boolean field2225 = true;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "[I")
    public static int[] field2231 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field2230;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILpi;)V", line = 7)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field2228++;
        if (arg0 == 0) {
            this.field4968 = arg2.method2364(-9069) == 1;
        }
        if (arg1 != -17848) {
            field2231 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 22)
    public class129() {
        super(3, false);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)I", line = 30)
    public static final int method1073(byte arg0, int arg1) {
        if (class279.field4426 != null) {
            class279.field4426.method177(false);
            class279.field4426 = null;
        }
        field2227++;
        class351.field5561++;
        if (class351.field5561 > 4) {
            class160.field2826 = 0;
            class351.field5561 = 0;
            return arg1;
        }
        class160.field2826 = 0;
        if (class230.field3840 == class141.field2590) {
            class230.field3840 = class292.field4676;
        } else {
            class230.field3840 = class141.field2590;
        }
        int var2 = -74 % ((arg0 - 1) / 45);
        return -1;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V", line = 61)
    public static void method1074(boolean arg0) {
        field2230 = null;
        field2231 = null;
        if (arg0) {
            field2230 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)[I", line = 83)
    public final int[] method111(int arg0, int arg1) {
        field2232++;
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int[] var4 = this.method2156(0, true, arg1);
            int[] var5 = this.method2156(1, true, arg1);
            int[] var6 = this.method2156(2, true, arg1);
            for (int var7 = 0; var7 < class133.field2269; var7++) {
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
        if (arg0 != 4) {
            method1075(-52, -54, (Random) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILjava/util/Random;)I", line = 133)
    public static final int method1075(int arg0, int arg1, Random arg2) {
        if (arg1 != 19192) {
            method1074(false);
        }
        field2229++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class147.method1172((byte) -128, arg0)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class336.method2315(var4, arg0, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[[I", line = 168)
    public final int[][] method299(int arg0, int arg1) {
        field2226++;
        if (arg1 != 2) {
            method1075(-93, 92, (Random) null);
        }
        int[][] var3 = this.field4958.method2404(arg0, (byte) 123);
        if (this.field4958.field5463) {
            int[] var4 = this.method2156(2, true, arg0);
            int[][] var5 = this.method2161(0, 4, arg0);
            int[][] var6 = this.method2161(1, arg1 + 2, arg0);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var5[0];
            int[] var11 = var6[0];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var5[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class133.field2269; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var9[var16] = var10[var16];
                    var8[var16] = var14[var16];
                    var7[var16] = var12[var16];
                } else if (var17 == 0) {
                    var9[var16] = var11[var16];
                    var8[var16] = var13[var16];
                    var7[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var9[var16] = var10[var16] * var17 + var11[var16] * var18 >> 12;
                    var8[var16] = var13[var16] * var18 + var14[var16] * var17 >> 12;
                    var7[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }
}
