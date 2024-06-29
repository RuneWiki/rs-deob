import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class class92 {

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1447 = "Loading title screen - ";

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static volatile int field1455 = 0;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1459 = "yellow:";

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "[I")
    public static int[] field1451;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static final void method586(boolean arg0) {
        if (class147.field2144 != null) {
            class147.field2144.method436((byte) -92);
        }
        if (class192.field2958 != null) {
            class192.field2958.method436((byte) -92);
        }
        class262.method1753(22050, class107.field1657, 2, (byte) -67);
        class147.field2144 = class98.method629(class47.field762, class209.field3147, 0, 22050, 61);
        field1452++;
        class147.field2144.method442(class93.field1477, (byte) 86);
        if (!arg0) {
            method590(81, -80, 105);
        }
        class192.field2958 = class98.method629(class47.field762, class209.field3147, 1, 2048, 110);
        class192.field2958.method442(class213.field3187, (byte) 83);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Leb;")
    public static final class247 method587(int arg0, int arg1) {
        class247 var2 = (class247) class80.field1289.method1777((long) arg1, (byte) 112);
        field1462++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -1) {
            method587(80, -79);
        }
        class247 var3 = class15.method114(class226.field3392, arg1, true, class239.field3596, false);
        if (var3 != null) {
            class80.field1289.method1784((long) arg1, var3, ~arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZ)V")
    public abstract void method49(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)V")
    public static final void method588(int arg0, int arg1, int arg2, int arg3) {
        field1449++;
        int var4 = class284.field4248 * arg0 >> 8;
        if (arg1 > 93 && var4 != 0 && arg3 != -1) {
            class146.method888(0, false, class227.field3400, arg3, 0, var4);
            class254.field3869 = true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static final void method589(byte arg0) {
        class237.field3566.method1775(27147);
        if (arg0 != 48) {
            field1447 = null;
        }
        class255.field3883.method1775(27147);
        field1461++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)J")
    public static final long method590(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        return var3 == null || var3.field4063 == null ? 0L : var3.field4063.field1687;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)V")
    public abstract void method50(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBI)V")
    public abstract void method45(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lpf;ILpf;)V")
    public static final void method591(class294 arg0, int arg1, class294 arg2) {
        if (arg1 == 0) {
            field1456++;
            class143.field2092 = arg0;
            class253.field3854 = arg2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method592(int arg0) {
        field1447 = null;
        field1459 = null;
        field1451 = null;
        if (arg0 != 0) {
            field1448 = 57;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(IBI)I")
    public static final int method593(int arg0, byte arg1, int arg2) {
        field1450++;
        int var3 = -83 / ((arg1 + 16) / 44);
        int var4 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var4 = arg0 * var4;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 == 1) {
            return arg0 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILfl;Lfg;)V")
    public static final void method594(int arg0, int arg1, class248 arg2, class12 arg3) {
        field1453++;
        class293 var4 = new class293();
        var4.field4608 = arg2.method1593((byte) 27);
        var4.field4612 = arg2.method1576(-17672);
        var4.field4622 = new class78[var4.field4608];
        var4.field4606 = new int[var4.field4608];
        var4.field4614 = new int[var4.field4608];
        var4.field4623 = new int[var4.field4608];
        var4.field4611 = new byte[var4.field4608][][];
        var4.field4613 = new class78[var4.field4608];
        for (int var5 = 0; var5 < var4.field4608; var5++) {
            try {
                int var6 = arg2.method1593((byte) 27);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method1597((byte) 110);
                    int var8 = 0;
                    String var9 = arg2.method1597((byte) 92);
                    if (var6 == 1) {
                        var8 = arg2.method1576(-17672);
                    }
                    var4.field4606[var5] = var6;
                    var4.field4614[var5] = var8;
                    var4.field4613[var5] = arg3.method63(class185.method1150(var7, (byte) -121), var9, (byte) -44);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method1597((byte) 112);
                    String var11 = arg2.method1597((byte) -94);
                    int var12 = arg2.method1593((byte) 27);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method1597((byte) 107);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method1576(arg1 ^ 0x3723);
                            var15[var16] = new byte[var17];
                            arg2.method1579(28172, var15[var16], 0, var17);
                        }
                    }
                    var4.field4606[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class185.method1150(var13[var19], (byte) -120);
                    }
                    var4.field4622[var5] = arg3.method69(var18, var11, class185.method1150(var10, (byte) -128), 22853);
                    var4.field4611[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4623[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4623[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4623[var5] = -3;
            } catch (Exception var23) {
                var4.field4623[var5] = -4;
            } catch (Throwable var24) {
                var4.field4623[var5] = -5;
            }
        }
        class248.field3705.method987(var4, (byte) -121);
        if (arg1 != -29221) {
            field1458 = -44;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(III)V")
    public class92(int arg0, int arg1, int arg2) {
        this.field1457 = arg0;
        this.field1454 = arg1;
        this.field1460 = arg2;
    }
}
