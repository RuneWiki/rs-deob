import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class21 extends class182 {

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
    public static int field546 = 1;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "Ljava/lang/String;")
    public static String field547 = "Examine";

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "Lgg;")
    public static class82 field541 = new class82(0, 0);

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "Lek;")
    public static class206 field544;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "Lne;")
    public static class262 field549;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "[I")
    public static int[] field539;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "[[B")
    public static byte[][] field540;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIB)V", line = 4)
    public static final void method187(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -55) {
            return;
        }
        field551++;
        if (arg3 > arg0) {
            for (int var5 = arg0; var5 < arg3; var5++) {
                class232.field3799[var5][arg1] = arg2;
            }
        } else {
            for (int var6 = arg3; var6 < arg0; var6++) {
                class232.field3799[var6][arg1] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V", line = 39)
    public class21() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)V", line = 53)
    public static void method188(int arg0) {
        if (arg0 != 2) {
            field539 = (int[]) null;
        }
        field540 = (byte[][]) null;
        field544 = null;
        field539 = null;
        field549 = null;
        field547 = null;
        field541 = null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)[I", line = 72)
    public final int[] method125(int arg0, int arg1) {
        int[] var3 = this.field3166.method775(arg1, 125);
        if (arg0 != 2) {
            this.method125(72, 66);
        }
        if (this.field3166.field1903) {
            int var4 = class248.field4066[arg1];
            for (int var5 = 0; var5 < class26.field672; var5++) {
                var3[var5] = this.method191(field539[var5], var4, arg0 + 124) % 4096;
            }
        }
        field548++;
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BIII)I", line = 106)
    public static final int method189(byte arg0, int arg1, int arg2, int arg3) {
        field550++;
        if (class144.field2427 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        int var6 = 122 % ((arg0 + 4) / 43);
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var7 = arg3;
        int var8 = arg1 & 0x7F;
        int var9 = arg2 & 0x7F;
        if (arg3 < 3 && (class282.field4615[1][var4][var5] & 0x2) == 2) {
            var7 = arg3 + 1;
        }
        int var10 = (128 - var9) * class144.field2427[var7][var4][var5] + class144.field2427[var7][var4 + 1][var5] * var9 >> 7;
        int var11 = (128 - var9) * class144.field2427[var7][var4][var5 + 1] + class144.field2427[var7][var4 + 1][var5 + 1] * var9 >> 7;
        return (128 - var8) * var10 + (var8 * var11) >> 7;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V", line = 141)
    public static final void method190(byte arg0) {
        Container var1;
        if (class202.field3384 != null) {
            var1 = class202.field3384;
        } else if (class274.field4469 == null) {
            var1 = class59.field1164.field2658;
        } else {
            var1 = class274.field4469;
        }
        class276.field4505 = var1.getSize().width;
        class332.field5302 = var1.getSize().height;
        if (class274.field4469 == var1) {
            Insets var2 = class274.field4469.getInsets();
            class332.field5302 -= var2.top + var2.bottom;
            class276.field4505 -= var2.right + var2.left;
        }
        if (arg0 != -59) {
            field540 = (byte[][]) ((byte[][]) null);
        }
        if (class292.method2078(16) >= 2) {
            class355.field5659 = 0;
            class332.field5298 = 0;
            class287.field4696 = class332.field5302;
            class133.field2287 = class276.field4505;
        } else {
            class133.field2287 = 765;
            class287.field4696 = 503;
            class332.field5298 = (class276.field4505 - 765) / 2;
            class355.field5659 = 0;
        }
        if (class241.field4016) {
            class241.method1708(class133.field2287, class287.field4696);
        }
        class209.field3489.setSize(class133.field2287, class287.field4696);
        if (class274.field4469 == var1) {
            Insets var3 = class274.field4469.getInsets();
            class209.field3489.setLocation(var3.left + class332.field5298, var3.top - -class355.field5659);
        } else {
            class209.field3489.setLocation(class332.field5298, class355.field5659);
        }
        field542++;
        if (class88.field1566 != -1) {
            class316.method2278(true, 0);
        }
        class114.method847((byte) -103);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)I", line = 206)
    private final int method191(int arg0, int arg1, int arg2) {
        int var4 = 126 % ((70 - arg2) / 50);
        field545++;
        int var5 = arg1 * 57 + arg0;
        int var6 = var5 ^ var5 << 1;
        return 4096 - (((var6 * 15731 * var6 + 789221) * var6 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }
}
