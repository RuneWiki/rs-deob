import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class165 {

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[I")
    public static int[] field2697 = new int[4096];

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "[I")
    public static int[] field2700;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V", line = 11)
    public static final void method1211(int arg0, int arg1) {
        field2698++;
        if (arg0 != 358076592) {
            method1214(-30);
        }
        for (class80 var2 = class324.field5529.method711(0); var2 != null; var2 = class324.field5529.method718(27263)) {
            if ((var2.field1325 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method598(86);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ltc;ILfe;)Lqj;", line = 49)
    public static final class264 method1212(class282 arg0, int arg1, class97 arg2) {
        field2693++;
        if (arg1 >= -24) {
            method1214(-100);
        }
        long var3 = ((long) arg0.field4679 << 56) + ((long) arg0.field4669 << 32) + (long) ((arg0.field4681 + 1 << 16) + arg0.field4672);
        class264 var5 = (class264) arg2.method713(3365, var3);
        if (var5 == null) {
            var5 = new class264(arg0.field4681, (float) arg0.field4672, true, false, arg0.field4669);
            arg2.method710(var5, (byte) 66, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lce;III)V", line = 70)
    public static final void method1213(class209 arg0, int arg1, int arg2, int arg3) {
        if ((arg3 & 0x200) != 0) {
            arg0.field5112 = class88.field1497.method1183(2);
            int var4 = class88.field1497.method1191(31776);
            arg0.field5137 = var4 >> 16;
            if (arg0.field5112 == 65535) {
                arg0.field5112 = -1;
            }
            arg0.field5119 = 0;
            arg0.field5107 = class319.field5393 + (var4 & 0xFFFF);
            arg0.field5097 = 0;
            if (arg0.field5107 > class319.field5393) {
                arg0.field5119 = -1;
            }
            if (arg0.field5112 != -1 && class319.field5393 == arg0.field5107) {
                int var5 = class259.method1799(20527, arg0.field5112).field4508;
                if (var5 != -1) {
                    class312 var6 = class53.method362((byte) 103, var5);
                    if (var6 != null && var6.field5226 != null) {
                        class176.method1265(-90, class230.field3820 == arg0, 0, arg0.field5168, var6, arg0.field5147);
                    }
                }
            }
        }
        if ((arg3 & arg1) != 0) {
            int var7 = class88.field1497.method1162(2);
            int var8 = class88.field1497.method1198(false);
            int var9 = class88.field1497.method1199(false);
            int var10 = class88.field1497.field2670;
            boolean var11 = (var7 & 0x8000) != 0;
            if (arg0.field3463 != null && arg0.field3446 != null) {
                long var12 = arg0.field3463.method1634(false);
                boolean var14 = false;
                if (var8 <= 1) {
                    if (var11 || (!class143.field2324 || class190.field3097) && !class8.field110) {
                        for (int var15 = 0; var15 < class216.field3555; var15++) {
                            if (class282.field4682[var15] == var12) {
                                var14 = true;
                                break;
                            }
                        }
                    } else {
                        var14 = true;
                    }
                }
                if (!var14 && class100.field1717 == 0) {
                    class84.field1445.field2670 = 0;
                    class88.field1497.method1192(var9, class84.field1445.field2668, 0, arg1 ^ 0x2);
                    class84.field1445.field2670 = 0;
                    int var16 = -1;
                    class229 var17;
                    if (var11) {
                        var7 &= 0x7FFF;
                        class166 var18 = class7.method46(class84.field1445, (byte) 48);
                        var16 = var18.field2703;
                        var17 = var18.field2714.method1816(false, class84.field1445);
                    } else {
                        var17 = class31.method257(class84.method623((byte) 47, class84.field1445).method1644(true));
                    }
                    arg0.field5134 = var17.method1638((byte) 47);
                    arg0.field5150 = var7 >> 8;
                    arg0.field5132 = 150;
                    arg0.field5113 = var7 & 0xFF;
                    if (var8 == 2) {
                        class190.method1323(var16, (class229) null, var11 ? 17 : 1, 18411, class248.method1746(8528, new class229[] { class59.field843, arg0.method1453((byte) -42) }), var17);
                    } else if (var8 == 1) {
                        class190.method1323(var16, (class229) null, var11 ? 17 : 1, 18411, class248.method1746(8528, new class229[] { class271.field4537, arg0.method1453((byte) -46) }), var17);
                    } else {
                        class190.method1323(var16, (class229) null, var11 ? 17 : 2, 18411, arg0.method1453((byte) -34), var17);
                    }
                }
            }
            class88.field1497.field2670 = var9 + var10;
        }
        field2696++;
        if ((arg3 & 0x10) != 0) {
            arg0.field5118 = class88.field1497.method1183(arg1 ^ 0x0);
            if (arg0.field5118 == 65535) {
                arg0.field5118 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var19 = class88.field1497.method1187((byte) -99);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = class88.field1497.method1193((byte) 48);
            class200.method1404(arg0, var20, 1, var19);
        }
        if ((arg3 & 0x1) != 0) {
            int var21 = class88.field1497.method1209(-128);
            int var22 = class88.field1497.method1193((byte) 24);
            arg0.method2071(class319.field5393, 0, var21, var22);
            arg0.field5099 = class319.field5393 + 300;
            arg0.field5152 = class88.field1497.method1199(false);
        }
        if ((arg3 & 0x80) != 0) {
            arg0.field5134 = class88.field1497.method1190(arg1 - 2);
            if (arg0.field5134.method1598(0, 61) == 126) {
                arg0.field5134 = arg0.field5134.method1640(1, -78);
                class205.method1439(arg0.field5134, true, 2, arg0.method1453((byte) -125));
            } else if (class230.field3820 == arg0) {
                class205.method1439(arg0.field5134, true, 2, arg0.method1453((byte) -91));
            }
            arg0.field5150 = 0;
            arg0.field5132 = 150;
            arg0.field5113 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            int var23 = class88.field1497.method1209(-128);
            int var24 = class88.field1497.method1178(8);
            arg0.method2071(class319.field5393, 0, var23, var24);
        }
        if ((arg3 & 0x8) != 0) {
            int var25 = class88.field1497.method1178(arg1 ^ 0xA);
            byte[] var26 = new byte[var25];
            class164 var27 = new class164(var26);
            class88.field1497.method1182(false, var25, var26, 0);
            class72.field1232[arg2] = var27;
            arg0.method1455((byte) 115, var27);
        }
        if ((arg3 & 0x100) != 0) {
            arg0.field5105 = class88.field1497.method1193((byte) 40);
            arg0.field5165 = class88.field1497.method1193((byte) 117);
            arg0.field5138 = class88.field1497.method1199(false);
            arg0.field5110 = class88.field1497.method1193((byte) 100);
            arg0.field5109 = class88.field1497.method1183(2) + class319.field5393;
            arg0.field5144 = class88.field1497.method1187((byte) -99) + class319.field5393;
            arg0.field5127 = class88.field1497.method1198(false);
            arg0.field5156 = 0;
            arg0.field5171 = 1;
        }
        if ((arg3 & 0x40) != 0) {
            arg0.field5096 = class88.field1497.method1187((byte) -99);
            arg0.field5167 = class88.field1497.method1161(true);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 303)
    public static void method1214(int arg0) {
        field2700 = null;
        field2697 = null;
        if (arg0 > -59) {
            field2701 = 111;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2697[var0] = class244.method1699((byte) 101, var0);
        }
        field2699 = 1;
        field2702 = -1;
        field2700 = new int[50];
        field2701 = -1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lsi;ILph;)Ljl;", line = 335)
    public static final class61 method1215(class66 arg0, int arg1, class229 arg2) {
        field2694++;
        int var3 = arg0.method498(arg2, arg1 ^ 0x0);
        if (arg1 == var3) {
            return new class61(0);
        }
        int[] var4 = arg0.method524(var3, 126);
        class61 var5 = new class61(var4.length);
        for (int var6 = 0; var6 < var5.field882; var6++) {
            class164 var7 = new class164(arg0.method523(-80, var4[var6], var3));
            var5.field872[var6] = var7.method1190(0);
            var5.field867[var6] = var7.method1163(864348104);
            var5.field879[var6] = (short) var7.method1161(true);
            var5.field868[var6] = (short) var7.method1161(true);
            var5.field869[var6] = var7.method1191(31776);
        }
        return var5;
    }
}
