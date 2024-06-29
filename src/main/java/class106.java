import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class106 extends class35 {

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "[B")
    public byte[] field1750;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field1752 = -1;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1754 = "Checking for updates - ";

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "[J")
    public static long[] field1755 = new long[256];

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "F")
    public static float field1756;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "Ldp;")
    public static class174 field1753;

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
            field1755[var0] = var1;
        }
        field1756 = 0.0F;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lri;I)V", line = 4)
    public static final void method940(class98 arg0, int arg1) {
        field1751++;
        if (class389.field5591 >= 400) {
            return;
        }
        class11 var2 = arg0.field1545;
        if (var2.field135 != null) {
            var2 = var2.method75(0);
            if (var2 == null) {
                return;
            }
        }
        if (!var2.field166) {
            return;
        }
        String var3 = var2.field163;
        if (var2.field191 != 0) {
            String var4 = class336.field4809 == 1 ? class18.field258 : class161.field2446;
            var3 = var3 + class99.method823(var2.field191, 2, class86.field1394.field2065) + " (" + var4 + var2.field191 + ")";
        }
        if (arg1 > -50) {
            method941(83, -118, -45);
        }
        if (class47.field765 == 1) {
            class77.field1308++;
            class26.method217(0, class19.field267, 2, 0, class119.field1867, 12154, class85.field1377 + " -> <col=ffff00>" + var3, (long) arg0.field5657);
        } else if (class291.field4332) {
            class413 var12 = class209.field3041 == -1 ? null : class392.method2497(class209.field3041, 0);
            if ((class320.field4637 & 0x2) != 0 && var12 == null || var2.method73(class209.field3041, var12.field5993, -94) != var12.field5993) {
                class19.field269++;
                class26.method217(0, class171.field2549, 38, 0, class72.field1207, 12154, class79.field1339 + " -> <col=ffff00>" + var3, (long) arg0.field5657);
            }
        } else {
            String[] var5 = var2.field131;
            if (class79.field1342) {
                var5 = class245.method1782(var5, 0);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && (class336.field4809 != 0 || !var5[var6].equalsIgnoreCase(class418.field6068))) {
                        byte var7 = 0;
                        if (var6 == 0) {
                            var7 = 43;
                        }
                        int var8 = class361.field5151;
                        if (var6 == 1) {
                            var7 = 45;
                        }
                        if (var6 == 2) {
                            var7 = 59;
                        }
                        if (var6 == 3) {
                            var7 = 31;
                        }
                        if (var6 == 4) {
                            var7 = 46;
                        }
                        if (var2.field170 == var6) {
                            var8 = var2.field168;
                        }
                        if (var2.field149 == var6) {
                            var8 = var2.field193;
                        }
                        class26.method217(0, var5[var6], var7, 0, var8, 12154, "<col=ffff00>" + var3, (long) arg0.field5657);
                        class207.field3033++;
                    }
                }
            }
            if (class336.field4809 == 0 && var5 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var5[var9] != null && var5[var9].equalsIgnoreCase(class418.field6068)) {
                        short var10 = 0;
                        if (var2.field191 > class86.field1394.field2065) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 43;
                        }
                        if (var9 == 1) {
                            var11 = 45;
                        }
                        if (var9 == 2) {
                            var11 = 59;
                        }
                        if (var9 == 3) {
                            var11 = 31;
                        }
                        if (var9 == 4) {
                            var11 = 46;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class119.field1860++;
                        class26.method217(0, var5[var9], var11, 0, var2.field194, 12154, "<col=ffff00>" + var3, (long) arg0.field5657);
                    }
                }
            }
            class12.field199++;
            class26.method217(0, class183.field2696, 1008, 0, class64.field1038, 12154, "<col=ffff00>" + var3, (long) arg0.field5657);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V", line = 168)
    public static final void method941(int arg0, int arg1, int arg2) {
        field1748++;
        if (arg1 < 0) {
            field1753 = null;
        }
        if (class161.field2445 != arg2) {
            class136.field2168 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class136.field2168[var3] = (var3 << 12) / arg2;
            }
            class161.field2445 = arg2;
            class249.field3602 = arg2 * 32;
            class267.field3997 = arg2 - 1;
        }
        if (class364.field5188 == arg0) {
            return;
        }
        if (class161.field2445 == arg0) {
            class364.field5185 = class136.field2168;
        } else {
            class364.field5185 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class364.field5185[var4] = (var4 << 12) / arg0;
            }
        }
        class30.field442 = arg0 - 1;
        class364.field5188 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "([B)V", line = 217)
    public class106(byte[] arg0) {
        this.field1750 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V", line = 225)
    public static final void method942(byte arg0) {
        int var1 = -82 / ((arg0 - 18) / 34);
        field1747++;
        class120.field1872.method106((byte) -124);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V", line = 283)
    public static void method943(int arg0) {
        if (arg0 != -1) {
            field1756 = 0.40876698F;
        }
        field1755 = null;
        field1753 = null;
        field1754 = null;
    }
}
