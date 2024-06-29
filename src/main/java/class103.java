import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class103 extends class304 {

    @OriginalMember(owner = "client!nj", name = "cb", descriptor = "I")
    private int field1519 = 32768;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "Z")
    public static boolean field1510 = false;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!nj", name = "bb", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1513;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(B)V", line = 6)
    public static final void method782(byte arg0) {
        class230.field3500.method752(false);
        int var1 = 13 % ((arg0 - 43) / 42);
        field1515++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V", line = 17)
    public final void method100(boolean arg0) {
        class32.method251(-66);
        if (!arg0) {
            field1513 = (FontMetrics) null;
        }
        field1508++;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)[[I", line = 32)
    public final int[][] method75(int arg0, int arg1) {
        field1516++;
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (arg1 != 0) {
            this.method71(37, 42);
        }
        if (this.field4663.field1820) {
            int[] var4 = this.method2086(arg0, 1, (byte) 112);
            int[] var5 = this.method2086(arg0, 2, (byte) 112);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class218.field3333; var9++) {
                int var10 = var5[var9] * this.field1519 >> 12;
                int var11 = var4[var9] * 255 >> 12 & 0xFF;
                int var12 = class307.field4784[var11] * var10 >> 12;
                int var13 = class264.field4074[var11] * var10 >> 12;
                int var14 = var9 + (var13 >> 12) & class54.field721;
                int var15 = (var12 >> 12) + arg0 & class65.field941;
                int[][] var16 = this.method2082(0, (byte) -114, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 86)
    public class103() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIII)V", line = 98)
    public static final void method783(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1509++;
        if (arg0 == arg4) {
            class21.method165(arg1, -1578491071, arg5, arg4, arg2, arg7, arg3);
            return;
        }
        int var8 = -31 / ((-arg6 - 54) / 39);
        if ((arg5 - arg4) >= class234.field3569 && (arg4 + arg5) <= class322.field4965 && class212.field3261 <= (arg2 - arg0) && (arg0 + arg2) <= class182.field2888) {
            class121.method912(arg2, arg4, (byte) -83, arg1, arg3, arg0, arg7, arg5);
        } else {
            class264.method1850(arg7, arg3, 8457, arg5, arg0, arg4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIZZ)V", line = 123)
    public static final void method784(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field1512++;
        if (arg2 < arg1) {
            int var7 = (arg1 + arg2) / 2;
            int var8 = arg2;
            class163 var9 = class157.field2393[var7];
            class157.field2393[var7] = class157.field2393[arg1];
            class157.field2393[arg1] = var9;
            for (int var10 = arg2; var10 < arg1; var10++) {
                if (class169.method1281(-50, var9, arg6, class157.field2393[var10], arg5, arg3, arg4) <= 0) {
                    class163 var11 = class157.field2393[var10];
                    class157.field2393[var10] = class157.field2393[var8];
                    class157.field2393[var8++] = var11;
                }
            }
            class157.field2393[arg1] = class157.field2393[var8];
            class157.field2393[var8] = var9;
            method784(107, var8 - 1, arg2, arg3, arg4, arg5, arg6);
            method784(84, arg1, var8 + 1, arg3, arg4, arg5, arg6);
        }
        int var12 = 122 / ((arg0 - 17) / 36);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)V", line = 165)
    public static void method785(boolean arg0) {
        if (arg0) {
            field1510 = false;
        }
        field1513 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)[I", line = 181)
    public final int[] method71(int arg0, int arg1) {
        field1511++;
        if (arg0 != 7) {
            field1513 = (FontMetrics) null;
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int[] var4 = this.method2086(arg1, 1, (byte) 112);
            int[] var5 = this.method2086(arg1, 2, (byte) 112);
            for (int var6 = 0; var6 < class218.field3333; var6++) {
                int var7 = (var4[var6] & 0xFF0) >> 4;
                int var8 = var5[var6] * this.field1519 >> 12;
                int var9 = class264.field4074[var7] * var8 >> 12;
                int var10 = class307.field4784[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class54.field721;
                int var12 = (var10 >> 12) + arg1 & class65.field941;
                int[] var13 = this.method2086(var12, 0, (byte) 112);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lwm;II)V", line = 226)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg2 != -2828) {
            this.field1519 = -50;
        }
        field1507++;
        if (arg1 == 0) {
            this.field1519 = arg0.method1755(false) << 4;
        } else if (arg1 == 1) {
            this.field4652 = arg0.method1774((byte) 55) == 1;
        }
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(B)I", line = 263)
    public static final int method786(byte arg0) {
        field1518++;
        if (arg0 != -6) {
            field1510 = false;
        }
        class338.field5250 = 0;
        return class16.method118((byte) -120);
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(III)V", line = 275)
    public static final void method787(int arg0, int arg1, int arg2) {
        class78.field1145 = arg1 - class196.field3024;
        field1514++;
        class114.field1799 = class229.field3494 - (1 - (class176.field2822 - arg2));
        if (arg0 != -10858) {
            field1510 = true;
        }
    }
}
