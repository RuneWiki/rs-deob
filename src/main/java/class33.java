import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class33 {

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field393 = 0;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[Lsh;")
    public static class283[] field386 = new class283[29];

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field385 = -1;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lmg;")
    public abstract class294 method203(int arg0);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static void method204(int arg0) {
        if (arg0 == -1) {
            field386 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLtl;)V")
    public static final void method205(byte arg0, class240 arg1) {
        field394++;
        if (arg0 < 28) {
            method210((byte) 9);
        }
        class116 var2 = (class116) class60.field715.method1895(class60.method370((byte) -8, arg1.field3466), -119);
        if (var2 == null) {
            class287.method1931(0, 128, arg1.field4585[0], (class54) null, arg1.field4597[0], arg1, class199.field2833, (class273) null);
        } else {
            var2.method750(101);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method206(int arg0, String arg1, String arg2, byte arg3) {
        class280.field4256 = arg1;
        class189.field2712 = arg2;
        class66.field787 = arg0;
        field391++;
        if (class280.field4256.equals("") || class189.field2712.equals("")) {
            class20.field247 = 3;
        } else if (class210.field2952 == -1) {
            class233.field3361 = 1;
            class20.field247 = -3;
            if (arg3 != 117) {
                field385 = 26;
            }
            class23.field278 = 0;
            class177.field2509 = 0;
            class216 var4 = new class216(128);
            var4.method1373(10, -13985);
            var4.method1410((int) (Math.random() * 9.9999999E7D), (byte) 118);
            var4.method1379(-72, class60.method370((byte) -8, class280.field4256));
            var4.method1410((int) (Math.random() * 9.9999999E7D), (byte) 77);
            var4.method1353(class189.field2712, (byte) -115);
            var4.method1410((int) (Math.random() * 9.9999999E7D), (byte) 81);
            var4.method1394(class289.field4491, 37, class217.field3080);
            class94.field1259.field3021 = 0;
            class94.field1259.method1373(24, arg3 ^ 0xFFFFC92A);
            class94.field1259.method1373(var4.field3021 + 2, arg3 ^ 0xFFFFC92A);
            class94.field1259.method1387(541, 4);
            class94.field1259.method1405(var4.field3021, (byte) -76, 0, var4.field3030);
        } else {
            class6.method38(-25444);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
    public abstract void method207(boolean arg0, int arg1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[B")
    public abstract byte[] method208(int arg0, int arg1);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I")
    public abstract int method209(int arg0, int arg1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static final void method210(byte arg0) {
        field388++;
        if (arg0 <= 26) {
            method204(100);
        }
        for (int var1 = 0; var1 < class37.field432; var1++) {
            int var10002 = class157.field2258[var1]--;
            if (class157.field2258[var1] >= -10) {
                class186 var3 = class101.field1397[var1];
                if (var3 == null) {
                    var3 = class186.method1212(class61.field723, class243.field3548[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class157.field2258[var1] += var3.method1214();
                    class101.field1397[var1] = var3;
                }
                if (class157.field2258[var1] < 0) {
                    int var10;
                    if (class176.field2501[var1] == 0) {
                        var10 = class77.field924[var1] * class254.field3663 >> 8;
                    } else {
                        int var4 = class176.field2501[var1] >> 16 & 0xFF;
                        int var5 = (class176.field2501[var1] & 0xFF) * 128;
                        int var6 = class176.field2501[var1] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - class177.field2507.field4553;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var4 * 128 + 64 - class177.field2507.field4563;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 - (128 - var7);
                        if (var5 < var9) {
                            class157.field2258[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var5 - var9) * class95.field1277 * class77.field924[var1] / var5 >> 8;
                    }
                    if (var10 > 0) {
                        class295 var11 = var3.method1213().method1969(class23.field281);
                        class278 var12 = class278.method1821(var11, 100, var10);
                        var12.method1813(class223.field3148[var1] - 1);
                        class14.field178.method191(var12);
                    }
                    class157.field2258[var1] = -100;
                }
            } else {
                class37.field432--;
                for (int var2 = var1; var2 < class37.field432; var2++) {
                    class243.field3548[var2] = class243.field3548[var2 + 1];
                    class101.field1397[var2] = class101.field1397[var2 + 1];
                    class223.field3148[var2] = class223.field3148[var2 + 1];
                    class157.field2258[var2] = class157.field2258[var2 + 1];
                    class176.field2501[var2] = class176.field2501[var2 + 1];
                    class77.field924[var2] = class77.field924[var2 + 1];
                }
                var1--;
            }
        }
        if (class19.field240 && !class35.method216(0)) {
            if (class137.field1989 != 0 && class34.field400 != -1) {
                class172.method1121(0, class34.field400, class163.field2346, 94, class137.field1989, false);
            }
            class19.field240 = false;
        } else if (class137.field1989 != 0 && class34.field400 != -1 && !class35.method216(0)) {
            class171.field2449++;
            class94.field1259.method592(122, false);
            class94.field1259.method1410(class34.field400, (byte) -126);
            class34.field400 = -1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)I")
    public static final int method211(byte arg0) {
        field390++;
        try {
            if (class97.field1290 == 0) {
                if (class285.field4411 > class86.method509(false) - 5000L) {
                    return 0;
                }
                class163.field2344 = class115.field1592.method349(arg0 + 87, class16.field194, class163.field2342);
                class245.field3565 = class86.method509(false);
                class97.field1290 = 1;
            }
            if (arg0 != -87) {
                field386 = null;
            }
            if (class245.field3565 + 30000L < class86.method509(false)) {
                return class216.method1354(1000, arg0 + 189);
            }
            if (class97.field1290 == 1) {
                if (class163.field2344.field960 == 2) {
                    return class216.method1354(1001, 124);
                }
                if (class163.field2344.field960 != 1) {
                    return -1;
                }
                class117.field1637 = new class185((Socket) class163.field2344.field958, class115.field1592);
                class94.field1259.field3021 = 0;
                class163.field2344 = null;
                int var1 = 0;
                if (class94.field1265) {
                    var1 = class144.field2068;
                }
                class94.field1259.method1373(23, -13985);
                class94.field1259.method1410(var1, (byte) -127);
                class117.field1637.method1206(class94.field1259.field3030, class94.field1259.field3021, (byte) -43, 0);
                if (class73.field878 != null) {
                    class73.field878.method830(32237);
                }
                if (class282.field4282 != null) {
                    class282.field4282.method830(32237);
                }
                int var2 = class117.field1637.method1209((byte) 100);
                if (class73.field878 != null) {
                    class73.field878.method830(arg0 + 32324);
                }
                if (class282.field4282 != null) {
                    class282.field4282.method830(arg0 ^ 0xFFFF8244);
                }
                if (var2 != 0) {
                    return class216.method1354(var2, 107);
                }
                class97.field1290 = 2;
            }
            if (class97.field1290 == 2) {
                if (class117.field1637.method1202((byte) 72) < 2) {
                    return -1;
                }
                class4.field56 = class117.field1637.method1209((byte) 100);
                class4.field56 <<= 0x8;
                class4.field56 += class117.field1637.method1209((byte) 100);
                class114.field1574 = new byte[class4.field56];
                class97.field1290 = 3;
                class136.field1979 = 0;
            }
            if (class97.field1290 != 3) {
                return -1;
            }
            int var3 = class117.field1637.method1202((byte) 65);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class4.field56 - class136.field1979) {
                var3 = class4.field56 - class136.field1979;
            }
            class117.field1637.method1205(class114.field1574, var3, false, class136.field1979);
            class136.field1979 += var3;
            if (class136.field1979 < class4.field56) {
                return -1;
            } else if (class166.method1089(class114.field1574, 12642)) {
                class138.field2012 = new class176[class5.field71];
                int var4 = 0;
                for (int var5 = field387; var5 <= class167.field2402; var5++) {
                    class176 var6 = class60.method371(var5, 128);
                    if (var6 != null) {
                        class138.field2012[var4++] = var6;
                    }
                }
                class117.field1637.method1199(-124);
                class97.field1290 = 0;
                class220.field3121 = 0;
                class117.field1637 = null;
                class114.field1574 = null;
                class285.field4411 = class86.method509(false);
                return 0;
            } else {
                return class216.method1354(1002, arg0 + 190);
            }
        } catch (IOException var7) {
            return class216.method1354(1003, 107);
        }
    }
}
