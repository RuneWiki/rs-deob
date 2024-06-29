import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class139 {

    @OriginalMember(owner = "client!to", name = "N", descriptor = "Lus;")
    public static class1 field77 = new class1(77, 12);

    @OriginalMember(owner = "client!to", name = "Q", descriptor = "[B")
    public static byte[] field80 = new byte[2048];

    @OriginalMember(owner = "client!to", name = "S", descriptor = "I")
    public static int field82 = 0;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!to", name = "M", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!to", name = "O", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!to", name = "P", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!to", name = "R", descriptor = "Lb;")
    public static class201 field81;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "[Lcm;")
    private class472[] field73;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "(B)V")
    public static void method28(byte arg0) {
        field81 = null;
        if (arg0 >= 18) {
            field77 = null;
            field80 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public static final int method29(String arg0, int arg1) {
        ++field78;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; ~var2 < ~var4; ++var4) {
            var3 = (var3 << 5) + -var3 - -class367.method2262(arg0.charAt(var4), (byte) -99);
        }
        return var3;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        if (arg1 != 27782) {
            return null;
        } else {
            ++field76;
            int[] var3 = super.field1844.method2176(arg0, 0);
            if (super.field1844.field5045) {
                this.method31((byte) -45, super.field1844.method2175(-73));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(II)I")
    public static final int method30(int arg0, int arg1) {
        if (arg1 != 2094643329) {
            method28((byte) -87);
        }
        ++field72;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg0 & ~var7;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B[[I)V")
    private final void method31(byte arg0, int[][] arg1) {
        ++field75;
        int var3 = class356.field5147;
        int var4 = class241.field3615;
        class48.method316(-104, arg1);
        if (arg0 != -45) {
            this.method21((class276) null, (byte) -14, -116);
        }
        class361.method2234((byte) -123, 0, class388.field5511, 0, class414.field5822);
        if (this.field73 != null) {
            for (int var5 = 0; ~this.field73.length < ~var5; ++var5) {
                class472 var6 = this.field73[var5];
                int var7 = var6.field6641;
                int var8 = var6.field6640;
                if (~var7 <= -1) {
                    if (var8 >= 0) {
                        var6.method14(var4, var3, -6196);
                    } else {
                        var6.method15(var4, (byte) -44, var3);
                    }
                } else if (var8 >= 0) {
                    var6.method16(true, var3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method32(long arg0, byte arg1) {
        ++field71;
        if (~arg0 < -1L && ~arg0 > -6582952005840035282L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                if (arg1 != -104) {
                    field81 = null;
                }
                for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg0 != 0L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    var6.append(class62.field817[(int) (-(arg0 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field74;
        if (arg0 >= -67) {
            method29((String) null, -33);
        }
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (super.field1835.field2395) {
            int var4 = class356.field5147;
            int var5 = class241.field3615;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field1835.method1002((byte) -111);
            this.method31((byte) -45, var6);
            for (int var8 = 0; class241.field3615 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class356.field5147; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class367.method2256(4080, var15 << 4);
                    var12[var14] = class367.method2256(4080, var15 >> 4);
                    var11[var14] = class367.method2256(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg1 != -45) {
            this.method21((class276) null, (byte) 112, -41);
        }
        ++field79;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field1841 = arg0.method1701(-23121) == 1;
                return;
            }
        } else {
            this.field73 = new class472[arg0.method1701(arg1 ^ 23164)];
            for (int var4 = 0; ~this.field73.length < ~var4; ++var4) {
                int var5 = arg0.method1701(-23121);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field73[var4] = class241.method1528(8, arg0);
                            }
                        } else {
                            this.field73[var4] = class153.method967(0, arg0);
                        }
                    } else {
                        this.field73[var4] = class368.method2266(0, arg0);
                    }
                } else {
                    this.field73[var4] = class89.method496((byte) -112, arg0);
                }
            }
        }
    }
}
