import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class287 {

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "[B")
    public byte[] field3875;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "[S")
    public short[] field3874;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "[S")
    public short[] field3878;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "[S")
    public short[] field3879;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BLrq;)V", line = 5)
    public static final void method1718(byte arg0, class39 arg1) {
        arg1.field479 = 0;
        field3877++;
        if (arg1.field454 != -1) {
            class463 var2 = class77.field971.method776(arg1.field454, (byte) -87);
            if (var2 == null || var2.field6307 == null) {
                arg1.field454 = -1;
                arg1.field456 = false;
            } else {
                label403: {
                    arg1.field451++;
                    if (arg1.field513 < var2.field6307.length && arg1.field451 > var2.field6319[arg1.field513]) {
                        arg1.field513++;
                        arg1.field451 = 1;
                        arg1.field432++;
                        class311.method1870(arg1.field513, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var2, arg1.field3925);
                    }
                    if (var2.field6307.length <= arg1.field513) {
                        arg1.field451 = 0;
                        arg1.field513 = 0;
                        if (arg1.field456) {
                            arg1.field454 = arg1.method242(5832).method2134(arg0 ^ 0xFFFFF518);
                            if (arg1.field454 == -1) {
                                arg1.field456 = false;
                                break label403;
                            }
                            var2 = class77.field971.method776(arg1.field454, (byte) -97);
                        }
                        class311.method1870(arg1.field513, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var2, arg1.field3925);
                    }
                    arg1.field432 = arg1.field513 + 1;
                    if (var2.field6307.length <= arg1.field432) {
                        arg1.field432 = 0;
                    }
                }
            }
        }
        if (arg1.field444 != -1 && class430.field5984 >= arg1.field473) {
            class328 var3 = class236.field3079.method1047(arg1.field444, (byte) -96);
            int var4 = var3.field4797;
            if (var4 == -1) {
                arg1.field444 = -1;
            } else {
                label405: {
                    class463 var5 = class77.field971.method776(var4, (byte) -120);
                    if (var3.field4811) {
                        if (var5.field6316 == 3) {
                            if (arg1.field521 > 0 && class430.field5984 >= arg1.field424 && class430.field5984 > arg1.field496) {
                                arg1.field444 = -1;
                                break label405;
                            }
                        } else if (var5.field6316 == 1 && arg1.field521 > 0 && class430.field5984 >= arg1.field424 && arg1.field496 < class430.field5984) {
                            arg1.field473 = class430.field5984 + 1;
                            break label405;
                        }
                    }
                    if (var5 == null || var5.field6307 == null) {
                        arg1.field444 = -1;
                    } else {
                        if (arg1.field466 < 0) {
                            arg1.field466 = 0;
                            class311.method1870(0, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var5, arg1.field3925);
                        }
                        arg1.field490++;
                        if (var5.field6307.length > arg1.field466 && arg1.field490 > var5.field6319[arg1.field466]) {
                            arg1.field490 = 1;
                            arg1.field466++;
                            class311.method1870(arg1.field466, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var5, arg1.field3925);
                        }
                        if (var5.field6307.length <= arg1.field466) {
                            if (var3.field4811) {
                                arg1.field422++;
                                arg1.field466 -= var5.field6332;
                                if (arg1.field422 >= var5.field6326) {
                                    arg1.field444 = -1;
                                } else if (arg1.field466 >= 0 && arg1.field466 < var5.field6307.length) {
                                    class311.method1870(arg1.field466, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var5, arg1.field3925);
                                } else {
                                    arg1.field444 = -1;
                                }
                            } else {
                                arg1.field444 = -1;
                            }
                        }
                        arg1.field448 = arg1.field466 + 1;
                        if (var5.field6307.length <= arg1.field448) {
                            if (var3.field4811) {
                                arg1.field448 -= var5.field6332;
                                if ((arg1.field422 + 1) >= var5.field6326) {
                                    arg1.field448 = -1;
                                } else if (arg1.field448 < 0 || var5.field6307.length <= arg1.field448) {
                                    arg1.field448 = -1;
                                }
                            } else {
                                arg1.field448 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field453 != -1 && arg1.field467 <= class430.field5984) {
            class328 var6 = class236.field3079.method1047(arg1.field453, (byte) 122);
            int var7 = var6.field4797;
            if (var7 == -1) {
                arg1.field453 = -1;
            } else {
                label409: {
                    class463 var8 = class77.field971.method776(var7, (byte) -82);
                    if (var6.field4811) {
                        if (var8.field6316 == 3) {
                            if (arg1.field521 > 0 && class430.field5984 >= arg1.field424 && class430.field5984 > arg1.field496) {
                                arg1.field453 = -1;
                                break label409;
                            }
                        } else if (var8.field6316 == 1 && arg1.field521 > 0 && class430.field5984 >= arg1.field424 && arg1.field496 < class430.field5984) {
                            arg1.field467 = class430.field5984 + 1;
                            break label409;
                        }
                    }
                    if (var8 == null || var8.field6307 == null) {
                        arg1.field453 = -1;
                    } else {
                        if (arg1.field481 < 0) {
                            arg1.field481 = 0;
                            class311.method1870(0, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var8, arg1.field3925);
                        }
                        arg1.field429++;
                        if (arg1.field481 < var8.field6307.length && var8.field6319[arg1.field481] < arg1.field429) {
                            arg1.field429 = 1;
                            arg1.field481++;
                            class311.method1870(arg1.field481, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var8, arg1.field3925);
                        }
                        if (var8.field6307.length <= arg1.field481) {
                            if (var6.field4811) {
                                arg1.field481 -= var8.field6332;
                                arg1.field495++;
                                if (var8.field6326 <= arg1.field495) {
                                    arg1.field453 = -1;
                                } else if (arg1.field481 >= 0 && arg1.field481 < var8.field6307.length) {
                                    class311.method1870(arg1.field481, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var8, arg1.field3925);
                                } else {
                                    arg1.field453 = -1;
                                }
                            } else {
                                arg1.field453 = -1;
                            }
                        }
                        arg1.field476 = arg1.field481 + 1;
                        if (arg1.field476 >= var8.field6307.length) {
                            if (var6.field4811) {
                                arg1.field476 -= var8.field6332;
                                if ((arg1.field495 + 1) >= var8.field6326) {
                                    arg1.field476 = -1;
                                } else if (arg1.field476 < 0 || arg1.field476 >= var8.field6307.length) {
                                    arg1.field476 = -1;
                                }
                            } else {
                                arg1.field476 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field459 != -1 && arg1.field492 <= 1) {
            class463 var9 = class77.field971.method776(arg1.field459, (byte) -88);
            if (var9.field6316 == 3) {
                if (arg1.field521 > 0 && class430.field5984 >= arg1.field424 && class430.field5984 > arg1.field496) {
                    arg1.field459 = -1;
                }
            } else if (var9.field6316 == 1 && arg1.field521 > 0 && arg1.field424 <= class430.field5984 && class430.field5984 > arg1.field496) {
                arg1.field492 = 2;
            }
        }
        if (arg0 != -75) {
            return;
        }
        if (arg1.field459 != -1 && arg1.field492 == 0) {
            class463 var10 = class77.field971.method776(arg1.field459, (byte) 121);
            if (var10 == null || var10.field6307 == null) {
                arg1.field459 = -1;
            } else {
                arg1.field507++;
                if (arg1.field457 < var10.field6307.length && var10.field6319[arg1.field457] < arg1.field507) {
                    arg1.field507 = 1;
                    arg1.field457++;
                    class311.method1870(arg1.field457, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var10, arg1.field3925);
                }
                if (arg1.field457 >= var10.field6307.length) {
                    arg1.field457 -= var10.field6332;
                    arg1.field433++;
                    if (arg1.field433 >= var10.field6326) {
                        arg1.field459 = -1;
                    } else if (arg1.field457 >= 0 && var10.field6307.length > arg1.field457) {
                        class311.method1870(arg1.field457, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var10, arg1.field3925);
                    } else {
                        arg1.field459 = -1;
                    }
                }
                arg1.field462 = arg1.field457 + 1;
                if (arg1.field462 >= var10.field6307.length) {
                    arg1.field462 -= var10.field6332;
                    if (var10.field6326 <= (arg1.field433 + 1)) {
                        arg1.field462 = -1;
                    } else if (arg1.field462 < 0 || arg1.field462 >= var10.field6307.length) {
                        arg1.field462 = -1;
                    }
                }
                arg1.field479 = var10.field6325;
            }
        }
        if (arg1.field492 > 0) {
            arg1.field492--;
        }
        for (int var11 = 0; var11 < arg1.field440.length; var11++) {
            class589 var12 = arg1.field440[var11];
            if (var12 != null) {
                if (var12.field8092 > 0) {
                    var12.field8092--;
                } else {
                    class463 var13 = class77.field971.method776(var12.field8091, (byte) 91);
                    if (var13 == null || var13.field6307 == null) {
                        arg1.field440[var11] = null;
                    } else {
                        var12.field8083++;
                        if (var12.field8089 < var13.field6307.length && var13.field6319[var12.field8089] < var12.field8083) {
                            var12.field8083 = 1;
                            var12.field8089++;
                            class311.method1870(var12.field8089, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var13, arg1.field3925);
                        }
                        if (var12.field8089 >= var13.field6307.length) {
                            var12.field8089 -= var13.field6332;
                            var12.field8090++;
                            if (var13.field6326 <= var12.field8090) {
                                arg1.field440[var11] = null;
                            } else if (var12.field8089 >= 0 && var12.field8089 < var13.field6307.length) {
                                class311.method1870(var12.field8089, arg1.field3917, (byte) 1, class596.field8164 == arg1, arg1.field3929, var13, arg1.field3925);
                            } else {
                                arg1.field440[var11] = null;
                            }
                        }
                        var12.field8088 = var12.field8089 + 1;
                        if (var13.field6307.length <= var12.field8088) {
                            var12.field8088 -= var13.field6332;
                            if (var13.field6326 <= (var12.field8090 + 1)) {
                                var12.field8088 = -1;
                            } else if (var12.field8088 < 0 || var13.field6307.length <= var12.field8088) {
                                var12.field8088 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
