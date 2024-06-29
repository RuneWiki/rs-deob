import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class61 extends class172 {

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "[B")
    public byte[] field943;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field939 = 0;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field940 = 0;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "[I")
    public static int[] field948 = new int[14];

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field947 = 0;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "J")
    public static long field938;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Lwd;")
    public static class166 field941;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Z")
    public static boolean field946;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIILqf;Lqf;IIJ)V", line = 7)
    public static final void method614(int arg0, int arg1, int arg2, int arg3, class64 arg4, class64 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class202 var10 = new class202();
        var10.field3111 = arg8;
        var10.field3117 = arg1 * 128 + 64;
        var10.field3128 = arg2 * 128 + 64;
        var10.field3126 = arg3;
        var10.field3121 = arg4;
        var10.field3116 = arg5;
        var10.field3110 = arg6;
        var10.field3124 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class170.field2689[var11][arg1][arg2] == null) {
                class170.field2689[var11][arg1][arg2] = new class329(var11, arg1, arg2);
            }
        }
        class170.field2689[arg0][arg1][arg2].field5064 = var10;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([B)V", line = 39)
    public class61(byte[] arg0) {
        this.field943 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Luf;", line = 51)
    public static final class184 method615(int arg0) {
        if (arg0 != 14) {
            field946 = false;
        }
        field942++;
        try {
            return (class184) Class.forName("pk").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 68)
    public static final void method616(byte arg0) {
        field945++;
        class332.field5095.method655(-1);
        class280.field4315.method655(-1);
        if (arg0 != -73) {
            field948 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 81)
    public static final void method617(String arg0, byte arg1) {
        field937++;
        if (!arg0.equals("") && arg1 == 41) {
            class121.field1882++;
            class99.field1491.method1628((byte) -21, 255);
            class99.field1491.method273(0, class34.method354(arg0, (byte) 51));
            class99.field1491.method280(arg1 ^ 0xFFFFB87E, arg0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Lvd;", line = 102)
    public static final class72 method618(byte arg0, int arg1) {
        if (arg0 < 82) {
            method614(-48, 123, 66, -26, (class64) null, (class64) null, -94, 63, 80L);
        }
        field944++;
        class72 var2 = (class72) class294.field4567.method1386(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class163.field2599.method187(arg1, 0, -1);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class72 var4 = class62.method626(var3, true);
            class294.field4567.method1385(var4, (byte) -30, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 126)
    public static void method619(byte arg0) {
        field941 = null;
        field948 = null;
        if (arg0 <= 123) {
            field947 = -28;
        }
    }
}
