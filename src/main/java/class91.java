import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class91 extends class273 {

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
    private int field1859 = 0;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "I")
    private int field1858 = 4096;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "Ljd;")
    public static class86 field1857 = class122.method868("Titelbild geladen)3", true);

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "Z")
    public static boolean field1854 = false;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "Lwj;")
    public static class6 field1855 = null;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "[I")
    public static int[] field1853 = new int[50];

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "Ljd;")
    private static class86 field1864 = class122.method868("Prepared sound engine", true);

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "Ljd;")
    public static class86 field1851 = field1864;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "Lwj;")
    public static class6 field1860;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "Ljava/lang/String;")
    public static String field1852;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public static void method675(boolean arg0) {
        field1864 = null;
        field1855 = null;
        field1853 = null;
        field1860 = null;
        field1851 = null;
        if (arg0) {
            field1857 = null;
        }
        field1852 = null;
        field1857 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZIIIIIII)V")
    public static final void method676(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1862;
        if (!arg1) {
            field1852 = null;
        }
        if (class179.method1258(arg5, (byte) -36)) {
            class216.field3901 = null;
            class249.method1685(arg0, class108.field2070[arg5], arg2, arg7, (byte) -84, arg3, arg8, arg4, -1, arg6);
            if (class216.field3901 != null) {
                class249.method1685(arg0, class216.field3901, arg2, arg7, (byte) -84, arg3, class142.field2696, class209.field3788, -1412584499, arg6);
                class216.field3901 = null;
            }
        } else if (arg2 != -1) {
            class21.field540[arg2] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class21.field540[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class91() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IJ)V")
    public static final void method677(int arg0, long arg1) {
        ++field1850;
        if (arg1 > 0L) {
            if (arg1 % 10L != (long) arg0) {
                class73.method538(arg1, 90);
            } else {
                class73.method538(arg1 + -1L, 123);
                class73.method538(1L, 125);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)I")
    public static final int method678(boolean arg0, int arg1) {
        ++field1865;
        int var2 = (246 & arg1) >> 6;
        if (!arg0) {
            field1864 = null;
        }
        int var3 = arg1 & 63;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (~var2 == -2) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (~var2 == -1) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (~var2 == -3) {
                return 64;
            }
            if (~var2 == -4) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field1863;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field1858 = arg1.method1410(-52);
            }
        } else {
            this.field1859 = arg1.method1410(-58);
        }
        if (arg2 > -16) {
            method677(42, 16L);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V")
    public static final void method679(int arg0, boolean arg1) {
        class161 var2 = class204.method1456(!arg1, 12, arg0);
        if (!arg1) {
            var2.method1173(true);
            ++field1848;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field1861;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (arg0 != -7420) {
            method680(-127);
        }
        if (super.field4800.field3160) {
            int[] var4 = this.method1863(-111, 0, arg1);
            for (int var5 = 0; var5 < class176.field3200; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field1859 && var6 <= this.field1858 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
    public static final void method680(int arg0) {
        ++field1856;
        try {
            if (~class45.field1007 == -2) {
                int var1 = class253.field4504.method316((byte) 48);
                if (~var1 < -1 && class253.field4504.method317((byte) 115)) {
                    int var2 = var1 - class83.field1622;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class253.field4504.method308(var2, 27517);
                    return;
                }
                class253.field4504.method294((byte) 41);
                class253.field4504.method299(256);
                class221.field3965 = null;
                class12.field392 = null;
                if (class187.field3315 == null) {
                    class45.field1007 = 0;
                } else {
                    class45.field1007 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class253.field4504.method294((byte) 45);
            class187.field3315 = null;
            class12.field392 = null;
            class221.field3965 = null;
            class45.field1007 = 0;
        }
        if (arg0 != -11344) {
            method680(105);
        }
    }
}
