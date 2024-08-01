import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lh")
public class class111 extends class147 {

    @OriginalMember(owner = "lh", name = "K", descriptor = "I")
    private int field2192 = 128;

    @OriginalMember(owner = "lh", name = "R", descriptor = "I")
    private int field2199 = 0;

    @OriginalMember(owner = "lh", name = "O", descriptor = "I")
    private int field2196 = 0;

    @OriginalMember(owner = "lh", name = "Y", descriptor = "I")
    private int field2206 = 128;

    @OriginalMember(owner = "lh", name = "Z", descriptor = "I")
    public int field2207 = -1;

    @OriginalMember(owner = "lh", name = "X", descriptor = "I")
    private int field2205 = 0;

    @OriginalMember(owner = "lh", name = "H", descriptor = "Llf;")
    public static class109 field2189 = class35.method275("<col=ffff00>", 2);

    @OriginalMember(owner = "lh", name = "G", descriptor = "Llf;")
    public static class109 field2188 = class35.method275("<col=ff0000>", 2);

    @OriginalMember(owner = "lh", name = "cb", descriptor = "Llf;")
    private static class109 field2210 = class35.method275("Free world", 2);

    @OriginalMember(owner = "lh", name = "U", descriptor = "Llf;")
    public static class109 field2202 = field2210;

    @OriginalMember(owner = "lh", name = "eb", descriptor = "Llf;")
    public static class109 field2212 = class35.method275("Bitte geben Sie Ihr Passwort ein)3", 2);

    @OriginalMember(owner = "lh", name = "I", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "lh", name = "J", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "lh", name = "L", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "lh", name = "M", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "lh", name = "N", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "lh", name = "S", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "lh", name = "T", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "lh", name = "ab", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "lh", name = "bb", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "lh", name = "db", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "lh", name = "P", descriptor = "[S")
    private short[] field2197;

    @OriginalMember(owner = "lh", name = "Q", descriptor = "[S")
    private short[] field2198;

    @OriginalMember(owner = "lh", name = "V", descriptor = "[S")
    private short[] field2203;

    @OriginalMember(owner = "lh", name = "W", descriptor = "[S")
    private short[] field2204;

    @OriginalMember(owner = "lh", name = "b", descriptor = "(Z)V")
    public static final void method821(boolean arg0) {
        class143 var1 = class85.field1728;
        synchronized (class85.field1728) {
            if (arg0) {
                method823(null, 34);
            }
            class206.field4043 = class52.field1054;
            class21.field479 = class39.field834;
            class109.field2134 = class52.field1060;
            class69.field1333 = class19.field413;
            class129.field2511 = class76.field1461;
            class67.field1310 = class45.field948;
            class44.field917 = class106.field2112;
            class19.field413 = 0;
        }
        field2200++;
    }

