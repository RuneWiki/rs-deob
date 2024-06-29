import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class52 {

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "[[B")
    public static byte[][] field682 = new byte[1000][];

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Z")
    public static boolean field674 = true;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Lmf;")
    public static class161 field673;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lib;")
    public static class56 field680;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "[I")
    public static int[] field681;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static void method297(boolean arg0) {
        if (arg0) {
            field674 = true;
        }
        field673 = null;
        field680 = null;
        field681 = null;
        field682 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
    public static final void method298(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return;
        }
        class238.field3939[arg2] = arg0;
        class238 var3 = (class238) class144.field2276.method708((long) arg2, 19);
        if (var3 == null) {
            class238 var4 = new class238(4611686018427387905L);
            class144.field2276.method707((long) arg2, var4, (byte) 120);
        } else if (var3.field3930 != 4611686018427387905L) {
            var3.field3930 = class249.method1723((byte) 45) + 500L | 0x4000000000000000L;
        }
        field677++;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)V")
    public static final void method299(int arg0, int arg1, int arg2) {
        field679++;
        if (class244.field4015 != arg0) {
            class166.field2657 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class166.field2657[var3] = (var3 << 12) / arg0;
            }
            class211.field3394 = arg0 * 32;
            class118.field1673 = arg0 - 1;
            class244.field4015 = arg0;
        }
        if (arg2 != -30149 || class80.field998 == arg1) {
            return;
        }
        if (class244.field4015 == arg1) {
            class76.field956 = class166.field2657;
        } else {
            class76.field956 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class76.field956[var4] = (var4 << 12) / arg1;
            }
        }
        class83.field1026 = arg1 - 1;
        class80.field998 = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILeh;)Z")
    public static final boolean method300(int arg0, int arg1, class137 arg2) {
        byte[] var3 = arg2.method935(arg1, 36);
        field676++;
        if (var3 == null) {
            return false;
        }
        if (arg0 < 67) {
            method302((byte) -121);
        }
        class32.method179(var3, 124);
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLid;)V")
    public static final void method301(byte arg0, class230 arg1) {
        field675++;
        if (arg0 <= 32) {
            field681 = null;
        }
        arg1.field3758 = false;
        if (arg1.field3793 != -1) {
            class165 var2 = class208.method1458((byte) 118, arg1.field3793);
            if (var2 == null || var2.field2624 == null) {
                arg1.field3793 = -1;
            } else {
                arg1.field3823++;
                if (arg1.field3750 < var2.field2624.length && var2.field2634[arg1.field3750] < arg1.field3823) {
                    arg1.field3833++;
                    arg1.field3823 = 1;
                    arg1.field3750++;
                    class221.method1562(arg1.field3750, arg1.field3820, arg1.field3818, var2, (byte) 47, class286.field4571 == arg1);
                }
                if (var2.field2624.length <= arg1.field3750) {
                    arg1.field3823 = 0;
                    arg1.field3750 = 0;
                    class221.method1562(arg1.field3750, arg1.field3820, arg1.field3818, var2, (byte) 47, class286.field4571 == arg1);
                }
                arg1.field3833 = arg1.field3750 + 1;
                if (arg1.field3833 >= var2.field2624.length) {
                    arg1.field3833 = 0;
                }
            }
        }
        if (arg1.field3757 != -1 && arg1.field3779 <= class73.field924) {
            class98 var3 = class79.method440(arg1.field3757, (byte) 14);
            int var4 = var3.field1318;
            if (var4 == -1) {
                arg1.field3757 = -1;
            } else {
                label298: {
                    class165 var5 = class208.method1458((byte) 88, var4);
                    if (var3.field1311) {
                        if (var5.field2649 == 3) {
                            if (arg1.field3784 > 0 && class73.field924 >= arg1.field3799 && arg1.field3792 < class73.field924) {
                                arg1.field3757 = -1;
                                break label298;
                            }
                        } else if (var5.field2649 == 1 && arg1.field3784 > 0 && class73.field924 >= arg1.field3799 && arg1.field3792 < class73.field924) {
                            arg1.field3779 = class73.field924 + 1;
                            break label298;
                        }
                    }
                    if (var5 == null || var5.field2624 == null) {
                        arg1.field3757 = -1;
                    } else {
                        if (arg1.field3772 < 0) {
                            arg1.field3772 = 0;
                            class221.method1562(0, arg1.field3820, arg1.field3818, var5, (byte) 47, class286.field4571 == arg1);
                        }
                        arg1.field3761++;
                        if (arg1.field3772 < var5.field2624.length && var5.field2634[arg1.field3772] < arg1.field3761) {
                            arg1.field3772++;
                            arg1.field3761 = 1;
                            class221.method1562(arg1.field3772, arg1.field3820, arg1.field3818, var5, (byte) 47, class286.field4571 == arg1);
                        }
                        if (arg1.field3772 >= var5.field2624.length) {
                            if (var3.field1311) {
                                arg1.field3739++;
                                arg1.field3772 -= var5.field2642;
                                if (var5.field2640 <= arg1.field3739) {
                                    arg1.field3757 = -1;
                                } else if (arg1.field3772 >= 0 && arg1.field3772 < var5.field2624.length) {
                                    class221.method1562(arg1.field3772, arg1.field3820, arg1.field3818, var5, (byte) 47, class286.field4571 == arg1);
                                } else {
                                    arg1.field3757 = -1;
                                }
                            } else {
                                arg1.field3757 = -1;
                            }
                        }
                        arg1.field3832 = arg1.field3772 + 1;
                        if (arg1.field3832 >= var5.field2624.length) {
                            if (var3.field1311) {
                                arg1.field3832 -= var5.field2642;
                                if ((arg1.field3739 + 1) >= var5.field2640) {
                                    arg1.field3832 = -1;
                                } else if (arg1.field3832 < 0 || var5.field2624.length <= arg1.field3832) {
                                    arg1.field3832 = -1;
                                }
                            } else {
                                arg1.field3832 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field3827 != -1 && arg1.field3765 <= 1) {
            class165 var6 = class208.method1458((byte) -68, arg1.field3827);
            if (var6.field2649 == 3) {
                if (arg1.field3784 > 0 && class73.field924 >= arg1.field3799 && arg1.field3792 < class73.field924) {
                    arg1.field3827 = -1;
                }
            } else if (var6.field2649 == 1 && arg1.field3784 > 0 && arg1.field3799 <= class73.field924 && arg1.field3792 < class73.field924) {
                arg1.field3765 = 1;
            }
        }
        if (arg1.field3827 != -1 && arg1.field3765 == 0) {
            class165 var7 = class208.method1458((byte) -87, arg1.field3827);
            if (var7 == null || var7.field2624 == null) {
                arg1.field3827 = -1;
            } else {
                arg1.field3800++;
                if (arg1.field3782 < var7.field2624.length && arg1.field3800 > var7.field2634[arg1.field3782]) {
                    arg1.field3800 = 1;
                    arg1.field3782++;
                    class221.method1562(arg1.field3782, arg1.field3820, arg1.field3818, var7, (byte) 47, class286.field4571 == arg1);
                }
                if (var7.field2624.length <= arg1.field3782) {
                    arg1.field3782 -= var7.field2642;
                    arg1.field3759++;
                    if (arg1.field3759 >= var7.field2640) {
                        arg1.field3827 = -1;
                    } else if (arg1.field3782 >= 0 && var7.field2624.length > arg1.field3782) {
                        class221.method1562(arg1.field3782, arg1.field3820, arg1.field3818, var7, (byte) 47, class286.field4571 == arg1);
                    } else {
                        arg1.field3827 = -1;
                    }
                }
                arg1.field3738 = arg1.field3782 + 1;
                if (var7.field2624.length <= arg1.field3738) {
                    arg1.field3738 -= var7.field2642;
                    if ((arg1.field3759 + 1) >= var7.field2640) {
                        arg1.field3738 = -1;
                    } else if (arg1.field3738 < 0 || arg1.field3738 >= var7.field2624.length) {
                        arg1.field3738 = -1;
                    }
                }
                arg1.field3758 = var7.field2632;
            }
        }
        if (arg1.field3765 > 0) {
            arg1.field3765--;
        }
        for (int var8 = 0; var8 < arg1.field3839.length; var8++) {
            class201 var9 = arg1.field3839[var8];
            if (var9 != null) {
                if (var9.field3188 > 0) {
                    var9.field3188--;
                } else {
                    class165 var10 = class208.method1458((byte) -84, var9.field3180);
                    if (var10 == null || var10.field2624 == null) {
                        arg1.field3839[var8] = null;
                    } else {
                        var9.field3187++;
                        if (var10.field2624.length > var9.field3177 && var10.field2634[var9.field3177] < var9.field3187) {
                            var9.field3187 = 1;
                            var9.field3177++;
                            class221.method1562(var9.field3177, arg1.field3820, arg1.field3818, var10, (byte) 47, class286.field4571 == arg1);
                        }
                        if (var10.field2624.length <= var9.field3177) {
                            var9.field3178++;
                            var9.field3177 -= var10.field2642;
                            if (var10.field2640 <= var9.field3178) {
                                arg1.field3839[var8] = null;
                            } else if (var9.field3177 >= 0 && var10.field2624.length > var9.field3177) {
                                class221.method1562(var9.field3177, arg1.field3820, arg1.field3818, var10, (byte) 47, class286.field4571 == arg1);
                            } else {
                                arg1.field3839[var8] = null;
                            }
                        }
                        var9.field3184 = var9.field3177 + 1;
                        if (var10.field2624.length <= var9.field3184) {
                            var9.field3184 -= var10.field2642;
                            if ((var9.field3178 + 1) >= var10.field2640) {
                                var9.field3184 = -1;
                            } else if (var9.field3184 < 0 || var9.field3184 >= var10.field2624.length) {
                                var9.field3184 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static final void method302(byte arg0) {
        if (arg0 != 21) {
            field681 = null;
        }
        class47.field590.method1701((byte) 45);
        field678++;
    }
}
