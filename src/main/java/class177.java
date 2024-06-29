import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class177 {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2826 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Z")
    public static volatile boolean field2828 = true;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "[Lpe;")
    public static class277[] field2829 = new class277[29];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1329(int arg0) {
        field2823++;
        for (int var1 = arg0; var1 < class159.field2414; var1++) {
            int var10002 = class8.field117[var1]--;
            if (class8.field117[var1] >= -10) {
                class317 var2 = class251.field3798[var1];
                if (var2 == null) {
                    var2 = class317.method2207(class196.field3022, class296.field4566[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class8.field117[var1] += var2.method2208();
                    class251.field3798[var1] = var2;
                }
                if (class8.field117[var1] < 0) {
                    int var9;
                    if (class139.field2092[var1] == 0) {
                        var9 = class112.field1698[var1] * class311.field4833 >> 8;
                    } else {
                        int var3 = (class139.field2092[var1] & 0xFF) * 128;
                        int var4 = class139.field2092[var1] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - class39.field575.field4713;
                        int var6 = (class139.field2092[var1] & 0xFFA1) >> 8;
                        int var7 = var6 * 128 + 64 - class39.field575.field4731;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var7 + var5 - 128;
                        if (var8 > var3) {
                            class8.field117[var1] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * class112.field1698[var1] * class71.field1022 / var3 >> 8;
                    }
                    if (var9 > 0) {
                        class266 var10 = var2.method2206().method1870(class245.field3712);
                        class316 var11 = class316.method2181(var10, 100, var9);
                        var11.method2180(class338.field5249[var1] - 1);
                        class322.field4961.method144(var11);
                    }
                    class8.field117[var1] = -100;
                }
            } else {
                class159.field2414--;
                for (int var12 = var1; var12 < class159.field2414; var12++) {
                    class296.field4566[var12] = class296.field4566[var12 + 1];
                    class251.field3798[var12] = class251.field3798[var12 + 1];
                    class338.field5249[var12] = class338.field5249[var12 + 1];
                    class8.field117[var12] = class8.field117[var12 + 1];
                    class139.field2092[var12] = class139.field2092[var12 + 1];
                    class112.field1698[var12] = class112.field1698[var12 + 1];
                }
                var1--;
            }
        }
        if (class132.field2016 && !class232.method1632(arg0 ^ 0xFFFFFF93)) {
            if (class59.field783 != 0 && class276.field4284 != -1) {
                class262.method1837(false, 0, class222.field3389, class59.field783, class276.field4284, 0);
            }
            class132.field2016 = false;
        } else if (class59.field783 != 0 && class276.field4284 != -1 && !class232.method1632(arg0 - 124)) {
            class219.field3352++;
            class85.field1236.method1141((byte) 41, 61);
            class85.field1236.method1773(class276.field4284, false);
            class276.field4284 = -1;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IJ)V", line = 135)
    public static final void method1330(int arg0, long arg1) {
        if (arg0 != 0) {
            return;
        }
        int var3 = class229.field3495 + class39.field575.field4713;
        if (!class152.field2305) {
            class307.field4786 += (float) arg1 * class283.field4400 / 40.0F;
            class243.field3695 += (float) arg1 * class101.field1459 / 40.0F;
        }
        field2824++;
        int var4 = class87.field1239 + class39.field575.field4731;
        if (class198.field3034 - var3 < -500 || (class198.field3034 - var3) > 500 || (class87.field1242 - var4) < -500 || class87.field1242 - var4 > 500) {
            class198.field3034 = var3;
            class87.field1242 = var4;
        }
        if (class198.field3034 != var3) {
            int var5 = var3 - class198.field3034;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class198.field3034 += var6;
        }
        if (class87.field1242 != var4) {
            int var7 = var4 - class87.field1242;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class87.field1242 += var8;
        }
        class295.method2042(8);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 227)
    public static void method1331(byte arg0) {
        field2829 = null;
        field2826 = null;
        if (arg0 <= 90) {
            method1330(69, -63L);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 241)
    public static final void method1332(int arg0) {
        if (arg0 == 2133) {
            field2825++;
            class4.field45.method752(false);
            class95.field1353.method752(false);
        }
    }
}
