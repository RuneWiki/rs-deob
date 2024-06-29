import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class412 {

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Ldba;")
    public class101 field5921 = new class101();

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Lln;")
    public static class400 field5923 = new class400();

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "Lmga;")
    public static class739 field5930 = new class739(8, 11);

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "Ldba;")
    private class101 field5934;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "[Ls;")
    public static class296[] field5933;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I", line = 4)
    public final int method2538(int arg0) {
        field5928++;
        int var2 = 0;
        int var3 = 81 % ((-arg0 - 54) / 41);
        for (class101 var4 = this.field5921.field1412; var4 != this.field5921; var4 = var4.field1412) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 32)
    public static void method2539(int arg0) {
        field5923 = null;
        field5930 = null;
        field5933 = null;
        if (arg0 > -69) {
            field5923 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)Z", line = 44)
    public final boolean method2540(boolean arg0) {
        if (arg0) {
            field5930 = null;
        }
        field5925++;
        return this.field5921.field1412 == this.field5921;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)Ldba;", line = 61)
    public final class101 method2541(int arg0) {
        field5922++;
        class101 var2 = this.field5921.field1416;
        if (this.field5921 == var2) {
            this.field5934 = null;
            return null;
        }
        this.field5934 = var2.field1416;
        if (arg0 >= -42) {
            field5933 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)Ldba;", line = 83)
    public final class101 method2542(int arg0) {
        field5926++;
        class101 var2 = this.field5934;
        if (this.field5921 == var2) {
            this.field5934 = null;
            return null;
        } else if (arg0 > -93) {
            return null;
        } else {
            this.field5934 = var2.field1412;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)Ldba;", line = 105)
    public final class101 method2543(int arg0) {
        field5927++;
        class101 var2 = this.field5921.field1412;
        if (this.field5921 == var2) {
            return null;
        } else if (arg0 == -15114) {
            var2.method792((byte) -111);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V", line = 123)
    public static final void method2544(int arg0, int arg1, int arg2) {
        field5931++;
        class16 var3 = class94.method753(16, 13175, (long) arg2);
        if (arg0 != -13542) {
            method2544(-95, -6, 88);
        }
        var3.method119(-66);
        var3.field237 = arg1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILdba;)V", line = 139)
    public final void method2545(int arg0, class101 arg1) {
        if (arg1.field1416 != null) {
            arg1.method792((byte) -103);
        }
        field5919++;
        arg1.field1412 = this.field5921;
        arg1.field1416 = this.field5921.field1416;
        arg1.field1416.field1412 = arg1;
        if (arg0 >= -125) {
            this.field5921 = null;
        }
        arg1.field1412.field1416 = arg1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ltm;I)V", line = 156)
    public final void method2546(class412 arg0, int arg1) {
        field5929++;
        if (arg1 == 8557) {
            this.method2547(this.field5921.field1412, arg0, 8);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ldba;Ltm;I)V", line = 167)
    private final void method2547(class101 arg0, class412 arg1, int arg2) {
        field5918++;
        class101 var4 = this.field5921.field1416;
        this.field5921.field1416 = arg0.field1416;
        arg0.field1416.field1412 = this.field5921;
        if (arg2 == 8 && this.field5921 != arg0) {
            arg0.field1416 = arg1.field5921.field1416;
            arg0.field1416.field1412 = arg0;
            arg1.field5921.field1416 = var4;
            var4.field1412 = arg1.field5921;
        }
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)Ldba;", line = 199)
    public final class101 method2548(int arg0) {
        field5916++;
        class101 var2 = this.field5934;
        if (arg0 != 8) {
            return null;
        } else if (this.field5921 == var2) {
            this.field5934 = null;
            return null;
        } else {
            this.field5934 = var2.field1416;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V", line = 220)
    public final void method2549(int arg0) {
        field5924++;
        while (true) {
            class101 var2 = this.field5921.field1412;
            if (this.field5921 == var2) {
                if (arg0 >= -55) {
                    this.method2541(12);
                }
                this.field5934 = null;
                return;
            }
            var2.method792((byte) -93);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(ILdba;)V", line = 244)
    public final void method2550(int arg0, class101 arg1) {
        if (arg1.field1416 != null) {
            arg1.method792((byte) -118);
        }
        field5932++;
        arg1.field1416 = this.field5921;
        arg1.field1412 = this.field5921.field1412;
        arg1.field1416.field1412 = arg1;
        if (arg0 == 0) {
            arg1.field1412.field1416 = arg1;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Ldba;", line = 267)
    public final class101 method2551(byte arg0) {
        if (arg0 != -108) {
            this.method2542(92);
        }
        field5917++;
        class101 var2 = this.field5921.field1412;
        if (this.field5921 == var2) {
            this.field5934 = null;
            return null;
        } else {
            this.field5934 = var2.field1412;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V", line = 296)
    public class412() {
        this.field5921.field1412 = this.field5921;
        this.field5921.field1416 = this.field5921;
    }
}
