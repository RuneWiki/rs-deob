import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class219 {

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field3694 = 0;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3691 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field3700 = 0;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "[I")
    public static int[] field3699 = new int[5];

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "J")
    public static volatile long field3697 = 0L;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field3695 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILvl;B)V")
    public static final void method1557(int arg0, int arg1, int arg2, class54 arg3, byte arg4) {
        field3698++;
        if (class287.field4747 >= 400) {
            return;
        }
        if (arg3.field904 != null) {
            arg3 = arg3.method343(-1);
        }
        if (arg3 == null || !arg3.field943) {
            return;
        }
        String var5 = arg3.field940;
        int var6 = 32 % ((arg4 - 8) / 59);
        if (arg3.field939 != 0) {
            String var7 = class43.field659 == 1 ? class119.field2000 : class134.field2205;
            var5 = var5 + class25.method158(5, class16.field314.field2073, arg3.field939) + " (" + var7 + arg3.field939 + ")";
        }
        if (class272.field4554 == 1) {
            class289.method2009(arg2, class46.field813 + " -> <col=ffff00>" + var5, true, (long) arg0, arg1, class135.field2222, class245.field4116, (short) 22);
            class263.field4389++;
        } else if (class302.field4918) {
            class86 var15 = class91.field1515 == -1 ? null : class69.method471(class91.field1515, (byte) 28);
            if ((class30.field497 & 0x2) != 0 && var15 == null || arg3.method334((byte) -73, var15.field1423, class91.field1515) != var15.field1423) {
                class145.field2392++;
                class289.method2009(arg2, class93.field1517 + " -> <col=ffff00>" + var5, true, (long) arg0, arg1, class169.field2741, class238.field4011, (short) 44);
            }
        } else {
            class90.field1481++;
            String[] var8 = arg3.field951;
            if (class73.field1282) {
                var8 = class248.method1760((byte) 121, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class43.field659 != 0 || !var8[var9].equalsIgnoreCase(class109.field1798))) {
                        class244.field4089++;
                        byte var10 = 0;
                        if (var9 == 0) {
                            var10 = 6;
                        }
                        int var11 = -1;
                        if (arg3.field901 == var9) {
                            var11 = arg3.field917;
                        }
                        if (var9 == 1) {
                            var10 = 11;
                        }
                        if (arg3.field927 == var9) {
                            var11 = arg3.field896;
                        }
                        if (var9 == 2) {
                            var10 = 7;
                        }
                        if (var9 == 3) {
                            var10 = 30;
                        }
                        if (var9 == 4) {
                            var10 = 39;
                        }
                        class289.method2009(arg2, "<col=ffff00>" + var5, true, (long) arg0, arg1, var11, var8[var9], var10);
                    }
                }
            }
            if (class43.field659 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class109.field1798)) {
                        client.field1631++;
                        short var13 = 0;
                        if (class16.field314.field2073 < arg3.field939) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 6;
                        }
                        if (var12 == 1) {
                            var14 = 11;
                        }
                        if (var12 == 2) {
                            var14 = 7;
                        }
                        if (var12 == 3) {
                            var14 = 30;
                        }
                        if (var12 == 4) {
                            var14 = 39;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class289.method2009(arg2, "<col=ffff00>" + var5, true, (long) arg0, arg1, arg3.field903, var8[var12], var14);
                    }
                }
            }
            class289.method2009(arg2, "<col=ffff00>" + var5, true, (long) arg0, arg1, class256.field4327, class113.field1925, (short) 1008);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)Z")
    public static final boolean method1558(byte arg0, int arg1) {
        if (arg0 < 44) {
            field3700 = 5;
        }
        class227.field3845 = arg1 + 1 & 0xFFFF;
        class203.field3255 = true;
        field3693++;
        return true;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static final void method1559(byte arg0) {
        class45.field703.method97(92);
        field3690++;
        if (arg0 != -121) {
            field3699 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLab;)V")
    public final void method1560(byte arg0, class249 arg1) {
        field3692++;
        while (true) {
            int var3 = arg1.method1802((byte) 118);
            if (var3 == 0) {
                if (arg0 == 64) {
                    return;
                } else {
                    this.field3694 = 91;
                    return;
                }
            }
            this.method1562((byte) 124, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method1561(int arg0) {
        field3699 = null;
        if (arg0 != -3) {
            method1561(-120);
        }
        field3691 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLab;I)V")
    private final void method1562(byte arg0, class249 arg1, int arg2) {
        if (arg2 == 5) {
            this.field3694 = arg1.method1821((byte) 51);
        }
        int var4 = -96 / ((arg0 - 68) / 47);
        field3689++;
    }
}
