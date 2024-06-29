import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class136 extends class232 {

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    private int field2343 = 0;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    private int field2346 = 20;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    private int field2349 = 1365;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
    private int field2353 = 0;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Lhi;")
    private static class82 field2340 = class95.method664((byte) -113, "Allocated memory");

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "Lhi;")
    public static class82 field2350 = field2340;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "Lum;")
    public static class222 field2344;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 24)
    public class136() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBLbc;)V", line = 44)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field2349 = arg2.method1090(false);
        } else if (arg0 == 1) {
            this.field2346 = arg2.method1090(false);
        } else if (arg0 == 2) {
            this.field2353 = arg2.method1090(false);
        } else if (arg0 == 3) {
            this.field2343 = arg2.method1090(false);
        }
        if (arg1 != -19) {
            method929((byte) -32);
        }
        field2341++;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(IB)Lbi;", line = 83)
    public static final class204 method927(int arg0, byte arg1) {
        field2352++;
        class204 var2 = (class204) class230.field3972.method2250((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -86) {
            method927(5, (byte) 93);
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class302.field5153.method1577(0, arg0 & 0x7FFF, -29569);
        } else {
            var3 = class105.field1855.method1577(0, arg0, -29569);
        }
        class204 var4 = new class204();
        if (var3 != null) {
            var4.method1465(new class153(var3), -101);
        }
        if (arg0 >= 32768) {
            var4.method1464((byte) 71);
        }
        class230.field3972.method2255(var4, (long) arg0, false);
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBIZZIIZ)Ljf;", line = 121)
    public static final class86 method928(int arg0, byte arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        class312 var8 = class273.method1912(arg2, -100);
        field2351++;
        if (arg5 > 1 && var8.field5341 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field5342[var10] <= arg5 && var8.field5342[var10] != 0) {
                    var9 = var8.field5341[var10];
                }
            }
            if (var9 != -1) {
                var8 = class273.method1912(var9, -74);
            }
        }
        class318 var11 = var8.method2155(24134);
        if (var11 == null) {
            return null;
        }
        class303 var12 = null;
        if (var8.field5370 != -1) {
            var12 = (class303) method928(0, (byte) 117, var8.field5339, true, true, 10, 1, false);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field5387 != -1) {
            var12 = (class303) method928(arg0, (byte) 102, var8.field5390, true, false, arg5, arg6, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class320.field5531;
        int[] var14 = new int[4];
        int var15 = class320.field5529;
        int var16 = class320.field5528;
        class320.method2204(var14);
        class303 var17 = new class303(36, 32);
        class320.method2221(var17.field5160, 36, 32);
        class102.method696();
        class102.method700(16, 16);
        int var18 = 119 / ((arg1 - 12) / 63);
        class102.field1815 = false;
        int var19 = var8.field5363;
        if (arg4) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg6 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class102.field1819[var8.field5360] * var19 >> 16;
        int var21 = class102.field1813[var8.field5360] * var19 >> 16;
        var11.method193(0, var8.field5389, var8.field5343, var8.field5360, var8.field5386, var21 + var8.field5377 - (var11.method238() / 2), var8.field5377 + var20, -1L);
        if (arg6 >= 1) {
            var17.method2100(1);
            if (arg6 >= 2) {
                var17.method2100(16777215);
            }
            class320.method2221(var17.field5160, 36, 32);
        }
        if (arg0 != 0) {
            var17.method2093(arg0);
        }
        if (var8.field5370 != -1) {
            var12.method600(0, 0);
        } else if (var8.field5387 != -1) {
            class320.method2221(var12.field5160, 36, 32);
            var17.method600(0, 0);
            var17 = var12;
        }
        if (arg7 && (var8.field5357 == 1 || arg5 != 1) && arg5 != -1) {
            class242.field4205.method112(class321.method2223(arg5, 1000000), 0, 9, 16776960, 1);
        }
        class320.method2221(var13, var16, var15);
        class320.method2203(var14);
        class102.method696();
        class102.field1815 = true;
        return class147.field2485 && !arg3 ? new class210(var17) : var17;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V", line = 247)
    public static void method929(byte arg0) {
        if (arg0 > 110) {
            field2344 = null;
            field2350 = null;
            field2340 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IB)[I", line = 269)
    public final int[] method80(int arg0, byte arg1) {
        int var3 = 123 % ((-arg1 - 31) / 55);
        field2345++;
        int[] var4 = this.field4008.method131((byte) -72, arg0);
        if (this.field4008.field256) {
            for (int var5 = 0; var5 < class54.field858; var5++) {
                int var6 = (class24.field329[var5] << 12) / this.field2349 + this.field2353;
                int var7 = (class273.field4607[arg0] << 12) / this.field2349 + this.field2343;
                int var8 = var7;
                int var9 = var6;
                int var10 = var6 * var6 >> 12;
                int var11 = var6;
                int var12 = var7;
                int var13 = 0;
                for (int var14 = var7 * var7 >> 12; var10 + var14 < 16384 && var13 < this.field2346; var14 = var12 * var12 >> 12) {
                    var12 = (var11 * var12 >> 12) * 2 + var8;
                    var13++;
                    var11 = var10 + var9 - var14;
                    var10 = var11 * var11 >> 12;
                }
                var4[var5] = var13 >= (this.field2346 - 1) ? 0 : (var13 << 12) / this.field2346;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)Ltf;", line = 324)
    public static final class123 method930(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class123 var4 = var3.field161;
            var3.field161 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V", line = 338)
    public static final void method931(byte arg0, int arg1) {
        class133 var2 = class254.field4368;
        synchronized (class254.field4368) {
            class112.field2035 = arg1;
            if (arg0 <= 119) {
                method928(-69, (byte) 77, 89, true, true, -102, -25, false);
            }
        }
        field2347++;
    }
}
