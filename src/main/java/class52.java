import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class52 {

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "Ljava/lang/String;")
    public static String field760 = "Connection lost.";

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "Lwe;")
    public static class24 field762 = new class24(128);

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public static int field781 = 0;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "Lno;")
    public class277 field775;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "[I")
    public int[] field759;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "[I")
    public int[] field761;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "[I")
    public int[] field771;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "[I")
    public int[] field773;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "[I")
    public int[] field777;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "[I")
    public int[] field782;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "[Lno;")
    public class277[] field765;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "[[I")
    public int[][] field764;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "[[I")
    public int[][] field769;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILnr;)V")
    public static final void method354(int arg0, class437 arg1) {
        field780++;
        int var2 = class394.field5912;
        int var3 = class200.field2861;
        int var4 = class272.field3995;
        int var5 = class263.field3828;
        int var6 = -10660793;
        arg1.method2766(var4, var5, var2, var3, var6, arg0 ^ 0x72);
        arg1.method2766(var4 - 2, 16, var2 + 1, var3 + 1, -16777216, -111);
        arg1.method2774(var5 - 19, var2 + 1, var4 - 2, false, var3 + 18, -16777216);
        class232.field3275.method1319(-8219, class75.field1015, var6, var3 + 14, var2 + 3, arg0);
        int var7 = class34.field555;
        int var8 = class316.field4522;
        int var9 = 0;
        for (class259 var10 = (class259) class373.field5574.method2649(arg0 + 1); var10 != null; var10 = (class259) class373.field5574.method2656(0)) {
            int var11 = (class10.field97 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var7 > var2 && (var2 + var4) > var7 && var8 > var11 - 13 && (var11 + 3) > var8) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class425.method2728((byte) 107, var10.field3777)) {
                var13 = class166.method1031((int) var10.field3772, false).field2724;
            } else if (class60.method404((byte) 45, var10.field3777)) {
                class129 var14 = class23.field408[(int) var10.field3772];
                if (var14 != null) {
                    var13 = var14.field1714.field5616;
                }
            } else if (class433.method2747(var10.field3777, (byte) -109)) {
                if (var10.field3777 == 1009) {
                    var13 = class165.method1020((int) var10.field3772, -126).field6001;
                } else {
                    var13 = class165.method1020((int) (var10.field3772 >>> 32 & 0x7FFFFFFFL), -76).field6001;
                }
            }
            String var15 = client.method1570(-122, var10);
            if (var13 != null) {
                var15 = var15 + class88.method544(arg0 ^ 0xFFFFFF8C, var13);
            }
            var9++;
            class232.field3275.method1335(var12, 4712, var15, class417.field6208, class42.field653, var2 + 3, 0, var11);
        }
        class168.method1042(class200.field2861, class272.field3995, class263.field3828, (byte) 63, class394.field5912);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lkb;I)Z")
    public static final boolean method355(class80 arg0, int arg1) {
        field779++;
        if (arg1 != -1225) {
            return true;
        } else if (arg0 == null) {
            return false;
        } else if (!arg0.field1101) {
            return false;
        } else if (!arg0.method508(-1)) {
            return false;
        } else if (class215.field3087.method954(-55, (long) arg0.field1090) == null) {
            return class71.field974.method954(arg1 ^ 0x4AD, (long) arg0.field1119) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILai;)I")
    public static final int method356(int arg0, class129 arg1) {
        field767++;
        class373 var2 = arg1.field1714;
        if (var2.field5576 != null) {
            var2 = var2.method2469(true);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field5615;
        class183 var4 = arg1.method140(124);
        int var5 = 106 / ((arg0 + 29) / 43);
        if (arg1.field236) {
            var3 = var2.field5607;
        } else if (arg1.field229 == var4.field2460 || arg1.field229 == var4.field2444 || arg1.field229 == var4.field2441 || arg1.field229 == var4.field2469) {
            var3 = var2.field5602;
        } else if (arg1.field229 == var4.field2458 || arg1.field229 == var4.field2471 || arg1.field229 == var4.field2461 || arg1.field229 == var4.field2470) {
            var3 = var2.field5573;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method357(int arg0, int arg1, int arg2, Class arg3) {
        class10 var4 = class343.field5032[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class39 var5 = var4.field109; var5 != null; var5 = var5.field627) {
            class361 var6 = var5.field621;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5296 == arg1 && var6.field5288 == arg2) {
                class107.method741(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "([BI)V")
    private final void method358(byte[] arg0, int arg1) {
        field778++;
        class265 var3 = new class265(class316.method1969(arg0, (byte) -91));
        int var4 = var3.method1697(arg1 ^ 0xFFFFFFE5);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field768 = 0;
        } else {
            this.field768 = var3.method1666(arg1 ^ 0xFFFFFFFE);
        }
        int var5 = var3.method1697(-84);
        this.field774 = var3.method1685(8104);
        int var6 = 0;
        this.field771 = new int[this.field774];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field774; var8++) {
            this.field771[var8] = var6 += var3.method1685(class347.method2311(arg1, 8104));
            if (this.field771[var8] > var7) {
                var7 = this.field771[var8];
            }
        }
        this.field763 = var7 + 1;
        this.field782 = new int[this.field763];
        this.field777 = new int[this.field763];
        this.field769 = new int[this.field763][];
        this.field759 = new int[this.field763];
        this.field773 = new int[this.field763];
        if (var5 != 0) {
            this.field761 = new int[this.field763];
            for (int var9 = 0; var9 < this.field763; var9++) {
                this.field761[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field774; var10++) {
                this.field761[this.field771[var10]] = var3.method1666(-2);
            }
            this.field775 = new class277(this.field761);
        }
        for (int var11 = 0; var11 < this.field774; var11++) {
            this.field782[this.field771[var11]] = var3.method1666(-2);
        }
        for (int var12 = 0; var12 < this.field774; var12++) {
            this.field777[this.field771[var12]] = var3.method1666(-2);
        }
        for (int var13 = 0; var13 < this.field774; var13++) {
            this.field773[this.field771[var13]] = var3.method1685(8104);
        }
        for (int var14 = 0; var14 < this.field774; var14++) {
            int var21 = this.field771[var14];
            int var22 = this.field773[var21];
            int var23 = 0;
            this.field769[var21] = new int[var22];
            int var24 = -1;
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field769[var21][var25] = var23 += var3.method1685(8104);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field759[var21] = var24 + 1;
            if (var24 + 1 == var22) {
                this.field769[var21] = null;
            }
        }
        if (arg1 == var5) {
            return;
        }
        this.field764 = new int[var7 + 1][];
        this.field765 = new class277[var7 + 1];
        for (int var15 = 0; var15 < this.field774; var15++) {
            int var16 = this.field771[var15];
            int var17 = this.field773[var16];
            this.field764[var16] = new int[this.field759[var16]];
            for (int var18 = 0; var18 < this.field759[var16]; var18++) {
                this.field764[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field769[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field769[var16][var19];
                }
                this.field764[var16][var20] = var3.method1666(class347.method2311(arg1, -2));
            }
            this.field765[var16] = new class277(this.field764[var16]);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BZ)V")
    public static final void method359(byte arg0, boolean arg1) {
        field772++;
        byte[][] var2;
        if (arg1) {
            var2 = class407.field6104;
        } else {
            var2 = class300.field4292;
        }
        if (arg0 != -93) {
            method357(26, -98, 88, (Class) null);
        }
        int var3 = class240.field3383.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class106.field1417[var4] >> 8) * 64 - class184.field2482;
                int var7 = (class106.field1417[var4] & 0xFF) * 64 - class38.field620;
                class87.method540(-58);
                class395.method2589(var5, arg1, -53, var7, class35.field574, var6, class119.field1605);
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public static void method360(int arg0) {
        if (arg0 != -1) {
            method354(-116, (class437) null);
        }
        field762 = null;
        field760 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIBII)V")
    public static final void method361(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field776++;
        class256 var5 = class363.method2385(4, arg3, (byte) 1);
        var5.method1614(0);
        if (arg2 == 67) {
            var5.field3748 = arg0;
            var5.field3746 = arg4;
            var5.field3756 = arg1;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "([BI)V")
    public class52(byte[] arg0, int arg1) {
        this.field766 = class204.method1287(arg0.length, arg0, (byte) 123);
        if (this.field766 != arg1) {
            throw new RuntimeException();
        }
        this.method358(arg0, 0);
    }
}
