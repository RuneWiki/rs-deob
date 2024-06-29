import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class257 extends class259 {

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "Z")
    public boolean field4633 = true;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "Lcc;")
    public static class209 field4641 = class95.method669(106, "zap");

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "Lcc;")
    public static class209 field4645 = class95.method669(127, ":assist:");

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "[I")
    public static int[] field4649 = new int[128];

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lcc;")
    public static class209 field4658 = class95.method669(100, "rect_debug=");

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "Ljb;")
    public static class269 field4632;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "Lsj;")
    public static class49 field4647;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "Lsj;")
    public static class49 field4653;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "Lclient;")
    public static client field4637;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "[I")
    private int[] field4635;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "[I")
    public int[] field4650;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "[Lcc;")
    private class209[] field4642;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "[[I")
    private int[][] field4648;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
    public final void method1772(byte arg0) {
        field4643++;
        if (this.field4650 != null) {
            for (int var2 = 0; var2 < this.field4650.length; var2++) {
                this.field4650[var2] = class6.method63(this.field4650[var2], 32768);
            }
        }
        if (arg0 != -125) {
            this.field4648 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "(I)V")
    public static final void method1773(int arg0) {
        field4631++;
        if (class223.field4073 == null || class209.field3785 == null) {
            class223.field4073 = new int[256];
            class209.field3785 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class223.field4073[var1] = (int) (Math.sin(var2) * 4096.0D);
                class209.field3785[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 0) {
            method1774(96, (class106) null);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILtf;)Lnf;")
    public static final class157 method1774(int arg0, class106 arg1) {
        if (arg0 < 87) {
            method1785(111);
        }
        arg1.method774((byte) 90);
        field4644++;
        int var2 = arg1.method774((byte) 103);
        class157 var3 = class85.method607(var2, 46);
        var3.field2870 = arg1.method774((byte) 89);
        int var4 = arg1.method774((byte) 125);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method774((byte) 123);
            var3.method1(var6, (byte) -123, arg1);
        }
        var3.method3((byte) -115);
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ltf;B)Lcc;")
    public final class209 method1775(class106 arg0, byte arg1) {
        field4638++;
        class209 var3 = class79.method554(arg1 ^ 0x75C6, 80);
        if (this.field4635 != null) {
            for (int var4 = 0; var4 < this.field4635.length; var4++) {
                var3.method1445(this.field4642[var4], (byte) -76);
                var3.method1445(class260.method1802(this.field4648[var4], arg0.method747(class175.field3187[this.field4635[var4]], false), this.field4635[var4], (byte) 119), (byte) -76);
            }
        }
        var3.method1445(this.field4642[this.field4642.length - 1], (byte) -76);
        if (arg1 != -9) {
            this.method1772((byte) 64);
        }
        return var3.method1460((byte) 104);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
    public static final void method1776(byte arg0) {
        field4646++;
        class76.method535((byte) 41, false);
        class185.field3333 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class10.field202.length; var2++) {
            if (class18.field370[var2] != -1 && class10.field202[var2] == null) {
                class10.field202[var2] = class149.field2729.method353(0, -124, class18.field370[var2]);
                if (class10.field202[var2] == null) {
                    class185.field3333++;
                    var1 = false;
                }
            }
            if (class134.field2540[var2] != -1 && class247.field4475[var2] == null) {
                class247.field4475[var2] = class149.field2729.method370(class158.field2886[var2], 0, (byte) -122, class134.field2540[var2]);
                if (class247.field4475[var2] == null) {
                    class185.field3333++;
                    var1 = false;
                }
            }
            if (class169.field3077 != null && class111.field2246[var2] == null && class169.field3077[var2] != -1) {
                class111.field2246[var2] = class149.field2729.method370(class158.field2886[var2], 0, (byte) -113, class169.field3077[var2]);
                if (class111.field2246[var2] == null) {
                    var1 = false;
                    class185.field3333++;
                }
            }
        }
        if (class126.field2433 == null) {
            if (class158.field2884 == null || !class174.field3175.method376((byte) -17, class229.method1604(new class209[] { class158.field2884.field4994, class80.field1500 }, (byte) 67))) {
                class126.field2433 = new class168(0);
            } else if (class174.field3175.method373(class229.method1604(new class209[] { class158.field2884.field4994, class80.field1500 }, (byte) 47), 88)) {
                class126.field2433 = class284.method1914((byte) -49, class174.field3175, class229.method1604(new class209[] { class158.field2884.field4994, class80.field1500 }, (byte) 112));
            } else {
                class185.field3333++;
                var1 = false;
            }
        }
        if (!var1) {
            class261.field4700 = 1;
            return;
        }
        class137.field2576 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class10.field202.length; var4++) {
            byte[] var20 = class247.field4475[var4];
            if (var20 != null) {
                int var21 = (class47.field913[var4] >> 8) * 64 - class174.field3178;
                int var22 = (class47.field913[var4] & 0xFF) * 64 - class245.field4444;
                if (class254.field4574) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class18.method171(var21, var20, 0, var22);
            }
        }
        if (!var3) {
            class261.field4700 = 2;
            return;
        }
        if (class261.field4700 != 0) {
            class164.method1133(true, (byte) 117, class229.method1604(new class209[] { class198.field3544, class288.field5091 }, (byte) 28));
        }
        class117.method831(-413981948);
        boolean var5 = false;
        class25.method209(1);
        class30.method246(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class122.field2404[var6].method1170((byte) -127);
        }
        if (arg0 < 124) {
            field4632 = null;
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class285.field5023[var7][var18][var19] = 0;
                }
            }
        }
        class87.method624(false, -113);
        class117.method831(-413981948);
        System.gc();
        class76.method535((byte) 41, true);
        class223.method1572(false, 92);
        if (!class254.field4574) {
            class23.method195(false, false);
            class76.method535((byte) 41, true);
            class80.method562((byte) 125, false);
            if (class111.field2246 != null) {
                class56.method442(-126);
            }
        }
        if (class254.field4574) {
            class228.method1599(false, 75);
            class76.method535((byte) 41, true);
            class44.method334(31254, false);
        }
        class25.method209(1);
        class76.method535((byte) 41, true);
        class239.method1657(false, 104, class122.field2404);
        class76.method535((byte) 41, true);
        int var8 = class84.field1669;
        if (var8 > class99.field1937) {
            var8 = class99.field1937;
        }
        if (class99.field1937 - 1 > var8) {
            int var9 = class99.field1937 - 1;
        }
        if (class186.method1273(-61)) {
            class259.method1798(0);
        } else {
            class259.method1798(class84.field1669);
        }
        class244.method1696(91);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class18.method175(var17, (byte) -119, var10);
            }
        }
        class230.method1609(-6099);
        class117.method831(-413981948);
        class36.method275((byte) -125);
        class25.method209(1);
        if (class230.field4176 != null && class193.field3488 != null && class284.field5008 == 25) {
            class84.field1677.method287((byte) 127, 45);
            class255.field4599++;
            class84.field1677.method758(1057001181, 1469334200);
        }
        if (!class254.field4574) {
            int var11 = (class220.field4005 + 6) / 8;
            int var12 = (class31.field568 - 6) / 8;
            int var13 = (class220.field4005 - 6) / 8;
            int var14 = (class31.field568 + 6) / 8;
            for (int var15 = var13 - 1; var15 <= var11 + 1; var15++) {
                for (int var16 = var12 - 1; var16 <= (var14 + 1); var16++) {
                    if (var13 > var15 || var15 > var11 || var16 < var12 || var16 > var14) {
                        class149.field2729.method377(class229.method1604(new class209[] { class150.field2742, class66.method485(var15, (byte) 69), class237.field4267, class66.method485(var16, (byte) 41) }, (byte) 117), true);
                        class149.field2729.method377(class229.method1604(new class209[] { class251.field4522, class66.method485(var15, (byte) 24), class237.field4267, class66.method485(var16, (byte) 30) }, (byte) 50), true);
                    }
                }
            }
        }
        if (class284.field5008 == 28) {
            class155.method1088(10, -3280);
        } else {
            class155.method1088(30, -3280);
            if (class193.field3488 != null) {
                class84.field1677.method287((byte) 126, 8);
            }
        }
        class144.method1008(0);
        class117.method831(-413981948);
        class173.method1191((byte) 78);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLtf;I)V")
    private final void method1777(byte arg0, class106 arg1, int arg2) {
        field4654++;
        if (arg0 != 93) {
            this.field4633 = false;
        }
        if (arg2 == 1) {
            this.field4642 = arg1.method755(1).method1449((byte) -72, 60);
        } else if (arg2 == 2) {
            int var4 = arg1.method774((byte) 75);
            this.field4650 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4650[var5] = arg1.method736(126);
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method774((byte) 107);
            this.field4635 = new int[var6];
            this.field4648 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method736(124);
                this.field4635[var7] = var8;
                this.field4648[var7] = new int[class222.field4057[var8]];
                for (int var9 = 0; var9 < class222.field4057[var8]; var9++) {
                    this.field4648[var7][var9] = arg1.method736(123);
                }
            }
        } else if (arg2 == 4) {
            this.field4633 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([ILtf;I)V")
    public final void method1778(int[] arg0, class106 arg1, int arg2) {
        field4636++;
        if (this.field4635 == null) {
            return;
        }
        if (arg2 < 11) {
            field4653 = null;
        }
        for (int var4 = 0; var4 < this.field4635.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = class164.field2973[this.method1780(false, var4)];
            if (var5 > 0) {
                arg1.method762(0, var5, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZII)V")
    public static final void method1779(byte arg0, int arg1, boolean arg2, int arg3, int arg4) {
        boolean var5 = false;
        class136.field2555 = 0L;
        int var6 = class258.method1788(-128);
        if (arg1 <= 0 == var6 > 0) {
            var5 = true;
        }
        field4639++;
        if (arg1 == 3 || var6 == 3) {
            arg2 = true;
        }
        if (class143.field2639.startsWith("mac") && arg1 > 0) {
            arg2 = true;
        }
        if (arg0 != -65) {
            field4641 = null;
        }
        if (arg2 && arg1 > 0) {
            var5 = true;
        }
        class168.method1155(arg4, arg1, (byte) 55, var5, arg2, arg3, var6);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)I")
    public final int method1780(boolean arg0, int arg1) {
        field4652++;
        if (arg0) {
            this.method1783(false);
        }
        return this.field4635 == null || arg1 < 0 || this.field4635.length < arg1 ? -1 : this.field4635[arg1];
    }

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)Lcc;")
    public final class209 method1781(int arg0) {
        if (arg0 > -99) {
            field4658 = null;
        }
        class209 var2 = class79.method554(-30159, 80);
        field4656++;
        if (this.field4642 == null) {
            return class8.field160;
        }
        var2.method1445(this.field4642[0], (byte) -76);
        for (int var3 = 1; var3 < this.field4642.length; var3++) {
            var2.method1445(class243.field4408, (byte) -76);
            var2.method1445(this.field4642[var3], (byte) -76);
        }
        return var2.method1460((byte) 104);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)I")
    public final int method1782(int arg0, int arg1, int arg2) {
        if (arg1 != -26923) {
            method1773(-35);
        }
        field4657++;
        if (this.field4635 == null || arg2 < 0 || this.field4635.length < arg2) {
            return -1;
        } else if (this.field4648[arg2] == null || arg0 < 0 || arg0 > this.field4648[arg2].length) {
            return -1;
        } else {
            return this.field4648[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)I")
    public final int method1783(boolean arg0) {
        field4640++;
        if (arg0) {
            this.field4633 = false;
        }
        return this.field4635 == null ? 0 : this.field4635.length;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ltf;Z)V")
    public final void method1784(class106 arg0, boolean arg1) {
        if (!arg1) {
            method1787(-70, 55, 29, 102);
        }
        while (true) {
            int var3 = arg0.method774((byte) 73);
            if (var3 == 0) {
                field4655++;
                return;
            }
            this.method1777((byte) 93, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "(I)V")
    public static void method1785(int arg0) {
        field4645 = null;
        field4649 = null;
        field4653 = null;
        if (arg0 != -6) {
            return;
        }
        field4647 = null;
        field4637 = null;
        field4632 = null;
        field4658 = null;
        field4641 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILsj;)[Lal;")
    public static final class231[] method1786(int arg0, int arg1, int arg2, class49 arg3) {
        field4651++;
        if (class117.method833(arg0, arg3, 896, arg2)) {
            if (arg1 != 10) {
                field4645 = null;
            }
            return client.method1073(-27);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)I")
    public static final int method1787(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 28) {
            field4659 = -128;
        }
        field4634++;
        if (arg0 <= arg1) {
            return arg3 < arg1 ? arg3 : arg1;
        } else {
            return arg0;
        }
    }
}
