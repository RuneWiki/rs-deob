import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class323 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "S")
    public short field4255 = 0;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public int field4251 = 0;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Ljava/lang/String;")
    public String field4271 = "null";

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field4252 = -1;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public int field4261 = -1;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public int field4262 = 256;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public int field4267 = -1;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "B")
    private byte field4294 = 0;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public int field4264 = -1;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public int field4293 = -1;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public int field4270 = 255;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public int field4297 = -1;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "B")
    public byte field4301 = -96;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public int field4289 = -1;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public int field4266 = -1;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "Z")
    public boolean field4278 = false;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public int field4275 = -1;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "B")
    public byte field4285 = -1;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "Z")
    public boolean field4299 = true;

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
    private int field4311 = -1;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "Z")
    public boolean field4287 = false;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "Z")
    public boolean field4306 = true;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    public int field4298 = -1;

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "B")
    public byte field4312 = -16;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "S")
    public short field4304 = 0;

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "I")
    public int field4308 = -1;

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "I")
    public int field4310 = -1;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public int field4284 = -1;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public int field4286 = -1;

    @OriginalMember(owner = "client!rb", name = "mb", descriptor = "B")
    public byte field4314 = 0;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    private int field4273 = 128;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "B")
    public byte field4256 = 4;

    @OriginalMember(owner = "client!rb", name = "pb", descriptor = "I")
    public int field4317 = -1;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field4259 = 32;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
    public int field4307 = -1;

    @OriginalMember(owner = "client!rb", name = "tb", descriptor = "I")
    private int field4321 = 0;

    @OriginalMember(owner = "client!rb", name = "ub", descriptor = "[Ljava/lang/String;")
    public String[] field4322 = new String[5];

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "Z")
    public boolean field4302 = true;

    @OriginalMember(owner = "client!rb", name = "vb", descriptor = "I")
    private int field4323 = -1;

    @OriginalMember(owner = "client!rb", name = "zb", descriptor = "I")
    public int field4327 = 256;

    @OriginalMember(owner = "client!rb", name = "qb", descriptor = "I")
    public int field4318 = 1;

    @OriginalMember(owner = "client!rb", name = "yb", descriptor = "I")
    public int field4326 = -1;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "Z")
    public boolean field4303 = false;

    @OriginalMember(owner = "client!rb", name = "ob", descriptor = "I")
    public int field4316 = -1;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    private int field4279 = 0;

    @OriginalMember(owner = "client!rb", name = "sb", descriptor = "Z")
    public boolean field4320 = true;

    @OriginalMember(owner = "client!rb", name = "lb", descriptor = "I")
    private int field4313 = 128;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field4283 = -2;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lpe;")
    public static class564 field4274 = new class564();

    @OriginalMember(owner = "client!rb", name = "Bb", descriptor = "Ljk;")
    public static class585 field4329 = new class585(29, 15);

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "B")
    private byte field4254;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "B")
    private byte field4257;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "B")
    private byte field4291;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!rb", name = "wb", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!rb", name = "xb", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!rb", name = "Ab", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!rb", name = "Cb", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!rb", name = "rb", descriptor = "Lbfa;")
    public class338 field4319;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "Lwaa;")
    private class652 field4282;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "Z")
    public boolean field4277;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "[B")
    private byte[] field4281;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "[I")
    private int[] field4263;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "[I")
    public int[] field4292;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "[I")
    private int[] field4296;

    @OriginalMember(owner = "client!rb", name = "nb", descriptor = "[I")
    public int[] field4315;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[S")
    private short[] field4253;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "[S")
    private short[] field4272;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "[S")
    private short[] field4276;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "[S")
    private short[] field4309;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "[[I")
    private int[][] field4265;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public final void method1874(int arg0) {
        if (this.field4296 == null) {
            this.field4296 = new int[0];
        }
        int var2 = 124 / ((-arg0 - 69) / 39);
        if (this.field4285 == -1) {
            if (class668.field9580 == this.field4319.field4490) {
                this.field4285 = 1;
            } else {
                this.field4285 = 0;
            }
        }
        field4295++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Lmp;")
    public static final class705 method1875(int arg0, byte arg1) {
        field4288++;
        class705 var2 = (class705) class364.field4900.method2766(-126, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -104) {
            method1879((byte) 96);
        }
        byte[] var3 = class434.field6231.method3800(arg0, 1, (byte) -92);
        class705 var4 = new class705();
        var4.field9966 = arg0;
        if (var3 != null) {
            var4.method3948(new class389(var3), true);
        }
        var4.method3950(false);
        if (var4.field9971 == 2 && class346.field4539.method3678((long) arg0, -120) == null) {
            class346.field4539.method3670((long) arg0, new class556(class221.field2855), (byte) 127);
            class190.field2325[class221.field2855++] = var4;
        }
        class364.field4900.method2772(var4, true, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjava/io/File;[B)V")
    public static final void method1876(int arg0, int arg1, File arg2, byte[] arg3) throws IOException {
        field4250++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg3, 0, arg0);
        } catch (EOFException var5) {
        }
        if (arg1 > -47) {
            method1880(null, 113);
        }
        var4.close();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)I")
    public final int method1877(int arg0, int arg1, int arg2) {
        field4269++;
        if (this.field4282 == null) {
            return arg1;
        }
        class556 var4 = (class556) this.field4282.method3678((long) arg0, -127);
        if (arg2 != -1) {
            this.field4328 = -85;
        }
        return var4 == null ? arg1 : var4.field8043;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z")
    public final boolean method1878(byte arg0) {
        field4280++;
        if (this.field4315 == null) {
            return this.field4293 != -1 || this.field4308 != -1 || this.field4310 != -1;
        }
        int var2 = 0;
        if (arg0 != 98) {
            this.method1884(false, 77, null);
        }
        while (var2 < this.field4315.length) {
            if (this.field4315[var2] != -1) {
                class323 var3 = this.field4319.method1949(-114, this.field4315[var2]);
                if (var3.field4293 != -1 || var3.field4308 != -1 || var3.field4310 != -1) {
                    return true;
                }
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public static void method1879(byte arg0) {
        field4274 = null;
        int var1 = 59 % ((15 - arg0) / 38);
        field4329 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lec;I)V")
    public static final void method1880(class213 arg0, int arg1) {
        field4330++;
        int var2 = arg0.field2653 - class543.field7882;
        int var3 = arg0.field2602 * 512 + (arg0.method1284((byte) -124) * 256);
        int var4 = arg0.field2650 * 512 + arg0.method1284((byte) -124) * 256;
        arg0.field531 += (var4 - arg0.field531) / var2;
        arg0.field2688 = 0;
        arg0.field530 += (var3 - arg0.field530) / var2;
        if (arg0.field2622 == 0) {
            arg0.method1295(-1, 8192);
        }
        if (arg1 > -125) {
            return;
        }
        if (arg0.field2622 == 1) {
            arg0.method1295(-1, 12288);
        }
        if (arg0.field2622 == 2) {
            arg0.method1295(-1, 0);
        }
        if (arg0.field2622 == 3) {
            arg0.method1295(-1, 4096);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lri;B)Lrb;")
    public final class323 method1881(class95 arg0, byte arg1) {
        field4290++;
        int var3 = -1;
        int var4 = 46 % ((68 - arg1) / 42);
        if (this.field4323 != -1) {
            var3 = arg0.method732(117, this.field4323);
        } else if (this.field4311 != -1) {
            var3 = arg0.method731(this.field4311, (byte) -107);
        }
        if (var3 < 0 || var3 >= (this.field4315.length - 1) || this.field4315[var3] == -1) {
            int var5 = this.field4315[this.field4315.length - 1];
            return var5 == -1 ? null : this.field4319.method1949(-10, var5);
        } else {
            return this.field4319.method1949(-82, this.field4315[var3]);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILun;)V")
    public final void method1882(int arg0, class389 arg1) {
        while (true) {
            int var3 = arg1.method2229(255);
            if (var3 == 0) {
                field4268++;
                if (arg0 != 4096) {
                    this.method1887(-71, -124, -119, null, null, 20, false, -5, -87, -70, null, null, null, 48, null, null, null);
                    return;
                }
                return;
            }
            this.method1884(true, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLri;)Z")
    public final boolean method1883(boolean arg0, class95 arg1) {
        if (!arg0) {
            this.field4327 = -50;
        }
        field4260++;
        if (this.field4315 == null) {
            return true;
        }
        int var3 = -1;
        if (this.field4323 != -1) {
            var3 = arg1.method732(111, this.field4323);
        } else if (this.field4311 != -1) {
            var3 = arg1.method731(this.field4311, (byte) -113);
        }
        if (var3 < 0 || this.field4315.length - 1 <= var3 || this.field4315[var3] == -1) {
            int var4 = this.field4315[this.field4315.length - 1];
            return var4 != -1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZILun;)V")
    private final void method1884(boolean arg0, int arg1, class389 arg2) {
        field4258++;
        if (!arg0) {
            this.method1883(false, null);
        }
        if (arg1 == 1) {
            int var27 = arg2.method2229(255);
            this.field4296 = new int[var27];
            for (int var28 = 0; var28 < var27; var28++) {
                this.field4296[var28] = arg2.method2260(-41);
                if (this.field4296[var28] == 65535) {
                    this.field4296[var28] = -1;
                }
            }
        } else if (arg1 == 2) {
            this.field4271 = arg2.method2244((byte) -62);
        } else if (arg1 == 12) {
            this.field4318 = arg2.method2229(255);
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field4322[arg1 - 30] = arg2.method2244((byte) -92);
        } else if (arg1 == 40) {
            int var4 = arg2.method2229(255);
            this.field4272 = new short[var4];
            this.field4276 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4276[var5] = (short) arg2.method2260(-69);
                this.field4272[var5] = (short) arg2.method2260(-100);
            }
        } else if (arg1 == 41) {
            int var25 = arg2.method2229(255);
            this.field4253 = new short[var25];
            this.field4309 = new short[var25];
            for (int var26 = 0; var26 < var25; var26++) {
                this.field4309[var26] = (short) arg2.method2260(-29);
                this.field4253[var26] = (short) arg2.method2260(-93);
            }
        } else if (arg1 == 42) {
            int var23 = arg2.method2229(255);
            this.field4281 = new byte[var23];
            for (int var24 = 0; var24 < var23; var24++) {
                this.field4281[var24] = arg2.method2249((byte) -70);
            }
        } else if (arg1 == 60) {
            int var6 = arg2.method2229(255);
            this.field4263 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4263[var7] = arg2.method2260(-56);
            }
        } else if (arg1 == 93) {
            this.field4306 = false;
        } else if (arg1 == 95) {
            this.field4284 = arg2.method2260(-52);
        } else if (arg1 == 97) {
            this.field4273 = arg2.method2260(-64);
        } else if (arg1 == 98) {
            this.field4313 = arg2.method2260(-79);
        } else if (arg1 == 99) {
            this.field4287 = true;
        } else if (arg1 == 100) {
            this.field4321 = arg2.method2249((byte) -70);
        } else if (arg1 == 101) {
            this.field4279 = arg2.method2249((byte) -70) * 5;
        } else if (arg1 == 102) {
            this.field4298 = arg2.method2260(-88);
        } else if (arg1 == 103) {
            this.field4259 = arg2.method2260(-33);
        } else if (arg1 == 106 || arg1 == 118) {
            this.field4323 = arg2.method2260(-68);
            if (this.field4323 == 65535) {
                this.field4323 = -1;
            }
            this.field4311 = arg2.method2260(-33);
            if (this.field4311 == 65535) {
                this.field4311 = -1;
            }
            int var20 = -1;
            if (arg1 == 118) {
                var20 = arg2.method2260(-48);
                if (var20 == 65535) {
                    var20 = -1;
                }
            }
            int var21 = arg2.method2229(255);
            this.field4315 = new int[var21 + 2];
            for (int var22 = 0; var22 <= var21; var22++) {
                this.field4315[var22] = arg2.method2260(-67);
                if (this.field4315[var22] == 65535) {
                    this.field4315[var22] = -1;
                }
            }
            this.field4315[var21 + 1] = var20;
        } else if (arg1 == 107) {
            this.field4299 = false;
        } else if (arg1 == 109) {
            this.field4320 = false;
        } else if (arg1 == 111) {
            this.field4302 = false;
        } else if (arg1 == 113) {
            this.field4255 = (short) arg2.method2260(-97);
            this.field4304 = (short) arg2.method2260(-121);
        } else if (arg1 == 114) {
            this.field4301 = arg2.method2249((byte) -70);
            this.field4312 = arg2.method2249((byte) -70);
        } else if (arg1 == 119) {
            this.field4314 = arg2.method2249((byte) -70);
        } else if (arg1 == 121) {
            this.field4265 = new int[this.field4296.length][];
            int var8 = arg2.method2229(255);
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2229(255);
                int[] var11 = this.field4265[var10] = new int[3];
                var11[0] = arg2.method2249((byte) -70);
                var11[1] = arg2.method2249((byte) -70);
                var11[2] = arg2.method2249((byte) -70);
            }
        } else if (arg1 == 122) {
            this.field4264 = arg2.method2260(-56);
        } else if (arg1 == 123) {
            this.field4261 = arg2.method2260(-111);
        } else if (arg1 == 125) {
            this.field4256 = arg2.method2249((byte) -70);
        } else if (arg1 == 127) {
            this.field4297 = arg2.method2260(-87);
        } else if (arg1 == 128) {
            arg2.method2229(255);
        } else if (arg1 == 134) {
            this.field4293 = arg2.method2260(-86);
            if (this.field4293 == 65535) {
                this.field4293 = -1;
            }
            this.field4326 = arg2.method2260(-81);
            if (this.field4326 == 65535) {
                this.field4326 = -1;
            }
            this.field4308 = arg2.method2260(-72);
            if (this.field4308 == 65535) {
                this.field4308 = -1;
            }
            this.field4310 = arg2.method2260(-67);
            if (this.field4310 == 65535) {
                this.field4310 = -1;
            }
            this.field4251 = arg2.method2229(255);
        } else if (arg1 == 135) {
            this.field4307 = arg2.method2229(255);
            this.field4317 = arg2.method2260(-59);
        } else if (arg1 == 136) {
            this.field4266 = arg2.method2229(255);
            this.field4267 = arg2.method2260(-90);
        } else if (arg1 == 137) {
            this.field4289 = arg2.method2260(-123);
        } else if (arg1 == 138) {
            this.field4286 = arg2.method2260(-45);
        } else if (arg1 == 139) {
            this.field4252 = arg2.method2260(-98);
        } else if (arg1 == 140) {
            this.field4270 = arg2.method2229(255);
        } else if (arg1 == 141) {
            this.field4303 = true;
        } else if (arg1 == 142) {
            this.field4316 = arg2.method2260(-55);
        } else if (arg1 == 143) {
            this.field4278 = true;
        } else {
            if (arg1 < 150 || arg1 >= 155) {
                if (arg1 == 155) {
                    this.field4257 = arg2.method2249((byte) -70);
                    this.field4291 = arg2.method2249((byte) -70);
                    this.field4254 = arg2.method2249((byte) -70);
                    this.field4294 = arg2.method2249((byte) -70);
                    return;
                } else if (arg1 == 158) {
                    this.field4285 = 1;
                    return;
                } else if (arg1 == 159) {
                    this.field4285 = 0;
                    return;
                } else if (arg1 == 160) {
                    int var12 = arg2.method2229(255);
                    this.field4292 = new int[var12];
                    for (int var13 = 0; var13 < var12; var13++) {
                        this.field4292[var13] = arg2.method2260(-24);
                    }
                    return;
                } else if (arg1 == 162) {
                    this.field4277 = true;
                    return;
                } else if (arg1 == 163) {
                    this.field4275 = arg2.method2229(255);
                    return;
                } else {
                    if (arg1 == 164) {
                        this.field4327 = arg2.method2260(-64);
                        this.field4262 = arg2.method2260(-101);
                    } else if (arg1 == 249) {
                        int var14 = arg2.method2229(255);
                        if (this.field4282 == null) {
                            int var15 = class698.method3915(var14, (byte) 93);
                            this.field4282 = new class652(var15);
                        }
                        for (int var16 = 0; var16 < var14; var16++) {
                            boolean var17 = arg2.method2229(255) == 1;
                            int var18 = arg2.method2258(-3);
                            class513 var19;
                            if (var17) {
                                var19 = new class374(arg2.method2244((byte) -62));
                            } else {
                                var19 = new class556(arg2.method2255(255));
                            }
                            this.field4282.method3670((long) var18, var19, (byte) 127);
                        }
                        return;
                    }
                    return;
                }
            }
            this.field4322[arg1 - 150] = arg2.method2244((byte) -93);
            if (!this.field4319.field4493) {
                this.field4322[arg1 - 150] = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lcf;Lr;IIIILri;Lwt;Z)Lda;")
    public final class55 method1885(class559 arg0, class165 arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class282 arg7, boolean arg8) {
        field4300++;
        if (this.field4315 != null) {
            class323 var10 = this.method1881(arg6, (byte) -24);
            return var10 == null ? null : var10.method1885(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        } else if (this.field4263 == null) {
            return null;
        } else {
            int var11 = arg4;
            if (arg7 != null && arg2 != -1) {
                var11 = arg4 | arg7.method1693(true, -117, arg2, arg5);
            }
            class472 var12 = this.field4319.field4497;
            class55 var13;
            synchronized (this.field4319.field4497) {
                var13 = (class55) this.field4319.field4497.method2766(-122, (long) (arg1.field2018 << 16 | this.field4328));
            }
            if (arg8) {
                return null;
            }
            if (var13 == null || (var11 & var13.method118()) != var11) {
                if (var13 != null) {
                    var11 |= var13.method118();
                }
                int var14 = var11;
                boolean var15 = false;
                class668 var16 = this.field4319.field4491;
                synchronized (this.field4319.field4491) {
                    int var17 = 0;
                    while (true) {
                        if (this.field4263.length <= var17) {
                            break;
                        }
                        if (!this.field4319.field4491.method3783(this.field4263[var17], 0, 32069)) {
                            var15 = true;
                        }
                        var17++;
                    }
                }
                if (var15) {
                    return null;
                }
                class173[] var18 = new class173[this.field4263.length];
                class668 var19 = this.field4319.field4491;
                synchronized (this.field4319.field4491) {
                    for (int var20 = 0; var20 < this.field4263.length; var20++) {
                        var18[var20] = class110.method797((byte) 104, 0, this.field4319.field4491, this.field4263[var20]);
                    }
                }
                for (int var21 = 0; var21 < this.field4263.length; var21++) {
                    if (var18[var21] != null && var18[var21].field2137 < 13) {
                        var18[var21].method1097(2, (byte) -39);
                    }
                }
                class173 var22;
                if (var18.length == 1) {
                    var22 = var18[0];
                } else {
                    var22 = new class173(var18, var18.length);
                }
                if (this.field4276 != null) {
                    var14 = var11 | 0x4000;
                }
                if (this.field4309 != null) {
                    var14 |= 0x8000;
                }
                if (this.field4294 != 0) {
                    var14 |= 0x80000;
                }
                var13 = arg1.method274(var22, var14, this.field4319.field4498, 64, 768);
                if (this.field4276 != null) {
                    for (int var23 = 0; var23 < this.field4276.length; var23++) {
                        if (this.field4281 == null || var23 >= this.field4281.length) {
                            var13.method87(this.field4276[var23], this.field4272[var23]);
                        } else {
                            var13.method87(this.field4276[var23], class397.field5619[this.field4281[var23] & 0xFF]);
                        }
                    }
                }
                if (this.field4309 != null) {
                    for (int var24 = 0; var24 < this.field4309.length; var24++) {
                        var13.method130(this.field4309[var24], this.field4253[var24]);
                    }
                }
                if (this.field4294 != 0) {
                    var13.method77(this.field4257, this.field4291, this.field4254, this.field4294 & 0xFF);
                }
                var13.method98(var11);
                class472 var25 = this.field4319.field4497;
                synchronized (this.field4319.field4497) {
                    this.field4319.field4497.method2772(var13, !arg8, (long) (this.field4328 | arg1.field2018 << 16));
                }
            }
            if (arg7 != null && arg2 != -1) {
                var13 = arg7.method1692(var11, var13, arg3, false, arg2, arg5);
            }
            var13.method98(arg4);
            return var13;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;")
    public final String method1886(byte arg0, int arg1, String arg2) {
        field4324++;
        if (this.field4282 == null) {
            return arg2;
        } else if (arg0 == 102) {
            class374 var4 = (class374) this.field4282.method3678((long) arg1, -121);
            return var4 == null ? arg2 : var4.field5035;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILr;Lwt;IZIIILcf;Ljr;Lwt;I[Lgw;[ILri;)Lda;")
    public final class55 method1887(int arg0, int arg1, int arg2, class165 arg3, class282 arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class559 arg10, class94 arg11, class282 arg12, int arg13, class153[] arg14, int[] arg15, class95 arg16) {
        field4305++;
        if (this.field4315 != null) {
            class323 var18 = this.method1881(arg16, (byte) 110);
            return var18 == null ? null : var18.method1887(arg0, arg1, arg2, arg3, arg4, arg5, true, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
        }
        int var19 = arg8;
        if (this.field4313 != 128) {
            var19 = arg8 | 0x2;
        }
        if (this.field4273 != 128) {
            var19 |= 0x5;
        }
        boolean var20 = arg12 != null || arg4 != null;
        boolean var21 = false;
        boolean var22 = false;
        boolean var23 = false;
        boolean var24 = false;
        int var25 = arg14 == null ? 0 : arg14.length;
        for (int var26 = 0; var26 < var25; var26++) {
            class467.field6525[var26] = null;
            if (arg14[var26] != null) {
                class282 var27 = arg10.method3273(arg14[var26].field1891, 0);
                if (var27.field3827 != null) {
                    class628.field9002[var26] = var27;
                    var20 = true;
                    int var28 = arg14[var26].field1886;
                    int var29 = arg14[var26].field1892;
                    int var30 = var27.field3827[var28];
                    class467.field6525[var26] = arg10.method3270(13161, var30 >>> 16);
                    int var31 = var30 & 0xFFFF;
                    class172.field2094[var26] = var31;
                    if (class467.field6525[var26] != null) {
                        var22 |= class467.field6525[var26].method3510(1, var31);
                        var21 |= class467.field6525[var26].method3509((byte) -104, var31);
                        var24 |= class467.field6525[var26].method3506((byte) -70, var31);
                        var23 |= var27.field3830;
                    }
                    if ((var27.field3816 || class331.field4406) && var29 != -1 && var27.field3827.length > var29) {
                        class622.field8919[var26] = var27.field3840[var28];
                        class475.field6656[var26] = arg14[var26].field1894;
                        int var32 = var27.field3827[var29];
                        class192.field2336[var26] = arg10.method3270(13161, var32 >>> 16);
                        int var33 = var32 & 0xFFFF;
                        class321.field4236[var26] = var33;
                        if (class192.field2336[var26] != null) {
                            var22 |= class192.field2336[var26].method3510(1, var33);
                            var21 |= class192.field2336[var26].method3509((byte) -72, var33);
                            var24 |= class192.field2336[var26].method3506((byte) -79, var33);
                        }
                    } else {
                        class622.field8919[var26] = 0;
                        class475.field6656[var26] = 0;
                        class192.field2336[var26] = null;
                        class321.field4236[var26] = -1;
                    }
                }
            }
        }
        int var34 = -1;
        int var35 = -1;
        int var36 = 0;
        class612 var37 = null;
        class612 var38 = null;
        int var39 = -1;
        int var40 = -1;
        int var41 = 0;
        class612 var42 = null;
        class612 var43 = null;
        if (var20) {
            if (arg12 != null) {
                int var44 = arg12.field3827[arg2];
                int var45 = var44 >>> 16;
                var37 = arg10.method3270(13161, var45);
                var34 = var44 & 0xFFFF;
                if (var37 != null) {
                    var22 |= var37.method3510(1, var34);
                    var21 |= var37.method3509((byte) 88, var34);
                    var24 |= var37.method3506((byte) 122, var34);
                    var23 |= arg12.field3830;
                }
                if ((arg12.field3816 || class331.field4406) && arg0 != -1 && arg12.field3827.length > arg0) {
                    int var46 = arg12.field3827[arg0];
                    var36 = arg12.field3840[arg2];
                    int var47 = var46 >>> 16;
                    var35 = var46 & 0xFFFF;
                    if (var45 == var47) {
                        var38 = var37;
                    } else {
                        var38 = arg10.method3270(13161, var47);
                    }
                    if (var38 != null) {
                        var22 |= var38.method3510(1, var35);
                        var21 |= var38.method3509((byte) 104, var35);
                        var24 |= var38.method3506((byte) -39, var35);
                    }
                }
            }
            var19 |= 0x20;
            if (arg4 != null) {
                int var48 = arg4.field3827[arg1];
                int var49 = var48 >>> 16;
                var42 = arg10.method3270(13161, var49);
                var39 = var48 & 0xFFFF;
                if (var42 != null) {
                    var22 |= var42.method3510(1, var39);
                    var21 |= var42.method3509((byte) 108, var39);
                    var24 |= var42.method3506((byte) -38, var39);
                    var23 |= arg4.field3830;
                }
                if ((arg4.field3816 || class331.field4406) && arg13 != -1 && arg4.field3827.length > arg13) {
                    int var50 = arg4.field3827[arg13];
                    var41 = arg4.field3840[arg1];
                    int var51 = var50 >>> 16;
                    var40 = var50 & 0xFFFF;
                    if (var49 == var51) {
                        var43 = var42;
                    } else {
                        var43 = arg10.method3270(13161, var51);
                    }
                    if (var43 != null) {
                        var22 |= var43.method3510(1, var40);
                        var21 |= var43.method3509((byte) 51, var40);
                        var24 |= var43.method3506((byte) -60, var40);
                    }
                }
            }
            if (var22) {
                var19 |= 0x80;
            }
            if (var21) {
                var19 |= 0x100;
            }
            if (var23) {
                var19 |= 0x200;
            }
            if (var24) {
                var19 |= 0x400;
            }
        }
        long var52 = (long) (this.field4328 | arg3.field2018 << 16);
        class472 var54 = this.field4319.field4496;
        class55 var55;
        synchronized (this.field4319.field4496) {
            var55 = (class55) this.field4319.field4496.method2766(-127, var52);
        }
        class573 var56 = null;
        if (this.field4297 != -1) {
            var56 = arg11.method727(this.field4297, 64);
        }
        if (var55 == null || var19 != (var19 & var55.method118())) {
            if (var55 != null) {
                var19 |= var55.method118();
            }
            int var57 = var19;
            boolean var58 = false;
            class668 var59 = this.field4319.field4491;
            synchronized (this.field4319.field4491) {
                int var60 = 0;
                while (true) {
                    if (this.field4296.length <= var60) {
                        break;
                    }
                    if (this.field4296[var60] != -1 && !this.field4319.field4491.method3783(this.field4296[var60], 0, 32069)) {
                        var58 = true;
                    }
                    var60++;
                }
            }
            if (var58) {
                return null;
            }
            class173[] var61 = new class173[this.field4296.length];
            for (int var62 = 0; var62 < this.field4296.length; var62++) {
                if (this.field4296[var62] != -1) {
                    class668 var63 = this.field4319.field4491;
                    synchronized (this.field4319.field4491) {
                        var61[var62] = class110.method797((byte) 104, 0, this.field4319.field4491, this.field4296[var62]);
                    }
                    if (var61[var62] != null) {
                        if (var61[var62].field2137 < 13) {
                            var61[var62].method1097(2, (byte) -39);
                        }
                        if (this.field4265 != null && this.field4265[var62] != null) {
                            var61[var62].method1093(121, this.field4265[var62][2], this.field4265[var62][0], this.field4265[var62][1]);
                        }
                    }
                }
            }
            if (var56 != null && var56.field8397 != null) {
                for (int var64 = 0; var64 < var56.field8397.length; var64++) {
                    if (var64 < var61.length && var61[var64] != null) {
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        if (var56.field8397[var64] != null) {
                            var70 = var56.field8397[var64][5] << 3;
                            var68 = var56.field8397[var64][3] << 3;
                            var69 = var56.field8397[var64][4] << 3;
                            var65 = var56.field8397[var64][0];
                            var67 = var56.field8397[var64][2];
                            var66 = var56.field8397[var64][1];
                        }
                        if (var68 != 0 || var69 != 0 || var70 != 0) {
                            var61[var64].method1089(var68, false, var70, var69);
                        }
                        if (var65 != 0 || var66 != 0 || var67 != 0) {
                            var61[var64].method1093(85, var67, var65, var66);
                        }
                    }
                }
            }
            class173 var71;
            if (var61.length == 1) {
                var71 = var61[0];
            } else {
                var71 = new class173(var61, var61.length);
            }
            if (this.field4276 != null) {
                var57 = var19 | 0x4000;
            }
            if (this.field4309 != null) {
                var57 |= 0x8000;
            }
            if (this.field4294 != 0) {
                var57 |= 0x80000;
            }
            var55 = arg3.method274(var71, var57, this.field4319.field4498, this.field4321 + 64, this.field4279 + 850);
            if (this.field4276 != null) {
                for (int var72 = 0; var72 < this.field4276.length; var72++) {
                    if (this.field4281 == null || this.field4281.length <= var72) {
                        var55.method87(this.field4276[var72], this.field4272[var72]);
                    } else {
                        var55.method87(this.field4276[var72], class397.field5619[this.field4281[var72] & 0xFF]);
                    }
                }
            }
            if (this.field4309 != null) {
                for (int var73 = 0; var73 < this.field4309.length; var73++) {
                    var55.method130(this.field4309[var73], this.field4253[var73]);
                }
            }
            if (this.field4294 != 0) {
                var55.method77(this.field4257, this.field4291, this.field4254, this.field4294 & 0xFF);
            }
            var55.method98(var19);
            class472 var74 = this.field4319.field4496;
            synchronized (this.field4319.field4496) {
                this.field4319.field4496.method2772(var55, arg6, (long) (arg3.field2018 << 16 | this.field4328));
            }
        }
        class55 var75 = var55.method97((byte) 4, var19, arg6);
        boolean var76 = false;
        if (arg15 != null) {
            for (int var77 = 0; var77 < 12; var77++) {
                if (arg15[var77] != -1) {
                    var76 = true;
                }
            }
        }
        if (!var20 && !var76) {
            return var75;
        }
        class394[] var78 = null;
        if (var56 != null) {
            var78 = var56.method3357(arg3, -25204);
        }
        if (var76 && var78 != null) {
            for (int var79 = 0; var79 < 12; var79++) {
                if (var78[var79] != null) {
                    var75.method86(var78[var79], 0x1 << var79, true);
                }
            }
        }
        int var80 = 0;
        int var81 = 1;
        while (var25 > var80) {
            if (class467.field6525[var80] != null) {
                var75.method572(3239, class192.field2336[var80], class172.field2094[var80], 0, class475.field6656[var80] - 1, class321.field4236[var80], var81, class628.field9002[var80].field3830, class467.field6525[var80], null, class622.field8919[var80]);
            }
            var80++;
            var81 <<= 0x1;
        }
        if (var76) {
            for (int var82 = 0; var82 < 12; var82++) {
                if (arg15[var82] != -1) {
                    int var83 = arg15[var82] - arg7;
                    int var84 = var83 & 0x3FFF;
                    class394 var85 = arg3.method305();
                    var85.method724(var84);
                    var75.method86(var85, 0x1 << var82, false);
                }
            }
        }
        if (var76 && var78 != null) {
            for (int var86 = 0; var86 < 12; var86++) {
                if (var78[var86] != null) {
                    var75.method86(var78[var86], 0x1 << var86, false);
                }
            }
        }
        if (var37 != null && var42 != null) {
            var75.method581(var38, var43, var42, arg12.field3838, var39, var36, var34, arg9 - 1, var37, var40, 128, arg5 - 1, arg4.field3830 | arg12.field3830, var35, var41);
        } else if (var37 != null) {
            var75.method580(arg12.field3830, var35, 0, var34, var37, var36, arg5 - 1, -3651, var38);
        } else if (var42 != null) {
            var75.method580(arg4.field3830, var40, 0, var39, var42, var41, arg9 - 1, -3651, var43);
        }
        for (int var87 = 0; var87 < var25; var87++) {
            class467.field6525[var87] = null;
            class192.field2336[var87] = null;
            class628.field9002[var87] = null;
        }
        if (this.field4273 != 128 || this.field4313 != 128) {
            var75.method70(this.field4273, this.field4313, this.field4273);
        }
        var75.method98(arg8);
        return var75;
    }
}
