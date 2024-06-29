import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class314 {

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    private int field5185;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "[[I")
    private int[][] field5181;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    private int field5189;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5182 = new String[1000];

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIB)Z", line = 5)
    public static final boolean method2253(int arg0, int arg1, byte arg2) {
        int var3 = 16 / ((-arg2 - 71) / 46);
        if (arg1 == 11) {
            arg1 = 10;
        }
        class126 var4 = class165.method1155((byte) 85, arg0);
        field5183++;
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var4.method817(arg1, false);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 30)
    public static final Object method2254(byte[] arg0, boolean arg1, int arg2) {
        field5186++;
        if (arg0 == null) {
            return null;
        }
        if (arg2 < arg0.length && !class207.field3146) {
            try {
                class11 var3 = (class11) Class.forName("ng").getDeclaredConstructor().newInstance();
                var3.method67(arg0, -127);
                return var3;
            } catch (Throwable var5) {
                class207.field3146 = true;
            }
        }
        return arg1 ? class86.method563(arg0, 0) : arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)I", line = 68)
    public final int method2255(byte arg0, int arg1) {
        field5191++;
        if (arg0 >= -64) {
            method2253(61, -44, (byte) -115);
        }
        if (this.field5181 != null) {
            arg1 = (int) ((long) this.field5189 * (long) arg1 / (long) this.field5185);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 82)
    public static final void method2256(int arg0) {
        class268.field4422.method644((byte) -101);
        if (arg0 != 6) {
            method2259((byte) 73);
        }
        field5190++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[B)[B", line = 94)
    public final byte[] method2257(int arg0, byte[] arg1) {
        if (arg0 != -32768) {
            this.field5189 = -35;
        }
        if (this.field5181 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5189 / (long) this.field5185) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var8 = this.field5181[var4];
                byte var9 = arg1[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var5[var6 + var10] += var8[var10] * var9;
                }
                int var11 = this.field5189 + var4;
                int var12 = var11 / this.field5185;
                var6 += var12;
                var4 = var11 - this.field5185 * var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var5[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 > 127) {
                    arg1[var13] = 127;
                } else {
                    arg1[var13] = (byte) var14;
                }
            }
        }
        field5187++;
        return arg1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 166)
    public static final void method2258(byte arg0) {
        class181.field2820.method651(0);
        field5184++;
        class195.field2988.method651(0);
        if (arg0 <= 12) {
            field5182 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V", line = 181)
    public static void method2259(byte arg0) {
        int var1 = 88 % ((-arg0 - 7) / 45);
        field5182 = null;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(II)V", line = 188)
    public class314(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class256.method1818(arg1, (byte) -23, arg0);
            int var4 = arg0 / var3;
            this.field5185 = var4;
            this.field5181 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field5189 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field5181[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)I", line = 250)
    public final int method2260(int arg0, int arg1) {
        if (arg0 != 22011) {
            return 86;
        }
        if (this.field5181 != null) {
            arg1 = (int) ((long) this.field5189 * (long) arg1 / (long) this.field5185) + 6;
        }
        field5188++;
        return arg1;
    }
}
