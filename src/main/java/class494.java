import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class494 {

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "Lpf;")
    private class30 field6784;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    private int field6773;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    private int field6782;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "Lsi;")
    private class769 field6788;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "Lin;")
    public static class380 field6770 = new class380(82, -1);

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "Lin;")
    public static class380 field6781 = new class380(23, 3);

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "Lfe;")
    public static class345 field6785 = new class345();

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "Z")
    public static boolean field6789 = false;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
    public final void method2881(byte arg0) {
        this.field6784.method253((byte) -18);
        field6771++;
        if (arg0 < -9) {
            this.field6788.method4249((byte) 89);
            this.field6773 = this.field6782;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method2882(long arg0, byte arg1) {
        if (arg1 > -26) {
            return null;
        }
        field6772++;
        class486 var4 = (class486) this.field6788.method4253(arg0, -1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method2642((byte) 104);
        if (var5 == null) {
            var4.method4237(-1);
            var4.method2665(24902);
            this.field6773 += var4.field6698;
            return null;
        }
        if (var4.method2643(85)) {
            class446 var6 = new class446(var5, var4.field6698);
            this.field6788.method4252(false, var6, var4.field10592);
            this.field6784.method248((byte) 48, var6);
            var6.field6209 = 0L;
            var4.method4237(-1);
            var4.method2665(24902);
        } else {
            this.field6784.method248((byte) 99, var4);
            var4.field6209 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method2883(int arg0) {
        field6785 = null;
        if (arg0 != 3) {
            method2894(37);
        }
        field6781 = null;
        field6770 = null;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)I")
    public final int method2884(int arg0) {
        field6776++;
        int var2 = 0;
        class486 var3 = (class486) this.field6784.method249(arg0 + 45563);
        if (arg0 != -27192) {
            this.method2893((byte) 9);
        }
        while (var3 != null) {
            if (!var3.method2643(arg0 + 27118)) {
                var2++;
            }
            var3 = (class486) this.field6784.method254((byte) -64);
        }
        return var2;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLvfa;)V")
    private final void method2885(byte arg0, class486 arg1) {
        if (arg1 != null) {
            arg1.method4237(-1);
            arg1.method2665(24902);
            this.field6773 += arg1.field6698;
        }
        if (arg0 <= 109) {
            this.method2890(16, -76L, null);
        }
        field6786++;
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(I)V")
    public class494(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)Leq;")
    public static final class371 method2886(int arg0) {
        field6783++;
        class371 var1 = (class371) class13.field160.method249(18371);
        if (var1 != null) {
            var1.method4237(-1);
            var1.method2665(24902);
            return var1;
        }
        if (arg0 > -24) {
            method2894(108);
        }
        class371 var2;
        do {
            var2 = (class371) class752.field10455.method249(18371);
            if (var2 == null) {
                return null;
            }
            if (var2.method2211(-1011348) > class337.method2062(false)) {
                return null;
            }
            var2.method4237(-1);
            var2.method2665(24902);
        } while ((var2.field6209 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2887(int arg0) {
        int var2 = 72 % ((arg0 - 46) / 39);
        field6774++;
        class486 var3 = (class486) this.field6788.method4254((byte) 8);
        while (var3 != null) {
            Object var4 = var3.method2642((byte) 113);
            if (var4 != null) {
                return var4;
            }
            class486 var5 = var3;
            var3 = (class486) this.field6788.method4251(-68);
            var5.method4237(-1);
            var5.method2665(24902);
            this.field6773 += var5.field6698;
        }
        return null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
    public final void method2888(int arg0, int arg1) {
        if (class740.field10248 != null) {
            for (class486 var3 = (class486) this.field6784.method249(18371); var3 != null; var3 = (class486) this.field6784.method254((byte) -64)) {
                if (var3.method2643(55)) {
                    if (var3.method2642((byte) 104) == null) {
                        var3.method4237(-1);
                        var3.method2665(24902);
                        this.field6773 += var3.field6698;
                    }
                } else if ((++var3.field6209) > ((long) arg0)) {
                    class486 var4 = class740.field10248.method686(var3, 8192);
                    this.field6788.method4252(false, var4, var3.field10592);
                    class631.method3600(var3, 0, var4);
                    var3.method4237(-1);
                    var3.method2665(24902);
                }
            }
        }
        if (arg1 <= 115) {
            field6781 = null;
        }
        field6787++;
    }

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)I")
    public final int method2889(int arg0) {
        if (arg0 != 1) {
            field6785 = null;
        }
        field6780++;
        return this.field6782;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IJLjava/lang/Object;)V")
    public final void method2890(int arg0, long arg1, Object arg2) {
        field6766++;
        if (arg0 == -7307) {
            this.method2891(-1, arg2, 1, arg1);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILjava/lang/Object;IJ)V")
    public final void method2891(int arg0, Object arg1, int arg2, long arg3) {
        field6769++;
        if (this.field6782 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method2896(arg3, true);
        this.field6773 -= arg2;
        while (this.field6773 < 0) {
            class486 var7 = (class486) this.field6784.method247(-32331);
            this.method2885((byte) 113, var7);
        }
        if (arg0 != -1) {
            field6781 = null;
        }
        class446 var6 = new class446(arg1, arg2);
        this.field6788.method4252(false, var6, arg3);
        this.field6784.method248((byte) 111, var6);
        var6.field6209 = 0L;
    }

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)I")
    public final int method2892(int arg0) {
        field6777++;
        if (arg0 <= 93) {
            this.method2890(-103, 61L, null);
        }
        return this.field6773;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V")
    public final void method2893(byte arg0) {
        for (class486 var2 = (class486) this.field6784.method249(18371); var2 != null; var2 = (class486) this.field6784.method254((byte) -64)) {
            if (var2.method2643(124)) {
                var2.method4237(-1);
                var2.method2665(24902);
                this.field6773 += var2.field6698;
            }
        }
        int var3 = 31 % ((43 - arg0) / 33);
        field6767++;
    }

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)V")
    public static final void method2894(int arg0) {
        field6779++;
        short var1 = 1024;
        short var2 = 3072;
        if (class765.field10581) {
            if (class347.field4935) {
                var1 = 2048;
            }
            var2 = 4096;
        }
        if ((float) var1 > class208.field3031) {
            class208.field3031 = var1;
        }
        if ((float) var2 < class208.field3031) {
            class208.field3031 = var2;
        }
        while (class98.field1423 >= 16384.0F) {
            class98.field1423 -= 16384.0F;
        }
        while (class98.field1423 < 0.0F) {
            class98.field1423 += 16384.0F;
        }
        int var3 = class335.field4760 >> 9;
        int var4 = class478.field6577 >> 9;
        int var5 = class577.method3399(class478.field6577, class335.field4760, arg0 - 8720, class403.field5560);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && var3 < (class192.field2891 - 4) && var4 < (class456.field6225 - 4)) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class403.field5560;
                    if (var9 < 3 && class717.method3994(32281, var7, var8)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class465.field6343.field10555 != null && class465.field6343.field10555[var9] != null) {
                        var10 = (class465.field6343.field10555[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class678.field9594 != null && class678.field9594[var9] != null) {
                        int var11 = var5 + var10 - class678.field9594[var9].method2476(var8, var7, -1);
                        if (var6 < var11) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (var12 > class547.field7577) {
            class547.field7577 += (var12 - class547.field7577) / 24;
        } else if (class547.field7577 > var12) {
            class547.field7577 += (var12 - class547.field7577) / 80;
        }
        if (arg0 != -4) {
            method2883(-78);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method2895(boolean arg0) {
        if (!arg0) {
            method2894(77);
        }
        field6778++;
        class486 var2 = (class486) this.field6788.method4251(-71);
        while (var2 != null) {
            Object var3 = var2.method2642((byte) 111);
            if (var3 != null) {
                return var3;
            }
            class486 var4 = var2;
            var2 = (class486) this.field6788.method4251(-120);
            var4.method4237(-1);
            var4.method2665(24902);
            this.field6773 += var4.field6698;
        }
        return null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(JZ)V")
    private final void method2896(long arg0, boolean arg1) {
        field6775++;
        class486 var4 = (class486) this.field6788.method4253(arg0, -1);
        this.method2885((byte) 114, var4);
        if (!arg1) {
            field6785 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(II)V")
    public class494(int arg0, int arg1) {
        this.field6784 = new class30();
        this.field6773 = arg0;
        this.field6782 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && arg1 > var3; var3 += var3) {
        }
        this.field6788 = new class769(var3);
    }
}
