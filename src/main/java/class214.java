import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class214 implements class617 {

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lnha;")
    private class323 field3047;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Leaa;")
    private class501 field3044;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3036 = 0;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "F")
    public static float field3035;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
    public static long field3045;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Lcs;")
    public static class342 field3034;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lda;")
    public static class60 field3046;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[Lmi;")
    public static class496[] field3041;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)Z")
    public final boolean method1470(byte arg0) {
        field3040++;
        int var2 = -50 / ((25 - arg0) / 52);
        return this.field3044.method2954(-21913);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    public static final void method1471(int arg0, int arg1, int arg2, int arg3) {
        class384 var4 = class649.field8928[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class424 var5 = var4.field5566;
        class424 var6 = var4.field5578;
        if (var5 != null) {
            var5.field6120 = (short) (var5.field6120 * arg3 / (0x10 << class130.field2185 - 7));
            var5.field6108 = (short) (var5.field6108 * arg3 / (0x10 << class130.field2185 - 7));
        }
        if (var6 != null) {
            var6.field6120 = (short) (var6.field6120 * arg3 / (0x10 << class130.field2185 - 7));
            var6.field6108 = (short) (var6.field6108 * arg3 / (0x10 << class130.field2185 - 7));
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
    public static void method1472(byte arg0) {
        field3041 = null;
        if (arg0 != 48) {
            field3036 = -62;
        }
        field3034 = null;
        field3046 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZI)I")
    public static final int method1473(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 < 45) {
            method1471(83, 33, 101, -55);
        }
        field3043++;
        class6 var4 = class284.method1863((byte) 37, arg1, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= 0 && arg3 < var4.field45.length) {
            return var4.field45[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public final void method1474(int arg0) {
        if (arg0 == 10286) {
            field3037++;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BZ)V")
    public final void method1475(byte arg0, boolean arg1) {
        field3038++;
        class67 var3 = this.field3044.method2953(false, this.field3047.field4476);
        if (var3 != null) {
            int var4 = this.field3047.field4480.method892(class478.field6661, this.field3047.field4487, (byte) -118) + this.field3047.field4482;
            int var5 = this.field3047.field4483.method1644(class22.field488, this.field3047.field4481, arg0 ^ 0xFFFFF9F4) + this.field3047.field4478;
            if (this.field3047.field4472) {
                class272.field3822.method288(var4, var5, this.field3047.field4487, this.field3047.field4481, this.field3047.field4475, 0);
            }
            int var6 = var5 + this.method1476(5, var3.field1263, true, class168.field2634, var4, var5) * 12;
            int var9 = var6 + 8;
            if (this.field3047.field4472) {
                class272.field3822.method234(var4, var9, this.field3047.field4487 + var4 - 1, var9, this.field3047.field4475, 0);
            }
            var6 = var9 + 1;
            int var7 = var6 + this.method1476(5, var3.field1261, true, class168.field2634, var4, var6) * 12;
            int var10 = var7 + 5;
            int var10000 = var10 + this.method1476(5, var3.field1265, true, class168.field2634, var4, var10) * 12;
        }
        if (arg0 != -49) {
            this.method1470((byte) 12);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;ZLda;II)I")
    private final int method1476(int arg0, String arg1, boolean arg2, class60 arg3, int arg4, int arg5) {
        if (arg2) {
            field3039++;
            return arg3.method646(null, 0, this.field3047.field4486, null, this.field3047.field4471, 0, this.field3047.field4481 - (arg0 * 2), null, arg0 + arg5, 0, 0, this.field3047.field4487 - (arg0 * 2), arg0 + arg4, false, 0, arg1);
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Leaa;Lnha;)V")
    public class214(class501 arg0, class323 arg1) {
        this.field3047 = arg1;
        this.field3044 = arg0;
    }
}
