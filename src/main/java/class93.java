import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class93 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lsb;")
    private class110 field1175 = new class110(256);

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lsb;")
    private class110 field1186 = new class110(256);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Leh;")
    private class137 field1176;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Leh;")
    private class137 field1185;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[S")
    public static short[] field1181 = new short[256];

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field1184 = 0;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[II)Lqh;")
    private final class29 method517(int arg0, int arg1, int[] arg2, int arg3) {
        field1177++;
        if (arg1 != -287526384) {
            return null;
        }
        int var5 = arg3 ^ (arg0 >>> 12 | (arg0 & 0x30000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class29 var9 = (class29) this.field1186.method708(var7, 17);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class169 var10 = class169.method1158(this.field1185, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            class29 var11 = var10.method1156();
            this.field1186.method707(var7, var11, (byte) 120);
            if (arg2 != null) {
                arg2[0] -= var11.field409.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([IIII)Lqh;")
    private final class29 method518(int[] arg0, int arg1, int arg2, int arg3) {
        field1180++;
        if (arg2 != -29432) {
            this.field1175 = null;
        }
        int var5 = (arg3 << 4 & 0xFFFA | arg3 >>> 12) ^ arg1;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class29 var9 = (class29) this.field1186.method708(var7, 126);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class12 var10 = (class12) this.field1175.method708(var7, 120);
            if (var10 == null) {
                var10 = class12.method60(this.field1176, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field1175.method707(var7, var10, (byte) 120);
            }
            class29 var11 = var10.method58(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1673(14510);
                this.field1186.method707(var7, var11, (byte) 120);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method519(int arg0) {
        field1182++;
        if (class147.method1014(96) != 2) {
            return;
        }
        byte var1 = (byte) (class130.field2085 - 4 & 0xFF);
        int var2 = class130.field2085 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class18.field218[var3][var2][var17] = var1;
            }
        }
        int var4 = 32 % ((-arg0 - 19) / 48);
        if (class244.field4011 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class297.field4696[var5] = -1000000;
            class71.field904[var5] = 1000000;
            class242.field3988[var5] = 0;
            class92.field1163[var5] = 1000000;
            class128.field2057[var5] = 0;
        }
        if (class283.field4513 != 1) {
            int var6 = class166.method1148(class244.field4011, class74.field932, class36.field465, (byte) -128);
            if (var6 - class252.field4114 < 800 && (class117.field1664[class244.field4011][class74.field932 >> 7][class36.field465 >> 7] & 0x4) != 0) {
                class278.method1853(true, class36.field465 >> 7, class46.field585, class74.field932 >> 7, 1, false);
            }
            return;
        }
        if ((class117.field1664[class244.field4011][class286.field4571.field3818 >> 7][class286.field4571.field3820 >> 7] & 0x4) != 0) {
            class278.method1853(true, class286.field4571.field3820 >> 7, class46.field585, class286.field4571.field3818 >> 7, 0, false);
        }
        if (class242.field3986 >= 310) {
            return;
        }
        int var7 = class74.field932 >> 7;
        int var8 = class36.field465 >> 7;
        int var9 = class286.field4571.field3818 >> 7;
        int var10;
        if (var9 <= var7) {
            var10 = var7 - var9;
        } else {
            var10 = var9 - var7;
        }
        int var11 = class286.field4571.field3820 >> 7;
        int var12;
        if (var11 > var8) {
            var12 = var11 - var8;
        } else {
            var12 = var8 - var11;
        }
        if (!(var10 != 0 || var12 != 0) || var10 <= -104 || var10 >= 104 || var12 <= -104 || var12 >= 104) {
            class30.method168((byte) -88, (Throwable) null, "RC: " + var7 + "," + var8 + " " + var9 + "," + var11 + " " + class167.field2683 + "," + class181.field2883);
        } else if (var12 >= var10) {
            int var13 = var10 * 65536 / var12;
            int var14 = 32768;
            while (var8 != var11) {
                if (var11 > var8) {
                    var8++;
                } else if (var8 > var11) {
                    var8--;
                }
                if ((class117.field1664[class244.field4011][var7][var8] & 0x4) != 0) {
                    class278.method1853(true, var8, class46.field585, var7, 1, false);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var9 > var7) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    var14 -= 65536;
                    if ((class117.field1664[class244.field4011][var7][var8] & 0x4) != 0) {
                        class278.method1853(true, var8, class46.field585, var7, 1, false);
                        return;
                    }
                }
            }
        } else {
            int var15 = var12 * 65536 / var10;
            int var16 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class117.field1664[class244.field4011][var7][var8] & 0x4) != 0) {
                    class278.method1853(true, var8, class46.field585, var7, 1, false);
                    return;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var11 > var8) {
                        var8++;
                    } else if (var11 < var8) {
                        var8--;
                    }
                    var16 -= 65536;
                    if ((class117.field1664[class244.field4011][var7][var8] & 0x4) != 0) {
                        class278.method1853(true, var8, class46.field585, var7, 1, false);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([IBI)Lqh;")
    public final class29 method520(int[] arg0, byte arg1, int arg2) {
        field1183++;
        if (arg1 > -77) {
            this.method521(-14, -115, (int[]) null);
        }
        if (this.field1176.method930((byte) 119) == 1) {
            return this.method518(arg0, arg2, -29432, 0);
        } else if (this.field1176.method926(26899, arg2) == 1) {
            return this.method518(arg0, 0, -29432, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[I)Lqh;")
    public final class29 method521(int arg0, int arg1, int[] arg2) {
        field1179++;
        if (this.field1185.method930((byte) 121) == 1) {
            return this.method517(0, arg1 ^ 0x778276B7, arg2, arg0);
        } else if (arg1 != -1721842521) {
            return null;
        } else if (this.field1185.method926(26899, arg0) == 1) {
            return this.method517(arg0, -287526384, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method522(boolean arg0) {
        if (arg0) {
            field1184 = -67;
        }
        field1181 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)V")
    public static final void method523(byte arg0, int arg1) {
        field1178++;
        if (class18.field218 == null) {
            class18.field218 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class18.field218[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 > -73) {
            field1181 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Leh;Leh;)V")
    public class93(class137 arg0, class137 arg1) {
        this.field1176 = arg1;
        this.field1185 = arg0;
    }
}
