import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class312 extends class98 {

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    private int field4403 = 0;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    private int field4405 = 20;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    private int field4406 = 1365;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    private int field4410 = 0;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "[I")
    public static int[] field4404 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(B)V")
    public static void method2057(byte arg0) {
        field4404 = null;
        if (arg0 != 56) {
            method2059((class376) null, (class376) null, false, (class376) null);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class312() {
        super(0, true);
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(B)V")
    public static final void method2058(byte arg0) {
        int var1 = -72 / ((19 - arg0) / 47);
        ++field4408;
        try {
            if (~class383.field5407 == -2) {
                int var2 = class385.field5427.method1064(0);
                if (~var2 < -1 && class385.field5427.method1052(16)) {
                    int var3 = var2 - class128.field1558;
                    if (~var3 > -1) {
                        var3 = 0;
                    }
                    class385.field5427.method1040(var3, -38);
                } else {
                    class385.field5427.method1041(921769607);
                    class385.field5427.method1069(0);
                    if (class362.field5168 != null) {
                        class383.field5407 = 2;
                    } else {
                        class383.field5407 = 0;
                    }
                    class324.field4620 = null;
                    class98.field1196 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class385.field5427.method1041(921769607);
            class324.field4620 = null;
            class362.field5168 = null;
            class383.field5407 = 0;
            class98.field1196 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field4410 = 3;
        }
        ++field4407;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            for (int var4 = 0; class268.field3811 > var4; ++var4) {
                int var5 = (class189.field2722[var4] << 12) / this.field4406 + this.field4410;
                int var6 = (class163.field2285[arg1] << 12) / this.field4406 + this.field4403;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~this.field4405 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var11 - var12;
                    var11 = var9 * var9 >> 12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field4405 + -1) < ~var13 ? (var13 << 12) / this.field4405 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ltq;Ltq;ZLtq;)V")
    public static final void method2059(class376 arg0, class376 arg1, boolean arg2, class376 arg3) {
        if (!arg2) {
            field4404 = null;
        }
        ++field4409;
        class162.field2205 = arg0;
        class230.method1532(arg1, arg3, 113);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field4403 = arg1.method1617((byte) 48);
                    }
                } else {
                    this.field4410 = arg1.method1617((byte) 48);
                }
            } else {
                this.field4405 = arg1.method1617((byte) 48);
            }
        } else {
            this.field4406 = arg1.method1617((byte) 48);
        }
        if (arg2 == 0) {
            ++field4402;
        }
    }
}
