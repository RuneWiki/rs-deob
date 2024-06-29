import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class538 extends class339 {

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public int field7377;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "Lag;")
    private class469 field7381;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "J")
    private long field7387;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field7375 = 0;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "Lmo;")
    public static class361 field7388 = new class361("WTI", 5);

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "[Lvu;")
    public static class204[] field7389 = new class204[5];

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static final void method3021(int arg0) {
        int var1 = 104 % ((arg0 + 33) / 47);
        class267.method1596((byte) 49);
        field7374++;
    }

    @OriginalMember(owner = "client!wi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7380++;
        this.method3023(127);
        super.finalize();
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)J")
    public final long method3022(int arg0) {
        if (arg0 != 19174) {
            this.field7387 = -55L;
        }
        field7385++;
        return this.field7387;
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
    private final void method3023(int arg0) {
        field7383++;
        if (arg0 <= 123) {
            this.field7387 = -50L;
        }
        if (this.field7387 > 0L) {
            this.field7381.field6317.releasePbuffer(this.field7387);
            this.field7387 = 0L;
        }
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)V")
    public static void method3024(int arg0) {
        field7389 = null;
        field7388 = null;
        if (arg0 <= 101) {
            method3021(64);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIII)I")
    public static final int method3025(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg0 != 5) {
            method3026(null, 49);
        }
        field7376++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 4095 - arg1;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljo;I)V")
    public static final void method3026(class501 arg0, int arg1) {
        field7386++;
        arg0.field6883 = null;
        if (arg1 != 1) {
            field7388 = null;
        }
        if (class580.field7931 < 20) {
            class375.field4967.method1300(arg0, -1);
            class580.field7931++;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILga;I)Laga;")
    public static final class658 method3027(int arg0, int arg1, class332 arg2, int arg3) {
        field7384++;
        byte[] var4 = arg2.method1938(arg1, arg0, arg3 ^ 0xFFFFFFEF);
        if (arg3 == 0) {
            return var4 == null ? null : new class658(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public static final void method3028(byte arg0) {
        if (arg0 <= 85) {
            return;
        }
        field7382++;
        if (!class326.method1899((byte) 65)) {
            return;
        }
        if (class187.field2606 == null) {
            class402.method2297(-24268);
        }
        class53.field696 = 0;
        class177.field2497 = true;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Lmo;")
    public static final class361 method3029(int arg0, int arg1) {
        field7373++;
        class361[] var2 = class297.method1747(-127);
        int var3 = 0;
        if (arg0 > -80) {
            return null;
        }
        while (var3 < var2.length) {
            class361 var4 = var2[var3];
            if (var4.field4781 == arg1) {
                return var4;
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lag;II)V")
    public class538(class469 arg0, int arg1, int arg2) {
        this.field7377 = arg1 * arg2;
        this.field7381 = arg0;
        this.field7387 = this.field7381.field6317.createPbuffer(arg1, arg2);
    }

    static {
        for (int var0 = 0; var0 < field7389.length; var0++) {
            field7389[var0] = new class204();
        }
    }
}
