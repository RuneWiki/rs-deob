import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class53 {

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "Lw;")
    private class36 field713 = new class36();

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "Lqk;")
    private class65 field717 = new class65();

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    private int field714;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    private int field716;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "Lik;")
    private class17 field718;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Lhi;")
    public static class192 field706 = new class192();

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 5)
    public final void method363(int arg0) {
        this.field717.method446(75);
        this.field718.method118((byte) -49);
        field708++;
        this.field713 = new class36();
        if (arg0 == -51) {
            this.field716 = this.field714;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBILff;I)V", line = 21)
    public static final void method364(int arg0, byte arg1, int arg2, class181 arg3, int arg4) {
        field707++;
        if (class204.field2938 >= 400) {
            return;
        }
        if (arg3.field2476 != null) {
            arg3 = arg3.method1266((byte) -4);
        }
        if (arg3 == null || !arg3.field2461) {
            return;
        }
        int var5 = 47 / ((arg1 - 21) / 46);
        String var6 = arg3.field2466;
        if (arg3.field2428 != 0) {
            String var7 = class39.field448 == 1 ? class61.field812 : class250.field3585;
            var6 = var6 + class170.method1200((byte) 108, arg3.field2428, class173.field2356.field3416) + " (" + var7 + arg3.field2428 + ")";
        }
        if (class1.field15 == 1) {
            class237.method1632((short) 57, class166.field2269, class189.field2606, arg0, (long) arg2, -102, class148.field2052 + " -> <col=ffff00>" + var6, arg4);
            class245.field3539++;
        } else if (class124.field1676) {
            class115 var15 = class273.field4091 == -1 ? null : class323.method2268(class273.field4091, (byte) -102);
            if ((class172.field2348 & 0x2) != 0 && (var15 == null || arg3.method1262(class273.field4091, (byte) -109, var15.field1567) != var15.field1567)) {
                class237.method1632((short) 49, class128.field1753, class282.field4224, arg0, (long) arg2, 98, class266.field3880 + " -> <col=ffff00>" + var6, arg4);
                class113.field1547++;
            }
        } else {
            class291.field4343++;
            String[] var8 = arg3.field2421;
            if (class301.field4466) {
                var8 = class1.method1(var8, true);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class39.field448 != 0 || !var8[var9].equalsIgnoreCase(class160.field2194))) {
                        class54.field736++;
                        int var10 = -1;
                        byte var11 = 0;
                        if (arg3.field2482 == var9) {
                            var10 = arg3.field2478;
                        }
                        if (var9 == 0) {
                            var11 = 8;
                        }
                        if (arg3.field2454 == var9) {
                            var10 = arg3.field2442;
                        }
                        if (var9 == 1) {
                            var11 = 7;
                        }
                        if (var9 == 2) {
                            var11 = 35;
                        }
                        if (var9 == 3) {
                            var11 = 3;
                        }
                        if (var9 == 4) {
                            var11 = 12;
                        }
                        class237.method1632(var11, var10, var8[var9], arg0, (long) arg2, 74, "<col=ffff00>" + var6, arg4);
                    }
                }
            }
            if (class39.field448 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class160.field2194)) {
                        class90.field1263++;
                        short var13 = 0;
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 8;
                        }
                        if (class173.field2356.field3416 < arg3.field2428) {
                            var13 = 2000;
                        }
                        if (var12 == 1) {
                            var14 = 7;
                        }
                        if (var12 == 2) {
                            var14 = 35;
                        }
                        if (var12 == 3) {
                            var14 = 3;
                        }
                        if (var12 == 4) {
                            var14 = 12;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class237.method1632(var14, arg3.field2436, var8[var12], arg0, (long) arg2, 72, "<col=ffff00>" + var6, arg4);
                    }
                }
            }
            class237.method1632((short) 1007, class317.field4837, class330.field4972, arg0, (long) arg2, -102, "<col=ffff00>" + var6, arg4);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(JI)Lw;", line = 180)
    public final class36 method365(long arg0, int arg1) {
        if (arg1 != 35) {
            this.method369(-3, (class36) null, -99L);
        }
        field712++;
        class36 var4 = (class36) this.field718.method111(115, arg0);
        if (var4 != null) {
            this.field717.method443(true, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Lim;", line = 210)
    public final class183 method366(int arg0) {
        if (arg0 != 1) {
            this.field718 = (class17) null;
        }
        field709++;
        return this.field718.method115(0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 223)
    public static void method367(byte arg0) {
        if (arg0 <= -95) {
            field706 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)Lim;", line = 234)
    public final class183 method368(int arg0) {
        if (arg0 < 94) {
            this.field717 = (class65) null;
        }
        field710++;
        return this.field718.method110(0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILw;J)V", line = 261)
    public final void method369(int arg0, class36 arg1, long arg2) {
        if (this.field716 == arg0) {
            class36 var5 = this.field717.method445((byte) 120);
            var5.method1274((byte) -26);
            var5.method206(-1);
            if (this.field713 == var5) {
                class36 var6 = this.field717.method445((byte) 120);
                var6.method1274((byte) -26);
                var6.method206(-1);
            }
        } else {
            this.field716--;
        }
        this.field718.method120(arg2, arg1, arg0 - 22851);
        this.field717.method443(true, arg1);
        field711++;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(I)V", line = 300)
    public class53(int arg0) {
        this.field714 = arg0;
        this.field716 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field718 = new class17(var2);
    }
}
