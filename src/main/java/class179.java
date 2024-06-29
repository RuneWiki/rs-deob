import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class179 extends class167 {

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "Z")
    public boolean field3078 = false;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "Lhk;")
    private class32 field3064;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "Z")
    private boolean field3069;

    @OriginalMember(owner = "client!pi", name = "eb", descriptor = "Z")
    private boolean field3084;

    @OriginalMember(owner = "client!pi", name = "gb", descriptor = "I")
    private int field3086;

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "I")
    private int field3080;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public static int field3068 = 0;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "Le;")
    public static class191 field3066 = class54.method368(": ", 2047);

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "Le;")
    private static class191 field3067 = class54.method368("Your ignore list is full)3 Max of 100 users)3", 2047);

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "Le;")
    public static class191 field3070 = field3067;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "Le;")
    private static class191 field3076 = class54.method368(" ", 2047);

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "Le;")
    public static class191 field3077 = field3076;

    @OriginalMember(owner = "client!pi", name = "fb", descriptor = "S")
    public static short field3085 = 1;

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "F")
    private float field3082;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!pi", name = "db", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!pi", name = "hb", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!pi", name = "ib", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!pi", name = "jb", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "[I")
    private int[] field3074;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "[[[B")
    public static byte[][][] field3065;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lng;ILua;)Z")
    public final boolean method1198(class121 arg0, int arg1, class246 arg2) {
        field3072++;
        if (arg1 != 255) {
            method1206(false);
        }
        return this.field3064.method220(arg2, 7, arg0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lua;ZLng;BF)[I")
    public final int[] method1199(class246 arg0, boolean arg1, class121 arg2, byte arg3, float arg4) {
        field3073++;
        if (this.field3074 == null || this.field3082 != arg4) {
            if (!this.field3064.method220(arg0, 57, arg2)) {
                return null;
            }
            int var6 = arg1 ? 64 : 128;
            this.field3074 = this.field3064.method218(-30, (double) arg4, true, arg2, var6, var6, arg0, this.field3084);
            this.field3082 = arg4;
            if (this.field3069) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var13 = var6 - 1;
                int var14 = var6;
                int var15 = var6;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var13; var34 >= 0; var34--) {
                        var14--;
                        int var35 = this.field3074[var14];
                        var7[var34] += class167.method1128(var35, 16748257) >> 16;
                        var8[var34] += class167.method1128(var35 >> 8, 255);
                        var9[var34] += class167.method1128(var35, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var22 += var8[var25];
                        var24 += var7[var25];
                        var23 += var9[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var13; var27 >= 0; var27--) {
                        var25--;
                        var21--;
                        int var31 = var22 / 9;
                        int var32 = var23 / 9;
                        int var33 = var24 / 9;
                        var19--;
                        var10[var19] = class217.method1476(var32, class217.method1476(var31 << 8, var33 << 16));
                        var24 += var7[var25] - var7[var21];
                        var22 += var8[var25] - var8[var21];
                        var23 += var9[var25] - var9[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var28 = var13; var28 >= 0; var28--) {
                        var15--;
                        int var29 = this.field3074[var15];
                        var14--;
                        int var30 = this.field3074[var14];
                        var7[var28] += -(class167.method1128(16763436, var29) >> 16) + class167.method1128(255, var30 >> 16);
                        var8[var28] += -(class167.method1128(65326, var29) >> 8) + (class167.method1128(var30, 65381) >> 8);
                        var9[var28] += -class167.method1128(255, var29) + class167.method1128(var30, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                }
                this.field3074 = var10;
            }
        }
        if (arg3 <= 71) {
            method1204(false, 85);
        }
        return this.field3074;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Leg;Z)Le;")
    public static final class191 method1200(class33 arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field3081++;
        if (class40.method268(127, client.method668(arg0)) == 0) {
            return null;
        } else if (arg0.field583 == null || arg0.field583.method1346((byte) 30).method1304(63) == 0) {
            return class111.field1875 ? class216.field3812 : null;
        } else {
            return arg0.field583;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)V")
    public final void method1201(int arg0, int arg1) {
        if (arg0 <= 60) {
            return;
        }
        field3088++;
        if (this.field3074 == null || this.field3080 == 0 && this.field3086 == 0) {
            return;
        }
        int var3 = this.field3086 * arg1;
        if (class33.field525 == null || class33.field525.length < this.field3074.length) {
            class33.field525 = new int[this.field3074.length];
        }
        int var4 = this.field3074.length == 4096 ? 64 : 128;
        int var5 = var4 - 1;
        int var6 = this.field3080 * var4 * arg1;
        int var7 = this.field3074.length;
        int var8 = var7 - 1;
        for (int var9 = 0; var9 < var7; var9 += var4) {
            int var11 = var8 & var6 + var9;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var9 + var12;
                int var14 = (var12 + var3 & var5) + var11;
                class33.field525[var13] = this.field3074[var14];
            }
        }
        int[] var10 = this.field3074;
        this.field3074 = class33.field525;
        class33.field525 = var10;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILng;I)Z")
    public static final boolean method1202(int arg0, class121 arg1, int arg2) {
        field3089++;
        if (arg0 != 16748257) {
            field3070 = null;
        }
        byte[] var3 = arg1.method804(arg2, (byte) 124);
        if (var3 == null) {
            return false;
        } else {
            class114.method726((byte) 111, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII)V")
    public static final void method1203(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3079++;
        int var5 = 0;
        if (arg0 > -9) {
            method1200((class33) null, true);
        }
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = class213.method1459(arg1 + arg4, (byte) -20, class37.field678, class207.field3680);
        int var9 = class213.method1459(arg1 - arg4, (byte) -108, class37.field678, class207.field3680);
        int var10 = -1;
        class242.method1700(7, arg2, var8, class232.field4151[arg3], var9);
        while (var6 > var5) {
            var10 += 2;
            var7 += var10;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 + var6;
                int var12 = arg3 - var6;
                if (class242.field4314 <= var11 && var12 <= class99.field1584) {
                    int var13 = class213.method1459(arg1 + var5, (byte) -92, class37.field678, class207.field3680);
                    int var14 = class213.method1459(arg1 - var5, (byte) -49, class37.field678, class207.field3680);
                    if (class99.field1584 >= var11) {
                        class242.method1700(7, arg2, var13, class232.field4151[var11], var14);
                    }
                    if (class242.field4314 <= var12) {
                        class242.method1700(7, arg2, var13, class232.field4151[var12], var14);
                    }
                }
            }
            var5++;
            int var15 = arg3 + var5;
            int var16 = arg3 - var5;
            if (var15 >= class242.field4314 && var16 <= class99.field1584) {
                int var17 = class213.method1459(arg1 + var6, (byte) -68, class37.field678, class207.field3680);
                int var18 = class213.method1459(arg1 - var6, (byte) -51, class37.field678, class207.field3680);
                if (var15 <= class99.field1584) {
                    class242.method1700(7, arg2, var17, class232.field4151[var15], var18);
                }
                if (class242.field4314 <= var16) {
                    class242.method1700(7, arg2, var17, class232.field4151[var16], var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3071++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)V")
    public static final void method1204(boolean arg0, int arg1) {
        if (arg0) {
            field3066 = null;
        }
        field3087++;
        class209.method1443(21954);
        class1.method1(true);
        int var2 = class30.method214((byte) -45, arg1).field424;
        if (var2 == 0) {
            return;
        }
        int var3 = class164.field2778[arg1];
        if (var2 == 9) {
            class11.field121 = var3;
        }
        if (var2 == 5) {
            class190.field3342 = var3;
        }
        if (var2 == 6) {
            class225.field4037 = var3;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Le;ZB)V")
    public static final void method1205(class191 arg0, boolean arg1, byte arg2) {
        field3075++;
        short[] var3 = new short[16];
        class191 var4 = arg0.method1324(0);
        int var5 = 0;
        for (int var6 = 0; var6 < class42.field745; var6++) {
            class148 var9 = class100.method623(-1, var6);
            if ((!arg1 || var9.field2540) && var9.field2534 == -1 && var9.field2511 == -1 && var9.field2520 == 0 && var9.field2529.method1324(0).method1350(var4, 109) != -1) {
                if (var5 >= 250) {
                    class207.field3696 = null;
                    class30.field429 = -1;
                    return;
                }
                if (var3.length <= var5) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        if (arg2 < 64) {
            field3077 = null;
        }
        class271.field4783 = 0;
        class30.field429 = var5;
        class207.field3696 = var3;
        class191[] var7 = new class191[class30.field429];
        for (int var8 = 0; var8 < class30.field429; var8++) {
            var7[var8] = class100.method623(-1, var3[var8]).field2529;
        }
        class97.method601(var7, class207.field3696, (byte) 83);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static void method1206(boolean arg0) {
        if (!arg0) {
            method1205((class191) null, true, (byte) 80);
        }
        field3077 = null;
        field3076 = null;
        field3066 = null;
        field3070 = null;
        field3065 = null;
        field3067 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lng;ZILua;)[I")
    public final int[] method1207(class121 arg0, boolean arg1, int arg2, class246 arg3) {
        if (arg2 != 26931) {
            field3077 = null;
        }
        field3083++;
        if (this.field3064.method220(arg3, 91, arg0)) {
            int var5 = arg1 ? 64 : 128;
            return this.field3064.method218(126, 1.0D, false, arg0, var5, var5, arg3, this.field3084);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lji;)V")
    public class179(class225 arg0) {
        this.field3064 = new class32(arg0);
        this.field3069 = arg0.method1580(-39) == 1;
        this.field3084 = arg0.method1580(-13) == 1;
        arg0.method1580(-24);
        arg0.method1580(-69);
        int var2 = arg0.method1580(-9) & 0x3;
        this.field3086 = arg0.method1575(false);
        this.field3080 = arg0.method1575(false);
        arg0.method1580(-17);
        arg0.method1580(-110);
    }
}
