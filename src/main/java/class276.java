import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class276 extends class208 {

    @OriginalMember(owner = "client!tq", name = "Mb", descriptor = "Lqu;")
    public static class219 field4381 = new class219(62, 3);

    @OriginalMember(owner = "client!tq", name = "Nb", descriptor = "[Z")
    public static boolean[] field4382 = new boolean[100];

    @OriginalMember(owner = "client!tq", name = "Db", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!tq", name = "Eb", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!tq", name = "Fb", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!tq", name = "Gb", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!tq", name = "Hb", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!tq", name = "Ib", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!tq", name = "Jb", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!tq", name = "Kb", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!tq", name = "Lb", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!tq", name = "Ob", descriptor = "I")
    private int field4383;

    @OriginalMember(owner = "client!tq", name = "Pb", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!tq", name = "Qb", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!tq", name = "Rb", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!tq", name = "Sb", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!tq", name = "Cb", descriptor = "Lei;")
    private class392 field4371;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "(II)V")
    public final void method1851(int arg0, int arg1) {
        if (arg1 != -1342326174) {
            this.method1854((byte) -86);
        }
        ++field4374;
        super.field3193[super.field3162++] = (byte) (this.field4371.method2500(39) + arg0);
    }

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "(II)I")
    public final int method1852(int arg0, int arg1) {
        ++field4380;
        int var3 = this.field4383 >> 3;
        if (arg0 <= 88) {
            field4375 = 70;
        }
        int var4 = -(7 & this.field4383) + 8;
        this.field4383 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (class509.field7596[var4] & super.field3193[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (super.field3193[var3] & class509.field7596[var4]) + var5;
        } else {
            var6 = (super.field3193[var3] >> -arg1 + var4 & class509.field7596[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "(B)I")
    public final int method1853(byte arg0) {
        ++field4372;
        if (arg0 >= -72) {
            return 87;
        } else {
            int var2 = 255 & super.field3193[super.field3162++] - this.field4371.method2500(127);
            return ~var2 > -129 ? var2 : (var2 + -128 << 8) + (255 & super.field3193[super.field3162++] + -this.field4371.method2500(111));
        }
    }

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "(B)V")
    public final void method1854(byte arg0) {
        super.field3162 = (this.field4383 + 7) / 8;
        ++field4378;
        int var2 = 69 / ((arg0 - -24) / 44);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1855(String arg0, int arg1) {
        ++field4377;
        class77.field1153 = arg0;
        if (class339.field5294.field27 != null) {
            try {
                String var2 = class339.field5294.field27.getParameter("cookieprefix");
                String var3 = class339.field5294.field27.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg0.length() != arg1) {
                    var5 = var4 + "; Expires=" + class531.method3154(class246.method1705((byte) 28) + 94608000000L, arg1 ^ -6409) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                class200.method1371("document.cookie=\"" + var5 + "\"", (byte) 119, class339.field5294.field27);
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "(II)I")
    public final int method1856(int arg0, int arg1) {
        ++field4386;
        if (arg1 < 83) {
            method1855((String) null, -40);
        }
        return arg0 * 8 + -this.field4383;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II[BI)V")
    public final void method1857(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field4384;
        if (arg1 == 7) {
            for (int var5 = 0; ~var5 > ~arg0; ++var5) {
                arg2[arg3 + var5] = (byte) (super.field3193[super.field3162++] + -this.field4371.method2500(-62));
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "(I)V")
    public static void method1858(int arg0) {
        if (arg0 != -1342326174) {
            field4382 = null;
        }
        field4381 = null;
        field4382 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[I)V")
    public final void method1859(int arg0, int[] arg1) {
        if (arg0 < 36) {
            this.method1852(51, 73);
        }
        ++field4373;
        this.field4371 = new class392(arg1);
    }

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "(B)V")
    public final void method1860(byte arg0) {
        this.field4383 = super.field3162 * 8;
        if (arg0 >= -89) {
            this.field4383 = 118;
        }
        ++field4387;
    }

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "(B)Z")
    public final boolean method1861(byte arg0) {
        ++field4385;
        if (arg0 < 126) {
            this.field4383 = -39;
        }
        int var2 = super.field3193[super.field3162] - this.field4371.method2502((byte) 98) & 255;
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V")
    public class276(int arg0) {
        super(arg0);
    }
}
