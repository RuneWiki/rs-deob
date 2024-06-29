import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class287 {

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4594 = "Opened title screen";

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Z")
    public static boolean field4595 = false;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4592 = "Loading config - ";

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field4600 = 0;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Z")
    public static boolean field4601 = false;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4596;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZZJ)V", line = 15)
    public static final void method2060(boolean arg0, boolean arg1, long arg2) {
        field4603++;
        if (arg2 == 0L) {
            return;
        }
        if (class207.field3412 >= 100) {
            class155.method1109(class169.field2786, 0, "", (byte) -47);
            return;
        }
        String var4 = class13.method74(-124, arg2);
        for (int var5 = 0; var5 < class207.field3412; var5++) {
            if (class54.field769[var5] == arg2) {
                class155.method1109(var4 + class116.field1766, 0, "", (byte) -47);
                return;
            }
        }
        if (!arg0) {
            field4596 = (String[]) null;
        }
        for (int var6 = 0; var6 < class61.field875; var6++) {
            if (class105.field1550[var6] == arg2) {
                class155.method1109(class57.field794 + var4 + class169.field2792, 0, "", (byte) -47);
                return;
            }
        }
        if (var4.equals(class191.field3129.field5216)) {
            class155.method1109(class46.field640, 0, "", (byte) -47);
            return;
        }
        class156.field2411++;
        class54.field769[class207.field3412] = arg2;
        class210.field3450[class207.field3412] = class190.method1406(arg2, false);
        class181.field2993[class207.field3412++] = arg1;
        class133.field2092 = class186.field3074;
        class194.field3175.method2375(29, 0);
        class194.field3175.method255(false, arg2);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 79)
    public static void method2061(int arg0) {
        if (arg0 != -457) {
            method2062(57, (class44) null);
        }
        field4596 = null;
        field4592 = null;
        field4594 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjj;)V", line = 95)
    public static final void method2062(int arg0, class44 arg1) {
        field4593++;
        if (arg0 != 13859) {
            return;
        }
        int var2 = arg1.method281(-83);
        class29.field399 = new class173[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class29.field399[var3] = new class173();
            class29.field399[var3].field2869 = arg1.method281(-87);
            class29.field399[var3].field2877 = arg1.method275(arg0 ^ 0xFFFFC9E1);
        }
        class108.field1604 = arg1.method281(-93);
        class145.field2262 = arg1.method281(-96);
        class24.field334 = arg1.method281(-100);
        class280.field4515 = new class339[class145.field2262 + 1 - class108.field1604];
        for (int var4 = 0; var4 < class24.field334; var4++) {
            int var5 = arg1.method281(-89);
            class339 var6 = class280.field4515[var5] = new class339();
            var6.field457 = arg1.method286((byte) -84);
            var6.field450 = arg1.method238((byte) 82);
            var6.field5281 = class108.field1604 + var5;
            var6.field5287 = arg1.method275(-124);
            var6.field5284 = arg1.method275(-82);
        }
        class20.field297 = arg1.method238((byte) 82);
        class103.field1507 = true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)V", line = 148)
    public static final void method2063(int arg0, int arg1, byte arg2) {
        class344 var3 = class110.method759(5, arg0, false);
        var3.method2390((byte) -55);
        field4602++;
        if (arg2 < -12) {
            var3.field5354 = arg1;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILqm;B)V", line = 175)
    public static final void method2064(int arg0, int arg1, class334 arg2, byte arg3) {
        if ((arg1 & 0x40) != 0) {
            int var4 = class247.field3898.method221((byte) -78);
            byte[] var5 = new byte[var4];
            class44 var6 = new class44(var5);
            class247.field3898.method259(354643112, var5, 0, var4);
            class324.field5033[arg0] = var6;
            arg2.method2332((byte) -14, var6);
        }
        if ((arg1 & 0x100) != 0) {
            int var7 = class247.field3898.method282((byte) -97);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class247.field3898.method238((byte) 82);
            boolean var9 = true;
            if (var7 != -1 && arg2.field4278 != -1 && class325.method2274(class215.method1545(var7, 1).field5011, -99).field3279 < class325.method2274(class215.method1545(arg2.field4278, 1).field5011, -83).field3279) {
                var9 = false;
            }
            if (var9) {
                arg2.field4211 = 0;
                arg2.field4267 = 1;
                arg2.field4236 = (var8 & 0xFFFF) + class240.field3818;
                arg2.field4276 = 0;
                if (arg2.field4236 > class240.field3818) {
                    arg2.field4276 = -1;
                }
                arg2.field4278 = var7;
                arg2.field4206 = var8 >> 16;
                if (arg2.field4278 != -1 && class240.field3818 == arg2.field4236) {
                    int var10 = class215.method1545(arg2.field4278, 1).field5011;
                    if (var10 != -1) {
                        class202 var11 = class325.method2274(var10, -116);
                        if (var11 != null && var11.field3293 != null) {
                            class190.method1411(31, class191.field3129 == arg2, var11, arg2.field4264, 0, arg2.field4255);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x400) != 0) {
            int var12 = class247.field3898.method221((byte) -78);
            int[] var13 = new int[var12];
            int[] var14 = new int[var12];
            int[] var15 = new int[var12];
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = class247.field3898.method226(-16384);
                if (var17 == 65535) {
                    var17 = -1;
                }
                var15[var16] = var17;
                var13[var16] = class247.field3898.method286((byte) -95);
                var14[var16] = class247.field3898.method226(-16384);
            }
            class160.method1143(arg2, -2781, var14, var13, var15);
        }
        if ((arg1 & 0x2) != 0) {
            int var18 = class247.field3898.method267((byte) -73);
            int var19 = class247.field3898.method248(true);
            boolean var20 = (var18 & 0x8000) != 0;
            int var21 = class247.field3898.method248(true);
            int var22 = class247.field3898.field586;
            if (arg2.field5216 != null && arg2.field5224 != null) {
                long var23 = class204.method1491(-26916, arg2.field5216);
                boolean var25 = false;
                if (var19 <= 1) {
                    if (!var20 && (class178.field2963 && !class320.field4962 || class102.field1487)) {
                        var25 = true;
                    } else {
                        for (int var26 = 0; var26 < class207.field3412; var26++) {
                            if (class54.field769[var26] == var23) {
                                var25 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var25 && class186.field3079 == 0) {
                    class127.field1971.field586 = 0;
                    class247.field3898.method254(0, class127.field1971.field573, (byte) -97, var21);
                    class127.field1971.field586 = 0;
                    int var27 = -1;
                    String var29;
                    if (var20) {
                        var18 &= 0x7FFF;
                        class123 var28 = class324.method2272(class127.field1971, (byte) 98);
                        var27 = var28.field1926;
                        var29 = var28.field1925.method1897(-60, class127.field1971);
                    } else {
                        var29 = class251.method1791(class173.method1304(1, class51.method334(32767, class127.field1971)));
                    }
                    arg2.field4240 = var29.trim();
                    arg2.field4207 = var18 & 0xFF;
                    arg2.field4215 = var18 >> 8;
                    arg2.field4257 = 150;
                    if (var19 == 2) {
                        class236.method1710(var29, var20 ? 17 : 1, "<img=1>" + arg2.method2333(true), (String) null, -35, var27);
                    } else if (var19 == 1) {
                        class236.method1710(var29, var20 ? 17 : 1, "<img=0>" + arg2.method2333(true), (String) null, -17, var27);
                    } else {
                        class236.method1710(var29, var20 ? 17 : 2, arg2.method2333(true), (String) null, -33, var27);
                    }
                }
            }
            class247.field3898.field586 = var21 + var22;
        }
        if ((arg1 & 0x10) != 0) {
            int var30 = class247.field3898.method281(-125);
            int var31 = class247.field3898.method221((byte) -78);
            arg2.method1879(0, var31, var30, class240.field3818);
            arg2.field4183 = class240.field3818 + 300;
            arg2.field4223 = class247.field3898.method221((byte) -78);
        }
        if ((arg1 & 0x80) != 0) {
            arg2.field4241 = class247.field3898.method267((byte) -40);
            arg2.field4202 = class247.field3898.method267((byte) -83);
        }
        field4598++;
        if ((arg1 & 0x200) != 0) {
            int var32 = class247.field3898.method281(-81);
            int var33 = class247.field3898.method221((byte) -78);
            arg2.method1879(0, var33, var32, class240.field3818);
        }
        if ((arg1 & 0x20) != 0) {
            int var34 = class247.field3898.method267((byte) -119);
            int var35 = class247.field3898.method248(true);
            if (var34 == 65535) {
                var34 = -1;
            }
            class166.method1217((byte) 125, var34, var35, arg2);
        }
        if ((arg1 & 0x800) != 0) {
            arg2.field4242 = class247.field3898.method221((byte) -78);
            arg2.field4224 = class247.field3898.method286((byte) -108);
            arg2.field4261 = class247.field3898.method263(true);
            arg2.field4181 = class247.field3898.method286((byte) -88);
            arg2.field4200 = class247.field3898.method282((byte) -97) + class240.field3818;
            arg2.field4252 = class247.field3898.method282((byte) -97) + class240.field3818;
            arg2.field4210 = class247.field3898.method286((byte) -86);
            arg2.field4251 = 1;
            arg2.field4279 = 0;
        }
        if ((arg1 & 0x1) != 0) {
            arg2.field4198 = class247.field3898.method226(-16384);
            if (arg2.field4198 == 65535) {
                arg2.field4198 = -1;
            }
        }
        int var36 = 86 % ((arg3 - 73) / 35);
        if ((arg1 & 0x8) == 0) {
            return;
        }
        arg2.field4240 = class247.field3898.method265(0);
        if (arg2.field4240.charAt(0) == '~') {
            arg2.field4240 = arg2.field4240.substring(1);
            class155.method1109(arg2.field4240, 2, arg2.method2333(true), (byte) -47);
        } else if (class191.field3129 == arg2) {
            class155.method1109(arg2.field4240, 2, arg2.method2333(true), (byte) -47);
        }
        arg2.field4207 = 0;
        arg2.field4257 = 150;
        arg2.field4215 = 0;
    }
}
