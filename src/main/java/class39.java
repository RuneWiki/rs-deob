import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Loa;")
    public static class98 field941 = class38.method349(255, "swe");

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Loa;")
    public static class98 field945 = null;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field944 = -1;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Loa;")
    public static class98 field946 = class38.method349(255, " @whi@(X");

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field949 = -1;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field950 = 0;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Ltb;")
    public static class130 field947;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[[B")
    public static byte[][] field942;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILtd;)I")
    public static final int method351(int arg0, class132 arg1) {
        field943++;
        class86 var2 = (class86) class48.field1085.method17(-16, ((long) arg1.field3135 << 32) + ((long) arg1.field3115));
        if (arg0 <= 24) {
            field945 = null;
        }
        return var2 == null ? arg1.field3105 : var2.field1971;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method352(int arg0) {
        field948++;
        int var1 = class124.field2771 + class73.field1536.field3657;
        int var2 = class18.field395 + class73.field1536.field3667;
        if (class86.field1978[96]) {
            class65.field1400 += (-class65.field1400 - 24) / 2;
        } else if (class86.field1978[97]) {
            class65.field1400 += (24 - class65.field1400) / 2;
        } else {
            class65.field1400 /= 2;
        }
        if (class86.field1978[98]) {
            class4.field68 += (12 - class4.field68) / 2;
        } else if (class86.field1978[99]) {
            class4.field68 += (-class4.field68 - 12) / 2;
        } else {
            class4.field68 /= 2;
        }
        class25.field611 = class65.field1400 / 2 + class25.field611 & 0x7FF;
        class127.field2843 += class4.field68 / 2;
        if (class90.field2080 - var1 < -500 || class90.field2080 - var1 > 500 || class102.field2358 - var2 < -500 || class102.field2358 - var2 > 500) {
            class90.field2080 = var1;
            class102.field2358 = var2;
        }
        if (class127.field2843 < 128) {
            class127.field2843 = 128;
        }
        if (class102.field2358 != var2) {
            class102.field2358 += (var2 - class102.field2358) / 16;
        }
        if (arg0 < 37) {
            field945 = null;
        }
        int var3 = 0;
        if (class90.field2080 != var1) {
            class90.field2080 += (var1 - class90.field2080) / 16;
        }
        if (class127.field2843 > 383) {
            class127.field2843 = 383;
        }
        int var4 = class90.field2080 >> 7;
        int var5 = class102.field2358 >> 7;
        int var6 = class31.method305(-46, class102.field2358, class114.field2572, class90.field2080);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class114.field2572;
                    if (var9 < 3 && (class80.field1771[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class25.field616[var9][var7][var8];
                    if (var10 > var3) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class56.field1242 < var11) {
            class56.field1242 += (var11 - class56.field1242) / 24;
        } else if (var11 < class56.field1242) {
            class56.field1242 += (var11 - class56.field1242) / 80;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method353(int arg0) {
        if (arg0 != 128) {
            field941 = null;
        }
        field945 = null;
        field941 = null;
        field946 = null;
        field947 = null;
        field942 = null;
    }
}
