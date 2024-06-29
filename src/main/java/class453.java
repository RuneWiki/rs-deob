import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class453 {

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    private int field6595 = 0;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "[Lob;")
    public class418[] field6583;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public int field6577;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "[I")
    public static int[] field6592 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "J")
    private long field6580;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "Lir;")
    public static class185 field6587;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lob;")
    private class418 field6575;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Lob;")
    private class418 field6594;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B[Lob;)I", line = 7)
    public final int method2811(byte arg0, class418[] arg1) {
        field6576++;
        int var3 = 0;
        int var4 = 0;
        if (arg0 != -110) {
            return -100;
        }
        while (var4 < this.field6577) {
            class418 var5 = this.field6583[var4];
            for (class418 var6 = var5.field6094; var6 != var5; var6 = var6.field6094) {
                arg1[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Lob;", line = 39)
    public final class418 method2812(int arg0) {
        if (arg0 != 15710) {
            field6587 = null;
        }
        field6581++;
        this.field6595 = 0;
        return this.method2819((byte) 104);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BZ)V", line = 52)
    public static final void method2813(byte arg0, boolean arg1) {
        class232.method1504(true, class233.field3246, class435.field6313, class357.field5298, arg1);
        field6585++;
        if (arg0 != -108) {
            field6587 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Ljava/lang/String;", line = 67)
    public static final String method2814(int arg0) {
        field6574++;
        String var1 = "www";
        if (class72.field1026 != 0) {
            var1 = "www-wtqa";
        }
        if (arg0 != -27903) {
            return null;
        }
        String var2 = "";
        if (class129.field1697 != null) {
            var2 = "/p=" + class129.field1697;
        }
        return class396.field5783 == 1 ? "http://" + var1 + ".stellardawn.com/l=" + class387.field5669 + "/a=" + class430.field6250 + var2 + "/" : "http://" + var1 + ".runescape.com/l=" + class387.field5669 + "/a=" + class430.field6250 + var2 + "/";
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IJLob;)V", line = 93)
    public final void method2815(int arg0, long arg1, class418 arg2) {
        field6582++;
        if (arg2.field6090 != null) {
            arg2.method2632(true);
        }
        class418 var5 = this.field6583[(int) ((long) (this.field6577 + arg0) & arg1)];
        arg2.field6094 = var5;
        arg2.field6090 = var5.field6090;
        arg2.field6090.field6094 = arg2;
        arg2.field6094.field6090 = arg2;
        arg2.field6091 = arg1;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Lrr;", line = 112)
    public static final class184 method2816(int arg0) {
        class389.field5693 = 0;
        field6589++;
        return arg0 == 1679 ? class212.method1402(4751) : null;
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)Lob;", line = 126)
    public final class418 method2817(int arg0) {
        field6578++;
        if (this.field6575 == null) {
            return null;
        }
        class418 var2 = this.field6583[(int) (this.field6580 & (long) (this.field6577 + arg0))];
        while (this.field6575 != var2) {
            if (this.field6575.field6091 == this.field6580) {
                class418 var3 = this.field6575;
                this.field6575 = this.field6575.field6094;
                return var3;
            }
            this.field6575 = this.field6575.field6094;
        }
        this.field6575 = null;
        return null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZIII)Lqg;", line = 154)
    public static final class335 method2818(boolean arg0, int arg1, int arg2, int arg3) {
        field6588++;
        int var4 = arg3 | arg2 << 8;
        class335 var5 = (class335) class144.field1827.method2348(112, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class266.field3954.method1234(class266.field3954.method1216(0, var4), (byte) 76);
        if (var6 == null) {
            int var8 = arg3 | arg1 + 65536 << 8;
            class335 var9 = (class335) class144.field1827.method2348(112, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class266.field3954.method1234(class266.field3954.method1216(0, var8), (byte) 76);
            if (!arg0) {
                return null;
            } else if (var10 == null) {
                int var12 = arg3 | 0xFFFF00;
                class335 var13 = (class335) class144.field1827.method2348(112, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class266.field3954.method1234(class266.field3954.method1216(0, var12), (byte) 76);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class335 var15 = class147.method1014(21, var14);
                    var15.field4973 = arg3;
                    class144.field1827.method2350(var15, (long) var12 << 16, -78);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class335 var11 = class147.method1014(21, var10);
                var11.field4973 = arg3;
                class144.field1827.method2350(var11, (long) var8 << 16, 45);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class335 var7 = class147.method1014(21, var6);
            var7.field4973 = arg3;
            class144.field1827.method2350(var7, (long) var4 << 16, -109);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(I)V", line = 222)
    public class453(int arg0) {
        this.field6583 = new class418[arg0];
        this.field6577 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class418 var3 = this.field6583[var2] = new class418();
            var3.field6094 = var3;
            var3.field6090 = var3;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)Lob;", line = 248)
    public final class418 method2819(byte arg0) {
        field6593++;
        if (arg0 < 77) {
            this.field6577 = -75;
        }
        if (this.field6595 > 0 && this.field6583[this.field6595 - 1] != this.field6594) {
            class418 var2 = this.field6594;
            this.field6594 = var2.field6094;
            return var2;
        }
        while (this.field6577 > this.field6595) {
            class418 var3 = this.field6583[this.field6595++].field6094;
            if (this.field6583[this.field6595 - 1] != var3) {
                this.field6594 = var3.field6094;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V", line = 285)
    public static void method2820(byte arg0) {
        if (arg0 == 45) {
            field6592 = null;
            field6587 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V", line = 296)
    public static final void method2821(int arg0, int arg1, int arg2) {
        int var3 = 105 % ((arg0 + 39) / 63);
        field6596++;
        class440 var4 = class186.method1241(arg2, 1, (byte) 56);
        var4.method2756(-1369656528);
        var4.field6375 = arg1;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)I", line = 312)
    public final int method2822(byte arg0) {
        if (arg0 != -73) {
            this.method2811((byte) -109, (class418[]) null);
        }
        field6597++;
        return this.field6577;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)Lhl;", line = 328)
    public static final class273 method2823(boolean arg0, int arg1) {
        field6579++;
        class273 var2 = (class273) class398.field5839.method378((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class435.field6307.method1235(29, false, arg1);
        class273 var4 = new class273();
        if (var3 != null) {
            var4.method1805(22433, new class341(var3), arg1);
        }
        class398.field5839.method367((long) arg1, var4, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(B)I", line = 355)
    public final int method2824(byte arg0) {
        if (arg0 < 73) {
            this.field6575 = null;
        }
        field6584++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field6577; var3++) {
            class418 var4 = this.field6583[var3];
            class418 var5 = var4.field6094;
            while (var4 != var5) {
                var5 = var5.field6094;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V", line = 386)
    public final void method2825(int arg0) {
        field6590++;
        for (int var2 = 0; var2 < this.field6577; var2++) {
            class418 var3 = this.field6583[var2];
            while (true) {
                class418 var4 = var3.field6094;
                if (var3 == var4) {
                    break;
                }
                var4.method2632(true);
            }
        }
        this.field6594 = null;
        this.field6575 = null;
        if (arg0 <= 10) {
            this.field6575 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZJ)Lob;", line = 418)
    public final class418 method2826(boolean arg0, long arg1) {
        if (arg0) {
            field6592 = null;
        }
        this.field6580 = arg1;
        field6591++;
        class418 var4 = this.field6583[(int) (arg1 & (long) (this.field6577 - 1))];
        for (this.field6575 = var4.field6094; this.field6575 != var4; this.field6575 = this.field6575.field6094) {
            if (this.field6575.field6091 == arg1) {
                class418 var5 = this.field6575;
                this.field6575 = this.field6575.field6094;
                return var5;
            }
        }
        this.field6575 = null;
        return null;
    }
}
