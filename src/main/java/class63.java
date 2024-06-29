import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class63 extends class170 {

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "I")
    private int field1199 = -1;

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "Lmh;")
    private static class128 field1200 = class22.method156(124, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "Lmh;")
    public static class128 field1190 = field1200;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "Lvf;")
    public static class296 field1195 = new class296();

    @OriginalMember(owner = "client!ri", name = "eb", descriptor = "Z")
    public static boolean field1203 = false;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!ri", name = "cb", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ri", name = "db", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "[I")
    public int[] field1193;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V", line = 11)
    public final void method417(byte arg0) {
        super.method417(arg0);
        this.field1193 = null;
        field1201++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[[I", line = 22)
    public int[][] method62(int arg0, int arg1) {
        int var3 = -112 / ((-arg1 - 24) / 46);
        field1197++;
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883 && this.method421(0)) {
            int[] var5 = var4[0];
            int var6 = this.field1198 * (class12.field390 == this.field1202 ? arg0 : this.field1202 * arg0 / class12.field390);
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            if (class185.field3225 == this.field1198) {
                for (int var12 = 0; var12 < class185.field3225; var12++) {
                    int var13 = this.field1193[var6++];
                    var7[var12] = class238.method1622(255, var13) << 4;
                    var8[var12] = class238.method1622(4080, var13 >> 4);
                    var5[var12] = class238.method1622(4080, var13 >> 12);
                }
            } else {
                for (int var9 = 0; var9 < class185.field3225; var9++) {
                    int var10 = this.field1198 * var9 / class185.field3225;
                    int var11 = this.field1193[var6 + var10];
                    var7[var9] = class238.method1622(var11, 255) << 4;
                    var8[var9] = class238.method1622(var11 >> 4, 4080);
                    var5[var9] = class238.method1622(var11, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 91)
    public class63() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V", line = 96)
    public static void method418(int arg0) {
        field1195 = null;
        if (arg0 == -21312) {
            field1190 = null;
            field1200 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIZIII)V", line = 109)
    public static final void method419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (!arg6) {
            method419(-31, -74, 120, -45, 11, -70, false, -1, 77, 41);
        }
        field1191++;
        if (arg5 == arg7 && arg0 == arg2 && arg1 == arg9 && arg4 == arg8) {
            class90.method568(arg0, (byte) -25, arg7, arg9, arg3, arg4);
            return;
        }
        int var10 = arg0;
        int var11 = arg7;
        int var12 = arg7 * 3;
        int var13 = arg2 * 3;
        int var14 = arg0 * 3;
        int var15 = arg1 * 3;
        int var16 = arg5 * 3;
        int var17 = arg8 * 3;
        int var18 = arg9 + var16 - arg7 - var15;
        int var19 = arg4 + var13 - var17 - arg0;
        int var20 = var15 + var12 - var16 - var16;
        int var21 = var17 + var14 - var13 - var13;
        int var22 = var16 - var12;
        int var23 = var13 - var14;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var21 * var25;
            int var30 = var20 * var25;
            int var31 = var23 * var24;
            int var32 = var22 * var24;
            int var33 = arg7 + (var30 + var32 + var27 >> 12);
            int var34 = (var29 + var31 + var28 >> 12) + arg0;
            class90.method568(var10, (byte) -25, var11, var33, arg3, var34);
            var10 = var34;
            var11 = var33;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)I", line = 191)
    public final int method420(byte arg0) {
        field1192++;
        if (arg0 != -19) {
            field1195 = (class296) null;
        }
        return this.field1199;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILbg;B)V", line = 204)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field1194++;
        if (arg0 == 0) {
            this.field1199 = arg1.method1308(arg2 - 54);
        }
        if (arg2 != 13) {
            this.field1202 = -53;
        }
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)Z", line = 222)
    public final boolean method421(int arg0) {
        field1196++;
        if (this.field1193 != null) {
            return true;
        } else if (arg0 > this.field1199) {
            return false;
        } else {
            class231 var2 = class145.method975(class64.field1222, (byte) 124, this.field1199);
            var2.method1589();
            this.field1198 = var2.field1058;
            this.field1202 = var2.field1060;
            this.field1193 = var2.field4003;
            return true;
        }
    }
}
