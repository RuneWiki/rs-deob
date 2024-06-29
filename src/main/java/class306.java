import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class306 extends class274 {

    @OriginalMember(owner = "client!ch", name = "Sb", descriptor = "Ljava/lang/String;")
    public static String field4980 = "Hidden";

    @OriginalMember(owner = "client!ch", name = "Vb", descriptor = "I")
    public static int field4983 = 0;

    @OriginalMember(owner = "client!ch", name = "Nb", descriptor = "I")
    public static int field4975 = 0;

    @OriginalMember(owner = "client!ch", name = "Ub", descriptor = "I")
    public static int field4982 = 0;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!ch", name = "Cb", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!ch", name = "Db", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!ch", name = "Eb", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!ch", name = "Fb", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ch", name = "Gb", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!ch", name = "Hb", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ch", name = "Jb", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!ch", name = "Kb", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ch", name = "Lb", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ch", name = "Mb", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ch", name = "Ob", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ch", name = "Pb", descriptor = "I")
    private int field4977;

    @OriginalMember(owner = "client!ch", name = "Qb", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ch", name = "Rb", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!ch", name = "Tb", descriptor = "Lph;")
    private class82 field4981;

    @OriginalMember(owner = "client!ch", name = "Ib", descriptor = "[[Z")
    public static boolean[][] field4970;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "(I)V")
    public final void method2075(int arg0) {
        ++field4972;
        if (arg0 != 21423) {
            this.method2084(-80);
        }
        super.field4458 = (this.field4977 + 7) / 8;
    }

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "(B)V")
    public static final void method2076(byte arg0) {
        class31.field531 = 0;
        ++field4974;
        class35.field569 = 0;
        class130.field2071 = 0;
        if (arg0 <= -89) {
            class164.field2690 = 0;
            class170.field2795 = -1;
            class46.field691 = false;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)I")
    public static final int method2077(int arg0, int arg1, int arg2) {
        ++field4965;
        class74 var3 = (class74) class57.field829.method371(75, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg0 != 255) {
                field4983 = -121;
            }
            for (int var5 = 0; var5 < var3.field1188.length; ++var5) {
                if (~var3.field1187[var5] == ~arg1) {
                    var4 += var3.field1188[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIZ)I")
    public static final int method2078(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg2 & 3;
        ++field4968;
        if (~var4 == -1) {
            return arg1;
        } else if (~var4 == -2) {
            return -arg0 + 7;
        } else if (var4 == 2) {
            return -arg1 + 7;
        } else {
            if (!arg3) {
                method2078(33, 69, -118, true);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
    public class306(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "(II)I")
    public final int method2079(int arg0, int arg1) {
        if (arg0 != -19053) {
            this.method2084(-115);
        }
        ++field4978;
        return arg1 * 8 + -this.field4977;
    }

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "(I)V")
    public static void method2080(int arg0) {
        if (arg0 != -15846) {
            method2082(126);
        }
        field4970 = null;
        field4980 = null;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(ZI)V")
    public final void method2081(boolean arg0, int arg1) {
        super.field4441[super.field4458++] = (byte) (this.field4981.method588(-6055) + arg1);
        ++field4966;
        if (arg0) {
            method2080(-23);
        }
    }

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "(I)[Lrk;")
    public static final class292[] method2082(int arg0) {
        ++field4969;
        class292[] var1 = new class292[class98.field1559];
        for (int var2 = arg0; class98.field1559 > var2; ++var2) {
            int var3 = class217.field3413[var2] * class140.field2284[var2];
            byte[] var4 = class232.field3635[var2];
            if (!class109.field1692[var2]) {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; ++var6) {
                    var5[var6] = class310.field5024[class233.method1609(255, var4[var6])];
                }
                var1[var2] = new class67(class14.field295, class13.field272, class80.field1286[var2], class211.field3364[var2], class217.field3413[var2], class140.field2284[var2], var5);
            } else {
                int[] var7 = new int[var3];
                byte[] var8 = class93.field1487[var2];
                for (int var9 = 0; ~var3 < ~var9; ++var9) {
                    var7[var9] = class76.method555(class310.field5024[class233.method1609(255, var4[var9])], class233.method1609(-16777216, var8[var9] << 24));
                }
                var1[var2] = new class185(class14.field295, class13.field272, class80.field1286[var2], class211.field3364[var2], class217.field3413[var2], class140.field2284[var2], var7);
            }
        }
        class180.method1265(30);
        return var1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI[B)V")
    public final void method2083(int arg0, byte arg1, int arg2, byte[] arg3) {
        if (arg1 != 31) {
            method2078(80, 111, 2, false);
        }
        for (int var5 = 0; arg2 > var5; ++var5) {
            arg3[var5 - -arg0] = (byte) (super.field4441[super.field4458++] + -this.field4981.method588(class81.method582(arg1, -6074)));
        }
        ++field4976;
    }

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "(I)I")
    public final int method2084(int arg0) {
        ++field4971;
        if (arg0 != -19884) {
            this.method2083(55, (byte) 54, 61, (byte[]) null);
        }
        return 255 & super.field4441[super.field4458++] - this.field4981.method588(-6055);
    }

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "(I)V")
    public final void method2085(int arg0) {
        this.field4977 = super.field4458 * 8;
        if (arg0 >= 34) {
            ++field4963;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[I)V")
    public final void method2086(int arg0, int[] arg1) {
        if (arg0 > 0) {
            ++field4964;
            this.field4981 = new class82(arg1);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(IB)I")
    public final int method2087(int arg0, byte arg1) {
        ++field4967;
        int var3 = -105 / ((arg1 - 64) / 56);
        int var4 = 0;
        int var5 = this.field4977 >> 3;
        int var6 = -(7 & this.field4977) + 8;
        this.field4977 += arg0;
        while (var6 < arg0) {
            var4 += (super.field4441[var5++] & class148.field2367[var6]) << arg0 - var6;
            arg0 -= var6;
            var6 = 8;
        }
        int var7;
        if (arg0 == var6) {
            var7 = (super.field4441[var5] & class148.field2367[var6]) + var4;
        } else {
            var7 = (super.field4441[var5] >> -arg0 + var6 & class148.field2367[arg0]) + var4;
        }
        return var7;
    }
}
