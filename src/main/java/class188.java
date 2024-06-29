import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class188 {

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Le;")
    public static class191 field3299 = class54.method368("Konfig geladen)3", 2047);

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Le;")
    public static class191 field3298 = class54.method368("p12_full", 2047);

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field3305 = 1;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "[Lnh;")
    public static class272[] field3317 = new class272[27];

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field3314 = -1;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[S")
    public static short[] field3306 = new short[500];

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Le;")
    public static class191 field3302 = class54.method368("T", 2047);

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public int field3307;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Loh;")
    public class146 field3321;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
    public int[] field3300;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "[I")
    public int[] field3303;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "[I")
    public int[] field3308;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "[I")
    public int[] field3310;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "[I")
    public int[] field3312;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "[I")
    public int[] field3319;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[Loh;")
    public class146[] field3296;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "[[I")
    public int[][] field3311;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "[[I")
    public int[][] field3313;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public static final void method1293(int arg0, int arg1) {
        field3318++;
        if (class47.field836 == arg0) {
            return;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (class47.field836 == 0) {
            class269.method1840(arg1 + 30330);
        }
        if (arg1 != -30211) {
            method1297((byte) -89);
        }
        if (arg0 == 40) {
            class207.method1425(class26.field375, (byte) 32, class233.field4154, class26.field381);
        }
        if (arg0 != 40 && class95.field1547 != null) {
            class95.field1547.method174(90);
            class95.field1547 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class73.field1270 = 0;
            class122.field2027 = 1;
            class47.field839 = 0;
            class11.field124 = 1;
            class100.field1600 = 0;
            class241.method1689(0);
        }
        if (arg0 == 5) {
            class252.method1754(class215.field3792, 112);
        } else {
            class184.method1244((byte) 69);
        }
        boolean var3 = class47.field836 == 5 || class47.field836 == 10 || class47.field836 == 28;
        if (var2 != var3) {
            if (var2) {
                class11.field128 = class175.field2931;
                if (class255.field4532 == 0) {
                    class28.method204(true, 2);
                } else {
                    class134.method903(class102.field1653, false, class175.field2931, 2, (byte) -86, 0, 255);
                }
                class127.field2105.method1404(true, false);
            } else {
                class28.method204(true, 2);
                class127.field2105.method1404(true, true);
            }
        }
        class47.field836 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
    public static final void method1294(int arg0, int arg1, int arg2) {
        field3304++;
        class241 var3 = class14.method97(arg0, arg2, -75);
        var3.method1694((byte) -90);
        var3.field4301 = arg1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([BB)V")
    private final void method1295(byte[] arg0, byte arg1) {
        class225 var3 = new class225(class102.method642(arg0, (byte) -86));
        field3315++;
        int var4 = var3.method1580(-119);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3320 = var3.method1562(21705);
        } else {
            this.field3320 = 0;
        }
        int var5 = var3.method1580(-42);
        this.field3307 = var3.method1593(true);
        int var6 = 0;
        int var7 = -1;
        this.field3319 = new int[this.field3307];
        for (int var8 = 0; var8 < this.field3307; var8++) {
            this.field3319[var8] = var6 += var3.method1593(true);
            if (var7 < this.field3319[var8]) {
                var7 = this.field3319[var8];
            }
        }
        this.field3316 = var7 + 1;
        this.field3310 = new int[this.field3316];
        this.field3312 = new int[this.field3316];
        this.field3313 = new int[this.field3316][];
        this.field3300 = new int[this.field3316];
        this.field3308 = new int[this.field3316];
        if (var5 != 0) {
            this.field3303 = new int[this.field3316];
            for (int var9 = 0; var9 < this.field3316; var9++) {
                this.field3303[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3307; var10++) {
                this.field3303[this.field3319[var10]] = var3.method1562(21705);
            }
            this.field3321 = new class146(this.field3303);
        }
        for (int var11 = 0; var11 < this.field3307; var11++) {
            this.field3310[this.field3319[var11]] = var3.method1562(21705);
        }
        for (int var12 = 0; var12 < this.field3307; var12++) {
            this.field3312[this.field3319[var12]] = var3.method1562(21705);
        }
        for (int var13 = 0; var13 < this.field3307; var13++) {
            this.field3308[this.field3319[var13]] = var3.method1593(true);
        }
        int var14 = -121 % ((arg1 + 28) / 44);
        for (int var15 = 0; var15 < this.field3307; var15++) {
            int var22 = 0;
            int var23 = this.field3319[var15];
            int var24 = -1;
            int var25 = this.field3308[var23];
            this.field3313[var23] = new int[var25];
            for (int var26 = 0; var26 < var25; var26++) {
                int var27 = this.field3313[var23][var26] = var22 += var3.method1593(true);
                if (var24 < var27) {
                    var24 = var27;
                }
            }
            this.field3300[var23] = var24 + 1;
            if (var24 + 1 == var25) {
                this.field3313[var23] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3296 = new class146[var7 + 1];
        this.field3311 = new int[var7 + 1][];
        for (int var16 = 0; var16 < this.field3307; var16++) {
            int var17 = this.field3319[var16];
            int var18 = this.field3308[var17];
            this.field3311[var17] = new int[this.field3300[var17]];
            for (int var19 = 0; var19 < this.field3300[var17]; var19++) {
                this.field3311[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field3313[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field3313[var17][var20];
                }
                this.field3311[var17][var21] = var3.method1562(21705);
            }
            this.field3296[var17] = new class146(this.field3311[var17]);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method1296(int arg0) {
        field3302 = null;
        field3317 = null;
        field3306 = null;
        field3299 = null;
        field3298 = null;
        if (arg0 != -25578) {
            method1293(58, 21);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static final void method1297(byte arg0) {
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        field3301++;
        System.exit(1);
        int var1 = -37 / ((arg0 + 12) / 63);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Z")
    public static final boolean method1298(int arg0) {
        field3297++;
        return arg0 == 10 ? class230.field4129 : false;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "([BI)V")
    public class188(byte[] arg0, int arg1) {
        this.field3309 = class38.method259(arg0.length, -46, arg0);
        if (this.field3309 != arg1) {
            throw new RuntimeException();
        }
        this.method1295(arg0, (byte) -101);
    }
}
