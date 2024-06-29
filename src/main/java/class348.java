import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class348 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Ll;")
    private class328 field5563 = new class328(256);

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Ll;")
    private class328 field5579 = new class328(256);

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lek;")
    private class206 field5576;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lek;")
    private class206 field5568;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5564 = "flash3:";

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lek;")
    public static class206 field5570;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lek;")
    public static class206 field5574;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[IIZ)Llb;", line = 9)
    private final class236 method2486(int arg0, int[] arg1, int arg2, boolean arg3) {
        int var5 = arg2 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFFE);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        if (!arg3) {
            return (class236) null;
        }
        field5565++;
        class236 var9 = (class236) this.field5579.method2344(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class307 var10 = (class307) this.field5563.method2344(-1, var7);
            if (var10 == null) {
                var10 = class307.method2239(this.field5576, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field5563.method2337(var10, 709, var7);
            }
            class236 var11 = var10.method2243(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method535(-2801);
                this.field5579.method2337(var11, 709, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI[I)Llb;", line = 51)
    public final class236 method2487(byte arg0, int arg1, int[] arg2) {
        field5566++;
        if (this.field5568.method1423((byte) -45) == 1) {
            return this.method2489(-1502, arg1, 0, arg2);
        } else if (this.field5568.method1417(true, arg1) == 1) {
            return this.method2489(-1502, 0, arg1, arg2);
        } else {
            int var4 = -87 / ((58 - arg0) / 52);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 71)
    public static final String method2488(String arg0, byte arg1) {
        field5578++;
        String var2 = class82.method610(-23159, class167.method1189(0, arg0));
        if (var2 == null) {
            var2 = "";
        }
        if (arg1 != 50) {
            method2492(107, 14);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III[I)Llb;", line = 100)
    private final class236 method2489(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (arg2 >>> 12 | (arg2 & 0x40000FFF) << 4) ^ arg1;
        field5571++;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class236 var9 = (class236) this.field5579.method2344(-1, var7);
        if (var9 != null) {
            return var9;
        }
        if (arg0 != -1502) {
            field5575 = -83;
        }
        if (arg3 != null && arg3[0] <= 0) {
            return null;
        }
        class283 var10 = class283.method2011(this.field5568, arg2, arg1);
        if (var10 == null) {
            return null;
        }
        class236 var11 = var10.method2012();
        this.field5579.method2337(var11, 709, var7);
        if (arg3 != null) {
            arg3[0] -= var11.field3857.length;
        }
        return var11;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 131)
    public static void method2490(byte arg0) {
        if (arg0 == -77) {
            field5564 = null;
            field5570 = null;
            field5574 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[I)Llb;", line = 149)
    public final class236 method2491(int arg0, int arg1, int[] arg2) {
        if (arg1 != 11794) {
            this.field5576 = (class206) null;
        }
        field5572++;
        if (this.field5576.method1423((byte) -111) == 1) {
            return this.method2486(0, arg2, arg0, true);
        } else if (this.field5576.method1417(true, arg0) == 1) {
            return this.method2486(arg0, arg2, 0, true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Z", line = 169)
    public static final boolean method2492(int arg0, int arg1) {
        field5573++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class107.field1938[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1011) {
            return true;
        } else {
            if (arg1 >= -55) {
                method2494(-95, -64, -68, -51);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 193)
    public static final void method2493(int arg0, Throwable arg1, String arg2) {
        if (arg0 != -26700) {
            method2493(-119, (Throwable) null, (String) null);
        }
        field5577++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class280.method1982(arg1, (byte) 41);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class52.method458(-116, var3);
            String var4 = class231.method1615("%3a", var3, arg0 ^ 0x6835, ":");
            String var5 = class231.method1615("%40", var4, -88, "@");
            String var6 = class231.method1615("%26", var5, -85, "&");
            String var7 = class231.method1615("%23", var6, -116, "#");
            if (class20.field535.field2658 == null) {
                return;
            }
            class210 var8 = class20.field535.method1131(new URL(class20.field535.field2658.getCodeBase(), "clienterror.ws?c=" + field5575 + "&u=" + class334.field5325 + "&v1=" + class157.field2651 + "&v2=" + class157.field2652 + "&e=" + var7), 15216);
            while (var8.field3504 == 0) {
                class122.method881(arg0 ^ 0xFFFF97C7, 1L);
            }
            if (var8.field3504 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field3501;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)I", line = 245)
    public static final int method2494(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field5569++;
        if (arg2 != 28788) {
            method2492(121, 115);
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lek;Lek;)V", line = 286)
    public class348(class206 arg0, class206 arg1) {
        this.field5576 = arg1;
        this.field5568 = arg0;
    }
}
