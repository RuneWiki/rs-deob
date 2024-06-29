import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class110 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2671 = 0;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lgd;")
    private static class40 field2677 = class14.method90(false, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lgd;")
    public static class40 field2669 = field2677;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field2678 = 0;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field2680 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lgd;")
    public static class40 field2673 = class14.method90(false, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field2682 = 0;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lgd;")
    public static class40 field2681 = class14.method90(false, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2676 = new CRC32();

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lgd;")
    public static class40 field2686 = class14.method90(false, "@gr1@");

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lgd;")
    public static class40 field2685 = class14.method90(false, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "J")
    public static long field2683;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lwe;")
    public static class137 field2684;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lnd;IBLw;)V", line = 9)
    public static final void method853(class82 arg0, int arg1, byte arg2, class135 arg3) {
        int var4 = -126 % ((53 - arg2) / 61);
        field2672++;
        byte[] var5 = null;
        class89 var6 = class58.field1475;
        synchronized (class58.field1475) {
            for (class53 var7 = (class53) class58.field1475.method593(0); var7 != null; var7 = (class53) class58.field1475.method582(false)) {
                if ((long) arg1 == var7.field2647 && var7.field1339 == arg0 && var7.field1340 == 0) {
                    var5 = var7.field1341;
                    break;
                }
            }
        }
        if (var5 == null) {
            byte[] var8 = arg0.method543(-124, arg1);
            arg3.method1061(var8, arg0, arg1, (byte) -117, true);
        } else {
            arg3.method1061(var5, arg0, arg1, (byte) -117, true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZI)I", line = 55)
    public static final int method854(int arg0, boolean arg1, int arg2) {
        int var3 = class5.method31(arg2 + 45365, (byte) 4, arg0 + 91923, 4) + (class5.method31(arg2 + 10294, (byte) 4, arg0 - -37821, 2) + -128 >> 1) + (class5.method31(arg2, (byte) 4, arg0, 1) + -128 >> 2) - 128;
        if (!arg1) {
            return -112;
        }
        field2679++;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 82)
    public static void method855(int arg0) {
        field2673 = null;
        field2669 = null;
        field2681 = null;
        field2686 = null;
        if (arg0 != -5000) {
            method858(-100, true);
        }
        field2685 = null;
        field2684 = null;
        field2676 = null;
        field2677 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLee;)V", line = 99)
    public static final void method856(byte arg0, class30 arg1) {
        field2670++;
        int var2 = arg1.field734;
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (var2 == 1 && class137.field3337 == 0) {
                arg1.field656 = 0;
                arg1.field726 = class7.field176;
            } else if (var2 == 1 && class137.field3337 == 1) {
                arg1.field726 = class54.field1369;
                arg1.field656 = 0;
            } else if (var2 == 2 && class137.field3337 != 2) {
                arg1.field656 = 0;
                arg1.field726 = class69.field1672;
            } else {
                if (var2 > 700) {
                    var2 -= 601;
                } else {
                    var2--;
                }
                int var3 = class7.field181;
                if (class137.field3337 != 2) {
                    var3 = 0;
                }
                if (var2 >= var3) {
                    arg1.field656 = 0;
                    arg1.field726 = class125.field2966;
                } else {
                    arg1.field726 = class7.field178[var2];
                    arg1.field656 = 1;
                }
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            int var4 = class7.field181;
            if (class137.field3337 != 2) {
                var4 = 0;
            }
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            if (var4 <= var2) {
                arg1.field726 = class125.field2966;
                arg1.field656 = 0;
            } else {
                if (class77.field1771[var2] == 0) {
                    arg1.field726 = client.method114(true, new class40[] { class24.field572, class106.field2585 });
                } else if (class77.field1771[var2] >= 5000) {
                    if (class77.field1771[var2] == class4.field108) {
                        arg1.field726 = client.method114(true, new class40[] { class65.field1598, class94.field2157, class21.method121(23444, class77.field1771[var2] - 5000) });
                    } else {
                        arg1.field726 = client.method114(true, new class40[] { class21.field489, class94.field2157, class21.method121(23444, class77.field1771[var2] - 5000) });
                    }
                } else if (class77.field1771[var2] == class4.field108) {
                    arg1.field726 = client.method114(true, new class40[] { class65.field1598, class67.field1656, class21.method121(23444, class77.field1771[var2]) });
                } else {
                    arg1.field726 = client.method114(true, new class40[] { class21.field489, class67.field1656, class21.method121(23444, class77.field1771[var2]) });
                }
                arg1.field656 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class7.field181;
            if (class137.field3337 != 2) {
                var5 = 0;
            }
            arg1.field670 = var5 * 15 + 20;
            if (arg1.field670 <= arg1.field684) {
                arg1.field670 = arg1.field684 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class137.field3337 == 0) {
                arg1.field726 = class12.field301;
                arg1.field656 = 0;
            } else if (var2 == 1 && class137.field3337 == 0) {
                arg1.field656 = 0;
                arg1.field726 = class69.field1672;
            } else {
                int var6 = class42.field1065;
                if (class137.field3337 == 0) {
                    var6 = 0;
                }
                if (var6 <= var2) {
                    arg1.field726 = class125.field2966;
                    arg1.field656 = 0;
                } else {
                    arg1.field726 = class64.method463(class67.field1657[var2], (byte) -94).method244(0);
                    arg1.field656 = 1;
                }
            }
        } else if (var2 == 503) {
            arg1.field670 = class42.field1065 * 15 + 20;
            if (arg1.field670 <= arg1.field684) {
                arg1.field670 = arg1.field684 + 1;
            }
        } else if (var2 == 324) {
            if (class74.field1722 == -1) {
                class74.field1722 = arg1.field677;
                class42.field1051 = arg1.field672;
            }
            if (class30.field634.field2710) {
                arg1.field677 = class74.field1722;
            } else {
                arg1.field677 = class42.field1051;
            }
        } else {
            int var7 = 22 / ((arg0 - 37) / 35);
            if (var2 == 325) {
                if (class74.field1722 == -1) {
                    class42.field1051 = arg1.field672;
                    class74.field1722 = arg1.field677;
                }
                if (class30.field634.field2710) {
                    arg1.field677 = class42.field1051;
                } else {
                    arg1.field677 = class74.field1722;
                }
            } else if (var2 == 327) {
                arg1.field658 = 150;
                arg1.field646 = (int) (Math.sin((double) class10.field242 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field701 = 0;
                arg1.field647 = 5;
            } else if (var2 == 328) {
                arg1.field658 = 150;
                arg1.field646 = (int) (Math.sin((double) class10.field242 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field647 = 5;
                arg1.field701 = 1;
            } else if (var2 == 600) {
                arg1.field726 = client.method114(true, new class40[] { class125.field2958, class126.field2994 });
            } else if (var2 == 620) {
                if (class107.field2610 < 1) {
                    arg1.field726 = class125.field2966;
                } else if (class40.field999) {
                    arg1.field726 = class23.field543;
                    arg1.field654 = 16711680;
                } else {
                    arg1.field726 = class125.field2982;
                    arg1.field654 = 16777215;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIBIII)V", line = 346)
    public static final void method857(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2674++;
        if (class94.method638(arg1, 0)) {
            class22.method131(class129.field3093[arg1], 0, -1, arg5, arg6, false, 0, arg2, arg0, arg4);
            if (arg3 < 6) {
                field2680 = -9;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V", line = 360)
    public static final void method858(int arg0, boolean arg1) {
        if (arg0 != 1) {
            return;
        }
        field2675++;
        if (class16.field416 == null) {
            return;
        }
        try {
            class104 var2 = new class104(4);
            var2.method756(arg1 ? 2 : 3, arg0);
            var2.method762(0, arg0 + 123);
            class16.field416.method1086(0, var2.field2554, 4, (byte) -98);
        } catch (IOException var4) {
            try {
                class16.field416.method1079(true);
            } catch (Exception var3) {
            }
            class16.field416 = null;
            class112.field2713++;
        }
    }
}
