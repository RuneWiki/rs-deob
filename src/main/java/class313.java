import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class313 extends class285 {

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field5299 = 0;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Lve;")
    private static class255 field5305 = class87.method607(27, "Close");

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "[I")
    public static int[] field5300 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Lve;")
    public static class255 field5306 = field5305;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field5311 = 500;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "Lve;")
    public static class255 field5315 = class87.method607(122, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public int field5301;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public int field5308;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "Lve;")
    public class255 field5314;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "[I")
    public int[] field5304;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "[I")
    public int[] field5309;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "[Lve;")
    public class255[] field5310;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "[Lff;")
    public class47[] field5313;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[BB)Z", line = 13)
    public static final boolean method2161(int arg0, int arg1, byte[] arg2, byte arg3) {
        field5312++;
        boolean var4 = true;
        class70 var5 = new class70(arg2);
        int var6 = -1;
        if (arg3 <= 4) {
            field5306 = (class255) null;
        }
        label74: while (true) {
            int var7 = var5.method457(true);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                int var15;
                class145 var16;
                do {
                    int var13;
                    int var14;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var5.method486((byte) 82);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var5.method481(0);
                                    }
                                    int var10 = var5.method486((byte) 110);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = (var9 & 0xFF0) >> 6;
                                    int var12 = var9 & 0x3F;
                                    var13 = arg0 + var11;
                                    var14 = arg1 + var12;
                                    var15 = var5.method481(0) >> 2;
                                } while (var13 <= 0);
                            } while (var14 <= 0);
                        } while (var13 >= 103);
                    } while (var14 >= 103);
                    var16 = class289.method2046(-12453, var6);
                } while (var15 == 22 && !class229.field3788 && var16.field2463 == 0 && var16.field2446 != 1 && !var16.field2449);
                if (!var16.method1078((byte) 97)) {
                    var4 = false;
                    class242.field4082++;
                }
                var8 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 134)
    public static void method2162(boolean arg0) {
        if (!arg0) {
            method2163(80, 21, (class242) null, (byte) -83);
        }
        field5300 = null;
        field5305 = null;
        field5315 = null;
        field5306 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILt;B)V", line = 151)
    public static final void method2163(int arg0, int arg1, class242 arg2, byte arg3) {
        if ((arg0 & 0x100) != 0) {
            arg2.field5149 = class160.field2692.method481(0);
            arg2.field5175 = class160.field2692.method481(0);
            arg2.field5155 = class160.field2692.method431((byte) 22);
            arg2.field5171 = class160.field2692.method473(-16350);
            arg2.field5134 = class160.field2692.method439(-32768) + class277.field4768;
            arg2.field5174 = class160.field2692.method439(-32768) + class277.field4768;
            arg2.field5143 = class160.field2692.method473(-16350);
            arg2.field5124 = 0;
            arg2.field5127 = 1;
        }
        field5303++;
        if ((arg0 & 0x200) != 0) {
            arg2.field5164 = class160.field2692.method423(255);
            int var4 = class160.field2692.method434(-1584014312);
            if (arg2.field5164 == 65535) {
                arg2.field5164 = -1;
            }
            arg2.field5128 = var4 >> 16;
            arg2.field5165 = 0;
            arg2.field5152 = (var4 & 0xFFFF) + class277.field4768;
            arg2.field5151 = 0;
            if (class277.field4768 < arg2.field5152) {
                arg2.field5165 = -1;
            }
            if (arg2.field5164 != -1 && class277.field4768 == arg2.field5152) {
                int var5 = class232.method1611(arg2.field5164, (byte) -114).field1420;
                if (var5 != -1) {
                    class271 var6 = class181.method1269(100, var5);
                    if (var6 != null && var6.field4667 != null) {
                        class232.method1609(class276.field4742 == arg2, arg2.field5130, 0, var6, arg2.field5173, 26694);
                    }
                }
            }
        }
        if (arg3 != -70) {
            method2162(true);
        }
        if ((arg0 & 0x80) != 0) {
            arg2.field5161 = class160.field2692.method426((byte) -23);
            arg2.field5159 = class160.field2692.method476((byte) 72);
        }
        if ((arg0 & 0x4) != 0) {
            int var7 = class160.field2692.method481(0);
            byte[] var8 = new byte[var7];
            class70 var9 = new class70(var8);
            class160.field2692.method468(var8, (byte) 73, 0, var7);
            class85.field1380[arg1] = var9;
            arg2.method1685(0, var9);
        }
        if ((arg0 & 0x400) != 0) {
            int var10 = class160.field2692.method482(6205);
            int var11 = class160.field2692.method482(6205);
            arg2.method2098(var11, var10, (byte) 73, class277.field4768);
        }
        if ((arg0 & 0x10) != 0) {
            int var12 = class160.field2692.method473(-16350);
            int var13 = class160.field2692.method481(arg3 ^ 0xFFFFFFBA);
            arg2.method2098(var13, var12, (byte) -124, class277.field4768);
            arg2.field5141 = class277.field4768 + 300;
            arg2.field5119 = class160.field2692.method481(0);
        }
        if ((arg0 & 0x8) != 0) {
            arg2.field5137 = class160.field2692.method423(255);
            if (arg2.field5137 == 65535) {
                arg2.field5137 = -1;
            }
        }
        if ((arg0 & 0x1) != 0) {
            arg2.field5132 = class160.field2692.method479(arg3 + 69);
            if (arg2.field5132.method1757(arg3 + 141, 0) == 126) {
                arg2.field5132 = arg2.field5132.method1786(1, 9751);
                class260.method1807(1, arg2.method1688(-79), arg2.field5132, 2);
            } else if (class276.field4742 == arg2) {
                class260.method1807(1, arg2.method1688(-44), arg2.field5132, 2);
            }
            arg2.field5168 = 150;
            arg2.field5170 = 0;
            arg2.field5115 = 0;
        }
        if ((arg0 & 0x40) != 0) {
            int var14 = class160.field2692.method426((byte) -23);
            int var15 = class160.field2692.method431((byte) 27);
            if (var14 == 65535) {
                var14 = -1;
            }
            class172.method1224(var15, var14, (byte) 5, arg2);
        }
        if ((arg0 & 0x2) == 0) {
            return;
        }
        int var16 = class160.field2692.method439(arg3 ^ 0x7FBA);
        int var17 = class160.field2692.method431((byte) 77);
        int var18 = class160.field2692.method431((byte) 41);
        int var19 = class160.field2692.field1068;
        boolean var20 = (var16 & 0x8000) != 0;
        if (arg2.field4068 != null && arg2.field4057 != null) {
            long var21 = arg2.field4068.method1764((byte) -113);
            boolean var23 = false;
            if (var17 <= 1) {
                if (!var20 && (class2.field35 == 1 || class231.field3837 == 1)) {
                    var23 = true;
                } else {
                    for (int var24 = 0; var24 < class29.field453; var24++) {
                        if (class114.field1933[var24] == var21) {
                            var23 = true;
                            break;
                        }
                    }
                }
            }
            if (!var23 && class90.field1541 == 0) {
                class269.field4624.field1068 = 0;
                int var25 = -1;
                class160.field2692.method468(class269.field4624.field1066, (byte) 73, 0, var18);
                class269.field4624.field1068 = 0;
                class255 var27;
                if (var20) {
                    class288 var26 = class277.method1935((byte) -125, class269.field4624);
                    var25 = var26.field4959;
                    var27 = var26.field4952.method1595(class269.field4624, -1);
                    var16 &= 0x7FFF;
                } else {
                    var27 = class71.method508(class194.method1392(class269.field4624, 410623404).method1753(1));
                }
                arg2.field5132 = var27.method1771(255);
                arg2.field5170 = var16 & 0xFF;
                arg2.field5168 = 150;
                arg2.field5115 = var16 >> 8;
                if (var17 == 2) {
                    class100.method780(var25, (class255) null, class3.method14(new class255[] { class254.field4279, arg2.method1688(-103) }, (byte) -51), -32411, var20 ? 17 : 1, var27);
                } else if (var17 == 1) {
                    class100.method780(var25, (class255) null, class3.method14(new class255[] { class51.field764, arg2.method1688(arg3 ^ 0x11) }, (byte) -98), -32411, var20 ? 17 : 1, var27);
                } else {
                    class100.method780(var25, (class255) null, arg2.method1688(-102), arg3 - 32341, var20 ? 17 : 2, var27);
                }
            }
        }
        class160.field2692.field1068 = var18 + var19;
    }
}
