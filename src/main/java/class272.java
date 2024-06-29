import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class272 {

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Luf;")
    public static class168 field4570 = class148.method1019(-1720, "(U0a )2 via: ");

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4568 = 0;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Luf;")
    private static class168 field4569 = class148.method1019(-1720, " ");

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Luf;")
    public static class168 field4566 = class148.method1019(-1720, ":clan:");

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4571 = 0;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4573 = 0;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Luf;")
    public static class168 field4576 = field4569;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Luf;")
    public static class168 field4577 = class148.method1019(-1720, "underlay");

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lkb;")
    public static class80 field4578 = new class80(4096);

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4581 = 0;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "[[Lg;")
    public static class242[][] field4582;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "[[[B")
    public static byte[][][] field4579;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZII)Luf;", line = 11)
    public static final class168 method1878(int arg0, boolean arg1, int arg2, int arg3) {
        field4574++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 1;
        int var5 = arg0 / arg3;
        while (var5 != 0) {
            var5 /= arg3;
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < ~arg0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg0 % arg3;
            arg0 /= arg3;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class168 var10 = new class168();
        var10.field2716 = var7;
        var10.field2692 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 75)
    public static void method1879(int arg0) {
        field4578 = null;
        field4577 = null;
        field4566 = null;
        field4570 = null;
        field4582 = (class242[][]) null;
        field4569 = null;
        field4579 = (byte[][][]) null;
        field4576 = null;
        if (arg0 != 4) {
            field4571 = -70;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILw;IILg;Lw;)V", line = 92)
    public static final void method1880(int arg0, int arg1, int arg2, class37 arg3, int arg4, int arg5, class242 arg6, class37 arg7) {
        class43.field533 = arg6;
        class39.field492 = arg5;
        class102.field1589 = arg1;
        field4567++;
        class172.field2799 = arg2;
        class264.field4466 = arg0;
        if (class278.field4671 != null) {
            return;
        }
        class77.field1056 = true;
        if (class8.field100 == null) {
            class8.field100 = class213.method1483(class61.field792, (byte) -101, 0, class271.field4564);
        }
        if (class31.field388 == null) {
            class31.field388 = class103.method777(class61.field792, class165.field2655, 0, false);
        }
        if (class26.field321 == null) {
            class26.field321 = class103.method777(class61.field792, class183.field2941, 0, false);
        }
        if (class145.field2252 == null) {
            class145.field2252 = class103.method777(class61.field792, class261.field4436, 0, false);
        }
        int var8 = class102.field1589 / 5 * 4;
        int var9 = class102.field1589 / 5;
        class228.method1554(class39.field492, class172.field2799, class102.field1589, class264.field4466, 0, 168);
        class228.method1550(class39.field492, class172.field2799, var9, 23, 12425273, 9135624);
        class228.method1550(class39.field492 + var9, class172.field2799, var8, 23, 5197647, 2697513);
        if (arg4 != 24543) {
            field4566 = (class168) null;
        }
        arg3.method192(class153.field2360, var9 / 2 + class39.field492, class172.field2799 + 15, 0, -1);
        if (class145.field2252 != null) {
            class145.field2252[1].method1363(class39.field492 + var9 + 2, class172.field2799 - -1);
            arg7.method193(class278.field4667, var9 + class39.field492 + 12, class172.field2799 + 10, 16777215, -1);
            class145.field2252[0].method1363(class39.field492 + var9 + 2, class172.field2799 + 12);
            arg7.method193(class183.field2942, class39.field492 + var9 + 12, class172.field2799 + 21, 16777215, -1);
        }
        if (class26.field321 != null) {
            int var10 = var9 + class39.field492 + 140;
            if (class197.field3261[0] == 0 && class113.field1771[0] == 0) {
                class26.field321[2].method1363(var10, class172.field2799 + 4);
            } else {
                class26.field321[0].method1363(var10, class172.field2799 + 4);
            }
            if (class197.field3261[0] == 0 && class113.field1771[0] == 1) {
                class26.field321[3].method1363(var10 + 15, class172.field2799 - -4);
            } else {
                class26.field321[1].method1363(var10 + 15, class172.field2799 + 4);
            }
            arg3.method193(class26.field333, var10 + 32, class172.field2799 + 17, 16777215, -1);
            int var11 = class39.field492 + var9 + 250;
            if (class197.field3261[0] == 1 && class113.field1771[0] == 0) {
                class26.field321[2].method1363(var11, class172.field2799 + 4);
            } else {
                class26.field321[0].method1363(var11, class172.field2799 + 4);
            }
            if (class197.field3261[0] == 1 && class113.field1771[0] == 1) {
                class26.field321[3].method1363(var11 + 15, class172.field2799 + 4);
            } else {
                class26.field321[1].method1363(var11 + 15, class172.field2799 + 4);
            }
            arg3.method193(class267.field4505, var11 + 32, class172.field2799 + 17, 16777215, -1);
            int var12 = class39.field492 + var9 + 360;
            if (class197.field3261[0] == 2 && class113.field1771[0] == 0) {
                class26.field321[2].method1363(var12, class172.field2799 + 4);
            } else {
                class26.field321[0].method1363(var12, class172.field2799 + 4);
            }
            if (class197.field3261[0] == 2 && class113.field1771[0] == 1) {
                class26.field321[3].method1363(var12 + 15, class172.field2799 + 4);
            } else {
                class26.field321[1].method1363(var12 + 15, class172.field2799 + 4);
            }
            arg3.method193(class252.field4304, var12 + 32, class172.field2799 - -17, 16777215, -1);
            int var13 = class39.field492 + var9 + 470;
            if (class197.field3261[0] == 3 && class113.field1771[0] == 0) {
                class26.field321[2].method1363(var13, class172.field2799 + 4);
            } else {
                class26.field321[0].method1363(var13, class172.field2799 + 4);
            }
            if (class197.field3261[0] == 3 && class113.field1771[0] == 1) {
                class26.field321[3].method1363(var13 + 15, class172.field2799 - -4);
            } else {
                class26.field321[1].method1363(var13 + 15, class172.field2799 + 4);
            }
            arg3.method193(class234.field3765, var13 + 32, class172.field2799 + 17, 16777215, -1);
        }
        class228.method1560(class102.field1589 - 10 - 58, class172.field2799 + 4, 58, 16, 0);
        class284.field4820 = -1;
        if (class8.field100 == null) {
            return;
        }
        byte var14 = 88;
        int var15 = class102.field1589 / (var14 + 1);
        byte var16 = 19;
        int var17 = (class264.field4466 - 23) / (var16 + 1);
        int var18;
        int var19;
        do {
            var18 = var17;
            var19 = var15;
            if (((var15 - 1) * var17) >= field4568) {
                var15--;
            }
            if ((var17 - 1) * var15 >= field4568) {
                var17--;
            }
            if (((var17 - 1) * var15) >= field4568) {
                var17--;
            }
        } while (var17 != var18 || var15 != var19);
        int var20 = (class102.field1589 - (var14 * var15)) / (var15 + 1);
        if (var20 > 5) {
            var20 = 5;
        }
        int var21 = (class102.field1589 - (var14 * var15) - (var15 - 1) * var20) / 2;
        int var22 = (class264.field4466 - (var16 * var17) - 23) / (var17 + 1);
        if (var22 > 5) {
            var22 = 5;
        }
        int var23 = var21;
        int var24 = 0;
        int var25 = (class264.field4466 - ((var17 - 1) * var22) - (var16 * var17) - 23) / 2;
        int var26 = var25 + 23;
        for (int var27 = 0; var27 < field4568; var27++) {
            class274 var28 = class73.field977[var27];
            boolean var29 = true;
            class168 var30 = class169.method1228(var28.field4607, 0);
            if (var28.field4607 == -1) {
                var29 = false;
                var30 = class194.field3151;
            } else if (var28.field4607 > 1980) {
                var30 = class238.field3808;
                var29 = false;
            }
            if (var23 <= class262.field4442 && var26 <= class155.field2457 && (var14 + var23) > class262.field4442 && class155.field2457 < var16 + var26 && var29) {
                class284.field4820 = var27;
                class8.field100[var28.field4616 ? 1 : 0].method262(class39.field492 + var23, class172.field2799 + var26, 128, 16777215);
            } else {
                class8.field100[var28.field4616 ? 1 : 0].method151(class39.field492 + var23, class172.field2799 + var26);
            }
            if (class31.field388 != null) {
                class31.field388[var28.field4610 + (var28.field4616 ? class31.field388.length / 2 : 0)].method1363(class39.field492 + var23 + 29, class172.field2799 + var26);
            }
            arg3.method192(class169.method1228(var28.field4605, 0), class39.field492 + var23 + 15, var16 / 2 + class172.field2799 + var26 + 5, 0, -1);
            arg7.method192(var30, class39.field492 + var23 + 60, var16 / 2 + var26 + 5 + class172.field2799, 268435455, -1);
            var26 += var16 + var22;
            int var10000 = ~var17;
            var24++;
            if (var10000 >= ~var24) {
                var26 = var25 + 23;
                var24 = 0;
                var23 += var20 + var14;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Luf;Z)V", line = 313)
    public static final void method1881(class168 arg0, boolean arg1) {
        if (!arg1) {
            field4575++;
            class110.method818(-1445985368);
            class131.method917(arg0, 117);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLuf;)Luf;", line = 330)
    public static final class168 method1882(byte arg0, class168 arg1) {
        field4572++;
        int var2 = class236.method1592(true, arg1);
        if (arg0 > -110) {
            field4573 = -59;
        }
        return var2 == -1 ? class282.field4758 : class201.field3315.field4158[var2].method1175(class205.field3379, class271.field4550, false);
    }
}
