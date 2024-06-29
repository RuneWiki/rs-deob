import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class56 {

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lha;")
    public static class46 field934 = class271.method1828("Mem:", -46);

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Lha;")
    private static class46 field938 = class271.method1828(" ", -46);

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Z")
    public static boolean field942 = false;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Lha;")
    public static class46 field945 = field938;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field940 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Lha;")
    public static class46 field948 = class271.method1828("details", -46);

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Lpi;")
    public static class181 field947;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[I")
    public static int[] field939;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field937++;
        if (arg1 == arg9 && arg2 == arg7 && arg5 == arg6 && arg0 == arg8) {
            class32.method210(arg8, arg4, false, arg6, arg1, arg7);
        } else {
            int var10 = arg7;
            int var11 = arg1;
            int var12 = arg7 * 3;
            int var13 = arg1 * 3;
            int var14 = arg0 * 3;
            int var15 = arg9 * 3;
            int var16 = arg2 * 3;
            int var17 = arg5 * 3;
            int var18 = arg6 + var15 - var17 - arg1;
            int var19 = arg8 + var16 - (var14 + arg7);
            int var20 = var14 + var12 - var16 - var16;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var15 - var13;
            int var23 = var16 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var22 * var24;
                int var30 = var21 * var25;
                int var31 = var20 * var25;
                int var32 = var23 * var24;
                int var33 = (var29 + var30 + var28 >> 12) + arg1;
                int var34 = (var27 + var31 + var32 >> 12) + arg7;
                class32.method210(var34, arg4, false, var33, var11, var10);
                var11 = var33;
                var10 = var34;
            }
        }
        if (arg3 >= -26) {
            field940 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
    public static final void method388(int arg0, int arg1) {
        field946++;
        class129.field2361.method81((byte) 30, arg1);
        if (arg0 == -21800) {
            class152.field2698.method81((byte) 30, arg1);
            class142.field2589.method81((byte) 30, arg1);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method389(byte arg0) {
        field934 = null;
        field948 = null;
        field940 = null;
        field945 = null;
        field938 = null;
        if (arg0 != 57) {
            method392(-7, 86, 119, 109, -120, 6, (class24) null);
        }
        field939 = null;
        field947 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static final void method390(int arg0) {
        field936++;
        while (class147.field2651.method294((byte) 126, class219.field3861) >= 11) {
            int var1 = class147.field2651.method283((byte) 0, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class1.field6[var1] == null) {
                class1.field6[var1] = new class81();
                if (class151.field2696[var1] != null) {
                    class1.field6[var1].method647(class151.field2696[var1], 13120);
                }
                var2 = true;
            }
            class129.field2373[class156.field2783++] = var1;
            class81 var3 = class1.field6[var1];
            var3.field2557 = class157.field2803;
            int var4 = class147.field2651.method283((byte) 0, 1);
            int var5 = class147.field2651.method283((byte) 0, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class147.field2651.method283((byte) 0, 5);
            int var7 = class147.field2651.method283((byte) 0, 1);
            if (var7 == 1) {
                class93.field1758[class111.field2082++] = var1;
            }
            int var8 = class105.field1893[class147.field2651.method283((byte) 0, 3)];
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var2) {
                var3.field2526 = var3.field2535 = var8;
            }
            var3.method643(var4 == 1, class277.field4824.field2523[0] + var6, 27512, class277.field4824.field2517[0] + var5);
        }
        if (arg0 != 1) {
            field940 = null;
        }
        class147.field2651.method289(-95);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
    public static final void method391(int arg0, int arg1) {
        class146.field2644 = -1;
        if (arg0 == 37) {
            class83.field1602 = 3.0F;
        } else if (arg0 == 50) {
            class83.field1602 = 4.0F;
        } else if (arg0 == 75) {
            class83.field1602 = 6.0F;
        } else {
            class83.field1602 = 8.0F;
        }
        class146.field2644 = -1;
        field941++;
        if (arg1 != -20498) {
            field940 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class56() {
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIILhi;)V")
    public static final void method392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class24 arg6) {
        int var7 = arg0 * arg0 + arg4 * arg4;
        field933++;
        if (var7 > 360000) {
            return;
        }
        if (arg1 != 29210) {
            field934 = null;
        }
        int var8 = Math.min(arg6.field468 / 2, arg6.field341 / 2);
        if (var7 <= var8 * var8) {
            class242.method1663(arg0, arg5, class271.field4732[arg2], 17609, arg3, arg4, arg6);
            return;
        }
        var8 -= 10;
        int var9 = class249.field4414 + class3.field57 & 0x7FF;
        int var10 = class62.field1042[var9];
        int var11 = var10 * 256 / (class230.field4003 + 256);
        int var12 = class62.field1049[var9];
        int var13 = var12 * 256 / (class230.field4003 + 256);
        int var14 = arg0 * var13 - (arg4 * var11) >> 16;
        int var15 = arg0 * var11 + arg4 * var13 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class21) class46.field754[arg2]).method123(arg6.field468 / 2 + arg5 + var18 - 10, arg6.field341 / 2 + -var19 + arg3 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lci;)V")
    public class56(class56 arg0) {
        this.field935 = arg0.field935;
        this.field944 = arg0.field944;
        this.field943 = arg0.field943;
        this.field932 = arg0.field932;
    }
}
