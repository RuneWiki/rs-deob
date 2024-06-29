import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class295 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public int field4701 = 0;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Z")
    private boolean field4716 = false;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public int field4722 = 0;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field4705 = 0;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Llm;")
    public static class150 field4708 = new class150(4);

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public int field4699;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public int field4700;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public int field4703;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public int field4704;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public int field4712;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public int field4713;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public int field4715;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    private int field4717;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "J")
    public long field4698;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "Lnh;")
    public static class305 field4718;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "Lnh;")
    public static class305 field4720;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILbj;I)V")
    private final void method1977(int arg0, class215 arg1, int arg2) {
        if (arg0 != 28204) {
            field4705 = -122;
        }
        if (arg2 == 1) {
            this.field4717 = arg1.method1379(-95);
        } else if (arg2 == 2) {
            arg1.method1374((byte) -60);
        } else if (arg2 == 3) {
            this.field4715 = arg1.method1383((byte) 102);
            this.field4712 = arg1.method1383((byte) -66);
            this.field4700 = arg1.method1383((byte) 114);
        } else if (arg2 == 4) {
            this.field4714 = arg1.method1374((byte) -60);
            this.field4703 = arg1.method1383((byte) -119);
        } else if (arg2 == 6) {
            this.field4699 = arg1.method1374((byte) -60);
        } else if (arg2 == 8) {
            this.field4722 = 1;
        } else if (arg2 == 9) {
            this.field4701 = 1;
        } else if (arg2 == 10) {
            this.field4716 = true;
        }
        field4719++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method1978(int arg0, int arg1, boolean arg2, int arg3) {
        field4709++;
        if (arg1 != -11) {
            method1978(11, -48, true, 59);
        }
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg2 && arg0 >= 0) {
            int var4 = 2;
            int var5 = arg0 / arg3;
            while (var5 != 0) {
                var5 /= arg3;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg3;
                int var9 = var8 - (arg0 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
    public static final void method1979(int arg0, int arg1) {
        if (arg1 >= -113) {
            method1979(38, -122);
        }
        class39 var2 = class149.method935(-106, arg0, 2);
        field4710++;
        var2.method268((byte) -19);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLbj;)V")
    public final void method1980(byte arg0, class215 arg1) {
        if (arg0 > -33) {
            this.method1981((byte) 59);
        }
        field4702++;
        while (true) {
            int var3 = arg1.method1374((byte) -60);
            if (var3 == 0) {
                return;
            }
            this.method1977(28204, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public final void method1981(byte arg0) {
        if (arg0 != 18) {
            method1983(124, 99, 24, -52, -47, 124);
        }
        this.field4713 = class118.field1690[this.field4717];
        field4711++;
        this.field4704 = (int) Math.sqrt((double) (this.field4700 * this.field4700 + this.field4715 * this.field4715 + this.field4712 * this.field4712));
        if (this.field4703 == 0) {
            this.field4703 = 1;
        }
        if (this.field4714 == 0) {
            this.field4698 = 2147483647L;
        } else if (this.field4714 == 1) {
            this.field4698 = (long) (this.field4704 * 8 / this.field4703);
            this.field4698 *= this.field4698;
        } else if (this.field4714 == 2) {
            this.field4698 = (long) (this.field4704 * 8 / this.field4703);
        }
        if (this.field4716) {
            this.field4704 *= -1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static void method1982(boolean arg0) {
        field4718 = null;
        field4708 = null;
        field4720 = null;
        if (arg0) {
            method1982(true);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIII)V")
    public static final void method1983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg1 + 1;
        class129.method822(class247.field3876[arg1], arg0, -2426, arg3, arg2);
        field4721++;
        int var9 = arg5 - 1;
        class129.method822(class247.field3876[arg5], arg0, -2426, arg3, arg2);
        int var6 = var8;
        if (arg4 != 1) {
            method1983(-93, 60, -118, -9, 57, -83);
        }
        while (var9 >= var6) {
            int[] var7 = class247.field3876[var6];
            var7[arg0] = var7[arg2] = arg3;
            var6++;
        }
    }
}
