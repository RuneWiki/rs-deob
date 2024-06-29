import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class112 extends class182 {

    @OriginalMember(owner = "client!ro", name = "R", descriptor = "J")
    public static long field2046 = 0L;

    @OriginalMember(owner = "client!ro", name = "N", descriptor = "[I")
    public static int[] field2042 = new int[128];

    @OriginalMember(owner = "client!ro", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2047 = null;

    @OriginalMember(owner = "client!ro", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2050 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ro", name = "M", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!ro", name = "P", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ro", name = "T", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ro", name = "U", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ro", name = "O", descriptor = "Lek;")
    public static class206 field2043;

    @OriginalMember(owner = "client!ro", name = "Q", descriptor = "[Lnd;")
    private class349[] field2045;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "(I)V", line = 6)
    public static void method834(int arg0) {
        field2047 = null;
        field2042 = null;
        if (arg0 <= 20) {
            method839(-50, -95, -118);
        }
        field2050 = null;
        field2043 = null;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)[I", line = 27)
    public final int[] method125(int arg0, int arg1) {
        field2040++;
        int[] var3 = this.field3166.method775(arg1, 124);
        if (arg0 != 2) {
            field2042 = (int[]) null;
        }
        if (this.field3166.field1903) {
            this.method836(this.field3166.method776(102), (byte) -117);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[[I", line = 49)
    public final int[][] method122(int arg0, int arg1) {
        field2048++;
        if (arg1 != 4944) {
            field2042 = (int[]) null;
        }
        int[][] var3 = this.field3152.method1953(arg0, 77);
        if (this.field3152.field4493) {
            int var4 = class334.field5323;
            int var5 = class26.field672;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = this.field3152.method1958(false);
            this.method836(var6, (byte) -117);
            for (int var8 = 0; var8 < class334.field5323; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class26.field672; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class83.method613(var15, 255) << 4;
                    var12[var14] = class83.method613(var15 >> 4, 4080);
                    var11[var14] = class83.method613(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Loe;IB)V", line = 110)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field2045 = new class349[arg0.method1005((byte) 122)];
            for (int var4 = 0; var4 < this.field2045.length; var4++) {
                int var5 = arg0.method1005((byte) 122);
                if (var5 == 0) {
                    this.field2045[var4] = class296.method2127(arg0, 2);
                } else if (var5 == 1) {
                    this.field2045[var4] = class23.method198(arg0, (byte) -62);
                } else if (var5 == 2) {
                    this.field2045[var4] = class151.method1081(-21192, arg0);
                } else if (var5 == 3) {
                    this.field2045[var4] = class225.method1570((byte) 100, arg0);
                }
            }
        } else if (arg1 == 1) {
            this.field3154 = arg0.method1005((byte) 122) == 1;
        }
        if (arg2 != 60) {
            method838(-6, -30);
        }
        field2039++;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V", line = 186)
    public class112() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "(I)V", line = 193)
    public static final void method835(int arg0) {
        if (arg0 <= -52) {
            field2041++;
            class83.field1433.method889((byte) -125);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([[IB)V", line = 206)
    private final void method836(int[][] arg0, byte arg1) {
        int var3 = class334.field5323;
        int var4 = class26.field672;
        class267.method1870(arg1 ^ 0xFFFF81C7, arg0);
        if (arg1 != -117) {
            return;
        }
        class182.method1285(0, 0, class194.field3266, (byte) -49, class53.field1056);
        if (this.field2045 != null) {
            for (int var5 = 0; var5 < this.field2045.length; var5++) {
                class349 var6 = this.field2045[var5];
                int var7 = var6.field5583;
                int var8 = var6.field5585;
                if (var8 >= 0) {
                    if (var7 >= 0) {
                        var6.method210(arg1 + 12576, var4, var3);
                    } else {
                        var6.method213(var4, var3, 13258);
                    }
                } else if (var7 >= 0) {
                    var6.method215(-1664663732, var3, var4);
                }
            }
        }
        field2049++;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V", line = 254)
    public static final void method837(byte arg0) {
        if (arg0 != -99) {
            method837((byte) -54);
        }
        field2037++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class137.field2343 - 1); var2++) {
                if (class107.field1938[var2] < 1000 && class107.field1938[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class300.field4889[var2];
                    class300.field4889[var2] = class300.field4889[var2 + 1];
                    class300.field4889[var2 + 1] = var3;
                    String var4 = class317.field5173[var2];
                    class317.field5173[var2] = class317.field5173[var2 + 1];
                    class317.field5173[var2 + 1] = var4;
                    int var5 = class206.field3450[var2];
                    class206.field3450[var2] = class206.field3450[var2 + 1];
                    class206.field3450[var2 + 1] = var5;
                    int var6 = class317.field5172[var2];
                    class317.field5172[var2] = class317.field5172[var2 + 1];
                    class317.field5172[var2 + 1] = var6;
                    int var7 = class73.field1327[var2];
                    class73.field1327[var2] = class73.field1327[var2 + 1];
                    class73.field1327[var2 + 1] = var7;
                    short var8 = class107.field1938[var2];
                    class107.field1938[var2] = class107.field1938[var2 + 1];
                    class107.field1938[var2 + 1] = var8;
                    long var9 = class177.field2926[var2];
                    class177.field2926[var2] = class177.field2926[var2 + 1];
                    class177.field2926[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(II)Lcj;", line = 315)
    public static final class351 method838(int arg0, int arg1) {
        field2038++;
        class351 var2 = (class351) class309.field5049.method487(79, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class318.field5177.method1404(arg1, arg0, (byte) -61);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class351 var4 = class301.method2157(var3, (byte) 79);
            class309.field5049.method491((long) arg1, -1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(III)I", line = 349)
    public static final int method839(int arg0, int arg1, int arg2) {
        field2044++;
        int var3 = arg2 + (arg1 * 57);
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + arg0) * var4 + 1376312589;
        return (var5 & 0x7FCBA78) >> 19;
    }
}
