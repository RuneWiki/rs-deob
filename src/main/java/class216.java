import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class216 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lro;")
    private class1 field2935 = new class1();

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Lro;")
    private class1 field2947 = new class1();

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "Lro;")
    private class1 field2956 = new class1();

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "Lro;")
    private class1 field2957 = new class1();

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "Lbk;")
    private class211 field2958 = new class211(4);

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public volatile int field2963 = 0;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public volatile int field2965 = 0;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "B")
    private byte field2964 = 0;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "Lbk;")
    private class211 field2962 = new class211(8);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field2933 = -2;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2955 = "Loaded defaults";

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
    public static int[] field2938 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "J")
    private long field2959;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "Lfr;")
    private class236 field2961;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "Lrj;")
    private class353 field2966;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "Ljava/awt/Font;")
    public static Font field2951;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Z")
    public static boolean field2943;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1408(boolean arg0) {
        field2936++;
        if (this.field2961 == null) {
            return;
        }
        try {
            if (!arg0) {
                this.method1418(true);
            }
            this.field2958.field2888 = 0;
            this.field2958.method1396(21375, 7);
            this.field2958.method1362(0, (byte) -37);
            this.field2961.method1511(4, 28067, 0, this.field2958.field2867);
        } catch (IOException var3) {
            try {
                this.field2961.method1503(!arg0);
            } catch (Exception var2) {
            }
            this.field2961 = null;
            this.field2965 = -2;
            this.field2963++;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 34)
    private final void method1409(int arg0) {
        field2934++;
        if (this.field2961 == null) {
            return;
        }
        try {
            this.field2958.field2888 = 0;
            this.field2958.method1396(21375, 6);
            this.field2958.method1362(3, (byte) -37);
            this.field2961.method1511(4, 28067, 0, this.field2958.field2867);
        } catch (IOException var3) {
            try {
                this.field2961.method1503(false);
            } catch (Exception var2) {
            }
            this.field2961 = null;
            this.field2963++;
            this.field2965 = -2;
        }
        if (arg0 < 25) {
            this.method1418(true);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZZ)V", line = 64)
    public final void method1410(boolean arg0, boolean arg1) {
        field2952++;
        if (this.field2961 == null || !arg1) {
            return;
        }
        try {
            this.field2958.field2888 = 0;
            this.field2958.method1396(21375, arg0 ? 2 : 3);
            this.field2958.method1362(0, (byte) -37);
            this.field2961.method1511(4, 28067, 0, this.field2958.field2867);
        } catch (IOException var4) {
            try {
                this.field2961.method1503(false);
            } catch (Exception var3) {
            }
            this.field2963++;
            this.field2961 = null;
            this.field2965 = -2;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZLfr;)V", line = 103)
    public final void method1411(byte arg0, boolean arg1, class236 arg2) {
        if (this.field2961 != null) {
            try {
                this.field2961.method1503(false);
            } catch (Exception var8) {
            }
            this.field2961 = null;
        }
        field2940++;
        if (arg0 != 96) {
            this.method1411((byte) -51, false, (class236) null);
        }
        this.field2961 = arg2;
        this.method1409(108);
        this.method1410(arg1, true);
        this.field2966 = null;
        this.field2962.field2888 = 0;
        while (true) {
            class353 var4 = (class353) this.field2947.method9(-6596);
            if (var4 == null) {
                while (true) {
                    class353 var5 = (class353) this.field2957.method9(arg0 - 6692);
                    if (var5 == null) {
                        if (this.field2964 != 0) {
                            try {
                                this.field2958.field2888 = 0;
                                this.field2958.method1396(21375, 4);
                                this.field2958.method1396(21375, this.field2964);
                                this.field2958.method1380(0, (byte) -8);
                                this.field2961.method1511(4, arg0 ^ 0x6DC3, 0, this.field2958.field2867);
                            } catch (IOException var7) {
                                try {
                                    this.field2961.method1503(false);
                                } catch (Exception var6) {
                                }
                                this.field2961 = null;
                                this.field2963++;
                                this.field2965 = -2;
                            }
                        }
                        this.field2960 = 0;
                        this.field2959 = class203.method1299((byte) 5);
                        return;
                    }
                    this.field2956.method6(arg0 ^ 0x35, var5);
                }
            }
            this.field2935.method6(73, var4);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)V", line = 174)
    public final void method1412(boolean arg0) {
        try {
            this.field2961.method1503(arg0);
        } catch (Exception var2) {
        }
        field2939++;
        this.field2965 = -1;
        this.field2964 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field2963++;
        this.field2961 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)V", line = 190)
    public static final void method1413(int arg0, byte arg1) {
        field2944++;
        class331 var2 = class139.field1976;
        synchronized (class139.field1976) {
            class139.field1976.method2054(-110, arg0);
        }
        class331 var3 = class444.field6487;
        synchronized (class444.field6487) {
            class444.field6487.method2054(-124, arg0);
        }
        class331 var4 = class360.field5262;
        synchronized (class360.field5262) {
            class360.field5262.method2054(-78, arg0);
        }
        class331 var5 = class173.field2412;
        synchronized (class173.field2412) {
            class173.field2412.method2054(91, arg0);
        }
        if (arg1 <= 57) {
            field2933 = -3;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)Z", line = 213)
    public final boolean method1414(int arg0) {
        field2941++;
        if (this.field2961 != null) {
            long var2 = class203.method1299((byte) 5);
            int var4 = (int) (var2 - this.field2959);
            this.field2959 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2960 += var4;
            if (this.field2960 > 30000) {
                try {
                    this.field2961.method1503(false);
                } catch (Exception var27) {
                }
                this.field2961 = null;
            }
        }
        if (this.field2961 == null) {
            return this.method1416(arg0 ^ 0xFFFFECA3) == 0 && this.method1421((byte) -91) == 0;
        }
        try {
            this.field2961.method1510(16);
            for (class353 var5 = (class353) this.field2935.method2(15056); var5 != null; var5 = (class353) this.field2935.method10(107)) {
                this.field2958.field2888 = 0;
                this.field2958.method1396(21375, 1);
                this.field2958.method1362((int) var5.field5780, (byte) -37);
                this.field2961.method1511(4, 28067, 0, this.field2958.field2867);
                this.field2947.method6(arg0 ^ 0xFFFFECC5, var5);
            }
            for (class353 var6 = (class353) this.field2956.method2(arg0 + 20009); var6 != null; var6 = (class353) this.field2956.method10(99)) {
                this.field2958.field2888 = 0;
                this.field2958.method1396(21375, 0);
                this.field2958.method1362((int) var6.field5780, (byte) -37);
                this.field2961.method1511(4, 28067, 0, this.field2958.field2867);
                this.field2957.method6(-123, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field2961.method1508((byte) 76);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field2960 = 0;
                byte var9 = 0;
                if (this.field2966 == null) {
                    var9 = 8;
                } else if (this.field2966.field5143 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field2966.field5148.field2867.length - this.field2966.field5144;
                    int var11 = 512 - this.field2966.field5143;
                    if (var10 - this.field2966.field5148.field2888 < var11) {
                        var11 = var10 - this.field2966.field5148.field2888;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field2961.method1502(this.field2966.field5148.field2867, arg0 + 4952, var11, this.field2966.field5148.field2888);
                    if (this.field2964 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field2966.field5148.field2867[this.field2966.field5148.field2888 + var12] = (byte) class97.method519(this.field2966.field5148.field2867[this.field2966.field5148.field2888 + var12], this.field2964);
                        }
                    }
                    this.field2966.field5143 += var11;
                    this.field2966.field5148.field2888 += var11;
                    if (this.field2966.field5148.field2888 == var10) {
                        this.field2966.method2519(-2107);
                        this.field2966.field1141 = false;
                        this.field2966 = null;
                    } else if (this.field2966.field5143 == 512) {
                        this.field2966.field5143 = 0;
                    }
                } else {
                    int var13 = var9 - this.field2962.field2888;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field2961.method1502(this.field2962.field2867, -1, var13, this.field2962.field2888);
                    if (this.field2964 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field2962.field2867[this.field2962.field2888 + var14] = (byte) class97.method519(this.field2962.field2867[this.field2962.field2888 + var14], this.field2964);
                        }
                    }
                    this.field2962.field2888 += var13;
                    if (var9 <= this.field2962.field2888) {
                        if (this.field2966 == null) {
                            this.field2962.field2888 = 0;
                            int var15 = this.field2962.method1342((byte) -127);
                            int var16 = this.field2962.method1355(32136);
                            int var17 = this.field2962.method1342((byte) -127);
                            int var18 = this.field2962.method1336((byte) -108);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class353 var24;
                            if (var20) {
                                for (var24 = (class353) this.field2957.method2(15056); var24 != null && var24.field5780 != var21; var24 = (class353) this.field2957.method10(125)) {
                                }
                            } else {
                                for (var24 = (class353) this.field2947.method2(arg0 + 20009); var24 != null && var24.field5780 != var21; var24 = (class353) this.field2947.method10(104)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field2966 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field2966.field5148 = new class211(var18 + var25 + this.field2966.field5144);
                            this.field2966.field5148.method1396(arg0 + 26328, var19);
                            this.field2966.field5148.method1361((byte) -122, var18);
                            this.field2962.field2888 = 0;
                            this.field2966.field5143 = 8;
                        } else if (this.field2966.field5143 != 0) {
                            throw new IOException();
                        } else if (this.field2962.field2867[0] == -1) {
                            this.field2962.field2888 = 0;
                            this.field2966.field5143 = 1;
                        } else {
                            this.field2966 = null;
                        }
                    }
                }
            }
            if (arg0 != -4953) {
                field2943 = true;
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field2961.method1503(false);
            } catch (Exception var26) {
            }
            this.field2961 = null;
            this.field2963++;
            this.field2965 = -2;
            return this.method1416(arg0 + 4957) == 0 && this.method1421((byte) -85) == 0;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)Z", line = 497)
    public final boolean method1415(int arg0) {
        field2953++;
        if (arg0 != 25501) {
            this.method1419((byte) 16);
        }
        return this.method1416(4) >= 20;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)I", line = 509)
    public final int method1416(int arg0) {
        if (arg0 == 4) {
            field2954++;
            return this.field2935.method3(-28490) + this.field2947.method3(arg0 ^ 0xFFFF90B2);
        } else {
            return 29;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(Z)V", line = 521)
    public static void method1417(boolean arg0) {
        field2938 = null;
        if (arg0) {
            field2933 = 80;
        }
        field2951 = null;
        field2955 = null;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(Z)V", line = 533)
    public final void method1418(boolean arg0) {
        field2937++;
        if (!arg0 && this.field2961 != null) {
            this.field2961.method1505(-104);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 549)
    public final void method1419(byte arg0) {
        if (arg0 != -79) {
            this.method1411((byte) 46, true, (class236) null);
        }
        field2949++;
        if (this.field2961 != null) {
            this.field2961.method1503(false);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBIZZ)Lrj;", line = 567)
    public final class353 method1420(int arg0, byte arg1, int arg2, boolean arg3, boolean arg4) {
        if (!arg4) {
            return null;
        }
        field2948++;
        long var6 = (long) ((arg0 << 16) + arg2);
        class353 var8 = new class353();
        var8.field5780 = var6;
        var8.field5144 = arg1;
        var8.field1145 = arg3;
        if (arg3) {
            if (this.method1416(4) >= 20) {
                throw new RuntimeException();
            }
            this.field2935.method6(-86, var8);
        } else if (this.method1421((byte) -95) < 20) {
            this.field2956.method6(85, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)I", line = 615)
    private final int method1421(byte arg0) {
        field2942++;
        if (arg0 >= -72) {
            this.field2962 = null;
        }
        return this.field2956.method3(-28490) + this.field2957.method3(-28490);
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)Z", line = 629)
    public final boolean method1422(int arg0) {
        field2945++;
        if (arg0 <= 10) {
            this.method1421((byte) -119);
        }
        return this.method1421((byte) -114) >= 20;
    }
}
