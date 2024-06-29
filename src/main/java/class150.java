import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class150 extends class326 {

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    private int field2346 = 1;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    private int field2344 = 1;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "Z")
    public static boolean field2345 = false;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2353 = "Opened title screen";

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field2354 = -2;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field2357 = -1;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "Lug;")
    public static class253 field2347;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BII)I", line = 8)
    public static final int method1096(byte arg0, int arg1, int arg2) {
        field2350++;
        if (arg0 == -18) {
            int var3 = arg2 >> 31 & arg1 - 1;
            return ((arg2 >>> 31) + arg2) % arg1 + var3;
        } else {
            return -121;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIBI)I", line = 22)
    public static final int method1097(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -128) {
            return 64;
        }
        field2356++;
        int var5 = arg2 & 0xF;
        int var6 = var5 >= 8 ? arg1 : arg4;
        int var7 = var5 < 4 ? arg1 : (var5 == 12 || var5 == 14 ? arg4 : arg0);
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)[[I", line = 44)
    public final int[][] method253(int arg0, byte arg1) {
        int[][] var3 = this.field5104.method2365((byte) -72, arg0);
        if (this.field5104.field5325) {
            int var4 = this.field2346 + this.field2346 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2344 + this.field2344 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field2346; var9 <= this.field2346 + arg0; var9++) {
                int[][] var10 = this.method2293(-15033, class29.field427 & var9, 0);
                int var11 = 0;
                int[][] var12 = new int[3][class166.field2731];
                int[] var13 = var10[0];
                int var14 = 0;
                int[] var15 = var10[2];
                int var16 = 0;
                int[] var17 = var10[1];
                for (int var18 = -this.field2344; var18 <= this.field2344; var18++) {
                    int var19 = var18 & class215.field3397;
                    var16 += var13[var19];
                    var11 += var17[var19];
                    var14 += var15[var19];
                }
                int[] var20 = var12[0];
                int[] var21 = var12[1];
                int[] var22 = var12[2];
                int var23 = 0;
                while (var23 < class166.field2731) {
                    var20[var23] = var7 * var16 >> 16;
                    var21[var23] = var7 * var11 >> 16;
                    var22[var23] = var7 * var14 >> 16;
                    int var24 = var23 - this.field2344 & class215.field3397;
                    int var25 = var14 - var15[var24];
                    int var26 = var16 - var13[var24];
                    int var27 = var11 - var17[var24];
                    var23++;
                    int var28 = this.field2344 + var23 & class215.field3397;
                    var11 = var17[var28] + var27;
                    var14 = var15[var28] + var25;
                    var16 = var13[var28] + var26;
                }
                var8[this.field2346 + var9 - arg0] = var12;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[2];
            int[] var31 = var3[0];
            for (int var32 = 0; var32 < class166.field2731; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var34 += var37[0][var32];
                    var35 += var37[1][var32];
                    var33 += var37[2][var32];
                }
                var31[var32] = var5 * var34 >> 16;
                var29[var32] = var5 * var35 >> 16;
                var30[var32] = var5 * var33 >> 16;
            }
        }
        field2349++;
        int var38 = 107 / ((arg1 - 60) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V", line = 170)
    public static void method1098(int arg0) {
        field2353 = null;
        if (arg0 != -443007184) {
            method1097(105, 43, -19, (byte) -96, -103);
        }
        field2347 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[I", line = 186)
    public final int[] method103(int arg0, int arg1) {
        field2348++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int var4 = this.field2346 + this.field2346 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2344 + this.field2344 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field2346; var9 <= arg1 + this.field2346; var9++) {
                int[] var10 = this.method2287(0, class29.field427 & var9, -3896);
                int[] var11 = new int[class166.field2731];
                int var12 = 0;
                for (int var13 = -this.field2344; var13 <= this.field2344; var13++) {
                    var12 += var10[class215.field3397 & var13];
                }
                int var14 = 0;
                while (var14 < class166.field2731) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field2344 & class215.field3397];
                    var14++;
                    var12 = var10[class215.field3397 & this.field2344 + var14] + var15;
                }
                var8[var9 + this.field2346 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class166.field2731; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return arg0 >= -25 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 275)
    public class150() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(BII)I", line = 280)
    public static final int method1099(byte arg0, int arg1, int arg2) {
        field2355++;
        if (arg0 <= 68) {
            field2354 = -38;
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Lrf;", line = 302)
    public static final class37 method1100(int arg0, int arg1) {
        class37 var2 = (class37) class271.field4200.method1351((long) arg1, 63);
        field2351++;
        if (arg0 != -2823) {
            return (class37) null;
        } else if (var2 == null) {
            byte[] var3 = class92.field1227.method1813(arg1, 30, true);
            class37 var4 = new class37();
            if (var3 != null) {
                var4.method319(arg1, new class6(var3), 0);
            }
            class271.field4200.method1347(var4, (long) arg1, (byte) -109);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZLvl;)V", line = 331)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field2344 = arg2.method58(-288140008);
        } else if (arg0 == 1) {
            this.field2346 = arg2.method58(-288140008);
        } else if (arg0 == 2) {
            this.field5121 = arg2.method58(-288140008) == 1;
        }
        field2352++;
    }
}
