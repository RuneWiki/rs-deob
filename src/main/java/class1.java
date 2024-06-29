import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 implements class56 {

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
    private boolean field21 = true;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "La;")
    private static class1 field37 = class113.method934(-11538, "Private chat");

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public static int field36 = 0;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "La;")
    public static class1 field23 = class113.method934(-11538, "scrollbar");

    @OriginalMember(owner = "client!a", name = "S", descriptor = "La;")
    private static class1 field45 = class113.method934(-11538, "purple:");

    @OriginalMember(owner = "client!a", name = "W", descriptor = "La;")
    public static class1 field49 = field37;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "La;")
    public static class1 field48 = class113.method934(-11538, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!a", name = "jb", descriptor = "La;")
    public static class1 field62 = class113.method934(-11538, "chatback");

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "I")
    public static int field57 = 50;

    @OriginalMember(owner = "client!a", name = "kb", descriptor = "La;")
    public static class1 field63 = field45;

    @OriginalMember(owner = "client!a", name = "gb", descriptor = "La;")
    public static class1 field59 = class113.method934(-11538, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "[I")
    public static int[] field52 = new int[128];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    private int field42;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!a", name = "db", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!a", name = "fb", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "hb", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "Lbd;")
    public static class11 field51;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lwc;")
    public static class134 field11;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "Lcb;")
    public static class15 field30;

    // $FF: synthetic field
    @OriginalMember(owner = "client!a", name = "lb", descriptor = "Ljava/lang/Class;")
    public static Class field64;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "[B")
    public byte[] field38;

    @OriginalMember(owner = "client!a", name = "ib", descriptor = "[[B")
    public static byte[][] field61;

    // $FF: synthetic method
    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method41(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)La;", line = 8)
    public final class1 method1(byte arg0, int arg1) {
        field4++;
        if (arg0 != 95) {
            field36 = 126;
        }
        return this.method19(arg0 - 95, arg1, this.field26);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[BII)I", line = 21)
    public final int method2(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class33.method393(this.field38, arg0, arg2, arg3, arg1 - arg0);
        if (arg4 != -40) {
            this.method29(68, -2);
        }
        field20++;
        return arg1 - arg0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)I", line = 36)
    public final int method3(byte arg0) {
        field41++;
        if (arg0 != -34) {
            field37 = null;
        }
        return this.method39(false, 10);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)La;", line = 56)
    public final class1 method4(int arg0) {
        field8++;
        class1 var2 = new class1();
        var2.field26 = this.field26;
        var2.field38 = new byte[this.field26];
        boolean var3 = true;
        if (arg0 != -16315) {
            this.method40(false);
        }
        for (int var4 = 0; var4 < this.field26; var4++) {
            byte var5 = this.field38[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = false;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (!var3) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = false;
            }
            var2.field38[var4] = var5;
            if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = true;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(La;I)Z", line = 110)
    public final boolean method5(class1 arg0, int arg1) {
        field53++;
        if (arg0 == null) {
            return false;
        } else if (this.field26 == arg0.field26) {
            if (arg1 != 122) {
                field36 = -114;
            }
            if (!this.field21 || !arg0.field21) {
                if (this.field42 == 0) {
                    this.field42 = this.method27((byte) 41);
                    if (this.field42 == 0) {
                        this.field42 = 1;
                    }
                }
                if (arg0.field42 == 0) {
                    arg0.field42 = arg0.method27((byte) 41);
                    if (arg0.field42 == 0) {
                        arg0.field42 = 1;
                    }
                }
                if (this.field42 != arg0.field42) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field26; var3++) {
                if (this.field38[var3] != arg0.field38[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)I", line = 169)
    public final int method6(int arg0, boolean arg1) {
        field13++;
        if (arg1) {
            this.method31(-9);
        }
        return this.field38[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ[BI)V", line = 180)
    public static final void method7(int arg0, boolean arg1, byte[] arg2, int arg3) {
        field25++;
        if (arg0 != 2037 || class9.field312 == null) {
            return;
        }
        if (class122.field3033 >= 0) {
            class9.field312.method306((byte) -96);
            class81.field2049 = 0;
            class2.field79 = null;
            class62.field1551 = 20;
            class122.field3033 = -1;
        }
        if (arg2 == null) {
            return;
        }
        if (class62.field1551 > 0) {
            class9.field312.method305(arg3, 0);
            class62.field1551 = 0;
        }
        class122.field3033 = arg3;
        class9.field312.method308(arg2, arg1, -15910, arg3);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(BI)I", line = 223)
    public final int method8(byte arg0, int arg1) {
        field46++;
        return arg0 == -5 ? this.method15(0, arg1, true) : -56;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)J", line = 237)
    public final long method9(byte arg0) {
        field24++;
        long var2 = 0L;
        for (int var4 = 0; this.field26 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field38[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        if (arg0 < 88) {
            this.method40(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I", line = 277)
    public final int method10(int arg0) {
        if (arg0 == -3136) {
            field39++;
            return this.field26;
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(La;I)I", line = 291)
    public final int method11(class1 arg0, int arg1) {
        if (arg1 == 32) {
            field3++;
            return this.method32(arg0, 0, true);
        } else {
            return 110;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)La;", line = 313)
    public final class1 method12(boolean arg0) {
        class1 var2 = new class1();
        field56++;
        var2.field26 = this.field26;
        var2.field38 = new byte[this.field26];
        int var3 = 0;
        if (arg0) {
            field59 = null;
        }
        while (this.field26 > var3) {
            var2.field38[var3] = 42;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)La;", line = 346)
    public final class1 method13(int arg0) {
        field22++;
        class1 var2 = new class1();
        if (arg0 != 57) {
            this.method26((byte) 100, null);
        }
        var2.field26 = 0;
        int var3 = 0;
        var2.field38 = new byte[12];
        for (int var4 = 0; var4 < this.field26; var4++) {
            if (this.field38[var4] >= 65 && this.field38[var4] <= 90) {
                var2.field38[var3++] = (byte) (this.field38[var4] + 97 - 65);
                var2.field26 = var3;
            } else if (this.field38[var4] >= 97 && this.field38[var4] <= 122 || this.field38[var4] >= 48 && this.field38[var4] <= 57) {
                var2.field38[var3++] = this.field38[var4];
                var2.field26 = var3;
            } else if (var3 > 0) {
                var2.field38[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(La;Z)Z", line = 397)
    public final boolean method14(class1 arg0, boolean arg1) {
        field58++;
        if (!arg1) {
            field59 = null;
        }
        if (arg0 == null) {
            return false;
        } else if (this.field26 == arg0.field26) {
            for (int var3 = 0; var3 < this.field26; var3++) {
                byte var4 = arg0.field38[var3];
                byte var5 = this.field38[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZ)I", line = 437)
    private final int method15(int arg0, int arg1, boolean arg2) {
        field35++;
        byte var4 = (byte) arg1;
        for (int var5 = arg0; var5 < this.field26; var5++) {
            if (this.field38[var5] == var4) {
                return var5;
            }
        }
        if (!arg2) {
            field49 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BIILjava/awt/Graphics;)V", line = 463)
    public final void method16(byte arg0, int arg1, int arg2, Graphics arg3) {
        String var5;
        try {
            var5 = new String(this.field38, 0, this.field26, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field38, 0, this.field26);
        }
        field6++;
        arg3.drawString(var5, arg1, arg2);
        int var6 = -3 % ((-arg0 - 81) / 41);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)La;", line = 486)
    public final class1 method17(int arg0) {
        long var2 = this.method37(1544463557);
        field27++;
        synchronized (field64 == null ? (field64 = method41("a")) : field64) {
            if (class74.field1798 == null) {
                class74.field1798 = new class48(4096);
            } else {
                for (class73 var5 = (class73) class74.field1798.method501(var2, 6120); var5 != null; var5 = (class73) class74.field1798.method503(arg0 ^ 0x2C11)) {
                    if (this.method5(var5.field1784, 122)) {
                        return var5.field1784;
                    }
                }
            }
            class73 var7 = new class73();
            if (arg0 != 11370) {
                field11 = null;
            }
            this.field21 = false;
            var7.field1784 = this;
            class74.field1798.method500(var7, (byte) -117, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!a", name = "hashCode", descriptor = "()I", line = 530)
    public final int hashCode() {
        field15++;
        return this.method27((byte) 41);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z", line = 546)
    private final boolean method18(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        if (arg0 != 90) {
            this.method15(112, 37, true);
        }
        boolean var3 = false;
        field50++;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field26; var6++) {
            int var7 = this.field38[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (arg1 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)La;", line = 622)
    public final class1 method19(int arg0, int arg1, int arg2) {
        field29++;
        if (arg0 != 0) {
            return null;
        }
        class1 var4 = new class1();
        var4.field38 = new byte[arg2 - arg1];
        var4.field26 = arg2 - arg1;
        class33.method393(this.field38, arg1, var4.field38, 0, var4.field26);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(La;II)La;", line = 638)
    public final class1 method20(class1 arg0, int arg1, int arg2) {
        field9++;
        if (!this.field21) {
            throw new IllegalArgumentException();
        }
        if (arg1 != 16039) {
            this.method9((byte) -74);
        }
        if (arg2 > this.field26) {
            throw new IllegalArgumentException();
        }
        this.field42 = 0;
        if (arg0.field26 + arg2 > this.field38.length) {
            int var4;
            for (var4 = 1; var4 < arg0.field26 + arg2; var4 += var4) {
            }
            byte[] var5 = new byte[var4];
            class33.method393(this.field38, 0, var5, 0, this.field26);
            this.field38 = var5;
        }
        class33.method393(arg0.field38, 0, this.field38, arg2, arg0.field26);
        if (this.field26 < arg2 + arg0.field26) {
            this.field26 = arg0.field26 + arg2;
        }
        return this;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)La;", line = 685)
    public final class1 method21(int arg0, int arg1) {
        field47++;
        if (arg0 <= arg1 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class1 var3 = new class1();
        var3.field38 = new byte[this.field26 + 1];
        var3.field26 = this.field26 + 1;
        class33.method393(this.field38, 0, var3.field38, 0, this.field26);
        var3.field38[this.field26] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V", line = 712)
    public static final void method22(int arg0) {
        class6.field234 = 0;
        int var1 = (class104.field2624.field1975 >> 7) + class28.field807;
        int var2 = (class104.field2624.field1966 >> 7) + class53.field1411;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class6.field234 = 1;
        }
        field44++;
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class6.field234 = 1;
        }
        if (class6.field234 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class6.field234 = 0;
        }
        int var3 = 74 / ((arg0 - 42) / 38);
    }

    @OriginalMember(owner = "client!a", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 743)
    public final boolean equals(Object arg0) {
        field12++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(La;B)La;", line = 756)
    public final class1 method23(class1 arg0, byte arg1) {
        field31++;
        if (!this.field21) {
            throw new IllegalArgumentException();
        }
        this.field42 = 0;
        if (this.field26 + arg0.field26 > this.field38.length) {
            int var3;
            for (var3 = 1; var3 < this.field26 + arg0.field26; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class33.method393(this.field38, 0, var4, 0, this.field26);
            this.field38 = var4;
        }
        class33.method393(arg0.field38, 0, this.field38, this.field26, arg0.field26);
        this.field26 += arg0.field26;
        return arg1 == -87 ? this : null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 791)
    public final int method24(int arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field38, 0, this.field26, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field38, 0, this.field26);
        }
        if (arg0 > -6) {
            return 68;
        } else {
            field10++;
            return arg1.stringWidth(var3);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILbd;III)[B", line = 824)
    public static final byte[] method25(int arg0, class11 arg1, int arg2, int arg3, int arg4) {
        field32++;
        if (arg3 >= -98) {
            method34((byte) -1);
        }
        long var5 = ((long) arg4 << 32) + (long) (arg2 * 37 + arg0 & 0xFFFF) + (long) (arg2 << 16);
        if (field30 != null) {
            class46 var7 = (class46) field30.method264(var5, (byte) 85);
            if (var7 != null) {
                return var7.field1200;
            }
        }
        byte[] var8 = arg1.method218(arg0, 112, arg2);
        if (var8 == null) {
            return null;
        } else {
            if (field30 != null) {
                field30.method263(-7208, var5, new class46(var8));
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLa;)Z", line = 860)
    public final boolean method26(byte arg0, class1 arg1) {
        field55++;
        if (arg1.field26 > this.field26) {
            return false;
        } else if (arg0 == 116) {
            for (int var3 = 0; var3 < arg1.field26; var3++) {
                if (this.field38[var3] != arg1.field38[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)I", line = 888)
    public final int method27(byte arg0) {
        if (arg0 != 41) {
            field51 = null;
        }
        field17++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field26; var3++) {
            var2 = (var2 << 5) + (this.field38[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(B)La;", line = 910)
    public final class1 method28(byte arg0) {
        field54++;
        if (!this.field21) {
            throw new IllegalArgumentException();
        }
        this.field42 = 0;
        int var2 = 77 % ((arg0 - 32) / 55);
        if (this.field38.length != this.field26) {
            byte[] var3 = new byte[this.field26];
            class33.method393(this.field38, 0, var3, 0, this.field26);
            this.field38 = var3;
        }
        return this;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)La;", line = 938)
    public final class1 method29(int arg0, int arg1) {
        field60++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field21) {
            this.field42 = 0;
            if (this.field38.length == this.field26) {
                int var3;
                for (var3 = 1; var3 <= this.field26; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class33.method393(this.field38, 0, var4, 0, this.field26);
                this.field38 = var4;
            }
            this.field38[this.field26++] = (byte) arg1;
            return arg0 > -21 ? null : this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)La;", line = 983)
    public final class1 method30(int arg0) {
        field7++;
        class1 var2 = new class1();
        var2.field26 = this.field26;
        var2.field38 = new byte[this.field26];
        for (int var3 = 0; var3 < this.field26; var3++) {
            byte var4 = this.field38[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field38[var3] = var4;
        }
        if (arg0 >= -127) {
            field37 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)[B", line = 1019)
    public final byte[] method31(int arg0) {
        if (arg0 != 0) {
            this.method20(null, -108, -121);
        }
        byte[] var2 = new byte[this.field26];
        class33.method393(this.field38, 0, var2, 0, this.field26);
        field34++;
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(La;IZ)I", line = 1039)
    private final int method32(class1 arg0, int arg1, boolean arg2) {
        field28++;
        int[] var4 = new int[arg0.field26];
        int[] var5 = new int[arg0.field26];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg0.field26;
        }
        if (!arg2) {
            field37 = null;
        }
        for (int var8 = 1; var8 <= arg0.field26; var8++) {
            var4[var8 - 1] = (arg0.field26 << 1) - var8;
            var6[class132.method1034(arg0.field38[var8 - 1], 255)] = arg0.field26 - var8;
        }
        int var9 = arg0.field26 + 1;
        for (int var10 = arg0.field26; var10 > 0; var10--) {
            var5[var10 - 1] = var9;
            while (arg0.field26 >= var9 && arg0.field38[var9 - 1] != arg0.field38[var10 - 1]) {
                if (arg0.field26 - var10 <= var4[var9 - 1]) {
                    var4[var9 - 1] = arg0.field26 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = arg0.field26 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        for (int var15 = 1; var15 <= var12; var15++) {
            var5[var15 - 1] = var14;
            while (var14 >= 1 && arg0.field38[var14 - 1] != arg0.field38[var15 - 1]) {
                var14 = var5[var14 - 1];
            }
            var14++;
        }
        while (var11 < arg0.field26) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var11 + arg0.field26 - var18 <= var4[var18 + -1]) {
                    var4[var18 - 1] = arg0.field26 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var5[var12 + -1];
            var12 = var5[var12 - 1];
        }
        int var17;
        for (int var16 = arg0.field26 + arg1 - 1; var16 < this.field26; var16 += Math.max(var6[this.field38[var16] & 0xFF], var4[var17])) {
            for (var17 = arg0.field26 - 1; var17 >= 0 && this.field38[var16] == arg0.field38[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(I)Z", line = 1152)
    public final boolean method33(int arg0) {
        if (arg0 < 101) {
            field14 = 12;
        }
        field43++;
        return this.method18(90, 10);
    }

    @OriginalMember(owner = "client!a", name = "toString", descriptor = "()Ljava/lang/String;", line = 1164)
    public final String toString() {
        field18++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(B)V", line = 1174)
    public static void method34(byte arg0) {
        field30 = null;
        field59 = null;
        field61 = null;
        field23 = null;
        field51 = null;
        field48 = null;
        field63 = null;
        if (arg0 < 111) {
            field61 = null;
        }
        field11 = null;
        field45 = null;
        field62 = null;
        field37 = null;
        field49 = null;
        field52 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(La;B)I", line = 1200)
    public final int method35(class1 arg0, byte arg1) {
        int var3;
        if (arg0.field26 >= this.field26) {
            var3 = this.field26;
        } else {
            var3 = arg0.field26;
        }
        field33++;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0.field38[var4] > this.field38[var4]) {
                return -1;
            }
            if (this.field38[var4] > arg0.field38[var4]) {
                return 1;
            }
        }
        if (arg1 < 75) {
            this.method29(8, -101);
        }
        if (this.field26 < arg0.field26) {
            return -1;
        } else if (arg0.field26 < this.field26) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!a", name = "i", descriptor = "(I)La;", line = 1242)
    public final class1 method36(int arg0) {
        field2++;
        boolean var2 = true;
        class1 var3 = new class1();
        var3.field26 = this.field26;
        var3.field38 = new byte[this.field26];
        if (arg0 != -4305) {
            field52 = null;
        }
        for (int var4 = 0; var4 < this.field26; var4++) {
            byte var5 = this.field38[var4];
            if (var5 == 95) {
                var3.field38[var4] = 32;
                var2 = true;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var2 = false;
                var3.field38[var4] = (byte) (var5 - 32);
            } else {
                var3.field38[var4] = var5;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "j", descriptor = "(I)J", line = 1310)
    private final long method37(int arg0) {
        field40++;
        long var2 = 0L;
        if (arg0 != 1544463557) {
            field61 = null;
        }
        for (int var4 = 0; var4 < this.field26; var4++) {
            var2 = (var2 << 5) + (long) (this.field38[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILa;)Z", line = 1334)
    public final boolean method38(int arg0, class1 arg1) {
        field1++;
        if (arg1.field26 > this.field26) {
            return false;
        }
        if (arg0 <= 62) {
            this.method33(-116);
        }
        int var3 = this.field26 - arg1.field26;
        for (int var4 = 0; var4 < arg1.field26; var4++) {
            if (this.field38[var3 + var4] != arg1.field38[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)I", line = 1365)
    private final int method39(boolean arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        field16++;
        boolean var4 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field26; var6++) {
            int var7 = this.field38[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var4 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var3 = true;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)La;", line = 1470)
    public final class1 method40(boolean arg0) {
        field5++;
        int var2 = 0;
        int var3 = this.field26;
        while (var2 < this.field26 && (this.field38[var2] >= 0 && this.field38[var2] <= 32 || (this.field38[var2] & 0xFF) == 160)) {
            var2++;
        }
        if (arg0) {
            field63 = null;
        }
        while (var3 > var2 && (this.field38[var3 - 1] >= 0 && this.field38[var3 - 1] <= 32 || (this.field38[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field26 == var3) {
            return this;
        }
        class1 var4 = new class1();
        var4.field26 = var3 - var2;
        var4.field38 = new byte[var4.field26];
        for (int var5 = 0; var5 < var4.field26; var5++) {
            var4.field38[var5] = this.field38[var2 + var5];
        }
        return var4;
    }
}
