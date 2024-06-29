import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class class242 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3438 = null;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method732(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILsc;)J")
    public static final long method1639(int arg0, int arg1, int arg2, class193 arg3) {
        field3439++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        if (arg0 != -388247648) {
            field3437 = -50;
        }
        class64 var10 = class375.method2395((byte) 91, arg3.method689((byte) -83));
        long var11 = (long) (arg1 | 0x40000000 | arg2 << 7 | arg3.method684(-13726) << 14 | arg3.method672(17011) << 20);
        if (var10.field922 == 0) {
            var11 |= var8;
        }
        if (var10.field944 == 1) {
            var11 |= var4;
        }
        if (var10.field875) {
            var11 |= var6;
        }
        return var11 | (long) arg3.method689((byte) -83) << 32;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZI)I")
    public static final int method1640(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return -8;
        }
        field3432++;
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
    public abstract int method737(int arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)V")
    public static final void method1641(byte arg0, int arg1) {
        field3435++;
        int var2 = class276.field3837 - class373.field5244;
        if (var2 >= 100) {
            class128.field1807 = 1;
            return;
        }
        int var3 = (int) class24.field416;
        if (class214.field2981 >> 8 > var3) {
            var3 = class214.field2981 >> 8;
        }
        if (class161.field2247[4] && class434.field6126[4] + 128 > var3) {
            var3 = class434.field6126[4] + 128;
        }
        int var4 = (int) class333.field4599 + class310.field4252 & 0x3FFF;
        class420.method2631(class67.field999, class285.method1858(class412.field5841.field6262, class142.field2034, class412.field5841.field6266, -81) - 50, arg0 ^ 0x59, var3, ((var3 >> 3) * 3) + 600, var4, class447.field6265, arg1);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class329.field4568 = (int) ((float) (class329.field4568 - class305.field4208) * var5 + (float) class305.field4208);
        class7.field107 = (int) ((float) (class7.field107 - class13.field268) * var5 + (float) class13.field268);
        class20.field376 = (int) ((float) (class20.field376 - class139.field1982) * var5 + (float) class139.field1982);
        class106.field1447 = (int) ((float) (class106.field1447 - class239.field3412) * var5 + (float) class239.field3412);
        int var6 = class369.field5199 - class42.field617;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class369.field5199 = (int) ((float) var6 * var5 + (float) class42.field617);
        class369.field5199 &= 0x3FFF;
        if (arg0 != -109) {
            method1643(-40);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()V")
    public abstract void method722();

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lmc;IIIIZ)Z")
    public abstract boolean method726(class69 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Lmc;IIIIZ)V")
    public abstract void method739(class69 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILmc;)Lmc;")
    public abstract class69 method733(int arg0, int arg1, class69 arg2);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method1642(int arg0) {
        field3436++;
        class131 var1 = class251.field3543;
        synchronized (class251.field3543) {
            class251.field3543.method900(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public static void method1643(int arg0) {
        if (arg0 < 28) {
            field3438 = null;
        }
        field3438 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method720(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
    public abstract void method738(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)I")
    public abstract int method725(int arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(II)V")
    public class242(int arg0, int arg1) {
        this.field3433 = arg1;
        this.field3434 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method731(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(Lmc;IIIIZ)V")
    public abstract void method736(class69 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(II)V")
    public abstract void method730(int arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lbh;[I)V")
    public abstract void method727(class24 arg0, int[] arg1);
}
