import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class525 extends class371 {

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[Lmn;")
    public static class246[] field7766 = new class246[128];

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Lki;")
    public static class498 field7767 = new class498(34, 7);

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "Lri;")
    public static class73 field7771 = new class73(88, -2);

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lnh;")
    public class525 field7768;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Lnh;")
    public class525 field7772;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 4)
    public final void method3101(int arg0) {
        field7770++;
        if (arg0 == 0 && this.field7772 != null) {
            this.field7772.field7768 = this.field7768;
            this.field7768.field7772 = this.field7772;
            this.field7768 = null;
            this.field7772 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Z", line = 22)
    public static final boolean method3102(int arg0, int arg1) {
        field7764++;
        if (class45.field718[arg0]) {
            return true;
        } else if (class354.field5428.method2949(arg0, false)) {
            int var2 = class354.field5428.method2942(false, arg0);
            if (~var2 == arg1) {
                class45.field718[arg0] = true;
                return true;
            }
            if (class185.field2754[arg0] == null) {
                class185.field2754[arg0] = new class38[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class185.field2754[arg0][var3] == null) {
                    byte[] var4 = class354.field5428.method2945(arg0, var3, true);
                    if (var4 != null) {
                        class38 var5 = class185.field2754[arg0][var3] = new class38();
                        var5.field467 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method229((byte) 13, new class209(var4));
                    }
                }
            }
            class45.field718[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 79)
    public static void method3103(boolean arg0) {
        field7766 = null;
        field7767 = null;
        if (arg0) {
            field7767 = null;
        }
        field7771 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V", line = 91)
    public static final void method3104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg2 + 1;
        class415.method2491(arg0, arg3, class339.field4800[arg2], arg5, -31541);
        field7769++;
        int var8 = arg1 - 1;
        class415.method2491(arg0, arg3, class339.field4800[arg1], arg5, -31541);
        int var6 = var9;
        if (arg4 != 30135) {
            method3105((byte) 40, null);
        }
        while (var8 >= var6) {
            int[] var7 = class339.field4800[var6];
            var7[arg3] = var7[arg0] = arg5;
            var6++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLvg;)Lvg;", line = 116)
    public static final class38 method3105(byte arg0, class38 arg1) {
        field7765++;
        if (arg1.field480 != -1) {
            return class149.method979((byte) -103, arg1.field480);
        } else if (arg0 == 125) {
            int var2 = arg1.field467 >>> 16;
            class293 var3 = new class293(class431.field6450);
            for (class92 var4 = (class92) var3.method1866((byte) 26); var4 != null; var4 = (class92) var3.method1868((byte) 124)) {
                if (var4.field1378 == var2) {
                    return class149.method979((byte) -91, (int) var4.field4736);
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Let;)V", line = 147)
    public static final void method3106(class419 arg0) {
        if (class44.field711 >= 65535) {
            return;
        }
        class107 var1 = arg0.field6301;
        class517.field7540[class44.field711] = arg0;
        class14.field181[class44.field711] = false;
        class44.field711++;
        int var2 = arg0.field6299;
        if (arg0.field6304) {
            var2 = 0;
        }
        int var3 = arg0.field6299;
        if (arg0.field6307) {
            var3 = class208.field2979 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method656(128) + class143.field2134 - var1.method661((byte) 123) >> class192.field2815;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method656(128) + var1.method661((byte) 56) - class143.field2134 >> class192.field2815;
            if (var7 >= class484.field7096) {
                var7 = class484.field7096 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field6293[var5++];
                int var10 = (var1.method654((byte) 31) + class143.field2134 - var1.method661((byte) -74) >> class192.field2815) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class361.field5554) {
                    var11 = class361.field5554 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class9.field123[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class9.field123[var4][var12][var8] = var13 | (long) class44.field711;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class9.field123[var4][var12][var8] = var13 | (long) class44.field711 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class9.field123[var4][var12][var8] = var13 | (long) class44.field711 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class9.field123[var4][var12][var8] = var13 | (long) class44.field711 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V", line = 244)
    public static final void method3107(int arg0) {
        field7773++;
        if (class193.field2832 == 10) {
            class11.method76(false, 28);
        }
        if (class193.field2832 == 30) {
            class11.method76(false, 25);
        }
        if (arg0 != -2119782128) {
            field7766 = null;
        }
    }
}
