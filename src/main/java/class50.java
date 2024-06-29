import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class50 extends class117 {

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    private int field842 = 1;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    private int field838 = 1;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "I")
    private int field849 = 204;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "Z")
    public static boolean field840 = false;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "[I")
    public static int[] field841 = new int[25];

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "Lhh;")
    private static class163 field844 = class137.method1065("white:", 17);

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "Lhh;")
    public static class163 field850 = field844;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "Lhh;")
    public static class163 field845 = field844;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "Lmi;")
    public static class128 field837 = new class128();

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "Lhh;")
    public static class163 field852 = class137.method1065("mapscene", 17);

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
    public static int field854 = 0;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "Lmb;")
    public static class151 field836;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Component;BLpc;I)Lid;")
    public static final class62 method354(int arg0, Component arg1, byte arg2, class166 arg3, int arg4) {
        ++field839;
        if (~class255.field4454 == -1) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && ~arg0 > -3) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class62 var5 = (class62) Class.forName("tf").newInstance();
                var5.field1060 = arg4;
                var5.field1046 = new int[256 * (class12.field187 ? 2 : 1)];
                var5.method436(arg1);
                var5.field1059 = (arg4 & -1024) + 1024;
                int var6 = 10 / ((arg2 - 12) / 58);
                if (~var5.field1059 < -16385) {
                    var5.field1059 = 16384;
                }
                var5.method425(var5.field1059);
                if (~class181.field3330 < -1 && class9.field158 == null) {
                    class9.field158 = new class109();
                    class9.field158.field2062 = arg3;
                    arg3.method1253(class9.field158, class181.field3330, 2244);
                }
                if (class9.field158 != null) {
                    if (class9.field158.field2067[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class9.field158.field2067[arg0] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class195 var7 = new class195(arg3, arg0);
                    var7.field1046 = new int[(!class12.field187 ? 1 : 2) * 256];
                    var7.field1060 = arg4;
                    var7.method436(arg1);
                    var7.field1059 = 16384;
                    var7.method425(var7.field1059);
                    if (~class181.field3330 < -1 && class9.field158 == null) {
                        class9.field158 = new class109();
                        class9.field158.field2062 = arg3;
                        arg3.method1253(class9.field158, class181.field3330, 2244);
                    }
                    if (class9.field158 != null) {
                        if (class9.field158.field2067[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class9.field158.field2067[arg0] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class62();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
    public static final void method355(int arg0) {
        ++field851;
        if (arg0 <= 34) {
            field853 = 54;
        }
        while (class33.field502.method79(false, class125.field2415) >= 27) {
            int var1 = class33.field502.method74((byte) -127, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class111.field2098[var1] == null) {
                var2 = true;
                class111.field2098[var1] = new class2();
            }
            class2 var3 = class111.field2098[var1];
            class155.field2887[class199.field3573++] = var1;
            var3.field3628 = class227.field4092;
            var3.field41 = class220.method1556(class33.field502.method74((byte) -115, 14), true);
            int var4 = class33.field502.method74((byte) -123, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class33.field502.method74((byte) -86, 5);
            if (~var5 < -16) {
                var5 -= 32;
            }
            int var6 = class33.field502.method74((byte) -103, 1);
            if (~var6 == -2) {
                class124.field2392[class222.field4040++] = var1;
            }
            int var7 = class33.field502.method74((byte) -105, 1);
            int var8 = class128.field2495[class33.field502.method74((byte) 113, 3)];
            var3.field3663 = var3.field41.field3334;
            var3.field3648 = var3.field41.field3281;
            var3.field3645 = var3.field41.field3274;
            var3.field3652 = var3.field41.field3275;
            var3.field3656 = var3.field41.field3298;
            if (var2) {
                var3.field3654 = var3.field3667 = var8;
            }
            var3.field3679 = var3.field41.field3332;
            var3.field3670 = var3.field41.field3312;
            var3.field3635 = var3.field41.field3303;
            var3.field3651 = var3.field41.field3282;
            if (var3.field3648 == 0) {
                var3.field3667 = 0;
            }
            var3.method1444(class235.field4203.field3614[0] + var5, 120, class235.field4203.field3629[0] - -var4, var7 == 1);
            if (var3.field41.method1324(true)) {
                class175.method1300(class20.field323, (class35) null, var3.field3629[0], false, var3, 0, (class126) null, var3.field3614[0]);
            }
        }
        class33.field502.method81(7);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field847;
        if (arg0 != -21393) {
            return null;
        } else {
            int[] var3 = super.field2218.method1044(arg1, 0);
            if (super.field2218.field2587) {
                for (int var4 = 0; class143.field2702 > var4; ++var4) {
                    int var5 = class214.field3911[arg1];
                    int var6 = class26.field402[var4];
                    int var7 = this.field842 * var6 >> 12;
                    int var8 = this.field838 * var5 >> 12;
                    int var9 = var6 % (4096 / this.field842) * this.field842;
                    int var10 = var5 % (4096 / this.field838) * this.field838;
                    if (~this.field849 < ~var10) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (~var7 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (var9 < this.field849) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field849 > var9) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (var11 > 3) {
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
            return var3;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field848;
        if (arg0 != 0) {
            field845 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field849 = arg2.method658(-69);
                }
            } else {
                this.field838 = arg2.method622(true);
            }
        } else {
            this.field842 = arg2.method622(true);
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(B)V")
    public static void method356(byte arg0) {
        field841 = null;
        field852 = null;
        if (arg0 >= 8) {
            field836 = null;
            field845 = null;
            field850 = null;
            field844 = null;
            field837 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lhh;B)V")
    public static final void method357(class163 arg0, byte arg1) {
        ++field843;
        class76 var2 = (class76) class259.field4530.method1017(93);
        if (arg1 <= 100) {
            field837 = null;
        }
        while (var2 != null) {
            if (var2.field1438.method1208(arg0, (byte) -120)) {
                class253.field4430 = var2;
                return;
            }
            var2 = (class76) class259.field4530.method1016((byte) -31);
        }
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V")
    public static final void method358(int arg0) {
        Object var1 = class169.field3098;
        synchronized (class169.field3098) {
            if (arg0 < 67) {
                field854 = -119;
            }
            if (class218.field3970 != 0) {
                class218.field3970 = 1;
                try {
                    class169.field3098.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        ++field846;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class50() {
        super(0, true);
    }
}
