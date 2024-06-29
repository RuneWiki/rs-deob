import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class355 extends class227 implements class7 {

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
    private int field5056;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
    public static int field5054 = -1;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "Lkca;")
    public static class73 field5055 = new class73(21, 2);

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "F")
    public static float field5058;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lfj;III)Lka;")
    public static final class407 method2237(class572 arg0, int arg1, int arg2, int arg3) {
        ++field5049;
        int var4 = arg3 << 8 | arg0.field8265;
        class407 var5 = (class407) class212.field2926.method2415((long) var4 << 16, false);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class656.field9485.method1308((byte) -126, class656.field9485.method1279(var4, -21183));
            if (var6 != null) {
                if (~var6.length >= -2) {
                    return null;
                } else {
                    class407 var7 = class576.method3348(var6, -1);
                    var7.field6131 = arg0;
                    class212.field2926.method2411((long) var4 << 16, var7, false);
                    return var7;
                }
            } else {
                int var8 = arg0.field8265 | arg2 + 65536 << 8;
                class407 var9 = (class407) class212.field2926.method2415((long) var8 << 16, false);
                if (var9 != null) {
                    return var9;
                } else {
                    byte[] var10 = class656.field9485.method1308((byte) -128, class656.field9485.method1279(var8, -21183));
                    if (var10 != null) {
                        if (var10.length <= 1) {
                            return null;
                        } else {
                            class407 var11 = class576.method3348(var10, arg1 ^ 25774);
                            var11.field6131 = arg0;
                            class212.field2926.method2411((long) var8 << 16, var11, false);
                            return var11;
                        }
                    } else {
                        int var12 = 16776960 | arg0.field8265;
                        class407 var13 = (class407) class212.field2926.method2415((long) var12 << 16, false);
                        if (var13 != null) {
                            return var13;
                        } else {
                            byte[] var14 = class656.field9485.method1308((byte) -127, class656.field9485.method1279(var12, -21183));
                            if (var14 != null) {
                                if (var14.length <= 1) {
                                    return null;
                                } else {
                                    class407 var15 = class576.method3348(var14, arg1 + 25774);
                                    var15.field6131 = arg0;
                                    class212.field2926.method2411((long) var12 << 16, var15, false);
                                    return var15;
                                }
                            } else {
                                return arg1 != -25775 ? null : null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I")
    public final int method36(int arg0) {
        if (arg0 != -16829) {
            this.method37(false);
        }
        ++field5052;
        return super.field3186;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)J")
    public final long method37(boolean arg0) {
        if (arg0) {
            return 39L;
        } else {
            ++field5050;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lad;I[BIZ)V")
    public class355(class362 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5056 = arg1;
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)V")
    public static void method2238(int arg0) {
        if (arg0 == 22945) {
            field5055 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (arg0 != 1102) {
            this.method36(64);
        }
        super.field3185.method2258(this, (byte) 52);
        ++field5057;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([BIIZ)V")
    public final void method38(byte[] arg0, int arg1, int arg2, boolean arg3) {
        ++field5051;
        this.method1476(arg0, arg1, 0);
        this.field5056 = arg2;
        if (!arg3) {
            method2237((class572) null, -26, -20, 30);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)I")
    public final int method39(int arg0) {
        ++field5053;
        int var2 = -75 % (arg0 / 42);
        return this.field5056;
    }
}
