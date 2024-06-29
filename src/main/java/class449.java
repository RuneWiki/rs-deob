import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class449 {

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public int field6262 = -1;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public int field6266 = 99;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public int field6264 = -1;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public int field6263 = -1;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public int field6274 = 5;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public int field6272 = -1;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Z")
    public boolean field6260 = false;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Z")
    public boolean field6270 = false;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public int field6273 = 0;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "Z")
    public boolean field6279 = false;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public int field6282 = -1;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    public int field6286 = 2;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[Lld;")
    public static class117[] field6259 = new class117[4];

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field6257 = 0;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "[Lie;")
    public static class6[] field6284;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "Lkn;")
    public static class530 field6285;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "Ljava/lang/String;")
    public static String field6287;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public int field6269;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Lcf;")
    public class437 field6275;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
    public int[] field6258;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "[I")
    public int[] field6276;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "[I")
    private int[] field6280;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "[Z")
    public boolean[] field6277;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "[[I")
    public int[][] field6268;

    static {
        new class530("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field6284 = new class6[30];
        field6285 = new class530("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");
        field6287 = "";
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILe;IIBIB)Le;", line = 3)
    public final class377 method2622(int arg0, int arg1, class377 arg2, int arg3, int arg4, byte arg5, int arg6, byte arg7) {
        field6278++;
        int var9 = this.field6258[arg4];
        int var10 = this.field6276[arg4];
        class454 var11 = this.field6275.method2572(var10 >> 16, arg5);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg2.method1590(arg7, arg1, true);
        }
        class454 var13 = null;
        if ((this.field6270 || class26.field318) && arg0 != -1 && arg0 < this.field6276.length) {
            int var14 = this.field6276[arg0];
            var13 = this.field6275.method2572(var14 >> 16, (byte) 85);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field6260) {
            arg1 |= 0x200;
        }
        if (var11.method2648(13834, var12)) {
            arg1 |= 0x80;
        }
        if (var11.method2651(var12, -1094206008)) {
            arg1 |= 0x100;
        }
        if (var11.method2649(var12, 255)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2648(arg5 ^ 0x3669, arg0)) {
                arg1 |= 0x80;
            }
            if (var13.method2651(arg0, -1094206008)) {
                arg1 |= 0x100;
            }
            if (var13.method2649(arg0, 255)) {
                arg1 |= 0x400;
            }
        }
        int var15 = arg1 | 0x20;
        class377 var16 = arg2.method1590(arg7, var15, true);
        var16.method2205((byte) -89, var12, arg0, var13, arg6, arg3 - 1, var9, this.field6260, var11);
        return var16;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lwm;II)V", line = 69)
    private final void method2623(class403 arg0, int arg1, int arg2) {
        field6271++;
        if (arg2 == 1) {
            int var13 = arg0.method2338(0);
            this.field6258 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field6258[var14] = arg0.method2338(0);
            }
            this.field6276 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field6276[var15] = arg0.method2338(0);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field6276[var16] = (arg0.method2338(0) << 16) + this.field6276[var16];
            }
        } else if (arg2 == 2) {
            this.field6264 = arg0.method2338(0);
        } else if (arg2 == 3) {
            this.field6277 = new boolean[256];
            int var11 = arg0.method2357((byte) 110);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field6277[arg0.method2357((byte) 113)] = true;
            }
        } else if (arg2 == 5) {
            this.field6274 = arg0.method2357((byte) 123);
        } else if (arg2 == 6) {
            this.field6282 = arg0.method2338(0);
        } else if (arg2 == 7) {
            this.field6263 = arg0.method2338(0);
        } else if (arg2 == 8) {
            this.field6266 = arg0.method2357((byte) 127);
        } else if (arg2 == 9) {
            this.field6272 = arg0.method2357((byte) 120);
        } else if (arg2 == 10) {
            this.field6262 = arg0.method2357((byte) 127);
        } else if (arg2 == 11) {
            this.field6286 = arg0.method2357((byte) 117);
        } else if (arg2 == 12) {
            int var4 = arg0.method2357((byte) 120);
            this.field6280 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6280[var5] = arg0.method2338(0);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field6280[var6] = (arg0.method2338(0) << 16) + this.field6280[var6];
            }
        } else if (arg2 == 13) {
            int var7 = arg0.method2338(arg1 ^ 0xF65DE110);
            this.field6268 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg0.method2357((byte) 125);
                if (var9 > 0) {
                    this.field6268[var8] = new int[var9];
                    this.field6268[var8][0] = arg0.method2323((byte) 106);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field6268[var8][var10] = arg0.method2338(0);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field6260 = true;
        } else if (arg2 == 15) {
            this.field6270 = true;
        } else if (arg2 == 16) {
            this.field6279 = true;
        } else if (arg2 == 17) {
            this.field6273 = arg0.method2357((byte) 123);
        }
        if (arg1 != -161619696) {
            this.field6276 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 234)
    public static void method2624(int arg0) {
        field6285 = null;
        field6259 = null;
        if (arg0 == -15) {
            field6287 = null;
            field6284 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 250)
    public static final String method2625(String arg0, String arg1, String arg2, int arg3) {
        if (arg3 != -8) {
            return null;
        }
        field6265++;
        for (int var4 = arg0.indexOf(arg2); var4 != -1; var4 = arg0.indexOf(arg2, arg1.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg1 + arg0.substring(var4 + arg2.length());
        }
        return arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILe;III)Le;", line = 274)
    public final class377 method2626(int arg0, int arg1, class377 arg2, int arg3, int arg4, int arg5) {
        field6261++;
        int var7 = this.field6258[arg3];
        int var8 = this.field6276[arg3];
        class454 var9 = this.field6275.method2572(var8 >> 16, (byte) 80);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method1590((byte) 1, arg4, true);
        }
        class454 var11 = null;
        if ((this.field6270 || class26.field318) && arg1 != -1 && arg1 < this.field6276.length) {
            int var12 = this.field6276[arg1];
            var11 = this.field6275.method2572(var12 >> 16, (byte) 104);
            arg1 = var12 & 0xFFFF;
        }
        class454 var13 = null;
        class454 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field6280 != null) {
            if (this.field6280.length > arg3) {
                var15 = this.field6280[arg3];
                if (var15 != 65535) {
                    var13 = this.field6275.method2572(var15 >> 16, (byte) 78);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field6270 || class26.field318) && arg1 != -1 && this.field6280.length > arg1) {
                var16 = this.field6280[arg1];
                if (var16 != 65535) {
                    var14 = this.field6275.method2572(var16 >> 16, (byte) 108);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field6260) {
            arg4 |= 0x200;
        }
        if (var9.method2648(13834, var10)) {
            arg4 |= 0x80;
        }
        if (var9.method2651(var10, -1094206008)) {
            arg4 |= 0x100;
        }
        if (var9.method2649(var10, arg5 ^ 0x3C380D8F)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2648(arg5 ^ 0x3C383B7A, var15)) {
                arg4 |= 0x80;
            }
            if (var13.method2651(var15, -1094206008)) {
                arg4 |= 0x100;
            }
            if (var13.method2649(var15, 255)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2648(13834, arg1)) {
                arg4 |= 0x80;
            }
            if (var11.method2651(arg1, -1094206008)) {
                arg4 |= 0x100;
            }
            if (var11.method2649(arg1, 255)) {
                arg4 |= 0x400;
            }
        }
        if (arg5 != 1010306416) {
            return null;
        }
        if (var14 != null) {
            if (var14.method2648(arg5 ^ 0x3C383B7A, var16)) {
                arg4 |= 0x80;
            }
            if (var14.method2651(var16, arg5 - 2104512424)) {
                arg4 |= 0x100;
            }
            if (var14.method2649(var16, 255)) {
                arg4 |= 0x400;
            }
        }
        int var17 = arg4 | 0x20;
        class377 var18 = arg2.method1590((byte) 1, var17, true);
        var18.method2205((byte) -92, var10, arg1, var11, 0, arg0 - 1, var7, this.field6260, var9);
        if (var13 != null) {
            var18.method2205((byte) -95, var15, var16, var14, 0, arg0 - 1, var7, this.field6260, var13);
        }
        return var18;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 414)
    public final void method2627(int arg0) {
        if (this.field6262 == -1) {
            if (this.field6277 == null) {
                this.field6262 = 0;
            } else {
                this.field6262 = 2;
            }
        }
        field6283++;
        int var2 = -88 % ((arg0 - 54) / 52);
        if (this.field6272 != -1) {
            return;
        }
        if (this.field6277 == null) {
            this.field6272 = 0;
        } else {
            this.field6272 = 2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lwm;B)V", line = 460)
    public final void method2628(class403 arg0, byte arg1) {
        field6281++;
        while (true) {
            int var3 = arg0.method2357((byte) 125);
            if (var3 == 0) {
                if (arg1 < 57) {
                    method2624(38);
                    return;
                } else {
                    return;
                }
            }
            this.method2623(arg0, -161619696, var3);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZIB)I", line = 511)
    public final int method2629(int arg0, boolean arg1, int arg2, byte arg3) {
        field6256++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field6276[arg2];
        if (arg3 != -59) {
            return 125;
        }
        class454 var8 = null;
        class454 var9 = this.field6275.method2572(var7 >> 16, (byte) 83);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field6270 || class26.field318) && arg0 != -1 && this.field6276.length > arg0) {
            int var11 = this.field6276[arg0];
            var8 = this.field6275.method2572(var11 >> 16, (byte) 95);
            var6 = var11 & 0xFFFF;
        }
        if (this.field6260) {
            var5 |= 0x200;
        }
        if (var9.method2648(13834, var10)) {
            var5 |= 0x80;
        }
        if (var9.method2651(var10, arg3 - 1094205949)) {
            var5 |= 0x100;
        }
        if (var9.method2649(var10, 255)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2648(13834, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2651(var6, -1094206008)) {
                var5 |= 0x100;
            }
            if (var8.method2649(var6, arg3 ^ 0xFFFFFF3A)) {
                var5 |= 0x400;
            }
        }
        if (this.field6280 != null && arg1) {
            if (arg2 < this.field6280.length) {
                int var12 = this.field6280[arg2];
                if (var12 != 65535) {
                    class454 var13 = this.field6275.method2572(var12 >> 16, (byte) 125);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2648(arg3 + 13893, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2651(var14, arg3 ^ 0x4138420D)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2649(var14, 255)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field6270 || class26.field318) && arg0 != -1 && arg0 < this.field6280.length) {
                int var15 = this.field6280[arg0];
                if (var15 != 65535) {
                    class454 var16 = this.field6275.method2572(var15 >> 16, (byte) 84);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2648(13834, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2651(var17, arg3 ^ 0x4138420D)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2649(var17, arg3 + 314)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }
}
