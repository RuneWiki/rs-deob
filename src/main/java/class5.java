import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lsc;")
    private static class128 field39 = class129.method1017(false, "Close");

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Z")
    public static boolean field43 = false;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lsc;")
    public static class128 field48 = field39;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Lsc;")
    private static class128 field56 = class129.method1017(false, "skill)2");

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "Lsc;")
    public static class128 field58 = class129.method1017(false, "Stufe)2");

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Lsc;")
    private static class128 field65 = class129.method1017(false, "Loaded input handler");

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lsc;")
    public static class128 field61 = class129.method1017(false, "Standort");

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lsc;")
    private static class128 field42 = class129.method1017(false, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lsc;")
    public static class128 field47 = class129.method1017(false, "(U(Y");

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lsc;")
    public static class128 field57 = field65;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Lsc;")
    public static class128 field60 = field42;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lsc;")
    public static class128 field49 = field56;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Lrd;")
    public static class122 field51;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lsc;")
    public class128 field50;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Lsf;")
    public static class131 field59;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Z")
    public static boolean field55;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Z")
    public boolean field66;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[Lja;")
    public static class63[] field45;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method14(int arg0) {
        if (arg0 != 17688) {
            return;
        }
        for (class143 var1 = (class143) class66.field1492.method970(true); var1 != null; var1 = (class143) class66.field1492.method968(-91)) {
            int var2 = var1.field3349;
            if (class65.method488((byte) 120, var2)) {
                class54[] var3 = class123.field2791[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field1146;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field365;
                    class54 var7 = class46.method338(var6, arg0 - 17794);
                    if (var7 != null) {
                        class89.method696(var7, 1);
                    }
                }
            }
        }
        field63++;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static void method15(int arg0) {
        field49 = null;
        field47 = null;
        field48 = null;
        field59 = null;
        field58 = null;
        field57 = null;
        if (arg0 < 94) {
            field60 = null;
        }
        field51 = null;
        field56 = null;
        field60 = null;
        field65 = null;
        field42 = null;
        field45 = null;
        field39 = null;
        field61 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
    public static final void method16(int arg0, int arg1, int arg2) {
        if (arg2 != -25444) {
            method16(87, -96, -30);
        }
        field41++;
        if (class150.field3449 != 0 && class150.field3449 != 3 || class120.field2726 != 1) {
            return;
        }
        int var3 = class43.field806 - arg1 - 25;
        int var4 = class9.field133 - arg0 - 5;
        if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
            return;
        }
        var4 -= 75;
        int var5 = class94.field2184 + class46.field857 & 0x7FF;
        var3 -= 73;
        int var6 = class114.field2564[var5];
        int var7 = (class89.field2042 + 256) * var6 >> 8;
        int var8 = class114.field2557[var5];
        int var9 = (class89.field2042 + 256) * var8 >> 8;
        int var10 = var4 * var9 - var3 * var7 >> 11;
        int var11 = var4 * var7 + var3 * var9 >> 11;
        int var12 = class151.field3473.field975 + var11 >> 7;
        int var13 = class151.field3473.field987 - var10 >> 7;
        boolean var14 = class43.method306(var12, 0, 0, 0, 1, var13, 0, (byte) 107, true, class151.field3473.field989[0], class151.field3473.field962[0], 0);
        if (!var14) {
            return;
        }
        class152.field3502.method653(var3, arg2 + 25444);
        class152.field3502.method653(var4, arg2 ^ 0xFFFF9C9C);
        class152.field3502.method631(class94.field2184, (byte) 120);
        class152.field3502.method653(57, 0);
        class152.field3502.method653(class46.field857, 0);
        class152.field3502.method653(class89.field2042, 0);
        class152.field3502.method653(89, 0);
        class152.field3502.method631(class151.field3473.field975, (byte) 96);
        class152.field3502.method631(class151.field3473.field987, (byte) 97);
        class152.field3502.method653(class146.field3386, 0);
        class152.field3502.method653(63, arg2 + 25444);
        return;
    }
}
