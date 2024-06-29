import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class162 {

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Lpf;")
    private class485 field1953 = new class485();

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    private int field1957;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    private int field1947;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lwb;")
    private class45 field1944;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "D")
    public static double field1956 = -1.0D;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "[Ljj;")
    public static class170[] field1952 = new class170[14];

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "[I")
    public static int[] field1959 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
    public static int[] field1938;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[I")
    public static int[] field1943;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)I", line = 5)
    public final int method782(int arg0) {
        if (arg0 == 99) {
            field1951++;
            return this.field1947;
        } else {
            return 75;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 22)
    public static void method783(int arg0) {
        field1952 = null;
        field1938 = null;
        if (arg0 != 0) {
            field1952 = null;
        }
        field1959 = null;
        field1943 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lgf;B)V", line = 37)
    private final void method784(class218 arg0, byte arg1) {
        if (arg0 != null) {
            arg0.method702((byte) -114);
            arg0.method104((byte) -79);
            this.field1947 += arg0.field3060;
        }
        field1940++;
        if (arg1 != 7) {
            this.field1947 = 100;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIBI)I", line = 56)
    public static final int method785(boolean arg0, int arg1, byte arg2, int arg3) {
        field1939++;
        int var4 = 57 / ((16 - arg2) / 49);
        class458 var5 = class230.method1272((byte) -128, arg0, arg1);
        if (var5 == null) {
            return 0;
        } else if (arg3 >= 0 && arg3 < var5.field6454.length) {
            return var5.field6454[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lrs;IIIII)V", line = 75)
    public static final void method786(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3730 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class382.field5424[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class326 var13 = class364.field5236[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field3730; var14++) {
                            if (arg0.field3732[var14] == var13) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field3732[arg0.field3730++] = var13;
                        if (arg0.field3730 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field3730; var15 < 4; var15++) {
            arg0.field3732[var15] = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLvl;)Ljava/lang/Object;", line = 141)
    public final Object method787(byte arg0, class407 arg1) {
        field1958++;
        long var3 = arg1.method2391(false);
        if (arg0 != 14) {
            this.method794((Object) null, -58, (class407) null);
        }
        for (class218 var5 = (class218) this.field1944.method233(-53, var3); var5 != null; var5 = (class218) this.field1944.method237((byte) -22)) {
            if (var5.field3063.method2390(-8486, arg1)) {
                Object var6 = var5.method1221(arg0 ^ 0x41);
                if (var6 != null) {
                    if (var5.method1222(true)) {
                        class236 var7 = new class236(arg1, var6, var5.field3060);
                        this.field1944.method234(-68, var5.field1776, var7);
                        this.field1953.method2866(var7, 674847596);
                        var7.field199 = 0L;
                        var5.method702((byte) -114);
                        var5.method104((byte) -114);
                    } else {
                        this.field1953.method2866(var5, arg0 + 674847582);
                        var5.field199 = 0L;
                    }
                    return var6;
                }
                var5.method702((byte) -114);
                var5.method104((byte) -100);
                this.field1947 += var5.field3060;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I", line = 194)
    public final int method788(boolean arg0) {
        field1949++;
        if (arg0) {
            this.field1953 = null;
        }
        return this.field1957;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V", line = 211)
    public final void method789(int arg0) {
        this.field1953.method2864(551432450);
        field1945++;
        this.field1944.method236(3);
        if (arg0 >= 115) {
            this.field1947 = this.field1957;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILvl;)V", line = 224)
    private final void method790(int arg0, class407 arg1) {
        field1946++;
        long var3 = arg1.method2391(false);
        int var5 = -105 / ((arg0 - 27) / 54);
        for (class218 var6 = (class218) this.field1944.method233(-107, var3); var6 != null; var6 = (class218) this.field1944.method237((byte) -80)) {
            if (var6.field3063.method2390(-8486, arg1)) {
                this.method784(var6, (byte) 7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)V", line = 250)
    public final void method791(byte arg0, int arg1) {
        if (class443.field6327 != null) {
            for (class218 var3 = (class218) this.field1953.method2862(2); var3 != null; var3 = (class218) this.field1953.method2869(true)) {
                if (var3.method1222(true)) {
                    if (var3.method1221(93) == null) {
                        var3.method702((byte) -114);
                        var3.method104((byte) -82);
                        this.field1947 += var3.field3060;
                    }
                } else if ((++var3.field199) > ((long) arg1)) {
                    class218 var4 = class443.field6327.method101(var3, (byte) 74);
                    this.field1944.method234(-49, var3.field1776, var4);
                    class31.method156((byte) -126, var3, var4);
                    var3.method702((byte) -114);
                    var3.method104((byte) -108);
                }
            }
        }
        if (arg0 >= -85) {
            this.method784((class218) null, (byte) -43);
        }
        field1955++;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V", line = 301)
    public final void method792(int arg0) {
        field1950++;
        for (class218 var2 = (class218) this.field1953.method2862(arg0 + arg0); var2 != null; var2 = (class218) this.field1953.method2869(true)) {
            if (var2.method1222(true)) {
                var2.method702((byte) -114);
                var2.method104((byte) -63);
                this.field1947 += var2.field3060;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/Object;BLvl;I)V", line = 325)
    private final void method793(Object arg0, byte arg1, class407 arg2, int arg3) {
        if (arg1 > -70) {
            return;
        }
        field1954++;
        if (this.field1957 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method790(116, arg2);
        this.field1947 -= arg3;
        while (this.field1947 < 0) {
            class218 var6 = (class218) this.field1953.method2865(2);
            this.method784(var6, (byte) 7);
        }
        class236 var5 = new class236(arg2, arg0, arg3);
        this.field1944.method234(-108, arg2.method2391(false), var5);
        this.field1953.method2866(var5, 674847596);
        var5.field199 = 0L;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V", line = 370)
    public class162(int arg0) {
        this.field1957 = arg0;
        this.field1947 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1944 = new class45(var2);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/Object;ILvl;)V", line = 388)
    public final void method794(Object arg0, int arg1, class407 arg2) {
        this.method793(arg0, (byte) -90, arg2, arg1);
        field1948++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)I", line = 396)
    public static final int method795(int arg0, int arg1, byte arg2) {
        if (arg2 != -35) {
            method786((class258) null, -108, 122, 89, 8, 127);
        }
        field1942++;
        int var3 = arg1 - 1 & arg0 >> 31;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }
}
