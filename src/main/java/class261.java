import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class261 {

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lbc;")
    private class365 field3763;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3754;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3768;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Liq;")
    private class605 field3765;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Liba;")
    private class529 field3767;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field3764 = 0;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field3766 = 0;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lee;")
    private class675 field3755;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[Lcp;")
    private class723[] field3759;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBII)I")
    public static final int method1706(int arg0, byte arg1, int arg2, int arg3) {
        field3757++;
        if (arg0 == arg2) {
            return arg2;
        }
        int var4 = 128 - arg3;
        int var5 = -118 / ((arg1 + 28) / 51);
        int var6 = (arg0 & 0x7F) * arg3 + (arg2 & 0x7F) * var4 >> 7;
        int var7 = (arg0 & 0x380) * arg3 + (arg2 & 0x380) * var4 >> 7;
        int var8 = (arg0 & 0xFC00) * arg3 + (arg2 & 0xFC00) * var4 >> 7;
        return var6 & 0x7F | var7 & 0x380 | var8 & 0xFC00;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    public static final int method1707(int arg0, int arg1) {
        field3761++;
        if (arg1 >= -104) {
            method1707(30, 5);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILmda;Lmda;ZB)Lcp;")
    private final class723 method1708(int arg0, class263 arg1, class263 arg2, boolean arg3, byte arg4) {
        field3753++;
        if (this.field3755 == null) {
            throw new RuntimeException();
        } else if (arg0 < 0 || this.field3759.length <= arg0) {
            throw new RuntimeException();
        } else if (this.field3759[arg0] == null) {
            this.field3755.field9146 = arg0 * 72 + 6;
            if (arg4 <= 33) {
                field3756 = 27;
            }
            int var6 = this.field3755.method3703(102);
            int var7 = this.field3755.method3703(105);
            byte[] var8 = new byte[64];
            this.field3755.method3723(var8, 4, 64, 0);
            class723 var9 = new class723(arg0, arg1, arg2, this.field3765, this.field3763, var6, var8, var7, arg3);
            this.field3759[arg0] = var9;
            return var9;
        } else {
            return this.field3759[arg0];
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I")
    public static final int method1709(int arg0, int arg1, int arg2) {
        field3760++;
        int var3 = class128.method859(arg1 - 1, arg0 + 2013416686, arg2 - 1) + class128.method859(arg1 - 1, arg0 ^ 0x78024D12, arg2 + 1) - (-class128.method859(arg1 + 1, 2013416941, arg2 + -1) + -class128.method859(arg1 + 1, arg0 ^ 0x78024D12, arg2 + 1));
        if (arg0 == 255) {
            int var4 = class128.method859(arg1, 2013416941, arg2 - 1) - (-class128.method859(arg1, 2013416941, arg2 + 1) - class128.method859(arg1 - 1, arg0 + 2013416686, arg2) - class128.method859(arg1 + 1, 2013416941, arg2));
            int var5 = class128.method859(arg1, 2013416941, arg2);
            return var3 / 16 + var4 / 8 + (var5 / 4);
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z")
    public final boolean method1710(int arg0) {
        field3758++;
        if (this.field3755 != null) {
            return true;
        }
        if (this.field3767 == null) {
            if (this.field3765.method3410((byte) 109)) {
                return false;
            }
            this.field3767 = this.field3765.method3398((byte) 75, true, (byte) 0, 255, 255);
        }
        if (this.field3767.field4256) {
            return false;
        }
        class675 var2 = new class675(this.field3767.method735((byte) 68));
        var2.field9146 = 5;
        int var3 = var2.method3750((byte) 35);
        var2.field9146 += var3 * 72;
        byte[] var4 = new byte[var2.field9154.length - var2.field9146];
        var2.method3723(var4, 4, var4.length, 0);
        byte[] var7;
        if (this.field3768 == null || this.field3754 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field3768, this.field3754);
            var7 = var6.toByteArray();
        }
        if (var7.length != arg0) {
            throw new RuntimeException();
        }
        byte[] var8 = class739.method4131(var2.field9154, var2.field9146 - var4.length - 5, 35, 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field3755 = var2;
        this.field3759 = new class723[var3];
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public final void method1711(byte arg0) {
        field3762++;
        if (this.field3759 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3759.length; var2++) {
            if (this.field3759[var2] != null) {
                this.field3759[var2].method4059((byte) 102);
            }
        }
        for (int var3 = 0; var3 < this.field3759.length; var3++) {
            if (this.field3759[var3] != null) {
                this.field3759[var3].method4060((byte) -120);
            }
        }
        int var4 = -34 % ((arg0 + 13) / 40);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Liq;Lbc;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class261(class605 arg0, class365 arg1, BigInteger arg2, BigInteger arg3) {
        this.field3763 = arg1;
        this.field3754 = arg3;
        this.field3768 = arg2;
        this.field3765 = arg0;
        if (!this.field3765.method3410((byte) 114)) {
            this.field3767 = this.field3765.method3398((byte) 75, true, (byte) 0, 255, 255);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILmda;Lmda;)Lcp;")
    public final class723 method1712(int arg0, int arg1, class263 arg2, class263 arg3) {
        if (arg1 != 1) {
            method1709(-29, 61, 77);
        }
        field3752++;
        return this.method1708(arg0, arg3, arg2, true, (byte) 70);
    }
}
