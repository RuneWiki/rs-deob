import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class155 extends class23 {

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field2795 = 0;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "[I")
    public static int[] field2800 = new int[1000];

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2792;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
    public static void method1019(int arg0) {
        if (arg0 <= 91) {
            field2794 = -61;
        }
        field2800 = null;
        field2792 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lvh;II)Llc;")
    public static final class143 method1020(class43 arg0, int arg1, int arg2) {
        ++field2796;
        if (!class249.method1659(arg2, client.method1514(arg0), false) && arg0.field762 == null) {
            return null;
        } else if (arg0.field812 != null && arg2 < arg0.field812.length && arg0.field812[arg2] != null && ~arg0.field812[arg2].method890(arg1 ^ 3648).method913((byte) 45) != -1) {
            return arg1 != 12757 ? null : arg0.field812[arg2];
        } else {
            return class184.field3341 ? class25.method179(0, new class143[] { class244.field4385, class274.method1806(arg2, true) }) : null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZI)I")
    private final int method1021(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 * 57 + arg2;
        ++field2802;
        if (!arg1) {
            return 60;
        } else {
            int var5 = var4 << 1 ^ var4;
            return 4096 - ((var5 * var5 * 15731 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        if (arg0 > -13) {
            method1020((class43) null, 42, -64);
        }
        ++field2801;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int var4 = class31.field495[arg1];
            for (int var5 = 0; ~class72.field1359 < ~var5; ++var5) {
                var3[var5] = this.method1021(var4, true, class3.field43[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
    public static final void method1022(int arg0) {
        class223.field4045 = new class43[class263.field4705.method32((byte) -102)][];
        if (arg0 != 789221) {
            method1019(86);
        }
        class254.field4559 = new boolean[class263.field4705.method32((byte) -34)];
        ++field2798;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class155() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII)V")
    public static final void method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2797;
        int var6 = class83.method476(true, class188.field3398, arg4, class239.field4321);
        int var7 = class83.method476(true, class188.field3398, arg3, class239.field4321);
        int var8 = class83.method476(true, class31.field481, arg2, class9.field173);
        int var9 = class83.method476(true, class31.field481, arg5, class9.field173);
        int var10 = 79 % ((36 - arg1) / 40);
        for (int var11 = var6; ~var7 <= ~var11; ++var11) {
            class289.method1927(class15.field268[var11], arg0, var8, -89, var9);
        }
    }
}
