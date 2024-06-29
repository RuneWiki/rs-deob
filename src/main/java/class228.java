import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class228 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    private int field3339 = 0;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    private int field3356;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    private int field3360;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "[[I")
    public int[][] field3351;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
    public static int[] field3342 = new int[14];

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field3349 = 0;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "[Lge;")
    public static class299[] field3355 = new class299[29];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Llc;")
    public static class270 field3344;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "Llc;")
    public static class270 field3354;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "[[[B")
    public static byte[][][] field3361;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZIIIZ)V")
    public final void method1575(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg1 - this.field3339;
        if (arg0 != 1) {
            method1585(-59, -119, 74, 5, -40, -101, -77, 108, (byte) -121, -49);
        }
        field3350++;
        int var9 = arg3 - this.field3360;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method1579(128, (byte) 58, var9, var8);
                this.method1579(8, (byte) 56, var9 - 1, var8);
            }
            if (arg4 == 1) {
                this.method1579(2, (byte) 36, var9, var8);
                this.method1579(32, (byte) 18, var9, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1579(8, (byte) 33, var9, var8);
                this.method1579(128, (byte) 100, var9 + 1, var8);
            }
            if (arg4 == 3) {
                this.method1579(32, (byte) 80, var9, var8);
                this.method1579(2, (byte) 59, var9, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method1579(1, (byte) 18, var9, var8);
                this.method1579(16, (byte) 75, var9 - 1, var8 - -1);
            }
            if (arg4 == 1) {
                this.method1579(4, (byte) 31, var9, var8);
                this.method1579(64, (byte) 17, var9 + 1, var8 - -1);
            }
            if (arg4 == 2) {
                this.method1579(16, (byte) 98, var9, var8);
                this.method1579(1, (byte) 41, var9 + 1, var8 + -1);
            }
            if (arg4 == 3) {
                this.method1579(64, (byte) 94, var9, var8);
                this.method1579(4, (byte) 101, var9 - 1, var8 + -1);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method1579(130, (byte) 109, var9, var8);
                this.method1579(8, (byte) 67, var9 - 1, var8);
                this.method1579(32, (byte) 29, var9, var8 + 1);
            }
            if (arg4 == 1) {
                this.method1579(10, (byte) 93, var9, var8);
                this.method1579(32, (byte) 42, var9, var8 + 1);
                this.method1579(128, (byte) 90, var9 + 1, var8);
            }
            if (arg4 == 2) {
                this.method1579(40, (byte) 38, var9, var8);
                this.method1579(128, (byte) 34, var9 + 1, var8);
                this.method1579(2, (byte) 78, var9, var8 - 1);
            }
            if (arg4 == 3) {
                this.method1579(160, (byte) 84, var9, var8);
                this.method1579(2, (byte) 110, var9, var8 - 1);
                this.method1579(8, (byte) 40, var9 - 1, var8);
            }
        }
        if (arg6) {
            if (arg5 == 0) {
                if (arg4 == 0) {
                    this.method1579(65536, (byte) 36, var9, var8);
                    this.method1579(4096, (byte) 67, var9 - 1, var8);
                }
                if (arg4 == 1) {
                    this.method1579(1024, (byte) 85, var9, var8);
                    this.method1579(16384, (byte) 4, var9, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1579(4096, (byte) 27, var9, var8);
                    this.method1579(65536, (byte) 72, var9 + 1, var8);
                }
                if (arg4 == 3) {
                    this.method1579(16384, (byte) 123, var9, var8);
                    this.method1579(1024, (byte) 34, var9, var8 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg4 == 0) {
                    this.method1579(512, (byte) 64, var9, var8);
                    this.method1579(8192, (byte) 82, var9 - 1, var8 + 1);
                }
                if (arg4 == 1) {
                    this.method1579(2048, (byte) 80, var9, var8);
                    this.method1579(32768, (byte) 71, var9 + 1, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1579(8192, (byte) 37, var9, var8);
                    this.method1579(512, (byte) 84, var9 + 1, var8 + -1);
                }
                if (arg4 == 3) {
                    this.method1579(32768, (byte) 49, var9, var8);
                    this.method1579(2048, (byte) 123, var9 - 1, var8 + -1);
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    this.method1579(66560, (byte) 121, var9, var8);
                    this.method1579(4096, (byte) 84, var9 - 1, var8);
                    this.method1579(16384, (byte) 55, var9, var8 + 1);
                }
                if (arg4 == 1) {
                    this.method1579(5120, (byte) 25, var9, var8);
                    this.method1579(16384, (byte) 118, var9, var8 + 1);
                    this.method1579(65536, (byte) 117, var9 + 1, var8);
                }
                if (arg4 == 2) {
                    this.method1579(20480, (byte) 109, var9, var8);
                    this.method1579(65536, (byte) 74, var9 + 1, var8);
                    this.method1579(1024, (byte) 28, var9, var8 - 1);
                }
                if (arg4 == 3) {
                    this.method1579(81920, (byte) 71, var9, var8);
                    this.method1579(1024, (byte) 104, var9, var8 - 1);
                    this.method1579(4096, (byte) 64, var9 - 1, var8);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method1579(536870912, (byte) 30, var9, var8);
                this.method1579(33554432, (byte) 69, var9 - 1, var8);
            }
            if (arg4 == 1) {
                this.method1579(8388608, (byte) 93, var9, var8);
                this.method1579(134217728, (byte) 73, var9, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1579(33554432, (byte) 86, var9, var8);
                this.method1579(536870912, (byte) 30, var9 + 1, var8);
            }
            if (arg4 == 3) {
                this.method1579(134217728, (byte) 38, var9, var8);
                this.method1579(8388608, (byte) 4, var9, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method1579(4194304, (byte) 101, var9, var8);
                this.method1579(67108864, (byte) 115, var9 - 1, var8 + 1);
            }
            if (arg4 == 1) {
                this.method1579(16777216, (byte) 69, var9, var8);
                this.method1579(268435456, (byte) 59, var9 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1579(67108864, (byte) 98, var9, var8);
                this.method1579(4194304, (byte) 53, var9 + 1, var8 + -1);
            }
            if (arg4 == 3) {
                this.method1579(268435456, (byte) 79, var9, var8);
                this.method1579(16777216, (byte) 69, var9 - 1, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1579(545259520, (byte) 76, var9, var8);
            this.method1579(33554432, (byte) 47, var9 - 1, var8);
            this.method1579(134217728, (byte) 111, var9, var8 + 1);
        }
        if (arg4 == 1) {
            this.method1579(41943040, (byte) 81, var9, var8);
            this.method1579(134217728, (byte) 41, var9, var8 + 1);
            this.method1579(536870912, (byte) 18, var9 + 1, var8);
        }
        if (arg4 == 2) {
            this.method1579(167772160, (byte) 118, var9, var8);
            this.method1579(536870912, (byte) 14, var9 + 1, var8);
            this.method1579(8388608, (byte) 95, var9, var8 - 1);
        }
        if (arg4 == 3) {
            this.method1579(671088640, (byte) 75, var9, var8);
            this.method1579(8388608, (byte) 62, var9, var8 - 1);
            this.method1579(33554432, (byte) 9, var9 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ldk;I)V")
    public static final void method1576(class207 arg0, int arg1) {
        field3348++;
        if (arg1 != 1) {
            field3342 = null;
        }
        class301 var2 = (class301) class21.field233.method1073(-1, class143.method1064((byte) -109, arg0.field3069));
        if (var2 == null) {
            return;
        }
        if (var2.field4854 != null) {
            class241.field3543.method1248(var2.field4854);
            var2.field4854 = null;
        }
        var2.method1781(arg1 ^ 0x1483);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)V")
    public final void method1577(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field3360;
        field3343++;
        int var5 = arg1 - this.field3339;
        if (arg2 != 89) {
            field3354 = null;
        }
        this.field3351[var4][var5] = class200.method1408(this.field3351[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BZIIIIZ)V")
    public final void method1578(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 != -116) {
            field3361 = null;
        }
        field3353++;
        int var8 = arg4 - this.field3339;
        int var9 = arg5 - this.field3360;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1588(var9, (byte) -106, var8, 128);
                this.method1588(var9 - 1, (byte) -36, var8, 8);
            }
            if (arg2 == 1) {
                this.method1588(var9, (byte) -121, var8, 2);
                this.method1588(var9, (byte) -42, var8 + 1, 32);
            }
            if (arg2 == 2) {
                this.method1588(var9, (byte) -109, var8, 8);
                this.method1588(var9 + 1, (byte) -113, var8, 128);
            }
            if (arg2 == 3) {
                this.method1588(var9, (byte) -126, var8, 32);
                this.method1588(var9, (byte) -73, var8 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1588(var9, (byte) -81, var8, 1);
                this.method1588(var9 - 1, (byte) -40, var8 + 1, 16);
            }
            if (arg2 == 1) {
                this.method1588(var9, (byte) -54, var8, 4);
                this.method1588(var9 + 1, (byte) -77, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method1588(var9, (byte) -107, var8, 16);
                this.method1588(var9 + 1, (byte) -74, var8 - 1, 1);
            }
            if (arg2 == 3) {
                this.method1588(var9, (byte) -80, var8, 64);
                this.method1588(var9 - 1, (byte) -38, var8 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method1588(var9, (byte) -51, var8, 130);
                this.method1588(var9 - 1, (byte) -43, var8, 8);
                this.method1588(var9, (byte) -55, var8 + 1, 32);
            }
            if (arg2 == 1) {
                this.method1588(var9, (byte) -43, var8, 10);
                this.method1588(var9, (byte) -88, var8 + 1, 32);
                this.method1588(var9 + 1, (byte) -67, var8, 128);
            }
            if (arg2 == 2) {
                this.method1588(var9, (byte) -49, var8, 40);
                this.method1588(var9 + 1, (byte) -62, var8, 128);
                this.method1588(var9, (byte) -68, var8 - 1, 2);
            }
            if (arg2 == 3) {
                this.method1588(var9, (byte) -103, var8, 160);
                this.method1588(var9, (byte) -79, var8 - 1, 2);
                this.method1588(var9 - 1, (byte) -45, var8, 8);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg2 == 0) {
                    this.method1588(var9, (byte) -30, var8, 65536);
                    this.method1588(var9 - 1, (byte) -64, var8, 4096);
                }
                if (arg2 == 1) {
                    this.method1588(var9, (byte) -34, var8, 1024);
                    this.method1588(var9, (byte) -69, var8 + 1, 16384);
                }
                if (arg2 == 2) {
                    this.method1588(var9, (byte) -116, var8, 4096);
                    this.method1588(var9 + 1, (byte) -97, var8, 65536);
                }
                if (arg2 == 3) {
                    this.method1588(var9, (byte) -99, var8, 16384);
                    this.method1588(var9, (byte) -80, var8 - 1, 1024);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg2 == 0) {
                    this.method1588(var9, (byte) -50, var8, 512);
                    this.method1588(var9 - 1, (byte) -99, var8 + 1, 8192);
                }
                if (arg2 == 1) {
                    this.method1588(var9, (byte) -61, var8, 2048);
                    this.method1588(var9 + 1, (byte) -38, var8 + 1, 32768);
                }
                if (arg2 == 2) {
                    this.method1588(var9, (byte) -122, var8, 8192);
                    this.method1588(var9 + 1, (byte) -65, var8 - 1, 512);
                }
                if (arg2 == 3) {
                    this.method1588(var9, (byte) -60, var8, 32768);
                    this.method1588(var9 - 1, (byte) -112, var8 - 1, 2048);
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    this.method1588(var9, (byte) -86, var8, 66560);
                    this.method1588(var9 - 1, (byte) -72, var8, 4096);
                    this.method1588(var9, (byte) -19, var8 + 1, 16384);
                }
                if (arg2 == 1) {
                    this.method1588(var9, (byte) -112, var8, 5120);
                    this.method1588(var9, (byte) -93, var8 + 1, 16384);
                    this.method1588(var9 + 1, (byte) -42, var8, 65536);
                }
                if (arg2 == 2) {
                    this.method1588(var9, (byte) -70, var8, 20480);
                    this.method1588(var9 + 1, (byte) -115, var8, 65536);
                    this.method1588(var9, (byte) -96, var8 - 1, 1024);
                }
                if (arg2 == 3) {
                    this.method1588(var9, (byte) -51, var8, 81920);
                    this.method1588(var9, (byte) -23, var8 - 1, 1024);
                    this.method1588(var9 - 1, (byte) -82, var8, 4096);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1588(var9, (byte) -26, var8, 536870912);
                this.method1588(var9 - 1, (byte) -73, var8, 33554432);
            }
            if (arg2 == 1) {
                this.method1588(var9, (byte) -82, var8, 8388608);
                this.method1588(var9, (byte) -109, var8 + 1, 134217728);
            }
            if (arg2 == 2) {
                this.method1588(var9, (byte) -67, var8, 33554432);
                this.method1588(var9 + 1, (byte) -54, var8, 536870912);
            }
            if (arg2 == 3) {
                this.method1588(var9, (byte) -85, var8, 134217728);
                this.method1588(var9, (byte) -48, var8 - 1, 8388608);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1588(var9, (byte) -20, var8, 4194304);
                this.method1588(var9 - 1, (byte) -33, var8 + 1, 67108864);
            }
            if (arg2 == 1) {
                this.method1588(var9, (byte) -107, var8, 16777216);
                this.method1588(var9 + 1, (byte) -90, var8 + 1, 268435456);
            }
            if (arg2 == 2) {
                this.method1588(var9, (byte) -77, var8, 67108864);
                this.method1588(var9 + 1, (byte) -44, var8 - 1, 4194304);
            }
            if (arg2 == 3) {
                this.method1588(var9, (byte) -42, var8, 268435456);
                this.method1588(var9 - 1, (byte) -114, var8 - 1, 16777216);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1588(var9, (byte) -49, var8, 545259520);
            this.method1588(var9 - 1, (byte) -40, var8, 33554432);
            this.method1588(var9, (byte) -122, var8 + 1, 134217728);
        }
        if (arg2 == 1) {
            this.method1588(var9, (byte) -127, var8, 41943040);
            this.method1588(var9, (byte) -31, var8 + 1, 134217728);
            this.method1588(var9 + 1, (byte) -88, var8, 536870912);
        }
        if (arg2 == 2) {
            this.method1588(var9, (byte) -109, var8, 167772160);
            this.method1588(var9 + 1, (byte) -29, var8, 536870912);
            this.method1588(var9, (byte) -92, var8 - 1, 8388608);
        }
        if (arg2 == 3) {
            this.method1588(var9, (byte) -68, var8, 671088640);
            this.method1588(var9, (byte) -26, var8 - 1, 8388608);
            this.method1588(var9 - 1, (byte) -53, var8, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBII)V")
    private final void method1579(int arg0, byte arg1, int arg2, int arg3) {
        field3363++;
        if (arg1 > 3) {
            this.field3351[arg2][arg3] = class200.method1408(this.field3351[arg2][arg3], arg0);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIB)Z")
    public final boolean method1580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 >= -115) {
            this.method1582(-125, 43, 98, -25, -61, -114, (byte) -62, -120, 20);
        }
        field3357++;
        if (arg0 == 1) {
            if (arg2 == arg5 && arg1 == arg3) {
                return true;
            }
        } else if (arg2 <= arg5 && arg5 <= (arg0 + arg2 - 1) && arg1 <= arg1 && arg0 + arg1 - 1 >= arg1) {
            return true;
        }
        int var9 = arg5 - this.field3360;
        int var10 = arg1 - this.field3339;
        int var11 = arg2 - this.field3360;
        int var12 = arg3 - this.field3339;
        if (arg0 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3351[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3351[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3351[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field3351[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field3351[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field3351[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg0 - 1;
            int var14 = arg0 + var11 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var13 && (this.field3351[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var14 >= var9 && (var10 - arg0) == var12 && (this.field3351[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var9 - arg0) == var11 && var12 <= var10 && var13 >= var10 && (this.field3351[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var14 >= var9 && (var10 - arg0) == var12 && (this.field3351[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var9 - arg0) == var11 && var12 <= var10 && var10 <= var13 && (this.field3351[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && var10 + 1 == var12 && (this.field3351[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var13 && (this.field3351[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var14 >= var9 && var10 + 1 == var12 && (this.field3351[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 >= var11 && var14 >= var9 && var10 + 1 == var12 && (this.field3351[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var11 && var9 <= var14 && var10 - arg0 == var12 && (this.field3351[var9][var13] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg0 == var11 && var10 >= var12 && var13 >= var10 && (this.field3351[var14][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var12 <= var10 && var10 <= var13 && (this.field3351[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZBIIIIZ)V")
    public final void method1581(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg4 - this.field3339;
        int var9 = arg3 - this.field3360;
        field3362++;
        int var10 = 16 % ((arg1 + 23) / 40);
        int var11 = 256;
        if (arg0) {
            var11 |= 0x20000;
        }
        if (arg6) {
            var11 |= 0x40000000;
        }
        for (int var12 = var9; var12 < var9 + arg2; var12++) {
            if (var12 >= 0 && var12 < this.field3356) {
                for (int var13 = var8; var13 < (arg5 + var8); var13++) {
                    if (var13 >= 0 && var13 < this.field3341) {
                        this.method1579(var11, (byte) 24, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIBII)Z")
    public final boolean method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field3358++;
        if (arg2 > 1) {
            return class114.method853(arg1, arg3, arg2, arg2, arg5, arg0, arg4, (byte) 37, arg7) ? true : this.method1584(arg0, arg3, arg5, arg8, 1, arg1, arg4, arg7, arg2, arg2);
        }
        int var10 = arg0 + arg3 - 1;
        int var11 = arg5 + arg7 - 1;
        if (arg3 <= arg1 && arg1 <= var10 && arg4 >= arg7 && arg4 <= var11) {
            return true;
        } else if (arg3 - 1 == arg1 && arg7 <= arg4 && var11 >= arg4 && (this.field3351[arg1 - this.field3360][arg4 - this.field3339] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else {
            if (arg6 >= -34) {
                this.method1586(-24, 4, -30);
            }
            if ((var10 + 1) == arg1 && arg4 >= arg7 && arg4 <= var11 && (this.field3351[arg1 - this.field3360][arg4 - this.field3339] & 0x80) == 0 && (arg8 & 0x2) == 0) {
                return true;
            } else if ((arg7 - 1) == arg4 && arg3 <= arg1 && arg1 <= var10 && (this.field3351[arg1 - this.field3360][arg4 - this.field3339] & 0x2) == 0 && (arg8 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg4 && arg3 <= arg1 && arg1 <= var10 && (this.field3351[arg1 - this.field3360][arg4 - this.field3339] & 0x20) == 0 && (arg8 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3359++;
        if (arg6 != 0) {
            this.method1591(96);
        }
        if (arg4 == 1) {
            if (arg2 == arg7 && arg1 == arg5) {
                return true;
            }
        } else if (arg2 >= arg7 && arg4 + arg7 - 1 >= arg2 && arg1 <= arg1 && arg1 <= (arg1 + arg4 - 1)) {
            return true;
        }
        int var9 = arg2 - this.field3360;
        int var10 = arg1 - this.field3339;
        int var11 = arg7 - this.field3360;
        int var12 = arg5 - this.field3339;
        if (arg4 == 1) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field3351[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3351[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3351[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field3351[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field3351[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field3351[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3351[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field3351[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field3351[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field3351[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 == var12 && (this.field3351[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg4 - 1;
            int var14 = var11 + arg4 - 1;
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if (var9 - arg4 == var11 && var10 >= var12 && var13 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var14 >= var9 && (var10 + 1) == var12 && (this.field3351[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var14 >= var9 && (var10 - arg4) == var12 && (this.field3351[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 <= var9 && var14 >= var9 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 - arg4) == var11 && var12 <= var10 && var13 >= var10 && (this.field3351[var14][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 >= var12 && var13 >= var10 && (this.field3351[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var13) {
                        return true;
                    }
                    if (var11 <= var9 && var14 >= var9 && (var10 + 1) == var12 && (this.field3351[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && (var10 - arg4) == var12 && (this.field3351[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 >= var11 && var14 >= var9 && (var10 - arg4) == var12) {
                        return true;
                    }
                    if ((var9 - arg4) == var11 && var12 <= var10 && var13 >= var10 && (this.field3351[var14][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var13 && (this.field3351[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if ((var9 - arg4) == var11 && var10 >= var12 && var10 <= var13) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 <= var10 && var13 >= var10 && (this.field3351[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var14 >= var9 && (var10 - arg4) == var12 && (this.field3351[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 - arg4 == var11 && var12 <= var10 && var10 <= var13 && (this.field3351[var14][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var14 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 <= var10 && var13 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var14 && (var10 - arg4) == var12 && (this.field3351[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 - arg4) == var11 && var12 <= var10 && var10 <= var13 && (this.field3351[var14][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && (var10 + 1) == var12 && (this.field3351[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 >= var12 && var10 <= var13) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var14 && (var10 - arg4) == var12) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 - arg4 == var11 && var12 <= var10 && var10 <= var13) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && (var10 + 1) == var12 && (this.field3351[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 <= var10 && var13 >= var10 && (this.field3351[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var14 && (var10 - arg4) == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 >= var11 && var9 <= var14 && (var10 + 1) == var12 && (this.field3351[var9][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var9 && var9 <= var14 && (var10 - arg4) == var12 && (this.field3351[var9][var13] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var9 - arg4) == var11 && var12 <= var10 && var10 <= var13 && (this.field3351[var14][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 >= var12 && var10 <= var13 && (this.field3351[var11][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method1584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3337++;
        if (arg4 != 1) {
            this.method1586(69, 89, -81);
        }
        int var11 = arg5 + arg8;
        int var12 = arg6 + arg9;
        int var13 = arg0 + arg1;
        int var14 = arg2 + arg7;
        if (arg5 == var13 && (arg3 & 0x2) == 0) {
            int var15 = var12 >= var14 ? var14 : var12;
            for (int var16 = arg7 >= arg6 ? arg7 : arg6; var16 < var15; var16++) {
                if ((this.field3351[var13 - this.field3360 - 1][var16 - this.field3339] & 0x8) == 0) {
                    return true;
                }
            }
        } else if (arg1 == var11 && (arg3 & 0x8) == 0) {
            int var17 = arg7 < arg6 ? arg6 : arg7;
            int var18 = var12 < var14 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field3351[arg1 - this.field3360][var17 - this.field3339] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg3 & 0x1) == 0) {
            int var19 = arg5 > arg1 ? arg5 : arg1;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field3351[var19 - this.field3360][var14 - this.field3339 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg3 & 0x4) == 0) {
            int var21 = arg1 < arg5 ? arg5 : arg1;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field3351[var21 - this.field3360][arg7 - this.field3339] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method1585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg6 >= class264.field4230 && arg6 <= class273.field4418 && arg5 >= class264.field4230 && arg5 <= class273.field4418 && class264.field4230 <= arg2 && class273.field4418 >= arg2 && arg4 >= class264.field4230 && arg4 <= class273.field4418 && arg1 >= class73.field1156 && class59.field859 >= arg1 && arg9 >= class73.field1156 && class59.field859 >= arg9 && class73.field1156 <= arg3 && class59.field859 >= arg3 && class73.field1156 <= arg0 && class59.field859 >= arg0) {
            class136.method1026(arg1, arg7, arg6, arg5, arg9, arg0, false, arg3, arg2, arg4);
        } else {
            class208.method1472(arg7, arg9, arg2, arg0, arg6, arg1, arg3, arg5, arg4, (byte) -15);
        }
        field3347++;
        if (arg8 != -18) {
            field3361 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
    public final void method1586(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field3339;
        field3346++;
        if (arg1 == -31381) {
            int var5 = arg2 - this.field3360;
            this.field3351[var5][var4] = class301.method2056(this.field3351[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static void method1587(byte arg0) {
        field3344 = null;
        field3361 = null;
        field3355 = null;
        if (arg0 >= 79) {
            field3342 = null;
            field3354 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IBII)V")
    private final void method1588(int arg0, byte arg1, int arg2, int arg3) {
        this.field3351[arg0][arg2] = class301.method2056(this.field3351[arg0][arg2], ~arg3);
        if (arg1 >= -18) {
            this.method1589(-60, true, -127, true, 100, (byte) 13, -119, 4);
        }
        field3345++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZIZIBII)V")
    public final void method1589(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6, int arg7) {
        field3352++;
        int var9 = arg0 - this.field3339;
        int var10 = arg7 - this.field3360;
        int var11 = 256;
        if (arg5 >= -12) {
            field3342 = null;
        }
        if (arg6 == 1 || arg6 == 3) {
            int var12 = arg4;
            arg4 = arg2;
            arg2 = var12;
        }
        if (arg1) {
            var11 |= 0x20000;
        }
        if (arg3) {
            var11 |= 0x40000000;
        }
        for (int var13 = var10; var13 < arg4 + var10; var13++) {
            if (var13 >= 0 && this.field3356 > var13) {
                for (int var14 = var9; var14 < arg2 + var9; var14++) {
                    if (var14 >= 0 && this.field3341 > var14) {
                        this.method1588(var13, (byte) -127, var14, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZII)V")
    public final void method1590(boolean arg0, int arg1, int arg2) {
        field3338++;
        int var4 = arg1 - this.field3360;
        if (!arg0) {
            this.method1581(false, (byte) -9, 18, -82, -122, 3, true);
        }
        int var5 = arg2 - this.field3339;
        this.field3351[var4][var5] = class200.method1408(this.field3351[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public final void method1591(int arg0) {
        for (int var2 = 0; var2 < this.field3356; var2++) {
            for (int var3 = 0; var3 < this.field3341; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field3356 - 5 || (this.field3341 - 5) <= var3) {
                    this.field3351[var2][var3] = 16777215;
                } else {
                    this.field3351[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != 13610) {
            method1587((byte) 107);
        }
        field3340++;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(II)V")
    public class228(int arg0, int arg1) {
        this.field3356 = arg0;
        this.field3360 = 0;
        this.field3341 = arg1;
        this.field3351 = new int[this.field3356][this.field3341];
        this.method1591(13610);
    }
}
