import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class494 {

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6989;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Ldm;")
    private class733 field6981;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lhe;")
    private class592 field6995;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6994;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lme;")
    private class717 field6987;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Lfq;")
    public static class141 field6993 = new class141(1, 2, 2, 0);

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Lmq;")
    public static class78 field6996 = new class78(58, -2);

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lgq;")
    public static class761 field6997 = new class761();

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Ltn;")
    private class179 field6982;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lkha;")
    public static class687 field6985;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Let;")
    public static class718 field6991;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "[I")
    public static int[] field6998;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[Lgu;")
    private class536[] field6983;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lwea;Lwea;II)Lgu;", line = 4)
    public final class536 method2871(class98 arg0, class98 arg1, int arg2, int arg3) {
        if (arg3 != 64) {
            this.method2875(-104);
        }
        field6986++;
        return this.method2874(15682, arg0, arg1, true, arg2);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 24)
    public static void method2872(byte arg0) {
        if (arg0 != 0) {
            field6998 = null;
        }
        field6991 = null;
        field6997 = null;
        field6998 = null;
        field6996 = null;
        field6985 = null;
        field6993 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Z", line = 47)
    public final boolean method2873(int arg0) {
        field6984++;
        if (this.field6982 != null) {
            return true;
        }
        if (this.field6987 == null) {
            if (this.field6981.method4098(arg0 - 31045)) {
                return false;
            }
            this.field6987 = this.field6981.method4104(255, (byte) 0, true, 255, -103);
        }
        if (this.field6987.field7751) {
            return false;
        }
        class179 var2 = new class179(this.field6987.method3138(arg0 ^ 0x78C9));
        var2.field2354 = 5;
        int var3 = var2.method1094(arg0 ^ 0x7837);
        var2.field2354 += var3 * 72;
        if (arg0 != 30920) {
            field6998 = null;
        }
        byte[] var4 = new byte[var2.field2325.length - var2.field2354];
        var2.method1096(var4.length, 0, var4, 12050);
        byte[] var7;
        if (this.field6989 == null || this.field6994 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field6989, this.field6994);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class436.method2579(5, -1, var2.field2354 - var4.length - 5, var2.field2325);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field6983 = new class536[var3];
        this.field6982 = var2;
        return true;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILwea;Lwea;ZI)Lgu;", line = 122)
    private final class536 method2874(int arg0, class98 arg1, class98 arg2, boolean arg3, int arg4) {
        field6992++;
        if (this.field6982 == null) {
            throw new RuntimeException();
        } else if (arg4 < 0 || this.field6983.length <= arg4) {
            throw new RuntimeException();
        } else if (this.field6983[arg4] == null) {
            this.field6982.field2354 = arg4 * 72 + 6;
            int var6 = this.field6982.method1095((byte) 121);
            int var7 = this.field6982.method1095((byte) 116);
            byte[] var8 = new byte[64];
            this.field6982.method1096(64, 0, var8, 12050);
            if (arg0 != 15682) {
                this.method2875(-119);
            }
            class536 var9 = new class536(arg4, arg1, arg2, this.field6981, this.field6995, var6, var8, var7, arg3);
            this.field6983[arg4] = var9;
            return var9;
        } else {
            return this.field6983[arg4];
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 168)
    public final void method2875(int arg0) {
        field6988++;
        if (this.field6983 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field6983.length; var2++) {
            if (this.field6983[var2] != null) {
                this.field6983[var2].method3060(false);
            }
        }
        for (int var3 = 0; var3 < this.field6983.length; var3++) {
            if (this.field6983[var3] != null) {
                this.field6983[var3].method3054(0);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ldm;Lhe;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 199)
    public class494(class733 arg0, class592 arg1, BigInteger arg2, BigInteger arg3) {
        this.field6989 = arg2;
        this.field6981 = arg0;
        this.field6995 = arg1;
        this.field6994 = arg3;
        if (!this.field6981.method4098(-127)) {
            this.field6987 = this.field6981.method4104(255, (byte) 0, true, 255, 45);
        }
    }
}
