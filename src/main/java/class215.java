import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class215 {

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "[I")
    public static int[] field3605 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field3602 = 0;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Ltm;")
    public static class79 field3606 = new class79(512);

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[I")
    public static int[] field3611 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3616 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field3618 = 10;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Lcg;")
    public static class49 field3614;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "[[B")
    public static byte[][] field3615;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 8)
    public static final void method1586(String arg0, boolean arg1) {
        field3609++;
        if (arg1) {
            method1588((class278) null, -84);
        }
        int var2 = class224.method1635(arg0, -1);
        if (var2 != -1) {
            int[] var3 = class38.field552.method2253(class222.field3708.field4822[var2] & 0x3FFF, class222.field3708.field4822[var2] >> 14 & 0x3FFF, (class222.field3708.field4822[var2] & 0x3A01CCB1) >> 28, 63);
            class5.method27(var3[2], var3[1], (byte) 92);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 33)
    public static final void method1587(boolean arg0) {
        if (arg0) {
            method1588((class278) null, 102);
        }
        if (class320.field5064 != null) {
            class320.field5064.method1279(true);
        }
        if (class135.field2362 != null) {
            class135.field2362.method1279(!arg0);
        }
        field3610++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lu;I)V", line = 50)
    public static final void method1588(class278 arg0, int arg1) {
        field3607++;
        if (arg1 != 16383) {
            field3614 = (class49) null;
        }
        for (class261 var2 = (class261) class184.field3119.method2297(14204); var2 != null; var2 = (class261) class184.field3119.method2291(-106)) {
            if (var2.field4234 == arg0) {
                if (var2.field4229 != null) {
                    class1.field9.method1839(var2.field4229);
                    var2.field4229 = null;
                }
                var2.method2195(-1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 86)
    public static void method1589(int arg0) {
        field3614 = null;
        field3606 = null;
        field3615 = (byte[][]) null;
        field3605 = null;
        field3616 = null;
        field3611 = null;
        if (arg0 <= 87) {
            method1587(false);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZIIII)V", line = 101)
    public static final void method1590(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -109) {
            field3615 = (byte[][]) ((byte[][]) null);
        }
        field3604++;
        if (class272.method1863(-671591600, arg4)) {
            class138.method1132(-1, arg0, arg2, class109.field1852[arg4], 52, arg1);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V", line = 145)
    public static final void method1591(byte arg0) {
        field3603++;
        if (class74.field1223) {
            return;
        }
        class74.field1223 = true;
        if (class38.field572) {
            class83.field1331 = (float) ((int) class83.field1331 - 65 & 0xFFFFFF80);
        } else {
            class131.field2257 += (-class131.field2257 - 24.0F) / 2.0F;
        }
        class247.field4003 = true;
        int var1 = 79 / ((4 - arg0) / 41);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)I")
    public abstract int method819(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public abstract void method821(byte arg0);

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)J")
    public abstract long method822(int arg0);
}
