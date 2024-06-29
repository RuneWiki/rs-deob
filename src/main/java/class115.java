import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class115 {

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field2061 = 0;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2055 = 0;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "[I")
    public static int[] field2062 = new int[25];

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field2060 = 0;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "Ldc;")
    private static class37 field2069 = class185.method1233((byte) 86, "Loading title screen )2 ");

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "Ldc;")
    public static class37 field2066 = field2069;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    private int field2070;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "J")
    private long field2048;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "J")
    private long field2054;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lmf;")
    public static class136 field2052;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Z")
    public boolean field2059;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "[I")
    private int[] field2065;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "[I")
    private int[] field2068;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lta;II)La;")
    public final class1 method802(class208 arg0, int arg1, int arg2) {
        field2049++;
        if (this.field2070 != -1) {
            return class59.method452(false, this.field2070).method1367(arg1, arg0, 0);
        }
        class1 var4 = (class1) class230.field4220.method1180(this.field2054, (byte) 98);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field2065[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class81.method556(var15 & 0x3FFFFFFF, arg2 ^ 0x80000064).method1296((byte) -8)) {
                        var5 = true;
                    }
                } else if (!class223.method1471(127, var15 & 0x3FFFFFFF).method858(this.field2059, -82)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class126[] var7 = new class126[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field2065[var9];
                if ((var12 & 0x40000000) != 0) {
                    class126 var13 = class223.method1471(-38, var12 & 0x3FFFFFFF).method847(-92, this.field2059);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class126 var14 = class81.method556(var12 & 0x3FFFFFFF, arg2 ^ 0x80000064).method1287(-17);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class126 var10 = new class126(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class101.field1752[var11].length > this.field2068[var11]) {
                    var10.method888(class196.field3667[var11], class101.field1752[var11][this.field2068[var11]]);
                }
                if (class147.field2797[var11].length > this.field2068[var11]) {
                    var10.method888(class99.field1728[var11], class147.field2797[var11][this.field2068[var11]]);
                }
            }
            var4 = var10.method887(64, 768, -50, -10, -50);
            class230.field4220.method1179(0, this.field2054, var4);
        }
        if (arg0 != null) {
            var4 = arg0.method1382(var4, arg1, (byte) 99);
        }
        if (arg2 != Integer.MIN_VALUE) {
            this.method808(-21, 4, (byte) 123, null, null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method803(int arg0) {
        field2069 = null;
        field2052 = null;
        if (arg0 > -48) {
            field2055 = -24;
        }
        field2066 = null;
        field2062 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    private final void method804(byte arg0) {
        field2051++;
        long var2 = this.field2054;
        long[] var4 = class107.field1873;
        this.field2054 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2054 = var4[(int) (((long) (this.field2065[var5] >> 24) ^ this.field2054) & 0xFFL)] ^ this.field2054 >>> 8;
            this.field2054 = var4[(int) ((this.field2054 ^ (long) (this.field2065[var5] >> 16)) & 0xFFL)] ^ this.field2054 >>> 8;
            this.field2054 = this.field2054 >>> 8 ^ var4[(int) ((this.field2054 ^ (long) (this.field2065[var5] >> 8)) & 0xFFL)];
            this.field2054 = var4[(int) ((this.field2054 ^ (long) this.field2065[var5]) & 0xFFL)] ^ this.field2054 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2054 = var4[(int) ((this.field2054 ^ (long) this.field2068[var6]) & 0xFFL)] ^ this.field2054 >>> 8;
        }
        if (arg0 < 126) {
            this.method802(null, -95, -13);
        }
        this.field2054 = var4[(int) ((this.field2054 ^ (long) (this.field2059 ? 1 : 0)) & 0xFFL)] ^ this.field2054 >>> 8;
        if (var2 != 0L && this.field2054 != var2) {
            class16.field250.method1184(73, var2);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
    public static final void method805(byte arg0) {
        if (arg0 >= -87) {
            method805((byte) -43);
        }
        field2067++;
        for (int var1 = -1; var1 < class76.field1342; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class9.field122[var1];
            }
            class123 var3 = class8.field107[var2];
            if (var3 != null) {
                class62.method462((byte) 111, var3, var3.field3499);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI[II[I)V")
    public final void method806(boolean arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        field2053++;
        if (arg1 != -13) {
            return;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class75.field1321; var7++) {
                    class194 var8 = class81.method556(var7, 100);
                    if (var8 != null && !var8.field3628 && var8.field3634 == (arg0 ? 7 : 0) + var6) {
                        arg4[class96.field1685[var6]] = class138.method960(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field2065 = arg4;
        this.field2068 = arg2;
        this.field2059 = arg0;
        this.field2070 = arg3;
        this.method804((byte) 127);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
    public final void method807(int arg0, int arg1, int arg2) {
        field2050++;
        int var4 = class96.field1685[arg2];
        if (~this.field2065[var4] != arg1 && class81.method556(arg0, 100) != null) {
            this.field2065[var4] = class138.method960(arg0, Integer.MIN_VALUE);
            this.method804((byte) 127);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIBLta;Lta;)La;")
    public final class1 method808(int arg0, int arg1, byte arg2, class208 arg3, class208 arg4) {
        field2056++;
        if (this.field2070 != -1) {
            return class59.method452(false, this.field2070).method1358(arg4, arg2 ^ 0xFFFFFFC8, arg0, arg1, arg3);
        }
        if (arg2 != -52) {
            this.field2068 = null;
        }
        long var6 = this.field2054;
        int[] var8 = this.field2065;
        if (arg4 != null && (arg4.field3884 >= 0 || arg4.field3887 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2065[var9];
            }
            if (arg4.field3884 >= 0) {
                if (arg4.field3884 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class138.method960(1073741824, arg4.field3884);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg4.field3887 >= 0) {
                if (arg4.field3887 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class138.method960(1073741824, arg4.field3887);
                    var6 ^= var8[3];
                }
            }
        }
        class1 var10 = (class1) class16.field250.method1180(var6, (byte) 125);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class81.method556(var30 & 0x3FFFFFFF, arg2 + 152).method1289(true)) {
                        var11 = true;
                    }
                } else if (!class223.method1471(127, var30 & 0x3FFFFFFF).method849(arg2 - 9886, this.field2059)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2048 != -1L) {
                    var10 = (class1) class16.field250.method1180(this.field2048, (byte) 115);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class126[] var13 = new class126[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class126 var29 = class223.method1471(117, var27 & 0x3FFFFFFF).method851((byte) 117, this.field2059);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class126 var28 = class81.method556(var27 & 0x3FFFFFFF, arg2 + 152).method1291(-6);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class125 var17 = class223.method1471(-25, var16 & 0x3FFFFFFF);
                    if (var17.field2236 != null) {
                        for (int var18 = 0; var18 < var17.field2236.length; var18++) {
                            int var19 = var17.field2236[var18][0];
                            int var20 = var17.field2236[var18][1];
                            int var21 = var17.field2236[var18][2];
                            int var22 = var17.field2236[var18][3];
                            int var23 = var17.field2236[var18][4];
                            int var24 = var17.field2236[var18][5];
                            var13[var18 + 1].method865(var19, var20, var21);
                            var13[var18 + 1].method878(var22, var23, var24);
                        }
                    }
                }
                class126 var25 = new class126(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field2068[var26] < class101.field1752[var26].length) {
                        var25.method888(class196.field3667[var26], class101.field1752[var26][this.field2068[var26]]);
                    }
                    if (class147.field2797[var26].length > this.field2068[var26]) {
                        var25.method888(class99.field1728[var26], class147.field2797[var26][this.field2068[var26]]);
                    }
                }
                var10 = var25.method887(64, 850, -30, -50, -30);
                class16.field250.method1179(0, var6, var10);
                this.field2048 = var6;
            }
        }
        if (arg4 == null && arg3 == null) {
            return var10;
        }
        class1 var31;
        if (arg4 != null && arg3 != null) {
            var31 = arg4.method1385(arg3, arg1, var10, -125, arg0);
        } else if (arg4 == null) {
            var31 = arg3.method1378(arg1, (byte) -12, var10);
        } else {
            var31 = arg4.method1378(arg0, (byte) -12, var10);
        }
        return var31;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)I")
    public final int method809(int arg0) {
        field2064++;
        if (arg0 != 64) {
            this.field2054 = -29L;
        }
        return this.field2070 == -1 ? (this.field2068[0] << 25) + (this.field2065[11] << 5) + this.field2065[1] - (-(this.field2068[4] << 20) - (this.field2065[0] << 15) - (this.field2065[8] << 10)) : class59.method452(false, this.field2070).field3837 + 305419896;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIB)V")
    public final void method810(int arg0, int arg1, byte arg2) {
        if (arg2 != -101) {
            field2069 = null;
        }
        this.field2068[arg0] = arg1;
        this.method804((byte) 127);
        field2058++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZZ)V")
    public final void method811(boolean arg0, boolean arg1) {
        if (!arg0) {
            field2052 = null;
        }
        this.field2059 = arg1;
        field2057++;
        this.method804((byte) 127);
    }
}
