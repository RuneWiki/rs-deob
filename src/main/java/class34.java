import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class34 {

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field357 = 0;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field368 = 0;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lrc;")
    public static class108 field349 = new class108(27, 8);

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Leo;")
    public static class443 field371 = new class443(0, 5);

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Lrc;")
    public static class108 field373 = null;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field372 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "[Lrn;")
    public static class417[] field358;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 8)
    public static final void method207(int arg0) {
        field346++;
        if (class329.field4561 == arg0) {
            return;
        }
        try {
            if (++class71.field1032 > 1500) {
                if (class394.field5440 != null) {
                    class394.field5440.method2095(false);
                    class394.field5440 = null;
                }
                if (class137.field1910 >= 1) {
                    class27.field280 = -5;
                    class329.field4561 = 0;
                    return;
                }
                if (class76.field1127 == class118.field1643) {
                    class118.field1643 = class46.field709;
                } else {
                    class118.field1643 = class76.field1127;
                }
                class71.field1032 = 0;
                class137.field1910++;
                class329.field4561 = 1;
            }
            if (class329.field4561 == 1) {
                class110.field1535 = class436.field6206.method595(class118.field1643, (byte) 87, class419.field5818);
                class329.field4561 = 2;
            }
            if (class329.field4561 == 2) {
                if (class110.field1535.field3979 == 2) {
                    throw new IOException();
                }
                if (class110.field1535.field3979 != 1) {
                    return;
                }
                class394.field5440 = new class332((Socket) class110.field1535.field3984, class436.field6206);
                class110.field1535 = null;
                class394.field5440.method2090(0, class311.field4403.field2262, (byte) -45, class311.field4403.field2298);
                if (class205.field3009 != null) {
                    class205.field3009.method1067((byte) 107);
                }
                if (class411.field5619 != null) {
                    class411.field5619.method1067((byte) 107);
                }
                int var1 = class394.field5440.method2088(arg0 ^ 0xFFFFFF92);
                if (class205.field3009 != null) {
                    class205.field3009.method1067((byte) 107);
                }
                if (class411.field5619 != null) {
                    class411.field5619.method1067((byte) 107);
                }
                if (var1 != 101) {
                    class27.field280 = var1;
                    class329.field4561 = 0;
                    class394.field5440.method2095(false);
                    class394.field5440 = null;
                    return;
                }
                class329.field4561 = 3;
            }
            if (class329.field4561 == 3 && class394.field5440.method2089(false) >= 2) {
                int var2 = class394.field5440.method2088(-119) << 8 | class394.field5440.method2088(-103);
                class97.method801(arg0 ^ 0xFFFFFFFC, var2);
                if (class379.field5212 == -1) {
                    class329.field4561 = 0;
                    class27.field280 = 6;
                    class394.field5440.method2095(false);
                    class394.field5440 = null;
                } else {
                    class329.field4561 = 0;
                    class394.field5440.method2095(false);
                    class394.field5440 = null;
                    class293.method1914(7);
                }
            }
        } catch (IOException var3) {
            if (class394.field5440 != null) {
                class394.field5440.method2095(false);
                class394.field5440 = null;
            }
            if (class137.field1910 < 1) {
                class137.field1910++;
                class71.field1032 = 0;
                class329.field4561 = 1;
                if (class76.field1127 == class118.field1643) {
                    class118.field1643 = class46.field709;
                } else {
                    class118.field1643 = class76.field1127;
                }
            } else {
                class27.field280 = -4;
                class329.field4561 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 160)
    public static final void method208(int arg0) {
        int var1 = 70 % ((arg0 + 20) / 62);
        field360++;
        for (class399 var2 = (class399) class236.field3436.method775(1); var2 != null; var2 = (class399) class236.field3436.method763(0)) {
            if (var2.field5477 > 0) {
                var2.field5477--;
            }
            if (var2.field5477 != 0) {
                if (var2.field5470 > 0) {
                    var2.field5470--;
                }
                if (var2.field5470 == 0 && var2.field5474 >= 1 && var2.field5482 >= 1 && (class36.field388 - 2) >= var2.field5474 && (class68.field998 - 2) >= var2.field5482 && (var2.field5476 < 0 || class86.method732(var2.field5479, var2.field5476, (byte) -123))) {
                    class7.method40(false, var2.field5478, var2.field5476, var2.field5475, var2.field5467, -1, var2.field5474, var2.field5482, var2.field5479);
                    var2.field5470 = -1;
                    if (var2.field5483 == var2.field5476 && var2.field5483 == -1) {
                        var2.method2714(-55);
                    } else if (var2.field5483 == var2.field5476 && var2.field5468 == var2.field5467 && var2.field5479 == var2.field5472) {
                        var2.method2714(-118);
                    }
                }
            } else if (var2.field5483 < 0 || class86.method732(var2.field5472, var2.field5483, (byte) -59)) {
                class7.method40(false, var2.field5478, var2.field5483, var2.field5475, var2.field5468, -1, var2.field5474, var2.field5482, var2.field5472);
                var2.method2714(111);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 231)
    public static void method209(byte arg0) {
        field371 = null;
        field349 = null;
        field358 = null;
        field373 = null;
        int var1 = -28 / ((73 - arg0) / 32);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lkk;ZI)V", line = 247)
    public static final void method210(class161 arg0, boolean arg1, int arg2) {
        field363++;
        if (!arg1 || class469.field6614 == null) {
            return;
        }
        try {
            class469.field6614.method1284(false, 0L);
            class469.field6614.method1281(-50, arg2, 24, arg0.field2262);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V", line = 269)
    public static final void method211(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -13782) {
            method211(-34, -63, -1, -80, -53);
        }
        field369++;
        if (arg4 <= arg0) {
            class61.method558(arg0, -10647, class373.field5141[arg2], arg4, arg1);
        } else {
            class61.method558(arg4, -10647, class373.field5141[arg2], arg0, arg1);
        }
    }
}
