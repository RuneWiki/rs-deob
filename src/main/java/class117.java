import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class117 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public int field1973 = -1;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "[I")
    private int[] field1987 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Z")
    public boolean field1979 = false;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lwa;")
    private static class75 field1975 = class66.method560("Loaded textures", false);

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Lwa;")
    public static class75 field1988 = field1975;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Lqa;")
    public static class121 field1990 = new class121();

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field1991 = -1;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[I")
    private int[] field1976;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "[S")
    private short[] field1982;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "[S")
    private short[] field1984;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "[S")
    private short[] field1986;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "[S")
    private short[] field1989;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Z", line = 15)
    public final boolean method890(int arg0) {
        field1985++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1987[var3] != -1 && !class66.field1138.method1900((byte) 125, this.field1987[var3], 0)) {
                var2 = false;
            }
        }
        if (arg0 >= -122) {
            field1991 = 15;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 43)
    public static void method891(int arg0) {
        field1975 = null;
        int var1 = 120 % ((arg0 + 41) / 61);
        field1988 = null;
        field1990 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lja;I)V", line = 55)
    public final void method892(class60 arg0, int arg1) {
        field1972++;
        if (arg1 > -46) {
            field1993 = -1;
        }
        while (true) {
            int var3 = arg0.method501(0);
            if (var3 == 0) {
                return;
            }
            this.method898(var3, (byte) -91, arg0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIII)V", line = 77)
    public static final void method893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 0) {
            field1990 = (class121) null;
        }
        if (class294.field5041 >= arg1 && arg0 >= class90.field1495) {
            boolean var6;
            if (arg2 < class153.field2635) {
                arg2 = class153.field2635;
                var6 = false;
            } else if (class288.field4956 >= arg2) {
                var6 = true;
            } else {
                arg2 = class288.field4956;
                var6 = false;
            }
            boolean var7;
            if (class153.field2635 > arg5) {
                arg5 = class153.field2635;
                var7 = false;
            } else if (arg5 > class288.field4956) {
                var7 = false;
                arg5 = class288.field4956;
            } else {
                var7 = true;
            }
            if (arg1 < class90.field1495) {
                arg1 = class90.field1495;
            } else {
                class150.method1151(7, class63.field1096[arg1++], arg2, arg3, arg5);
            }
            if (arg0 > class294.field5041) {
                arg0 = class294.field5041;
            } else {
                class150.method1151(7, class63.field1096[arg0--], arg2, arg3, arg5);
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg0; var8++) {
                    int[] var9 = class63.field1096[var8];
                    var9[arg2] = var9[arg5] = arg3;
                }
            } else if (var6) {
                for (int var10 = arg1; var10 <= arg0; var10++) {
                    class63.field1096[var10][arg2] = arg3;
                }
            } else if (var7) {
                for (int var11 = arg1; var11 <= arg0; var11++) {
                    class63.field1096[var11][arg5] = arg3;
                }
            }
        }
        field1980++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)Lll;", line = 180)
    public final class146 method894(byte arg0) {
        field1974++;
        int var2 = 0;
        class146[] var3 = new class146[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1987[var4] != -1) {
                var3[var2++] = class146.method1127(class66.field1138, this.field1987[var4], 0);
            }
        }
        class146 var5 = new class146(var3, var2);
        if (this.field1986 != null) {
            for (int var6 = 0; var6 < this.field1986.length; var6++) {
                var5.method1117(this.field1986[var6], this.field1984[var6]);
            }
        }
        if (this.field1989 != null) {
            for (int var7 = 0; var7 < this.field1989.length; var7++) {
                var5.method1124(this.field1989[var7], this.field1982[var7]);
            }
        }
        if (arg0 >= -1) {
            field1988 = (class75) null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)Lll;", line = 245)
    public final class146 method895(int arg0) {
        field1983++;
        if (this.field1976 == null) {
            return null;
        }
        class146[] var2 = new class146[this.field1976.length];
        for (int var3 = 0; var3 < this.field1976.length; var3++) {
            var2[var3] = class146.method1127(class66.field1138, this.field1976[var3], 0);
        }
        if (arg0 < 108) {
            this.method895(69);
        }
        class146 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class146(var2, var2.length);
        }
        if (this.field1986 != null) {
            for (int var5 = 0; var5 < this.field1986.length; var5++) {
                var4.method1117(this.field1986[var5], this.field1984[var5]);
            }
        }
        if (this.field1989 != null) {
            for (int var6 = 0; var6 < this.field1989.length; var6++) {
                var4.method1124(this.field1989[var6], this.field1982[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Lja;I)V", line = 303)
    public static final void method896(class60 arg0, int arg1) {
        int var2 = -29 % ((73 - arg1) / 36);
        if (class34.field493 != null) {
            try {
                class34.field493.method260(0L, -30524);
                class34.field493.method263(107, 24, arg0.field1012, arg0.field997);
            } catch (Exception var4) {
            }
        }
        field1978++;
        arg0.field1012 += 24;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)Z", line = 322)
    public final boolean method897(int arg0) {
        field1977++;
        if (this.field1976 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1976.length; var3++) {
            if (!class66.field1138.method1900((byte) 108, this.field1976[var3], 0)) {
                var2 = false;
            }
        }
        if (arg0 < 110) {
            field1992 = 75;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBLja;)V", line = 375)
    private final void method898(int arg0, byte arg1, class60 arg2) {
        field1971++;
        if (arg1 > -25) {
            this.field1984 = (short[]) null;
        }
        if (arg0 == 1) {
            this.field1973 = arg2.method501(0);
        } else if (arg0 == 2) {
            int var4 = arg2.method501(0);
            this.field1976 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1976[var5] = arg2.method485((byte) -2);
            }
        } else if (arg0 == 3) {
            this.field1979 = true;
        } else if (arg0 == 40) {
            int var8 = arg2.method501(0);
            this.field1986 = new short[var8];
            this.field1984 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1986[var9] = (short) arg2.method485((byte) -2);
                this.field1984[var9] = (short) arg2.method485((byte) -2);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method501(0);
            this.field1982 = new short[var6];
            this.field1989 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1989[var7] = (short) arg2.method485((byte) -2);
                this.field1982[var7] = (short) arg2.method485((byte) -2);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1987[arg0 - 60] = arg2.method485((byte) -2);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILcb;BI)[Lqj;", line = 452)
    public static final class238[] method899(int arg0, class267 arg1, byte arg2, int arg3) {
        field1981++;
        if (class281.method1994(arg3, (byte) -7, arg0, arg1)) {
            if (arg2 > -115) {
                field1990 = (class121) null;
            }
            return class226.method1658((byte) -128);
        } else {
            return null;
        }
    }
}
