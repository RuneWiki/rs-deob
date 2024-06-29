import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class153 extends class197 {

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    private int field2623 = 4096;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "Z")
    public static boolean field2617 = false;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "Lvj;")
    public static class96 field2621 = new class96(64);

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "Loh;")
    public static class258 field2629 = method1046("Fertigkeit: ", 89);

    @OriginalMember(owner = "client!df", name = "W", descriptor = "Lmb;")
    public static class172 field2627 = new class172(64);

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "[I")
    public static int[] field2630 = new int[2000];

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "Lmb;")
    public static class172 field2631 = new class172(260);

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "Z")
    public static boolean field2633 = false;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "Lsd;")
    public static class125 field2632;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "Lgb;")
    public static class213 field2628;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLoh;)I", line = 8)
    public static final int method1043(boolean arg0, class258 arg1) {
        field2619++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class312.field5292; var2++) {
            if (arg1.method1778(-11925, class306.field5198[var2])) {
                return var2;
            }
        }
        if (!arg0) {
            method1048(31);
        }
        return -1;
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(B)V", line = 41)
    public static void method1044(byte arg0) {
        field2632 = null;
        field2629 = null;
        if (arg0 != -111) {
            return;
        }
        field2630 = null;
        field2621 = null;
        field2628 = null;
        field2627 = null;
        field2631 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILva;I)V", line = 57)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2623 = arg1.method1615(arg0 ^ 0x1F52);
        }
        if (arg0 == 7955) {
            field2626++;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILed;IIII)V", line = 71)
    public static final void method1045(int arg0, int arg1, class245 arg2, int arg3, int arg4, int arg5, int arg6) {
        field2618++;
        long var7 = 0L;
        if (arg5 == 0) {
            var7 = class261.method1834(arg3, arg6, arg0);
        } else if (arg5 == 1) {
            var7 = class29.method218(arg3, arg6, arg0);
        } else if (arg5 == 2) {
            var7 = class172.method1158(arg3, arg6, arg0);
        } else if (arg5 == 3) {
            var7 = class293.method2055(arg3, arg6, arg0);
        }
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        int var12 = (int) var7 >> 14 & 0x1F;
        int var13 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        int var14 = ((int) var7 & 0x3BF2DD) >> 20;
        class101 var15 = class123.method898(-935, var13);
        if (var15.method760(-42)) {
            class13.method90(arg3, arg6, (byte) -42, arg0, var15);
        }
        if (arg4 != -5707) {
            method1043(false, (class258) null);
        }
        if (var7 == 0L) {
            return;
        }
        class123 var16 = null;
        class123 var17 = null;
        if (arg5 == 0) {
            class23 var21 = class44.method371(arg3, arg6, arg0);
            if (var21 != null) {
                var16 = var21.field291;
                var17 = var21.field289;
            }
            if (var15.field1792 != 0) {
                arg2.method1677(var14, arg0, var12, -65, arg6, var15.field1847);
            }
        } else if (arg5 == 1) {
            class263 var18 = class57.method438(arg3, arg6, arg0);
            if (var18 != null) {
                var16 = var18.field4566;
                var17 = var18.field4573;
            }
        } else if (arg5 == 2) {
            class219 var19 = class179.method1225(arg3, arg6, arg0);
            if (var19 != null) {
                var16 = var19.field3801;
            }
            if (var15.field1792 != 0 && var15.field1790 + arg6 < 104 && var15.field1790 + arg0 < 104 && var15.field1839 + arg6 < 104 && var15.field1839 + arg0 < 104) {
                arg2.method1674((byte) -124, var15.field1790, var14, var15.field1839, var15.field1847, arg0, arg6);
            }
        } else if (arg5 == 3) {
            class250 var20 = class289.method2036(arg3, arg6, arg0);
            if (var20 != null) {
                var16 = var20.field4310;
            }
            if (var15.field1792 == 1) {
                arg2.method1667(arg4 ^ 0xFFFFE990, arg6, arg0);
            }
        }
        if (!class257.field4390 || !var15.field1840) {
            return;
        }
        if (var12 == 2) {
            if ((var16 instanceof class43)) {
                ((class43) var16).method365(-1);
            } else {
                class14.method95(0, var12, var14 + 4, var15, arg0, 0, (byte) -107, arg6, arg1);
            }
            if (var17 instanceof class43) {
                ((class43) var17).method365(arg4 ^ 0x164A);
            } else {
                class14.method95(0, var12, var14 + 1 & 0x3, var15, arg0, 0, (byte) -102, arg6, arg1);
            }
        } else if (var12 == 5) {
            if (var16 instanceof class43) {
                ((class43) var16).method365(-1);
            } else {
                class14.method95(class137.field2346[var14] * 8, 4, var14, var15, arg0, class120.field2116[var14] * 8, (byte) -106, arg6, arg1);
            }
        } else if (var12 == 6) {
            if (var16 instanceof class43) {
                ((class43) var16).method365(-1);
            } else {
                class14.method95(class125.field2234[var14] * 8, 4, var14 + 4, var15, arg0, class233.field4041[var14] * 8, (byte) -122, arg6, arg1);
            }
        } else if (var12 == 7) {
            if ((var16 instanceof class43)) {
                ((class43) var16).method365(-1);
            } else {
                class14.method95(0, 4, (var14 + 2 & 0x3) + 4, var15, arg0, 0, (byte) -115, arg6, arg1);
            }
        } else if (var12 == 8) {
            if ((var16 instanceof class43)) {
                ((class43) var16).method365(arg4 ^ 0x164A);
            } else {
                class14.method95(class125.field2234[var14] * 8, 4, var14 + 4, var15, arg0, class233.field4041[var14] * 8, (byte) -128, arg6, arg1);
            }
            if (var17 instanceof class43) {
                ((class43) var17).method365(-1);
            } else {
                class14.method95(class125.field2234[var14] * 8, 4, (var14 + 2 & 0x3) + 4, var15, arg0, class233.field4041[var14] * 8, (byte) -103, arg6, arg1);
            }
        } else if (var12 == 11) {
            if (var16 instanceof class43) {
                ((class43) var16).method365(-1);
            } else {
                class14.method95(0, 10, var14 + 4, var15, arg0, 0, (byte) -117, arg6, arg1);
            }
        } else if ((var16 instanceof class43)) {
            ((class43) var16).method365(arg4 ^ 0x164A);
        } else {
            class14.method95(0, var12, var14, var15, arg0, 0, (byte) -106, arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 345)
    public class153() {
        super(1, true);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;I)Loh;", line = 282)
    public static final class258 method1046(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        field2620++;
        int var3 = var2.length;
        if (arg1 < 84) {
            field2631 = (class172) null;
        }
        class258 var4 = new class258();
        var4.field4490 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field4490[var4.field4478++] = (byte) ((var6 - 40) * 43 + (var7 - 48));
            } else if (var6 != 0) {
                var4.field4490[var4.field4478++] = (byte) var6;
            }
        }
        var4.method1787(-123);
        return var4.method1820(93);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IB)Z", line = 325)
    public static final boolean method1047(int arg0, byte arg1) {
        if (arg1 != 83) {
            return false;
        }
        field2625++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[I", line = 367)
    public final int[] method96(int arg0, int arg1) {
        int[] var3 = this.field3456.method2104(arg1, 0);
        field2622++;
        if (arg0 != -16221) {
            field2633 = true;
        }
        if (this.field3456.field5115) {
            int[] var4 = this.method1327(0, -123, class155.field2662 & arg1 - 1);
            int[] var5 = this.method1327(0, arg0 ^ 0x3F29, arg1);
            int[] var6 = this.method1327(0, -123, class155.field2662 & arg1 + 1);
            for (int var7 = 0; var7 < class190.field3362; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field2623;
                int var9 = (var5[class48.field723 & var7 + 1] - var5[var7 - 1 & class48.field723]) * this.field2623;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)I", line = 417)
    public static final int method1048(int arg0) {
        if (arg0 == Integer.MAX_VALUE) {
            field2624++;
            return 16;
        } else {
            return -24;
        }
    }
}
