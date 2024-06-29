import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class36 extends class8 {

    @OriginalMember(owner = "client!fe", name = "vc", descriptor = "Z")
    public static boolean field954 = false;

    @OriginalMember(owner = "client!fe", name = "qc", descriptor = "I")
    public static int field949 = 1;

    @OriginalMember(owner = "client!fe", name = "Ac", descriptor = "J")
    public static long field959 = 0L;

    @OriginalMember(owner = "client!fe", name = "Ec", descriptor = "La;")
    public static class1 field963 = class113.method934(-11538, "Aus");

    @OriginalMember(owner = "client!fe", name = "xc", descriptor = "[Lme;")
    public static class77[] field956 = new class77[50];

    @OriginalMember(owner = "client!fe", name = "Hc", descriptor = "I")
    public static int field966 = 0;

    @OriginalMember(owner = "client!fe", name = "Nc", descriptor = "La;")
    private static class1 field972 = class113.method934(-11538, "Please wait)3)3)3");

    @OriginalMember(owner = "client!fe", name = "zc", descriptor = "La;")
    public static class1 field958 = field972;

    @OriginalMember(owner = "client!fe", name = "Gc", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field965 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!fe", name = "Oc", descriptor = "Z")
    public static boolean field973 = false;

    @OriginalMember(owner = "client!fe", name = "Tc", descriptor = "La;")
    public static class1 field978 = class113.method934(-11538, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!fe", name = "Sc", descriptor = "La;")
    public static class1 field977 = class113.method934(-11538, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!fe", name = "Pc", descriptor = "I")
    public static int field974 = 0;

    @OriginalMember(owner = "client!fe", name = "pc", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!fe", name = "rc", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!fe", name = "sc", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!fe", name = "tc", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!fe", name = "uc", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!fe", name = "wc", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!fe", name = "Bc", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!fe", name = "Cc", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!fe", name = "Dc", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "client!fe", name = "Fc", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!fe", name = "Ic", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!fe", name = "Kc", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!fe", name = "Lc", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!fe", name = "Mc", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!fe", name = "Qc", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!fe", name = "Rc", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!fe", name = "Jc", descriptor = "Lrb;")
    public static class104 field968;

    @OriginalMember(owner = "client!fe", name = "yc", descriptor = "Lgb;")
    private class39 field957;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "(II)I", line = 4)
    public final int method408(int arg0, int arg1) {
        if (arg0 <= 118) {
            return 75;
        } else {
            ++field955;
            return arg1 * 8 - this.field962;
        }
    }

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "(B)V", line = 16)
    public final void method409(byte arg0) {
        if (arg0 != -110) {
            this.field962 = -12;
        }
        super.field268 = (this.field962 + 7) / 8;
        ++field967;
    }

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "(B)I", line = 32)
    public final int method410(byte arg0) {
        if (arg0 != 49) {
            field978 = null;
        }
        ++field950;
        return 255 & super.field285[super.field268++] + -this.field957.method431(-101);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILu;Lsa;B)V", line = 43)
    public static final void method411(int arg0, class120 arg1, class109 arg2, byte arg3) {
        class57 var4 = new class57();
        ++field970;
        var4.field1467 = 1;
        var4.field2076 = (long) arg0;
        var4.field1472 = arg2;
        var4.field1459 = arg1;
        class92 var5 = class62.field1550;
        synchronized (class62.field1550) {
            if (arg3 != -28) {
                method419(false, (byte) -113, -84, -120);
            }
            class62.field1550.method807(var4, -72);
        }
        class48.method502(600);
    }

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "(I)V", line = 64)
    public static void method412(int arg0) {
        field968 = null;
        field978 = null;
        field972 = null;
        if (arg0 == 1) {
            field965 = null;
            field956 = null;
            field963 = null;
            field958 = null;
            field977 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(IB)I", line = 93)
    public final int method413(int arg0, byte arg1) {
        ++field952;
        int var3 = this.field962 >> 3;
        if (arg1 != -65) {
            field958 = null;
        }
        int var4 = 0;
        int var5 = 8 - (7 & this.field962);
        this.field962 += arg0;
        while (var5 < arg0) {
            var4 += (class35.field937[var5] & super.field285[var3++]) << -var5 + arg0;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (~arg0 != ~var5) {
            var6 = (class35.field937[arg0] & super.field285[var3] >> -arg0 + var5) + var4;
        } else {
            var6 = (super.field285[var3] & class35.field937[var5]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "(I)V", line = 129)
    public static final void method414(int arg0) {
        class70.field1729.method416(11453, 176);
        if (class66.field1651 != -1) {
            class108.method898(class66.field1651, -14222);
            class120.field3001 = -1;
            class95.field2367 = true;
            class39.field1056 = true;
            class66.field1651 = -1;
        }
        ++class127.field3126;
        ++field951;
        if (class86.field2169 != -1) {
            class108.method898(class86.field2169, -14222);
            class120.field3001 = -1;
            class105.field2640 = true;
            class86.field2169 = -1;
        }
        if (~class42.field1144 != 0) {
            class108.method898(class42.field1144, -14222);
            class42.field1144 = -1;
            class34.method400(30, -47);
        }
        if (~class76.field1884 != 0) {
            class108.method898(class76.field1884, -14222);
            class76.field1884 = -1;
        }
        if (arg0 >= 92) {
            if (class132.field3230 != -1) {
                class108.method898(class132.field3230, -14222);
                class132.field3230 = -1;
                class120.field3001 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V", line = 180)
    public static final void method415(int arg0, int arg1, int arg2) {
        if (arg2 == -9225) {
            ++field948;
            class70.field1729.method416(11453, 132);
            ++class39.field1050;
            class70.field1729.method180(-2030879560, arg1);
            class70.field1729.method163(14912, arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V", line = 197)
    public class36(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "(II)V", line = 216)
    public final void method416(int arg0, int arg1) {
        if (arg0 != 11453) {
            method411(62, (class120) null, (class109) null, (byte) -105);
        }
        ++field971;
        super.field285[super.field268++] = (byte) (this.field957.method431(class64.method626(arg0, -11500)) + arg1);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[I)V", line = 230)
    public final void method417(int arg0, int[] arg1) {
        this.field957 = new class39(arg1);
        ++field964;
        if (arg0 != -1) {
            field977 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "(I)V", line = 249)
    public final void method418(int arg0) {
        ++field953;
        this.field962 = super.field268 * 8;
        if (arg0 <= 21) {
            this.field957 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZBII)La;", line = 270)
    public static final class1 method419(boolean arg0, byte arg1, int arg2, int arg3) {
        if (arg2 < 1 || arg2 > 36) {
            arg2 = 10;
        }
        int var4 = 1;
        if (arg1 != 8) {
            return null;
        } else {
            int var5 = arg3 / arg2;
            while (var5 != 0) {
                var5 /= arg2;
                ++var4;
            }
            ++field969;
            int var6 = var4;
            if (arg3 < 0 || arg0) {
                var6 = var4 + 1;
            }
            byte[] var7 = new byte[var6];
            if (~arg3 > -1) {
                var7[0] = 45;
            } else if (arg0) {
                var7[0] = 43;
            }
            for (int var8 = 0; var4 > var8; ++var8) {
                int var10 = arg3 % arg2;
                arg3 /= arg2;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (~var10 < -10) {
                    var10 += 39;
                }
                var7[var6 - var8 + -1] = (byte) (var10 + 48);
            }
            class1 var9 = new class1();
            var9.field38 = var7;
            var9.field26 = var6;
            return var9;
        }
    }
}
