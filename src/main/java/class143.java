import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class143 {

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[J")
    public static long[] field2611 = new long[256];

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "[Z")
    public static boolean[] field2613 = new boolean[8];

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lr;")
    public static class66 field2616;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lr;")
    private static class66 field2617;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lr;")
    public static class66 field2618;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lr;")
    private static class66 field2619;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lr;")
    public static class66 field2615;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2609;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "[I")
    public static int[] field2612;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static final void method986(boolean arg0) {
        field2610++;
        if (class127.field2380 == null) {
            return;
        }
        if (!arg0) {
            method986(false);
        }
        try {
            byte[] var1 = class127.field2380.method1594((byte) 78);
            if (var1 != null) {
                class249 var2 = new class249(var1);
                class199.field3445 = var2.method1674(1355769544);
                class107.field2045 = new class200[class199.field3445];
                for (int var3 = 0; var3 < class199.field3445; var3++) {
                    class200 var4 = class107.field2045[var3] = new class200();
                    int var5 = var2.method1674(1355769544);
                    var4.field3447 = (var5 & 0x8000) != 0;
                    var4.field3450 = var5 & 0x7FFF;
                    var4.field3456 = var2.method1637(127);
                    var4.field3451 = var2.method1684(-22489);
                    var4.field3449 = var3;
                    int var6 = var2.method1674(1355769544);
                    var4.field3452 = class127.method877(3, var6);
                }
                class88.method619(class107.field2045.length - 1, -228, class107.field2045, 0);
                class127.field2380 = null;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            class127.field2380 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)Lgj;")
    public static final class41 method987(int arg0, byte arg1) {
        class41 var2 = (class41) class97.field1877.method1505((long) arg0, (byte) -76);
        field2608++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class19.field260.method135(arg0, 0, 1);
        } else {
            var3 = class29.field435.method135(arg0 & 0x7FFF, 0, 1);
        }
        class41 var4 = new class41();
        if (var3 != null) {
            var4.method262((byte) 45, new class249(var3));
        }
        if (arg0 >= 32768) {
            var4.method268((byte) 38);
        }
        class97.field1877.method1497((long) arg0, (byte) 90, var4);
        if (arg1 < 75) {
            method988(-8);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method988(int arg0) {
        field2618 = null;
        field2609 = null;
        field2613 = null;
        field2619 = null;
        field2612 = null;
        field2616 = null;
        if (arg0 != 32767) {
            method987(-9, (byte) -12);
        }
        field2611 = null;
        field2615 = null;
        field2617 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2611[var0] = var1;
        }
        field2616 = class93.method641(43, "<br>");
        field2617 = class93.method641(43, "Members only world");
        field2618 = field2617;
        field2619 = class93.method641(43, "skill)2");
        field2615 = field2619;
    }
}
