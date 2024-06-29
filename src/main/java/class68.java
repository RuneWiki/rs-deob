import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class68 {

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    private int field931 = 0;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "[Ld;")
    public class329[] field927;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Lwp;")
    public static class453 field920 = new class453(56, -1);

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Z")
    public static boolean field926 = true;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "Z")
    public static boolean field933 = false;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "[Liw;")
    public static class532[] field930 = new class532[0];

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field935 = -1;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "J")
    private long field922;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Ld;")
    private class329 field919;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "Ld;")
    private class329 field932;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "[I")
    public static int[] field928;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V", line = 4)
    public final void method398(boolean arg0) {
        field925++;
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field924; var2++) {
            class329 var3 = this.field927[var2];
            while (true) {
                class329 var4 = var3.field4201;
                if (var3 == var4) {
                    break;
                }
                var4.method1871(-73);
            }
        }
        this.field919 = null;
        this.field932 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IJ)Ld;", line = 37)
    public final class329 method399(int arg0, long arg1) {
        if (arg0 != -32748) {
            field935 = 84;
        }
        this.field922 = arg1;
        field936++;
        class329 var4 = this.field927[(int) (arg1 & (long) (this.field924 - 1))];
        for (this.field919 = var4.field4201; this.field919 != var4; this.field919 = this.field919.field4201) {
            if (this.field919.field4199 == arg1) {
                class329 var5 = this.field919;
                this.field919 = this.field919.field4201;
                return var5;
            }
        }
        this.field919 = null;
        return null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([Ld;B)I", line = 68)
    public final int method400(class329[] arg0, byte arg1) {
        field921++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field924; var4++) {
            class329 var5 = this.field927[var4];
            for (class329 var6 = var5.field4201; var6 != var5; var6 = var6.field4201) {
                arg0[var3++] = var6;
            }
        }
        if (arg1 >= -33) {
            method405(true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 100)
    public static void method401(int arg0) {
        field928 = null;
        if (arg0 > 113) {
            field930 = null;
            field920 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ld;BJ)V", line = 113)
    public final void method402(class329 arg0, byte arg1, long arg2) {
        if (arg1 > -24) {
            this.method408((byte) -46);
        }
        field934++;
        if (arg0.field4196 != null) {
            arg0.method1871(-123);
        }
        class329 var5 = this.field927[(int) (arg2 & (long) (this.field924 - 1))];
        arg0.field4201 = var5;
        arg0.field4196 = var5.field4196;
        arg0.field4196.field4201 = arg0;
        arg0.field4199 = arg2;
        arg0.field4201.field4196 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Ld;", line = 150)
    public final class329 method403(int arg0) {
        field918++;
        if (this.field931 > 0 && this.field927[this.field931 - 1] != this.field932) {
            class329 var2 = this.field932;
            this.field932 = var2.field4201;
            return var2;
        }
        while (this.field931 < this.field924) {
            class329 var3 = this.field927[this.field931++].field4201;
            if (this.field927[this.field931 - 1] != var3) {
                this.field932 = var3.field4201;
                return var3;
            }
        }
        if (arg0 != 12561) {
            this.method399(42, -17L);
        }
        return null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)I", line = 182)
    public final int method404(byte arg0) {
        field937++;
        int var2 = 0;
        if (arg0 != -26) {
            return -117;
        }
        for (int var3 = 0; var3 < this.field924; var3++) {
            class329 var4 = this.field927[var3];
            for (class329 var5 = var4.field4201; var5 != var4; var5 = var5.field4201) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V", line = 218)
    public class68(int arg0) {
        this.field924 = arg0;
        this.field927 = new class329[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class329 var3 = this.field927[var2] = new class329();
            var3.field4201 = var3;
            var3.field4196 = var3;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)V", line = 239)
    public static final void method405(boolean arg0) {
        if (arg0) {
            class270.field3423 = class173.field2260;
            class491.field6485 = class699.field9887;
        } else {
            class270.field3423 = class582.field8139;
            class491.field6485 = class256.field3127;
        }
        class391.field4927 = class270.field3423.length;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)I", line = 254)
    public final int method406(int arg0) {
        field916++;
        if (arg0 != -1) {
            this.field922 = -17L;
        }
        return this.field924;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)Ld;", line = 267)
    public final class329 method407(byte arg0) {
        field923++;
        if (arg0 != 124) {
            this.method402(null, (byte) 104, -13L);
        }
        this.field931 = 0;
        return this.method403(arg0 ^ 0x316D);
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)Ld;", line = 298)
    public final class329 method408(byte arg0) {
        field917++;
        if (this.field919 == null) {
            return null;
        } else if (arg0 < 79) {
            return null;
        } else {
            class329 var2 = this.field927[(int) ((long) (this.field924 - 1) & this.field922)];
            while (this.field919 != var2) {
                if (this.field919.field4199 == this.field922) {
                    class329 var3 = this.field919;
                    this.field919 = this.field919.field4201;
                    return var3;
                }
                this.field919 = this.field919.field4201;
            }
            this.field919 = null;
            return null;
        }
    }
}
