import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class531 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lrp;")
    private class369 field7457 = new class369();

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    private int field7464;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    private int field7459;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lpt;")
    private class451 field7461;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[B")
    public static byte[] field7462 = new byte[520];

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "[S")
    public static short[] field7472 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Ldn;")
    public static class438 field7458;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLjava/lang/Object;ILada;)V")
    private final void method3028(byte arg0, Object arg1, int arg2, class142 arg3) {
        field7470++;
        if (arg2 > this.field7464) {
            throw new IllegalStateException("s>cs");
        }
        this.method3037(arg3, -59);
        this.field7459 -= arg2;
        while (this.field7459 < 0) {
            class169 var6 = (class169) this.field7457.method2072(false);
            this.method3032(var6, 22464);
        }
        if (arg0 <= 5) {
            this.method3033((byte) 120);
        }
        class39 var5 = new class39(arg3, arg1, arg2);
        this.field7461.method2640(1, arg3.method782(5869), var5);
        this.field7457.method2070(var5, 75);
        var5.field67 = 0L;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
    public final int method3029(int arg0) {
        if (arg0 != 0) {
            method3030((byte) -14);
        }
        field7473++;
        return this.field7464;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static final void method3030(byte arg0) {
        class547.field8049 = null;
        class266.field3461 = null;
        class257.field3312 = null;
        class459.field6320 = null;
        class137.field1673 = null;
        class403.field5290 = null;
        class172.field2096 = null;
        class218.field2665 = null;
        field7468++;
        class98.field1212 = null;
        class199.field2399 = null;
        class9.field64 = null;
        class43.field350 = null;
        class80.field959 = null;
        class595.field8633 = null;
        class159.field1922 = null;
        class82.field995 = null;
        class106.field1296 = null;
        class286.field3726 = null;
        if (arg0 != -17) {
            field7472 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method3031(int arg0) {
        field7472 = null;
        field7462 = null;
        if (arg0 != -18188) {
            method3038(null, null, null, 76, null, -86, null, -34);
        }
        field7458 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lpk;I)V")
    private final void method3032(class169 arg0, int arg1) {
        field7467++;
        if (arg0 != null) {
            arg0.method3187(true);
            arg0.method48(-1);
            this.field7459 += arg0.field2064;
        }
        if (arg1 != 22464) {
            this.method3034((byte) 107);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
    public final int method3033(byte arg0) {
        field7471++;
        return arg0 == -48 ? this.field7459 : -26;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
    public final void method3034(byte arg0) {
        field7463++;
        this.field7457.method2067(123);
        this.field7461.method2642(true);
        this.field7459 = this.field7464;
        if (arg0 != 41) {
            this.field7457 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
    public final void method3035(byte arg0, int arg1) {
        field7460++;
        if (class589.field8544 != null) {
            for (class169 var3 = (class169) this.field7457.method2066((byte) -82); var3 != null; var3 = (class169) this.field7457.method2068(true)) {
                if (var3.method44(-80)) {
                    if (var3.method43(-401) == null) {
                        var3.method3187(true);
                        var3.method48(-1);
                        this.field7459 += var3.field2064;
                    }
                } else if ((long) arg1 < ++var3.field67) {
                    class169 var4 = class589.field8544.method747(var3, true);
                    this.field7461.method2640(1, var3.field7967, var4);
                    class124.method710(0, var3, var4);
                    var3.method3187(true);
                    var3.method48(-1);
                }
            }
        }
        if (arg0 <= 22) {
            this.field7457 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/Object;Lada;I)V")
    public final void method3036(Object arg0, class142 arg1, int arg2) {
        field7469++;
        if (arg2 != 0) {
            method3038(null, null, null, 98, null, 89, null, -102);
        }
        this.method3028((byte) 115, arg0, 1, arg1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lada;I)V")
    private final void method3037(class142 arg0, int arg1) {
        field7474++;
        long var3 = arg0.method782(5869);
        int var5 = -74 % ((33 - arg1) / 43);
        for (class169 var6 = (class169) this.field7461.method2645(var3, (byte) -99); var6 != null; var6 = (class169) this.field7461.method2646((byte) 76)) {
            if (var6.field2066.method783(-70, arg0)) {
                this.method3032(var6, 22464);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[[B[[BI[BI[II)I")
    public static final int method3038(int[] arg0, byte[][] arg1, byte[][] arg2, int arg3, byte[] arg4, int arg5, int[] arg6, int arg7) {
        field7466++;
        int var8 = arg0[arg3];
        int var9 = arg6[arg3] + var8;
        int var10 = arg0[arg7];
        int var11 = arg6[arg7] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg4[arg3] & 0xFF;
        int var15 = 70 / ((37 - arg5) / 59);
        if (var14 > (arg4[arg7] & 0xFF)) {
            var14 = arg4[arg7] & 0xFF;
        }
        byte[] var16 = arg1[arg3];
        byte[] var17 = arg2[arg7];
        int var18 = var12 - var8;
        int var19 = var12 - var10;
        for (int var20 = var12; var20 < var13; var20++) {
            int var21 = var17[var19++] + var16[var18++];
            if (var14 > var21) {
                var14 = var21;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public final void method3039(int arg0) {
        field7456++;
        int var2 = 87 % ((-arg0 - 80) / 39);
        for (class169 var3 = (class169) this.field7457.method2066((byte) -82); var3 != null; var3 = (class169) this.field7457.method2068(true)) {
            if (var3.method44(-120)) {
                var3.method3187(true);
                var3.method48(-1);
                this.field7459 += var3.field2064;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
    public class531(int arg0) {
        this.field7464 = arg0;
        this.field7459 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field7461 = new class451(var2);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLada;)Ljava/lang/Object;")
    public final Object method3040(byte arg0, class142 arg1) {
        if (arg0 < 22) {
            this.method3036(null, null, 4);
        }
        field7465++;
        long var3 = arg1.method782(5869);
        for (class169 var5 = (class169) this.field7461.method2645(var3, (byte) -114); var5 != null; var5 = (class169) this.field7461.method2646((byte) 71)) {
            if (var5.field2066.method783(114, arg1)) {
                Object var6 = var5.method43(-401);
                if (var6 != null) {
                    if (var5.method44(-111)) {
                        class39 var7 = new class39(arg1, var6, var5.field2064);
                        this.field7461.method2640(1, var5.field7967, var7);
                        this.field7457.method2070(var7, -90);
                        var7.field67 = 0L;
                        var5.method3187(true);
                        var5.method48(-1);
                    } else {
                        this.field7457.method2070(var5, -121);
                        var5.field67 = 0L;
                    }
                    return var6;
                }
                var5.method3187(true);
                var5.method48(-1);
                this.field7459 += var5.field2064;
            }
        }
        return null;
    }
}
