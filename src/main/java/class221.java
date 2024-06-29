import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class221 extends class232 {

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "I")
    private int field3474 = 2048;

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "I")
    private int field3480 = 10;

    @OriginalMember(owner = "client!eq", name = "R", descriptor = "I")
    private int field3484 = 0;

    @OriginalMember(owner = "client!eq", name = "S", descriptor = "[Ljava/lang/String;")
    private static final String[] field3486 = new String[] { method1956(method1955("g\u000fQ\u0016Q")), method1956(method1955("g\u000fQ\u001aQ")), method1956(method1955("g\u000fQ\u0018Q")), method1956(method1955("g\u000fQ\u001dQ")), method1956(method1955("g\u000fQ\u0010Q")), method1956(method1955("g\u000fQ\u0019Q")), method1956(method1955("yPQr\u0004")), method1956(method1955("l\u000b\u00130")), method1956(method1955("g\u000fQ\u001fQ")) };

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!eq", name = "P", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!eq", name = "Q", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "[I")
    private int[] field3476;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "[I")
    private int[] field3479;

    @OriginalMember(owner = "client!eq", name = "O", descriptor = "[[B")
    public static byte[][] field3483;

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V", line = 5)
    public class221() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V", line = 9)
    public static void method1951(int arg0) {
        try {
            field3483 = null;
            if (arg0 <= 17) {
                method1953(-38);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3486[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "(I)V", line = 21)
    private final void method1952(int arg0) {
        try {
            ++field3485;
            int var2 = 0;
            this.field3479 = new int[this.field3480 + 1];
            this.field3476 = new int[this.field3480 + 1];
            int var3 = 4096 / this.field3480;
            int var4 = this.field3474 * var3 >> 12;
            for (int var5 = 0; var5 < this.field3480; ++var5) {
                this.field3479[var5] = var2;
                this.field3476[var5] = var2 + var4;
                var2 += var3;
            }
            if (arg0 != 10) {
                this.field3480 = -16;
            }
            this.field3479[this.field3480] = 4096;
            this.field3476[this.field3480] = this.field3476[0] + 4096;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3486[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V", line = 61)
    public final void method67(byte arg0) {
        try {
            int var2 = 21 % ((arg0 - 73) / 34);
            this.method1952(10);
            ++field3481;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3486[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILwq;I)V", line = 71)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        this.field3484 = arg1.method1645((byte) -110);
                    }
                } else {
                    this.field3474 = arg1.method1687((byte) -50);
                }
            } else {
                this.field3480 = arg1.method1645((byte) -123);
            }
            if (arg0 <= 96) {
                this.field3474 = -46;
            }
            ++field3478;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3486[5] + arg0 + ',' + (arg1 != null ? field3486[6] : field3486[7]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V", line = 120)
    public static final void method1953(int arg0) {
        try {
            ++field3477;
            class226.field3539.method730(true);
            if (arg0 >= 93) {
                class77.field1149.method5141(0);
                class502.field7512.method5141(0);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3486[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIII)V", line = 138)
    public static final void method1954(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field3482;
            if (arg3 != 31983) {
                method1954(92, -8, 29, 73, -122);
            }
            if (~arg2 >= ~arg4) {
                for (int var5 = arg2; ~var5 > ~arg4; ++var5) {
                    class193.field3047[var5][arg0] = arg1;
                }
            } else {
                for (int var6 = arg4; var6 < arg2; ++var6) {
                    class193.field3047[var6][arg0] = arg1;
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3486[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)[I", line = 173)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field3475;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (arg1 != 123) {
                method1954(-24, -12, 22, 56, -113);
            }
            if (super.field3601.field6907) {
                int var4 = class100.field1467[arg0];
                if (~this.field3484 != -1) {
                    for (int var5 = 0; ~class449.field6969 < ~var5; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class788.field11518[var5];
                        int var9 = this.field3484;
                        if (~var9 != -2) {
                            if (var9 != 2) {
                                if (var9 == 3) {
                                    var6 = 2048 - -(-var4 + var8 >> 1);
                                }
                            } else {
                                var6 = (var8 - (-var4 + 4096) >> 1) + 2048;
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; ~var10 > ~this.field3480; ++var10) {
                            if (~var6 <= ~this.field3479[var10] && ~this.field3479[var10 - -1] < ~var6) {
                                if (~this.field3476[var10] < ~var6) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; ~var12 > ~this.field3480; ++var12) {
                        if (this.field3479[var12] <= var4 && var4 < this.field3479[var12 + 1]) {
                            if (var4 < this.field3476[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class405.method3257(var3, 0, class449.field6969, var11);
                }
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field3486[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1955(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 121);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1956(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 121;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
