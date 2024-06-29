import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class167 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lhj;")
    public static class69 field3078 = class181.method1318("Lade Texturen )2 ", (byte) -105);

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "[I")
    public static int[] field3081 = new int[32];

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method1234(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3082++;
        if (class201.field3638 == arg1 && class101.field1899 == arg0 && class97.field1811 == arg6 || class163.method1215(93)) {
            return;
        }
        class201.field3638 = arg1;
        class97.field1811 = arg6;
        class101.field1899 = arg0;
        if (class163.method1215(117)) {
            class97.field1811 = 0;
        }
        if (arg5) {
            class115.method851(-99, 28);
        } else {
            class115.method851(arg4 ^ 0x12, 25);
        }
        class155.method1175(false, true, class138.field2589);
        int var7 = class242.field4441;
        class242.field4441 = arg1 * 8 - 48;
        int var8 = class220.field3962;
        class220.field3962 = arg0 * 8 - 48;
        class13.field192 = class27.method155(-58, class201.field3638 * 8, class101.field1899 * 8);
        int var9 = class242.field4441 - var7;
        int var10 = class242.field4441;
        int var11 = class220.field3962 - var8;
        int var12 = class220.field3962;
        if (arg5) {
            class46.field659 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class38 var32 = class131.field2428[var16];
                if (var32 != null) {
                    var32.field3985 -= var9 * 128;
                    var32.field4005 -= var11 * 128;
                    if (var32.field3985 >= 0 && var32.field3985 <= 13184 && var32.field4005 >= 0 && var32.field4005 <= 13184) {
                        for (int var33 = 0; var33 < 10; var33++) {
                            var32.field3998[var33] -= var9;
                            var32.field4046[var33] -= var11;
                        }
                        class245.field4490[class46.field659++] = var16;
                    } else {
                        class131.field2428[var16].field517 = null;
                        class131.field2428[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class38 var14 = class131.field2428[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field3998[var15] -= var9;
                        var14.field4046[var15] -= var11;
                    }
                    var14.field4005 -= var11 * 128;
                    var14.field3985 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class108 var30 = class35.field491[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field3998[var31] -= var9;
                    var30.field4046[var31] -= var11;
                }
                var30.field4005 -= var11 * 128;
                var30.field3985 -= var9 * 128;
            }
        }
        class52.field927 = arg6;
        class156.field2904.method812(arg2, 0, false, arg3);
        byte var18 = 0;
        byte var19 = 1;
        byte var20 = 104;
        byte var21 = 1;
        byte var22 = 0;
        if (var9 < 0) {
            var20 = -1;
            var18 = 103;
            var19 = -1;
        }
        byte var23 = 104;
        if (var11 < 0) {
            var21 = -1;
            var22 = 103;
            var23 = -1;
        }
        for (int var24 = var18; var24 != var20; var24 += var19) {
            for (int var26 = var22; var26 != var23; var26 += var21) {
                int var27 = var9 + var24;
                int var28 = var11 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class32.field437[var29][var24][var26] = class32.field437[var29][var27][var28];
                    } else {
                        class32.field437[var29][var24][var26] = null;
                    }
                }
            }
        }
        if (arg4 != -105) {
            field3078 = null;
        }
        for (class272 var25 = (class272) class38.field528.method1724(arg4 + 360); var25 != null; var25 = (class272) class38.field528.method1726(arg4 ^ 0xFFFFFFE0)) {
            var25.field4808 -= var11;
            var25.field4809 -= var9;
            if (var25.field4809 < 0 || var25.field4808 < 0 || var25.field4809 >= 104 || var25.field4808 >= 104) {
                var25.method632(-8296);
            }
        }
        if (class129.field2408 != 0) {
            class100.field1884 -= var11;
            class129.field2408 -= var9;
        }
        if (arg5) {
            class217.field3939 -= var9;
            class122.field2274 -= var11;
            class129.field2413 -= var9;
            class115.field2204 -= var11;
        } else {
            class265.field4711 = 1;
        }
        class229.field4200 = 0;
        class133.field2472 = -1;
        class262.field4668.method1732(126);
        class210.field3822.method1732(arg4 ^ 0xFFFFFFED);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1235(int arg0) {
        int var1 = 79 / ((arg0 - 15) / 58);
        field3081 = null;
        field3078 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Lbj;")
    public static final class151 method1236(int arg0, int arg1) {
        int var2 = 11 % ((40 - arg0) / 32);
        field3080++;
        class151 var3 = (class151) class63.field1213.method1714((long) arg1, (byte) -128);
        if (var3 != null) {
            return var3;
        }
        class151 var4 = class222.method1571(arg1, class211.field3830, false, (byte) 37, class102.field1910);
        if (var4 != null) {
            class63.field1213.method1705((byte) 123, var4, (long) arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(JB)V")
    public static final void method1237(long arg0, byte arg1) {
        field3079++;
        try {
            if (arg1 < 119) {
                field3078 = null;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }
}
