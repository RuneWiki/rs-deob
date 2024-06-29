import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class277 {

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Z")
    public boolean field3828 = false;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public int field3837 = 16;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field3823 = 128;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field3826 = 0;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public int field3836 = -1;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public int field3825 = 1190717;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Z")
    public boolean field3838 = true;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public int field3824 = 127;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Z")
    public boolean field3842 = true;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field3833 = -1;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public int field3831 = -1;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public int field3843 = 8;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lcs;")
    public static class351 field3830 = new class351(76, -1);

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lcs;")
    public static class351 field3840 = new class351(3, 8);

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "Lfn;")
    public static class52 field3844 = new class52(78, 10);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field3834;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lwg;")
    public class441 field3827;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method1735(int arg0) {
        field3844 = null;
        field3830 = null;
        if (arg0 > -119) {
            field3830 = null;
        }
        field3840 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLlk;)Ljava/lang/String;")
    public static final String method1736(boolean arg0, class425 arg1) {
        field3839++;
        if (arg0) {
            method1737((byte) -113, -4);
        }
        return class130.method790(32767, arg1, (byte) 104);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Lto;")
    public static final class370 method1737(byte arg0, int arg1) {
        field3829++;
        class479[] var2 = class254.field3560;
        synchronized (class254.field3560) {
            class370 var3;
            if (arg1 >= class254.field3560.length || class254.field3560[arg1].method2822(false)) {
                var3 = new class370();
                var3.field5233 = new class219[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field5233[var4] = new class219();
                }
            } else {
                var3 = (class370) class254.field3560[arg1].method2815(7);
                var3.method2773(26979);
                int var10002 = class145.field2022[arg1]--;
            }
            return arg0 == 28 ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public final void method1738(boolean arg0) {
        if (this.field3833 == -1) {
            this.field3833 = this.field3831;
        }
        this.field3843 = this.field3843 << 8 | this.field3834;
        field3832++;
        if (!arg0) {
            method1740(-100, -53, 110, 82, 61, 94);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILlk;I)V")
    private final void method1739(int arg0, class425 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3826 = class289.method1780(arg1.method2498(3), (byte) 16);
        } else if (arg0 == 2) {
            this.field3831 = arg1.method2503(true);
        } else if (arg0 == 3) {
            this.field3831 = arg1.method2508(true);
            if (this.field3831 == 65535) {
                this.field3831 = -1;
            }
        } else if (arg0 == 5) {
            this.field3838 = false;
        } else if (arg0 == 7) {
            this.field3836 = class289.method1780(arg1.method2498(3), (byte) -106);
        } else if (arg0 == 8) {
            this.field3827.field6058 = this.field3834;
        } else if (arg0 == 9) {
            this.field3823 = arg1.method2508(true);
        } else if (arg0 == 10) {
            this.field3842 = false;
        } else if (arg0 == 11) {
            this.field3843 = arg1.method2503(true);
        } else if (arg0 == 12) {
            this.field3828 = true;
        } else if (arg0 == 13) {
            this.field3825 = arg1.method2498(arg2 ^ 0xFFFFFED7);
        } else if (arg0 == 14) {
            this.field3837 = arg1.method2503(true);
        } else if (arg0 == 15) {
            this.field3833 = arg1.method2508(true);
            if (this.field3833 == 65535) {
                this.field3833 = -1;
            }
        } else if (arg0 == 16) {
            this.field3824 = arg1.method2503(true);
        }
        field3841++;
        if (arg2 != -300) {
            method1737((byte) -78, -70);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -1 % ((arg4 + 18) / 37);
        field3835++;
        for (int var7 = arg2; var7 <= arg3; var7++) {
            for (int var8 = arg0; var8 <= arg1; var8++) {
                if (class292.field4012[var7][var8] == arg5 && class126.field1733[var7][var8] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Llk;I)V")
    public final void method1741(class425 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                if (arg1 <= 120) {
                    return;
                }
                field3822++;
                return;
            }
            this.method1739(var3, arg0, -300);
        }
    }
}
