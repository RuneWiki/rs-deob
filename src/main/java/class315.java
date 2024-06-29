import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class315 {

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4643 = -1;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field4647 = 0;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Luk;")
    public static class105 field4641 = new class105();

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field4648 = 0;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lfh;")
    public static class140 field4642;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 5)
    public static void method2180(int arg0) {
        field4642 = null;
        if (arg0 == 11170) {
            field4641 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZIIII)V", line = 17)
    public static final void method2181(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class346.method2404(arg3, (byte) -14);
        field4646++;
        int var7 = 0;
        int var8 = -arg3;
        int var9 = arg3 - arg0;
        int var10 = arg3;
        int var11 = -1;
        int var12 = -1;
        int[] var13 = class331.field4902[arg6];
        if (var9 < 0) {
            var9 = 0;
        }
        int var14 = var9;
        int var15 = arg5 - var9;
        if (!arg2) {
            field4648 = -62;
        }
        class96.method697((byte) 115, var13, arg1, arg5 - arg3, var15);
        int var16 = arg5 + var9;
        int var17 = -var9;
        class96.method697((byte) 115, var13, arg4, var15, var16);
        class96.method697((byte) 115, var13, arg1, var16, arg3 + arg5);
        while (var10 > var7) {
            var12 += 2;
            var8 += var12;
            var11 += 2;
            var17 += var11;
            if (var17 >= 0 && var14 >= 1) {
                class317.field4680[var14] = var7;
                var14--;
                var17 -= var14 << 1;
            }
            var7++;
            if (var8 >= 0) {
                var10--;
                if (var10 >= var9) {
                    int[] var18 = class331.field4902[arg6 + var10];
                    int var19 = arg5 + var7;
                    int[] var20 = class331.field4902[arg6 - var10];
                    int var21 = arg5 - var7;
                    class96.method697((byte) 115, var18, arg1, var21, var19);
                    class96.method697((byte) 115, var20, arg1, var21, var19);
                } else {
                    int[] var22 = class331.field4902[arg6 + var10];
                    int var23 = class317.field4680[var10];
                    int[] var24 = class331.field4902[arg6 - var10];
                    int var25 = arg5 + var7;
                    int var26 = arg5 - var23;
                    int var27 = arg5 + var23;
                    int var28 = arg5 - var7;
                    class96.method697((byte) 115, var22, arg1, var28, var26);
                    class96.method697((byte) 115, var22, arg4, var26, var27);
                    class96.method697((byte) 115, var22, arg1, var27, var25);
                    class96.method697((byte) 115, var24, arg1, var28, var26);
                    class96.method697((byte) 115, var24, arg4, var26, var27);
                    class96.method697((byte) 115, var24, arg1, var27, var25);
                }
                var8 -= var10 << 1;
            }
            int[] var29 = class331.field4902[arg6 + var7];
            int[] var30 = class331.field4902[arg6 - var7];
            int var31 = arg5 + var10;
            int var32 = arg5 - var10;
            if (var9 <= var7) {
                class96.method697((byte) 115, var29, arg1, var32, var31);
                class96.method697((byte) 115, var30, arg1, var32, var31);
            } else {
                int var33 = var7 > var14 ? class317.field4680[var7] : var14;
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class96.method697((byte) 115, var29, arg1, var32, var35);
                class96.method697((byte) 115, var29, arg4, var35, var34);
                class96.method697((byte) 115, var29, arg1, var34, var31);
                class96.method697((byte) 115, var30, arg1, var32, var35);
                class96.method697((byte) 115, var30, arg4, var35, var34);
                class96.method697((byte) 115, var30, arg1, var34, var31);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Ljo;", line = 150)
    public static final class199 method2182(int arg0, int arg1) {
        field4644++;
        if (arg1 == 0) {
            return new class114();
        } else if (arg1 == 1) {
            return new class251();
        } else if (arg1 == 2) {
            return new class296();
        } else if (arg1 == 3) {
            return new class95();
        } else if (arg1 == 4) {
            return new class185();
        } else if (arg1 == 5) {
            return new class300();
        } else if (arg1 == 6) {
            return new class33();
        } else if (arg1 == 7) {
            return new class131();
        } else if (arg1 == 8) {
            return new class235();
        } else if (arg1 == 9) {
            return new class130();
        } else if (arg1 == 10) {
            return new class184();
        } else if (arg1 == 11) {
            return new class335();
        } else if (arg1 == 12) {
            return new class225();
        } else if (arg1 == 13) {
            return new class167();
        } else if (arg1 == 14) {
            return new class237();
        } else if (arg1 == 15) {
            return new class30();
        } else if (arg1 == 16) {
            return new class194();
        } else if (arg1 == 17) {
            return new class262();
        } else if (arg1 == 18) {
            return new class190();
        } else if (arg1 == 19) {
            return new class186();
        } else if (arg1 == 20) {
            return new class297();
        } else if (arg1 == 21) {
            return new class343();
        } else if (arg1 == 22) {
            return new class218();
        } else if (arg1 == 23) {
            return new class305();
        } else if (arg1 == 24) {
            return new class210();
        } else if (arg1 == 25) {
            return new class224();
        } else if (arg1 == 26) {
            return new class330();
        } else if (arg1 == 27) {
            return new class191();
        } else if (arg1 == 28) {
            return new class90();
        } else if (arg1 == 29) {
            return new class268();
        } else if (arg1 == 30) {
            return new class328();
        } else if (arg1 == 31) {
            return new class67();
        } else if (arg1 == 32) {
            return new class192();
        } else if (arg1 == 33) {
            return new class118();
        } else if (arg1 == 34) {
            return new class214();
        } else if (arg1 == 35) {
            return new class270();
        } else if (arg1 == 36) {
            return new class198();
        } else if (arg1 == 37) {
            return new class116();
        } else if (arg1 == 38) {
            return new class272();
        } else if (arg1 == 39) {
            return new class302();
        } else if (arg0 == 9) {
            return null;
        } else {
            return (class199) null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 473)
    public static final void method2183(int arg0) {
        if (arg0 >= -95) {
            method2181(103, 21, true, 60, 24, -11, 8);
        }
        class341.field5323.method2258((byte) 86);
        field4645++;
        class82.field1044.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1826(Component arg0, byte arg1);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I")
    public abstract int method1825(byte arg0);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method1827(Component arg0, boolean arg1);
}
