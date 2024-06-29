import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class244 extends class61 {

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public int field4189;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "[I")
    public static int[] field4196 = new int[500];

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field4190 = 0;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "[I")
    public static int[] field4198 = new int[5];

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "[I")
    public static int[] field4191;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLoa;III)V")
    public static final void method1699(boolean arg0, class97 arg1, int arg2, int arg3, int arg4) {
        field4197++;
        if (class186.field3266 >= 400) {
            return;
        }
        if (arg1.field1787 != null) {
            arg1 = arg1.method825((byte) -31);
        }
        if (arg1 == null || !arg1.field1741) {
            return;
        }
        class230 var5 = arg1.field1753;
        if (arg1.field1789 != 0) {
            var5 = class173.method1267((byte) 59, new class230[] { var5, class56.method473(-12053, arg1.field1789, class56.field1033.field4602), class114.field2036, class183.field3211, class37.method340(arg1.field1789, (byte) -26), class145.field2606 });
        }
        if (class196.field3513 == 1) {
            class160.method1208(class173.method1267((byte) 59, new class230[] { class153.field2730, class169.field2994, var5 }), (long) arg2, -6600, class275.field4832, arg4, arg3, (short) 49);
            class232.field4025++;
        } else if (!class184.field3231) {
            class240.field4147++;
            class230[] var6 = arg1.field1757;
            if (class214.field3718) {
                var6 = class173.method1265(1515, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class144.field2580 != 0 || !var6[var7].method1612((byte) 15, class88.field1535))) {
                        byte var8 = 0;
                        class107.field1932++;
                        if (var7 == 0) {
                            var8 = 35;
                        }
                        if (var7 == 1) {
                            var8 = 39;
                        }
                        if (var7 == 2) {
                            var8 = 57;
                        }
                        if (var7 == 3) {
                            var8 = 8;
                        }
                        if (var7 == 4) {
                            var8 = 4;
                        }
                        class160.method1208(class173.method1267((byte) 59, new class230[] { class28.field522, var5 }), (long) arg2, -6600, var6[var7], arg4, arg3, var8);
                    }
                }
            }
            if (class144.field2580 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1612((byte) 15, class88.field1535)) {
                        client.field2709++;
                        short var10 = 0;
                        if (arg1.field1789 > class56.field1033.field4602) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 35;
                        }
                        if (var9 == 1) {
                            var11 = 39;
                        }
                        if (var9 == 2) {
                            var11 = 57;
                        }
                        if (var9 == 3) {
                            var11 = 8;
                        }
                        if (var9 == 4) {
                            var11 = 4;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class160.method1208(class173.method1267((byte) 59, new class230[] { class28.field522, var5 }), (long) arg2, -6600, var6[var9], arg4, arg3, var11);
                    }
                }
            }
            class160.method1208(class173.method1267((byte) 59, new class230[] { class28.field522, var5 }), (long) arg2, -6600, class177.field3117, arg4, arg3, (short) 1002);
        } else if ((class138.field2475 & 0x2) == 2) {
            class39.field716++;
            class160.method1208(class173.method1267((byte) 59, new class230[] { class44.field792, class169.field2994, var5 }), (long) arg2, -6600, class68.field1275, arg4, arg3, (short) 6);
        }
        if (arg0) {
            field4193 = 31;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class244() {
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
    public static final void method1700(int arg0, int arg1, int arg2) {
        class267.field4748 = true;
        class89.field1572 = arg0;
        class219.field3772 = arg1;
        class95.field1721 = arg2;
        client.field2718 = -1;
        class37.field694 = -1;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(II)Lbc;")
    public static final class170 method1701(int arg0, int arg1) {
        field4195++;
        class170 var2 = (class170) class133.field2404.method273((long) arg1, 255);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 18555) {
            byte[] var3 = class265.field4708.method1546(arg1, (byte) -100, 26);
            class170 var4 = new class170();
            if (var3 != null) {
                var4.method1251(new class14(var3), true);
            }
            class133.field2404.method276(var4, (long) arg1, arg0 ^ 0xFFFFB7CC);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([II)[I")
    public static final int[] method1702(int[] arg0, int arg1) {
        field4192++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        if (arg1 != -22352) {
            method1700(11, 47, 101);
        }
        class43.method377(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public static void method1703(int arg0) {
        field4198 = null;
        field4191 = null;
        if (arg0 == -4037) {
            field4196 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I)V")
    public class244(int arg0) {
        this.field4189 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)Lec;")
    public static final class23 method1704(byte arg0) {
        field4194++;
        class6.field85 = 0;
        int var1 = -62 % ((-arg0 - 10) / 53);
        return class225.method1552(true);
    }
}
