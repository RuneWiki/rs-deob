import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class149 extends class223 {

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field2207 = 20;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field2215 = 0;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public static int field2214 = 0;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "Lcc;")
    public static class222 field2217;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "[[[Lpc;")
    public static class22[][][] field2210;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIII)V")
    public static final void method1077(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg4;
        int var6 = 0;
        if (arg0 <= 7) {
            field2210 = null;
        }
        field2211++;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class47.method396(class184.field2914, arg3 + arg4, 73, class2.field42);
        int var10 = class47.method396(class184.field2914, arg3 - arg4, -109, class2.field42);
        class173.method1240((byte) -66, var9, class55.field872[arg2], arg1, var10);
        while (var6 < var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var5--;
                var7 -= var5 << 1;
                int var11 = arg2 - var5;
                int var12 = arg2 + var5;
                if (class112.field1727 <= var12 && class278.field4410 >= var11) {
                    int var13 = class47.method396(class184.field2914, arg3 + var6, 49, class2.field42);
                    int var14 = class47.method396(class184.field2914, arg3 - var6, 100, class2.field42);
                    if (var12 <= class278.field4410) {
                        class173.method1240((byte) -94, var13, class55.field872[var12], arg1, var14);
                    }
                    if (class112.field1727 <= var11) {
                        class173.method1240((byte) -76, var13, class55.field872[var11], arg1, var14);
                    }
                }
            }
            var6++;
            int var15 = arg2 - var6;
            int var16 = arg2 + var6;
            if (class112.field1727 <= var16 && var15 <= class278.field4410) {
                int var17 = class47.method396(class184.field2914, arg3 + var5, 118, class2.field42);
                int var18 = class47.method396(class184.field2914, arg3 - var5, 115, class2.field42);
                if (class278.field4410 >= var16) {
                    class173.method1240((byte) -53, var17, class55.field872[var16], arg1, var18);
                }
                if (class112.field1727 <= var15) {
                    class173.method1240((byte) -61, var17, class55.field872[var15], arg1, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)V")
    public static final void method1078(int arg0, byte arg1) {
        field2216++;
        class290.field4508.method1166((byte) 23, arg0);
        if (arg1 != 63) {
            field2213 = -41;
        }
        class126.field1897.method1166((byte) 23, arg0);
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(III)I")
    public static final int method1079(int arg0, int arg1, int arg2) {
        field2218++;
        int var3 = class23.method203(arg1 + arg2, 255, arg0 - 1) + (class23.method203(arg2 + 1, 255, arg0 - 1) - (-class23.method203(arg2 - 1, 255, arg0 + 1) - class23.method203(arg2 + 1, 255, arg0 + 1)));
        int var4 = class23.method203(arg2 - 1, arg1 + 256, arg0) + class23.method203(arg2 + 1, 255, arg0) - (-class23.method203(arg2, 255, arg0 + -1) - class23.method203(arg2, arg1 ^ 0xFFFFFF00, arg0 + 1));
        int var5 = class23.method203(arg2, 255, arg0);
        return var3 / 16 - (-(var4 / 8) - var5 / 4);
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field2210 = null;
        field2217 = null;
        if (arg0 != 24305) {
            field2214 = 114;
        }
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V")
    public static final void method1081(int arg0) {
        class122.field1840 = 0;
        class253.field4052 = 0;
        class266.method1781((byte) 85);
        class176.method1257(arg0 ^ arg0);
        field2205++;
        class203.method1428(-2);
        class60.method491(16);
        for (int var1 = 0; var1 < class253.field4052; var1++) {
            int var3 = class178.field2738[var1];
            if (class41.field686 != class233.field3682[var3].field4761) {
                if (class233.field3682[var3].field2031 > 0) {
                    class115.method847(class233.field3682[var3], -68);
                }
                class233.field3682[var3] = null;
            }
        }
        if (class95.field1528 != class183.field2900.field541) {
            throw new RuntimeException("gpp1 pos:" + class183.field2900.field541 + " psize:" + class95.field1528);
        }
        for (int var2 = 0; var2 < class259.field4112; var2++) {
            if (class233.field3682[class26.field455[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class259.field4112);
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BJ)V")
    public static final void method1082(byte arg0, long arg1) {
        if (class175.field2704 == 1 || class175.field2704 == 5) {
            class62.method498(arg1, -849415636);
        } else if (class175.field2704 == 2) {
            class188.method1344(0);
        } else {
            class114.method846(false);
        }
        field2209++;
        if (!class207.field3185) {
            class86.field1282[0] = 1005;
            class166.field2518[0] = class114.field1755;
            class14.field174 = 1;
            class68.field1082[0] = class291.field4522;
            if (class8.field127 != 0) {
                class121.field1831 = class9.field162;
                class9.field156 = class64.field1017;
            } else if (class68.field1075 == 0) {
                class9.field156 = class157.field2340;
                class121.field1831 = class171.field2587;
            } else {
                class121.field1831 = class73.field1126;
                class9.field156 = class240.field3829;
            }
            class148.field2196[0] = "";
        }
        class249.method1683((long) class41.field686);
        if (class298.field4803 != -1) {
            class74.method587(class298.field4803, 22608);
        }
        for (int var3 = 0; var3 < class126.field1895; var3++) {
            if (class247.field3933[var3]) {
                class112.field1729[var3] = true;
            }
            class186.field2926[var3] = class247.field3933[var3];
            class247.field3933[var3] = false;
        }
        class107.field1672 = null;
        class15.field180 = -1;
        class182.field2874 = class41.field686;
        if (arg0 < 91) {
            field2215 = -62;
        }
        class85.field1270 = -1;
        class215.field3291 = null;
        if (class298.field4803 != -1) {
            class126.field1895 = 0;
            class174.method1244(21098);
        }
        class66.method517();
        class75.method594((byte) -125);
        if (class207.field3185) {
            if (class284.field4471) {
                class30.method251((byte) -44);
            } else {
                class63.method506(true);
            }
        } else if (class107.field1672 != null) {
            class276.method1889(class107.field1672, class123.field1858, (byte) -119, class170.field2573);
        } else if (class15.field180 != -1) {
            class276.method1889((class222) null, class85.field1270, (byte) -77, class15.field180);
        }
        int var4 = class207.field3185 ? -1 : class7.method49((byte) 73);
        if (var4 == -1) {
            var4 = class166.field2516;
        }
        class194.method1389(26365, var4);
        if (class126.field1889 == 1) {
            class126.field1889 = 2;
        }
        if (class55.field866 == 1) {
            class55.field866 = 2;
        }
        if (class5.field79 == 3) {
            for (int var5 = 0; var5 < class126.field1895; var5++) {
                if (class186.field2926[var5]) {
                    class66.method520(class86.field1281[var5], class108.field1680[var5], class185.field2917[var5], class281.field4437[var5], 16711935, 128);
                } else if (class112.field1729[var5]) {
                    class66.method520(class86.field1281[var5], class108.field1680[var5], class185.field2917[var5], class281.field4437[var5], 16711680, 128);
                }
            }
        }
        class61.method495(class263.field4168.field4709, -73, class263.field4168.field4725, class209.field3230, class130.field1941);
        class209.field3230 = 0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 < 14) {
            method1078(-26, (byte) -84);
        }
        field2212++;
        return class106.field1662;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BII)I")
    public static final int method1083(byte arg0, int arg1, int arg2) {
        if (arg0 >= -62) {
            method1083((byte) -45, 40, -125);
        }
        field2208++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg1--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class149() {
        super(0, true);
    }
}
