import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class4 {

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lbh;")
    private class538 field19 = new class538(128);

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lwu;")
    private class557 field20;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "[I")
    public static int[] field14 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lkea;")
    public static class77 field10 = new class77(4);

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)Lvt;", line = 5)
    public final class759 method11(int arg0, int arg1) {
        field18++;
        class538 var3 = this.field19;
        class759 var5;
        synchronized (this.field19) {
            if (arg1 <= 53) {
                return null;
            }
            var5 = (class759) this.field19.method3200((long) arg0, -19983);
        }
        if (var5 != null) {
            return var5;
        }
        class557 var6 = this.field20;
        byte[] var7;
        synchronized (this.field20) {
            var7 = this.field20.method3322(1, arg0, (byte) 114);
        }
        class759 var8 = new class759();
        if (var7 != null) {
            var8.method4216(-1, new class26(var7));
        }
        class538 var9 = this.field19;
        synchronized (this.field19) {
            this.field19.method3199((byte) 78, var8, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZZ)V", line = 36)
    public static final void method12(boolean arg0, boolean arg1) {
        if (arg0 && class531.field7428 != null) {
            class245.field3423 = class531.field7428.field7274;
        } else {
            class245.field3423 = -1;
        }
        field17++;
        class531.field7428 = null;
        class355.field4559 = null;
        class265.field3619 = 0;
        class19.field235 = null;
        class531.method3158();
        class531.field7437.method3122(0);
        class480.field6526 = null;
        class192.field2795 = null;
        class108.field1545 = null;
        class429.field5920 = -1;
        class531.field7439 = null;
        class313.field4031 = -1;
        if (!arg1) {
            method12(false, true);
        }
        class151.field2090 = null;
        class164.field2259 = null;
        class701.field9761 = null;
        class501.field7005 = null;
        class539.field7546 = null;
        class433.field5944 = null;
        if (class531.field7421 != null) {
            class531.field7421.method1974(-103);
            class531.field7421.method1975(128, -60, 64);
        }
        if (class531.field7426 != null) {
            class531.field7426.method897(64, (byte) -77, 64);
        }
        if (class531.field7429 != null) {
            class531.field7429.method3187(50, 64);
        }
        class62.field836.method1660(64, !arg1);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILmr;III)Ljava/awt/Frame;", line = 86)
    public static final Frame method13(int arg0, int arg1, class613 arg2, int arg3, int arg4, int arg5) {
        field12++;
        if (!arg2.method3578(false)) {
            return null;
        }
        if (arg5 == 0) {
            class473[] var6 = class216.method1418((byte) -70, arg2);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field6481 == arg1 && var6[var8].field6477 == arg0 && (arg4 == 0 || var6[var8].field6482 == arg4) && (!var7 || arg5 < var6[var8].field6480)) {
                    var7 = true;
                    arg5 = var6[var8].field6480;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class436 var9 = arg2.method3581(arg0, arg4, (byte) 114, arg5, arg1);
        while (var9.field5975 == 0) {
            class740.method4124(10L, 49);
        }
        if (arg3 != 136) {
            return null;
        }
        Frame var10 = (Frame) var9.field5973;
        if (var10 == null) {
            return null;
        } else if (var9.field5975 == 2) {
            class329.method1916(116, var10, arg2);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 158)
    public static void method14(int arg0) {
        field10 = null;
        if (arg0 == 128) {
            field14 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V", line = 173)
    public final void method15(int arg0, int arg1) {
        field16++;
        class538 var3 = this.field19;
        synchronized (this.field19) {
            this.field19.method3204((byte) 66, arg1);
            if (arg0 != 64) {
                field14 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 186)
    public final void method16(byte arg0) {
        field11++;
        class538 var2 = this.field19;
        synchronized (this.field19) {
            if (arg0 != 58) {
                method13(27, -123, null, 119, 5, 77);
            }
            this.field19.method3210(false);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 200)
    public final void method17(boolean arg0) {
        field15++;
        if (arg0) {
            this.method17(false);
        }
        class538 var2 = this.field19;
        synchronized (this.field19) {
            this.field19.method3202((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lwj;ILwu;)V", line = 237)
    public class4(class121 arg0, int arg1, class557 arg2) {
        this.field20 = arg2;
        this.field20.method3333(1, 3443);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z", line = 221)
    public static final boolean method18(int arg0) {
        if (arg0 != -3427) {
            field14 = null;
        }
        field13++;
        return class605.field8642 > 0;
    }
}
