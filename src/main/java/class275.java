import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class275 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "[I")
    public static int[] field4195 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field4198;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field4199;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[IILkd;I[I)Lnn;")
    public static final class289 method1805(int arg0, int[] arg1, int arg2, class188 arg3, int arg4, int[] arg5) {
        field4198++;
        byte[] var6 = new byte[arg0 * arg2];
        if (arg4 != 255) {
            field4195 = null;
        }
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg2 * var7 + arg5[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class289(arg3, arg2, arg0, var6);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
    public static final void method1806() {
        for (int var0 = 0; var0 < class295.field4506; var0++) {
            class389 var1 = class308.field4643[var0];
            class216.method1497(var1);
            class308.field4643[var0] = null;
        }
        class295.field4506 = 0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILah;)Z")
    public static final boolean method1807(int arg0, int arg1, class263 arg2) {
        field4196++;
        int var3 = arg2.method1760(2, true);
        if (var3 == 0) {
            if (arg2.method1760(1, true) != 0) {
                method1807(6, arg1, arg2);
            }
            int var4 = arg2.method1760(6, true);
            int var5 = arg2.method1760(6, true);
            boolean var6 = arg2.method1760(1, true) == 1;
            if (var6) {
                class210.field3437[class219.field3588++] = arg1;
            }
            if (class26.field319[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class443 var7 = class131.field2005[arg1];
            class177 var8 = class26.field319[arg1] = new class177();
            var8.field1881 = arg1;
            if (class6.field69[arg1] != null) {
                var8.method1187((byte) -86, class6.field69[arg1]);
            }
            var8.method952(-443277064, var7.field6509);
            var8.field1968 = var7.field6512;
            int var9 = var7.field6513;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            var8.field2639 = var7.field6515;
            int var12 = var9 & 0xFF;
            var8.field1984[0] = class524.field7667[arg1];
            var8.field5826 = (byte) var10;
            var8.method1184(true, (var12 << 6) + var5 - class176.field2613, (var11 << 6) + var4 + -class390.field5842);
            var8.field2677 = false;
            class131.field2005[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg2.method1760(2, true);
            int var14 = class131.field2005[arg1].field6513;
            class131.field2005[arg1].field6513 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method1760(5, true);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class131.field2005[arg1].field6513;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FE878) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var20++;
                var21--;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class131.field2005[arg1].field6513 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg2.method1760(18, true);
            if (arg0 != 6) {
                return false;
            }
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = var22 & 0xFF;
            int var26 = class131.field2005[arg1].field6513;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class131.field2005[arg1].field6513 = (var27 << 28) - (-(var28 << 14) - var29);
            return false;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method1808(byte arg0) {
        class383 var1 = (class383) class18.field226.method1004((byte) -114);
        if (arg0 != 55) {
            return;
        }
        while (var1 != null) {
            if (client.field3311 == null) {
                var1.method2677(-22491);
            } else if (var1.field5769 <= class475.field6854) {
                int var14 = class514.field7472[var1.field5753];
                if (var14 == 0) {
                    class312 var21 = class85.method713(var1.field5768, var1.field5754, var1.field5756);
                    if (var21 instanceof class261) {
                        class153.method1051(var1.field5768, var1.field5754, var1.field5756);
                        class261 var22 = (class261) var21;
                        if (var22.field4003 != null) {
                            class81.method683(var1.field5768, var1.field5754, var1.field5756, var22.field4003, null);
                        }
                    }
                } else if (var14 == 1) {
                    class168 var19 = class188.method1263(var1.field5768, var1.field5754, var1.field5756);
                    if (var19 instanceof class165) {
                        class286.method1847(var1.field5768, var1.field5754, var1.field5756);
                        class165 var20 = (class165) var19;
                        if (var20.field2426 != null) {
                            class10.method72(var1.field5768, var1.field5754, var1.field5756, var20.field2426, null);
                        }
                    }
                } else if (var14 == 2) {
                    class389 var17 = class154.method1057(var1.field5768, var1.field5754, var1.field5756, field4199 == null ? (field4199 = method1810("ig")) : field4199);
                    if (var17 instanceof class132) {
                        class240.method1651(var1.field5768, var1.field5754, var1.field5756, field4199 == null ? (field4199 = method1810("ig")) : field4199);
                        class132 var18 = (class132) var17;
                        if (var18.field2028 != null) {
                            class495.method2940(var18.field2028, false);
                        }
                    }
                } else if (var14 == 3) {
                    class171 var15 = class446.method2736(var1.field5768, var1.field5754, var1.field5756);
                    if (var15 instanceof class202) {
                        class178.method1193(var1.field5768, var1.field5754, var1.field5756);
                        class202 var16 = (class202) var15;
                        if (var16.field3355 != null) {
                            class379.method2382(var1.field5768, var1.field5754, var1.field5756, var16.field3355);
                        }
                    }
                }
                var1.method2677(-22491);
            } else if (class475.field6854 == var1.field5755) {
                int var2 = class514.field7472[var1.field5753];
                if (var2 == 0) {
                    class312 var3 = class85.method713(var1.field5768, var1.field5754, var1.field5756);
                    if (var3 instanceof class261) {
                        var1.method2677(-22491);
                    } else if (class268.method1779(var1.field5768, var1.field5754, var1.field5756) == null) {
                        class261 var4 = new class261(var1.field5753, var1.field5762, var1.field5764, var1.field5758, var1.field5765, var3);
                        class81.method683(var1.field5768, var1.field5754, var1.field5756, var4, null);
                    } else {
                        var1.method2677(arg0 ^ 0xFFFFA812);
                    }
                } else if (var2 == 1) {
                    class168 var12 = class188.method1263(var1.field5768, var1.field5754, var1.field5756);
                    if (var12 instanceof class165) {
                        var1.method2677(-22491);
                    } else if (class393.method2473(var1.field5768, var1.field5754, var1.field5756) == null) {
                        class165 var13 = new class165(var1.field5753, var1.field5762, var1.field5764, var1.field5758, var1.field5765, var12);
                        class10.method72(var1.field5768, var1.field5754, var1.field5756, var13, null);
                    } else {
                        var1.method2677(arg0 ^ 0xFFFFA812);
                    }
                } else if (var2 == 2) {
                    class389 var7 = class154.method1057(var1.field5768, var1.field5754, var1.field5756, field4199 == null ? (field4199 = method1810("ig")) : field4199);
                    if (var7 instanceof class132) {
                        var1.method2677(-22491);
                    } else {
                        class240.method1651(var1.field5768, var1.field5754, var1.field5756, field4199 == null ? (field4199 = method1810("ig")) : field4199);
                        class69 var8 = class510.field7458.method2973(arg0 ^ 0xFFFFFFB1, var1.field5763);
                        int var9;
                        int var10;
                        if (var1.field5762 == 1 || var1.field5762 == 3) {
                            var10 = var8.field927;
                            var9 = var8.field941;
                        } else {
                            var9 = var8.field927;
                            var10 = var8.field941;
                        }
                        class132 var11 = new class132(var1.field5753, var1.field5762, var1.field5768, var1.field5764, var1.field5758, var1.field5765, var1.field5754, var10 + var1.field5754 - 1, var1.field5756, var1.field5756 + var9 - 1, var7);
                        class495.method2940(var11, false);
                    }
                } else if (var2 == 3) {
                    class171 var5 = class446.method2736(var1.field5768, var1.field5754, var1.field5756);
                    if (var5 instanceof class202) {
                        var1.method2677(arg0 - 22546);
                    } else {
                        class202 var6 = new class202(var1.field5764, var1.field5758, var1.field5765, var5);
                        class379.method2382(var1.field5768, var1.field5754, var1.field5756, var6);
                    }
                }
            }
            var1 = (class383) class18.field226.method996(arg0 - 54);
        }
        field4197++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1809(int arg0) {
        field4195 = null;
        if (arg0 != -1540863314) {
            field4195 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1810(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
