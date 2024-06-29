import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class384 {

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    private int field5870 = -1;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "Z")
    public boolean field5867 = true;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "Lna;")
    private class211 field5883;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    private int field5868;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "Ltj;")
    private class468 field5875;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    private int field5877;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    private int field5866;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "Ltb;")
    private class347 field5871;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "Lvo;")
    private class264 field5873;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "Lsa;")
    private class532 field5879;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "Lqu;")
    public static class219 field5872 = new class219(37, -1);

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5882 = null;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)I")
    public static final int method2472(int arg0, int arg1, int arg2) {
        field5878++;
        if (arg2 >= -102) {
            method2478(-87);
        }
        int var3 = (class477.method2958(arg0 + 45365, 4, 86, arg1 + 91923) - (-(class477.method2958(arg0 + 10294, 2, -127, arg1 + 37821) - 128 >> 1) - (class477.method2958(arg0, 1, 45, arg1) - 128 >> 2))) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILgi;)V")
    public static final void method2473(int arg0, class437 arg1) {
        field5874++;
        class437 var2 = class49.method354(arg1, (byte) -22);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class219.field3715;
            var3 = class489.field7400;
        } else {
            var3 = var2.field6615;
            var4 = var2.field6730;
        }
        class170.method1075(var3, var4, arg1, (byte) 69, false);
        if (arg0 <= -68) {
            class84.method591(arg1, 97, var4, var3);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public final void method2474(int arg0) {
        if (arg0 != 1) {
            this.method2477(null, 74, 83);
        }
        this.method2477(this.field5871, -32644, this.field5866);
        field5880++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "([BIII)V")
    public final void method2475(byte[] arg0, int arg1, int arg2, int arg3) {
        this.field5873.method747(24519, this.field5883.method1530(arg2, 5126) * arg1, arg0, arg2);
        field5869++;
        if (arg3 == 128) {
            this.method2477(this.field5873, arg3 - 32772, arg1);
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
    private final void method2476(int arg0) {
        field5884++;
        if (!this.field5867) {
            return;
        }
        this.field5867 = false;
        byte[] var2 = this.field5875.field7174;
        byte[] var3 = this.field5883.field3626;
        if (arg0 > -23) {
            method2472(-124, 86, -103);
        }
        int var4 = 0;
        int var5 = this.field5875.field7162;
        int var6 = this.field5868 + (this.field5875.field7162 * this.field5877);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field5879 != null && this.field5870 == var4) {
            this.field5867 = false;
            return;
        }
        this.field5870 = var4;
        int var8 = 0;
        int var9 = this.field5868 + (this.field5877 * var5);
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field5875.field7162 - 128;
        }
        if (this.field5879 == null) {
            this.field5879 = new class532(this.field5883, 3553, 6406, 128, 128, false, this.field5883.field3626, 6406, false);
            this.field5879.method3160(false, (byte) 50, false);
            this.field5879.method2703(0, true);
        } else {
            this.field5879.method3164(0, 128, 0, 6406, this.field5883.field3626, false, 128, 0, 0, true);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Ltb;II)V")
    private final void method2477(class347 arg0, int arg1, int arg2) {
        field5876++;
        if (arg2 != 0 && arg1 == -32644) {
            this.method2476(-71);
            this.field5883.method1540(arg1 + 32767, this.field5879);
            this.field5883.method1537(arg0, 0, 0, arg2, 4);
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)V")
    public static void method2478(int arg0) {
        field5872 = null;
        field5882 = null;
        int var1 = 20 / ((63 - arg0) / 43);
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lna;Ltj;Lhk;IIIII)V")
    public class384(class211 arg0, class468 arg1, class102 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5883 = arg0;
        this.field5868 = arg6;
        this.field5875 = arg1;
        this.field5877 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3755 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field1461[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field5866 = var10;
        if (var10 <= 0) {
            this.field5879 = null;
        } else {
            class208 var14 = new class208(var10 * 2);
            if (this.field5883.field3560) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3755 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field1461[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1437(var23[var24] & 0xFFFF, 0);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3755 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field1461[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1467((byte) 23, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field5871 = this.field5883.method1514(var14.field3162, 16711680, 5123, false, var14.field3193);
            this.field5873 = new class264(this.field5883, 5123, null, 1);
        }
    }
}
