import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class286 {

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3342;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Lob;")
    private class769 field3348;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3340;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Lrda;")
    private class692 field3350;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lkc;")
    private class145 field3346;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Lhj;")
    public static class596 field3353 = new class596(100, 10);

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Les;")
    private class403 field3345;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "[Leh;")
    private class381[] field3349;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILtc;Ltc;IZ)Leh;", line = 7)
    private final class381 method1654(int arg0, class372 arg1, class372 arg2, int arg3, boolean arg4) {
        field3352++;
        if (this.field3345 == null) {
            throw new RuntimeException();
        }
        if (arg0 != 19126) {
            method1656(-88, -35, -121);
        }
        if (arg3 < 0 || this.field3349.length <= arg3) {
            throw new RuntimeException();
        } else if (this.field3349[arg3] == null) {
            this.field3345.field5262 = arg3 * 72 + 6;
            int var6 = this.field3345.method2381((byte) 101);
            int var7 = this.field3345.method2381((byte) 76);
            byte[] var8 = new byte[64];
            this.field3345.method2401(65280, var8, 0, 64);
            class381 var9 = new class381(arg3, arg1, arg2, this.field3348, this.field3350, var6, var8, var7, arg4);
            this.field3349[arg3] = var9;
            return var9;
        } else {
            return this.field3349[arg3];
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 50)
    public final void method1655(int arg0) {
        field3344++;
        if (this.field3349 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field3349.length; var2++) {
            if (this.field3349[var2] != null) {
                this.field3349[var2].method2227(false);
            }
        }
        for (int var3 = 0; var3 < this.field3349.length; var3++) {
            if (this.field3349[var3] != null) {
                this.field3349[var3].method2226(0);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)Z", line = 82)
    public static final boolean method1656(int arg0, int arg1, int arg2) {
        field3354++;
        if (arg1 != 64) {
            method1657(56, 68, 31);
        }
        return class672.method3779(arg0, -1219194420, arg2) || class388.method2276(arg0, -5845, arg2);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(III)V", line = 94)
    public static final void method1657(int arg0, int arg1, int arg2) {
        field3341++;
        if (arg1 > -58) {
            method1660(null, null, true, 106);
        }
        class714 var3 = class350.method2072((long) arg2 << 32 | (long) arg0, 19, (byte) 107);
        var3.method4044((byte) -128);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ltc;Ltc;II)Leh;", line = 107)
    public final class381 method1658(class372 arg0, class372 arg1, int arg2, int arg3) {
        field3347++;
        if (arg2 != 0) {
            this.field3350 = null;
        }
        return this.method1654(arg2 + 19126, arg0, arg1, arg3, true);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Z", line = 120)
    public final boolean method1659(int arg0) {
        field3351++;
        if (this.field3345 != null) {
            return true;
        }
        if (this.field3346 == null) {
            if (this.field3348.method4261(2)) {
                return false;
            }
            this.field3346 = this.field3348.method4262(255, true, (byte) 17, (byte) 0, 255);
        }
        if (this.field3346.field374) {
            return false;
        }
        class403 var2 = new class403(this.field3346.method250(-13864));
        var2.field5262 = 5;
        int var3 = var2.method2396((byte) -123);
        var2.field5262 += var3 * 72;
        byte[] var4 = new byte[var2.field5275.length - var2.field5262];
        var2.method2401(65280, var4, 0, var4.length);
        byte[] var7;
        if (this.field3340 == null || this.field3342 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field3340, this.field3342);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class259.method1551(var2.field5275, (byte) -104, 5, var2.field5262 - var4.length - 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        if (arg0 != 7631) {
            this.method1659(-102);
        }
        this.field3345 = var2;
        this.field3349 = new class381[var3];
        return true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;Lbt;ZI)Lmc;", line = 199)
    public static final class146 method1660(String arg0, class48 arg1, boolean arg2, int arg3) {
        field3343++;
        int var4 = arg1.method450((byte) 100, arg0);
        if (~var4 == arg3) {
            return new class146(0);
        }
        int[] var5 = arg1.method441(var4, -46);
        class146 var6 = new class146(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field1827) {
                class403 var9 = new class403(arg1.method437(var4, (byte) -107, var5[var8++]));
                int var10 = var9.method2381((byte) 121);
                int var11 = var9.method2390((byte) 100);
                int var12 = var9.method2396((byte) -119);
                if (!arg2 && var12 == 1) {
                    var6.field1827--;
                } else {
                    var6.field1828[var7] = var10;
                    var6.field1830[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 241)
    public static void method1661(byte arg0) {
        if (arg0 <= -82) {
            field3353 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lob;Lrda;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 254)
    public class286(class769 arg0, class692 arg1, BigInteger arg2, BigInteger arg3) {
        this.field3342 = arg3;
        this.field3348 = arg0;
        this.field3340 = arg2;
        this.field3350 = arg1;
        if (!this.field3348.method4261(2)) {
            this.field3346 = this.field3348.method4262(255, true, (byte) 17, (byte) 0, 255);
        }
    }
}
