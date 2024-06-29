import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class20 {

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Lmh;")
    public static class62 field205 = class201.method1405(true, "Art");

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lmh;")
    public static class62 field193 = class201.method1405(true, "Null");

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field208 = 128;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "[I")
    public static int[] field210 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "Lud;")
    public static class52 field209 = new class52();

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "Lmh;")
    public static class62 field214 = class201.method1405(true, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "J")
    private long field206;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "J")
    private long field211;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Lwi;")
    public static class242 field192;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Llf;")
    public static class299 field195;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "Z")
    public boolean field201;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "[I")
    private int[] field189;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[I")
    private int[] field190;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "[Lle;")
    public static class193[] field215;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ls;IZ)Lab;", line = 12)
    public final class138 method83(class96 arg0, int arg1, boolean arg2) {
        field199++;
        if (this.field204 != -1) {
            return class226.method1601(768, this.field204).method1884(arg1, (byte) -118, arg0);
        }
        if (!arg2) {
            field195 = (class299) null;
        }
        class138 var4 = (class138) class112.field1832.method1396(0, this.field211);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field190[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var7) != 0 && !class87.method652((byte) -109, var7 & 0x3FFFFFFF).method1161(-27684)) {
                        var5 = true;
                    }
                } else if (!class189.method1320(0, var7 & 0x3FFFFFFF).method240((byte) -124, this.field201)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var8 = 0;
            class76[] var9 = new class76[12];
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field190[var10];
                if ((var11 & 0x40000000) != 0) {
                    class76 var13 = class189.method1320(0, var11 & 0x3FFFFFFF).method239(this.field201, (byte) -50);
                    if (var13 != null) {
                        var9[var8++] = var13;
                    }
                } else if ((var11 & Integer.MIN_VALUE) != 0) {
                    class76 var12 = class87.method652((byte) 127, var11 & 0x3FFFFFFF).method1156(0);
                    if (var12 != null) {
                        var9[var8++] = var12;
                    }
                }
            }
            class76 var14 = new class76(var9, var8);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field189[var15] < class151.field2378[var15].length) {
                    var14.method577(class4.field42[var15], class151.field2378[var15][this.field189[var15]]);
                }
                if (this.field189[var15] < class104.field1702[var15].length) {
                    var14.method577(class158.field2533[var15], class104.field1702[var15][this.field189[var15]]);
                }
            }
            var4 = var14.method580(64, 768, -50, -10, -50);
            class112.field1832.method1397(this.field211, var4, arg2);
        }
        if (arg0 != null) {
            var4 = arg0.method780(var4, arg1, (byte) -107);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)I", line = 136)
    public static final int method84(int arg0, byte arg1) {
        field191++;
        int var2 = -45 / ((arg1 + 57) / 56);
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI[I[II)V", line = 151)
    public final void method85(boolean arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        field198++;
        if (arg1 != 0) {
            method92(123, (byte) 63, 97);
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class91.field1433; var7++) {
                    class158 var8 = class87.method652((byte) -50, var7);
                    if (var8 != null && !var8.field2541 && var8.field2549 == ((arg0 ? 7 : 0) + var6)) {
                        arg3[class281.field4804[var6]] = class270.method1854(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field189 = arg2;
        this.field190 = arg3;
        this.field201 = arg0;
        this.field204 = arg4;
        this.method94(1684285704);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZ)V", line = 197)
    public final void method86(int arg0, int arg1, boolean arg2) {
        field197++;
        int var4 = class281.field4804[arg1];
        if (this.field190[var4] == 0 || class87.method652((byte) -76, arg0) == null) {
            return;
        }
        if (!arg2) {
            field202 = 65;
        }
        this.field190[var4] = class270.method1854(arg0, Integer.MIN_VALUE);
        this.method94(1684285704);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZZ)V", line = 219)
    public final void method87(boolean arg0, boolean arg1) {
        field200++;
        this.field201 = arg0;
        if (arg1) {
            this.method88((class96) null, -121, -90, -128, -85);
        }
        this.method94(1684285704);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ls;IIII)Lab;", line = 251)
    public final class138 method88(class96 arg0, int arg1, int arg2, int arg3, int arg4) {
        field216++;
        long var6 = (long) arg3 | (long) arg3 << 32 | (long) (arg4 << 16);
        class138 var8 = (class138) class112.field1832.method1396(0, var6);
        if (var8 == null) {
            class76[] var9 = new class76[2];
            int var10 = 0;
            if (!class87.method652((byte) 78, arg3).method1161(-27684) || !class87.method652((byte) 98, arg4).method1161(-27684)) {
                return null;
            }
            class76 var11 = class87.method652((byte) -85, arg3).method1156(arg2 + 24542);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class76 var12 = class87.method652((byte) -71, arg4).method1156(0);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class76 var13 = new class76(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field189[var14] < class151.field2378[var14].length) {
                    var13.method577(class4.field42[var14], class151.field2378[var14][this.field189[var14]]);
                }
                if (class104.field1702[var14].length > this.field189[var14]) {
                    var13.method577(class158.field2533[var14], class104.field1702[var14][this.field189[var14]]);
                }
            }
            var8 = var13.method580(64, 768, -50, -10, -50);
            class112.field1832.method1397(var6, var8, true);
        }
        if (arg2 != -24542) {
            field202 = 59;
        }
        if (arg0 != null) {
            var8 = arg0.method780(var8, arg1, (byte) -101);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I", line = 313)
    public final int method89(byte arg0) {
        if (arg0 <= 23) {
            field210 = (int[]) null;
        }
        field194++;
        return this.field204 == -1 ? (this.field190[8] << 10) + (this.field189[4] << 20) + (this.field190[11] << 5) + (this.field190[0] << 15) + (this.field189[0] << 25) + this.field190[1] : class226.method1601(768, this.field204).field4681 + 305419896;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 329)
    public static void method90(int arg0) {
        field205 = null;
        field214 = null;
        field210 = null;
        field209 = null;
        if (arg0 == Integer.MIN_VALUE) {
            field195 = null;
            field193 = null;
            field192 = null;
            field215 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ls;IIILs;)Lab;", line = 346)
    public final class138 method91(class96 arg0, int arg1, int arg2, int arg3, class96 arg4) {
        field203++;
        if (this.field204 != -1) {
            return class226.method1601(768, this.field204).method1882(arg2, true, arg0, arg1, arg4);
        }
        long var6 = this.field211;
        int[] var8 = this.field190;
        if (arg3 <= 101) {
            field195 = (class299) null;
        }
        if (arg4 != null && (arg4.field1567 >= 0 || arg4.field1572 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field190[var9];
            }
            if (arg4.field1567 >= 0) {
                if (arg4.field1567 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class270.method1854(1073741824, arg4.field1567);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg4.field1572 >= 0) {
                if (arg4.field1572 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class270.method1854(arg4.field1572, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class138 var10 = (class138) class29.field399.method1396(0, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var8[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var13) != 0 && !class87.method652((byte) -120, var13 & 0x3FFFFFFF).method1158((byte) 28)) {
                        var11 = true;
                    }
                } else if (!class189.method1320(0, var13 & 0x3FFFFFFF).method252(this.field201, (byte) 122)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field206 != -1L) {
                    var10 = (class138) class29.field399.method1396(0, this.field206);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var14 = 0;
                class76[] var15 = new class76[12];
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var8[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class76 var19 = class189.method1320(0, var17 & 0x3FFFFFFF).method241(this.field201, -32318);
                        if (var19 != null) {
                            var15[var14++] = var19;
                        }
                    } else if ((var17 & Integer.MIN_VALUE) != 0) {
                        class76 var18 = class87.method652((byte) 74, var17 & 0x3FFFFFFF).method1159((byte) -111);
                        if (var18 != null) {
                            var15[var14++] = var18;
                        }
                    }
                }
                int var20 = var8[0];
                if ((var20 & 0x40000000) != 0) {
                    class37 var21 = class189.method1320(0, var20 & 0x3FFFFFFF);
                    if (var21.field549 != null) {
                        for (int var22 = 0; var22 < var21.field549.length; var22++) {
                            if (var21.field549[var22] != null && var15[var22 + 1] != null) {
                                int var23 = var21.field549[var22][0];
                                int var24 = var21.field549[var22][3];
                                int var25 = var21.field549[var22][1];
                                int var26 = var21.field549[var22][2];
                                int var27 = var21.field549[var22][4];
                                int var28 = var21.field549[var22][5];
                                var15[var22 + 1].method586(var23, var25, var26);
                                var15[var22 + 1].method581(var24, var27, var28);
                            }
                        }
                    }
                }
                class76 var29 = new class76(var15, var14);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (class151.field2378[var30].length > this.field189[var30]) {
                        var29.method577(class4.field42[var30], class151.field2378[var30][this.field189[var30]]);
                    }
                    if (this.field189[var30] < class104.field1702[var30].length) {
                        var29.method577(class158.field2533[var30], class104.field1702[var30][this.field189[var30]]);
                    }
                }
                var10 = var29.method580(64, 850, -30, -50, -30);
                ((class213) var10).method1508(false, false, true, true, false, false, true);
                class29.field399.method1397(var6, var10, true);
                this.field206 = var6;
            }
        }
        if (arg4 == null && arg0 == null) {
            return var10;
        }
        class138 var31;
        if (arg4 != null && arg0 != null) {
            var31 = arg4.method764(arg0, arg2, 123, arg1, var10);
        } else if (arg4 == null) {
            var31 = arg0.method775(arg2, var10, -1);
        } else {
            var31 = arg4.method775(arg1, var10, -1);
        }
        return var31;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)I", line = 585)
    public static final int method92(int arg0, byte arg1, int arg2) {
        class272 var3 = (class272) class222.field3829.method311((byte) 114, (long) arg2);
        field207++;
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4625.length; var5++) {
                if (var3.field4627[var5] == arg0) {
                    var4 += var3.field4625[var5];
                }
            }
            if (arg1 <= 4) {
                return -110;
            } else {
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IBI)V", line = 620)
    public final void method93(int arg0, byte arg1, int arg2) {
        field212++;
        this.field189[arg0] = arg2;
        if (arg1 <= 16) {
            method95(false, -104);
        }
        this.method94(1684285704);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 636)
    private final void method94(int arg0) {
        field196++;
        long var2 = this.field211;
        this.field211 = -1L;
        long[] var4 = class2.field21;
        if (arg0 != 1684285704) {
            field208 = 93;
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field211 = var4[(int) ((this.field211 ^ (long) (this.field190[var5] >> 24)) & 0xFFL)] ^ this.field211 >>> 8;
            this.field211 = var4[(int) (((long) (this.field190[var5] >> 16) ^ this.field211) & 0xFFL)] ^ this.field211 >>> 8;
            this.field211 = var4[(int) (((long) (this.field190[var5] >> 8) ^ this.field211) & 0xFFL)] ^ this.field211 >>> 8;
            this.field211 = this.field211 >>> 8 ^ var4[(int) (((long) this.field190[var5] ^ this.field211) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field211 = var4[(int) (((long) this.field189[var6] ^ this.field211) & 0xFFL)] ^ this.field211 >>> 8;
        }
        this.field211 = var4[(int) ((this.field211 ^ (long) (this.field201 ? 1 : 0)) & 0xFFL)] ^ this.field211 >>> 8;
        if (var2 != 0L && this.field211 != var2) {
            class29.field399.method1393(var2, 117);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)Z", line = 677)
    public static final boolean method95(boolean arg0, int arg1) {
        field188++;
        if (class307.field5266[arg1]) {
            return true;
        } else if (class165.field2692.method143(0, arg1)) {
            int var2 = class165.field2692.method159(arg1, true);
            if (var2 == 0) {
                class307.field5266[arg1] = true;
                return true;
            }
            if (class275.field4713[arg1] == null) {
                class275.field4713[arg1] = new class191[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class275.field4713[arg1][var3] == null) {
                    byte[] var4 = class165.field2692.method157(var3, arg1, (byte) 19);
                    if (var4 != null) {
                        class275.field4713[arg1][var3] = new class191();
                        class275.field4713[arg1][var3].field3142 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class275.field4713[arg1][var3].method1332(-6405, new class92(var4));
                        } else {
                            class275.field4713[arg1][var3].method1343((byte) -127, new class92(var4));
                        }
                    }
                }
            }
            class307.field5266[arg1] = arg0;
            return true;
        } else {
            return false;
        }
    }
}
