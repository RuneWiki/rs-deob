import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 {

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
    public static int[] field2790 = new int[1000];

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Z")
    public static boolean field2789 = true;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    public static int[] field2783 = new int[50];

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Lje;")
    private static class67 field2794 = class85.method592(255, "Connection timed out)3");

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Lje;")
    private static class67 field2800 = class85.method592(255, "Connection lost");

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lje;")
    public static class67 field2786 = field2794;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lje;")
    public static class67 field2781 = field2800;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Lje;")
    private static class67 field2799 = class85.method592(255, "Invalid username or password)3");

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lje;")
    public static class67 field2780 = field2799;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Lwb;")
    public static class155 field2798;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Lfd;")
    public static class40 field2787;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lfd;")
    public static class40 field2792;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lje;")
    public class67 field2785;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Z")
    public boolean field2778;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Z")
    public static boolean field2797;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[B)V")
    public static final void method974(int arg0, byte[] arg1) {
        field2795++;
        class91 var2 = new class91(arg1);
        var2.field2043 = arg1.length - 2;
        class16.field283 = var2.method641(255);
        class4.field65 = new int[class16.field283];
        class4.field61 = new int[class16.field283];
        class128.field2804 = new int[class16.field283];
        class69.field1409 = new int[class16.field283];
        class152.field3489 = new byte[class16.field283][];
        var2.field2043 = arg1.length - class16.field283 * 8 - 7;
        class14.field246 = var2.method641(255);
        client.field397 = var2.method641(255);
        int var3 = (var2.method649(false) & 0xFF) + 1;
        for (int var4 = 0; var4 < class16.field283; var4++) {
            class4.field61[var4] = var2.method641(255);
        }
        for (int var5 = 0; var5 < class16.field283; var5++) {
            class128.field2804[var5] = var2.method641(255);
        }
        for (int var6 = 0; var6 < class16.field283; var6++) {
            class4.field65[var6] = var2.method641(255);
        }
        for (int var7 = 0; var7 < class16.field283; var7++) {
            class69.field1409[var7] = var2.method641(255);
        }
        var2.field2043 = arg1.length + 3 - class16.field283 * 8 - var3 * 3 - 7;
        class85.field1888 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class85.field1888[var8] = var2.method637(55);
            if (class85.field1888[var8] == 0) {
                class85.field1888[var8] = 1;
            }
        }
        var2.field2043 = 0;
        for (int var9 = 0; var9 < class16.field283; var9++) {
            int var11 = class69.field1409[var9];
            int var12 = class4.field65[var9];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class152.field3489[var9] = var14;
            int var15 = var2.method649(false);
            if (var15 == 0) {
                for (int var18 = 0; var18 < var13; var18++) {
                    var14[var18] = var2.method667((byte) -37);
                }
            } else if (var15 == 1) {
                for (int var16 = 0; var16 < var12; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var14[var12 * var17 + var16] = var2.method667((byte) -37);
                    }
                }
            }
        }
        int var10 = -67 / ((arg0 - 27) / 59);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method975(int arg0) {
        field2781 = null;
        field2799 = null;
        if (arg0 != -16950) {
            return;
        }
        field2780 = null;
        field2798 = null;
        field2787 = null;
        field2786 = null;
        field2790 = null;
        field2794 = null;
        field2792 = null;
        field2783 = null;
        field2800 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Z")
    public static final boolean method976(int arg0) {
        field2791++;
        class23 var1 = class64.field1263;
        synchronized (class64.field1263) {
            if (class75.field1614 == class121.field2718) {
                return false;
            } else if (arg0 == -14101) {
                class72.field1554 = class144.field3317[class121.field2718];
                class59.field1187 = class25.field455[class121.field2718];
                class121.field2718 = class121.field2718 + 1 & 0x7F;
                return true;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static final void method977(int arg0) {
        Object var1 = class85.field1879;
        synchronized (class85.field1879) {
            if (arg0 != 1) {
                method974(80, null);
            }
            if (class69.field1404 != 0) {
                class69.field1404 = 1;
                try {
                    class85.field1879.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field2788++;
    }
}
