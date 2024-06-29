import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class380 {

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Lmo;")
    private class336 field5229 = new class336(128);

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Lmo;")
    public class336 field5230 = new class336(64);

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Lnl;")
    public class435 field5226;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Lnl;")
    private class435 field5225;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Lmo;")
    public static class336 field5227;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "Lii;")
    public static class412 field5220;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public final void method2314(byte arg0) {
        class336 var2 = this.field5229;
        synchronized (this.field5229) {
            this.field5229.method2119(0);
        }
        int var3 = -78 % ((42 - arg0) / 51);
        field5221++;
        class336 var4 = this.field5230;
        synchronized (this.field5230) {
            this.field5230.method2119(0);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public final void method2315(int arg0) {
        class336 var2 = this.field5229;
        synchronized (this.field5229) {
            if (arg0 != 0) {
                this.field5230 = null;
            }
            this.field5229.method2109(-1);
        }
        field5219++;
        class336 var3 = this.field5230;
        synchronized (this.field5230) {
            this.field5230.method2109(arg0 - 1);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)V")
    public final void method2316(byte arg0, int arg1) {
        field5222++;
        class336 var3 = this.field5229;
        synchronized (this.field5229) {
            this.field5229.method2120((byte) -99, arg1);
        }
        if (arg0 <= 124) {
            method2319(70, -44, 19, 95, 37, false);
        }
        class336 var4 = this.field5230;
        synchronized (this.field5230) {
            this.field5230.method2120((byte) -126, arg1);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method2317(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5233++;
        class177[] var7 = class143.field1994;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class177 var9 = var7[var8];
            if (var9 != null && var9.field2678 == 2) {
                class285.method1885(arg1 >> 1, arg6, (byte) 84, arg4, arg5 >> 1, (var9.field2675 - class279.field4012 << 7) + var9.field2674, var9.field2685, var9.field2684 * 2, (var9.field2683 - class189.field2810 << 7) + var9.field2671);
                if (class98.field1383[0] > -1 && (class364.field5010 % 20) < 10) {
                    class77.field1137[var9.field2672].method2493(arg3 + class98.field1383[0] - 12, arg2 + -28 - -class98.field1383[1]);
                }
            }
        }
        if (!arg0) {
            field5227 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
    public static void method2318(int arg0) {
        field5220 = null;
        field5227 = null;
        int var1 = 84 / ((arg0 - 65) / 50);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method2319(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (~arg2 > arg1) {
            arg2 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        field5223++;
        int var6 = arg2 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class357.field4934 - class430.field6033) * var6 / 100 + class430.field6033;
        if (var7 < class421.field5825) {
            var7 = class421.field5825;
        } else if (class366.field5025 < var7) {
            var7 = class366.field5025;
        }
        int var8 = arg2 * var7 * 512 / (arg4 * 334);
        if (var8 < class122.field1671) {
            short var12 = class122.field1671;
            var7 = var12 * 334 * arg4 / (arg2 * 512);
            if (class366.field5025 < var7) {
                var7 = class366.field5025;
                int var13 = var7 * 512 * arg2 / (var12 * 334);
                int var14 = (arg4 - var13) / 2;
                if (arg5) {
                    class374.field5152.method360();
                    class374.field5152.method742(11, arg0, arg2, var14, -16777216, arg3);
                    class374.field5152.method742(11, arg0, arg2, var14, -16777216, arg3 + arg4 - var14);
                }
                arg3 += var14;
                arg4 -= var14 * 2;
            }
        } else if (var8 > class368.field5074) {
            short var9 = class368.field5074;
            var7 = var9 * 334 * arg4 / (arg2 * 512);
            if (class421.field5825 > var7) {
                var7 = class421.field5825;
                int var10 = arg4 * var9 * 334 / (var7 * 512);
                int var11 = (arg2 - var10) / 2;
                if (arg5) {
                    class374.field5152.method360();
                    class374.field5152.method742(arg1 + 13, arg0, var11, arg4, -16777216, arg3);
                    class374.field5152.method742(arg1 ^ 0xFFFFFFF5, arg2 + arg0 - var11, var11, arg4, -16777216, arg3);
                }
                arg0 += var11;
                arg2 -= var11 * 2;
            }
        }
        class26.field279 = arg0;
        class262.field3776 = (short) arg2;
        class12.field79 = arg3;
        class340.field4705 = arg2 * var7 / 334;
        class295.field4160 = (short) arg4;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
    public final void method2320(int arg0, int arg1, int arg2) {
        this.field5229 = new class336(arg0);
        int var4 = 86 % ((-arg1 - 17) / 56);
        field5218++;
        this.field5230 = new class336(arg2);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZ)Lwe;")
    public final class76 method2321(int arg0, boolean arg1) {
        field5228++;
        class336 var3 = this.field5229;
        class76 var4;
        synchronized (this.field5229) {
            var4 = (class76) this.field5229.method2113(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5225.method2633(36, arg0, -116);
        class76 var6 = new class76();
        var6.field1116 = this;
        var6.field1098 = arg0;
        if (!arg1) {
            method2317(true, 45, 60, -9, 115, -120, -17);
        }
        if (var5 != null) {
            var6.method673(110, new class161(var5));
        }
        var6.method675(-28232);
        class336 var7 = this.field5229;
        synchronized (this.field5229) {
            this.field5229.method2116((long) arg0, (byte) -108, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I")
    public static final int method2322(int arg0, int arg1) {
        if (arg0 != 12252) {
            method2318(-39);
        }
        field5231++;
        if (class394.field5440 != null) {
            class394.field5440.method2095(false);
            class394.field5440 = null;
        }
        class416.field5715++;
        if (class416.field5715 > 4) {
            class303.field4305 = 0;
            class416.field5715 = 0;
            return arg1;
        }
        class303.field4305 = 0;
        if (class76.field1127 == class118.field1643) {
            class118.field1643 = class46.field709;
        } else {
            class118.field1643 = class76.field1127;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Llo;ILnl;Lnl;)V")
    public class380(class280 arg0, int arg1, class435 arg2, class435 arg3) {
        this.field5226 = arg3;
        this.field5225 = arg2;
        this.field5225.method2638(1, 36);
    }

    static {
        new class151((String) null, "geschickt werden.", (String) null, (String) null);
        field5227 = new class336(200);
    }
}
