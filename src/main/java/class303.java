import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class303 {

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "Lvg;")
    private class56 field4649 = new class56(256);

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "Lvg;")
    private class56 field4656 = new class56(256);

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "Lum;")
    private class83 field4652;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Lum;")
    private class83 field4654;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "Lsc;")
    public static class270 field4648 = new class270(13, 0, 1, 0);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)Z")
    public static final boolean method2004(int arg0, int arg1, int arg2) {
        if (arg0 <= 38) {
            method2009(99, (byte) 50);
        }
        field4653++;
        return (class192.method1329(arg2, -1, arg1) | class178.method1256(13775, arg1, arg2) | class426.method2660(arg2, arg1, -89)) & class5.method23(arg1, arg2, -60);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([IIB)Lrm;")
    public final class79 method2005(int[] arg0, int arg1, byte arg2) {
        field4644++;
        if (this.field4654.method754(false) == 1) {
            return this.method2008(71, arg1, arg0, 0);
        } else if (this.field4654.method748(arg1, 12408) == 1) {
            return this.method2008(76, 0, arg0, arg1);
        } else {
            int var4 = 20 / ((arg2 - 14) / 50);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method2006(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4655++;
        if (arg2 <= 86) {
            method2011(-36, 95, -56, 66);
        }
        if (arg8 < 1 || arg5 < 1 || (class338.field5076 - 2) < arg8 || arg5 > class250.field4077 - 2) {
            return;
        }
        int var9 = arg3;
        if (arg3 < 3 && class38.method251(1, arg5, arg8)) {
            var9 = arg3 + 1;
        }
        if (!class40.field667.method416(119, class108.field1631) && !class379.method2415(-3, var9, arg8, arg5, class213.field3236)) {
            return;
        }
        if (class348.field5192 == null) {
            return;
        }
        class185.field2846.method141(arg7, 103, class376.field5542, class463.field6857[arg3], arg3, arg8, arg5);
        if (arg1 < 0) {
            return;
        }
        boolean var10 = class40.field667.field4195;
        class40.field667.field4195 = true;
        class185.field2846.method143(arg4, false, var9, arg8, arg6, arg1, class463.field6857[arg3], arg0, arg5, class376.field5542, arg3);
        class40.field667.field4195 = var10;
        return;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I)Lrm;")
    public final class79 method2007(int arg0, int arg1, int[] arg2) {
        if (arg1 != 0) {
            return null;
        }
        field4651++;
        if (this.field4652.method754(false) == 1) {
            return this.method2010(arg0, arg2, (byte) -65, 0);
        } else if (this.field4652.method748(arg0, arg1 ^ 0x3078) == 1) {
            return this.method2010(0, arg2, (byte) -65, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[II)Lrm;")
    private final class79 method2008(int arg0, int arg1, int[] arg2, int arg3) {
        field4650++;
        int var5 = arg1 ^ ((arg3 & 0xC0000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class79 var9 = (class79) this.field4656.method358((byte) -126, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class102 var10 = class102.method828(this.field4654, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class79 var11 = var10.method825();
            this.field4656.method357(var11, 1, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field1305.length;
            }
            int var12 = 123 % ((11 - arg0) / 55);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)V")
    public static final void method2009(int arg0, byte arg1) {
        field4647++;
        class472.field6930 = arg0;
        class242 var2 = class13.field144;
        synchronized (class13.field144) {
            if (arg1 != -117) {
                method2011(10, -49, 99, 55);
            }
            class13.field144.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[IBI)Lrm;")
    private final class79 method2010(int arg0, int[] arg1, byte arg2, int arg3) {
        field4645++;
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFFE) ^ arg0;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class79 var9 = (class79) this.field4656.method358((byte) -126, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class135 var10 = (class135) this.field4649.method358((byte) -119, var7);
            if (var10 == null) {
                var10 = class135.method992(this.field4652, arg3, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field4649.method357(var10, 1, var7);
            }
            class79 var11 = var10.method987(arg1);
            if (var11 == null) {
                return null;
            }
            if (arg2 != -65) {
                field4648 = null;
            }
            var10.method947((byte) 123);
            this.field4656.method357(var11, 1, var7);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)V")
    public static final void method2011(int arg0, int arg1, int arg2, int arg3) {
        field4646++;
        String var4 = "tele " + arg3 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        int var5 = -29 % ((arg1 - 32) / 59);
        class481.method2904(true, (byte) 6, var4, false);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static void method2012(int arg0) {
        field4648 = null;
        if (arg0 != 18252) {
            method2006(-96, -80, (byte) 64, 14, 31, 45, 8, 40, 127);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lum;Lum;)V")
    public class303(class83 arg0, class83 arg1) {
        this.field4652 = arg1;
        this.field4654 = arg0;
    }
}
