import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class240 extends class310 {

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
    private int field3957 = 0;

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
    private int field3953 = 0;

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
    private int field3963 = 0;

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "I")
    public static int field3954 = 0;

    @OriginalMember(owner = "client!bn", name = "U", descriptor = "[I")
    public static int[] field3962 = new int[50];

    @OriginalMember(owner = "client!bn", name = "fb", descriptor = "I")
    public static int field3973 = 0;

    @OriginalMember(owner = "client!bn", name = "eb", descriptor = "[Z")
    public static boolean[] field3972 = new boolean[112];

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
    private int field3956;

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
    private int field3958;

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
    private int field3960;

    @OriginalMember(owner = "client!bn", name = "X", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!bn", name = "Y", descriptor = "I")
    private int field3966;

    @OriginalMember(owner = "client!bn", name = "Z", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!bn", name = "ab", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!bn", name = "bb", descriptor = "I")
    private int field3969;

    @OriginalMember(owner = "client!bn", name = "cb", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!bn", name = "db", descriptor = "I")
    private int field3971;

    @OriginalMember(owner = "client!bn", name = "gb", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!bn", name = "hb", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!bn", name = "T", descriptor = "[Lml;")
    public static class17[] field3961;

    @OriginalMember(owner = "client!bn", name = "W", descriptor = "[Lml;")
    public static class17[] field3964;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 7)
    public static final int method1826(String arg0, int arg1) {
        field3975++;
        if (arg1 != -1) {
            method1827(-113, (class145) null);
        }
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class38.field570; var2++) {
            if (arg0.equalsIgnoreCase(class241.field3986[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILna;)[Lbo;", line = 36)
    public static final class16[] method1827(int arg0, class145 arg1) {
        field3967++;
        if (!arg1.method1129((byte) -88)) {
            return new class16[0];
        }
        class192 var2 = arg1.method1133((byte) 74);
        while (var2.field3064 == 0) {
            class283.method2076((byte) -114, 10L);
        }
        if (arg0 != -2) {
            method1827(-26, (class145) null);
        }
        if (var2.field3064 == 2) {
            return new class16[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field3066);
        class16[] var4 = new class16[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class16 var6 = new class16();
            var4[var5] = var6;
            var6.field182 = var3[var5 << 2];
            var6.field183 = var3[(var5 << 2) + 1];
            var6.field188 = var3[(var5 << 2) + 2];
            var6.field180 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lqm;II)V", line = 78)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field3970++;
        if (arg1 != -2470) {
            this.field3953 = 94;
        }
        if (arg2 == 0) {
            this.field3963 = arg0.method1769(-30726);
        } else if (arg2 == 1) {
            this.field3957 = (arg0.method1733(arg1 ^ 0xFFFFF65A) << 12) / 100;
        } else if (arg2 == 2) {
            this.field3953 = (arg0.method1733(0) << 12) / 100;
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(II)V", line = 121)
    public static final void method1828(int arg0, int arg1) {
        field3965++;
        if (arg1 == -1 || !class278.method2058(arg1, (byte) 4)) {
            return;
        }
        class250[] var2 = class163.field2587[arg1];
        if (arg0 != -13043) {
            field3954 = 34;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class250 var4 = var2[var3];
            if (var4.field4235 != null) {
                class40 var5 = new class40();
                var5.field593 = var4;
                var5.field581 = var4.field4235;
                class11.method51((byte) -61, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 326)
    public class240() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)V", line = 172)
    public static final void method1829(int arg0, int arg1, int arg2, int arg3) {
        field3968++;
        class321 var4 = class46.method370(9, (byte) -106, arg3);
        var4.method2265(false);
        var4.field5109 = arg2;
        if (arg1 <= 97) {
            method1827(-97, (class145) null);
        }
        var4.field5112 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZ)[[I", line = 189)
    public final int[][] method391(int arg0, boolean arg1) {
        field3974++;
        int[][] var3 = this.field4942.method10((byte) -116, arg0);
        if (this.field4942.field30) {
            int[][] var4 = this.method2199(21101, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var4[0];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class261.field4405; var11++) {
                this.method1830(var8[var11], var5[var11], var9[var11], 63);
                this.field3960 += this.field3957;
                this.field3956 += this.field3953;
                if (this.field3960 < 0) {
                    this.field3960 = 0;
                }
                if (this.field3956 < 0) {
                    this.field3956 = 0;
                }
                for (this.field3958 += this.field3963; this.field3958 < 0; this.field3958 += 4096) {
                }
                if (this.field3960 > 4096) {
                    this.field3960 = 4096;
                }
                if (this.field3956 > 4096) {
                    this.field3956 = 4096;
                }
                while (this.field3958 > 4096) {
                    this.field3958 -= 4096;
                }
                this.method1833(this.field3958, (byte) 126, this.field3960, this.field3956);
                var10[var11] = this.field3969;
                var7[var11] = this.field3966;
                var6[var11] = this.field3971;
            }
        }
        if (!arg1) {
            field3962 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(IIII)V", line = 259)
    private final void method1830(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 <= arg1 ? arg1 : arg2;
        if (arg3 != 63) {
            field3961 = (class17[]) null;
        }
        field3955++;
        int var6 = var5 < arg0 ? arg0 : var5;
        int var7 = arg2 < arg1 ? arg2 : arg1;
        int var8 = arg0 >= var7 ? var7 : arg0;
        this.field3956 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (this.field3956 > 0 && this.field3956 < 4096) {
            this.field3960 = (var9 << 12) / (this.field3956 > 2048 ? 8192 - (this.field3956 * 2) : this.field3956 * 2);
        } else {
            this.field3960 = 0;
        }
        if (var9 <= 0) {
            this.field3958 = 0;
            return;
        }
        int var10 = (var6 - arg2 << 12) / var9;
        int var11 = (var6 - arg0 << 12) / var9;
        int var12 = (var6 - arg1 << 12) / var9;
        if (arg2 == var6) {
            this.field3958 = arg1 == var8 ? var11 + 20480 : -var12 + 4096;
        } else if (arg1 == var6) {
            this.field3958 = arg0 == var8 ? var10 + 4096 : -var11 + 12288;
        } else {
            this.field3958 = arg2 == var8 ? var12 + 12288 : 20480 - var10;
        }
        this.field3958 /= 6;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V", line = 312)
    public static void method1831(int arg0) {
        field3972 = null;
        field3962 = null;
        field3961 = null;
        field3964 = null;
        if (arg0 < 83) {
            method1831(-106);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)C", line = 331)
    public static final char method1832(byte arg0, int arg1) {
        if (arg1 != 15218) {
            field3973 = -27;
        }
        field3952++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class70.field1230[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBII)V", line = 363)
    private final void method1833(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 104) {
            return;
        }
        field3959++;
        int var5 = arg3 <= 2048 ? (arg2 + 4096) * arg3 >> 12 : arg2 + arg3 - (arg2 * arg3 >> 12);
        if (var5 <= 0) {
            this.field3969 = this.field3966 = this.field3971 = arg3;
            return;
        }
        int var6 = arg0 * 6;
        int var7 = arg3 + arg3 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var10 = var6 - (var9 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var9 == 0) {
            this.field3971 = var7;
            this.field3969 = var5;
            this.field3966 = var14;
        } else if (var9 == 1) {
            this.field3966 = var5;
            this.field3969 = var15;
            this.field3971 = var7;
        } else if (var9 == 2) {
            this.field3966 = var5;
            this.field3971 = var14;
            this.field3969 = var7;
        } else if (var9 == 3) {
            this.field3971 = var5;
            this.field3969 = var7;
            this.field3966 = var15;
        } else if (var9 == 4) {
            this.field3969 = var14;
            this.field3971 = var5;
            this.field3966 = var7;
        } else if (var9 == 5) {
            this.field3969 = var5;
            this.field3966 = var7;
            this.field3971 = var15;
        }
    }
}
