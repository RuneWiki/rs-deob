import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class87 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Leh;")
    public static class47 field1857 = class195.method1282((byte) -4, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Leh;")
    private static class47 field1871 = class195.method1282((byte) -4, "Loading textures )2 ");

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Leh;")
    public static class47 field1868 = field1871;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lfd;")
    public static class52 field1862;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
    public static final void method709(boolean arg0, int arg1) {
        field1865++;
        int var2 = 80 % ((55 - arg1) / 35);
        for (int var3 = 0; var3 < class80.field1727; var3++) {
            long var4 = (long) class136.field2666[var3] << 32 | 0x20000000L;
            class72 var6 = class133.field2626[class136.field2666[var3]];
            if (var6 != null && var6.method280(-100) && arg0 == var6.field1547.field1095 && var6.field1547.method481(false)) {
                int var7 = var6.field3291 >> 7;
                int var8 = var6.field3281 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field3276 == 1 && (var6.field3291 & 0x7F) == 64 && (var6.field3281 & 0x7F) == 64) {
                        if (class130.field2553[var7][var8] == class53.field1033) {
                            continue;
                        }
                        class130.field2553[var7][var8] = class53.field1033;
                    }
                    if (!var6.field1547.field1067) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var6.field3301 = class39.method335((var6.field3276 - 1) * 64 + var6.field3291, class196.field3827, var6.field3281 + var6.field3276 * 64 - 64, 20896);
                    class74.method652(class196.field3827, var6.field3291, var6.field3281, var6.field3301, (var6.field3276 - 1) * 64 + 60, var6, var6.field3286, var4, var6.field3333);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lgf;I)Lgf;")
    public static final class61 method710(class61 arg0, int arg1) {
        field1861++;
        class61 var2 = class110.method882((byte) -104, arg0);
        if (var2 == null) {
            var2 = arg0.field1247;
        }
        if (arg1 > -85) {
            method719(-91, (byte) 120);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Leh;Leh;Lah;I)[Lfb;")
    public static final class50[] method711(class47 arg0, class47 arg1, class9 arg2, int arg3) {
        field1863++;
        int var4 = arg2.method75(arg1, 31499);
        int var5 = arg2.method77(arg0, var4, true);
        return arg3 == -12568 ? class108.method874(arg2, arg3 ^ 0xFFFFCEE9, var4, var5) : null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)V")
    public static final void method712(int arg0, int arg1, int arg2, int arg3) {
        class152 var4 = class173.field3351[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class117 var5 = var4.field2990;
        if (var5 != null) {
            var5.field2375 = var5.field2375 * arg3 / 16;
            var5.field2378 = var5.field2378 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Li;")
    public static final class73 method713(int arg0, int arg1) {
        class73 var2 = (class73) class200.field3896.method986((byte) 50, (long) arg1);
        int var3 = -98 % ((arg0 - 82) / 32);
        field1855++;
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class14.field298.method67(10, -1, arg1);
        class73 var5 = new class73();
        var5.field1571 = arg1;
        if (var4 != null) {
            var5.method639(new class68(var4), false);
        }
        var5.method635(false);
        if (var5.field1601 != -1) {
            var5.method643(method713(114, var5.field1598), (byte) -127, method713(20, var5.field1601));
        }
        if (!class12.field230 && var5.field1582) {
            var5.field1584 = null;
            var5.field1563 = class161.field3123;
            var5.field1593 = null;
            var5.field1599 = 0;
            var5.field1613 = false;
        }
        class200.field3896.method987((long) arg1, var5, 28842);
        return var5;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method714(int arg0) {
        if (arg0 != 0) {
            method717(-88, -11, null, (byte) 50);
        }
        field1869++;
        try {
            if (class9.field211 == 1) {
                int var1 = class181.field3468.method785(106);
                if (var1 > 0 && class181.field3468.method770(2)) {
                    int var2 = var1 - class148.field2893;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class181.field3468.method760((byte) 28, var2);
                } else {
                    class181.field3468.method792((byte) -36);
                    class181.field3468.method767(-10840);
                    client.field537 = null;
                    if (class86.field1848 == null) {
                        class9.field211 = 0;
                    } else {
                        class9.field211 = 2;
                    }
                    class204.field4013 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class181.field3468.method792((byte) -80);
            class86.field1848 = null;
            client.field537 = null;
            class9.field211 = 0;
            class204.field4013 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)[B")
    public static final synchronized byte[] method715(int arg0, int arg1) {
        field1859++;
        if (arg0 == 100 && class36.field714 > 0) {
            byte[] var2 = class21.field393[--class36.field714];
            class21.field393[class36.field714] = null;
            return var2;
        } else if (arg0 == 5000 && class6.field108 > 0) {
            byte[] var3 = class110.field2274[--class6.field108];
            class110.field2274[class6.field108] = null;
            return var3;
        } else if (arg0 == 30000 && class205.field4044 > 0) {
            byte[] var4 = class117.field2384[--class205.field4044];
            class117.field2384[class205.field4044] = null;
            return var4;
        } else {
            if (arg1 != 0) {
                method711(null, null, null, -97);
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static void method716(int arg0) {
        field1871 = null;
        field1862 = null;
        field1868 = null;
        if (arg0 == -1) {
            field1857 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILdb;B)V")
    public static final void method717(int arg0, int arg1, class32 arg2, byte arg3) {
        field1870++;
        if (arg3 >= -48) {
            method712(-30, 50, 49, 16);
        }
        if (arg2.field3330 == arg0 && arg0 != -1) {
            int var4 = class25.method236(false, arg0).field442;
            if (var4 == 1) {
                arg2.field3336 = 0;
                arg2.field3290 = 0;
                arg2.field3329 = arg1;
                arg2.field3305 = 0;
            }
            if (var4 == 2) {
                arg2.field3336 = 0;
            }
        } else if (arg0 == -1 || arg2.field3330 == -1 || class25.method236(false, arg0).field420 >= class25.method236(false, arg2.field3330).field420) {
            arg2.field3300 = arg2.field3272;
            arg2.field3305 = 0;
            arg2.field3329 = arg1;
            arg2.field3330 = arg0;
            arg2.field3290 = 0;
            arg2.field3336 = 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static final void method718(byte arg0) {
        field1860++;
        if (!class78.field1688) {
            return;
        }
        class61 var1 = class32.method278((byte) -125, class44.field889, class201.field3917);
        if (var1 != null && var1.field1255 != null) {
            class43 var2 = new class43();
            var2.field859 = var1;
            var2.field871 = var1.field1255;
            class188.method1242(var2, arg0 ^ 0xFFFFFFE2);
        }
        class78.field1688 = false;
        class20.method204(var1, (byte) -5);
        if (arg0 != -107) {
            field1871 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Lne;")
    public static final class122 method719(int arg0, byte arg1) {
        field1854++;
        if (arg1 != 7) {
            method709(true, 87);
        }
        class122 var2 = (class122) class165.field3202.method986((byte) 50, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class103.field2164.method67(8, arg1 ^ 0xFFFFFFF8, arg0);
        class122 var4 = new class122();
        if (var3 != null) {
            var4.method938(new class68(var3), 0);
        }
        class165.field3202.method987((long) arg0, var4, 28842);
        return var4;
    }
}
