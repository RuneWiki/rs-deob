import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class145 {

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public int field2395 = 1190717;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public int field2389 = 16;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public int field2398 = 128;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public int field2397 = -1;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public int field2404 = 8;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Z")
    public boolean field2399 = true;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public int field2405 = 0;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Z")
    public boolean field2392 = true;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "Z")
    public boolean field2401 = false;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public int field2402 = -1;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2394 = 0;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Lnm;")
    public static class174 field2403 = null;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "Lbe;")
    public static class283 field2407 = class153.method941(125, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Ldj;")
    public static class310 field2400;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lfe;III)V", line = 7)
    private final void method907(class229 arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 64) {
            return;
        }
        if (arg1 == 1) {
            this.field2405 = class290.method1978(-101, arg0.method1551(-128));
        } else if (arg1 == 2) {
            this.field2397 = arg0.method1535((byte) 95);
        } else if (arg1 == 3) {
            this.field2397 = arg0.method1496(true);
            if (this.field2397 == 65535) {
                this.field2397 = -1;
            }
        } else if (arg1 == 5) {
            this.field2399 = false;
        } else if (arg1 == 7) {
            this.field2402 = class290.method1978(-101, arg0.method1551(64));
        } else if (arg1 == 8) {
            class110.field1870 = arg2;
        } else if (arg1 == 9) {
            this.field2398 = arg0.method1496(true);
        } else if (arg1 == 10) {
            this.field2392 = false;
        } else if (arg1 == 11) {
            this.field2404 = arg0.method1535((byte) 87);
        } else if (arg1 == 12) {
            this.field2401 = true;
        } else if (arg1 == 13) {
            this.field2395 = arg0.method1551(-123);
        } else if (arg1 == 14) {
            this.field2389 = arg0.method1535((byte) 112);
        }
        field2396++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILek;II)Lqb;", line = 75)
    public static final class95 method908(int arg0, class172 arg1, int arg2, int arg3) {
        field2391++;
        if (arg0 != -2710) {
            method910(true, -62, (class283) null);
        }
        return class26.method183(true, arg1, arg3, arg2) ? class180.method1186((byte) 52) : null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 90)
    public static void method909(byte arg0) {
        field2400 = null;
        if (arg0 <= 34) {
            field2403 = (class174) null;
        }
        field2407 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZILbe;)V", line = 129)
    public static final void method910(boolean arg0, int arg1, class283 arg2) {
        if (arg1 >= -52) {
            return;
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        field2406++;
        int var5 = var3 + 6;
        int var6 = class269.field4539.method1663(arg2, 250);
        int var7 = class269.field4539.method1640(arg2, 250) * 13;
        class311.method2116(var4 - var3, -var3 + var5, var6 - (-var3 - var3), var3 + var7 + var3, 0);
        class311.method2113(var4 - var3, -var3 + var5, var3 + var6 + var3, var7 - -var3 + var3, 16777215);
        class269.field4539.method1652(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class277.method1849(var3 + var3 + var6, 1, var4 - var3, -var3 + var5, var3 + var3 + var7);
        if (arg0) {
            class167.method1039();
        } else {
            class241.method1626(var7, var4, var6, var5, -14702);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lbe;I)I", line = 173)
    public static final int method911(class283 arg0, int arg1) {
        int var2 = 24 / ((-arg1 - 30) / 62);
        field2393++;
        if (arg0 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < class103.field1748; var3++) {
            if (arg0.method1910(16369, class143.field2372[var3])) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILfe;)V", line = 217)
    public final void method912(int arg0, int arg1, class229 arg2) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var4 = arg2.method1535((byte) 127);
            if (var4 == 0) {
                field2390++;
                return;
            }
            this.method907(arg2, var4, arg1, 123);
        }
    }
}
