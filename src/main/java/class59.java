import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class59 {

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljn;")
    private class117 field866 = new class117(16);

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lvo;")
    private class345 field873;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Leda;")
    public static class116 field863 = new class116(22, 3);

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 3)
    public final void method502(byte arg0) {
        field865++;
        class117 var2 = this.field866;
        synchronized (this.field866) {
            if (arg0 == 73) {
                this.field866.method950((byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)I", line = 18)
    public static final int method503(byte arg0, int arg1, int arg2) {
        if (arg0 < 51) {
            method508(true);
        }
        field871++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIILjava/lang/String;III)V", line = 41)
    public static final void method504(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field868++;
        class211 var8 = new class211();
        var8.field3231 = arg4;
        var8.field3221 = arg0;
        var8.field3225 = arg1;
        var8.field3224 = arg3;
        var8.field3222 = class148.field2508 + arg5;
        if (arg7 >= -123) {
            method506(122);
        }
        var8.field3226 = arg6;
        var8.field3230 = arg2;
        class539.field7921.method3307(0, var8);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lwi;", line = 61)
    public final class455 method505(int arg0, int arg1) {
        field867++;
        class117 var3 = this.field866;
        class455 var4;
        synchronized (this.field866) {
            var4 = (class455) this.field866.method941((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field873;
        byte[] var6;
        synchronized (this.field873) {
            var6 = this.field873.method2081(127, arg0, arg1);
        }
        class455 var7 = new class455();
        if (var6 != null) {
            var7.method2642(new class465(var6), (byte) -123);
        }
        class117 var8 = this.field866;
        synchronized (this.field866) {
            this.field866.method949((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 89)
    public static void method506(int arg0) {
        if (arg0 == -8993) {
            field863 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)V", line = 104)
    public final void method507(byte arg0, int arg1) {
        class117 var3 = this.field866;
        synchronized (this.field866) {
            if (arg0 != -43) {
                this.field866 = null;
            }
            this.field866.method939(28093, arg1);
        }
        field864++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V", line = 118)
    public static final void method508(boolean arg0) {
        field872++;
        if (arg0) {
            method508(false);
        }
        while (class376.field5209.method2223(false, class99.field1481) >= 15) {
            int var1 = class376.field5209.method2231(15, 104);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class6 var3 = (class6) class314.field4359.method2818(-22803, (long) var1);
            if (var3 == null) {
                class88 var4 = new class88();
                var4.field2427 = var1;
                var3 = new class6(var4);
                class314.field4359.method2816(var3, (long) var1, false);
                class82.field1259[class392.field5702++] = var3;
                var2 = true;
            }
            class88 var5 = var3.field49;
            class253.field3667[class310.field4304++] = var1;
            var5.field2431 = class148.field2508;
            if (var5.field1309 != null && var5.field1309.method3113((byte) 126)) {
                class295.method1808(var5, -24290);
            }
            var5.method661(!arg0, class564.field8259.method3743(class376.field5209.method2231(14, 121), true));
            int var6 = class376.field5209.method2231(2, -99);
            int var7 = class376.field5209.method2231(1, -35);
            if (var7 == 1) {
                class694.field9858[class550.field8070++] = var1;
            }
            int var8 = class376.field5209.method2231(5, 118);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = class376.field5209.method2231(5, 124);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = class376.field5209.method2231(1, 88);
            int var11 = class376.field5209.method2231(3, 87) + 4 << 11 & 0x3B4E;
            var5.method1103(730377038, var5.field1309.field7726);
            var5.field2426 = var5.field1309.field7771 << 3;
            if (var2) {
                var5.method1109(true, var11, (byte) 97);
            }
            var5.method659(6, var5.method1108(98), var10 == 1, class103.field1708.field2459[0] + var8, var6, class103.field1708.field2454[0] + var9);
            if (var5.field1309.method3113((byte) -118)) {
                class531.method3125(var5, null, var5.field3158, 2, var5.field2459[0], var5.field2454[0], 0, null);
            }
        }
        class376.field5209.method2228(113);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V", line = 201)
    public final void method509(byte arg0) {
        class117 var2 = this.field866;
        synchronized (this.field866) {
            this.field866.method936(-102);
            if (arg0 > -77) {
                this.method505(12, 75);
            }
        }
        field869++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lr;BLpi;I)V", line = 214)
    public static final void method510(class98 arg0, byte arg1, class302 arg2, int arg3) {
        field870++;
        if (class396.field5728 != null && arg3 <= arg2.field4231) {
            for (int var4 = 0; var4 < class396.field5728.length; var4++) {
                if (class396.field5728[var4] != -1000000 && (class396.field5728[var4] >= arg2.field4226[0] || arg2.field4226[1] <= class396.field5728[var4] || class396.field5728[var4] >= arg2.field4226[2] || class396.field5728[var4] >= arg2.field4226[3]) && (class91.field1341[var4] >= arg2.field4239[0] || arg2.field4239[1] <= class91.field1341[var4] || class91.field1341[var4] >= arg2.field4239[2] || arg2.field4239[3] <= class91.field1341[var4]) && (class353.field4951[var4] <= arg2.field4239[0] || arg2.field4239[1] >= class353.field4951[var4] || arg2.field4239[2] >= class353.field4951[var4] || class353.field4951[var4] <= arg2.field4239[3]) && (class465.field6726[var4] >= arg2.field4238[0] || arg2.field4238[1] <= class465.field6726[var4] || arg2.field4238[2] <= class465.field6726[var4] || class465.field6726[var4] >= arg2.field4238[3]) && (class155.field2553[var4] <= arg2.field4238[0] || class155.field2553[var4] <= arg2.field4238[1] || arg2.field4238[2] >= class155.field2553[var4] || class155.field2553[var4] <= arg2.field4238[3])) {
                    return;
                }
            }
        }
        if (arg2.field4227 == 1) {
            int var5 = class668.field9389 + arg2.field4233 - class371.field5135;
            if (var5 >= 0 && (class668.field9389 + class668.field9389) >= var5) {
                int var6 = class668.field9389 + arg2.field4234 - class22.field303;
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > class668.field9389 + class668.field9389) {
                    return;
                }
                int var7 = arg2.field4232 - (class22.field303 - class668.field9389);
                if (class668.field9389 + class668.field9389 < var7) {
                    var7 = class668.field9389 + class668.field9389;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class678.field9661[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class311.field4314 - arg2.field4239[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!((float) class82.field1262 > var9) && class254.method1620((byte) 42, arg2, 0) && class254.method1620((byte) 42, arg2, 1) && class254.method1620((byte) 42, arg2, 2) && class254.method1620((byte) 42, arg2, 3)) {
                        class596.field8630[class550.field8071++] = arg2;
                    }
                }
            }
        } else if (arg1 > 27) {
            if (arg2.field4227 == 2) {
                int var10 = arg2.field4234 + class668.field9389 - class22.field303;
                if (var10 >= 0 && (class668.field9389 + class668.field9389) >= var10) {
                    int var11 = arg2.field4233 + class668.field9389 - class371.field5135;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > class668.field9389 + class668.field9389) {
                        return;
                    }
                    int var12 = class668.field9389 + arg2.field4228 - class371.field5135;
                    if (var12 > class668.field9389 + class668.field9389) {
                        var12 = class668.field9389 + class668.field9389;
                    } else if (var12 < 0) {
                        return;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class678.field9661[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        float var14 = (float) (class475.field6813 - arg2.field4238[0]);
                        if (var14 < 0.0F) {
                            var14 *= -1.0F;
                        }
                        if (!(var14 < (float) class82.field1262) && class254.method1620((byte) 42, arg2, 0) && class254.method1620((byte) 42, arg2, 1) && class254.method1620((byte) 42, arg2, 2) && class254.method1620((byte) 42, arg2, 3)) {
                            class596.field8630[class550.field8071++] = arg2;
                        }
                    }
                }
            } else if (arg2.field4227 == 16 || arg2.field4227 == 8) {
                int var23 = class668.field9389 + arg2.field4233 - class371.field5135;
                if (var23 >= 0 && (class668.field9389 + class668.field9389) >= var23) {
                    int var24 = class668.field9389 + arg2.field4234 - class22.field303;
                    if (var24 >= 0 && var24 <= class668.field9389 + class668.field9389 && class678.field9661[var23][var24]) {
                        float var25 = (float) (class311.field4314 - arg2.field4239[0]);
                        if (var25 < 0.0F) {
                            var25 *= -1.0F;
                        }
                        float var26 = (float) (class475.field6813 - arg2.field4238[0]);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        if (!((float) class82.field1262 > var25) || !((float) class82.field1262 > var26) && class254.method1620((byte) 42, arg2, 0) && class254.method1620((byte) 42, arg2, 1) && class254.method1620((byte) 42, arg2, 2) && class254.method1620((byte) 42, arg2, 3)) {
                            class596.field8630[class550.field8071++] = arg2;
                        }
                    }
                }
            } else if (arg2.field4227 == 4) {
                float var15 = (float) (arg2.field4226[0] - class88.field1321);
                if (!(var15 <= (float) class375.field5203)) {
                    int var16 = arg2.field4234 - (class22.field303 - class668.field9389);
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (class668.field9389 + class668.field9389 < var16) {
                        return;
                    }
                    int var17 = class668.field9389 + arg2.field4232 - class22.field303;
                    if (var17 > class668.field9389 + class668.field9389) {
                        var17 = class668.field9389 + class668.field9389;
                    } else if (var17 < 0) {
                        return;
                    }
                    int var18 = arg2.field4233 + class668.field9389 - class371.field5135;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > class668.field9389 + class668.field9389) {
                        return;
                    }
                    int var19 = arg2.field4228 + class668.field9389 - class371.field5135;
                    if (var19 > class668.field9389 + class668.field9389) {
                        var19 = class668.field9389 + class668.field9389;
                    } else if (var19 < 0) {
                        return;
                    }
                    boolean var20 = false;
                    label294: for (int var21 = var18; var21 <= var19; var21++) {
                        for (int var22 = var16; var22 <= var17; var22++) {
                            if (class678.field9661[var21][var22]) {
                                var20 = true;
                                break label294;
                            }
                        }
                    }
                    if (var20 && class254.method1620((byte) 42, arg2, 0) && class254.method1620((byte) 42, arg2, 1) && class254.method1620((byte) 42, arg2, 2) && class254.method1620((byte) 42, arg2, 3)) {
                        class596.field8630[class550.field8071++] = arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lgn;ILvo;)V", line = 554)
    public class59(class529 arg0, int arg1, class345 arg2) {
        this.field873 = arg2;
        this.field873.method2098(0, 30);
    }
}
