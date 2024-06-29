import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class79 {

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[Lhk;")
    public static class133[] field1273 = new class133[29];

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field1275 = 0;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Li;")
    public static class58 field1269 = new class58(16);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZIZII)V")
    public static final void method569(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 > 69) {
            class139.method958(arg0, arg2, class93.field1486.length - 1, 0, (byte) 110, arg3, arg1);
            field1272++;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lgi;Lgi;B)V")
    public static final void method570(class164 arg0, class164 arg1, byte arg2) {
        class91.field1430 = arg1;
        int var3 = -117 % ((arg2 - 46) / 45);
        class268.field4338 = arg0;
        class268.field4338.method1145((byte) 113, 36);
        field1270++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB)Lrg;")
    public static final class248 method571(int arg0, int arg1, byte arg2) {
        field1276++;
        if (arg2 != -74) {
            method571(116, -64, (byte) 6);
        }
        class248 var3 = class281.method1913(arg1, (byte) 62);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field4068 == null || var3.field4068.length <= arg0) {
            return null;
        } else {
            return var3.field4068[arg0];
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BILgd;)V")
    public static final void method572(byte arg0, int arg1, class78 arg2) {
        field1266++;
        Object[] var3 = arg2.field1265;
        int var4 = (Integer) var3[0];
        class25 var5 = class274.method1856(var4, 0);
        if (var5 == null) {
            return;
        }
        int var6 = 30 % ((17 - arg0) / 42);
        class247.field3882 = new String[var5.field465];
        int var7 = 0;
        int var8 = 0;
        class213.field3382 = new int[var5.field459];
        for (int var9 = 1; var9 < var3.length; var9++) {
            if (var3[var9] instanceof Integer) {
                int var10 = (Integer) var3[var9];
                if (var10 == -2147483647) {
                    var10 = arg2.field1263;
                }
                if (var10 == -2147483646) {
                    var10 = arg2.field1252;
                }
                if (var10 == -2147483645) {
                    var10 = arg2.field1251 == null ? -1 : arg2.field1251.field3968;
                }
                if (var10 == -2147483644) {
                    var10 = arg2.field1256;
                }
                if (var10 == -2147483643) {
                    var10 = arg2.field1251 == null ? -1 : arg2.field1251.field4019;
                }
                if (var10 == -2147483642) {
                    var10 = arg2.field1264 == null ? -1 : arg2.field1264.field3968;
                }
                if (var10 == -2147483641) {
                    var10 = arg2.field1264 == null ? -1 : arg2.field1264.field4019;
                }
                if (var10 == -2147483640) {
                    var10 = arg2.field1260;
                }
                if (var10 == -2147483639) {
                    var10 = arg2.field1253;
                }
                class213.field3382[var7++] = var10;
            } else if (var3[var9] instanceof String) {
                String var11 = (String) var3[var9];
                if (var11.equals("event_opbase")) {
                    var11 = arg2.field1258;
                }
                class247.field3882[var8++] = var11;
            }
        }
        class92.method643(arg1, var5, -127);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)Lud;")
    public static final class2 method573(byte arg0) {
        int var1 = -10 % ((arg0 - 37) / 51);
        field1268++;
        class2 var2 = new class2(class14.field295, class13.field272, class80.field1286[0], class211.field3364[0], class217.field3413[0], class140.field2284[0], class232.field3635[0], class310.field5024);
        class180.method1265(34);
        return var2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method574(int arg0, boolean arg1) {
        field1271++;
        if (arg0 == 100 && class221.field3488 > 0) {
            byte[] var2 = class191.field3128[--class221.field3488];
            class191.field3128[class221.field3488] = null;
            return var2;
        } else if (arg0 == 5000 && class269.field4340 > 0) {
            byte[] var3 = class44.field653[--class269.field4340];
            class44.field653[class269.field4340] = null;
            return var3;
        } else {
            if (!arg1) {
                method574(-19, false);
            }
            if (arg0 == 30000 && class269.field4341 > 0) {
                byte[] var4 = class60.field870[--class269.field4341];
                class60.field870[class269.field4341] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    public static void method575(byte arg0) {
        field1273 = null;
        if (arg0 == 91) {
            field1269 = null;
        }
    }
}
