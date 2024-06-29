import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class289 extends class317 {

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "I")
    private int field4299 = 0;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    private int field4289 = 81;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    private int field4295 = 4;

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "I")
    private int field4300 = 409;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    private int field4291 = 8;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "I")
    private int field4297 = 1024;

    @OriginalMember(owner = "client!rl", name = "nb", descriptor = "I")
    private int field4316 = 1024;

    @OriginalMember(owner = "client!rl", name = "eb", descriptor = "I")
    private int field4307 = 204;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "Lqc;")
    public static class99 field4294 = new class99(5);

    @OriginalMember(owner = "client!rl", name = "db", descriptor = "[I")
    public static int[] field4306 = new int[2];

    @OriginalMember(owner = "client!rl", name = "ab", descriptor = "Z")
    public static boolean field4303 = false;

    @OriginalMember(owner = "client!rl", name = "kb", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!rl", name = "mb", descriptor = "[[[I")
    public static int[][][] field4315 = new int[2][][];

    @OriginalMember(owner = "client!rl", name = "lb", descriptor = "[[B")
    public static byte[][] field4314 = new byte[1000][];

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    private int field4290;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    private int field4292;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!rl", name = "bb", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!rl", name = "cb", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!rl", name = "hb", descriptor = "I")
    private int field4310;

    @OriginalMember(owner = "client!rl", name = "ib", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!rl", name = "ob", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!rl", name = "pb", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!rl", name = "fb", descriptor = "Lkm;")
    public static class133 field4308;

    @OriginalMember(owner = "client!rl", name = "gb", descriptor = "[I")
    private int[] field4309;

    @OriginalMember(owner = "client!rl", name = "jb", descriptor = "[Lpn;")
    public static class170[] field4312;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "[[I")
    private int[][] field4287;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "[[I")
    private int[][] field4293;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)[I", line = 15)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            return (int[]) null;
        }
        field4298++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -87);
        if (this.field4847.field2751) {
            int var4 = 0;
            int var5;
            for (var5 = class51.field693[arg1] + this.field4299; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field4291 > var4 && this.field4309[var4] <= var5) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = this.field4309[var4];
            int var8 = var4 - 1;
            int var9 = this.field4309[var4 - 1];
            if (var5 > this.field4292 + var9 && var5 < (var7 - this.field4292)) {
                for (int var10 = 0; var10 < class326.field4933; var10++) {
                    int var11 = var6 ? this.field4316 : -this.field4316;
                    int var12 = 0;
                    int var13;
                    for (var13 = class99.field1360[var10] + (this.field4310 * var11 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field4295 > var12 && var13 >= this.field4293[var8][var12]) {
                        var12++;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field4293[var8][var14];
                    int var16 = this.field4293[var8][var12];
                    if (var13 > (var15 + this.field4292) && var13 < (var16 - this.field4292)) {
                        var3[var10] = this.field4287[var8][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class281.method1944(var3, 0, class326.field4933, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 452)
    public class289() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V", line = 125)
    public final void method546(int arg0) {
        field4317++;
        this.method1983(arg0 ^ 0xFFFFABAF);
        if (arg0 != -21522) {
            method1986(-15);
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)V", line = 136)
    public static final void method1981(int arg0, int arg1) {
        field4311++;
        class13.field139.method720(arg1, 1088);
        class106.field1430.method720(arg1, 1088);
        if (arg0 < 58) {
            method1984((class133) null, (class133) null, false, -17, (byte) -8);
        }
        class333.field5014.method720(arg1, 1088);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lkm;ILkm;)I", line = 161)
    public static final int method1982(class133 arg0, int arg1, class133 arg2) {
        if (arg1 != 14489) {
            field4303 = false;
        }
        field4301++;
        int var3 = 0;
        if (arg0.method961(class291.field4345, (byte) -128)) {
            var3++;
        }
        if (arg0.method961(class173.field2360, (byte) -128)) {
            var3++;
        }
        if (arg0.method961(class37.field421, (byte) -128)) {
            var3++;
        }
        if (arg2.method961(class291.field4345, (byte) -128)) {
            var3++;
        }
        if (arg2.method961(class173.field2360, (byte) -128)) {
            var3++;
        }
        if (arg2.method961(class37.field421, (byte) -128)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lcg;II)V", line = 195)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field4318++;
        int var4 = -109 % ((arg1 + 17) / 40);
        if (arg2 == 0) {
            this.field4295 = arg0.method2219(16448);
        } else if (arg2 == 1) {
            this.field4291 = arg0.method2219(16448);
        } else if (arg2 == 2) {
            this.field4300 = arg0.method2220((byte) 116);
        } else if (arg2 == 3) {
            this.field4307 = arg0.method2220((byte) 104);
        } else if (arg2 == 4) {
            this.field4316 = arg0.method2220((byte) 117);
        } else if (arg2 == 5) {
            this.field4299 = arg0.method2220((byte) 73);
        } else if (arg2 == 6) {
            this.field4289 = arg0.method2220((byte) 65);
        } else if (arg2 == 7) {
            this.field4297 = arg0.method2220((byte) 37);
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)V", line = 283)
    private final void method1983(int arg0) {
        field4296++;
        Random var2 = new Random((long) this.field4291);
        this.field4309 = new int[this.field4291 + 1];
        this.field4293 = new int[this.field4291][this.field4295 + 1];
        if (arg0 <= 62) {
            this.method1983(-90);
        }
        this.field4292 = this.field4289 / 2;
        this.field4310 = 4096 / this.field4295;
        this.field4290 = 4096 / this.field4291;
        this.field4287 = new int[this.field4291][this.field4295];
        int var3 = this.field4310 / 2;
        int var4 = this.field4290 / 2;
        this.field4309[0] = 0;
        for (int var5 = 0; var5 < this.field4291; var5++) {
            if (var5 > 0) {
                int var6 = this.field4290;
                int var7 = (class175.method1217((byte) 118, var2, 4096) - 2048) * this.field4307 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4309[var5] = this.field4309[var5 - 1] + var8;
            }
            this.field4293[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4295; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4310;
                    int var11 = (class175.method1217((byte) 119, var2, 4096) - 2048) * this.field4300 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4293[var5][var9] = this.field4293[var5][var9 - 1] + var12;
                }
                this.field4287[var5][var9] = this.field4297 <= 0 ? 4096 : 4096 - class175.method1217((byte) 117, var2, this.field4297);
            }
            this.field4293[var5][this.field4295] = 4096;
        }
        this.field4309[this.field4291] = 4096;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lkm;Lkm;ZIB)Lgk;", line = 349)
    public static final class52 method1984(class133 arg0, class133 arg1, boolean arg2, int arg3, byte arg4) {
        if (arg4 != -125) {
            return (class52) null;
        }
        int[] var5 = arg1.method954(0, arg3);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg1.method947(arg3, (byte) -102, var5[var7]);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg2) {
                    var10 = arg0.method947(0, (byte) -80, var9);
                } else {
                    var10 = arg0.method947(var9, (byte) -120, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        field4302++;
        if (!var6) {
            return null;
        }
        try {
            return new class52(arg1, arg0, arg3, arg2);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)V", line = 402)
    public static void method1985(int arg0) {
        field4315 = (int[][][]) null;
        field4306 = null;
        field4312 = null;
        field4308 = null;
        field4314 = (byte[][]) null;
        field4294 = null;
        if (arg0 != 0) {
            method1985(54);
        }
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)V", line = 433)
    public static final void method1986(int arg0) {
        field4304++;
        if (arg0 >= -28) {
            field4306 = (int[]) null;
        }
        class123.method884(0, 0, 30);
    }
}
