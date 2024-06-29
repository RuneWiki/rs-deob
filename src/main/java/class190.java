import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class190 extends class283 {

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    private int field2973 = 0;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    private int field2978 = 2000;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    private int field2983 = 16;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    private int field2982 = 4096;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    private int field2986 = 0;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "Lna;")
    private static class26 field2981 = class69.method505("Loading sprites )2 ", (byte) -119);

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "Lna;")
    public static class26 field2974 = field2981;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "[J")
    public static long[] field2979 = new long[1000];

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "[I")
    public static int[] field2988 = new int[4096];

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "Lna;")
    public static class26 field2984 = class69.method505("mapflag", (byte) -125);

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "[S")
    public static short[] field2985 = new short[256];

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "[I")
    public static int[] field2975;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "[S")
    public static short[] field2987;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 142)
    public class190() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V", line = 27)
    public static void method1296(int arg0) {
        field2987 = null;
        field2981 = null;
        field2975 = null;
        if (arg0 != -1) {
            return;
        }
        field2974 = null;
        field2985 = null;
        field2979 = null;
        field2988 = null;
        field2984 = null;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V", line = 59)
    public final void method130(int arg0) {
        class321.method2237((byte) -9);
        field2977++;
        if (arg0 != 16251) {
            this.field2986 = 107;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILwa;Z)V", line = 98)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field2986 = arg1.method642((byte) -34);
        } else if (arg0 == 1) {
            this.field2978 = arg1.method576(1);
        } else if (arg0 == 2) {
            this.field2983 = arg1.method642((byte) -116);
        } else if (arg0 == 3) {
            this.field2973 = arg1.method576(1);
        } else if (arg0 == 4) {
            this.field2982 = arg1.method576(1);
        }
        if (arg2) {
            field2976++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I", line = 150)
    public final int[] method8(int arg0, byte arg1) {
        field2980++;
        int var3 = 64 % ((arg1 - 30) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int var5 = this.field2982 >> 1;
            int[][] var6 = this.field4733.method665((byte) 93);
            Random var7 = new Random((long) this.field2986);
            for (int var8 = 0; var8 < this.field2978; var8++) {
                int var9 = this.field2982 > 0 ? this.field2973 + class24.method151((byte) -99, this.field2982, var7) - var5 : this.field2973;
                int var10 = class24.method151((byte) -96, class101.field1632, var7);
                int var11 = (var9 & 0xFF8) >> 4;
                int var12 = class24.method151((byte) 62, class225.field3574, var7);
                int var13 = var10 + (class36.field586[var11] * this.field2983 >> 12);
                int var14 = (class74.field1143[var11] * this.field2983 >> 12) + var12;
                int var15 = var13 - var10;
                int var16 = var14 - var12;
                if (var15 != 0 || var16 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    boolean var17 = var16 > var15;
                    if (var17) {
                        int var18 = var10;
                        int var19 = var13;
                        var13 = var14;
                        var14 = var19;
                        var10 = var12;
                        var12 = var18;
                    }
                    if (var10 > var13) {
                        int var20 = var10;
                        int var21 = var12;
                        var10 = var13;
                        var12 = var14;
                        var14 = var21;
                        var13 = var20;
                    }
                    int var22 = var13 - var10;
                    int var23 = var14 - var12;
                    int var24 = var12;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = -var22 / 2;
                    int var26 = 1024 - (class24.method151((byte) -18, 4096, var7) >> 2);
                    int var27 = var14 <= var12 ? -1 : 1;
                    int var28 = 2048 / var22;
                    for (int var29 = var10; var29 < var13; var29++) {
                        var25 += var23;
                        int var30 = (var29 - var10) * var28 + var26 + 1024;
                        int var31 = var24 & class210.field3268;
                        if (var25 > 0) {
                            var25 += -var22;
                            var24 += var27;
                        }
                        int var32 = class236.field3783 & var29;
                        if (var17) {
                            var6[var31][var32] = var30;
                        } else {
                            var6[var32][var31] = var30;
                        }
                    }
                }
            }
        }
        return var4;
    }
}
