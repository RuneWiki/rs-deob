import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class108 {

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "Lap;")
    public static class335 field1361 = new class335("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "F")
    public static float field1358;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "[I")
    public static int[] field1360;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILbf;)V")
    public static final void method793(int arg0, class375 arg1) {
        arg1.field4894 = false;
        field1359++;
        if (arg1.field4888 != -1) {
            class415 var2 = class404.field5756.method557(arg1.field4888, 15);
            if (var2 == null || var2.field5927 == null) {
                arg1.field4872 = false;
                arg1.field4888 = -1;
            } else {
                label402: {
                    arg1.field4889++;
                    if (arg1.field4866 < var2.field5927.length && var2.field5915[arg1.field4866] < arg1.field4889) {
                        arg1.field4889 = 1;
                        arg1.field4866++;
                        arg1.field4907++;
                        class334.method1931(arg1.field2666, (byte) 123, var2, arg1.field2676, class23.field336 == arg1, arg1.field4866, arg1.field2677);
                    }
                    if (var2.field5927.length <= arg1.field4866) {
                        arg1.field4889 = 0;
                        arg1.field4866 = 0;
                        if (arg1.field4872) {
                            arg1.field4888 = arg1.method2128(-77).method3056(true);
                            if (arg1.field4888 == -1) {
                                arg1.field4872 = false;
                                break label402;
                            }
                            var2 = class404.field5756.method557(arg1.field4888, arg0 ^ 0x5AAD);
                        }
                        class334.method1931(arg1.field2666, (byte) 127, var2, arg1.field2676, class23.field336 == arg1, arg1.field4866, arg1.field2677);
                    }
                    arg1.field4907 = arg1.field4866 + 1;
                    if (arg1.field4907 >= var2.field5927.length) {
                        arg1.field4907 = 0;
                    }
                }
            }
        }
        if (arg1.field4886 != -1 && arg1.field4912 <= class163.field2065) {
            class466 var3 = class120.field1624.method1836(125, arg1.field4886);
            int var4 = var3.field6746;
            if (var4 == -1) {
                arg1.field4886 = -1;
            } else {
                label404: {
                    class415 var5 = class404.field5756.method557(var4, 15);
                    if (var3.field6722) {
                        if (var5.field5929 == 3) {
                            if (arg1.field4943 > 0 && class163.field2065 >= arg1.field4844 && class163.field2065 > arg1.field4842) {
                                arg1.field4886 = -1;
                                break label404;
                            }
                        } else if (var5.field5929 == 1 && arg1.field4943 > 0 && arg1.field4844 <= class163.field2065 && class163.field2065 > arg1.field4842) {
                            arg1.field4912 = class163.field2065 + 1;
                            break label404;
                        }
                    }
                    if (var5 == null || var5.field5927 == null) {
                        arg1.field4886 = -1;
                    } else {
                        if (arg1.field4861 < 0) {
                            arg1.field4861 = 0;
                            class334.method1931(arg1.field2666, (byte) 126, var5, arg1.field2676, class23.field336 == arg1, 0, arg1.field2677);
                        }
                        arg1.field4928++;
                        if (arg1.field4861 < var5.field5927.length && arg1.field4928 > var5.field5915[arg1.field4861]) {
                            arg1.field4928 = 1;
                            arg1.field4861++;
                            class334.method1931(arg1.field2666, (byte) 124, var5, arg1.field2676, class23.field336 == arg1, arg1.field4861, arg1.field2677);
                        }
                        if (arg1.field4861 >= var5.field5927.length) {
                            if (var3.field6722) {
                                arg1.field4880++;
                                arg1.field4861 -= var5.field5909;
                                if (var5.field5922 <= arg1.field4880) {
                                    arg1.field4886 = -1;
                                } else if (arg1.field4861 >= 0 && var5.field5927.length > arg1.field4861) {
                                    class334.method1931(arg1.field2666, (byte) 101, var5, arg1.field2676, class23.field336 == arg1, arg1.field4861, arg1.field2677);
                                } else {
                                    arg1.field4886 = -1;
                                }
                            } else {
                                arg1.field4886 = -1;
                            }
                        }
                        arg1.field4885 = arg1.field4861 + 1;
                        if (var5.field5927.length <= arg1.field4885) {
                            if (var3.field6722) {
                                arg1.field4885 -= var5.field5909;
                                if ((arg1.field4880 + 1) >= var5.field5922) {
                                    arg1.field4885 = -1;
                                } else if (arg1.field4885 < 0 || var5.field5927.length <= arg1.field4885) {
                                    arg1.field4885 = -1;
                                }
                            } else {
                                arg1.field4885 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4906 != -1 && class163.field2065 >= arg1.field4892) {
            class466 var6 = class120.field1624.method1836(arg0 ^ 0x5ADD, arg1.field4906);
            int var7 = var6.field6746;
            if (var7 == -1) {
                arg1.field4906 = -1;
            } else {
                label407: {
                    class415 var8 = class404.field5756.method557(var7, 15);
                    if (var6.field6722) {
                        if (var8.field5929 == 3) {
                            if (arg1.field4943 > 0 && class163.field2065 >= arg1.field4844 && class163.field2065 > arg1.field4842) {
                                arg1.field4906 = -1;
                                break label407;
                            }
                        } else if (var8.field5929 == 1 && arg1.field4943 > 0 && arg1.field4844 <= class163.field2065 && arg1.field4842 < class163.field2065) {
                            arg1.field4892 = class163.field2065 + 1;
                            break label407;
                        }
                    }
                    if (var8 == null || var8.field5927 == null) {
                        arg1.field4906 = -1;
                    } else {
                        if (arg1.field4883 < 0) {
                            arg1.field4883 = 0;
                            class334.method1931(arg1.field2666, (byte) 103, var8, arg1.field2676, class23.field336 == arg1, 0, arg1.field2677);
                        }
                        arg1.field4875++;
                        if (var8.field5927.length > arg1.field4883 && arg1.field4875 > var8.field5915[arg1.field4883]) {
                            arg1.field4875 = 1;
                            arg1.field4883++;
                            class334.method1931(arg1.field2666, (byte) 88, var8, arg1.field2676, class23.field336 == arg1, arg1.field4883, arg1.field2677);
                        }
                        if (var8.field5927.length <= arg1.field4883) {
                            if (var6.field6722) {
                                arg1.field4883 -= var8.field5909;
                                arg1.field4893++;
                                if (var8.field5922 <= arg1.field4893) {
                                    arg1.field4906 = -1;
                                } else if (arg1.field4883 >= 0 && var8.field5927.length > arg1.field4883) {
                                    class334.method1931(arg1.field2666, (byte) 104, var8, arg1.field2676, class23.field336 == arg1, arg1.field4883, arg1.field2677);
                                } else {
                                    arg1.field4906 = -1;
                                }
                            } else {
                                arg1.field4906 = -1;
                            }
                        }
                        arg1.field4854 = arg1.field4883 + 1;
                        if (var8.field5927.length <= arg1.field4854) {
                            if (var6.field6722) {
                                arg1.field4854 -= var8.field5909;
                                if ((arg1.field4893 + 1) >= var8.field5922) {
                                    arg1.field4854 = -1;
                                } else if (arg1.field4854 < 0 || arg1.field4854 >= var8.field5927.length) {
                                    arg1.field4854 = -1;
                                }
                            } else {
                                arg1.field4854 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4859 != -1 && arg1.field4853 <= 1) {
            class415 var9 = class404.field5756.method557(arg1.field4859, arg0 - 23187);
            if (var9.field5929 == 3) {
                if (arg1.field4943 > 0 && arg1.field4844 <= class163.field2065 && arg1.field4842 < class163.field2065) {
                    arg1.field4859 = -1;
                }
            } else if (var9.field5929 == 1 && arg1.field4943 > 0 && arg1.field4844 <= class163.field2065 && arg1.field4842 < class163.field2065) {
                arg1.field4853 = 2;
            }
        }
        if (arg0 != 23202) {
            method793(27, null);
        }
        if (arg1.field4859 != -1 && arg1.field4853 == 0) {
            class415 var10 = class404.field5756.method557(arg1.field4859, 15);
            if (var10 == null || var10.field5927 == null) {
                arg1.field4859 = -1;
            } else {
                arg1.field4870++;
                if (var10.field5927.length > arg1.field4873 && var10.field5915[arg1.field4873] < arg1.field4870) {
                    arg1.field4873++;
                    arg1.field4870 = 1;
                    class334.method1931(arg1.field2666, (byte) 114, var10, arg1.field2676, class23.field336 == arg1, arg1.field4873, arg1.field2677);
                }
                if (var10.field5927.length <= arg1.field4873) {
                    arg1.field4852++;
                    arg1.field4873 -= var10.field5909;
                    if (arg1.field4852 >= var10.field5922) {
                        arg1.field4859 = -1;
                    } else if (arg1.field4873 >= 0 && arg1.field4873 < var10.field5927.length) {
                        class334.method1931(arg1.field2666, (byte) 97, var10, arg1.field2676, class23.field336 == arg1, arg1.field4873, arg1.field2677);
                    } else {
                        arg1.field4859 = -1;
                    }
                }
                arg1.field4881 = arg1.field4873 + 1;
                if (arg1.field4881 >= var10.field5927.length) {
                    arg1.field4881 -= var10.field5909;
                    if (var10.field5922 <= (arg1.field4852 + 1)) {
                        arg1.field4881 = -1;
                    } else if (arg1.field4881 < 0 || var10.field5927.length <= arg1.field4881) {
                        arg1.field4881 = -1;
                    }
                }
                arg1.field4894 = var10.field5908;
            }
        }
        if (arg1.field4853 > 0) {
            arg1.field4853--;
        }
        for (int var11 = 0; var11 < arg1.field4909.length; var11++) {
            class203 var12 = arg1.field4909[var11];
            if (var12 != null) {
                if (var12.field2637 > 0) {
                    var12.field2637--;
                } else {
                    class415 var13 = class404.field5756.method557(var12.field2638, 15);
                    if (var13 == null || var13.field5927 == null) {
                        arg1.field4909[var11] = null;
                    } else {
                        var12.field2642++;
                        if (var12.field2640 < var13.field5927.length && var12.field2642 > var13.field5915[var12.field2640]) {
                            var12.field2640++;
                            var12.field2642 = 1;
                            class334.method1931(arg1.field2666, (byte) 125, var13, arg1.field2676, class23.field336 == arg1, var12.field2640, arg1.field2677);
                        }
                        if (var13.field5927.length <= var12.field2640) {
                            var12.field2640 -= var13.field5909;
                            var12.field2635++;
                            if (var13.field5922 <= var12.field2635) {
                                arg1.field4909[var11] = null;
                            } else if (var12.field2640 >= 0 && var12.field2640 < var13.field5927.length) {
                                class334.method1931(arg1.field2666, (byte) 125, var13, arg1.field2676, class23.field336 == arg1, var12.field2640, arg1.field2677);
                            } else {
                                arg1.field4909[var11] = null;
                            }
                        }
                        var12.field2645 = var12.field2640 + 1;
                        if (var12.field2645 >= var13.field5927.length) {
                            var12.field2645 -= var13.field5909;
                            if ((var12.field2635 + 1) >= var13.field5922) {
                                var12.field2645 = -1;
                            } else if (var12.field2645 < 0 || var12.field2645 >= var13.field5927.length) {
                                var12.field2645 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static void method794(int arg0) {
        field1361 = null;
        if (arg0 != 1) {
            field1358 = -0.07852761F;
        }
        field1360 = null;
    }
}
