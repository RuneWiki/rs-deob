import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class130 extends class115 {

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "[I")
    public static int[] field2281 = new int[50];

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "Lub;")
    public static class227 field2283 = class257.method1749("", 17263);

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "Ljava/awt/Frame;")
    public static Frame field2272;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "[I")
    public int[] field2264;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "[I")
    private int[] field2271;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "[Lub;")
    private class227[] field2274;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "[[I")
    private int[][] field2278;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "[[[B")
    public static byte[][][] field2280;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
    public static final void method793(byte arg0) {
        field2273++;
        if (class77.field1340 == -1 || class166.field2780 == -1) {
            return;
        }
        int var1 = class180.field3085 + ((class190.field3224 - class180.field3085) * class23.field393 >> 16);
        class23.field393 += var1;
        if (class23.field393 < 65535) {
            class76.field1335 = false;
            class222.field3758 = false;
        } else {
            if (class76.field1335) {
                class222.field3758 = false;
            } else {
                class222.field3758 = true;
            }
            class76.field1335 = true;
            class23.field393 = 65535;
        }
        float[] var2 = new float[3];
        float var3 = (float) class23.field393 / 65535.0F;
        int var4 = class56.field1008 * 2;
        if (arg0 != 11) {
            field2282 = 65;
        }
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class195.field3321[class77.field1340][var4][var5];
            int var22 = (class195.field3321[class77.field1340][var4 + 2][var5] + class195.field3321[class77.field1340][var4 + 2][var5] - class195.field3321[class77.field1340][var4 + 3][var5]) * 3;
            int var23 = class195.field3321[class77.field1340][var4][var5] * 3;
            int var24 = class195.field3321[class77.field1340][var4 + 1][var5] * 3;
            int var25 = var24 - var23;
            int var26 = var22 + var23 - (var24 * 2);
            int var27 = class195.field3321[class77.field1340][var4 + 2][var5] + var24 - var21 - var22;
            var2[var5] = (((float) var27 * var3 + (float) var26) * var3 + (float) var25) * var3 + (float) var21;
        }
        if (class192.field3267 == 0 && class78.field1367 == 0) {
            class78.field1367 = (((int) var2[2] >> 10) - 6) * 8;
            class192.field3267 = ((int) var2[0] >> 10) * 8 - 48;
        }
        class88.field1527 = (int) var2[2] - (class78.field1367 * 128);
        class184.field3135 = (int) var2[0] - class192.field3267 * 128;
        float[] var6 = new float[3];
        class25.field422 = (int) var2[1] * -1;
        int var7 = class152.field2638 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class195.field3321[class166.field2780][var7][var8] * 3;
            int var15 = class195.field3321[class166.field2780][var7 + 1][var8] * 3;
            int var16 = (class195.field3321[class166.field2780][var7 + 2][var8] + class195.field3321[class166.field2780][var7 - -2][var8] - class195.field3321[class166.field2780][var7 + 3][var8]) * 3;
            int var17 = var15 - var14;
            int var18 = class195.field3321[class166.field2780][var7][var8];
            int var19 = class195.field3321[class166.field2780][var7 + 2][var8] + var15 - var16 - var18;
            int var20 = var16 + var14 - (var15 * 2);
            var6[var8] = (((float) var19 * var3 + (float) var20) * var3 + (float) var17) * var3 + (float) var18;
        }
        float var9 = (var6[1] - var2[1]) * -1.0F;
        float var10 = var6[0] - var2[0];
        float var11 = var6[2] - var2[2];
        double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class20.field345 = (float) Math.atan2((double) var9, var12);
        class128.field2257 = -((float) Math.atan2((double) var10, (double) var11));
        class103.field1812 = (int) ((double) class20.field345 * 325.949D) & 0x7FF;
        class161.field2724 = (int) ((double) class128.field2257 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lta;I)Z")
    public static final boolean method794(class105 arg0, int arg1) {
        field2279++;
        if (arg0.field1835 == null) {
            return false;
        }
        if (arg1 != -19632) {
            method794((class105) null, -58);
        }
        for (int var2 = 0; var2 < arg0.field1835.length; var2++) {
            int var3 = class184.method1173(arg0, (byte) -121, var2);
            int var4 = arg0.field1936[var2];
            if (arg0.field1835[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field1835[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field1835[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lnj;B)V")
    public final void method795(class226 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1471(255);
            if (var3 == 0) {
                field2275++;
                if (arg1 < 4) {
                    this.field2264 = null;
                    return;
                }
                return;
            }
            this.method798((byte) -125, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([ILnj;B)V")
    public final void method796(int[] arg0, class226 arg1, byte arg2) {
        field2266++;
        if (this.field2271 == null || arg2 >= -55) {
            return;
        }
        for (int var4 = 0; var4 < this.field2271.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = class256.field4482[this.method800(122, var4)];
            if (var5 > 0) {
                arg1.method1454((long) arg0[var4], -104, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lnj;I)Lub;")
    public final class227 method797(class226 arg0, int arg1) {
        field2277++;
        if (arg1 != -48) {
            method794((class105) null, 94);
        }
        class227 var3 = class223.method1407(80, 0);
        if (this.field2271 != null) {
            for (int var4 = 0; var4 < this.field2271.length; var4++) {
                var3.method1486(false, this.field2274[var4]);
                var3.method1486(false, class225.method1423(this.field2278[var4], this.field2271[var4], arg0.method1425(class19.field328[this.field2271[var4]], (byte) 115), 2));
            }
        }
        var3.method1486(false, this.field2274[this.field2274.length - 1]);
        return var3.method1488(50);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BILnj;)V")
    private final void method798(byte arg0, int arg1, class226 arg2) {
        int var4 = -74 / ((-arg0 - 61) / 63);
        field2268++;
        if (arg1 == 1) {
            this.field2274 = arg2.method1480(91).method1514(false, 60);
        } else if (arg1 == 2) {
            int var9 = arg2.method1471(255);
            this.field2264 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2264[var10] = arg2.method1447(0);
            }
        } else if (arg1 == 3) {
            int var5 = arg2.method1471(255);
            this.field2271 = new int[var5];
            this.field2278 = new int[var5][];
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg2.method1447(0);
                this.field2271[var6] = var7;
                this.field2278[var6] = new int[class119.field2175[var7]];
                for (int var8 = 0; var8 < class119.field2175[var7]; var8++) {
                    this.field2278[var6][var8] = arg2.method1447(0);
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILub;Lub;)V")
    public static final void method799(int arg0, int arg1, class227 arg2, class227 arg3) {
        if (arg0 == 1403) {
            class181.method1160(arg2, 0, -1, arg3, arg1, (class227) null);
            field2267++;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
    public final int method800(int arg0, int arg1) {
        if (arg0 < 119) {
            this.method796((int[]) null, (class226) null, (byte) -86);
        }
        field2269++;
        return this.field2271 == null || arg1 < 0 || arg1 > this.field2271.length ? -1 : this.field2271[arg1];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
    public final int method801(int arg0, int arg1, int arg2) {
        field2270++;
        int var4 = 62 % ((arg0 + 61) / 49);
        if (this.field2271 == null || arg1 < 0 || this.field2271.length < arg1) {
            return -1;
        } else if (this.field2278[arg1] == null || arg2 < 0 || arg2 > this.field2278[arg1].length) {
            return -1;
        } else {
            return this.field2278[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(Z)V")
    public static void method802(boolean arg0) {
        field2281 = null;
        field2280 = null;
        if (!arg0) {
            field2283 = null;
            field2272 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(Z)Lub;")
    public final class227 method803(boolean arg0) {
        field2265++;
        class227 var2 = class223.method1407(80, 0);
        if (this.field2274 == null) {
            return class119.field2166;
        }
        var2.method1486(arg0, this.field2274[0]);
        for (int var3 = 1; var3 < this.field2274.length; var3++) {
            var2.method1486(arg0, class228.field3981);
            var2.method1486(false, this.field2274[var3]);
        }
        return var2.method1488(43);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public final void method804(int arg0) {
        if (arg0 != 32768) {
            field2283 = null;
        }
        field2263++;
        if (this.field2264 != null) {
            for (int var2 = 0; var2 < this.field2264.length; var2++) {
                this.field2264[var2] = class246.method1640(this.field2264[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)I")
    public final int method805(int arg0) {
        field2276++;
        if (arg0 == 1) {
            return this.field2271 == null ? 0 : this.field2271.length;
        } else {
            return -86;
        }
    }
}
