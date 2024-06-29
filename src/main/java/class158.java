import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class158 extends class273 {

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    private int field2466 = 1;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    private int field2470 = 1;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2465 = "M";

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field2469 = 0;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "Lsm;")
    public static class179 field2464 = new class179();

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 4)
    public class158() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V", line = 10)
    public static void method1096(byte arg0) {
        field2465 = null;
        if (arg0 > 0) {
            field2464 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)[[I", line = 24)
    public final int[][] method170(int arg0, byte arg1) {
        field2468++;
        if (arg1 != 68) {
            field2473 = 25;
        }
        int[][] var3 = this.field4200.method539(152, arg0);
        if (this.field4200.field1147) {
            int var4 = this.field2466 + this.field2466 + 1;
            int[][][] var5 = new int[var4][][];
            int var6 = 65536 / var4;
            int var7 = this.field2470 + this.field2470 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg0 - this.field2466; var9 <= this.field2466 + arg0; var9++) {
                int[][] var10 = this.method1795(var9 & class117.field1819, -124, 0);
                int[][] var11 = new int[3][class27.field346];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field2470; var18 <= this.field2470; var18++) {
                    int var19 = var18 & class197.field2963;
                    var14 += var16[var19];
                    var13 += var17[var19];
                    var12 += var15[var19];
                }
                int[] var20 = var11[1];
                int[] var21 = var11[2];
                int[] var22 = var11[0];
                int var23 = 0;
                while (var23 < class27.field346) {
                    var22[var23] = var8 * var12 >> 16;
                    var20[var23] = var8 * var14 >> 16;
                    var21[var23] = var8 * var13 >> 16;
                    int var24 = var23 - this.field2470 & class197.field2963;
                    int var25 = var14 - var16[var24];
                    int var26 = var13 - var17[var24];
                    var23++;
                    int var27 = var12 - var15[var24];
                    int var28 = this.field2470 + var23 & class197.field2963;
                    var12 = var15[var28] + var27;
                    var13 = var17[var28] + var26;
                    var14 = var16[var28] + var25;
                }
                var5[var9 - (arg0 - this.field2466)] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[2];
            int[] var31 = var3[1];
            for (int var32 = 0; var32 < class27.field346; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var5[var36];
                    var34 += var37[1][var32];
                    var35 += var37[2][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var6 * var33 >> 16;
                var31[var32] = var6 * var34 >> 16;
                var30[var32] = var6 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 154)
    public static final void method1097(int arg0, boolean arg1, String arg2) {
        field2474++;
        if (arg1) {
            if (class333.field5166 && class74.field1096) {
                try {
                    class254.method1714(new Object[] { (new URL(class294.field4541.getCodeBase(), arg2)).toString() }, (byte) 123, class89.field1359.field3569, "openjs");
                    return;
                } catch (Throwable var10) {
                }
            }
            try {
                class294.field4541.getAppletContext().showDocument(new URL(class294.field4541.getCodeBase(), arg2), "_blank");
            } catch (Exception var7) {
            }
        } else {
            try {
                class254.method1715("loggedout", (byte) -88, class89.field1359.field3569);
            } catch (Throwable var9) {
            }
            try {
                class294.field4541.getAppletContext().showDocument(new URL(class294.field4541.getCodeBase(), arg2), "_top");
            } catch (Exception var8) {
            }
        }
        if (arg0 != -1) {
            method1099(-73, (byte) 18, -89);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BILgn;)V", line = 202)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg0 <= 27) {
            method1096((byte) -115);
        }
        if (arg1 == 0) {
            this.field2470 = arg2.method2043((byte) -118);
        } else if (arg1 == 1) {
            this.field2466 = arg2.method2043((byte) -106);
        } else if (arg1 == 2) {
            this.field4194 = arg2.method2043((byte) -108) == 1;
        }
        field2472++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIILjh;)V", line = 254)
    public static final void method1098(int arg0, int arg1, int arg2, class207 arg3) {
        if (arg3.field3135 == 0) {
            arg3.field3177 = arg3.field3208;
        } else if (arg3.field3135 == 1) {
            arg3.field3177 = (arg0 - arg3.field3169) / 2 + arg3.field3208;
        } else if (arg3.field3135 == 2) {
            arg3.field3177 = arg0 - arg3.field3208 - arg3.field3169;
        } else if (arg3.field3135 == 3) {
            arg3.field3177 = arg3.field3208 * arg0 >> 14;
        } else if (arg3.field3135 == 4) {
            arg3.field3177 = (arg3.field3208 * arg0 >> 14) + (arg0 - arg3.field3169) / 2;
        } else {
            arg3.field3177 = arg0 - arg3.field3169 - (arg3.field3208 * arg0 >> 14);
        }
        if (arg3.field3229 == 0) {
            arg3.field3212 = arg3.field3143;
        } else if (arg3.field3229 == 1) {
            arg3.field3212 = (arg1 - arg3.field3239) / 2 + arg3.field3143;
        } else if (arg3.field3229 == 2) {
            arg3.field3212 = arg1 - arg3.field3143 - arg3.field3239;
        } else if (arg3.field3229 == 3) {
            arg3.field3212 = arg3.field3143 * arg1 >> 14;
        } else if (arg3.field3229 == 4) {
            arg3.field3212 = (arg1 - arg3.field3239) / 2 + (arg3.field3143 * arg1 >> 14);
        } else {
            arg3.field3212 = arg1 - (arg3.field3143 * arg1 >> 14) - arg3.field3239;
        }
        field2471++;
        if (arg2 != -22245) {
            field2465 = (String) null;
        }
        if (!class269.field4149 || !(client.method888(arg3).field1664 != 0 || arg3.field3273 == 0)) {
            return;
        }
        if (arg3.field3177 < 0) {
            arg3.field3177 = 0;
        } else if (arg0 < arg3.field3177 + arg3.field3169) {
            arg3.field3177 = arg0 - arg3.field3169;
        }
        if (arg3.field3212 < 0) {
            arg3.field3212 = 0;
        } else if (arg1 < (arg3.field3239 + arg3.field3212)) {
            arg3.field3212 = arg1 - arg3.field3239;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)I", line = 327)
    public static final int method1099(int arg0, byte arg1, int arg2) {
        field2467++;
        class15 var3 = (class15) class247.field3868.method1558((long) arg0, false);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field151.length; var5++) {
                if (var3.field154[var5] == arg2) {
                    var4 += var3.field151[var5];
                }
            }
            if (arg1 >= -76) {
                return -80;
            } else {
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I", line = 361)
    public final int[] method331(int arg0, int arg1) {
        field2463++;
        if (arg1 != -14650) {
            field2465 = (String) null;
        }
        int[] var3 = this.field4204.method365(arg0, arg1 + 14650);
        if (this.field4204.field792) {
            int var4 = this.field2466 + this.field2466 + 1;
            int var5 = this.field2470 + this.field2470 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field2466; var9 <= (this.field2466 + arg0); var9++) {
                int[] var10 = this.method1790(0, var9 & class117.field1819, 0);
                int var11 = 0;
                for (int var12 = -this.field2470; var12 <= this.field2470; var12++) {
                    var11 += var10[class197.field2963 & var12];
                }
                int[] var13 = new int[class27.field346];
                int var14 = 0;
                while (var14 < class27.field346) {
                    var13[var14] = var7 * var11 >> 16;
                    int var15 = var11 - var10[var14 - this.field2470 & class197.field2963];
                    var14++;
                    var11 = var10[this.field2470 + var14 & class197.field2963] + var15;
                }
                var8[var9 + this.field2466 - arg0] = var13;
            }
            for (int var16 = 0; var16 < class27.field346; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var6 * var17 >> 16;
            }
        }
        return var3;
    }
}
