import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class369 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lma;")
    private class14 field4990;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lus;")
    private class1 field5002;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5001;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5004;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lbj;")
    private class257 field4989;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "[I")
    public static int[] field4997 = new int[2];

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "F")
    public static float field4992;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lgj;")
    public static class662 field4998;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lha;")
    public static class66 field5000;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lfca;")
    private class93 field4993;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "[Ldu;")
    private class377[] field4999;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILrt;ZLrt;)Ldu;")
    public final class377 method2243(int arg0, class241 arg1, boolean arg2, class241 arg3) {
        field4991++;
        if (!arg2) {
            method2244(-88);
        }
        return this.method2248(arg0, arg1, true, (byte) -86, arg3);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method2244(int arg0) {
        field4997 = null;
        field5000 = null;
        field4998 = null;
        if (arg0 >= -13) {
            field5000 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILafa;)I")
    public static final int method2245(int arg0, class365 arg1) {
        if (arg0 != 34023) {
            field5000 = null;
        }
        field4995++;
        if (class371.field5051 == arg1) {
            return 7681;
        } else if (class671.field9318 == arg1) {
            return 8448;
        } else if (class34.field565 == arg1) {
            return 34165;
        } else if (class639.field8801 == arg1) {
            return 260;
        } else if (class726.field9977 == arg1) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public final void method2246(int arg0) {
        field5003++;
        if (this.field4999 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4999.length; var2++) {
            if (this.field4999[var2] != null) {
                this.field4999[var2].method2295((byte) -71);
            }
        }
        int var3 = -27 / ((arg0 - 15) / 53);
        for (int var4 = 0; var4 < this.field4999.length; var4++) {
            if (this.field4999[var4] != null) {
                this.field4999[var4].method2299((byte) -89);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Z")
    public final boolean method2247(int arg0) {
        field4994++;
        if (this.field4993 != null) {
            return true;
        }
        if (this.field4989 == null) {
            if (this.field5002.method8(arg0 ^ 0xFFFFA58F)) {
                return false;
            }
            this.field4989 = this.field5002.method1(true, (byte) -50, 255, 255, (byte) 0);
        }
        if (this.field4989.field2489) {
            return false;
        }
        class93 var2 = new class93(this.field4989.method1194((byte) 118));
        var2.field1442 = arg0;
        int var3 = var2.method793((byte) 84);
        var2.field1442 += var3 * 72;
        byte[] var4 = new byte[var2.field1413.length - var2.field1442];
        var2.method737(arg0 ^ 0xFFFF8005, var4, 0, var4.length);
        byte[] var7;
        if (this.field5004 == null || this.field5001 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field5004, this.field5001);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class323.method2056((byte) -122, var2.field1442 - var4.length - 5, var2.field1413, 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field4993 = var2;
        this.field4999 = new class377[var3];
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILrt;ZBLrt;)Ldu;")
    private final class377 method2248(int arg0, class241 arg1, boolean arg2, byte arg3, class241 arg4) {
        field4996++;
        if (this.field4993 == null) {
            throw new RuntimeException();
        } else if (arg0 < 0 || this.field4999.length <= arg0) {
            throw new RuntimeException();
        } else if (this.field4999[arg0] == null) {
            this.field4993.field1442 = arg0 * 72 + 6;
            int var6 = this.field4993.method773(3);
            int var7 = this.field4993.method773(arg3 ^ 0xFFFFFFA9);
            byte[] var8 = new byte[64];
            this.field4993.method737(arg3 - 32682, var8, 0, 64);
            class377 var9 = new class377(arg0, arg4, arg1, this.field5002, this.field4990, var6, var8, var7, arg2);
            if (arg3 != -86) {
                this.field4990 = null;
            }
            this.field4999[arg0] = var9;
            return var9;
        } else {
            return this.field4999[arg0];
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lus;Lma;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class369(class1 arg0, class14 arg1, BigInteger arg2, BigInteger arg3) {
        this.field4990 = arg1;
        this.field5002 = arg0;
        this.field5001 = arg3;
        this.field5004 = arg2;
        if (!this.field5002.method8(-23158)) {
            this.field4989 = this.field5002.method1(true, (byte) -50, 255, 255, (byte) 0);
        }
    }
}
