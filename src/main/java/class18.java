import java.awt.Image;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class18 implements Runnable {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    private int field487 = 0;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Z")
    private boolean field494 = false;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    private int field484 = 0;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "Z")
    private boolean field509 = false;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lsb;")
    private class110 field495;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Ljava/net/Socket;")
    private Socket field507;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "Ljava/io/InputStream;")
    private InputStream field512;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field502;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Lwb;")
    private static class130 field492 = class26.method212("Enter name of player to delete from list", -32376);

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Lwb;")
    public static class130 field503 = field492;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field514 = 0;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "[Lec;")
    public static class28[] field513 = new class28[1000];

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "Lwb;")
    private static class130 field515 = class26.method212("Loaded textures", -32376);

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lwb;")
    public static class130 field498 = field515;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "Lwb;")
    private static class130 field517 = class26.method212("flash1:", -32376);

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "Lwb;")
    public static class130 field516 = field517;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Lqd;")
    public static class100 field506;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lgb;")
    private class39 field497;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Ljava/awt/Image;")
    public static Image field491;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "[B")
    private byte[] field501;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III[B)V", line = 4)
    public final void method145(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field485++;
        if (this.field509) {
            return;
        }
        if (this.field494) {
            this.field494 = false;
            throw new IOException();
        }
        if (this.field501 == null) {
            this.field501 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = arg0; var6 < arg1; var6++) {
                this.field501[this.field487] = arg3[arg2 + var6];
                this.field487 = (this.field487 + 1) % 5000;
                if ((this.field484 + 4900) % 5000 == this.field487) {
                    throw new IOException();
                }
            }
            if (this.field497 == null) {
                this.field497 = this.field495.method842(this, (byte) -103, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Lwb;", line = 69)
    public static final class130 method146(int arg0, int arg1) {
        if (arg0 != -27912) {
            field514 = -18;
        }
        field505++;
        return class15.method114(new class130[] { class109.method831(arg1 >> 24 & 0xFF, 10), class56.field1430, class109.method831(arg1 >> 16 & 0xFF, 10), class56.field1430, class109.method831(arg1 >> 8 & 0xFF, 10), class56.field1430, class109.method831(arg1 & 0xFF, 10) }, -20349);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIZIZIII)Z", line = 80)
    public static final boolean method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class101.field2441[var12][var36] = 0;
                class58.field1473[var12][var36] = 99999999;
            }
        }
        field504++;
        class101.field2441[arg1][arg10] = 99;
        class58.field1473[arg1][arg10] = 0;
        int var13 = arg1;
        int var14 = arg10;
        byte var15 = 0;
        boolean var16 = false;
        class35.field998[var15] = arg1;
        int var17 = 0;
        int var37 = var15 + 1;
        class81.field1936[var15] = arg10;
        int var18 = class35.field998.length;
        int[][] var19 = class99.field2404[class71.field1818].field2964;
        while (var37 != var17) {
            var13 = class35.field998[var17];
            var14 = class81.field1936[var17];
            var17 = (var17 + 1) % var18;
            if (arg9 == var13 && arg11 == var14) {
                var16 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class99.field2404[class71.field1818].method928(arg0, var14, arg7 - 1, arg11, var13, 19398914, arg9)) {
                    var16 = true;
                    break;
                }
                if (arg7 < 10 && class99.field2404[class71.field1818].method929(arg0, arg11, var14, 128, var13, arg9, arg7 - 1)) {
                    var16 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg2 != 0 && class99.field2404[class71.field1818].method923(var14, arg4, arg3, var13, arg2, arg9, arg11, (byte) -36)) {
                var16 = true;
                break;
            }
            int var35 = class58.field1473[var13][var14] + 1;
            if (var13 > 0 && class101.field2441[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0) {
                class35.field998[var37] = var13 - 1;
                class81.field1936[var37] = var14;
                class101.field2441[var13 - 1][var14] = 2;
                class58.field1473[var13 - 1][var14] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && class101.field2441[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0) {
                class35.field998[var37] = var13 + 1;
                class81.field1936[var37] = var14;
                var37 = (var37 + 1) % var18;
                class101.field2441[var13 + 1][var14] = 8;
                class58.field1473[var13 + 1][var14] = var35;
            }
            if (var14 > 0 && class101.field2441[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class35.field998[var37] = var13;
                class81.field1936[var37] = var14 - 1;
                class101.field2441[var13][var14 - 1] = 1;
                var37 = (var37 + 1) % var18;
                class58.field1473[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class101.field2441[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class35.field998[var37] = var13;
                class81.field1936[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class101.field2441[var13][var14 + 1] = 4;
                class58.field1473[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class101.field2441[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x128010E) == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class35.field998[var37] = var13 - 1;
                class81.field1936[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class101.field2441[var13 - 1][var14 - 1] = 3;
                class58.field1473[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class101.field2441[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x1280183) == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class35.field998[var37] = var13 + 1;
                class81.field1936[var37] = var14 - 1;
                class101.field2441[var13 + 1][var14 - 1] = 9;
                var37 = (var37 + 1) % var18;
                class58.field1473[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class101.field2441[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x1280138) == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class35.field998[var37] = var13 - 1;
                class81.field1936[var37] = var14 + 1;
                class101.field2441[var13 - 1][var14 + 1] = 6;
                class58.field1473[var13 - 1][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && var14 < 103 && class101.field2441[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12801E0) == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class35.field998[var37] = var13 + 1;
                class81.field1936[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class101.field2441[var13 + 1][var14 + 1] = 12;
                class58.field1473[var13 + 1][var14 + 1] = var35;
            }
        }
        if (!arg6) {
            return true;
        }
        class101.field2433 = 0;
        if (!var16) {
            if (!arg8) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg9 - var22; var23 <= arg9 + var22; var23++) {
                for (int var24 = arg11 - var22; var24 <= arg11 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class58.field1473[var23][var24] < 100) {
                        int var25 = 0;
                        if (var24 < arg11) {
                            var25 = arg11 - var24;
                        } else if (arg11 + arg2 - 1 < var24) {
                            var25 = var24 + 1 - arg11 - arg2;
                        }
                        int var26 = 0;
                        if (var23 < arg9) {
                            var26 = arg9 - var23;
                        } else if (arg3 + arg9 - 1 < var23) {
                            var26 = var23 + 1 - arg3 - arg9;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class58.field1473[var23][var24] < var21) {
                            var20 = var27;
                            var13 = var23;
                            var21 = class58.field1473[var23][var24];
                            var14 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg1 == var13 && arg10 == var14) {
                return false;
            }
            class101.field2433 = 1;
        }
        byte var28 = 0;
        class35.field998[var28] = var13;
        int var38 = var28 + 1;
        class81.field1936[var28] = var14;
        int var29;
        int var30 = var29 = class101.field2441[var13][var14];
        while (arg1 != var13 || arg10 != var14) {
            if (var29 != var30) {
                class35.field998[var38] = var13;
                class81.field1936[var38++] = var14;
                var29 = var30;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            var30 = class101.field2441[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class35.field998[var38];
            int var33 = class81.field1936[var38];
            if (arg5 == 0) {
                class89.field2148++;
                class14.field406.method727(62, 122);
                class14.field406.method330(-1, var31 + var31 + 3);
            }
            if (arg5 == 1) {
                class14.field406.method727(197, 111);
                class14.field406.method330(-1, var31 + var31 + 17);
                class58.field1453++;
            }
            if (arg5 == 2) {
                class88.field2113++;
                class14.field406.method727(199, -118);
                class14.field406.method330(-1, var31 + var31 + 3);
            }
            class14.field406.method330(-1, class81.field1939[82] ? 1 : 0);
            class14.field406.method347(class42.field1172 + var33, 87);
            class14.field406.method353(class129.field3045 + var32, 65280);
            class116.field2850 = class35.field998[0];
            class61.field1583 = class81.field1936[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class14.field406.method352(arg6, class35.field998[var38] - var32);
                class14.field406.method352(true, class81.field1936[var38] - var33);
            }
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 420)
    public final void method148(int arg0) {
        field490++;
        if (this.field509) {
            return;
        }
        int var2 = -34 % ((-arg0 - 53) / 41);
        synchronized (this) {
            this.field509 = true;
            this.notifyAll();
        }
        if (this.field497 != null) {
            while (this.field497.field1099 == 0) {
                class37.method375(-1, 1L);
            }
            if (this.field497.field1099 == 1) {
                try {
                    ((Thread) this.field497.field1100).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field497 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(III[B)V", line = 462)
    public final void method149(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 < 93) {
            field491 = null;
        }
        field511++;
        if (this.field509) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field512.read(arg3, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!ce", name = "run", descriptor = "()V", line = 487)
    public final void run() {
        field486++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field487 == this.field484) {
                        if (this.field509) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field484;
                    if (this.field484 <= this.field487) {
                        var3 = this.field487 - this.field484;
                    } else {
                        var3 = 5000 - this.field484;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field502.write(this.field501, var2, var3);
                    } catch (IOException var9) {
                        this.field494 = true;
                    }
                    this.field484 = (this.field484 + var3) % 5000;
                    try {
                        if (this.field487 == this.field484) {
                            this.field502.flush();
                        }
                    } catch (IOException var8) {
                        this.field494 = true;
                    }
                }
            }
            try {
                if (this.field512 != null) {
                    this.field512.close();
                }
                if (this.field502 != null) {
                    this.field502.close();
                }
                if (this.field507 != null) {
                    this.field507.close();
                }
            } catch (IOException var7) {
            }
            this.field501 = null;
        } catch (Exception var12) {
            class33.method264(null, var12, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!ce", name = "finalize", descriptor = "()V", line = 558)
    protected final void finalize() {
        field499++;
        this.method148(-122);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ljava/net/Socket;Lsb;)V", line = 1113)
    public class18(Socket arg0, class110 arg1) throws IOException {
        this.field495 = arg1;
        this.field507 = arg0;
        this.field507.setSoTimeout(30000);
        this.field507.setTcpNoDelay(true);
        this.field512 = this.field507.getInputStream();
        this.field502 = this.field507.getOutputStream();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 569)
    public static void method150(boolean arg0) {
        field515 = null;
        field498 = null;
        field503 = null;
        field491 = null;
        field516 = null;
        field506 = null;
        field513 = null;
        field517 = null;
        if (arg0) {
            field503 = null;
        }
        field492 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 587)
    public static final void method151(int arg0) {
        field493++;
        for (class2 var1 = (class2) class51.field1343.method813(120); var1 != null; var1 = (class2) class51.field1343.method814((byte) -19)) {
            if (class71.field1818 != var1.field65 || var1.field35 < class130.field3128) {
                var1.method714((byte) -83);
            } else if (var1.field61 <= class130.field3128) {
                if (var1.field64 > 0) {
                    class33 var2 = class26.field766[var1.field64 - 1];
                    if (var2 != null && var2.field2071 >= 0 && var2.field2071 < 13312 && var2.field2128 >= 0 && var2.field2128 < 13312) {
                        var1.method6(var2.field2071, class27.method219(336137319, var1.field65, var2.field2128, var2.field2071) - var1.field31, var2.field2128, class130.field3128, (byte) 109);
                    }
                }
                if (var1.field64 < 0) {
                    int var3 = -var1.field64 - 1;
                    class59 var4;
                    if (class53.field1376 == var3) {
                        var4 = class42.field1179;
                    } else {
                        var4 = class105.field2550[var3];
                    }
                    if (var4 != null && var4.field2071 >= 0 && var4.field2071 < 13312 && var4.field2128 >= 0 && var4.field2128 < 13312) {
                        var1.method6(var4.field2071, class27.method219(arg0 ^ 0x14090C66, var1.field65, var4.field2128, var4.field2071) - var1.field31, var4.field2128, class130.field3128, (byte) 127);
                    }
                }
                var1.method5(0, class31.field860);
                class79.field1926.method267(class71.field1818, (int) var1.field56, (int) var1.field33, (int) var1.field30, 60, var1, var1.field54, -1, false);
            }
        }
        if (arg0 != 1) {
            method151(-53);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([BIII)Z", line = 656)
    public static final boolean method152(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 60) {
            return false;
        }
        field510++;
        boolean var4 = true;
        class36 var5 = new class36(arg0);
        int var6 = -1;
        label71: while (true) {
            int var7 = var5.method331(-128);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class109 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method331(-124);
                                        if (var17 == 0) {
                                            continue label71;
                                        }
                                        var5.method365((byte) -122);
                                    }
                                    int var10 = var5.method331(-127);
                                    if (var10 == 0) {
                                        continue label71;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method365((byte) -128) >> 2;
                                    var14 = var12 + arg1;
                                    var15 = arg2 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class32.method256(6, var6);
                } while (var13 == 22 && class4.field189 && var16.field2633 == 0 && !var16.field2677);
                if (!var16.method822(0)) {
                    class115.field2829++;
                    var4 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)I", line = 770)
    public final int method153(byte arg0) throws IOException {
        field500++;
        if (this.field509) {
            return 0;
        } else {
            int var2 = -99 % ((arg0 + 19) / 41);
            return this.field512.read();
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V", line = 785)
    public static final void method154(int arg0) {
        field508++;
        if (class95.field2306 == 0 && class42.field1182 == 0) {
            class109.field2654++;
            class53.method450(class101.field2429, 0, class23.field672, class9.field295, 28, field483, -114);
        }
        int var1 = -1;
        int var2 = 0;
        if (arg0 != 1) {
            field513 = null;
        }
        while (class102.field2517 > var2) {
            int var3 = class102.field2492[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                label273: {
                    var1 = var3;
                    if (var6 == 2 && class79.field1926.method311(class71.field1818, var4, var5, var3) >= 0) {
                        class109 var8 = class32.method256(6, var7);
                        if (var8.field2629 != null) {
                            var8 = var8.method826(-106);
                        }
                        if (var8 == null) {
                            break label273;
                        }
                        if (class95.field2306 == 1) {
                            class53.method450(var5, var3, class23.field679, class15.method114(new class130[] { class116.field2860, client.field536, var8.field2692 }, arg0 - 20350), 13, var4, -115);
                            class113.field2800++;
                        } else if (class42.field1182 != 1) {
                            class130[] var9 = var8.field2694;
                            if (class63.field1601) {
                                var9 = class93.method688((byte) 54, var9);
                            }
                            class90.field2186++;
                            if (var9 != null) {
                                for (int var10 = 4; var10 >= 0; var10--) {
                                    if (var9[var10] != null) {
                                        short var11 = 0;
                                        if (var10 == 0) {
                                            var11 = 49;
                                        }
                                        if (var10 == 1) {
                                            var11 = 3;
                                        }
                                        class130.field3066++;
                                        if (var10 == 2) {
                                            var11 = 39;
                                        }
                                        if (var10 == 3) {
                                            var11 = 1;
                                        }
                                        if (var10 == 4) {
                                            var11 = 1005;
                                        }
                                        class53.method450(var5, var3, var9[var10], class15.method114(new class130[] { class9.field292, var8.field2692 }, arg0 ^ 0xFFFFB082), var11, var4, -118);
                                    }
                                }
                            }
                            class53.method450(var5, var8.field2645 << 14, class101.field2419, class15.method114(new class130[] { class9.field292, var8.field2692 }, -20349), 1003, var4, -122);
                        } else if ((class45.field1231 & 0x4) == 4) {
                            class68.field1758++;
                            class53.method450(var5, var3, class95.field2303, class15.method114(new class130[] { class32.field883, client.field536, var8.field2692 }, arg0 - 20350), 44, var4, -121);
                        }
                    }
                    if (var6 == 1) {
                        class33 var12 = class26.field766[var7];
                        if (var12.field913.field1981 == 1 && (var12.field2071 & 0x7F) == 64 && (var12.field2128 & 0x7F) == 64) {
                            for (int var13 = 0; var13 < class58.field1466; var13++) {
                                class33 var16 = class26.field766[class24.field716[var13]];
                                if (var16 != null && var12 != var16 && var16.field913.field1981 == 1 && var12.field2071 == var16.field2071 && var12.field2128 == var16.field2128) {
                                    class60.method503(var5, var4, var16.field913, (byte) 34, class24.field716[var13]);
                                }
                            }
                            for (int var14 = 0; var14 < class61.field1582; var14++) {
                                class59 var15 = class105.field2550[class26.field770[var14]];
                                if (var15 != null && var12.field2071 == var15.field2071 && var12.field2128 == var15.field2128) {
                                    class48.method426(class26.field770[var14], var15, var4, var5, 2000);
                                }
                            }
                        }
                        class60.method503(var5, var4, var12.field913, (byte) 34, var7);
                    }
                    if (var6 == 0) {
                        class59 var17 = class105.field2550[var7];
                        if ((var17.field2071 & 0x7F) == 64 && (var17.field2128 & 0x7F) == 64) {
                            for (int var18 = 0; var18 < class58.field1466; var18++) {
                                class33 var21 = class26.field766[class24.field716[var18]];
                                if (var21 != null && var21.field913.field1981 == 1 && var17.field2071 == var21.field2071 && var17.field2128 == var21.field2128) {
                                    class60.method503(var5, var4, var21.field913, (byte) 34, class24.field716[var18]);
                                }
                            }
                            for (int var19 = 0; var19 < class61.field1582; var19++) {
                                class59 var20 = class105.field2550[class26.field770[var19]];
                                if (var20 != null && var17 != var20 && var17.field2071 == var20.field2071 && var17.field2128 == var20.field2128) {
                                    class48.method426(class26.field770[var19], var20, var4, var5, 2000);
                                }
                            }
                        }
                        class48.method426(var7, var17, var4, var5, 2000);
                    }
                    if (var6 == 3) {
                        class108 var22 = class23.field674[class71.field1818][var4][var5];
                        if (var22 != null) {
                            for (class46 var23 = (class46) var22.method815(-27822); var23 != null; var23 = (class46) var22.method811(arg0 ^ 0x5C)) {
                                class67 var24 = class84.method630((byte) 11, var23.field1233);
                                if (class95.field2306 == 1) {
                                    class30.field833++;
                                    class53.method450(var5, var23.field1233, class23.field679, class15.method114(new class130[] { class116.field2860, class6.field207, var24.field1688 }, -20349), 23, var4, -114);
                                } else if (class42.field1182 != 1) {
                                    class47.field1264++;
                                    class130[] var25 = var24.field1691;
                                    if (class63.field1601) {
                                        var25 = class93.method688((byte) 54, var25);
                                    }
                                    for (int var26 = 4; var26 >= 0; var26--) {
                                        if (var25 != null && var25[var26] != null) {
                                            byte var27 = 0;
                                            class92.field2211++;
                                            if (var26 == 0) {
                                                var27 = 14;
                                            }
                                            if (var26 == 1) {
                                                var27 = 42;
                                            }
                                            if (var26 == 2) {
                                                var27 = 9;
                                            }
                                            if (var26 == 3) {
                                                var27 = 47;
                                            }
                                            if (var26 == 4) {
                                                var27 = 46;
                                            }
                                            class53.method450(var5, var23.field1233, var25[var26], class15.method114(new class130[] { class48.field1290, var24.field1688 }, -20349), var27, var4, -117);
                                        } else if (var26 == 2) {
                                            class40.field1116++;
                                            class53.method450(var5, var23.field1233, class115.field2819, class15.method114(new class130[] { class48.field1290, var24.field1688 }, -20349), 9, var4, -122);
                                        }
                                    }
                                    class53.method450(var5, var23.field1233, class101.field2419, class15.method114(new class130[] { class48.field1290, var24.field1688 }, -20349), 1001, var4, -122);
                                } else if ((class45.field1231 & 0x1) == 1) {
                                    class92.field2210++;
                                    class53.method450(var5, var23.field1233, class95.field2303, class15.method114(new class130[] { class32.field883, class6.field207, var24.field1688 }, -20349), 25, var4, -127);
                                }
                            }
                        }
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)I", line = 1084)
    public final int method155(byte arg0) throws IOException {
        field489++;
        if (this.field509) {
            return 0;
        } else if (arg0 == -116) {
            return this.field512.available();
        } else {
            return 22;
        }
    }
}
