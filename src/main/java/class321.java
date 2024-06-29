import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class321 implements class209 {

    @OriginalMember(owner = "client!km", name = "j", descriptor = "Lhga;")
    private class157 field4717 = new class157(256);

    @OriginalMember(owner = "client!km", name = "r", descriptor = "Lpu;")
    private class522 field4725;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lpu;")
    private class522 field4712;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    private int field4716;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[Laba;")
    private class159[] field4713;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "[I")
    public static int[] field4724 = new int[32];

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field4719 = 0;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Lnea;")
    public static class664 field4715 = new class664(72, 12);

    @OriginalMember(owner = "client!km", name = "s", descriptor = "Z")
    public static boolean field4726 = false;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IBI)Z", line = 3)
    public static final boolean method2006(int arg0, byte arg1, int arg2) {
        field4721++;
        if (arg1 != 44) {
            field4726 = true;
        }
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IZFIII)[F", line = 15)
    public final float[] method1385(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5) {
        int var7 = 92 % ((-arg4 - 27) / 33);
        field4709++;
        return this.method2009((byte) 96, arg3).method2074(58, arg0, this, this.field4712, this.field4713[arg3].field2290, arg5);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 26)
    public static void method2007(int arg0) {
        field4724 = null;
        if (arg0 == 0) {
            field4715 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V", line = 41)
    public static final void method2008(int arg0) {
        field4711++;
        if (class100.field1556 == -1) {
            return;
        }
        if (arg0 != 1295) {
            field4724 = null;
        }
        int var1 = class508.field7171.method2090(-7249);
        int var2 = class508.field7171.method2093(22302);
        class356 var3 = (class356) class691.field9713.method472((byte) -126);
        if (var3 != null) {
            var1 = var3.method1031((byte) -65);
            var2 = var3.method1032((byte) 15);
        }
        class525.method3019(0, class100.field1556, 0, 0, class31.field494, 0, 122, var2, class487.field6930, var1);
        if (class382.field5392 != null) {
            class450.method2670(var2, 62, var1);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Z", line = 74)
    public final boolean method1383(int arg0, int arg1) {
        field4722++;
        int var3 = -16 / ((arg1 - 17) / 32);
        class329 var4 = this.method2009((byte) 107, arg0);
        return var4 != null && var4.method2073(this.field4712, this, (byte) 121);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)Laba;", line = 86)
    public final class159 method1386(int arg0, int arg1) {
        field4723++;
        if (arg1 != -6514) {
            this.method1384(false, -23, 35, 49, -0.4926612F, (byte) 53);
        }
        return this.field4713[arg0];
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIIIFB)[I", line = 99)
    public final int[] method1384(boolean arg0, int arg1, int arg2, int arg3, float arg4, byte arg5) {
        field4718++;
        return arg5 == 125 ? this.method2009((byte) 76, arg3).method2067(this, (double) arg4, this.field4712, this.field4713[arg3].field2290, arg1, (byte) 116, arg2) : null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIFIIZ)[I", line = 111)
    public final int[] method1381(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5) {
        field4720++;
        if (arg4 >= -86) {
            this.method1386(-91, 48);
        }
        return this.method2009((byte) 126, arg1).method2066(this, this.field4712, arg3, arg5, arg0, (double) arg2, 255, this.field4713[arg1].field2290);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I", line = 122)
    public final int method1382(int arg0) {
        if (arg0 != 25737) {
            this.method1385(48, true, -0.6456061F, -71, -118, 101);
        }
        field4714++;
        return this.field4716;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)Lrr;", line = 137)
    private final class329 method2009(byte arg0, int arg1) {
        field4710++;
        class375 var3 = this.field4717.method1097((long) arg1, (byte) -121);
        if (var3 != null) {
            return (class329) var3;
        }
        byte[] var4 = this.field4725.method2994(arg1, (byte) 93);
        if (var4 == null) {
            return null;
        }
        class329 var5 = new class329(new class695(var4));
        if (arg0 < 66) {
            this.field4716 = 90;
        }
        this.field4717.method1095((long) arg1, (byte) -124, var5);
        return var5;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lpu;Lpu;Lpu;)V", line = 173)
    public class321(class522 arg0, class522 arg1, class522 arg2) {
        this.field4725 = arg1;
        this.field4712 = arg2;
        class695 var4 = new class695(arg0.method3007(0, 0, 5));
        this.field4716 = var4.method3847((byte) 118);
        this.field4713 = new class159[this.field4716];
        for (int var5 = 0; var5 < this.field4716; var5++) {
            if (var4.method3826(false) == 1) {
                this.field4713[var5] = new class159();
            }
        }
        for (int var6 = 0; var6 < this.field4716; var6++) {
            if (this.field4713[var6] != null) {
                this.field4713[var6].field2305 = var4.method3826(false) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field4716; var7++) {
            if (this.field4713[var7] != null) {
                this.field4713[var7].field2289 = var4.method3826(false) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field4716; var8++) {
            if (this.field4713[var8] != null) {
                this.field4713[var8].field2304 = var4.method3826(false) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field4716; var9++) {
            if (this.field4713[var9] != null) {
                this.field4713[var9].field2299 = var4.method3826(false) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field4716; var10++) {
            if (this.field4713[var10] != null) {
                this.field4713[var10].field2297 = var4.method3827((byte) -74);
            }
        }
        for (int var11 = 0; var11 < this.field4716; var11++) {
            if (this.field4713[var11] != null) {
                this.field4713[var11].field2292 = var4.method3827((byte) -54);
            }
        }
        for (int var12 = 0; var12 < this.field4716; var12++) {
            if (this.field4713[var12] != null) {
                this.field4713[var12].field2300 = var4.method3827((byte) -71);
            }
        }
        for (int var13 = 0; var13 < this.field4716; var13++) {
            if (this.field4713[var13] != null) {
                this.field4713[var13].field2291 = var4.method3827((byte) 66);
            }
        }
        for (int var14 = 0; var14 < this.field4716; var14++) {
            if (this.field4713[var14] != null) {
                this.field4713[var14].field2283 = (short) var4.method3847((byte) 118);
            }
        }
        for (int var15 = 0; var15 < this.field4716; var15++) {
            if (this.field4713[var15] != null) {
                this.field4713[var15].field2298 = var4.method3827((byte) 38);
            }
        }
        for (int var16 = 0; var16 < this.field4716; var16++) {
            if (this.field4713[var16] != null) {
                this.field4713[var16].field2293 = var4.method3827((byte) 113);
            }
        }
        for (int var17 = 0; var17 < this.field4716; var17++) {
            if (this.field4713[var17] != null) {
                this.field4713[var17].field2288 = var4.method3826(false) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field4716; var18++) {
            if (this.field4713[var18] != null) {
                this.field4713[var18].field2290 = var4.method3826(false) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field4716; var19++) {
            if (this.field4713[var19] != null) {
                this.field4713[var19].field2296 = var4.method3827((byte) 90);
            }
        }
        for (int var20 = 0; var20 < this.field4716; var20++) {
            if (this.field4713[var20] != null) {
                this.field4713[var20].field2301 = var4.method3826(false) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field4716; var21++) {
            if (this.field4713[var21] != null) {
                this.field4713[var21].field2285 = var4.method3826(false) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field4716; var22++) {
            if (this.field4713[var22] != null) {
                this.field4713[var22].field2287 = var4.method3826(false) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field4716; var23++) {
            if (this.field4713[var23] != null) {
                this.field4713[var23].field2284 = var4.method3826(false);
            }
        }
        for (int var24 = 0; var24 < this.field4716; var24++) {
            if (this.field4713[var24] != null) {
                this.field4713[var24].field2294 = var4.method3880(8);
            }
        }
        for (int var25 = 0; var25 < this.field4716; var25++) {
            if (this.field4713[var25] != null) {
                this.field4713[var25].field2295 = var4.method3826(false) == 1;
            }
        }
    }
}
