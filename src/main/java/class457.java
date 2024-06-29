import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class457 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Leda;")
    public static class116 field6563 = new class116(109, -1);

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lqj;")
    public static class511 field6572 = new class511(8, 7);

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Leg;")
    public static class366 field6574 = new class366();

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public int field6565;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public int field6570;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[Lan;")
    public class169[] field6568;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([BIZI)I", line = 4)
    public static final int method2650(byte[] arg0, int arg1, boolean arg2, int arg3) {
        field6564++;
        if (arg2) {
            field6573 = 28;
        }
        int var4 = -1;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = class673.field9554[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILek;Lkq;)Lan;", line = 33)
    private final class169 method2651(int arg0, class465 arg1, class696 arg2) {
        field6567++;
        if (class258.field3707 == arg2) {
            return class696.method3919((byte) 30, arg1);
        } else if (class37.field491 == arg2) {
            return class57.method499(arg1, arg0 ^ 0x24A);
        } else if (class152.field2540 == arg2) {
            return class117.method947(false, arg1);
        } else if (class694.field9863 == arg2) {
            return class316.method1909(124, arg1);
        } else if (class126.field2066 == arg2) {
            return class90.method673(true, arg1);
        } else if (class583.field8543 == arg2) {
            return class385.method2355(arg1, 4792);
        } else if (class584.field8558 == arg2) {
            return class686.method3871(-23878, arg1);
        } else if (class329.field4557 == arg2) {
            return class462.method2683(-23728, arg1);
        } else {
            if (arg0 != -10310) {
                method2650(null, 91, true, 46);
            }
            if (class333.field4636 == arg2) {
                return class434.method2545(18072, arg1);
            } else if (class484.field6905 == arg2) {
                return class447.method2606(arg1, -1);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V", line = 77)
    public static final void method2652(int arg0, boolean arg1) {
        if (class406.field5827 == null) {
            class330.method1957((byte) -104);
        }
        field6562++;
        if (arg0 < 8) {
            method2655(-38);
        }
        if (arg1) {
            class406.field5827.method253(true);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLek;)V", line = 95)
    public final void method2653(byte arg0, class465 arg1) {
        field6566++;
        this.field6565 = arg1.method2714(true);
        this.field6570 = arg1.method2755((byte) -61);
        this.field6568 = new class169[arg1.method2705(-40)];
        class696[] var3 = class247.method1592(0);
        for (int var4 = 0; var4 < this.field6568.length; var4++) {
            this.field6568[var4] = this.method2651(-10310, arg1, var3[arg1.method2705(-77)]);
        }
        int var5 = -63 / ((arg0 - 14) / 42);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I", line = 129)
    public static final int method2654(int arg0) {
        field6569++;
        if (class370.field5124 == 0) {
            class71.field1120.method579((byte) -103, new class252("jaclib"));
            if (class71.field1120.method581((byte) 119).method20(-101) != 100) {
                return 1;
            }
            if (!((class252) class71.field1120.method581((byte) 118)).method1607(16523)) {
                class573.field8424.method990(-16914);
            }
            class370.field5124 = 1;
        }
        if (class370.field5124 == 1) {
            class306.field4266 = class71.method578((byte) 121);
            class71.field1112.method579((byte) -103, new class118(class634.field8977));
            class71.field1121.method579((byte) -103, new class252("jaggl"));
            class71.field1122.method579((byte) -103, new class252("jagdx"));
            class71.field1123.method579((byte) -103, new class252("jagmisc"));
            class71.field1124.method579((byte) -103, new class252("sw3d"));
            class71.field1125.method579((byte) -103, new class252("hw3d"));
            class71.field1126.method579((byte) -103, new class118(class450.field6495));
            class71.field1127.method579((byte) -103, new class118(class76.field1183));
            class71.field1128.method579((byte) -103, new class118(class379.field5241));
            class71.field1129.method579((byte) -103, new class118(class240.field3534));
            class71.field1130.method579((byte) -103, new class118(class183.field2905));
            class71.field1131.method579((byte) -103, new class118(class337.field4697));
            class71.field1132.method579((byte) -103, new class118(class400.field5781));
            class71.field1133.method579((byte) -103, new class118(class57.field852));
            class71.field1134.method579((byte) -103, new class118(class23.field305));
            class71.field1135.method579((byte) -103, new class118(class487.field6954));
            class71.field1136.method579((byte) -103, new class118(class580.field8502));
            class71.field1137.method579((byte) -103, new class118(class89.field1329));
            class71.field1138.method579((byte) -103, new class118(class386.field5664));
            class71.field1139.method579((byte) -103, new class118(class608.field8739));
            class71.field1140.method579((byte) -103, new class55(class177.field2831, "huffman"));
            class71.field1141.method579((byte) -103, new class118(class522.field7698));
            class71.field1142.method579((byte) -103, new class118(class563.field8216));
            class71.field1143.method579((byte) -103, new class118(class399.field5771));
            class71.field1144.method579((byte) -103, new class679(class72.field1152, "details"));
            for (int var1 = 0; var1 < class306.field4266.length; var1++) {
                if (class306.field4266[var1].method581((byte) 126) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class71[] var3 = class306.field4266;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class71 var5 = var3[var4];
                int var6 = var5.method582(-53);
                int var7 = var5.method581((byte) 127).method20(68);
                var2 += var6 * var7 / 100;
            }
            class335.field4669 = var2;
            class370.field5124 = 2;
        }
        if (class306.field4266 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = -67 % ((22 - arg0) / 56);
        int var10 = 0;
        boolean var11 = true;
        class71[] var12 = class306.field4266;
        for (int var13 = 0; var13 < var12.length; var13++) {
            class71 var17 = var12[var13];
            int var18 = var17.method582(103);
            int var19 = var17.method581((byte) 113).method20(-97);
            if (var19 < 100) {
                var11 = false;
            }
            var8 += var18;
            var10 += var18 * var19 / 100;
        }
        if (var11) {
            if (!((class252) class71.field1123.method581((byte) 95)).method1607(16523)) {
                class573.field8424.method985(true);
            }
            class306.field4266 = null;
        }
        int var14 = var8 - class335.field4669;
        int var15 = var10 - class335.field4669;
        int var16 = var14 <= 0 ? 100 : var15 * 100 / var14;
        if (!var11 && var16 > 99) {
            var16 = 99;
        }
        return var16;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 268)
    public static void method2655(int arg0) {
        field6563 = null;
        int var1 = -60 % ((-arg0 - 1) / 38);
        field6574 = null;
        field6572 = null;
    }
}
