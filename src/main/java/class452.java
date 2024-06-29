import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class452 {

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6225;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "Lfd;")
    private class297 field6220;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6216;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "Lwm;")
    private class28 field6226;

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "Lab;")
    private class651 field6227;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "[I")
    public static int[] field6222 = new int[14];

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "[I")
    public static int[] field6231 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "F")
    public static float field6217;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!ega", name = "q", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!ega", name = "r", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "Lvj;")
    private class26 field6230;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "[Lat;")
    private class376[] field6218;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IILhca;Lhca;Z)Lat;")
    private final class376 method2718(int arg0, int arg1, class244 arg2, class244 arg3, boolean arg4) {
        field6232++;
        if (this.field6230 == null) {
            throw new RuntimeException();
        } else if (arg0 < 0 || this.field6218.length <= arg0) {
            throw new RuntimeException();
        } else if (this.field6218[arg0] == null) {
            this.field6230.field330 = arg0 * 72 + 6;
            int var6 = this.field6230.method189(255);
            int var7 = this.field6230.method189(arg1 + 255);
            byte[] var8 = new byte[64];
            this.field6230.method149(var8, arg1, (byte) -62, 64);
            class376 var9 = new class376(arg0, arg2, arg3, this.field6220, this.field6226, var6, var8, var7, arg4);
            this.field6218[arg0] = var9;
            return var9;
        } else {
            return this.field6218[arg0];
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
    public static void method2719(byte arg0) {
        field6231 = null;
        if (arg0 > 96) {
            field6222 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)Z")
    public final boolean method2720(int arg0) {
        field6229++;
        if (this.field6230 != null) {
            return true;
        }
        if (this.field6227 == null) {
            if (this.field6220.method1746(1)) {
                return false;
            }
            this.field6227 = this.field6220.method1753(255, 4, true, (byte) 0, 255);
        }
        if (this.field6227.field846) {
            return false;
        }
        class26 var2 = new class26(this.field6227.method406(0));
        var2.field330 = 5;
        if (arg0 >= -114) {
            this.field6216 = null;
        }
        int var3 = var2.method194((byte) 119);
        var2.field330 += var3 * 72;
        byte[] var4 = new byte[var2.field279.length - var2.field330];
        var2.method149(var4, 0, (byte) -73, var4.length);
        byte[] var7;
        if (this.field6216 == null || this.field6225 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field6216, this.field6225);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class175.method1103(var2.field330 - var4.length - 5, 5, (byte) 86, var2.field279);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field6230 = var2;
        this.field6218 = new class376[var3];
        return true;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)V")
    public static final void method2721(int arg0, int arg1) {
        field6233++;
        class118 var2 = class126.method814(true, arg0, 5);
        if (arg1 != 4) {
            field6222 = null;
        }
        var2.method778(27970);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BILhca;Lhca;)Lat;")
    public final class376 method2722(byte arg0, int arg1, class244 arg2, class244 arg3) {
        int var5 = 27 % ((-arg0 - 68) / 39);
        field6228++;
        return this.method2718(arg1, 0, arg2, arg3, true);
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(II)I")
    public static final int method2723(int arg0, int arg1) {
        field6221++;
        if (arg1 != 1) {
            method2726(-101);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIZI)V")
    public static final void method2724(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (class490.field6592 <= (arg4 - arg1) && (arg1 + arg4) <= class116.field1628 && class675.field9512 <= (arg0 - arg1) && (arg0 + arg1) <= class395.field5484) {
            class160.method1004(arg0, arg2, arg1, -76, arg4);
        } else {
            class88.method531(arg0, arg4, arg2, -1, arg1);
        }
        field6219++;
        if (!arg3) {
            field6222 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lfd;Lwm;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class452(class297 arg0, class28 arg1, BigInteger arg2, BigInteger arg3) {
        this.field6225 = arg3;
        this.field6220 = arg0;
        this.field6216 = arg2;
        this.field6226 = arg1;
        if (!this.field6220.method1746(1)) {
            this.field6227 = this.field6220.method1753(255, 4, true, (byte) 0, 255);
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)V")
    public final void method2725(int arg0) {
        field6224++;
        if (this.field6218 == null) {
            return;
        }
        int var2 = -31 / ((-arg0 - 46) / 37);
        for (int var3 = 0; var3 < this.field6218.length; var3++) {
            if (this.field6218[var3] != null) {
                this.field6218[var3].method2279(1);
            }
        }
        for (int var4 = 0; var4 < this.field6218.length; var4++) {
            if (this.field6218[var4] != null) {
                this.field6218[var4].method2270(true);
            }
        }
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)V")
    public static final void method2726(int arg0) {
        class734.field10279 = 0;
        field6223++;
        int var1 = class150.field2065.method192(81);
        int var2 = class150.field2065.method191(false);
        boolean var3 = class150.field2065.method174(0) == 1;
        int var4 = class150.field2065.method168(-16785);
        class615.method3605(arg0 + 108);
        class143.method936(var1, true);
        int var5 = (class542.field7582 - class150.field2065.field330) / 16;
        class57.field801 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class57.field801[var6][var10] = class150.field2065.method189(255);
            }
        }
        class86.field1193 = new int[var5];
        class378.field5269 = new int[var5];
        class9.field85 = null;
        class713.field10118 = new int[var5];
        class594.field8557 = null;
        class175.field2387 = new byte[var5][];
        class592.field8537 = new int[var5];
        class683.field9594 = new byte[var5][];
        class556.field7846 = new byte[var5][];
        class682.field9590 = new byte[var5][];
        class53.field749 = new int[var5];
        int var7 = 0;
        for (int var8 = (var4 - (class514.field7179 >> 4)) / 8; var8 <= ((class514.field7179 >> 4) + var4) / 8; var8++) {
            for (int var9 = (var2 - (class456.field6281 >> 4)) / 8; var9 <= (((class456.field6281 >> 4) + var2) / 8); var9++) {
                class592.field8537[var7] = (var8 << 8) + var9;
                class53.field749[var7] = class281.field3729.method3311((byte) -24, "m" + var8 + "_" + var9);
                class86.field1193[var7] = class281.field3729.method3311((byte) -24, "l" + var8 + "_" + var9);
                class713.field10118[var7] = class281.field3729.method3311((byte) -24, "um" + var8 + "_" + var9);
                class378.field5269[var7] = class281.field3729.method3311((byte) -24, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class92.method555(512, arg0, var4, var2, var3);
    }
}
