import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public abstract class class377 implements class318 {

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "Lla;")
    private class423 field5453;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "Lada;")
    public class390 field5449;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "Lla;")
    public class423 field5452;

    @OriginalMember(owner = "client!afa", name = "k", descriptor = "I")
    public static int field5458 = 0;

    @OriginalMember(owner = "client!afa", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5459 = null;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!afa", name = "m", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!afa", name = "n", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!afa", name = "p", descriptor = "I")
    private int field5463;

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "J")
    private long field5457;

    @OriginalMember(owner = "client!afa", name = "o", descriptor = "Lda;")
    private class400 field5462;

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "Lla;")
    public static class423 field5456;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V")
    public void method414(byte arg0) {
        field5460++;
        class502 var2 = class534.method3234(this.field5453, -121, this.field5449.field5616);
        if (arg0 <= 126) {
            method2341(-25);
        }
        this.field5462 = class211.field3164.method322(var2, class676.method3847(this.field5452, this.field5449.field5616), true);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)Z")
    public boolean method418(boolean arg0) {
        field5461++;
        boolean var2 = arg0;
        if (!this.field5452.method2609(0, this.field5449.field5616)) {
            var2 = false;
        }
        if (!this.field5453.method2609(0, this.field5449.field5616)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
    public static final void method2337(int arg0) {
        field5450++;
        class163.field2326 = new class143(8);
        class687.field9757 = 0;
        for (class27 var1 = (class27) class293.field4026.method1527(117); var1 != null; var1 = (class27) class293.field4026.method1523(true)) {
            var1.method132();
        }
        if (arg0 >= -97) {
            method2338((byte) -26);
        }
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(B)V")
    public static final void method2338(byte arg0) {
        class468.field6665 = 0;
        field5454++;
        if (arg0 <= 26) {
            return;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class481.field6874[var1] = null;
            class710.field10011[var1] = 1;
            class139.field1905[var1] = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IBIZ)V")
    public abstract void method417(int arg0, byte arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZB)V")
    public final void method678(boolean arg0, byte arg1) {
        field5448++;
        int var3 = this.field5449.field5625.method71(class758.field10546, (byte) 123, this.field5449.field5617) + this.field5449.field5620;
        int var4 = this.field5449.field5623.method995(this.field5449.field5613, class544.field7915, (byte) 125) + this.field5449.field5622;
        this.method413(arg0, var3, var4, -2);
        this.method417(var4, (byte) -115, var3, arg0);
        if (arg1 != -53) {
            this.field5462 = null;
        }
        String var5 = class703.field9912.method1432(arg1 ^ 0xFFFFFFB5);
        if (class465.method2818(255) - this.field5457 > 10000L) {
            var5 = var5 + " (" + class703.field9912.method1424(-5048).method2844((byte) -49) + ")";
        }
        this.field5462.method2424((byte) 106, -1, this.field5449.field5613 / 2 + var4 + this.field5449.field5614 + 4, this.field5449.field5617 / 2 + var3, var5, this.field5449.field5624);
    }

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "(B)I")
    public final int method2339(byte arg0) {
        field5455++;
        int var2 = class703.field9912.method1428(arg0 + 16777209);
        int var3 = var2 * 100;
        if (arg0 != 6) {
            this.method413(true, -60, 126, -35);
        }
        if (this.field5463 == var2 && var2 != 0) {
            int var4 = class703.field9912.method1422(0);
            if (var2 < var4) {
                long var5 = this.field5457 - class703.field9912.method1427((byte) 52);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class465.method2818(255) - this.field5457) * 10000L;
                    if (var7 > var9) {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field5463 = var2;
            this.field5457 = class465.method2818(255);
        }
        return var3;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIIZI)V")
    public static final void method2340(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field5451++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class343.field4719 - class84.field1253) * var6 / 100 + class84.field1253;
        if (class123.field1686 > var7) {
            var7 = class123.field1686;
        } else if (var7 > class613.field8761) {
            var7 = class613.field8761;
        }
        int var8 = arg3 * var7 * 512 / (arg1 * 334);
        if (var8 < class553.field8050) {
            short var9 = class553.field8050;
            var7 = arg1 * 334 * var9 / (arg3 * 512);
            if (var7 > class613.field8761) {
                var7 = class613.field8761;
                int var10 = arg3 * var7 * 512 / (var9 * 334);
                int var11 = (arg1 - var10) / 2;
                if (arg4) {
                    class211.field3164.method328();
                    class211.field3164.method3263((byte) -95, arg2, arg3, var11, arg0, -16777216);
                    class211.field3164.method3263((byte) -104, arg1 + arg2 - var11, arg3, var11, arg0, -16777216);
                }
                arg1 -= var11 * 2;
                arg2 += var11;
            }
        } else if (var8 > class600.field8520) {
            short var12 = class600.field8520;
            var7 = arg1 * 334 * var12 / (arg3 * 512);
            if (var7 < class123.field1686) {
                var7 = class123.field1686;
                int var13 = arg1 * var12 * 334 / (var7 * 512);
                int var14 = (arg3 - var13) / 2;
                if (arg4) {
                    class211.field3164.method328();
                    class211.field3164.method3263((byte) -91, arg2, var14, arg1, arg0, -16777216);
                    class211.field3164.method3263((byte) -95, arg2, var14, arg1, arg0 + arg3 - var14, -16777216);
                }
                arg0 += var14;
                arg3 -= var14 * 2;
            }
        }
        class647.field9331 = (short) arg1;
        class438.field6258 = (short) arg3;
        class17.field170 = arg0;
        int var15 = 7 / ((arg5 - 29) / 40);
        class91.field1290 = arg2;
        class375.field5423 = arg3 * var7 / 334;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZIII)V")
    public abstract void method413(boolean arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V")
    public static void method2341(int arg0) {
        field5459 = null;
        if (arg0 != 100) {
            field5456 = null;
        }
        field5456 = null;
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lla;Lla;Lada;)V")
    public class377(class423 arg0, class423 arg1, class390 arg2) {
        this.field5453 = arg1;
        this.field5449 = arg2;
        this.field5452 = arg0;
    }
}
