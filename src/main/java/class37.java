import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class37 extends class30 {

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "J")
    public long field731;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "[I")
    public static int[] field736 = new int[256];

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field734 = -1;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field738 = 0;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "Lia;")
    public static class257 field740 = class28.method234(77, "gr-Un:");

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field739 = 0;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "Lia;")
    private static class257 field741 = class28.method234(-77, "Players");

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "Lia;")
    public static class257 field743 = field741;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field735;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lmb;I)V")
    public static final void method299(class178 arg0, int arg1) {
        class209.field3584 = arg0;
        if (arg1 == -1527) {
            field732++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method300(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field730++;
        if (arg4 != 0) {
            method304((byte) -5);
        }
        class104.field1940 = (short) arg3;
        class187.field3241 = (short) arg2;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class37() {
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(J)V")
    public class37(long arg0) {
        this.field731 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class118.method841(arg5, -111);
        int var7 = 0;
        int var8 = arg5 - arg4;
        field729++;
        int var9 = -arg5;
        int var10 = arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var11 = var8;
        int var12 = -var8;
        int[] var13 = class185.field3220[arg6];
        int var14 = arg3;
        int var15 = arg0 + var8;
        int var16 = -1;
        int var17 = arg0 - var8;
        class94.method692(var13, (byte) 14, arg0 - arg5, arg2, var17);
        class94.method692(var13, (byte) -128, var17, arg1, var15);
        class94.method692(var13, (byte) -128, var15, arg2, arg0 + arg5);
        while (var7 < var10) {
            var16 += 2;
            var14 += 2;
            var9 += var16;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class228.field3835[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                if (var10 >= var8) {
                    int var18 = arg0 + var7;
                    int[] var19 = class185.field3220[arg6 - var10];
                    int var20 = arg0 - var7;
                    int[] var21 = class185.field3220[arg6 + var10];
                    class94.method692(var21, (byte) -128, var20, arg2, var18);
                    class94.method692(var19, (byte) -124, var20, arg2, var18);
                } else {
                    int[] var22 = class185.field3220[arg6 - var10];
                    int var23 = arg0 + var7;
                    int[] var24 = class185.field3220[arg6 + var10];
                    int var25 = class228.field3835[var10];
                    int var26 = arg0 - var7;
                    int var27 = arg0 - var25;
                    int var28 = arg0 + var25;
                    class94.method692(var24, (byte) -125, var26, arg2, var27);
                    class94.method692(var24, (byte) 82, var27, arg1, var28);
                    class94.method692(var24, (byte) 18, var28, arg2, var23);
                    class94.method692(var22, (byte) -1, var26, arg2, var27);
                    class94.method692(var22, (byte) -124, var27, arg1, var28);
                    class94.method692(var22, (byte) -126, var28, arg2, var23);
                }
                var9 -= var10 << 1;
            }
            int[] var29 = class185.field3220[arg6 + var7];
            int[] var30 = class185.field3220[arg6 - var7];
            int var31 = arg0 + var10;
            int var32 = arg0 - var10;
            if (var7 < var8) {
                int var33 = var11 >= var7 ? var11 : class228.field3835[var7];
                int var34 = arg0 + var33;
                int var35 = arg0 - var33;
                class94.method692(var29, (byte) 32, var32, arg2, var35);
                class94.method692(var29, (byte) -123, var35, arg1, var34);
                class94.method692(var29, (byte) 60, var34, arg2, var31);
                class94.method692(var30, (byte) -125, var32, arg2, var35);
                class94.method692(var30, (byte) 106, var35, arg1, var34);
                class94.method692(var30, (byte) -122, var34, arg2, var31);
            } else {
                class94.method692(var29, (byte) 15, var32, arg2, var31);
                class94.method692(var30, (byte) -122, var32, arg2, var31);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
    public static void method302(int arg0) {
        if (arg0 != -31833) {
            field741 = null;
        }
        field741 = null;
        field743 = null;
        field735 = null;
        field736 = null;
        field740 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLmb;BLmb;)V")
    public static final void method303(boolean arg0, class178 arg1, byte arg2, class178 arg3) {
        field733++;
        class90.field1727 = arg0;
        class28.field542 = arg1;
        class25.field485 = arg3;
        int var4 = -8 % ((49 - arg2) / 54);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public static final void method304(byte arg0) {
        if (arg0 != 28) {
            method303(true, (class178) null, (byte) -80, (class178) null);
        }
        for (int var1 = 0; var1 < class212.field3628; var1++) {
            int var2 = class210.field3591[var1];
            class180 var3 = class55.field1180[var2];
            int var4 = class40.field827.method1051((byte) -44);
            if ((var4 & 0x4) != 0) {
                var4 += class40.field827.method1051((byte) 86) << 8;
            }
            class162.method1122(var2, var3, -107, var4);
        }
        field742++;
    }
}
