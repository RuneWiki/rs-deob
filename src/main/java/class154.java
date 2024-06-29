import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class154 extends class184 {

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    private int field1947 = 4;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    private int field1951 = 1024;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    private int field1953 = 1024;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    private int field1952 = 81;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    private int field1949 = 409;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    private int field1954 = 204;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    private int field1958 = 8;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    private int field1956 = 0;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    private int field1948;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    private int field1957;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "[I")
    private int[] field1955;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "[[I")
    private int[][] field1945;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "[[I")
    private int[][] field1946;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field1950;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 == -8) {
                                        this.field1953 = arg2.method2758((byte) 94);
                                    }
                                } else {
                                    this.field1952 = arg2.method2758((byte) 109);
                                }
                            } else {
                                this.field1956 = arg2.method2758((byte) 126);
                            }
                        } else {
                            this.field1951 = arg2.method2758((byte) 78);
                        }
                    } else {
                        this.field1954 = arg2.method2758((byte) 89);
                    }
                } else {
                    this.field1949 = arg2.method2758((byte) 85);
                }
            } else {
                this.field1958 = arg2.method2737(false);
            }
        } else {
            this.field1947 = arg2.method2737(false);
        }
        int var5 = -50 / ((-13 - arg0) / 51);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field1941;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (arg1 != 578) {
            this.field1957 = 113;
        }
        if (super.field2409.field436) {
            int var4 = 0;
            int var5;
            for (var5 = class334.field4218[arg0] + this.field1956; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field1958 < ~var4 && var5 >= this.field1955[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field1955[var4];
            int var9 = this.field1955[var4 + -1];
            if (~(this.field1957 + var9) > ~var5 && ~var5 > ~(-this.field1957 + var8)) {
                for (int var10 = 0; class245.field3167 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field1951 : this.field1951;
                    int var13;
                    for (var13 = (this.field1948 * var12 >> 12) + class347.field4461[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (this.field1947 > var11 && var13 >= this.field1946[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field1946[var6][var14];
                    int var16 = this.field1946[var6][var11];
                    if (~var13 < ~(this.field1957 + var15) && ~(-this.field1957 + var16) < ~var13) {
                        var3[var10] = this.field1945[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class318.method1876(var3, 0, class245.field3167, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V")
    public final void method109(boolean arg0) {
        this.method1009(101);
        if (arg0) {
            this.method109(false);
        }
        ++field1942;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B[B)Ljava/lang/String;")
    public static final String method1007(byte arg0, byte[] arg1) {
        ++field1959;
        int var2 = arg1.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; var2 > var5; ++var5) {
            int var6 = 255 & arg1[var5];
            if (var6 >= 128) {
                if (var6 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (var6 >= 224) {
                    if (~var6 > -241) {
                        if (var2 <= var5 + 2) {
                            throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                        }
                        ++var5;
                        int var7 = 255 & arg1[var5];
                        if (~var7 <= -129 && ~var7 >= -192) {
                            ++var5;
                            int var8 = arg1[var5] & 255;
                            if (~var8 <= -129 && var8 <= 191) {
                                var3[var4++] = (char) class215.method1323(class215.method1323(class378.method2145(-8256, var7 << 6), class378.method2145(var6, -225) << 12), class378.method2145(var8, -129));
                                continue;
                            }
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                    if (var6 < 244) {
                        throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                } else {
                    if (~(var5 + 1) <= ~var2) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    ++var5;
                    int var9 = 255 & arg1[var5];
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class215.method1323(class378.method2145(var9, -129), class378.method2145(var6 << 6, -12352));
                }
            } else {
                var3[var4++] = (char) var6;
            }
        }
        if (arg0 != -3) {
            return null;
        } else {
            return new String(var3, 0, var4);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)Ldt;")
    public static final class160 method1008(byte arg0) {
        ++field1940;
        if (class241.field3099 != null && class157.field1997 != null) {
            for (class160 var1 = (class160) class157.field1997.method512((byte) -22); var1 != null; var1 = (class160) class157.field1997.method512((byte) -72)) {
                class36 var3 = class241.field3097.method1620(var1.field2035, 36);
                if (var3 != null && var3.field458 && var3.method265(class241.field3092, 17)) {
                    return var1;
                }
            }
            int var2 = -26 % ((-74 - arg0) / 37);
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    private final void method1009(int arg0) {
        ++field1943;
        Random var2 = new Random((long) this.field1958);
        this.field1948 = 4096 / this.field1947;
        this.field1944 = 4096 / this.field1958;
        this.field1957 = this.field1952 / 2;
        int var3 = this.field1948 / 2;
        this.field1945 = new int[this.field1958][this.field1947];
        int var4 = this.field1944 / 2;
        this.field1946 = new int[this.field1958][this.field1947 + 1];
        this.field1955 = new int[this.field1958 - -1];
        this.field1955[0] = 0;
        for (int var5 = 0; this.field1958 > var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field1944;
                int var7 = (class349.method2006(var2, (byte) -46, 4096) - 2048) * this.field1954 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1955[var5] = this.field1955[var5 - 1] + var8;
            }
            this.field1946[var5][0] = 0;
            for (int var9 = 0; this.field1947 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field1948;
                    int var11 = (class349.method2006(var2, (byte) -46, 4096) + -2048) * this.field1949 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1946[var5][var9] = this.field1946[var5][var9 - 1] + var12;
                }
                this.field1945[var5][var9] = ~this.field1953 < -1 ? 4096 + -class349.method2006(var2, (byte) -46, this.field1953) : 4096;
            }
            this.field1946[var5][this.field1947] = 4096;
        }
        if (arg0 < 92) {
            this.method7((byte) 61, 18, (class463) null);
        }
        this.field1955[this.field1958] = 4096;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class154() {
        super(0, true);
    }
}
