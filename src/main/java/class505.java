import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class505 {

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public int field6302 = -1;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public int field6300 = -1;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Z")
    public boolean field6297 = true;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public int field6304 = 64;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Z")
    public boolean field6308 = true;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public int field6305 = 8;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public int field6306 = 127;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public int field6314 = 0;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public int field6301 = -1;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public int field6298 = 1190717;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public int field6309 = 512;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Z")
    public boolean field6316 = false;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Lcga;")
    public static class449 field6310 = new class449(13, 6);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public int field6296;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "Lmga;")
    public class665 field6312;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLrr;Lrr;)V", line = 3)
    public static final void method2752(byte arg0, class337 arg1, class337 arg2) {
        class526.field6649++;
        field6313++;
        class124 var3 = class336.method1924(class78.field1010, class636.field8620, (byte) 127);
        var3.field1516.method3061(arg1.field4172, (byte) 115);
        var3.field1516.method3051(true, arg1.field4252);
        int var4 = -25 % ((-arg0 - 1) / 42);
        var3.field1516.method3038(arg2.field4172, -1012995432);
        var3.field1516.method3065(-1, arg2.field4252);
        var3.field1516.method3065(-1, arg1.field4310);
        var3.field1516.method3067(1370571624, arg2.field4310);
        class197.method1156((byte) 95, var3);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLji;I)V", line = 22)
    private final void method2753(byte arg0, class572 arg1, int arg2) {
        if (arg2 == 1) {
            this.field6314 = class483.method2631(true, arg1.method3059(1));
        } else if (arg2 == 2) {
            this.field6300 = arg1.method3097((byte) 12);
        } else if (arg2 == 3) {
            this.field6300 = arg1.method3031(-1);
            if (this.field6300 == 65535) {
                this.field6300 = -1;
            }
        } else if (arg2 == 5) {
            this.field6297 = false;
        } else if (arg2 == 7) {
            this.field6302 = class483.method2631(true, arg1.method3059(1));
        } else if (arg2 == 8) {
            this.field6312.field9035 = this.field6296;
        } else if (arg2 == 9) {
            this.field6309 = arg1.method3031(-1) << 2;
        } else if (arg2 == 10) {
            this.field6308 = false;
        } else if (arg2 == 11) {
            this.field6305 = arg1.method3097((byte) 12);
        } else if (arg2 == 12) {
            this.field6316 = true;
        } else if (arg2 == 13) {
            this.field6298 = arg1.method3059(1);
        } else if (arg2 == 14) {
            this.field6304 = arg1.method3097((byte) 12) << 2;
        } else if (arg2 == 15) {
            this.field6301 = arg1.method3031(-1);
            if (this.field6301 == 65535) {
                this.field6301 = -1;
            }
        } else if (arg2 == 16) {
            this.field6306 = arg1.method3097((byte) 12);
        }
        int var4 = 34 % ((69 - arg0) / 54);
        field6311++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLji;)V", line = 100)
    public final void method2754(byte arg0, class572 arg1) {
        while (true) {
            int var3 = arg1.method3097((byte) 12);
            if (var3 == 0) {
                field6303++;
                if (arg0 <= 17) {
                    this.method2753((byte) -33, null, 105);
                    return;
                }
                return;
            }
            this.method2753((byte) -61, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 144)
    public static void method2755(int arg0) {
        field6310 = null;
        if (arg0 != 17865) {
            field6310 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I", line = 155)
    public static final int method2756(int arg0, int arg1) {
        field6299++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 != -65537) {
            return -97;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V", line = 213)
    public static final void method2757() {
        for (int var0 = 0; var0 < class459.field5722; var0++) {
            class597 var1 = class469.field5797[var0];
            class572.method3034(var1);
            class469.field5797[var0] = null;
        }
        class459.field5722 = 0;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 246)
    public final void method2758(int arg0) {
        if (arg0 != 965778184) {
            this.method2754((byte) -48, null);
        }
        this.field6305 = this.field6296 | this.field6305 << 8;
        if (this.field6301 == -1) {
            this.field6301 = this.field6300;
        }
        field6307++;
    }
}
