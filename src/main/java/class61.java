import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class61 {

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "Lwi;")
    private class330 field881 = new class330(64);

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "Luu;")
    private class191 field880;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "J")
    public static long field873 = 0L;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "[Lsd;")
    public static class62[] field877;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V", line = 4)
    public static void method436(boolean arg0) {
        if (arg0) {
            method437(null, '^', 112);
        }
        field877 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;", line = 15)
    public static final String[] method437(String arg0, char arg1, int arg2) {
        field876++;
        int var3 = class357.method2287(arg1, arg0, -15414);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg2 != 243) {
            method436(true);
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1 != arg0.charAt(var8); var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)I", line = 53)
    public static final int method438(int arg0, int arg1, int arg2) {
        field879++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        int var4 = 69 / ((arg1 + 29) / 36);
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)I", line = 81)
    public static final int method439(int arg0, int arg1) {
        field874++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (arg0 != 32022) {
            return 33;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)Lgb;", line = 190)
    public final class145 method440(int arg0, int arg1) {
        field878++;
        class330 var3 = this.field881;
        class145 var4;
        synchronized (this.field881) {
            var4 = (class145) this.field881.method2133((long) arg0, (byte) 87);
            if (arg1 != 13367) {
                this.method440(-16, -83);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field880;
        byte[] var6;
        synchronized (this.field880) {
            var6 = this.field880.method1281(19, arg0, arg1 - 13268);
        }
        class145 var7 = new class145();
        if (var6 != null) {
            var7.method966(new class164(var6), -2);
        }
        class330 var8 = this.field881;
        synchronized (this.field881) {
            this.field881.method2131(var7, (long) arg0, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Liv;ILuu;)V", line = 221)
    public class61(class65 arg0, int arg1, class191 arg2) {
        this.field880 = arg2;
        this.field875 = this.field880.method1290(false, 19);
    }
}
