import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class440 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field6150 = 0;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "[I")
    public static int[] field6153 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZI)[B", line = 3)
    public static final synchronized byte[] method2485(boolean arg0, int arg1) {
        field6151++;
        if (arg1 == 100 && class36.field370 > 0) {
            byte[] var2 = class192.field2308[--class36.field370];
            class192.field2308[class36.field370] = null;
            return var2;
        }
        if (arg0) {
            field6153 = null;
        }
        if (arg1 == 5000 && class614.field8611 > 0) {
            byte[] var3 = class68.field752[--class614.field8611];
            class68.field752[class614.field8611] = null;
            return var3;
        } else if (arg1 == 30000 && class289.field3835 > 0) {
            byte[] var4 = class721.field10089[--class289.field3835];
            class721.field10089[class289.field3835] = null;
            return var4;
        } else {
            if (class654.field9113 != null) {
                for (int var5 = 0; var5 < class253.field3265.length; var5++) {
                    if (class253.field3265[var5] == arg1 && class216.field2615[var5] > 0) {
                        byte[] var6 = class654.field9113[var5][--class216.field2615[var5]];
                        class654.field9113[var5][class216.field2615[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V", line = 66)
    public static void method2486(byte arg0) {
        field6153 = null;
        int var1 = -5 % ((35 - arg0) / 57);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lgg;)V", line = 75)
    public static final void method2487(class176 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class176 var2 = null;
            for (class176 var3 = class732.field10200[var1]; var3 != null; var3 = var3.field2179) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class732.field10200[var1] = var3.field2179;
                    } else {
                        var2.field2179 = var3.field2179;
                    }
                    class315.field4252 = true;
                    return;
                }
                var2 = var3;
            }
            class176 var4 = null;
            for (class176 var5 = class43.field467[var1]; var5 != null; var5 = var5.field2179) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class43.field467[var1] = var5.field2179;
                    } else {
                        var4.field2179 = var5.field2179;
                    }
                    class315.field4252 = true;
                    return;
                }
                var4 = var5;
            }
            class176 var6 = null;
            for (class176 var7 = class707.field9896[var1]; var7 != null; var7 = var7.field2179) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class707.field9896[var1] = var7.field2179;
                    } else {
                        var6.field2179 = var7.field2179;
                    }
                    class315.field4252 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B[B)V", line = 152)
    public static final synchronized void method2488(byte arg0, byte[] arg1) {
        field6152++;
        if (arg0 <= 61) {
            field6153 = null;
        }
        if (arg1.length == 100 && class36.field370 < 1000) {
            class192.field2308[class36.field370++] = arg1;
        } else if (arg1.length == 5000 && class614.field8611 < 250) {
            class68.field752[class614.field8611++] = arg1;
        } else if (arg1.length == 30000 && class289.field3835 < 50) {
            class721.field10089[class289.field3835++] = arg1;
        } else if (class654.field9113 != null) {
            for (int var2 = 0; var2 < class253.field3265.length; var2++) {
                if (class253.field3265[var2] == arg1.length && class216.field2615[var2] < class654.field9113[var2].length) {
                    class654.field9113[var2][class216.field2615[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()V", line = 213)
    public static final void method2489() {
        if (class396.field5627 != null) {
            for (int var0 = 0; var0 < class396.field5627.length; var0++) {
                for (int var1 = 0; var1 < class68.field743; var1++) {
                    for (int var2 = 0; var2 < class480.field6629; var2++) {
                        if (class396.field5627[var0][var1][var2] != null) {
                            class396.field5627[var0][var1][var2].method3528(6730);
                        }
                        class396.field5627[var0][var1][var2] = null;
                    }
                }
            }
        }
        class396.field5627 = null;
        class86.field1182 = null;
        if (class195.field2334 != null) {
            for (int var3 = 0; var3 < class195.field2334.length; var3++) {
                for (int var4 = 0; var4 < class68.field743; var4++) {
                    for (int var5 = 0; var5 < class480.field6629; var5++) {
                        if (class195.field2334[var3][var4][var5] != null) {
                            class195.field2334[var3][var4][var5].method3528(6730);
                        }
                        class195.field2334[var3][var4][var5] = null;
                    }
                }
            }
        }
        class195.field2334 = null;
        class143.field1850 = null;
        class77.field947 = null;
        class25.field188 = null;
        class423.field5940 = null;
        class619.field8676 = null;
        class320.field4301 = null;
        class219.field2838 = null;
        class331.field4466 = null;
        class608.method3357(0);
        if (class561.field7935 != null) {
            for (int var6 = 0; var6 < class320.field4304; var6++) {
                class561.field7935[var6] = null;
            }
            class320.field4304 = 0;
        }
        class732.field10200 = null;
        class43.field467 = null;
        class707.field9896 = null;
        if (class170.field2121 != null) {
            for (int var7 = 0; var7 < class170.field2121.length; var7++) {
                class170.field2121[var7] = null;
            }
            class735.field10260 = 0;
        }
        if (class295.field3961 != null) {
            for (int var8 = 0; var8 < class295.field3961.length; var8++) {
                class295.field3961[var8] = null;
            }
            class540.field7311 = 0;
        }
        if (class85.field1176 != null) {
            for (int var9 = 0; var9 < class474.field6562; var9++) {
                class85.field1176[var9] = null;
            }
            for (int var10 = 0; var10 < class307.field4170; var10++) {
                for (int var11 = 0; var11 < class68.field743; var11++) {
                    for (int var12 = 0; var12 < class480.field6629; var12++) {
                        class180.field2218[var10][var11][var12] = 0L;
                    }
                }
            }
            class474.field6562 = 0;
        }
        class505.method2814(1350);
        class350.field4641 = class350.field4643;
        class350.field4641.method3675(0);
        class425.field5983 = null;
        class574.field8077 = null;
        class622.field8711 = null;
        if (class532.field7227 != null) {
            class199.method1102();
            class22.field158.method395(1);
            class22.field158.method431(0);
        }
        if (class293.field3923 != null) {
            class293.field3923 = null;
        }
        class22.field158 = null;
    }
}
