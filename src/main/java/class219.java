import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class219 extends class243 {

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    private int field3680 = 0;

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
    private int field3689 = 4096;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "Lub;")
    public static class227 field3686 = null;

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "Lub;")
    public static class227 field3690 = class257.method1749("(U4", 17263);

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "Lub;")
    public static class227 field3688 = class257.method1749("hint_mapedge", 17263);

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V")
    public static void method1383(byte arg0) {
        if (arg0 != 102) {
            field3688 = null;
        }
        field3690 = null;
        field3688 = null;
        field3686 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZI)I")
    public static final int method1384(boolean arg0, boolean arg1, int arg2) {
        ++field3682;
        int var3 = 0;
        if (arg0) {
            var3 += class56.field1014 - -class56.field1013;
        }
        if (arg2 != -5132) {
            field3686 = null;
        }
        if (arg1) {
            var3 += class63.field1159 + class254.field4471;
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field3681;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field3689 = arg0.method1447(0);
            }
        } else {
            this.field3680 = arg0.method1447(0);
        }
        if (arg1) {
            this.field3689 = -55;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class219() {
        super(1, true);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([BI)V")
    public static final void method1385(byte[] arg0, int arg1) {
        ++field3687;
        class226 var2 = new class226(arg0);
        var2.field3879 = arg0.length + -2;
        class168.field2810 = var2.method1447(0);
        class177.field2982 = new int[class168.field2810];
        class214.field3613 = new int[class168.field2810];
        class176.field2934 = new int[class168.field2810];
        class26.field427 = new byte[class168.field2810][];
        class122.field2205 = new byte[class168.field2810][];
        class58.field1068 = new int[class168.field2810];
        class169.field2828 = new boolean[class168.field2810];
        var2.field3879 = arg0.length + -7 + -(class168.field2810 * 8);
        class161.field2727 = var2.method1447(0);
        class241.field4197 = var2.method1447(0);
        int var3 = (255 & var2.method1471(arg1 ^ 255)) - -1;
        for (int var4 = 0; var4 < class168.field2810; ++var4) {
            class58.field1068[var4] = var2.method1447(0);
        }
        for (int var5 = 0; class168.field2810 > var5; ++var5) {
            class176.field2934[var5] = var2.method1447(0);
        }
        for (int var6 = 0; ~var6 > ~class168.field2810; ++var6) {
            class177.field2982[var6] = var2.method1447(0);
        }
        for (int var7 = 0; class168.field2810 > var7; ++var7) {
            class214.field3613[var7] = var2.method1447(0);
        }
        var2.field3879 = arg0.length + -(class168.field2810 * 8) + -7 - (var3 + -1) * 3;
        class63.field1153 = new int[var3];
        for (int var8 = 1; var3 > var8; ++var8) {
            class63.field1153[var8] = var2.method1444(171285352);
            if (class63.field1153[var8] == 0) {
                class63.field1153[var8] = 1;
            }
        }
        var2.field3879 = arg1;
        for (int var9 = 0; ~var9 > ~class168.field2810; ++var9) {
            int var10 = class177.field2982[var9];
            int var11 = class214.field3613[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class26.field427[var9] = var13;
            byte[] var14 = new byte[var12];
            class122.field2205[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method1471(255);
            if ((1 & var16) == 0) {
                for (int var17 = 0; var12 > var17; ++var17) {
                    var13[var17] = var2.method1428(false);
                }
                if ((var16 & 2) != 0) {
                    for (int var18 = 0; ~var12 < ~var18; ++var18) {
                        byte var19 = var14[var18] = var2.method1428(false);
                        var15 |= ~var19 != 0;
                    }
                }
            } else {
                int var20 = 0;
                label97: while (true) {
                    if (var20 >= var10) {
                        if (~(2 & var16) == -1) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var10) {
                                break label97;
                            }
                            for (int var22 = 0; ~var11 < ~var22; ++var22) {
                                byte var23 = var14[var21 - -(var10 * var22)] = var2.method1428(false);
                                var15 |= var23 != -1;
                            }
                            ++var21;
                        }
                    }
                    for (int var24 = 0; var11 > var24; ++var24) {
                        var13[var20 - -(var10 * var24)] = var2.method1428(false);
                    }
                    ++var20;
                }
            }
            class169.field2828[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field3684;
        int var3 = 27 % ((-15 - arg0) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int[] var5 = this.method1614(0, arg1, 102);
            for (int var6 = 0; var6 < class212.field3586; ++var6) {
                int var7 = var5[var6];
                var4[var6] = ~this.field3680 >= ~var7 && ~var7 >= ~this.field3689 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method1386(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = -3 / ((-17 - arg5) / 55);
        ++field3683;
        int var8 = arg2 & 3;
        if (~(arg3 & 1) == -2) {
            int var9 = arg1;
            arg1 = arg6;
            arg6 = var9;
        }
        if (~var8 == -1) {
            return arg4;
        } else if (var8 == 1) {
            return arg0;
        } else {
            return var8 == 2 ? -arg1 + 1 + -arg4 + 7 : -arg6 - -1 + -arg0 + 7;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ln;I)V")
    public static final void method1387(class138 arg0, int arg1) {
        ++field3685;
        if (!class102.field1793) {
            class111.method693();
            class179.field3063 = class208.method1332(class52.field918, (byte) -97, arg0);
            class179.field3063.method784(-95, 0);
            if (arg1 != 1) {
                field3688 = null;
            }
            class60.field1115 = class250.method1672(arg0, false, class223.field3780);
            class60.field1115.method258(-(class60.field1115.field822 / 2) + 382, 18);
            class102.field1793 = true;
        }
    }
}
