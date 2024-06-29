import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class142 extends class64 {

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "Lrd;")
    public static class114 field3380 = class84.method656("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>", (byte) 124);

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "I")
    public static int field3382 = 0;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "[J")
    public static long[] field3383 = new long[100];

    @OriginalMember(owner = "client!wb", name = "rb", descriptor = "Lrd;")
    public static class114 field3396 = class84.method656("Versteckt", (byte) 127);

    @OriginalMember(owner = "client!wb", name = "pb", descriptor = "Lrd;")
    private static class114 field3394 = class84.method656("Loading wordpack )2 ", (byte) 125);

    @OriginalMember(owner = "client!wb", name = "mb", descriptor = "I")
    public static int field3391 = 0;

    @OriginalMember(owner = "client!wb", name = "ub", descriptor = "Lrd;")
    public static class114 field3399 = field3394;

    @OriginalMember(owner = "client!wb", name = "vb", descriptor = "I")
    public static int field3400 = 7759444;

    @OriginalMember(owner = "client!wb", name = "nb", descriptor = "I")
    public static int field3392 = 0;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
    public int field3385;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!wb", name = "lb", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!wb", name = "qb", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!wb", name = "tb", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "Lnd;")
    public static class90 field3379;

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "Loa;")
    public static class93 field3389;

    @OriginalMember(owner = "client!wb", name = "ob", descriptor = "[I")
    public int[] field3393;

    @OriginalMember(owner = "client!wb", name = "sb", descriptor = "[I")
    public int[] field3397;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "[Lrd;")
    public class114[] field3378;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public static final void method1134(int arg0) {
        field3381++;
        short var1 = 256;
        if (class62.field1334 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class62.field1334 > 768) {
                    class64.field1360[var4] = class36.method259(class124.field2959[var4], class42.field852[var4], 1024 - class62.field1334, (byte) 78);
                } else if (class62.field1334 <= 256) {
                    class64.field1360[var4] = class36.method259(class42.field852[var4], class124.field2959[var4], 256 - class62.field1334, (byte) 78);
                } else {
                    class64.field1360[var4] = class124.field2959[var4];
                }
            }
        } else if (class49.field1026 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class64.field1360[var2] = class42.field852[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class49.field1026 > 768) {
                    class64.field1360[var3] = class36.method259(class61.field1304[var3], class42.field852[var3], 1024 - class49.field1026, (byte) 78);
                } else if (class49.field1026 > 256) {
                    class64.field1360[var3] = class61.field1304[var3];
                } else {
                    class64.field1360[var3] = class36.method259(class42.field852[var3], class61.field1304[var3], 256 - class49.field1026, (byte) 78);
                }
            }
        }
        for (int var5 = 0; var5 < 33920; var5++) {
            class73.field1640.field1418[var5] = class77.field1749.field1129[var5];
        }
        int var6 = 0;
        int var7 = 1152;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var22 = (var1 - var8) * class36.field772[var8] / var1;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var6 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class77.field1754[var6++];
                if (var25 == 0) {
                    var7++;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class64.field1360[var25];
                    int var29 = class73.field1640.field1418[var7];
                    class73.field1640.field1418[var7++] = class96.method737(16711680, class96.method737(65280, var28) * var25 + var27 * class96.method737(65280, var29)) + class96.method737(-16711936, class96.method737(var28, 16711935) * var25 + var27 * class96.method737(16711935, var29)) >> 8;
                }
            }
            var7 += var23;
        }
        int var9 = arg0;
        int var10 = 1176;
        for (int var11 = 0; var11 < 33920; var11++) {
            class127.field3051.field1418[var11] = class20.field347.field1129[var11];
        }
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class36.field772[var12] / var1;
            int var14 = 103 - var13;
            int var15 = var10 + var13;
            for (int var16 = 0; var16 < var14; var16++) {
                int var17 = class77.field1754[var9++];
                if (var17 == 0) {
                    var15++;
                } else {
                    int var19 = 256 - var17;
                    int var20 = class127.field3051.field1418[var15];
                    int var21 = class64.field1360[var17];
                    class127.field3051.field1418[var15++] = class96.method737(var17 * class96.method737(65280, var21) + var19 * class96.method737(var20, 65280), 16711680) + class96.method737(-16711936, class96.method737(16711935, var20) * var19 + class96.method737(var21, 16711935) * var17) >> 8;
                }
            }
            var10 = var15 + 128 - var14 - var13;
            var9 += 128 - var14;
        }
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
    public static void method1135(int arg0) {
        field3379 = null;
        field3399 = null;
        field3380 = null;
        field3389 = null;
        field3396 = null;
        field3383 = null;
        if (arg0 != -8185) {
            field3391 = 4;
        }
        field3394 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lpb;IZLpb;)V")
    public static final void method1136(class100 arg0, int arg1, boolean arg2, class100 arg3) {
        if (arg1 != 1176) {
            method1135(-62);
        }
        class99.field2247 = arg2;
        class127.field3034 = arg0;
        field3390++;
        class104.field2431 = arg3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lpb;BLpb;Lpb;)V")
    public static final void method1137(class100 arg0, byte arg1, class100 arg2, class100 arg3) {
        class24.field487 = arg3;
        class67.field1459 = arg2;
        field3395++;
        int var4 = -26 / ((arg1 + 33) / 61);
        class120.field2804 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BIZ)V")
    public static final void method1138(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        field3384++;
        if (class98.field2216 == null) {
            return;
        }
        if (arg1 != 1) {
            method1134(-24);
        }
        if (class36.field699 >= 0) {
            class127.field3023 = arg3;
            if (class36.field699 == 0) {
                class110.field2575 = 1;
            } else {
                int var5 = class106.method810(class36.field699, (byte) -115);
                int var6 = var5 - class125.field2973;
                class110.field2575 = (var6 + 3600) / arg3;
                if (class110.field2575 < 1) {
                    class110.field2575 = 1;
                }
            }
            class20.field371 = arg0;
            client.field400 = arg4;
            class65.field1395 = arg2;
        } else if (class110.field2575 == 0) {
            class63.method513((byte) -104, arg0, arg2, arg4);
        } else {
            client.field400 = arg4;
            class20.field371 = arg0;
            class65.field1395 = arg2;
        }
    }
}
