import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class80 extends class69 {

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Z")
    public boolean field2012 = false;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "Z")
    public boolean field2020;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
    private int[] field2019;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "[I")
    private int[] field2013;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "[I")
    private int[] field2011;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "[I")
    private int[] field2017;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    private int field2016;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "[I")
    public int[] field2021;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "[I")
    private static int[] field2014;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(DILja;)Z", line = 5)
    public final boolean method678(double arg0, int arg1, class55 arg2) {
        for (int var5 = 0; var5 < this.field2019.length; var5++) {
            if (arg2.method452(this.field2019[var5], (byte) -106) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2021 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2019.length; var7++) {
            class81 var10 = class104.method860(this.field2019[var7], arg2, (byte) 15);
            var10.method682();
            byte[] var11 = var10.field2029;
            int[] var12 = var10.field2025;
            int var13 = this.field2017[var7];
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class49.method377(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2013[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2027 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2021[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2027 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2021[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2027 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2021[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2021[var8] &= 0xF8F8FF;
            int var9 = this.field2021[var8];
            this.field2021[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2021[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2021[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 190)
    public final void method679(int arg0) {
        if (this.field2021 == null) {
            return;
        }
        if (this.field2018 == 1 || this.field2018 == 3) {
            if (field2014 == null || field2014.length < this.field2021.length) {
                field2014 = new int[this.field2021.length];
            }
            short var2;
            if (this.field2021.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2021.length / 4;
            int var4 = arg0 * var2 * this.field2016;
            int var5 = var3 - 1;
            if (this.field2018 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2014[var6] = this.field2021[var17];
                field2014[var3 + var6] = this.field2021[var3 + var17];
                field2014[var3 + var6 + var3] = this.field2021[var3 + var17 + var3];
                field2014[var3 + var6 + var3 + var3] = this.field2021[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2021;
            this.field2021 = field2014;
            field2014 = var7;
        }
        if (this.field2018 != 2 && this.field2018 != 4) {
            return;
        }
        if (field2014 == null || field2014.length < this.field2021.length) {
            field2014 = new int[this.field2021.length];
        }
        short var8;
        if (this.field2021.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2021.length / 4;
        int var10 = this.field2016 * arg0;
        int var11 = var8 - 1;
        if (this.field2018 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2014[var15] = this.field2021[var16];
                field2014[var9 + var15] = this.field2021[var9 + var16];
                field2014[var9 + var15 + var9] = this.field2021[var9 + var16 + var9];
                field2014[var9 + var15 + var9 + var9] = this.field2021[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2021;
        this.field2021 = field2014;
        field2014 = var13;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lka;)V", line = 300)
    public class80(class61 arg0) {
        this.field2015 = arg0.method507((byte) -101);
        this.field2020 = arg0.method494(20471) == 1;
        int var2 = arg0.method494(20471);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2019 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2019[var3] = arg0.method507((byte) -117);
        }
        if (var2 > 1) {
            this.field2013 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2013[var4] = arg0.method494(20471);
            }
        }
        if (var2 > 1) {
            this.field2011 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2011[var5] = arg0.method494(20471);
            }
        }
        this.field2017 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2017[var6] = arg0.method496((byte) 122);
        }
        this.field2018 = arg0.method494(20471);
        this.field2016 = arg0.method494(20471);
        this.field2021 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V", line = 295)
    public final void method680() {
        this.field2021 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()V", line = 298)
    public static void method681() {
        field2014 = null;
    }
}
