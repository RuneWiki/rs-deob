import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class194 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lhh;")
    public static class163 field3526 = class137.method1065("hitmarks", 17);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    public static final int method1411(int arg0, int arg1) {
        field3527++;
        return arg1 == -26740 ? arg0 & 0x3FF : 39;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method1412(int arg0) {
        field3526 = null;
        if (arg0 != 9) {
            method1411(-9, 124);
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static final void method1413(int arg0) {
        field3524++;
        for (int var1 = 0; var1 < class40.field671; var1++) {
            int var10002 = class204.field3694[var1]--;
            if (class204.field3694[var1] >= -10) {
                class112 var3 = class4.field87[var1];
                if (var3 == null) {
                    var3 = class112.method891(class149.field2805, class9.field153[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class204.field3694[var1] += var3.method892();
                    class4.field87[var1] = var3;
                }
                if (class204.field3694[var1] < 0) {
                    int var10;
                    if (class107.field2046[var1] == 0) {
                        var10 = class215.field3928;
                    } else {
                        int var4 = (class107.field2046[var1] & 0xFF) * 128;
                        int var5 = (class107.field2046[var1] & 0xFF3AB2) >> 16;
                        int var6 = class107.field2046[var1] >> 8 & 0xFF;
                        int var7 = var5 * 128 + 64 - class235.field4203.field3633;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var6 * 128 + 64 - class235.field4203.field3615;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var7 - 128;
                        if (var4 < var9) {
                            class204.field3694[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class2.field46 / var4;
                    }
                    if (var10 > 0) {
                        class167 var11 = var3.method893().method1257(class51.field855);
                        class34 var12 = class34.method230(var11, 100, var10);
                        var12.method200(class193.field3520[var1] - 1);
                        class225.field4085.method595(var12);
                    }
                    class204.field3694[var1] = -100;
                }
            } else {
                class40.field671--;
                for (int var2 = var1; var2 < class40.field671; var2++) {
                    class9.field153[var2] = class9.field153[var2 + 1];
                    class4.field87[var2] = class4.field87[var2 + 1];
                    class193.field3520[var2] = class193.field3520[var2 + 1];
                    class204.field3694[var2] = class204.field3694[var2 + 1];
                    class107.field2046[var2] = class107.field2046[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 >= -111) {
            return;
        }
        if (class123.field2360 && !class245.method1688(-1)) {
            if (class77.field1453 != 0 && client.field1987 != -1) {
                class212.method1512((byte) -128, false, class77.field1453, 0, client.field1987, class59.field969);
            }
            class123.field2360 = false;
        } else if (class77.field1453 != 0 && client.field1987 != -1 && !class245.method1688(-1)) {
            class191.field3499.method75(186, 94);
            class191.field3499.method604(client.field1987, 1543219568);
            client.field1987 = -1;
            class125.field2403++;
        }
    }
}
