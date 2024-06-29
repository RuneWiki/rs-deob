import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class88 extends class71 {

    @OriginalMember(owner = "client!od", name = "E", descriptor = "Lmc;")
    public static class75 field2165 = class30.method234(true, "Privater Chat");

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field2160 = -1;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "Lmc;")
    private static class75 field2161 = class30.method234(true, "Enter name:");

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lmc;")
    public static class75 field2155 = field2161;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "Lmc;")
    private static class75 field2172 = class30.method234(true, "Offline");

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Lmc;")
    private static class75 field2158 = class30.method234(true, "glow2:");

    @OriginalMember(owner = "client!od", name = "K", descriptor = "Lmc;")
    public static class75 field2170 = field2158;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Lmc;")
    public static class75 field2157 = field2172;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Lmc;")
    public static class75 field2173 = class30.method234(true, "backhmid2");

    @OriginalMember(owner = "client!od", name = "J", descriptor = "Lfa;")
    public static class32 field2169 = new class32();

    @OriginalMember(owner = "client!od", name = "P", descriptor = "Lmc;")
    private static class75 field2174 = class30.method234(true, "cyan:");

    @OriginalMember(owner = "client!od", name = "S", descriptor = "Lmc;")
    public static class75 field2177 = class30.method234(true, "@yel@*V");

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "Lmc;")
    public static class75 field2175 = field2174;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field2178 = 0;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "Ljc;")
    public static class57 field2171;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Lnc;")
    public static class81 field2159;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "Lpb;")
    public static class92 field2176;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V", line = 20)
    public static void method729(byte arg0) {
        field2176 = null;
        field2159 = null;
        field2170 = null;
        field2155 = null;
        field2174 = null;
        field2173 = null;
        field2157 = null;
        if (arg0 != 81) {
            field2165 = null;
        }
        field2158 = null;
        field2172 = null;
        field2175 = null;
        field2165 = null;
        field2171 = null;
        field2169 = null;
        field2161 = null;
        field2177 = null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIJ)Z", line = 49)
    public final boolean method730(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class24.field479[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class24.field479[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class24.field479[arg1] = var7 | var6;
            } else {
                this.method139(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method139(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class27.field560[var8] = 12800;
                int var9 = method734(var8);
                this.method139(arg0, 7, var9 >> 7, arg3);
                this.method139(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class27.field560[var10] = (arg2 << 7) + (class27.field560[var10] & 0x7F);
                } else {
                    class27.field560[var10] = (class27.field560[var10] & 0x3F80) + arg2;
                }
                int var11 = method734(var10);
                this.method139(arg0, 7, var11 >> 7, arg3);
                this.method139(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(JIII)V", line = 111)
    public final void method731(long arg0, int arg1, int arg2, int arg3) {
        field2168++;
        if (arg3 != 0) {
            return;
        }
        int var6 = (int) (Math.pow(0.1D, (double) arg2 * 5.0E-4D) * (double) arg1 + 0.5D);
        if (class59.field1489 == var6) {
            return;
        }
        class59.field1489 = var6;
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method734(var7);
            this.method139(var7 + 176, 7, var8 >> 7, arg0);
            this.method139(var7 + 176, 39, var8 & 0x7F, arg0);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(JI)V", line = 141)
    public final void method732(long arg0, int arg1) {
        field2164++;
        for (int var4 = 0; var4 < 128; var4++) {
            int var11 = class24.field479[var4];
            class24.field479[var4] = 0;
            for (int var12 = 0; var12 < 16; var12++) {
                if ((var11 & 0x1 << var12) != 0) {
                    this.method139(var12 + 144, var4, 0, arg0);
                }
            }
        }
        for (int var5 = arg1; var5 < 16; var5++) {
            this.method139(var5 + 176, 123, 0, arg0);
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method139(var6 + 176, 120, 0, arg0);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method139(var7 + 176, 121, 0, arg0);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method139(var8 + 176, 0, 0, arg0);
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method139(var9 + 176, 32, 0, arg0);
        }
        for (int var10 = 0; var10 < 16; var10++) {
            this.method139(var10 + 192, 0, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lmc;ILka;)I", line = 221)
    public static final int method733(class75 arg0, int arg1, class61 arg2) {
        field2163++;
        int var3 = arg2.field1556;
        arg2.method497(arg0.field1869, 16711680);
        arg2.field1556 += class38.field903.method312(arg1, arg2.field1556, arg2.field1577, false, arg0.field1912, arg0.field1869);
        return arg2.field1556 - var3;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)I", line = 246)
    private static final int method734(int arg0) {
        int var1 = class27.field560[arg0];
        int var2 = (class59.field1489 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 262)
    public static final String method735(int arg0, Throwable arg1) throws IOException {
        field2156++;
        String var2;
        if (arg1 instanceof class1) {
            class1 var3 = (class1) arg1;
            arg1 = var3.field21;
            var2 = var3.field25 + " | ";
        } else {
            var2 = "";
        }
        if (arg0 != -25519) {
            return null;
        }
        StringWriter var4 = new StringWriter();
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
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V", line = 345)
    public static final void method736(int arg0, int arg1) {
        field2162++;
        if (arg0 == arg1 || !class104.field2632[arg1]) {
            return;
        }
        class122.field3012.method443(false, arg1);
        if (class74.field1854[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class74.field1854[arg1].length; var3++) {
            if (class74.field1854[arg1][var3] != null) {
                if (class74.field1854[arg1][var3].field2535 == 2) {
                    var2 = false;
                } else {
                    class74.field1854[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class74.field1854[arg1] = null;
        }
        class104.field2632[arg1] = false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBJ)V", line = 389)
    public final void method737(int arg0, byte arg1, long arg2) {
        if (arg1 != -20) {
            field2158 = null;
        }
        field2166++;
        class59.field1489 = arg0;
        for (int var5 = 0; var5 < 16; var5++) {
            class27.field560[var5] = 12800;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            int var7 = method734(var6);
            this.method139(var6 + 176, 7, var7 >> 7, arg2);
            this.method139(var6 + 176, 39, var7 & 0x7F, arg2);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIJ)V")
    public abstract void method139(int arg0, int arg1, int arg2, long arg3);
}
