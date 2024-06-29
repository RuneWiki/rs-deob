import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class89 {

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "Lrg;")
    public static class596 field1280 = new class596(12, 5);

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "I")
    public static int field1288;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qda", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field1289;

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "[I")
    public static int[] field1287;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method655(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V", line = 3)
    public static void method649(int arg0) {
        field1280 = null;
        field1287 = null;
        if (arg0 != -4) {
            field1287 = null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)Lin;", line = 18)
    public static final class78 method650(int arg0, int arg1, int arg2) {
        field1284++;
        class78 var3 = class582.method3319((byte) -45, arg1);
        int var4 = 95 / ((arg0 - 20) / 57);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field1046 == null || arg2 >= var3.field1046.length) {
            return null;
        } else {
            return var3.field1046[arg2];
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III[B)I", line = 38)
    public static final int method651(int arg0, int arg1, int arg2, byte[] arg3) {
        field1285++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class563.field7614[(arg3[var5] ^ var4) & 0xFF];
        }
        if (arg1 <= 8) {
            method651(-70, -92, 43, null);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(JI)V", line = 62)
    public static final void method652(long arg0, int arg1) {
        if (arg1 < 30) {
            return;
        }
        field1286++;
        int var3 = class247.field3386;
        int var4 = class323.field4403;
        if (class10.field93 != var3) {
            int var5 = var3 - class10.field93;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class10.field93 += var6;
        }
        if (!class366.field4875.field9367) {
            class705.field9964 += (float) arg0 * class367.field4942 / 40.0F * 8.0F;
            class228.field3168 += (float) arg0 * class299.field4077 / 40.0F * 8.0F;
        }
        if (class476.field6552 != var4) {
            int var7 = var4 - class476.field6552;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class476.field6552 += var8;
        }
        class221.method1402(-4);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILr;IIZIIII)V", line = 153)
    public static final void method653(int arg0, class166 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field1281++;
        if (!arg4) {
            field1283 = 104;
        }
        class526 var9 = (class526) class119.method848(arg2, arg7, arg6);
        if (var9 != null) {
            class301 var10 = class475.field6543.method2685(var9.method211((byte) 85), -118);
            int var11 = var9.method213((byte) 71) & 0x3;
            int var12 = var9.method222(true);
            if (var10.field4117 == -1) {
                int var13 = arg8;
                if (var10.field4164 > 0) {
                    var13 = arg3;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg1.method1171(arg0, 4, true, arg5, var13);
                    } else if (var11 == 1) {
                        arg1.method1172(4, 100, arg5, arg0, var13);
                    } else if (var11 == 2) {
                        arg1.method1171(arg0 + 3, 4, true, arg5, var13);
                    } else if (var11 == 3) {
                        arg1.method1172(4, 95, arg5 + 3, arg0, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg1.method1170(var13, 1, arg0, 1, arg5, -28207);
                    } else if (var11 == 1) {
                        arg1.method1170(var13, 1, arg0 + 3, 1, arg5, -28207);
                    } else if (var11 == 2) {
                        arg1.method1170(var13, 1, arg0 + 3, 1, arg5 + 3, -28207);
                    } else if (var11 == 3) {
                        arg1.method1170(var13, 1, arg0, 1, arg5 + 3, -28207);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg1.method1172(4, 79, arg5, arg0, var13);
                    } else if (var11 == 1) {
                        arg1.method1171(arg0 + 3, 4, arg4, arg5, var13);
                    } else if (var11 == 2) {
                        arg1.method1172(4, 67, arg5 + 3, arg0, var13);
                    } else if (var11 == 3) {
                        arg1.method1171(arg0, 4, true, arg5, var13);
                    }
                }
            } else {
                class664.method3758(-433139193, arg5, arg0, var11, arg1, var10);
            }
        }
        class526 var14 = (class526) class610.method3421(arg2, arg7, arg6, field1289 == null ? (field1289 = method655("kj")) : field1289);
        if (var14 != null) {
            class301 var15 = class475.field6543.method2685(var14.method211((byte) -99), -80);
            int var16 = var14.method213((byte) 82) & 0x3;
            int var17 = var14.method222(true);
            if (var15.field4117 != -1) {
                class664.method3758(-433139193, arg5, arg0, var16, arg1, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field4164 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg1.method1175(arg5 + 3, var18, arg0, arg0 + 3, arg5, 25821);
                } else {
                    arg1.method1175(arg5, var18, arg0, arg0 + 3, arg5 - -3, 25821);
                }
            }
        }
        class526 var19 = (class526) class423.method2445(arg2, arg7, arg6);
        if (var19 == null) {
            return;
        }
        class301 var20 = class475.field6543.method2685(var19.method211((byte) -25), -111);
        int var21 = var19.method213((byte) 54) & 0x3;
        if (var20.field4117 != -1) {
            class664.method3758(-433139193, arg5, arg0, var21, arg1, var20);
            return;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILkj;)Z", line = 295)
    public static final boolean method654(int arg0, class526 arg1) {
        field1288++;
        class301 var2 = class475.field6543.method2685(arg1.method211((byte) 109), -68);
        if (var2.field4117 == -1) {
            return true;
        } else {
            class122 var3 = class643.field8871.method358((byte) -26, var2.field4117);
            return var3.field1676 == arg0 ? true : var3.method875((byte) -68);
        }
    }
}
