import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class240 extends RuntimeException {

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Ljava/lang/String;")
    public String field3572;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3569;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Z")
    public static boolean field3566 = false;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field3570 = 0;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "F")
    public static float field3576;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lp;")
    public static class25 field3571;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lph;")
    public static class361 field3565;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[[[I")
    public static int[][][] field3567;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1768(int arg0) {
        field3568++;
        if (arg0 != -1) {
            method1770(-118);
        }
        for (class19 var1 = (class19) class62.field905.method93((byte) -98); var1 != null; var1 = (class19) class62.field905.method97(-112)) {
            class332 var2 = var1.field309;
            if (class321.field4835 != var2.field5084 || class304.field4560 > var2.field5054) {
                var1.method876(8);
            } else if (var2.field5072 <= class304.field4560) {
                if (var2.field5069 > 0) {
                    class181 var3 = class300.field4495[var2.field5069 - 1];
                    if (var3 != null && var3.field5137 >= 0 && var3.field5137 < 13312 && var3.field5165 >= 0 && var3.field5165 < 13312) {
                        var2.method2335(117, class71.method584(var2.field5084, var3.field5137, 75, var3.field5165) - var2.field5076, class304.field4560, var3.field5137, var3.field5165);
                    }
                }
                if (var2.field5069 < 0) {
                    int var4 = -var2.field5069 - 1;
                    class228 var5;
                    if (class54.field790 == var4) {
                        var5 = class1.field55;
                    } else {
                        var5 = class343.field5312[var4];
                    }
                    if (var5 != null && var5.field5137 >= 0 && var5.field5137 < 13312 && var5.field5165 >= 0 && var5.field5165 < 13312) {
                        var2.method2335(-29, class71.method584(var2.field5084, var5.field5137, arg0 + 65, var5.field5165) - var2.field5076, class304.field4560, var5.field5137, var5.field5165);
                    }
                }
                var2.method2333(class94.field1310, arg0 ^ 0xFFFFFFFE);
                class89.method707(class321.field4835, (int) var2.field5064, (int) var2.field5046, (int) var2.field5060, 60, var2, var2.field5075, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBLqm;I)V", line = 70)
    public static final void method1769(int arg0, byte arg1, class228 arg2, int arg3) {
        if ((arg0 & 0x8) != 0) {
            arg2.field5138 = class83.field1194.method1329((byte) 59);
            if (arg2.field5138.charAt(0) == '~') {
                arg2.field5138 = arg2.field5138.substring(1);
                class247.method1814(arg2.method1707(-62, false), -1, arg2.method1707(-105, true), 2, 0, arg2.field5138);
            } else if (class1.field55 == arg2) {
                class247.method1814(arg2.method1707(-115, false), -1, arg2.method1707(-79, true), 2, 0, arg2.field5138);
            }
            arg2.field5109 = 0;
            arg2.field5116 = 0;
            arg2.field5181 = 150;
        }
        if (arg1 >= -47) {
            return;
        }
        if ((arg0 & 0x200) != 0) {
            int var4 = class83.field1194.method1317((byte) 35);
            boolean var5 = true;
            if (var4 == 65535) {
                var4 = -1;
            }
            int var6 = class83.field1194.method1359((byte) -81);
            if (var4 != -1 && arg2.field5090 != -1 && class119.method893(class81.method669(32, var4).field1540, (byte) -41).field3666 < class119.method893(class81.method669(32, arg2.field5090).field1540, (byte) -41).field3666) {
                var5 = false;
            }
            if (var5) {
                arg2.field5144 = 1;
                arg2.field5107 = (var6 & 0xFFFF) + class304.field4560;
                arg2.field5090 = var4;
                arg2.field5131 = 0;
                arg2.field5159 = 0;
                if (class304.field4560 < arg2.field5107) {
                    arg2.field5159 = -1;
                }
                arg2.field5100 = var6 >> 16;
                if (arg2.field5090 != -1 && class304.field4560 == arg2.field5107) {
                    int var7 = class81.method669(32, arg2.field5090).field1540;
                    if (var7 != -1) {
                        class248 var8 = class119.method893(var7, (byte) -41);
                        if (var8 != null && var8.field3667 != null) {
                            class361.method2512(-29521, arg2.field5137, class1.field55 == arg2, 0, var8, arg2.field5165);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x100) != 0) {
            arg2.field5173 = class83.field1194.method1319(255);
            arg2.field5095 = class83.field1194.method1320((byte) 42);
            arg2.field5175 = class83.field1194.method1320((byte) 90);
            arg2.field5091 = class83.field1194.method1320((byte) 63);
            arg2.field5136 = class83.field1194.method1362(255) + class304.field4560;
            arg2.field5119 = class83.field1194.method1338((byte) -54) + class304.field4560;
            arg2.field5163 = class83.field1194.method1319(255);
            arg2.field5122 = 0;
            arg2.field5113 = 1;
        }
        if ((arg0 & 0x800) != 0) {
            int var9 = class83.field1194.method1370(-31156);
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = class83.field1194.method1338((byte) -54);
                if (var14 == 65535) {
                    var14 = -1;
                }
                var11[var13] = var14;
                var10[var13] = class83.field1194.method1320((byte) 106);
                var12[var13] = class83.field1194.method1362(255);
            }
            class258.method1897(arg2, var12, var10, true, var11);
        }
        field3564++;
        if ((arg0 & 0x2) != 0) {
            int var15 = class83.field1194.method1350(0);
            int var16 = class83.field1194.method1370(-31156);
            int var17 = class83.field1194.method1370(-31156);
            int var18 = class83.field1194.field2776;
            boolean var19 = (var15 & 0x8000) != 0;
            if (arg2.field3453 != null && arg2.field3445 != null) {
                boolean var20 = false;
                if (var16 <= 1) {
                    if (!var19 && !(!class251.field3727 || class216.field3182) || class296.field4451) {
                        var20 = true;
                    } else if (class103.method793(76, arg2.field3453)) {
                        var20 = true;
                    }
                }
                if (!var20 && class251.field3730 == 0) {
                    int var21 = -1;
                    class47.field709.field2776 = 0;
                    class83.field1194.method1369(class47.field709.field2718, 0, -70, var17);
                    class47.field709.field2776 = 0;
                    String var22;
                    if (var19) {
                        var15 &= 0x7FFF;
                        class225 var23 = class232.method1720(class47.field709, -120);
                        var21 = var23.field3390;
                        var22 = var23.field3394.method2170((byte) -68, class47.field709);
                    } else {
                        var22 = class29.method196(class144.method1034(512, class361.method2504((byte) 3, class47.field709)));
                    }
                    arg2.field5138 = var22.trim();
                    arg2.field5116 = var15 >> 8;
                    arg2.field5181 = 150;
                    arg2.field5109 = var15 & 0xFF;
                    int var24;
                    if (var16 == 1 || var16 == 2) {
                        var24 = var19 ? 17 : 1;
                    } else {
                        var24 = var19 ? 17 : 2;
                    }
                    if (var16 == 2) {
                        class142.method1026((String) null, var22, "<img=1>" + arg2.method1707(-107, true), var21, 0, var24, (byte) 30, "<img=1>" + arg2.method1707(-57, false));
                    } else if (var16 == 1) {
                        class142.method1026((String) null, var22, "<img=0>" + arg2.method1707(-38, true), var21, 0, var24, (byte) 30, "<img=0>" + arg2.method1707(-91, false));
                    } else {
                        class142.method1026((String) null, var22, arg2.method1707(-106, true), var21, 0, var24, (byte) 30, arg2.method1707(-91, false));
                    }
                }
            }
            class83.field1194.field2776 = var17 + var18;
        }
        if ((arg0 & 0x4) != 0) {
            int var25 = class83.field1194.method1350(0);
            int var26 = class83.field1194.method1319(255);
            if (var25 == 65535) {
                var25 = -1;
            }
            class344.method2406(var26, var25, (byte) 119, arg2);
        }
        if ((arg0 & 0x1) != 0) {
            int var27 = class83.field1194.method1372(-122);
            int var28 = class83.field1194.method1319(255);
            arg2.method2345(class304.field4560, var28, var27, 0);
            arg2.field5129 = class304.field4560 + 300;
            arg2.field5197 = class83.field1194.method1370(-31156);
        }
        if ((arg0 & 0x400) != 0) {
            int var29 = class83.field1194.method1372(-64);
            int var30 = class83.field1194.method1370(-31156);
            arg2.method2345(class304.field4560, var30, var29, 0);
        }
        if ((arg0 & 0x20) != 0) {
            arg2.field5157 = class83.field1194.method1362(255);
            arg2.field5167 = class83.field1194.method1362(255);
        }
        if ((arg0 & 0x40) != 0) {
            int var31 = class83.field1194.method1319(255);
            byte[] var32 = new byte[var31];
            class190 var33 = new class190(var32);
            class83.field1194.method1309(var31, 0, var32, -21941);
            class299.field4478[arg3] = var33;
            arg2.method1708(var33, (byte) -81, arg3);
        }
        if ((arg0 & 0x80) != 0) {
            arg2.field5183 = class83.field1194.method1362(255);
            if (arg2.field5183 == 65535) {
                arg2.field5183 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 338)
    public static void method1770(int arg0) {
        field3571 = null;
        field3565 = null;
        if (arg0 != -6990) {
            method1768(-13);
        }
        field3567 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 360)
    public class240(Throwable arg0, String arg1) {
        this.field3572 = arg1;
        this.field3569 = arg0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)I", line = 375)
    public static final int method1771(int arg0, int arg1) {
        field3573++;
        if (arg1 == -1806) {
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 - 61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } else {
            return 66;
        }
    }
}
