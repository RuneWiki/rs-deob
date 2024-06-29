import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class151 extends class51 {

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "I")
    private int field3108 = 1;

    @OriginalMember(owner = "client!qh", name = "ib", descriptor = "I")
    private int field3117 = 204;

    @OriginalMember(owner = "client!qh", name = "gb", descriptor = "I")
    private int field3115 = 1;

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!qh", name = "nb", descriptor = "Lea;")
    private static class38 field3122 = class9.method46((byte) 125, "Location");

    @OriginalMember(owner = "client!qh", name = "kb", descriptor = "Lea;")
    public static class38 field3119 = field3122;

    @OriginalMember(owner = "client!qh", name = "jb", descriptor = "Lea;")
    public static class38 field3118 = class9.method46((byte) 124, " (X");

    @OriginalMember(owner = "client!qh", name = "pb", descriptor = "Z")
    public static volatile boolean field3124 = false;

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!qh", name = "fb", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!qh", name = "hb", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!qh", name = "lb", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!qh", name = "mb", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!qh", name = "ob", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!qh", name = "qb", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "Ldd;")
    public static class32 field3112;

    @OriginalMember(owner = "client!qh", name = "eb", descriptor = "Ldd;")
    public static class32 field3113;

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class151() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(Z)V")
    public static void method1056(boolean arg0) {
        field3113 = null;
        field3112 = null;
        field3118 = null;
        field3122 = null;
        if (!arg0) {
            field3119 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)V")
    public static final void method1057(int arg0) {
        ++field3114;
        int var1 = class33.field686.method656(class165.field3423);
        if (arg0 <= 68) {
            method1059(-54, (byte) 2);
        }
        for (int var2 = 0; ~var2 > ~class94.field2121; ++var2) {
            int var6 = class33.field686.method656(class144.method1039(var2, 80));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        field3125 = var1;
        class169.field3482 = true;
        class36.field765 = class94.field2121 * 15 + 22;
        int var3 = class94.field2121 * 15 - -21;
        int var4 = -(var1 / 2) + class87.field2029;
        int var5 = class105.field2345;
        if (~(var1 + var4) < -766) {
            var4 = 765 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (~(var3 + var5) < -504) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class143.field2981 = var4;
        class127.field2727 = var5;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)Z")
    public static final boolean method1058(int arg0, int arg1) {
        if (arg1 != 0) {
            field3124 = false;
        }
        ++field3116;
        return (1 & arg0 >> 31) != 0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)Lea;")
    public static final class38 method1059(int arg0, byte arg1) {
        ++field3110;
        return arg1 != -114 ? null : class86.method718(127, 10, arg0, false);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
    public static final void method1060(int arg0, boolean arg1) {
        ++field3123;
        if (arg0 != -1) {
            if (class127.field2728[arg0]) {
                class149.field3086.method208(arg0, 99);
                if (class168.field3461[arg0] != null) {
                    boolean var2 = true;
                    for (int var3 = 0; ~class168.field3461[arg0].length < ~var3; ++var3) {
                        if (class168.field3461[arg0][var3] != null) {
                            if (~class168.field3461[arg0][var3].field965 != -3) {
                                class168.field3461[arg0][var3] = null;
                            } else {
                                var2 = false;
                            }
                        }
                    }
                    if (var2) {
                        class168.field3461[arg0] = null;
                    }
                    class127.field2728[arg0] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (arg2) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field3117 = arg0.method511(-119);
                    }
                } else {
                    this.field3108 = arg0.method509(126);
                }
            } else {
                this.field3115 = arg0.method509(126);
            }
            ++field3121;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        if (arg0 >= -125) {
            this.field3115 = 105;
        }
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            for (int var4 = 0; ~var4 > ~class86.field2008; ++var4) {
                int var5 = class170.field3490[arg1];
                int var6 = class196.field3854[var4];
                int var7 = this.field3108 * var5 >> 12;
                int var8 = var6 % (4096 / this.field3115) * this.field3115;
                int var9 = this.field3115 * var6 >> 12;
                int var10 = var5 % (4096 / this.field3108) * this.field3108;
                if (var10 < this.field3117) {
                    for (var9 -= var7; var9 < 0; var9 += 4) {
                    }
                    while (var9 > 3) {
                        var9 -= 4;
                    }
                    if (~var9 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field3117 > var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field3117 < ~var8) {
                    int var11;
                    for (var11 = var9 - var7; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        ++field3111;
        return var3;
    }
}
