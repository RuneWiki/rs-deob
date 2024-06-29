import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class81 extends class304 {

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "[I")
    private int[] field1193 = new int[3];

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    private int field1196 = 3216;

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
    private int field1201 = 3216;

    @OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
    private int field1204 = 4096;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
    public static int field1197 = 0;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "[[[I")
    public static int[][][] field1195 = new int[2][][];

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!pk", name = "Z", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "[Lrj;")
    public static class269[] field1194;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)V", line = 8)
    private final void method626(boolean arg0) {
        if (!arg0) {
            field1194 = (class269[]) null;
        }
        field1203++;
        double var2 = Math.cos((double) ((float) this.field1201 / 4096.0F));
        this.field1193[0] = (int) (Math.sin((double) ((float) this.field1196 / 4096.0F)) * 4096.0D * var2);
        this.field1193[1] = (int) (Math.cos((double) ((float) this.field1196 / 4096.0F)) * var2 * 4096.0D);
        this.field1193[2] = (int) (Math.sin((double) ((float) this.field1201 / 4096.0F)) * 4096.0D);
        int var4 = this.field1193[1] * this.field1193[1] >> 12;
        int var5 = this.field1193[0] * this.field1193[0] >> 12;
        int var6 = this.field1193[2] * this.field1193[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1193[0] = (this.field1193[0] << 12) / var7;
            this.field1193[2] = (this.field1193[2] << 12) / var7;
            this.field1193[1] = (this.field1193[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V", line = 37)
    public final void method100(boolean arg0) {
        this.method626(arg0);
        field1202++;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 68)
    public class81() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V", line = 51)
    public static final void method627(int arg0) {
        class280.field4353 = null;
        field1199++;
        class277.field4299 = null;
        class284.field4425 = null;
        class224.field3429 = null;
        class34.field499 = null;
        if (arg0 > -59) {
            field1195 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[I", line = 78)
    public final int[] method71(int arg0, int arg1) {
        field1198++;
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int var4 = class275.field4276 * this.field1204 >> 12;
            int[] var5 = this.method2086(class65.field941 & arg1 - 1, 0, (byte) 112);
            int[] var6 = this.method2086(arg1, 0, (byte) 112);
            int[] var7 = this.method2086(class65.field941 & arg1 + 1, 0, (byte) 112);
            for (int var8 = 0; var8 < class218.field3333; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                int var11 = (var6[class54.field721 & var8 - 1] - var6[var8 + 1 & class54.field721]) * var4 >> 12;
                int var12 = var11 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > 255) {
                    var10 = 255;
                }
                int var13 = class4.field62[var12 + ((var10 + 1) * var10 >> 1)] & 0xFF;
                int var14 = var11 * var13 >> 8;
                int var15 = this.field1193[0] * var14 >> 12;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field1193[2] * var16 >> 12;
                int var18 = var9 * var13 >> 8;
                int var19 = this.field1193[1] * var18 >> 12;
                var3[var8] = var15 + var19 + var17;
            }
        }
        if (arg0 != 7) {
            this.method626(true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lwm;II)V", line = 168)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field1204 = arg0.method1755(false);
        } else if (arg1 == 1) {
            this.field1196 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field1201 = arg0.method1755(false);
        }
        if (arg2 != -2828) {
            field1197 = -108;
        }
        field1200++;
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)V", line = 202)
    public static void method628(int arg0) {
        field1195 = (int[][][]) null;
        if (arg0 != -8512) {
            field1195 = (int[][][]) ((int[][][]) null);
        }
        field1194 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lcn;)V", line = 222)
    public static final void method629(class228 arg0) {
        for (int var1 = arg0.field3472; var1 <= arg0.field3474; var1++) {
            for (int var2 = arg0.field3475; var2 <= arg0.field3484; var2++) {
                class79 var3 = class213.field3262[arg0.field3486][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1169; var4++) {
                        if (var3.field1157[var4] == arg0) {
                            var3.field1169--;
                            for (int var5 = var4; var5 < var3.field1169; var5++) {
                                var3.field1157[var5] = var3.field1157[var5 + 1];
                                var3.field1180[var5] = var3.field1180[var5 + 1];
                            }
                            var3.field1157[var3.field1169] = null;
                            break;
                        }
                    }
                    var3.field1162 = 0;
                    for (int var6 = 0; var6 < var3.field1169; var6++) {
                        var3.field1162 |= var3.field1180[var6];
                    }
                }
            }
        }
    }
}
