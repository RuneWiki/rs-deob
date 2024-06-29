import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class291 extends class397 {

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
    private int field4156 = 0;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    private int field4161 = 4096;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field4159 = 1;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field4160 = 0;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(Z)I")
    public static final int method1759(boolean arg0) {
        if (arg0) {
            field4159 = 114;
        }
        ++field4157;
        if (class164.field2146 == null) {
            if (!class174.field2387 && ~class383.field5696 < -1) {
                if (class23.field303 && class489.field7484.method1877(124, 81) && class383.field5696 > 2) {
                    return ((class262) class230.field3220.field5018.field1173.field1173).field3739;
                }
                return ((class262) class230.field3220.field5018.field1173).field3739;
            }
            int var1 = class137.field1797.method2038(9);
            int var2 = class137.field1797.method2044((byte) -46);
            int var3 = class214.field3022;
            int var4 = class64.field940;
            int var5 = class125.field1614;
            if (~var1 < ~var3 && var3 - -var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; class383.field5696 > var7; ++var7) {
                    if (!class500.field7650) {
                        int var11 = (-var7 + class383.field5696 - 1) * 16 + var4 + 31;
                        if (~var2 < ~(var11 + -13) && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = var4 - -((-var7 + -1 + class383.field5696) * 16) + 33;
                        if (var2 > var12 + -13 && ~(var12 + 3) <= ~var2) {
                            var6 = var7;
                        }
                    }
                }
                if (~var6 != 0) {
                    int var8 = 0;
                    class213 var9 = new class213(class230.field3220);
                    for (class262 var10 = (class262) var9.method1317((byte) -125); var10 != null; var10 = (class262) var9.method1321(-7499)) {
                        if (var8++ == var6) {
                            return var10.field3739;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field4158;
        int[] var3 = super.field5854.method465(arg1, 105);
        if (super.field5854.field991) {
            int[] var4 = this.method2376(94, 0, arg1);
            for (int var5 = 0; var5 < class164.field2152; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field4156 <= var6 && this.field4161 >= var6 ? 4096 : 0;
            }
        }
        if (arg0 != -780833076) {
            this.field4161 = 120;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(III)V")
    public static final void method1760(int arg0, int arg1, int arg2) {
        ++field4163;
        class338 var3 = class380.method2294((byte) 116, arg2, 13);
        var3.method2052((byte) 71);
        int var4 = 103 % ((arg1 - 50) / 46);
        var3.field4930 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg1 != 80) {
            method1759(false);
        }
        ++field4164;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field4161 = arg2.method993((byte) -104);
            }
        } else {
            this.field4156 = arg2.method993((byte) -74);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class291() {
        super(1, true);
    }
}
