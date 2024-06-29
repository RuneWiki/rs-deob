import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class522 {

    @OriginalMember(owner = "client!bia", name = "l", descriptor = "Ltga;")
    private class64 field7457 = new class64(256);

    @OriginalMember(owner = "client!bia", name = "m", descriptor = "Ltga;")
    private class64 field7458 = new class64(256);

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "Lcb;")
    private class544 field7451;

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "Lcb;")
    private class544 field7448;

    @OriginalMember(owner = "client!bia", name = "i", descriptor = "Z")
    public static boolean field7454 = false;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!bia", name = "g", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!bia", name = "h", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!bia", name = "j", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!bia", name = "k", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)V")
    public static final void method3038(byte arg0) {
        if (arg0 != 0) {
            method3044(null, 25, 105);
        }
        for (int var1 = 0; var1 < class617.field8700.length; var1++) {
            for (int var2 = 0; var2 < class617.field8700[0].length; var2++) {
                for (int var3 = 0; var3 < class617.field8700[0][0].length; var3++) {
                    class617.field8700[var1][var2][var3] = 0;
                }
            }
        }
        field7455++;
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)V")
    public static final void method3039(byte arg0) {
        class183.method1366(-65536);
        field7450++;
        if (arg0 > -12) {
            method3044(null, 69, 33);
        }
        class84.method611(-64);
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(II[I)Lbc;")
    public final class383 method3040(int arg0, int arg1, int[] arg2) {
        field7453++;
        int var4 = -116 % ((arg1 + 58) / 51);
        if (this.field7448.method3136(false) == 1) {
            return this.method3041(0, 0, arg0, arg2);
        } else if (this.field7448.method3147(arg0, 96) == 1) {
            return this.method3041(0, arg0, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(III[I)Lbc;")
    private final class383 method3041(int arg0, int arg1, int arg2, int[] arg3) {
        field7449++;
        if (arg0 != 0) {
            return null;
        }
        int var5 = ((arg1 & 0x40000FFF) << 4 | arg1 >>> 12) ^ arg2;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class383 var9 = (class383) this.field7458.method380((byte) -3, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class198 var10 = (class198) this.field7457.method380((byte) -3, var7);
            if (var10 == null) {
                var10 = class198.method1428(this.field7448, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field7457.method384(var7, var10, false);
            }
            class383 var11 = var10.method1438(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method3117((byte) -128);
                this.field7458.method384(var7, var11, false);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(BII[I)Lbc;")
    private final class383 method3042(byte arg0, int arg1, int arg2, int[] arg3) {
        field7446++;
        int var5 = (arg2 >>> 12 | arg2 << 4 & 0xFFFD) ^ arg1;
        int var6 = var5 | arg2 << 16;
        if (arg0 >= -3) {
            return null;
        }
        long var7 = (long) var6;
        class383 var9 = (class383) this.field7458.method380((byte) -3, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class97 var10 = class97.method683(this.field7451, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class383 var11 = var10.method685();
            this.field7458.method384(var7, var11, false);
            if (arg3 != null) {
                arg3[0] -= var11.field5470.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lbg;[[BI)V")
    public static final void method3043(class487 arg0, byte[][] arg1, int arg2) {
        if (arg2 != -22802) {
            method3039((byte) -68);
        }
        field7456++;
        int var3 = class405.field5709.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class96.field1236[var4] >> 8) * 64 - class103.field1295;
                int var7 = (class96.field1236[var4] & 0xFF) * 64 - class175.field2496;
                class84.method611(119);
                arg0.method2840(var7, var6, 4, class234.field3394, var5, class638.field8979);
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lha;II)Lqda;")
    public static final class112 method3044(class66 arg0, int arg1, int arg2) {
        if (arg1 < 110) {
            field7454 = false;
        }
        field7447++;
        class542 var3 = (class542) class622.field8773.method380((byte) -3, (long) arg2);
        if (var3 != null) {
            class410 var4 = var3.field7597.method4264((byte) -71);
            var3.field7599 = true;
            if (var4 != null) {
                return var4.method2468(arg0, true);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I[II)Lbc;")
    public final class383 method3045(int arg0, int[] arg1, int arg2) {
        field7452++;
        if (this.field7451.method3136(false) == 1) {
            return this.method3042((byte) -85, arg0, 0, arg1);
        } else if (this.field7451.method3147(arg0, 77) == 1) {
            return this.method3042((byte) -31, 0, arg0, arg1);
        } else {
            if (arg2 != 0) {
                this.field7458 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lcb;Lcb;)V")
    public class522(class544 arg0, class544 arg1) {
        this.field7451 = arg0;
        this.field7448 = arg1;
    }
}
