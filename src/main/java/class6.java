import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class6 {

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public int field133 = 0;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Z")
    public static boolean field134 = true;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field132 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "Lwd;")
    public static class88 field142;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILaj;)V", line = 5)
    private final void method94(int arg0, int arg1, class1 arg2) {
        field135++;
        if (arg0 != -1) {
            method101(-4, -43, 22, -54, (class179) null, (class179) null, 7, 19, 72, -35, -27L);
        }
        if (arg1 == 5) {
            this.field133 = arg2.method56(19612);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILlk;)V", line = 24)
    public static final void method95(int arg0, class294 arg1) {
        arg1.field4610 = false;
        field139++;
        if (arg1.field4614 != -1) {
            class38 var2 = class63.method503(arg1.field4614, (byte) 125);
            if (var2 == null || var2.field584 == null) {
                arg1.field4614 = -1;
            } else {
                arg1.field4649++;
                if (var2.field584.length > arg1.field4656 && var2.field568[arg1.field4656] < arg1.field4649) {
                    arg1.field4649 = 1;
                    arg1.field4676++;
                    arg1.field4656++;
                    class28.method246(class345.field5363 == arg1, arg0 + 254, arg1.field4656, arg1.field4671, var2, arg1.field4672);
                }
                if (arg1.field4656 >= var2.field584.length) {
                    arg1.field4649 = 0;
                    arg1.field4656 = 0;
                    class28.method246(class345.field5363 == arg1, 255, arg1.field4656, arg1.field4671, var2, arg1.field4672);
                }
                arg1.field4676 = arg1.field4656 + 1;
                if (arg1.field4676 >= var2.field584.length) {
                    arg1.field4676 = 0;
                }
            }
        }
        if (arg1.field4679 != -1 && arg1.field4708 <= class307.field4869) {
            class74 var3 = class52.method429(4618, arg1.field4679);
            int var4 = var3.field1135;
            if (var4 == -1) {
                arg1.field4679 = -1;
            } else {
                label308: {
                    class38 var5 = class63.method503(var4, (byte) 122);
                    if (var3.field1124) {
                        if (var5.field585 == 3) {
                            if (arg1.field4641 > 0 && class307.field4869 >= arg1.field4627 && class307.field4869 > arg1.field4648) {
                                arg1.field4679 = -1;
                                break label308;
                            }
                        } else if (var5.field585 == 1 && arg1.field4641 > 0 && class307.field4869 >= arg1.field4627 && class307.field4869 > arg1.field4648) {
                            arg1.field4708 = class307.field4869 + 1;
                            break label308;
                        }
                    }
                    if (var5 == null || var5.field584 == null) {
                        arg1.field4679 = -1;
                    } else {
                        if (arg1.field4681 < 0) {
                            arg1.field4681 = 0;
                            class28.method246(class345.field5363 == arg1, 255, 0, arg1.field4671, var5, arg1.field4672);
                        }
                        arg1.field4617++;
                        if (arg1.field4681 < var5.field584.length && var5.field568[arg1.field4681] < arg1.field4617) {
                            arg1.field4681++;
                            arg1.field4617 = 1;
                            class28.method246(class345.field5363 == arg1, 255, arg1.field4681, arg1.field4671, var5, arg1.field4672);
                        }
                        if (var5.field584.length <= arg1.field4681) {
                            if (var3.field1124) {
                                arg1.field4681 -= var5.field564;
                                arg1.field4646++;
                                if (arg1.field4646 >= var5.field565) {
                                    arg1.field4679 = -1;
                                } else if (arg1.field4681 >= 0 && var5.field584.length > arg1.field4681) {
                                    class28.method246(class345.field5363 == arg1, 255, arg1.field4681, arg1.field4671, var5, arg1.field4672);
                                } else {
                                    arg1.field4679 = -1;
                                }
                            } else {
                                arg1.field4679 = -1;
                            }
                        }
                        arg1.field4678 = arg1.field4681 + 1;
                        if (var5.field584.length <= arg1.field4678) {
                            if (var3.field1124) {
                                arg1.field4678 -= var5.field564;
                                if ((arg1.field4646 + 1) >= var5.field565) {
                                    arg1.field4678 = -1;
                                } else if (arg1.field4678 < 0 || arg1.field4678 >= var5.field584.length) {
                                    arg1.field4678 = -1;
                                }
                            } else {
                                arg1.field4678 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4660 != -1 && arg1.field4667 <= 1) {
            class38 var6 = class63.method503(arg1.field4660, (byte) 77);
            if (var6.field585 == 3) {
                if (arg1.field4641 > 0 && class307.field4869 >= arg1.field4627 && arg1.field4648 < class307.field4869) {
                    arg1.field4660 = -1;
                }
            } else if (var6.field585 == 1 && arg1.field4641 > 0 && class307.field4869 >= arg1.field4627 && class307.field4869 > arg1.field4648) {
                arg1.field4667 = 1;
            }
        }
        if (arg1.field4660 != -1 && arg1.field4667 == 0) {
            class38 var7 = class63.method503(arg1.field4660, (byte) 76);
            if (var7 == null || var7.field584 == null) {
                arg1.field4660 = -1;
            } else {
                arg1.field4687++;
                if (arg1.field4655 < var7.field584.length && arg1.field4687 > var7.field568[arg1.field4655]) {
                    arg1.field4655++;
                    arg1.field4687 = 1;
                    class28.method246(class345.field5363 == arg1, arg0 + 254, arg1.field4655, arg1.field4671, var7, arg1.field4672);
                }
                if (arg1.field4655 >= var7.field584.length) {
                    arg1.field4655 -= var7.field564;
                    arg1.field4634++;
                    if (var7.field565 <= arg1.field4634) {
                        arg1.field4660 = -1;
                    } else if (arg1.field4655 >= 0 && arg1.field4655 < var7.field584.length) {
                        class28.method246(class345.field5363 == arg1, 255, arg1.field4655, arg1.field4671, var7, arg1.field4672);
                    } else {
                        arg1.field4660 = -1;
                    }
                }
                arg1.field4674 = arg1.field4655 + 1;
                if (var7.field584.length <= arg1.field4674) {
                    arg1.field4674 -= var7.field564;
                    if ((arg1.field4634 + 1) >= var7.field565) {
                        arg1.field4674 = -1;
                    } else if (arg1.field4674 < 0 || arg1.field4674 >= var7.field584.length) {
                        arg1.field4674 = -1;
                    }
                }
                arg1.field4610 = var7.field581;
            }
        }
        if (arg1.field4667 > 0) {
            arg1.field4667--;
        }
        for (int var8 = 0; var8 < arg1.field4636.length; var8++) {
            class63 var9 = arg1.field4636[var8];
            if (var9 != null) {
                if (var9.field920 > 0) {
                    var9.field920--;
                } else {
                    class38 var10 = class63.method503(var9.field923, (byte) 75);
                    if (var10 == null || var10.field584 == null) {
                        arg1.field4636[var8] = null;
                    } else {
                        var9.field916++;
                        if (var9.field917 < var10.field584.length && var9.field916 > var10.field568[var9.field917]) {
                            var9.field917++;
                            var9.field916 = 1;
                            class28.method246(class345.field5363 == arg1, 255, var9.field917, arg1.field4671, var10, arg1.field4672);
                        }
                        if (var9.field917 >= var10.field584.length) {
                            var9.field921++;
                            var9.field917 -= var10.field564;
                            if (var10.field565 <= var9.field921) {
                                arg1.field4636[var8] = null;
                            } else if (var9.field917 >= 0 && var9.field917 < var10.field584.length) {
                                class28.method246(class345.field5363 == arg1, 255, var9.field917, arg1.field4671, var10, arg1.field4672);
                            } else {
                                arg1.field4636[var8] = null;
                            }
                        }
                        var9.field919 = var9.field917 + 1;
                        if (var9.field919 >= var10.field584.length) {
                            var9.field919 -= var10.field564;
                            if ((var9.field921 + 1) >= var10.field565) {
                                var9.field919 = -1;
                            } else if (var9.field919 < 0 || var10.field584.length <= var9.field919) {
                                var9.field919 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 1) {
            field130 = 53;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILaj;)V", line = 336)
    public final void method96(int arg0, class1 arg1) {
        if (arg0 >= -6) {
            method99((byte) -70);
        }
        while (true) {
            int var3 = arg1.method15((byte) -40);
            if (var3 == 0) {
                field141++;
                return;
            }
            this.method94(-1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 360)
    public static final void method97(int arg0) {
        class340.field5253 = new class3(32);
        if (arg0 != -31005) {
            field142 = (class88) null;
        }
        field138++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)V", line = 371)
    public static final void method98(boolean arg0, int arg1) {
        field140++;
        class170 var2 = class221.method1613(1, arg1, -8410);
        var2.method1267(-85);
        if (arg0) {
            field142 = (class88) null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 385)
    public static final void method99(byte arg0) {
        field131++;
        int var1 = 0;
        int var2 = -29 / ((22 - arg0) / 46);
        for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class281.method1980(true, 1865, var1, var4, class34.field521, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V", line = 427)
    public static final void method100(int arg0, int arg1) {
        field136++;
        class151.field2485.method2285(arg1, (byte) -39);
        int var2 = -83 / ((arg0 + 54) / 49);
        class337.field5212.method2285(arg1, (byte) 113);
        class113.field1822.method2285(arg1, (byte) -14);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIILeh;Leh;IIIIJ)V", line = 443)
    public static final void method101(int arg0, int arg1, int arg2, int arg3, class179 arg4, class179 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class293 var12 = new class293();
        var12.field4596 = arg10;
        var12.field4598 = arg1 * 128 + 64;
        var12.field4600 = arg2 * 128 + 64;
        var12.field4606 = arg3;
        var12.field4593 = arg4;
        var12.field4595 = arg5;
        var12.field4605 = arg6;
        var12.field4603 = arg7;
        var12.field4601 = arg8;
        var12.field4592 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class34.field521[var13][arg1][arg2] == null) {
                class34.field521[var13][arg1][arg2] = new class42(var13, arg1, arg2);
            }
        }
        class34.field521[arg0][arg1][arg2].field666 = var12;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V", line = 472)
    public static void method102(byte arg0) {
        field142 = null;
        if (arg0 <= 61) {
            field134 = false;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBII)V", line = 489)
    public static final void method103(int arg0, byte arg1, int arg2, int arg3) {
        field137++;
        if (arg3 == 0) {
            class209.field3305.method1808((byte) -74, 160);
            class24.field414++;
            class209.field3305.method21(114, 5);
        }
        if (arg3 == 1) {
            class135.field2196++;
            class209.field3305.method1808((byte) -74, 186);
            class209.field3305.method21(-107, 19);
        }
        class209.field3305.method37((byte) -115, class48.field737[82] ? 1 : 0);
        if (arg1 != 36) {
            field134 = false;
        }
        class209.field3305.method44((byte) 90, arg0 + class133.field2118);
        class209.field3305.method47(class117.field1902 + arg2, false);
        class169.field2723 = arg0;
        class57.field862 = arg2;
    }
}
