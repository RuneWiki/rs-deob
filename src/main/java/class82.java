import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class82 {

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lpb;")
    private class91 field1855 = null;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Lpb;")
    private class91 field1858 = null;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    private int field1862 = 65000;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    private int field1853;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lgd;")
    public static class40 field1851 = class14.method90(false, "mod_icons");

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field1854 = 0;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field1852 = 0;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lgd;")
    private static class40 field1846 = class14.method90(false, "Existing user");

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lgd;")
    public static class40 field1848 = field1846;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field1856 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "[I")
    public static int[] field1860;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 4)
    public static void method542(int arg0) {
        field1846 = null;
        field1851 = null;
        field1860 = null;
        field1848 = null;
        if (arg0 < 113) {
            method544(103);
        }
    }

    @OriginalMember(owner = "client!nd", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field1845++;
        return "Cache:" + this.field1853;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[B", line = 35)
    public final byte[] method543(int arg0, int arg1) {
        field1850++;
        if (arg0 >= -2) {
            method544(124);
        }
        class91 var3 = this.field1858;
        synchronized (this.field1858) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field1855.method607((byte) -94)) {
                    return null;
                }
                this.field1855.method611((long) (arg1 * 6), (byte) -84);
                this.field1855.method614(class56.field1449, 6, 0, 127);
                int var5 = (class56.field1449[2] & 0xFF) + ((class56.field1449[0] & 0xFF) << 16) + ((class56.field1449[1] & 0xFF) << 8);
                int var6 = (class56.field1449[5] & 0xFF) + (((class56.field1449[3] & 0xFF) << 16) + ((class56.field1449[4] & 0xFF) << 8));
                if (var5 < 0 || this.field1862 < var5) {
                    return null;
                } else if (var6 > 0 && this.field1858.method607((byte) -30) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1858.method611((long) (var6 * 520), (byte) -93);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1858.method614(class56.field1449, var13 + 8, 0, 127);
                        int var14 = ((class56.field1449[0] & 0xFF) << 8) + (class56.field1449[1] & 0xFF);
                        int var15 = ((class56.field1449[2] & 0xFF) << 8) + (class56.field1449[3] & 0xFF);
                        int var16 = ((class56.field1449[5] & 0xFF) << 8) + ((class56.field1449[4] & 0xFF) << 16) + (class56.field1449[6] & 0xFF);
                        int var17 = class56.field1449[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field1853 == var17) {
                            if (var16 >= 0 && this.field1858.method607((byte) -98) / 520L >= (long) var16) {
                                var6 = var16;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label72;
                                    }
                                    var9[var10++] = class56.field1449[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 118)
    public static final void method544(int arg0) {
        class55.field1405 = 0;
        if (arg0 != -5873) {
            return;
        }
        field1864++;
        int var1 = (class13.field332.field792 >> 7) + class125.field2961;
        int var2 = (class13.field332.field838 >> 7) + class128.field3022;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class55.field1405 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class55.field1405 = 1;
        }
        if (class55.field1405 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class55.field1405 = 0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 148)
    public static final void method545(byte arg0) {
        field1863++;
        class118 var1 = class65.field1590;
        synchronized (class65.field1590) {
            class106.field2572 = class126.field3012;
            if (arg0 > -18) {
                method545((byte) 106);
            }
            class40.field1001 = class53.field1357;
            class135.field3282 = class12.field316;
            class80.field1841 = class55.field1428;
            class132.field3191 = class13.field324;
            class90.field2041 = class41.field1023;
            class38.field941 = class22.field509;
            class55.field1428 = 0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(ILpb;Lpb;I)V", line = 452)
    public class82(int arg0, class91 arg1, class91 arg2, int arg3) {
        this.field1862 = arg3;
        this.field1858 = arg1;
        this.field1855 = arg2;
        this.field1853 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[BB)Z", line = 199)
    public final boolean method546(int arg0, int arg1, byte[] arg2, byte arg3) {
        field1859++;
        class91 var5 = this.field1858;
        synchronized (this.field1858) {
            if (arg1 < 0 || arg1 > this.field1862) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method549(arg2, (byte) -99, arg0, true, arg1);
            if (arg3 >= -59) {
                field1848 = null;
            }
            if (!var6) {
                var6 = this.method549(arg2, (byte) -128, arg0, false, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(JI)V", line = 232)
    public static final void method547(long arg0, int arg1) {
        field1861++;
        if (arg1 >= -39) {
            field1851 = null;
        }
        if (arg0 == 0L) {
            return;
        }
        if (class7.field181 >= 100 && class89.field2008 != 1 || class7.field181 >= 200) {
            class77.method521(class125.field2966, client.field472, false, 0);
            return;
        }
        class40 var3 = class64.method463(arg0, (byte) -99).method244(0);
        for (int var4 = 0; var4 < class7.field181; var4++) {
            if (class104.field2539[var4] == arg0) {
                class77.method521(class125.field2966, client.method114(true, new class40[] { var3, class13.field323 }), false, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class42.field1065; var5++) {
            if (class67.field1657[var5] == arg0) {
                class77.method521(class125.field2966, client.method114(true, new class40[] { class85.field1888, var3, class7.field189 }), false, 0);
                return;
            }
        }
        if (var3.method269(class13.field332.field2210, -62)) {
            return;
        }
        class63.field1542++;
        class7.field178[class7.field181] = var3;
        class104.field2539[class7.field181] = arg0;
        class77.field1771[class7.field181] = 0;
        class7.field181++;
        class45.field1124 = true;
        class92.field2094.method290((byte) 0, 44);
        class92.field2094.method793(arg0, false);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)I", line = 305)
    public static final int method548(byte arg0) {
        if (arg0 <= 62) {
            field1854 = -30;
        }
        field1857++;
        int var1 = class58.method439(class24.field573, class64.field1561, false, class99.field2361);
        return var1 - class113.field2735 >= 800 || (class112.field2716[class99.field2361][class64.field1561 >> 7][class24.field573 >> 7] & 0x4) == 0 ? 3 : class99.field2361;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([BBIZI)Z", line = 326)
    private final boolean method549(byte[] arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field1849++;
        class91 var6 = this.field1858;
        synchronized (this.field1858) {
            try {
                int var7;
                if (arg3) {
                    if ((long) (arg2 * 6 + 6) > this.field1855.method607((byte) -86)) {
                        return false;
                    }
                    this.field1855.method611((long) (arg2 * 6), (byte) -87);
                    this.field1855.method614(class56.field1449, 6, 0, 127);
                    var7 = ((class56.field1449[3] & 0xFF) << 16) + ((class56.field1449[4] & 0xFF) << 8) + (class56.field1449[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field1858.method607((byte) -50) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1858.method607((byte) -118) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class56.field1449[0] = (byte) (arg4 >> 16);
                class56.field1449[1] = (byte) (arg4 >> 8);
                class56.field1449[2] = (byte) arg4;
                int var10 = 0;
                class56.field1449[3] = (byte) (var7 >> 16);
                if (arg1 >= -97) {
                    method548((byte) 122);
                }
                int var11 = 0;
                class56.field1449[4] = (byte) (var7 >> 8);
                class56.field1449[5] = (byte) var7;
                this.field1855.method611((long) (arg2 * 6), (byte) -102);
                this.field1855.method615(0, 6, 1173679576, class56.field1449);
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg3) {
                        label108: {
                            this.field1858.method611((long) (var7 * 520), (byte) -87);
                            try {
                                this.field1858.method614(class56.field1449, 8, 0, 126);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class56.field1449[6] & 0xFF) + ((class56.field1449[5] & 0xFF) << 8) + ((class56.field1449[4] & 0xFF) << 16);
                            int var13 = ((class56.field1449[0] & 0xFF) << 8) + (class56.field1449[1] & 0xFF);
                            int var14 = ((class56.field1449[2] & 0xFF) << 8) + (class56.field1449[3] & 0xFF);
                            int var15 = class56.field1449[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field1853 == var15) {
                                if (var12 >= 0 && this.field1858.method607((byte) -114) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg3 = false;
                        var12 = (int) ((this.field1858.method607((byte) -120) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class56.field1449[0] = (byte) (arg2 >> 8);
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    int var18 = arg4 - var10;
                    class56.field1449[1] = (byte) arg2;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class56.field1449[2] = (byte) (var11 >> 8);
                    class56.field1449[3] = (byte) var11;
                    var11++;
                    class56.field1449[4] = (byte) (var12 >> 16);
                    class56.field1449[5] = (byte) (var12 >> 8);
                    class56.field1449[6] = (byte) var12;
                    class56.field1449[7] = (byte) this.field1853;
                    this.field1858.method611((long) (var7 * 520), (byte) -123);
                    this.field1858.method615(0, 8, 1173679576, class56.field1449);
                    var7 = var12;
                    this.field1858.method615(var10, var18, 1173679576, arg0);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }
}
