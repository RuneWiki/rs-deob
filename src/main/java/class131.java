import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class131 {

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Lcd;")
    private class69 field2396 = new class69(256);

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "Lcd;")
    private class69 field2405 = new class69(256);

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Lok;")
    private class149 field2399;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Lok;")
    private class149 field2391;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "[I")
    public static int[] field2390 = new int[32];

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lud;")
    public static class279 field2392 = class130.method1024("Bitte entfernen Sie ", 255);

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "D")
    public static double field2397 = -1.0D;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "Lud;")
    public static class279 field2401;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "Lud;")
    public static class279 field2403;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Lud;")
    private static class279 field2404;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Lud;")
    public static class279 field2400;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field2398;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2390[var1] = var0 - 1;
            var0 += var0;
        }
        field2402 = 0;
        field2401 = class130.method1024("; version=1; path=)4; domain=", 255);
        field2403 = class130.method1024("Veuillez patienter)3)3)3", 255);
        field2404 = class130.method1024("Loading config )2 ", 255);
        field2400 = field2404;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([III)Ltc;", line = 16)
    public final class40 method1029(int[] arg0, int arg1, int arg2) {
        field2393++;
        if (this.field2399.method1181(arg2 - 62) == 1) {
            return this.method1031(arg1, 0, arg0, (byte) -93);
        } else if (arg2 != 0) {
            return (class40) null;
        } else if (this.field2399.method1174(arg1, -17680) == 1) {
            return this.method1031(0, arg1, arg0, (byte) 124);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 39)
    public static void method1030(int arg0) {
        field2400 = null;
        field2403 = null;
        field2401 = null;
        field2392 = null;
        field2390 = null;
        field2404 = null;
        if (arg0 != -2) {
            field2400 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[IB)Ltc;", line = 64)
    private final class40 method1031(int arg0, int arg1, int[] arg2, byte arg3) {
        field2389++;
        int var5 = -69 / ((60 - arg3) / 55);
        int var6 = (arg1 >>> 12 | (arg1 & 0xA0000FFF) << 4) ^ arg0;
        int var7 = var6 | arg1 << 16;
        long var8 = (long) var7;
        class40 var10 = (class40) this.field2405.method610(var8, -1);
        if (var10 != null) {
            return var10;
        } else if (arg2 == null || arg2[0] > 0) {
            class187 var11 = class187.method1438(this.field2399, arg1, arg0);
            if (var11 == null) {
                return null;
            }
            class40 var12 = var11.method1436();
            this.field2405.method612(false, var12, var8);
            if (arg2 != null) {
                arg2[0] -= var12.field861.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 100)
    public static final void method1032(Component arg0, byte arg1) {
        if (arg1 != -90) {
            return;
        }
        field2398++;
        Method var2 = class305.field5427;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class101.field1892);
        arg0.addFocusListener(class101.field1892);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)Ldb;", line = 123)
    public static final class182 method1033(byte arg0, int arg1) {
        field2388++;
        class182 var2 = (class182) class98.field1845.method1336((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class8.field339.method1192(arg0 + 82, class78.method654(arg0 + -237709703, arg1), class72.method630(arg1, (byte) 73));
        if (arg0 != -82) {
            method1033((byte) 46, 62);
        }
        class182 var4 = new class182();
        var4.field3320 = arg1;
        if (var3 != null) {
            var4.method1411((byte) 82, new class53(var3));
        }
        var4.method1413((byte) 104);
        class98.field1845.method1331(var4, 30237, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[IBI)Ltc;", line = 150)
    private final class40 method1034(int arg0, int[] arg1, byte arg2, int arg3) {
        field2394++;
        int var5 = arg0 ^ (arg3 >>> 12 | arg3 << 4 & 0xFFF5);
        int var6 = var5 | arg3 << 16;
        if (arg2 != -87) {
            field2402 = 75;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class40 var9 = (class40) this.field2405.method610(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class258 var10 = (class258) this.field2396.method610(var7, -1);
            if (var10 == null) {
                var10 = class258.method1848(this.field2391, arg3, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field2396.method612(false, var10, var7);
            }
            class40 var11 = var10.method1854(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method2221(true);
                this.field2405.method612(false, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ[I)Ltc;", line = 203)
    public final class40 method1035(int arg0, boolean arg1, int[] arg2) {
        field2395++;
        if (this.field2391.method1181(-126) == 1) {
            return this.method1034(arg0, arg2, (byte) -87, 0);
        } else if (this.field2391.method1174(arg0, -17680) == 1) {
            return this.method1034(0, arg2, (byte) -87, arg0);
        } else {
            if (!arg1) {
                this.method1029((int[]) null, -102, -60);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lok;Lok;)V", line = 282)
    public class131(class149 arg0, class149 arg1) {
        this.field2399 = arg0;
        this.field2391 = arg1;
    }
}
