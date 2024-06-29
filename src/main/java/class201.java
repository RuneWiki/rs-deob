import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class201 {

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Z")
    public static boolean field3141 = false;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[Lck;")
    public static class218[] field3142 = new class218[14];

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3144 = new String[1000];

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Ldl;")
    public static class123 field3138;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "Ldl;")
    public static class123 field3158;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lbf;")
    public class200 field3148;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[I")
    public int[] field3136;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[I")
    public int[] field3137;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[I")
    public int[] field3139;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[I")
    public int[] field3140;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "[I")
    public int[] field3150;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "[I")
    public int[] field3155;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "[Lbf;")
    public class200[] field3145;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "[[I")
    public int[][] field3146;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "[[I")
    public int[][] field3149;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public static final void method1383(int arg0, int arg1) {
        class49 var2 = class90.field1382[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class49 var4 = class90.field1382[var3][arg0][arg1] = class90.field1382[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field634--;
                for (int var5 = 0; var5 < var4.field639; var5++) {
                    class284 var6 = var4.field643[var5];
                    if ((var6.field4497 >> 29 & 0x3L) == 2L && var6.field4494 == arg0 && var6.field4498 == arg1) {
                        var6.field4505--;
                    }
                }
            }
        }
        if (class90.field1382[0][arg0][arg1] == null) {
            class90.field1382[0][arg0][arg1] = new class49(0, arg0, arg1);
        }
        class90.field1382[0][arg0][arg1].field636 = var2;
        class90.field1382[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)Lvk;")
    public static final class35 method1384(int arg0, int arg1, int arg2, int arg3) {
        field3143++;
        class35 var4 = new class35();
        var4.field456 = arg1;
        var4.field445 = arg3;
        class2.field22.method662(0, var4, (long) arg0);
        class13.method96(arg1, 0);
        class214 var5 = class206.method1403((byte) 7, arg0);
        if (var5 != null) {
            class55.method397(0, var5);
        }
        if (class249.field3995 != null) {
            class55.method397(0, class249.field3995);
            class249.field3995 = null;
        }
        int var6 = class245.field3920;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class287.method1917(class2.field21[var7], 31)) {
                class245.method1654(5526, var7);
            }
        }
        if (class245.field3920 == 1) {
            class286.field4542 = false;
            class286.method1908(class106.field1641, 35, class240.field3852, class57.field808, class25.field345);
        } else {
            class286.method1908(class106.field1641, 58, class240.field3852, class57.field808, class25.field345);
            int var8 = class232.field3734.method1309(class86.field1366);
            for (int var9 = 0; var9 < class245.field3920; var9++) {
                int var10 = class232.field3734.method1309(class102.method674(-19736, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class25.field345 = class245.field3920 * 15 + (class264.field4247 ? 26 : 22);
            class106.field1641 = var8 + 8;
        }
        if (arg2 != -8) {
            field3138 = null;
        }
        if (var5 != null) {
            class54.method391((byte) 51, false, var5);
        }
        class287.method1916(16173, arg1);
        if (class242.field3880 != -1) {
            class159.method1067(1, class242.field3880, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
    public static final void method1385(int arg0, boolean arg1) {
        field3154++;
        if (arg0 >= -68) {
            method1386(56);
        }
        byte[][] var2 = class207.field3240;
        int var3 = class235.field3770.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class154.field2295[var4] & 0xFF) * 64 - class246.field3943;
                int var7 = (class154.field2295[var4] >> 8) * 64 - class126.field1869;
                class10.method63(13371);
                class174.method1223(var6, var5, var7, arg1, class290.field4574, 8);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method1386(int arg0) {
        field3158 = null;
        field3144 = null;
        if (arg0 == 1) {
            field3142 = null;
            field3138 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([BI)V")
    private final void method1387(byte[] arg0, int arg1) {
        field3152++;
        class25 var3 = new class25(class23.method158(arg0, 118));
        int var4 = var3.method201(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3157 = var3.method214((byte) 44);
        } else {
            this.field3157 = 0;
        }
        int var5 = var3.method201(255);
        this.field3147 = var3.method190(-3);
        this.field3136 = new int[this.field3147];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field3147; var8++) {
            this.field3136[var8] = var6 += var3.method190(-3);
            if (var7 < this.field3136[var8]) {
                var7 = this.field3136[var8];
            }
        }
        this.field3135 = var7 + 1;
        this.field3149 = new int[this.field3135][];
        this.field3140 = new int[this.field3135];
        this.field3150 = new int[this.field3135];
        this.field3155 = new int[this.field3135];
        this.field3139 = new int[this.field3135];
        if (var5 != 0) {
            this.field3137 = new int[this.field3135];
            for (int var9 = 0; var9 < this.field3135; var9++) {
                this.field3137[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3147; var10++) {
                this.field3137[this.field3136[var10]] = var3.method214((byte) 44);
            }
            this.field3148 = new class200(this.field3137);
        }
        for (int var11 = 0; var11 < this.field3147; var11++) {
            this.field3150[this.field3136[var11]] = var3.method214((byte) 44);
        }
        for (int var12 = 0; var12 < this.field3147; var12++) {
            this.field3140[this.field3136[var12]] = var3.method214((byte) 44);
        }
        for (int var13 = 0; var13 < this.field3147; var13++) {
            this.field3155[this.field3136[var13]] = var3.method190(-3);
        }
        int var14 = -75 % ((20 - arg1) / 54);
        for (int var15 = 0; var15 < this.field3147; var15++) {
            int var22 = 0;
            int var23 = -1;
            int var24 = this.field3136[var15];
            int var25 = this.field3155[var24];
            this.field3149[var24] = new int[var25];
            for (int var26 = 0; var26 < var25; var26++) {
                int var27 = this.field3149[var24][var26] = var22 += var3.method190(-3);
                if (var27 > var23) {
                    var23 = var27;
                }
            }
            this.field3139[var24] = var23 + 1;
            if (var23 + 1 == var25) {
                this.field3149[var24] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3145 = new class200[var7 + 1];
        this.field3146 = new int[var7 + 1][];
        for (int var16 = 0; var16 < this.field3147; var16++) {
            int var17 = this.field3136[var16];
            int var18 = this.field3155[var17];
            this.field3146[var17] = new int[this.field3139[var17]];
            for (int var19 = 0; var19 < this.field3139[var17]; var19++) {
                this.field3146[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field3149[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field3149[var17][var20];
                }
                this.field3146[var17][var21] = var3.method214((byte) 44);
            }
            this.field3145[var17] = new class200(this.field3146[var17]);
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([BI)V")
    public class201(byte[] arg0, int arg1) {
        this.field3151 = class107.method701((byte) 82, arg0, arg0.length);
        if (this.field3151 != arg1) {
            throw new RuntimeException();
        }
        this.method1387(arg0, -91);
    }
}
