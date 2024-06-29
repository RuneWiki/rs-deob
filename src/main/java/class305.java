import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class305 {

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    private int field4911 = 0;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public int field4910;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "[Llb;")
    public class134[] field4906;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Z")
    public static boolean field4896 = false;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field4894 = -1;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field4907 = 0;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field4895 = 0;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "J")
    private long field4902;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Llb;")
    private class134 field4905;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "Llb;")
    private class134 field4913;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lcc;IZ)V")
    public static final void method2041(class222 arg0, int arg1, boolean arg2) {
        field4903++;
        int var3 = arg0.field3443 == 0 ? arg0.field3408 : arg0.field3443;
        int var4 = -78 / ((arg1 + 66) / 52);
        int var5 = arg0.field3460 == 0 ? arg0.field3561 : arg0.field3460;
        class109.method815(var3, class8.field144[arg0.field3554 >> 16], arg2, arg0.field3554, 0, var5);
        if (arg0.field3526 != null) {
            class109.method815(var3, arg0.field3526, arg2, arg0.field3554, 0, var5);
        }
        class288 var6 = (class288) class48.field787.method2043((long) arg0.field3554, -1);
        if (var6 != null) {
            class116.method851(arg2, var5, var6.field4505, var3, (byte) -72);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
    public final int method2042(byte arg0) {
        field4897++;
        int var2 = 0;
        if (arg0 < 123) {
            return 83;
        }
        for (int var3 = 0; var3 < this.field4910; var3++) {
            class134 var4 = this.field4906[var3];
            for (class134 var5 = var4.field2006; var5 != var4; var5 = var5.field2006) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(JI)Llb;")
    public final class134 method2043(long arg0, int arg1) {
        this.field4902 = arg0;
        class134 var4 = this.field4906[(int) (arg0 & (long) (this.field4910 + arg1))];
        field4900++;
        for (this.field4905 = var4.field2006; this.field4905 != var4; this.field4905 = this.field4905.field2006) {
            if (this.field4905.field2009 == arg0) {
                class134 var5 = this.field4905;
                this.field4905 = this.field4905.field2006;
                return var5;
            }
        }
        this.field4905 = null;
        return null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method2044(int arg0) {
        field4909++;
        for (int var2 = arg0; var2 < this.field4910; var2++) {
            class134 var3 = this.field4906[var2];
            while (true) {
                class134 var4 = var3.field2006;
                if (var3 == var4) {
                    break;
                }
                var4.method995((byte) 41);
            }
        }
        this.field4905 = null;
        this.field4913 = null;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Llb;")
    public final class134 method2045(int arg0) {
        field4908++;
        if (this.field4905 == null) {
            return null;
        }
        class134 var2 = this.field4906[(int) (this.field4902 & (long) (this.field4910 - 1))];
        if (arg0 != 3408) {
            return null;
        }
        while (this.field4905 != var2) {
            if (this.field4905.field2009 == this.field4902) {
                class134 var3 = this.field4905;
                this.field4905 = this.field4905.field2006;
                return var3;
            }
            this.field4905 = this.field4905.field2006;
        }
        this.field4905 = null;
        return null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Llb;IJ)V")
    public final void method2046(class134 arg0, int arg1, long arg2) {
        if (arg0.field2007 != null) {
            arg0.method995((byte) -117);
        }
        if (arg1 >= -30) {
            return;
        }
        field4899++;
        class134 var5 = this.field4906[(int) ((long) (this.field4910 - 1) & arg2)];
        arg0.field2006 = var5;
        arg0.field2009 = arg2;
        arg0.field2007 = var5.field2007;
        arg0.field2007.field2006 = arg0;
        arg0.field2006.field2007 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Llb;")
    public final class134 method2047(int arg0) {
        field4904++;
        if (this.field4911 > 0 && this.field4906[this.field4911 - 1] != this.field4913) {
            class134 var2 = this.field4913;
            this.field4913 = var2.field2006;
            return var2;
        }
        int var3 = -92 / ((-arg0 - 51) / 48);
        while (this.field4910 > this.field4911) {
            class134 var4 = this.field4906[this.field4911++].field2006;
            if (this.field4906[this.field4911 - 1] != var4) {
                this.field4913 = var4.field2006;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
    public final int method2048(int arg0) {
        if (arg0 == -1) {
            field4912++;
            return this.field4910;
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)Llb;")
    public final class134 method2049(int arg0) {
        this.field4911 = arg0;
        field4901++;
        return this.method2047(19);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V")
    public class305(int arg0) {
        this.field4910 = arg0;
        this.field4906 = new class134[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class134 var3 = this.field4906[var2] = new class134();
            var3.field2006 = var3;
            var3.field2007 = var3;
        }
    }
}
