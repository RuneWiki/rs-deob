import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class74 extends class27 {

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "J")
    public static long field1078 = 0L;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "Z")
    public static boolean field1080 = false;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1084 = "Attack";

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)V", line = 5)
    public static void method609(int arg0) {
        if (arg0 != -18707) {
            field1084 = (String) null;
        }
        field1084 = null;
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)V", line = 16)
    public static final void method610(int arg0) {
        if (arg0 != 2) {
            field1080 = true;
        }
        field1081++;
        if (class56.field819 == 0) {
            return;
        }
        try {
            if (++class192.field2803 > 1500) {
                if (class67.field973 != null) {
                    class67.field973.method1555(false);
                    class67.field973 = null;
                }
                if (class2.field76 >= 1) {
                    class158.field2278 = -5;
                    class56.field819 = 0;
                    return;
                }
                class2.field76++;
                class56.field819 = 1;
                class192.field2803 = 0;
                if (class302.field4508 == class134.field1960) {
                    class302.field4508 = class291.field4407;
                } else {
                    class302.field4508 = class134.field1960;
                }
            }
            if (class56.field819 == 1) {
                class22.field340 = class54.field787.method486(class302.field4508, (byte) 85, class157.field2266);
                class56.field819 = 2;
            }
            if (class56.field819 == 2) {
                if (class22.field340.field3056 == 2) {
                    throw new IOException();
                }
                if (class22.field340.field3056 != 1) {
                    return;
                }
                class67.field973 = new class215((Socket) class22.field340.field3058, class54.field787);
                class22.field340 = null;
                class67.field973.method1558(5000, class107.field1533.field2718, 0, class107.field1533.field2776);
                if (class119.field1675 != null) {
                    class119.field1675.method535((byte) -124);
                }
                if (class28.field396 != null) {
                    class28.field396.method535((byte) -106);
                }
                int var1 = class67.field973.method1553(0);
                if (class119.field1675 != null) {
                    class119.field1675.method535((byte) -126);
                }
                if (class28.field396 != null) {
                    class28.field396.method535((byte) -101);
                }
                if (var1 != 101) {
                    class158.field2278 = var1;
                    class56.field819 = 0;
                    class67.field973.method1555(false);
                    class67.field973 = null;
                    return;
                }
                class56.field819 = 3;
            }
            if (class56.field819 == 3) {
                if (class67.field973.method1554(-2) >= 2) {
                    int var2 = class67.field973.method1553(0) << 8 | class67.field973.method1553(arg0 - 2);
                    class323.method2241(arg0 ^ 0x3, var2);
                    if (class15.field227 != -1) {
                        class56.field819 = 0;
                        class67.field973.method1555(false);
                        class67.field973 = null;
                        class303.method2139(arg0 ^ 0xA729EE9A);
                        return;
                    }
                    class56.field819 = 0;
                    class158.field2278 = 6;
                    class67.field973.method1555(false);
                    class67.field973 = null;
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class67.field973 != null) {
                class67.field973.method1555(false);
                class67.field973 = null;
            }
            if (class2.field76 >= 1) {
                class158.field2278 = -4;
                class56.field819 = 0;
            } else {
                if (class302.field4508 == class134.field1960) {
                    class302.field4508 = class291.field4407;
                } else {
                    class302.field4508 = class134.field1960;
                }
                class2.field76++;
                class192.field2803 = 0;
                class56.field819 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILsb;I)V", line = 174)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field1079++;
        if (arg0 == -5836 && arg2 == 0) {
            this.field376 = arg1.method1319(255) == 1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)V", line = 195)
    public static final void method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg3 + 1;
        class329.method2285(arg5, class274.field4158[arg3], (byte) 104, arg4, arg1);
        field1077++;
        int var8 = arg0 - 1;
        class329.method2285(arg5, class274.field4158[arg0], (byte) 114, arg4, arg1);
        if (arg2 <= 37) {
            method609(-74);
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class274.field4158[var6];
            var7[arg5] = var7[arg4] = arg1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 217)
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[[I", line = 223)
    public final int[][] method19(int arg0, int arg1) {
        if (arg0 != -28941) {
            field1084 = (String) null;
        }
        field1083++;
        int[][] var3 = this.field379.method668(arg1, 0);
        if (this.field379.field1171) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class209.field3053; var7++) {
                this.method612(var7, arg1, (byte) 101);
                int[][] var8 = this.method168(0, 32, class104.field1493);
                var5[var7] = var8[0][class173.field2503];
                var4[var7] = var8[1][class173.field2503];
                var6[var7] = var8[2][class173.field2503];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I", line = 269)
    public final int[] method18(int arg0, byte arg1) {
        int[] var3 = this.field375.method2087(arg1 ^ 0x78, arg0);
        field1082++;
        if (this.field375.field4382) {
            for (int var4 = 0; var4 < class209.field3053; var4++) {
                this.method612(var4, arg0, (byte) -123);
                int[] var5 = this.method164(class104.field1493, 61, 0);
                var3[var4] = var5[class173.field2503];
            }
        }
        if (arg1 != -62) {
            this.method19(-119, 95);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIB)V", line = 309)
    private final void method612(int arg0, int arg1, byte arg2) {
        int var4 = class251.field3721[arg0];
        field1076++;
        int var5 = class215.field3175[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var6 && -2.356194490192345D >= (double) var6) {
            class173.field2503 = arg0;
            class104.field1493 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class104.field1493 = arg0;
            class173.field2503 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class104.field1493 = arg0;
            class173.field2503 = class209.field3053 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class173.field2503 = arg0;
            class104.field1493 = class184.field2642 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class104.field1493 = class184.field2642 - arg1;
            class173.field2503 = class209.field3053 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class173.field2503 = class209.field3053 - arg1;
            class104.field1493 = class184.field2642 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class104.field1493 = class184.field2642 - arg0;
            class173.field2503 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class173.field2503 = class209.field3053 - arg0;
            class104.field1493 = arg1;
        }
        int var7 = 6 % ((44 - arg2) / 34);
        class104.field1493 &= class214.field3080;
        class173.field2503 &= class150.field2180;
    }
}
