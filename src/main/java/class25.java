import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class25 {

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field376 = -1;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Lbd;")
    public static class190 field384 = new class190();

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Ljava/lang/String;")
    public static String field389 = "white:";

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "[S")
    public static short[] field391 = new short[256];

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "Lta;")
    public static class262 field390 = new class262(64);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "Luf;")
    public static class176 field387;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Luf;")
    public static class176 field388;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static final void method200(int arg0) {
        if (arg0 != 128) {
            return;
        }
        if (class276.field4349 != null) {
            class253 var1 = class276.field4349;
            synchronized (class276.field4349) {
                class276.field4349 = null;
            }
        }
        field369++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method201(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field380++;
        if (arg4 < 128 || arg3 < 128 || arg4 > 13056 || arg3 > 13056) {
            class256.field3921 = -1;
            class275.field4324 = -1;
            return;
        }
        int var8 = class224.method1502((byte) -128, class274.field4318, arg3, arg4) - arg6;
        int var9 = arg4 - class266.field4245;
        int var10 = arg3 - class69.field1100;
        int var11 = var8 - class295.field4631;
        int var12 = class97.field1557[field373];
        if (!arg0) {
            field388 = null;
        }
        int var13 = class97.field1556[field373];
        int var14 = class97.field1557[class142.field2182];
        int var15 = class97.field1556[class142.field2182];
        int var16 = var10 * var14 + (var9 * var15) >> 16;
        int var17 = var10 * var15 - var9 * var14 >> 16;
        int var19 = var11 * var13 - var12 * var17 >> 16;
        int var20 = var11 * var12 + (var13 * var17) >> 16;
        if (var20 < 50) {
            class275.field4324 = -1;
            class256.field3921 = -1;
        } else {
            class275.field4324 = (var16 << 9) / var20 + arg5;
            class256.field3921 = (var19 << 9) / var20 + arg1;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Lpg;")
    public static final class76 method202(int arg0, int arg1) {
        field372++;
        class76 var2 = (class76) class35.field565.method1780((long) arg0, (byte) -125);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class127.field1992.method1163(29, arg0, 48);
        class76 var4 = new class76();
        if (arg1 != -281) {
            return null;
        }
        if (var3 != null) {
            var4.method602(false, new class37(var3), arg0);
        }
        class35.field565.method1784(var4, false, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method203(String arg0, int arg1) {
        if (arg1 > -109) {
            return null;
        }
        String var2 = class288.method1938(class247.method1668(arg0, true), 68);
        field383++;
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;ILuf;)Lee;")
    public static final class288 method204(String arg0, int arg1, class176 arg2) {
        field370++;
        int var3 = arg2.method1168(20345, arg0);
        if (var3 == -1) {
            return new class288(0);
        }
        int[] var4 = arg2.method1157(var3, false);
        if (arg1 < 42) {
            field389 = null;
        }
        class288 var5 = new class288(var4.length);
        for (int var6 = 0; var6 < var5.field4535; var6++) {
            class37 var7 = new class37(arg2.method1163(var3, var4[var6], 48));
            var5.field4538[var6] = var7.method331(16312);
            var5.field4532[var6] = var7.method322((byte) 41);
            var5.field4543[var6] = var7.method307(-110);
            var5.field4539[var6] = var7.method307(-87);
        }
        return var5;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static final void method205(byte arg0) {
        class262.field4098++;
        if (arg0 == -101) {
            field381++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static void method206(int arg0) {
        field389 = null;
        field388 = null;
        if (arg0 < -51) {
            field387 = null;
            field384 = null;
            field390 = null;
            field391 = null;
        }
    }
}
