import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class57 extends class184 {

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field909 = 0;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field911 = 0;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "[J")
    public static long[] field914 = new long[256];

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BII)V")
    public static final void method528(byte arg0, int arg1, int arg2) {
        field915++;
        class450 var3 = class59.method540(5, arg2, 1000);
        if (arg0 > 100) {
            var3.method2800(256);
            var3.field6498 = arg1;
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V")
    public static void method529(byte arg0) {
        if (arg0 >= -1) {
            method539((byte) 57);
        }
        field914 = null;
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)I")
    public abstract int method530(int arg0);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(CB)Z")
    public static final boolean method531(char arg0, byte arg1) {
        field908++;
        if (arg1 != 8) {
            field918 = -70;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZILhh;Lpe;III)V")
    public final void method532(boolean arg0, int arg1, class184 arg2, class391 arg3, int arg4, int arg5, int arg6) {
        int var8 = 13 % ((arg1 - 76) / 38);
        field901++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZILap;)V")
    public static final void method533(boolean arg0, int arg1, class289 arg2) {
        field905++;
        if (!arg0) {
            field918 = -98;
        }
        if (class315.field4275 == null) {
            return;
        }
        try {
            class315.field4275.method40(0L, 31788);
            class315.field4275.method44(arg2.field3882, -124, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
    public static final void method534(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class355.field4828.field3938 = 0;
        if (arg2 != 5) {
            field909 = -117;
        }
        field902++;
        class355.field4828.method1824(44, 20);
        class355.field4828.method1824(81, arg4);
        class355.field4828.method1824(103, arg0);
        class355.field4828.method1877(true, arg3);
        class355.field4828.method1877(true, arg1);
        class124.field1727 = 0;
        class199.field2841 = 1;
        class193.field2778 = 0;
        class77.field1159 = -3;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
    public final void method535(byte arg0) {
        if (arg0 <= 110) {
            method533(true, -25, (class289) null);
        }
        field912++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILsb;)V")
    public static final void method536(int arg0, class362 arg1) {
        field904++;
        if (arg1 instanceof class127) {
            class127 var2 = (class127) arg1;
            if (var2.field1784 != null) {
                class22.method284(var2, arg0 ^ 0x12C);
            }
        } else if ((arg1 instanceof class338)) {
            method538((byte) -47, (class338) arg1);
        } else {
            return;
        }
        if (arg0 != 0) {
            method539((byte) 94);
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)Z")
    public final boolean method537(int arg0) {
        if (arg0 > -48) {
            this.field917 = -54;
        }
        field903++;
        return false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLcc;)V")
    public static final void method538(byte arg0, class338 arg1) {
        field916++;
        if (class415.field5808 >= 400 || class95.field1379 == arg1) {
            return;
        }
        String var8;
        if (arg1.field4617 == 0) {
            boolean var2 = true;
            if (class95.field1379.field4580 != -1 && arg1.field4580 != -1) {
                int var3 = class95.field1379.field4599 > arg1.field4599 ? class95.field1379.field4599 : arg1.field4599;
                int var4 = arg1.field4580 > class95.field1379.field4580 ? class95.field1379.field4580 : arg1.field4580;
                int var5 = var3 * 10 / 100 + var4 + 5;
                int var6 = class95.field1379.field4599 - arg1.field4599;
                if (var6 < 0) {
                    var6 = -var6;
                }
                if (var6 > var5) {
                    var2 = false;
                }
            }
            String var7 = class42.field640 == 1 ? class5.field38 : class73.field1098;
            if (arg1.field4596 <= arg1.field4599) {
                var8 = arg1.method2144(true, false) + (var2 ? class404.method2478(class95.field1379.field4599, -4, arg1.field4599) : "<col=ffffff>") + " (" + var7 + arg1.field4599 + ")";
            } else {
                var8 = arg1.method2144(true, false) + (var2 ? class404.method2478(class95.field1379.field4599, -4, arg1.field4599) : "<col=ffffff>") + " (" + var7 + arg1.field4599 + "+" + (arg1.field4596 - arg1.field4599) + ")";
            }
        } else {
            var8 = arg1.method2144(true, false) + " (" + class255.field3459 + arg1.field4617 + ")";
        }
        if (class363.field5021 == 1) {
            class373.field5231++;
            class361.method2264(0, class336.field4552, class328.field4458, (long) arg1.field4957, -103, class21.field390 + " -> <col=ffffff>" + var8, 3, 0);
        } else if (!class3.field16) {
            for (int var9 = 7; var9 >= 0; var9--) {
                if (class410.field5742[var9] != null) {
                    short var10 = 0;
                    if (class42.field640 == 0 && class410.field5742[var9].equalsIgnoreCase(class149.field2290)) {
                        if (arg1.field4599 > class95.field1379.field4599) {
                            var10 = 2000;
                        }
                        if (class95.field1379.field4606 != 0 && arg1.field4606 != 0) {
                            if (class95.field1379.field4606 == arg1.field4606) {
                                var10 = 2000;
                            } else {
                                var10 = 0;
                            }
                        }
                    } else if (class107.field1568[var9]) {
                        var10 = 2000;
                    }
                    short var11 = (short) (class16.field184[var9] + var10);
                    int var12 = class398.field5571[var9] == -1 ? class82.field1210 : class398.field5571[var9];
                    class109.field1588++;
                    class361.method2264(0, var12, class410.field5742[var9], (long) arg1.field4957, arg0 - 66, "<col=ffffff>" + var8, var11, 0);
                }
            }
        } else if ((class280.field3750 & 0x8) != 0) {
            class94.field1371++;
            class361.method2264(0, class163.field2409, class166.field2465, (long) arg1.field4957, arg0 + 58, class326.field4421 + " -> <col=ffffff>" + var8, 48, 0);
        }
        if (arg0 != -47) {
            field914 = null;
        }
        for (class63 var13 = (class63) class268.field3613.method1240((byte) -94); var13 != null; var13 = (class63) class268.field3613.method1245(1)) {
            if (var13.field966 == 51) {
                var13.field959 = "<col=ffffff>" + var8;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(B)V")
    public static final void method539(byte arg0) {
        if (arg0 != 72) {
            return;
        }
        for (int var1 = 0; var1 < class212.field2943; var1++) {
            class170 var2 = class394.method2426(var1, -95);
            if (var2 != null && var2.field2514 == 0) {
                class125.field1744[var1] = 0;
                class414.field5782[var1] = 0;
            }
        }
        field906++;
        class184.field2671 = new class71(16);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIII)V")
    public class57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field910 = arg2;
        this.field913 = arg5;
        this.field919 = arg0;
        this.field920 = arg1;
        this.field917 = arg3;
        this.field922 = arg4;
        this.field921 = arg6;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field914[var0] = var1;
        }
    }
}
