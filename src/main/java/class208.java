import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class208 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lwi;")
    private class330 field2872 = new class330(64);

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Luu;")
    private class191 field2885;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Luu;")
    public class191 field2879;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Z")
    public static boolean field2874 = false;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lpa;")
    public static class254 field2878 = new class254(8, 7);

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[I")
    public static int[] field2881 = new int[32];

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field2884 = new String[100];

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public final void method1425(int arg0) {
        class330 var2 = this.field2872;
        synchronized (this.field2872) {
            this.field2872.method2127((byte) 127);
        }
        if (arg0 != 2) {
            this.method1428(-2, -126);
        }
        field2883++;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public final void method1426(int arg0) {
        field2876++;
        class330 var2 = this.field2872;
        synchronized (this.field2872) {
            this.field2872.method2135(0);
        }
        int var3 = -121 / ((arg0 + 40) / 57);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public final void method1427(int arg0, int arg1) {
        class330 var3 = this.field2872;
        synchronized (this.field2872) {
            if (arg0 != 32) {
                method1431(61, -2, null, -58, 54, 86, -115, -68);
            }
            this.field2872.method2140(-108, arg1);
        }
        field2880++;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)Lwc;")
    public final class47 method1428(int arg0, int arg1) {
        field2877++;
        if (arg0 != 31348) {
            return null;
        }
        class330 var3 = this.field2872;
        class47 var4;
        synchronized (this.field2872) {
            var4 = (class47) this.field2872.method2133((long) arg1, (byte) 125);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field2885;
        byte[] var6;
        synchronized (this.field2885) {
            var6 = this.field2885.method1281(3, arg1, 71);
        }
        class47 var7 = new class47();
        var7.field670 = this;
        if (var6 != null) {
            var7.method369(new class164(var6), (byte) -109);
        }
        class330 var8 = this.field2872;
        synchronized (this.field2872) {
            this.field2872.method2131(var7, (long) arg1, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    public static void method1429(int arg0) {
        field2884 = null;
        field2878 = null;
        field2881 = null;
        if (arg0 != 3) {
            method1429(58);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILnq;IZI[I)Lld;")
    public static final class116 method1430(int arg0, class325 arg1, int arg2, boolean arg3, int arg4, int[] arg5) {
        if (arg2 >= -98) {
            method1430(-90, null, 102, true, -77, null);
        }
        field2882++;
        if (!arg1.field4999 && (!class152.method994(arg0, false) || !class152.method994(arg4, false))) {
            return arg1.field5027 ? new class116(arg1, 34037, arg0, arg4, arg3, arg5) : new class116(arg1, arg0, arg4, class475.method2835(arg0, -1), class475.method2835(arg4, -1), arg5);
        } else {
            return new class116(arg1, 3553, arg0, arg4, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
    public static final void method1431(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2873++;
        class400 var8 = new class400();
        var8.field6089 = arg2;
        var8.field6092 = arg5;
        if (arg3 != 0) {
            return;
        }
        var8.field6093 = arg7;
        var8.field6083 = class393.field6017 + arg6;
        var8.field6097 = arg1;
        var8.field6087 = arg0;
        var8.field6085 = arg4;
        class145.field1931.method3045(var8, arg3 ^ 0x7E);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Liv;ILuu;Luu;)V")
    public class208(class65 arg0, int arg1, class191 arg2, class191 arg3) {
        this.field2885 = arg2;
        this.field2879 = arg3;
        this.field2885.method1290(false, 3);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2881[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
