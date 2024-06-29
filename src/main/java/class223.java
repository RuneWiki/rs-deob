import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class223 {

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lva;")
    public static class34 field3830 = new class34(5000);

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lpj;")
    public static class237 field3835 = class33.method353("Ladevorgang )2 bitte warten Sie)3", 112);

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Z")
    public static boolean field3837 = true;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lpj;")
    public static class237 field3838 = class33.method353(" )2> <col=00ffff>", 100);

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lpj;")
    private static class237 field3839 = class33.method353("scroll:", 44);

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Lpj;")
    private static class237 field3840 = class33.method353("Loaded sprites", 29);

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Lpj;")
    public static class237 field3841 = field3839;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lpj;")
    public static class237 field3836 = field3839;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lpj;")
    public static class237 field3834 = field3840;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public int field3833;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lfa;")
    public static class239 field3825;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLgk;)V")
    public static final void method1478(byte arg0, class154 arg1) {
        field3829++;
        for (int var2 = 0; var2 < class29.field595.length; var2++) {
            class29.field595[var2] = 0;
        }
        short var3 = 256;
        if (arg0 != 1) {
            method1478((byte) 118, (class154) null);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class29.field595[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class275.field4822[var15] = (class29.field595[var15 + 1] + class29.field595[var15 + 128] + class29.field595[var15 - 128] + class29.field595[var15 + -1]) / 4;
                }
            }
            int[] var13 = class29.field595;
            class29.field595 = class275.field4822;
            class275.field4822 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field2753; var7++) {
            for (int var8 = 0; var8 < arg1.field2746; var8++) {
                if (arg1.field2735[var6++] != 0) {
                    int var9 = var8 + arg1.field2736 + 16;
                    int var10 = var7 + arg1.field2737 + 16;
                    int var11 = var9 + (var10 << 7);
                    class29.field595[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    public static final void method1479(int arg0, int arg1) {
        int var2 = 16 % ((-arg0 - 58) / 33);
        field3827++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class90.method687((byte) -21);
        } else if (arg1 == 2) {
            class185.method1270(1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
    public static final void method1480(int arg0, int arg1, int arg2) {
        class108.field1925[arg0] = arg2;
        field3826++;
        class180 var3 = (class180) class28.field499.method568((long) arg0, -1);
        if (var3 == null) {
            class180 var4 = new class180(4611686018427387905L);
            class28.field499.method562(var4, (long) arg0, (byte) 56);
        } else if (var3.field3166 != 4611686018427387905L) {
            var3.field3166 = class181.method1244((byte) -96) + 500L | 0x4000000000000000L;
        }
        int var5 = -100 % ((49 - arg1) / 42);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static final void method1481(int arg0) {
        class108.field1923.method942(0);
        if (arg0 > 24) {
            field3823++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static void method1482(int arg0) {
        field3840 = null;
        field3834 = null;
        field3839 = null;
        field3835 = null;
        field3836 = null;
        field3830 = null;
        field3825 = null;
        if (arg0 != 0) {
            method1480(-49, -9, -13);
        }
        field3841 = null;
        field3838 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILie;B)V")
    private final void method1483(int arg0, class32 arg1, byte arg2) {
        field3832++;
        if (arg2 <= 77) {
            field3834 = null;
        }
        if (arg0 == 1) {
            this.field3822 = arg1.method339(-16777216);
            this.field3833 = arg1.method316((byte) 121);
            this.field3828 = arg1.method316((byte) -8);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILie;)V")
    public final void method1484(int arg0, class32 arg1) {
        field3831++;
        if (arg0 != 0) {
            this.field3822 = 73;
        }
        while (true) {
            int var3 = arg1.method316((byte) 114);
            if (var3 == 0) {
                return;
            }
            this.method1483(var3, arg1, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILie;)Lpj;")
    public static final class237 method1485(int arg0, int arg1, class32 arg2) {
        field3824++;
        try {
            class237 var3 = new class237();
            var3.field4114 = arg2.method303(-127);
            if (arg1 < var3.field4114) {
                var3.field4114 = arg1;
            }
            var3.field4151 = new byte[var3.field4114];
            arg2.field647 += class272.field4678.method681(arg2.field647, arg2.field644, var3.field4151, var3.field4114, arg0, 0);
            return var3;
        } catch (Exception var4) {
            return class162.field2886;
        }
    }
}
