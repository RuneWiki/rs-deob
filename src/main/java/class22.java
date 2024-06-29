import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    private int field421 = 65000;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lbb;")
    private class10 field426 = null;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lbb;")
    private class10 field435 = null;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field431 = 0;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lrd;")
    public static class114 field432 = class84.method656("backbase1", (byte) 124);

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lrd;")
    private static class114 field434 = class84.method656("Connecting to friendserver", (byte) 117);

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lrd;")
    public static class114 field438 = class84.method656("blaugr-Un:", (byte) 120);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lrd;")
    public static class114 field423 = field434;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "Lrd;")
    public static class114 field444 = class84.method656("mapmarker", (byte) 123);

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lrd;")
    public static class114 field439 = class84.method656("Weiter", (byte) 124);

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Lrd;")
    public static class114 field425 = class84.method656(":0", (byte) 127);

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[[[B")
    public static byte[][][] field430 = new byte[4][104][104];

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "[Lhe;")
    public static class54[] field424;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method154(int arg0) {
        field444 = null;
        field432 = null;
        field434 = null;
        if (arg0 != -18233) {
            field427 = 42;
        }
        field439 = null;
        field424 = null;
        field438 = null;
        field430 = null;
        field423 = null;
        field425 = null;
    }

    @OriginalMember(owner = "client!d", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field436++;
        return "Cache:" + this.field422;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIZ[B)Z")
    private final boolean method155(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field440++;
        class10 var6 = this.field426;
        synchronized (this.field426) {
            try {
                int var8;
                if (arg3) {
                    if ((long) (arg0 * 6 + 6) > this.field435.method79(19398920)) {
                        return false;
                    }
                    this.field435.method78((long) (arg0 * 6), (byte) 70);
                    this.field435.method76(class47.field978, 0, -12112, 6);
                    var8 = ((class47.field978[3] & 0xFF) << 16) + (class47.field978[5] & 0xFF) + ((class47.field978[4] & 0xFF) << 8);
                    if (var8 <= 0 || this.field426.method79(19398920) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field426.method79(19398920) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class47.field978[5] = (byte) var8;
                class47.field978[4] = (byte) (var8 >> 8);
                class47.field978[0] = (byte) (arg2 >> 16);
                class47.field978[2] = (byte) arg2;
                class47.field978[3] = (byte) (var8 >> 16);
                class47.field978[1] = (byte) (arg2 >> 8);
                int var10 = 112 / ((-arg1 - 10) / 50);
                this.field435.method78((long) (arg0 * 6), (byte) -127);
                int var11 = 0;
                this.field435.method81(6, 0, class47.field978, -32);
                int var12 = 0;
                while (var11 < arg2) {
                    int var13 = 0;
                    if (arg3) {
                        label107: {
                            this.field426.method78((long) (var8 * 520), (byte) -128);
                            try {
                                this.field426.method76(class47.field978, 0, -12112, 8);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var14 = ((class47.field978[0] & 0xFF) << 8) + (class47.field978[1] & 0xFF);
                            int var15 = class47.field978[7] & 0xFF;
                            int var16 = ((class47.field978[2] & 0xFF) << 8) + (class47.field978[3] & 0xFF);
                            var13 = ((class47.field978[4] & 0xFF) << 16) + ((class47.field978[5] << 8 & 0xFF00) + (class47.field978[6] & 0xFF));
                            if (arg0 == var14 && var12 == var16 && this.field422 == var15) {
                                if (var13 >= 0 && this.field426.method79(19398920) / 520L >= (long) var13) {
                                    break label107;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field426.method79(19398920) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                        arg3 = false;
                    }
                    class47.field978[2] = (byte) (var12 >> 8);
                    int var19 = arg2 - var11;
                    class47.field978[1] = (byte) arg0;
                    class47.field978[7] = (byte) this.field422;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class47.field978[0] = (byte) (arg0 >> 8);
                    if (arg2 - var11 <= 512) {
                        var13 = 0;
                    }
                    class47.field978[4] = (byte) (var13 >> 16);
                    class47.field978[5] = (byte) (var13 >> 8);
                    class47.field978[3] = (byte) var12;
                    class47.field978[6] = (byte) var13;
                    this.field426.method78((long) (var8 * 520), (byte) -127);
                    this.field426.method81(8, 0, class47.field978, -36);
                    var8 = var13;
                    var12++;
                    this.field426.method81(var19, var11, arg4, -114);
                    var11 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lf;Z)V")
    public static final void method156(class36 arg0, boolean arg1) {
        arg0.field698 = arg1;
        field445++;
        if (arg0.field736 != -1) {
            class29 var2 = class12.method97(arg0.field736, false);
            if (var2 == null || var2.field607 == null) {
                arg0.field736 = -1;
            } else {
                arg0.field720++;
                if (var2.field607.length > arg0.field704 && arg0.field720 > var2.field605[arg0.field704]) {
                    arg0.field704++;
                    arg0.field720 = 1;
                    class26.method197(arg0.field704, 6693, arg0.field712, var2, arg0.field756);
                }
                if (arg0.field704 >= var2.field607.length) {
                    arg0.field704 = 0;
                    arg0.field720 = 0;
                    class26.method197(arg0.field704, 6693, arg0.field712, var2, arg0.field756);
                }
            }
        }
        if (arg0.field721 != -1 && class20.field370 >= arg0.field706) {
            if (arg0.field744 < 0) {
                arg0.field744 = 0;
            }
            int var3 = class74.method606(!arg1, arg0.field721).field1332;
            if (var3 == -1) {
                arg0.field721 = -1;
            } else {
                class29 var4 = class12.method97(var3, arg1);
                if (var4 == null || var4.field607 == null) {
                    arg0.field721 = -1;
                } else {
                    arg0.field717++;
                    if (var4.field607.length > arg0.field744 && arg0.field717 > var4.field605[arg0.field744]) {
                        arg0.field744++;
                        arg0.field717 = 1;
                        class26.method197(arg0.field744, 6693, arg0.field712, var4, arg0.field756);
                    }
                    if (arg0.field744 >= var4.field607.length && (arg0.field744 < 0 || arg0.field744 >= var4.field607.length)) {
                        arg0.field721 = -1;
                    }
                }
            }
        }
        if (arg0.field750 != -1 && arg0.field705 <= 1) {
            class29 var5 = class12.method97(arg0.field750, arg1);
            if (var5.field615 == 1 && arg0.field742 > 0 && class20.field370 >= arg0.field745 && class20.field370 > arg0.field707) {
                arg0.field705 = 1;
                return;
            }
        }
        if (arg0.field750 != -1 && arg0.field705 == 0) {
            class29 var6 = class12.method97(arg0.field750, false);
            if (var6 == null || var6.field607 == null) {
                arg0.field750 = -1;
            } else {
                arg0.field755++;
                if (arg0.field692 < var6.field607.length && arg0.field755 > var6.field605[arg0.field692]) {
                    arg0.field692++;
                    arg0.field755 = 1;
                    class26.method197(arg0.field692, 6693, arg0.field712, var6, arg0.field756);
                }
                if (var6.field607.length <= arg0.field692) {
                    arg0.field694++;
                    arg0.field692 -= var6.field602;
                    if (arg0.field694 >= var6.field575) {
                        arg0.field750 = -1;
                    } else if (arg0.field692 >= 0 && arg0.field692 < var6.field607.length) {
                        class26.method197(arg0.field692, 6693, arg0.field712, var6, arg0.field756);
                    } else {
                        arg0.field750 = -1;
                    }
                }
                arg0.field698 = var6.field592;
            }
        }
        if (arg0.field705 > 0) {
            arg0.field705--;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII[Lnd;III)V")
    public static final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90[] arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg6.length; var10++) {
            class90 var11 = arg6[var10];
            if (var11 != null && (var11.field2024 == 0 || var11.field2014) && var11 != null && var11.field2103 == arg1 && !class121.method947(var11, true)) {
                int var12 = var11.field2015 + arg9 - arg2;
                int var13 = var12 + var11.field2032;
                int var14 = arg9 < var12 ? var12 : arg9;
                int var15 = arg5 > var13 ? var13 : arg5;
                int var16 = arg0 + var11.field2038 - arg7;
                int var17 = var16 + var11.field2044;
                int var18 = var16 <= arg0 ? arg0 : var16;
                int var19 = var17 >= arg4 ? arg4 : var17;
                if (var11.field2024 == 0) {
                    method157(var18, var11.field2060, var11.field2043 + var14 - var12, 325, var19, var15, arg6, var18 + var11.field2013 - var16, arg8, var14);
                    if (var11.field2031 != null) {
                        method157(var18, var11.field2060, var11.field2043 + var14 - var12, arg3, var19, var15, var11.field2031, var18 + var11.field2013 - var16, arg8, var14);
                    }
                }
                if (var11.field2014) {
                    boolean var20;
                    if (var14 <= class100.field2289 && var18 <= class75.field1741 && class100.field2289 < var15 && class75.field1741 < var19) {
                        var20 = true;
                    } else {
                        var20 = false;
                    }
                    boolean var21 = false;
                    if (class116.field2719 == 1 && var20) {
                        var21 = true;
                    }
                    boolean var22 = false;
                    if (client.field417 == 1 && class142.field3392 >= var14 && var18 <= class118.field2758 && var15 > class142.field3392 && var19 > class118.field2758) {
                        var22 = true;
                    }
                    if (var22 && class13.field285 == null && (arg8 & 0x200) != 0 && !class116.field2714 && class122.method951(var11, 104) != null) {
                        class13.field285 = var11;
                        class63.field1343 = class100.field2289;
                        class16.field321 = false;
                        class130.field3141 = 0;
                        class75.field1743 = class75.field1741;
                    }
                    if (class13.field285 != null || class116.field2714) {
                        var20 = false;
                        var22 = false;
                        var21 = false;
                    }
                    if (!var11.field2071 && var22 && (arg8 & 0x1) != 0) {
                        var11.field2071 = true;
                        if (var11.field2040 != null) {
                            class80.method636(var11.field2040, class142.field3392 - var12, 0, class118.field2758 - var16, arg3 + -250, null, var11);
                        }
                    }
                    if (var11.field2071 && var21 && (arg8 & 0x4) != 0 && var11.field2053 != null) {
                        class80.method636(var11.field2053, class100.field2289 - var12, 0, class75.field1741 - var16, 77, null, var11);
                    }
                    if (var11.field2071 && !var21 && (arg8 & 0x2) != 0) {
                        var11.field2071 = false;
                        if (var11.field2087 != null) {
                            class80.method636(var11.field2087, class100.field2289 - var12, 0, class75.field1741 - var16, 28, null, var11);
                        }
                    }
                    if (var21 && (arg8 & 0x8) != 0 && var11.field2111 != null) {
                        class80.method636(var11.field2111, class100.field2289 - var12, 0, class75.field1741 - var16, 125, null, var11);
                    }
                    if (!var11.field2091 && var20 && (arg8 & 0x10) != 0) {
                        var11.field2091 = true;
                        if (var11.field2033 != null) {
                            class80.method636(var11.field2033, class100.field2289 - var12, 0, class75.field1741 - var16, arg3 + -288, null, var11);
                        }
                    }
                    if (var11.field2091 && var20 && (arg8 & 0x40) != 0 && var11.field2130 != null) {
                        class80.method636(var11.field2130, class100.field2289 - var12, 0, class75.field1741 - var16, arg3 + -242, null, var11);
                    }
                    if (var11.field2091 && !var20 && (arg8 & 0x20) != 0) {
                        var11.field2091 = false;
                        if (var11.field2095 != null) {
                            class80.method636(var11.field2095, class100.field2289 - var12, 0, class75.field1741 - var16, 46, null, var11);
                        }
                    }
                    if (var11.field2035 != null && (arg8 & 0x80) != 0) {
                        class80.method636(var11.field2035, 0, 0, 0, 84, null, var11);
                    }
                    if (var20 && class20.field352 != 0 && var11.field2079 != null && (arg8 & 0x400) != 0) {
                        class80.method636(var11.field2079, 0, 0, class20.field352, 43, null, var11);
                    }
                    if ((arg8 & 0x100) != 0) {
                        if (var11.field2081 < class32.field653 && var11.field2120 != null) {
                            class80.method636(var11.field2120, 0, 0, 0, 75, null, var11);
                        }
                        if (var11.field2081 < class101.field2314 && var11.field2059 != null) {
                            class80.method636(var11.field2059, 0, 0, 0, 29, null, var11);
                        }
                        if (var11.field2081 < class73.field1659 && var11.field2097 != null) {
                            class80.method636(var11.field2097, 0, 0, 0, 65, null, var11);
                        }
                        var11.field2081 = class20.field370;
                    }
                }
            }
        }
        if (arg3 != 325) {
            field431 = 73;
        }
        field428++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
    public static final void method158(int arg0, int arg1, int arg2, int arg3) {
        field441++;
        if (arg2 == 1) {
            class61.field1303.method1054(8, 149);
            class61.field1303.method476(-7155, arg1);
            class61.field1303.method464(arg0, (byte) 38);
            class21.field392++;
        }
        if (arg2 == 2) {
            class61.field1303.method1054(arg3 ^ 0x8, 116);
            class61.field1303.method476(arg3 ^ 0xFFFFE40D, arg1);
            class61.field1303.method464(arg0, (byte) 8);
            class78.field1778++;
        }
        if (arg2 == 3) {
            class67.field1449++;
            class61.field1303.method1054(arg3 ^ 0x8, 1);
            class61.field1303.method476(arg3 ^ 0xFFFFE40D, arg1);
            class61.field1303.method464(arg0, (byte) 14);
        }
        if (arg2 == 4) {
            class61.field1303.method1054(8, 3);
            class116.field2712++;
            class61.field1303.method476(-7155, arg1);
            class61.field1303.method464(arg0, (byte) 38);
        }
        if (arg2 == 5) {
            class61.field1303.method1054(8, 12);
            class98.field2224++;
            class61.field1303.method476(-7155, arg1);
            class61.field1303.method464(arg0, (byte) 117);
        }
        if (arg2 == 6) {
            class61.field1303.method1054(arg3 ^ 0x8, 173);
            class92.field2152++;
            class61.field1303.method476(-7155, arg1);
            class61.field1303.method464(arg0, (byte) 53);
        }
        if (arg2 == 7) {
            class61.field1303.method1054(8, 112);
            class61.field1303.method476(-7155, arg1);
            class61.field1303.method464(arg0, (byte) 106);
            class26.field530++;
        }
        if (arg3 != 0) {
            field439 = null;
        }
        if (arg2 == 8) {
            class72.field1599++;
            class61.field1303.method1054(arg3 ^ 0x8, 111);
            class61.field1303.method476(-7155, arg1);
            class61.field1303.method464(arg0, (byte) 49);
        }
        if (arg2 == 9) {
            class110.field2570++;
            class61.field1303.method1054(8, 232);
            class61.field1303.method476(-7155, arg1);
            class61.field1303.method464(arg0, (byte) 38);
        }
        if (arg2 == 10) {
            class89.field1972++;
            class61.field1303.method1054(8, 64);
            class61.field1303.method476(-7155, arg1);
            class61.field1303.method464(arg0, (byte) 77);
        }
        class90 var4 = class92.method719((byte) -107, arg1, arg0);
        if (var4 != null && var4.field2121 != null) {
            class80.method636(var4.field2121, 0, arg2, 0, 126, null, var4);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BIII)Z")
    public static final boolean method159(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 >> 14 & 0x7FFF;
        field433++;
        int var5 = class101.field2325.method1009(class20.field346, arg3, arg1, arg2);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class12 var8 = class130.method1048(-82, var4);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var9 = var8.field277;
                var10 = var8.field261;
            } else {
                var9 = var8.field261;
                var10 = var8.field277;
            }
            int var11 = var8.field209;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class10.method80(arg3, class7.field103.field758[0], class7.field103.field748[0], 2, true, arg1, var10, var11, -106, 0, 0, var9);
        } else {
            class10.method80(arg3, class7.field103.field758[0], class7.field103.field748[0], 2, true, arg1, 0, 0, -96, var7, var6 + 1, 0);
        }
        class8.field113 = 0;
        class63.field1350 = class118.field2758;
        class104.field2419 = 2;
        int var12 = -71 / ((55 - arg0) / 49);
        class69.field1512 = class142.field3392;
        return true;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)I")
    public static final int method160(int arg0) {
        field442++;
        int var1 = class137.method1110(class20.field346, class143.field3404, class99.field2253, (byte) 37);
        return var1 - class128.field3075 >= arg0 || (field430[class20.field346][class143.field3404 >> 7][class99.field2253 >> 7] & 0x4) == 0 ? 3 : class20.field346;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public static final void method161(int arg0) {
        class32.field651.method200(arg0 - 123);
        class48.field994.method200(-106);
        field443++;
        if (arg0 != 6) {
            field423 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)[B")
    public final byte[] method162(byte arg0, int arg1) {
        field429++;
        class10 var3 = this.field426;
        synchronized (this.field426) {
            try {
                if (this.field435.method79(19398920) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field435.method78((long) (arg1 * 6), (byte) -16);
                this.field435.method76(class47.field978, 0, -12112, 6);
                if (arg0 != -119) {
                    this.field435 = null;
                }
                int var5 = (class47.field978[2] & 0xFF) + ((class47.field978[1] & 0xFF) << 8) + ((class47.field978[0] & 0xFF) << 16);
                int var6 = ((class47.field978[3] & 0xFF) << 16) - (-((class47.field978[4] & 0xFF) << 8) - (class47.field978[5] & 0xFF));
                if (var5 < 0 || var5 > this.field421) {
                    return null;
                } else if (var6 > 0 && this.field426.method79(19398920) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field426.method78((long) (var6 * 520), (byte) -111);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field426.method76(class47.field978, 0, -12112, var13 + 8);
                        int var14 = ((class47.field978[0] & 0xFF) << 8) + (class47.field978[1] & 0xFF);
                        int var15 = class47.field978[7] & 0xFF;
                        int var16 = ((class47.field978[4] & 0xFF) << 16) + ((class47.field978[5] & 0xFF) << 8) + (class47.field978[6] & 0xFF);
                        int var17 = ((class47.field978[2] & 0xFF) << 8) + (class47.field978[3] & 0xFF);
                        if (arg1 == var14 && var11 == var17 && this.field422 == var15) {
                            if (var16 >= 0 && (long) var16 <= this.field426.method79(19398920) / 520L) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class47.field978[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(ILbb;Lbb;I)V")
    public class22(int arg0, class10 arg1, class10 arg2, int arg3) {
        this.field422 = arg0;
        this.field426 = arg1;
        this.field435 = arg2;
        this.field421 = arg3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[BI)Z")
    public final boolean method163(int arg0, int arg1, byte[] arg2, int arg3) {
        field437++;
        class10 var5 = this.field426;
        synchronized (this.field426) {
            if (~arg0 > arg3 || arg0 > this.field421) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method155(arg1, -120, arg0, true, arg2);
            if (!var6) {
                var6 = this.method155(arg1, 53, arg0, false, arg2);
            }
            return var6;
        }
    }
}
