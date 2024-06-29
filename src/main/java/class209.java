import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class209 extends class386 {

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "Lwo;")
    public static class690 field2547 = new class690(32, -1);

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "[I")
    public static int[] field2550;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method359(int arg0, int arg1) {
        ++field2544;
        int var3 = -75 % ((arg1 - 13) / 40);
        int[] var4 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            for (int var5 = 0; class599.field8643 > var5; ++var5) {
                this.method1251(var5, (byte) 108, arg0);
                int[] var6 = this.method2212((byte) 70, class268.field3670, 0);
                var4[var5] = var6[class656.field9320];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIZII)Lcaa;", line = 39)
    public static final class275 method1249(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field2542;
        long var7 = (long) arg0 * 67481L ^ (long) arg2 * 97549L ^ (long) arg1 * 475427L ^ (long) arg6 * 986053L ^ (long) arg5 * 32147369L ^ (long) arg3 * 76724863L;
        class275 var9 = (class275) class24.field576.method2766(-125, var7);
        if (var9 != null) {
            return var9;
        } else if (arg4) {
            return null;
        } else {
            class275 var10 = class377.field5073.method303(arg0, arg2, arg1, arg6, arg5, arg3);
            class24.field576.method2772(var10, true, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)I", line = 60)
    public static final int method1250(boolean arg0) {
        ++field2548;
        int var1 = class604.field8712.method1434(10067);
        if (arg0) {
            method1249(-33, -39, -47, -54, true, 87, -8);
        }
        if (class70.field1066.length + -1 > var1) {
            class604.field8712 = class70.field1066[var1 - -1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IBI)V", line = 80)
    private final void method1251(int arg0, byte arg1, int arg2) {
        ++field2545;
        if (arg1 == 108) {
            int var4 = class152.field1879[arg0];
            int var5 = class562.field8114[arg2];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class268.field3670 = arg2;
                class656.field9320 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class268.field3670 = arg0;
                class656.field9320 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class656.field9320 = -arg2 + class599.field8643;
                class268.field3670 = arg0;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class268.field3670 = -arg2 + class365.field4914;
                class656.field9320 = arg0;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class656.field9320 = -arg0 + class599.field8643;
                class268.field3670 = -arg2 + class365.field4914;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class268.field3670 = -arg0 + class365.field4914;
                class656.field9320 = -arg2 + class599.field8643;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class656.field9320 = arg2;
                class268.field3670 = class365.field4914 - arg0;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class268.field3670 = arg2;
                class656.field9320 = class599.field8643 - arg0;
            }
            class268.field3670 &= class206.field2474;
            class656.field9320 &= class276.field3782;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V", line = 154)
    public class209() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Canvas;ILfa;)Lr;", line = 157)
    public static final class165 method1252(Canvas arg0, int arg1, class212 arg2) {
        ++field2549;
        return arg1 < 124 ? null : new class483(arg0, arg2);
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V", line = 170)
    public static void method1253(int arg0) {
        field2547 = null;
        field2550 = null;
        if (arg0 != 0) {
            method1252((Canvas) null, 14, (class212) null);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[[I", line = 182)
    public final int[][] method645(int arg0, int arg1) {
        ++field2546;
        if (arg1 != 3) {
            return null;
        } else {
            int[][] var3 = super.field5148.method1054(arg0, 16257);
            if (super.field5148.field2041) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class599.field8643 < ~var7; ++var7) {
                    this.method1251(var7, (byte) 108, arg0);
                    int[][] var8 = this.method2211(class268.field3670, 0, arg1 + -116);
                    var4[var7] = var8[0][class656.field9320];
                    var5[var7] = var8[1][class656.field9320];
                    var6[var7] = var8[2][class656.field9320];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBLun;)V", line = 223)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg1 > 111) {
            if (~arg0 == -1) {
                super.field5145 = arg2.method2229(255) == 1;
            }
            ++field2543;
        }
    }
}
