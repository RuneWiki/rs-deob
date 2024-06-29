import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class69 {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lok;")
    public static class41 field1035 = class137.method956("3D)2Softwarebibliothek gestartet)3", 45);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lok;")
    public static class41 field1029 = class137.method956("headicons_pk", 45);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Z")
    public static boolean field1030 = false;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field1051 = 0;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "J")
    private long field1032;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "J")
    private long field1049;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Z")
    public boolean field1031;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
    private int[] field1033;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[I")
    private int[] field1038;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[I")
    public static int[] field1040;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[[[B")
    public static byte[][][] field1043;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V", line = 21)
    public final void method500(int arg0, int arg1, int arg2) {
        int var4 = class272.field4404[arg2];
        field1045++;
        if (this.field1033[var4] != 0 && class273.method1930(3, arg0) != null) {
            this.field1033[var4] = class255.method1813(arg1, arg0);
            this.method509((byte) -63);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lok;I)Z", line = 37)
    public static final boolean method501(class41 arg0, int arg1) {
        field1039++;
        if (arg1 <= 94) {
            method508(-49);
        }
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class281.field4576; var2++) {
            if (arg0.method306(class315.field5310[var2], 27080)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(III)V", line = 67)
    public final void method502(int arg0, int arg1, int arg2) {
        this.field1038[arg0] = arg1;
        if (arg2 == -2904) {
            field1048++;
            this.method509((byte) -63);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I", line = 84)
    public final int method503(int arg0) {
        if (arg0 != 305419896) {
            this.method507(-45, (class205) null, (class205) null, -48, -74);
        }
        field1047++;
        return this.field1044 == -1 ? (this.field1038[0] << 25) + (this.field1033[0] << 15) + (this.field1033[11] << 5) + (this.field1033[8] << 10) - (-(this.field1038[4] << 20) - this.field1033[1]) : 305419896 - -class165.method1156(this.field1044, (byte) -115).field2247;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLrk;I)Ljc;", line = 105)
    public final class287 method504(boolean arg0, class205 arg1, int arg2) {
        field1052++;
        if (this.field1044 != -1) {
            return class165.method1156(this.field1044, (byte) -104).method1013(-80, arg1, arg2);
        }
        class287 var4 = (class287) class2.field19.method136(this.field1049, arg0);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field1033[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var7) != 0 && !class273.method1930(3, var7 & 0x3FFFFFFF).method2141((byte) -113)) {
                        var5 = true;
                    }
                } else if (!class130.method918(var7 & 0x3FFFFFFF, -87).method960(-23227, this.field1031)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class233[] var8 = new class233[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field1033[var10];
                if ((var11 & 0x40000000) != 0) {
                    class233 var13 = class130.method918(var11 & 0x3FFFFFFF, -119).method970(this.field1031, (byte) -81);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var11) != 0) {
                    class233 var12 = class273.method1930(3, var11 & 0x3FFFFFFF).method2126((byte) 29);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                }
            }
            class233 var14 = new class233(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field1038[var15] < class204.field3303[var15].length) {
                    var14.method1680(class127.field1889[var15], class204.field3303[var15][this.field1038[var15]]);
                }
                if (class223.field3563[var15].length > this.field1038[var15]) {
                    var14.method1680(class199.field3203[var15], class223.field3563[var15][this.field1038[var15]]);
                }
            }
            var4 = var14.method1664(64, 768, -50, -10, -50);
            class2.field19.method132(this.field1049, var4, -1);
        }
        if (arg1 != null) {
            var4 = arg1.method1452(arg2, var4, 9);
        }
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILrk;IIB)Ljc;", line = 215)
    public final class287 method505(int arg0, class205 arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -114) {
            method501((class41) null, -127);
        }
        long var6 = (long) arg0 | (long) (arg2 << 16) | (long) arg0 << 32;
        class287 var8 = (class287) class2.field19.method136(var6, true);
        field1041++;
        if (var8 == null) {
            class233[] var9 = new class233[2];
            int var10 = 0;
            if (!class273.method1930(3, arg0).method2141((byte) -72) || !class273.method1930(3, arg2).method2141((byte) -111)) {
                return null;
            }
            class233 var11 = class273.method1930(arg4 ^ 0xFFFFFF8D, arg0).method2126((byte) 29);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class233 var12 = class273.method1930(3, arg2).method2126((byte) 29);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class233 var13 = new class233(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class204.field3303[var14].length > this.field1038[var14]) {
                    var13.method1680(class127.field1889[var14], class204.field3303[var14][this.field1038[var14]]);
                }
                if (class223.field3563[var14].length > this.field1038[var14]) {
                    var13.method1680(class199.field3203[var14], class223.field3563[var14][this.field1038[var14]]);
                }
            }
            var8 = var13.method1664(64, 768, -50, -10, -50);
            class2.field19.method132(var6, var8, -1);
        }
        if (arg1 != null) {
            var8 = arg1.method1452(arg3, var8, 9);
        }
        return var8;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZZ[I[II)V", line = 278)
    public final void method506(boolean arg0, boolean arg1, int[] arg2, int[] arg3, int arg4) {
        field1046++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class149.field2317; var7++) {
                    class307 var8 = class273.method1930(3, var7);
                    if (var8 != null && !var8.field5161 && var8.field5169 == (var6 + (arg0 ? 7 : 0))) {
                        arg2[class272.field4404[var6]] = class255.method1813(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field1031 = arg0;
        this.field1038 = arg3;
        this.field1033 = arg2;
        this.field1044 = arg4;
        this.method509((byte) -63);
        if (!arg1) {
            this.field1044 = -66;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILrk;Lrk;II)Ljc;", line = 325)
    public final class287 method507(int arg0, class205 arg1, class205 arg2, int arg3, int arg4) {
        field1037++;
        if (this.field1044 != -1) {
            return class165.method1156(this.field1044, (byte) -117).method1017(arg1, arg2, arg3, (byte) 34, arg4);
        }
        if (arg0 != 1073741823) {
            this.method500(64, -120, 76);
        }
        long var6 = this.field1049;
        int[] var8 = this.field1033;
        if (arg1 != null && (arg1.field3333 >= 0 || arg1.field3319 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1033[var9];
            }
            if (arg1.field3333 >= 0) {
                if (arg1.field3333 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class255.method1813(1073741824, arg1.field3333);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg1.field3319 >= 0) {
                if (arg1.field3319 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class255.method1813(arg1.field3319, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class287 var10 = (class287) class60.field862.method136(var6, true);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var8[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var13) != 0 && !class273.method1930(3, var13 & 0x3FFFFFFF).method2133((byte) -124)) {
                        var11 = true;
                    }
                } else if (!class130.method918(var13 & 0x3FFFFFFF, -84).method963(this.field1031, true)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1032 != -1L) {
                    var10 = (class287) class60.field862.method136(this.field1032, true);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class233[] var14 = new class233[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var8[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class233 var19 = class130.method918(var17 & 0x3FFFFFFF, -46).method961(-123, this.field1031);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    } else if ((var17 & Integer.MIN_VALUE) != 0) {
                        class233 var18 = class273.method1930(3, var17 & 0x3FFFFFFF).method2134(arg0 - 79604413);
                        if (var18 != null) {
                            var14[var15++] = var18;
                        }
                    }
                }
                int var20 = var8[0];
                if ((var20 & 0x40000000) != 0) {
                    class138 var21 = class130.method918(var20 & 0x3FFFFFFF, -119);
                    if (var21.field2111 != null) {
                        for (int var22 = 0; var22 < var21.field2111.length; var22++) {
                            if (var21.field2111[var22] != null && var14[var22 + 1] != null) {
                                int var23 = var21.field2111[var22][2];
                                int var24 = var21.field2111[var22][0];
                                int var25 = var21.field2111[var22][3];
                                int var26 = var21.field2111[var22][4];
                                int var27 = var21.field2111[var22][5];
                                int var28 = var21.field2111[var22][1];
                                var14[var22 + 1].method1683(var24, var28, var23);
                                var14[var22 + 1].method1674(var25, var26, var27);
                            }
                        }
                    }
                }
                class233 var29 = new class233(var14, var15);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (class204.field3303[var30].length > this.field1038[var30]) {
                        var29.method1680(class127.field1889[var30], class204.field3303[var30][this.field1038[var30]]);
                    }
                    if (class223.field3563[var30].length > this.field1038[var30]) {
                        var29.method1680(class199.field3203[var30], class223.field3563[var30][this.field1038[var30]]);
                    }
                }
                var10 = var29.method1664(64, 850, -30, -50, -30);
                if (class166.field2625) {
                    ((class183) var10).method1307(false, false, true, true, false, false, true);
                }
                class60.field862.method132(var6, var10, -1);
                this.field1032 = var6;
            }
        }
        if (arg1 == null && arg2 == null) {
            return var10;
        }
        class287 var31;
        if (arg1 != null && arg2 != null) {
            var31 = arg1.method1454(arg0 - 1073741823, arg2, arg3, arg4, var10);
        } else if (arg1 == null) {
            var31 = arg2.method1456(arg3, 0, var10);
        } else {
            var31 = arg1.method1456(arg4, arg0 - 1073741823, var10);
        }
        return var31;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 559)
    public static void method508(int arg0) {
        field1043 = (byte[][][]) null;
        field1035 = null;
        field1029 = null;
        field1040 = null;
        if (arg0 != 10205) {
            field1030 = false;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 575)
    private final void method509(byte arg0) {
        long[] var2 = class38.field590;
        long var3 = this.field1049;
        this.field1049 = -1L;
        field1034++;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1049 = var2[(int) ((this.field1049 ^ (long) (this.field1033[var5] >> 24)) & 0xFFL)] ^ this.field1049 >>> 8;
            this.field1049 = this.field1049 >>> 8 ^ var2[(int) ((this.field1049 ^ (long) (this.field1033[var5] >> 16)) & 0xFFL)];
            this.field1049 = this.field1049 >>> 8 ^ var2[(int) (((long) (this.field1033[var5] >> 8) ^ this.field1049) & 0xFFL)];
            this.field1049 = var2[(int) ((this.field1049 ^ (long) this.field1033[var5]) & 0xFFL)] ^ this.field1049 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1049 = this.field1049 >>> 8 ^ var2[(int) ((this.field1049 ^ (long) this.field1038[var6]) & 0xFFL)];
        }
        this.field1049 = this.field1049 >>> 8 ^ var2[(int) ((this.field1049 ^ (long) (this.field1031 ? 1 : 0)) & 0xFFL)];
        if (var3 != 0L && this.field1049 != var3) {
            class60.field862.method139(var3, 127);
        }
        if (arg0 != -63) {
            this.method502(-6, 104, -4);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V", line = 614)
    public final void method510(int arg0, boolean arg1) {
        field1050++;
        this.field1031 = arg1;
        if (arg0 == 0) {
            this.method509((byte) -63);
        }
    }
}
