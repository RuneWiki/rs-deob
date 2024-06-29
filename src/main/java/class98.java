import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class class98 extends class225 {

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "[I")
    public static int[] field1370 = new int[100];

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field1375 = new String[100];

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "[[S")
    public static short[][] field1371;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
    public static final void method663(int arg0) {
        class189 var1 = class48.field674;
        synchronized (class48.field674) {
            int var2 = -1 / ((arg0 - 48) / 57);
            class48.field674.method1136((byte) -88);
        }
        field1368++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLii;)V")
    public static final void method664(byte arg0, class405 arg1) {
        field1373++;
        arg1.method1767(0, 0, class138.field1907, 350);
        arg1.method1632(0, 0, class138.field1907, 350, class173.field2313 << 24 | 0x332277, 1);
        int var2 = 0 % ((28 - arg0) / 45);
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = class394.field5660[var3];
            int var15 = class169.field2271[var3];
            arg1.method1632(var14, var15, 2, 2, class120.field1672[var3] << 24 | 0xFFFFFF, 1);
        }
        int var4 = 350 / class26.field370;
        if (class124.field1724 > 0) {
            int var5 = 342 - class26.field370;
            int var6 = var4 * var5 / (var4 + class124.field1724 - 1);
            int var7 = 4;
            if (class124.field1724 > 1) {
                var7 += (class124.field1724 - (class447.field6558 + 1)) * (var5 - var6) / (class124.field1724 - 1);
            }
            arg1.method1632(class138.field1907 - 16, var7, 12, var6, class173.field2313 << 24 | 0x332277, 2);
            for (int var8 = class447.field6558; class447.field6558 + var4 > var8 && var8 < class124.field1724; var8++) {
                String[] var9 = class243.method1459(class65.field859[var8], '\b', 0);
                int var10 = (class138.field1907 - 16 - 8) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = var10 * var11 + 8;
                    arg1.method1767(var12, 0, var12 + var10 - 8, 350);
                    class393.field5626.method1878(350 - class59.field794 - (class283.field4123.field4596 - -((-class447.field6558 + var8) * class26.field370)) - 2, -16777216, -1, var9[var11], (byte) -65, var12);
                }
            }
        }
        arg1.method1767(0, 0, class138.field1907, 350);
        arg1.method2612(0, -1, 350 - class59.field794, 1, class138.field1907);
        class422.field6227.method1878(350 - class191.field2562.field4596 - 1, -16777216, -1, "--> " + class276.field4000, (byte) -86, 10);
        int var13 = -1;
        if (class28.field418 % 30 > 15) {
            var13 = 16777215;
        }
        arg1.method2615(var13, 12, 350 - class191.field2562.field4596 - 11, class191.field2562.method2127(255, "--> " + class276.field4000.substring(0, class368.field5320)) + 10, 71);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIZII)V")
    public static final void method665(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1374++;
        int var7 = class304.method2068(class379.field5521, arg6, -106, class125.field1751);
        int var8 = class304.method2068(class379.field5521, arg3, -104, class125.field1751);
        int var9 = class304.method2068(class87.field1227, arg2, -120, class299.field4382);
        if (arg4) {
            field1371 = null;
        }
        int var10 = class304.method2068(class87.field1227, arg0, -128, class299.field4382);
        int var11 = class304.method2068(class379.field5521, arg5 + arg6, -104, class125.field1751);
        int var12 = class304.method2068(class379.field5521, arg3 - arg5, -96, class125.field1751);
        for (int var13 = var7; var13 < var11; var13++) {
            class207.method1221((byte) -127, var9, var10, class384.field5560[var13], arg1);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class207.method1221((byte) -122, var9, var10, class384.field5560[var14], arg1);
        }
        int var15 = class304.method2068(class87.field1227, arg2 + arg5, -103, class299.field4382);
        int var16 = class304.method2068(class87.field1227, arg0 - arg5, -114, class299.field4382);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class384.field5560[var17];
            class207.method1221((byte) -126, var9, var15, var18, arg1);
            class207.method1221((byte) -128, var16, var10, var18, arg1);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)Ltl;")
    public static final class99 method666(int arg0, boolean arg1) {
        field1369++;
        if (arg1) {
            return null;
        }
        class99 var2 = (class99) class212.field2839.method2674((long) arg0, 22300);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class213.field2851.method2261(arg0, 11, 80);
        class99 var4 = new class99();
        if (var3 != null) {
            var4.method671(0, new class228(var3));
        }
        class212.field2839.method2673((long) arg0, var4, 11465);
        return var4;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lii;Lnc;III)V")
    public static final void method667(class405 arg0, class126 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class104.field1436) {
            class254 var5 = class213.field2852[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field3527 != null && var5.field3527.method166(-17506)) {
                arg1.method169(arg0, 0, 0, -114, 128, var5.field3527, true);
            }
        }
        if (arg4 < class104.field1436) {
            class254 var6 = class213.field2852[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field3527 != null && var6.field3527.method166(-17506)) {
                arg1.method169(arg0, 128, 0, -109, 0, var6.field3527, true);
            }
        }
        if (arg3 < class104.field1436 && arg4 < class214.field2858) {
            class254 var7 = class213.field2852[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field3527 != null && var7.field3527.method166(-17506)) {
                arg1.method169(arg0, 128, 0, -107, 128, var7.field3527, true);
            }
        }
        if (arg3 < class104.field1436 && arg4 > 0) {
            class254 var8 = class213.field2852[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field3527 != null && var8.field3527.method166(-17506)) {
                arg1.method169(arg0, -128, 0, -119, 128, var8.field3527, true);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method668(Throwable arg0, byte arg1) throws IOException {
        field1372++;
        String var2;
        if ((arg0 instanceof class291)) {
            class291 var3 = (class291) arg0;
            arg0 = var3.field4171;
            var2 = var3.field4164 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 != 95) {
            return null;
        }
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
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
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)V")
    public static void method669(boolean arg0) {
        field1375 = null;
        field1370 = null;
        if (!arg0) {
            method663(-35);
        }
        field1371 = null;
    }
}
