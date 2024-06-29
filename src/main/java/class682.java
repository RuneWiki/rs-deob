import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class682 {

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field9686;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "Lcca;")
    private class257 field9690;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "Lql;")
    private class766 field9692;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field9689;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "Lte;")
    private class638 field9682;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "Lrv;")
    private class120 field9688;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Lip;")
    public static class734 field9684;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "[Lae;")
    private class261[] field9691;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lqia;ZLqia;BI)Lae;")
    private final class261 method3850(class23 arg0, boolean arg1, class23 arg2, byte arg3, int arg4) {
        field9681++;
        if (this.field9688 == null) {
            throw new RuntimeException();
        } else if (arg4 < 0 || arg4 >= this.field9691.length) {
            throw new RuntimeException();
        } else if (this.field9691[arg4] == null) {
            this.field9688.field1521 = arg4 * 72 + 6;
            if (arg3 != 54) {
                this.field9691 = null;
            }
            int var6 = this.field9688.method871(23995);
            int var7 = this.field9688.method871(23995);
            byte[] var8 = new byte[64];
            this.field9688.method850(arg3 ^ 0xC9, 0, 64, var8);
            class261 var9 = new class261(arg4, arg2, arg0, this.field9692, this.field9690, var6, var8, var7, arg1);
            this.field9691[arg4] = var9;
            return var9;
        } else {
            return this.field9691[arg4];
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static void method3851(int arg0) {
        if (arg0 == 1) {
            field9684 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)Z")
    public final boolean method3852(byte arg0) {
        field9685++;
        if (arg0 > -14) {
            method3851(-102);
        }
        if (this.field9688 != null) {
            return true;
        }
        if (this.field9682 == null) {
            if (this.field9692.method4220(20)) {
                return false;
            }
            this.field9682 = this.field9692.method4215(true, 255, (byte) 0, (byte) -118, 255);
        }
        if (this.field9682.field4984) {
            return false;
        }
        class120 var2 = new class120(this.field9682.method2160(-879));
        var2.field1521 = 5;
        int var3 = var2.method842(2384);
        var2.field1521 += var3 * 72;
        byte[] var4 = new byte[var2.field1556.length - var2.field1521];
        var2.method850(255, 0, var4.length, var4);
        byte[] var7;
        if (this.field9686 == null || this.field9689 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field9686, this.field9689);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class759.method4188(var2.field1521 - var4.length - 5, 5, var2.field1556, (byte) -117);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field9688 = var2;
        this.field9691 = new class261[var3];
        return true;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public final void method3853(int arg0) {
        field9687++;
        if (this.field9691 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field9691.length; var2++) {
            if (this.field9691[var2] != null) {
                this.field9691[var2].method1718(0);
            }
        }
        for (int var3 = 0; var3 < this.field9691.length; var3++) {
            if (this.field9691[var3] != null) {
                this.field9691[var3].method1717((byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([BIIII[BIIZ)V")
    public static final void method3854(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, boolean arg8) {
        field9680++;
        int var9 = -(arg4 >> 2);
        if (arg8) {
            field9684 = null;
        }
        int var10 = -(arg4 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg5[var10001] = (byte) (arg5[var10001] - arg0[arg6++]);
                int var14 = arg1++;
                arg5[var14] = (byte) (arg5[var14] - arg0[arg6++]);
                int var15 = arg1++;
                arg5[var15] = (byte) (arg5[var15] - arg0[arg6++]);
                int var16 = arg1++;
                arg5[var16] = (byte) (arg5[var16] - arg0[arg6++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg5[var10001] = (byte) (arg5[var10001] - arg0[arg6++]);
            }
            arg6 += arg2;
            arg1 += arg3;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BILqia;Lqia;)Lae;")
    public final class261 method3855(byte arg0, int arg1, class23 arg2, class23 arg3) {
        field9683++;
        return arg0 < 80 ? null : this.method3850(arg2, true, arg3, (byte) 54, arg1);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lsf;ZZ)V")
    public static final void method3856(class547 arg0, boolean arg1, boolean arg2) {
        arg0.field7715 = arg2;
        if (!class437.field6253) {
            class547.method3183(arg0, class298.field4487);
        } else if (arg1) {
            class137.field1790[class137.field1790.length - 1].method700((byte) -90, arg0);
        } else {
            int var3 = class498.method2905(arg0.field7712);
            int var4 = class421.field5943[2] * arg0.method239(-122) / arg0.field7722;
            int var5 = class498.method2905(arg0.field7712 - var4);
            int var6 = class498.method2905(arg0.field7712 + var4);
            if (var5 == var6) {
                class137.field1790[var3].method700((byte) -113, arg0);
            } else if (var6 - var5 == 1) {
                class137.field1790[class347.field5092 + var5].method700((byte) -106, arg0);
            } else {
                class137.field1790[class137.field1790.length - 1].method700((byte) -93, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lql;Lcca;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class682(class766 arg0, class257 arg1, BigInteger arg2, BigInteger arg3) {
        this.field9686 = arg2;
        this.field9690 = arg1;
        this.field9692 = arg0;
        this.field9689 = arg3;
        if (!this.field9692.method4220(20)) {
            this.field9682 = this.field9692.method4215(true, 255, (byte) 0, (byte) -67, 255);
        }
    }
}
