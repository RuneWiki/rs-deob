import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class132 extends class235 {

    @OriginalMember(owner = "client!gr", name = "M", descriptor = "[B")
    public byte[] field1773;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    public static int field1766 = 0;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "Z")
    public static boolean field1768 = false;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "Lwe;")
    public static class24 field1770 = new class24(50);

    @OriginalMember(owner = "client!gr", name = "P", descriptor = "[I")
    public static int[] field1775 = new int[100];

    @OriginalMember(owner = "client!gr", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1776 = "glow2:";

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!gr", name = "L", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!gr", name = "N", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!gr", name = "R", descriptor = "[[S")
    public static short[][] field1777;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)I")
    public static final int method891(int arg0, int arg1, int arg2) {
        field1772++;
        if (arg1 == 1 || arg1 == 3) {
            return class71.field975[arg0 & 0x3];
        } else {
            int var3 = 16 % ((arg2 - 82) / 38);
            return class280.field4127[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)V")
    public static final void method892(int arg0) {
        field1769++;
        if (arg0 != -3403) {
            return;
        }
        class24 var1 = class79.field1080;
        synchronized (class79.field1080) {
            class79.field1080.method204((byte) 56);
        }
        class24 var2 = class29.field500;
        synchronized (class29.field500) {
            class29.field500.method204((byte) 56);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1771++;
        if (arg2 != 1) {
            field1770 = null;
        }
        if (arg4 == arg5) {
            class138.method924(arg1, arg6, arg0, arg3, (byte) -94, arg5, arg7);
        } else if ((arg6 - arg5) >= class203.field2942 && arg5 + arg6 <= class297.field4268 && class180.field2375 <= arg3 - arg4 && (arg3 + arg4) <= class50.field695) {
            class42.method317(arg0, arg1, arg6, arg7, arg4, arg3, arg5, (byte) 31);
        } else {
            class360.method2370(arg7, arg1, arg0, (byte) 96, arg3, arg6, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "(I)V")
    public static void method894(int arg0) {
        field1776 = null;
        field1777 = null;
        if (arg0 < 81) {
            method899(94, (byte) -69);
        }
        field1770 = null;
        field1775 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)V")
    public static final void method895(boolean arg0, int arg1) {
        field1764++;
        class24 var2 = class227.field3192;
        synchronized (class227.field3192) {
            class227.field3192.method215(0, arg1);
        }
        class24 var3 = class277.field4065;
        synchronized (class277.field4065) {
            class277.field4065.method215(0, arg1);
        }
        class24 var4 = class169.field2235;
        synchronized (class169.field2235) {
            class169.field2235.method215(0, arg1);
        }
        if (arg0) {
            method894(-126);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLqj;Lqj;)V")
    public static final void method896(byte arg0, class238 arg1, class238 arg2) {
        field1765++;
        class95.field1318 = arg2;
        class114.field1559 = arg1;
        if (arg0 <= 109) {
            field1775 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Loc;III[Z)V")
    public static final void method897(class93 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class88.field1226 == class425.field6324) {
            return;
        }
        int var5 = class198.field2829[arg1].method797(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class337 var7 = class198.field2829[var6];
                if (var7 != null) {
                    var7.method787(arg0, arg2, var5 - var7.method797(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZILjava/lang/String;Ldr;)V")
    public static final void method898(boolean arg0, int arg1, String arg2, class213 arg3) {
        field1763++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        if (arg1 != -29854) {
            return;
        }
        int var7 = class231.field3262.method1025((byte) -75, 250, arg2, (class243[]) null);
        int var8 = class231.field3262.method1024(-123, arg2, 250, (class243[]) null) * 13;
        class35.field574.method2188(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class35.field574.method2057(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg3.method1323((int[]) null, (class449) null, 0, 1, var6, -1, 0, -1, var8, 0, arg1 ^ 0xFFFFD282, arg2, (class243[]) null, var5, var7, 1);
        class271.method1739(var5 - var4, var8 - -var4 + var4, var6 - var4, var4 + var7 + var4, -113);
        if (arg0) {
            class35.field574.method2067();
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "([B)V")
    public class132(byte[] arg0) {
        this.field1773 = arg0;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Lhh;")
    public static final class183 method899(int arg0, byte arg1) {
        field1767++;
        class24 var2 = class228.field3212;
        class183 var3;
        synchronized (class228.field3212) {
            var3 = (class183) class228.field3212.method209(119, (long) arg0);
        }
        int var4 = 17 % ((57 - arg1) / 56);
        if (var3 != null) {
            return var3;
        }
        byte[] var5 = class59.field857.method1472(arg0, 32, 0);
        class183 var6 = new class183();
        if (var5 != null) {
            var6.method1131(124, new class265(var5));
        }
        var6.method1130(0);
        class24 var7 = class228.field3212;
        synchronized (class228.field3212) {
            class228.field3212.method202(true, var6, (long) arg0);
            return var6;
        }
    }
}
