import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class58 {

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    private int field856 = 0;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[Lqi;")
    public class137[] field831;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[J")
    public static long[] field836 = new long[100];

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field832 = 0;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[I")
    public static int[] field847 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!i", name = "y", descriptor = "[I")
    public static int[] field855 = new int[32];

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "J")
    private long field851;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Lqi;")
    private class137 field837;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "Lqi;")
    private class137 field854;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
    public static int[] field833;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method367(int arg0) {
        field845++;
        if (class262.field4270 < class262.field4269) {
            class262.field4270 = (float) ((double) class262.field4270 / 30.0D + (double) class262.field4270);
            if (class262.field4269 < class262.field4270) {
                class262.field4270 = class262.field4269;
            }
            class66.method441(arg0 + 52);
        } else if (class262.field4270 > class262.field4269) {
            class262.field4270 = (float) ((double) class262.field4270 - (double) class262.field4270 / 30.0D);
            if (class262.field4270 < class262.field4269) {
                class262.field4270 = class262.field4269;
            }
            class66.method441(arg0 ^ 0x70);
        }
        if (class208.field3314 != -1 && class16.field305 != -1) {
            int var1 = class208.field3314 - class249.field4095;
            int var2 = class16.field305 - class45.field667;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class249.field4095 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class45.field667 -= -var2;
            if (var1 == 0 && var2 == 0) {
                class208.field3314 = -1;
                class16.field305 = -1;
            }
            class66.method441(arg0 ^ 0xFFFFFF86);
        }
        if (~class108.field1685 >= arg0) {
            class4.field104 = -1;
            class66.field1081 = -1;
        } else {
            client.field2660--;
            if (client.field2660 == 0) {
                class108.field1685--;
                client.field2660 = 100;
            }
        }
        if (!class55.field813 || class102.field1621 == null) {
            return;
        }
        for (class51 var3 = (class51) class102.field1621.method1553(true); var3 != null; var3 = (class51) class102.field1621.method1551(0)) {
            class125 var4 = class223.method1550((byte) -119, var3.field735.field1877);
            if (class154.field2459 == 0 && var3.method326(class287.field4640, 82, class55.field797)) {
                if (!var3.field735.field1893) {
                    var3.field735.field1893 = true;
                    class157.method1064(true, var4.field1983, var3.field735.field1877, 15);
                }
                if (var3.field735.field1893) {
                    class157.method1064(true, var4.field1983, var3.field735.field1877, 17);
                }
            } else if (var3.field735.field1893) {
                var3.field735.field1893 = false;
                class157.method1064(true, var4.field1983, var3.field735.field1877, 16);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(JLqi;I)V")
    public final void method368(long arg0, class137 arg1, int arg2) {
        field843++;
        if (arg2 > -73) {
            field840 = 46;
        }
        if (arg1.field2218 != null) {
            arg1.method952((byte) 68);
        }
        class137 var5 = this.field831[(int) (arg0 & (long) (this.field835 - 1))];
        arg1.field2216 = var5;
        arg1.field2218 = var5.field2218;
        arg1.field2218.field2216 = arg1;
        arg1.field2216.field2218 = arg1;
        arg1.field2209 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)Lqi;")
    public final class137 method369(boolean arg0) {
        field849++;
        if (this.field856 > 0 && this.field831[this.field856 - 1] != this.field854) {
            class137 var2 = this.field854;
            this.field854 = var2.field2216;
            return var2;
        }
        while (this.field856 < this.field835) {
            class137 var3 = this.field831[this.field856++].field2216;
            if (this.field831[this.field856 - 1] != var3) {
                this.field854 = var3.field2216;
                return var3;
            }
        }
        if (!arg0) {
            this.method375(true);
        }
        return null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLrg;)Lrg;")
    public static final class248 method370(boolean arg0, class248 arg1) {
        field853++;
        if (arg1.field3974 != -1) {
            return class281.method1913(arg1.field3974, (byte) 35);
        }
        int var2 = arg1.field3968 >>> 16;
        class147 var3 = new class147(class74.field1192);
        if (arg0) {
            return null;
        }
        for (class109 var4 = (class109) var3.method1001(-28710); var4 != null; var4 = (class109) var3.method1004(-108)) {
            if (var4.field1689 == var2) {
                return class281.method1913((int) var4.field2209, (byte) -111);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IJ)Lqi;")
    public final class137 method371(int arg0, long arg1) {
        field846++;
        this.field851 = arg1;
        int var4 = -99 / ((-arg0 - 47) / 52);
        class137 var5 = this.field831[(int) (arg1 & (long) (this.field835 - 1))];
        for (this.field837 = var5.field2216; this.field837 != var5; this.field837 = this.field837.field2216) {
            if (this.field837.field2209 == arg1) {
                class137 var6 = this.field837;
                this.field837 = this.field837.field2216;
                return var6;
            }
        }
        this.field837 = null;
        return null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static void method372(int arg0) {
        int var1 = 48 / ((arg0 - 66) / 58);
        field855 = null;
        field847 = null;
        field833 = null;
        field836 = null;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
    public static final void method373(int arg0) {
        class300.field4917 = arg0;
        for (int var1 = 0; var1 < class95.field1504; var1++) {
            for (int var2 = 0; var2 < class200.field3208; var2++) {
                if (class307.field4991[arg0][var1][var2] == null) {
                    class307.field4991[arg0][var1][var2] = new class116(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)I")
    public final int method374(byte arg0) {
        int var2 = -112 % ((-arg0 - 12) / 58);
        field839++;
        return this.field835;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)I")
    public final int method375(boolean arg0) {
        if (arg0) {
            this.method369(false);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field835; var3++) {
            class137 var4 = this.field831[var3];
            for (class137 var5 = var4.field2216; var5 != var4; var5 = var5.field2216) {
                var2++;
            }
        }
        field848++;
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)Lqi;")
    public final class137 method376(int arg0) {
        field842++;
        if (arg0 != 18105) {
            method373(-84);
        }
        if (this.field837 == null) {
            return null;
        }
        class137 var2 = this.field831[(int) ((long) (this.field835 - 1) & this.field851)];
        while (this.field837 != var2) {
            if (this.field837.field2209 == this.field851) {
                class137 var3 = this.field837;
                this.field837 = this.field837.field2216;
                return var3;
            }
            this.field837 = this.field837.field2216;
        }
        this.field837 = null;
        return null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
    public class58(int arg0) {
        this.field831 = new class137[arg0];
        this.field835 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class137 var3 = this.field831[var2] = new class137();
            var3.field2216 = var3;
            var3.field2218 = var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
    public final void method377(byte arg0) {
        field850++;
        if (arg0 != -1) {
            this.method379(-73);
        }
        for (int var2 = 0; var2 < this.field835; var2++) {
            class137 var3 = this.field831[var2];
            while (true) {
                class137 var4 = var3.field2216;
                if (var3 == var4) {
                    break;
                }
                var4.method952((byte) 73);
            }
        }
        this.field837 = null;
        this.field854 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(JI)V")
    public static final void method378(long arg0, int arg1) {
        field838++;
        if (arg1 != 0) {
            method367(29);
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)Lqi;")
    public final class137 method379(int arg0) {
        field841++;
        if (arg0 == -21146) {
            this.field856 = 0;
            return this.method369(true);
        } else {
            return null;
        }
    }
}
