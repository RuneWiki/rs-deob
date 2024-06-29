import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class452 {

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Z")
    private boolean field6570 = true;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    private int field6579 = -1;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    private int field6565;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    private int field6578;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    private int field6586;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    private int field6582;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "[Lla;")
    private class145[] field6576;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "[Lla;")
    private class145[] field6575;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lla;")
    private class145 field6569;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field6562 = new String[100];

    @OriginalMember(owner = "client!li", name = "j", descriptor = "J")
    public static volatile long field6571 = 0L;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field6584 = -1;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static volatile int field6563 = 0;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    private int field6573;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    private int field6577;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "Lof;")
    private class421 field6574;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lms;")
    public static class448 field6566;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 11)
    public static void method2814(byte arg0) {
        if (arg0 != 111) {
            field6566 = null;
        }
        field6566 = null;
        field6562 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILja;I)Z", line = 32)
    public final boolean method2815(int arg0, class90 arg1, int arg2) {
        if (this.field6579 != arg0) {
            this.field6579 = arg0;
            int var4 = class202.method1526(arg0, -2092404400);
            if (var4 > arg0) {
                var4 = class321.method2142(-997880092, arg0);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field6577 != var4) {
                this.field6577 = var4;
                this.field6574 = null;
            }
            if (this.field6576 != null) {
                this.field6573 = 0;
                int[] var5 = new int[this.field6576.length];
                for (int var6 = 0; var6 < this.field6576.length; var6++) {
                    class145 var7 = this.field6576[var6];
                    if (var7.method1144(this.field6565, this.field6578, this.field6586, this.field6579)) {
                        var5[this.field6573] = var7.field2262;
                        this.field6575[this.field6573++] = var7;
                    }
                }
                class425.method2666(var5, true, this.field6573 - 1, 0, this.field6575);
            }
            this.field6570 = true;
        }
        field6564++;
        boolean var8 = false;
        if (this.field6570) {
            this.field6570 = false;
            for (int var9 = this.field6573 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field6575[var9].method1141(arg1, this.field6569);
                var8 |= var10;
                this.field6570 |= !var10;
            }
        }
        int var11 = -43 % ((-arg2 - 44) / 45);
        return var8;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIILja;IIIIIZ)V", line = 111)
    public final void method2816(int arg0, int arg1, int arg2, class90 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field6581++;
        int var11 = arg6 + arg7 & 0x3FFF;
        if (this.field6582 == -1) {
            arg3.method681(arg4, arg5, arg1, arg2, arg0, 0);
        } else {
            class200 var12 = class369.field5239.method1412(this.field6582, (byte) -113);
            if (this.field6574 == null && class369.field5239.method1415((byte) 127, this.field6582)) {
                int[] var13 = var12.field2914 ? class369.field5239.method1413(this.field6577, this.field6582, this.field6577, 0.7F, false, false) : class369.field5239.method1411(this.field6582, (byte) -90, this.field6577, 0.7F, this.field6577, false);
                this.field6574 = arg3.method715(var13, 0, this.field6577, this.field6577, this.field6577);
            }
            if (!var12.field2914) {
                arg3.method681(arg4, arg5, arg1, arg2, arg0, 0);
            }
            if (this.field6574 != null) {
                int var14 = var12.field2914 ? 0 : 1;
                int var15 = arg2 * arg8 / -4096;
                int var16;
                for (var16 = (arg1 - arg2) / 2 + (arg2 * var11 / 4096); var16 > arg2; var16 -= arg2) {
                }
                while (var15 > arg2) {
                    var15 -= arg2;
                }
                while (var16 < 0) {
                    var16 += arg2;
                }
                while (var15 < 0) {
                    var15 += arg2;
                }
                for (int var17 = var16 - arg2; var17 < arg1; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field6574.method494(arg4 + var17, arg5 + var18, arg2, arg2, 0, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field6573 - 1; var19 >= 0; var19--) {
            this.field6575[var19].method1149(arg3, arg4, arg5, arg1, arg2, arg8, var11);
        }
        if (arg9) {
            this.field6569 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 187)
    public static final void method2817(int arg0) {
        field6572++;
        int var1 = -65 % ((-arg0 - 3) / 42);
        class18 var2 = class205.field3011;
        synchronized (class205.field3011) {
            class205.field3011.method106((byte) -128);
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I[Lla;IIII)V", line = 248)
    public class452(int arg0, class145[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6565 = arg3;
        this.field6578 = arg4;
        this.field6586 = arg5;
        this.field6582 = arg0;
        this.field6576 = arg1;
        if (arg1 == null) {
            this.field6569 = null;
            this.field6575 = null;
        } else {
            this.field6575 = new class145[arg1.length];
            this.field6569 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 216)
    public final void method2818(int arg0) {
        field6585++;
        if (this.field6576 != null) {
            for (int var2 = 0; var2 < this.field6576.length; var2++) {
                this.field6576[var2].method1148();
            }
        }
        int var3 = -96 / ((arg0 - 77) / 38);
        this.field6574 = null;
    }
}
