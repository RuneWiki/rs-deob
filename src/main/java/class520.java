import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class520 extends class219 {

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    private int field7434;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "[I")
    public static int[] field7436 = new int[5];

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "[Lu;")
    public class81[] field7432;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "[[B")
    private byte[][] field7429;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBIII)I", line = 8)
    public static final int method3027(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field7433++;
        if (arg1 != -62) {
            field7436 = null;
        }
        int var5 = arg4 & 0xF;
        int var6 = var5 >= 8 ? arg3 : arg0;
        int var7 = var5 < 4 ? arg3 : (var5 == 12 || var5 == 14 ? arg0 : arg2);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 25)
    public static void method3028(byte arg0) {
        field7436 = null;
        int var1 = 23 / ((arg0 + 19) / 37);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)Z", line = 34)
    public final boolean method3029(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field7435++;
            return this.field7432[arg1].field1077;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 45)
    public static final String method3030(byte arg0, long arg1) {
        field7437++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else if (arg0 == 65) {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class642.field9045[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)Z", line = 90)
    public final boolean method3031(byte arg0) {
        field7431++;
        if (this.field7432 != null) {
            return true;
        }
        if (this.field7429 == null) {
            class544 var2 = class527.field7498;
            synchronized (class527.field7498) {
                if (!class527.field7498.method3140(this.field7434, (byte) -74)) {
                    return false;
                }
                int[] var4 = class527.field7498.method3139(arg0 ^ 0x1, this.field7434);
                this.field7429 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field7429[var5] = class527.field7498.method3150(var4[var5], class470.method2786(arg0, 67), this.field7434);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field7429.length; var7++) {
            byte[] var8 = this.field7429[var7];
            class120 var9 = new class120(var8);
            var9.field1521 = 1;
            int var10 = var9.method898((byte) -78);
            class544 var11 = class386.field5500;
            synchronized (class386.field5500) {
                var6 &= class386.field5500.method3131(-55, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class420 var12 = new class420();
        if (arg0 != -2) {
            return true;
        }
        class544 var13 = class527.field7498;
        int[] var15;
        synchronized (class527.field7498) {
            int var14 = class527.field7498.method3147(this.field7434, -64);
            this.field7432 = new class81[var14];
            var15 = class527.field7498.method3139(-1, this.field7434);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field7429[var16];
            class120 var18 = new class120(var17);
            var18.field1521 = 1;
            int var19 = var18.method898((byte) -86);
            class414 var20 = null;
            for (class414 var21 = (class414) var12.method2508((byte) -120); var21 != null; var21 = (class414) var12.method2505((byte) -55)) {
                if (var21.field5848 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class544 var22 = class386.field5500;
                synchronized (class386.field5500) {
                    var20 = new class414(var19, class386.field5500.method3149(var19, arg0 ^ 0x61));
                }
                var12.method2510(var20, false);
            }
            this.field7432[var15[var16]] = new class81(var17, var20);
        }
        this.field7429 = null;
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Leca;I)I", line = 203)
    public static final int method3032(class789 arg0, int arg1) {
        field7427++;
        if (class412.field5814 == arg0) {
            return 5890;
        } else if (class492.field6991 == arg0) {
            return 34167;
        } else if (class490.field6967 == arg0) {
            return 34168;
        } else if (class490.field6966 == arg0) {
            return 34166;
        } else {
            if (arg1 != 5890) {
                method3030((byte) 64, -105L);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V", line = 231)
    public class520(int arg0) {
        this.field7434 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(ZI)Z", line = 241)
    public final boolean method3033(boolean arg0, int arg1) {
        field7430++;
        return arg0 ? this.field7432[arg1].field1068 : false;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Z", line = 252)
    public final boolean method3034(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field7434 = 1;
        }
        field7428++;
        return this.field7432[arg0].field1071;
    }
}
