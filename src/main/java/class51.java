import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class51 extends class259 {

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Ljava/lang/String;")
    public String field704;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Z")
    public static boolean field698 = false;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Z")
    public static boolean field705 = true;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Ljava/util/Calendar;")
    public static Calendar field697 = Calendar.getInstance();

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "B")
    public static byte field706;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Llf;")
    public static class94 field708;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V")
    public static void method307(int arg0) {
        field697 = null;
        field708 = null;
        if (arg0 != 1024) {
            field709 = -105;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)Lka;")
    public static final class192 method308(byte arg0, int arg1) {
        field696++;
        class192 var2 = (class192) class156.field2439.method2099((byte) 125, (long) arg1);
        if (arg0 != -73) {
            field701 = -115;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class69.field1114.method1868(arg1, 11, 1);
        class192 var4 = new class192();
        if (var3 != null) {
            var4.method1363(new class53(var3), true);
        }
        class156.field2439.method2103(var4, -1, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)Lth;")
    public static final class247 method309(int arg0, int arg1, int arg2, int arg3) {
        field700++;
        int var4 = arg0 << 8 | arg2;
        class247 var5 = (class247) class222.field3251.method2099((byte) 125, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class20.field211.method1886(class20.field211.method1887(-81, var4), false);
        if (var6 == null) {
            int var8 = arg2 | arg1 + arg3 << 8;
            class247 var9 = (class247) class222.field3251.method2099((byte) 125, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class20.field211.method1886(class20.field211.method1887(-79, var8), false);
            if (var10 == null) {
                int var12 = arg2 | 0xFFFF00;
                class247 var13 = (class247) class222.field3251.method2099((byte) 125, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class20.field211.method1886(class20.field211.method1887(-123, var12), false);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class247 var15 = class269.method1856(var14, -21497);
                    var15.field3647 = arg2;
                    class222.field3251.method2103(var15, arg3 - 65537, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class247 var11 = class269.method1856(var10, arg3 - 87033);
                var11.field3647 = arg2;
                class222.field3251.method2103(var11, -1, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class247 var7 = class269.method1856(var6, -21497);
            var7.field3647 = arg2;
            class222.field3251.method2103(var7, -1, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILke;)V")
    public static final void method310(int arg0, class248 arg1) {
        int var2 = arg1.field3682 - class199.field2930;
        int var3 = arg1.field3667 * 128 + arg1.method1467(0) * 64;
        field699++;
        int var4 = arg1.field3754 * 128 + arg1.method1467(0) * 64;
        arg1.field3660 += (var3 - arg1.field3660) / var2;
        arg1.field3753 += (var4 - arg1.field3753) / var2;
        if (~arg1.field3671 == arg0) {
            arg1.field3712 = 1024;
        }
        if (arg1.field3671 == 1) {
            arg1.field3712 = 1536;
        }
        arg1.field3675 = 0;
        if (arg1.field3671 == 2) {
            arg1.field3712 = 0;
        }
        if (arg1.field3671 == 3) {
            arg1.field3712 = 512;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lhc;I)V")
    public static final void method311(class53 arg0, int arg1) {
        field707++;
        if (arg1 != 11020) {
            method311((class53) null, -120);
        }
        for (int var2 = 0; var2 < class224.field3291; var2++) {
            int var3 = arg0.method368(arg1 ^ 0xFFFFD473);
            int var4 = arg0.method331(-103);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class248.field3738[var3] != null) {
                class248.field3738[var3].field1679 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class51() {
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class51(String arg0) {
        this.field704 = arg0;
    }
}
