import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class143 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lkd;")
    private static class73 field3555 = class126.method1070((byte) -66, "OFF");

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3558 = 0;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Lkd;")
    public static class73 field3565 = class126.method1070((byte) -66, "<col=00ffff>");

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lkd;")
    public static class73 field3568 = field3555;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "[Lua;")
    public static class137[] field3569 = new class137[256];

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Lkd;")
    public static class73 field3571 = class126.method1070((byte) -66, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
    public static int[] field3554 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3564 = 0;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field3574 = -1;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "Lkd;")
    public static class73 field3575 = null;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Loe;")
    public static class102 field3562;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Lta;")
    public static class131 field3567;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "[Lde;")
    public static class27[] field3557;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z[Lkd;)[Lkd;")
    public static final class73[] method1155(boolean arg0, class73[] arg1) {
        if (arg0) {
            return null;
        }
        field3563++;
        class73[] var2 = new class73[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class32.method258(-96, new class73[] { class78.method676(var3, -105), class133.field3355 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class32.method258(-90, new class73[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method1156(int arg0) {
        field3557 = null;
        field3575 = null;
        if (arg0 != 24544) {
            return;
        }
        field3565 = null;
        field3562 = null;
        field3571 = null;
        field3569 = null;
        field3555 = null;
        field3554 = null;
        field3567 = null;
        field3568 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lkd;B)V")
    public static final void method1157(class73 arg0, byte arg1) {
        field3572++;
        if (arg0 == null || arg0.method632((byte) -56) == 0) {
            class66.field1708 = 0;
            return;
        }
        class73 var2 = arg0;
        int var3 = 0;
        int var4 = 8 % ((arg1 - 36) / 50);
        class73[] var5 = new class73[100];
        while (true) {
            int var6 = var2.method617(32, false);
            if (var6 == -1) {
                class73 var8 = var2.method640(-123);
                if (var8.method632((byte) -86) > 0) {
                    var5[var3++] = var8.method608(-24240);
                }
                class66.field1708 = 0;
                label47: for (int var9 = 0; var9 < class137.field3425; var9++) {
                    class126 var10 = class9.method86(var9, (byte) 118);
                    if (var10.field3229 == -1 && var10.field3220 != null) {
                        class73 var11 = var10.field3220.method608(-24240);
                        for (int var12 = 0; var12 < var3; var12++) {
                            if (var11.method623(-1893532698, var5[var12]) == -1) {
                                continue label47;
                            }
                        }
                        class77.field1978[class66.field1708] = var11;
                        class66.field1710[class66.field1708] = var9;
                        class66.field1708++;
                        if (class77.field1978.length <= class66.field1708) {
                            return;
                        }
                    }
                }
                return;
            }
            class73 var7 = var2.method630(var6, 0, -24023).method640(-123);
            if (var7.method632((byte) -128) > 0) {
                var5[var3++] = var7.method608(-24240);
            }
            var2 = var2.method638(var6 + 1, 125);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1158(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3560++;
        int var7 = 2048 - arg6 & 0x7FF;
        if (arg1 <= 107) {
            method1159(127);
        }
        int var8 = 2048 - arg2 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg3;
        if (var7 != 0) {
            int var12 = class29.field848[var7];
            int var13 = class29.field833[var7];
            int var14 = var10 * var12 - arg3 * var13 >> 16;
            var11 = var10 * var13 + arg3 * var12 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class29.field848[var8];
            int var16 = class29.field833[var8];
            int var17 = var9 * var15 + var11 * var16 >> 16;
            var11 = var11 * var15 - var9 * var16 >> 16;
            var9 = var17;
        }
        class23.field664 = arg5 - var10;
        class30.field857 = arg4 - var9;
        class70.field1785 = arg0 - var11;
        class42.field1128 = arg2;
        class122.field3118 = arg6;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static final void method1159(int arg0) {
        field3566++;
        class92.method771((byte) 50);
        class114.method975(true);
        if (arg0 != 4) {
            field3562 = null;
        }
        if (class52.field1387 == 2 || class52.field1387 == 5) {
            byte[] var41 = class79.field2010.field771;
            int[] var42 = class17.field506;
            int var43 = var41.length;
            for (int var44 = 0; var44 < var43; var44++) {
                if (var41[var44] == 0) {
                    var42[var44] = 0;
                }
            }
            if (class52.field1387 < 3) {
                class76.field1954.method844(0, 0, 33, 33, 25, 25, class55.field1490, 256, class22.field642, class114.field2817);
            }
            class16.method130(arg0 + 26045);
            return;
        }
        int var1 = class84.field2123 + class55.field1490 & 0x7FF;
        int var2 = 464 - class73.field1901.field2264 / 32;
        int var3 = class73.field1901.field2277 / 32 + 48;
        class37.field1020.method844(25, 5, 146, 151, var3, var2, var1, class43.field1156 + 256, class142.field3531, client.field607);
        for (int var4 = 0; var4 < class129.field3251; var4++) {
            int var39 = class99.field2498[var4] * 4 + 2 - class73.field1901.field2277 / 32;
            int var40 = class116.field2975[var4] * 4 + 2 - class73.field1901.field2264 / 32;
            class33.method263(-621557776, var39, var40, class146.field3604[var4]);
        }
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var35 = 0; var35 < 104; var35++) {
                class61 var36 = class118.field3019[class11.field320][var5][var35];
                if (var36 != null) {
                    int var37 = var35 * 4 + 2 - class73.field1901.field2264 / 32;
                    int var38 = var5 * 4 + 2 - class73.field1901.field2277 / 32;
                    class33.method263(-621557776, var38, var37, class25.field719[0]);
                }
            }
        }
        for (int var6 = 0; var6 < client.field618; var6++) {
            class9 var31 = class133.field3345[class55.field1455[var6]];
            if (var31 != null && var31.method87((byte) -119)) {
                class28 var32 = var31.field301;
                if (var32 != null && var32.field801 != null) {
                    var32 = var32.method216(-1);
                }
                if (var32 != null && var32.field799 && var32.field802) {
                    int var33 = var31.field2264 / 32 - class73.field1901.field2264 / 32;
                    int var34 = var31.field2277 / 32 - class73.field1901.field2277 / 32;
                    class33.method263(arg0 - 621557780, var34, var33, class25.field719[1]);
                }
            }
        }
        for (int var7 = 0; var7 < class63.field1661; var7++) {
            class118 var23 = class42.field1141[class14.field435[var7]];
            if (var23 != null && var23.method87((byte) 68)) {
                int var24 = var23.field2264 / 32 - class73.field1901.field2264 / 32;
                int var25 = var23.field2277 / 32 - class73.field1901.field2277 / 32;
                boolean var26 = false;
                long var27 = var23.field3025.method643(arg0 ^ 0xFB);
                for (int var29 = 0; var29 < class14.field431; var29++) {
                    if (class49.field1305[var29] == var27 && class16.field497[var29] != 0) {
                        var26 = true;
                        break;
                    }
                }
                boolean var30 = false;
                if (class73.field1901.field3011 != 0 && var23.field3011 != 0 && class73.field1901.field3011 == var23.field3011) {
                    var30 = true;
                }
                if (var26) {
                    class33.method263(-621557776, var25, var24, class25.field719[3]);
                } else if (var30) {
                    class33.method263(-621557776, var25, var24, class25.field719[4]);
                } else {
                    class33.method263(-621557776, var25, var24, class25.field719[2]);
                }
            }
        }
        if (class64.field1685 != 0 && class49.field1308 % 20 < 10) {
            if (class64.field1685 == 1 && class118.field3006 >= 0 && class118.field3006 < class133.field3345.length) {
                class9 var8 = class133.field3345[class118.field3006];
                if (var8 != null) {
                    int var9 = var8.field2277 / 32 - class73.field1901.field2277 / 32;
                    int var10 = var8.field2264 / 32 - class73.field1901.field2264 / 32;
                    class129.method1081(var9, var10, true, class20.field558[1]);
                }
            }
            if (class64.field1685 == 2) {
                int var11 = (class44.field1173 - class121.field3093) * 4 + 2 - class73.field1901.field2264 / 32;
                int var12 = (class78.field1995 - class80.field2029) * 4 + 2 - class73.field1901.field2277 / 32;
                class129.method1081(var12, var11, true, class20.field558[1]);
            }
            if (class64.field1685 == 10 && class132.field3317 >= 0 && class42.field1141.length > class132.field3317) {
                class118 var13 = class42.field1141[class132.field3317];
                if (var13 != null) {
                    int var14 = var13.field2277 / 32 - class73.field1901.field2277 / 32;
                    int var15 = var13.field2264 / 32 - class73.field1901.field2264 / 32;
                    class129.method1081(var14, var15, true, class20.field558[1]);
                }
            }
        }
        if (class38.field1037 != 0) {
            int var16 = class38.field1037 * 4 + 2 - class73.field1901.field2277 / 32;
            int var17 = class34.field925 * 4 + 2 - class73.field1901.field2264 / 32;
            class33.method263(-621557776, var16, var17, class20.field558[0]);
        }
        class17.method133(97, 78, 3, 3, 16777215);
        if (class52.field1387 >= 3) {
            byte[] var18 = class79.field2010.field771;
            int[] var19 = class17.field506;
            for (int var20 = 0; var20 <= 33; var20++) {
                int var21 = class79.field2010.field772 * var20;
                for (int var22 = 0; var22 <= 33; var22++) {
                    if (var18[var21 + var22] == 0) {
                        var19[var21 + var22] = 0;
                    }
                }
            }
        } else {
            class76.field1954.method844(0, 0, 33, 33, 25, 25, class55.field1490, 256, class22.field642, class114.field2817);
        }
        class16.method130(26049);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lnd;")
    public static final class94 method1160(Throwable arg0, String arg1) {
        field3561++;
        class94 var2;
        if (arg0 instanceof class94) {
            var2 = (class94) arg0;
            var2.field2399 = var2.field2399 + ' ' + arg1;
        } else {
            var2 = new class94(arg0, arg1);
        }
        return var2;
    }
}
