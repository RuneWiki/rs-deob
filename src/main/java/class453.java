import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class453 {

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    private int field6408 = 32;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "Z")
    private boolean field6416 = false;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "J")
    private long field6410 = class434.method2591(-19310);

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
    private int field6419 = 0;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "Z")
    private boolean field6418 = true;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
    private int field6420 = 0;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
    private int field6422 = 0;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "J")
    private long field6426 = 0L;

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "J")
    private long field6425 = 0L;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "[Lrk;")
    private class461[] field6428 = new class461[8];

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "[Lrk;")
    private class461[] field6427 = new class461[8];

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    private int field6429 = 0;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field6396 = 100;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "[[I")
    public static int[][] field6411 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field6415 = 0;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
    private int field6421;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
    public int field6423;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
    public int field6424;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Lbg;")
    public static class406 field6394;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "Lrk;")
    private class461 field6417;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "[I")
    public int[] field6400;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BLrk;I)V", line = 6)
    private final void method2645(byte arg0, class461 arg1, int arg2) {
        field6414++;
        if (arg0 <= 74) {
            this.field6423 = 118;
        }
        int var4 = arg2 >> 5;
        class461 var5 = this.field6428[var4];
        if (var5 == null) {
            this.field6427[var4] = arg1;
        } else {
            var5.field6504 = arg1;
        }
        this.field6428[var4] = arg1;
        arg1.field6505 = arg2;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V", line = 27)
    public final synchronized void method2646(byte arg0) {
        field6403++;
        if (this.field6416) {
            return;
        }
        long var2 = class434.method2591(arg0 - 19221);
        try {
            if ((this.field6410 + 500000L) < var2) {
                this.field6410 = var2 - 500000L;
            }
            while (this.field6410 + 5000L < var2) {
                this.method2649(256, (byte) 95);
                this.field6410 += (long) (256000 / class345.field4936);
            }
        } catch (Exception var7) {
            this.field6410 = var2;
        }
        if (this.field6400 == null) {
            return;
        }
        try {
            if (this.field6426 != 0L) {
                if (var2 < this.field6426) {
                    return;
                }
                this.method1563(this.field6424);
                this.field6418 = true;
                this.field6426 = 0L;
            }
            int var4 = this.method1564();
            if (this.field6422 < this.field6420 - var4) {
                this.field6422 = this.field6420 - var4;
            }
            int var5 = this.field6423 + this.field6421;
            if (arg0 == -89) {
                if ((var5 + 256) > 16384) {
                    var5 = 16128;
                }
                if (this.field6424 < var5 + 256) {
                    this.field6424 += 1024;
                    if (this.field6424 > 16384) {
                        this.field6424 = 16384;
                    }
                    this.method1560();
                    var4 = 0;
                    this.method1563(this.field6424);
                    this.field6418 = true;
                    if (this.field6424 < (var5 + 256)) {
                        var5 = this.field6424 - 256;
                        this.field6421 = var5 - this.field6423;
                    }
                }
                while (var4 < var5) {
                    this.method2648(this.field6400, 256);
                    var4 += 256;
                    this.method1561();
                }
                if (this.field6425 < var2) {
                    if (this.field6418) {
                        this.field6418 = false;
                    } else if (this.field6422 == 0 && this.field6419 == 0) {
                        this.method1560();
                        this.field6426 = var2 + 2000L;
                        return;
                    } else {
                        this.field6421 = Math.min(this.field6419, this.field6422);
                        this.field6419 = this.field6422;
                    }
                    this.field6422 = 0;
                    this.field6425 = var2 + 2000L;
                }
                this.field6420 = var4;
            }
        } catch (Exception var6) {
            this.method1560();
            this.field6426 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "()I", line = 151)
    public int method1564() throws Exception {
        field6409++;
        return this.field6424;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "()V", line = 160)
    public void method1560() {
        field6407++;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V", line = 167)
    public static void method2647(byte arg0) {
        field6411 = null;
        if (arg0 != 52) {
            method2650(51, 108, 122, 50, 41, false, 92);
        }
        field6394 = null;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "()V", line = 180)
    public void method1561() throws Exception {
        field6395++;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "([II)V", line = 191)
    private final void method2648(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class137.field1664) {
            var3 = arg1 << 1;
        }
        class268.method1623(arg0, 0, var3);
        this.field6429 -= arg1;
        if (this.field6417 != null && this.field6429 <= 0) {
            this.field6429 += class345.field4936 >> 4;
            class385.method2319(this.field6417, -76);
            this.method2645((byte) 85, this.field6417, this.field6417.method1549());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class461 var10 = null;
                        class461 var11 = this.field6427[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class378 var12 = var11.field6502;
                                if (var12 == null || var12.field5365 <= var8) {
                                    var11.field6503 = true;
                                    int var13 = var11.method511();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field5365 += var13;
                                    }
                                    if (var4 >= this.field6408) {
                                        break label107;
                                    }
                                    class461 var14 = var11.method516();
                                    if (var14 != null) {
                                        int var15 = var11.field6505;
                                        while (var14 != null) {
                                            this.method2645((byte) 85, var14, var15 * var14.method1549() >> 8);
                                            var14 = var11.method517();
                                        }
                                    }
                                    class461 var16 = var11.field6504;
                                    var11.field6504 = null;
                                    if (var10 == null) {
                                        this.field6427[var7] = var16;
                                    } else {
                                        var10.field6504 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field6428[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field6504;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class461 var18 = this.field6427[var17];
                this.field6427[var17] = this.field6428[var17] = null;
                while (var18 != null) {
                    class461 var19 = var18.field6504;
                    var18.field6504 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field6429 < 0) {
            this.field6429 = 0;
        }
        if (this.field6417 != null) {
            this.field6417.method513(arg0, 0, arg1);
        }
        this.field6410 = class434.method2591(-19310);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V", line = 349)
    private final void method2649(int arg0, byte arg1) {
        if (arg1 != 95) {
            this.field6410 = 121L;
        }
        field6397++;
        this.field6429 -= arg0;
        if (this.field6429 < 0) {
            this.field6429 = 0;
        }
        if (this.field6417 != null) {
            this.field6417.method512(arg0);
        }
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "()V", line = 369)
    public void method1559() throws Exception {
        field6412++;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIZI)Laj;", line = 378)
    public static final class77 method2650(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field6405++;
        long var7 = (long) arg0 * 76724863L ^ (long) arg2 * 475427L ^ (long) arg6 * 67481L ^ (long) arg1 * 97549L ^ (long) arg4 * 986053L ^ (long) arg3 * 32147369L;
        class77 var9 = (class77) class207.field2844.method1163((byte) -44, var7);
        if (arg5) {
            method2651(127, -46, 2);
        }
        if (var9 == null) {
            class77 var10 = class274.field3912.method1420(arg6, arg1, arg2, arg4, arg3, arg0);
            class207.field2844.method1172(var7, 1, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Lrm;", line = 400)
    public static final class183 method2651(int arg0, int arg1, int arg2) {
        class263 var3 = class293.field4356[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3782;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 409)
    public final synchronized void method2652(int arg0) {
        if (class233.field3242 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class233.field3242.field1304[var3] == this) {
                    class233.field3242.field1304[var3] = null;
                }
                if (class233.field3242.field1304[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class233.field3242.field1307 = true;
                while (class233.field3242.field1301) {
                    class85.method433(50L, -103);
                }
                class233.field3242 = null;
            }
        }
        field6398++;
        this.method1560();
        if (arg0 > -98) {
            field6415 = -115;
        }
        this.field6416 = true;
        this.field6400 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lrk;B)V", line = 459)
    public final synchronized void method2653(class461 arg0, byte arg1) {
        if (arg1 > -107) {
            field6406 = -124;
        }
        this.field6417 = arg0;
        field6402++;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V", line = 471)
    public final synchronized void method2654(int arg0) {
        field6413++;
        if (arg0 != -25531) {
            return;
        }
        this.field6418 = true;
        try {
            this.method1559();
        } catch (Exception var2) {
            this.method1560();
            this.field6426 = class434.method2591(arg0 ^ 0x28D7) + 2000L;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 493)
    public void method1562(Component arg0) throws Exception {
        field6404++;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)V", line = 500)
    public final void method2655(byte arg0) {
        field6401++;
        this.field6418 = true;
        if (arg0 != 106) {
            method2651(-119, -70, 32);
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V", line = 515)
    public void method1563(int arg0) throws Exception {
        field6399++;
    }
}
