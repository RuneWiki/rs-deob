import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class130 extends class115 {

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "Lek;")
    public class183 field1984 = new class183();

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "Lli;")
    public class218 field1988 = new class218();

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "Lbe;")
    private class297 field1987;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field1980 = 0;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Lej;")
    public static class158 field1975;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Lcm;")
    public static class192 field1979;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "Lah;")
    public static class205 field1986;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "()I", line = 4)
    public final int method452() {
        field1977++;
        return 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIILbb;[IB)V", line = 25)
    private final void method825(int arg0, int arg1, int arg2, class92 arg3, int[] arg4, byte arg5) {
        int var7 = 77 % ((arg5 - 65) / 55);
        if ((this.field1987.field5104[arg3.field1292] & 0x4) != 0 && arg3.field1297 < 0) {
            int var8 = this.field1987.field5084[arg3.field1292] / class252.field4337;
            while (true) {
                int var9 = (var8 + 1048575 - arg3.field1289) / var8;
                if (var9 > arg1) {
                    arg3.field1289 += arg1 * var8;
                    break;
                }
                arg3.field1315.method445(arg4, arg0, var9);
                arg1 -= var9;
                arg3.field1289 += var8 * var9 - 1048576;
                class71 var10 = arg3.field1315;
                int var11 = 262144 / var8;
                arg0 += var9;
                int var12 = class252.field4337 / 100;
                if (var11 < var12) {
                    var12 = var11;
                }
                if (this.field1987.field5135[arg3.field1292] == 0) {
                    arg3.field1315 = class71.method454(arg3.field1301, var10.method476(), var10.method480(), var10.method457());
                } else {
                    arg3.field1315 = class71.method454(arg3.field1301, var10.method476(), 0, var10.method457());
                    this.field1987.method2058(arg3, arg3.field1295.field2218[arg3.field1290] < 0, (byte) -128);
                    arg3.field1315.method462(var12, var10.method480());
                }
                if (arg3.field1295.field2218[arg3.field1290] < 0) {
                    arg3.field1315.method453(-1);
                }
                var10.method459(var12);
                var10.method445(arg4, arg0, arg2 - arg0);
                if (var10.method481()) {
                    this.field1988.method1491(var10);
                }
            }
        }
        field1983++;
        arg3.field1315.method445(arg4, arg0, arg1);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 87)
    public final void method446(int arg0) {
        field1973++;
        this.field1988.method446(arg0);
        for (class92 var2 = (class92) this.field1984.method1221((byte) 49); var2 != null; var2 = (class92) this.field1984.method1223(117)) {
            if (!this.field1987.method2050(var2, 16)) {
                int var3 = arg0;
                do {
                    if (var2.field1306 >= var3) {
                        this.method828(var2, (byte) -124, var3);
                        var2.field1306 -= var3;
                        break;
                    }
                    this.method828(var2, (byte) 121, var2.field1306);
                    var3 -= var2.field1306;
                } while (!this.field1987.method2069((int[]) null, var2, var3, true, 0));
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "([III)V", line = 122)
    public final void method445(int[] arg0, int arg1, int arg2) {
        field1972++;
        this.field1988.method445(arg0, arg1, arg2);
        for (class92 var4 = (class92) this.field1984.method1221((byte) 55); var4 != null; var4 = (class92) this.field1984.method1223(103)) {
            if (!this.field1987.method2050(var4, 16)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1306) {
                        this.method825(var6, var5, var5 + var6, var4, arg0, (byte) 127);
                        var4.field1306 -= var5;
                        break;
                    }
                    this.method825(var6, var4.field1306, var5 + var6, var4, arg0, (byte) 125);
                    var6 += var4.field1306;
                    var5 -= var4.field1306;
                } while (!this.field1987.method2069(arg0, var4, var5, true, var6));
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()Lnh;", line = 163)
    public final class115 method461() {
        field1985++;
        class92 var1;
        do {
            var1 = (class92) this.field1984.method1223(112);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1315 == null);
        return var1.field1315;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V", line = 187)
    public static final void method826(int arg0) {
        field1976++;
        int var1 = class310.field5307 * 128 + 64;
        int var2 = class17.field241 * 128 + 64;
        int var3 = class154.method1031(108, var1, class23.field400, var2) - class127.field1797;
        if (class92.field1299 >= 100) {
            class80.field1129 = class17.field241 * 128 + 64;
            class224.field3639 = class310.field5307 * 128 + 64;
            class27.field470 = class154.method1031(83, class224.field3639, class23.field400, class80.field1129) - class127.field1797;
        } else {
            if (class27.field470 < var3) {
                class27.field470 += (var3 - class27.field470) * class92.field1299 / 1000 + class290.field4931;
                if (var3 < class27.field470) {
                    class27.field470 = var3;
                }
            }
            if (class80.field1129 < var2) {
                class80.field1129 += (var2 - class80.field1129) * class92.field1299 / 1000 + class290.field4931;
                if (var2 < class80.field1129) {
                    class80.field1129 = var2;
                }
            }
            if (var1 > class224.field3639) {
                class224.field3639 += (var1 - class224.field3639) * class92.field1299 / 1000 + class290.field4931;
                if (class224.field3639 > var1) {
                    class224.field3639 = var1;
                }
            }
            if (var2 < class80.field1129) {
                class80.field1129 -= class290.field4931 + ((class80.field1129 - var2) * class92.field1299 / 1000);
                if (class80.field1129 < var2) {
                    class80.field1129 = var2;
                }
            }
            if (class224.field3639 > var1) {
                class224.field3639 -= class290.field4931 + ((class224.field3639 - var1) * class92.field1299 / 1000);
                if (var1 > class224.field3639) {
                    class224.field3639 = var1;
                }
            }
            if (var3 < class27.field470) {
                class27.field470 -= (class27.field470 - var3) * class92.field1299 / 1000 + class290.field4931;
                if (class27.field470 < var3) {
                    class27.field470 = var3;
                }
            }
        }
        int var4 = class48.field756 * 128 + 64;
        int var5 = class239.field3918 * 128 + 64;
        if (arg0 != 14155) {
            return;
        }
        int var6 = class154.method1031(44, var4, class23.field400, var5) - class141.field2164;
        int var7 = var6 - class27.field470;
        int var8 = var5 - class80.field1129;
        int var9 = var4 - class224.field3639;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class223.field3634) {
            class223.field3634 += (var11 - class223.field3634) * class180.field2866 / 1000 + class174.field2790;
            if (var11 < class223.field3634) {
                class223.field3634 = var11;
            }
        }
        int var13 = var12 - class94.field1346;
        if (var11 < class223.field3634) {
            class223.field3634 -= (class223.field3634 - var11) * class180.field2866 / 1000 + class174.field2790;
            if (class223.field3634 < var11) {
                class223.field3634 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class94.field1346 += class180.field2866 * var13 / 1000 + class174.field2790;
            class94.field1346 &= 0x7FF;
        }
        if (var13 < 0) {
            class94.field1346 -= -var13 * class180.field2866 / 1000 + class174.field2790;
            class94.field1346 &= 0x7FF;
        }
        int var14 = var12 - class94.field1346;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class94.field1346 = var12;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()Lnh;", line = 346)
    public final class115 method482() {
        field1982++;
        class92 var1 = (class92) this.field1984.method1221((byte) 116);
        if (var1 == null) {
            return null;
        } else if (var1.field1315 == null) {
            return this.method461();
        } else {
            return var1.field1315;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V", line = 370)
    public static void method827(boolean arg0) {
        field1986 = null;
        field1979 = null;
        field1975 = null;
        if (arg0) {
            method827(false);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lbb;BI)V", line = 385)
    private final void method828(class92 arg0, byte arg1, int arg2) {
        field1981++;
        if ((this.field1987.field5104[arg0.field1292] & 0x4) != 0 && arg0.field1297 < 0) {
            int var4 = this.field1987.field5084[arg0.field1292] / class252.field4337;
            int var5 = (var4 + 1048575 - arg0.field1289) / var4;
            arg0.field1289 = arg2 * var4 + arg0.field1289 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field1987.field5135[arg0.field1292] == 0) {
                    arg0.field1315 = class71.method454(arg0.field1301, arg0.field1315.method476(), arg0.field1315.method480(), arg0.field1315.method457());
                } else {
                    arg0.field1315 = class71.method454(arg0.field1301, arg0.field1315.method476(), 0, arg0.field1315.method457());
                    this.field1987.method2058(arg0, arg0.field1295.field2218[arg0.field1290] < 0, (byte) 122);
                }
                if (arg0.field1295.field2218[arg0.field1290] < 0) {
                    arg0.field1315.method453(-1);
                }
                arg2 = arg0.field1289 / var4;
            }
        }
        int var6 = 46 / ((-arg1 - 28) / 63);
        arg0.field1315.method446(arg2);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lbe;)V", line = 431)
    public class130(class297 arg0) {
        this.field1987 = arg0;
    }
}
