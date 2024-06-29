import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class91 {

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Z")
    public boolean field1609 = true;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public int field1617;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1602 = 0;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Z")
    public static boolean field1608 = false;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lmb;")
    private static class132 field1613 = class166.method1092("Please check your message)2centre for details)3", 120);

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1614 = 0;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "[Z")
    public static boolean[] field1615 = new boolean[5];

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lmb;")
    public static class132 field1607 = class166.method1092(" loggt sich aus)3", 126);

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "B")
    public static byte field1606 = 0;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "Lmb;")
    public static class132 field1618 = field1613;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lii;")
    public static class96 field1612;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lpb;BI)Lbf;")
    public static final class18 method564(class165 arg0, byte arg1, int arg2) {
        field1621++;
        if (class43.method293(arg2, arg0, arg1 ^ 0xFFFFADD5)) {
            if (arg1 != 42) {
                method564(null, (byte) -71, -81);
            }
            return class159.method1033((byte) 91);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILmb;Lmb;ILmb;)V")
    public static final void method565(int arg0, class132 arg1, class132 arg2, int arg3, class132 arg4) {
        class42.method292(arg0, arg4, arg3, 0, arg1, arg2);
        field1622++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIZ)Lmb;")
    public static final class132 method566(byte arg0, int arg1, boolean arg2) {
        field1604++;
        if (arg0 <= 1) {
            method565(34, null, null, -97, null);
        }
        return class139.method941(10, arg2, 4, arg1);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Lvi;")
    public static final class233 method567(int arg0) {
        field1611++;
        int var1 = class94.field1657[0] * class153.field2793[0];
        byte[] var2 = class10.field109[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class118.field2244[class75.method450(255, var2[var4])];
        }
        class18 var5 = new class18(class153.field2792, class140.field2619, class23.field321[0], class30.field462[0], class94.field1657[0], class153.field2793[arg0], var3);
        class187.method1193(1);
        return var5;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method568(int arg0) {
        field1618 = null;
        if (arg0 != -18784) {
            field1614 = 100;
        }
        field1613 = null;
        field1612 = null;
        field1615 = null;
        field1607 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBIIIILkd;)V")
    public static final void method569(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, class112 arg7) {
        if (arg1 >= 0 && arg1 < 104 && arg5 >= 0 && arg5 < 104) {
            class148.field2722[arg6][arg1][arg5] = 0;
            while (true) {
                int var8 = arg7.method716(arg2 ^ 0x515);
                if (var8 == 0) {
                    if (arg6 == 0) {
                        class190.field3531[0][arg1][arg5] = -class112.method758(arg1 + arg3 + 932731, 556238 - -arg5 + arg4, -1462084056) * 8;
                    } else {
                        class190.field3531[arg6][arg1][arg5] = class190.field3531[arg6 - 1][arg1][arg5] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg7.method716(-1308);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg6 == 0) {
                        class190.field3531[0][arg1][arg5] = -var9 * 8;
                    } else {
                        class190.field3531[arg6][arg1][arg5] = class190.field3531[arg6 - 1][arg1][arg5] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class222.field4035[arg6][arg1][arg5] = arg7.method734(true);
                    class56.field955[arg6][arg1][arg5] = (byte) ((var8 - 2) / 4);
                    class12.field163[arg6][arg1][arg5] = (byte) class75.method450(var8 + arg0 - 2, 3);
                } else if (var8 <= 81) {
                    class148.field2722[arg6][arg1][arg5] = (byte) (var8 - 49);
                } else {
                    class165.field3020[arg6][arg1][arg5] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg7.method716(-1308);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg7.method716(-1308);
                    break;
                }
                if (var10 <= 49) {
                    arg7.method716(-1308);
                }
            }
        }
        field1610++;
        if (arg2 != -15) {
            field1613 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1601 = arg4;
        this.field1609 = arg6;
        this.field1617 = arg0;
        this.field1619 = arg3;
        this.field1620 = arg1;
        this.field1600 = arg5;
        this.field1616 = arg2;
    }
}
