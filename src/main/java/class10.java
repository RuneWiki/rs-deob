import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class10 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lgd;")
    private class112 field129 = new class112();

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[I")
    public static int[] field130 = new int[256];

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Z")
    public static boolean field141 = true;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Lgd;")
    private class112 field143;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lsb;")
    public static class124 field134;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Lsb;")
    public static class124 field139;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public final void method58(byte arg0) {
        while (true) {
            class112 var2 = this.field129.field1733;
            if (this.field129 == var2) {
                field133++;
                this.field143 = null;
                int var3 = 113 % ((arg0 + 29) / 53);
                return;
            }
            var2.method827((byte) -98);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)I")
    public final int method59(byte arg0) {
        int var2 = -2 % ((26 - arg0) / 51);
        class112 var3 = this.field129.field1733;
        int var4 = 0;
        field146++;
        while (this.field129 != var3) {
            var4++;
            var3 = var3.field1733;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != -31346) {
            field138 = 71;
        }
        if (arg6 == arg8 && arg0 == arg2 && arg3 == arg4 && arg1 == arg7) {
            class192.method1317(arg0, arg1, arg3, arg9, 3, arg8);
        } else {
            int var10 = arg8;
            int var11 = arg0;
            int var12 = arg6 * 3;
            int var13 = arg0 * 3;
            int var14 = arg2 * 3;
            int var15 = arg8 * 3;
            int var16 = arg4 * 3;
            int var17 = arg7 * 3;
            int var18 = var14 + arg1 - arg0 - var17;
            int var19 = arg3 + var12 - var16 - arg8;
            int var20 = var16 + var15 - var12 - var12;
            int var21 = var17 + var13 - var14 - var14;
            int var22 = var14 - var13;
            int var23 = var12 - var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var23 * var24;
                int var30 = var20 * var25;
                int var31 = var21 * var25;
                int var32 = (var28 - (-var29 - var30) >> 12) + arg8;
                int var33 = var22 * var24;
                int var34 = (var27 - (-var31 - var33) >> 12) + arg0;
                class192.method1317(var11, var34, var32, arg9, 3, var10);
                var10 = var32;
                var11 = var34;
            }
        }
        field145++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
    public static final void method61(boolean arg0, int arg1) {
        field131++;
        if (!arg0) {
            return;
        }
        class249.method1664(false);
        class114.method852(0);
        int var2 = class136.method997(arg1, (byte) -93).field94;
        if (var2 == 0) {
            return;
        }
        int var3 = class192.field3138[arg1];
        if (var2 == 9) {
            class72.field1197 = var3;
        }
        if (var2 == 6) {
            class297.field4694 = var3;
        }
        if (var2 == 5) {
            class131.field2183 = var3;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Lgd;")
    public final class112 method62(int arg0) {
        if (arg0 != 0) {
            field141 = false;
        }
        field144++;
        class112 var2 = this.field129.field1733;
        if (this.field129 == var2) {
            this.field143 = null;
            return null;
        } else {
            this.field143 = var2.field1733;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V")
    public static final void method63() {
        for (int var0 = 0; var0 < class150.field2462; var0++) {
            class190 var1 = class195.field3194[var0];
            class76.method604(var1);
            class195.field3194[var0] = null;
        }
        class150.field2462 = 0;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)[Lfc;")
    public static final class149[] method64(byte arg0) {
        class149[] var1 = new class149[class132.field2195];
        field140++;
        if (arg0 != -75) {
            return null;
        }
        for (int var2 = 0; var2 < class132.field2195; var2++) {
            var1[var2] = new class74(class287.field4592, class20.field315, class193.field3155[var2], class197.field3224[var2], class4.field56[var2], class19.field268[var2], class66.field1082[var2], class244.field3857);
        }
        class213.method1410(0);
        return var1;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V")
    public static void method65(byte arg0) {
        field130 = null;
        field134 = null;
        if (arg0 > -42) {
            method60(96, -42, 58, -17, 53, 6, -40, 107, 11, -111);
        }
        field139 = null;
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(B)Lgd;")
    public final class112 method66(byte arg0) {
        field137++;
        class112 var2 = this.field143;
        if (this.field129 == var2) {
            this.field143 = null;
            return null;
        } else {
            int var3 = -14 / ((9 - arg0) / 53);
            this.field143 = var2.field1733;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Lgd;")
    public final class112 method67(int arg0) {
        field132++;
        class112 var2 = this.field129.field1733;
        if (this.field129 == var2) {
            return null;
        }
        if (arg0 != 10136) {
            method65((byte) 77);
        }
        var2.method827((byte) -98);
        return var2;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IJZ)V")
    public static final void method68(int arg0, long arg1, boolean arg2) {
        field142++;
        if ((long) arg0 == arg1) {
            return;
        }
        if (class286.field4554 >= 100) {
            class106.method787(class237.field3739, "", 0, true);
            return;
        }
        String var4 = class66.method506((byte) 20, arg1);
        for (int var5 = 0; var5 < class286.field4554; var5++) {
            if (class145.field2390[var5] == arg1) {
                class106.method787(var4 + class111.field1720, "", 0, true);
                return;
            }
        }
        for (int var6 = 0; var6 < class45.field820; var6++) {
            if (class159.field2570[var6] == arg1) {
                class106.method787(class256.field4074 + var4 + class5.field68, "", 0, true);
                return;
            }
        }
        if (var4.equals(class48.field878.field3445)) {
            class106.method787(client.field4582, "", 0, true);
            return;
        }
        class145.field2390[class286.field4554] = arg1;
        class224.field3570++;
        class154.field2513[class286.field4554] = class45.method392(arg1, true);
        class294.field4666[class286.field4554++] = arg2;
        class204.field3288 = class61.field1040;
        class87.field1405.method607(117, (byte) 115);
        class87.field1405.method967((byte) -8, arg1);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class10() {
        this.field129.field1733 = this.field129;
        this.field129.field1726 = this.field129;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public static final void method69(int arg0) {
        field135++;
        if (class156.field2546) {
            return;
        }
        if (arg0 != -1111) {
            field138 = -38;
        }
        if (class256.field4075) {
            class161.field2619 = (float) ((int) class161.field2619 - 17 & 0xFFFFFFF0);
        } else {
            class296.field4687 += (-class296.field4687 - 12.0F) / 2.0F;
        }
        class156.field2546 = true;
        field141 = true;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILgd;)V")
    public final void method70(int arg0, class112 arg1) {
        if (arg1.field1726 != null) {
            arg1.method827((byte) -98);
        }
        arg1.field1726 = this.field129.field1726;
        field136++;
        if (arg0 == 3) {
            arg1.field1733 = this.field129;
            arg1.field1726.field1733 = arg1;
            arg1.field1733.field1726 = arg1;
        }
    }
}
