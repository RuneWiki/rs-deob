import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class149 {

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Lqj;")
    private class355 field1959;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Lsn;")
    private class447 field1958;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Lul;")
    private class406 field1960;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "[J")
    public static long[] field1954 = new long[32];

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lug;")
    private class396 field1953;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "[I")
    public static int[] field1962;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "[Lft;")
    private class4[] field1957;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)Z", line = 8)
    public final boolean method895(int arg0) {
        field1963++;
        if (this.field1953 != null) {
            return true;
        }
        if (arg0 != 0) {
            this.field1953 = null;
        }
        if (this.field1960 == null) {
            if (this.field1958.method2767((byte) 123)) {
                return false;
            }
            this.field1960 = this.field1958.method2759(255, 255, (byte) -114, (byte) 0, true);
        }
        if (this.field1960.field1861) {
            return false;
        } else {
            this.field1953 = new class396(this.field1960.method868(127));
            this.field1957 = new class4[(this.field1953.field5761.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILvs;Lvs;IZ)Lft;", line = 38)
    private final class4 method896(int arg0, class420 arg1, class420 arg2, int arg3, boolean arg4) {
        field1961++;
        if (arg0 > -123) {
            return null;
        } else if (this.field1953 == null) {
            throw new RuntimeException();
        } else {
            this.field1953.field5729 = arg3 * 8 + 5;
            if (this.field1953.field5729 >= this.field1953.field5761.length) {
                throw new RuntimeException();
            } else if (this.field1957[arg3] == null) {
                int var6 = this.field1953.method2406((byte) -91);
                int var7 = this.field1953.method2406((byte) -73);
                class4 var8 = new class4(arg3, arg2, arg1, this.field1958, this.field1959, var6, var7, arg4);
                this.field1957[arg3] = var8;
                return var8;
            } else {
                return this.field1957[arg3];
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 79)
    public final void method897(int arg0) {
        field1956++;
        if (this.field1957 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1957.length; var2++) {
            if (this.field1957[var2] != null) {
                this.field1957[var2].method20((byte) -116);
            }
        }
        int var3 = 32 / ((-arg0 - 31) / 41);
        for (int var4 = 0; var4 < this.field1957.length; var4++) {
            if (this.field1957[var4] != null) {
                this.field1957[var4].method23((byte) -106);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lza;IILc;III[[[B[I[I[I[I[IIBIIZ)V", line = 115)
    public static final void method898(class287 arg0, int arg1, int arg2, class124 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class492.field7216 = arg0;
        class136.field1818 = arg1;
        class164.field2145 = arg3;
        class372.field5053 = class492.field7216.method1176() > 0;
        class151.field1977 = arg4 >> class351.field4688;
        class122.field1577 = arg6 >> class351.field4688;
        class466.field6933 = arg4;
        class14.field153 = arg6;
        class272.field3637 = arg5;
        class259.field3462 = class151.field1977 - class349.field4645;
        if (class259.field3462 < 0) {
            class38.field397 = -class259.field3462;
            class259.field3462 = 0;
        } else {
            class38.field397 = 0;
        }
        class176.field2275 = class122.field1577 - class349.field4645;
        if (class176.field2275 < 0) {
            class135.field1792 = -class176.field2275;
            class176.field2275 = 0;
        } else {
            class135.field1792 = 0;
        }
        class410.field5874 = class349.field4645 + class151.field1977;
        if (class410.field5874 > class515.field7487) {
            class410.field5874 = class515.field7487;
        }
        class69.field814 = class349.field4645 + class122.field1577;
        if (class69.field814 > class114.field1494) {
            class69.field814 = class114.field1494;
        }
        for (int var18 = 0; var18 < class349.field4645 + class349.field4645 + 2; var18++) {
            for (int var23 = 0; var23 < class349.field4645 + class349.field4645 + 2; var23++) {
                int var24 = class151.field1977 + var18 - class349.field4645;
                int var25 = class122.field1577 + var23 - class349.field4645;
                if (var24 >= 0 && var25 >= 0 && var24 < class515.field7487 && var25 < class114.field1494) {
                    int var26 = var24 << class351.field4688;
                    int var27 = var25 << class351.field4688;
                    int var28 = class14.field152[class14.field152.length - 1].method217(var24, var25) - (0x3E8 << class351.field4688 - 7);
                    int var29 = class378.field5470 == null ? class14.field152[0].method217(var24, var25) + class166.field2152 : class378.field5470[0].method217(var24, var25) + class166.field2152;
                    class32.field327[var18][var23] = class492.field7216.method1209(var26, var28, var27, var26, var29, var27);
                } else {
                    class32.field327[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class349.field4645 + class349.field4645 + 1; var19++) {
            for (int var22 = 0; var22 < class349.field4645 + class349.field4645 + 1; var22++) {
                class487.field7157[var19][var22] = class32.field327[var19][var22] || class32.field327[var19 + 1][var22] || class32.field327[var19][var22 + 1] || class32.field327[var19 + 1][var22 + 1];
            }
        }
        class499.field7282 = arg8;
        class128.field1660 = arg9;
        class254.field3383 = arg10;
        class216.field2952 = arg11;
        class62.field710 = arg12;
        class376.method2219();
        class309.method1844((byte) 19);
        for (class23 var20 = (class23) class249.field3320.method290(-1); var20 != null; var20 = (class23) class249.field3320.method284(10748)) {
            var20.method1239(68);
            class96.method549(true, var20);
        }
        if (class372.field5053) {
            for (int var21 = 0; var21 < class73.field925; var21++) {
                class124.field1608[var21].method1982(arg1, 1, arg17);
            }
        }
        if (arg2 > 1) {
            class492.field7216.method1171(0);
            if (class429.field6242 == null || class429.field6242 instanceof class37) {
                class429.field6242 = new class174();
            }
        } else if (class429.field6242 == null || class429.field6242 instanceof class174) {
            class429.field6242 = new class37();
        }
        class429.field6242.method196(arg2, 48);
        class429.field6242.method205(0);
        if (class95.field1140 != null) {
            class530.method3141(true);
            class429.field6242.method201(1, 22);
            class331.method1941(arg2, null, 0, (byte) 0, arg15, arg16);
            class429.field6242.method205(0);
            class429.field6242.method201(1, 23);
            class530.method3141(false);
        }
        class331.method1941(arg2, arg7, arg13, arg14, arg15, arg16);
        class429.field6242.method205(0);
        class429.field6242.method197(5000);
        class429.field6242.method205(0);
        if (arg2 > 1) {
            class492.field7216.method1187(0);
        }
        class492.field7216.method1146(0, null);
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 273)
    public static void method899(int arg0) {
        field1962 = null;
        if (arg0 == 1) {
            field1954 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lsn;Lqj;)V", line = 284)
    public class149(class447 arg0, class355 arg1) {
        this.field1959 = arg1;
        this.field1958 = arg0;
        if (!this.field1958.method2767((byte) 123)) {
            this.field1960 = this.field1958.method2759(255, 255, (byte) 57, (byte) 0, true);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILvs;ILvs;)Lft;", line = 296)
    public final class4 method900(int arg0, class420 arg1, int arg2, class420 arg3) {
        field1955++;
        return arg2 == 2 ? this.method896(arg2 - 130, arg1, arg3, arg0, true) : null;
    }
}
