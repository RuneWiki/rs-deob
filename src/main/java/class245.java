import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class245 extends class86 {

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    private int field3813;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    private int field3817;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    private int field3818;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "[I")
    public static int[] field3819;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "[I")
    public static int[] field3821;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field3822;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V", line = 7)
    public static void method1846(byte arg0) {
        field3822 = null;
        if (arg0 != 4) {
            method1848(true, 108);
        }
        field3819 = null;
        field3821 = null;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 22)
    public class245() {
        this(0);
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V", line = 26)
    public static final void method1847(byte arg0) {
        field3820++;
        class305.field4743 = 0;
        if (arg0 < 9) {
            field3819 = (int[]) null;
        }
        int var1 = (class173.field2746.field1359 >> 7) + class358.field5696;
        int var2 = (class173.field2746.field1286 >> 7) + class49.field755;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class305.field4743 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class305.field4743 = 1;
        }
        if (class305.field4743 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class305.field4743 = 0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZLug;)V", line = 61)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg0 == 0) {
            this.method1850(arg2.method265(true), -92);
        }
        if (arg1) {
            field3821 = (int[]) null;
        }
        field3815++;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V", line = 85)
    private class245(int arg0) {
        super(0, false);
        this.method1850(arg0, -123);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)V", line = 95)
    public static final void method1848(boolean arg0, int arg1) {
        field3812++;
        if (arg1 <= 77) {
            field3819 = (int[]) null;
        }
        if (arg0 != class192.field3031) {
            class192.field3031 = arg0;
            class44.method450((byte) 38);
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)[Lt;", line = 113)
    public static final class356[] method1849(byte arg0) {
        field3823++;
        int var1 = 113 % ((arg0 + 33) / 56);
        if (class247.field3836 == null) {
            class356[] var2 = class311.method2212((byte) -127, class340.field5234);
            class356[] var3 = new class356[var2.length];
            int var4 = 0;
            label53: for (int var5 = 0; var5 < var2.length; var5++) {
                class356 var6 = var2[var5];
                if ((var6.field5667 <= 0 || var6.field5667 >= 24) && var6.field5662 >= 800 && var6.field5664 >= 600) {
                    for (int var7 = 0; var7 < var4; var7++) {
                        class356 var8 = var3[var7];
                        if (var6.field5662 == var8.field5662 && var6.field5664 == var8.field5664) {
                            if (var8.field5667 < var6.field5667) {
                                var3[var7] = var6;
                            }
                            continue label53;
                        }
                    }
                    var3[var4] = var6;
                    var4++;
                }
            }
            class247.field3836 = new class356[var4];
            class65.method644(var3, 0, class247.field3836, 0, var4);
            int[] var9 = new int[class247.field3836.length];
            for (int var10 = 0; var10 < class247.field3836.length; var10++) {
                class356 var11 = class247.field3836[var10];
                var9[var10] = var11.field5664 * var11.field5662;
            }
            class360.method2526(var9, 44, class247.field3836);
        }
        return class247.field3836;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(IB)[[I", line = 191)
    public final int[][] method156(int arg0, byte arg1) {
        field3811++;
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class93.field1424; var7++) {
                var4[var7] = this.field3818;
                var5[var7] = this.field3813;
                var6[var7] = this.field3817;
            }
        }
        return arg1 >= -126 ? (int[][]) ((int[][]) null) : var3;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(II)V", line = 228)
    private final void method1850(int arg0, int arg1) {
        if (arg1 <= -65) {
            this.field3813 = arg0 >> 4 & 0xFF0;
            this.field3818 = (arg0 & 0xFF0000) >> 12;
            this.field3817 = (arg0 & 0xFF) << 4;
            field3814++;
        }
    }
}
