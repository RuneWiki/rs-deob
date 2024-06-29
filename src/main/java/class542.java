import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class542 {

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Z")
    public boolean field7245 = false;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field7250 = 0;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Lnw;")
    public static class347 field7243 = new class347();

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public int field7239;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public int field7242;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Lsj;")
    public class668 field7248;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZLjava/lang/Object;)[B", line = 5)
    public static final byte[] method2924(int arg0, boolean arg1, Object arg2) {
        if (arg0 != -7374) {
            method2929(121, 8, -16, 52, 63, -93, false);
        }
        field7240++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class257.method1498(var3, -25553) : var3;
        } else if (arg2 instanceof class257) {
            class257 var4 = (class257) arg2;
            return var4.method1250((byte) 108);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 41)
    public static void method2925(int arg0) {
        if (arg0 != 0) {
            field7243 = null;
        }
        field7243 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)Z", line = 52)
    public final boolean method2926(byte arg0) {
        if (arg0 > -61) {
            return false;
        } else {
            field7247++;
            return this.field7248.field9414.method3368(1912, this.field7239);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Les;I)V", line = 64)
    public final void method2927(class630 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3501(-9268);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.method2930(false, null, -63, -73);
                }
                field7244++;
                return;
            }
            this.method2928(arg1 + 1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILes;)V", line = 85)
    private final void method2928(int arg0, int arg1, class630 arg2) {
        if (arg1 == 1) {
            this.field7239 = arg2.method3470(arg0 ^ 0x3337);
        } else if (arg1 == 2) {
            this.field7242 = arg2.method3517(-1);
        } else if (arg1 == 3) {
            this.field7245 = true;
        } else if (arg1 == 4) {
            this.field7239 = -1;
        }
        field7246++;
        if (arg0 != 0) {
            field7243 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIZ)Ljt;", line = 115)
    public static final class533 method2929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field7249++;
        long var7 = (long) arg3 * 76724863L ^ (long) arg1 * 986053L ^ (long) arg0 * 67481L ^ (long) arg5 * 97549L ^ (long) arg4 * 475427L ^ (long) arg2 * 32147369L;
        class533 var9 = (class533) class453.field5813.method2418(var7, (byte) 100);
        if (var9 == null) {
            class533 var10 = class337.field4338.method990(arg0, arg5, arg4, arg1, arg2, arg3);
            class453.field5813.method2409(var7, var10, 1);
            return arg6 ? null : var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLr;II)Lf;", line = 146)
    public final class536 method2930(boolean arg0, class566 arg1, int arg2, int arg3) {
        field7241++;
        if (arg3 > -33) {
            method2924(14, true, null);
        }
        long var5 = (long) (arg1.field7890 << 19 | (arg0 ? 262144 : 0) | arg2 << 16 | this.field7239);
        class536 var7 = (class536) this.field7248.field9420.method2418(var5, (byte) 100);
        if (var7 != null) {
            return var7;
        } else if (this.field7248.field9414.method3368(1912, this.field7239)) {
            class661 var8 = class661.method3715(this.field7248.field9414, this.field7239, 0);
            if (var8 != null) {
                var8.field9357 = var8.field9354 = var8.field9350 = var8.field9356 = 0;
                if (arg0) {
                    var8.method3726();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method3724();
                }
            }
            class536 var10 = arg1.method1072(var8, true);
            if (var10 != null) {
                this.field7248.field9420.method2409(var5, var10, 1);
            }
            return var10;
        } else {
            return null;
        }
    }
}
