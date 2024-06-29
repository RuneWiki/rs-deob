import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class282 {

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field3555;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[[I")
    public int[][] field3559;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field3560 = 100;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3551 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!s", name = "p", descriptor = "[[I")
    public static int[][] field3563 = new int[6][];

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lnd;")
    public static class547 field3548;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Lhb;")
    public static class728 field3562;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B[[I)V", line = 3)
    public static final void method1669(byte arg0, int[][] arg1) {
        field3549++;
        int var2 = -122 / ((-arg0 - 61) / 53);
        class432.field5765 = arg1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZI)I", line = 26)
    public final int method1676(int arg0, boolean arg1, int arg2) {
        field3558++;
        int var4 = arg0 >> this.field3550;
        int var5 = arg2 >> this.field3550;
        if (var4 < 0 || var5 < 0 || var4 > (this.field3561 - 1) || var5 > (this.field3555 - 1)) {
            return 0;
        } else if (arg1) {
            int var6 = arg0 & this.field3557 - 1;
            int var7 = this.field3557 - 1 & arg2;
            int var8 = (this.field3557 - var6) * this.field3559[var4][var5] + this.field3559[var4 + 1][var5] * var6 >> this.field3550;
            int var9 = (this.field3557 - var6) * this.field3559[var4][var5 + 1] + (this.field3559[var4 + 1][var5 + 1] * var6) >> this.field3550;
            return (this.field3557 - var7) * var8 + var7 * var9 >> this.field3550;
        } else {
            return 119;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I", line = 53)
    public final int method1677(int arg0, byte arg1, int arg2) {
        field3553++;
        if (arg1 <= 2) {
            this.field3557 = -53;
        }
        return this.field3559[arg2][arg0];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V", line = 67)
    public static final void method1679(boolean arg0) {
        if (class237.field3091 != null) {
            for (int var1 = 0; var1 < class54.field753; var1++) {
                class237.field3091[var1] = null;
            }
            class237.field3091 = null;
        }
        field3554++;
        if (class667.field9364 != null) {
            for (int var2 = 0; var2 < class660.field9192; var2++) {
                class667.field9364[var2] = null;
            }
            class667.field9364 = null;
        }
        if (class737.field10238 != null) {
            for (int var3 = 0; var3 < class291.field3814; var3++) {
                class737.field10238[var3] = null;
            }
            class737.field10238 = null;
        }
        if (arg0) {
            method1669((byte) 100, null);
        }
        class141.field2008 = null;
        class711.field9865 = -1;
        class646.field8938 = -1;
        class416.field5306 = null;
        class473.field6351 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZI)Lnd;", line = 126)
    public static final class547 method1682(int arg0, int arg1, boolean arg2, int arg3) {
        field3556++;
        class387 var4 = null;
        if (class611.field8463 != null) {
            var4 = new class387(arg3, class611.field8463, class91.field1250[arg3], 1000000);
        }
        if (arg1 != -1) {
            field3562 = null;
        }
        class523.field7321[arg3] = class706.field9779.method3352(var4, (byte) -28, class656.field9141, arg3);
        class523.field7321[arg3].method2701((byte) 109);
        return new class547(class523.field7321[arg3], arg2, arg0);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 144)
    public static void method1683(int arg0) {
        field3563 = null;
        field3551 = null;
        if (arg0 >= -50) {
            method1669((byte) 14, null);
        }
        field3548 = null;
        field3562 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Lwf;", line = 165)
    public static final class138 method1686(int arg0) {
        class662.field9326 = arg0;
        field3552++;
        return class294.method1768(-113);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 179)
    public class282(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3555 = arg1;
        this.field3561 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            var5++;
        }
        this.field3557 = 0x1 << var5;
        this.field3559 = arg3;
        this.field3550 = var5;
    }

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1670(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1671(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class185 method1672(int arg0, int arg1, class185 arg2);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1673();

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1674(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1675(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1678(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1680(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1681(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1684(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1685(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Llaa;[I)V")
    public abstract void method1687(class123 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);
}
