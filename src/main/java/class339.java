import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class339 {

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field4960;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field4956;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field4958;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[[I")
    public int[][] field4957;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field4962;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[[I")
    public static int[][] field4967 = new int[128][128];

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
    public static int[] field4966;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[[B")
    public static byte[][] field4964;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 7)
    public static void method2159(int arg0) {
        int var1 = 29 / ((arg0 - 42) / 53);
        field4964 = null;
        field4966 = null;
        field4967 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 20)
    public final int method2160(int arg0, int arg1, int arg2) {
        field4965++;
        if (arg0 >= -70) {
            this.method622(-95, 77);
        }
        return this.field4957[arg2][arg1];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLha;Ld;)V", line = 35)
    public static final void method2161(boolean arg0, class544 arg1, class267 arg2) {
        field4963++;
        if (class729.field10201 == null) {
            return;
        }
        if (class612.field8632 < 10) {
            if (!class729.field10205.method2642(-29983, class729.field10201.field7882)) {
                class612.field8632 = class147.field2306.method2631(0, class729.field10201.field7882) / 10;
                return;
            }
            class222.method1576(17);
            class612.field8632 = 10;
        }
        if (!arg0) {
            return;
        }
        if (class612.field8632 == 10) {
            class729.field10228 = class729.field10201.field7876 >> 6 << 6;
            class729.field10239 = class729.field10201.field7881 >> 6 << 6;
            class729.field10221 = (class729.field10201.field7878 >> 6 << 6) + 64 - class729.field10228;
            class729.field10226 = (class729.field10201.field7889 >> 6 << 6) + 64 - class729.field10239;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class729.field10201.method3223(var3, (byte) -109, (class145.field2251.field9475 >> 9) + class723.field10155, class145.field2251.field9470, (class145.field2251.field9477 >> 9) + class265.field4123)) {
                var5 = var3[2] - class729.field10239;
                var4 = var3[1] - class729.field10228;
            }
            if (!class23.field221 && var4 >= 0 && class729.field10221 > var4 && var5 >= 0 && class729.field10226 > var5) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class271.field4161 = var6;
                class187.field3121 = var7;
            } else if (class120.field1834 == -1 || class213.field3527 == -1) {
                class729.field10201.method3228(14918, class729.field10201.field7872 & 0x3FFF, (class729.field10201.field7872 & 0xFFFD749) >> 14, var3);
                class271.field4161 = var3[2] - class729.field10239;
                class187.field3121 = var3[1] - class729.field10228;
            } else {
                class729.field10201.method3228(14918, class213.field3527, class120.field1834, var3);
                class213.field3527 = -1;
                class120.field1834 = -1;
                class23.field221 = false;
                if (var3 != null) {
                    class271.field4161 = var3[2] - class729.field10239;
                    class187.field3121 = var3[1] - class729.field10228;
                }
            }
            if (class729.field10201.field7885 == 37) {
                class729.field10218 = 3.0F;
                class729.field10217 = 3.0F;
            } else if (class729.field10201.field7885 == 50) {
                class729.field10218 = 4.0F;
                class729.field10217 = 4.0F;
            } else if (class729.field10201.field7885 == 75) {
                class729.field10218 = 6.0F;
                class729.field10217 = 6.0F;
            } else if (class729.field10201.field7885 == 100) {
                class729.field10218 = 8.0F;
                class729.field10217 = 8.0F;
            } else if (class729.field10201.field7885 == 200) {
                class729.field10218 = 16.0F;
                class729.field10217 = 16.0F;
            } else {
                class729.field10218 = 8.0F;
                class729.field10217 = 8.0F;
            }
            class729.field10213 = (int) class729.field10218 >> 1;
            class729.field10211 = class472.method2876((byte) -115, class729.field10213);
            class481.method2912((byte) 86);
            class729.method4043();
            class508.field7390 = new class605();
            class729.field10212 += (int) (Math.random() * 5.0D) - 2;
            if (class729.field10212 < -8) {
                class729.field10212 = -8;
            }
            if (class729.field10212 > 8) {
                class729.field10212 = 8;
            }
            class729.field10214 += (int) (Math.random() * 5.0D) - 2;
            if (class729.field10214 < -16) {
                class729.field10214 = -16;
            }
            if (class729.field10214 > 16) {
                class729.field10214 = 16;
            }
            class729.method4035(arg2, class729.field10212 >> 2 << 10, class729.field10214 >> 1);
            class729.field10206.method2557(256, 36, 1024);
            class729.field10208.method3853(256, (byte) -12, 256);
            class729.field10204.method3067(4096, (byte) -77);
            class52.field836.method1716(256, (byte) 123);
            class612.field8632 = 20;
        } else if (class612.field8632 == 20) {
            class549.method3206(true, false);
            class729.method4046(arg1, class729.field10212, class729.field10214);
            class612.field8632 = 60;
            class549.method3206(true, false);
            class545.method3198((byte) -119);
        } else if (class612.field8632 == 60) {
            if (class729.field10205.method2608(class729.field10201.field7882 + "_staticelements", false)) {
                if (!class729.field10205.method2642(-29983, class729.field10201.field7882 + "_staticelements")) {
                    return;
                }
                class729.field10209 = class238.method1652(class729.field10205, (byte) -35, class729.field10201.field7882 + "_staticelements", class384.field5763);
            } else {
                class729.field10209 = new class676(0);
            }
            class729.method4030();
            class612.field8632 = 70;
            class549.method3206(true, false);
            class545.method3198((byte) -118);
        } else if (class612.field8632 == 70) {
            class372.field5641 = new class746(arg1, 11, true, class400.field5941);
            class612.field8632 = 73;
            class549.method3206(true, false);
            class545.method3198((byte) -123);
        } else if (class612.field8632 == 73) {
            class494.field7153 = new class746(arg1, 12, true, class400.field5941);
            class612.field8632 = 76;
            class549.method3206(true, !arg0);
            class545.method3198((byte) -123);
        } else if (class612.field8632 == 76) {
            class256.field4030 = new class746(arg1, 14, true, class400.field5941);
            class612.field8632 = 79;
            class549.method3206(true, !arg0);
            class545.method3198((byte) -118);
        } else if (class612.field8632 == 79) {
            class370.field5623 = new class746(arg1, 17, true, class400.field5941);
            class612.field8632 = 82;
            class549.method3206(true, false);
            class545.method3198((byte) -122);
        } else if (class612.field8632 == 82) {
            class611.field8608 = new class746(arg1, 19, true, class400.field5941);
            class612.field8632 = 85;
            class549.method3206(true, !arg0);
            class545.method3198((byte) -119);
        } else if (class612.field8632 == 85) {
            class275.field4205 = new class746(arg1, 22, true, class400.field5941);
            class612.field8632 = 88;
            class549.method3206(true, false);
            class545.method3198((byte) -126);
        } else if (class612.field8632 == 88) {
            class86.field1271 = new class746(arg1, 26, true, class400.field5941);
            class612.field8632 = 91;
            class549.method3206(true, false);
            class545.method3198((byte) -125);
        } else {
            class398.field5923 = new class746(arg1, 30, true, class400.field5941);
            class612.field8632 = 100;
            class549.method3206(true, false);
            class545.method3198((byte) -127);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)I", line = 270)
    public final int method2162(int arg0, int arg1, int arg2) {
        field4961++;
        int var4 = arg2 >> this.field4962;
        int var5 = arg0 >> this.field4962;
        if (var4 < 0 || var5 < 0 || (this.field4956 - 1) < var4 || (this.field4960 - 1) < var5) {
            return 0;
        }
        int var6 = this.field4958 - 1 & arg2;
        int var7 = this.field4958 - 1 & arg0;
        int var8 = (this.field4958 - var6) * this.field4957[var4][var5] + this.field4957[var4 + 1][var5] * var6 >> this.field4962;
        int var9 = (this.field4958 - var6) * this.field4957[var4][var5 + 1] + (this.field4957[arg1 + var4][var5 + 1] * var6) >> this.field4962;
        return (this.field4958 - var7) * var8 + (var7 * var9) >> this.field4962;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)Z", line = 299)
    public static final boolean method2163(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field4959++;
            return (arg0 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 309)
    public class339(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field4960 = arg1;
        this.field4956 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field4958 = 0x1 << var5;
        this.field4957 = arg3;
        this.field4962 = var5;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method622(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lvt;[I)V")
    public abstract void method617(class759 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class706 method626(int arg0, int arg1, class706 arg2);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method615();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method624(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method628(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method625(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method621(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method632(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method618(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method630(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method623(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);
}
