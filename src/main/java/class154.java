import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class154 extends class136 {

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    private int field2183 = 0;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    private int field2187 = 1;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    private int field2181 = 0;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field2190 = 0;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "[I")
    public static int[] field2184;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)[Leh;")
    public static final class242[] method1093(boolean arg0) {
        ++field2192;
        return !arg0 ? null : new class242[] { class215.field3075, class215.field3084, class215.field3086, class215.field3087, class215.field3088, class215.field3089, class215.field3090, class215.field3091, class215.field3092, class215.field3093 };
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public final void method269(boolean arg0) {
        if (!arg0) {
            class156.method1112(true);
            ++field2188;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class154() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V")
    public static final void method1094(int arg0) {
        ++field2182;
        if (arg0 >= -102) {
            field2190 = -15;
        }
        if (!class458.field6716) {
            class531.field7820 = true;
            if (!class478.field7044.field3352) {
                class323.field4542 += (-12.0F - class323.field4542) / 2.0F;
            } else {
                class386.field5687 = (float) (-16 & (int) class386.field5687 + -17);
            }
            class458.field6716 = true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lpk;ILya;II)V")
    public static final void method1095(class133 arg0, int arg1, class38 arg2, int arg3, int arg4) {
        class274.field4042.method1016(-110);
        ++field2191;
        if (!class513.field7561) {
            if (arg1 != 3) {
                field2190 = 15;
            }
            for (class111 var5 = (class111) arg0.method1018(70); var5 != null; var5 = (class111) arg0.method1022((byte) -112)) {
                class405 var6 = class399.field5891.method837(var5.field1567, (byte) -41);
                if (class204.method1430(var6, 2)) {
                    boolean var7 = class278.method1786(arg2, (byte) -83, var5, var6, arg3, arg4);
                    if (var7) {
                        class410.method2511(var6, var5, (byte) 55, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZII)V")
    public static final void method1096(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 != 1004) {
            if (arg0 == 1012) {
                class41.method414(client.field2886, arg3, arg2);
            } else if (arg0 == 1008) {
                class41.method414(class141.field1994, arg3, arg2);
            } else if (~arg0 == -1002) {
                class41.method414(class236.field3461, arg3, arg2);
            } else if (~arg0 == -1007) {
                class41.method414(class24.field287, arg3, arg2);
            }
        } else {
            class41.method414(class21.field236, arg3, arg2);
        }
        if (arg1) {
            ++field2185;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 != 4) {
            this.field2187 = 94;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 3) {
                    this.field2187 = arg2.method577(255);
                }
            } else {
                this.field2183 = arg2.method577(255);
            }
        } else {
            this.field2181 = arg2.method577(255);
        }
        ++field2186;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public static void method1097(byte arg0) {
        field2184 = null;
        if (arg0 < 28) {
            field2184 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field2189;
        int var3 = 91 % ((67 - arg0) / 50);
        int[] var4 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int var5 = class290.field4168[arg1];
            int var6 = var5 - 2048 >> 1;
            for (int var7 = 0; var7 < class467.field6889; ++var7) {
                int var8 = class453.field6672[var7];
                int var9 = var8 + -2048 >> 1;
                int var12;
                if (this.field2181 != 0) {
                    int var10 = var6 * var6 + var9 * var9 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var12 = (int) ((double) (this.field2187 * var11) * 3.141592653589793D);
                } else {
                    var12 = (-var5 + var8) * this.field2187;
                }
                int var13 = var12 - (-4096 & var12);
                if (this.field2183 == 0) {
                    var13 = class489.field7187[var13 >> 4 & 255] + 4096 >> 1;
                } else if (~this.field2183 == -3) {
                    var13 -= 2048;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    var13 = 2048 - var13 << 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
    public static final void method1098(int arg0, int arg1) {
        if (arg1 != 1012) {
            method1095((class133) null, -43, (class38) null, -67, 66);
        }
        ++field2180;
        class215 var2 = class171.method1208(arg0, (byte) 121, 5);
        var2.method1469((byte) -117);
    }
}
