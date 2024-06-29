import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class112 implements class133 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    private int field2171 = 50;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    private int field2186 = 128;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lf;")
    private class47 field2174;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Lf;")
    private class47 field2191;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Lb;")
    private class11 field2190;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2172 = 0;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lsd;")
    public static class166 field2180 = class135.method935("hitmarks", 0);

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field2175 = 0;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field2194 = 0;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field2195 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lha;")
    public static class65 field2187;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "[Lre;")
    public static class158[] field2182;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "[Lsd;")
    public static class166[] field2178;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(II)Lrf;")
    private final class159 method812(int arg0, int arg1) {
        field2193++;
        if (arg1 != -1) {
            return null;
        }
        class159 var3 = (class159) this.field2190.method64((byte) 28, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2174.method353(0, arg0, -78);
        if (var4 == null) {
            return class125.method892(-85);
        } else {
            class53 var5 = new class53(var4);
            class159 var6 = new class159(var5);
            this.field2190.method67(var6, arg1 ^ 0xFFFFC45D, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)Z")
    public final boolean method813(byte arg0, int arg1) {
        field2189++;
        if (arg0 != 115) {
            field2180 = null;
        }
        return this.method812(arg1, arg0 ^ 0xFFFFFF8C).field3018;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)Z")
    public final boolean method814(int arg0, byte arg1) {
        field2179++;
        int var3 = 28 / ((-arg1 - 45) / 54);
        return this.method812(arg0, -1).field3021;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLsd;Z)V")
    public static final void method815(byte arg0, class166 arg1, boolean arg2) {
        field2183++;
        int var3 = 0;
        class166 var4 = arg1.method1127((byte) 107);
        short[] var5 = new short[16];
        if (arg0 != -92) {
            return;
        }
        for (int var6 = 0; var6 < class129.field2533; var6++) {
            class57 var13 = class3.method19(var6, true);
            if ((!arg2 || var13.field1128) && var13.field1122.method1127((byte) 120).method1137(arg0 + 91, var4) != -1) {
                if (var3 >= 100) {
                    class56.field1079 = -1;
                    class199.field3958 = null;
                    return;
                }
                if (var5.length <= var3) {
                    short[] var14 = new short[var5.length * 2];
                    for (int var15 = 0; var15 < var3; var15++) {
                        var14[var15] = var5[var15];
                    }
                    var5 = var14;
                }
                var5[var3++] = (short) var6;
            }
        }
        class116.field2251 = 0;
        int var7 = var3;
        class56.field1079 = var3;
        class199.field3958 = var5;
        boolean var8;
        do {
            if (var7 <= 0) {
                return;
            }
            var7--;
            var8 = true;
            for (int var9 = 0; var9 < var7; var9++) {
                class57 var10 = class3.method19(var5[var9], true);
                class57 var11 = class3.method19(var5[var9 + 1], true);
                if (var10.field1122.method1116(var11.field1122, -128) > 0) {
                    short var12 = var5[var9];
                    var5[var9] = var5[var9 + 1];
                    var5[var9 + 1] = var12;
                    var8 = false;
                }
            }
        } while (!var8);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method816(int arg0) {
        field2170++;
        int var2 = 127 % ((arg0 - 57) / 54);
        this.field2190 = new class11(this.field2171);
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(II)V")
    public final void method817(int arg0, int arg1) {
        field2188++;
        if (arg0 != 50) {
            method825(34, null, 35, 114);
        }
        for (class159 var3 = (class159) this.field2190.method68(-51); var3 != null; var3 = (class159) this.field2190.method63((byte) 114)) {
            if (var3.field3020) {
                var3.method1077(arg1, (byte) -125);
                var3.field3020 = false;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static void method818(boolean arg0) {
        field2178 = null;
        if (arg0) {
            field2182 = null;
            field2180 = null;
            field2187 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(II)I")
    public final int method819(int arg0, int arg1) {
        if (arg1 != -26173) {
            field2194 = -17;
        }
        field2177++;
        return this.method812(arg0, -1).field3053;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(BI)Z")
    public final boolean method820(byte arg0, int arg1) {
        if (arg0 != -95) {
            this.field2171 = -64;
        }
        field2176++;
        return this.method812(arg1, -1).method1079(this, this.field2191, (byte) 96);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IFB)[I")
    public final int[] method821(int arg0, float arg1, byte arg2) {
        if (arg2 < 96) {
            return null;
        } else {
            field2184++;
            class159 var4 = this.method812(arg0, -1);
            var4.field3020 = true;
            return var4.method1076(this, arg1, this.field2186, this.field2191, 103);
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(II)Lab;")
    public static final class3 method822(int arg0, int arg1) {
        field2181++;
        class3 var2 = (class3) class108.field2095.method64((byte) 28, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field2768.method353(4, arg0, -127);
        class3 var4 = new class3();
        if (var3 != null) {
            var4.method20(arg1 - 25817, new class53(var3), arg0);
        }
        var4.method22((byte) -111);
        if (arg1 == 26072) {
            class108.field2095.method67(var4, arg1 ^ 0x5E7A, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)Z")
    public final boolean method823(int arg0, int arg1) {
        int var3 = -124 % ((-arg0 - 38) / 56);
        field2173++;
        return this.field2186 == 64 || this.method812(arg1, -1).field3047 == 64;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[I")
    public final int[] method824(int arg0, int arg1) {
        field2185++;
        class53 var3 = new class53(this.field2174.method353(0, arg1, arg0 ^ 0x3D0F));
        class159 var4 = new class159(var3);
        if (arg0 != -15732) {
            this.method819(-65, -98);
        }
        return var4.method1078(this, (byte) 48, this.field2186, this.field2191);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILf;II)Lre;")
    public static final class158 method825(int arg0, class47 arg1, int arg2, int arg3) {
        field2192++;
        if (arg2 == 0) {
            return class146.method1003(arg0, arg3, arg1, false) ? class146.method1004(-90) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lf;Lf;II)V")
    public class112(class47 arg0, class47 arg1, int arg2, int arg3) {
        this.field2174 = arg0;
        this.field2191 = arg1;
        this.field2171 = arg2;
        this.field2186 = arg3;
        this.field2190 = new class11(this.field2171);
    }
}
