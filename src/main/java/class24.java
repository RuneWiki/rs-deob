import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class24 {

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "S")
    public short field325;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "B")
    public byte field331;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "S")
    public short field332;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "B")
    public byte field337;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "S")
    public short field342;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Z")
    public boolean field326;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "[I")
    public static int[] field329 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field327 = 0;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "[I")
    public static int[] field333 = new int[6];

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)Z")
    public static final boolean method238(int arg0, int arg1) {
        int var2 = -1 / ((-arg0 - 50) / 34);
        field340++;
        return arg1 == 6 || arg1 == 7 || arg1 == 8;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static void method239(int arg0) {
        field329 = null;
        field333 = null;
        int var1 = -73 % ((-arg0 - 39) / 39);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method240(int arg0, int arg1, byte[] arg2, int arg3) {
        field330++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = arg1 + arg3;
        if (arg0 != -307468122) {
            method240(26, -41, null, 92);
        }
        for (int var7 = arg3; var7 < var6; var7++) {
            int var8 = arg2[var7] & 0xFF;
            if (var8 >= 128) {
                if (var8 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
                }
                if (var8 < 224) {
                    if (var7 + 1 >= var6) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var9 = arg2[var7] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class188.method1258(class424.method2540(-129, var9), class424.method2540(-193, var8) << 6);
                } else if (var8 < 240) {
                    if ((var7 + 2) >= var6) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var10 = arg2[var7] & 0xFF;
                    if (var10 >= 128 && var10 <= 191) {
                        var7++;
                        int var11 = arg2[var7] & 0xFF;
                        if (var11 >= 128 && var11 <= 191) {
                            var4[var5++] = (char) class188.method1258(class424.method2540(var11, -129), class188.method1258(class424.method2540(-225, var8) << 12, class424.method2540(-8256, var10 << 6)));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if (var8 >= 244) {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                } else {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                }
            } else {
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(CILjava/lang/String;)I")
    public static final int method241(char arg0, int arg1, String arg2) {
        field339++;
        int var3 = 0;
        int var4 = arg2.length();
        if (arg1 != 194) {
            field333 = null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 == arg2.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field325 = (short) arg4;
        this.field338 = arg0;
        this.field334 = arg2;
        this.field331 = (byte) arg7;
        this.field332 = (short) arg6;
        this.field337 = (byte) arg8;
        this.field336 = arg11;
        this.field342 = (short) arg5;
        this.field343 = arg3;
        this.field341 = arg1;
        this.field326 = arg10;
    }
}
