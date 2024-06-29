import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class7 extends class263 {

    @OriginalMember(owner = "client!kh", name = "Db", descriptor = "Ljava/lang/String;")
    public static String field40 = "";

    @OriginalMember(owner = "client!kh", name = "Nb", descriptor = "[J")
    public static long[] field50 = new long[200];

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!kh", name = "Bb", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!kh", name = "Eb", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!kh", name = "Fb", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!kh", name = "Gb", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!kh", name = "Hb", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!kh", name = "Ib", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!kh", name = "Jb", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!kh", name = "Mb", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!kh", name = "Ob", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!kh", name = "Qb", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!kh", name = "Rb", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!kh", name = "Cb", descriptor = "Lga;")
    private class170 field39;

    @OriginalMember(owner = "client!kh", name = "Lb", descriptor = "Lbf;")
    public static class227 field48;

    @OriginalMember(owner = "client!kh", name = "Pb", descriptor = "Lea;")
    public static class235 field52;

    @OriginalMember(owner = "client!kh", name = "Kb", descriptor = "Lvb;")
    public static class76 field47;

    @OriginalMember(owner = "client!kh", name = "Ab", descriptor = "[I")
    public static int[] field37;

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V", line = 9)
    public class7(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLjava/lang/StringBuffer;CI)Ljava/lang/StringBuffer;", line = 13)
    public static final StringBuffer method18(byte arg0, StringBuffer arg1, char arg2, int arg3) {
        field51++;
        int var4 = arg1.length();
        if (arg0 != -17) {
            return (StringBuffer) null;
        }
        arg1.setLength(arg3);
        for (int var5 = var4; var5 < arg3; var5++) {
            arg1.setCharAt(var5, arg2);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)I", line = 34)
    public static final int method19(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 23674) {
            method22(-35);
        }
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        field42++;
        return (arg2 >> 5 << 7) + (arg0 >> 2 << 10) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "(B)I", line = 68)
    public final int method20(byte arg0) {
        field53++;
        if (arg0 != -17) {
            field47 = (class76) null;
        }
        return this.field3986[this.field4025++] - this.field39.method1191((byte) 124) & 0xFF;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I[I)V", line = 80)
    public final void method21(int arg0, int[] arg1) {
        if (arg0 != -507079229) {
            field48 = (class227) null;
        }
        this.field39 = new class170(arg1);
        field38++;
    }

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "(I)V", line = 91)
    public static void method22(int arg0) {
        field37 = null;
        field48 = null;
        field47 = null;
        field40 = null;
        field52 = null;
        field50 = null;
        if (arg0 <= 108) {
            field47 = (class76) null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[BB)V", line = 117)
    public final void method23(int arg0, int arg1, byte[] arg2, byte arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg2[var5 + arg0] = (byte) (this.field3986[this.field4025++] - this.field39.method1191((byte) 106));
        }
        if (arg3 > -87) {
            this.method20((byte) -127);
        }
        field46++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)I", line = 141)
    public final int method24(byte arg0, int arg1) {
        int var3 = this.field41 >> 3;
        int var4 = 0;
        field54++;
        int var5 = 8 - (this.field41 & 0x7);
        this.field41 += arg1;
        if (arg0 != -122) {
            field48 = (class227) null;
        }
        while (var5 < arg1) {
            var4 += (class236.field3546[var5] & this.field3986[var3++]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg1 == var5) {
            var6 = (this.field3986[var3] & class236.field3546[var5]) + var4;
        } else {
            var6 = (this.field3986[var3] >> var5 - arg1 & class236.field3546[arg1]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "(B)V", line = 176)
    public final void method25(byte arg0) {
        this.field41 = this.field4025 * 8;
        field45++;
        if (arg0 != 7) {
            this.method26(-35, -120);
        }
    }

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "(II)I", line = 190)
    public final int method26(int arg0, int arg1) {
        field36++;
        return arg1 == -11394 ? arg0 * 8 - this.field41 : 105;
    }

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "(B)V", line = 201)
    public final void method27(byte arg0) {
        field43++;
        if (arg0 != 0) {
            method22(-92);
        }
        this.field4025 = (this.field41 + 7) / 8;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)V", line = 213)
    public final void method28(int arg0, boolean arg1) {
        this.field3986[this.field4025++] = (byte) (this.field39.method1191((byte) 116) + arg0);
        field49++;
        if (arg1) {
            this.field39 = (class170) null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZBI)Ljava/lang/String;", line = 224)
    public static final String method29(int arg0, boolean arg1, byte arg2, int arg3) {
        field44++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg1 && arg0 >= 0) {
            int var4 = arg0 / arg3;
            if (arg2 <= 72) {
                method19(-101, -112, 38, -76);
            }
            int var5 = 2;
            while (var4 != 0) {
                var5++;
                var4 /= arg3;
            }
            char[] var6 = new char[var5];
            var6[0] = '+';
            for (int var7 = var5 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg3;
                int var9 = var8 - (arg0 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg3);
        }
    }
}
