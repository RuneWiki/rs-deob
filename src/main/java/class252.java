import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class252 extends class88 {

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "Lre;")
    public class266 field4017 = new class266();

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "Lbb;")
    public class173 field4021 = new class173();

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "Lhi;")
    private class25 field4011;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "[I")
    public static int[] field4009 = new int[100];

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field4019 = 0;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "Lbf;")
    public static class102 field4002;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Lsb;")
    public static class124 field4005;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "Lsb;")
    public static class124 field4012;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "[I")
    public static int[] field4010;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
    public static final void method1674(byte arg0) {
        class254.field4039 = 0;
        field4001++;
        class38.field640 = 0;
        class2.method10(-105);
        class113.method832((byte) 2);
        class192.method1316((byte) 72);
        class289.method1942(2);
        for (int var1 = 0; var1 < class38.field640; var1++) {
            int var3 = class6.field80[var1];
            if (class207.field3336 != class191.field3129[var3].field2846) {
                if (class191.field3129[var3].field3431 > 0) {
                    class127.method928(class191.field3129[var3], false);
                }
                class191.field3129[var3] = null;
            }
        }
        if (class222.field3547 != class143.field2360.field2231) {
            throw new RuntimeException("gpp1 pos:" + class143.field2360.field2231 + " psize:" + class222.field3547);
        }
        int var2 = 0;
        if (arg0 > -100) {
            return;
        }
        while (var2 < class144.field2386) {
            if (class191.field3129[class279.field4431[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class144.field2386);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()I")
    public final int method208() {
        field4008++;
        return 0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILri;I)V")
    private final void method1675(int arg0, class267 arg1, int arg2) {
        if ((this.field4011.field405[arg1.field4270] & 0x4) != 0 && arg1.field4272 < 0) {
            int var4 = this.field4011.field386[arg1.field4270] / class23.field359;
            int var5 = (var4 + 1048575 - arg1.field4280) / var4;
            arg1.field4280 = arg2 * var4 + arg1.field4280 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field4011.field380[arg1.field4270] == 0) {
                    arg1.field4277 = class221.method1477(arg1.field4281, arg1.field4277.method1456(), arg1.field4277.method1463(), arg1.field4277.method1481());
                } else {
                    arg1.field4277 = class221.method1477(arg1.field4281, arg1.field4277.method1456(), 0, arg1.field4277.method1481());
                    this.field4011.method221(arg1, -65, arg1.field4262.field555[arg1.field4263] < 0);
                }
                if (arg1.field4262.field555[arg1.field4263] < 0) {
                    arg1.field4277.method1485(-1);
                }
                arg2 = arg1.field4280 / var4;
            }
        }
        if (arg0 != 7342) {
            field4012 = null;
        }
        field4014++;
        arg1.field4277.method211(arg2);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "([III)V")
    public final void method205(int[] arg0, int arg1, int arg2) {
        this.field4021.method205(arg0, arg1, arg2);
        for (class267 var4 = (class267) this.field4017.method1807(-118); var4 != null; var4 = (class267) this.field4017.method1808((byte) 39)) {
            if (!this.field4011.method195(0, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field4285) {
                        this.method1679(var5, var5 + var6, (byte) 80, var4, arg0, var6);
                        var4.field4285 -= var6;
                        break;
                    }
                    this.method1679(var5, var5 + var6, (byte) 45, var4, arg0, var4.field4285);
                    var5 += var4.field4285;
                    var6 -= var4.field4285;
                } while (!this.field4011.method213(arg0, (byte) -91, var5, var6, var4));
            }
        }
        field4020++;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field4012 = null;
        field4005 = null;
        if (arg0 <= -34) {
            field4010 = null;
            field4009 = null;
            field4002 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method1677(Throwable arg0, byte arg1) throws IOException {
        field4004++;
        if (arg1 != -27) {
            method1676(-79);
        }
        String var3;
        if (arg0 instanceof class174) {
            class174 var2 = (class174) arg0;
            var3 = var2.field2937 + " | ";
            arg0 = var2.field2928;
        } else {
            var3 = "";
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

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "()Lmi;")
    public final class88 method193() {
        field4018++;
        class267 var1 = (class267) this.field4017.method1807(-92);
        if (var1 == null) {
            return null;
        } else if (var1.field4277 == null) {
            return this.method215();
        } else {
            return var1.field4277;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()Lmi;")
    public final class88 method215() {
        field4006++;
        class267 var1;
        do {
            var1 = (class267) this.field4017.method1808((byte) 113);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4277 == null);
        return var1.field4277;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(CIB)I")
    public static final int method1678(char arg0, int arg1, byte arg2) {
        field4016++;
        if (arg2 != 71) {
            field4012 = null;
        }
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

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBLri;[II)V")
    private final void method1679(int arg0, int arg1, byte arg2, class267 arg3, int[] arg4, int arg5) {
        if ((this.field4011.field405[arg3.field4270] & 0x4) != 0 && arg3.field4272 < 0) {
            int var7 = this.field4011.field386[arg3.field4270] / class23.field359;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field4280) / var7;
                if (arg5 < var8) {
                    arg3.field4280 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg3.field4277.method205(arg4, arg0, var8);
                arg0 += var8;
                int var9 = class23.field359 / 100;
                class221 var10 = arg3.field4277;
                arg3.field4280 += var7 * var8 - 1048576;
                int var11 = 262144 / var7;
                if (var9 > var11) {
                    var9 = var11;
                }
                if (this.field4011.field380[arg3.field4270] == 0) {
                    arg3.field4277 = class221.method1477(arg3.field4281, var10.method1456(), var10.method1463(), var10.method1481());
                } else {
                    arg3.field4277 = class221.method1477(arg3.field4281, var10.method1456(), 0, var10.method1481());
                    this.field4011.method221(arg3, -65, ~arg3.field4262.field555[arg3.field4263] > -1);
                    arg3.field4277.method1457(var9, var10.method1463());
                }
                if (arg3.field4262.field555[arg3.field4263] < 0) {
                    arg3.field4277.method1485(-1);
                }
                var10.method1466(var9);
                var10.method205(arg4, arg0, arg1 - arg0);
                if (var10.method1455()) {
                    this.field4021.method1240(var10);
                }
            }
        }
        arg3.field4277.method205(arg4, arg0, arg5);
        if (arg2 > 32) {
            field4015++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public final void method211(int arg0) {
        this.field4021.method211(arg0);
        field4013++;
        for (class267 var2 = (class267) this.field4017.method1807(-111); var2 != null; var2 = (class267) this.field4017.method1808((byte) 39)) {
            if (!this.field4011.method195(0, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field4285 >= var3) {
                        this.method1675(7342, var2, var3);
                        var2.field4285 -= var3;
                        break;
                    }
                    this.method1675(7342, var2, var2.field4285);
                    var3 -= var2.field4285;
                } while (!this.field4011.method213((int[]) null, (byte) -77, 0, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lhi;)V")
    public class252(class25 arg0) {
        this.field4011 = arg0;
    }
}
