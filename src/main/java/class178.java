import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class178 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field2688 = 0;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "[S")
    public static short[] field2690 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "D")
    public static double field2693 = -1.0D;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field2691 = 1;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 17)
    public static final void method1266(byte arg0) {
        class227.field3596.method2176((byte) 109);
        if (arg0 == -75) {
            field2695++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V", line = 28)
    public static final void method1267(int arg0, String arg1, int arg2, String arg3) {
        class89.field1425 = arg1;
        field2687++;
        class298.field4602 = arg3;
        class115.field1768 = arg2;
        if (class298.field4602.equals("") || class89.field1425.equals("")) {
            class239.field3798 = 3;
        } else if (class219.field3328 == -1) {
            class213.field3250 = 0;
            class55.field919 = 1;
            class133.field2124 = 0;
            class239.field3798 = -3;
            class166 var4 = new class166(128);
            var4.method1132((byte) 29, 10);
            var4.method1174((byte) -32, (int) (Math.random() * 9.9999999E7D));
            if (arg0 == 3) {
                var4.method1125(8473, class128.method926(class298.field4602, (byte) -74));
                var4.method1174((byte) -32, (int) (Math.random() * 9.9999999E7D));
                var4.method1121(-1, class89.field1425);
                var4.method1174((byte) -32, (int) (Math.random() * 9.9999999E7D));
                var4.method1158((byte) 26, class71.field1167, class294.field4554);
                class106.field1642.field2532 = 0;
                class106.field1642.method1132((byte) 29, 24);
                class106.field1642.method1132((byte) 29, var4.field2532 + 2);
                class106.field1642.method1150(539, -628562744);
                class106.field1642.method1170(false, var4.field2532, 0, var4.field2500);
            }
        } else {
            class37.method310(1);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 80)
    public static void method1268(boolean arg0) {
        if (!arg0) {
            method1268(false);
        }
        field2690 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILkh;)V", line = 91)
    public static final void method1269(int arg0, class166 arg1) {
        field2689++;
        if (arg0 != 4096) {
            method1269(96, (class166) null);
        }
        while (true) {
            while (arg1.field2500.length > arg1.field2532) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1178(0) == 1) {
                    var3 = arg1.method1178(0);
                    var4 = arg1.method1178(0);
                    var2 = true;
                }
                int var5 = arg1.method1178(0);
                int var6 = arg1.method1178(arg0 ^ 0x1000);
                int var7 = var5 * 64 - class84.field1311;
                int var8 = class333.field5202 + class233.field3706 - var6 * 64 - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class313.field4863 > var7 + 63 && class233.field3706 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < (var3 * 8 + 8) && var12 >= var4 * 8 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg1.method1143(-127);
                                if (var13 != 0) {
                                    if (class89.field1432[var9][var10] == null) {
                                        class89.field1432[var9][var10] = new byte[4096];
                                    }
                                    class89.field1432[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1143(-108);
                                    if (class70.field1139[var9][var10] == null) {
                                        class70.field1139[var9][var10] = new byte[4096];
                                    }
                                    class70.field1139[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1143(-110);
                        if (var16 != 0) {
                            arg1.field2532++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I", line = 192)
    public static final int method1270(int arg0) {
        if (arg0 != 15) {
            method1270(-40);
        }
        field2696++;
        return 15;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)I")
    public abstract int method789(int arg0, byte arg1);

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(IB)[B")
    public abstract byte[] method788(int arg0, byte arg1);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)V")
    public abstract void method785(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Lqm;")
    public abstract class216 method775(int arg0);
}
