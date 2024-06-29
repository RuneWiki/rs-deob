import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class341 extends class488 {

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "[I")
    public int[] field4951;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "[I")
    public int[] field4955;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "J")
    public static long field4944 = 0L;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field4952 = 0;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "[I")
    public static int[] field4957 = new int[3];

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Z")
    public static final boolean method2168(int arg0, int arg1) {
        field4956++;
        if (arg0 == 1) {
            return arg1 == 1 || arg1 == 3 || arg1 == 5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(CZ)Z")
    public static final boolean method2169(char arg0, boolean arg1) {
        field4947++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (arg1) {
                method2171((byte) -79);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method2170(int arg0) {
        if (arg0 > -39) {
            field4957 = null;
        }
        field4957 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)I")
    public static final int method2171(byte arg0) {
        field4953++;
        class60 var1 = class736.field10316;
        boolean var2 = false;
        if (class63.field916.field10200.method3848(17503) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class282.method1804(null, var3, null, 0, 0, 94);
        }
        long var4 = class524.method3075(arg0 + 70);
        int var6 = 0;
        if (arg0 != -52) {
            method2168(-125, -58);
        }
        while (var6 < 10000) {
            var1.method450(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
            var6++;
        }
        int var7 = (int) (class524.method3075(18) - var4);
        var1.method482(0, -16777216, 100, 1, 0, 100);
        if (var2) {
            var1.method447((byte) -9);
        }
        return var7;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBLjava/lang/Object;)[B")
    public static final byte[] method2172(int arg0, int arg1, byte arg2, Object arg3) {
        if (arg2 < 44) {
            method2168(80, 81);
        }
        field4948++;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class375.method2431(arg1, arg0, var4, 137);
        } else if (arg3 instanceof class463) {
            class463 var5 = (class463) arg3;
            return var5.method2822(119, arg0, arg1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)V")
    public static final void method2173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4945++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg2 * arg2;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        if (arg4 < 14) {
            field4957 = null;
        }
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg0 >= class166.field2622 && arg0 <= class432.field6446) {
            int var20 = class462.method2818(class391.field5895, class497.field7073, arg2 + arg3, 8373);
            int var21 = class462.method2818(class391.field5895, class497.field7073, arg3 - arg2, 8373);
            class238.method1577(arg5, class664.field9322[arg0], var20, var21, (byte) -32);
        }
        int var22 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var22;
            var22 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (class166.field2622 <= var24 && class432.field6446 >= var23) {
                int var25 = class462.method2818(class391.field5895, class497.field7073, arg3 + var6, 8373);
                int var26 = class462.method2818(class391.field5895, class497.field7073, arg3 - var6, 8373);
                if (var23 >= class166.field2622) {
                    class238.method1577(arg5, class664.field9322[var23], var25, var26, (byte) 124);
                }
                if (var24 <= class432.field6446) {
                    class238.method1577(arg5, class664.field9322[var24], var25, var26, (byte) -107);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static final void method2174(int arg0) {
        field4954++;
        int var1 = class254.field3653;
        int[] var2 = class345.field4993;
        for (int var3 = 0; var3 < var1; var3++) {
            class689 var4 = class314.field4456[var2[var3]];
            if (var4 != null) {
                class10.method70(var4.method2579(false), var4, (byte) -62);
            }
        }
        if (arg0 >= -41) {
            field4944 = 72L;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(II[I[I)V")
    public class341(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4951 = arg2;
        this.field4955 = arg3;
    }
}
