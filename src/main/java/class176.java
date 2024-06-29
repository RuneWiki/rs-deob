import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class176 extends class320 {

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Ljava/lang/String;")
    public String field2997;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field2996 = 0;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "[I")
    public static int[] field2995 = new int[128];

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 13)
    public static void method1361(int arg0) {
        if (arg0 == 31590) {
            field2995 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Z", line = 24)
    public static final boolean method1362(int arg0, byte arg1) {
        field2998++;
        byte var2 = 0;
        byte var3 = 0;
        if (class324.field5161 == null) {
            if (class43.field680 || client.field4372 == null) {
                class324.field5161 = new class309(512, 512);
            } else {
                class324.field5161 = (class309) client.field4372;
            }
            int[] var4 = class324.field5161.field4907;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var8 = ((var3 + 103 - var7) * 512 * 4) + 24628;
                for (int var9 = var2 + 1; var9 < 104 - var2 - 1; var9++) {
                    if ((class152.field2683[arg0][var9][var7] & 0x18) == 0) {
                        class36.method320(var4, var8, 512, arg0, var9, var7);
                    }
                    if (arg0 < 3 && (class152.field2683[arg0 + 1][var9][var7] & 0x8) != 0) {
                        class36.method320(var4, var8, 512, arg0 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class179.field3032 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class271.method1850(class205.field3497, var10 + var2, var3 + var11);
                    if (var12 != 0L) {
                        class97 var14 = class92.method798((byte) 104, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                        int var15 = var14.field1568;
                        if (var14.field1579 != null) {
                            for (int var16 = 0; var16 < var14.field1579.length; var16++) {
                                if (var14.field1579[var16] != -1) {
                                    class97 var17 = class92.method798((byte) 104, var14.field1579[var16]);
                                    if (var17.field1568 >= 0) {
                                        var15 = var17.field1568;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var2 + var10;
                            int var19 = var11 + var3;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class163.field2882[class205.field3497].field3418;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && var18 > var10 - 3 && (var20[var18 - 1][var19] & 0x2C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && (var10 + 3) > var18 && (var20[var18 + 1][var19] & 0x2C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var19 > (var11 - 3) && (var20[var18][var19 - 1] & 0x2C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && var19 < (var11 + 3) && (var20[var18][var19 + 1] & 0x2C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class13.field214[class179.field3032] = var14.field1522;
                            class272.field4350[class179.field3032] = var18 - var2;
                            class139.field2555[class179.field3032] = var19 - var3;
                            class179.field3032++;
                        }
                    }
                }
            }
        }
        int var23 = ((int) (Math.random() * 20.0D)) - (-238 - ((int) (Math.random() * 20.0D) + 228 << 8) - (228 - -((int) (Math.random() * 20.0D)) << 16)) - 10;
        int var24 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        class324.field5161.method2141();
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class152.field2683[arg0][var2 + var26][var3 + var25] & 0x18) == 0 && !class282.method1926(var25, var24, arg0, var2, var3, var26, 1536, var23)) {
                    if (class43.field680) {
                        class47.field725 = null;
                    } else {
                        class256.field4119.method1358(2);
                    }
                    return false;
                }
                if (arg0 < 3 && (class152.field2683[arg0 + 1][var2 + var26][var25 + var3] & 0x8) != 0 && !class282.method1926(var25, var24, arg0 + 1, var2, var3, var26, 1536, var23)) {
                    if (class43.field680) {
                        class47.field725 = null;
                    } else {
                        class256.field4119.method1358(2);
                    }
                    return false;
                }
            }
        }
        if (arg1 != -54) {
            method1362(-18, (byte) 76);
        }
        if (class43.field680) {
            int[] var27 = class324.field5161.field4907;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            client.field4372 = new class157(class324.field5161);
        } else {
            client.field4372 = class324.field5161;
        }
        if (class43.field680) {
            class47.field725 = null;
        } else {
            class256.field4119.method1358(2);
        }
        class324.field5161 = null;
        return true;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 259)
    public class176() {
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 264)
    public class176(String arg0, int arg1) {
        this.field2997 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII)V", line = 277)
    public static final void method1363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg3;
        field2999++;
        int var7 = arg0 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class100.method861(arg4, arg3, arg0, (byte) -123, arg1);
            }
        } else if (var7 == 0) {
            class203.method1524(-29775, arg3, arg4, arg2, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class170.field2944 > arg2) {
                var10 = class170.field2944;
                var11 = (class170.field2944 * var8 >> 12) + var9;
            } else if (arg2 > class310.field4916) {
                var10 = class310.field4916;
                var11 = (class310.field4916 * var8 >> 12) + var9;
            } else {
                var11 = arg0;
                var10 = arg2;
            }
            int var12;
            int var13;
            if (class170.field2944 > arg3) {
                var12 = class170.field2944;
                var13 = (class170.field2944 * var8 >> 12) + var9;
            } else if (arg3 <= class310.field4916) {
                var12 = arg3;
                var13 = arg4;
            } else {
                var12 = class310.field4916;
                var13 = (class310.field4916 * var8 >> 12) + var9;
            }
            if (class90.field1428 > var13) {
                var12 = (class90.field1428 - var9 << 12) / var8;
                var13 = class90.field1428;
            } else if (var13 > class135.field2358) {
                var12 = (class135.field2358 - var9 << 12) / var8;
                var13 = class135.field2358;
            }
            if (arg5 != 22608) {
                field2995 = (int[]) null;
            }
            if (var11 < class90.field1428) {
                var11 = class90.field1428;
                var10 = (class90.field1428 - var9 << 12) / var8;
            } else if (var11 > class135.field2358) {
                var11 = class135.field2358;
                var10 = (class135.field2358 - var9 << 12) / var8;
            }
            class223.method1629(arg1, var12, var10, var11, (byte) -62, var13);
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 380)
    public static final void method1364(int arg0) {
        if (arg0 != 1630955528) {
            field2995 = (int[]) null;
        }
        for (int var1 = 0; var1 < class119.field2067; var1++) {
            int var2 = class146.field2641[var1];
            class205 var3 = class135.field2359[var2];
            int var4 = class276.field4398.method2364(-9069);
            if ((var4 & 0x20) != 0) {
                var4 += class276.field4398.method2364(-9069) << 8;
            }
            class234.method1675(112, var2, var3, var4);
        }
        field3000++;
    }
}
