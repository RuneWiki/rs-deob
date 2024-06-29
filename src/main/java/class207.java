import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class207 implements class211 {

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Llm;")
    private class291 field2974 = new class291(256);

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Ltj;")
    private class108 field2982;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Ltj;")
    private class108 field2980;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "[Ljb;")
    private class287[] field2973;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lvl;")
    public static class9 field2976;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "[[[I")
    public static int[][][] field2975;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(FIIIIZ)[I")
    public final int[] method1470(float arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 != 3962) {
            this.method1475(-18, 31);
        }
        field2979++;
        return this.method1472(-121, arg1).method2231(76928226, this.field2973[arg1].field4171, (double) arg0, this.field2980, arg2, this, arg4);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Z")
    public final boolean method1471(int arg0, int arg1) {
        if (arg0 != -31571) {
            field2976 = null;
        }
        field2970++;
        class338 var3 = this.method1472(-123, arg1);
        return var3 != null && var3.method2226(0, this, this.field2980);
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(II)Lkj;")
    private final class338 method1472(int arg0, int arg1) {
        field2977++;
        class366 var3 = this.field2974.method1972((long) arg1, 0);
        if (var3 != null) {
            return (class338) var3;
        }
        byte[] var4 = this.field2982.method645((byte) 80, arg1);
        if (var4 == null) {
            return null;
        }
        class338 var5 = new class338(new class130(var4));
        this.field2974.method1975(var5, (long) arg1, false);
        if (arg0 > -105) {
            this.method1471(-108, -102);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method1473(int arg0) {
        field2975 = null;
        if (arg0 == -4440) {
            field2976 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZFIBI)[I")
    public final int[] method1474(int arg0, boolean arg1, float arg2, int arg3, byte arg4, int arg5) {
        field2972++;
        if (arg4 > -13) {
            this.method1474(10, false, 0.44542834F, -4, (byte) 91, 104);
        }
        return this.method1472(-127, arg5).method2228(arg3, arg1, this.field2973[arg5].field4171, true, (double) arg2, arg0, this.field2980, this);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)Ljb;")
    public final class287 method1475(int arg0, int arg1) {
        field2981++;
        return arg1 == 17673 ? this.field2973[arg0] : null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IFIBZI)[F")
    public final float[] method1476(int arg0, float arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field2971++;
        int var7 = 96 % ((-arg3 - 49) / 58);
        return this.method1472(-119, arg0).method2227(arg2, arg5, (byte) 23, this.field2973[arg0].field4171, this.field2980, this);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(J[IBI)Ljava/lang/String;")
    public static final String method1477(long arg0, int[] arg1, byte arg2, int arg3) {
        field2968++;
        if (class335.field4873 != null) {
            String var5 = class335.field4873.method106(arg3, false, arg0, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        int var6 = 93 % ((arg2 + 31) / 60);
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLao;IILao;)I")
    public static final int method1478(boolean arg0, class158 arg1, int arg2, int arg3, class158 arg4) {
        field2983++;
        if (arg3 == 1) {
            int var5 = arg4.field2392;
            int var6 = arg1.field2392;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class327.method2149(arg1.method1150(28109).field3527, (byte) -76, arg4.method1150(arg2 + 25521).field3527, class309.field4497);
        } else if (arg3 == 3) {
            if (arg4.field2304.equals("-")) {
                if (arg1.field2304.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field2304.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class327.method2149(arg1.field2304, (byte) -86, arg4.field2304, class309.field4497);
            }
        } else if (arg3 == 4) {
            if (arg4.method1206(8)) {
                return arg1.method1206(arg2 ^ 0xA14) ? 0 : 1;
            } else if (arg1.method1206(8)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg4.method1211(arg2 - 20441)) {
                return arg1.method1211(arg2 - 20441) ? 0 : 1;
            } else if (arg1.method1211(-17853)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 != 6) {
            if (arg2 != 2588) {
                method1473(-123);
            }
            if (arg3 == 7) {
                if (arg4.method1212((byte) 81)) {
                    return arg1.method1212((byte) 80) ? 0 : 1;
                } else if (arg1.method1212((byte) 80)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 8) {
                int var7 = arg4.field2309;
                int var8 = arg1.field2309;
                if (arg0) {
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg4.field2311 - arg1.field2311;
            }
        } else if (arg4.method1207(true)) {
            return arg1.method1207(true) ? 0 : 1;
        } else if (arg1.method1207(true)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ltj;Ltj;Ltj;)V")
    public class207(class108 arg0, class108 arg1, class108 arg2) {
        this.field2982 = arg1;
        this.field2980 = arg2;
        class130 var4 = new class130(arg0.method643(0, 0, true));
        int var5 = var4.method798(false);
        this.field2973 = new class287[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method837(true) == 1) {
                this.field2973[var6] = new class287();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2973[var7] != null) {
                this.field2973[var7].field4184 = var4.method837(true) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2973[var8] != null) {
                this.field2973[var8].field4170 = var4.method837(true) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2973[var9] != null) {
                this.field2973[var9].field4164 = var4.method837(true) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2973[var10] != null) {
                this.field2973[var10].field4189 = var4.method837(true) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2973[var11] != null) {
                this.field2973[var11].field4172 = var4.method823((byte) 110);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2973[var12] != null) {
                this.field2973[var12].field4182 = var4.method823((byte) -21);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2973[var13] != null) {
                this.field2973[var13].field4165 = var4.method823((byte) -12);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2973[var14] != null) {
                this.field2973[var14].field4177 = var4.method823((byte) 114);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2973[var15] != null) {
                this.field2973[var15].field4175 = (short) var4.method798(false);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field2973[var16] != null) {
                this.field2973[var16].field4174 = var4.method823((byte) -108);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field2973[var17] != null) {
                this.field2973[var17].field4168 = var4.method823((byte) -56);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field2973[var18] != null) {
                this.field2973[var18].field4178 = var4.method837(true) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field2973[var19] != null) {
                this.field2973[var19].field4171 = var4.method837(true) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field2973[var20] != null) {
                this.field2973[var20].field4185 = var4.method823((byte) -108);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field2973[var21] != null) {
                this.field2973[var21].field4183 = var4.method837(true) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field2973[var22] != null) {
                this.field2973[var22].field4173 = var4.method837(true) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field2973[var23] != null) {
                this.field2973[var23].field4181 = var4.method837(true) == 1;
            }
        }
    }

    static {
        new class349("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }
}
