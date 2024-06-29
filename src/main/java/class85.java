import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class85 extends class273 {

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "Z")
    private boolean field1293 = true;

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
    private int field1296 = 4096;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    public static int field1284 = 0;

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
    public static int field1295 = 0;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "Lff;")
    public static class214 field1291;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "Lwf;")
    public static class306 field1289;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "Lwf;")
    public static class306 field1290;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BILgn;)V", line = 7)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field1288++;
        if (arg0 <= 27) {
            method583(-18);
        }
        if (arg1 == 0) {
            this.field1296 = arg2.method1994(false);
        } else if (arg1 == 1) {
            this.field1293 = arg2.method2043((byte) -110) == 1;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V", line = 40)
    public class85() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIILfe;JZ)V", line = 46)
    public static final void method580(int arg0, int arg1, int arg2, int arg3, class94 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class23 var8 = new class23();
        var8.field285 = arg4;
        var8.field295 = arg1 * 128 + 64;
        var8.field286 = arg2 * 128 + 64;
        var8.field299 = arg3;
        var8.field289 = arg5;
        var8.field288 = arg6;
        if (class90.field1375[arg0][arg1][arg2] == null) {
            class90.field1375[arg0][arg1][arg2] = new class174(arg0, arg1, arg2);
        }
        class90.field1375[arg0][arg1][arg2].field2667 = var8;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([BIII)I", line = 66)
    public static final int method581(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -165438552) {
            return -113;
        }
        field1287++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class6.field61[(var4 ^ arg0[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)I", line = 89)
    public static final int method582(byte arg0, int arg1) {
        field1286++;
        if (arg0 >= -49) {
            field1291 = (class214) null;
        }
        if (class308.field4851 != null) {
            class308.field4851.method596(false);
            class308.field4851 = null;
        }
        class194.field2926++;
        if (class194.field2926 > 4) {
            class293.field4507 = 0;
            class194.field2926 = 0;
            return arg1;
        }
        if (class7.field82 == class274.field4220) {
            class7.field82 = class152.field2401;
        } else {
            class7.field82 = class274.field4220;
        }
        class293.field4507 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V", line = 124)
    public static final void method583(int arg0) {
        if (arg0 <= 78) {
            method586(false);
        }
        field1283++;
        class118.field1833.method1298((byte) 110);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(JSIBLjava/lang/String;ILjava/lang/String;I)V", line = 135)
    public static final void method584(long arg0, short arg1, int arg2, byte arg3, String arg4, int arg5, String arg6, int arg7) {
        field1292++;
        if (class260.field4036) {
            return;
        }
        if (class168.field2565 < 500) {
            class242.field3830[class168.field2565] = arg6;
            class76.field1144[class168.field2565] = arg4;
            class89.field1355[class168.field2565] = arg7 == -1 ? class161.field2499 : arg7;
            class194.field2925[class168.field2565] = arg1;
            class271.field4161[class168.field2565] = arg0;
            class167.field2560[class168.field2565] = arg5;
            class76.field1135[class168.field2565] = arg2;
            class168.field2565++;
        }
        if (arg3 >= -108) {
            field1284 = -11;
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V", line = 162)
    public static void method585(byte arg0) {
        field1289 = null;
        field1290 = null;
        if (arg0 != -31) {
            method586(true);
        }
        field1291 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)[[I", line = 182)
    public final int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            method586(false);
        }
        int[][] var3 = this.field4200.method539(arg1 ^ 0xDC, arg0);
        if (this.field4200.field1147) {
            int[] var4 = this.method1790(0, arg0 - 1 & class117.field1819, 0);
            int[] var5 = this.method1790(0, arg0, 0);
            int[] var6 = this.method1790(0, arg0 + 1 & class117.field1819, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class27.field346; var10++) {
                int var11 = (var5[class197.field2963 & var10 + 1] - var5[var10 - 1 & class197.field2963]) * this.field1296;
                int var12 = (var6[var10] - var4[var10]) * this.field1296;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                } else {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                }
                if (this.field1293) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        field1285++;
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(Z)V", line = 265)
    public static final void method586(boolean arg0) {
        class109.field1685.method1298((byte) 110);
        field1294++;
        if (!arg0) {
            field1284 = -20;
        }
    }
}
