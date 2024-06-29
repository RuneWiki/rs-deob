import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class85 extends class107 {

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    private int field1344 = 4;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    private int field1353 = 4;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "[I")
    public static int[] field1354 = new int[14];

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "Z")
    public static boolean field1355 = false;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "Lrg;")
    public static class248 field1356;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lgi;IZ)Z")
    public static final boolean method604(class164 arg0, int arg1, boolean arg2) {
        ++field1348;
        if (arg2) {
            return true;
        } else {
            byte[] var3 = arg0.method1142(arg1, -10363);
            if (var3 == null) {
                return false;
            } else {
                class172.method1215(var3, (byte) -102);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
    public static final void method605(int arg0) {
        ++field1349;
        if (arg0 <= -88) {
            ;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int[] var3 = super.field1661.method894(-87, arg1);
        if (super.field1661.field2115) {
            int var4 = class153.field2452 / this.field1344;
            int var5 = class24.field443 / this.field1353;
            int[] var7;
            if (var4 > 0) {
                int var6 = arg1 % var4;
                var7 = this.method756(0, class153.field2452 * var6 / var4, -29053);
            } else {
                var7 = this.method756(0, 0, -29053);
            }
            for (int var8 = 0; ~var8 > ~class24.field443; ++var8) {
                if (~var5 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var5;
                    var3[var8] = var7[class24.field443 * var9 / var5];
                }
            }
        }
        ++field1345;
        int var10 = 48 % ((-34 - arg0) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lgi;II)[Lud;")
    public static final class2[] method606(class164 arg0, int arg1, int arg2) {
        if (arg1 != 1823720198) {
            field1355 = false;
        }
        ++field1347;
        return !method604(arg0, arg2, false) ? null : class48.method315(-114);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class85() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(B)V")
    public static void method607(byte arg0) {
        field1356 = null;
        field1354 = null;
        int var1 = -11 / ((43 - arg0) / 35);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIBI)V")
    public static final void method608(int arg0, int arg1, byte arg2, int arg3) {
        ++field1350;
        if (arg2 <= -113) {
            String var4 = "::tele " + arg3 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (63 & arg0) + "," + (arg1 & 63);
            System.out.println(var4);
            class309.method2097(var4, 4643);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        if (arg1 != -117) {
            this.method190(89, (byte) -116);
        }
        ++field1351;
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (super.field1662.field3063) {
            int var4 = class153.field2452 / this.field1344;
            int var5 = class24.field443 / this.field1353;
            int[][] var6;
            if (~var4 >= -1) {
                var6 = this.method759(0, arg1 ^ 11, 0);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method759(0, arg1 + -11, class153.field2452 * var7 / var4);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class24.field443 > var14; ++var14) {
                int var16;
                if (~var5 < -1) {
                    int var15 = var14 % var5;
                    var16 = class24.field443 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg2 != 28) {
            method608(-14, -87, (byte) 72, 65);
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field1344 = arg1.method1849(arg2 + 227);
            }
        } else {
            this.field1353 = arg1.method1849(arg2 ^ 227);
        }
        ++field1352;
    }
}
