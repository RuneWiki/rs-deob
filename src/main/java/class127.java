import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class127 {

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Lmc;")
    private class384 field1665 = new class384();

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "Lica;")
    private class205 field1680;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "Lqu;")
    public static class364 field1681 = new class364(42, 3);

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "Lqp;")
    public static class586 field1683 = new class586(17, -2);

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "Lnj;")
    public static class487 field1685 = new class487("M", "M", "M", "M");

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "Lgv;")
    public static class300 field1682;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "Lqp;")
    public static class586 field1686;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)I", line = 3)
    public final int method779(int arg0) {
        field1669++;
        if (arg0 != 1998) {
            field1682 = null;
        }
        return this.field1673;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V", line = 14)
    public static final void method780(int arg0, int arg1, int arg2) {
        if (arg2 != -21791) {
            field1686 = null;
        }
        field1668++;
        class621 var3 = class442.method2691(arg1, 14, true);
        var3.method3592((byte) 115);
        var3.field9068 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)V", line = 29)
    public final void method781(int arg0, byte arg1) {
        if (arg1 != 124) {
            field1683 = null;
        }
        field1678++;
        if (class232.field3424 == null) {
            return;
        }
        for (class331 var3 = (class331) this.field1665.method2333(-1); var3 != null; var3 = (class331) this.field1665.method2327(arg1 + 9881)) {
            if (var3.method121((byte) -117)) {
                if (var3.method122((byte) 127) == null) {
                    var3.method2997(1);
                    var3.method3225(-124);
                    this.field1675 += var3.field4904;
                }
            } else if (++var3.field8204 > (long) arg0) {
                class331 var4 = class232.field3424.method123(arg1 - 24, var3);
                this.field1680.method1341(var4, (byte) 99, var3.field7465);
                class614.method3574(var3, -15952, var4);
                var3.method2997(1);
                var3.method3225(-71);
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V", line = 83)
    public final void method782(boolean arg0) {
        this.field1665.method2334((byte) -97);
        field1671++;
        this.field1680.method1332(-22538);
        if (!arg0) {
            this.method791(117);
        }
        this.field1675 = this.field1673;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/Object;Lws;I)V", line = 96)
    public final void method783(Object arg0, class531 arg1, int arg2) {
        if (arg2 != -30708) {
            this.field1673 = -51;
        }
        field1674++;
        this.method789(1, arg0, arg1, true);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 107)
    public final void method784(int arg0) {
        for (class331 var2 = (class331) this.field1665.method2333(-1); var2 != null; var2 = (class331) this.field1665.method2327(10005)) {
            if (var2.method121((byte) 19)) {
                var2.method2997(1);
                var2.method3225(-126);
                this.field1675 += var2.field4904;
            }
        }
        if (arg0 < 37) {
            this.method782(false);
        }
        field1672++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILws;)V", line = 133)
    private final void method785(int arg0, class531 arg1) {
        field1670++;
        long var3 = arg1.method540(21242);
        for (class331 var5 = (class331) this.field1680.method1333(var3, false); var5 != null; var5 = (class331) this.field1680.method1338(-1)) {
            if (var5.field4905.method541(true, arg1)) {
                this.method786(var5, false);
                break;
            }
        }
        if (arg0 <= 65) {
            method790(-81, -106, null, null, 123, -31, 58, (byte) -125, 123L);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lvn;Z)V", line = 159)
    private final void method786(class331 arg0, boolean arg1) {
        if (arg0 != null) {
            arg0.method2997(1);
            arg0.method3225(-46);
            this.field1675 += arg0.field4904;
        }
        if (arg1) {
            method780(56, 28, -86);
        }
        field1679++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lws;I)Ljava/lang/Object;", line = 180)
    public final Object method787(class531 arg0, int arg1) {
        field1666++;
        long var3 = arg0.method540(arg1 ^ 0x4C3C);
        if (arg1 != 7878) {
            this.field1680 = null;
        }
        for (class331 var5 = (class331) this.field1680.method1333(var3, false); var5 != null; var5 = (class331) this.field1680.method1338(arg1 - 7879)) {
            if (var5.field4905.method541(true, arg0)) {
                Object var6 = var5.method122((byte) 117);
                if (var6 != null) {
                    if (var5.method121((byte) -113)) {
                        class362 var7 = new class362(arg0, var6, var5.field4904);
                        this.field1680.method1341(var7, (byte) 58, var5.field7465);
                        this.field1665.method2331(2, var7);
                        var7.field8204 = 0L;
                        var5.method2997(1);
                        var5.method3225(arg1 - 7988);
                    } else {
                        this.field1665.method2331(2, var5);
                        var5.field8204 = 0L;
                    }
                    return var6;
                }
                var5.method2997(1);
                var5.method3225(arg1 ^ 0xFFFFE17F);
                this.field1675 += var5.field4904;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V", line = 236)
    public static void method788(int arg0) {
        field1686 = null;
        field1683 = null;
        field1682 = null;
        if (arg0 == -18026) {
            field1685 = null;
            field1681 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjava/lang/Object;Lws;Z)V", line = 253)
    private final void method789(int arg0, Object arg1, class531 arg2, boolean arg3) {
        field1667++;
        if (!arg3) {
            return;
        }
        if (this.field1673 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method785(80, arg2);
        this.field1675 -= arg0;
        while (this.field1675 < 0) {
            class331 var6 = (class331) this.field1665.method2332(false);
            this.method786(var6, false);
        }
        class362 var5 = new class362(arg2, arg1, arg0);
        this.field1680.method1341(var5, (byte) 40, arg2.method540(21242));
        this.field1665.method2331(2, var5);
        var5.field8204 = 0L;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILpa;Lwca;IIIBJ)V", line = 285)
    public static final void method790(int arg0, int arg1, class594 arg2, class311 arg3, int arg4, int arg5, int arg6, byte arg7, long arg8) {
        field1677++;
        int var10 = arg4 * arg4 + (arg5 * arg5);
        if (arg7 != 5) {
            method780(-22, -119, 6);
        }
        if (((long) var10) > arg8) {
            return;
        }
        int var11 = Math.min(arg3.field4543 / 2, arg3.field4620 / 2);
        if (var11 * var11 >= var10) {
            class169.method1075(arg5, true, arg6, class128.field1691[arg0], arg4, arg3, arg1, arg2);
            return;
        }
        var11 -= 10;
        int var12;
        if (class287.field4232 == 4) {
            var12 = (int) class591.field8752 & 0x3FFF;
        } else {
            var12 = (int) class591.field8752 + class225.field3322 & 0x3FFF;
        }
        int var13 = class14.field129[var12];
        int var14 = class14.field130[var12];
        if (class287.field4232 != 4) {
            var14 = var14 * 256 / (class99.field1254 + 256);
            var13 = var13 * 256 / (class99.field1254 + 256);
        }
        int var15 = arg5 * var13 + (arg4 * var14) >> 15;
        int var16 = arg5 * var14 - (arg4 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class168.field2276[arg0].method716((float) arg3.field4543 / 2.0F + (float) arg6 + (float) var19, (float) arg3.field4620 / 2.0F + (float) arg1 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)I", line = 337)
    public final int method791(int arg0) {
        field1676++;
        return arg0 == 14 ? this.field1675 : 51;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I)V", line = 357)
    public class127(int arg0) {
        this.field1673 = arg0;
        this.field1675 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1680 = new class205(var2);
    }
}
