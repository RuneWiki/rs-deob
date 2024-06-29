import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class166 {

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lpt;")
    public class147 field1985 = new class147();

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[I")
    public static int[] field1978 = new int[50];

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field1989 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Lpt;")
    private class147 field1992;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lvf;Lpt;B)V")
    private final void method801(class166 arg0, class147 arg1, byte arg2) {
        int var4 = -60 % ((-arg2 - 68) / 34);
        field1987++;
        class147 var5 = this.field1985.field1777;
        this.field1985.field1777 = arg1.field1777;
        arg1.field1777.field1779 = this.field1985;
        if (this.field1985 != arg1) {
            arg1.field1777 = arg0.field1985.field1777;
            arg1.field1777.field1779 = arg1;
            var5.field1779 = arg0.field1985;
            arg0.field1985.field1777 = var5;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Lpt;")
    public final class147 method802(byte arg0) {
        if (arg0 <= 98) {
            return null;
        }
        field1986++;
        class147 var2 = this.field1985.field1779;
        if (this.field1985 == var2) {
            this.field1992 = null;
            return null;
        } else {
            this.field1992 = var2.field1779;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lpt;I)V")
    public final void method803(class147 arg0, int arg1) {
        if (arg1 != 50) {
            return;
        }
        field1979++;
        if (arg0.field1777 != null) {
            arg0.method702((byte) -114);
        }
        arg0.field1779 = this.field1985;
        arg0.field1777 = this.field1985.field1777;
        arg0.field1777.field1779 = arg0;
        arg0.field1779.field1777 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
    public final int method804(int arg0) {
        field1981++;
        int var2 = arg0;
        for (class147 var3 = this.field1985.field1779; var3 != this.field1985; var3 = var3.field1779) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Lpt;")
    public final class147 method805(int arg0) {
        int var2 = -98 % ((31 - arg0) / 60);
        field1977++;
        class147 var3 = this.field1992;
        if (this.field1985 == var3) {
            this.field1992 = null;
            return null;
        } else {
            this.field1992 = var3.field1777;
            return var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)Lpt;")
    public final class147 method806(byte arg0) {
        if (arg0 != 104) {
            return null;
        }
        field1984++;
        class147 var2 = this.field1992;
        if (this.field1985 == var2) {
            this.field1992 = null;
            return null;
        } else {
            this.field1992 = var2.field1779;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)Lpt;")
    public final class147 method807(int arg0) {
        if (arg0 != -18919) {
            this.field1985 = null;
        }
        field1990++;
        class147 var2 = this.field1985.field1777;
        if (this.field1985 == var2) {
            this.field1992 = null;
            return null;
        } else {
            this.field1992 = var2.field1777;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
    public static void method808(byte arg0) {
        field1978 = null;
        if (arg0 >= -34) {
            field1978 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILvf;)V")
    public final void method809(int arg0, class166 arg1) {
        field1982++;
        if (arg0 == -6283) {
            this.method801(arg1, this.field1985.field1779, (byte) -21);
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)Lpt;")
    public final class147 method810(int arg0) {
        field1983++;
        class147 var2 = this.field1985.field1779;
        if (arg0 != 26315) {
            this.method809(-62, (class166) null);
        }
        if (this.field1985 == var2) {
            return null;
        } else {
            var2.method702((byte) -114);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILpt;)V")
    public final void method811(int arg0, class147 arg1) {
        field1991++;
        if (arg1.field1777 != null) {
            arg1.method702((byte) -114);
        }
        if (arg0 == -25513) {
            arg1.field1777 = this.field1985;
            arg1.field1779 = this.field1985.field1779;
            arg1.field1777.field1779 = arg1;
            arg1.field1779.field1777 = arg1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)Z")
    public final boolean method812(byte arg0) {
        field1988++;
        int var2 = 21 % ((arg0 + 6) / 44);
        return this.field1985.field1779 == this.field1985;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public final void method813(int arg0) {
        while (true) {
            class147 var2 = this.field1985.field1779;
            if (this.field1985 == var2) {
                field1980++;
                if (arg0 != 0) {
                    this.method812((byte) 121);
                }
                this.field1992 = null;
                return;
            }
            var2.method702((byte) -114);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class166() {
        this.field1985.field1779 = this.field1985;
        this.field1985.field1777 = this.field1985;
    }
}
