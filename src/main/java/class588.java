import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class588 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lpl;")
    public class560 field8721 = null;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "[Lhc;")
    private class391[] field8724 = null;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[Lhc;")
    public class391[] field8728 = null;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Z")
    public boolean field8722;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "J")
    public static long field8726 = 0L;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lam;")
    public static class646 field8723 = new class646(0, 0);

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field8730 = 2;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILwca;I)V")
    public static final void method3429(int arg0, int arg1, class311 arg2, int arg3) {
        class582.field8558 = arg3;
        class158.field2079 = arg2;
        class80.field922 = arg1;
        if (arg0 == 32768) {
            field8731++;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method3430(int arg0, String arg1, int arg2, int arg3, String arg4, String arg5, int arg6, String arg7) {
        field8727++;
        class258 var8 = class493.field7445[99];
        int var9 = 99;
        if (arg2 <= 18) {
            method3431(-106, null, -1.721991F, 82, (byte) 20, -99, -85, 0.948302F, -1.4445692F, null, 1.1256568F, 0.5689136F, 116, -53);
        }
        while (var9 > 0) {
            class493.field7445[var9] = class493.field7445[var9 - 1];
            var9--;
        }
        if (var8 == null) {
            var8 = new class258(arg6, arg0, arg7, arg4, arg5, arg3, arg1);
        } else {
            var8.method1627(arg6, arg0, arg5, arg4, (byte) -26, arg3, arg7, arg1);
        }
        class559.field8304 = class73.field858;
        class493.field7445[0] = var8;
        class461.field6673++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[BFIBIIFFLjq;FFII)V")
    public static final void method3431(int arg0, byte[] arg1, float arg2, int arg3, byte arg4, int arg5, int arg6, float arg7, float arg8, class447 arg9, float arg10, float arg11, int arg12, int arg13) {
        field8732++;
        int var14 = arg3 * arg13;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg12; var16++) {
            int var19 = arg6;
            arg9.method2713(arg7 / (float) arg13, arg0, arg2 * 127.0F, arg5, arg8 / (float) arg5, 0, false, var15, arg3, arg13, arg11 / (float) arg3);
            arg2 *= arg10;
            arg11 *= 2.0F;
            arg8 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg1[var19] = (byte) ((int) ((float) arg1[var19] + var15[var20]));
                var19++;
            }
            arg7 *= 2.0F;
        }
        int var17 = arg6;
        int var18 = 0;
        if (arg4 != -56) {
            field8730 = -84;
        }
        while (var18 < var14) {
            arg1[var17] = (byte) (arg1[var17] + 127);
            var17++;
            var18++;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Z")
    public final boolean method3432(boolean arg0) {
        if (!arg0) {
            return false;
        }
        field8725++;
        if (this.field8722) {
            return this.field8721 != null;
        } else {
            return this.field8728 != null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method3433(int arg0) {
        field8723 = null;
        if (arg0 != 256) {
            field8726 = -60L;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lkw;)V")
    public class588(class174 arg0) {
        this.field8722 = arg0.field2579;
        if (this.field8722 && !arg0.method279(class629.field9208, (byte) 81, class556.field8245)) {
            this.field8722 = false;
        }
        if (this.field8722 || arg0.method338(false, class629.field9208, class556.field8245)) {
            class293.method1824(128);
            if (this.field8722) {
                byte[] var6 = class568.method3317(class313.field4699, (byte) 51, false);
                this.field8721 = arg0.method355(16, class556.field8245, var6, 128, 128, (byte) -56);
                byte[] var7 = class568.method3317(class114.field1510, (byte) 51, false);
                arg0.method355(16, class556.field8245, var7, 128, 128, (byte) -56);
            } else {
                this.field8728 = new class391[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class231.method1509(32768, class313.field4699, 4096, var2 * 256 * 128);
                    this.field8728[var2] = arg0.method1165(true, var5, 128, 128, -105, class556.field8245);
                }
                this.field8724 = new class391[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class231.method1509(32768, class114.field1510, 4096, var3 * 128 * 2 * 128);
                    this.field8724[var3] = arg0.method1165(true, var4, 128, 128, -107, class556.field8245);
                }
            }
        }
    }
}
