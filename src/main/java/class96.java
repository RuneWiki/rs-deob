import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class96 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lic;")
    public static class59 field2427 = class59.method433(0, "leuchten3:");

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lic;")
    public static class59 field2429 = class59.method433(0, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field2426 = 0;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2432 = 0;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lic;")
    private static class59 field2428 = class59.method433(0, "Please remove ");

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field2437 = 0;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lic;")
    public static class59 field2433 = field2428;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lic;")
    public static class59 field2430 = field2428;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lic;")
    public static class59 field2431 = null;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Llf;")
    public static class82 field2436 = new class82(500);

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method788(int arg0) {
        field2431 = null;
        field2436 = null;
        field2427 = null;
        field2433 = null;
        if (arg0 != -7142) {
            method788(21);
        }
        field2429 = null;
        field2430 = null;
        field2428 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)V")
    public abstract void method789(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ldd;III)Lt;")
    public static final class132 method790(class26 arg0, int arg1, int arg2, int arg3) {
        field2434++;
        if (class159.method1234(arg3, -65536, arg1, arg0)) {
            if (arg2 != 0) {
                method791(null, 52, -16, -64);
            }
            return class82.method674((byte) 36);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([BIII)Z")
    public static final boolean method791(byte[] arg0, int arg1, int arg2, int arg3) {
        field2438++;
        boolean var4 = true;
        if (arg2 > -75) {
            field2428 = null;
        }
        int var5 = -1;
        class157 var6 = new class157(arg0);
        label58: while (true) {
            int var7 = var6.method1171(-32768);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var5 += var7;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method1171(-32768);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var8 & 0x3F;
                    int var14 = arg1 + var12;
                    int var15 = var6.method1194(false) >> 2;
                    int var16 = arg3 + var13;
                    if (var14 > 0 && var16 > 0 && var14 < 103 && var16 < 103) {
                        class19 var17 = class53.method397(var5, 13415);
                        if (var15 != 22 || !class127.field2882 || var17.field375 != 0 || var17.field391 == 1 || var17.field385) {
                            var9 = true;
                            if (!var17.method110(164579463)) {
                                var4 = false;
                                class38.field989++;
                            }
                        }
                    }
                }
                int var10 = var6.method1171(-32768);
                if (var10 == 0) {
                    break;
                }
                var6.method1194(false);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method792(boolean arg0);
}
