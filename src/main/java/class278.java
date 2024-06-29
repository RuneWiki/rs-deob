import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class278 {

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field4056 = 8;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public int field4061 = 128;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field4053 = 16;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field4059 = 127;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Z")
    public boolean field4062 = false;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Z")
    public boolean field4066 = true;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field4063 = -1;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Z")
    public boolean field4055 = true;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public int field4064 = -1;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field4058 = -1;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public int field4070 = 1190717;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public int field4060 = 0;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Liu;")
    public static class517 field4072 = new class517(99, -2);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public int field4065;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lvu;")
    public class195 field4054;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)I")
    public static final int method1789(int arg0, byte arg1) {
        field4069++;
        double var2 = (double) ((arg0 & 0xFF3AB8) >> 16) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (arg1 != 82) {
            return -42;
        }
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILco;)V")
    private final void method1790(int arg0, int arg1, class268 arg2) {
        field4068++;
        int var4 = -30 / ((arg1 + 49) / 33);
        if (arg0 == 1) {
            this.field4060 = class442.method2615(arg2.method1700((byte) 44), 56);
        } else if (arg0 == 2) {
            this.field4064 = arg2.method1738(255);
        } else if (arg0 == 3) {
            this.field4064 = arg2.method1745(32132);
            if (this.field4064 == 65535) {
                this.field4064 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field4066 = false;
        } else if (arg0 == 7) {
            this.field4058 = class442.method2615(arg2.method1700((byte) 44), 4);
            return;
        } else if (arg0 == 8) {
            this.field4054.field2805 = this.field4065;
            return;
        } else if (arg0 == 9) {
            this.field4061 = arg2.method1745(32132) << 0;
            return;
        } else if (arg0 == 10) {
            this.field4055 = false;
            return;
        } else if (arg0 == 11) {
            this.field4056 = arg2.method1738(255);
            return;
        } else if (arg0 == 12) {
            this.field4062 = true;
            return;
        } else if (arg0 == 13) {
            this.field4070 = arg2.method1700((byte) 44);
            return;
        } else {
            if (arg0 == 14) {
                this.field4053 = arg2.method1738(255) << 0;
            } else if (arg0 == 15) {
                this.field4063 = arg2.method1745(32132);
                if (this.field4063 == 65535) {
                    this.field4063 = -1;
                    return;
                }
            } else if (arg0 == 16) {
                this.field4059 = arg2.method1738(255);
                return;
            } else {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1791(int arg0) {
        if (arg0 == -14894) {
            field4072 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public final void method1792(byte arg0) {
        int var2 = -108 % ((arg0 - 4) / 44);
        field4057++;
        this.field4056 = this.field4056 << 8 | this.field4065;
        if (this.field4063 == -1) {
            this.field4063 = this.field4064;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lco;I)V")
    public final void method1793(class268 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1738(255);
            if (var3 == 0) {
                if (arg1 != 14195) {
                    this.method1790(-43, -61, null);
                }
                field4067++;
                return;
            }
            this.method1790(var3, -100, arg0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([Lha;B)V")
    public static final void method1794(class116[] arg0, byte arg1) {
        field4071++;
        class274.field4013 = arg0.length;
        class144.field2231 = new class116[class274.field4013 + 10];
        class158.field2366 = new int[class274.field4013 + 10];
        class164.method1148(arg0, 0, class144.field2231, 0, class274.field4013);
        for (int var2 = 0; var2 < class274.field4013; var2++) {
            class158.field2366[var2] = class144.field2231[var2].method960();
        }
        for (int var3 = class274.field4013; var3 < class144.field2231.length; var3++) {
            class158.field2366[var3] = 12;
        }
        int var4 = 83 % ((32 - arg1) / 58);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method1795(int arg0) {
        field4052++;
        if (arg0 != 0) {
            field4072 = null;
        }
        class135 var1 = null;
        try {
            class329 var2 = class270.field3976.method364(true, "2", (byte) 68);
            while (var2.field4739 == 0) {
                class210.method1342(-70, 1L);
            }
            if (var2.field4739 == 1) {
                var1 = (class135) var2.field4737;
                byte[] var3 = new byte[(int) var1.method1037(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1038(var3, var3.length - var4, -110, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class117.method971(new class268(var3), 3);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1036(-90);
            }
        } catch (Exception var6) {
        }
    }
}
