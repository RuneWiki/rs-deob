import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class177 extends class430 {

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field2470 = -1;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field2472 = -1;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLcs;)V")
    public static final void method1271(boolean arg0, class335 arg1) {
        if (arg1.field4575 != -1) {
            class131 var2 = class610.field8698.method2999(arg1.field4575, false);
            if (var2 == null || var2.field1792 == null) {
                arg1.field4575 = -1;
                arg1.field4595 = false;
            } else {
                label375: {
                    arg1.field4631++;
                    if (arg1.field4563 < var2.field1792.length && var2.field1812[arg1.field4563] < arg1.field4631) {
                        arg1.field4563++;
                        arg1.field4631 = 1;
                        arg1.field4534++;
                        if (!arg1.field4612) {
                            class701.method3941(arg1.field4563, var2, (byte) 101, arg1);
                        }
                    }
                    if (var2.field1792.length <= arg1.field4563) {
                        arg1.field4563 = 0;
                        arg1.field4631 = 0;
                        if (arg1.field4595) {
                            arg1.field4575 = arg1.method2052(-5569).method669((byte) -102);
                            if (arg1.field4575 == -1) {
                                arg1.field4595 = false;
                                break label375;
                            }
                            var2 = class610.field8698.method2999(arg1.field4575, false);
                        }
                        if (!arg1.field4612) {
                            class701.method3941(arg1.field4563, var2, (byte) 101, arg1);
                        }
                    }
                    arg1.field4534 = arg1.field4563 + 1;
                    if (var2.field1792 == null) {
                        arg1.field4575 = -1;
                        arg1.field4595 = false;
                    } else if (arg1.field4534 >= var2.field1792.length) {
                        arg1.field4534 = 0;
                    }
                }
            }
        }
        field2471++;
        if (arg1.field4547 != -1 && arg1.field4587 <= class703.field9918) {
            class365 var3 = class596.field8476.method2263(arg1.field4547, -127);
            int var4 = var3.field5332;
            if (var4 == -1) {
                arg1.field4547 = -1;
            } else {
                label376: {
                    class131 var5 = class610.field8698.method2999(var4, !arg0);
                    if (var3.field5345) {
                        if (var5.field1795 == 3) {
                            if (arg1.field4641 > 0 && arg1.field4628 <= class703.field9918 && arg1.field4586 < class703.field9918) {
                                arg1.field4547 = -1;
                                break label376;
                            }
                        } else if (var5.field1795 == 1 && arg1.field4641 > 0 && class703.field9918 >= arg1.field4628 && arg1.field4586 < class703.field9918) {
                            arg1.field4587 = class703.field9918 + 1;
                            break label376;
                        }
                    }
                    if (var5 == null || var5.field1792 == null) {
                        arg1.field4547 = -1;
                    } else {
                        if (arg1.field4541 < 0) {
                            arg1.field4541 = 0;
                            if (!arg1.field4612) {
                                class701.method3941(0, var5, (byte) 101, arg1);
                            }
                        }
                        arg1.field4584++;
                        if (arg1.field4541 < var5.field1792.length && var5.field1812[arg1.field4541] < arg1.field4584) {
                            arg1.field4584 = 1;
                            arg1.field4541++;
                            if (!arg1.field4612) {
                                class701.method3941(arg1.field4541, var5, (byte) 101, arg1);
                            }
                        }
                        if (var5.field1792.length <= arg1.field4541) {
                            if (var3.field5345) {
                                arg1.field4613++;
                                arg1.field4541 -= var5.field1800;
                                if (arg1.field4613 >= var5.field1802) {
                                    arg1.field4547 = -1;
                                } else if (arg1.field4541 < 0 || var5.field1792.length <= arg1.field4541) {
                                    arg1.field4547 = -1;
                                } else if (!arg1.field4612) {
                                    class701.method3941(arg1.field4541, var5, (byte) 101, arg1);
                                }
                            } else {
                                arg1.field4547 = -1;
                            }
                        }
                        arg1.field4604 = arg1.field4541 + 1;
                        if (var5.field1792.length <= arg1.field4604) {
                            if (var3.field5345) {
                                arg1.field4604 -= var5.field1800;
                                if ((arg1.field4613 + 1) >= var5.field1802) {
                                    arg1.field4604 = -1;
                                } else if (arg1.field4604 < 0 || var5.field1792.length <= arg1.field4604) {
                                    arg1.field4604 = -1;
                                }
                            } else {
                                arg1.field4604 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4544 != -1 && class703.field9918 >= arg1.field4543) {
            class365 var6 = class596.field8476.method2263(arg1.field4544, -125);
            int var7 = var6.field5332;
            if (var7 == -1) {
                arg1.field4544 = -1;
            } else {
                label380: {
                    class131 var8 = class610.field8698.method2999(var7, false);
                    if (var6.field5345) {
                        if (var8.field1795 == 3) {
                            if (arg1.field4641 > 0 && arg1.field4628 <= class703.field9918 && class703.field9918 > arg1.field4586) {
                                arg1.field4544 = -1;
                                break label380;
                            }
                        } else if (var8.field1795 == 1 && arg1.field4641 > 0 && class703.field9918 >= arg1.field4628 && class703.field9918 > arg1.field4586) {
                            arg1.field4543 = class703.field9918 + 1;
                            break label380;
                        }
                    }
                    if (var8 == null || var8.field1792 == null) {
                        arg1.field4544 = -1;
                    } else {
                        if (arg1.field4600 < 0) {
                            arg1.field4600 = 0;
                            if (!arg1.field4612) {
                                class701.method3941(0, var8, (byte) 101, arg1);
                            }
                        }
                        arg1.field4623++;
                        if (arg1.field4600 < var8.field1792.length && arg1.field4623 > var8.field1812[arg1.field4600]) {
                            arg1.field4623 = 1;
                            arg1.field4600++;
                            if (!arg1.field4612) {
                                class701.method3941(arg1.field4600, var8, (byte) 101, arg1);
                            }
                        }
                        if (var8.field1792.length <= arg1.field4600) {
                            if (var6.field5345) {
                                arg1.field4600 -= var8.field1800;
                                arg1.field4617++;
                                if (arg1.field4617 >= var8.field1802) {
                                    arg1.field4544 = -1;
                                } else if (arg1.field4600 < 0 || arg1.field4600 >= var8.field1792.length) {
                                    arg1.field4544 = -1;
                                } else if (!arg1.field4612) {
                                    class701.method3941(arg1.field4600, var8, (byte) 101, arg1);
                                }
                            } else {
                                arg1.field4544 = -1;
                            }
                        }
                        arg1.field4554 = arg1.field4600 + 1;
                        if (arg1.field4554 >= var8.field1792.length) {
                            if (var6.field5345) {
                                arg1.field4554 -= var8.field1800;
                                if ((arg1.field4617 + 1) >= var8.field1802) {
                                    arg1.field4554 = -1;
                                } else if (arg1.field4554 < 0 || var8.field1792.length <= arg1.field4554) {
                                    arg1.field4554 = -1;
                                }
                            } else {
                                arg1.field4554 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4545 != -1 && arg1.field4535 <= 1) {
            class131 var9 = class610.field8698.method2999(arg1.field4545, false);
            if (var9.field1795 == 3) {
                if (arg1.field4641 > 0 && class703.field9918 >= arg1.field4628 && arg1.field4586 < class703.field9918) {
                    arg1.field4564 = null;
                    arg1.field4545 = -1;
                }
            } else if (var9.field1795 == 1 && arg1.field4641 > 0 && arg1.field4628 <= class703.field9918 && class703.field9918 > arg1.field4586) {
                arg1.field4535 = 2;
            }
        }
        if (arg1.field4545 != -1 && arg1.field4535 == 0) {
            class131 var10 = class610.field8698.method2999(arg1.field4545, !arg0);
            if (var10 == null || var10.field1792 == null) {
                arg1.field4564 = null;
                arg1.field4545 = -1;
            } else {
                arg1.field4551++;
                if (arg1.field4605 < var10.field1792.length && arg1.field4551 > var10.field1812[arg1.field4605]) {
                    arg1.field4551 = 1;
                    arg1.field4605++;
                    if (!arg1.field4612) {
                        class701.method3941(arg1.field4605, var10, (byte) 101, arg1);
                    }
                }
                if (var10.field1792.length <= arg1.field4605) {
                    arg1.field4597++;
                    arg1.field4605 -= var10.field1800;
                    if (arg1.field4597 >= var10.field1802) {
                        arg1.field4545 = -1;
                        arg1.field4564 = null;
                    } else if (arg1.field4605 < 0 || arg1.field4605 >= var10.field1792.length) {
                        arg1.field4564 = null;
                        arg1.field4545 = -1;
                    } else if (!arg1.field4612) {
                        class701.method3941(arg1.field4605, var10, (byte) 101, arg1);
                    }
                }
                arg1.field4616 = arg1.field4605 + 1;
                if (var10.field1792.length <= arg1.field4616) {
                    arg1.field4616 -= var10.field1800;
                    if (var10.field1802 <= arg1.field4597 + 1) {
                        arg1.field4616 = -1;
                    } else if (arg1.field4616 < 0 || var10.field1792.length <= arg1.field4616) {
                        arg1.field4616 = -1;
                    }
                }
            }
        }
        if (arg1.field4535 > 0) {
            arg1.field4535--;
        }
        for (int var11 = 0; var11 < arg1.field4615.length; var11++) {
            class196 var12 = arg1.field4615[var11];
            if (var12 != null) {
                if (var12.field2870 > 0) {
                    var12.field2870--;
                } else {
                    class131 var13 = class610.field8698.method2999(var12.field2873, false);
                    if (var13 == null || var13.field1792 == null) {
                        arg1.field4615[var11] = null;
                    } else {
                        var12.field2858++;
                        if (var13.field1792.length > var12.field2862 && var12.field2858 > var13.field1812[var12.field2862]) {
                            var12.field2858 = 1;
                            var12.field2862++;
                            if (!arg1.field4612) {
                                class701.method3941(var12.field2862, var13, (byte) 101, arg1);
                            }
                        }
                        if (var12.field2862 >= var13.field1792.length) {
                            var12.field2862 -= var13.field1800;
                            var12.field2864++;
                            if (var13.field1802 <= var12.field2864) {
                                arg1.field4615[var11] = null;
                            } else if (var12.field2862 < 0 || var12.field2862 >= var13.field1792.length) {
                                arg1.field4615[var11] = null;
                            } else if (!arg1.field4612) {
                                class701.method3941(var12.field2862, var13, (byte) 101, arg1);
                            }
                        }
                        var12.field2871 = var12.field2862 + 1;
                        if (var13.field1792.length <= var12.field2871) {
                            var12.field2871 -= var13.field1800;
                            if (var13.field1802 <= (var12.field2864 + 1)) {
                                var12.field2871 = -1;
                            } else if (var12.field2871 < 0 || var12.field2871 >= var13.field1792.length) {
                                var12.field2871 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            method1271(false, null);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class177() {
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I)V")
    public class177(int arg0) {
        this.field2473 = arg0;
    }
}
