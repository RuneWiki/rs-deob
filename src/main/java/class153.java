import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class153 {

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public int field2507 = 512;

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
    private int field2515 = 0;

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "Z")
    public boolean field2517 = true;

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "Z")
    public boolean field2518 = true;

    @OriginalMember(owner = "client!fea", name = "m", descriptor = "I")
    public int field2519 = -1;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "Ljia;")
    public static class645 field2516 = new class645();

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "I")
    public int field2510;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
    public int field2511;

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!fea", name = "n", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!fea", name = "o", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!fea", name = "q", descriptor = "Lgj;")
    public static class662 field2523;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lfca;I)V", line = 5)
    public final void method1199(class93 arg0, int arg1) {
        field2509++;
        while (true) {
            int var3 = arg0.method793((byte) 121);
            if (var3 == 0) {
                if (arg1 >= -89) {
                    this.field2519 = -29;
                    return;
                } else {
                    return;
                }
            }
            this.method1205(arg0, -1, var3);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IB)V", line = 26)
    private final void method1200(int arg0, byte arg1) {
        field2508++;
        double var3 = (double) ((arg0 & 0xFF27CF) >> 16) / 256.0D;
        if (arg1 > -106) {
            return;
        }
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
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
        this.field2520 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field2513 = (int) (var17 * 256.0D);
        if (this.field2520 < 0) {
            this.field2520 = 0;
        } else if (this.field2520 > 255) {
            this.field2520 = 255;
        }
        if (var17 > 0.5D) {
            this.field2510 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2510 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2513 < 0) {
            this.field2513 = 0;
        } else if (this.field2513 > 255) {
            this.field2513 = 255;
        }
        if (this.field2510 < 1) {
            this.field2510 = 1;
        }
        this.field2511 = (int) ((double) this.field2510 * var19);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/io/File;[BB)V", line = 121)
    public static final void method1201(int arg0, File arg1, byte[] arg2, byte arg3) throws IOException {
        field2522++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        try {
            var4.readFully(arg2, 0, arg0);
            if (arg3 < 71) {
                field2523 = null;
            }
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIII)V", line = 139)
    public static final void method1202(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1011) {
            class76.method660(class527.field7148, arg1, arg0);
        } else if (arg3 == 1012) {
            class76.method660(class444.field6023, arg1, arg0);
        } else if (arg3 == 1003) {
            class76.method660(class475.field6428, arg1, arg0);
        } else if (arg3 == 1006) {
            class76.method660(class418.field5706, arg1, arg0);
        } else if (arg3 == 1008) {
            class76.method660(class683.field9506, arg1, arg0);
        }
        if (arg2 != -1009) {
            method1203((byte) 26);
        }
        field2512++;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)Z", line = 173)
    public static final boolean method1203(byte arg0) {
        if (arg0 != -26) {
            method1203((byte) -19);
        }
        field2514++;
        return class469.field6348 == 0 ? class500.field6844.method3213(25542) : true;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V", line = 191)
    public static void method1204(int arg0) {
        field2523 = null;
        field2516 = null;
        if (arg0 != -256) {
            method1204(-39);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lfca;II)V", line = 214)
    private final void method1205(class93 arg0, int arg1, int arg2) {
        field2521++;
        if (arg1 != -1) {
            this.field2511 = -30;
        }
        if (arg2 == 1) {
            this.field2515 = arg0.method767((byte) -126);
            this.method1200(this.field2515, (byte) -122);
        } else if (arg2 == 2) {
            this.field2519 = arg0.method763(93);
            if (this.field2519 != 65535) {
                return;
            }
            this.field2519 = -1;
        } else if (arg2 == 3) {
            this.field2507 = arg0.method763(126) << 2;
            return;
        } else if (arg2 == 4) {
            this.field2518 = false;
            return;
        } else if (arg2 == 5) {
            this.field2517 = false;
            return;
        }
    }
}
