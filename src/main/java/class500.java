import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class500 {

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public int field7575 = 2;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public int field7579 = 64;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public int field7573 = -1;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public int field7580 = 64;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public int field7586 = 1;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "Z")
    public boolean field7584 = false;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "Z")
    public boolean field7585 = false;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field7583 = 1;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "[I")
    public static int[] field7572 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Lbg;")
    public static class310 field7574 = new class310(10, 16);

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "Lrp;")
    public static class288 field7587 = new class288(8);

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lha;BI)V")
    public final void method3004(class40 arg0, byte arg1, int arg2) {
        field7582++;
        while (true) {
            int var4 = arg0.method257((byte) 58);
            if (var4 == 0) {
                if (arg1 < 4) {
                    this.field7575 = -88;
                    return;
                } else {
                    return;
                }
            }
            this.method3007(arg0, 3, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lpr;")
    public static final class296 method3005(Canvas arg0, boolean arg1) {
        field7576++;
        try {
            Class var2 = Class.forName("cj");
            if (arg1) {
                field7583 = -7;
            }
            class296 var3 = (class296) var2.getDeclaredConstructor().newInstance();
            var3.method1519(0, arg0);
            return var3;
        } catch (Throwable var5) {
            class253 var4 = new class253();
            var4.method1519(0, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)I")
    public static final int method3006(int arg0, int arg1, int arg2, int arg3) {
        field7581++;
        if (arg0 != 1164698437) {
            field7574 = null;
        }
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        return (arg1 >> 1) + (arg3 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lha;III)V")
    private final void method3007(class40 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field7573 = arg0.method254((byte) -119);
            if (this.field7573 == 65535) {
                this.field7573 = -1;
            }
        } else if (arg3 == 2) {
            this.field7579 = arg0.method254((byte) -124) + 1;
            this.field7580 = arg0.method254((byte) -52) + 1;
        } else if (arg3 == 3) {
            arg0.method262(-2);
        } else if (arg3 == 4) {
            this.field7575 = arg0.method257((byte) 58);
        } else if (arg3 == 5) {
            this.field7586 = arg0.method257((byte) 52);
        } else if (arg3 == 6) {
            this.field7585 = true;
        } else if (arg3 == 7) {
            this.field7584 = true;
        }
        field7577++;
        if (arg1 != 3) {
            this.method3004(null, (byte) 38, -38);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    public static void method3008(byte arg0) {
        field7572 = null;
        field7587 = null;
        if (arg0 != -100) {
            field7583 = 105;
        }
        field7574 = null;
    }
}
