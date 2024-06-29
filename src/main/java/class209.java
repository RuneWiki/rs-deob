import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class209 {

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Z")
    public boolean field3493 = true;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public int field3499;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public int field3486;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field3490 = 0;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "S")
    public static short field3498 = 205;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3489;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII)V", line = 6)
    public static final void method1441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class316.method2275(107, arg5);
        int var7 = 0;
        field3487++;
        int var8 = arg5 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -var8;
        int var11 = -arg5;
        int var12 = -1;
        int var13 = var8;
        if (arg0 >= -79) {
            field3490 = 26;
        }
        int var14 = -1;
        int[] var15 = class232.field3799[arg6];
        int var16 = arg4 - var8;
        int var17 = arg4 + var8;
        class344.method2417(var15, arg4 - arg5, var16, arg3, (byte) -128);
        class344.method2417(var15, var16, var17, arg2, (byte) -128);
        class344.method2417(var15, var17, arg4 + arg5, arg3, (byte) -123);
        while (var9 > var7) {
            var12 += 2;
            var11 += var12;
            var14 += 2;
            var10 += var14;
            if (var10 >= 0 && var13 >= 1) {
                class182.field3159[var13] = var7;
                var13--;
                var10 -= var13 << 1;
            }
            var7++;
            if (var11 >= 0) {
                var9--;
                var11 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class232.field3799[arg6 + var9];
                    int var19 = arg4 - var7;
                    int[] var20 = class232.field3799[arg6 - var9];
                    int var21 = arg4 + var7;
                    int var22 = class182.field3159[var9];
                    int var23 = arg4 - var22;
                    int var24 = arg4 + var22;
                    class344.method2417(var18, var19, var23, arg3, (byte) -126);
                    class344.method2417(var18, var23, var24, arg2, (byte) -121);
                    class344.method2417(var18, var24, var21, arg3, (byte) -120);
                    class344.method2417(var20, var19, var23, arg3, (byte) -118);
                    class344.method2417(var20, var23, var24, arg2, (byte) -119);
                    class344.method2417(var20, var24, var21, arg3, (byte) -122);
                } else {
                    int[] var25 = class232.field3799[arg6 + var9];
                    int var26 = arg4 + var7;
                    int var27 = arg4 - var7;
                    int[] var28 = class232.field3799[arg6 - var9];
                    class344.method2417(var25, var27, var26, arg3, (byte) -121);
                    class344.method2417(var28, var27, var26, arg3, (byte) -120);
                }
            }
            int[] var29 = class232.field3799[arg6 + var7];
            int[] var30 = class232.field3799[arg6 - var7];
            int var31 = arg4 + var9;
            int var32 = arg4 - var9;
            if (var7 < var8) {
                int var33 = var7 <= var13 ? var13 : class182.field3159[var7];
                int var34 = arg4 - var33;
                class344.method2417(var29, var32, var34, arg3, (byte) -120);
                int var35 = arg4 + var33;
                class344.method2417(var29, var34, var35, arg2, (byte) -128);
                class344.method2417(var29, var35, var31, arg3, (byte) -127);
                class344.method2417(var30, var32, var34, arg3, (byte) -120);
                class344.method2417(var30, var34, var35, arg2, (byte) -118);
                class344.method2417(var30, var35, var31, arg3, (byte) -122);
            } else {
                class344.method2417(var29, var32, var31, arg3, (byte) -125);
                class344.method2417(var30, var32, var31, arg3, (byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V", line = 140)
    public static final void method1442(int arg0, int arg1) {
        field3494++;
        if (arg1 != 0) {
            method1443(-75, -4, 9, -46, -83);
        }
        class119.field2124.method896(arg0, (byte) -66);
        class147.field2513.method896(arg0, (byte) -17);
        class192.field3251.method896(arg0, (byte) -34);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)I", line = 155)
    public static final int method1443(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3495++;
        int var5 = 65536 - class305.field4957[arg1 * 1024 / arg0] >> 1;
        return arg2 == -3685 ? ((65536 - var5) * arg3 >> 16) + (arg4 * var5 >> 16) : 6;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;CZ)[Ljava/lang/String;", line = 169)
    public static final String[] method1444(String arg0, char arg1, boolean arg2) {
        field3497++;
        int var3 = class335.method2360(arg0, arg1, (byte) -84);
        String[] var4 = new String[var3 + 1];
        if (arg2) {
            return (String[]) null;
        }
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 208)
    public static final void method1445(int arg0) {
        if (arg0 != -12767) {
            field3489 = (Canvas) null;
        }
        field3492++;
        int var1 = class213.method1469(false);
        if (var1 == 0) {
            class306.field4975 = (byte[][][]) null;
            class72.method550(0, -49);
        } else if (var1 == 1) {
            class258.method1812((byte) 0, (byte) -50);
            class72.method550(512, -49);
            if (class282.field4615 != null) {
                class170.method1211(arg0 + 12767);
            }
        } else {
            class258.method1812((byte) (class223.field3692 - 4 & 0xFF), (byte) -50);
            class72.method550(2, arg0 ^ 0x31EE);
        }
        class71.field1316 = class276.field4506;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(IIIIIIZ)V", line = 263)
    public class209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3491 = arg0;
        this.field3493 = arg6;
        this.field3499 = arg1;
        this.field3500 = arg3;
        this.field3488 = arg4;
        this.field3486 = arg2;
        this.field3496 = arg5;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V", line = 254)
    public static void method1446(int arg0) {
        if (arg0 == -1) {
            field3489 = null;
        }
    }
}
