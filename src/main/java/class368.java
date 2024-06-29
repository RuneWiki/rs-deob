import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class368 extends class338 implements class323 {

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "Lmu;")
    public class338 field4729;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field4732 = 0;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "Ltu;")
    public static class7 field4741 = new class7();

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "Lhb;")
    public static class250 field4743 = new class250(43, 8);

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "Z")
    public static boolean field4742;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "[I")
    public static int[] field4740;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
    public static final void method2150(int arg0) {
        class117.method755(class421.field5647.field7701, -23294);
        field4726++;
        int var1 = (class35.field545 >> 3) + (class299.field3885 >> 10);
        class366.field4715 = class37.field573.field6220 = 0;
        int var2 = (class336.field4299 >> 3) + (class291.field3724 >> 10);
        class37.field573.method3083(8, 8, arg0 - 13603);
        byte var3 = 18;
        class121.field1696 = new byte[var3][];
        class163.field2114 = new byte[var3][];
        class391.field5132 = new int[var3];
        class194.field2507 = new int[var3];
        class523.field7763 = new byte[var3][];
        class223.field2871 = new int[var3][4];
        class43.field625 = new int[var3];
        class235.field3062 = new int[var3];
        class511.field7530 = new byte[var3][];
        class13.field236 = new byte[var3][];
        field4740 = new int[var3];
        class104.field1432 = new int[var3];
        int var4 = arg0;
        for (int var5 = (var1 - (class200.field2594 >> 4)) / 8; var5 <= (((class200.field2594 >> 4) + var1) / 8); var5++) {
            for (int var7 = (var2 - (class118.field1647 >> 4)) / 8; var7 <= (((class118.field1647 >> 4) + var2) / 8); var7++) {
                int var8 = (var5 << 8) + var7;
                class194.field2507[var4] = var8;
                class43.field625[var4] = class354.field4551.method1297("m" + var5 + "_" + var7, -5105);
                class391.field5132[var4] = class354.field4551.method1297("l" + var5 + "_" + var7, arg0 - 5105);
                class104.field1432[var4] = class354.field4551.method1297("n" + var5 + "_" + var7, -5105);
                field4740[var4] = class354.field4551.method1297("um" + var5 + "_" + var7, -5105);
                class235.field3062[var4] = class354.field4551.method1297("ul" + var5 + "_" + var7, -5105);
                if (class104.field1432[var4] == -1) {
                    class43.field625[var4] = -1;
                    class391.field5132[var4] = -1;
                    field4740[var4] = -1;
                    class235.field3062[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class104.field1432.length; var6++) {
            class104.field1432[var6] = -1;
            class43.field625[var6] = -1;
            class391.field5132[var6] = -1;
            field4740[var6] = -1;
            class235.field3062[var6] = -1;
        }
        class414.method2437(false, (byte) 84, var1, true, var2);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public final void method418(int arg0) {
        field4728++;
        if (arg0 != -14924) {
            this.method179(113, true, 18, null);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lqa;B)V")
    public final void method421(class129 arg0, byte arg1) {
        if (arg1 >= -88) {
            field4732 = -106;
        }
        field4737++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lqa;I)V")
    public final void method416(class129 arg0, int arg1) {
        if (arg1 == 16663) {
            field4731++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
    public final int method415(int arg0) {
        if (arg0 != -15317) {
            this.field4729 = null;
        }
        field4739++;
        return 0;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)Z")
    public final boolean method177(int arg0) {
        if (arg0 != 5) {
            this.method421(null, (byte) 101);
        }
        field4724++;
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLrn;ZIILqa;I)V")
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        if (arg0 != 91) {
            this.method419(113, -87, null);
        }
        field4723++;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIILmu;)V")
    public class368(int arg0, int arg1, int arg2, class338 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field4729 = arg3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZILqa;)Z")
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        field4734++;
        return arg1;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lqa;B)Lvs;")
    public final class465 method172(class129 arg0, byte arg1) {
        field4725++;
        int var3 = -110 % ((48 - arg1) / 60);
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I")
    public final int method413(int arg0) {
        if (arg0 != -30502) {
            field4732 = -20;
        }
        field4735++;
        return 0;
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)V")
    public static void method2151(int arg0) {
        field4743 = null;
        field4740 = null;
        field4741 = null;
        if (arg0 != 24931) {
            method2152(46, (byte) 30, -109, -28, 84, -1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z")
    public final boolean method417(boolean arg0) {
        if (arg0) {
            this.method417(true);
        }
        field4730++;
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
    public final int method414(int arg0) {
        field4738++;
        return arg0 == 17350 ? 0 : -51;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public final void method173(byte arg0) {
        field4744++;
        if (arg0 != -32) {
            this.method174((byte) -25, null, false, -100, -12, null, -25);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILqa;)Lc;")
    public final class507 method419(int arg0, int arg1, class129 arg2) {
        if (arg1 == -32039) {
            field4727++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLqa;)V")
    public final void method175(byte arg0, class129 arg1) {
        if (arg0 != 91) {
            field4740 = null;
        }
        field4733++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBIIII)V")
    public static final void method2152(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class93.field1304 = arg2;
        class98.field1370 = arg4;
        class289.field3694 = arg3;
        if (arg1 > -90) {
            return;
        }
        class514.field7558 = arg0;
        field4722++;
        class93.field1307 = arg5;
        if (class93.field1304 >= 100) {
            int var6 = class93.field1307 * 128 + 64;
            int var7 = class98.field1370 * 128 + 64;
            int var8 = class366.method2145(class366.field4715, (byte) -126, var6, var7) - class514.field7558;
            int var9 = var6 - class299.field3885;
            int var10 = var8 - class53.field730;
            int var11 = var7 - class291.field3724;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class430.field5935 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class261.field3319 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class74.field927 = 0;
            if (class430.field5935 < 1024) {
                class430.field5935 = 1024;
            }
            if (class430.field5935 > 3072) {
                class430.field5935 = 3072;
            }
        }
        class396.field5271 = 2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2153(int arg0, String arg1) {
        field4736++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (((long) arg1.charAt(var5)) - var3);
        }
        int var6 = -21 / ((arg0 + 52) / 43);
        return var3;
    }
}
