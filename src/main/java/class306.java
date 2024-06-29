import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class306 {

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4092;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4089;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "Lgb;")
    private class159 field4088;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "Lqt;")
    private class399 field4095;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "Lwd;")
    private class352 field4094;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "[I")
    public static int[] field4084 = new int[2048];

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "[I")
    public static int[] field4097 = new int[3];

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "[F")
    public static float[] field4087 = new float[4];

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "Lio;")
    private class157 field4096;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "Lf;")
    public static class532 field4086;

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "[Lww;")
    private class643[] field4091;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lcr;Lcr;II)Lww;")
    public final class643 method1791(class485 arg0, class485 arg1, int arg2, int arg3) {
        field4085++;
        if (arg2 != 0) {
            method1795(113);
        }
        return this.method1793(arg1, (byte) 125, arg0, true, arg3);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
    public static void method1792(byte arg0) {
        if (arg0 != 72) {
            method1792((byte) -2);
        }
        field4087 = null;
        field4097 = null;
        field4086 = null;
        field4084 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lcr;BLcr;ZI)Lww;")
    private final class643 method1793(class485 arg0, byte arg1, class485 arg2, boolean arg3, int arg4) {
        field4098++;
        if (arg1 < 118) {
            method1792((byte) -114);
        }
        if (this.field4096 == null) {
            throw new RuntimeException();
        } else if (arg4 < 0 || this.field4091.length <= arg4) {
            throw new RuntimeException();
        } else if (this.field4091[arg4] == null) {
            this.field4096.field2219 = arg4 * 72 + 6;
            int var6 = this.field4096.method908(false);
            int var7 = this.field4096.method908(false);
            byte[] var8 = new byte[64];
            this.field4096.method962(var8, -47, 64, 0);
            class643 var9 = new class643(arg4, arg0, arg2, this.field4088, this.field4095, var6, var8, var7, arg3);
            this.field4091[arg4] = var9;
            return var9;
        } else {
            return this.field4091[arg4];
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
    public final void method1794(byte arg0) {
        field4090++;
        if (this.field4091 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4091.length; var2++) {
            if (this.field4091[var2] != null) {
                this.field4091[var2].method3580(arg0 + 30385);
            }
        }
        if (arg0 != 5) {
            field4087 = null;
        }
        for (int var3 = 0; var3 < this.field4091.length; var3++) {
            if (this.field4091[var3] != null) {
                this.field4091[var3].method3579(false);
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)I")
    public static final int method1795(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class105.field1252 - 1; var2++) {
            if (arg0 < class493.field6795[var2] + class190.field2629[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class105.field1252 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)Z")
    public final boolean method1796(byte arg0) {
        field4093++;
        if (this.field4096 != null) {
            return true;
        }
        if (this.field4094 == null) {
            if (this.field4088.method980(4)) {
                return false;
            }
            this.field4094 = this.field4088.method981(255, (byte) 58, 255, (byte) 0, true);
        }
        if (this.field4094.field2536) {
            return false;
        }
        class157 var2 = new class157(this.field4094.method437(4));
        var2.field2219 = 5;
        int var3 = var2.method930(255);
        var2.field2219 += var3 * 72;
        byte[] var4 = new byte[var2.field2199.length - var2.field2219];
        var2.method962(var4, -93, var4.length, 0);
        if (arg0 < 12) {
            field4084 = null;
        }
        byte[] var7;
        if (this.field4092 == null || this.field4089 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field4092, this.field4089);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class286.method1695(var2.field2219 - var4.length - 5, var2.field2199, 5, 125);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field4096 = var2;
        this.field4091 = new class643[var3];
        return true;
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lgb;Lqt;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class306(class159 arg0, class399 arg1, BigInteger arg2, BigInteger arg3) {
        this.field4092 = arg2;
        this.field4089 = arg3;
        this.field4088 = arg0;
        this.field4095 = arg1;
        if (!this.field4088.method980(4)) {
            this.field4094 = this.field4088.method981(255, (byte) 54, 255, (byte) 0, true);
        }
    }
}
