import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class128 {

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Lfd;")
    private class365 field1859;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "J")
    public long field1860;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1855 = new String[100];

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "[I")
    public static int[] field1854 = new int[2];

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1861++;
        this.field1859.method2256(-34844, this.field1860);
        super.finalize();
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public static void method992(int arg0) {
        field1855 = null;
        field1854 = null;
        int var1 = 88 / ((arg0 + 31) / 33);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIFLge;FF[BIIFIFZ)V")
    public static final void method993(int arg0, int arg1, int arg2, float arg3, class499 arg4, float arg5, float arg6, byte[] arg7, int arg8, int arg9, float arg10, int arg11, float arg12, boolean arg13) {
        field1857++;
        int var14 = arg0 * arg1;
        float[] var15 = new float[var14];
        int var16 = 0;
        if (arg13) {
            field1854 = null;
        }
        while (var16 < arg2) {
            int var19 = arg11;
            arg4.method503(0, arg6 / (float) arg1, arg0, arg1, arg5 / (float) arg8, arg8, arg10 / (float) arg0, arg12 * 127.0F, 7, arg9, var15);
            arg5 *= 2.0F;
            arg6 *= 2.0F;
            arg10 *= 2.0F;
            arg12 = arg3 * arg12;
            for (int var20 = 0; var20 < var14; var20++) {
                arg7[var19] = (byte) ((int) ((float) arg7[var19] + var15[var20]));
                var19++;
            }
            var16++;
        }
        int var17 = arg11;
        for (int var18 = 0; var18 < var14; var18++) {
            arg7[var17] = (byte) (arg7[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lfd;J[Lwl;)V")
    public class128(class365 arg0, long arg1, class280[] arg2) {
        this.field1859 = arg0;
        this.field1860 = arg1;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ)Z")
    public static final boolean method994(int arg0, boolean arg1) {
        field1858++;
        boolean var2 = class225.field3300.method378();
        if (arg0 != -14734) {
            field1862 = -1;
        }
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class225.field3300.method289();
        } else if (!class225.field3300.method303()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class478.field7044.field3343 = arg1;
            class478.field7044.method2067(class498.field7404, (byte) -120);
            return true;
        }
    }

    static {
        new class331("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field1862 = 765;
    }
}
