import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class458 {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lpia;")
    public static class94 field6551 = new class94(29, 4);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public int field6550;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public int field6552;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public int field6554;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public int field6557;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "[Lqu;")
    public static class96[] field6556;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2801(byte arg0) {
        class126.field1328 = -1;
        field6549++;
        class352.field4528 = 1;
        long var1 = 0L;
        int var3 = 93 % ((53 - arg0) / 34);
        if (class10.field79 == null) {
            class40.method240(35, true);
        } else {
            class244 var4 = new class244(class188.method1153(109, class58.method349(class10.field79, false)));
            long var5 = var4.method1447((byte) -28);
            class504.field7157 = var4.method1447((byte) -94);
            class714.method3989(class628.method3599(-104, var5), true, "", 123);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILha;ILvc;)V", line = 37)
    public static final void method2802(int arg0, int arg1, int arg2, class58 arg3, int arg4, class316 arg5) {
        field6555++;
        class645 var6 = class119.field1233.method2338(arg5.field3990, (byte) -87);
        if (var6.field9216 == -1) {
            return;
        }
        int var7;
        if (arg5.field3969) {
            int var8 = arg5.field4047 + arg1;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class131 var9 = var6.method3671(arg3, arg5.field4017, var7, false);
        if (var9 == null) {
            return;
        }
        int var10 = 23 / ((-arg4 - 65) / 48);
        int var11 = arg5.field4020;
        int var12 = arg5.field4050;
        if ((var7 & 0x1) == 1) {
            var12 = arg5.field4020;
            var11 = arg5.field4050;
        }
        int var13 = var9.method501();
        int var14 = var9.method510();
        if (var6.field9223) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var6.field9217 == 0) {
            var9.method814(arg2, arg0 - ((var12 - 1) * 4), var13, var14);
        } else {
            var9.method818(arg2, arg0 - (var12 - 1) * 4, var13, var14, 0, var6.field9217 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lpk;[II[I[I)V", line = 91)
    public static final void method2803(class197 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        field6553++;
        if (arg2 != 32280) {
            return;
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg0.field7105.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field7105[var9] = null;
                    } else {
                        class25 var10 = class637.field9158.method1905(arg2 ^ 0x7E26, var6);
                        int var11 = var10.field250;
                        class154 var12 = arg0.field7105[var9];
                        if (var12 != null) {
                            if (var12.field1690 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field7105[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1694 = 0;
                                    var12.field1700 = var8;
                                    var12.field1699 = 0;
                                    var12.field1697 = 1;
                                    var12.field1698 = 0;
                                    if (!arg0.field7108) {
                                        class629.method3607(arg0, var10, -117, 0);
                                    }
                                } else if (var11 == 2) {
                                    var12.field1698 = 0;
                                }
                            } else if (var10.field272 >= class637.field9158.method1905(94, var12.field1690).field272) {
                                var12 = arg0.field7105[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class154 var13 = arg0.field7105[var9] = new class154();
                            var13.field1697 = 1;
                            var13.field1700 = var8;
                            var13.field1699 = 0;
                            var13.field1698 = 0;
                            var13.field1690 = var6;
                            var13.field1694 = 0;
                            if (!arg0.field7108) {
                                class629.method3607(arg0, var10, -115, 0);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 202)
    public static void method2804(byte arg0) {
        field6556 = null;
        if (arg0 > -111) {
            field6556 = null;
        }
        field6551 = null;
    }
}
