import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class526 {

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public int field7672 = 0;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field7673 = 0;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "Lge;")
    private class511 field7676 = new class511(64);

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "Lke;")
    private class432 field7677 = null;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "Lci;")
    private class320 field7671;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Lci;")
    private class320 field7670;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method3116(int arg0, int arg1, int arg2) {
        int var3 = class121.field1894[arg0][arg1][arg2];
        if (-class226.field3411 == var3) {
            return false;
        } else if (class226.field3411 == var3) {
            return true;
        } else {
            int var4 = arg1 << class322.field4795;
            int var5 = arg2 << class322.field4795;
            if (class544.method3193(var4 + 1, class146.field2262[arg0].method156(arg1, arg2), var5 + 1) && class544.method3193(class291.field4317 + var4 - 1, class146.field2262[arg0].method156(arg1 + 1, arg2), var5 + 1) && class544.method3193(class291.field4317 + var4 - 1, class146.field2262[arg0].method156(arg1 + 1, arg2 + 1), class291.field4317 + var5 - 1) && class544.method3193(var4 + 1, class146.field2262[arg0].method156(arg1, arg2 + 1), class291.field4317 + var5 - 1) && class544.method3193(class185.field2738 + var4, class146.field2262[arg0].method156(arg1, arg2), var5 + 1) && class544.method3193(class291.field4317 + var4 - 1, class146.field2262[arg0].method156(arg1 + 1, arg2), class185.field2738 + var5) && class544.method3193(class185.field2738 + var4, class146.field2262[arg0].method156(arg1, arg2 + 1), class291.field4317 + var5 - 1) && class544.method3193(class291.field4317 + var4 - 1, class146.field2262[arg0].method156(arg1, arg2), class185.field2738 + var5) && class544.method3193(class185.field2738 + var4, class146.field2262[arg0].method156(arg1, arg2), class185.field2738 + var5)) {
                class121.field1894[arg0][arg1][arg2] = class226.field3411;
                return true;
            } else {
                class121.field1894[arg0][arg1][arg2] = -class226.field3411;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Z", line = 36)
    public static final boolean method3117(int arg0, byte arg1) {
        if (arg1 == -87) {
            field7674++;
            return arg0 == 6 || arg0 == 3 || arg0 == 1008 || arg0 == 51 || arg0 == 11;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lvr;[IJI)Ljava/lang/String;", line = 47)
    public final String method3118(class92 arg0, int[] arg1, long arg2, int arg3) {
        field7675++;
        if (arg3 != 1) {
            this.method3118(null, null, 51L, -15);
        }
        if (this.field7677 != null) {
            String var6 = this.field7677.method177((byte) -91, arg2, arg0, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lm;)V", line = 69)
    public static final void method3119(class130 arg0) {
        if (class234.field3499 >= 65535) {
            return;
        }
        class369 var1 = arg0.field2038;
        client.field3117[class234.field3499] = arg0;
        class42.field866[class234.field3499] = false;
        class234.field3499++;
        int var2 = arg0.field2028;
        if (arg0.field2036) {
            var2 = 0;
        }
        int var3 = arg0.field2028;
        if (arg0.field2032) {
            var3 = class251.field3740 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2261((byte) 96) + class185.field2738 - var1.method2260(true) >> class322.field4795;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2261((byte) 96) + var1.method2260(true) - class185.field2738 >> class322.field4795;
            if (var7 >= class337.field5000) {
                var7 = class337.field5000 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field2026[var5++];
                int var10 = (var1.method2264((byte) -86) + class185.field2738 - var1.method2260(true) >> class322.field4795) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class394.field5608) {
                    var11 = class394.field5608 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class297.field4444[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class297.field4444[var4][var12][var8] = var13 | (long) class234.field3499;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class297.field4444[var4][var12][var8] = var13 | (long) class234.field3499 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class297.field4444[var4][var12][var8] = var13 | (long) class234.field3499 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class297.field4444[var4][var12][var8] = var13 | (long) class234.field3499 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Lbp;", line = 161)
    public final class268 method3120(int arg0, int arg1) {
        field7669++;
        class268 var3 = (class268) this.field7676.method2982(0, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field7671.method2037(arg1 & 0x7FFF, (byte) 65, 1);
        } else {
            var4 = this.field7670.method2037(arg1, (byte) 54, 1);
        }
        class268 var5 = new class268();
        var5.field4036 = this;
        int var6 = 80 / ((29 - arg0) / 53);
        if (var4 != null) {
            var5.method1724(-1, new class519(var4));
        }
        if (arg1 >= 32768) {
            var5.method1726(32768);
        }
        this.field7676.method2981(var5, 63, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(ILci;Lci;Lke;)V", line = 210)
    public class526(int arg0, class320 arg1, class320 arg2, class432 arg3) {
        this.field7671 = arg2;
        this.field7677 = arg3;
        this.field7670 = arg1;
        if (this.field7670 != null) {
            this.field7672 = this.field7670.method2030(-10914, 1);
        }
        if (this.field7671 != null) {
            this.field7673 = this.field7671.method2030(-10914, 1);
        }
    }
}
