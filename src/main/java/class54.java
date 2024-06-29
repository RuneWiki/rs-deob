import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class54 {

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field938 = -1;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lmb;")
    public static class96 field941 = class243.method1708("; Max)2Age=", (byte) 94);

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lmb;")
    private static class96 field942 = class243.method1708("Loaded title screen", (byte) 104);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
    public static int[] field937 = new int[2000];

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lmb;")
    public static class96 field945 = field942;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Loa;")
    public static class262 field943 = new class262();

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[I")
    public static int[] field939;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method404(byte arg0) {
        if (arg0 < 25) {
            return;
        }
        field942 = null;
        field939 = null;
        field937 = null;
        field945 = null;
        field941 = null;
        field943 = null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static final void method405(byte arg0) {
        class137.field2450.method96(false);
        if (arg0 < 88) {
            method407(10);
        }
        field940++;
        class24.field405.method96(false);
        class138.field2459.method96(false);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IS)Z")
    public static final boolean method406(int arg0, short arg1) {
        field936++;
        if (arg1 == 13 || arg1 == 25 || arg1 == 58 || arg1 == 51 || arg1 == 18 || arg1 == 14 || arg1 == 30 || arg1 == 31) {
            return true;
        } else if (arg1 == 2 || arg1 == 8 || arg1 == 1007 || arg1 == 1004) {
            return true;
        } else {
            if (arg0 > -92) {
                method406(-62, (short) 51);
            }
            if (arg1 == 33 || arg1 == 6 || arg1 == 46 || arg1 == 12 || arg1 == 44) {
                return true;
            } else {
                return arg1 == 50 || arg1 == 10 || arg1 == 15 || arg1 == 26 || arg1 == 45 || arg1 == 9;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static final void method407(int arg0) {
        class235.field4033 &= 0x7FF;
        if (class117.field2170 < 128) {
            class117.field2170 = 128;
        }
        field944++;
        if (arg0 <= 106) {
            return;
        }
        if (class117.field2170 > 383) {
            class117.field2170 = 383;
        }
        int var1 = class3.field69 >> 7;
        int var2 = class44.field752 >> 7;
        int var3 = class137.method1025(class216.field3712, class3.field69, class44.field752, (byte) -94);
        int var4 = 0;
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= (var2 + 4); var5++) {
                for (int var6 = var1 - 4; var6 <= (var1 + 4); var6++) {
                    int var7 = class216.field3712;
                    if (var7 < 3 && (class132.field2376[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class173.field3022[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class40.field690 < var9) {
            class40.field690 += (var9 - class40.field690) / 24;
        } else if (var9 < class40.field690) {
            class40.field690 += (var9 - class40.field690) / 80;
        }
    }
}
