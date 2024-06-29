import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class46 extends class37 {

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Z")
    public boolean field980 = false;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Z")
    public boolean field975;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "[I")
    private int[] field981;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[I")
    private int[] field982;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "[I")
    private int[] field979;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "[I")
    private int[] field977;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "[I")
    public int[] field973;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
    private static int[] field974;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 4)
    public final void method399(int arg0) {
        if (this.field973 == null) {
            return;
        }
        if (this.field976 == 1 || this.field976 == 3) {
            if (field974 == null || field974.length < this.field973.length) {
                field974 = new int[this.field973.length];
            }
            short var2;
            if (this.field973.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field973.length / 4;
            int var4 = arg0 * var2 * this.field983;
            int var5 = var3 - 1;
            if (this.field976 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field974[var6] = this.field973[var17];
                field974[var3 + var6] = this.field973[var3 + var17];
                field974[var3 + var6 + var3] = this.field973[var3 + var17 + var3];
                field974[var3 + var6 + var3 + var3] = this.field973[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field973;
            this.field973 = field974;
            field974 = var7;
        }
        if (this.field976 != 2 && this.field976 != 4) {
            return;
        }
        if (field974 == null || field974.length < this.field973.length) {
            field974 = new int[this.field973.length];
        }
        short var8;
        if (this.field973.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field973.length / 4;
        int var10 = this.field983 * arg0;
        int var11 = var8 - 1;
        if (this.field976 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field974[var15] = this.field973[var16];
                field974[var9 + var15] = this.field973[var9 + var16];
                field974[var9 + var15 + var9] = this.field973[var9 + var16 + var9];
                field974[var9 + var15 + var9 + var9] = this.field973[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field973;
        this.field973 = field974;
        field974 = var13;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V", line = 100)
    public static void method400() {
        field974 = null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Leb;)V", line = 121)
    public class46(class27 arg0) {
        this.field978 = arg0.method227(127);
        this.field975 = arg0.method231(255) == 1;
        int var2 = arg0.method231(255);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field981 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field981[var3] = arg0.method227(127);
        }
        if (var2 > 1) {
            this.field982 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field982[var4] = arg0.method231(255);
            }
        }
        if (var2 > 1) {
            this.field979 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field979[var5] = arg0.method231(255);
            }
        }
        this.field977 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field977[var6] = arg0.method251((byte) 105);
        }
        this.field976 = arg0.method231(255);
        this.field983 = arg0.method231(255);
        this.field973 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()V", line = 118)
    public final void method401() {
        this.field973 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(DILud;)Z", line = 180)
    public final boolean method402(double arg0, int arg1, class118 arg2) {
        for (int var5 = 0; var5 < this.field981.length; var5++) {
            if (arg2.method903(-124, this.field981[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field973 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field981.length; var7++) {
            class96 var10 = class4.method18(this.field981[var7], 15090, arg2);
            var10.method736();
            byte[] var11 = var10.field2058;
            int[] var12 = var10.field2063;
            int var13 = this.field977[var7];
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
                var12[var19] = class7.method47(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field982[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2056 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field973[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2056 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field973[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2056 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field973[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field973[var8] &= 0xF8F8FF;
            int var9 = this.field973[var8];
            this.field973[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field973[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field973[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }
}
