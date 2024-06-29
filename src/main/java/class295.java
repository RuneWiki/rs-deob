import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class295 extends class139 {

    @OriginalMember(owner = "client!rh", name = "jb", descriptor = "I")
    public static int field4674 = 0;

    @OriginalMember(owner = "client!rh", name = "ob", descriptor = "[J")
    public static long[] field4679 = new long[32];

    @OriginalMember(owner = "client!rh", name = "pb", descriptor = "I")
    public static int field4680 = 0;

    @OriginalMember(owner = "client!rh", name = "qb", descriptor = "I")
    public static int field4681 = 0;

    @OriginalMember(owner = "client!rh", name = "lb", descriptor = "Lmk;")
    public static class95 field4676 = null;

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!rh", name = "kb", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!rh", name = "mb", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!rh", name = "nb", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method2106(int arg0, boolean arg1) {
        field4677++;
        if (arg1) {
            class344 var2 = class110.method759(8, arg0, false);
            var2.method2384(-27354);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V", line = 25)
    public static final void method2107(boolean arg0) {
        if (arg0) {
            class324.field5032 = class310.field4833;
            class110.field1642 = class189.field3099;
            class281.field4530 = class310.field4840;
        } else {
            class324.field5032 = class66.field958;
            class110.field1642 = class97.field1380;
            class281.field4530 = class340.field5292;
        }
        class205.field3373 = class324.field5032.length;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(CIB)I", line = 47)
    public static final int method2108(char arg0, int arg1, byte arg2) {
        if (arg2 != -5) {
            field4674 = 101;
        }
        field4672++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)[[I", line = 70)
    public final int[][] method62(byte arg0, int arg1) {
        if (arg0 < 121) {
            method2107(true);
        }
        field4675++;
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529 && this.method1027(-23343)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % this.field2184 * this.field2184;
            for (int var8 = 0; var8 < class287.field4599; var8++) {
                int var9 = this.field2180[var7 + (var8 % this.field2183)];
                var6[var8] = client.method767(255, var9) << 4;
                var5[var8] = client.method767(4080, var9 >> 4);
                var4[var8] = client.method767(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "(I)V", line = 118)
    public static final void method2109(int arg0) {
        field4669++;
        class66.field952.method453((byte) 100);
        if (arg0 == 26422) {
            class172.field2853.method1418(0);
            class42.field529.method1418(0);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lak;BLmk;Lak;)V", line = 134)
    public static final void method2110(class172 arg0, byte arg1, class95 arg2, class172 arg3) {
        class252.field4025 = arg0;
        field4673++;
        class304.field4759 = arg3;
        if (arg1 <= 84) {
            return;
        }
        field4676 = arg2;
        if (class252.field4025 != null) {
            class273.field4408 = class252.field4025.method1299(1, (byte) 78);
        }
        if (class304.field4759 != null) {
            class11.field136 = class304.field4759.method1299(1, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 155)
    public static final String method2111(Throwable arg0, int arg1) throws IOException {
        field4678++;
        String var3;
        if (arg0 instanceof class343) {
            class343 var2 = (class343) arg0;
            var3 = var2.field5336 + " | ";
            arg0 = var2.field5335;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 != 18204) {
            method2109(52);
        }
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
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "(I)V", line = 240)
    public static void method2112(int arg0) {
        field4676 = null;
        if (arg0 == -1800) {
            field4679 = null;
        }
    }
}
