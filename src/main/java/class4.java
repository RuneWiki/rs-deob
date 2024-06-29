import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "D")
    public static double field49 = -1.0D;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lsi;")
    public static class203 field45;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
    public static int[] field47;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method19(byte arg0) {
        field45 = null;
        if (arg0 >= -18) {
            method19((byte) -14);
        }
        field47 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lvb;Z)V")
    public static final void method20(class226 arg0, boolean arg1) {
        field46++;
        long var2 = 0L;
        if (arg0.field4099 == 0) {
            var2 = class85.method534(arg0.field4088, arg0.field4102, arg0.field4094);
        }
        if (arg0.field4099 == 1) {
            var2 = class200.method1265(arg0.field4088, arg0.field4102, arg0.field4094);
        }
        if (arg0.field4099 == 2) {
            var2 = class53.method364(arg0.field4088, arg0.field4102, arg0.field4094);
        }
        int var4 = -1;
        if (arg0.field4099 == 3) {
            var2 = class65.method408(arg0.field4088, arg0.field4102, arg0.field4094);
        }
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var5 = (int) var2 >> 20 & 0x3;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = (int) var2 >> 14 & 0x1F;
        }
        if (arg1) {
            method20(null, true);
        }
        arg0.field4089 = var4;
        arg0.field4095 = var5;
        arg0.field4087 = var6;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILii;)I")
    public static final int method21(int arg0, int arg1, class96 arg2) {
        field50++;
        if (arg2.field1787 == null || arg1 >= arg2.field1787.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field1787[arg1];
            if (arg0 != -1) {
                field47 = null;
            }
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class60.field1020[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class208.field3794[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class196.field3637[var3[var4++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class96 var12 = class158.method1029((byte) -124, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class58.method389(0, var13).field4440 || class40.field648)) {
                        for (int var14 = 0; var14 < var12.field1753.length; var14++) {
                            if (var13 + 1 == var12.field1753[var14]) {
                                var8 += var12.field1722[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class77.field1315[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class155.field2825[class208.field3794[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class77.field1315[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class210.field3854.field2894;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class47.field809[var15]) {
                            var8 += class208.field3794[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class96 var18 = class158.method1029((byte) -119, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class58.method389(arg0 + 1, var19).field4440 || class40.field648)) {
                        for (int var20 = 0; var20 < var18.field1753.length; var20++) {
                            if (var19 + 1 == var18.field1753[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class57.field959;
                }
                if (var7 == 12) {
                    var8 = class217.field3983;
                }
                if (var7 == 13) {
                    int var21 = class77.field1315[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class96.method592((byte) -107, var23);
                }
                if (var7 == 18) {
                    var8 = (class210.field3854.field673 >> 7) + class129.field2389;
                }
                if (var7 == 19) {
                    var8 = (class210.field3854.field723 >> 7) + class168.field3082;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }
}
