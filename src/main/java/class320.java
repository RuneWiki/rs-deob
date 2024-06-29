import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class320 {

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public static int field4604 = 0;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "Lmga;")
    public static class739 field4605 = new class739(85, 3);

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "Lmga;")
    public static class739 field4616 = new class739(10, 2);

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "C")
    public char field4610;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public int field4608;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public int field4611;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public int field4613;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "[[[S")
    public static short[][][] field4615;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V")
    public static void method2030(byte arg0) {
        field4616 = null;
        field4615 = null;
        if (arg0 >= -52) {
            field4605 = null;
        }
        field4605 = null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BLjp;I)V")
    private final void method2031(byte arg0, class376 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4610 = class682.method3796((byte) 42, arg1.method2387((byte) -124));
        } else if (arg2 == 2) {
            this.field4608 = arg1.method2359(-1);
            this.field4613 = arg1.method2398(-1372747256);
            this.field4611 = arg1.method2398(-1372747256);
        }
        field4606++;
        if (arg0 < 72) {
            field4605 = null;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljp;I)V")
    public final void method2032(class376 arg0, int arg1) {
        field4609++;
        if (arg1 > -49) {
            return;
        }
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                return;
            }
            this.method2031((byte) 104, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)V")
    public static final void method2033(byte arg0) {
        field4612++;
        short var1 = 1024;
        short var2 = 3072;
        if (class200.field2658) {
            if (class110.field1518) {
                var1 = 2048;
            }
            var2 = 4096;
        }
        if ((float) var1 > class282.field4151) {
            class282.field4151 = var1;
        }
        if ((float) var2 < class282.field4151) {
            class282.field4151 = var2;
        }
        if (arg0 != 59) {
            method2033((byte) -124);
        }
        while (class135.field1974 >= 16384.0F) {
            class135.field1974 -= 16384.0F;
        }
        while (class135.field1974 < 0.0F) {
            class135.field1974 += 16384.0F;
        }
        int var3 = class262.field3888 >> 9;
        int var4 = class400.field5843 >> 9;
        int var5 = class783.method4338(class610.field8296, class262.field3888, arg0 - 12099, class400.field5843);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && class597.field8132 - 4 > var3 && (class628.field8800 - 4) > var4) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class610.field8296;
                    if (var9 < 3 && class74.method661(var7, var8, 1)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class556.field7502.field2885 != null && class556.field7502.field2885[var9] != null) {
                        var10 = (class556.field7502.field2885[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class528.field7227 != null && class528.field7227[var9] != null) {
                        int var11 = var5 + var10 - class528.field7227[var9].method1880(var7, false, var8);
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
        if (class363.field5289 < var12) {
            class363.field5289 += (var12 - class363.field5289) / 24;
        } else if (var12 < class363.field5289) {
            class363.field5289 += (var12 - class363.field5289) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(B)Lfi;")
    public static final class583 method2034(byte arg0) {
        field4614++;
        try {
            return new class531();
        } catch (Throwable var2) {
            if (arg0 <= 17) {
                field4604 = 104;
            }
            try {
                return (class583) Class.forName("ow").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class68();
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IILhj;III)V")
    public static final void method2035(int arg0, int arg1, class596 arg2, int arg3, int arg4, int arg5) {
        field4607++;
        if (arg4 >= 1 && arg1 >= 1 && (class597.field8132 - 2) >= arg4 && (class628.field8800 - 2) >= arg1) {
            if (class626.field8501 == null) {
                return;
            }
            class392 var6 = class556.field7502.method1446(arg0, arg3, (byte) -119, arg4, arg1);
            if (var6 != null) {
                if (var6 instanceof class282) {
                    ((class282) var6).method1814(arg2, -112);
                } else if ((var6 instanceof class518)) {
                    ((class518) var6).method3002(arg2, false);
                } else if ((var6 instanceof class8)) {
                    ((class8) var6).method63(131072, arg2);
                } else if (var6 instanceof class4) {
                    ((class4) var6).method26(-107, arg2);
                }
            }
        }
        if (arg5 != 1) {
            method2035(-51, -69, null, 95, 111, 54);
        }
    }
}
