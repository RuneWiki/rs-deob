import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class49 extends RuntimeException {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field882;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Ljava/lang/String;")
    public String field884;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field880 = 0;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lsg;")
    public static class169 field883 = class165.method1060("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 1536);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lgd;")
    public static class59[] field877;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)[Lbg;")
    public static final class18[] method307(byte arg0) {
        class18[] var1 = new class18[class141.field2627];
        for (int var2 = 0; var2 < class141.field2627; var2++) {
            class18 var3 = new class18();
            var3.field411 = class156.field2992;
            var3.field414 = class16.field334;
            var3.field412 = class182.field3544[var2];
            var3.field410 = class41.field770[var2];
            var3.field409 = class203.field3976[var2];
            var3.field413 = class2.field43[var2];
            int var4 = var3.field413 * var3.field409;
            byte[] var5 = class193.field3814[var2];
            var3.field408 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field408[var6] = class197.field3873[class150.method984(255, var5[var6])];
            }
            var1[var2] = var3;
        }
        if (arg0 != -56) {
            method307((byte) 103);
        }
        field879++;
        class66.method424((byte) 95);
        return var1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLke;)V")
    public static final void method308(byte arg0, class95 arg1) {
        if (arg0 != -61) {
            field883 = null;
        }
        field885++;
        class19.field417 = arg1;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static void method309(byte arg0) {
        if (arg0 >= -29) {
            field880 = -58;
        }
        field883 = null;
        field877 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZII)I")
    public static final int method310(boolean arg0, int arg1, int arg2) {
        field881++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg0) {
            method310(false, -44, 64);
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
    public static final void method311(byte arg0) {
        field878++;
        int var1 = class19.field422;
        int var2 = class73.field1388;
        int var3 = 6116423;
        int var4 = class167.field3217;
        int var5 = class178.field3475;
        class130.method850(var1, var4, var2, var5, var3);
        class130.method850(var1 + 1, var4 + 1, var2 - 2, 16, 0);
        class130.method857(var1 + 1, var4 + 18, var2 - 2, var5 + -19, 0);
        if (arg0 >= -127) {
            field877 = null;
        }
        class98.field1839.method718(class149.field2751, var1 + 3, var4 + 14, var3, -1);
        int var6 = class22.field459;
        int var7 = class150.field2806;
        for (int var8 = 0; var8 < class20.field436; var8++) {
            int var9 = (class20.field436 - var8 - 1) * 15 + var4 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var6 < var1 + var2 && var7 > var9 - 13 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class98.field1839.method718(class147.method962(true, var8), var1 + 3, var9, var10, 0);
        }
        class172.method1148(class73.field1388, class167.field3217, class19.field422, class178.field3475, -15062);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class49(Throwable arg0, String arg1) {
        this.field882 = arg0;
        this.field884 = arg1;
    }
}
