import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class390 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Lco;")
    private class210 field5565 = new class210(64);

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lg;")
    private class470 field5567;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5570 = null;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lpn;")
    public static class72 field5573 = new class72(74, 4);

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lvf;")
    public static class166 field5574 = new class166();

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lcb;")
    public static class420 field5575;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Lol;", line = 11)
    public final class361 method2346(int arg0, int arg1) {
        field5572++;
        if (arg0 <= 0) {
            method2347(-75);
        }
        class210 var3 = this.field5565;
        class361 var4;
        synchronized (this.field5565) {
            var4 = (class361) this.field5565.method1163((byte) -60, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5567.method2768(-20472, arg1, 5);
        class361 var6 = new class361();
        if (var5 != null) {
            var6.method2199(true, new class179(var5));
        }
        class210 var7 = this.field5565;
        synchronized (this.field5565) {
            this.field5565.method1172((long) arg1, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 39)
    public static void method2347(int arg0) {
        field5574 = null;
        field5570 = null;
        field5575 = null;
        field5573 = null;
        if (arg0 >= -43) {
            method2348(-10, -22, 97, 49, -17, 13, 90, -61, 32);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIII)Z", line = 55)
    public static final boolean method2348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 <= 59) {
            field5570 = null;
        }
        field5568++;
        if ((arg1 + arg5) > arg2 && arg1 < arg2 + arg8) {
            return (arg3 + arg0) > arg4 && arg3 < (arg4 + arg6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 76)
    public static final void method2349(int arg0) {
        if (arg0 != 31739) {
            method2347(86);
        }
        field5571++;
        class45.field569 = null;
        class323.field4667 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lci;ILg;)V", line = 95)
    public class390(class421 arg0, int arg1, class470 arg2) {
        this.field5567 = arg2;
        this.field5567.method2755(-80, 5);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIZIII)V", line = 114)
    public static final void method2350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (!arg6) {
            return;
        }
        if (arg1 == arg2 && arg4 == arg7 && arg5 == arg9 && arg0 == arg8) {
            class176.method866(arg2, arg5, arg7, (byte) 70, arg0, arg3);
        } else {
            int var10 = arg2;
            int var11 = arg7;
            int var12 = arg2 * 3;
            int var13 = arg7 * 3;
            int var14 = arg1 * 3;
            int var15 = arg4 * 3;
            int var16 = arg9 * 3;
            int var17 = arg8 * 3;
            int var18 = arg5 + var14 - arg2 - var16;
            int var19 = arg0 + var15 - var17 - arg7;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg2;
                int var34 = (var28 + var30 + var32 >> 12) + arg7;
                class176.method866(var10, var33, var11, (byte) 70, var34, arg3);
                var11 = var34;
                var10 = var33;
            }
        }
        field5569++;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)I", line = 189)
    public static final int method2351(int arg0, int arg1) {
        if (arg1 == -707861748) {
            field5566++;
            return arg0 >>> 8;
        } else {
            return 79;
        }
    }
}
