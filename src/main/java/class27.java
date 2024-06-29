import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class27 extends class270 {

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
    private int field399 = -1;

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "[I")
    public static int[] field403 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "[S")
    public static short[] field400 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "Ljava/lang/String;")
    public static String field398 = "Walk here";

    @OriginalMember(owner = "client!sq", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field406 = new String[200];

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!sq", name = "R", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!sq", name = "S", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!sq", name = "V", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!sq", name = "W", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "[I")
    public static int[] field401;

    @OriginalMember(owner = "client!sq", name = "X", descriptor = "[I")
    private int[] field410;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
    public final void method219(int arg0, int arg1, int arg2) {
        ++field408;
        super.method219(arg0, arg1, arg2);
        if (~this.field399 <= -1) {
            int var4 = class285.field4272.method1412(this.field399, (byte) -72).field2931 ? 64 : 128;
            this.field410 = class285.field4272.method1413(var4, this.field399, var4, 1.0F, false, false);
            this.field407 = var4;
            this.field396 = var4;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 == 108) {
            ++field395;
            if (arg2 == 0) {
                this.field399 = arg1.method320((byte) -87);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
    public final void method122(byte arg0) {
        ++field393;
        super.method122(arg0);
        this.field410 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method123(boolean arg0, int arg1) {
        ++field397;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field4046.method244(arg1, 123);
            if (super.field4046.field488) {
                int var4 = this.field407 * (class364.field5188 == this.field396 ? arg1 : this.field396 * arg1 / class364.field5188);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class161.field2445 == ~this.field407) {
                    for (int var8 = 0; ~var8 > ~class161.field2445; ++var8) {
                        int var9 = this.field410[var4++];
                        var7[var8] = class35.method254(4080, var9 << 4);
                        var6[var8] = class35.method254(65280, var9) >> 4;
                        var5[var8] = class35.method254(var9 >> 12, 4080);
                    }
                } else {
                    for (int var10 = 0; class161.field2445 > var10; ++var10) {
                        int var11 = this.field407 * var10 / class161.field2445;
                        int var12 = this.field410[var4 + var11];
                        var7[var10] = class35.method254(4080, var12 << 4);
                        var6[var10] = class35.method254(4080, var12 >> 4);
                        var5[var10] = class35.method254(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(B)I")
    public final int method220(byte arg0) {
        if (arg0 != 73) {
            this.method78((byte) -42, (class37) null, -76);
        }
        ++field394;
        return this.field399;
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(B)V")
    public static void method221(byte arg0) {
        field403 = null;
        field401 = null;
        field398 = null;
        field400 = null;
        field406 = null;
        if (arg0 > -70) {
            field398 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
    public class27() {
        super(0, false);
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(B)V")
    public static final void method222(byte arg0) {
        ++field402;
        if (arg0 > 69) {
            if (class20.field293 != null) {
                if (class20.field293.field2121 == 1) {
                    class20.field293 = null;
                    return;
                }
                if (class20.field293.field2121 == 2) {
                    class435.method2728(class121.field1900, 122, class55.field893, 2);
                    class20.field293 = null;
                    return;
                }
            }
        }
    }
}
