import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class126 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lhj;")
    public static class69 field2311 = class181.method1318(")4a=", (byte) -115);

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lhj;")
    private static class69 field2316 = class181.method1318("Created gameworld", (byte) -110);

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lhj;")
    private static class69 field2317 = class181.method1318("Walk here", (byte) -127);

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Lhj;")
    public static class69 field2313 = class181.method1318("sl_stars", (byte) -109);

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lhj;")
    public static class69 field2314 = field2316;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lhj;")
    public static class69 field2321 = class181.method1318("(U0a )2 non)2existant gosub script)2num: ", (byte) -128);

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lhj;")
    public static class69 field2322 = class181.method1318(":chalreq:", (byte) -114);

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field2319 = 0;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lhj;")
    public static class69 field2323 = field2317;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[Lhk;")
    public static class121[] field2312;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method899(int arg0) {
        field2314 = null;
        field2321 = null;
        field2323 = null;
        field2316 = null;
        if (arg0 != 100) {
            method900(false);
        }
        field2313 = null;
        field2311 = null;
        field2322 = null;
        field2312 = null;
        field2317 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static final void method900(boolean arg0) {
        if (class207.field3775 < 128) {
            class207.field3775 = 128;
        }
        if (class207.field3775 > 383) {
            class207.field3775 = 383;
        }
        int var1 = class167.field3083 >> 7;
        client.field2812 &= 0x7FF;
        field2320++;
        int var2 = class27.field381 >> 7;
        int var3 = class156.method1179(class27.field381, class167.field3083, 23, class52.field927);
        int var4 = 0;
        if (arg0) {
            return;
        }
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= var2 + 4; var5++) {
                for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                    int var7 = class52.field927;
                    if (var7 < 3 && (class19.field246[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class271.field4793[var7][var5][var6];
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
        if (class110.field2093 < var9) {
            class110.field2093 += (var9 - class110.field2093) / 24;
        } else if (var9 < class110.field2093) {
            class110.field2093 += (var9 - class110.field2093) / 80;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method901(int arg0) {
        class159.field2960.method1709((byte) -125);
        class46.field661.method1709((byte) -95);
        field2324++;
        int var1 = -47 / ((11 - arg0) / 61);
        class237.field4299.method1709((byte) -89);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Z")
    public static final boolean method902(int arg0) {
        field2315++;
        class258 var1 = class141.field2626;
        synchronized (class141.field2626) {
            if (class32.field443 == class237.field4310) {
                return false;
            } else if (arg0 < 98) {
                return false;
            } else {
                class59.field1078 = class60.field1107[class32.field443];
                class181.field3291 = class246.field4495[class32.field443];
                class32.field443 = class32.field443 + 1 & 0x7F;
                return true;
            }
        }
    }
}
