import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class312 extends class27 {

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4640 = "green:";

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4643 = "green:";

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "I")
    public static int field4648 = 0;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "Lbo;")
    public static class16 field4646 = new class16();

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!tj", name = "X", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!tj", name = "Y", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!tj", name = "Z", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "Lph;")
    public static class361 field4641;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "Lph;")
    public static class361 field4649;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "[I")
    public static int[] field4642;

    @OriginalMember(owner = "client!tj", name = "ab", descriptor = "[I")
    public static int[] field4655;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "[Ltd;")
    private class255[] field4650;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(B)V", line = 4)
    public static void method2182(byte arg0) {
        field4640 = null;
        field4655 = null;
        if (arg0 >= -5) {
            field4641 = (class361) null;
        }
        field4641 = null;
        field4643 = null;
        field4649 = null;
        field4642 = null;
        field4646 = null;
    }

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V", line = 20)
    public static final void method2183(int arg0) {
        field4652++;
        if (class361.field5721 <= 0) {
            class94.field1321 = class67.field973;
            class67.field973 = null;
            class250.method1837(arg0, arg0 ^ 0x0);
        } else {
            class302.method2131((byte) -101);
        }
    }

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)V", line = 38)
    public static final void method2184(int arg0) {
        field4639++;
        if (arg0 != 22326) {
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class135.method964(false, var3, var2, var1, class302.field4502, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILsb;I)V", line = 73)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4650 = new class255[arg1.method1319(255)];
            for (int var4 = 0; var4 < this.field4650.length; var4++) {
                int var5 = arg1.method1319(255);
                if (var5 == 0) {
                    this.field4650[var4] = class347.method2438(0, arg1);
                } else if (var5 == 1) {
                    this.field4650[var4] = class51.method428(class228.method1706(arg0, 5808), arg1);
                } else if (var5 == 2) {
                    this.field4650[var4] = class197.method1415(arg1, true);
                } else if (var5 == 3) {
                    this.field4650[var4] = class263.method1951((byte) -124, arg1);
                }
            }
        } else if (arg2 == 1) {
            this.field376 = arg1.method1319(255) == 1;
        }
        if (arg0 == -5836) {
            field4653++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)[I", line = 148)
    public final int[] method18(int arg0, byte arg1) {
        field4644++;
        if (arg1 != -62) {
            field4641 = (class361) null;
        }
        int[] var3 = this.field375.method2087(-113, arg0);
        if (this.field375.field4382) {
            this.method2185(true, this.field375.method2084(arg1 - 27000));
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[[I", line = 201)
    public final int[][] method19(int arg0, int arg1) {
        field4647++;
        int[][] var3 = this.field379.method668(arg1, arg0 ^ arg0);
        if (this.field379.field1171) {
            int var4 = class184.field2642;
            int var5 = class209.field3053;
            int[][][] var6 = this.field379.method665((byte) -100);
            int[][] var7 = new int[var4][var5];
            this.method2185(true, var7);
            for (int var8 = 0; var8 < class184.field2642; var8++) {
                int[][] var9 = var6[var8];
                int[] var10 = var9[0];
                int[] var11 = var9[1];
                int[] var12 = var7[var8];
                int[] var13 = var9[2];
                for (int var14 = 0; var14 < class209.field3053; var14++) {
                    int var15 = var12[var14];
                    var13[var14] = class287.method2076(255, var15) << 4;
                    var11[var14] = class287.method2076(var15 >> 4, 4080);
                    var10[var14] = class287.method2076(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 254)
    public class312() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z[[I)V", line = 260)
    private final void method2185(boolean arg0, int[][] arg1) {
        if (!arg0) {
            return;
        }
        field4645++;
        int var3 = class209.field3053;
        int var4 = class184.field2642;
        class344.method2407(-109, arg1);
        class309.method2178(0, class150.field2180, -126, class214.field3080, 0);
        if (this.field4650 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field4650.length; var5++) {
            class255 var6 = this.field4650[var5];
            int var7 = var6.field3803;
            int var8 = var6.field3809;
            if (var7 >= 0) {
                if (var8 < 0) {
                    var6.method701(var3, var4, (byte) -96);
                } else {
                    var6.method703(var3, var4, 27159);
                }
            } else if (var8 >= 0) {
                var6.method699(16900, var4, var3);
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lno;I)I", line = 311)
    public static final int method2186(class181 arg0, int arg1) {
        field4651++;
        if (arg1 != 255) {
            method2183(66);
        }
        class214 var2 = arg0.field2609;
        if (var2.field3142 != null) {
            var2 = var2.method1539(false);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3133;
        class15 var4 = arg0.method2355(true);
        if (arg0.field5096 == var4.field262) {
            var3 = var2.field3109;
        } else if (arg0.field5096 == var4.field232 || arg0.field5096 == var4.field253 || arg0.field5096 == var4.field240 || arg0.field5096 == var4.field220) {
            var3 = var2.field3139;
        } else if (arg0.field5096 == var4.field241 || arg0.field5096 == var4.field238 || arg0.field5096 == var4.field257 || arg0.field5096 == var4.field252) {
            var3 = var2.field3134;
        }
        return var3;
    }
}
