import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class141 extends class86 {

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    private int field2151 = -32768;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "Lna;")
    public static class26 field2144 = class69.method505("null", (byte) -121);

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "[I")
    public static int[] field2152 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "[Lna;")
    public static class26[] field2154 = new class26[500];

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "[I")
    public static int[] field2145 = new int[1000];

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public int field2155;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "Lve;")
    public static class266 field2161;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "[I")
    public static int[] field2149;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLve;I)Z", line = 8)
    public static final boolean method938(byte arg0, class266 arg1, int arg2) {
        if (arg0 > -116) {
            return false;
        }
        field2162++;
        byte[] var3 = arg1.method1894(arg2, 0);
        if (var3 == null) {
            return false;
        } else {
            class7.method45(var3, 19);
            return true;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 30)
    public static void method939(byte arg0) {
        field2145 = null;
        if (arg0 < 82) {
            method940((byte) -61, false, -20, 24, (class55[][][]) ((class55[][][]) null), 124);
        }
        field2149 = null;
        field2152 = null;
        field2154 = null;
        field2144 = null;
        field2161 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BZII[[[Lbj;I)Z", line = 59)
    public static final boolean method940(byte arg0, boolean arg1, int arg2, int arg3, class55[][][] arg4, int arg5) {
        field2150++;
        byte var6 = arg1 ? 1 : (byte) (class232.field3677 & 0xFF);
        if (class170.field2662[class279.field4651][arg2][arg3] == var6) {
            return false;
        } else if ((class92.field1492[class279.field4651][arg2][arg3] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class190.field2988[var8] = arg2;
            if (arg0 >= -9) {
                method940((byte) -29, false, 59, 52, (class55[][][]) ((class55[][][]) null), 75);
            }
            int var31 = var8 + 1;
            class7.field79[var8] = arg3;
            class170.field2662[class279.field4651][arg2][arg3] = var6;
            while (var7 != var31) {
                int var9 = (class190.field2988[var7] & 0xFF724F) >> 16;
                int var10 = class190.field2988[var7] >> 24 & 0xFF;
                int var11 = class190.field2988[var7] & 0xFFFF;
                int var12 = (class7.field79[var7] & 0xFF26C3) >> 16;
                int var13 = class7.field79[var7] & 0xFFFF;
                var7 = var7 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class92.field1492[class279.field4651][var11][var13] & 0x4) == 0) {
                    var14 = true;
                }
                label241: for (int var16 = class279.field4651 + 1; var16 <= 3; var16++) {
                    if ((class92.field1492[var16][var11][var13] & 0x8) == 0) {
                        if (var14 && arg4[var16][var11][var13] != null) {
                            if (arg4[var16][var11][var13].field890 != null) {
                                int var17 = class208.method1393(var9, (byte) 82);
                                if (arg4[var16][var11][var13].field890.field4416 == var17 || arg4[var16][var11][var13].field890.field4421 == var17) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var18 = class208.method1393(var10, (byte) -93);
                                    if (arg4[var16][var11][var13].field890.field4416 == var18 || arg4[var16][var11][var13].field890.field4421 == var18) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var19 = class208.method1393(var12, (byte) 99);
                                    if (arg4[var16][var11][var13].field890.field4416 == var19 || arg4[var16][var11][var13].field890.field4421 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var11][var13].field877 != null) {
                                for (int var20 = 0; var20 < arg4[var16][var11][var13].field879; var20++) {
                                    int var21 = (int) (arg4[var16][var11][var13].field877[var20].field656 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg4[var16][var11][var13].field877[var20].field656 >> 20 & 0x3L);
                                    int var23 = var21 | var22 << 6;
                                    if (var9 == var23 || var10 != 0 && var10 == var23 || var12 != 0 && var12 == var23) {
                                        continue label241;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class55 var24 = arg4[var16][var11][var13];
                        if (var24 != null && var24.field879 > 0) {
                            for (int var25 = 0; var25 < var24.field879; var25++) {
                                class39 var26 = var24.field877[var25];
                                if (var26.field652 != var26.field637 || var26.field634 != var26.field630) {
                                    for (int var27 = var26.field637; var27 <= var26.field652; var27++) {
                                        for (int var28 = var26.field630; var28 <= var26.field634; var28++) {
                                            class170.field2662[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class170.field2662[var16][var11][var13] = var6;
                    }
                }
                if (var15) {
                    if (class229.field3635[class279.field4651 + 1][var11][var13] > class153.field2392[arg5]) {
                        class153.field2392[arg5] = class229.field3635[class279.field4651 + 1][var11][var13];
                    }
                    int var29 = var11 << 7;
                    if (var29 < class50.field793[arg5]) {
                        class50.field793[arg5] = var29;
                    } else if (class80.field1260[arg5] < var29) {
                        class80.field1260[arg5] = var29;
                    }
                    int var30 = var13 << 7;
                    if (class249.field4080[arg5] > var30) {
                        class249.field4080[arg5] = var30;
                    } else if (class159.field2480[arg5] < var30) {
                        class159.field2480[arg5] = var30;
                    }
                }
                if (!var14) {
                    if (var11 >= 1 && class170.field2662[class279.field4651][var11 - 1][var13] != var6) {
                        class190.field2988[var31] = class240.method1652(class240.method1652(var11 - 1, 1179648), -754974720);
                        class7.field79[var31] = class240.method1652(var13, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class170.field2662[class279.field4651][var11 - 1][var13] = var6;
                    }
                    var13++;
                    if (var13 < 104) {
                        if ((var11 - 1) >= 0 && class170.field2662[class279.field4651][var11 - 1][var13] != var6 && (class92.field1492[class279.field4651][var11][var13] & 0x4) == 0 && (class92.field1492[class279.field4651][var11 - 1][var13 - 1] & 0x4) == 0) {
                            class190.field2988[var31] = class240.method1652(1375731712, class240.method1652(1179648, var11 - 1));
                            class7.field79[var31] = class240.method1652(var13, 1245184);
                            class170.field2662[class279.field4651][var11 - 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class170.field2662[class279.field4651][var11][var13] != var6) {
                            class190.field2988[var31] = class240.method1652(318767104, class240.method1652(var11, 5373952));
                            class7.field79[var31] = class240.method1652(5439488, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class170.field2662[class279.field4651][var11][var13] = var6;
                        }
                        if ((var11 + 1) < 104 && class170.field2662[class279.field4651][var11 + 1][var13] != var6 && (class92.field1492[class279.field4651][var11][var13] & 0x4) == 0 && (class92.field1492[class279.field4651][var11 + 1][var13 - 1] & 0x4) == 0) {
                            class190.field2988[var31] = class240.method1652(-1845493760, class240.method1652(5373952, var11 + 1));
                            class7.field79[var31] = class240.method1652(5439488, var13);
                            class170.field2662[class279.field4651][var11 + 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if (var11 + 1 < 104 && class170.field2662[class279.field4651][var11 + 1][var13] != var6) {
                        class190.field2988[var31] = class240.method1652(class240.method1652(var11 + 1, 9568256), 1392508928);
                        class7.field79[var31] = class240.method1652(var13, 9633792);
                        class170.field2662[class279.field4651][var11 + 1][var13] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if (var11 - 1 >= 0 && class170.field2662[class279.field4651][var11 - 1][var13] != var6 && (class92.field1492[class279.field4651][var11][var13] & 0x4) == 0 && (class92.field1492[class279.field4651][var11 - 1][var13 + 1] & 0x4) == 0) {
                            class190.field2988[var31] = class240.method1652(class240.method1652(var11 - 1, 13762560), 301989888);
                            class7.field79[var31] = class240.method1652(var13, 13828096);
                            class170.field2662[class279.field4651][var11 - 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class170.field2662[class279.field4651][var11][var13] != var6) {
                            class190.field2988[var31] = class240.method1652(class240.method1652(var11, 13762560), -1828716544);
                            class7.field79[var31] = class240.method1652(13828096, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class170.field2662[class279.field4651][var11][var13] = var6;
                        }
                        if ((var11 + 1) < 104 && class170.field2662[class279.field4651][var11 + 1][var13] != var6 && (class92.field1492[class279.field4651][var11][var13] & 0x4) == 0 && (class92.field1492[class279.field4651][var11 + 1][var13 + 1] & 0x4) == 0) {
                            class190.field2988[var31] = class240.method1652(-771751936, class240.method1652(var11 + 1, 9568256));
                            class7.field79[var31] = class240.method1652(9633792, var13);
                            class170.field2662[class279.field4651][var11 + 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class153.field2392[arg5] != -1000000) {
                class153.field2392[arg5] += 10;
                class50.field793[arg5] -= 50;
                class80.field1260[arg5] += 50;
                class159.field2480[arg5] += 50;
                class249.field4080[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V", line = 368)
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2157++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I", line = 382)
    public static final int method941(int arg0, int arg1) {
        field2160++;
        if (arg1 != 5439488) {
            field2156 = 102;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lwa;II)Lna;", line = 400)
    public static final class26 method942(class82 arg0, int arg1, int arg2) {
        field2158++;
        try {
            int var3 = arg0.method617(true);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg0.field1301 += class245.field4024.method1838(0, var3, var4, arg1 ^ 0xFFFFFB21, arg0.field1280, arg0.field1301);
            class26 var5 = class320.method2222(var4, -4114, var3, 0);
            return arg1 == 1 ? var5 : (class26) null;
        } catch (Exception var7) {
            return class80.field1257;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIJILga;)V", line = 432)
    public final void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class19 arg10) {
        field2146++;
        class311 var13 = class45.method341(this.field2155, (byte) 84).method1460(124, -1, 0, (class249) null, this.field2147, 0);
        if (var13 != null) {
            var13.method676(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2151 = var13.method679();
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "()I", line = 451)
    public final int method679() {
        field2148++;
        return this.field2151;
    }
}
