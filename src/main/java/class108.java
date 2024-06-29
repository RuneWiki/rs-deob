import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class108 {

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    private int field1603 = 0;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    private int field1594 = 0;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[[I")
    public int[][] field1592;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1595 = null;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1598 = "Loaded config";

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field1584 = -1;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1605 = "Loading - please wait.";

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lnc;")
    public static class161 field1608;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Lak;")
    public static class172 field1607;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "[[[Lhh;")
    public static class169[][][] field1593;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZZIIII)V", line = 7)
    public final void method734(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field1594;
        field1601++;
        int var9 = arg6 - this.field1603;
        if (~arg3 == arg0) {
            if (arg5 == 0) {
                this.method736(128, 1, var9, var8);
                this.method736(8, 1, var9, var8 - 1);
            }
            if (arg5 == 1) {
                this.method736(2, 1, var9, var8);
                this.method736(32, 1, var9 + 1, var8);
            }
            if (arg5 == 2) {
                this.method736(8, arg0 ^ 0xFFFFFFFE, var9, var8);
                this.method736(128, 1, var9, var8 + 1);
            }
            if (arg5 == 3) {
                this.method736(32, 1, var9, var8);
                this.method736(2, 1, var9 - 1, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method736(1, 1, var9, var8);
                this.method736(16, arg0 + 2, var9 - -1, var8 - 1);
            }
            if (arg5 == 1) {
                this.method736(4, 1, var9, var8);
                this.method736(64, arg0 + 2, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method736(16, 1, var9, var8);
                this.method736(1, 1, var9 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method736(64, 1, var9, var8);
                this.method736(4, 1, var9 - 1, var8 + -1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method736(130, arg0 + 2, var9, var8);
                this.method736(8, 1, var9, var8 - 1);
                this.method736(32, 1, var9 + 1, var8);
            }
            if (arg5 == 1) {
                this.method736(10, 1, var9, var8);
                this.method736(32, 1, var9 + 1, var8);
                this.method736(128, 1, var9, var8 + 1);
            }
            if (arg5 == 2) {
                this.method736(40, arg0 ^ 0xFFFFFFFE, var9, var8);
                this.method736(128, 1, var9, var8 + 1);
                this.method736(2, 1, var9 - 1, var8);
            }
            if (arg5 == 3) {
                this.method736(160, arg0 + 2, var9, var8);
                this.method736(2, 1, var9 - 1, var8);
                this.method736(8, arg0 ^ 0xFFFFFFFE, var9, var8 - 1);
            }
        }
        if (arg2) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method736(65536, 1, var9, var8);
                    this.method736(4096, 1, var9, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method736(1024, 1, var9, var8);
                    this.method736(16384, 1, var9 + 1, var8);
                }
                if (arg5 == 2) {
                    this.method736(4096, 1, var9, var8);
                    this.method736(65536, arg0 + 2, var9, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method736(16384, 1, var9, var8);
                    this.method736(1024, 1, var9 - 1, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method736(512, arg0 ^ 0xFFFFFFFE, var9, var8);
                    this.method736(8192, 1, var9 + 1, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method736(2048, arg0 ^ 0xFFFFFFFE, var9, var8);
                    this.method736(32768, 1, var9 + 1, var8 - -1);
                }
                if (arg5 == 2) {
                    this.method736(8192, 1, var9, var8);
                    this.method736(512, arg0 + 2, var9 + -1, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method736(32768, 1, var9, var8);
                    this.method736(2048, 1, var9 - 1, var8 + -1);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method736(66560, 1, var9, var8);
                    this.method736(4096, 1, var9, var8 - 1);
                    this.method736(16384, arg0 + 2, var9 + 1, var8);
                }
                if (arg5 == 1) {
                    this.method736(5120, 1, var9, var8);
                    this.method736(16384, 1, var9 + 1, var8);
                    this.method736(65536, 1, var9, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method736(20480, 1, var9, var8);
                    this.method736(65536, 1, var9, var8 + 1);
                    this.method736(1024, arg0 ^ 0xFFFFFFFE, var9 - 1, var8);
                }
                if (arg5 == 3) {
                    this.method736(81920, 1, var9, var8);
                    this.method736(1024, 1, var9 - 1, var8);
                    this.method736(4096, arg0 + 2, var9, var8 - 1);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method736(536870912, arg0 ^ 0xFFFFFFFE, var9, var8);
                this.method736(33554432, arg0 ^ 0xFFFFFFFE, var9, var8 - 1);
            }
            if (arg5 == 1) {
                this.method736(8388608, 1, var9, var8);
                this.method736(134217728, 1, var9 + 1, var8);
            }
            if (arg5 == 2) {
                this.method736(33554432, 1, var9, var8);
                this.method736(536870912, 1, var9, var8 + 1);
            }
            if (arg5 == 3) {
                this.method736(134217728, 1, var9, var8);
                this.method736(8388608, 1, var9 - 1, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method736(4194304, 1, var9, var8);
                this.method736(67108864, 1, var9 + 1, var8 + -1);
            }
            if (arg5 == 1) {
                this.method736(16777216, 1, var9, var8);
                this.method736(268435456, 1, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method736(67108864, arg0 + 2, var9, var8);
                this.method736(4194304, 1, var9 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method736(268435456, 1, var9, var8);
                this.method736(16777216, arg0 + 2, var9 + -1, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method736(545259520, 1, var9, var8);
            this.method736(33554432, 1, var9, var8 - 1);
            this.method736(134217728, arg0 ^ 0xFFFFFFFE, var9 + 1, var8);
        }
        if (arg5 == 1) {
            this.method736(41943040, 1, var9, var8);
            this.method736(134217728, 1, var9 + 1, var8);
            this.method736(536870912, arg0 ^ 0xFFFFFFFE, var9, var8 + 1);
        }
        if (arg5 == 2) {
            this.method736(167772160, 1, var9, var8);
            this.method736(536870912, 1, var9, var8 + 1);
            this.method736(8388608, arg0 ^ 0xFFFFFFFE, var9 - 1, var8);
        }
        if (arg5 == 3) {
            this.method736(671088640, 1, var9, var8);
            this.method736(8388608, 1, var9 - 1, var8);
            this.method736(33554432, 1, var9, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Component;ILjh;II)Lcg;", line = 306)
    public static final class316 method735(Component arg0, int arg1, class124 arg2, int arg3, int arg4) {
        field1585++;
        if (class338.field5275 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class316 var5 = (class316) Class.forName("lm").getDeclaredConstructor().newInstance();
                var5.field4922 = arg1;
                var5.field4905 = new int[(class44.field553 ? 2 : 1) * 256];
                var5.method300(arg0);
                var5.field4916 = (arg1 & 0xFFFFFC00) + 1024;
                int var6 = -71 % ((-arg3 - 52) / 52);
                if (var5.field4916 > 16384) {
                    var5.field4916 = 16384;
                }
                var5.method299(var5.field4916);
                if (class178.field2958 > 0 && class99.field1429 == null) {
                    class99.field1429 = new class322();
                    class99.field1429.field4995 = arg2;
                    arg2.method898(class99.field1429, (byte) -70, class178.field2958);
                }
                if (class99.field1429 != null) {
                    if (class99.field1429.field4993[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class99.field1429.field4993[arg4] = var5;
                }
                return var5;
            } catch (Throwable var11) {
                try {
                    class72 var8 = new class72(arg2, arg4);
                    var8.field4905 = new int[(class44.field553 ? 2 : 1) * 256];
                    var8.field4922 = arg1;
                    var8.method300(arg0);
                    var8.field4916 = 16384;
                    var8.method299(var8.field4916);
                    if (class178.field2958 > 0 && class99.field1429 == null) {
                        class99.field1429 = new class322();
                        class99.field1429.field4995 = arg2;
                        arg2.method898(class99.field1429, (byte) -107, class178.field2958);
                    }
                    if (class99.field1429 != null) {
                        if (class99.field1429.field4993[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class99.field1429.field4993[arg4] = var8;
                    }
                    return var8;
                } catch (Throwable var10) {
                    return new class316();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V", line = 389)
    private final void method736(int arg0, int arg1, int arg2, int arg3) {
        field1587++;
        this.field1592[arg3][arg2] = class122.method882(this.field1592[arg3][arg2], arg0);
        if (arg1 != 1) {
            this.field1603 = -116;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 406)
    public final void method737(int arg0) {
        for (int var2 = 0; var2 < this.field1597; var2++) {
            for (int var3 = 0; var3 < this.field1590; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1597 - 5 || (this.field1590 - 5) <= var3) {
                    this.field1592[var2][var3] = 16777215;
                } else {
                    this.field1592[var2][var3] = 2097152;
                }
            }
        }
        field1588++;
        int var4 = 93 % ((41 - arg0) / 48);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZI)V", line = 436)
    public final void method738(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field1594;
        int var5 = arg0 - this.field1603;
        field1602++;
        if (arg1) {
            this.field1592[var4][var5] = client.method767(this.field1592[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZI)V", line = 454)
    private final void method739(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            method743(80);
        }
        this.field1592[arg3][arg1] = client.method767(this.field1592[arg3][arg1], ~arg0);
        field1586++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZIZIII)V", line = 471)
    public final void method740(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = 28 % ((arg4 - 69) / 50);
        int var9 = arg0 - this.field1603;
        field1600++;
        int var10 = arg6 - this.field1594;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method739(128, var9, true, var10);
                this.method739(8, var9, true, var10 - 1);
            }
            if (arg5 == 1) {
                this.method739(2, var9, true, var10);
                this.method739(32, var9 + 1, true, var10);
            }
            if (arg5 == 2) {
                this.method739(8, var9, true, var10);
                this.method739(128, var9, true, var10 + 1);
            }
            if (arg5 == 3) {
                this.method739(32, var9, true, var10);
                this.method739(2, var9 - 1, true, var10);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method739(1, var9, true, var10);
                this.method739(16, var9 + 1, true, var10 - 1);
            }
            if (arg5 == 1) {
                this.method739(4, var9, true, var10);
                this.method739(64, var9 + 1, true, var10 + 1);
            }
            if (arg5 == 2) {
                this.method739(16, var9, true, var10);
                this.method739(1, var9 - 1, true, var10 + 1);
            }
            if (arg5 == 3) {
                this.method739(64, var9, true, var10);
                this.method739(4, var9 - 1, true, var10 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method739(130, var9, true, var10);
                this.method739(8, var9, true, var10 - 1);
                this.method739(32, var9 + 1, true, var10);
            }
            if (arg5 == 1) {
                this.method739(10, var9, true, var10);
                this.method739(32, var9 + 1, true, var10);
                this.method739(128, var9, true, var10 + 1);
            }
            if (arg5 == 2) {
                this.method739(40, var9, true, var10);
                this.method739(128, var9, true, var10 + 1);
                this.method739(2, var9 - 1, true, var10);
            }
            if (arg5 == 3) {
                this.method739(160, var9, true, var10);
                this.method739(2, var9 - 1, true, var10);
                this.method739(8, var9, true, var10 - 1);
            }
        }
        if (arg3) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method739(65536, var9, true, var10);
                    this.method739(4096, var9, true, var10 - 1);
                }
                if (arg5 == 1) {
                    this.method739(1024, var9, true, var10);
                    this.method739(16384, var9 + 1, true, var10);
                }
                if (arg5 == 2) {
                    this.method739(4096, var9, true, var10);
                    this.method739(65536, var9, true, var10 + 1);
                }
                if (arg5 == 3) {
                    this.method739(16384, var9, true, var10);
                    this.method739(1024, var9 - 1, true, var10);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method739(512, var9, true, var10);
                    this.method739(8192, var9 + 1, true, var10 - 1);
                }
                if (arg5 == 1) {
                    this.method739(2048, var9, true, var10);
                    this.method739(32768, var9 + 1, true, var10 + 1);
                }
                if (arg5 == 2) {
                    this.method739(8192, var9, true, var10);
                    this.method739(512, var9 - 1, true, var10 + 1);
                }
                if (arg5 == 3) {
                    this.method739(32768, var9, true, var10);
                    this.method739(2048, var9 - 1, true, var10 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method739(66560, var9, true, var10);
                    this.method739(4096, var9, true, var10 - 1);
                    this.method739(16384, var9 + 1, true, var10);
                }
                if (arg5 == 1) {
                    this.method739(5120, var9, true, var10);
                    this.method739(16384, var9 + 1, true, var10);
                    this.method739(65536, var9, true, var10 + 1);
                }
                if (arg5 == 2) {
                    this.method739(20480, var9, true, var10);
                    this.method739(65536, var9, true, var10 + 1);
                    this.method739(1024, var9 - 1, true, var10);
                }
                if (arg5 == 3) {
                    this.method739(81920, var9, true, var10);
                    this.method739(1024, var9 - 1, true, var10);
                    this.method739(4096, var9, true, var10 - 1);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method739(536870912, var9, true, var10);
                this.method739(33554432, var9, true, var10 - 1);
            }
            if (arg5 == 1) {
                this.method739(8388608, var9, true, var10);
                this.method739(134217728, var9 + 1, true, var10);
            }
            if (arg5 == 2) {
                this.method739(33554432, var9, true, var10);
                this.method739(536870912, var9, true, var10 + 1);
            }
            if (arg5 == 3) {
                this.method739(134217728, var9, true, var10);
                this.method739(8388608, var9 - 1, true, var10);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method739(4194304, var9, true, var10);
                this.method739(67108864, var9 + 1, true, var10 - 1);
            }
            if (arg5 == 1) {
                this.method739(16777216, var9, true, var10);
                this.method739(268435456, var9 + 1, true, var10 + 1);
            }
            if (arg5 == 2) {
                this.method739(67108864, var9, true, var10);
                this.method739(4194304, var9 - 1, true, var10 + 1);
            }
            if (arg5 == 3) {
                this.method739(268435456, var9, true, var10);
                this.method739(16777216, var9 - 1, true, var10 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method739(545259520, var9, true, var10);
            this.method739(33554432, var9, true, var10 - 1);
            this.method739(134217728, var9 + 1, true, var10);
        }
        if (arg5 == 1) {
            this.method739(41943040, var9, true, var10);
            this.method739(134217728, var9 + 1, true, var10);
            this.method739(536870912, var9, true, var10 + 1);
        }
        if (arg5 == 2) {
            this.method739(167772160, var9, true, var10);
            this.method739(536870912, var9, true, var10 + 1);
            this.method739(8388608, var9 - 1, true, var10);
        }
        if (arg5 == 3) {
            this.method739(671088640, var9, true, var10);
            this.method739(8388608, var9 - 1, true, var10);
            this.method739(33554432, var9, true, var10 - 1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V", line = 781)
    public final void method741(byte arg0, int arg1, int arg2) {
        if (arg0 != 101) {
            this.method739(37, -122, true, -39);
        }
        field1589++;
        int var4 = arg2 - this.field1594;
        int var5 = arg1 - this.field1603;
        this.field1592[var4][var5] = class122.method882(this.field1592[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V", line = 796)
    public final void method742(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1603;
        int var5 = arg1 - this.field1594;
        field1599++;
        this.field1592[var5][var4] = class122.method882(this.field1592[var5][var4], 262144);
        if (arg0 != 268435456) {
            this.method737(65);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 811)
    public static void method743(int arg0) {
        field1595 = null;
        field1607 = null;
        field1608 = null;
        field1605 = null;
        field1598 = null;
        if (arg0 >= -44) {
            field1605 = (String) null;
        }
        field1593 = (class169[][][]) null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIZIIIII)V", line = 827)
    public final void method744(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 256;
        if (arg0) {
            var9 |= 0x20000;
        }
        if (arg2) {
            var9 |= 0x40000000;
        }
        int var10 = arg5 - this.field1594;
        field1606++;
        int var11 = arg7 - this.field1603;
        if (arg3 == 1 || arg3 == 3) {
            int var12 = arg1;
            arg1 = arg4;
            arg4 = var12;
        }
        if (arg6 > -9) {
            return;
        }
        for (int var13 = var10; var13 < arg1 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field1597) {
                for (int var14 = var11; var14 < arg4 + var11; var14++) {
                    if (var14 >= 0 && this.field1590 > var14) {
                        this.method739(var9, var14, true, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZBIIIIZ)V", line = 885)
    public final void method745(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg3 - this.field1603;
        field1591++;
        int var9 = 256;
        int var10 = arg5 - this.field1594;
        if (arg1 != -60) {
            return;
        }
        if (arg0) {
            var9 |= 0x20000;
        }
        if (arg6) {
            var9 |= 0x40000000;
        }
        for (int var11 = var10; var11 < arg4 + var10; var11++) {
            if (var11 >= 0 && this.field1597 > var11) {
                for (int var12 = var8; var12 < (arg2 + var8); var12++) {
                    if (var12 >= 0 && this.field1590 > var12) {
                        this.method736(var9, 1, var12, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)Z", line = 936)
    public final boolean method746(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1596++;
        if (arg0 == arg1 && arg2 == arg4) {
            return true;
        }
        int var6 = arg4 - this.field1603;
        int var7 = arg0 - this.field1594;
        if (var7 < 0 || var7 >= this.field1597 || var6 < 0 || this.field1590 <= var6) {
            return false;
        }
        int var8 = arg1 - this.field1594;
        int var9 = arg2 - this.field1603;
        int var10;
        if (var6 <= var9) {
            var10 = var9 - var6;
        } else {
            var10 = var6 - var9;
        }
        if (arg3 <= 34) {
            field1608 = (class161) null;
        }
        int var11;
        if (var8 < var7) {
            var11 = var7 - var8;
        } else {
            var11 = var8 - var7;
        }
        if (var11 <= var10) {
            int var12 = var11 * 65536 / var10;
            int var13 = 32768;
            while (var6 != var9) {
                if (var9 < var6) {
                    if ((this.field1592[var8][var9] & 0x2C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var9 > var6) {
                    if ((this.field1592[var8][var9] & 0x2C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var7 > var8) {
                        if ((this.field1592[var8][var9] & 0x2C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field1592[var8][var9] & 0x2C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var7 != var8) {
                if (var8 < var7) {
                    if ((this.field1592[var8][var9] & 0x2C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var7 < var8) {
                    if ((this.field1592[var8][var9] & 0x2C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 > var9) {
                        if ((this.field1592[var8][var9] & 0x2C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var6 < var9) {
                        if ((this.field1592[var8][var9] & 0x2C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field1592[var7][var6] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V", line = 1101)
    public class108(int arg0, int arg1) {
        this.field1597 = arg0;
        this.field1590 = arg1;
        this.field1592 = new int[this.field1597][this.field1590];
        this.method737(90);
    }
}
