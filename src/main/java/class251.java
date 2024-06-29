import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class251 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "[I")
    public static int[] field3999 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4006 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field4012 = 0;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "J")
    public static long field4013 = 0L;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lnm;")
    public static class221 field4010;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Ld;")
    public static class69 field4011;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLnm;Lnm;Lnm;)V", line = 7)
    public static final void method1782(byte arg0, class221 arg1, class221 arg2, class221 arg3) {
        field4001++;
        class341.field5490 = arg1;
        class8.field107 = arg3;
        class44.field642 = arg2;
        if (arg0 != -73) {
            method1786((byte) -8, -126);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 20)
    public static void method1783(int arg0) {
        field4011 = null;
        field4010 = null;
        field4006 = null;
        field3999 = null;
        if (arg0 != 264093096) {
            field4012 = 65;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 33)
    public static final int method1784(String arg0, int arg1) {
        field4000++;
        if (arg0 == null) {
            return -1;
        }
        if (arg1 != -1) {
            method1786((byte) -24, -74);
        }
        for (int var2 = 0; var2 < class339.field5458; var2++) {
            if (arg0.equalsIgnoreCase(class31.field476[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 68)
    public static final void method1785(byte arg0) {
        int var1 = class24.field360 * 128 + 64;
        field4008++;
        int var2 = class15.field194 * 128 + 64;
        int var3 = client.method889(var2, class120.field1779, var1, -104) - class183.field2839;
        if (class236.field3737 < 100) {
            if (var3 > class74.field1117) {
                class74.field1117 += class224.field3514 + ((var3 - class74.field1117) * class236.field3737 / 1000);
                if (class74.field1117 > var3) {
                    class74.field1117 = var3;
                }
            }
            if (var2 > class41.field625) {
                class41.field625 += (var2 - class41.field625) * class236.field3737 / 1000 + class224.field3514;
                if (var2 < class41.field625) {
                    class41.field625 = var2;
                }
            }
            if (class41.field625 > var2) {
                class41.field625 -= (class41.field625 - var2) * class236.field3737 / 1000 + class224.field3514;
                if (var2 > class41.field625) {
                    class41.field625 = var2;
                }
            }
            if (var1 > class259.field4098) {
                class259.field4098 += (var1 - class259.field4098) * class236.field3737 / 1000 + class224.field3514;
                if (class259.field4098 > var1) {
                    class259.field4098 = var1;
                }
            }
            if (class259.field4098 > var1) {
                class259.field4098 -= class224.field3514 + ((class259.field4098 - var1) * class236.field3737 / 1000);
                if (class259.field4098 < var1) {
                    class259.field4098 = var1;
                }
            }
            if (class74.field1117 > var3) {
                class74.field1117 -= (class74.field1117 - var3) * class236.field3737 / 1000 + class224.field3514;
                if (var3 > class74.field1117) {
                    class74.field1117 = var3;
                }
            }
        } else {
            class41.field625 = class15.field194 * 128 + 64;
            class259.field4098 = class24.field360 * 128 + 64;
            class74.field1117 = client.method889(class41.field625, class120.field1779, class259.field4098, -103) - class183.field2839;
        }
        int var4 = -120 / ((arg0 - 3) / 60);
        int var5 = class355.field5629 * 128 + 64;
        int var6 = class170.field2662 * 128 + 64;
        int var7 = client.method889(var6, class120.field1779, var5, -100) - class190.field2948;
        int var8 = var7 - class74.field1117;
        int var9 = var5 - class259.field4098;
        int var10 = var6 - class41.field625;
        int var11 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var8, (double) var11) * 325.949D) & 0x7FF;
        int var13 = (int) (-325.949D * Math.atan2((double) var10, (double) var9)) & 0x7FF;
        int var14 = var13 - class147.field2369;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (var12 > class54.field817) {
            class54.field817 += class39.field602 + ((var12 - class54.field817) * class206.field3132 / 1000);
            if (class54.field817 > var12) {
                class54.field817 = var12;
            }
        }
        if (var14 > 0) {
            class147.field2369 += class206.field3132 * var14 / 1000 + class39.field602;
            class147.field2369 &= 0x7FF;
        }
        if (var14 < 0) {
            class147.field2369 -= -var14 * class206.field3132 / 1000 + class39.field602;
            class147.field2369 &= 0x7FF;
        }
        if (class54.field817 > var12) {
            class54.field817 -= (class54.field817 - var12) * class206.field3132 / 1000 + class39.field602;
            if (var12 > class54.field817) {
                class54.field817 = var12;
            }
        }
        int var15 = var13 - class147.field2369;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class147.field2369 = var13;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)I", line = 221)
    public static final int method1786(byte arg0, int arg1) {
        field4004++;
        int var2 = 106 / ((arg0 + 7) / 49);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 231)
    public static final void method1787(byte arg0) {
        if (arg0 <= 63) {
            return;
        }
        field4007++;
        if (class236.field3742 == null) {
            return;
        }
        class52 var1 = new class52();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class236.field3742[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)I", line = 274)
    public static final int method1788(int arg0, int arg1, int arg2) {
        if (arg0 > -53) {
            return -91;
        } else {
            int var3 = arg1 >>> 31;
            field4002++;
            return (arg1 + var3) / arg2 - var3;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V", line = 294)
    public static final void method1789(int arg0, byte arg1) {
        field4003++;
        if (class216.field3338 == null || class216.field3338.length < arg0) {
            class216.field3338 = new int[arg0];
        }
        if (arg1 != 26) {
            method1785((byte) 45);
        }
    }
}
