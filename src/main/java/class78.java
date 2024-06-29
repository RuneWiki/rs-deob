import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class78 {

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public int field1037 = 0;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "Z")
    public boolean field1045 = false;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public int field1051 = -1;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "Z")
    public boolean field1048 = false;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public int field1038 = -1;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
    public int field1053 = 99;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
    public int field1056 = 2;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public int field1046 = -1;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public int field1042 = 5;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "Z")
    public boolean field1052 = false;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
    public int field1060 = -1;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
    public int field1059 = -1;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "Llu;")
    public static class610 field1033 = new class610(70, 2);

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "Lh;")
    public static class572 field1055 = new class572("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field1058 = new String[100];

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "Lht;")
    public class499 field1044;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "[I")
    public int[] field1035;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "[I")
    public int[] field1049;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "[I")
    private int[] field1057;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "[Z")
    public boolean[] field1034;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "[[I")
    public int[][] field1054;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILr;III)Lr;")
    public final class159 method597(int arg0, int arg1, class159 arg2, int arg3, int arg4, int arg5) {
        field1041++;
        int var7 = this.field1049[arg3];
        int var8 = this.field1035[arg3];
        class106 var9 = this.field1044.method2982(var8 >> 16, 66);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method94((byte) 1, arg1, true);
        }
        class106 var11 = null;
        if ((this.field1048 || class638.field9309) && arg0 != -1 && this.field1035.length > arg0) {
            int var12 = this.field1035[arg0];
            var11 = this.field1044.method2982(var12 >> 16, 98);
            arg0 = var12 & 0xFFFF;
        }
        class106 var13 = null;
        class106 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field1057 != null) {
            if (arg3 < this.field1057.length) {
                var15 = this.field1057[arg3];
                if (var15 != 65535) {
                    var13 = this.field1044.method2982(var15 >> 16, 50);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1048 || class638.field9309) && arg0 != -1 && arg0 < this.field1057.length) {
                var16 = this.field1057[arg0];
                if (var16 != 65535) {
                    var14 = this.field1044.method2982(var16 >> 16, -31);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1052) {
            arg1 |= 0x200;
        }
        if (arg4 < 46) {
            return null;
        }
        if (var9.method786(true, var10)) {
            arg1 |= 0x80;
        }
        if (var9.method782(var10, -127)) {
            arg1 |= 0x100;
        }
        if (var9.method780(var10, true)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method786(true, var15)) {
                arg1 |= 0x80;
            }
            if (var13.method782(var15, -128)) {
                arg1 |= 0x100;
            }
            if (var13.method780(var15, true)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method786(true, arg0)) {
                arg1 |= 0x80;
            }
            if (var11.method782(arg0, -126)) {
                arg1 |= 0x100;
            }
            if (var11.method780(arg0, true)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method786(true, var16)) {
                arg1 |= 0x80;
            }
            if (var14.method782(var16, 76)) {
                arg1 |= 0x100;
            }
            if (var14.method780(var16, true)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class159 var18 = arg2.method94((byte) 1, var17, true);
        var18.method1142(var9, var11, var7, arg0, 0, var10, -32238, arg5 - 1, this.field1052);
        if (var13 != null) {
            var18.method1142(var13, var14, var7, var16, 0, var15, -32238, arg5 - 1, this.field1052);
        }
        return var18;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public static void method598(int arg0) {
        field1033 = null;
        if (arg0 != 1024) {
            method605(64);
        }
        field1055 = null;
        field1058 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIBILr;BII)Lr;")
    public final class159 method599(int arg0, int arg1, byte arg2, int arg3, class159 arg4, byte arg5, int arg6, int arg7) {
        field1040++;
        int var9 = this.field1049[arg3];
        int var10 = this.field1035[arg3];
        class106 var11 = this.field1044.method2982(var10 >> 16, -124);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method94(arg5, arg0, true);
        }
        class106 var13 = null;
        if ((this.field1048 || class638.field9309) && arg1 != -1 && this.field1035.length > arg1) {
            int var14 = this.field1035[arg1];
            var13 = this.field1044.method2982(var14 >> 16, -117);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field1052) {
            arg0 |= 0x200;
        }
        if (var11.method786(true, var12)) {
            arg0 |= 0x80;
        }
        if (var11.method782(var12, arg2 ^ 0x2C)) {
            arg0 |= 0x100;
        }
        if (var11.method780(var12, true)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method786(true, arg1)) {
                arg0 |= 0x80;
            }
            if (var13.method782(arg1, -127)) {
                arg0 |= 0x100;
            }
            if (var13.method780(arg1, true)) {
                arg0 |= 0x400;
            }
        }
        if (arg2 != -83) {
            this.method602((byte) 102, null, 88);
        }
        int var15 = arg0 | 0x20;
        class159 var16 = arg4.method94(arg5, var15, true);
        var16.method1142(var11, var13, var9, arg1, arg7, var12, -32238, arg6 - 1, this.field1052);
        return var16;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZIIZ)I")
    public final int method600(boolean arg0, int arg1, int arg2, boolean arg3) {
        field1036++;
        int var5 = 0;
        if (arg0) {
            method598(51);
        }
        int var6 = 0;
        int var7 = this.field1035[arg2];
        class106 var8 = null;
        class106 var9 = this.field1044.method2982(var7 >> 16, 27);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1048 || class638.field9309) && arg1 != -1 && this.field1035.length > arg1) {
            int var11 = this.field1035[arg1];
            var8 = this.field1044.method2982(var11 >> 16, -119);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1052) {
            var5 |= 0x200;
        }
        if (var9.method786(true, var10)) {
            var5 |= 0x80;
        }
        if (var9.method782(var10, -125)) {
            var5 |= 0x100;
        }
        if (var9.method780(var10, true)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method786(true, var6)) {
                var5 |= 0x80;
            }
            if (var8.method782(var6, -126)) {
                var5 |= 0x100;
            }
            if (var8.method780(var6, true)) {
                var5 |= 0x400;
            }
        }
        if (this.field1057 != null && arg3) {
            if (arg2 < this.field1057.length) {
                int var12 = this.field1057[arg2];
                if (var12 != 65535) {
                    class106 var13 = this.field1044.method2982(var12 >> 16, 12);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method786(true, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method782(var14, -124)) {
                            var5 |= 0x100;
                        }
                        if (var13.method780(var14, true)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1048 || class638.field9309) && arg1 != -1 && this.field1057.length > arg1) {
                int var15 = this.field1057[arg1];
                if (var15 != 65535) {
                    class106 var16 = this.field1044.method2982(var15 >> 16, -3);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method786(!arg0, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method782(var17, -126)) {
                            var5 |= 0x100;
                        }
                        if (var16.method780(var17, true)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        field1039++;
        if (this.field1060 == -1) {
            if (this.field1034 == null) {
                this.field1060 = 0;
            } else {
                this.field1060 = 2;
            }
        }
        if (this.field1059 == -1) {
            if (this.field1034 == null) {
                this.field1059 = 0;
            } else {
                this.field1059 = 2;
            }
        }
        if (arg0 != -27601) {
            this.field1042 = -56;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLgw;I)V")
    private final void method602(byte arg0, class148 arg1, int arg2) {
        if (arg2 == 1) {
            int var13 = arg1.method1045(true);
            this.field1049 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1049[var14] = arg1.method1045(true);
            }
            this.field1035 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field1035[var15] = arg1.method1045(true);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field1035[var16] += arg1.method1045(true) << 16;
            }
        } else if (arg2 == 2) {
            this.field1046 = arg1.method1045(true);
        } else if (arg2 == 3) {
            this.field1034 = new boolean[256];
            int var11 = arg1.method1032((byte) -33);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1034[arg1.method1032((byte) -33)] = true;
            }
        } else if (arg2 == 5) {
            this.field1042 = arg1.method1032((byte) -33);
        } else if (arg2 == 6) {
            this.field1038 = arg1.method1045(true);
        } else if (arg2 == 7) {
            this.field1051 = arg1.method1045(true);
        } else if (arg2 == 8) {
            this.field1053 = arg1.method1032((byte) -33);
        } else if (arg2 == 9) {
            this.field1059 = arg1.method1032((byte) -33);
        } else if (arg2 == 10) {
            this.field1060 = arg1.method1032((byte) -33);
        } else if (arg2 == 11) {
            this.field1056 = arg1.method1032((byte) -33);
        } else if (arg2 == 12) {
            int var4 = arg1.method1032((byte) -33);
            this.field1057 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1057[var5] = arg1.method1045(true);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1057[var6] += arg1.method1045(true) << 16;
            }
        } else if (arg2 == 13) {
            int var7 = arg1.method1045(true);
            this.field1054 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg1.method1032((byte) -33);
                if (var9 > 0) {
                    this.field1054[var8] = new int[var9];
                    this.field1054[var8][0] = arg1.method1028((byte) 123);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field1054[var8][var10] = arg1.method1045(true);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field1052 = true;
        } else if (arg2 == 15) {
            this.field1048 = true;
        } else if (arg2 == 16) {
            this.field1045 = true;
        } else if (arg2 == 17) {
            this.field1037 = arg1.method1032((byte) -33);
        }
        if (arg0 < 72) {
            method598(18);
        }
        field1061++;
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V")
    public static final void method603(int arg0) {
        class193.field2862 = 0;
        field1032++;
        int var1 = (class541.field8119.field8496 >> 7) + class473.field6687;
        int var2 = (class541.field8119.field8500 >> 7) + class38.field463;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class193.field2862 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class193.field2862 = 1;
        }
        if (class193.field2862 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class193.field2862 = 0;
        }
        if (arg0 >= -107) {
            field1055 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lgw;Z)V")
    public final void method604(class148 arg0, boolean arg1) {
        if (!arg1) {
            this.method602((byte) 16, null, -14);
        }
        field1047++;
        while (true) {
            int var3 = arg0.method1032((byte) -33);
            if (var3 == 0) {
                return;
            }
            this.method602((byte) 113, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)Z")
    public static final boolean method605(int arg0) {
        field1043++;
        if (class192.field2854) {
            try {
                if ((Boolean) class640.method3702(class442.field5896.field4568, (byte) 64, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 256) {
            field1033 = null;
        }
        return true;
    }
}
