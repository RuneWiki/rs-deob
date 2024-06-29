import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class317 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field4358 = 0;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Ldb;")
    public static class298 field4361;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field4363;

    static {
        new class73("", 76);
        field4361 = new class298(83, 5);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLtga;)Z", line = 4)
    public static final boolean method1886(byte arg0, class54 arg1) {
        int var2 = 47 % ((16 - arg0) / 33);
        field4362++;
        return class646.field8662 == arg1 || class229.field3207 == arg1 || class677.field9568 == arg1 || class445.field6093 == arg1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 17)
    public static void method1887(byte arg0) {
        if (arg0 < -84) {
            field4361 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILsda;)V", line = 32)
    public static final void method1888(int arg0, class240 arg1) {
        if (arg1.field3370 != null) {
            arg1.field3370.field7799 = 0;
        }
        arg1.field3373 = false;
        field4357++;
        for (class240 var2 = arg1.method165(); var2 != null; var2 = arg1.method156()) {
            method1888(1, var2);
        }
        if (arg0 != 1) {
            field4361 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lvj;I)V", line = 55)
    public static final void method1889(class411 arg0, int arg1) {
        field4360++;
        arg0.field5596 = 0;
        if (arg0.field5584 != -1) {
            class616 var2 = class636.field8570.method231(arg0.field5584, -11764);
            if (var2 == null || var2.field8160 == null) {
                arg0.field5584 = -1;
                arg0.field5609 = false;
            } else {
                label399: {
                    arg0.field5628++;
                    if (var2.field8160.length > arg0.field5619 && var2.field8163[arg0.field5619] < arg0.field5628) {
                        arg0.field5577++;
                        arg0.field5619++;
                        arg0.field5628 = 1;
                        class373.method2199(arg0.field8609, arg0.field8620, (byte) 91, arg0.field8612, arg0.field5619, var2, class199.field2897 == arg0);
                    }
                    if (arg0.field5619 >= var2.field8160.length) {
                        arg0.field5619 = 0;
                        arg0.field5628 = 0;
                        if (arg0.field5609) {
                            arg0.field5584 = arg0.method2353(-1).method3002((byte) -57);
                            if (arg0.field5584 == -1) {
                                arg0.field5609 = false;
                                break label399;
                            }
                            var2 = class636.field8570.method231(arg0.field5584, -11764);
                        }
                        class373.method2199(arg0.field8609, arg0.field8620, (byte) 93, arg0.field8612, arg0.field5619, var2, class199.field2897 == arg0);
                    }
                    arg0.field5577 = arg0.field5619 + 1;
                    if (arg0.field5577 >= var2.field8160.length) {
                        arg0.field5577 = 0;
                    }
                }
            }
        }
        if (arg0.field5602 != arg1 && class642.field8626 >= arg0.field5615) {
            class580 var3 = class120.field2028.method3725(arg0.field5602, (byte) 30);
            int var4 = var3.field7723;
            if (var4 == -1) {
                arg0.field5602 = -1;
            } else {
                label401: {
                    class616 var5 = class636.field8570.method231(var4, arg1 ^ 0x2DF3);
                    if (var3.field7701) {
                        if (var5.field8167 == 3) {
                            if (arg0.field5641 > 0 && arg0.field5548 <= class642.field8626 && class642.field8626 > arg0.field5610) {
                                arg0.field5602 = -1;
                                break label401;
                            }
                        } else if (var5.field8167 == 1 && arg0.field5641 > 0 && arg0.field5548 <= class642.field8626 && class642.field8626 > arg0.field5610) {
                            arg0.field5615 = class642.field8626 + 1;
                            break label401;
                        }
                    }
                    if (var5 == null || var5.field8160 == null) {
                        arg0.field5602 = -1;
                    } else {
                        if (arg0.field5598 < 0) {
                            arg0.field5598 = 0;
                            class373.method2199(arg0.field8609, arg0.field8620, (byte) 118, arg0.field8612, 0, var5, class199.field2897 == arg0);
                        }
                        arg0.field5572++;
                        if (arg0.field5598 < var5.field8160.length && arg0.field5572 > var5.field8163[arg0.field5598]) {
                            arg0.field5572 = 1;
                            arg0.field5598++;
                            class373.method2199(arg0.field8609, arg0.field8620, (byte) 95, arg0.field8612, arg0.field5598, var5, class199.field2897 == arg0);
                        }
                        if (arg0.field5598 >= var5.field8160.length) {
                            if (var3.field7701) {
                                arg0.field5598 -= var5.field8146;
                                arg0.field5630++;
                                if (var5.field8150 <= arg0.field5630) {
                                    arg0.field5602 = -1;
                                } else if (arg0.field5598 >= 0 && arg0.field5598 < var5.field8160.length) {
                                    class373.method2199(arg0.field8609, arg0.field8620, (byte) 106, arg0.field8612, arg0.field5598, var5, class199.field2897 == arg0);
                                } else {
                                    arg0.field5602 = -1;
                                }
                            } else {
                                arg0.field5602 = -1;
                            }
                        }
                        arg0.field5607 = arg0.field5598 + 1;
                        if (var5.field8160.length <= arg0.field5607) {
                            if (var3.field7701) {
                                arg0.field5607 -= var5.field8146;
                                if (arg0.field5630 + 1 >= var5.field8150) {
                                    arg0.field5607 = -1;
                                } else if (arg0.field5607 < 0 || arg0.field5607 >= var5.field8160.length) {
                                    arg0.field5607 = -1;
                                }
                            } else {
                                arg0.field5607 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field5631 != -1 && class642.field8626 >= arg0.field5617) {
            class580 var6 = class120.field2028.method3725(arg0.field5631, (byte) 76);
            int var7 = var6.field7723;
            if (var7 == -1) {
                arg0.field5631 = -1;
            } else {
                label404: {
                    class616 var8 = class636.field8570.method231(var7, arg1 ^ 0x2DF3);
                    if (var6.field7701) {
                        if (var8.field8167 == 3) {
                            if (arg0.field5641 > 0 && arg0.field5548 <= class642.field8626 && arg0.field5610 < class642.field8626) {
                                arg0.field5631 = -1;
                                break label404;
                            }
                        } else if (var8.field8167 == 1 && arg0.field5641 > 0 && class642.field8626 >= arg0.field5548 && arg0.field5610 < class642.field8626) {
                            arg0.field5617 = class642.field8626 + 1;
                            break label404;
                        }
                    }
                    if (var8 == null || var8.field8160 == null) {
                        arg0.field5631 = -1;
                    } else {
                        if (arg0.field5546 < 0) {
                            arg0.field5546 = 0;
                            class373.method2199(arg0.field8609, arg0.field8620, (byte) 119, arg0.field8612, 0, var8, class199.field2897 == arg0);
                        }
                        arg0.field5620++;
                        if (arg0.field5546 < var8.field8160.length && var8.field8163[arg0.field5546] < arg0.field5620) {
                            arg0.field5546++;
                            arg0.field5620 = 1;
                            class373.method2199(arg0.field8609, arg0.field8620, (byte) 103, arg0.field8612, arg0.field5546, var8, class199.field2897 == arg0);
                        }
                        if (arg0.field5546 >= var8.field8160.length) {
                            if (var6.field7701) {
                                arg0.field5557++;
                                arg0.field5546 -= var8.field8146;
                                if (var8.field8150 <= arg0.field5557) {
                                    arg0.field5631 = -1;
                                } else if (arg0.field5546 >= 0 && arg0.field5546 < var8.field8160.length) {
                                    class373.method2199(arg0.field8609, arg0.field8620, (byte) 88, arg0.field8612, arg0.field5546, var8, class199.field2897 == arg0);
                                } else {
                                    arg0.field5631 = -1;
                                }
                            } else {
                                arg0.field5631 = -1;
                            }
                        }
                        arg0.field5616 = arg0.field5546 + 1;
                        if (arg0.field5616 >= var8.field8160.length) {
                            if (var6.field7701) {
                                arg0.field5616 -= var8.field8146;
                                if (var8.field8150 <= (arg0.field5557 + 1)) {
                                    arg0.field5616 = -1;
                                } else if (arg0.field5616 < 0 || arg0.field5616 >= var8.field8160.length) {
                                    arg0.field5616 = -1;
                                }
                            } else {
                                arg0.field5616 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field5575 != -1 && arg0.field5611 <= 1) {
            class616 var9 = class636.field8570.method231(arg0.field5575, -11764);
            if (var9.field8167 == 3) {
                if (arg0.field5641 > 0 && arg0.field5548 <= class642.field8626 && arg0.field5610 < class642.field8626) {
                    arg0.field5575 = -1;
                    arg0.field5576 = null;
                }
            } else if (var9.field8167 == 1 && arg0.field5641 > 0 && arg0.field5548 <= class642.field8626 && arg0.field5610 < class642.field8626) {
                arg0.field5611 = 2;
            }
        }
        if (arg0.field5575 != -1 && arg0.field5611 == 0) {
            class616 var10 = class636.field8570.method231(arg0.field5575, -11764);
            if (var10 == null || var10.field8160 == null) {
                arg0.field5576 = null;
                arg0.field5575 = -1;
            } else {
                arg0.field5554++;
                if (arg0.field5623 < var10.field8160.length && arg0.field5554 > var10.field8163[arg0.field5623]) {
                    arg0.field5623++;
                    arg0.field5554 = 1;
                    class373.method2199(arg0.field8609, arg0.field8620, (byte) 95, arg0.field8612, arg0.field5623, var10, class199.field2897 == arg0);
                }
                if (var10.field8160.length <= arg0.field5623) {
                    arg0.field5629++;
                    arg0.field5623 -= var10.field8146;
                    if (arg0.field5629 >= var10.field8150) {
                        arg0.field5576 = null;
                        arg0.field5575 = -1;
                    } else if (arg0.field5623 >= 0 && var10.field8160.length > arg0.field5623) {
                        class373.method2199(arg0.field8609, arg0.field8620, (byte) 121, arg0.field8612, arg0.field5623, var10, class199.field2897 == arg0);
                    } else {
                        arg0.field5576 = null;
                        arg0.field5575 = -1;
                    }
                }
                arg0.field5606 = arg0.field5623 + 1;
                if (var10.field8160.length <= arg0.field5606) {
                    arg0.field5606 -= var10.field8146;
                    if (arg0.field5629 + 1 >= var10.field8150) {
                        arg0.field5606 = -1;
                    } else if (arg0.field5606 < 0 || var10.field8160.length <= arg0.field5606) {
                        arg0.field5606 = -1;
                    }
                }
                arg0.field5596 = var10.field8158;
            }
        }
        if (arg0.field5611 > 0) {
            arg0.field5611--;
        }
        for (int var11 = 0; var11 < arg0.field5605.length; var11++) {
            class307 var12 = arg0.field5605[var11];
            if (var12 != null) {
                if (var12.field4232 > 0) {
                    var12.field4232--;
                } else {
                    class616 var13 = class636.field8570.method231(var12.field4235, -11764);
                    if (var13 == null || var13.field8160 == null) {
                        arg0.field5605[var11] = null;
                    } else {
                        var12.field4233++;
                        if (var12.field4236 < var13.field8160.length && var13.field8163[var12.field4236] < var12.field4233) {
                            var12.field4236++;
                            var12.field4233 = 1;
                            class373.method2199(arg0.field8609, arg0.field8620, (byte) 125, arg0.field8612, var12.field4236, var13, class199.field2897 == arg0);
                        }
                        if (var12.field4236 >= var13.field8160.length) {
                            var12.field4231++;
                            var12.field4236 -= var13.field8146;
                            if (var13.field8150 <= var12.field4231) {
                                arg0.field5605[var11] = null;
                            } else if (var12.field4236 >= 0 && var12.field4236 < var13.field8160.length) {
                                class373.method2199(arg0.field8609, arg0.field8620, (byte) 103, arg0.field8612, var12.field4236, var13, class199.field2897 == arg0);
                            } else {
                                arg0.field5605[var11] = null;
                            }
                        }
                        var12.field4234 = var12.field4236 + 1;
                        if (var13.field8160.length <= var12.field4234) {
                            var12.field4234 -= var13.field8146;
                            if ((var12.field4231 + 1) >= var13.field8150) {
                                var12.field4234 = -1;
                            } else if (var12.field4234 < 0 || var12.field4234 >= var13.field8160.length) {
                                var12.field4234 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
