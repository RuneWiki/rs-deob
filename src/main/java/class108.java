import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class108 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lvn;")
    private class169 field1240;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "[I")
    public static int[] field1246 = new int[4096];

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Lqs;")
    private class359 field1247;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "[S")
    public static short[] field1248;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static final void method597(int arg0) {
        field1252++;
        if (arg0 == 14958) {
            class351.field5125.method2043(-91);
            class437.field6406.method2043(arg0 ^ 0xFFFFC5A1);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILvn;)V")
    public final void method598(int arg0, class169 arg1) {
        this.field1240 = arg1;
        if (arg0 != 65535) {
            this.field1247 = null;
        }
        field1251++;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Lqs;")
    public final class359 method599(int arg0) {
        field1239++;
        class359 var2 = this.field1247;
        if (this.field1240.field2358 == var2) {
            this.field1247 = null;
            return null;
        } else if (arg0 > -13) {
            return null;
        } else {
            this.field1247 = var2.field5243;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method600(byte arg0) {
        if (arg0 == -37) {
            field1246 = null;
            field1248 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public static final void method601(int arg0) {
        if (arg0 > -108) {
            method600((byte) -46);
        }
        for (int var1 = 0; var1 < class189.field2578; var1++) {
            int var2 = class204.field2798[var1];
            class358 var3 = class81.field917[var2];
            int var4 = class249.field3379.method1342((byte) -127);
            if ((var4 & 0x8) != 0) {
                var4 += class249.field3379.method1342((byte) -126) << 8;
            }
            if ((var4 & 0x2) != 0) {
                var3.field6259 = class249.field3379.method1350(85);
                var3.field6301 = 100;
            }
            if ((var4 & 0x100) != 0) {
                var3.field6292 = class249.field3379.method1349(102);
                var3.field6309 = class249.field3379.method1349(-56);
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class249.field3379.method1349(113);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class249.field3379.method1382(-28295);
                class422.method2618((byte) 91, var5, var3, var6);
            }
            if ((var4 & 0x400) != 0) {
                int var7 = class249.field3379.method1385(-113);
                var3.field6303 = class249.field3379.method1395(-124);
                var3.field6284 = class249.field3379.method1356((byte) -98);
                var3.field6260 = (var7 & 0x8000) != 0;
                var3.field6262 = var7 & 0x7FFF;
                var3.field6317 = class221.field3033 + var3.field6262 + var3.field6303;
            }
            if ((var4 & 0x10) != 0) {
                int var8 = class249.field3379.method1349(-81);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class249.field3379.method1363(75);
                boolean var10 = true;
                if (var8 != -1 && var3.field6256 != -1) {
                    if (var3.field6256 == var8) {
                        class377 var15 = class251.method1571(var8, (byte) 90);
                        if (var15.field5521 && var15.field5536 != -1) {
                            class182 var16 = class437.method2717(var15.field5536, (byte) -103);
                            int var17 = var16.field2487;
                            if (var17 == 0) {
                                var10 = false;
                            } else if (var17 == 1) {
                                var10 = true;
                            } else if (var17 == 2) {
                                var3.field6314 = 0;
                                var10 = false;
                            }
                        }
                    } else {
                        class377 var11 = class251.method1571(var8, (byte) 90);
                        class377 var12 = class251.method1571(var3.field6256, (byte) 90);
                        if (var11.field5536 != -1 && var12.field5536 != -1) {
                            class182 var13 = class437.method2717(var11.field5536, (byte) -103);
                            class182 var14 = class437.method2717(var12.field5536, (byte) -103);
                            if (var13.field2489 < var14.field2489) {
                                var10 = false;
                            }
                        }
                    }
                }
                if (var10) {
                    var3.field6332 = 0;
                    var3.field6304 = (var9 & 0xFFFF) + class221.field3033;
                    var3.field6256 = var8;
                    var3.field6319 = var9 >> 16;
                    var3.field6315 = 0;
                    var3.field6270 = 1;
                    if (var3.field6304 > class221.field3033) {
                        var3.field6315 = -1;
                    }
                    if (var3.field6256 != -1 && class221.field3033 == var3.field6304) {
                        int var18 = class251.method1571(var3.field6256, (byte) 90).field5536;
                        if (var18 != -1) {
                            class182 var19 = class437.method2717(var18, (byte) -103);
                            if (var19 != null && var19.field2493 != null) {
                                class424.method2628(0, var3.field1304, var19, 0, var3.field1311, false);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x20) != 0) {
                int var20 = class249.field3379.method1376(128);
                int var21 = class249.field3379.method1395(-14);
                var3.method2683(class221.field3033, var21, -25640, var20);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field5229.method2165((byte) -125)) {
                    class283.method1812(var3, 5);
                }
                var3.method2282(class282.method1806(98, class249.field3379.method1385(-123)), (byte) -23);
                var3.method2684(var3.field5229.field4982, (byte) -93);
                var3.field6307 = var3.field5229.field4950 << 3;
                if (var3.field5229.method2165((byte) -113)) {
                    class349.method2224(var3.field6351[0], var3.field6350[0], (class133) null, (class327) null, 0, 128, class410.field5931, var3);
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field6334 = class249.field3379.method1355(32136);
                if (var3.field6334 == 65535) {
                    var3.field6334 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                int var22 = class249.field3379.method1395(-98);
                int[] var23 = new int[var22];
                int[] var24 = new int[var22];
                int[] var25 = new int[var22];
                for (int var26 = 0; var26 < var22; var26++) {
                    int var27 = class249.field3379.method1355(32136);
                    if (var27 == 65535) {
                        var27 = -1;
                    }
                    var23[var26] = var27;
                    var24[var26] = class249.field3379.method1382(-28295);
                    var25[var26] = class249.field3379.method1377(29247);
                }
                class422.method2615(var25, 2, var24, var3, var23);
            }
            if ((var4 & 0x80) != 0) {
                int var28 = class249.field3379.method1376(128);
                int var29 = class249.field3379.method1356((byte) 76);
                var3.method2683(class221.field3033, var29, -25640, var28);
                var3.field6323 = class221.field3033 + 300;
                var3.field6258 = class249.field3379.method1395(-75);
            }
        }
        field1241++;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)Lqs;")
    public final class359 method602(byte arg0) {
        field1244++;
        if (arg0 != 113) {
            method603((byte) -105, (Component) null);
        }
        class359 var2 = this.field1240.field2358.field5243;
        if (this.field1240.field2358 == var2) {
            this.field1247 = null;
            return null;
        } else {
            this.field1247 = var2.field5243;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method603(byte arg0, Component arg1) {
        field1243++;
        arg1.addMouseListener(class343.field5050);
        arg1.addMouseMotionListener(class343.field5050);
        arg1.addFocusListener(class343.field5050);
        int var2 = -43 % ((11 - arg0) / 40);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lqg;")
    public static final class269 method604(int arg0, int arg1) {
        field1250++;
        class269 var2 = (class269) class98.field1106.method410((byte) -54, (long) arg0);
        if (arg1 < 125) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class151.field2119.method361(19, 83, arg0);
            class269 var4 = new class269();
            if (var3 != null) {
                var4.method1711(256, new class211(var3));
            }
            class98.field1106.method414(var4, (byte) 66, (long) arg0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class108() {
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lvn;)V")
    public class108(class169 arg0) {
        this.field1240 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1246[var0] = class356.method2274(1002, var0);
        }
        field1249 = 0;
    }
}
