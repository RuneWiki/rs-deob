import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class35 {

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    private int field499 = 0;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Z")
    public boolean field502 = true;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public int field508 = -1;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public int field511 = 128;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "[I")
    public static int[] field503 = new int[4];

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field509 = 0;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Z")
    public static boolean field507 = false;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Lcg;")
    public static class49 field496;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[[[B")
    public static byte[][][] field498;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILpi;B)V", line = 5)
    private final void method312(int arg0, int arg1, class336 arg2, byte arg3) {
        if (arg1 == 1) {
            this.field499 = arg2.method2317(21803);
            this.method316(this.field499, true);
        } else if (arg1 == 2) {
            this.field508 = arg2.method2339((byte) -46);
            if (this.field508 == 65535) {
                this.field508 = -1;
            }
        } else if (arg1 == 3) {
            this.field511 = arg2.method2339((byte) -46);
        } else if (arg1 == 4) {
            this.field502 = false;
        }
        if (arg3 == -127) {
            field506++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 47)
    public static void method313(int arg0) {
        field503 = null;
        field496 = null;
        if (arg0 == 2213) {
            field498 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLpi;)V", line = 68)
    public static final void method314(byte arg0, class336 arg1) {
        field497++;
        if ((arg1.field5342.length - arg1.field5353) < 1) {
            return;
        }
        int var2 = arg1.method2364(-9069);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field5342.length - arg1.field5353) {
            return;
        }
        class32.field462 = arg1.method2364(-9069);
        if (class32.field462 < 1) {
            class32.field462 = 1;
        } else if (class32.field462 > 4) {
            class32.field462 = 4;
        }
        class48.method426(arg1.method2364(-9069) == 1, (byte) 59);
        class129.field2225 = arg1.method2364(-9069) == 1;
        if (arg0 < 67) {
            field494 = -106;
        }
        class48.field735 = arg1.method2364(-9069) == 1;
        class328.field5216 = arg1.method2364(-9069) == 1;
        class291.field4666 = arg1.method2364(-9069) == 1;
        class249.field4036 = arg1.method2364(-9069) == 1;
        class95.field1487 = arg1.method2364(-9069) == 1;
        class195.field3276 = arg1.method2364(-9069) == 1;
        class137.field2549 = arg1.method2364(-9069);
        if (class137.field2549 > 2) {
            class137.field2549 = 2;
        }
        if (var2 < 2) {
            class64.field1001 = arg1.method2364(-9069) == 1;
            arg1.method2364(-9069);
        } else {
            class64.field1001 = arg1.method2364(-9069) == 1;
        }
        class285.field4521 = arg1.method2364(-9069) == 1;
        class181.field3043 = arg1.method2364(-9069) == 1;
        class227.field3822 = arg1.method2364(-9069);
        if (class227.field3822 > 2) {
            class227.field3822 = 2;
        }
        class30.field440 = class227.field3822;
        class57.field875 = arg1.method2364(-9069) == 1;
        class79.field1280 = arg1.method2364(-9069);
        if (class79.field1280 > 127) {
            class79.field1280 = 127;
        }
        class51.field796 = arg1.method2364(-9069);
        class29.field393 = arg1.method2364(-9069);
        if (class29.field393 > 127) {
            class29.field393 = 127;
        }
        if (var2 >= 1) {
            class310.field4913 = arg1.method2339((byte) -46);
            class318.field5056 = arg1.method2339((byte) -46);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method2364(-9069);
        }
        if (var2 >= 4) {
            int var4 = arg1.method2364(-9069);
            if (class28.field385 < 96) {
                var4 = 0;
            }
            class65.method617(var4);
        }
        if (var2 >= 5) {
            class221.field3696 = arg1.method2338((byte) 101);
        }
        if (var2 >= 6) {
            class69.field1133 = arg1.method2364(-9069);
        }
        if (var2 >= 7) {
            class222.field3705 = arg1.method2364(-9069) == 1;
        }
        if (var2 >= 8) {
            class38.field572 = arg1.method2364(-9069) == 1;
        }
        if (var2 >= 9) {
            class255.field4104 = arg1.method2364(-9069);
        }
        if (var2 >= 10) {
            class246.field3990 = arg1.method2364(-9069) != 0;
        }
        if (var2 >= 11) {
            class330.field5250 = arg1.method2364(-9069) != 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lpi;II)V", line = 240)
    public final void method315(class336 arg0, int arg1, int arg2) {
        field504++;
        if (arg1 != -1) {
            this.field493 = 40;
        }
        while (true) {
            int var4 = arg0.method2364(arg1 ^ 0x236C);
            if (var4 == 0) {
                return;
            }
            this.method312(arg2, var4, arg0, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)V", line = 276)
    private final void method316(int arg0, boolean arg1) {
        field505++;
        double var3 = (double) ((arg0 & 0xFFE16C) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 > var5) {
            var11 = var5;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        if (var5 > var3) {
            var9 = var5;
        }
        if (var7 > var9) {
            var9 = var7;
        }
        if (!arg1) {
            this.field511 = 77;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field493 = (int) (var17 * 256.0D);
        if (this.field493 < 0) {
            this.field493 = 0;
        } else if (this.field493 > 255) {
            this.field493 = 255;
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
            if (var3 == var9) {
                var13 = (var5 - var7) / (var9 - var11);
            } else if (var5 == var9) {
                var13 = (var7 - var3) / (var9 - var11) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var3 - var5) / (var9 - var11) + 4.0D;
            }
        }
        if (var17 > 0.5D) {
            this.field501 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field501 = (int) (var15 * var17 * 512.0D);
        }
        this.field510 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field501 < 1) {
            this.field501 = 1;
        }
        this.field500 = (int) ((double) this.field501 * var19);
        if (this.field510 < 0) {
            this.field510 = 0;
        } else if (this.field510 > 255) {
            this.field510 = 255;
        }
    }
}
