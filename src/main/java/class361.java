import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class361 extends class6 {

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "Z")
    public boolean field5283 = true;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public static int field5271 = 1405;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "Les;")
    public class259 field5275;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "Lnk;")
    public static class501 field5270;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "Ler;")
    public static class69 field5267;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "Lbm;")
    public static class75 field5260;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "[I")
    private int[] field5273;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "[I")
    public int[] field5279;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "[Ljava/lang/String;")
    private String[] field5282;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "[[B")
    public static byte[][] field5268;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "[[I")
    private int[][] field5269;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZIB)V", line = 7)
    public static final void method2165(boolean arg0, int arg1, byte arg2) {
        field5276++;
        if (arg1 == 0) {
            class269.field3721 = class38.method319(arg1, class202.field2840, class124.field1851, class426.field6248, (byte) -107, class20.field269.field7670 * 2);
        } else {
            if (arg0) {
                class269.field3721 = class38.method319(0, class202.field2840, class124.field1851, class426.field6248, (byte) -90, 0);
                class269.field3721.method246(0);
                class490 var3 = class310.method1796(0, class188.field2726, class217.field3028, (byte) 127);
                class315 var4 = class269.field3721.method324(var3, class4.method24(class364.field5334, class217.field3028, 0), true);
                class203.method1262(var4, true, class156.field2371.method2731(62, class372.field5455), 2048);
                class269.field3721.method229();
                class57.method469((byte) 123);
                class269.field3721.method267(-78);
            }
            try {
                class269.field3721 = class38.method319(arg1, class202.field2840, class124.field1851, class426.field6248, (byte) -114, class20.field269.field7670 * 2);
                if (class269.field3721.method282()) {
                    class53 var5 = class269.field3721.method274(78643200);
                    class269.field3721.method290(var5);
                }
            } catch (Throwable var6) {
                arg1 = 0;
                class269.field3721 = class38.method319(0, class202.field2840, class124.field1851, class426.field6248, (byte) -110, 0);
            }
        }
        class152.field2332 = arg1;
        class125.method865(-17091);
        if (!class269.field3721.method301()) {
            class210.field2935 = 1;
        }
        class269.field3721.method248(class210.field2935);
        if (arg2 != 96) {
            field5270 = null;
        }
        class269.field3721.method221(0);
        class269.field3721.method269(8);
        class450.field6623 = class269.field3721.method310();
        class228.field3243 = class269.field3721.method310();
        class357.method2139((byte) -128);
        class269.field3721.method321(!class20.field269.field7652);
        if (class269.field3721.method287()) {
            class323.method1867(class20.field269.field7656, arg2 - 93);
        }
        class437.method2573(class527.field7799 >> 3, 2, class269.field3721, class422.field6182 >> 3);
        class136.method920((byte) -1);
        class143.field2052 = false;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lsi;I)V", line = 75)
    public final void method2166(class391 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2348(-2);
            if (var3 == 0) {
                if (arg1 > -101) {
                    return;
                }
                field5261++;
                return;
            }
            this.method2173(arg0, var3, 1705204836);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)I", line = 96)
    public final int method2167(byte arg0) {
        field5264++;
        if (this.field5273 == null) {
            return 0;
        } else {
            if (arg0 > -79) {
                this.method2179(-95, -98, 95);
            }
            return this.field5273.length;
        }
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)Ljava/lang/String;", line = 117)
    public final String method2168(int arg0) {
        field5263++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5282 == null) {
            return "";
        }
        var2.append(this.field5282[arg0]);
        for (int var3 = 1; var3 < this.field5282.length; var3++) {
            var2.append("...");
            var2.append(this.field5282[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)I", line = 141)
    public static final int method2169(int arg0, int arg1) {
        if (arg1 != 1006) {
            method2165(false, 60, (byte) 12);
        }
        field5266++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V", line = 156)
    public final void method2170(int arg0) {
        if (arg0 != -1) {
            this.field5279 = null;
        }
        if (this.field5279 != null) {
            for (int var2 = 0; var2 < this.field5279.length; var2++) {
                this.field5279[var2] = class255.method1532(this.field5279[var2], 32768);
            }
        }
        field5272++;
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)V", line = 182)
    public static void method2171(int arg0) {
        field5260 = null;
        field5270 = null;
        if (arg0 == -10111) {
            field5267 = null;
            field5268 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Z", line = 196)
    public static final boolean method2172(int arg0, int arg1, int arg2) {
        if (arg1 >= -95) {
            return true;
        }
        field5274++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class220 var3 = class78.field1141.method2103(arg0, true);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1370(arg2, 0);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lsi;II)V", line = 217)
    private final void method2173(class391 arg0, int arg1, int arg2) {
        field5258++;
        if (arg2 != 1705204836) {
            this.method2167((byte) 13);
        }
        if (arg1 == 1) {
            this.field5282 = class38.method284('<', arg0.method2347((byte) -74), false);
        } else if (arg1 == 2) {
            int var9 = arg0.method2348(-2);
            this.field5279 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field5279[var10] = arg0.method2353((byte) 92);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method2348(arg2 ^ 0x9A5CA39A);
            this.field5273 = new int[var4];
            this.field5269 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2353((byte) 72);
                class55 var7 = class259.method1561(-15188, var6);
                if (var7 != null) {
                    this.field5273[var5] = var6;
                    this.field5269[var5] = new int[var7.field662];
                    for (int var8 = 0; var8 < var7.field662; var8++) {
                        this.field5269[var5][var8] = arg0.method2353((byte) 79);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field5283 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)Lkl;", line = 292)
    public final class55 method2174(int arg0, int arg1) {
        field5277++;
        if (arg0 < 88) {
            this.method2174(-32, -16);
        }
        return this.field5273 == null || arg1 < 0 || this.field5273.length < arg1 ? null : class259.method1561(-15188, this.field5273[arg1]);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lsi;B)Ljava/lang/String;", line = 307)
    public final String method2175(class391 arg0, byte arg1) {
        field5262++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg1 != -76) {
            this.method2179(-65, 119, -43);
        }
        if (this.field5273 != null) {
            for (int var4 = 0; var4 < this.field5273.length; var4++) {
                var3.append(this.field5282[var4]);
                var3.append(this.field5275.method1559(arg0.method2336(class259.method1561(-15188, this.field5273[var4]).field657, -100), this.field5269[var4], this.method2174(113, var4), (byte) -128));
            }
        }
        var3.append(this.field5282[this.field5282.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lsi;I[I)V", line = 335)
    public final void method2176(class391 arg0, int arg1, int[] arg2) {
        field5278++;
        if (this.field5273 == null || arg1 != -1) {
            return;
        }
        for (int var4 = 0; var4 < this.field5273.length; var4++) {
            if (arg2.length <= var4) {
                return;
            }
            int var5 = this.method2174(126, var4).field660;
            if (var5 > 0) {
                arg0.method2343((long) arg2[var4], -8, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ICI)I", line = 362)
    public static final int method2177(int arg0, char arg1, int arg2) {
        field5265++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        if (arg2 != 0) {
            field5260 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V", line = 386)
    public static final void method2178(byte arg0) {
        class24.field315++;
        class491.method2878((byte) 92, class92.field1325);
        field5259++;
        if (arg0 != 22) {
            method2172(-32, -43, 106);
        }
        class481.field7027.method2355(1686288168, class28.field363);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)I", line = 399)
    public final int method2179(int arg0, int arg1, int arg2) {
        field5280++;
        if (this.field5273 == null || arg2 < 0 || arg2 > this.field5273.length) {
            return -1;
        } else {
            if (arg0 != 0) {
                method2171(-97);
            }
            return this.field5269[arg2] == null || arg1 < 0 || this.field5269[arg2].length < arg1 ? -1 : this.field5269[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V", line = 420)
    public static final void method2180(boolean arg0) {
        if (!arg0) {
            method2180(true);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class463.field6801[var1] = true;
        }
        field5281++;
    }
}
