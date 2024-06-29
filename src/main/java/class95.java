import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class95 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Loc;")
    private static class99 field2303 = class48.method402((byte) -104, "glow3:");

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Loc;")
    private static class99 field2305 = class48.method402((byte) -104, "Cancel");

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Loc;")
    private static class99 field2309 = class48.method402((byte) -104, "Add friend");

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Loc;")
    private static class99 field2302 = class48.method402((byte) -104, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Loc;")
    public static class99 field2311 = class48.method402((byte) -104, "@cr2@");

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Loc;")
    public static class99 field2316 = class48.method402((byte) -104, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[B")
    public static byte[] field2307 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Loc;")
    public static class99 field2313 = field2303;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Loc;")
    public static class99 field2310 = class48.method402((byte) -104, "::");

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Loc;")
    public static class99 field2308 = field2309;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Loc;")
    public static class99 field2320 = class48.method402((byte) -104, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Loc;")
    public static class99 field2317 = field2303;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Loc;")
    public static class99 field2304 = field2305;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Loc;")
    public static class99 field2321 = class48.method402((byte) -104, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Loc;")
    public static class99 field2323 = class48.method402((byte) -104, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Loc;")
    public static class99 field2322 = field2302;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "[I")
    public static int[] field2324 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Ldc;")
    public static class24 field2314;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
    public static int[] field2319;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method777(int arg0) {
        field2308 = null;
        field2304 = null;
        if (arg0 != -20386) {
            method781(-59, 34, -24);
        }
        field2316 = null;
        field2321 = null;
        field2311 = null;
        field2320 = null;
        field2319 = null;
        field2307 = null;
        field2309 = null;
        field2313 = null;
        field2324 = null;
        field2310 = null;
        field2302 = null;
        field2303 = null;
        field2314 = null;
        field2323 = null;
        field2317 = null;
        field2322 = null;
        field2305 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
    public abstract int method778(int arg0);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method779(Component arg0, int arg1);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method780(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I")
    public static final int method781(int arg0, int arg1, int arg2) {
        field2315++;
        int var3 = class74.method670(arg1 + 45365, 4, true, arg2 + 91923) + (class74.method670(arg1 + 10294, 2, true, arg2 + 37821) - 128 >> 1) + (class74.method670(arg1, 1, true, arg2) - 128 >> 2) - 128;
        if (arg0 != -17149) {
            method783(-111, null, -10, -48, -54);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBLpc;I)Z")
    public static final boolean method782(int arg0, byte arg1, class105 arg2, int arg3) {
        field2318++;
        if (arg1 != -99) {
            method782(-66, (byte) -30, null, 89);
        }
        byte[] var4 = arg2.method903(arg0, (byte) -128, arg3);
        if (var4 == null) {
            return false;
        } else {
            class111.method948(var4, (byte) -98);
            return true;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILgd;III)V")
    public static final void method783(int arg0, class46 arg1, int arg2, int arg3, int arg4) {
        field2312++;
        if (class144.field3601 >= 400) {
            return;
        }
        if (arg1.field1104 != null) {
            arg1 = arg1.method383((byte) -120);
        }
        if (arg1 == null || !arg1.field1126) {
            return;
        }
        if (arg2 > -8) {
            method777(60);
        }
        class99 var5 = arg1.field1111;
        if (arg1.field1123 != 0) {
            var5 = class20.method189(new class99[] { var5, class105.method902(class69.field1770.field3030, true, arg1.field1123), class18.field475, class74.field1860, class5.method31(arg1.field1123, 10), class4.field87 }, 64);
        }
        if (class46.field1130 == 1) {
            class114.field2844++;
            class136.method1132(arg3, class20.method189(new class99[] { class89.field2206, class49.field1187, var5 }, 41), 31, arg4, (byte) 21, class48.field1166, arg0);
        } else if (!class121.field2957) {
            class23.field558++;
            class99[] var6 = arg1.field1116;
            if (class39.field973) {
                var6 = class5.method33(var6, (byte) -65);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method845(class104.field2521, 63)) {
                        class136.field3395++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 58;
                        }
                        if (var7 == 1) {
                            var8 = 39;
                        }
                        if (var7 == 2) {
                            var8 = 55;
                        }
                        if (var7 == 3) {
                            var8 = 47;
                        }
                        if (var7 == 4) {
                            var8 = 6;
                        }
                        class136.method1132(arg3, class20.method189(new class99[] { class119.field2932, var5 }, 27), var8, arg4, (byte) 21, var6[var7], arg0);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method845(class104.field2521, 63)) {
                        class34.field831++;
                        short var10 = 0;
                        if (class69.field1770.field3030 < arg1.field1123) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 58;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 39;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 55;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 47;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 6;
                        }
                        class136.method1132(arg3, class20.method189(new class99[] { class119.field2932, var5 }, 105), var11, arg4, (byte) 21, var6[var9], arg0);
                    }
                }
            }
            class136.method1132(arg3, class20.method189(new class99[] { class119.field2932, var5 }, 10), 1003, arg4, (byte) 21, class114.field2834, arg0);
        } else if ((class111.field2774 & 0x2) == 2) {
            class136.method1132(arg3, class20.method189(new class99[] { class63.field1678, class49.field1187, var5 }, 63), 13, arg4, (byte) 21, class32.field766, arg0);
            class86.field2161++;
        }
    }
}
