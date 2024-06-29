import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class125 extends class276 {

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "Z")
    private boolean field2197 = true;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "Z")
    private boolean field2199 = true;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field2193 = 2;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "[I")
    public static int[] field2191 = new int[2500];

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2190 = "flash3:";

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "Z")
    public static boolean field2196 = false;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "Z")
    public static boolean field2202 = false;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "S")
    public static short field2200 = 256;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "[I")
    public static int[] field2203;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        int[][] var3 = super.field4418.method835((byte) 123, arg0);
        ++field2198;
        if (super.field4418.field2164) {
            int[][] var4 = this.method1810((byte) -125, this.field2199 ? -arg0 + field2189 : arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            if (this.field2197) {
                for (int var11 = 0; class53.field929 > var11; ++var11) {
                    var7[var11] = var5[-var11 + class35.field504];
                    var8[var11] = var6[-var11 + class35.field504];
                    var9[var11] = var10[-var11 + class35.field504];
                }
            } else {
                for (int var12 = 0; var12 < class53.field929; ++var12) {
                    var7[var12] = var5[var12];
                    var8[var12] = var6[var12];
                    var9[var12] = var10[var12];
                }
            }
        }
        if (arg1 != -1) {
            this.method300(64, -10);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLdl;)Ldl;")
    public static final class46 method854(byte arg0, class46 arg1) {
        if (arg0 < 117) {
            method856(-62, (class288) null);
        }
        ++field2192;
        class46 var2 = client.method1915(arg1);
        if (var2 == null) {
            var2 = arg1.field680;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)I")
    public static final int method855(int arg0, int arg1, int arg2) {
        ++field2195;
        if (arg2 != -574241313) {
            method857(45);
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILnh;)V")
    public static final void method856(int arg0, class288 arg1) {
        ++field2188;
        class57 var2 = (class57) class58.field1018.method779(91, class103.method702(true, arg1.field4601));
        if (arg0 != 1) {
            method855(-61, -115, 57);
        }
        if (var2 != null) {
            if (var2.field1001 != null) {
                class10.field149.method259(var2.field1001);
                var2.field1001 = null;
            }
            var2.method547(10026);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field4408 = arg1.method669((byte) 36) == 1;
                }
            } else {
                this.field2199 = ~arg1.method669((byte) 36) == -2;
            }
        } else {
            this.field2197 = arg1.method669((byte) 36) == 1;
        }
        if (arg2 != -1) {
            this.method23(97, 57);
        }
        ++field2194;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 < 39) {
            field2190 = null;
        }
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int[] var4 = this.method1805(false, 0, this.field2199 ? -arg1 + field2189 : arg1);
            if (!this.field2197) {
                class235.method1559(var4, 0, var3, 0, class53.field929);
            } else {
                for (int var5 = 0; ~var5 > ~class53.field929; ++var5) {
                    var3[var5] = var4[-var5 + class35.field504];
                }
            }
        }
        ++field2201;
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public static void method857(int arg0) {
        field2191 = null;
        field2190 = null;
        field2203 = null;
        if (arg0 >= -40) {
            method855(-42, -83, -56);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class125() {
        super(1, false);
    }
}
