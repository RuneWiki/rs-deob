import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class class441 extends class198 {

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public int field6304;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public int field6308;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public int field6307;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public int field6302;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public int field6305;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public int field6303;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public int field6309;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "Z")
    public static boolean field6310 = false;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "[[I")
    public static int[][] field6300 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "Lub;")
    public static class15 field6313 = new class15(64);

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "[I")
    public static int[] field6315 = new int[32];

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
    public final void method613(byte arg0) {
        field6311++;
        if (arg0 > -56) {
            this.field6308 = 77;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
    public static final void method2745(int arg0) {
        class190.field2731 = 0;
        field6301++;
        class349.field5084 = 0;
        class446.method2777((byte) 83);
        class125.method751((byte) -78);
        class405.method2537((byte) 43);
        for (int var1 = 0; var1 < class190.field2731; var1++) {
            int var3 = class232.field3434[var1];
            if (class34.field434 != class442.field6317[var3].field4542) {
                if (class442.field6317[var3].field6375.method2274(8380)) {
                    class114.method689(class442.field6317[var3], 2047);
                }
                class442.field6317[var3].method2781((class346) null, (byte) 109);
                class442.field6317[var3] = null;
            }
        }
        if (class242.field3572 != class352.field5114.field1880) {
            throw new RuntimeException("gnp1 pos:" + class352.field5114.field1880 + " psize:" + class242.field3572);
        }
        int var2 = 0;
        if (arg0 != -24536) {
            field6300 = null;
        }
        while (class229.field3396 > var2) {
            if (class442.field6317[class431.field6169[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class229.field3396);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Z")
    public final boolean method610(int arg0) {
        field6312++;
        if (arg0 != -439) {
            this.method610(59);
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[Ljava/lang/Object;I[J)V")
    public static final void method2746(int arg0, int arg1, Object[] arg2, int arg3, long[] arg4) {
        if (arg1 >= -90) {
            return;
        }
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var9;
            for (int var10 = arg0; var10 < arg3; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg4[var10]) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var13 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var13;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var9;
            method2746(arg0, -110, arg2, var6 - 1, arg4);
            method2746(var6 + 1, -107, arg2, arg3, arg4);
        }
        field6316++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V")
    public final void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6) {
        field6314++;
        int var8 = -95 / ((12 - arg5) / 40);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(B)I")
    public abstract int method1766(byte arg0);

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)V")
    public static void method2747(int arg0) {
        field6300 = null;
        if (arg0 == 2) {
            field6313 = null;
            field6315 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIII)V")
    public class441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6304 = arg4;
        this.field6308 = arg1;
        this.field6307 = arg6;
        this.field6302 = arg3;
        this.field6305 = arg5;
        this.field6303 = arg2;
        this.field6309 = arg0;
    }
}
