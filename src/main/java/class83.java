import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class83 extends class197 {

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    private int field1405 = -1;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "[I")
    public static int[] field1400 = new int[5];

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lfk;")
    public static class144 field1406 = new class144(16);

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "Loh;")
    private static class258 field1410 = class153.method1046("Loading)3)3)3", 99);

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "Loh;")
    public static class258 field1409 = field1410;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "Z")
    public static boolean field1411 = false;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "Loh;")
    public static class258 field1412 = class153.method1046("ul", 105);

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "Loj;")
    public static class261 field1407;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "[I")
    public int[] field1398;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "[S")
    public static short[] field1395;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method599(int arg0, int arg1, int arg2, int arg3) {
        field1394++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            int var5 = -110 % ((-arg3 - 51) / 41);
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILva;I)V", line = 32)
    public final void method98(int arg0, class235 arg1, int arg2) {
        field1401++;
        if (arg2 == 0) {
            this.field1405 = arg1.method1615(-126);
        }
        if (arg0 != 7955) {
            method604(9);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 48)
    public class83() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[[I", line = 56)
    public int[][] method101(int arg0, byte arg1) {
        int var3 = 95 / ((1 - arg1) / 37);
        int[][] var4 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765 && this.method600(-104)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int var7 = this.field1392 * (class214.field3723 == this.field1396 ? arg0 : this.field1396 * arg0 / class214.field3723);
            int[] var8 = var4[2];
            if (class190.field3362 == this.field1392) {
                for (int var9 = 0; var9 < class190.field3362; var9++) {
                    int var10 = this.field1398[var7++];
                    var8[var9] = class2.method15(var10, 255) << 4;
                    var6[var9] = class2.method15(var10, 65280) >> 4;
                    var5[var9] = class2.method15(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; var11 < class190.field3362; var11++) {
                    int var12 = this.field1392 * var11 / class190.field3362;
                    int var13 = this.field1398[var7 + var12];
                    var8[var11] = class2.method15(4080, var13 << 4);
                    var6[var11] = class2.method15(65280, var13) >> 4;
                    var5[var11] = class2.method15(4080, var13 >> 12);
                }
            }
        }
        field1404++;
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Z", line = 129)
    public final boolean method600(int arg0) {
        field1403++;
        if (this.field1398 != null) {
            return true;
        }
        int var2 = 27 / ((18 - arg0) / 34);
        if (this.field1405 < 0) {
            return false;
        }
        class41 var3 = class176.method1210(class114.field2034, this.field1405, 17846);
        var3.method324();
        this.field1396 = var3.field1148;
        this.field1392 = var3.field1141;
        this.field1398 = var3.field573;
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII)V", line = 159)
    public static final void method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class226 var7 = new class226();
        var7.field3893 = arg1 / 128;
        var7.field3885 = arg2 / 128;
        var7.field3891 = arg3 / 128;
        var7.field3872 = arg4 / 128;
        var7.field3873 = arg0;
        var7.field3878 = arg1;
        var7.field3877 = arg2;
        var7.field3875 = arg3;
        var7.field3897 = arg4;
        var7.field3879 = arg5;
        var7.field3883 = arg6;
        class84.field1428[class63.field1099++] = var7;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBILgb;Lgb;)Lhg;", line = 181)
    public static final class216 method602(int arg0, byte arg1, int arg2, class213 arg3, class213 arg4) {
        int var5 = 51 % ((arg1 - 68) / 53);
        field1402++;
        return class162.method1086(0, arg4, arg0, arg2) ? class71.method530(arg3.method1453(arg2, (byte) -9, arg0), -119) : null;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)I", line = 194)
    public final int method603(byte arg0) {
        if (arg0 != -25) {
            field1410 = (class258) null;
        }
        field1393++;
        return this.field1405;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(B)V", line = 205)
    public final void method529(byte arg0) {
        field1399++;
        super.method529((byte) 103);
        if (arg0 < 91) {
            field1395 = (short[]) null;
        }
        this.field1398 = null;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 223)
    public static void method604(int arg0) {
        field1407 = null;
        field1400 = null;
        field1410 = null;
        field1406 = null;
        field1395 = null;
        field1409 = null;
        field1412 = null;
        if (arg0 != 17254) {
            field1408 = -57;
        }
    }
}
