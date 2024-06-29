import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class97 extends class131 {

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    private int field1304 = -32768;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Z")
    public static boolean field1287 = false;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field1296 = -1;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1290 = 0;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field1298 = 0;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Lbc;")
    public static class282 field1294;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "[I")
    public static int[] field1301;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static void method577(int arg0) {
        field1301 = null;
        int var1 = 108 / ((11 - arg0) / 61);
        field1294 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static final void method578(byte arg0) {
        class260.field3786.method71(-113);
        field1300++;
        if (arg0 < 78) {
            field1287 = false;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()I")
    public final int method227() {
        field1289++;
        return this.field1304;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public static final void method579(int arg0) {
        field1297++;
        if (class252.field3653 == 0) {
            return;
        }
        try {
            if (++class224.field3164 > 2000) {
                if (class117.field1637 != null) {
                    class117.field1637.method1199(-98);
                    class117.field1637 = null;
                }
                if (class84.field1169 >= 1) {
                    class143.field2050 = -5;
                    class252.field3653 = 0;
                    return;
                }
                class84.field1169++;
                class252.field3653 = 1;
                class224.field3164 = 0;
                if (class267.field3851 == class182.field2601) {
                    class182.field2601 = class263.field3811;
                } else {
                    class182.field2601 = class267.field3851;
                }
            }
            if (class252.field3653 == 1) {
                class163.field2344 = class115.field1592.method349(arg0 ^ 0xFFFFDBD6, class182.field2601, class151.field2198);
                class252.field3653 = 2;
            }
            if (arg0 == -9258) {
                if (class252.field3653 == 2) {
                    if (class163.field2344.field960 == 2) {
                        throw new IOException();
                    }
                    if (class163.field2344.field960 != 1) {
                        return;
                    }
                    class117.field1637 = new class185((Socket) class163.field2344.field958, class115.field1592);
                    class163.field2344 = null;
                    class117.field1637.method1206(class94.field1259.field3030, class94.field1259.field3021, (byte) -43, 0);
                    if (class73.field878 != null) {
                        class73.field878.method830(32237);
                    }
                    if (class282.field4282 != null) {
                        class282.field4282.method830(32237);
                    }
                    int var1 = class117.field1637.method1209((byte) 100);
                    if (class73.field878 != null) {
                        class73.field878.method830(32237);
                    }
                    if (class282.field4282 != null) {
                        class282.field4282.method830(32237);
                    }
                    if (var1 != 21) {
                        class252.field3653 = 0;
                        class143.field2050 = var1;
                        class117.field1637.method1199(-120);
                        class117.field1637 = null;
                        return;
                    }
                    class252.field3653 = 3;
                }
                if (class252.field3653 == 3) {
                    if (class117.field1637.method1202((byte) -104) < 1) {
                        return;
                    }
                    class212.field2969 = new String[class117.field1637.method1209((byte) 100)];
                    class252.field3653 = 4;
                }
                if (class252.field3653 == 4 && class117.field1637.method1202((byte) -107) >= class212.field2969.length * 8) {
                    class163.field2332.field3021 = 0;
                    class117.field1637.method1205(class163.field2332.field3030, class212.field2969.length * 8, false, 0);
                    for (int var2 = 0; var2 < class212.field2969.length; var2++) {
                        class212.field2969[var2] = class200.method1287(false, class163.field2332.method1386((byte) 96));
                    }
                    class143.field2050 = 21;
                    class252.field3653 = 0;
                    class117.field1637.method1199(-68);
                    class117.field1637 = null;
                }
            }
        } catch (IOException var3) {
            if (class117.field1637 != null) {
                class117.field1637.method1199(-36);
                class117.field1637 = null;
            }
            if (class84.field1169 >= 1) {
                class252.field3653 = 0;
                class143.field2050 = -4;
            } else {
                if (class267.field3851 == class182.field2601) {
                    class182.field2601 = class263.field3811;
                } else {
                    class182.field2601 = class267.field3851;
                }
                class252.field3653 = 1;
                class84.field1169++;
                class224.field3164 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)I")
    public static final int method580(byte arg0, int arg1) {
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field1288++;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = var2;
        double var8 = var2;
        double var10 = (double) (arg1 & 0xFF) / 256.0D;
        if (var4 > var2) {
            var8 = var4;
        }
        if (var2 > var4) {
            var6 = var4;
        }
        int var12 = -50 % ((arg0 + 56) / 33);
        double var13 = 0.0D;
        if (var6 > var10) {
            var6 = var10;
        }
        if (var10 > var8) {
            var8 = var10;
        }
        double var15 = 0.0D;
        double var17 = (var6 + var8) / 2.0D;
        if (var6 != var8) {
            if (var2 == var8) {
                var13 = (var4 - var10) / (var8 - var6);
            } else if (var4 == var8) {
                var13 = (var10 - var2) / (var8 - var6) + 2.0D;
            } else if (var8 == var10) {
                var13 = (var2 - var4) / (var8 - var6) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var8 - var6) / (var6 + var8);
            }
            if (var17 >= 0.5D) {
                var15 = (var8 - var6) / (2.0D - var8 - var6);
            }
        }
        int var19 = (int) (var15 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        int var20 = (int) (var17 * 256.0D);
        double var21 = var13 / 6.0D;
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var23 = (int) (var21 * 256.0D);
        if (var20 > 243) {
            var19 >>= 0x4;
        } else if (var20 > 217) {
            var19 >>= 0x3;
        } else if (var20 > 192) {
            var19 >>= 0x2;
        } else if (var20 > 179) {
            var19 >>= 0x1;
        }
        return (var23 >> 2 << 10) + (var19 >> 5 << 7) + (var20 >> 1);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1306++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIJILqd;)V")
    public final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class162 arg10) {
        field1293++;
        class106 var13 = class36.method224(this.field1303, 95).method1489(-1, (class134) null, this.field1302, (class274) null, 0, 0, -2);
        if (var13 != null) {
            var13.method235(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1304 = var13.method227();
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static final void method581(int arg0) {
        if (arg0 != 3) {
            field1287 = false;
        }
        class215.field3002++;
        field1291++;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Z")
    public static final boolean method582(int arg0, int arg1) {
        field1305++;
        if (arg1 >= -69) {
            return false;
        } else if (class294.field4649 == arg0) {
            return false;
        } else {
            class124.field1791 = new int[4][13][13];
            class134.field1946 = new int[104][104];
            for (int var2 = 0; var2 < 4; var2++) {
                class127.field1825[var2] = new class137(104, 104);
            }
            class80.field943 = new class234[4][104][104];
            class294.field4649 = arg0;
            class197.field2806 = new byte[4][104][104];
            class241.field3507 = new byte[4][104][104];
            return true;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBIZILqh;I)Lwj;")
    public static final class130 method583(int arg0, byte arg1, int arg2, boolean arg3, int arg4, class134 arg5, int arg6) {
        field1295++;
        int var8 = (arg2 << 19) + (arg3 ? 65536 : 0) + (arg6 << 17) + arg0;
        long var9 = (long) arg4 * 3147483667L + ((long) var8 * 3849834839L);
        class130 var11 = (class130) class38.field464.method65((byte) -96, var9);
        if (var11 != null) {
            return var11;
        }
        class297.field4702 = false;
        class130 var12 = class189.method1240(false, arg3, arg5, arg6, arg2, 0, arg4, arg0, false);
        if (var12 != null && !class297.field4702) {
            class38.field464.method64(var9, -1, var12);
        }
        return arg1 > -56 ? null : var12;
    }
}
