import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class382 extends class103 {

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Liu;")
    public static class517 field5683 = new class517(86, -2);

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "Lpp;")
    public static class464 field5686 = new class464(16, 6);

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public int field5678;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field5680;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public int field5684;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Z")
    public boolean field5675;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BZILqa;IILcea;)V", line = 7)
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        field5677++;
        if (arg0 == -84) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V", line = 20)
    public final void method867(int arg0) {
        if (arg0 <= 12) {
            method2330();
        }
        field5681++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZB)V", line = 34)
    public static final void method2327(boolean arg0, byte arg1) {
        if (arg0 && class212.field3093 != null) {
            class109.field1823 = class212.field3093.field9376;
        } else {
            class109.field1823 = -1;
        }
        field5682++;
        class210.field2970 = 0;
        class212.field3093 = null;
        class276.field4034 = null;
        class97.field1694 = null;
        class212.method1428();
        class212.field3106.method425(-38);
        class340.field4888 = null;
        class270.field3977 = null;
        class378.field5562 = -1;
        class333.field4786 = null;
        if (arg1 < 77) {
            return;
        }
        class205.field2887 = null;
        class318.field4620 = null;
        class626.field8830 = null;
        class212.field3105 = null;
        class496.field6956 = null;
        class469.field6762 = -1;
        class512.field7091 = null;
        class471.field6773 = null;
        if (class212.field3095 != null) {
            class212.field3095.method69(false);
            class212.field3095.method67(128, 128, 64);
        }
        if (class212.field3091 != null) {
            class212.field3091.method2559(-127, 64, 64);
        }
        if (class212.field3096 != null) {
            class212.field3096.method2882(-4893, 64);
        }
        class17.field257.method2697(36, 64);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)Z", line = 83)
    public final boolean method868(boolean arg0) {
        if (arg0) {
            method2327(true, (byte) 78);
        }
        field5676++;
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 100)
    public static void method2328(byte arg0) {
        field5683 = null;
        field5686 = null;
        if (arg0 != 51) {
            field5686 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)V", line = 111)
    public static final void method2329(boolean arg0) {
        class134.method1030(class202.field2854.field7916, 22050, 2, false);
        field5685++;
        class483.field6849 = new class16();
        class483.field6849.method166(128, 9, (byte) 30);
        class127.field2087 = class407.method2473(22050, 0, class270.field3976, class474.field6795, 16384);
        class127.field2087.method2072((byte) -75, class483.field6849);
        class184.method1235(class523.field7265, class366.field5196, 29819, class539.field7506, class483.field6849);
        class384.field5706 = class407.method2473(2048, 1, class270.field3976, class474.field6795, 16384);
        if (!arg0) {
            method2330();
        }
        class35.field485 = new class9();
        class384.field5706.method2072((byte) -75, class35.field485);
        class304.field4387 = new class275(22050, class604.field8591);
        class567.field8100 = class115.field1890.method3195(0, "scape main");
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()V", line = 138)
    public static final void method2330() {
        class168.field2451 = 0;
        label212: for (int var0 = 0; var0 < class546.field7593; var0++) {
            class314 var1 = class350.field5012[var0];
            if (class218.field3288 != null) {
                for (int var2 = 0; var2 < class218.field3288.length; var2++) {
                    if (class218.field3288[var2] != -1000000 && (var1.field4582 <= class218.field3288[var2] || var1.field4583 <= class218.field3288[var2]) && (var1.field4574 <= class602.field8572[var2] || var1.field4580 <= class602.field8572[var2]) && (var1.field4574 >= class457.field6593[var2] || var1.field4580 >= class457.field6593[var2]) && (var1.field4578 <= class499.field7002[var2] || var1.field4575 <= class499.field7002[var2]) && (var1.field4578 >= class111.field1846[var2] || var1.field4575 >= class111.field1846[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field4572 == 1) {
                int var3 = var1.field4588 + class90.field1610 - class119.field1913;
                if (var3 >= 0 && var3 <= class90.field1610 + class90.field1610) {
                    int var4 = var1.field4587 + class90.field1610 - class389.field5811;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class90.field1610 + class90.field1610) {
                        continue;
                    }
                    int var5 = var1.field4581 + class90.field1610 - class389.field5811;
                    if (var5 > class90.field1610 + class90.field1610) {
                        var5 = class90.field1610 + class90.field1610;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class183.field2645[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class307.field4422 - var1.field4574;
                        if (var7 > class214.field3240) {
                            var1.field4584 = 1;
                        } else {
                            if (var7 >= -class214.field3240) {
                                continue;
                            }
                            var1.field4584 = 2;
                            var7 = -var7;
                        }
                        var1.field4590 = (var1.field4578 - class358.field5090 << 8) / var7;
                        var1.field4573 = (var1.field4575 - class358.field5090 << 8) / var7;
                        var1.field4593 = (var1.field4582 - class319.field4630 << 8) / var7;
                        var1.field4594 = (var1.field4583 - class319.field4630 << 8) / var7;
                        class54.field781[class168.field2451++] = var1;
                    }
                }
            } else if (var1.field4572 == 2) {
                int var8 = var1.field4587 + class90.field1610 - class389.field5811;
                if (var8 >= 0 && var8 <= class90.field1610 + class90.field1610) {
                    int var9 = var1.field4588 + class90.field1610 - class119.field1913;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class90.field1610 + class90.field1610) {
                        continue;
                    }
                    int var10 = var1.field4592 + class90.field1610 - class119.field1913;
                    if (var10 > class90.field1610 + class90.field1610) {
                        var10 = class90.field1610 + class90.field1610;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class183.field2645[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class358.field5090 - var1.field4578;
                        if (var12 > class214.field3240) {
                            var1.field4584 = 3;
                        } else {
                            if (var12 >= -class214.field3240) {
                                continue;
                            }
                            var1.field4584 = 4;
                            var12 = -var12;
                        }
                        var1.field4589 = (var1.field4574 - class307.field4422 << 8) / var12;
                        var1.field4586 = (var1.field4580 - class307.field4422 << 8) / var12;
                        var1.field4593 = (var1.field4582 - class319.field4630 << 8) / var12;
                        var1.field4594 = (var1.field4583 - class319.field4630 << 8) / var12;
                        class54.field781[class168.field2451++] = var1;
                    }
                }
            } else if (var1.field4572 == 4) {
                int var13 = var1.field4582 - class319.field4630;
                if (var13 > class619.field8736) {
                    int var14 = var1.field4587 + class90.field1610 - class389.field5811;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class90.field1610 + class90.field1610) {
                        continue;
                    }
                    int var15 = var1.field4581 + class90.field1610 - class389.field5811;
                    if (var15 > class90.field1610 + class90.field1610) {
                        var15 = class90.field1610 + class90.field1610;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field4588 + class90.field1610 - class119.field1913;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class90.field1610 + class90.field1610) {
                        continue;
                    }
                    int var17 = var1.field4592 + class90.field1610 - class119.field1913;
                    if (var17 > class90.field1610 + class90.field1610) {
                        var17 = class90.field1610 + class90.field1610;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class183.field2645[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field4584 = 5;
                        var1.field4589 = (var1.field4574 - class307.field4422 << 8) / var13;
                        var1.field4586 = (var1.field4580 - class307.field4422 << 8) / var13;
                        var1.field4590 = (var1.field4578 - class358.field5090 << 8) / var13;
                        var1.field4573 = (var1.field4575 - class358.field5090 << 8) / var13;
                        class54.field781[class168.field2451++] = var1;
                    }
                }
            }
        }
    }
}
