import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class108 extends class175 {

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    private int field1939 = -1;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "J")
    public static volatile long field1935 = 0L;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public int field1927;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "[I")
    public int[] field1930;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZLce;B)V")
    public static final void method801(int arg0, int arg1, boolean arg2, class10 arg3, byte arg4) {
        ++field1931;
        int var5 = arg3.field243;
        int var6 = arg3.field242;
        if (arg3.field157 == 0) {
            arg3.field242 = arg3.field178;
        } else if (arg3.field157 != 1) {
            if (~arg3.field157 == -3) {
                arg3.field242 = arg3.field178 * arg0 >> 14;
            } else if (arg3.field157 == 3) {
                if (arg3.field227 == 2) {
                    arg3.field242 = arg3.field178 * 32 - -((arg3.field178 + -1) * arg3.field274);
                } else if (arg3.field227 == 7) {
                    arg3.field242 = (arg3.field178 + -1) * arg3.field274 + arg3.field178 * 12;
                }
            }
        } else {
            arg3.field242 = -arg3.field178 + arg0;
        }
        if (arg3.field265 != 0) {
            if (arg3.field265 == 1) {
                arg3.field243 = -arg3.field229 + arg1;
            } else if (arg3.field265 != 2) {
                if (arg3.field265 == 3) {
                    if (~arg3.field227 != -3) {
                        if (~arg3.field227 == -8) {
                            arg3.field243 = (arg3.field229 - 1) * arg3.field210 + arg3.field229 * 115;
                        }
                    } else {
                        arg3.field243 = (arg3.field229 - 1) * arg3.field210 + arg3.field229 * 32;
                    }
                }
            } else {
                arg3.field243 = arg3.field229 * arg1 >> 14;
            }
        } else {
            arg3.field243 = arg3.field229;
        }
        if (~arg3.field265 == -5) {
            arg3.field243 = arg3.field242 * arg3.field139 / arg3.field251;
        }
        if (~arg3.field157 == -5) {
            arg3.field242 = arg3.field251 * arg3.field243 / arg3.field139;
        }
        if (class126.field2206 && (~client.method605(arg3) != -1 || ~arg3.field227 == -1)) {
            if (~arg3.field242 > -6 && ~arg3.field243 > -6) {
                arg3.field242 = 5;
                arg3.field243 = 5;
            } else {
                if (~arg3.field242 >= -1) {
                    arg3.field242 = 5;
                }
                if (arg3.field243 <= 0) {
                    arg3.field243 = 5;
                }
            }
        }
        if (arg3.field259 == 1337) {
            class115.field2018 = arg3;
        }
        if (arg4 != 102) {
            field1934 = 19;
        }
        if (arg2 && arg3.field217 != null) {
            if (arg3.field243 != var5 || ~arg3.field242 != ~var6) {
                class93 var7 = new class93();
                var7.field1740 = arg3;
                var7.field1739 = arg3.field217;
                class160.field2751.method684(var7, (byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[[I")
    public int[][] method32(int arg0, int arg1) {
        int[][] var3 = super.field2920.method117(arg0, (byte) -86);
        if (super.field2920.field356 && this.method805(104)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field1927 * (~class220.field3690 != ~this.field1940 ? this.field1940 * arg0 / class220.field3690 : arg0);
            if (class211.field3514 == this.field1927) {
                for (int var8 = 0; var8 < class211.field3514; ++var8) {
                    int var9 = this.field1930[var7++];
                    var6[var8] = class51.method413(255, var9) << 4;
                    var5[var8] = class51.method413(65280, var9) >> 4;
                    var4[var8] = class51.method413(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; class211.field3514 > var10; ++var10) {
                    int var11 = this.field1927 * var10 / class211.field3514;
                    int var12 = this.field1930[var7 + var11];
                    var6[var10] = class51.method413(255, var12) << 4;
                    var5[var10] = class51.method413(4080, var12 >> 4);
                    var4[var10] = class51.method413(var12 >> 12, 4080);
                }
            }
        }
        ++field1941;
        if (arg1 != -20740) {
            this.field1939 = 45;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
    public static final void method802(boolean arg0) {
        ++field1936;
        if (!arg0) {
            field1934 = 90;
        }
        class155.field2697.method763(0);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (arg0) {
            ++field1937;
            if (~arg1 == -1) {
                this.field1939 = arg2.method1441(126);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class108() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
    public final void method803(byte arg0) {
        ++field1933;
        super.method803((byte) 88);
        this.field1930 = null;
        if (arg0 < 82) {
            this.method804((byte) 53);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)I")
    public final int method804(byte arg0) {
        ++field1938;
        if (arg0 < 16) {
            this.field1927 = -53;
        }
        return this.field1939;
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)Z")
    public final boolean method805(int arg0) {
        ++field1932;
        if (this.field1930 != null) {
            return true;
        } else if (this.field1939 >= 0) {
            class169 var2 = class17.method134(this.field1939, (byte) 116, class49.field881);
            var2.method1172();
            this.field1930 = var2.field2836;
            this.field1927 = var2.field1636;
            this.field1940 = var2.field1643;
            return true;
        } else {
            int var3 = -111 % ((arg0 - 17) / 49);
            return false;
        }
    }
}
