import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class117 extends class107 {

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    private int field1797;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "[I")
    public static int[] field1799 = new int[99];

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field1796 = 0;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "J")
    public static long field1801;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "Z")
    public static boolean field1804;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Lti;")
    public static class5 field1803;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "Lt;")
    public static class212 field1805;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V")
    public static final void method802(byte arg0) {
        class120.field1900.method1873(-7401);
        ++field1792;
        if (arg0 <= 41) {
            field1801 = 89L;
        }
        class161.field2633.method1873(-7401);
        class254.field4198.method1873(-7401);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field1791;
        if (arg0 == 0) {
            this.field1797 = (arg1.method1849(255) << 12) / 255;
        }
        if (arg2 != 28) {
            method807(72, -72, 79, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
    public static final void method803(int arg0) {
        ++field1795;
        try {
            if (class88.field1378 == 1) {
                int var1 = class91.field1454.method1987((byte) -46);
                if (~var1 < -1 && class91.field1454.method1968(74)) {
                    int var2 = var1 - class76.field1226;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class91.field1454.method1973(var2, 56);
                    return;
                }
                class91.field1454.method1972((byte) 93);
                class91.field1454.method1978((byte) -103);
                class115.field1753 = null;
                if (class298.field4859 != null) {
                    class88.field1378 = 2;
                } else {
                    class88.field1378 = 0;
                }
                class121.field1917 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class91.field1454.method1972((byte) 109);
            class88.field1378 = 0;
            class298.field4859 = null;
            class121.field1917 = null;
            class115.field1753 = null;
        }
        if (arg0 != 2) {
            field1806 = -109;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIII)V")
    public static final void method804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1800;
        int var7 = class268.method1789(class191.field3112, 30, arg5, class52.field766);
        int var8 = class268.method1789(class191.field3112, -101, arg6, class52.field766);
        int var9 = class268.method1789(class148.field2371, arg4 + 41, arg3, class34.field561);
        if (arg4 == -1) {
            int var10 = class268.method1789(class148.field2371, 12, arg2, class34.field561);
            int var11 = class268.method1789(class191.field3112, -86, arg1 + arg5, class52.field766);
            int var12 = class268.method1789(class191.field3112, arg4 ^ -98, -arg1 + arg6, class52.field766);
            for (int var13 = var7; var11 > var13; ++var13) {
                class309.method2096(arg0, var10, (byte) -117, class232.field3629[var13], var9);
            }
            for (int var14 = var8; ~var12 > ~var14; --var14) {
                class309.method2096(arg0, var10, (byte) -117, class232.field3629[var14], var9);
            }
            int var15 = class268.method1789(class148.field2371, 95, arg1 + arg3, class34.field561);
            int var16 = class268.method1789(class148.field2371, 109, arg2 - arg1, class34.field561);
            for (int var17 = var11; var17 <= var12; ++var17) {
                int[] var18 = class232.field3629[var17];
                class309.method2096(arg0, var15, (byte) -117, var18, var9);
                class309.method2096(arg0, var10, (byte) -117, var18, var16);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class117() {
        this(4096);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field1794;
        int var3 = -119 % ((arg0 - -34) / 49);
        int[] var4 = super.field1661.method894(-67, arg1);
        if (super.field1661.field2115) {
            class282.method1920(var4, 0, class24.field443, this.field1797);
        }
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(III)Lom;")
    public static final class90 method805(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field1787; ++var4) {
                class90 var5 = var3.field1782[var4];
                if ((var5.field1402 >> 29 & 3L) == 2L && var5.field1405 == arg1 && var5.field1407 == arg2) {
                    class71.method497(var5);
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
    public static void method806(int arg0) {
        field1803 = null;
        if (arg0 != -1) {
            method803(111);
        }
        field1799 = null;
        field1805 = null;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(I)V")
    public class117(int arg0) {
        super(0, true);
        this.field1797 = 4096;
        this.field1797 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[B)Z")
    public static final boolean method807(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field1798;
        boolean var4 = true;
        int var5 = -1;
        if (arg0 <= 54) {
            return true;
        } else {
            class274 var6 = new class274(arg3);
            label72: while (true) {
                int var7 = var6.method1853(-2);
                if (var7 == 0) {
                    return var4;
                }
                int var8 = 0;
                var5 += var7;
                boolean var9 = false;
                while (true) {
                    int var12;
                    class172 var16;
                    do {
                        int var13;
                        int var15;
                        do {
                            do {
                                do {
                                    do {
                                        while (var9) {
                                            int var17 = var6.method1863((byte) -120);
                                            if (~var17 == -1) {
                                                continue label72;
                                            }
                                            var6.method1849(255);
                                        }
                                        int var10 = var6.method1863((byte) -107);
                                        if (var10 == 0) {
                                            continue label72;
                                        }
                                        var8 += var10 + -1;
                                        int var11 = 63 & var8;
                                        var12 = var6.method1849(255) >> 2;
                                        var13 = arg2 + var11;
                                        int var14 = (4062 & var8) >> 6;
                                        var15 = var14 - -arg1;
                                    } while (~var15 >= -1);
                                } while (~var13 >= -1);
                            } while (~var15 <= -104);
                        } while (~var13 <= -104);
                        var16 = class49.method319(var5, 0);
                    } while (var12 == 22 && !class296.field4835 && var16.field2808 == 0 && var16.field2861 != 1 && !var16.field2883);
                    var9 = true;
                    if (!var16.method1223(0)) {
                        ++class210.field3345;
                        var4 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IB)V")
    public static final void method808(int arg0, byte arg1) {
        class291 var2 = class61.method389(arg0, 10, 0);
        ++field1793;
        if (arg1 != -18) {
            field1805 = null;
        }
        var2.method2010(0);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1799[var1] = var0 / 4;
        }
        field1801 = 0L;
        field1802 = 0;
        field1804 = true;
        field1803 = new class5(64);
    }
}
