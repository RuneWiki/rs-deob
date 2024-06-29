import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class75 {

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1220 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "[I")
    public static int[] field1221 = new int[2500];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[Ltd;")
    public static class234[] field1215 = new class234[2048];

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lok;")
    public static class146 field1222 = class235.method1724(-12908, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static volatile int field1217 = 0;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Loh;")
    public static class15 field1218;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Loh;")
    public static class15 field1224;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Loh;")
    public static class15 field1226;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lci;")
    public static class194 field1219;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1228;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "[Lje;")
    public static class70[] field1216;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIILbd;I)V", line = 10)
    public static final void method548(int arg0, int arg1, int arg2, class301 arg3, int arg4) {
        field1225++;
        if (class45.field763 >= 400) {
            return;
        }
        if (arg3.field5092 != null) {
            arg3 = arg3.method2135(arg2 ^ 0x0);
        }
        if (arg3 == null || !arg3.field5142) {
            return;
        }
        class146 var5 = arg3.field5113;
        if (~arg3.field5124 != arg2) {
            class146 var6 = class95.field1530 == 1 ? class159.field2691 : class261.field4342;
            var5 = class112.method758(126, new class146[] { var5, class238.method1737((byte) -107, class102.field1639.field3900, arg3.field5124), class265.field4560, var6, class82.method585(14744, arg3.field5124), class92.field1465 });
        }
        if (class161.field2736 == 1) {
            class281.method2039(arg0, (long) arg1, (short) 39, 12241, class269.field4618, arg4, class112.method758(119, new class146[] { class281.field4825, class287.field4891, var5 }), class224.field3735);
            class5.field57++;
        } else if (!class272.field4668) {
            class7.field136++;
            class146[] var7 = arg3.field5140;
            if (class236.field3939) {
                var7 = class229.method1683(81, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class95.field1530 != 0 || !var7[var8].method1106(class278.field4766, arg2 ^ 0xFFFFFFA7))) {
                        class52.field941++;
                        byte var9 = 0;
                        int var10 = -1;
                        if (var8 == 0) {
                            var9 = 51;
                        }
                        if (var8 == 1) {
                            var9 = 18;
                        }
                        if (var8 == 2) {
                            var9 = 7;
                        }
                        if (arg3.field5125 == var8) {
                            var10 = arg3.field5096;
                        }
                        if (arg3.field5095 == var8) {
                            var10 = arg3.field5158;
                        }
                        if (var8 == 3) {
                            var9 = 2;
                        }
                        if (var8 == 4) {
                            var9 = 29;
                        }
                        class281.method2039(arg0, (long) arg1, var9, 12241, var10, arg4, class112.method758(121, new class146[] { class139.field2306, var5 }), var7[var8]);
                    }
                }
            }
            if (class95.field1530 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].method1106(class278.field4766, 92)) {
                        class122.field1997++;
                        short var12 = 0;
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 51;
                        }
                        if (var11 == 1) {
                            var13 = 18;
                        }
                        if (var11 == 2) {
                            var13 = 7;
                        }
                        if (class102.field1639.field3900 < arg3.field5124) {
                            var12 = 2000;
                        }
                        if (var11 == 3) {
                            var13 = 2;
                        }
                        if (var11 == 4) {
                            var13 = 29;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class281.method2039(arg0, (long) arg1, var13, 12241, arg3.field5148, arg4, class112.method758(-53, new class146[] { class139.field2306, var5 }), var7[var11]);
                    }
                }
            }
            class281.method2039(arg0, (long) arg1, (short) 1002, 12241, class152.field2585, arg4, class112.method758(arg2 + 124, new class146[] { class139.field2306, var5 }), class237.field3954);
        } else if ((class180.field3023 & 0x2) == 2) {
            class281.method2039(arg0, (long) arg1, (short) 34, arg2 + 12242, -1, arg4, class112.method758(arg2 ^ 0xFFFFFF88, new class146[] { class238.field3968, class287.field4891, var5 }), class135.field2257);
            class157.field2637++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I", line = 167)
    public static final int method549(int arg0, int arg1) {
        field1227++;
        class79 var2 = class150.method1186(arg0, 104);
        int var3 = var2.field1260;
        int var4 = var2.field1261;
        if (arg1 != 18) {
            field1228 = (Canvas) null;
        }
        int var5 = var2.field1262;
        int var6 = client.field4069[var5 - var4];
        return var6 & field1221[var3] >> var4;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 205)
    public static void method550(byte arg0) {
        field1219 = null;
        field1222 = null;
        field1218 = null;
        field1216 = null;
        field1215 = null;
        if (arg0 == 125) {
            field1221 = null;
            field1228 = null;
            field1224 = null;
            field1226 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII)V", line = 223)
    public static final void method551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class63.field1094 = arg5;
        class104.field1693 = arg2;
        class180.field3030 = arg4;
        class122.field2004 = arg3;
        class9.field194 = arg0;
        field1229++;
        if (class122.field2004 >= 100) {
            int var6 = class104.field1693 * 128 + 64;
            int var7 = class63.field1094 * 128 + 64;
            int var8 = class19.method141(var7, class203.field3387, var6, 122) - class9.field194;
            int var9 = var7 - class107.field1742;
            int var10 = var8 - class151.field2572;
            int var11 = var6 - class161.field2719;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class63.field1088 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class79.field1269 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class63.field1088 < 128) {
                class63.field1088 = 128;
            }
            if (class63.field1088 > 383) {
                class63.field1088 = 383;
            }
        }
        int var13 = 121 / ((-arg1 - 68) / 56);
        class302.field5172 = 2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)I", line = 272)
    public static final int method552(int arg0, int arg1, byte arg2) {
        field1223++;
        int var3 = -101 / ((arg2 - 63) / 54);
        int var4 = class116.method784(arg0 - 1, arg1 + -1, (byte) -1) + class116.method784(arg0 + 1, arg1 + -1, (byte) -1) + class116.method784(arg0 + -1, arg1 - -1, (byte) -1) + class116.method784(arg0 - -1, arg1 + 1, (byte) -1);
        int var5 = class116.method784(arg0 - 1, arg1, (byte) -1) + class116.method784(arg0 + 1, arg1, (byte) -1) + class116.method784(arg0, arg1 + -1, (byte) -1) + class116.method784(arg0, arg1 - -1, (byte) -1);
        int var6 = class116.method784(arg0, arg1, (byte) -1);
        return var6 / 4 + var4 / 16 + var5 / 8;
    }
}
