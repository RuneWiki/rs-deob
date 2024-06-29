import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class272 extends class60 {

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    private int field4051;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    private int field4050;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    private int field4057;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "[I")
    public static int[] field4056 = new int[2];

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "[Z")
    public static boolean[] field4059;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "Laa;")
    public static class76 field4060;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "Luv;")
    public static class2 field4061;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "Lok;")
    public static class74 field4054;

    static {
        new class347((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
        field4059 = new boolean[100];
        field4060 = new class76(66, 2);
        field4061 = new class2(61, 6);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 10)
    public static void method1697(int arg0) {
        field4061 = null;
        field4059 = null;
        if (arg0 != -338901424) {
            method1697(-100);
        }
        field4056 = null;
        field4054 = null;
        field4060 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BILsl;I)Ltq;", line = 24)
    public static final class68 method1698(byte arg0, int arg1, class456 arg2, int arg3) {
        ++field4049;
        int var4 = arg2.field6682 | arg3 << 8;
        class68 var5 = (class68) class195.field2877.method1781((long) var4 << 16, 24);
        if (var5 != null) {
            return var5;
        } else {
            if (arg0 >= -106) {
                field4054 = null;
            }
            byte[] var6 = class166.field2469.method526(class166.field2469.method532(var4, 1), 1);
            if (var6 != null) {
                if (~var6.length >= -2) {
                    return null;
                } else {
                    class68 var7 = class420.method2503(var6, (byte) 116);
                    var7.field902 = arg2;
                    class195.field2877.method1780(var7, -20892, (long) var4 << 16);
                    return var7;
                }
            } else {
                int var8 = arg1 + 65536 << 8 | arg2.field6682;
                class68 var9 = (class68) class195.field2877.method1781((long) var8 << 16, 24);
                if (var9 != null) {
                    return var9;
                } else {
                    byte[] var10 = class166.field2469.method526(class166.field2469.method532(var8, 1), 1);
                    if (var10 != null) {
                        if (var10.length <= 1) {
                            return null;
                        } else {
                            class68 var11 = class420.method2503(var10, (byte) 114);
                            var11.field902 = arg2;
                            class195.field2877.method1780(var11, -20892, (long) var8 << 16);
                            return var11;
                        }
                    } else {
                        int var12 = arg2.field6682 | 16776960;
                        class68 var13 = (class68) class195.field2877.method1781((long) var12 << 16, 24);
                        if (var13 != null) {
                            return var13;
                        } else {
                            byte[] var14 = class166.field2469.method526(class166.field2469.method532(var12, 1), 1);
                            if (var14 != null) {
                                if (~var14.length >= -2) {
                                    return null;
                                } else {
                                    class68 var15 = class420.method2503(var14, (byte) 121);
                                    var15.field902 = arg2;
                                    class195.field2877.method1780(var15, -20892, (long) var12 << 16);
                                    return var15;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(III)V", line = 95)
    public final void method432(int arg0, int arg1, int arg2) {
        ++field4055;
        if (arg0 != 25878) {
            field4061 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V", line = 123)
    public final void method429(int arg0, int arg1, int arg2) {
        if (arg0 != -201) {
            this.method431(-24, -14, -60);
        }
        ++field4058;
        int var4 = this.field4057 * arg2 >> 12;
        int var5 = this.field4050 * arg2 >> 12;
        int var6 = this.field4051 * arg1 >> 12;
        int var7 = this.field4053 * arg1 >> 12;
        class428.method2536(super.field822, var7, super.field819, super.field820, var5, var4, var6, 65280);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)V", line = 145)
    public final void method431(int arg0, int arg1, int arg2) {
        ++field4052;
        int var4 = this.field4057 * arg2 >> 12;
        int var5 = this.field4050 * arg2 >> 12;
        int var6 = this.field4051 * arg0 >> 12;
        if (arg1 != -76) {
            this.field4053 = -39;
        }
        int var7 = this.field4053 * arg0 >> 12;
        class192.method1279(18207, var7, super.field822, var5, var4, var6);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIIII)V", line = 165)
    public class272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4053 = arg3;
        this.field4051 = arg1;
        this.field4050 = arg2;
        this.field4057 = arg0;
    }
}
