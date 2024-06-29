import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class85 {

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "[I")
    public static int[] field1481 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static volatile int field1486 = -1;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public int field1484;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public int field1487;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Z")
    public static final boolean method526(byte arg0) {
        field1476++;
        class70 var1 = class57.field964;
        synchronized (class57.field964) {
            if (class70.field1175 == class147.field2721) {
                return false;
            } else if (arg0 >= -76) {
                return false;
            } else {
                class191.field3536 = class96.field1811[class70.field1175];
                class209.field3814 = class71.field1188[class70.field1175];
                class70.field1175 = class70.field1175 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method527(int arg0) {
        field1481 = null;
        if (arg0 != 2048) {
            method527(28);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Laf;B)V")
    public static final void method528(class7 arg0, byte arg1) {
        field1485++;
        if (arg0.field67 != null) {
            arg0.field67.field3291 = 0;
        }
        arg0.field68 = false;
        if (arg1 != -118) {
            field1486 = 102;
        }
        for (class7 var2 = arg0.method25(); var2 != null; var2 = arg0.method24()) {
            method528(var2, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static final void method529(int arg0) {
        int var1 = class227.field4108 * 128 + 64;
        int var2 = class162.field2938 * 128 + 64;
        field1475++;
        int var3 = class195.method1239(var1, class139.field2615, false, var2) - class104.field1952;
        if (var2 > class47.field814) {
            class47.field814 += (var2 - class47.field814) * class11.field134 / 1000 + class108.field2046;
            if (class47.field814 > var2) {
                class47.field814 = var2;
            }
        }
        if (var3 > class140.field2629) {
            class140.field2629 += (var3 - class140.field2629) * class11.field134 / 1000 + class108.field2046;
            if (class140.field2629 > var3) {
                class140.field2629 = var3;
            }
        }
        if (var3 < class140.field2629) {
            class140.field2629 -= (class140.field2629 - var3) * class11.field134 / 1000 + class108.field2046;
            if (class140.field2629 < var3) {
                class140.field2629 = var3;
            }
        }
        if (var1 > client.field545) {
            client.field545 += (var1 - client.field545) * class11.field134 / 1000 + class108.field2046;
            if (client.field545 > var1) {
                client.field545 = var1;
            }
        }
        if (client.field545 > var1) {
            client.field545 -= (client.field545 - var1) * class11.field134 / 1000 + class108.field2046;
            if (var1 > client.field545) {
                client.field545 = var1;
            }
        }
        if (var2 < class47.field814) {
            class47.field814 -= (class47.field814 - var2) * class11.field134 / 1000 + class108.field2046;
            if (var2 > class47.field814) {
                class47.field814 = var2;
            }
        }
        int var4 = class27.field431 * 128 + 64;
        int var5 = class122.field2274 * 128 + 64;
        int var6 = class195.method1239(var5, class139.field2615, false, var4) - class77.field1336;
        int var7 = var4 - class47.field814;
        int var8 = var6 - class140.field2629;
        int var9 = var5 - client.field545;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & arg0;
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var9)) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var13 = var12 - class234.field4215;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class234.field4215 += class187.field3462 * var13 / 1000 + class192.field3583;
            class234.field4215 &= 0x7FF;
        }
        if (class64.field1064 < var11) {
            class64.field1064 += (var11 - class64.field1064) * class187.field3462 / 1000 + class192.field3583;
            if (var11 < class64.field1064) {
                class64.field1064 = var11;
            }
        }
        if (var13 < 0) {
            class234.field4215 -= -var13 * class187.field3462 / 1000 + class192.field3583;
            class234.field4215 &= 0x7FF;
        }
        if (var11 < class64.field1064) {
            class64.field1064 -= (class64.field1064 - var11) * class187.field3462 / 1000 + class192.field3583;
            if (var11 > class64.field1064) {
                class64.field1064 = var11;
            }
        }
        int var14 = var12 - class234.field4215;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class234.field4215 = var12;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
    public abstract void method530(int arg0, int arg1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)I")
    public static final int method531(int arg0, byte arg1, int arg2) {
        int var3 = -53 % ((arg1 + 33) / 55);
        long var4 = (long) ((arg0 << 16) + arg2);
        field1477++;
        return class37.field608 != null && class37.field608.field2760 == var4 ? class230.field4150.field2133 * 99 / (class230.field4150.field2157.length - class37.field608.field3683) + 1 : 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
    public abstract void method532(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lmb;I)V")
    public static final void method533(class132 arg0, int arg1) {
        field1488++;
        if (class169.field3148 >= 2) {
            if (arg0.method882(24493, class71.field1195)) {
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class169.method1108(-117, class187.method1197(new class132[] { class139.field2606, class132.method889(var4, (byte) 102), class56.field952 }, -124), 0, null);
            }
            if (arg0.method882(24493, class2.field13)) {
                class171.method1117(arg1 - 9355);
            }
            if (arg0.method882(24493, class72.field1210)) {
                class152.field2782 = true;
            }
            if (arg0.method882(arg1 + 24429, class128.field2378)) {
                class152.field2782 = false;
            }
            arg0.method882(24493, class93.field1634);
            arg0.method882(24493, class92.field1630);
            if (arg0.method882(24493, class24.field349)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class182.field3351[var5].field3853[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method904(class47.field812, true) && class211.field3871 != 0) {
                class229.method1459(arg0.method873((byte) 58, 6).method877(-32026), arg1 ^ 0xFFFFF1D2);
            }
            if (arg0.method882(24493, class157.field2853) && class211.field3871 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method904(class231.field4155, true)) {
                class205.field3757 = arg0.method873((byte) 58, 12).method870((byte) 125).method877(-32026);
                class169.method1108(-99, class187.method1197(new class132[] { class174.field3250, class132.method889(class205.field3757, (byte) 94) }, arg1 - 184), 0, null);
            }
            if (arg0.method882(arg1 ^ 0x5FED, class2.field28)) {
                class191.field3555 = true;
            }
        }
        class122.field2287++;
        class64.field1054.method660(21, 3);
        if (arg1 == 64) {
            class64.field1054.method747(arg0.method902((byte) -4) - 1, (byte) -119);
            class64.field1054.method722(arg0.method873((byte) 58, 2), -1607065512);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)J")
    public static final long method534(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        return var3 == null || var3.field3098 == null ? 0L : var3.field3098.field3439;
    }
}
