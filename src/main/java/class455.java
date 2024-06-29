import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class455 {

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "Ltja;")
    private class288 field6410 = new class288(64);

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "Lbt;")
    private class48 field6406;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Lbt;")
    private class48 field6404;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "Llja;")
    public static class744 field6411 = new class744(73, -1);

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field6413 = -1;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "Z")
    public static boolean field6415 = false;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLqq;B)V")
    public static final void method2752(boolean arg0, class502 arg1, byte arg2) {
        class388.field4979.method1554(false, arg1);
        field6405++;
        if (arg2 < -66 && arg0) {
            class305.method1768(class257.field3050, arg1, class388.field4979, class4.field48, -32098, class709.field9956);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public static void method2753(byte arg0) {
        field6411 = null;
        int var1 = 114 / ((arg0 + 38) / 43);
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
    public static final void method2754(byte arg0) {
        field6407++;
        class213.field2515 = null;
        if (class769.field10572 && class397.method2331(3) != 1) {
            class159.method1116(0, 0, class319.method1901(3), class81.method770(-5), (byte) -100, class289.field3493 == 3 || class289.field3493 == 7);
        }
        int var1 = -118 / ((arg0 - 83) / 35);
        int var2 = 0;
        int var3 = 0;
        if (class769.field10572) {
            var2 = class793.method4373((byte) 81);
            var3 = class719.method4070((byte) 105);
        }
        class368.method2149(var2 + class701.field9880, var3, -1, var2, var2, -1, class705.field9921 + var3, class131.field1615, var3);
        if (class213.field2515 != null) {
            class413.method2461(class395.field5122.field8436, true, class213.field2515, var2 + class701.field9880, class705.field9921 + var3, class272.field3205, var2, -1412584499, true, var3, class75.field1038);
            class213.field2515 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[IBII)V")
    public static final void method2755(int arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        field6409++;
        arg4--;
        int var6 = arg3 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg1[var7] = arg0;
            int var8 = var7 + 1;
            arg1[var8] = arg0;
            int var9 = var8 + 1;
            arg1[var9] = arg0;
            int var10 = var9 + 1;
            arg1[var10] = arg0;
            int var11 = var10 + 1;
            arg1[var11] = arg0;
            int var12 = var11 + 1;
            arg1[var12] = arg0;
            int var13 = var12 + 1;
            arg1[var13] = arg0;
            arg4 = var13 + 1;
            arg1[arg4] = arg0;
        }
        if (arg2 > 17) {
            while (arg4 < var6) {
                arg4++;
                arg1[arg4] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method2756(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6412++;
        int var8 = class155.method1103(class187.field2268, arg6, false, class461.field6480);
        int var9 = class155.method1103(class187.field2268, arg4, false, class461.field6480);
        int var10 = class155.method1103(class471.field6572, arg2, false, class223.field2604);
        int var11 = class155.method1103(class471.field6572, arg3, false, class223.field2604);
        int var12 = class155.method1103(class187.field2268, arg1 + arg6, false, class461.field6480);
        int var13 = class155.method1103(class187.field2268, arg4 - arg1, false, class461.field6480);
        for (int var14 = var8; var14 < var12; var14++) {
            method2755(arg5, class4.field49[var14], (byte) 107, var11, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            method2755(arg5, class4.field49[var15], (byte) 85, var11, var10);
        }
        int var16 = class155.method1103(class471.field6572, arg1 + arg2, false, class223.field2604);
        int var17 = class155.method1103(class471.field6572, arg3 - arg1, false, class223.field2604);
        if (arg0 != 109) {
            return;
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class4.field49[var18];
            method2755(arg5, var19, (byte) 97, var16, var10);
            method2755(arg7, var19, (byte) 50, var17, var16);
            method2755(arg5, var19, (byte) 64, var11, var17);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)Lrga;")
    public final class254 method2757(int arg0, byte arg1) {
        if (arg1 != -46) {
            method2756((byte) 110, -115, -9, -52, 82, 115, 113, -44);
        }
        field6414++;
        class254 var3 = (class254) this.field6410.method1684((long) arg0, -359);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field6406.method437(0, (byte) 94, arg0);
        } else {
            var4 = this.field6404.method437(0, (byte) 106, arg0 & 0x7FFF);
        }
        class254 var5 = new class254();
        if (var4 != null) {
            var5.method1514(new class403(var4), (byte) 29);
        }
        if (arg0 >= 32768) {
            var5.method1515(true);
        }
        this.field6410.method1686(-25638, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(ILbt;Lbt;)V")
    public class455(int arg0, class48 arg1, class48 arg2) {
        this.field6406 = arg1;
        this.field6404 = arg2;
        if (this.field6406 != null) {
            this.field6406.method431(4, 0);
        }
        if (this.field6404 != null) {
            this.field6404.method431(4, 0);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILtf;ILaa;BIILkq;)V")
    public static final void method2758(int arg0, class312 arg1, int arg2, class513 arg3, byte arg4, int arg5, int arg6, class620 arg7) {
        field6408++;
        if (arg1 == null) {
            return;
        }
        int var8;
        if (class7.field100 == 4) {
            var8 = (int) class47.field626 & 0x3FFF;
        } else {
            var8 = (int) class47.field626 + class579.field7884 & 0x3FFF;
        }
        int var9 = Math.max(arg7.field8506 / 2, arg7.field8416 / 2) + 10;
        if (arg4 != -6) {
            method2758(49, null, -123, null, (byte) 114, -127, 57, null);
        }
        int var10 = arg2 * arg2 + (arg0 * arg0);
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class789.field10868[var8];
        int var12 = class789.field10864[var8];
        if (class7.field100 != 4) {
            var12 = var12 * 256 / (class251.field2948 + 256);
            var11 = var11 * 256 / (class251.field2948 + 256);
        }
        int var13 = arg0 * var11 + arg2 * var12 >> 14;
        int var14 = arg0 * var12 - (arg2 * var11) >> 14;
        arg1.method238(arg6 + var13 - (-(arg7.field8506 / 2) + arg1.method1634() / 2), -var14 + (arg5 - (-(arg7.field8416 / 2) - -(arg1.method1636() / 2))), arg3, arg6, arg5);
    }
}
