import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class206 extends class59 {

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
    private int field4044 = 4;

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
    private int field4048 = 0;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    private int field4040 = 4;

    @OriginalMember(owner = "client!wh", name = "fb", descriptor = "[I")
    private int[] field4052 = new int[512];

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "I")
    private int field4046 = 4;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "I")
    private int field4045 = 1638;

    @OriginalMember(owner = "client!wh", name = "cb", descriptor = "Z")
    private boolean field4049 = true;

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "[I")
    public static int[] field4047 = new int[32];

    @OriginalMember(owner = "client!wh", name = "jb", descriptor = "Lsd;")
    private static class166 field4056;

    @OriginalMember(owner = "client!wh", name = "lb", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!wh", name = "kb", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!wh", name = "mb", descriptor = "Lsd;")
    public static class166 field4059;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!wh", name = "db", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!wh", name = "eb", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!wh", name = "gb", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!wh", name = "nb", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "[I")
    private int[] field4043;

    @OriginalMember(owner = "client!wh", name = "hb", descriptor = "[I")
    private int[] field4054;

    @OriginalMember(owner = "client!wh", name = "ib", descriptor = "[I")
    public static int[] field4055;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 < 18) {
            this.method1344(34);
        }
        ++field4051;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field4046 = arg0.method400(255);
            } else {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field4044 = this.field4040 = arg0.method400(255);
                        return;
                    }
                    if (arg2 == 4) {
                        this.field4048 = arg0.method400(255);
                        return;
                    }
                    if (~arg2 == -6) {
                        this.field4044 = arg0.method400(255);
                        return;
                    }
                    if (arg2 == 6) {
                        this.field4040 = arg0.method400(255);
                        return;
                    }
                } else {
                    this.field4045 = arg0.method421((byte) 68);
                    if (this.field4045 < 0) {
                        this.field4054 = new int[this.field4046];
                        for (int var5 = 0; var5 < this.field4046; ++var5) {
                            this.field4054[var5] = arg0.method421((byte) 57);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field4049 = arg0.method400(255) == 1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
    private final void method1344(int arg0) {
        ++field4050;
        Random var2 = new Random((long) this.field4048);
        int var3 = 0;
        if (arg0 < -35) {
            while (~var3 > -256) {
                this.field4052[var3] = -1;
                ++var3;
            }
            for (int var4 = 0; ~var4 > -256; ++var4) {
                int var5;
                do {
                    var5 = class12.method75(var2, (byte) -125, 255);
                } while (this.field4052[var5] != -1);
                this.field4052[var5 + 255] = this.field4052[var5] = var4;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        if (arg0 != 23459) {
            field4057 = 20;
        }
        ++field4041;
        this.method1344(-56);
        this.method1346(0);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class206() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIII)I")
    private final int method1345(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -1588837268) {
            this.method1345(31, -121, -117, 75, -53);
        }
        ++field4053;
        int var6 = -4096 & arg1;
        int var7 = arg1 - var6;
        int var8 = -4096 & arg4;
        int var9 = -4096 & arg2;
        int var10 = -4096 & arg3;
        int var11 = var6 >> 12;
        int var12 = arg3 - var10;
        int var13 = var10 >> 12;
        int var14 = var13 + 1;
        if (var14 >= var9 >> 12) {
            var14 = 0;
        }
        int var15 = var11 + 1;
        int var16 = var14 & 255;
        if (var8 >> 12 <= var15) {
            var15 = 0;
        }
        int var17 = var11 & 255;
        int var18 = this.field4052[this.field4052[var16] + var17] % 4;
        int var19 = var13 & 255;
        int var20 = var15 & 255;
        int var21 = this.field4052[this.field4052[var16] + var20] % 4;
        int var22 = this.field4052[var17 - -this.field4052[var19]] % 4;
        int var23 = this.field4052[this.field4052[var19] + var20] % 4;
        int var24 = class144.method987((byte) -106, var12, var7, class89.field1758[var22]);
        int var25 = class144.method987((byte) -106, var12, var7 + -4096, class89.field1758[var23]);
        int var26 = class144.method987((byte) -106, var12 + -4096, var7, class89.field1758[var18]);
        int var27 = class144.method987((byte) -106, var12 + -4096, var7 + -4096, class89.field1758[var21]);
        int var28 = class90.method707(var7, (byte) -126);
        int var29 = class90.method707(var12, (byte) -97);
        int var30 = class156.method1045(var28, var25, var24, arg0 + 1588841364);
        int var31 = class156.method1045(var28, var27, var26, 4096);
        return class156.method1045(var29, var31, var30, 4096);
    }

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)V")
    private final void method1346(int arg0) {
        if (arg0 < this.field4045) {
            this.field4043 = new int[this.field4046];
            this.field4054 = new int[this.field4046];
            for (int var2 = 0; var2 < this.field4046; ++var2) {
                this.field4054[var2] = (int) (4096.0D * Math.pow((double) (this.field4045 / 4096), (double) var2));
                this.field4043[var2] = (int) (4096.0D * Math.pow(2.0D, (double) var2));
            }
        } else if (this.field4054 != null && this.field4054.length == this.field4046) {
            this.field4043 = new int[this.field4046];
            for (int var3 = 0; ~var3 > ~this.field4046; ++var3) {
                this.field4043[var3] = (int) (4096.0D * Math.pow(2.0D, (double) var3));
            }
        }
        ++field4039;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    public static void method1347(byte arg0) {
        field4055 = null;
        field4056 = null;
        field4047 = null;
        if (arg0 == -102) {
            field4059 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        if (arg1 >= -124) {
            this.field4045 = 65;
        }
        int[] var3 = super.field1219.method721(arg0, -126);
        if (super.field1219.field1816) {
            int var4 = this.field4044 << 12;
            int var5 = this.field4040 << 12;
            int var6 = class136.field2657[arg0] * this.field4040;
            for (int var7 = 0; var7 < class98.field1879; ++var7) {
                int var8 = class187.field3569[var7] * this.field4044;
                int var9 = 0;
                for (int var10 = 0; this.field4046 > var10; ++var10) {
                    int var11 = this.field4043[var10];
                    int var12 = this.field4054[var10];
                    int var13 = this.method1345(-1588837268, var8 * var11 >> 12, var5 * var11 >> 12, var6 * var11 >> 12, var4 * var11 >> 12);
                    var9 += var12 * var13 >> 12;
                }
                if (this.field4049) {
                    var9 = (var9 >> 1) + 2048;
                }
                var3[var7] = var9;
            }
        }
        ++field4042;
        return var3;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field4047[var1] = var0 + -1;
            var0 += var0;
        }
        field4056 = class135.method935("Your ignore list is full)3 Max of 100 users)3", 0);
        field4058 = 0;
        field4057 = -1;
        field4059 = field4056;
    }
}
