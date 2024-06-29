import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class78 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[[I")
    public int[][] field1223;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "Z")
    public static boolean field1227 = true;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field1235 = 0;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field1230 = 0;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "Lpj;")
    public static class284 field1238 = new class284();

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "F")
    public static float field1243;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Lki;")
    public static class158 field1225;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static final void method613(byte arg0) {
        field1239++;
        class249.field3868.method944(65535);
        if (arg0 >= -70) {
            method619(-2, -62, 5, 79, 26);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BII)V")
    public final void method614(byte arg0, int arg1, int arg2) {
        field1221++;
        int var4 = arg2 - this.field1234;
        int var5 = 94 / ((arg0 - 69) / 50);
        int var6 = arg1 - this.field1237;
        this.field1223[var4][var6] = class186.method1215(this.field1223[var4][var6], 2097152);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public final void method615(int arg0) {
        for (int var2 = 0; var2 < this.field1222; var2++) {
            for (int var3 = 0; var3 < this.field1220; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field1222 - 5) <= var2 || (this.field1220 - 5) <= var3) {
                    this.field1223[var2][var3] = 16777215;
                } else {
                    this.field1223[var2][var3] = 2097152;
                }
            }
        }
        field1231++;
        if (arg0 != 2097152) {
            this.method614((byte) -126, 32, 8);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZZIIZI)V")
    public final void method616(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field1244++;
        int var8 = arg4 - this.field1234;
        if (!arg2) {
            return;
        }
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        int var10 = arg6 - this.field1237;
        if (arg5) {
            var9 |= 0x40000000;
        }
        for (int var11 = var8; var11 < var8 + arg3; var11++) {
            if (var11 >= 0 && var11 < this.field1222) {
                for (int var12 = var10; var12 < var10 + arg0; var12++) {
                    if (var12 >= 0 && this.field1220 > var12) {
                        this.method625(var9, var11, (byte) -115, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static final void method617(int arg0) {
        class61.field989.method940(37);
        class195.field2945.method940(26);
        class92.field1384.method940(54);
        if (arg0 <= 45) {
            method617(-16);
        }
        field1242++;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(BII)V")
    public final void method618(byte arg0, int arg1, int arg2) {
        field1229++;
        int var4 = arg1 - this.field1237;
        int var5 = arg2 - this.field1234;
        this.field1223[var5][var4] = class131.method904(this.field1223[var5][var4], -262145);
        if (arg0 != 83) {
            this.method614((byte) 67, 28, -3);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)V")
    public static final void method619(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 1) {
            method620(false);
        }
        if (arg0 - arg4 >= class196.field2961 && class84.field1287 >= (arg0 + arg4) && arg1 - arg4 >= class175.field2557 && class91.field1381 >= (arg1 + arg4)) {
            class113.method816(arg0, arg1, 0, arg4, arg3);
        } else {
            class267.method1807((byte) 123, arg1, arg4, arg0, arg3);
        }
        field1226++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
    public static void method620(boolean arg0) {
        field1225 = null;
        if (!arg0) {
            field1235 = 100;
        }
        field1238 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIZIZI)V")
    public final void method621(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg6 - this.field1237;
        field1240++;
        int var9 = arg4 - this.field1234;
        int var10 = -128 / ((-arg2 - 7) / 54);
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method627(var9, var8, 128, (byte) 26);
                this.method627(var9 - 1, var8, 8, (byte) 26);
            }
            if (arg1 == 1) {
                this.method627(var9, var8, 2, (byte) 26);
                this.method627(var9, var8 + 1, 32, (byte) 26);
            }
            if (arg1 == 2) {
                this.method627(var9, var8, 8, (byte) 26);
                this.method627(var9 + 1, var8, 128, (byte) 26);
            }
            if (arg1 == 3) {
                this.method627(var9, var8, 32, (byte) 26);
                this.method627(var9, var8 - 1, 2, (byte) 26);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method627(var9, var8, 1, (byte) 26);
                this.method627(var9 - 1, var8 + 1, 16, (byte) 26);
            }
            if (arg1 == 1) {
                this.method627(var9, var8, 4, (byte) 26);
                this.method627(var9 + 1, var8 + 1, 64, (byte) 26);
            }
            if (arg1 == 2) {
                this.method627(var9, var8, 16, (byte) 26);
                this.method627(var9 + 1, var8 + -1, 1, (byte) 26);
            }
            if (arg1 == 3) {
                this.method627(var9, var8, 64, (byte) 26);
                this.method627(var9 - 1, var8 + -1, 4, (byte) 26);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method627(var9, var8, 130, (byte) 26);
                this.method627(var9 - 1, var8, 8, (byte) 26);
                this.method627(var9, var8 + 1, 32, (byte) 26);
            }
            if (arg1 == 1) {
                this.method627(var9, var8, 10, (byte) 26);
                this.method627(var9, var8 + 1, 32, (byte) 26);
                this.method627(var9 + 1, var8, 128, (byte) 26);
            }
            if (arg1 == 2) {
                this.method627(var9, var8, 40, (byte) 26);
                this.method627(var9 + 1, var8, 128, (byte) 26);
                this.method627(var9, var8 - 1, 2, (byte) 26);
            }
            if (arg1 == 3) {
                this.method627(var9, var8, 160, (byte) 26);
                this.method627(var9, var8 - 1, 2, (byte) 26);
                this.method627(var9 - 1, var8, 8, (byte) 26);
            }
        }
        if (arg5) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method627(var9, var8, 65536, (byte) 26);
                    this.method627(var9 - 1, var8, 4096, (byte) 26);
                }
                if (arg1 == 1) {
                    this.method627(var9, var8, 1024, (byte) 26);
                    this.method627(var9, var8 + 1, 16384, (byte) 26);
                }
                if (arg1 == 2) {
                    this.method627(var9, var8, 4096, (byte) 26);
                    this.method627(var9 + 1, var8, 65536, (byte) 26);
                }
                if (arg1 == 3) {
                    this.method627(var9, var8, 16384, (byte) 26);
                    this.method627(var9, var8 - 1, 1024, (byte) 26);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method627(var9, var8, 512, (byte) 26);
                    this.method627(var9 - 1, var8 + 1, 8192, (byte) 26);
                }
                if (arg1 == 1) {
                    this.method627(var9, var8, 2048, (byte) 26);
                    this.method627(var9 + 1, var8 - -1, 32768, (byte) 26);
                }
                if (arg1 == 2) {
                    this.method627(var9, var8, 8192, (byte) 26);
                    this.method627(var9 + 1, var8 - 1, 512, (byte) 26);
                }
                if (arg1 == 3) {
                    this.method627(var9, var8, 32768, (byte) 26);
                    this.method627(var9 - 1, var8 + -1, 2048, (byte) 26);
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    this.method627(var9, var8, 66560, (byte) 26);
                    this.method627(var9 - 1, var8, 4096, (byte) 26);
                    this.method627(var9, var8 + 1, 16384, (byte) 26);
                }
                if (arg1 == 1) {
                    this.method627(var9, var8, 5120, (byte) 26);
                    this.method627(var9, var8 + 1, 16384, (byte) 26);
                    this.method627(var9 + 1, var8, 65536, (byte) 26);
                }
                if (arg1 == 2) {
                    this.method627(var9, var8, 20480, (byte) 26);
                    this.method627(var9 + 1, var8, 65536, (byte) 26);
                    this.method627(var9, var8 - 1, 1024, (byte) 26);
                }
                if (arg1 == 3) {
                    this.method627(var9, var8, 81920, (byte) 26);
                    this.method627(var9, var8 - 1, 1024, (byte) 26);
                    this.method627(var9 - 1, var8, 4096, (byte) 26);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method627(var9, var8, 536870912, (byte) 26);
                this.method627(var9 - 1, var8, 33554432, (byte) 26);
            }
            if (arg1 == 1) {
                this.method627(var9, var8, 8388608, (byte) 26);
                this.method627(var9, var8 + 1, 134217728, (byte) 26);
            }
            if (arg1 == 2) {
                this.method627(var9, var8, 33554432, (byte) 26);
                this.method627(var9 + 1, var8, 536870912, (byte) 26);
            }
            if (arg1 == 3) {
                this.method627(var9, var8, 134217728, (byte) 26);
                this.method627(var9, var8 - 1, 8388608, (byte) 26);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method627(var9, var8, 4194304, (byte) 26);
                this.method627(var9 - 1, var8 + 1, 67108864, (byte) 26);
            }
            if (arg1 == 1) {
                this.method627(var9, var8, 16777216, (byte) 26);
                this.method627(var9 + 1, var8 + 1, 268435456, (byte) 26);
            }
            if (arg1 == 2) {
                this.method627(var9, var8, 67108864, (byte) 26);
                this.method627(var9 + 1, var8 + -1, 4194304, (byte) 26);
            }
            if (arg1 == 3) {
                this.method627(var9, var8, 268435456, (byte) 26);
                this.method627(var9 - 1, var8 - 1, 16777216, (byte) 26);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method627(var9, var8, 545259520, (byte) 26);
            this.method627(var9 - 1, var8, 33554432, (byte) 26);
            this.method627(var9, var8 + 1, 134217728, (byte) 26);
        }
        if (arg1 == 1) {
            this.method627(var9, var8, 41943040, (byte) 26);
            this.method627(var9, var8 + 1, 134217728, (byte) 26);
            this.method627(var9 + 1, var8, 536870912, (byte) 26);
        }
        if (arg1 == 2) {
            this.method627(var9, var8, 167772160, (byte) 26);
            this.method627(var9 + 1, var8, 536870912, (byte) 26);
            this.method627(var9, var8 - 1, 8388608, (byte) 26);
        }
        if (arg1 == 3) {
            this.method627(var9, var8, 671088640, (byte) 26);
            this.method627(var9, var8 - 1, 8388608, (byte) 26);
            this.method627(var9 - 1, var8, 33554432, (byte) 26);
            return;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)Lte;")
    public static final class108 method622(byte arg0, int arg1) {
        field1241++;
        class108 var2 = (class108) class231.field3576.method945((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        int var3 = -51 / ((33 - arg0) / 50);
        byte[] var4 = class51.field837.method1605(-124, arg1, 4);
        class108 var5 = new class108();
        if (var4 != null) {
            var5.method784(arg1, new class54(var4), -30076);
        }
        class231.field3576.method941(var5, (long) arg1, -8447);
        return var5;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIZZII)V")
    public final void method623(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        field1224++;
        if (arg0 == 1 || arg0 == 3) {
            int var9 = arg2;
            arg2 = arg6;
            arg6 = var9;
        }
        int var10 = arg7 - this.field1234;
        int var11 = arg3 - this.field1237;
        int var12 = 256;
        if (arg4) {
            var12 |= 0x20000;
        }
        if (arg5) {
            var12 |= 0x40000000;
        }
        for (int var13 = var10; var13 < var10 + arg2; var13++) {
            if (var13 >= 0 && this.field1222 > var13) {
                for (int var14 = var11; var14 < (arg6 + var11); var14++) {
                    if (var14 >= 0 && this.field1220 > var14) {
                        this.method627(var13, var14, var12, (byte) 26);
                    }
                }
            }
        }
        if (arg1 >= -126) {
            this.method623(-98, 112, 121, 16, true, true, 24, -22);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V")
    public final void method624(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1237;
        int var5 = arg0 - this.field1234;
        this.field1223[var5][var4] = class186.method1215(this.field1223[var5][var4], 262144);
        if (arg2 != 1) {
            this.method621(-30, 105, 34, true, 84, false, 69);
        }
        field1232++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIBI)V")
    private final void method625(int arg0, int arg1, byte arg2, int arg3) {
        this.field1223[arg1][arg3] = class186.method1215(this.field1223[arg1][arg3], arg0);
        field1228++;
        if (arg2 > -27) {
            method622((byte) 62, -37);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZIIIZI)V")
    public final void method626(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field1236++;
        int var8 = arg6 - this.field1234;
        int var9 = arg3 - this.field1237;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method625(128, var8, (byte) -43, var9);
                this.method625(8, var8 - 1, (byte) -60, var9);
            }
            if (arg4 == 1) {
                this.method625(2, var8, (byte) -65, var9);
                this.method625(32, var8, (byte) -45, var9 + 1);
            }
            if (arg4 == 2) {
                this.method625(8, var8, (byte) -43, var9);
                this.method625(128, var8 + 1, (byte) -77, var9);
            }
            if (arg4 == 3) {
                this.method625(32, var8, (byte) -55, var9);
                this.method625(2, var8, (byte) -64, var9 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method625(1, var8, (byte) -34, var9);
                this.method625(16, var8 - 1, (byte) -45, var9 + 1);
            }
            if (arg4 == 1) {
                this.method625(4, var8, (byte) -78, var9);
                this.method625(64, var8 + 1, (byte) -115, var9 + 1);
            }
            if (arg4 == 2) {
                this.method625(16, var8, (byte) -101, var9);
                this.method625(1, var8 + 1, (byte) -87, var9 - 1);
            }
            if (arg4 == 3) {
                this.method625(64, var8, (byte) -68, var9);
                this.method625(4, var8 - 1, (byte) -105, var9 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method625(130, var8, (byte) -94, var9);
                this.method625(8, var8 - 1, (byte) -101, var9);
                this.method625(32, var8, (byte) -56, var9 + 1);
            }
            if (arg4 == 1) {
                this.method625(10, var8, (byte) -80, var9);
                this.method625(32, var8, (byte) -94, var9 + 1);
                this.method625(128, var8 + 1, (byte) -82, var9);
            }
            if (arg4 == 2) {
                this.method625(40, var8, (byte) -114, var9);
                this.method625(128, var8 + 1, (byte) -103, var9);
                this.method625(2, var8, (byte) -39, var9 - 1);
            }
            if (arg4 == 3) {
                this.method625(160, var8, (byte) -90, var9);
                this.method625(2, var8, (byte) -80, var9 - 1);
                this.method625(8, var8 - 1, (byte) -84, var9);
            }
        }
        if (arg2 != 5623) {
            this.field1220 = -1;
        }
        if (arg1) {
            if (arg0 == 0) {
                if (arg4 == 0) {
                    this.method625(65536, var8, (byte) -70, var9);
                    this.method625(4096, var8 - 1, (byte) -72, var9);
                }
                if (arg4 == 1) {
                    this.method625(1024, var8, (byte) -35, var9);
                    this.method625(16384, var8, (byte) -122, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method625(4096, var8, (byte) -48, var9);
                    this.method625(65536, var8 + 1, (byte) -55, var9);
                }
                if (arg4 == 3) {
                    this.method625(16384, var8, (byte) -97, var9);
                    this.method625(1024, var8, (byte) -113, var9 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg4 == 0) {
                    this.method625(512, var8, (byte) -128, var9);
                    this.method625(8192, var8 - 1, (byte) -81, var9 + 1);
                }
                if (arg4 == 1) {
                    this.method625(2048, var8, (byte) -67, var9);
                    this.method625(32768, var8 + 1, (byte) -31, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method625(8192, var8, (byte) -78, var9);
                    this.method625(512, var8 + 1, (byte) -108, var9 - 1);
                }
                if (arg4 == 3) {
                    this.method625(32768, var8, (byte) -92, var9);
                    this.method625(2048, var8 - 1, (byte) -75, var9 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg4 == 0) {
                    this.method625(66560, var8, (byte) -81, var9);
                    this.method625(4096, var8 - 1, (byte) -68, var9);
                    this.method625(16384, var8, (byte) -101, var9 + 1);
                }
                if (arg4 == 1) {
                    this.method625(5120, var8, (byte) -73, var9);
                    this.method625(16384, var8, (byte) -34, var9 + 1);
                    this.method625(65536, var8 + 1, (byte) -69, var9);
                }
                if (arg4 == 2) {
                    this.method625(20480, var8, (byte) -91, var9);
                    this.method625(65536, var8 + 1, (byte) -95, var9);
                    this.method625(1024, var8, (byte) -120, var9 - 1);
                }
                if (arg4 == 3) {
                    this.method625(81920, var8, (byte) -53, var9);
                    this.method625(1024, var8, (byte) -83, var9 - 1);
                    this.method625(4096, var8 - 1, (byte) -88, var9);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method625(536870912, var8, (byte) -103, var9);
                this.method625(33554432, var8 - 1, (byte) -33, var9);
            }
            if (arg4 == 1) {
                this.method625(8388608, var8, (byte) -64, var9);
                this.method625(134217728, var8, (byte) -124, var9 + 1);
            }
            if (arg4 == 2) {
                this.method625(33554432, var8, (byte) -70, var9);
                this.method625(536870912, var8 + 1, (byte) -95, var9);
            }
            if (arg4 == 3) {
                this.method625(134217728, var8, (byte) -39, var9);
                this.method625(8388608, var8, (byte) -106, var9 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method625(4194304, var8, (byte) -108, var9);
                this.method625(67108864, var8 - 1, (byte) -99, var9 + 1);
            }
            if (arg4 == 1) {
                this.method625(16777216, var8, (byte) -113, var9);
                this.method625(268435456, var8 + 1, (byte) -51, var9 + 1);
            }
            if (arg4 == 2) {
                this.method625(67108864, var8, (byte) -91, var9);
                this.method625(4194304, var8 + 1, (byte) -117, var9 - 1);
            }
            if (arg4 == 3) {
                this.method625(268435456, var8, (byte) -58, var9);
                this.method625(16777216, var8 - 1, (byte) -34, var9 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method625(545259520, var8, (byte) -105, var9);
            this.method625(33554432, var8 - 1, (byte) -116, var9);
            this.method625(134217728, var8, (byte) -56, var9 + 1);
        }
        if (arg4 == 1) {
            this.method625(41943040, var8, (byte) -48, var9);
            this.method625(134217728, var8, (byte) -103, var9 + 1);
            this.method625(536870912, var8 + 1, (byte) -39, var9);
        }
        if (arg4 == 2) {
            this.method625(167772160, var8, (byte) -34, var9);
            this.method625(536870912, var8 + 1, (byte) -81, var9);
            this.method625(8388608, var8, (byte) -91, var9 - 1);
        }
        if (arg4 == 3) {
            this.method625(671088640, var8, (byte) -104, var9);
            this.method625(8388608, var8, (byte) -78, var9 - 1);
            this.method625(33554432, var8 - 1, (byte) -86, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIB)V")
    private final void method627(int arg0, int arg1, int arg2, byte arg3) {
        field1233++;
        if (arg3 != 26) {
            field1235 = 40;
        }
        this.field1223[arg0][arg1] = class131.method904(this.field1223[arg0][arg1], ~arg2);
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(II)V")
    public class78(int arg0, int arg1) {
        this.field1220 = arg1;
        this.field1234 = 0;
        this.field1222 = arg0;
        this.field1223 = new int[this.field1222][this.field1220];
        this.field1237 = 0;
        this.method615(2097152);
    }
}
