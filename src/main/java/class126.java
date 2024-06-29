import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class126 {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lje;")
    public static class67 field2758 = class85.method592(255, "::errortest");

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
    public static int[] field2762 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
    public static int[] field2766 = new int[500];

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lje;")
    private static class67 field2763 = class85.method592(255, " has logged out)3");

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Lje;")
    public static class67 field2775 = class85.method592(255, "<)4col>");

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field2773 = 0;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lje;")
    public static class67 field2768 = field2763;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Llc;")
    public static class79 field2769 = null;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field2777 = 1;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lje;")
    public static class67 field2770 = class85.method592(255, "<col=ffff00>*V");

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field2772 = 0;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2761 = -1;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lje;")
    public static class67 field2776 = class85.method592(255, "<br>");

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2760 = 0;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Lpb;")
    public static class106 field2774;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method970(int arg0) {
        field2768 = null;
        field2763 = null;
        field2776 = null;
        field2770 = null;
        field2758 = null;
        if (arg0 != -25322) {
            method970(-40);
        }
        field2766 = null;
        field2762 = null;
        field2774 = null;
        field2775 = null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static final void method971(int arg0) {
        field2771++;
        if (arg0 != 0) {
            field2769 = null;
        }
        if (class60.field1203 != null) {
            class19 var1 = class60.field1203;
            synchronized (class60.field1203) {
                class60.field1203 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method972(int arg0, byte[] arg1) {
        int var2 = 64 / ((arg0 - 32) / 40);
        field2767++;
        class91 var3 = new class91(arg1);
        int var4 = var3.method649(false);
        int var5 = var3.method631(-68);
        if (var5 < 0 || class115.field2595 != 0 && class115.field2595 < var5) {
            throw new RuntimeException();
        } else if (var4 == 0) {
            byte[] var8 = new byte[var5];
            var3.method652(var8, 0, var5, -128);
            return var8;
        } else {
            int var6 = var3.method631(-114);
            if (var6 < 0 || class115.field2595 != 0 && var6 > class115.field2595) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var4 == 1) {
                class108.method855(var7, var6, arg1, var5, 9);
            } else {
                class103.field2350.method577(15, var7, var3);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
    public static final int method973(int arg0, int arg1, int arg2) {
        if (arg1 > -102) {
            method972(26, null);
        }
        int var3 = arg0 >>> 31;
        field2764++;
        return (arg0 + var3) / arg2 - var3;
    }
}
