import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class205 extends class81 {

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
    public static int[] field3201 = new int[2500];

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Ln;")
    public static class282 field3200 = new class282(2);

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Lna;")
    private static class26 field3204 = class69.method505("glow3:", (byte) -124);

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "[J")
    public static long[] field3202 = new long[32];

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "Lna;")
    public static class26 field3209 = field3204;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field3205 = 0;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "Lna;")
    public static class26 field3208 = field3204;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Lih;")
    public static class32 field3207 = new class32();

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field3210 = 0;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Lna;")
    public static class26 field3212 = class69.method505("Veuillez commencer par supprimer ", (byte) -128);

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[[B")
    public static byte[][] field3203;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ)V", line = 11)
    public static final void method1383(byte arg0, boolean arg1) {
        class258.method1815(-16385);
        field3199++;
        if (class207.field3217 != 30 && class207.field3217 != 25) {
            return;
        }
        class76.field1149++;
        if (class76.field1149 < 50 && !arg1) {
            return;
        }
        class76.field1149 = 0;
        if (arg0 != -90) {
            return;
        }
        if (!class27.field459 && class88.field1449 != null) {
            class114.field1789.method1431(0, 93);
            try {
                class88.field1449.method2014(false, 0, class114.field1789.field1280, class114.field1789.field1301);
                class114.field1789.field1301 = 0;
            } catch (IOException var3) {
                class27.field459 = true;
            }
            class281.field4679++;
        }
        class258.method1815(arg0 ^ 0x4059);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 44)
    public static final void method1384(int arg0) {
        if (arg0 != -48) {
            return;
        }
        field3206++;
        if (class140.field2138 != null || class95.field1549 != null) {
            return;
        }
        int var1 = class277.field4639;
        if (!class11.field153) {
            if (var1 == 1 && class126.field1955 > 0) {
                short var2 = class142.field2178[class126.field1955 - 1];
                if (var2 == 25 || var2 == 23 || var2 == 48 || var2 == 7 || var2 == 13 || var2 == 47 || var2 == 5 || var2 == 43 || var2 == 35 || var2 == 58 || var2 == 22 || var2 == 1006) {
                    int var3 = class193.field3009[class126.field1955 - 1];
                    int var4 = class322.field5529[class126.field1955 - 1];
                    class297 var5 = class178.method1226((byte) 113, var4);
                    class327 var6 = client.method1730(var5);
                    if (var6.method2291((byte) -9) || var6.method2284(572878952)) {
                        class308.field5304 = 0;
                        class149.field2332 = false;
                        if (class140.field2138 != null) {
                            class318.method2209(-67, class140.field2138);
                        }
                        class140.field2138 = class178.method1226((byte) 119, var4);
                        class50.field790 = field3210;
                        class61.field986 = class11.field152;
                        class163.field2538 = var3;
                        class318.method2209(arg0 + 166, class140.field2138);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class28.field475 == 1 && class126.field1955 > 2 || class261.method1840(class126.field1955 - 1, 0))) {
                var1 = 2;
            }
            if (var1 == 2 && class126.field1955 > 0 || class133.field2025 == 1) {
                class108.method768((byte) -105);
            }
            if (var1 == 1 && class126.field1955 > 0 || class133.field2025 == 2) {
                class158.method1073(100);
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class259.field4235;
            int var8 = class136.field2090;
            if (var8 < (class150.field2342 - 10) || var8 > (class150.field2342 + class66.field1034 + 10) || (class315.field5395 - 10) > var7 || var7 > (class315.field5395 + class118.field1861 + 10)) {
                class11.field153 = false;
                class222.method1486(class150.field2342, class66.field1034, (byte) -40, class315.field5395, class118.field1861);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class150.field2342;
        int var10 = class315.field5395;
        int var11 = class66.field1034;
        int var12 = field3210;
        int var13 = class11.field152;
        int var14 = -1;
        for (int var15 = 0; var15 < class126.field1955; var15++) {
            int var16;
            if (class266.field4385) {
                var16 = (class126.field1955 - var15 - 1) * 15 + var10 + 35;
            } else {
                var16 = (class126.field1955 - var15 - 1) * 15 + var10 + 31;
            }
            if (var12 > var9 && (var9 + var11) > var12 && var16 - 13 < var13 && (var16 + 3) > var13) {
                var14 = var15;
            }
        }
        if (var14 != -1) {
            class214.method1421(2597, var14);
        }
        class11.field153 = false;
        class222.method1486(class150.field2342, class66.field1034, (byte) -40, class315.field5395, class118.field1861);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V", line = 183)
    public static void method1385(boolean arg0) {
        field3201 = null;
        field3204 = null;
        field3200 = null;
        field3207 = null;
        field3202 = null;
        if (arg0) {
            method1384(68);
        }
        field3209 = null;
        field3203 = (byte[][]) null;
        field3212 = null;
        field3208 = null;
    }
}
