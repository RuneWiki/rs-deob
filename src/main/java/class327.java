import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class class327 {

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5048 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "[[I")
    public static int[][] field5055 = new int[5][5000];

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5056 = "";

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public int field5044;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public int field5047;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public int field5049;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public int field5052;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)I", line = 7)
    public static final int method2285(boolean arg0, int arg1) {
        if (arg0) {
            method2287((byte) -113);
        }
        field5050++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V", line = 34)
    public static final void method2286(int arg0, int arg1, int arg2) {
        field5046++;
        int var3 = 0;
        if (arg1 != -1) {
            method2287((byte) 54);
        }
        while (var3 < class303.field4642) {
            class299 var4 = class106.method792(var3, 0);
            if (var4 != null) {
                int var5 = var4.field4593;
                if (var5 >= 0 && !class164.field2662.method675(arg1 ^ 0xFFFFFF00, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field4595 >= 0) {
                    int var10 = var4.field4595;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg0 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class164.field2659[class273.method1903(96, -2, var12)];
                } else if (var5 >= 0) {
                    var6 = class164.field2659[class273.method1903(96, -2, class164.field2662.method672(-28889, var5))];
                } else if (var4.field4611 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field4611;
                    int var8 = (var7 & 0x7F) + arg2;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (var7 & 0x380) + (var7 + arg0 & 0xFC00) + var8;
                    var6 = class164.field2659[class273.method1903(96, -2, var9)];
                }
                class332.field5171[var3 + 1] = var6;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 120)
    public static void method2287(byte arg0) {
        field5048 = null;
        if (arg0 == -97) {
            field5056 = null;
            field5055 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIII)I", line = 134)
    public static final int method2288(byte arg0, int arg1, int arg2, int arg3) {
        field5053++;
        if (arg1 == arg2) {
            return arg2;
        }
        int var4 = 128 - arg3;
        int var5 = (arg1 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00;
        int var6 = (arg1 >>> 7 & 0x1FE01FE) * arg3 + (arg2 >>> 7 & 0x1FE01FE) * var4 & 0xFF00FF00;
        int var7 = -47 / ((arg0) / 62);
        return (var5 >> 7) + var6;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
    public abstract void method322(int arg0, int arg1);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)V")
    public abstract void method324(int arg0, int arg1, int arg2);
}
