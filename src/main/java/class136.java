import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class136 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[I")
    private int[] field2507;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lqe;")
    private static class179 field2508 = class206.method1380("Choose Option", (byte) 68);

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lqe;")
    public static class179 field2510 = field2508;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field2515 = 1;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "[I")
    public static int[] field2513 = new int[256];

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lqe;")
    public static class179 field2516 = class206.method1380("Unerwartete Antwort vom Anmelde)2Server)3", (byte) 99);

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "[I")
    public static int[] field2517;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lqe;")
    private static class179 field2521;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lqe;")
    public static class179 field2518;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Ldc;")
    public static class36 field2519;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "[Lc;")
    public static class22[] field2522;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Lqe;")
    public static class179 field2523;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method866(int arg0) {
        field2518 = null;
        field2522 = null;
        field2521 = null;
        field2517 = null;
        field2519 = null;
        if (arg0 > -36) {
            return;
        }
        field2508 = null;
        field2510 = null;
        field2523 = null;
        field2513 = null;
        field2516 = null;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "([I)V")
    public class136(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2507 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2507[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2507[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2507[var5 + var5] = arg0[var4];
            this.field2507[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjava/lang/String;)Lqe;")
    public static final class179 method867(byte arg0, String arg1) {
        field2509++;
        if (arg0 > -18) {
            field2508 = null;
        }
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class179 var3 = new class179();
        var3.field3256 = var2;
        var3.field3277 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field3277++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)I")
    public final int method868(byte arg0, int arg1) {
        int var3 = -52 / ((arg0 + 59) / 63);
        int var4 = (this.field2507.length >> 1) - 1;
        field2512++;
        int var5 = var4 & arg1;
        while (true) {
            int var6 = this.field2507[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field2507[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Leh;Lqe;Lqe;Z)[Llg;")
    public static final class126[] method869(class52 arg0, class179 arg1, class179 arg2, boolean arg3) {
        field2511++;
        int var4 = arg0.method359(-1, arg1);
        if (!arg3) {
            field2510 = null;
        }
        int var5 = arg0.method362(-91, var4, arg2);
        return class124.method779(var5, arg0, var4, !arg3);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2513[var0] = var1;
        }
        field2517 = new int[25];
        field2520 = -1;
        field2521 = class206.method1380("Malformed login packet)3", (byte) 53);
        field2518 = field2521;
        field2519 = new class36();
        field2522 = new class22[50];
        field2523 = class206.method1380("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", (byte) -128);
    }
}
