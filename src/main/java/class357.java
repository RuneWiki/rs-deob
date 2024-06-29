import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class357 {

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public int field5396 = -1;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public int field5390 = -1;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public int field5404 = 2;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public int field5392 = -1;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "Z")
    public boolean field5410 = false;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public int field5394 = 99;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "Z")
    public boolean field5405 = false;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public int field5406 = -1;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Z")
    public boolean field5391 = false;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public int field5389 = 5;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public int field5402 = -1;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "Z")
    public boolean field5411 = false;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Lgf;")
    public static class180 field5400 = new class180("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field5417 = 1406;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public int field5403;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "Lcl;")
    public class173 field5393;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "[I")
    public int[] field5395;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "[I")
    public int[] field5408;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "[I")
    private int[] field5416;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "[Z")
    public boolean[] field5412;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "[[I")
    public int[][] field5398;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)I")
    public static final int method2300(byte arg0) {
        field5397++;
        if (arg0 == 32) {
            class364 var1 = class248.field3579;
            synchronized (class248.field3579) {
                return class248.field3579.method2345(-114);
            }
        } else {
            return 58;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public final void method2301(int arg0) {
        if (arg0 != 14674) {
            return;
        }
        if (this.field5396 == -1) {
            if (this.field5412 == null) {
                this.field5396 = 0;
            } else {
                this.field5396 = 2;
            }
        }
        field5415++;
        if (this.field5406 != -1) {
            return;
        }
        if (this.field5412 == null) {
            this.field5406 = 0;
        } else {
            this.field5406 = 2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLti;)V")
    public final void method2302(byte arg0, class303 arg1) {
        if (arg0 != 23) {
            this.field5416 = null;
        }
        field5409++;
        while (true) {
            int var3 = arg1.method1918((byte) 80);
            if (var3 == 0) {
                return;
            }
            this.method2305(var3, arg1, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZI)I")
    public final int method2303(int arg0, int arg1, boolean arg2, int arg3) {
        field5399++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field5395[arg3];
        class402 var8 = null;
        if (arg0 != 1024) {
            this.method2302((byte) 79, null);
        }
        class402 var9 = this.field5393.method1232((byte) -46, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field5411 || class66.field1151) && arg1 != -1 && arg1 < this.field5395.length) {
            int var11 = this.field5395[arg1];
            var8 = this.field5393.method1232((byte) -46, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field5391) {
            var5 |= 0x200;
        }
        if (var9.method2501(var10, -13123)) {
            var5 |= 0x80;
        }
        if (var9.method2499(var10, (byte) 105)) {
            var5 |= 0x100;
        }
        if (var9.method2500(var10, true)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2501(var6, -13123)) {
                var5 |= 0x80;
            }
            if (var8.method2499(var6, (byte) 124)) {
                var5 |= 0x100;
            }
            if (var8.method2500(var6, true)) {
                var5 |= 0x400;
            }
        }
        if (this.field5416 != null && arg2) {
            if (this.field5416.length > arg3) {
                int var12 = this.field5416[arg3];
                if (var12 != 65535) {
                    class402 var13 = this.field5393.method1232((byte) -46, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2501(var14, -13123)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2499(var14, (byte) 99)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2500(var14, true)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field5411 || class66.field1151) && arg1 != -1 && arg1 < this.field5416.length) {
                int var15 = this.field5416[arg1];
                if (var15 != 65535) {
                    class402 var16 = this.field5393.method1232((byte) -46, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2501(var17, -13123)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2499(var17, (byte) 110)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2500(var17, true)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIBILc;I)Lc;")
    public final class121 method2304(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class121 arg6, int arg7) {
        field5414++;
        int var9 = this.field5408[arg1];
        int var10 = this.field5395[arg1];
        class402 var11 = this.field5393.method1232((byte) -46, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method881(arg4, arg2, true);
        }
        class402 var13 = null;
        if ((this.field5411 || class66.field1151) && arg5 != -1 && arg5 < this.field5395.length) {
            int var14 = this.field5395[arg5];
            var13 = this.field5393.method1232((byte) -46, var14 >> 16);
            arg5 = var14 & 0xFFFF;
        }
        if (this.field5391) {
            arg2 |= 0x200;
        }
        if (var11.method2501(var12, -13123)) {
            arg2 |= 0x80;
        }
        if (var11.method2499(var12, (byte) 126)) {
            arg2 |= 0x100;
        }
        if (var11.method2500(var12, true)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2501(arg5, arg0 - 11268)) {
                arg2 |= 0x80;
            }
            if (var13.method2499(arg5, (byte) 116)) {
                arg2 |= 0x100;
            }
            if (var13.method2500(arg5, true)) {
                arg2 |= 0x400;
            }
        }
        if (arg0 == -1855) {
            int var15 = arg2 | 0x20;
            class121 var16 = arg6.method881(arg4, var15, true);
            var16.method893(arg7 - 1, this.field5391, var11, var12, var9, var13, arg5, arg3, false);
            return var16;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILti;B)V")
    private final void method2305(int arg0, class303 arg1, byte arg2) {
        if (arg0 == 1) {
            int var4 = arg1.method1868(0);
            this.field5408 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5408[var5] = arg1.method1868(0);
            }
            this.field5395 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field5395[var6] = arg1.method1868(0);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field5395[var7] = (arg1.method1868(0) << 16) + this.field5395[var7];
            }
        } else if (arg0 == 2) {
            this.field5402 = arg1.method1868(0);
        } else if (arg0 == 3) {
            this.field5412 = new boolean[256];
            int var15 = arg1.method1918((byte) 76);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field5412[arg1.method1918((byte) -66)] = true;
            }
        } else if (arg0 == 4) {
            this.field5410 = true;
        } else if (arg0 == 5) {
            this.field5389 = arg1.method1918((byte) 103);
        } else if (arg0 == 6) {
            this.field5390 = arg1.method1868(0);
        } else if (arg0 == 7) {
            this.field5392 = arg1.method1868(0);
        } else if (arg0 == 8) {
            this.field5394 = arg1.method1918((byte) -82);
        } else if (arg0 == 9) {
            this.field5406 = arg1.method1918((byte) -112);
        } else if (arg0 == 10) {
            this.field5396 = arg1.method1918((byte) -108);
        } else if (arg0 == 11) {
            this.field5404 = arg1.method1918((byte) 87);
        } else if (arg0 == 12) {
            int var8 = arg1.method1918((byte) 112);
            this.field5416 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field5416[var9] = arg1.method1868(0);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field5416[var10] = (arg1.method1868(0) << 16) + this.field5416[var10];
            }
        } else if (arg0 == 13) {
            int var11 = arg1.method1868(0);
            this.field5398 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg1.method1918((byte) 81);
                if (var13 > 0) {
                    this.field5398[var12] = new int[var13];
                    this.field5398[var12][0] = arg1.method1866(false);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field5398[var12][var14] = arg1.method1868(0);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field5391 = true;
        } else if (arg0 == 15) {
            this.field5411 = true;
        } else if (arg0 == 16) {
            this.field5405 = true;
        }
        field5401++;
        if (arg2 > -93) {
            this.method2305(-14, null, (byte) 49);
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
    public static void method2306(int arg0) {
        field5400 = null;
        if (arg0 != 28516) {
            method2300((byte) 81);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIILc;B)Lc;")
    public final class121 method2307(int arg0, int arg1, int arg2, int arg3, class121 arg4, byte arg5) {
        field5413++;
        int var7 = this.field5408[arg1];
        int var8 = this.field5395[arg1];
        class402 var9 = this.field5393.method1232((byte) -46, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method881((byte) 1, arg3, true);
        }
        class402 var11 = null;
        if (arg5 != 109) {
            this.field5392 = -74;
        }
        if ((this.field5411 || class66.field1151) && arg2 != -1 && arg2 < this.field5395.length) {
            int var12 = this.field5395[arg2];
            var11 = this.field5393.method1232((byte) -46, var12 >> 16);
            arg2 = var12 & 0xFFFF;
        }
        class402 var13 = null;
        class402 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field5416 != null) {
            if (arg1 < this.field5416.length) {
                var15 = this.field5416[arg1];
                if (var15 != 65535) {
                    var13 = this.field5393.method1232((byte) -46, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field5411 || class66.field1151) && arg2 != -1 && this.field5416.length > arg2) {
                var16 = this.field5416[arg2];
                if (var16 != 65535) {
                    var14 = this.field5393.method1232((byte) -46, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field5391) {
            arg3 |= 0x200;
        }
        if (var9.method2501(var10, arg5 - 13232)) {
            arg3 |= 0x80;
        }
        if (var9.method2499(var10, (byte) 81)) {
            arg3 |= 0x100;
        }
        if (var9.method2500(var10, true)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2501(var15, -13123)) {
                arg3 |= 0x80;
            }
            if (var13.method2499(var15, (byte) 119)) {
                arg3 |= 0x100;
            }
            if (var13.method2500(var15, true)) {
                arg3 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2501(arg2, -13123)) {
                arg3 |= 0x80;
            }
            if (var11.method2499(arg2, (byte) 97)) {
                arg3 |= 0x100;
            }
            if (var11.method2500(arg2, true)) {
                arg3 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2501(var16, -13123)) {
                arg3 |= 0x80;
            }
            if (var14.method2499(var16, (byte) 102)) {
                arg3 |= 0x100;
            }
            if (var14.method2500(var16, true)) {
                arg3 |= 0x400;
            }
        }
        int var17 = arg3 | 0x20;
        class121 var18 = arg4.method881((byte) 1, var17, true);
        var18.method893(arg0 - 1, this.field5391, var9, var10, var7, var11, arg2, 0, false);
        if (var13 != null) {
            var18.method893(arg0 - 1, this.field5391, var13, var15, var7, var14, var16, 0, false);
        }
        return var18;
    }
}
