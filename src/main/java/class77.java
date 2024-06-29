import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class77 {

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Lge;")
    private class511 field1272 = new class511(128);

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lci;")
    private class320 field1261;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
    public static int[] field1260 = new int[5];

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1264 = 2;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "[[I")
    public static int[][] field1266 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field1269 = 0;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Ltf;")
    public static class198 field1271 = null;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "Lqt;")
    public static class459 field1273 = new class459(23, 7);

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "B")
    public static byte field1262;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1259++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class441.field6277 + ((class275.field4111 - class441.field6277) * var8 / 100);
        int var10 = arg7 * var9 >> 8;
        int var11 = 16384 - arg5 & 0x3FFF;
        int var12 = 16384 - arg6 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class358.field5204[var11] * -var10 >> 15;
            var15 = class358.field5203[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class358.field5204[var12] * var15 >> 15;
            var15 = class358.field5203[var12] * var15 >> 15;
        }
        class397.field5649 = arg1 - var15;
        if (arg0 >= -99) {
            method592((byte) -27);
        }
        class171.field2548 = arg6;
        class254.field3756 = arg5;
        class315.field4688 = arg2 - var13;
        class39.field835 = 0;
        class62.field1086 = arg3 - var14;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Lhb;", line = 54)
    public final class521 method591(int arg0, byte arg1) {
        field1270++;
        class511 var3 = this.field1272;
        class521 var4;
        synchronized (this.field1272) {
            if (arg1 != 0) {
                method592((byte) 26);
            }
            var4 = (class521) this.field1272.method2982(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field1261;
        byte[] var6;
        synchronized (this.field1261) {
            var6 = this.field1261.method2037(arg0, (byte) -114, 1);
        }
        class521 var7 = new class521();
        if (var6 != null) {
            var7.method3089(new class519(var6), false);
        }
        class511 var8 = this.field1272;
        synchronized (this.field1272) {
            this.field1272.method2981(var7, 24, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 92)
    public static final void method592(byte arg0) {
        field1263++;
        class203.method1402(class76.field1256, (long) class24.field349, 0);
        if (class188.field2765 != -1) {
            class444.method2626((byte) -81, class188.field2765);
        }
        for (int var1 = 0; var1 < class7.field52; var1++) {
            if (class25.field361[var1]) {
                class130.field2043[var1] = true;
            }
            class283.field4212[var1] = class25.field361[var1];
            class25.field361[var1] = false;
        }
        if (arg0 != 16) {
            field1269 = 68;
        }
        class364.field5295 = class24.field349;
        if (class76.field1256.method189()) {
            class241.field3614 = true;
        }
        if (class188.field2765 != -1) {
            class7.field52 = 0;
            class57.method486(false);
        }
        class76.field1256.method179();
        class56.method480(arg0 + 15304, class76.field1256);
        int var2 = class470.method2782(true);
        if (var2 == -1) {
            var2 = class276.field4122;
        }
        if (var2 == -1) {
            var2 = class306.field4543;
        }
        class253.method1635(var2, 0);
        class163.field2465 = 0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 148)
    public static final String method593(int arg0, Throwable arg1) throws IOException {
        field1268++;
        if (arg0 >= -49) {
            return null;
        }
        String var3;
        if (arg1 instanceof class134) {
            class134 var2 = (class134) arg1;
            arg1 = var2.field2090;
            var3 = var2.field2093 + " | ";
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

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 226)
    public final void method594(int arg0) {
        field1267++;
        class511 var2 = this.field1272;
        synchronized (this.field1272) {
            if (arg0 == 41) {
                this.field1272.method2990((byte) -97);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V", line = 240)
    public final void method595(boolean arg0) {
        class511 var2 = this.field1272;
        synchronized (this.field1272) {
            if (arg0) {
                this.field1272 = null;
            }
            this.field1272.method2980(-182819096);
        }
        field1258++;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V", line = 259)
    public static void method596(byte arg0) {
        field1266 = null;
        field1271 = null;
        field1273 = null;
        if (arg0 > -112) {
            field1266 = null;
        }
        field1260 = null;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IB)V", line = 272)
    public final void method597(int arg0, byte arg1) {
        field1265++;
        class511 var3 = this.field1272;
        synchronized (this.field1272) {
            this.field1272.method2989(false, arg0);
            if (arg1 > -62) {
                this.method591(-74, (byte) 74);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lsn;ILci;)V", line = 299)
    public class77(class453 arg0, int arg1, class320 arg2) {
        this.field1261 = arg2;
        this.field1261.method2030(-10914, 1);
    }
}
