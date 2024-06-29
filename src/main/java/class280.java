import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class280 extends class308 {

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public int field4606;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "Llj;")
    public static class289 field4612;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "Ljava/lang/String;")
    public String field4603;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "[I")
    public int[] field4604;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "[I")
    public int[] field4611;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "[Lil;")
    public class4[] field4615;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field4602;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V", line = 7)
    public static void method1987(int arg0) {
        if (arg0 != -65537) {
            method1991(false, (class221) null, (class221) null);
        }
        field4612 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILjava/lang/String;)V", line = 19)
    public static final void method1988(int arg0, int arg1, String arg2) {
        int var3 = 27 % ((-arg1 - 44) / 59);
        field4608++;
        class195.field2992.method250(21066, 64);
        class278.field4590++;
        class195.field2992.method2191(6729, arg0);
        class195.field2992.method2192((byte) 84, class265.method1872(arg2, 71));
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIII)V", line = 31)
    public static final void method1989(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4614++;
        if (class334.field5425 < 100) {
            class229.method1559((byte) 27);
        }
        if (class245.field3886) {
            class335.method2375(arg0, arg4, arg0 + arg2, arg4 - -arg1);
        } else {
            class317.method2273(arg0, arg4, arg0 + arg2, arg4 - -arg1);
        }
        if (class334.field5425 < 100) {
            int var5 = arg2 / 2 + arg0;
            byte var6 = 20;
            int var7 = arg1 / 2 + arg4 - var6 - 18;
            if (class245.field3886) {
                class335.method2380(arg0, arg4, arg2, arg1, 0);
                class335.method2376(var5 - 152, var7, 304, 34, 9179409);
                class335.method2380(var5 - 150, var7 + 2, class334.field5425 * 3, 30, 9179409);
            } else {
                class317.method2282(arg0, arg4, arg2, arg1, 0);
                class317.method2266(var5 - 152, var7, 304, 34, 9179409);
                class317.method2282(var5 - 150, var7 - -2, class334.field5425 * 3, 30, 9179409);
            }
            class31.field471.method1222(class172.field2698, var5, var6 + var7, 16777215, -1);
            return;
        }
        class318.field5244 = (int) ((float) (arg1 * 2) / class88.field1259);
        class224.field3462 = (int) ((float) (arg2 * 2) / class88.field1259);
        class165.field2605 = class236.field3735 - ((int) ((float) arg2 / class88.field1259));
        int var8 = class125.field1873 - ((int) ((float) arg1 / class88.field1259));
        class217.field3349 = class125.field1873 - (int) ((float) arg1 / class88.field1259);
        int var9 = class236.field3735 - ((int) ((float) arg2 / class88.field1259));
        int var10 = class236.field3735 + ((int) ((float) arg2 / class88.field1259));
        int var11 = (int) ((float) arg1 / class88.field1259) + class125.field1873;
        if (class245.field3886) {
            if (class352.field5615 == null || class352.field5615.field4802 != arg2 || class352.field5615.field4811 != arg1) {
                class352.field5615 = null;
                class352.field5615 = new class137(arg2, arg1);
            }
            class317.method2280(class352.field5615.field2172, arg2, arg1);
            class88.method587(var9, var8, var10, var11, 0, 0, arg2, arg1 + 1);
            class88.method589();
            class150 var13 = class88.method574();
            class25.method214(var13, arg4, arg0, -13);
            class352.field5615.method954();
            class335.method2373(class352.field5615.field2172, arg0, arg4, arg2, arg1);
            class317.field5228 = null;
        } else {
            class88.method587(var9, var8, var10, var11, arg0, arg4, arg0 + arg2, arg4 + 1 - -arg1);
            class88.method589();
            class150 var12 = class88.method574();
            class25.method214(var12, 0, 0, -13);
        }
        if (class268.field4416 > 0) {
            class6.field76--;
            if (class6.field76 == 0) {
                class268.field4416--;
                class6.field76 = 20;
            }
        }
        if (class126.field1902) {
            int var14 = arg2 + arg0 - 5;
            int var15 = arg4 + arg1 - 8;
            class287.field4740.method1211("Fps:" + class352.field5612, var14, var15, 16776960, -1);
            int var16 = 16776960;
            Runtime var17 = Runtime.getRuntime();
            int var19 = var15 - 15;
            int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
            if (var18 > 65536) {
                var16 = 16711680;
            }
            class287.field4740.method1211("Mem:" + var18 + "k", var14, var19, var16, -1);
            var15 = var19 - 15;
        }
        if (arg3 != -18) {
            field4612 = (class289) null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZZ)V", line = 152)
    public static final void method1990(boolean arg0, boolean arg1) {
        field4613++;
        if (arg1 == class37.field554) {
            return;
        }
        if (!arg0) {
            field4612 = (class289) null;
        }
        class37.field554 = arg1;
        class25.method217(2048);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZLnm;Lnm;)V", line = 169)
    public static final void method1991(boolean arg0, class221 arg1, class221 arg2) {
        if (arg0) {
            class287.field4787 = arg1;
            class305.field4992 = arg2;
            field4601++;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 191)
    public static final String method1992(int arg0, Throwable arg1) throws IOException {
        field4607++;
        String var3;
        if (arg1 instanceof class315) {
            class315 var2 = (class315) arg1;
            var3 = var2.field5196 + " | ";
            arg1 = var2.field5199;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 >= -5) {
            return (String) null;
        }
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
}
