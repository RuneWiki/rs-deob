import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class302 {

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public int field4383 = 0;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    private int field4381 = -1;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public int field4387 = 0;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    private int field4393 = -1;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Ljava/lang/String;")
    private String field4390 = "";

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public int field4389 = -1;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public int field4388 = 16777215;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field4380 = -1;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public int field4396 = -1;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public int field4385 = 0;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    private int field4398 = -1;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    private int field4384 = -1;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public int field4402 = 70;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Ljn;")
    public static class134 field4401 = new class134(109, 0);

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field4403 = -1;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field4404 = 0;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "[Lg;")
    public static class146[] field4405 = new class146[14];

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "Lcl;")
    public class349 field4400;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLha;)Lho;", line = 3)
    public final class318 method1969(boolean arg0, class473 arg1) {
        field4379++;
        if (this.field4381 < 0) {
            return null;
        } else if (arg0) {
            return null;
        } else {
            class318 var3 = (class318) this.field4400.field5079.method312(0, (long) this.field4381);
            if (var3 == null) {
                this.method1974(arg1, (byte) -81);
                var3 = (class318) this.field4400.field5079.method312(0, (long) this.field4381);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILha;)Lho;", line = 28)
    public final class318 method1970(int arg0, class473 arg1) {
        field4395++;
        if (this.field4393 < 0) {
            return null;
        }
        int var3 = -100 % ((33 - arg0) / 48);
        class318 var4 = (class318) this.field4400.field5079.method312(0, (long) this.field4393);
        if (var4 == null) {
            this.method1974(arg1, (byte) -81);
            var4 = (class318) this.field4400.field5079.method312(0, (long) this.field4393);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Ljava/lang/String;", line = 51)
    public final String method1971(int arg0, int arg1) {
        field4394++;
        String var3 = this.field4390;
        if (arg0 >= -26) {
            field4404 = 114;
        }
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class634.method3636(arg1, false, 10) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILgga;I)V", line = 77)
    private final void method1972(int arg0, class511 arg1, int arg2) {
        if (arg0 == 1) {
            this.field4396 = arg1.method3002(-1);
        } else if (arg0 == 2) {
            this.field4388 = arg1.method2983(true);
        } else if (arg0 == 3) {
            this.field4381 = arg1.method3002(arg2 - 1744);
        } else if (arg0 == 4) {
            this.field4393 = arg1.method3002(-1);
        } else if (arg0 == 5) {
            this.field4398 = arg1.method3002(arg2 ^ 0xFFFFF930);
        } else if (arg0 == 6) {
            this.field4384 = arg1.method3002(-1);
        } else if (arg0 == 7) {
            this.field4387 = arg1.method3034(1);
        } else if (arg0 == 8) {
            this.field4390 = arg1.method3018(arg2 - 1744);
        } else if (arg0 == 9) {
            this.field4402 = arg1.method3002(-1);
        } else if (arg0 == 10) {
            this.field4385 = arg1.method3034(1);
        } else if (arg0 == 11) {
            this.field4380 = 0;
        } else if (arg0 == 12) {
            this.field4389 = arg1.method3013(9);
        } else if (arg0 == 13) {
            this.field4383 = arg1.method3034(1);
        } else if (arg0 == 14) {
            this.field4380 = arg1.method3002(-1);
        }
        field4382++;
        if (arg2 != 1743) {
            this.method1973(null, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lha;B)Lho;", line = 147)
    public final class318 method1973(class473 arg0, byte arg1) {
        field4386++;
        if (this.field4398 < 0) {
            return null;
        }
        if (arg1 != -53) {
            method1977(-28);
        }
        class318 var3 = (class318) this.field4400.field5079.method312(0, (long) this.field4398);
        if (var3 == null) {
            this.method1974(arg0, (byte) -81);
            var3 = (class318) this.field4400.field5079.method312(arg1 ^ 0xFFFFFFCB, (long) this.field4398);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Lha;B)V", line = 170)
    private final void method1974(class473 arg0, byte arg1) {
        if (arg1 != -81) {
            this.field4396 = 9;
        }
        field4391++;
        class283 var3 = this.field4400.field5078;
        if (this.field4381 >= 0 && this.field4400.field5079.method312(0, (long) this.field4381) == null && var3.method1860(this.field4381, (byte) 124)) {
            class279 var4 = class279.method1811(var3, this.field4381);
            this.field4400.field5079.method305(arg0.method192(var4, true), (long) this.field4381, 18320);
        }
        if (this.field4398 >= 0 && this.field4400.field5079.method312(arg1 ^ 0xFFFFFFAF, (long) this.field4398) == null && var3.method1860(this.field4398, (byte) 124)) {
            class279 var5 = class279.method1811(var3, this.field4398);
            this.field4400.field5079.method305(arg0.method192(var5, true), (long) this.field4398, 18320);
        }
        if (this.field4393 >= 0 && this.field4400.field5079.method312(0, (long) this.field4393) == null && var3.method1860(this.field4393, (byte) 124)) {
            class279 var6 = class279.method1811(var3, this.field4393);
            this.field4400.field5079.method305(arg0.method192(var6, true), (long) this.field4393, 18320);
        }
        if (this.field4384 >= 0 && this.field4400.field5079.method312(0, (long) this.field4384) == null && var3.method1860(this.field4384, (byte) 124)) {
            class279 var7 = class279.method1811(var3, this.field4384);
            this.field4400.field5079.method305(arg0.method192(var7, true), (long) this.field4384, 18320);
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(Lha;B)Lho;", line = 232)
    public final class318 method1975(class473 arg0, byte arg1) {
        field4392++;
        if (this.field4384 < 0) {
            return null;
        }
        class318 var3 = (class318) this.field4400.field5079.method312(0, (long) this.field4384);
        if (arg1 != 106) {
            field4405 = null;
        }
        if (var3 == null) {
            this.method1974(arg0, (byte) -81);
            var3 = (class318) this.field4400.field5079.method312(arg1 ^ 0x6A, (long) this.field4384);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lgga;Z)V", line = 256)
    public final void method1976(class511 arg0, boolean arg1) {
        field4397++;
        while (true) {
            int var3 = arg0.method3013(-107);
            if (var3 == 0) {
                if (arg1) {
                    this.field4400 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1972(var3, arg0, 1743);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 279)
    public static void method1977(int arg0) {
        if (arg0 != 219386388) {
            method1978(82, (byte) 117, -102, -71L);
        }
        field4405 = null;
        field4401 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIJ)V", line = 305)
    public static final void method1978(int arg0, byte arg1, int arg2, long arg3) {
        field4399++;
        int var5 = ((int) arg3 & 0x7CF03) >> 14;
        if (arg1 <= 2) {
            return;
        }
        int var6 = ((int) arg3 & 0x352B43) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class461.method2775(-2, true, 0, 0, var5, arg2, var6, 0, arg0);
            return;
        }
        class286 var8 = class390.field5558.method3065(4, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field4146;
            var9 = var8.field4148;
        } else {
            var9 = var8.field4146;
            var10 = var8.field4148;
        }
        int var11 = var8.field4194;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class461.method2775(-2, true, var11, var9, 0, arg2, 0, var10, arg0);
    }
}
