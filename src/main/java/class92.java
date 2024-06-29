import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class92 extends class254 {

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field1401 = 3;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Z")
    public final boolean method621(int arg0) {
        if (arg0 != -17417) {
            method624((byte) 67);
        }
        field1396++;
        return ((this.field1395 & 0x48E7BBD6) >> 30) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)Z")
    public final boolean method622(int arg0) {
        int var2 = 37 / ((40 - arg0) / 40);
        field1390++;
        return (this.field1395 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)Z")
    public final boolean method623(boolean arg0) {
        if (!arg0) {
            field1401 = -72;
        }
        field1394++;
        return (this.field1395 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method624(byte arg0) {
        int var1 = -15 % ((arg0 + 51) / 55);
        field1404++;
        class68.field1071.method521(-116);
        int var2 = class68.field1071.method531((byte) -126, 1);
        if (var2 == 0) {
            return;
        }
        int var3 = class68.field1071.method531((byte) -17, 2);
        if (var3 == 0) {
            class60.field909[class282.field4501++] = 2047;
        } else if (var3 == 1) {
            int var4 = class68.field1071.method531((byte) -125, 3);
            class55.field847.method68(var4, 1, true);
            int var5 = class68.field1071.method531((byte) 93, 1);
            if (var5 == 1) {
                class60.field909[class282.field4501++] = 2047;
            }
        } else if (var3 == 2) {
            if (class68.field1071.method531((byte) 2, 1) == 1) {
                int var7 = class68.field1071.method531((byte) 12, 3);
                class55.field847.method68(var7, 2, true);
                int var8 = class68.field1071.method531((byte) 56, 3);
                class55.field847.method68(var8, 2, true);
            } else {
                int var6 = class68.field1071.method531((byte) -128, 3);
                class55.field847.method68(var6, 0, true);
            }
            int var9 = class68.field1071.method531((byte) 0, 1);
            if (var9 == 1) {
                class60.field909[class282.field4501++] = 2047;
            }
        } else if (var3 == 3) {
            int var10 = class68.field1071.method531((byte) -126, 1);
            if (var10 == 1) {
                class60.field909[class282.field4501++] = 2047;
            }
            class163.field2364 = class68.field1071.method531((byte) -128, 2);
            int var11 = class68.field1071.method531((byte) -127, 7);
            int var12 = class68.field1071.method531((byte) 99, 7);
            int var13 = class68.field1071.method531((byte) 106, 1);
            class55.field847.method353(var11, var13 == 1, var12, -101);
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)Z")
    public final boolean method625(int arg0) {
        if (arg0 > -74) {
            field1401 = 108;
        }
        field1392++;
        return (this.field1395 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)I")
    public final int method626(byte arg0) {
        if (arg0 != 107) {
            this.field1395 = -120;
        }
        field1398++;
        return class171.method1128(arg0 - 108, this.field1395);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLvi;)V")
    public static final void method627(boolean arg0, class5 arg1) {
        if (class82.field1267 == arg1.field93 || arg1.field98 == -1 || arg1.field88 != 0 || (arg1.field133 + 1) > class70.method478(arg1.field98, false).field2825[arg1.field38]) {
            int var2 = arg1.field93 - arg1.field76;
            int var3 = class82.field1267 - arg1.field76;
            int var4 = arg1.field43 * 128 + (arg1.method57(0) * 64);
            int var5 = arg1.field49 * 128 + (arg1.method57(0) * 64);
            int var6 = arg1.field135 * 128 + (arg1.method57(0) * 64);
            int var7 = arg1.field121 * 128 + arg1.method57(0) * 64;
            arg1.field45 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg1.field94 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
        }
        if (arg1.field92 == 0) {
            arg1.field127 = 1024;
        }
        arg1.field124 = 0;
        if (arg1.field92 == 1) {
            arg1.field127 = 1536;
        }
        field1402++;
        if (arg0) {
            method624((byte) 68);
        }
        if (arg1.field92 == 2) {
            arg1.field127 = 0;
        }
        if (arg1.field92 == 3) {
            arg1.field127 = 512;
        }
        arg1.field104 = arg1.field127;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Z")
    public final boolean method628(byte arg0) {
        field1405++;
        int var2 = 118 % ((arg0 + 13) / 57);
        return (this.field1395 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)Z")
    public final boolean method629(byte arg0) {
        field1393++;
        if (arg0 > -116) {
            return false;
        } else {
            return ((this.field1395 & 0x3B1F02C2) >> 29) != 0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(II)V")
    public class92(int arg0, int arg1) {
        this.field1400 = arg1;
        this.field1395 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)Z")
    public final boolean method630(int arg0) {
        field1399++;
        if (arg0 != 1) {
            this.field1400 = -103;
        }
        return (this.field1395 & 0x4C5030) >> 22 != 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Z")
    public final boolean method631(byte arg0, int arg1) {
        if (arg0 == -55) {
            field1403++;
            return (this.field1395 >> arg1 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)I")
    public final int method632(byte arg0) {
        field1391++;
        if (arg0 >= -89) {
            this.method625(69);
        }
        return (this.field1395 & 0x1D549F) >> 18;
    }
}
