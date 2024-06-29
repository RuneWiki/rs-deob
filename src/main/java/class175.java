import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class175 extends class42 {

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Loc;")
    public static class140 field2614;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "[I")
    public static int[] field2613;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILsg;Z)V", line = 6)
    public static final void method1222(int arg0, class279 arg1, boolean arg2) {
        field2615++;
        if (class430.field6184 >= 400) {
            return;
        }
        class311 var3 = arg1.field4157;
        if (var3.field4631 != null) {
            var3 = var3.method1972(class84.field1335, (byte) -32);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field4576) {
            return;
        }
        String var4 = var3.field4638;
        if (var3.field4623 != arg0) {
            String var5 = class167.field2519 == class14.field163 ? class56.field1005.method426(class503.field7255, arg0 + 85) : class447.field6377.method426(class503.field7255, 70);
            var4 = var4 + class32.method176(20351, class364.field5293.field7383, var3.field4623) + " (" + var5 + var3.field4623 + ")";
        }
        if (!class219.field3351) {
            if (!arg2) {
                String[] var7 = var3.field4599;
                if (class235.field3501) {
                    var7 = class412.method2464(var7, (byte) 87);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (var3.field4650 == 0 || !var7[var8].equalsIgnoreCase(class391.field5559.method426(class503.field7255, 61)))) {
                            byte var9 = 0;
                            int var10 = class522.field7638;
                            if (var8 == 0) {
                                var9 = 4;
                            }
                            if (var8 == 1) {
                                var9 = 19;
                            }
                            if (var8 == 2) {
                                var9 = 16;
                            }
                            if (var8 == 3) {
                                var9 = 44;
                            }
                            if (var3.field4602 == var8) {
                                var10 = var3.field4632;
                            }
                            if (var8 == 4) {
                                var9 = 10;
                            }
                            if (var3.field4614 == var8) {
                                var10 = var3.field4616;
                            }
                            class20.method114(var9, (long) arg1.field290, true, 0, false, true, var7[var8].equalsIgnoreCase(class391.field5559.method426(class503.field7255, arg0 ^ 0x5B)) ? var3.field4625 : var10, "<col=ffff00>" + var4, var7[var8], -1, 0);
                            class471.field6851++;
                        }
                    }
                }
                if (var3.field4650 == 1 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class391.field5559.method426(class503.field7255, 70))) {
                            short var12 = 0;
                            if (var3.field4623 > class364.field5293.field7383) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 4;
                            }
                            if (var11 == 1) {
                                var13 = 19;
                            }
                            if (var11 == 2) {
                                var13 = 16;
                            }
                            if (var11 == 3) {
                                var13 = 44;
                            }
                            if (var11 == 4) {
                                var13 = 10;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class20.method114(var13, (long) arg1.field290, true, 0, false, true, var3.field4625, "<col=ffff00>" + var4, var7[var11], -1, 0);
                            class545.field7991++;
                        }
                    }
                }
            }
            class316.field4700++;
            class20.method114(1001, (long) arg1.field290, true, 0, arg2, true, class337.field4998, "<col=ffff00>" + var4, class96.field1522.method426(class503.field7255, arg0 + 103), -1, 0);
        } else if (!arg2) {
            class284 var6 = class430.field6182 == -1 ? null : class510.field7361.method2011(arg0 ^ 0x5B, class430.field6182);
            if ((class25.field362 & 0x2) != 0) {
                if (var6 == null || var3.method1974((byte) -124, class430.field6182, var6.field4220) != var6.field4220) {
                    class20.method114(12, (long) arg1.field290, true, 0, false, true, class137.field2118, class503.field7268 + " -> <col=ffff00>" + var4, class89.field1442, -1, 0);
                    class268.field4033++;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 168)
    public static void method1223(int arg0) {
        if (arg0 != 26531) {
            method1222(-71, null, false);
        }
        field2613 = null;
        field2614 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z", line = 183)
    public static final boolean method1224(int arg0, int arg1) {
        field2611++;
        if (class92.field1473[arg0]) {
            return true;
        } else if (class106.field1605.method2042(arg0, 60)) {
            int var2 = class106.field1605.method2030(-10914, arg0);
            if (var2 == 0) {
                class92.field1473[arg0] = true;
                return true;
            }
            if (class283.field4217[arg0] == null) {
                class283.field4217[arg0] = new class198[var2];
            }
            if (arg1 != 7607) {
                field2614 = null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class283.field4217[arg0][var3] == null) {
                    byte[] var4 = class106.field1605.method2037(var3, (byte) 68, arg0);
                    if (var4 != null) {
                        class198 var5 = class283.field4217[arg0][var3] = new class198();
                        var5.field3016 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1341(new class519(var4), (byte) -71);
                    }
                }
            }
            class92.field1473[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 242)
    public class175() {
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V", line = 245)
    public class175(int arg0) {
        this.field2612 = arg0;
    }
}
