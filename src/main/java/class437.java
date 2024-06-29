import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class437 extends class381 {

    @OriginalMember(owner = "client!of", name = "l", descriptor = "[I")
    public int[] field6529;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[I")
    public int[] field6532;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lic;")
    public static class491 field6530;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2622(int arg0) {
        class33.field345.method1111(((float) class426.field6401.field1024 * 0.1F + 0.7F) * class381.field5777);
        field6523++;
        if (arg0 != -591) {
            method2622(91);
        }
        class33.field345.method1049(class343.field4966, class369.field5648, class202.field2926, (float) (class484.field7092 << 0), (float) (class449.field6690 << 0), (float) (class217.field3180 << 0));
        class33.field345.method1083(class246.field3628);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 18)
    public static final String method2623(Throwable arg0, int arg1) throws IOException {
        field6531++;
        String var2;
        if ((arg0 instanceof class11)) {
            class11 var3 = (class11) arg0;
            var2 = var3.field139 + " | ";
            arg0 = var3.field147;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg1 != 1) {
            method2628(null, (byte) 97, null);
        }
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

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 89)
    public static void method2624(int arg0) {
        field6530 = null;
        if (arg0 >= -67) {
            method2629((byte) -63, null);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lqa;Ler;IIIII)V", line = 100)
    public static final void method2625(class162 arg0, class68 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class208.field2979 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class361.field5554) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class484.field7096 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class518 var15 = class108.field1553[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class86.field1324[var12].method201(var13, var14) + class86.field1324[var12].method201(var13 + 1, var14) + class86.field1324[var12].method201(var13, var14 + 1) + class86.field1324[var12].method201(var13 + 1, var14 + 1)) / 4 - (class86.field1324[arg2].method201(arg3, arg4) + class86.field1324[arg2].method201(arg3 + 1, arg4) + class86.field1324[arg2].method201(arg3, arg4 + 1) + class86.field1324[arg2].method201(arg3 + 1, arg4 + 1)) / 4;
                                    class364 var17 = var15.field7559;
                                    class364 var18 = var15.field7570;
                                    if (var17 != null && var17.method18(125)) {
                                        arg1.method19(var7, (var13 - arg3) * class352.field5398 + (1 - arg5) * class143.field2134, var16, var17, arg0, (var14 - arg4) * class352.field5398 + (1 - arg6) * class143.field2134, (byte) -109);
                                    }
                                    if (var18 != null && var18.method18(113)) {
                                        arg1.method19(var7, (var13 - arg3) * class352.field5398 + (1 - arg5) * class143.field2134, var16, var18, arg0, (var14 - arg4) * class352.field5398 + (1 - arg6) * class143.field2134, (byte) -107);
                                    }
                                    for (class284 var19 = var15.field7569; var19 != null; var19 = var19.field4087) {
                                        class117 var20 = var19.field4083;
                                        if (var20 != null && var20.method18(118) && (var20.field1762 == var13 || var8 == var13) && (var20.field1771 == var14 || var10 == var14)) {
                                            int var21 = var20.field1770 + 1 - var20.field1762;
                                            int var22 = var20.field1765 + 1 - var20.field1771;
                                            arg1.method19(var7, (var20.field1762 - arg3) * class352.field5398 + (var21 - arg5) * class143.field2134, var16, var20, arg0, (var20.field1771 - arg4) * class352.field5398 + (var22 - arg6) * class143.field2134, (byte) -111);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZII)I", line = 190)
    public static final int method2626(boolean arg0, int arg1, int arg2) {
        field6524++;
        if (arg0) {
            return 29;
        } else if (arg1 == 1 || arg1 == 3) {
            return class403.field6056[arg2 & 0x3];
        } else {
            return class17.field185[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V", line = 206)
    public static final void method2627(int arg0, byte arg1) {
        class226 var2 = class111.field1596;
        synchronized (class111.field1596) {
            class111.field1596.method1534(0, arg0);
        }
        field6527++;
        class226 var3 = class359.field5506;
        synchronized (class359.field5506) {
            class359.field5506.method1534(0, arg0);
        }
        if (arg1 != -78) {
            field6530 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ltd;B[[B)V", line = 225)
    public static final void method2628(class314 arg0, byte arg1, byte[][] arg2) {
        field6528++;
        for (int var3 = 0; var3 < arg0.field3597; var3++) {
            class110.method675(19315);
            for (int var5 = 0; var5 < (class30.field323 >> 3); var5++) {
                for (int var6 = 0; var6 < (class182.field2661 >> 3); var6++) {
                    int var7 = class168.field2493[var3][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0.field3583 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFB) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class331.field4689.length; var13++) {
                                if (class331.field4689[var13] == var12 && arg2[var13] != null) {
                                    arg0.method1964(var9, class434.field6500, arg2[var13], var3, var5 * 8, (var11 & 0x7) * 8, class348.field5015, var6 * 8, (byte) 102, var8, (var10 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int var4 = 8 % ((arg1 - 40) / 57);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLic;)I", line = 295)
    public static final int method2629(byte arg0, class491 arg1) {
        field6526++;
        int var2 = 0;
        if (arg1.method2924((byte) -125, class68.field1042)) {
            var2++;
        }
        if (arg1.method2924((byte) -128, class474.field6984)) {
            var2++;
        }
        if (arg1.method2924((byte) -128, class266.field3897)) {
            var2++;
        }
        if (arg1.method2924((byte) -125, class154.field2278)) {
            var2++;
        }
        if (arg1.method2924((byte) -128, class19.field210)) {
            var2++;
        }
        if (arg1.method2924((byte) -126, class435.field6512)) {
            var2++;
        }
        if (arg1.method2924((byte) -128, class522.field7724)) {
            var2++;
        }
        if (arg1.method2924((byte) -126, class184.field2742)) {
            var2++;
        }
        if (arg1.method2924((byte) -127, class493.field7287)) {
            var2++;
        }
        if (arg1.method2924((byte) -128, class308.field4433)) {
            var2++;
        }
        if (arg1.method2924((byte) -127, class530.field7819)) {
            var2++;
        }
        if (arg1.method2924((byte) -126, class33.field347)) {
            var2++;
        }
        if (arg1.method2924((byte) -127, class519.field7638)) {
            var2++;
        }
        if (arg0 != 88) {
            return -107;
        }
        if (arg1.method2924((byte) -128, class30.field324)) {
            var2++;
        }
        if (arg1.method2924((byte) -128, class265.field3886)) {
            var2++;
        }
        if (arg1.method2924((byte) -126, class390.field5882)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILqa;Lic;)V", line = 363)
    public static final void method2630(int arg0, class162 arg1, class491 arg2) {
        if (arg0 != -21330) {
            method2628(null, (byte) 108, null);
        }
        field6525++;
        if (class357.field5480) {
            return;
        }
        arg1.method1044(0);
        class403.field6057 = arg1.method1030(class408.method2461(arg2, class35.field366), true);
        class403.field6057.method3121((class4.field57 - class403.field6057.method105()) / 2, (class116.field1743 - class403.field6057.method100()) / 2);
        class464.field6868 = arg1.method1030(class408.method2461(arg2, class331.field4692), true);
        class464.field6868.method3121((class4.field57 - class464.field6868.method105()) / 2, 18);
        class357.field5480 = true;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(II[I[I)V", line = 385)
    public class437(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field6529 = arg3;
        this.field6532 = arg2;
    }
}
