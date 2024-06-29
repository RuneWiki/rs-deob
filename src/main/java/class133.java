import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class133 {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lfl;")
    private class86 field1989 = new class86(256);

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lfl;")
    private class86 field1996 = new class86(256);

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lmh;")
    private class65 field1985;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lmh;")
    private class65 field1984;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lok;")
    public static class41 field1983 = class262.method1841(160, 0);

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lda;")
    public static class212 field1993 = new class212();

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZII)I", line = 5)
    public static final int method929(int arg0, boolean arg1, int arg2, int arg3) {
        field1991++;
        int var4 = arg2 & 0x3;
        if (!arg1) {
            method934(-108, 70);
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 43)
    public static void method930(int arg0) {
        field1993 = null;
        field1983 = null;
        if (arg0 < 114) {
            method934(77, -44);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V", line = 55)
    public static final void method931(int arg0, int arg1) {
        if (arg1 > -107) {
            method934(35, -122);
        }
        field1995++;
        class65.field974.method138(arg0, 0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([IIZI)Lgi;", line = 72)
    private final class291 method932(int[] arg0, int arg1, boolean arg2, int arg3) {
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFFC) ^ arg1;
        field1982++;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class291 var9 = (class291) this.field1996.method617(var7, arg2);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class267 var10 = (class267) this.field1989.method617(var7, arg2);
            if (var10 == null) {
                var10 = class267.method1897(this.field1984, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field1989.method610(81, var10, var7);
            }
            class291 var11 = var10.method1891(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method418(6971);
                this.field1996.method610(126, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)V", line = 119)
    public static final void method933(byte arg0, int arg1) {
        field1986++;
        if (arg0 != -78) {
            method934(-11, 78);
        }
        class35.field527.method138(arg1, 0);
        class289.field4692.method138(arg1, 0);
        class81.field1190.method138(arg1, arg0 + 78);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lmh;Lmh;)V", line = 396)
    public class133(class65 arg0, class65 arg1) {
        this.field1985 = arg0;
        this.field1984 = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Lok;", line = 147)
    public static final class41 method934(int arg0, int arg1) {
        field1988++;
        class41 var2 = class1.method4(arg1, (byte) 102);
        if (arg0 != -1) {
            return (class41) null;
        }
        for (int var3 = var2.method275(false) - 3; var3 > 0; var3 -= 3) {
            var2 = class187.method1346(new class41[] { var2.method308(var3, 0, arg0 + 116), class203.field3284, var2.method279(var3, (byte) -93) }, 0);
        }
        if (var2.method275(false) > 9) {
            return class187.method1346(new class41[] { class225.field3599, var2.method308(var2.method275(false) - 8, 0, -119), class9.field117, class288.field4671, var2, class208.field3369 }, 0);
        } else if (var2.method275(false) > 6) {
            return class187.method1346(new class41[] { class121.field1799, var2.method308(var2.method275(false) - 4, 0, 79), class249.field3967, class288.field4671, var2, class208.field3369 }, 0);
        } else {
            return class187.method1346(new class41[] { class127.field1890, var2, class283.field4600 }, 0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIB)V", line = 183)
    public static final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = arg0;
        if (arg5 <= 49) {
            field1990 = 15;
        }
        while (var6 <= arg0 + arg1) {
            for (int var7 = arg3; var7 <= arg2 + arg3; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class314.field5301[arg4][var7][var6] = 127;
                }
            }
            var6++;
        }
        for (int var8 = arg0; var8 < (arg0 + arg1); var8++) {
            for (int var9 = arg3; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class278.field4548[arg4][var9][var8] = arg4 > 0 ? class278.field4548[arg4 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg0 + 1; var10 < (arg0 + arg1); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class278.field4548[arg4][arg3][var10] = class278.field4548[arg4][arg3 - 1][var10];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var11 = arg3 + 1; var11 < arg3 + arg2; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class278.field4548[arg4][var11][arg0] = class278.field4548[arg4][var11][arg0 - 1];
                }
            }
        }
        field1981++;
        if (arg3 < 0 || arg0 < 0 || arg3 >= 104 || arg0 >= 104) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 > 0 && class278.field4548[arg4][arg3 - 1][arg0] != 0) {
                class278.field4548[arg4][arg3][arg0] = class278.field4548[arg4][arg3 - 1][arg0];
            } else if (arg0 > 0 && class278.field4548[arg4][arg3][arg0 - 1] != 0) {
                class278.field4548[arg4][arg3][arg0] = class278.field4548[arg4][arg3][arg0 - 1];
            } else if (arg3 > 0 && arg0 > 0 && class278.field4548[arg4][arg3 - 1][arg0 - 1] != 0) {
                class278.field4548[arg4][arg3][arg0] = class278.field4548[arg4][arg3 - 1][arg0 - 1];
            }
        } else if (arg3 > 0 && class278.field4548[arg4 - 1][arg3 - 1][arg0] != class278.field4548[arg4][arg3 - 1][arg0]) {
            class278.field4548[arg4][arg3][arg0] = class278.field4548[arg4][arg3 - 1][arg0];
        } else if (arg0 > 0 && class278.field4548[arg4 - 1][arg3][arg0 - 1] != class278.field4548[arg4][arg3][arg0 - 1]) {
            class278.field4548[arg4][arg3][arg0] = class278.field4548[arg4][arg3][arg0 - 1];
        } else if (arg3 > 0 && arg0 > 0 && class278.field4548[arg4 - 1][arg3 - 1][arg0 - 1] != class278.field4548[arg4][arg3 - 1][arg0 - 1]) {
            class278.field4548[arg4][arg3][arg0] = class278.field4548[arg4][arg3 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB[I)Lgi;", line = 302)
    public final class291 method936(int arg0, byte arg1, int[] arg2) {
        field1994++;
        if (this.field1984.method477((byte) 105) == 1) {
            return this.method932(arg2, arg0, false, 0);
        } else if (this.field1984.method481(17377, arg0) == 1) {
            return this.method932(arg2, 0, false, arg0);
        } else if (arg1 < 108) {
            return (class291) null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[II)Lgi;", line = 335)
    public final class291 method937(int arg0, int[] arg1, int arg2) {
        field1992++;
        if (arg0 != 16649) {
            return (class291) null;
        } else if (this.field1985.method477((byte) 55) == 1) {
            return this.method938(0, arg2, arg1, -109);
        } else if (this.field1985.method481(arg0 ^ 0x2E8, arg2) == 1) {
            return this.method938(arg2, 0, arg1, -106);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[II)Lgi;", line = 359)
    private final class291 method938(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFFA) ^ arg1;
        int var6 = var5 | arg0 << 16;
        field1987++;
        long var7 = (long) var6;
        class291 var9 = (class291) this.field1996.method617(var7, false);
        if (arg3 > -102) {
            return (class291) null;
        } else if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class49 var10 = class49.method347(this.field1985, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class291 var11 = var10.method349();
            this.field1996.method610(92, var11, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field4719.length;
            }
            return var11;
        } else {
            return null;
        }
    }
}
