import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class369 extends class270 {

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field5238 = 0;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "Z")
    public static boolean field5242 = false;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "Lcj;")
    public static class181 field5239;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "Lmb;")
    public static class258 field5235;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V")
    public static void method2347(int arg0) {
        if (arg0 < -121) {
            field5239 = null;
            field5235 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
    public class369() {
        super(0, true);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(III)I")
    private final int method2348(int arg0, int arg1, int arg2) {
        if (arg1 < 4) {
            field5235 = null;
        }
        ++field5237;
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * 15731 * var5 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lec;I)V")
    public static final void method2349(class37 arg0, int arg1) {
        ++field5241;
        if (~(arg0.field578.length + -arg0.field565) <= -2) {
            int var2 = arg0.method271((byte) 102);
            if (~var2 <= -1 && ~var2 >= -2) {
                if (arg1 != -50) {
                    field5239 = null;
                }
                if (~(arg0.field578.length + -arg0.field565) <= -3) {
                    int var3 = arg0.method320((byte) -87);
                    if (~(var3 * 6) == ~(arg0.field578.length + -arg0.field565)) {
                        while (true) {
                            int var4;
                            int var5;
                            do {
                                do {
                                    do {
                                        if (~arg0.field578.length >= ~arg0.field565) {
                                            return;
                                        }
                                        var4 = arg0.method320((byte) -87);
                                        var5 = arg0.method278(arg1 + 141);
                                    } while (class27.field401.length <= var4);
                                } while (!class102.field1590[var4]);
                            } while (~class126.method1063(var4, 19).field4824 == -50 && (var5 < -1 || ~var5 < -2));
                            class27.field401[var4] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BZZ)V")
    public static final void method2350(byte arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            ++class402.field5881;
            class446.method2792(false);
        }
        ++field5236;
        if (arg2) {
            ++class134.field2157;
            class5.method26(false);
        }
        int var3 = 40 / ((-35 - arg0) / 55);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method2351(Component arg0, int arg1) {
        arg0.removeKeyListener(class193.field2851);
        ++field5240;
        arg0.removeFocusListener(class193.field2851);
        class297.field4402 = arg1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        ++field5234;
        int[] var3 = super.field4053.method396(arg1, -91);
        if (arg0 <= 26) {
            return null;
        } else {
            if (super.field4053.field815) {
                int var4 = class364.field5185[arg1];
                for (int var5 = 0; class161.field2445 > var5; ++var5) {
                    var3[var5] = this.method2348(var4, 29, class136.field2168[var5]) % 4096;
                }
            }
            return var3;
        }
    }
}
