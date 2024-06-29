import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class193 {

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public int field2685;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "[I")
    public static int[] field2688 = new int[14];

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lbq;")
    public static class114 field2683;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "[Ll;")
    public static class315[] field2687;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V", line = 8)
    public static final void method1286(int arg0, int arg1, int arg2) {
        field2689++;
        if (arg0 > -58) {
            field2683 = null;
        }
        class92 var3 = class406.method2575(14880, arg2);
        int var4 = var3.field1260;
        int var5 = var3.field1259;
        int var6 = var3.field1262;
        int var7 = class354.field5246[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class359.method2358(class100.field1325[var4] & ~var8 | arg1 << var5 & var8, -1, var4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 44)
    public static final void method1287(byte arg0) {
        field2682++;
        class316 var1 = (class316) class41.field625.method1575(0);
        int var2 = 102 / ((-arg0 - 16) / 45);
        while (var1 != null) {
            if (var1.field4619 == -1) {
                var1.field4629 = 0;
                class295.method1999(-107, var1);
            } else {
                var1.method2632(true);
            }
            var1 = (class316) class41.field625.method1573((byte) -128);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(II)V", line = 73)
    public class193(int arg0, int arg1) {
        this.field2685 = arg1;
        this.field2681 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V", line = 95)
    public static void method1288(byte arg0) {
        field2683 = null;
        if (arg0 <= -30) {
            field2687 = null;
            field2688 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILc;)Lc;")
    public abstract class308 method735(int arg0, int arg1, class308 arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method729(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method739(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
    public abstract void method728(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    public abstract int method722(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;IIIIZ)V")
    public abstract void method727(class308 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method726(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)V")
    public abstract void method724(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Lc;IIIIZ)V")
    public abstract void method733(class308 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Lc;IIIIZ)Z")
    public abstract boolean method738(class308 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)I")
    public abstract int method725(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public abstract void method731();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldn;[I)V")
    public abstract void method734(class16 arg0, int[] arg1);
}
