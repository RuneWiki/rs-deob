import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class264 extends class313 {

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    private int field4267 = 4096;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field4270 = new String[100];

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "B")
    public static byte field4265;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILpi;)V", line = 4)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg0 == 0) {
            this.field4267 = arg2.method2339((byte) -46);
        }
        field4268++;
        if (arg1 != -17848) {
            field4270 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V", line = 21)
    public static void method1818(byte arg0) {
        if (arg0 != -27) {
            method1820((byte) -108, 3, -76, -88L, false);
        }
        field4270 = null;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)V", line = 34)
    public static final void method1819(int arg0, int arg1) {
        field4264++;
        if (arg1 != 4096) {
            method1822(-98, -43, 75, 71, 32, 42, 68);
        }
        class30 var2 = class99.method857((byte) -89, arg0, 11);
        var2.method276(0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIIJZ)Ljava/lang/String;", line = 49)
    public static final String method1820(byte arg0, int arg1, int arg2, long arg3, boolean arg4) {
        if (arg0 != 32) {
            return (String) null;
        }
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var6 = '.';
            var7 = ',';
        }
        boolean var8 = false;
        if (arg2 == 2) {
            var7 = ' ';
        }
        if (arg3 < 0L) {
            arg3 = -arg3;
            var8 = true;
        }
        field4266++;
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IJZ)V", line = 128)
    public static final void method1821(int arg0, long arg1, boolean arg2) {
        field4262++;
        if (arg1 == 0L) {
            return;
        }
        if (class200.field3424 >= 100) {
            class170.method1339(0, class241.field3941, "", (byte) -98);
            return;
        }
        String var4 = class8.method48(arg1, true);
        for (int var5 = 0; var5 < class200.field3424; var5++) {
            if (class20.field305[var5] == arg1) {
                class170.method1339(0, var4 + class288.field4597, "", (byte) -98);
                return;
            }
        }
        int var6 = 0;
        if (arg0 != -30697) {
            return;
        }
        while (class352.field5570 > var6) {
            if (class339.field5414[var6] == arg1) {
                class170.method1339(0, class94.field1470 + var4 + class131.field2258, "", (byte) -98);
                return;
            }
            var6++;
        }
        if (var4.equals(class218.field3632.field3491)) {
            class170.method1339(0, class215.field3616, "", (byte) -98);
            return;
        }
        class291.field4659++;
        class20.field305[class200.field3424] = arg1;
        field4270[class200.field3424] = class26.method244(1, arg1);
        class322.field5121[class200.field3424++] = arg2;
        class51.field809 = class99.field1606;
        class341.field5443.method26(138, arg0 ^ 0xFFFF8810);
        class341.field5443.method2333(arg1, arg0 ^ 0x778F);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 191)
    public class264() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V", line = 198)
    public static final void method1822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class38 var7 = new class38();
        var7.field575 = arg1 / 128;
        var7.field558 = arg2 / 128;
        var7.field560 = arg3 / 128;
        var7.field551 = arg4 / 128;
        var7.field563 = arg0;
        var7.field559 = arg1;
        var7.field577 = arg2;
        var7.field570 = arg3;
        var7.field562 = arg4;
        var7.field571 = arg5;
        var7.field569 = arg6;
        class31.field447[class334.field5299++] = var7;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)[I", line = 219)
    public final int[] method111(int arg0, int arg1) {
        field4269++;
        if (arg0 != 4) {
            field4270 = (String[]) null;
        }
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int[] var4 = this.method2156(0, true, arg1 - 1 & class132.field2262);
            int[] var5 = this.method2156(0, true, arg1);
            int[] var6 = this.method2156(0, true, class132.field2262 & arg1 + 1);
            for (int var7 = 0; var7 < class133.field2269; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field4267;
                int var9 = (var5[var7 + 1 & class297.field4731] - var5[var7 - 1 & class297.field4731]) * this.field4267;
                int var10 = var8 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + var11 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
