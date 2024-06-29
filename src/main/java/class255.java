import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class255 {

    @OriginalMember(owner = "client!at", name = "e", descriptor = "Lff;")
    private class9 field3537 = new class9(128);

    @OriginalMember(owner = "client!at", name = "a", descriptor = "Lvh;")
    private class240 field3533;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "Ljm;")
    public static class485 field3536 = new class485(26, 3);

    @OriginalMember(owner = "client!at", name = "f", descriptor = "Luf;")
    public static class310 field3538 = new class310(49, 0);

    @OriginalMember(owner = "client!at", name = "g", descriptor = "Lhp;")
    public static class214 field3539 = new class214(14, 1);

    @OriginalMember(owner = "client!at", name = "h", descriptor = "Lhp;")
    public static class214 field3540 = new class214(15, 4);

    @OriginalMember(owner = "client!at", name = "i", descriptor = "Lhp;")
    public static class214 field3541 = new class214(16, -2);

    @OriginalMember(owner = "client!at", name = "j", descriptor = "Lhp;")
    public static class214 field3542 = new class214(17, 0);

    @OriginalMember(owner = "client!at", name = "k", descriptor = "Lhp;")
    public static class214 field3543 = new class214(18, -2);

    @OriginalMember(owner = "client!at", name = "l", descriptor = "Lhp;")
    public static class214 field3544 = new class214(20, 6);

    @OriginalMember(owner = "client!at", name = "m", descriptor = "Lhp;")
    public static class214 field3545 = new class214(21, 8);

    @OriginalMember(owner = "client!at", name = "n", descriptor = "Lhp;")
    public static class214 field3546 = new class214(22, -2);

    @OriginalMember(owner = "client!at", name = "o", descriptor = "Lhp;")
    public static class214 field3547 = new class214(23, 4);

    @OriginalMember(owner = "client!at", name = "p", descriptor = "Lhp;")
    public static class214 field3548 = new class214(24, -1);

    @OriginalMember(owner = "client!at", name = "q", descriptor = "[Lhp;")
    private static class214[] field3549 = new class214[32];

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method1496(int arg0) {
        field3545 = null;
        field3543 = null;
        field3548 = null;
        field3542 = null;
        field3541 = null;
        field3540 = null;
        field3539 = null;
        field3546 = null;
        if (arg0 != 1) {
            field3545 = null;
        }
        field3544 = null;
        field3538 = null;
        field3547 = null;
        field3536 = null;
        field3549 = null;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Lda;")
    public final class42 method1497(int arg0, int arg1) {
        if (arg1 != 507131584) {
            field3539 = null;
        }
        field3534++;
        class9 var3 = this.field3537;
        class42 var4;
        synchronized (this.field3537) {
            var4 = (class42) this.field3537.method56((long) arg0, arg1 - 507131463);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3533.method1411(true, class241.method1423(arg0, 127), class501.method2953(arg0, arg1 - 507131577));
        class42 var6 = new class42();
        if (var5 != null) {
            var6.method262(-6, new class365(var5));
        }
        class9 var7 = this.field3537;
        synchronized (this.field3537) {
            this.field3537.method73((long) arg0, var6, arg1 ^ 0x1E3A51F9);
            return var6;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1498(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3535++;
        if (class385.field5410 == null) {
            class418.field6109.method1006(arg1, -16777216, arg4, arg0, 1, arg3);
        } else if (class75.field1089.field466 >= 0 && (class442.field6435 * 128) > class75.field1089.field466 && class75.field1089.field461 >= 0 && class75.field1089.field461 < class232.field3217 * 128) {
            class87.field1195++;
            if (class75.field1089 != null && class75.field1089.field466 - (class75.field1089.method167(-1) - 1) * 64 >> 7 == class285.field3824 && (class75.field1089.field461 + 64 - class75.field1089.method167(-1) * 64 >> 7) == class473.field6909) {
                class473.field6909 = -1;
                class285.field3824 = -1;
                class352.method1947(109);
            }
            class463.method2724(-108);
            if (!arg5) {
                class421.method2518(-1);
            }
            class482.method2848(2);
            class336.method1864(2, arg1, true, arg3, arg0, arg4);
            int var6 = class476.field6964;
            int var7 = class151.field2129;
            int var8 = class228.field3189;
            int var9 = class125.field1712;
            if (class128.field1742 == 1) {
                int var12 = (int) class510.field7495;
                if (class277.field3741 >> 8 > var12) {
                    var12 = class277.field3741 >> 8;
                }
                if (class223.field3131[4] && var12 < (class384.field5403[4] + 128)) {
                    var12 = class384.field5403[4] + 128;
                }
                int var13 = (int) class40.field553 + class65.field893 & 0x3FFF;
                class159.method985(class186.method1118(class75.field1089.field466, class75.field1089.field461, 12840, class400.field5571) - 50, (var12 >> 3) * 3 + 600 << 0, class67.field934, class254.field3530, var6, var12, var13, 16384);
            } else if (class128.field1742 == 4) {
                int var10 = (int) class510.field7495;
                if ((class277.field3741 >> 8) > var10) {
                    var10 = class277.field3741 >> 8;
                }
                if (class223.field3131[4] && class384.field5403[4] + 128 > var10) {
                    var10 = class384.field5403[4] + 128;
                }
                int var11 = (int) class40.field553 & 0x3FFF;
                class159.method985(class186.method1118(class127.field1740, class509.field7470, 12840, class400.field5571) - 50, 600 - -((var10 >> 3) * 3) << 0, class67.field934, class254.field3530, var6, var10, var11, 16384);
            } else if (class128.field1742 == 5) {
                class251.method1479(128, var6);
            }
            if (arg2 < -70) {
                int var14 = class132.field1901;
                int var15 = class526.field7729;
                int var16 = class310.field4240;
                int var17 = class476.field6958;
                int var18 = class208.field2951;
                for (int var19 = 0; var19 < 5; var19++) {
                    if (class223.field3131[var19]) {
                        int var22 = (int) ((double) (-class61.field813[var19]) + Math.random() * (double) (class61.field813[var19] * 2 + 1) + Math.sin((double) class325.field4464[var19] / 100.0D * (double) class423.field6171[var19]) * (double) class384.field5403[var19]);
                        if (var19 == 3) {
                            class208.field2951 = class208.field2951 + var22 & 0x3FFF;
                        }
                        if (var19 == 1) {
                            class526.field7729 += var22;
                        }
                        if (var19 == 0) {
                            class132.field1901 += var22;
                        }
                        if (var19 == 4) {
                            class476.field6958 += var22;
                            if (class476.field6958 < 1024) {
                                class476.field6958 = 1024;
                            } else if (class476.field6958 > 3072) {
                                class476.field6958 = 3072;
                            }
                        }
                        if (var19 == 2) {
                            class310.field4240 += var22;
                        }
                    }
                }
                if (class132.field1901 < 0) {
                    class132.field1901 = 0;
                }
                if (class132.field1901 > ((class469.field6860 << 7) - 1)) {
                    class132.field1901 = (class469.field6860 << 7) - 1;
                }
                if (class310.field4240 < 0) {
                    class310.field4240 = 0;
                }
                if (class310.field4240 > ((class472.field6900 << 7) - 1)) {
                    class310.field4240 = (class472.field6900 << 7) - 1;
                }
                class403.method2334(0);
                class382.method2195(126);
                class418.field6109.method462(var7, var8, var7 + var9, var6 + var8);
                class418.field6109.method446();
                int var20 = class378.field5319;
                if (class325.field4462 == null) {
                    class418.field6109.method532(var20);
                } else {
                    class325.field4462.method2187(class208.field2951, var8, var20, var6, 0, class476.field6958, class418.field6109, var9, var7, class21.field267 << 3);
                }
                class503.method2959(false);
                class500.field7351.method341(class132.field1901, class526.field7729, class310.field4240, -class476.field6958 & 0x3FFF, -class208.field2951 & 0x3FFF, -class250.field3483 & 0x3FFF);
                class418.field6109.method437(class500.field7351);
                class418.field6109.method467(var9 / 2 + var7, var6 / 2 + var8, class366.field5140 << 1, class366.field5140 << 1);
                class379.method2185(class366.field5140 << 1, class366.field5140 << 1, var6 / 2 + var8, (byte) -110, var7 + (var9 / 2));
                class177.method1084(class132.field1901, -class208.field2951 & 0x3FFF, true, class526.field7729, class310.field4240, -class250.field3483 & 0x3FFF, -class476.field6958 & 0x3FFF);
                byte var21 = class437.field6374.method562(3, class278.field3761) == 2 ? (byte) class87.field1195 : 1;
                class51.method316(class418.field6109, class393.field5484, class196.field2807, class500.field7351, class132.field1901, class526.field7729, class310.field4240, class99.field1369, class517.field7595, class207.field2940, class504.field7415, class308.field4227, class289.field3887, class75.field1089.field464 + 1, var21, class75.field1089.field466 >> 7, class75.field1089.field461 >> 7, !class437.field6374.field4260);
                class503.method2959(false);
                if (class137.field1958 == 30) {
                    class339.method1887(var7, var9, var6, (byte) -113, 256, 256, var8);
                    class400.method2321(256, var6, var9, var7, var8, true, 256);
                    class370.method2141(var9, var8, 256, var7, -28875, var6, 256);
                    class503.method2958(var8, var9, (byte) -32, var7, var6);
                }
                class97.method655();
                class310.field4240 = var16;
                class476.field6958 = var17;
                class132.field1901 = var14;
                class526.field7729 = var15;
                class208.field2951 = var18;
                if (class251.field3489 && class119.field1625.method2549(false) == 0) {
                    class251.field3489 = false;
                }
                if (class251.field3489) {
                    class418.field6109.method1006(var7, -16777216, var8, var6, 1, var9);
                    class186.method1119(class117.field1579, class272.field3708.method590(class105.field1434, -22602), 0, false);
                }
            }
        } else {
            class418.field6109.method1006(arg1, -16777216, arg4, arg0, 1, arg3);
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Llf;ILvh;)V")
    public class255(class157 arg0, int arg1, class240 arg2) {
        this.field3533 = arg2;
        if (this.field3533 != null) {
            int var4 = this.field3533.method1410(0) - 1;
            this.field3533.method1397((byte) 0, var4);
        }
    }

    static {
        class214[] var0 = class188.method1125(0);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3549[var0[var1].field3043] = var0[var1];
        }
    }
}
