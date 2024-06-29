import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class50 extends class212 {

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "[I")
    public static int[] field682 = new int[2000];

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "Lqe;")
    public static class168 field684 = class66.method448("Bitte warten Sie)3)3)3", -123);

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "Lqe;")
    public class168 field675;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public static void method345(int arg0) {
        if (arg0 <= 4) {
            method351(71, -15, -38, -36, (class13) null, (class13) null, -70, 72, -125L);
        }
        field682 = null;
        field684 = null;
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)I")
    public final int method346(int arg0) {
        ++field679;
        if (arg0 < 75) {
            this.method354(-84);
        }
        return (int) (255L & super.field3308 >>> 32);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lqe;)Lqe;")
    public static final class168 method347(int arg0, class168[] arg1) {
        ++field680;
        if (arg1.length < arg0) {
            throw new IllegalArgumentException();
        } else {
            return class142.method973((byte) -114, arg1.length, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)J")
    public final long method348(int arg0) {
        ++field681;
        if (arg0 != 16) {
            method345(0);
        }
        return super.field3663 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)I")
    public final int method349(byte arg0) {
        ++field676;
        return arg0 <= 111 ? -34 : (int) super.field3308;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
    public static final void method350(int arg0, int arg1, int arg2, int arg3) {
        class177 var4 = class254.field4395[arg0][arg1][arg2];
        if (var4 != null) {
            class199 var5 = var4.field3103;
            if (var5 != null) {
                var5.field3433 = var5.field3433 * arg3 / 16;
                var5.field3435 = var5.field3435 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIILqf;Lqf;IIJ)V")
    public static final void method351(int arg0, int arg1, int arg2, int arg3, class13 arg4, class13 arg5, int arg6, int arg7, long arg8) {
        if (arg4 != null || arg5 != null) {
            class162 var10 = new class162();
            var10.field2769 = arg8;
            var10.field2768 = arg1 * 128 + 64;
            var10.field2772 = arg2 * 128 + 64;
            var10.field2770 = arg3;
            var10.field2775 = arg4;
            var10.field2777 = arg5;
            var10.field2773 = arg6;
            var10.field2774 = arg7;
            for (int var11 = arg0; var11 >= 0; --var11) {
                if (class254.field4395[var11][arg1][arg2] == null) {
                    class254.field4395[var11][arg1][arg2] = new class177(var11, arg1, arg2);
                }
            }
            class254.field4395[arg0][arg1][arg2].field3116 = var10;
        }
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)V")
    public static final void method352(int arg0) {
        ++field683;
        int var1 = -1;
        if (arg0 != 20151) {
            field682 = null;
        }
        while (class132.field2322 > var1) {
            int var5;
            if (var1 != -1) {
                var5 = class115.field1868[var1];
            } else {
                var5 = 2047;
            }
            class121 var6 = class104.field1677[var5];
            if (var6 != null && var6.field185 > 0) {
                --var6.field185;
                if (~var6.field185 == -1) {
                    var6.field227 = null;
                }
            }
            ++var1;
        }
        for (int var2 = 0; class82.field1244 > var2; ++var2) {
            int var3 = class51.field690[var2];
            class222 var4 = class229.field3898[var3];
            if (var4 != null && var4.field185 > 0) {
                --var4.field185;
                if (~var4.field185 == -1) {
                    var4.field227 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "(I)V")
    public static final void method353(int arg0) {
        class116.field1892.method14(false);
        ++field673;
        if (arg0 != -1) {
            field684 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "(I)V")
    public final void method354(int arg0) {
        ++field674;
        if (arg0 < 39) {
            method351(-19, -8, -67, 86, (class13) null, (class13) null, 123, -123, -69L);
        }
        super.field3663 |= Long.MIN_VALUE;
        if (this.method348(16) == 0L) {
            class80.field1194.method400((byte) -5, this);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    public final void method355(byte arg0) {
        ++field678;
        if (arg0 <= 97) {
            this.field675 = null;
        }
        super.field3663 = super.field3663 & Long.MIN_VALUE | 500L + class59.method407(-102);
        class212.field3659.method400((byte) 10, this);
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(II)V")
    public class50(int arg0, int arg1) {
        super.field3308 = (long) arg1 | (long) arg0 << 32;
    }
}
