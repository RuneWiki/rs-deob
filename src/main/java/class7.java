import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class7 extends class390 {

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "Lno;")
    public static class420 field102 = new class420(64);

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Lkc;")
    public static class68 field109 = null;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Lfk;")
    public static class393 field111 = new class393();

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "F")
    public static float field112;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "Laa;")
    public static class283 field106;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lms;")
    public class453 field95;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Lms;")
    public class453 field96;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "Ljava/lang/String;")
    public String field103;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "Z")
    public boolean field105;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "[Ljava/lang/Object;")
    public Object[] field97;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static void method38(int arg0) {
        field109 = null;
        field106 = null;
        if (arg0 > -80) {
            method41(1, 101, -60, 27, -39, -13, 101, 87, -49, 44);
        }
        field111 = null;
        field102 = null;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static final void method39(int arg0) {
        field93++;
        class133.field1915.method900(0);
        int var1 = 86 % ((arg0 + 1) / 33);
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Z")
    public static final boolean method40(int arg0) {
        if (arg0 == -809375828) {
            field98++;
            return class437.field6148;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg7 && arg0 == arg8 && arg4 == arg6 && arg3 == arg9) {
            class15.method236(arg0, arg6, arg3, arg2, (byte) 111, arg1);
        } else {
            int var10 = arg2;
            int var11 = arg0;
            int var12 = arg2 * 3;
            int var13 = arg0 * 3;
            int var14 = arg7 * 3;
            int var15 = arg8 * 3;
            int var16 = arg4 * 3;
            int var17 = arg9 * 3;
            int var18 = arg6 + var14 - var16 - arg2;
            int var19 = arg3 + var15 - arg0 - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = arg2 + (var28 + var30 + var32 >> 12);
                int var35 = (var29 + var31 + var33 >> 12) + arg0;
                class15.method236(var11, var34, var35, var10, (byte) 111, arg1);
                var11 = var35;
                var10 = var34;
            }
        }
        int var25 = 97 % ((39 - arg5) / 37);
        field101++;
    }
}
