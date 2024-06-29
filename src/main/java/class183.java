import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class183 {

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lwf;")
    private class117 field2753 = new class117(64);

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lkda;")
    private class328 field2748;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lada;")
    public static class144 field2750 = new class144(98, -2);

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
    public static int[] field2755 = new int[13];

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2754 = null;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2758 = -1;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field2757;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field2759;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method1269(int arg0) {
        field2750 = null;
        field2754 = null;
        field2755 = null;
        if (arg0 <= 112) {
            method1276(-31);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public final void method1270(int arg0) {
        class117 var2 = this.field2753;
        synchronized (this.field2753) {
            if (arg0 != 1) {
                return;
            }
            this.field2753.method837(126);
        }
        field2751++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Z")
    public static final boolean method1271(int arg0, int arg1, int arg2) {
        field2747++;
        if (arg0 != -2) {
            field2750 = null;
        }
        return class194.method1312(arg1, 9, arg2) || class142.method974((byte) 105, arg2, arg1);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static final void method1272(byte arg0) {
        field2757++;
        if (class309.field4268) {
            return;
        }
        class309.field4268 = true;
        class24.field226 = true;
        int var1 = -100 % ((-arg0 - 61) / 45);
        if (class56.field668.field6852) {
            class539.field8023 = ((int) class539.field8023 - 65 & 0xFFFFFF80);
        } else {
            class308.field4258 += (-24.0F - class308.field4258) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
    public final void method1273(int arg0, int arg1) {
        field2752++;
        if (arg0 == -4) {
            class117 var3 = this.field2753;
            synchronized (this.field2753) {
                this.field2753.method834(arg1, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)Lik;")
    public final class178 method1274(int arg0, int arg1) {
        field2746++;
        class117 var3 = this.field2753;
        class178 var4;
        synchronized (this.field2753) {
            var4 = (class178) this.field2753.method842(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field2748;
        byte[] var6;
        synchronized (this.field2748) {
            var6 = this.field2748.method1966(arg1, 11, true);
            int var7 = -34 / ((arg0 - 48) / 38);
        }
        class178 var8 = new class178();
        if (var6 != null) {
            var8.method1254(new class148(var6), 5);
        }
        class117 var9 = this.field2753;
        synchronized (this.field2753) {
            this.field2753.method835((byte) 119, (long) arg1, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public final void method1275(int arg0) {
        field2745++;
        class117 var2 = this.field2753;
        synchronized (this.field2753) {
            this.field2753.method846(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public static final void method1276(int arg0) {
        class117 var1 = class348.field4770;
        synchronized (class348.field4770) {
            class348.field4770.method846(0);
        }
        if (arg0 != -2) {
            method1271(27, -60, 104);
        }
        field2756++;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
    public static final void method1277(int arg0) {
        if (arg0 != -31029) {
            return;
        }
        for (class457 var1 = (class457) class140.field1988.method124((byte) 42); var1 != null; var1 = (class457) class140.field1988.method120(arg0 ^ 0xFFFF86BC)) {
            if (class420.field5697 == null) {
                var1.method2457(-8422);
            } else if (var1.field6464 <= class617.field9123) {
                int var14 = class480.field6819[var1.field6452];
                if (var14 == 0) {
                    class113 var15 = class169.method1205(var1.field6457, var1.field6451, var1.field6459);
                    if (var15 instanceof class458) {
                        class582.method3472(var1.field6457, var1.field6451, var1.field6459);
                        class458 var16 = (class458) var15;
                        if (var16.field6479 != null) {
                            class129.method907(var1.field6457, var1.field6451, var1.field6459, var16.field6479, null);
                        }
                    }
                } else if (var14 == 1) {
                    class323 var17 = class420.method2476(var1.field6457, var1.field6451, var1.field6459);
                    if (var17 instanceof class355) {
                        class435.method2538(var1.field6457, var1.field6451, var1.field6459);
                        class355 var18 = (class355) var17;
                        if (var18.field4836 != null) {
                            class592.method3516(var1.field6457, var1.field6451, var1.field6459, var18.field4836, null);
                        }
                    }
                } else if (var14 == 2) {
                    class577 var19 = class624.method3650(var1.field6457, var1.field6451, var1.field6459, field2759 == null ? (field2759 = method1278("up")) : field2759);
                    if (var19 instanceof class399) {
                        class409.method2408(var1.field6457, var1.field6451, var1.field6459, field2759 == null ? (field2759 = method1278("up")) : field2759);
                        class399 var20 = (class399) var19;
                        if (var20.field5483 != null) {
                            class320.method1933(var20.field5483, false);
                        }
                    }
                } else if (var14 == 3) {
                    class238 var21 = class440.method2560(var1.field6457, var1.field6451, var1.field6459);
                    if (var21 instanceof class296) {
                        class135.method936(var1.field6457, var1.field6451, var1.field6459);
                        class296 var22 = (class296) var21;
                        if (var22.field4056 != null) {
                            class328.method1985(var1.field6457, var1.field6451, var1.field6459, var22.field4056);
                        }
                    }
                }
                var1.method2457(-8422);
            } else if (class617.field9123 == var1.field6466) {
                int var2 = class480.field6819[var1.field6452];
                if (var2 == 0) {
                    class113 var3 = class169.method1205(var1.field6457, var1.field6451, var1.field6459);
                    if (var3 instanceof class458) {
                        var1.method2457(arg0 + 22607);
                    } else if (class36.method225(var1.field6457, var1.field6451, var1.field6459) == null) {
                        class458 var4 = new class458(var1.field6452, var1.field6449, var1.field6458, var1.field6461, var1.field6453, var3);
                        class129.method907(var1.field6457, var1.field6451, var1.field6459, var4, null);
                    } else {
                        var1.method2457(-8422);
                    }
                } else if (var2 == 1) {
                    class323 var12 = class420.method2476(var1.field6457, var1.field6451, var1.field6459);
                    if (var12 instanceof class355) {
                        var1.method2457(-8422);
                    } else if (class237.method1518(var1.field6457, var1.field6451, var1.field6459) == null) {
                        class355 var13 = new class355(var1.field6452, var1.field6449, var1.field6458, var1.field6461, var1.field6453, var12);
                        class592.method3516(var1.field6457, var1.field6451, var1.field6459, var13, null);
                    } else {
                        var1.method2457(-8422);
                    }
                } else if (var2 == 2) {
                    class577 var7 = class624.method3650(var1.field6457, var1.field6451, var1.field6459, field2759 == null ? (field2759 = method1278("up")) : field2759);
                    if (var7 instanceof class399) {
                        var1.method2457(-8422);
                    } else {
                        class409.method2408(var1.field6457, var1.field6451, var1.field6459, field2759 == null ? (field2759 = method1278("up")) : field2759);
                        class145 var8 = class216.field3172.method1505(-24044, var1.field6454);
                        int var9;
                        int var10;
                        if (var1.field6449 == 1 || var1.field6449 == 3) {
                            var10 = var8.field2067;
                            var9 = var8.field2108;
                        } else {
                            var9 = var8.field2067;
                            var10 = var8.field2108;
                        }
                        class399 var11 = new class399(var1.field6452, var1.field6449, var1.field6457, var1.field6458, var1.field6461, var1.field6453, var1.field6451, var1.field6451 + var10 - 1, var1.field6459, var1.field6459 + var9 - 1, var7);
                        class320.method1933(var11, false);
                    }
                } else if (var2 == 3) {
                    class238 var5 = class440.method2560(var1.field6457, var1.field6451, var1.field6459);
                    if (var5 instanceof class296) {
                        var1.method2457(-8422);
                    } else {
                        class296 var6 = new class296(var1.field6458, var1.field6461, var1.field6453, var5);
                        class328.method1985(var1.field6457, var1.field6451, var1.field6459, var6);
                    }
                }
            }
        }
        field2749++;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lbt;ILkda;)V")
    public class183(class39 arg0, int arg1, class328 arg2) {
        this.field2748 = arg2;
        if (this.field2748 != null) {
            this.field2748.method1975(62, 11);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1278(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
