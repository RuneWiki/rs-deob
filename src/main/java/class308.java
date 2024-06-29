import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class308 {

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lvf;")
    private class309 field4852;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Lrg;")
    private class96 field4853;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lbj;")
    private class55 field4851;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lpe;")
    private class101 field4861;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lja;")
    public static class64 field4854;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4855;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[Lgi;")
    private class216[] field4849;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLpm;Lpm;IZ)Lgi;", line = 4)
    private final class216 method2126(boolean arg0, class103 arg1, class103 arg2, int arg3, boolean arg4) {
        field4858++;
        if (arg0) {
            this.field4853 = (class96) null;
        }
        if (this.field4861 == null) {
            throw new RuntimeException();
        }
        this.field4861.field1667 = arg3 * 8 + 5;
        if (this.field4861.field1667 >= this.field4861.field1661.length) {
            throw new RuntimeException();
        } else if (this.field4849[arg3] == null) {
            int var6 = this.field4861.method775(-86);
            int var7 = this.field4861.method775(-85);
            class216 var8 = new class216(arg3, arg2, arg1, this.field4853, this.field4852, var6, var7, arg4);
            this.field4849[arg3] = var8;
            return var8;
        } else {
            return this.field4849[arg3];
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lpm;BLpm;I)Lgi;", line = 45)
    public final class216 method2127(class103 arg0, byte arg1, class103 arg2, int arg3) {
        field4848++;
        return arg1 < 61 ? (class216) null : this.method2126(false, arg0, arg2, arg3, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I", line = 62)
    public static final int method2128(int arg0, int arg1) {
        field4860++;
        if (arg1 != -18465) {
            method2132(-35, (byte) -2, -20);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)I", line = 73)
    public static final int method2129(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1252946087) {
            field4850++;
            return arg2 <= arg0 ? (arg0 > arg1 ? arg1 : arg0) : arg2;
        } else {
            return -14;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 87)
    public final void method2130(int arg0) {
        field4857++;
        if (this.field4849 == null) {
            return;
        }
        if (arg0 != -8439) {
            this.field4849 = (class216[]) null;
        }
        for (int var2 = 0; var2 < this.field4849.length; var2++) {
            if (this.field4849[var2] != null) {
                this.field4849[var2].method1562((byte) 1);
            }
        }
        for (int var3 = 0; var3 < this.field4849.length; var3++) {
            if (this.field4849[var3] != null) {
                this.field4849[var3].method1560(66);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lsa;Lal;I)Ldb;", line = 129)
    public static final class186 method2131(class110 arg0, class323 arg1, int arg2) {
        long var3 = ((long) arg1.field5022 << 56) + ((long) arg1.field5014 << 32) + (long) (arg1.field5013 - -(arg1.field5016 - -1 << 16));
        field4847++;
        if (arg2 != 4) {
            field4855 = (String) null;
        }
        class186 var5 = (class186) arg0.method833(false, var3);
        if (var5 == null) {
            var5 = new class186(arg1.field5016, (float) arg1.field5013, true, false, arg1.field5014);
            arg0.method845(var5, (byte) -43, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)V", line = 151)
    public static final void method2132(int arg0, byte arg1, int arg2) {
        if (arg1 != -28) {
            method2128(87, -77);
        }
        field4859++;
        if (arg0 == 4 && !class6.field61) {
            arg2 = 2;
            arg0 = 2;
        }
        if (class248.field3836 != arg0) {
            if (class54.field843) {
                return;
            }
            if (class248.field3836 != 0) {
                class54.field858[class248.field3836].method857();
            }
            if (arg0 != 0) {
                class321 var3 = class54.field858[arg0];
                var3.method855();
                var3.method854(arg2);
            }
            class248.field3836 = arg0;
            class223.field3591 = arg2;
        } else if (arg0 != 0 && class223.field3591 != arg2) {
            class54.field858[arg0].method854(arg2);
            class223.field3591 = arg2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Z", line = 196)
    public final boolean method2133(byte arg0) {
        field4856++;
        if (this.field4861 != null) {
            return true;
        }
        if (this.field4851 == null) {
            if (this.field4853.method687((byte) 70)) {
                return false;
            }
            this.field4851 = this.field4853.method696(745955184, 255, (byte) 0, true, 255);
        }
        if (this.field4851.field4940) {
            return false;
        }
        if (arg0 != -73) {
            field4855 = (String) null;
        }
        this.field4861 = new class101(this.field4851.method402((byte) -100));
        this.field4849 = new class216[(this.field4861.field1661.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 231)
    public static void method2134(int arg0) {
        field4855 = null;
        field4854 = null;
        int var1 = -45 % ((arg0 - 48) / 33);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lrg;Lvf;)V", line = 241)
    public class308(class96 arg0, class309 arg1) {
        this.field4852 = arg1;
        this.field4853 = arg0;
        if (!this.field4853.method687((byte) 76)) {
            this.field4851 = this.field4853.method696(745955184, 255, (byte) 0, true, 255);
        }
    }
}
