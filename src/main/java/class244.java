import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class244 extends class529 {

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    private int field3136 = 3072;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    private int field3138 = 1024;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    private int field3147 = 2048;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field3142 = 0;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "[C")
    public static char[] field3144 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class244() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBIII)V")
    public static final void method1513(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field3137;
        int var5 = -69 % ((-36 - arg1) / 48);
        if (~class108.field1334 >= ~(-arg3 + arg0) && ~(arg0 + arg3) >= ~class592.field8242 && ~class112.field1386 >= ~(-arg3 + arg4) && ~class328.field4190 <= ~(arg4 - -arg3)) {
            class466.method2757(arg0, 5, arg4, arg3, arg2);
        } else {
            class487.method2852(arg4, arg0, -1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        int var3 = 31 / ((27 - arg1) / 49);
        ++field3141;
        int[] var4 = super.field7456.method1635(arg0, -125);
        if (super.field7456.field3449) {
            int[] var5 = this.method3028((byte) 107, arg0, 0);
            for (int var6 = 0; var6 < class304.field3909; ++var6) {
                var4[var6] = this.field3138 - -(var5[var6] * this.field3147 >> 12);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[[I")
    public final int[][] method592(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method303(-29);
        }
        ++field3146;
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (super.field7450.field5165) {
            int[][] var4 = this.method3026(0, arg0, 18464);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class304.field3909; ++var11) {
                var8[var11] = (var5[var11] * this.field3147 >> 12) + this.field3138;
                var9[var11] = (var6[var11] * this.field3147 >> 12) + this.field3138;
                var10[var11] = (var7[var11] * this.field3147 >> 12) + this.field3138;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public final void method303(int arg0) {
        this.field3147 = this.field3136 - this.field3138;
        if (arg0 >= -92) {
            field3144 = null;
        }
        ++field3145;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field3140;
        if (arg1 <= 45) {
            method1514(-27);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field7461 = ~arg2.method1094(255) == -2;
                }
            } else {
                this.field3136 = arg2.method1107(false);
            }
        } else {
            this.field3138 = arg2.method1107(false);
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
    public static void method1514(int arg0) {
        field3144 = null;
        if (arg0 != -1) {
            field3139 = 79;
        }
    }
}
