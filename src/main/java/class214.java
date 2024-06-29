import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class214 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    private int field3241 = 0;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    private int field3244 = -1;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lom;")
    private class156 field3243 = new class156();

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Z")
    public boolean field3255 = false;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    private int field3245;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "[Lfc;")
    private class107[] field3242;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "[[[I")
    private int[][][] field3252;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1476(boolean arg0) {
        class228.field3471.method2176((byte) -79);
        class42.field507.method2176((byte) -126);
        if (!arg0) {
            field3247++;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)[[I", line = 23)
    public final int[][] method1477(byte arg0, int arg1) {
        if (arg0 < 37) {
            return (int[][]) ((int[][]) null);
        }
        field3251++;
        if (this.field3245 == this.field3240) {
            this.field3255 = this.field3242[arg1] == null;
            this.field3242[arg1] = class10.field94;
            return this.field3252[arg1];
        } else if (this.field3240 == 1) {
            this.field3255 = this.field3244 != arg1;
            this.field3244 = arg1;
            return this.field3252[0];
        } else {
            class107 var3 = this.field3242[arg1];
            if (var3 == null) {
                this.field3255 = true;
                if (this.field3240 > this.field3241) {
                    var3 = new class107(arg1, this.field3241);
                    this.field3241++;
                } else {
                    class107 var4 = (class107) this.field3243.method1110(true);
                    var3 = new class107(arg1, var4.field1669);
                    this.field3242[var4.field1672] = null;
                    var4.method714(-68);
                }
                this.field3242[arg1] = var3;
            } else {
                this.field3255 = false;
            }
            this.field3243.method1111(var3, -8);
            return this.field3252[var3.field1669];
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)V", line = 87)
    public static final void method1478(boolean arg0) {
        if (arg0) {
            field3253 = -27;
        }
        field3246++;
        int var1 = class242.field3633;
        int var2 = class163.field2466;
        int var3 = class23.field347;
        int var4 = class176.field2609;
        if (class212.field3224 == null || class134.field2046 == null) {
            if (class68.field898.method1431(class13.field151, -95) && class68.field898.method1431(class164.field2474, -93)) {
                class212.field3224 = class91.method643(class68.field898, (byte) -64, 0, class13.field151);
                class134.field2046 = class91.method643(class68.field898, (byte) -64, 0, class164.field2474);
                if (class117.field1817) {
                    if ((class212.field3224 instanceof class215)) {
                        class212.field3224 = new class50((class127) class212.field3224);
                    } else {
                        class212.field3224 = new class303((class127) class212.field3224);
                    }
                    if ((class134.field2046 instanceof class215)) {
                        class134.field2046 = new class50((class127) class134.field2046);
                    } else {
                        class134.field2046 = new class303((class127) class134.field2046);
                    }
                }
            } else if (class117.field1817) {
                class308.method2125(var1, var3, var2, 20, class96.field1440, 256 - class154.field2318);
            } else {
                class46.method319(var1, var3, var2, 20, class96.field1440, 256 - class154.field2318);
            }
        }
        if (class212.field3224 != null && class134.field2046 != null) {
            int var5 = var2 / class212.field3224.field3533;
            for (int var6 = 0; var6 < var5; var6++) {
                class212.field3224.method935(class212.field3224.field3533 * var6 + var1, var3);
            }
            class134.field2046.method935(var1, var3);
            class134.field2046.method942(var1 + var2 - class134.field2046.field3533, var3);
        }
        class217.field3299.method620(class154.field2312, var1 + 3, var3 + 14, class36.field447, -1);
        if (class117.field1817) {
            class308.method2125(var1, var3 + 20, var2, var4 - 20, class96.field1440, 256 - class154.field2318);
        } else {
            class46.method319(var1, var3 + 20, var2, var4 - 20, class96.field1440, 256 - class154.field2318);
        }
        int var7 = class237.field3557;
        int var8 = class132.field2036;
        for (int var9 = 0; var9 < class190.field2829; var9++) {
            int var10 = (class190.field2829 - var9 - 1) * 15 + var3 + 35;
            if (var1 < var8 && var1 + var2 > var8 && (var10 - 13) < var7 && var10 + 3 > var7) {
                if (class117.field1817) {
                    class308.method2125(var1, var10 - 13, var2, 16, class114.field1753, 256 - class132.field2032);
                } else {
                    class46.method319(var1, var10 - 13, var2, 16, class114.field1753, 256 - class132.field2032);
                }
            }
        }
        if ((class9.field67 == null || class305.field4651 == null || class7.field52 == null) && class68.field898.method1431(class186.field2780, -23) && class68.field898.method1431(class49.field621, -70) && class68.field898.method1431(class250.field3727, -91)) {
            class9.field67 = class91.method643(class68.field898, (byte) -64, 0, class186.field2780);
            class305.field4651 = class91.method643(class68.field898, (byte) -64, 0, class49.field621);
            class7.field52 = class91.method643(class68.field898, (byte) -64, 0, class250.field3727);
            if (class117.field1817) {
                if ((class9.field67 instanceof class215)) {
                    class9.field67 = new class50((class127) class9.field67);
                } else {
                    class9.field67 = new class303((class127) class9.field67);
                }
                if ((class305.field4651 instanceof class215)) {
                    class305.field4651 = new class50((class127) class305.field4651);
                } else {
                    class305.field4651 = new class303((class127) class305.field4651);
                }
                if ((class7.field52 instanceof class215)) {
                    class7.field52 = new class50((class127) class7.field52);
                } else {
                    class7.field52 = new class303((class127) class7.field52);
                }
            }
        }
        if (class9.field67 != null && class305.field4651 != null && class7.field52 != null) {
            int var11 = var2 / class9.field67.field3533;
            for (int var12 = 0; var12 < var11; var12++) {
                class9.field67.method935(class9.field67.field3533 * var12 + var1, -class9.field67.field3537 + var4 + var3);
            }
            int var13 = (var4 - 20) / class305.field4651.field3537;
            for (int var14 = 0; var14 < var13; var14++) {
                class305.field4651.method935(var1, var3 - (-(class305.field4651.field3537 * var14) - 20));
                class305.field4651.method942(var1 + var2 - class305.field4651.field3533, var3 - -20 - -(class305.field4651.field3537 * var14));
            }
            class7.field52.method935(var1, var4 + var3 - class7.field52.field3537);
            class7.field52.method942(var2 + var1 - class7.field52.field3533, var3 - -var4 + -class7.field52.field3537);
        }
        for (int var15 = 0; var15 < class190.field2829; var15++) {
            int var16 = var3 - (-(class190.field2829 - var15 - 1) * 15 - 35);
            int var17 = class36.field447;
            if (var8 > var1 && var8 < var1 + var2 && var16 - 13 < var7 && var7 < var16 + 3) {
                var17 = class223.field3403;
            }
            class217.field3299.method620(class163.method1152(-99, var15), var1 + 3, var16, var17, 0);
        }
        class162.method1147(class242.field3633, class163.field2466, class23.field347, 5, class176.field2609);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(BI)I", line = 260)
    public static final int method1479(byte arg0, int arg1) {
        if (arg0 < 32) {
            method1479((byte) 123, 25);
        }
        field3250++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 273)
    public final void method1480(byte arg0) {
        int var2 = 117 / ((-arg0 - 51) / 45);
        field3254++;
        for (int var3 = 0; var3 < this.field3240; var3++) {
            this.field3252[var3][0] = null;
            this.field3252[var3][1] = null;
            this.field3252[var3][2] = null;
            this.field3252[var3] = (int[][]) null;
        }
        this.field3242 = null;
        this.field3252 = (int[][][]) null;
        this.field3243.method1113((byte) 46);
        this.field3243 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(CBI)C", line = 297)
    public static final char method1481(char arg0, byte arg1, int arg2) {
        field3248++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        }
        if (arg1 < 5) {
            field3253 = 35;
        }
        if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)[[[I", line = 378)
    public final int[][][] method1482(byte arg0) {
        field3249++;
        if (this.field3245 != this.field3240) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 <= 57) {
            method1476(true);
        }
        for (int var2 = 0; var2 < this.field3240; var2++) {
            this.field3242[var2] = class10.field94;
        }
        return this.field3252;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(III)V", line = 421)
    public class214(int arg0, int arg1, int arg2) {
        this.field3245 = arg1;
        this.field3242 = new class107[this.field3245];
        this.field3240 = arg0;
        this.field3252 = new int[this.field3240][3][arg2];
    }
}
