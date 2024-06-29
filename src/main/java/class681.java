import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class681 {

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "Lhg;")
    public static class693 field9502 = new class693(71, 1);

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "[F")
    public static float[] field9503 = new float[4];

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
    public static int field9506 = 0;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "Lkg;")
    public static class275 field9505 = new class275(20, -2);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    public static int field9499;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "Lha;")
    public static class60 field9504;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "Lnfa;")
    public class681 field9500;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "Lnfa;")
    public class681 field9501;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(Z)V")
    public static void method3834(boolean arg0) {
        field9504 = null;
        field9502 = null;
        if (arg0) {
            field9503 = null;
            field9505 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "(I)V")
    public final void method3835(int arg0) {
        field9497++;
        if (this.field9501 == null) {
            return;
        }
        this.field9501.field9500 = this.field9500;
        if (arg0 != 0) {
            this.method3835(-22);
        }
        this.field9500.field9501 = this.field9501;
        this.field9501 = null;
        this.field9500 = null;
    }

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "(I)V")
    public static final void method3836(int arg0) {
        for (int var1 = 0; var1 < class3.field26; var1++) {
            class268 var3 = class742.field10360[var1];
            boolean var4 = false;
            if (var3.field3379 == null) {
                var3.field3381--;
                if (var3.field3381 < (var3.method1597(-87) ? -1500 : -10)) {
                    var4 = true;
                } else {
                    if (var3.field3372 == 1 && var3.field3383 == null) {
                        var3.field3383 = class49.method371(class695.field9672, var3.field3374, 0);
                        if (var3.field3383 == null) {
                            continue;
                        }
                        var3.field3381 += var3.field3383.method373();
                    } else if (var3.method1597(-94) && (var3.field3375 == null || var3.field3380 == null)) {
                        if (var3.field3375 == null) {
                            var3.field3375 = class413.method2314(class652.field9072, var3.field3374);
                        }
                        if (var3.field3375 == null) {
                            continue;
                        }
                        if (var3.field3380 == null) {
                            var3.field3380 = var3.field3375.method2312(new int[] { 22050 });
                            if (var3.field3380 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field3381 < 0) {
                        int var5 = 8192;
                        int var6;
                        if (var3.field3373 == 0) {
                            var6 = var3.field3384 * (var3.field3372 == 3 ? class748.field10451.field10428.method4186((byte) -55) : class748.field10451.field10434.method4186((byte) -100)) >> 2;
                        } else {
                            int var7 = var3.field3373 >> 24 & 0x3;
                            if (class380.field4847.field5796 == var7) {
                                int var8 = var3.field3373 & 0xFF << 9;
                                int var9 = class380.field4847.method82((byte) 49) << 8;
                                int var10 = (var3.field3373 & 0xFF7577) >> 16;
                                int var11 = (var10 << 9) + var9 + 256 - class380.field4847.field5801;
                                int var12 = (var3.field3373 & 0xFFDA) >> 8;
                                int var13 = (var12 << 9) + var9 + 256 - class380.field4847.field5797;
                                int var14 = (Math.abs(var11) + Math.abs(var13)) - 512;
                                if (var14 > var8) {
                                    var3.field3381 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var6 = (var8 - var14) * class748.field10451.field10394.method4186((byte) 73) * var3.field3384 / var8 >> 2;
                                if (var3.field3368 != null && var3.field3368 instanceof class556) {
                                    class556 var15 = (class556) var3.field3368;
                                    short var16 = var15.field7746;
                                    short var17 = var15.field7734;
                                }
                                if (var11 != 0 || var13 != 0) {
                                    int var18 = -class206.field2731 - (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) - 4096 & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 < 4096) {
                                        var19 = (8192 - var14) / 4096 + 8192;
                                    } else {
                                        var19 = 16384;
                                    }
                                    var5 = var18 * var19 / 8192 + (16384 - var19 >> 1);
                                }
                            } else {
                                var6 = 0;
                            }
                        }
                        if (var6 > 0) {
                            class148 var20 = null;
                            if (var3.field3372 == 1) {
                                var20 = var3.field3383.method372().method1051(class18.field331);
                            } else if (var3.method1597(-108)) {
                                var20 = var3.field3380;
                            }
                            class45 var21 = var3.field3379 = class45.method329(var20, var3.field3378, var6, var5);
                            var21.method326(var3.field3367 - 1);
                            class307.field4055.method1321(var21);
                        }
                    }
                }
            } else if (!var3.field3379.method1176((byte) 68)) {
                var4 = true;
            }
            if (var4) {
                class3.field26--;
                for (int var22 = var1; var22 < class3.field26; var22++) {
                    class742.field10360[var22] = class742.field10360[var22 + 1];
                }
                var1--;
            }
        }
        if (arg0 < 50) {
            method3834(true);
        }
        field9499++;
        if (class87.field1208 && !class453.method2546((byte) 69)) {
            if (class748.field10451.field10402.method4186((byte) 86) != 0 && class309.field4068 != -1) {
                if (class292.field3841 == null) {
                    class393.method2216(false, 0, class87.field1210, 0, class748.field10451.field10402.method4186((byte) -118), class309.field4068);
                } else {
                    class69.method629(0, class87.field1210, class748.field10451.field10402.method4186((byte) 85), class309.field4068, false, false, class292.field3841);
                }
            }
            class292.field3841 = null;
            class87.field1208 = false;
        } else if (class748.field10451.field10402.method4186((byte) -105) != 0 && class309.field4068 != -1 && !class453.method2546((byte) 69)) {
            class344.field4352++;
            class589 var2 = class514.method2994(-29488, class760.field10605, class21.field382);
            var2.field8251.method2568(class309.field4068, -535701016);
            class737.method4107(var2, 7);
            class309.field4068 = -1;
        }
    }
}
