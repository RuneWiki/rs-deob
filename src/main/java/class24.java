import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class24 implements class413 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lad;")
    public static class11 field429 = new class11(50);

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lpi;")
    public static class340 field430 = new class340(35, 6);

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Ljr;")
    public static class357 field431 = new class357(32);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field427;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field432;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lj;III[Z)V")
    public static final void method161(class254 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class92.field1285 == class283.field3620) {
            return;
        }
        int var5 = class405.field5436[arg1].method1185(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class251 var7 = class405.field5436[var6];
                if (var7 != null) {
                    var7.method1170(arg0, arg2, var5 - var7.method1185(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static final void method162(boolean arg0) {
        field427++;
        class11 var1 = class286.field3657;
        synchronized (class286.field3657) {
            class286.field3657.method90((byte) -27);
        }
        class11 var2 = class324.field4156;
        synchronized (class324.field4156) {
            class324.field4156.method90((byte) -27);
        }
        if (arg0) {
            method161(null, -5, -7, 111, null);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static final void method163(byte arg0) {
        field424++;
        class353 var1 = (class353) class206.field2682.method49(118);
        if (arg0 <= 86) {
            field428 = -29;
        }
        while (var1 != null) {
            if (class470.field6877 == null) {
                var1.method3021(56);
            } else if (var1.field4507 <= class264.field3353) {
                int var2 = class20.field335[var1.field4518];
                if (var2 == 0) {
                    class270 var9 = class67.method384(var1.field4522, var1.field4513, var1.field4515);
                    if (var9 instanceof class516) {
                        class428.method2536(var1.field4522, var1.field4513, var1.field4515);
                        class516 var10 = (class516) var9;
                        if (var10.field7584 != null) {
                            class185.method1228(var1.field4522, var1.field4513, var1.field4515, var10.field7584, null);
                        }
                    }
                } else if (var2 == 1) {
                    class303 var7 = class301.method1806(var1.field4522, var1.field4513, var1.field4515);
                    if (var7 instanceof class461) {
                        class439.method2595(var1.field4522, var1.field4513, var1.field4515);
                        class461 var8 = (class461) var7;
                        if (var8.field6443 != null) {
                            class163.method1081(var1.field4522, var1.field4513, var1.field4515, var8.field6443, null);
                        }
                    }
                } else if (var2 == 2) {
                    class448 var5 = class346.method2038(var1.field4522, var1.field4513, var1.field4515, field432 == null ? (field432 = method166("wk")) : field432);
                    if (var5 instanceof class188) {
                        class287.method1742(var1.field4522, var1.field4513, var1.field4515, field432 == null ? (field432 = method166("wk")) : field432);
                        class188 var6 = (class188) var5;
                        if (var6.field2460 != null) {
                            class363.method2134(var6.field2460, false);
                        }
                    }
                } else if (var2 == 3) {
                    class338 var3 = class205.method1342(var1.field4522, var1.field4513, var1.field4515);
                    if (var3 instanceof class368) {
                        class520.method3088(var1.field4522, var1.field4513, var1.field4515);
                        class368 var4 = (class368) var3;
                        if (var4.field4729 != null) {
                            class405.method2409(var1.field4522, var1.field4513, var1.field4515, var4.field4729);
                        }
                    }
                }
                var1.method3021(96);
            } else if (class264.field3353 == var1.field4524) {
                int var11 = class20.field335[var1.field4518];
                if (var11 == 0) {
                    class270 var12 = class67.method384(var1.field4522, var1.field4513, var1.field4515);
                    if (var12 instanceof class516) {
                        var1.method3021(-106);
                    } else if (class175.method1140(var1.field4522, var1.field4513, var1.field4515) == null) {
                        class516 var13 = new class516(var1.field4518, var1.field4508, var1.field4511, var1.field4510, var1.field4520, var12);
                        class185.method1228(var1.field4522, var1.field4513, var1.field4515, var13, null);
                    } else {
                        var1.method3021(94);
                    }
                } else if (var11 == 1) {
                    class303 var21 = class301.method1806(var1.field4522, var1.field4513, var1.field4515);
                    if (var21 instanceof class461) {
                        var1.method3021(-109);
                    } else if (class303.method1814(var1.field4522, var1.field4513, var1.field4515) == null) {
                        class461 var22 = new class461(var1.field4518, var1.field4508, var1.field4511, var1.field4510, var1.field4520, var21);
                        class163.method1081(var1.field4522, var1.field4513, var1.field4515, var22, null);
                    } else {
                        var1.method3021(104);
                    }
                } else if (var11 == 2) {
                    class448 var16 = class346.method2038(var1.field4522, var1.field4513, var1.field4515, field432 == null ? (field432 = method166("wk")) : field432);
                    if (var16 instanceof class188) {
                        var1.method3021(125);
                    } else {
                        class287.method1742(var1.field4522, var1.field4513, var1.field4515, field432 == null ? (field432 = method166("wk")) : field432);
                        class402 var17 = class52.field715.method1164(var1.field4523, 0);
                        int var18;
                        int var19;
                        if (var1.field4508 == 1 || var1.field4508 == 3) {
                            var19 = var17.field5396;
                            var18 = var17.field5340;
                        } else {
                            var18 = var17.field5396;
                            var19 = var17.field5340;
                        }
                        class188 var20 = new class188(var1.field4518, var1.field4508, var1.field4522, var1.field4511, var1.field4510, var1.field4520, var1.field4513, var19 + var1.field4513 - 1, var1.field4515, var1.field4515 + var18 - 1, var16);
                        class363.method2134(var20, false);
                    }
                } else if (var11 == 3) {
                    class338 var14 = class205.method1342(var1.field4522, var1.field4513, var1.field4515);
                    if (var14 instanceof class368) {
                        var1.method3021(18);
                    } else {
                        class368 var15 = new class368(var1.field4511, var1.field4510, var1.field4520, var14);
                        class405.method2409(var1.field4522, var1.field4513, var1.field4515, var15);
                    }
                }
            }
            var1 = (class353) class206.field2682.method46((byte) 67);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljd;JZ[I)Ljava/lang/String;")
    public final String method164(class408 arg0, long arg1, boolean arg2, int[] arg3) {
        if (!arg2) {
            this.method164(null, 117L, true, null);
        }
        field425++;
        if (class185.field2429 == arg0) {
            class127 var6 = class212.field2724.method1069(1, arg3[0]);
            return var6.method816(0, (int) arg1);
        } else if (class365.field4700 == arg0 || class497.field7289 == arg0) {
            class497 var7 = class89.field1238.method111((int) arg1, -90);
            return var7.field7262;
        } else if (class407.field5458 == arg0 || class179.field2303 == arg0 || class70.field861 == arg0) {
            return class212.field2724.method1069(1, arg3[0]).method816(0, (int) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method165(int arg0) {
        field431 = null;
        field429 = null;
        field430 = null;
        if (arg0 != 6) {
            field431 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method166(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
