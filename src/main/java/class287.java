import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class287 {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field4798 = 0;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lna;")
    public static class26 field4800 = class69.method505("", (byte) -120);

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field4803 = 0;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field4801 = -1;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[[I")
    public static int[][] field4804 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lih;")
    public static class32 field4796 = new class32();

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Lna;")
    public static class26 field4805 = class69.method505("headicons_prayer", (byte) -120);

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "[J")
    public static long[] field4807 = new long[32];

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Z")
    public static boolean field4806 = false;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 7)
    public static void method2021(int arg0) {
        field4805 = null;
        field4796 = null;
        if (arg0 != 3846) {
            field4803 = 60;
        }
        field4804 = (int[][]) null;
        field4807 = null;
        field4800 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[B", line = 29)
    public static final synchronized byte[] method2022(int arg0, int arg1) {
        field4802++;
        if (arg1 == 100 && class64.field1016 > 0) {
            byte[] var2 = class261.field4266[--class64.field1016];
            class261.field4266[class64.field1016] = null;
            return var2;
        }
        if (arg0 < 55) {
            method2021(-79);
        }
        if (arg1 == 5000 && class305.field5266 > 0) {
            byte[] var3 = class92.field1505[--class305.field5266];
            class92.field1505[class305.field5266] = null;
            return var3;
        } else if (arg1 == 30000 && class27.field455 > 0) {
            byte[] var4 = class109.field1740[--class27.field455];
            class109.field1740[class27.field455] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZBIZ)V", line = 65)
    public static final void method2023(int arg0, boolean arg1, byte arg2, int arg3, boolean arg4) {
        class153.method1037(arg0, arg3, class20.field282.length - 1, arg4, 0, arg1, false);
        if (arg2 != 30) {
            field4800 = (class26) null;
        }
        field4797++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[JII[Ljava/lang/Object;)V", line = 81)
    public static final void method2024(int arg0, long[] arg1, int arg2, int arg3, Object[] arg4) {
        if (arg2 < 85) {
            field4796 = (class32) null;
        }
        if (arg3 < arg0) {
            int var5 = arg3;
            int var6 = (arg3 + arg0) / 2;
            long var7 = arg1[var6];
            arg1[var6] = arg1[arg0];
            arg1[arg0] = var7;
            Object var9 = arg4[var6];
            arg4[var6] = arg4[arg0];
            arg4[arg0] = var9;
            for (int var10 = arg3; var10 < arg0; var10++) {
                if ((long) (var10 & 0x1) + var7 > arg1[var10]) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var5];
                    arg1[var5] = var11;
                    Object var13 = arg4[var10];
                    arg4[var10] = arg4[var5];
                    arg4[var5++] = var13;
                }
            }
            arg1[arg0] = arg1[var5];
            arg1[var5] = var7;
            arg4[arg0] = arg4[var5];
            arg4[var5] = var9;
            method2024(var5 - 1, arg1, 107, arg3, arg4);
            method2024(arg0, arg1, 89, var5 + 1, arg4);
        }
        field4799++;
    }
}
