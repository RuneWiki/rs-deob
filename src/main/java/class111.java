import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class111 extends class41 {

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "[I")
    public static int[] field1824 = new int[50];

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field1821 = 0;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Lsc;")
    public static class181 field1826 = class149.method967(255, "M");

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLo;I)I")
    public static final int method739(byte arg0, class175 arg1, int arg2) {
        field1822++;
        if (arg1.field3005 == null || arg2 >= arg1.field3005.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field3005[arg2];
            int var4 = 8 % ((49 - arg0) / 54);
            int var5 = 0;
            byte var6 = 0;
            int var7 = 0;
            while (true) {
                int var8 = 0;
                int var9 = var3[var7++];
                byte var10 = 0;
                if (var9 == 0) {
                    return var5;
                }
                if (var9 == 1) {
                    var8 = class184.field3265[var3[var7++]];
                }
                if (var9 == 2) {
                    var8 = class123.field2022[var3[var7++]];
                }
                if (var9 == 15) {
                    var10 = 1;
                }
                if (var9 == 3) {
                    var8 = class242.field4209[var3[var7++]];
                }
                if (var9 == 16) {
                    var10 = 2;
                }
                if (var9 == 4) {
                    int var11 = var3[var7++] << 16;
                    int var12 = var11 + var3[var7++];
                    class175 var13 = class52.method394(var12, false);
                    int var14 = var3[var7++];
                    if (var14 != -1 && (!class237.method1620(-29539, var14).field1616 || class213.field3664)) {
                        for (int var15 = 0; var15 < var13.field3065.length; var15++) {
                            if ((var14 + 1) == var13.field3065[var15]) {
                                var8 += var13.field2935[var15];
                            }
                        }
                    }
                }
                if (var9 == 17) {
                    var10 = 3;
                }
                if (var9 == 5) {
                    var8 = class196.field3426[var3[var7++]];
                }
                if (var9 == 6) {
                    var8 = class172.field2885[class123.field2022[var3[var7++]] - 1];
                }
                if (var9 == 7) {
                    var8 = class196.field3426[var3[var7++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var8 = class258.field4507.field1919;
                }
                if (var9 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class116.field1895[var16]) {
                            var8 += class123.field2022[var16];
                        }
                    }
                }
                if (var9 == 10) {
                    int var17 = var3[var7++] << 16;
                    int var18 = var17 + var3[var7++];
                    class175 var19 = class52.method394(var18, false);
                    int var20 = var3[var7++];
                    if (var20 != -1 && (!class237.method1620(-29539, var20).field1616 || class213.field3664)) {
                        for (int var21 = 0; var21 < var19.field3065.length; var21++) {
                            if (var20 + 1 == var19.field3065[var21]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var8 = class55.field848;
                }
                if (var9 == 12) {
                    var8 = class75.field1201;
                }
                if (var9 == 13) {
                    int var22 = class196.field3426[var3[var7++]];
                    int var23 = var3[var7++];
                    var8 = (var22 & 0x1 << var23) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var24 = var3[var7++];
                    var8 = class91.method609((byte) 83, var24);
                }
                if (var9 == 18) {
                    var8 = (class258.field4507.field2654 >> 7) + class253.field4420;
                }
                if (var9 == 19) {
                    var8 = (class258.field4507.field2681 >> 7) + class222.field3844;
                }
                if (var9 == 20) {
                    var8 = var3[var7++];
                }
                if (var10 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var10;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)I")
    public static final int method740(byte arg0, int arg1, int arg2) {
        field1825++;
        class196 var3 = (class196) class254.field4435.method1424(true, (long) arg2);
        if (var3 == null) {
            return -1;
        } else {
            if (arg0 != -91) {
                field1821 = -42;
            }
            return arg1 >= 0 && var3.field3420.length > arg1 ? var3.field3420[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public static final void method741(int arg0) {
        if (class46.field726 != null) {
            class210 var1 = class46.field726;
            synchronized (class46.field726) {
                class46.field726 = null;
            }
        }
        field1823++;
        if (arg0 != 3533) {
            field1826 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
    public static final int method742(int arg0, int arg1, int arg2) {
        field1820++;
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg0 == 0 ? arg1 : -35;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public static void method743(int arg0) {
        field1826 = null;
        field1824 = null;
        if (arg0 < 97) {
            field1821 = -59;
        }
    }
}
