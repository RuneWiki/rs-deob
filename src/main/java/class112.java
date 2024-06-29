import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class112 extends class273 {

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "Z")
    public boolean field1591;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "[Lpk;")
    public class112[] field1579;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "Lwm;")
    private static class152 field1576 = class157.method1048("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 118);

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field1580 = 0;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "Lwm;")
    public static class152 field1593 = field1576;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "F")
    public static float field1586;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "Lah;")
    public static class205 field1589;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "Lob;")
    public class290 field1585;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "Lq;")
    public class97 field1594;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)J", line = 9)
    public static final long method745(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field579; var4++) {
            class248 var5 = var3.field580[var4];
            if ((var5.field4156 >> 29 & 0x3L) == 2L && var5.field4157 == arg1 && var5.field4151 == arg2) {
                return var5.field4156;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)[I", line = 36)
    public int[] method53(byte arg0, int arg1) {
        field1584++;
        if (arg0 == -3) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return (int[]) null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V", line = 47)
    public static final void method746(byte arg0) {
        field1574++;
        if (arg0 <= 52) {
            method755(-27);
        }
        for (int var1 = 0; var1 < class233.field3826; var1++) {
            int var2 = class97.field1403[var1];
            class4 var3 = class40.field649[var2];
            if (var3 != null) {
                class248.method1700(var3, 10698, var3.field72.field3984);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)[[I", line = 75)
    public int[][] method55(int arg0, boolean arg1) {
        field1573++;
        if (arg1) {
            method749(-53, 116, 60, -29, (class73) null, (class73) null, -56, 84, 68L);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)V", line = 95)
    public final void method747(int arg0, int arg1, int arg2) {
        int var4 = 58 % ((-arg2 - 62) / 41);
        field1596++;
        int var5 = this.field1581 == 255 ? arg1 : this.field1581;
        if (this.field1591) {
            this.field1585 = new class290(var5, arg1, arg0);
        } else {
            this.field1594 = new class97(var5, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)I", line = 114)
    public int method748(int arg0) {
        field1575++;
        if (arg0 < 46) {
            this.method673(106);
        }
        return -1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIILv;Lv;IIJ)V", line = 138)
    public static final void method749(int arg0, int arg1, int arg2, int arg3, class73 arg4, class73 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class294 var10 = new class294();
        var10.field5019 = arg8;
        var10.field5024 = arg1 * 128 + 64;
        var10.field5027 = arg2 * 128 + 64;
        var10.field5020 = arg3;
        var10.field5026 = arg4;
        var10.field5028 = arg5;
        var10.field5029 = arg6;
        var10.field5025 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class287.field4857[var11][arg1][arg2] == null) {
                class287.field4857[var11][arg1][arg2] = new class34(var11, arg1, arg2);
            }
        }
        class287.field4857[arg0][arg1][arg2].field573 = var10;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILhi;)V", line = 176)
    public void method52(int arg0, int arg1, class291 arg2) {
        field1590++;
        if (arg0 != 31164) {
            this.method53((byte) 116, 114);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBI)[[I", line = 189)
    public final int[][] method750(int arg0, byte arg1, int arg2) {
        field1588++;
        if (arg1 != -17) {
            method753(-103, -9);
        }
        if (this.field1579[arg0].field1591) {
            int[] var4 = this.field1579[arg0].method53((byte) -3, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1579[arg0].method55(arg2, false);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(IZ)V", line = 224)
    public class112(int arg0, boolean arg1) {
        this.field1591 = arg1;
        this.field1579 = new class112[arg0];
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(IBI)[I", line = 235)
    public final int[] method751(int arg0, byte arg1, int arg2) {
        field1577++;
        if (arg1 <= 95) {
            return (int[]) null;
        } else if (this.field1579[arg2].field1591) {
            return this.field1579[arg2].method53((byte) -3, arg0);
        } else {
            return this.field1579[arg2].method55(arg0, false)[0];
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)I", line = 270)
    public int method752(int arg0) {
        field1582++;
        if (arg0 > -112) {
            field1593 = (class152) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V", line = 281)
    public static final void method753(int arg0, int arg1) {
        field1583++;
        if (arg0 != 20818) {
            method745(-24, 12, 4);
        }
        if (arg1 >= 0 && arg1 < class3.field48.length) {
            class3.field48[arg1] = !class3.field48[arg1];
        }
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)V", line = 299)
    public void method673(int arg0) {
        field1578++;
        if (arg0 != 8) {
            this.method52(-37, 57, (class291) null);
        }
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V", line = 310)
    public void method754(int arg0) {
        field1587++;
        if (arg0 != 128) {
            field1595 = -127;
        }
        if (this.field1591) {
            this.field1585.method1955((byte) 118);
            this.field1585 = null;
        } else {
            this.field1594.method655(-16256);
            this.field1594 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)V", line = 337)
    public static void method755(int arg0) {
        field1589 = null;
        field1593 = null;
        if (arg0 <= 26) {
            field1586 = -0.46367735F;
        }
        field1576 = null;
    }
}
