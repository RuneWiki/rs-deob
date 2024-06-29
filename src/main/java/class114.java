import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class114 extends class425 {

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "Z")
    public boolean field1480;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field1472 = 0;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "[I")
    public static int[] field1471;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "[Lsk;")
    public static class371[] field1474;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)V")
    public static void method685(byte arg0) {
        field1474 = null;
        if (arg0 == 112) {
            field1471 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method686(int arg0, int arg1, String arg2) {
        field1481++;
        if (arg0 != 27556) {
            method689((class446) null, -84);
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < class334.field4847; var4++) {
            class128 var5 = class243.field3596[class26.field323[var4]];
            if (var5 != null && var5.field1790 != null && var5.field1790.equalsIgnoreCase(arg2)) {
                var3 = true;
                if (arg1 == 1) {
                    class407.field5761.method2048(arg0 - 25516, 144);
                    class23.field291++;
                    class407.field5761.method835(7740, class26.field323[var4]);
                    class407.field5761.method831(0, (byte) 121);
                } else if (arg1 == 4) {
                    class87.field1130++;
                    class407.field5761.method2048(arg0 ^ 0x6C5C, 145);
                    class407.field5761.method816(-1640531527, 0);
                    class407.field5761.method799(class26.field323[var4], arg0 - 27464);
                } else if (arg1 == 5) {
                    class241.field3560++;
                    class407.field5761.method2048(arg0 - 25516, 199);
                    class407.field5761.method838(0, (byte) 89);
                    class407.field5761.method856(class26.field323[var4], -1004744376);
                } else if (arg1 == 6) {
                    class242.field3585++;
                    class407.field5761.method2048(arg0 - 25516, 59);
                    class407.field5761.method816(-1640531527, 0);
                    class407.field5761.method799(class26.field323[var4], arg0 - 27447);
                } else if (arg1 == 7) {
                    class407.field5761.method2048(2040, 40);
                    class289.field4205++;
                    class407.field5761.method838(0, (byte) 70);
                    class407.field5761.method835(7740, class26.field323[var4]);
                }
                break;
            }
        }
        if (!var3) {
            class154.method1135(class185.field2649.method2284((byte) 116, class309.field4497) + arg2, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZI)V")
    public static final void method687(boolean arg0, int arg1) {
        field1475++;
        int[] var2 = null;
        if (arg1 != -8) {
            field1471 = null;
        }
        byte var3;
        byte[][] var4;
        if (arg0) {
            var3 = 1;
            var4 = class377.field5378;
        } else {
            var3 = 4;
            var4 = class2.field12;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class127.method769(0);
            for (int var6 = 0; var6 < class80.field1034 >> 3; var6++) {
                for (int var7 = 0; var7 < (class381.field5414 >> 3); var7++) {
                    boolean var8 = false;
                    int var9 = class366.field5241[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x3197E53) >> 24;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class199.field2844.length; var15++) {
                                if (class199.field2844[var15] == var14 && var4[var15] != null) {
                                    int[] var16 = class85.method497(var6 * 8, var10, var5, var4[var15], arg0, var12, var7 * 8, var11, class85.field1090, class59.field786, var13, true);
                                    var8 = true;
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class191.method1377(8, 8, var5, var7 * 8, var6 * 8, -114);
                    }
                }
            }
        }
        if (var2 == null) {
            class429.field6097 = null;
        } else {
            class429.field6097 = class220.method1549(var2[1], var2[2], var2[3], arg1 - 120, var2[0]);
            class105.field1352 = var2[4];
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIII)V")
    public static final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1483++;
        int var6 = -27 / ((44 - arg0) / 39);
        if (arg1 == arg2) {
            class20.method115(64, arg3, arg5, arg1, arg4);
        } else if ((arg4 - arg1) >= class408.field5789 && class231.field3415 >= (arg4 + arg1) && arg3 - arg2 >= class245.field3659 && class240.field3547 >= (arg2 + arg3)) {
            class452.method2821(arg4, arg2, arg5, -1352, arg3, arg1);
        } else {
            class181.method1295(-19471, arg2, arg3, arg1, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lpn;I)V")
    public static final void method689(class446 arg0, int arg1) {
        field1473++;
        if (arg1 != 2047) {
            method689((class446) null, -90);
        }
        for (class13 var2 = (class13) class433.field6188.method2752(-106); var2 != null; var2 = (class13) class433.field6188.method2754(-1)) {
            if (var2.field200 == arg0) {
                if (var2.field178 != null) {
                    class378.field5380.method2296(var2.field178);
                    var2.field178 = null;
                }
                var2.method2660((byte) 119);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIIZ)V")
    public class114(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1480 = arg5;
        this.field1477 = arg4;
        this.field1479 = arg0;
        this.field1478 = arg3;
        this.field1476 = arg2;
        this.field1482 = arg1;
    }
}
