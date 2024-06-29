import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class109 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "[I")
    private int[] field2096;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[I")
    private int[] field2095;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Laf;")
    private class7 field2101;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Laf;")
    private class7 field2102;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "[Laf;")
    private class7[] field2104;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field2098 = 0;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lpi;")
    public static class158 field2097 = new class158();

    @OriginalMember(owner = "client!l", name = "o", descriptor = "[I")
    public static int[] field2109 = new int[100];

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Loc;")
    public static class142 field2110;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lca;")
    public static class22 field2108;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lpe;Lof;B)Z")
    public final boolean method718(class154 arg0, class145 arg1, byte arg2) {
        field2111++;
        for (int var4 = 0; var4 < this.field2096.length; var4++) {
            if (!arg0.method1078(arg2 ^ 0x52, this.field2096[var4])) {
                return false;
            }
        }
        if (arg2 != 10) {
            this.method718(null, null, (byte) 59);
        }
        for (int var5 = 0; var5 < this.field2095.length; var5++) {
            if (!arg1.method961(12377, this.field2095[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method719(int arg0) {
        field2106++;
        try {
            if (class21.field354 == null) {
                class21.field354 = new class221(class69.field1356, class220.method1422(new class141[] { class141.field2725, class111.field2138, class182.field3575 }, -3).method923((byte) -54));
            } else {
                byte[] var1 = class21.field354.method1426(true);
                if (var1 != null) {
                    class146 var2 = new class146(var1);
                    class35.field707 = var2.method1007(55);
                    class42.field827 = new class25[class35.field707];
                    for (int var3 = 0; var3 < class35.field707; var3++) {
                        class25 var4 = class42.field827[var3] = new class25();
                        int var5 = var2.method1007(30);
                        var4.field468 = (var5 & 0x8000) != 0;
                        var4.field475 = var5 & 0x7FFF;
                        var4.field476 = var2.method1013(-19405);
                        var4.field469 = var2.method992((byte) -67);
                        var4.field472 = var3;
                        var4.field473 = class90.method608(var4.field476, 3379);
                    }
                    class22.method133(class42.field827, class24.field450, 0, class47.field903, 25097, class42.field827.length - 1);
                    class21.field354 = null;
                    class87.field1739 = true;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class21.field354 = null;
        }
        if (arg0 != -25539) {
            method721((byte) -37);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class109() {
        this.field2096 = new int[0];
        this.field2095 = new int[0];
        this.field2101 = new class135();
        this.field2101.field121 = 1;
        this.field2102 = new class135();
        this.field2102.field121 = 1;
        this.field2104 = new class7[] { this.field2101, this.field2102 };
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Log;)V")
    public class109(class146 arg0) {
        int var2 = arg0.method991(255);
        this.field2104 = new class7[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class7 var16 = class184.method1232(arg0, (byte) -44);
            if (var16.method45(-24089) >= 0) {
                var3++;
            }
            if (var16.method44(61) >= 0) {
                var5++;
            }
            int var17 = var16.field115.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method991(255);
            }
            this.field2104[var6] = var16;
        }
        this.field2095 = new int[var5];
        int var7 = 0;
        this.field2096 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class7 var11 = this.field2104[var9];
            int var12 = var11.field115.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field115[var13] = this.field2104[var4[var9][var13]];
            }
            int var14 = var11.method45(-24089);
            int var15 = var11.method44(76);
            if (var14 > 0) {
                this.field2096[var8++] = var14;
            }
            if (var15 > 0) {
                this.field2095[var7++] = var15;
            }
            var4[var9] = null;
        }
        Object var10 = null;
        this.field2101 = this.field2104[arg0.method991(255)];
        this.field2102 = this.field2104[arg0.method991(255)];
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLpe;IDZLof;I)[I")
    public final int[] method720(byte arg0, class154 arg1, int arg2, double arg3, boolean arg4, class145 arg5, int arg6) {
        int[] var9 = new int[arg2 * arg6];
        class59.method401(arg3, -80);
        field2099++;
        if (arg0 > -27) {
            this.field2095 = null;
        }
        class108.field2093 = arg1;
        class41.field811 = arg5;
        class45.method301(arg6, arg2, -73);
        for (int var10 = 0; var10 < this.field2104.length; var10++) {
            this.field2104[var10].method49((byte) 100, arg2, arg6);
        }
        int var11;
        int var12;
        byte var13;
        if (arg4) {
            var12 = arg6 - 1;
            var11 = -1;
            var13 = -1;
        } else {
            var11 = arg6;
            var12 = 0;
            var13 = 1;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg2; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field2101.field99) {
                int[] var21 = this.field2101.method30((byte) 45, var15);
                var19 = var21;
                var18 = var21;
                var20 = var21;
            } else {
                int[][] var17 = this.field2101.method51(var15, (byte) -114);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var12; var22 != var11; var22 += var13) {
                int var23 = var20[var22] >> 4;
                int var24 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class195.field3740[var23];
                int var26 = class195.field3740[var24];
                int var27 = var18[var22] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class195.field3740[var27];
                var9[var14++] = (var25 << 16) + (var26 << 8) + var28;
            }
        }
        for (int var16 = 0; var16 < this.field2104.length; var16++) {
            this.field2104[var16].method50(false);
        }
        return var9;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method721(byte arg0) {
        field2097 = null;
        field2108 = null;
        if (arg0 != -87) {
            method719(88);
        }
        field2110 = null;
        field2109 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIB)I")
    public static final int method722(int arg0, int arg1, byte arg2) {
        class136 var3 = (class136) class96.field1894.method792((long) arg0, 22346);
        field2105++;
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            if (arg2 <= 1) {
                field2098 = 61;
            }
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2594.length; var5++) {
                if (var3.field2586[var5] == arg1) {
                    var4 += var3.field2594[var5];
                }
            }
            return var4;
        }
    }
}
