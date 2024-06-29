import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class640 extends class675 {

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "Lhj;")
    public static class534 field8606;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)V", line = 3)
    public static final void method3531(int arg0) {
        for (int var1 = 0; var1 < class273.field3798; var1++) {
            class70 var3 = class653.field8828[var1];
            boolean var4 = false;
            if (var3.field1052 == null) {
                var3.field1055--;
                if (var3.field1055 >= (var3.method542(-3) ? -1500 : -10)) {
                    if (var3.field1054 == 1 && var3.field1056 == null) {
                        var3.field1056 = class377.method2214(class590.field7808, var3.field1048, 0);
                        if (var3.field1056 == null) {
                            continue;
                        }
                        var3.field1055 += var3.field1056.method2215();
                    } else if (var3.method542(-3) && (var3.field1053 == null || var3.field1041 == null)) {
                        if (var3.field1053 == null) {
                            var3.field1053 = class211.method1352(class407.field5491, var3.field1048);
                        }
                        if (var3.field1053 == null) {
                            continue;
                        }
                        if (var3.field1041 == null) {
                            var3.field1041 = var3.field1053.method1349(new int[] { 22050 });
                            if (var3.field1041 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field1055 < 0) {
                        int var12;
                        if (var3.field1049 == 0) {
                            var12 = var3.field1043 * (var3.field1054 == 3 ? class344.field4718.field5429 : class344.field4718.field5450) >> 8;
                        } else {
                            int var5 = var3.field1049 >> 24 & 0x3;
                            if (class199.field2897.field8609 == var5) {
                                int var6 = var3.field1049 & 0xFF << 9;
                                int var7 = var3.field1049 >> 16 & 0xFF;
                                int var8 = (var7 << 9) + 256 - class199.field2897.field8620;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var3.field1049 >> 8 & 0xFF;
                                int var10 = (var9 << 9) + 256 - class199.field2897.field8612;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 512;
                                if (var11 > var6) {
                                    var3.field1055 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var12 = class344.field4718.field5414 * var3.field1043 * (var6 - var11) / var6 >> 8;
                            } else {
                                var12 = 0;
                            }
                        }
                        if (var12 > 0) {
                            class241 var13 = null;
                            if (var3.field1054 == 1) {
                                var13 = var3.field1056.method2217().method1484(class488.field6600);
                            } else if (var3.method542(-3)) {
                                var13 = var3.field1041;
                            }
                            class81 var14 = var3.field1052 = class81.method641(var13, 100, var12);
                            var14.method650(var3.field1057 - 1);
                            class639.field8604.method159(var14);
                        }
                    }
                } else {
                    var4 = true;
                }
            } else if (!var3.field1052.method2798(-1)) {
                var4 = true;
            }
            if (var4) {
                class273.field3798--;
                for (int var15 = var1; var15 < class273.field3798; var15++) {
                    class653.field8828[var15] = class653.field8828[var15 + 1];
                }
                var1--;
            }
        }
        field8607++;
        if (class137.field2225 && !class220.method1392(5888)) {
            if (class344.field4718.field5445 != 0 && class416.field5694 != -1) {
                class39.method299(class416.field5694, class344.field4718.field5445, 0, false, class603.field8016, true);
            }
            class137.field2225 = false;
        } else if (class344.field4718.field5445 != 0 && class416.field5694 != -1 && !class220.method1392(5888)) {
            class51.field713++;
            class402 var2 = class390.method2252(class84.field1298, -112, class262.field3644);
            var2.field5354.method1982(class416.field5694, (byte) 63);
            class36.method278(arg0 ^ 0x56BA, var2);
            class416.field5694 = -1;
        }
        if (arg0 != 22202) {
            field8606 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)V", line = 179)
    public static void method3532(int arg0) {
        int var1 = -6 % ((19 - arg0) / 63);
        field8606 = null;
    }
}
