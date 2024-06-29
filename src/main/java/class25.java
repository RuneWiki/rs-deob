import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 {

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lid;")
    public static class149 field374 = class60.method382("event_opbase", (byte) 26);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Lid;")
    public static class149 field371 = class60.method382("<img=1>", (byte) 46);

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "[I")
    public static int[] field376 = new int[5];

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Lve;")
    public static class189 field373 = new class189(500);

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "[Lmc;")
    public static class196[] field378 = new class196[28];

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Lid;")
    public static class149 field377 = class60.method382("<col=ff7000>", (byte) 64);

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "[I")
    public static int[] field379 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Lle;")
    public static class43 field381;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lfb;Lgd;II)V")
    public static final void method141(class29 arg0, class74 arg1, int arg2, int arg3) {
        field375++;
        class147 var4 = new class147();
        var4.field2656 = arg1.method489((byte) 104);
        var4.field2654 = arg1.method498((byte) 125);
        var4.field2642 = new class187[var4.field2656];
        var4.field2647 = new byte[var4.field2656][][];
        var4.field2648 = new class187[var4.field2656];
        var4.field2643 = new int[var4.field2656];
        var4.field2649 = new int[var4.field2656];
        if (arg3 != 896) {
            method143(-113, -69, -114);
        }
        var4.field2644 = new int[var4.field2656];
        for (int var5 = 0; var5 < var4.field2656; var5++) {
            try {
                int var6 = arg1.method489((byte) 127);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg1.method529(arg3 ^ 0xFFFFFC7F).method1040(false));
                    int var8 = 0;
                    String var9 = new String(arg1.method529(-1).method1040(false));
                    if (var6 == 1) {
                        var8 = arg1.method498((byte) 127);
                    }
                    var4.field2649[var5] = var6;
                    var4.field2643[var5] = var8;
                    var4.field2648[var5] = arg0.method172(class146.method1003(10990, var7), var9, -26556);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg1.method529(-1).method1040(false));
                    String var11 = new String(arg1.method529(-1).method1040(false));
                    int var12 = arg1.method489((byte) -89);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg1.method529(-1).method1040(false));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method498((byte) 126);
                            var15[var16] = new byte[var17];
                            arg1.method528(var17, 0, -2, var15[var16]);
                        }
                    }
                    var4.field2649[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class146.method1003(arg3 + 10094, var13[var19]);
                    }
                    var4.field2642[var5] = arg0.method168(var18, -21828, var11, class146.method1003(class85.method629(arg3, 10606), var10));
                    var4.field2647[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2644[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2644[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2644[var5] = -3;
            } catch (Exception var23) {
                var4.field2644[var5] = -4;
            } catch (Throwable var24) {
                var4.field2644[var5] = -5;
            }
        }
        class176.field3218.method1131(var4, false);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method142(int arg0) {
        if (arg0 > -84) {
            field379 = null;
        }
        field379 = null;
        field377 = null;
        field373 = null;
        field371 = null;
        field374 = null;
        field381 = null;
        field378 = null;
        field376 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
    public static final void method143(int arg0, int arg1, int arg2) {
        field372++;
        if (arg2 <= 116) {
            return;
        }
        for (int var3 = 0; var3 < class83.field1517; var3++) {
            class257 var4 = class245.method1709(var3, 8);
            if (var4 != null) {
                int var5 = var4.field4498;
                if (var5 >= 0 && !class235.field4129.method119(0, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field4500 >= 0) {
                    int var6 = var4.field4500;
                    int var7 = (var6 & 0x7F) + arg1;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class235.field4126[class82.method609(-24637, var8, 96)];
                } else if (var5 >= 0) {
                    var9 = class235.field4126[class82.method609(-24637, class235.field4129.method123((byte) -124, var5), 96)];
                } else if (var4.field4494 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field4494;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg0 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class235.field4126[class82.method609(-24637, var12, 96)];
                }
                class213.field3777[var3 + 1] = var9;
            }
        }
    }
}
