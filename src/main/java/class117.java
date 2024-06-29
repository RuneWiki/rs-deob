import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class117 {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field1908 = 0;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lwc;")
    public static class232 field1905 = new class232(200);

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lqe;")
    private static class168 field1913 = class66.method448("Loading sprites )2 ", -112);

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lqe;")
    public static class168 field1911 = null;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field1912 = 0;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lqe;")
    public static class168 field1910 = field1913;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I")
    public static final int method798(int arg0, byte arg1) {
        field1907++;
        int var2 = 88 % ((16 - arg1) / 34);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method799(int arg0) {
        field1905 = null;
        field1910 = null;
        field1911 = null;
        field1913 = null;
        if (arg0 != 200) {
            field1910 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()V")
    public static final void method800() {
        int var0 = class134.field2340[class6.field69];
        class77[] var1 = class134.field2341[class6.field69];
        class169.field2928 = 0;
        label191: for (int var2 = 0; var2 < var0; var2++) {
            class77 var3 = var1[var2];
            if (class73.field1111 != null) {
                for (int var4 = 0; var4 < class73.field1111.length; var4++) {
                    if (class73.field1111[var4] != -1000000 && (var3.field1159 <= class73.field1111[var4] || var3.field1169 <= class73.field1111[var4]) && (var3.field1157 <= class192.field3348[var4] || var3.field1150 <= class192.field3348[var4]) && (var3.field1157 >= class148.field2584[var4] || var3.field1150 >= class148.field2584[var4]) && (var3.field1154 <= class190.field3304[var4] || var3.field1145 <= class190.field3304[var4]) && (var3.field1154 >= class238.field4075[var4] || var3.field1145 >= class238.field4075[var4])) {
                        continue label191;
                    }
                }
            }
            if (var3.field1165 == 1) {
                int var5 = var3.field1149 + class84.field1280 - class193.field3371;
                if (var5 >= 0 && var5 <= class84.field1280 + class84.field1280) {
                    int var6 = var3.field1153 + class84.field1280 - class62.field848;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = var3.field1163 + class84.field1280 - class62.field848;
                    if (var7 > class84.field1280 + class84.field1280) {
                        var7 = class84.field1280 + class84.field1280;
                    }
                    boolean var8 = false;
                    while (var6 <= var7) {
                        if (class197.field3416[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        int var9 = class108.field1739 - var3.field1157;
                        if (var9 > 32) {
                            var3.field1156 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }
                            var3.field1156 = 2;
                            var9 = -var9;
                        }
                        var3.field1148 = (var3.field1154 - class102.field1648 << 8) / var9;
                        var3.field1160 = (var3.field1145 - class102.field1648 << 8) / var9;
                        var3.field1161 = (var3.field1159 - class45.field588 << 8) / var9;
                        var3.field1146 = (var3.field1169 - class45.field588 << 8) / var9;
                        class197.field3417[class169.field2928++] = var3;
                    }
                }
            } else if (var3.field1165 == 2) {
                int var10 = var3.field1153 + class84.field1280 - class62.field848;
                if (var10 >= 0 && var10 <= class84.field1280 + class84.field1280) {
                    int var11 = var3.field1149 + class84.field1280 - class193.field3371;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = var3.field1170 + class84.field1280 - class193.field3371;
                    if (var12 > class84.field1280 + class84.field1280) {
                        var12 = class84.field1280 + class84.field1280;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class197.field3416[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        int var14 = class102.field1648 - var3.field1154;
                        if (var14 > 32) {
                            var3.field1156 = 3;
                        } else {
                            if (var14 >= -32) {
                                continue;
                            }
                            var3.field1156 = 4;
                            var14 = -var14;
                        }
                        var3.field1155 = (var3.field1157 - class108.field1739 << 8) / var14;
                        var3.field1151 = (var3.field1150 - class108.field1739 << 8) / var14;
                        var3.field1161 = (var3.field1159 - class45.field588 << 8) / var14;
                        var3.field1146 = (var3.field1169 - class45.field588 << 8) / var14;
                        class197.field3417[class169.field2928++] = var3;
                    }
                }
            } else if (var3.field1165 == 4) {
                int var15 = var3.field1159 - class45.field588;
                if (var15 > 128) {
                    int var16 = var3.field1153 + class84.field1280 - class62.field848;
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    int var17 = var3.field1163 + class84.field1280 - class62.field848;
                    if (var17 > class84.field1280 + class84.field1280) {
                        var17 = class84.field1280 + class84.field1280;
                    }
                    if (var16 <= var17) {
                        int var18 = var3.field1149 + class84.field1280 - class193.field3371;
                        if (var18 < 0) {
                            var18 = 0;
                        }
                        int var19 = var3.field1170 + class84.field1280 - class193.field3371;
                        if (var19 > class84.field1280 + class84.field1280) {
                            var19 = class84.field1280 + class84.field1280;
                        }
                        boolean var20 = false;
                        label163: for (int var21 = var18; var21 <= var19; var21++) {
                            for (int var22 = var16; var22 <= var17; var22++) {
                                if (class197.field3416[var21][var22]) {
                                    var20 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var20) {
                            var3.field1156 = 5;
                            var3.field1155 = (var3.field1157 - class108.field1739 << 8) / var15;
                            var3.field1151 = (var3.field1150 - class108.field1739 << 8) / var15;
                            var3.field1148 = (var3.field1154 - class102.field1648 << 8) / var15;
                            var3.field1160 = (var3.field1145 - class102.field1648 << 8) / var15;
                            class197.field3417[class169.field2928++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static final void method801(int arg0) {
        field1904++;
        class114.field1858.method1497((byte) 109);
        class6.field66.method14(false);
        if (arg0 != 18067) {
            method801(-85);
        }
        class148.field2575.method1497((byte) 117);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lv;")
    public static final class110 method802(int arg0, int arg1) {
        class110 var2 = (class110) class197.field3412.method1499(arg0, (long) arg1);
        field1903++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class150.field2615.method1712(class46.method303(arg1, (byte) 97), class25.method167(arg1, (byte) 110), -1);
        class110 var4 = new class110();
        if (var3 != null) {
            var4.method713(new class112(var3), (byte) 16);
        }
        class197.field3412.method1502((byte) -18, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLoe;)V")
    public static final void method803(byte arg0, class256 arg1) {
        field1906++;
        class110.field1765 = arg1;
        if (arg0 != -54) {
            method798(127, (byte) 36);
        }
        class242.field4177 = class110.field1765.method1694(4, arg0 + 28905);
    }
}
