import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class108 extends class67 {

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "Z")
    public boolean field2483 = false;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public int field2489;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Z")
    public boolean field2490;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "[I")
    private int[] field2487;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "[I")
    private int[] field2492;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "[I")
    private int[] field2485;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "[I")
    private int[] field2482;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public int field2488;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    private int field2484;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "[I")
    public int[] field2486;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "[I")
    private static int[] field2491;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
    public final void method821() {
        this.field2486 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(DILpb;)Z")
    public final boolean method822(double arg0, int arg1, class100 arg2) {
        for (int var5 = 0; var5 < this.field2487.length; var5++) {
            if (arg2.method767(-9464, this.field2487[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2486 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2487.length; var7++) {
            class93 var10 = class124.method966((byte) 127, arg2, this.field2487[var7]);
            var10.method724();
            byte[] var11 = var10.field2171;
            int[] var12 = var10.field2170;
            int var13 = this.field2482[var7];
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
                var12[var19] = class134.method1096(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2492[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2174 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2486[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2174 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2486[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2174 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2486[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2486[var8] &= 0xF8F8FF;
            int var9 = this.field2486[var8];
            this.field2486[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2486[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2486[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
    public final void method823(int arg0) {
        if (this.field2486 == null) {
            return;
        }
        if (this.field2488 == 1 || this.field2488 == 3) {
            if (field2491 == null || field2491.length < this.field2486.length) {
                field2491 = new int[this.field2486.length];
            }
            short var2;
            if (this.field2486.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2486.length / 4;
            int var4 = arg0 * var2 * this.field2484;
            int var5 = var3 - 1;
            if (this.field2488 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2491[var6] = this.field2486[var17];
                field2491[var3 + var6] = this.field2486[var3 + var17];
                field2491[var3 + var6 + var3] = this.field2486[var3 + var17 + var3];
                field2491[var3 + var6 + var3 + var3] = this.field2486[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2486;
            this.field2486 = field2491;
            field2491 = var7;
        }
        if (this.field2488 != 2 && this.field2488 != 4) {
            return;
        }
        if (field2491 == null || field2491.length < this.field2486.length) {
            field2491 = new int[this.field2486.length];
        }
        short var8;
        if (this.field2486.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2486.length / 4;
        int var10 = this.field2484 * arg0;
        int var11 = var8 - 1;
        if (this.field2488 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2491[var15] = this.field2486[var16];
                field2491[var9 + var15] = this.field2486[var9 + var16];
                field2491[var9 + var15 + var9] = this.field2486[var9 + var16 + var9];
                field2491[var9 + var15 + var9 + var9] = this.field2486[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2486;
        this.field2486 = field2491;
        field2491 = var13;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()V")
    public static void method824() {
        field2491 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lid;)V")
    public class108(class60 arg0) {
        this.field2489 = arg0.method467(255);
        this.field2490 = arg0.method462((byte) 116) == 1;
        int var2 = arg0.method462((byte) 116);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2487 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2487[var3] = arg0.method467(255);
        }
        if (var2 > 1) {
            this.field2492 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2492[var4] = arg0.method462((byte) 116);
            }
        }
        if (var2 > 1) {
            this.field2485 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2485[var5] = arg0.method462((byte) 116);
            }
        }
        this.field2482 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2482[var6] = arg0.method442((byte) -105);
        }
        this.field2488 = arg0.method462((byte) 116);
        this.field2484 = arg0.method462((byte) 116);
        this.field2486 = null;
    }
}
