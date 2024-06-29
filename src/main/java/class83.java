import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class83 extends class335 {

    @OriginalMember(owner = "client!tn", name = "T", descriptor = "I")
    private int field1298 = 3216;

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "[I")
    private int[] field1292 = new int[3];

    @OriginalMember(owner = "client!tn", name = "W", descriptor = "I")
    private int field1301 = 3216;

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "I")
    private int field1291 = 4096;

    @OriginalMember(owner = "client!tn", name = "L", descriptor = "I")
    public static int field1290 = 0;

    @OriginalMember(owner = "client!tn", name = "U", descriptor = "Z")
    public static boolean field1299 = false;

    @OriginalMember(owner = "client!tn", name = "O", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!tn", name = "P", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!tn", name = "R", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!tn", name = "S", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!tn", name = "V", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!tn", name = "Y", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!tn", name = "X", descriptor = "[[S")
    public static short[][] field1302;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)V", line = 6)
    public final void method381(int arg0) {
        field1296++;
        this.method586(82);
        int var2 = -6 / ((arg0 - 44) / 35);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILkh;I)V", line = 17)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg2 <= 51) {
            this.method586(-100);
        }
        if (arg0 == 0) {
            this.field1291 = arg1.method1151(-59);
        } else if (arg0 == 1) {
            this.field1301 = arg1.method1151(-51);
        } else if (arg0 == 2) {
            this.field1298 = arg1.method1151(-71);
        }
        field1297++;
    }

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "(I)V", line = 61)
    private final void method586(int arg0) {
        field1295++;
        if (arg0 <= 50) {
            return;
        }
        double var2 = Math.cos((double) ((float) this.field1298 / 4096.0F));
        this.field1292[0] = (int) (var2 * Math.sin((double) ((float) this.field1301 / 4096.0F)) * 4096.0D);
        this.field1292[1] = (int) (Math.cos((double) ((float) this.field1301 / 4096.0F)) * var2 * 4096.0D);
        this.field1292[2] = (int) (Math.sin((double) ((float) this.field1298 / 4096.0F)) * 4096.0D);
        int var4 = this.field1292[2] * this.field1292[2] >> 12;
        int var5 = this.field1292[0] * this.field1292[0] >> 12;
        int var6 = this.field1292[1] * this.field1292[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1292[0] = (this.field1292[0] << 12) / var7;
            this.field1292[2] = (this.field1292[2] << 12) / var7;
            this.field1292[1] = (this.field1292[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Lkh;I)Lkn;", line = 93)
    public static final class153 method587(class166 arg0, int arg1) {
        if (arg1 == 128) {
            field1303++;
            return new class153(arg0.method1166(52), arg0.method1166(52), arg0.method1166(52), arg0.method1166(52), arg0.method1156((byte) 43), arg0.method1156((byte) 23), arg0.method1178(0));
        } else {
            return (class153) null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V", line = 105)
    public class83() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Llb;IIIIIIIZ)V", line = 115)
    public static final void method588(class325 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class217.field3306;
        int var11;
        int var12 = var11 = (arg7 << 7) - class212.field3226;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class218.field3321[arg1][arg6][arg7] - class17.field238;
        int var18 = class218.field3321[arg1][arg6 + 1][arg7] - class17.field238;
        int var19 = class218.field3321[arg1][arg6 + 1][arg7 + 1] - class17.field238;
        int var20 = class218.field3321[arg1][arg6][arg7 + 1] - class17.field238;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class15.field211;
        int var46 = (var24 << 9) / var25 + class15.field210;
        int var47 = (var27 << 9) / var31 + class15.field211;
        int var48 = (var30 << 9) / var31 + class15.field210;
        int var49 = (var33 << 9) / var37 + class15.field211;
        int var50 = (var36 << 9) / var37 + class15.field210;
        int var51 = (var39 << 9) / var43 + class15.field211;
        int var52 = (var42 << 9) / var43 + class15.field210;
        class15.field208 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class174.field2639 && class316.method2148(class296.field4569 + class15.field211, class156.field2333 + class15.field210, var50, var52, var48, var49, var51, var47)) {
                class143.field2222 = arg6;
                class29.field428 = arg7;
            }
            if (!class94.field1516 && !arg8) {
                class15.field206 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class15.field218 || var51 > class15.field218 || var47 > class15.field218) {
                    class15.field206 = true;
                }
                if (arg0.field5055 == -1) {
                    if (arg0.field5053 != 12345678) {
                        class15.method124(var50, var52, var48, var49, var51, var47, arg0.field5053, arg0.field5059, arg0.field5054);
                    }
                } else if (!class232.field3674) {
                    int var53 = class15.field207.method2085(arg0.field5055, (byte) -84);
                    class15.method124(var50, var52, var48, var49, var51, var47, class309.method2109(var53, arg0.field5053), class309.method2109(var53, arg0.field5059), class309.method2109(var53, arg0.field5054));
                } else if (arg0.field5060) {
                    class15.method112(var50, var52, var48, var49, var51, var47, arg0.field5053, arg0.field5059, arg0.field5054, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field5055);
                } else {
                    class15.method112(var50, var52, var48, var49, var51, var47, arg0.field5053, arg0.field5059, arg0.field5054, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field5055);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class174.field2639 && class316.method2148(class296.field4569 + class15.field211, class156.field2333 + class15.field210, var46, var48, var52, var45, var47, var51)) {
            class143.field2222 = arg6;
            class29.field428 = arg7;
        }
        if (class94.field1516 || arg8) {
            return;
        }
        class15.field206 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class15.field218 || var47 > class15.field218 || var51 > class15.field218) {
            class15.field206 = true;
        }
        if (arg0.field5055 == -1) {
            if (arg0.field5050 != 12345678) {
                class15.method124(var46, var48, var52, var45, var47, var51, arg0.field5050, arg0.field5054, arg0.field5059);
            }
        } else if (class232.field3674) {
            class15.method112(var46, var48, var52, var45, var47, var51, arg0.field5050, arg0.field5054, arg0.field5059, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field5055);
        } else {
            int var54 = class15.field207.method2085(arg0.field5055, (byte) -84);
            class15.method124(var46, var48, var52, var45, var47, var51, class309.method2109(var54, arg0.field5050), class309.method2109(var54, arg0.field5054), class309.method2109(var54, arg0.field5059));
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)V", line = 275)
    public static void method589(byte arg0) {
        if (arg0 != -70) {
            field1290 = -50;
        }
        field1302 = (short[][]) null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([BBII)I", line = 289)
    public static final int method590(byte[] arg0, byte arg1, int arg2, int arg3) {
        field1300++;
        int var4 = -1;
        if (arg1 > -27) {
            method588((class325) null, -22, 114, 41, -53, -93, 80, 79, false);
        }
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class285.field4465[(var4 ^ arg0[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)[I", line = 333)
    public final int[] method149(int arg0, int arg1) {
        field1294++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (arg1 != 621) {
            field1302 = (short[][]) ((short[][]) null);
        }
        if (this.field5233.field2467) {
            int var4 = class327.field5094 * this.field1291 >> 12;
            int[] var5 = this.method2330(class227.field3597 & arg0 - 1, true, 0);
            int[] var6 = this.method2330(arg0, true, 0);
            int[] var7 = this.method2330(arg0 + 1 & class227.field3597, true, 0);
            for (int var8 = 0; var8 < class105.field1630; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                if (var10 < 0) {
                    var10 = -var10;
                }
                int var11 = (var6[var8 - 1 & class244.field3906] - var6[var8 + 1 & class244.field3906]) * var4 >> 12;
                int var12 = var11 >> 4;
                if (var10 > 255) {
                    var10 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class202.field3029[((var10 + 1) * var10 >> 1) + var12] & 0xFF;
                int var14 = var11 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field1292[1] * var15 >> 12;
                int var17 = this.field1292[0] * var14 >> 12;
                int var18 = var13 * 4096 >> 8;
                int var19 = this.field1292[2] * var18 >> 12;
                var3[var8] = var17 - (-var16 - var19);
            }
        }
        return var3;
    }
}
