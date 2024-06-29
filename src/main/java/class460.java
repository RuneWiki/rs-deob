import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class460 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public int field6574 = 512;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    private int field6587 = 0;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Z")
    public boolean field6588 = true;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public int field6584 = -1;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Z")
    public boolean field6582 = true;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lnba;")
    public static class268 field6578 = new class268();

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public int field6572;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public int field6581;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public int field6585;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public int field6590;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field6589;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/io/File;I[B)V")
    public static final void method2701(int arg0, File arg1, int arg2, byte[] arg3) throws IOException {
        field6576++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        try {
            if (arg2 <= 79) {
                return;
            }
            var4.readFully(arg3, 0, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
    public static final void method2702(int arg0, int arg1) {
        field6575++;
        if (class234.field3638 == arg0) {
            return;
        }
        class199.field2812 = class232.field3611 = class117.field1789[arg0];
        class682.method3774(200);
        class678.field9587 = new int[class199.field2812][class232.field3611];
        class671.field9492 = new int[class199.field2812][class232.field3611];
        class188.field2713 = new int[arg1][class199.field2812 >> 3][class232.field3611 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class423.field6155[var2] = class531.method3029(116, class232.field3611, class199.field2812);
        }
        class262.field3977 = new byte[4][class199.field2812][class232.field3611];
        class52.method580(class232.field3611, (byte) 105, 4, class199.field2812);
        class228.method1535(3, class232.field3611 >> 3, class199.field2812 >> 3, class282.field4228);
        class234.field3638 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lmo;I)V")
    public final void method2703(class695 arg0, int arg1) {
        field6583++;
        while (true) {
            int var3 = arg0.method3826(false);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    this.field6572 = 115;
                    return;
                }
            }
            this.method2705(var3, arg1 ^ 0xFFFFFFB7, arg0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILpu;ZBII)V")
    public static final void method2704(int arg0, int arg1, class522 arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        if (arg4 > -69) {
            method2704(-88, 59, null, false, (byte) -93, 78, -39);
        }
        class596.field8425 = arg6;
        class685.field9652 = arg0;
        class666.field9405 = arg3;
        class208.field2929 = arg2;
        class594.field8392 = arg1;
        class599.field8465 = arg5;
        class313.field4623 = 1;
        field6577++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILmo;)V")
    private final void method2705(int arg0, int arg1, class695 arg2) {
        if (arg0 == 1) {
            this.field6587 = arg2.method3873(255);
            this.method2706(this.field6587, 71);
        } else if (arg0 == 2) {
            this.field6584 = arg2.method3847((byte) 118);
            if (this.field6584 == 65535) {
                this.field6584 = -1;
            }
        } else if (arg0 == 3) {
            this.field6574 = arg2.method3847((byte) 118) << 2;
        } else if (arg0 == 4) {
            this.field6588 = false;
        } else if (arg0 == 5) {
            this.field6582 = false;
        }
        if (arg1 < 19) {
            this.field6590 = -76;
        }
        field6573++;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
    private final void method2706(int arg0, int arg1) {
        field6586++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        if (arg1 <= 53) {
            return;
        }
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field6590 = (int) (var17 * 256.0D);
        this.field6581 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field6590 < 0) {
            this.field6590 = 0;
        } else if (this.field6590 > 255) {
            this.field6590 = 255;
        }
        if (var17 > 0.5D) {
            this.field6572 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field6572 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field6581 < 0) {
            this.field6581 = 0;
        } else if (this.field6581 > 255) {
            this.field6581 = 255;
        }
        if (this.field6572 < 1) {
            this.field6572 = 1;
        }
        this.field6585 = (int) ((double) this.field6572 * var19);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method2707(byte arg0) {
        if (arg0 <= 70) {
            field6580 = -73;
        }
        field6578 = null;
        field6589 = null;
    }
}
