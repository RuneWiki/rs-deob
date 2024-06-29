import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class140 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lrd;")
    private static class117 field3331 = class95.method812("wishes to duel with you)3", (byte) 8);

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lrd;")
    public static class117 field3332 = class95.method812("Chat panel redrawn", (byte) 8);

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Z")
    public static volatile boolean field3339 = true;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lrd;")
    public static class117 field3341 = class95.method812("cross", (byte) 8);

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lrd;")
    private static class117 field3343 = class95.method812("Enter name:", (byte) 8);

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3342 = 0;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lrd;")
    public static class117 field3338 = class95.method812("Bitte wenden Sie sich an den Kundendienst)3", (byte) 8);

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lrd;")
    public static class117 field3344 = field3331;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lrd;")
    public static class117 field3337 = field3343;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lrd;")
    public static class117 field3345 = class95.method812("Abbrechen", (byte) 8);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "[I")
    public static int[] field3335;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "[Ll;")
    public static class76[] field3340;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLdc;)V")
    public static final void method1124(byte arg0, class25 arg1) {
        field3330++;
        if (arg0 >= -87) {
            method1124((byte) 26, null);
        }
        arg1.field690 = false;
        if (arg1.field704 != -1) {
            class46 var2 = class33.method387(arg1.field704, 7455);
            if (var2 == null || var2.field1309 == null) {
                arg1.field704 = -1;
            } else {
                arg1.field716++;
                if (var2.field1309.length > arg1.field693 && arg1.field716 > var2.field1282[arg1.field693]) {
                    arg1.field716 = 1;
                    arg1.field693++;
                    class63.method638(844616196, arg1.field693, arg1.field717, var2, arg1.field751);
                }
                if (var2.field1309.length <= arg1.field693) {
                    arg1.field693 = 0;
                    arg1.field716 = 0;
                    class63.method638(844616196, arg1.field693, arg1.field717, var2, arg1.field751);
                }
            }
        }
        if (arg1.field732 != -1 && arg1.field745 <= class85.field2236) {
            if (arg1.field746 < 0) {
                arg1.field746 = 0;
            }
            int var3 = class62.method636(arg1.field732, (byte) -114).field2259;
            if (var3 == -1) {
                arg1.field732 = -1;
            } else {
                class46 var4 = class33.method387(var3, 7455);
                if (var4 == null || var4.field1309 == null) {
                    arg1.field732 = -1;
                } else {
                    arg1.field731++;
                    if (arg1.field746 < var4.field1309.length && var4.field1282[arg1.field746] < arg1.field731) {
                        arg1.field731 = 1;
                        arg1.field746++;
                        class63.method638(844616196, arg1.field746, arg1.field717, var4, arg1.field751);
                    }
                    if (arg1.field746 >= var4.field1309.length && (arg1.field746 < 0 || var4.field1309.length <= arg1.field746)) {
                        arg1.field732 = -1;
                    }
                }
            }
        }
        if (arg1.field703 != -1 && arg1.field712 <= 1) {
            class46 var5 = class33.method387(arg1.field703, 7455);
            if (var5.field1314 == 1 && arg1.field694 > 0 && class85.field2236 >= arg1.field729 && class85.field2236 > arg1.field730) {
                arg1.field712 = 1;
                return;
            }
        }
        if (arg1.field703 != -1 && arg1.field712 == 0) {
            class46 var6 = class33.method387(arg1.field703, 7455);
            if (var6 == null || var6.field1309 == null) {
                arg1.field703 = -1;
            } else {
                arg1.field684++;
                if (var6.field1309.length > arg1.field727 && arg1.field684 > var6.field1282[arg1.field727]) {
                    arg1.field727++;
                    arg1.field684 = 1;
                    class63.method638(844616196, arg1.field727, arg1.field717, var6, arg1.field751);
                }
                if (arg1.field727 >= var6.field1309.length) {
                    arg1.field723++;
                    arg1.field727 -= var6.field1290;
                    if (var6.field1302 <= arg1.field723) {
                        arg1.field703 = -1;
                    } else if (arg1.field727 >= 0 && arg1.field727 < var6.field1309.length) {
                        class63.method638(844616196, arg1.field727, arg1.field717, var6, arg1.field751);
                    } else {
                        arg1.field703 = -1;
                    }
                }
                arg1.field690 = var6.field1280;
            }
        }
        if (arg1.field712 > 0) {
            arg1.field712--;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1125(byte arg0) {
        field3341 = null;
        field3340 = null;
        int var1 = 93 % ((-arg0 - 32) / 44);
        field3343 = null;
        field3345 = null;
        field3337 = null;
        field3332 = null;
        field3338 = null;
        field3335 = null;
        field3344 = null;
        field3331 = null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public static final void method1126(byte arg0) {
        field3336++;
        int var1 = 22 % ((arg0 + 63) / 42);
        for (class107 var2 = (class107) class22.field634.method3(false); var2 != null; var2 = (class107) class22.field634.method14(127)) {
            if (class120.field2940 != var2.field2649 || var2.field2656) {
                var2.method691(0);
            } else if (var2.field2643 <= class85.field2236) {
                var2.method886(class77.field2094, (byte) -80);
                if (var2.field2656) {
                    var2.method691(0);
                } else {
                    class90.field2308.method323(var2.field2649, var2.field2650, var2.field2648, var2.field2646, 60, var2, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
    public static final void method1127(int arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = 0;
        if (arg2 < 12) {
            field3338 = null;
        }
        while (var4 < 100) {
            if (class128.field3107[var4] != null) {
                int var5 = class119.field2919[var4];
                int var6 = class134.field3217 + 74 - var3 * 14;
                if (var6 < -20) {
                    break;
                }
                if (var5 == 0) {
                    var3++;
                }
                class117 var7 = class43.field1236[var4];
                if (var7 != null && var7.method946((byte) 83, class61.field1698)) {
                    var7 = var7.method949(5, 0);
                }
                if (var7 != null && var7.method946((byte) 83, class39.field1134)) {
                    var7 = var7.method949(5, 0);
                }
                if ((var5 == 1 || var5 == 2) && (var5 == 1 || class18.field462 == 0 || class18.field462 == 1 && class59.method609((byte) -104, var7))) {
                    if (var6 - 14 < arg1 && var6 >= arg1 && !var7.method962(class144.field3516.field2528, true)) {
                        if (class24.field676 >= 1) {
                            client.method238(0, class18.method193(new class117[] { class121.field2968, var7 }, 123), 0, -124, 0, 39, class45.field1267);
                            class38.field1092++;
                        }
                        class41.field1173++;
                        client.method238(0, class18.method193(new class117[] { class121.field2968, var7 }, 22), 0, -119, 0, 19, class90.field2314);
                        class62.field1769++;
                        client.method238(0, class18.method193(new class117[] { class121.field2968, var7 }, 102), 0, 28, 0, 32, class21.field592);
                    }
                    var3++;
                }
                if ((var5 == 3 || var5 == 7) && class94.field2364 == 0 && (var5 == 7 || class42.field1202 == 0 || class42.field1202 == 1 && class59.method609((byte) -104, var7))) {
                    if (var6 - 14 < arg1 && arg1 <= var6) {
                        class41.field1173++;
                        class62.field1769++;
                        if (class24.field676 >= 1) {
                            client.method238(0, class18.method193(new class117[] { class121.field2968, var7 }, 109), 0, 112, 0, 39, class45.field1267);
                            class38.field1092++;
                        }
                        client.method238(0, class18.method193(new class117[] { class121.field2968, var7 }, 26), 0, -113, 0, 19, class90.field2314);
                        client.method238(0, class18.method193(new class117[] { class121.field2968, var7 }, 95), 0, -117, 0, 32, class21.field592);
                    }
                    var3++;
                }
                if (var5 == 4 && (class77.field2095 == 0 || class77.field2095 == 1 && class59.method609((byte) -104, var7))) {
                    if (arg1 > var6 - 14 && var6 >= arg1) {
                        class110.field2740++;
                        client.method238(0, class18.method193(new class117[] { class121.field2968, var7 }, 49), 0, 82, 0, 2, class128.field3077);
                    }
                    var3++;
                }
                if ((var5 == 5 || var5 == 6) && class94.field2364 == 0 && class42.field1202 < 2) {
                    var3++;
                }
                if (var5 == 8 && (class77.field2095 == 0 || class77.field2095 == 1 && class59.method609((byte) -104, var7))) {
                    var3++;
                    if (var6 - 14 < arg1 && var6 >= arg1) {
                        client.method238(0, class18.method193(new class117[] { class121.field2968, var7 }, 91), 0, 29, 0, 30, class33.field977);
                        class62.field1764++;
                    }
                }
            }
            var4++;
        }
        field3333++;
    }
}
