import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2629 = 0;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lid;")
    public static class60 field2635 = class11.method72("Fps:", (byte) -82);

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "[[[Ljd;")
    public static class66[][][] field2637 = new class66[4][104][104];

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lid;")
    public static class60 field2639 = class11.method72(")1p", (byte) 91);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "La;")
    public static class1 field2640;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)Z")
    public static final boolean method882(boolean arg0, int arg1) {
        field2632++;
        if (arg0) {
            field2640 = null;
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method883(int arg0) {
        field2635 = null;
        field2639 = null;
        field2637 = null;
        if (arg0 != 5618) {
            field2629 = 10;
        }
        field2640 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2636++;
        if (class28.method209(arg6, -1)) {
            int var8 = -108 % ((arg5 - 33) / 48);
            class30.method226(arg0, arg7, arg3, 20476, class45.field1177[arg6], -1, arg1, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static final void method885(int arg0) {
        if (arg0 <= 42) {
            return;
        }
        Object var1 = class1.field3;
        synchronized (class1.field3) {
            if (class30.field708 != 0) {
                class30.field708 = 1;
                try {
                    class1.field3.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field2638++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static final void method886(byte arg0) {
        class105.field2589 = 0;
        class35.field884 = 0;
        field2633++;
        class32.method245((byte) -4);
        class116.method923((byte) -106);
        class51.method385((byte) 115);
        class45.method353(true);
        int var1 = -33 % ((-arg0 - 31) / 59);
        for (int var2 = 0; var2 < class105.field2589; var2++) {
            int var4 = class141.field3213[var2];
            if (class82.field2065 != class81.field2016[var4].field863) {
                class81.field2016[var4] = null;
            }
        }
        if (class94.field2310 != class56.field1393.field2501) {
            throw new RuntimeException("gpp1 pos:" + class56.field1393.field2501 + " psize:" + class94.field2310);
        }
        for (int var3 = 0; var3 < class44.field1170; var3++) {
            if (class81.field2016[class121.field2781[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class44.field1170);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I")
    public static final int method887(int arg0, int arg1, int arg2) {
        field2630++;
        int var3 = -70 % ((arg0 + 67) / 50);
        int var4 = arg2 + arg1 * 57;
        int var5 = var4 ^ var4 << 13;
        int var6 = Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589;
        return var6 >> 19 & 0xFF;
    }
}
