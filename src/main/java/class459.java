import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class459 extends class69 {

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public int field6419 = 0;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Z")
    private boolean field6421 = true;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Ljava/lang/String;")
    public String field6418 = null;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field6417 = 1400;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6424 = new BigInteger("8039018895f41c212dc6e1582a2f865580b2e069179904583a0548d13c45bb873613ed80c159aa277a1b66fb5b4db88b9fb539cae179ee72c5e980f77130f821", 16);

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "B")
    public byte field6412;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "B")
    public byte field6429;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "J")
    public long field6413;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Z")
    private boolean field6415;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "[I")
    private int[] field6420;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "[Lifa;")
    public class74[] field6422;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 3)
    public final int method2758(String arg0, boolean arg1) {
        ++field6426;
        if (!arg1) {
            return 63;
        } else {
            for (int var3 = 0; ~var3 > ~this.field6419; ++var3) {
                if (this.field6422[var3].field828.equalsIgnoreCase(arg0)) {
                    return var3;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V", line = 29)
    public final void method2759(int arg0, byte arg1) {
        if (arg1 != 86) {
            this.method2758((String) null, true);
        }
        ++field6423;
        --this.field6419;
        if (this.field6419 != 0) {
            class335.method2123(this.field6422, arg0 - -1, this.field6422, arg0, -arg0 + this.field6419);
        } else {
            this.field6422 = null;
        }
        this.field6420 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILaaa;)Ldja;", line = 52)
    public static final class44 method2760(int arg0, class253 arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field6431;
            class44 var2;
            if (class145.field1875 == null) {
                var2 = new class44();
            } else {
                var2 = class145.field1875;
                class145.field1875 = class145.field1875.field466;
                var2.field466 = null;
                --class490.field6757;
            }
            var2.field465 = arg1;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLgga;)V", line = 75)
    private final void method2761(byte arg0, class511 arg1) {
        ++field6427;
        if (arg0 == -4) {
            int var3 = arg1.method3013(-107);
            if ((2 & var3) != 0) {
                this.field6421 = true;
            }
            if ((1 & var3) != 0) {
                this.field6415 = true;
            }
            super.field762 = arg1.method3020(true);
            this.field6413 = arg1.method3020(true);
            this.field6418 = arg1.method2993((byte) -41);
            arg1.method3013(-103);
            this.field6429 = arg1.method3030(arg0 + -25980);
            this.field6412 = arg1.method3030(-25984);
            this.field6419 = arg1.method3002(-1);
            if (~this.field6419 < -1) {
                this.field6422 = new class74[this.field6419];
                for (int var4 = 0; ~var4 > ~this.field6419; ++var4) {
                    class74 var5 = new class74();
                    if (this.field6415) {
                        arg1.method3020(true);
                    }
                    if (this.field6421) {
                        var5.field828 = arg1.method2993((byte) -105);
                    }
                    var5.field831 = arg1.method3030(-25984);
                    var5.field830 = arg1.method3002(-1);
                    this.field6422[var4] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)Lok;", line = 139)
    public static final class255 method2762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6428;
        if (arg6 >= -85) {
            field6417 = -51;
        }
        long var7 = (long) arg2 * 32147369L ^ (long) arg1 * 97549L ^ (long) arg5 * 67481L ^ (long) arg4 * 475427L ^ (long) arg0 * 986053L ^ (long) arg3 * 76724863L;
        class255 var9 = (class255) class493.field6788.method312(0, var7);
        if (var9 != null) {
            return var9;
        } else {
            class255 var10 = client.field1307.method151(arg5, arg1, arg4, arg0, arg2, arg3);
            class493.field6788.method305(var10, var7, 18320);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 161)
    public static void method2763(int arg0) {
        field6424 = null;
        if (arg0 <= 61) {
            method2760(15, (class253) null);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)[I", line = 176)
    public final int[] method2764(int arg0) {
        ++field6414;
        if (this.field6420 == null) {
            this.field6420 = new int[this.field6419];
            String[] var2 = new String[this.field6419];
            int var3 = 0;
            while (var3 < this.field6419) {
                var2[var3] = this.field6422[var3].field828;
                this.field6420[var3] = var3++;
            }
            class43.method344(this.field6420, var2, (byte) 114);
        }
        return arg0 != 0 ? null : this.field6420;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lifa;I)V", line = 206)
    public final void method2765(class74 arg0, int arg1) {
        ++field6425;
        if (this.field6422 == null || ~this.field6422.length >= ~this.field6419) {
            this.method2766(this.field6419 - -5, (byte) -71);
        }
        this.field6422[this.field6419++] = arg0;
        int var3 = -128 / ((arg1 - 63) / 48);
        this.field6420 = null;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lgga;)V", line = 271)
    public class459(class511 arg0) {
        this.method2761((byte) -4, arg0);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IB)V", line = 225)
    private final void method2766(int arg0, byte arg1) {
        if (arg1 == -71) {
            ++field6430;
            if (this.field6422 == null) {
                this.field6422 = new class74[arg0];
            } else {
                class335.method2123(this.field6422, 0, this.field6422 = new class74[arg0], 0, this.field6419);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FI)F", line = 250)
    public static final float method2767(float arg0, int arg1) {
        ++field6416;
        if (arg1 != 12492) {
            field6417 = 14;
        }
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F + -15.0F) * arg0 + 10.0F);
    }
}
