import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class226 {

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lqi;")
    private class266 field3393;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Lud;")
    private class247 field3400;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lmh;")
    private class118 field3392;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "D")
    public static double field3403 = -1.0D;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lkl;")
    private class114 field3395;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "[I")
    public static int[] field3401;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "[Lcc;")
    private class217[] field3396;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;Lve;I)Luk;")
    public static final class78 method1474(String arg0, class233 arg1, int arg2) {
        field3391++;
        int var3 = arg1.method1522(7233, arg0);
        if (var3 == -1) {
            return new class78(0);
        }
        int[] var4 = arg1.method1521(var3, (byte) -73);
        class78 var5 = new class78(var4.length);
        for (int var6 = arg2; var6 < var5.field1204; var6++) {
            class114 var7 = new class114(arg1.method1538(var3, var4[var6], (byte) 121));
            var5.field1203[var6] = var7.method753(-128);
            var5.field1199[var6] = var7.method741(3083);
            var5.field1200[var6] = (short) var7.method756(arg2 - 29901);
            var5.field1201[var6] = (short) var7.method756(-29901);
            var5.field1213[var6] = var7.method759((byte) 116);
        }
        return var5;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z")
    public final boolean method1475(byte arg0) {
        if (arg0 > -20) {
            field3403 = 0.029247730842797817D;
        }
        field3397++;
        if (this.field3395 != null) {
            return true;
        }
        if (this.field3392 == null) {
            if (this.field3400.method1620(-118)) {
                return false;
            }
            this.field3392 = this.field3400.method1621((byte) 0, true, -108, 255, 255);
        }
        if (this.field3392.field1339) {
            return false;
        } else {
            this.field3395 = new class114(this.field3392.method594(true));
            this.field3396 = new class217[(this.field3395.field1629.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)Lrf;")
    public static final class241 method1476(int arg0, byte arg1) {
        class241 var2 = (class241) class242.field3625.method263((byte) 117, (long) arg0);
        field3404++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -81) {
            field3401 = null;
        }
        byte[] var3 = class10.field179.method1538(arg0, 0, (byte) 42);
        class241 var4 = new class241(var3);
        var4.method1285(class158.field2290, (int[]) null);
        class242.field3625.method255((long) arg0, var4, (byte) -127);
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method1477(int arg0) {
        class203.field2943.method260(arg0);
        field3390++;
        class259.field3917.method260(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1478(int arg0, Throwable arg1) throws IOException {
        field3394++;
        String var3;
        if (arg1 instanceof class209) {
            class209 var2 = (class209) arg1;
            var3 = var2.field3008 + " | ";
            arg1 = var2.field3009;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                if (arg0 > -18) {
                    field3403 = -0.4774230544146995D;
                }
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public final void method1479(int arg0) {
        field3399++;
        if (this.field3396 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field3396.length; var2++) {
            if (this.field3396[var2] != null) {
                this.field3396[var2].method1403((byte) -76);
            }
        }
        for (int var3 = 0; var3 < this.field3396.length; var3++) {
            if (this.field3396[var3] != null) {
                this.field3396[var3].method1401((byte) 1);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public static void method1480(byte arg0) {
        field3401 = null;
        if (arg0 != 11) {
            field3403 = -0.2776466876242504D;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILac;Lac;)Lcc;")
    public final class217 method1481(int arg0, int arg1, class141 arg2, class141 arg3) {
        field3402++;
        if (arg0 != 1) {
            this.method1479(101);
        }
        return this.method1482(arg2, 28747, arg1, true, arg3);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lud;Lqi;)V")
    public class226(class247 arg0, class266 arg1) {
        this.field3393 = arg1;
        this.field3400 = arg0;
        if (!this.field3400.method1620(-121)) {
            this.field3392 = this.field3400.method1621((byte) 0, true, 23, 255, 255);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lac;IIZLac;)Lcc;")
    private final class217 method1482(class141 arg0, int arg1, int arg2, boolean arg3, class141 arg4) {
        field3398++;
        if (this.field3395 == null) {
            throw new RuntimeException();
        }
        this.field3395.field1673 = arg2 * 8 + 5;
        if (this.field3395.field1629.length <= this.field3395.field1673) {
            throw new RuntimeException();
        } else if (this.field3396[arg2] == null) {
            if (arg1 != 28747) {
                this.field3396 = null;
            }
            int var6 = this.field3395.method759((byte) 112);
            int var7 = this.field3395.method759((byte) 117);
            class217 var8 = new class217(arg2, arg0, arg4, this.field3400, this.field3393, var6, var7, arg3);
            this.field3396[arg2] = var8;
            return var8;
        } else {
            return this.field3396[arg2];
        }
    }
}
