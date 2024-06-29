import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class311 {

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5062 = "wave2:";

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5061 = "yellow:";

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "F")
    public static float field5056;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public int field5059;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public int field5064;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public int field5065;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)I", line = 10)
    public static final int method2169(String arg0, String arg1, byte arg2, int arg3) {
        int var4 = 0;
        field5058++;
        int var5 = arg1.length();
        int var6 = arg0.length();
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var5 > var4 - var8 || var7 - var9 < var6) {
            if (var5 <= var4 - var8) {
                return -1;
            }
            if (var6 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var4++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class48.method357((byte) -116, var22);
            var9 = class48.method357((byte) -4, var24);
            char var26 = class243.method1697((byte) -69, var22, arg3);
            char var27 = class243.method1697((byte) -111, var24, arg3);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class249.method1773(arg3, var28, true) - class249.method1773(arg3, var29, true);
                }
            }
        }
        if (arg2 >= -43) {
            field5056 = 0.011837777F;
        }
        int var10 = Math.min(var5, var6);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg3 == 2) {
                var12 = var6 - var11 - 1;
                var13 = var5 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg1.charAt(var13);
            char var15 = arg0.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class249.method1773(arg3, var16, true) - class249.method1773(arg3, var17, true);
                }
            }
        }
        int var18 = var5 - var6;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg1.charAt(var19);
            char var21 = arg0.charAt(var19);
            if (var20 != var21) {
                return class249.method1773(arg3, var20, true) - class249.method1773(arg3, var21, true);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)I", line = 132)
    public static final int method2170(byte arg0) {
        if (arg0 == 64) {
            field5055++;
            return 6;
        } else {
            return 76;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lfh;II)V", line = 150)
    private final void method2171(class313 arg0, int arg1, int arg2) {
        field5057++;
        if (arg2 == -8239 && arg1 == 1) {
            this.field5059 = arg0.method2250(-1613178296);
            this.field5064 = arg0.method2224(-125);
            this.field5065 = arg0.method2224(-126);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLfh;)V", line = 173)
    public final void method2172(boolean arg0, class313 arg1) {
        field5054++;
        if (!arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method2224(-120);
            if (var3 == 0) {
                return;
            }
            this.method2171(arg1, var3, -8239);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V", line = 194)
    public static final void method2173(int arg0, int arg1, int arg2) {
        int var3 = class315.field5201 * arg2 >> 8;
        field5063++;
        if (arg0 != 0) {
            field5062 = (String) null;
        }
        if (arg1 == -1 && !class310.field5053) {
            class25.method215(false);
        } else if (arg1 != -1 && (class214.field3279 != arg1 || !class246.method1752(0)) && var3 != 0 && !class310.field5053) {
            class261.method1833(0, class310.field5042, 2, -117, arg1, var3, false);
        }
        class214.field3279 = arg1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 221)
    public static void method2174(int arg0) {
        field5061 = null;
        int var1 = -74 / ((arg0 - 56) / 57);
        field5062 = null;
    }
}
