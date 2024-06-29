import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class18 extends class210 {

    @OriginalMember(owner = "client!kn", name = "S", descriptor = "I")
    private int field288 = -1;

    @OriginalMember(owner = "client!kn", name = "R", descriptor = "Lbn;")
    public static class160 field287 = new class160(12, 8);

    @OriginalMember(owner = "client!kn", name = "Y", descriptor = "[I")
    public static int[] field294 = new int[2048];

    @OriginalMember(owner = "client!kn", name = "X", descriptor = "Lbt;")
    public static class363 field293 = new class363(30);

    @OriginalMember(owner = "client!kn", name = "ab", descriptor = "[I")
    public static int[] field296;

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!kn", name = "P", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!kn", name = "Q", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!kn", name = "T", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!kn", name = "U", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!kn", name = "V", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!kn", name = "W", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!kn", name = "Z", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "[I")
    private int[] field280;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)V")
    public static final void method225(int arg0, int arg1) {
        class456.field6751 = new int[arg0];
        ++field283;
        class421.field6095 = new int[arg0];
        class436.field6369 = new int[arg0];
        class345.field5078 = new int[arg0];
        if (arg1 != 0) {
            method231(-126, 3, 125, 65, (class63) null);
        }
        class433.field6313 = new int[arg0];
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
    public final void method226(boolean arg0) {
        ++field291;
        super.method226(arg0);
        this.field280 = null;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I")
    public final int method227(byte arg0) {
        ++field281;
        if (arg0 < 53) {
            this.method227((byte) -93);
        }
        return this.field288;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
    public static final String method228(int arg0, String[] arg1, int arg2, int arg3) {
        ++field282;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg1[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg2; ~var5 < ~var7; ++var7) {
                String var11 = arg1[var7];
                if (var11 != null) {
                    var6 += var11.length();
                } else {
                    var6 += 4;
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            int var9 = arg2;
            if (arg0 != 4080) {
                field296 = null;
            }
            while (var9 < var5) {
                String var10 = arg1[var9];
                if (var10 != null) {
                    var8.append(var10);
                } else {
                    var8.append("null");
                }
                ++var9;
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
    public class18() {
        super(0, false);
    }

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)V")
    public static void method229(int arg0) {
        field296 = null;
        if (arg0 != 4) {
            method228(-47, (String[]) null, -23, -92);
        }
        field294 = null;
        field293 = null;
        field287 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
    public final void method230(int arg0, int arg1, int arg2) {
        super.method230(arg0, arg1, arg2);
        ++field292;
        if (~this.field288 <= -1 && class133.field1825 != null) {
            int var4 = class133.field1825.method468((byte) -37, this.field288).field271 ? 64 : 128;
            this.field280 = class133.field1825.method464(var4, false, var4, this.field288, 4260, 1.0F);
            this.field295 = var4;
            this.field284 = var4;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIILhl;)V")
    public static final void method231(int arg0, int arg1, int arg2, int arg3, class63 arg4) {
        class369 var5 = class186.method1275(arg0, arg1, arg2);
        if (var5 != null) {
            int var6 = 0;
            arg4.field828 = (arg1 << class167.field2206) + class135.field1852;
            arg4.field829 = arg3;
            arg4.field837 = (arg2 << class167.field2206) + class135.field1852;
            for (class206 var7 = var5.field5345; var7 != null; var7 = var7.field2882) {
                if (var7.field2880.field4947) {
                    int var8 = var7.field2880.method268((byte) -125);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field829 += var6;
                arg4.field827 = true;
            }
            var5.field5341 = arg4;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field285;
        if (arg1 == -11941) {
            if (~arg0 == -1) {
                this.field288 = arg2.method1767(1930493576);
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)[[I")
    public final int[][] method58(int arg0, int arg1) {
        ++field286;
        int[][] var3 = super.field2967.method1572(124, arg0);
        if (arg1 < 94) {
            method232(-27, (class380) null);
        }
        if (super.field2967.field3454) {
            int var4 = this.field295 * (class130.field1771 != this.field284 ? this.field284 * arg0 / class130.field1771 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class202.field2852 == ~this.field295) {
                for (int var8 = 0; var8 < class202.field2852; ++var8) {
                    int var9 = this.field280[var4++];
                    var7[var8] = class386.method2438(var9, 255) << 4;
                    var6[var8] = class386.method2438(4080, var9 >> 4);
                    var5[var8] = class386.method2438(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class202.field2852; ++var10) {
                    int var11 = this.field295 * var10 / class202.field2852;
                    int var12 = this.field280[var4 + var11];
                    var7[var10] = class386.method2438(4080, var12 << 4);
                    var6[var10] = class386.method2438(4080, var12 >> 4);
                    var5[var10] = class386.method2438(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILwc;)V")
    public static final void method232(int arg0, class380 arg1) {
        if (arg0 != -30327) {
            method231(30, -85, 71, -78, (class63) null);
        }
        ++field290;
        class138 var2 = (class138) class381.field5600.method609((long) arg1.field777, 124);
        if (var2 == null) {
            class71.method518(0, arg1, (byte) -105, (class26) null, arg1.field784[0], arg1.field4960, (class178) null, arg1.field793[0]);
        } else {
            var2.method917(0);
        }
    }

    static {
        new class409("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field296 = new int[3];
    }
}
