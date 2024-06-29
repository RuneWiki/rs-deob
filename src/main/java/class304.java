import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class304 {

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lsa;")
    private class423 field4453 = new class423();

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lei;")
    public static class289 field4444 = new class289(128);

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "Lil;")
    public static class274 field4456 = new class274(7, 17);

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "[I")
    public static int[] field4463 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field4461 = 205;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Lsa;")
    private class423 field4457;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4445;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4462;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "[I")
    public static int[] field4458;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method2019(Throwable arg0, int arg1) throws IOException {
        field4449++;
        String var3;
        if (arg0 instanceof class200) {
            class200 var2 = (class200) arg0;
            arg0 = var2.field2823;
            var3 = var2.field2826 + " | ";
        } else {
            var3 = "";
        }
        if (arg1 >= -66) {
            method2029(-50, 74, 28);
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
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

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Z")
    public final boolean method2020(int arg0) {
        if (arg0 >= -33) {
            this.method2021(76);
        }
        field4454++;
        return this.field4453.field6112 == this.field4453;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public final void method2021(int arg0) {
        if (arg0 != -16777216) {
            this.method2026(-99);
        }
        field4451++;
        while (true) {
            class423 var2 = this.field4453.field6112;
            if (this.field4453 == var2) {
                this.field4457 = null;
                return;
            }
            var2.method2611(-1);
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)Lsa;")
    public final class423 method2022(int arg0) {
        field4443++;
        class423 var2 = this.field4457;
        if (arg0 != 10) {
            return null;
        } else if (this.field4453 == var2) {
            this.field4457 = null;
            return null;
        } else {
            this.field4457 = var2.field6112;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
    public static final int method2023(byte arg0) {
        field4441++;
        class9 var1 = class74.field942;
        boolean var2 = false;
        if (class118.field1594 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class9.method151(0, 0, 65535, (class235) null, (class341) null, var3);
        }
        long var4 = class43.method364(-16756);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method121(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        if (arg0 >= -98) {
            method2030((byte) 64);
        }
        int var7 = (int) (class43.method364(-16756) - var4);
        var1.method150(-44, 0, 0, 100, -16777216, 100);
        if (var2) {
            var1.method136(84);
        }
        return var7;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILsa;)V")
    public final void method2024(int arg0, class423 arg1) {
        if (arg1.field6114 != null) {
            arg1.method2611(arg0 - 11);
        }
        field4447++;
        arg1.field6112 = this.field4453;
        arg1.field6114 = this.field4453.field6114;
        arg1.field6114.field6112 = arg1;
        arg1.field6112.field6114 = arg1;
        if (arg0 != 10) {
            this.method2025(-113);
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)Lsa;")
    public final class423 method2025(int arg0) {
        if (arg0 != -65536) {
            method2029(-116, 73, 66);
        }
        field4450++;
        class423 var2 = this.field4453.field6112;
        if (this.field4453 == var2) {
            return null;
        } else {
            var2.method2611(arg0 ^ 0xFFFF);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)Lsa;")
    public final class423 method2026(int arg0) {
        field4442++;
        class423 var2 = this.field4453.field6112;
        if (this.field4453 == var2) {
            this.field4457 = null;
            return null;
        }
        this.field4457 = var2.field6112;
        if (arg0 != 100) {
            field4444 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)I")
    public final int method2027(int arg0) {
        if (arg0 < 49) {
            this.method2024(-64, (class423) null);
        }
        field4446++;
        int var2 = 0;
        for (class423 var3 = this.field4453.field6112; var3 != this.field4453; var3 = var3.field6112) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)Lsa;")
    public final class423 method2028(byte arg0) {
        if (arg0 != -73) {
            method2023((byte) 67);
        }
        field4452++;
        class423 var2 = this.field4453.field6114;
        if (this.field4453 == var2) {
            this.field4457 = null;
            return null;
        } else {
            this.field4457 = var2.field6114;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)I")
    public static final int method2029(int arg0, int arg1, int arg2) {
        field4460++;
        if (arg1 != -7645) {
            field4462 = null;
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public static void method2030(byte arg0) {
        field4444 = null;
        field4463 = null;
        if (arg0 <= 111) {
            field4456 = null;
        }
        field4458 = null;
        field4456 = null;
        field4445 = null;
        field4462 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4459++;
        if (arg0 != -16272) {
            return;
        }
        if (class9.field128 <= (arg5 - arg2) && class63.field838 >= (arg2 + arg5) && (arg1 - arg2) >= class248.field3659 && (arg1 + arg2) <= class146.field1978) {
            class41.method358(arg2, arg5, arg3, arg4, arg1, arg6, -1109122879);
        } else {
            class189.method1292(arg6, arg2, arg1, arg5, arg3, false, arg4);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class304() {
        this.field4453.field6112 = this.field4453;
        this.field4453.field6114 = this.field4453;
    }
}
