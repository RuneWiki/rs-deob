import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class191 extends class160 {

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    private int field2953 = -1;

    @OriginalMember(owner = "client!dj", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field2968 = "white:";

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "I")
    private int field2963;

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!dj", name = "fb", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!dj", name = "ib", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!dj", name = "jb", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "[I")
    private int[] field2956;

    @OriginalMember(owner = "client!dj", name = "gb", descriptor = "[I")
    public static int[] field2967;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field2958;
        int[][] var3 = super.field2476.method839(!arg1, arg0);
        if (super.field2476.field1950 && this.method1286(64)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int var6 = (class79.field1328 == this.field2963 ? arg0 : this.field2963 * arg0 / class79.field1328) * this.field2960;
            int[] var7 = var3[2];
            if (~class240.field3896 == ~this.field2960) {
                for (int var8 = 0; ~var8 > ~class240.field3896; ++var8) {
                    int var9 = this.field2956[var6++];
                    var7[var8] = class55.method420(var9, 255) << 4;
                    var4[var8] = class55.method420(var9, 65280) >> 4;
                    var5[var8] = class55.method420(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; class240.field3896 > var10; ++var10) {
                    int var11 = this.field2960 * var10 / class240.field3896;
                    int var12 = this.field2956[var6 + var11];
                    var7[var10] = class55.method420(255, var12) << 4;
                    var4[var10] = class55.method420(var12 >> 4, 4080);
                    var5[var10] = class55.method420(var12, 16711680) >> 12;
                }
            }
        }
        if (!arg1) {
            this.field2960 = -22;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLre;)V")
    public static final void method1281(byte arg0, class228 arg1) {
        ++field2964;
        class228 var2 = class180.method1230(arg1, 104);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class29.field409;
            var4 = class79.field1310;
        } else {
            var4 = var2.field3625;
            var3 = var2.field3574;
        }
        if (arg0 >= -51) {
            field2970 = -62;
        }
        class257.method1745(var3, arg1, var4, true, false);
        class230.method1533((byte) 116, var4, arg1, var3);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2953 = arg0.method645(11596);
        }
        if (arg1 <= 11) {
            this.method1286(79);
        }
        ++field2962;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILai;)Ltg;")
    public static final class185 method1282(int arg0, class88 arg1) {
        ++field2969;
        if (arg0 != 28580) {
            field2967 = null;
        }
        return new class185(arg1.method649(-2), arg1.method649(arg0 ^ -28582), arg1.method649(-2), arg1.method649(arg0 ^ -28582), arg1.method671(105), arg1.method633(58));
    }

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "(B)V")
    public static final void method1283(byte arg0) {
        if (arg0 != -5) {
            field2968 = null;
        }
        ++field2959;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public final void method1086(int arg0) {
        int var2 = -114 % ((arg0 - -1) / 35);
        ++field2955;
        super.method1086(-57);
        this.field2956 = null;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)Z")
    public static final boolean method1284(int arg0) {
        ++field2961;
        return arg0 >= -85 ? true : class218.field3365;
    }

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "(B)I")
    public static final int method1285(byte arg0) {
        ++field2957;
        if (arg0 != 30) {
            method1287(55);
        }
        return class86.field1437;
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)Z")
    private final boolean method1286(int arg0) {
        ++field2954;
        if (this.field2956 != null) {
            return true;
        } else if (~this.field2953 <= -1) {
            int var2 = class240.field3896;
            int var3 = class79.field1328;
            int var4 = !class199.field3129.method1879(arg0 ^ 320, this.field2953).field2472 ? 128 : 64;
            this.field2956 = class199.field3129.method1881(var4, 1.0F, false, (byte) -48, var4, this.field2953);
            this.field2960 = var4;
            this.field2963 = var4;
            class201.method1358(var3, var2, (byte) 122);
            return this.field2956 != null;
        } else {
            if (arg0 != 64) {
                this.method1090(-71);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)V")
    public static void method1287(int arg0) {
        field2967 = null;
        field2968 = null;
        if (arg0 >= -34) {
            field2968 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class191() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)I")
    public final int method1090(int arg0) {
        if (arg0 != -1) {
            return -68;
        } else {
            ++field2965;
            return this.field2953;
        }
    }

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)V")
    public static final void method1288(int arg0) {
        ++field2966;
        if (class250.field4036) {
            class170.field2646 = null;
            class250.field4036 = false;
            class45.field642 = null;
            int var1 = 68 % ((-2 - arg0) / 39);
        }
    }
}
