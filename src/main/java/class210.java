import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class210 extends class133 {

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3141 = "Loading fonts - ";

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field3145 = -1;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3140 = "Loaded world list data";

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Lpk;")
    public static class237 field3143;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "[Z")
    public static boolean[] field3134;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLkc;)V")
    public static final void method1379(boolean arg0, class25 arg1) {
        arg1.field398 = arg0;
        if (arg1.field399 != -1) {
            class220 var2 = class108.method781(arg1.field399, -1);
            if (var2 == null || var2.field3413 == null) {
                arg1.field399 = -1;
            } else {
                arg1.field456++;
                if (arg1.field405 < var2.field3413.length && var2.field3422[arg1.field405] < arg1.field456) {
                    arg1.field422++;
                    arg1.field456 = 1;
                    arg1.field405++;
                    class244.method1664(arg1.field455, class185.field2687 == arg1, arg1.field405, arg1.field425, 8890, var2);
                }
                if (var2.field3413.length <= arg1.field405) {
                    arg1.field456 = 0;
                    arg1.field405 = 0;
                    class244.method1664(arg1.field455, class185.field2687 == arg1, arg1.field405, arg1.field425, 8890, var2);
                }
                arg1.field422 = arg1.field405 + 1;
                if (arg1.field422 >= var2.field3413.length) {
                    arg1.field422 = 0;
                }
            }
        }
        field3137++;
        if (arg1.field491 != -1 && arg1.field418 <= class120.field1794) {
            class104 var3 = class296.method1957(arg1.field491, true);
            int var4 = var3.field1516;
            if (var4 == -1) {
                arg1.field491 = -1;
            } else {
                label292: {
                    class220 var5 = class108.method781(var4, -1);
                    if (var3.field1515) {
                        if (var5.field3402 == 3) {
                            if (arg1.field426 > 0 && arg1.field495 <= class120.field1794 && arg1.field442 < class120.field1794) {
                                arg1.field491 = -1;
                                break label292;
                            }
                        } else if (var5.field3402 == 1 && arg1.field426 > 0 && class120.field1794 >= arg1.field495 && arg1.field442 < class120.field1794) {
                            arg1.field418 = class120.field1794 + 1;
                            break label292;
                        }
                    }
                    if (var5 == null || var5.field3413 == null) {
                        arg1.field491 = -1;
                    } else {
                        if (arg1.field488 < 0) {
                            arg1.field488 = 0;
                            class244.method1664(arg1.field455, class185.field2687 == arg1, 0, arg1.field425, 8890, var5);
                        }
                        arg1.field460++;
                        if (var5.field3413.length > arg1.field488 && var5.field3422[arg1.field488] < arg1.field460) {
                            arg1.field460 = 1;
                            arg1.field488++;
                            class244.method1664(arg1.field455, class185.field2687 == arg1, arg1.field488, arg1.field425, 8890, var5);
                        }
                        if (arg1.field488 >= var5.field3413.length) {
                            if (var3.field1515) {
                                arg1.field439++;
                                arg1.field488 -= var5.field3434;
                                if (var5.field3428 <= arg1.field439) {
                                    arg1.field491 = -1;
                                } else if (arg1.field488 >= 0 && var5.field3413.length > arg1.field488) {
                                    class244.method1664(arg1.field455, class185.field2687 == arg1, arg1.field488, arg1.field425, 8890, var5);
                                } else {
                                    arg1.field491 = -1;
                                }
                            } else {
                                arg1.field491 = -1;
                            }
                        }
                        arg1.field459 = arg1.field488 + 1;
                        if (var5.field3413.length <= arg1.field459) {
                            if (var3.field1515) {
                                arg1.field459 -= var5.field3434;
                                if (var5.field3428 <= (arg1.field439 + 1)) {
                                    arg1.field459 = -1;
                                } else if (arg1.field459 < 0 || arg1.field459 >= var5.field3413.length) {
                                    arg1.field459 = -1;
                                }
                            } else {
                                arg1.field459 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field483 != -1 && arg1.field475 <= 1) {
            class220 var6 = class108.method781(arg1.field483, -1);
            if (var6.field3402 == 3) {
                if (arg1.field426 > 0 && arg1.field495 <= class120.field1794 && class120.field1794 > arg1.field442) {
                    arg1.field483 = -1;
                }
            } else if (var6.field3402 == 1 && arg1.field426 > 0 && class120.field1794 >= arg1.field495 && class120.field1794 > arg1.field442) {
                arg1.field475 = 1;
            }
        }
        if (arg1.field483 != -1 && arg1.field475 == 0) {
            class220 var7 = class108.method781(arg1.field483, -1);
            if (var7 == null || var7.field3413 == null) {
                arg1.field483 = -1;
            } else {
                arg1.field437++;
                if (arg1.field412 < var7.field3413.length && var7.field3422[arg1.field412] < arg1.field437) {
                    arg1.field412++;
                    arg1.field437 = 1;
                    class244.method1664(arg1.field455, class185.field2687 == arg1, arg1.field412, arg1.field425, 8890, var7);
                }
                if (arg1.field412 >= var7.field3413.length) {
                    arg1.field412 -= var7.field3434;
                    arg1.field410++;
                    if (arg1.field410 >= var7.field3428) {
                        arg1.field483 = -1;
                    } else if (arg1.field412 >= 0 && arg1.field412 < var7.field3413.length) {
                        class244.method1664(arg1.field455, class185.field2687 == arg1, arg1.field412, arg1.field425, 8890, var7);
                    } else {
                        arg1.field483 = -1;
                    }
                }
                arg1.field453 = arg1.field412 + 1;
                if (arg1.field453 >= var7.field3413.length) {
                    arg1.field453 -= var7.field3434;
                    if ((arg1.field410 + 1) >= var7.field3428) {
                        arg1.field453 = -1;
                    } else if (arg1.field453 < 0 || arg1.field453 >= var7.field3413.length) {
                        arg1.field453 = -1;
                    }
                }
                arg1.field398 = var7.field3408;
            }
        }
        if (arg1.field475 > 0) {
            arg1.field475--;
        }
        for (int var8 = 0; var8 < arg1.field485.length; var8++) {
            class85 var9 = arg1.field485[var8];
            if (var9 != null) {
                if (var9.field1304 > 0) {
                    var9.field1304--;
                } else {
                    class220 var10 = class108.method781(var9.field1309, -1);
                    if (var10 == null || var10.field3413 == null) {
                        arg1.field485[var8] = null;
                    } else {
                        var9.field1308++;
                        if (var9.field1298 < var10.field3413.length && var10.field3422[var9.field1298] < var9.field1308) {
                            var9.field1298++;
                            var9.field1308 = 1;
                            class244.method1664(arg1.field455, class185.field2687 == arg1, var9.field1298, arg1.field425, 8890, var10);
                        }
                        if (var10.field3413.length <= var9.field1298) {
                            var9.field1298 -= var10.field3434;
                            var9.field1310++;
                            if (var10.field3428 <= var9.field1310) {
                                arg1.field485[var8] = null;
                            } else if (var9.field1298 >= 0 && var10.field3413.length > var9.field1298) {
                                class244.method1664(arg1.field455, class185.field2687 == arg1, var9.field1298, arg1.field425, 8890, var10);
                            } else {
                                arg1.field485[var8] = null;
                            }
                        }
                        var9.field1307 = var9.field1298 + 1;
                        if (var10.field3413.length <= var9.field1307) {
                            var9.field1307 -= var10.field3434;
                            if ((var9.field1310 + 1) >= var10.field3428) {
                                var9.field1307 = -1;
                            } else if (var9.field1307 < 0 || var9.field1307 >= var10.field3413.length) {
                                var9.field1307 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
    public static final void method1380(int arg0, boolean arg1) {
        field3139++;
        int var2 = class90.field1377;
        int var3 = class209.field3127;
        int var4 = class254.field3919;
        int var5 = (int) class281.field4313;
        if (class175.field2565 / 256 > var5) {
            var5 = class175.field2565 / 256;
        }
        int var6 = (int) class89.field1349 + class208.field3116 & 0x7FF;
        if (class66.field1097[4] && (class89.field1357[4] + 128) > var5) {
            var5 = class89.field1357[4] + 128;
        }
        int var7 = class157.field2292;
        int var8 = class205.field3074;
        class15.method109(class268.method1810(class260.field3986, class185.field2687.field425, (byte) 118, class185.field2687.field455) - 50, var6, class110.field1635, class264.field4128, var5 * 3 + 600, var5, arg0, 45);
        if (class90.field1377 == var2 && class157.field2292 == var7 && class209.field3127 == var3 && class254.field3919 == var4 && class205.field3074 == var8) {
            class133.field1954 = 1;
            return;
        }
        class61.field1024 = 10;
        int var9 = class205.field3074 - var8;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        class86.field1313 = 10;
        class123.field1821 = 10;
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (var3 < class209.field3127) {
            var3 += (class209.field3127 - var3) * class61.field1024 / 1000 + class86.field1313;
            if (class209.field3127 > var3) {
                class209.field3127 = var3;
            }
        }
        class127.field1866 = 10;
        if (class90.field1377 > var2) {
            var2 += (class90.field1377 - var2) * class61.field1024 / 1000 + class86.field1313;
            if (class90.field1377 > var2) {
                class90.field1377 = var2;
            }
        }
        if (var2 > class90.field1377) {
            int var10 = var2 - ((var2 - class90.field1377) * class61.field1024 / 1000 + class86.field1313);
            if (var10 > class90.field1377) {
                class90.field1377 = var10;
            }
        }
        if (var9 > 0) {
            int var11 = class127.field1866 * var9 / 1000 + class123.field1821 + var8;
            var8 = var11 & 0x7FF;
        }
        if (var4 < class254.field3919) {
            var4 += (class254.field3919 - var4) * class127.field1866 / 1000 + class123.field1821;
            if (class254.field3919 > var4) {
                class254.field3919 = var4;
            }
        }
        if (!arg1) {
            return;
        }
        if (class209.field3127 < var3) {
            int var12 = var3 - ((var3 - class209.field3127) * class61.field1024 / 1000 + class86.field1313);
            if (var12 > class209.field3127) {
                class209.field3127 = var12;
            }
        }
        if (class254.field3919 < var4) {
            int var13 = var4 - ((var4 - class254.field3919) * class127.field1866 / 1000 + class123.field1821);
            if (var13 > class254.field3919) {
                class254.field3919 = var13;
            }
        }
        if (var9 < 0) {
            int var14 = var8 - (class123.field1821 + (-var9 * class127.field1866 / 1000));
            var8 = var14 & 0x7FF;
        }
        int var15 = class205.field3074 - var8;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 >= 0 || var9 <= 0 || var15 > 0 && var9 < 0) {
            class205.field3074 = var8;
        }
        if (class157.field2292 > var7) {
            var7 += class86.field1313 + ((class157.field2292 - var7) * class61.field1024 / 1000);
            if (var7 < class157.field2292) {
                class157.field2292 = var7;
            }
        }
        if (class157.field2292 >= var7) {
            return;
        }
        int var16 = var7 - ((var7 - class157.field2292) * class61.field1024 / 1000 + class86.field1313);
        if (class157.field2292 < var16) {
            class157.field2292 = var16;
            return;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIILbg;JZ)V")
    public static final void method1381(int arg0, int arg1, int arg2, int arg3, class264 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class29 var8 = new class29();
        var8.field533 = arg4;
        var8.field538 = arg1 * 128 + 64;
        var8.field532 = arg2 * 128 + 64;
        var8.field530 = arg3;
        var8.field534 = arg5;
        if (class3.field40[arg0][arg1][arg2] == null) {
            class3.field40[arg0][arg1][arg2] = new class201(arg0, arg1, arg2);
        }
        class3.field40[arg0][arg1][arg2].field3033 = var8;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIIII)V")
    public static final void method1382(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class59.field964.field887 = arg3;
        class59.field964.method437(true, 20);
        field3136++;
        class59.field964.method437(true, arg1);
        class59.field964.method437(true, arg4);
        class59.field964.method428(arg2, (byte) 46);
        class59.field964.method428(arg0, (byte) 46);
        class92.field1388 = 0;
        class164.field2398 = -3;
        class256.field3944 = 1;
        class264.field4134 = 0;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
    public static final void method1383(int arg0) {
        field3144++;
        if (class206.field3091 > 0) {
            class208.method1372(true);
            return;
        }
        if (arg0 != 7928) {
            method1382(-67, 39, 94, -81, 32);
        }
        class175.field2568 = class22.field369;
        class22.field369 = null;
        class88.method668(true, 40);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class196.field2961 <= arg1 && class84.field1287 >= arg5 && arg2 >= class175.field2557 && arg4 <= class91.field1381) {
            if (arg3 == 1) {
                class232.method1580(arg4, arg6, 15887, arg2, arg5, arg1);
            } else {
                class259.method1743(arg4, arg2, arg5, arg6, arg3, 18711, arg1);
            }
        } else if (arg3 == 1) {
            class236.method1597(arg5, arg1, arg2, arg6, (byte) 123, arg4);
        } else {
            class55.method465((byte) 106, arg4, arg3, arg1, arg2, arg5, arg6);
        }
        field3138++;
        if (arg0 != 24541) {
            method1384(-15, -120, 114, 63, -112, -41, 126);
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V")
    public static void method1385(boolean arg0) {
        field3141 = null;
        field3134 = null;
        field3140 = null;
        field3143 = null;
        if (!arg0) {
            method1381(-49, -56, 78, 0, (class264) null, 91L, true);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIBI)V")
    public static final void method1386(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3142++;
        if (arg3 < 45) {
            field3135 = -120;
        }
        for (int var5 = 0; var5 < class123.field1818; var5++) {
            if (arg0 < class247.field3848[var5] + class150.field2189[var5] && class150.field2189[var5] < (arg0 + arg4) && arg1 < class188.field2802[var5] + class166.field2453[var5] && arg1 + arg2 > class188.field2802[var5]) {
                class17.field315[var5] = true;
            }
        }
    }
}