    @OriginalMember(owner = "lh", name = "a", descriptor = "(II)Lue;")
    public final class189 method822(int arg0, int arg1) {
        field2195++;
        if (arg1 < 100) {
            method823(null, 56);
        }
        class189 var3 = (class189) class170.field3189.method1086((long) this.field2191, -116);
        if (var3 == null) {
            class135 var4 = class135.method969(class174.field3290, this.field2193, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2203 != null) {
                for (int var5 = 0; var5 < this.field2203.length; var5++) {
                    var4.method965(this.field2203[var5], this.field2198[var5]);
                }
            }
            if (this.field2197 != null) {
                for (int var6 = 0; var6 < this.field2197.length; var6++) {
                    var4.method974(this.field2197[var6], this.field2204[var6]);
                }
            }
            var3 = var4.method967(this.field2205 + 64, this.field2196 + 850, -30, -50, -30, true, true);
            class170.field3189.method1082((long) this.field2191, -123, var3);
        }
        class189 var7;
        if (this.field2207 == -1 || arg0 == -1) {
            var7 = var3.method436(true);
        } else {
            var7 = client.method246(12, this.field2207).method188(var3, arg0, 2047);
        }
        if (this.field2192 != 128 || this.field2206 != 128) {
            var7.method1279(this.field2192, this.field2206, this.field2192);
        }
        if (this.field2199 != 0) {
            if (this.field2199 == 90) {
                var7.method1283();
            }
            if (this.field2199 == 180) {
                var7.method1283();
                var7.method1283();
            }
            if (this.field2199 == 270) {
                var7.method1283();
                var7.method1283();
                var7.method1283();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "lh", name = "a", descriptor = "(Luc;I)V")
    public static final void method823(class187 arg0, int arg1) {
        arg0.field3550 = arg1;
        if (arg0.field3561 == 0) {
            arg0.field3600 = 1024;
        }
        field2194++;
        int var2 = arg0.field3545 - class143.field2754;
        if (arg0.field3561 == 1) {
            arg0.field3600 = 1536;
        }
        int var3 = arg0.field3606 * 128 + arg0.field3612 * 64;
        int var4 = arg0.field3612 * 64 + arg0.field3552 * 128;
        if (arg0.field3561 == 2) {
            arg0.field3600 = 0;
        }
        arg0.field3609 += (var4 - arg0.field3609) / var2;
        if (arg0.field3561 == 3) {
            arg0.field3600 = 512;
        }
        arg0.field3549 += (var3 - arg0.field3549) / var2;
    }

    @OriginalMember(owner = "lh", name = "a", descriptor = "(Lja;Z)V")
    public final void method824(class86 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method598((byte) 91);
            if (var3 == 0) {
                field2208++;
                if (!arg1) {
                    method823(null, 9);
                    return;
                }
                return;
            }
            this.method826(var3, -26188, arg0);
        }
    }

    @OriginalMember(owner = "lh", name = "a", descriptor = "(ILoh;Lwb;B)V")
    public static final void method825(int arg0, class138 arg1, class204 arg2, byte arg3) {
        byte[] var4 = null;
        class181 var5 = class51.field1037;
        synchronized (class51.field1037) {
            for (class136 var6 = (class136) class51.field1037.method1230(71); var6 != null; var6 = (class136) class51.field1037.method1234(-1)) {
                if ((long) arg0 == var6.field1381 && var6.field2624 == arg2 && var6.field2626 == 0) {
                    var4 = var6.field2635;
                    break;
                }
            }
        }
        field2211++;
        if (var4 == null) {
            int var7 = -15 % ((4 - arg3) / 49);
            byte[] var8 = arg2.method1342(arg0, (byte) 94);
            arg1.method988(var8, arg2, false, true, arg0);
        } else {
            arg1.method988(var4, arg2, false, true, arg0);
        }
    }

    @OriginalMember(owner = "lh", name = "a", descriptor = "(IILja;)V")
    private final void method826(int arg0, int arg1, class86 arg2) {
        if (arg0 == 1) {
            this.field2193 = arg2.method569(true);
        } else if (arg0 == 2) {
            this.field2207 = arg2.method569(true);
        } else if (arg0 == 4) {
            this.field2192 = arg2.method569(true);
        } else if (arg0 == 5) {
            this.field2206 = arg2.method569(true);
        } else if (arg0 == 6) {
            this.field2199 = arg2.method569(true);
        } else if (arg0 == 7) {
            this.field2205 = arg2.method598((byte) 92);
        } else if (arg0 == 8) {
            this.field2196 = arg2.method598((byte) 72);
        } else if (arg0 == 40) {
            int var6 = arg2.method598((byte) 87);
            this.field2203 = new short[var6];
            this.field2198 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2203[var7] = (short) arg2.method569(true);
                this.field2198[var7] = (short) arg2.method569(true);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method598((byte) 94);
            this.field2204 = new short[var4];
            this.field2197 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2197[var5] = (short) arg2.method569(true);
                this.field2204[var5] = (short) arg2.method569(true);
            }
        }
        if (arg1 != -26188) {
            method828((byte) -31);
        }
        field2209++;
    }

    @OriginalMember(owner = "lh", name = "d", descriptor = "(B)V")
    public static final void method827(byte arg0) {
        field2201++;
        int[] var1 = new int[class150.field2888];
        int var2 = 0;
        for (int var3 = 0; var3 < class150.field2888; var3++) {
            class83 var6 = class128.method926(var3, -4);
            if (var6.field1634 >= 0 || var6.field1669 >= 0) {
                var1[var2++] = var3;
            }
        }
        class202.field3977 = new int[var2];
        int var4 = -18 / ((-arg0 - 67) / 38);
        for (int var5 = 0; var5 < var2; var5++) {
            class202.field3977[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "lh", name = "e", descriptor = "(B)V")
    public static void method828(byte arg0) {
        field2210 = null;
        field2189 = null;
        field2188 = null;
        field2212 = null;
        if (arg0 == -42) {
            field2202 = null;
        }
    }
}
