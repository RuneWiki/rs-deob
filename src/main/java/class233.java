import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class233 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[Lha;")
    public static class46[] field4054 = new class46[100];

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lha;")
    private static class46 field4059 = class271.method1828("Loading world list data", -46);

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lha;")
    public static class46 field4057 = field4059;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4053;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[Lha;")
    public static class46[] field4055;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static void method1584(boolean arg0) {
        field4057 = null;
        if (!arg0) {
            field4055 = null;
        }
        field4054 = null;
        field4059 = null;
        field4055 = null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class233() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILhi;)I")
    public static final int method1585(int arg0, int arg1, class24 arg2) {
        field4056++;
        if (arg2.field456 == null || arg0 >= arg2.field456.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field456[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 1) {
                    var9 = class221.field3895[var3[var4++]];
                }
                if (var7 == 2) {
                    var9 = class235.field4084[var3[var4++]];
                }
                if (var7 == 3) {
                    var9 = class140.field2511[var3[var4++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class24 var12 = class13.method73(1506528624, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class80.method633(var13, 0).field1275 || class124.field2290)) {
                        for (int var14 = 0; var14 < var12.field498.length; var14++) {
                            if (var13 + 1 == var12.field498[var14]) {
                                var9 += var12.field483[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class29.field568[var3[var4++]];
                }
                if (var7 == 6) {
                    var9 = class254.field4455[class235.field4084[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class29.field568[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class277.field4824.field1550;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class79.field1515[var15]) {
                            var9 += class235.field4084[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class24 var18 = class13.method73(1506528624, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class80.method633(var19, 0).field1275 || class124.field2290)) {
                        for (int var20 = 0; var20 < var18.field498.length; var20++) {
                            if ((var19 + 1) == var18.field498[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class105.field1885;
                }
                if (var7 == 12) {
                    var9 = class65.field1099;
                }
                if (var7 == 13) {
                    int var21 = class29.field568[var3[var4++]];
                    int var22 = var3[var4++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var9 = class85.method667(var23, -71);
                }
                if (var7 == 18) {
                    var9 = (class277.field4824.field2585 >> 7) + class29.field567;
                }
                if (var7 == 19) {
                    var9 = (class277.field4824.field2546 >> 7) + class77.field1432;
                }
                if (var7 == 20) {
                    var9 = var3[var4++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var5 += var9;
                    }
                    if (var6 == 1) {
                        var5 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var5 /= var9;
                    }
                    if (var6 == 3) {
                        var5 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            if (arg1 != 22046) {
                field4054 = null;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lwe;[BB)V")
    public final void method1586(class75 arg0, byte[] arg1, byte arg2) {
        field4058++;
        if (arg2 > -96) {
            return;
        }
        if (arg0.field1368[arg0.field1380] != 31 || arg0.field1368[arg0.field1380 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4053 == null) {
            this.field4053 = new Inflater(true);
        }
        try {
            this.field4053.setInput(arg0.field1368, arg0.field1380 + 10, -arg0.field1380 + -18 + arg0.field1368.length);
            this.field4053.inflate(arg1);
        } catch (Exception var4) {
            this.field4053.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4053.reset();
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(III)V")
    private class233(int arg0, int arg1, int arg2) {
    }
}
