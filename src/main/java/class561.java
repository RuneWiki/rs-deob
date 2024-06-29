import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class561 extends class176 implements class620 {

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
    public static int field7777 = 0;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "Lvaa;")
    public static class399 field7774 = new class399();

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "C")
    public char field7772;

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "F")
    public static float field7776;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public int field7768;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "I")
    public int field7773;

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "I")
    public int field7778;

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "J")
    public long field7766;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)I")
    public final int method3194(int arg0) {
        if (arg0 != -18897) {
            this.field7772 = 'G';
        }
        field7771++;
        return this.field7768;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIII)V")
    public static final void method3195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class596.field8621 = arg2;
        class326.field4387 = arg1;
        field7780++;
        class264.field3687 = arg0;
        if (arg3 != -1) {
            method3196(-93, 0.914596F, -1.2551976F, 1.0719237F);
        }
        class591.field8435 = arg4;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IFFF)F")
    public static final float method3196(int arg0, float arg1, float arg2, float arg3) {
        int var4 = -110 / ((arg0 - 75) / 36);
        field7769++;
        return (arg3 - arg1) * arg2 + arg1;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)J")
    public final long method3197(int arg0) {
        field7770++;
        if (arg0 != -20944) {
            this.method3197(-104);
        }
        return this.field7766;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
    public static void method3198(byte arg0) {
        field7774 = null;
        int var1 = 69 / ((arg0 + 57) / 59);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3199(int arg0, String arg1) {
        if (arg0 > -46) {
            method3196(8, -0.5299684F, 0.5608635F, -0.26249883F);
        }
        field7781++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class366.method2198(arg1, -128);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class536.field7488; var3++) {
            String var4 = class645.field9370[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class366.method2198(var4, -127);
            if (var5 != null && var5.equals(var2)) {
                class536.field7488--;
                for (int var6 = var3; var6 < class536.field7488; var6++) {
                    class645.field9370[var6] = class645.field9370[var6 + 1];
                    class471.field6623[var6] = class471.field6623[var6 + 1];
                    class634.field9272[var6] = class634.field9272[var6 + 1];
                    class507.field7088[var6] = class507.field7088[var6 + 1];
                    class207.field2915[var6] = class207.field2915[var6 + 1];
                }
                class99.field1509++;
                class633.field9257 = class81.field1324;
                class351.method2108(class366.field4972, -10511);
                class479.field6754.method108((byte) -128, class452.method2655(121, arg1));
                class479.field6754.method74(arg1, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)I")
    public final int method3200(byte arg0) {
        if (arg0 <= 102) {
            field7774 = null;
        }
        field7775++;
        return this.field7773;
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)C")
    public final char method3201(int arg0) {
        if (arg0 == 29232) {
            field7765++;
            return this.field7772;
        } else {
            return 'w';
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZ)V")
    public static final void method3202(int arg0, int arg1, boolean arg2) {
        field7767++;
        class133 var3 = class568.method3229(arg0, (byte) -88, arg2);
        if (var3 != null && arg1 >= 27) {
            for (int var4 = 0; var4 < var3.field2115.length; var4++) {
                var3.field2115[var4] = -1;
                var3.field2116[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)I")
    public final int method3203(int arg0) {
        if (arg0 != -4253) {
            field7777 = 115;
        }
        field7779++;
        return this.field7778;
    }
}
