import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class229 extends class40 {

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    private final int field4194;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    private final int field4187;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    private final int field4191;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    private final int field4183;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    private final int field4180;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    private final int field4181;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    private final int field4182;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    private final int field4193;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Lhj;")
    public static class69 field4177 = class165.method1224(160, 1);

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "Lhj;")
    public static class69 field4198 = class181.method1318(" (X", (byte) -128);

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "Lta;")
    public static class241 field4197 = new class241(50);

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "Lhj;")
    public static class69 field4202 = class181.method1318("Bitte warten Sie)3)3)3", (byte) -127);

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public static int field4200 = 0;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "Lhj;")
    private static class69 field4199 = class181.method1318("Choose Option", (byte) -113);

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "Lhj;")
    public static class69 field4201 = field4199;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "Lhj;")
    public static class69 field4203 = class181.method1318("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", (byte) -115);

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "Lqb;")
    public static class56 field4195;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method1632(byte arg0) {
        field4201 = null;
        field4197 = null;
        field4195 = null;
        field4177 = null;
        field4202 = null;
        if (arg0 != -28) {
            method1636((byte) -107);
        }
        field4203 = null;
        field4198 = null;
        field4199 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1633(int arg0, Throwable arg1) throws IOException {
        ++field4190;
        String var3;
        if (arg1 instanceof class11) {
            class11 var2 = (class11) arg1;
            var3 = var2.field98 + " | ";
            arg1 = var2.field103;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg0 != -11180) {
            method1636((byte) -85);
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (~var10 <= -1 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (~var13 <= -1) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(1 + var15.lastIndexOf(32));
                String var17 = var16.substring(var16.lastIndexOf(9) - -1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public final void method110(int arg0, int arg1, int arg2) {
        if (arg2 != 100) {
            field4201 = null;
        }
        ++field4188;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
    public static final int method1634(int arg0, int arg1) {
        ++field4186;
        if (arg1 != 29562) {
            method1632((byte) -29);
        }
        return arg0 & 1023;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIBIII)V")
    public static final void method1635(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        class122.field2274 = arg3;
        ++field4178;
        class148.field2763 = arg4;
        class110.field2096 = arg1;
        class177.field3222 = arg5;
        class129.field2413 = arg0;
        if (arg2 != -9) {
            field4196 = -118;
        }
        if (class177.field3222 >= 100) {
            int var6 = class129.field2413 * 128 + 64;
            int var7 = class122.field2274 * 128 - -64;
            int var8 = class156.method1179(var6, var7, 90, class52.field927) + -class148.field2763;
            int var9 = -class31.field427 + var8;
            int var10 = -class127.field2327 + var6;
            int var11 = var7 - class123.field2291;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class148.field2753 = (int) (325.949D * Math.atan2((double) var9, (double) var12)) & 2047;
            class162.field3006 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 2047;
            if (~class148.field2753 > -129) {
                class148.field2753 = 128;
            }
            if (class148.field2753 > 383) {
                class148.field2753 = 383;
            }
        }
        class265.field4711 = 2;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static final void method1636(byte arg0) {
        class88.field1682 = null;
        class50.field841 = null;
        class138.field2585 = null;
        class157.field2919 = null;
        class113.field2167 = null;
        ++field4189;
        if (arg0 < 18) {
            method1634(-39, 24);
        }
        class69.field1350 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)Lni;")
    public static final class149 method1637(int arg0, int arg1) {
        ++field4184;
        class149 var2 = (class149) class72.field1397.method1714((long) arg0, (byte) -127);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class124.field2307.method590(arg0, 4, arg1 ^ arg1);
            class149 var4 = new class149();
            if (var3 != null) {
                var4.method1119(new class128(var3), arg0, 0);
            }
            class72.field1397.method1705((byte) 125, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4194 = arg1;
        this.field4187 = arg7;
        this.field4191 = arg0;
        this.field4183 = arg5;
        this.field4180 = arg3;
        this.field4181 = arg2;
        this.field4182 = arg4;
        this.field4193 = arg6;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)V")
    public final void method111(byte arg0, int arg1, int arg2) {
        ++field4192;
        if (arg0 != -101) {
            field4177 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(BII)V")
    public final void method106(byte arg0, int arg1, int arg2) {
        ++field4185;
        int var4 = this.field4191 * arg2 >> 12;
        int var5 = this.field4194 * arg1 >> 12;
        if (arg0 > -102) {
            field4199 = null;
        }
        int var6 = this.field4181 * arg2 >> 12;
        int var7 = this.field4182 * arg2 >> 12;
        int var8 = this.field4183 * arg1 >> 12;
        int var9 = this.field4193 * arg2 >> 12;
        int var10 = this.field4187 * arg1 >> 12;
        int var11 = this.field4180 * arg1 >> 12;
        class189.method1377(var8, var10, var6, var4, var9, var5, var11, 1365739118, super.field567, var7);
    }
}
