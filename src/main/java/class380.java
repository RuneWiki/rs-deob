import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class380 {

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "Lmba;")
    private class643 field5514;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "J")
    public long field5517;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "[S")
    private static short[] field5508 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "[S")
    private static short[] field5510 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "[S")
    private static short[] field5515 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "[S")
    private static short[] field5512 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "[[S")
    public static short[][] field5513 = new short[][] { field5515, field5510, field5512, field5508 };

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!eaa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5514.method3706(false, this.field5517);
        field5509++;
        super.finalize();
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
    public static void method2354(int arg0) {
        field5515 = null;
        field5508 = null;
        field5513 = null;
        field5510 = null;
        field5512 = null;
        if (arg0 != -21577) {
            method2354(11);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lip;I)I")
    public static final int method2355(class304 arg0, int arg1) {
        field5516++;
        int var2 = 19 / ((11 - arg1) / 42);
        String var3 = class353.method2253(arg0, 115);
        int[] var4 = null;
        if (class238.method1657(arg0.field4152, -52)) {
            var4 = class425.field6147.method4144((int) arg0.field4156, 126).field6117;
        } else if (arg0.field4147 != -1) {
            var4 = class425.field6147.method4144(arg0.field4147, 126).field6117;
        } else if (class145.method1017(arg0.field4152, 49)) {
            class63 var5 = (class63) class389.field5608.method4020((long) ((int) arg0.field4156), (byte) -121);
            if (var5 != null) {
                class571 var6 = var5.field1004;
                class521 var7 = var6.field8235;
                if (var7.field7535 != null) {
                    var7 = var7.method3166(class226.field3372, true);
                }
                if (var7 != null) {
                    var4 = var7.field7521;
                }
            }
        } else if (class503.method3076(arg0.field4152, (byte) 103)) {
            Object var8 = null;
            class482 var9;
            if (arg0.field4152 == 1009) {
                var9 = class375.field5421.method2680((int) arg0.field4156, (byte) 103);
            } else {
                var9 = class375.field5421.method2680((int) (arg0.field4156 >>> 32 & 0x7FFFFFFFL), (byte) 109);
            }
            if (var9.field6900 != null) {
                var9 = var9.method2952(-1, class226.field3372);
            }
            if (var9 != null) {
                var4 = var9.field6961;
            }
        }
        if (var4 != null) {
            var3 = var3 + class718.method4032(var4, 0);
        }
        int var10 = class119.field1635.method3066(class637.field9005, var3, (byte) 121);
        if (arg0.field4154) {
            var10 += class755.field10511.method777() + 4;
        }
        return var10;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V")
    public static final void method2356(int arg0, int arg1, int arg2) {
        class147.method1037((byte) -39, arg1, arg2);
        field5511++;
        int var3 = -101 % ((arg0 + 4) / 43);
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lmba;J[Lms;)V")
    public class380(class643 arg0, long arg1, class402[] arg2) {
        this.field5514 = arg0;
        this.field5517 = arg1;
    }
}
