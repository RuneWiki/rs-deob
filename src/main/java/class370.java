import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class370 {

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5492;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5478;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "Ljq;")
    private class346 field5485;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "Loaa;")
    private class498 field5484;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Llaa;")
    private class448 field5479;

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "[I")
    public static int[] field5487 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "Lmv;")
    public static class295 field5490;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "Lgk;")
    private class540 field5483;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "[I")
    public static int[] field5482;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "[Ltj;")
    private class614[] field5491;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZILnr;ILnr;)Ltj;", line = 3)
    private final class614 method2286(boolean arg0, int arg1, class19 arg2, int arg3, class19 arg4) {
        if (arg1 != 2) {
            return null;
        }
        field5486++;
        if (this.field5483 == null) {
            throw new RuntimeException();
        } else if (arg3 < 0 || arg3 >= this.field5491.length) {
            throw new RuntimeException();
        } else if (this.field5491[arg3] == null) {
            this.field5483.field7956 = arg3 * 72 + 6;
            int var6 = this.field5483.method3160(false);
            int var7 = this.field5483.method3160(false);
            byte[] var8 = new byte[64];
            this.field5483.method3155(64, 0, var8, 0);
            class614 var9 = new class614(arg3, arg2, arg4, this.field5484, this.field5485, var6, var8, var7, arg0);
            this.field5491[arg3] = var9;
            return var9;
        } else {
            return this.field5491[arg3];
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZLmea;II)Llc;", line = 55)
    public static final class653 method2287(boolean arg0, class355 arg1, int arg2, int arg3) {
        field5488++;
        int var4 = arg2 << 10 | arg1.field5258;
        class653 var5 = (class653) class129.field1856.method3720(-98, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class587.field8518.method1830(false, class587.field8518.method1828(var4, 127));
        if (var6 == null) {
            int var9 = arg1.field5258 | arg3 + 65536 << 10;
            class653 var10 = (class653) class129.field1856.method3720(-110, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class587.field8518.method1830(false, class587.field8518.method1828(var9, 121));
            if (var11 == null) {
                int var14 = arg1.field5258 | 0x3FFFC00;
                class653 var15 = (class653) class129.field1856.method3720(-117, (long) var14 << 16);
                if (var15 != null) {
                    return var15;
                }
                if (!arg0) {
                    field5487 = null;
                }
                byte[] var16 = class587.field8518.method1830(false, class587.field8518.method1828(var14, 122));
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class653 var17;
                    try {
                        var17 = class579.method3323(-106, var16);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field9340 = arg1;
                    class129.field1856.method3716(var17, (byte) -24, (long) var14 << 16);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class653 var12;
                try {
                    var12 = class579.method3323(-79, var11);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field9340 = arg1;
                class129.field1856.method3716(var12, (byte) -24, (long) var9 << 16);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class653 var7;
            try {
                var7 = class579.method3323(-88, var6);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field9340 = arg1;
            class129.field1856.method3716(var7, (byte) -24, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZLnr;Lnr;I)Ltj;", line = 152)
    public final class614 method2288(boolean arg0, class19 arg1, class19 arg2, int arg3) {
        if (!arg0) {
            this.method2286(true, -74, null, -90, null);
        }
        field5480++;
        return this.method2286(true, 2, arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)Z", line = 163)
    public final boolean method2289(int arg0) {
        field5489++;
        if (this.field5483 != null) {
            return true;
        }
        if (this.field5479 == null) {
            if (this.field5484.method2838(-127)) {
                return false;
            }
            this.field5479 = this.field5484.method2851(255, true, true, 255, (byte) 0);
        }
        if (this.field5479.field8640) {
            return false;
        }
        class540 var2 = new class540(this.field5479.method2648(73));
        var2.field7956 = 5;
        int var3 = var2.method3115(29871);
        var2.field7956 += var3 * 72;
        byte[] var4 = new byte[var2.field7952.length - var2.field7956];
        var2.method3155(var4.length, 0, var4, 0);
        byte[] var7;
        if (this.field5492 == null || this.field5478 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field5492, this.field5478);
            var7 = var6.toByteArray();
        }
        if (arg0 < 48) {
            this.method2286(true, -40, null, 29, null);
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class86.method492(var2.field7956 - var4.length - 5, 5, (byte) 18, var2.field7952);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field5491 = new class614[var3];
        this.field5483 = var2;
        return true;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V", line = 240)
    public static void method2290(int arg0) {
        field5482 = null;
        field5487 = null;
        field5490 = null;
        if (arg0 != 25083) {
            method2290(-107);
        }
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V", line = 252)
    public final void method2291(int arg0) {
        field5481++;
        if (this.field5491 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5491.length; var2++) {
            if (this.field5491[var2] != null) {
                this.field5491[var2].method3491((byte) -1);
            }
        }
        if (arg0 != -65536) {
            this.method2286(true, -23, null, -23, null);
        }
        for (int var3 = 0; var3 < this.field5491.length; var3++) {
            if (this.field5491[var3] != null) {
                this.field5491[var3].method3502(false);
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", line = 289)
    public static final void method2292(int arg0, String arg1, String arg2, int arg3) {
        field5477++;
        class642.field9203 = arg3;
        class673.field9460 = 2;
        if (arg0 <= -18) {
            class504.method2873(false, arg1, arg2, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Loaa;Ljq;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 301)
    public class370(class498 arg0, class346 arg1, BigInteger arg2, BigInteger arg3) {
        this.field5492 = arg2;
        this.field5478 = arg3;
        this.field5485 = arg1;
        this.field5484 = arg0;
        if (!this.field5484.method2838(-47)) {
            this.field5479 = this.field5484.method2851(255, true, true, 255, (byte) 0);
        }
    }
}
