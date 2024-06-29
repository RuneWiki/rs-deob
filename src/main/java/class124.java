import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class124 {

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Lac;")
    private class153 field1790 = new class153(256);

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Lac;")
    private class153 field1795 = new class153(256);

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "Lvl;")
    private class73 field1794;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Lvl;")
    private class73 field1787;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1793 = "flash1:";

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Lvl;")
    public static class73 field1791;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Z")
    public static boolean field1788;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static final void method802(byte arg0) {
        field1784++;
        int var1 = 0;
        if (arg0 >= -81) {
            return;
        }
        while (class140.field2016 > var1) {
            int var2 = class212.field3299[var1];
            class86 var3 = class191.field3045[var2];
            int var4 = class175.field2763.method1218(-36);
            if ((var4 & 0x80) != 0) {
                var4 += class175.field2763.method1218(-52) << 8;
            }
            if ((var4 & 0x8) != 0) {
                var3.field3954 = class175.field2763.method1195(-1);
                var3.field3982 = 100;
            }
            if ((var4 & 0x20) != 0) {
                int var5 = class175.field2763.method1182((byte) -113);
                int var6 = class175.field2763.method1196((byte) 60);
                var3.method1731(var5, class311.field4996, true, var6);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field1321.method852((byte) -31)) {
                    class125.method813(65, var3);
                }
                var3.method586(true, class118.method780(class175.field2763.method1186((byte) -60), -29837));
                var3.method1729(var3.field1321.field1925, (byte) 20);
                var3.field3983 = var3.field1321.field1923;
                var3.field3898 = var3.field1321.field1889;
                if (var3.field1321.method852((byte) -31)) {
                    class1.method7(class148.field2204, (class191) null, (class1) null, var3.field3972[0], 0, var3, var3.field3970[0], 17733);
                }
            }
            if ((var4 & 0x4) != 0) {
                int var7 = class175.field2763.method1172(true);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class175.field2763.method1209(-1);
                boolean var9 = true;
                if (var7 != -1 && var3.field3904 != -1 && class174.method1241(28, class92.method629(var7, 12288).field3338).field833 < class174.method1241(83, class92.method629(var3.field3904, 12288).field3338).field833) {
                    var9 = false;
                }
                if (var9) {
                    var3.field3904 = var7;
                    var3.field3935 = (var8 & 0xFFFF) + class311.field4996;
                    var3.field3930 = 0;
                    if (class311.field4996 < var3.field3935) {
                        var3.field3930 = -1;
                    }
                    var3.field3893 = 1;
                    var3.field3963 = var8 >> 16;
                    var3.field3909 = 0;
                    if (var3.field3904 != -1 && class311.field4996 == var3.field3935) {
                        int var10 = class92.method629(var3.field3904, 12288).field3338;
                        if (var10 != -1) {
                            class57 var11 = class174.method1241(97, var10);
                            if (var11 != null && var11.field850 != null) {
                                class173.method1240(var3.field3915, var3.field3920, -9160, false, var11, 0);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                int var12 = class175.field2763.method1189(-97);
                int var13 = class175.field2763.method1211(111);
                if (var12 == 65535) {
                    var12 = -1;
                }
                class167.method1139(var12, var3, 78, var13);
            }
            if ((var4 & 0x1) != 0) {
                var3.field3927 = class175.field2763.method1172(true);
                if (var3.field3927 == 65535) {
                    var3.field3927 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                int var14 = class175.field2763.method1196((byte) 72);
                int[] var15 = new int[var14];
                int[] var16 = new int[var14];
                int[] var17 = new int[var14];
                for (int var18 = 0; var18 < var14; var18++) {
                    int var19 = class175.field2763.method1172(true);
                    if (var19 == 65535) {
                        var19 = -1;
                    }
                    var17[var18] = var19;
                    var15[var18] = class175.field2763.method1218(115);
                    var16[var18] = class175.field2763.method1189(-113);
                }
                class298.method2006(var15, var17, var3, (byte) -68, var16);
            }
            if ((var4 & 0x200) != 0) {
                var3.field3905 = class175.field2763.method1200(128);
                var3.field3897 = class175.field2763.method1189(-53);
            }
            if ((var4 & 0x10) != 0) {
                int var20 = class175.field2763.method1218(117);
                int var21 = class175.field2763.method1182((byte) -90);
                var3.method1731(var20, class311.field4996, true, var21);
                var3.field3944 = class311.field4996 + 300;
                var3.field3890 = class175.field2763.method1211(117);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V")
    public static void method803(byte arg0) {
        field1791 = null;
        field1793 = null;
        if (arg0 > -23) {
            method808((class73) null, -96);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([III)Lla;")
    public final class131 method804(int[] arg0, int arg1, int arg2) {
        field1786++;
        if (this.field1787.method494(112) == 1) {
            return this.method805(arg0, 0, true, arg2);
        } else if (this.field1787.method481(arg1 ^ 0x738A, arg2) == 1) {
            return this.method805(arg0, arg2, true, 0);
        } else {
            if (arg1 != 30986) {
                this.field1794 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([IIZI)Lla;")
    private final class131 method805(int[] arg0, int arg1, boolean arg2, int arg3) {
        int var5 = (arg1 << 4 & 0xFFF1 | arg1 >>> 12) ^ arg3;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class131 var9 = (class131) this.field1795.method1064(-1, var7);
        field1780++;
        if (!arg2) {
            field1793 = null;
        }
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class101 var10 = class101.method685(this.field1787, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class131 var11 = var10.method682();
            this.field1795.method1054(-3510, var11, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field1873.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[III)Lla;")
    private final class131 method806(int arg0, int[] arg1, int arg2, int arg3) {
        field1789++;
        int var5 = arg3 ^ (arg2 >>> 12 | (arg2 & 0x80000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class131 var9 = (class131) this.field1795.method1064(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class269 var10 = (class269) this.field1790.method1064(~arg0, var7);
            if (var10 == null) {
                var10 = class269.method1877(this.field1794, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field1790.method1054(-3510, var10, var7);
            }
            class131 var11 = var10.method1870(arg1);
            if (var11 == null) {
                return null;
            }
            var10.method1764(64);
            if (arg0 != 0) {
                field1788 = true;
            }
            this.field1795.method1054(-3510, var11, var7);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "([III)Lla;")
    public final class131 method807(int[] arg0, int arg1, int arg2) {
        field1783++;
        if (arg2 != -19762) {
            field1788 = true;
        }
        if (this.field1794.method494(127) == 1) {
            return this.method806(0, arg0, 0, arg1);
        } else if (this.field1794.method481(2688, arg1) == 1) {
            return this.method806(arg2 ^ 0xFFFFB2CE, arg0, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lvl;I)V")
    public static final void method808(class73 arg0, int arg1) {
        class139.field1997 = arg0;
        if (arg1 == -22561) {
            field1781++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lvl;Lvl;)V")
    public class124(class73 arg0, class73 arg1) {
        this.field1794 = arg1;
        this.field1787 = arg0;
    }
}
