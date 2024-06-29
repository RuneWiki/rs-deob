import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 implements Runnable {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    private int field845 = 0;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Z")
    private boolean field868 = false;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    private int field863 = 0;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "Z")
    private boolean field874 = false;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Ljava/net/Socket;")
    private Socket field880;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lg;")
    private class43 field855;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "Ljava/io/InputStream;")
    private InputStream field865;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field861;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lrd;")
    private static class114 field846 = class84.method656("Loaded fonts", (byte) 123);

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "J")
    public static long field849 = 0L;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Z")
    public static boolean field860 = false;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "Lrd;")
    public static class114 field864 = class84.method656("", (byte) 125);

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "Lrd;")
    public static class114 field867 = field864;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lrd;")
    public static class114 field862 = class84.method656("k", (byte) 122);

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Lrd;")
    public static class114 field858 = field864;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lrd;")
    public static class114 field853 = field864;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Lrd;")
    public static class114 field872 = class84.method656("Bitte benutzen Sie eine andere Welt)3", (byte) 117);

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lrd;")
    public static class114 field850 = field864;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Lrd;")
    public static class114 field870 = field864;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Lrd;")
    public static class114 field857 = field864;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "Lrd;")
    public static class114 field876 = field846;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Lma;")
    private class81 field873;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[B")
    private byte[] field848;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[I")
    public static int[] field852;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "[I")
    public static int[] field866;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I")
    public final int method289(byte arg0) throws IOException {
        field854++;
        if (this.field874) {
            return 0;
        } else {
            if (arg0 >= -52) {
                method296((byte) -18);
            }
            return this.field865.available();
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZII[B)V")
    public final void method290(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field875++;
        if (this.field874) {
            return;
        }
        if (this.field868) {
            this.field868 = false;
            throw new IOException();
        }
        if (this.field848 == null) {
            this.field848 = new byte[5000];
        }
        synchronized (this) {
            if (!arg0) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    this.field848[this.field863] = arg3[arg2 + var6];
                    this.field863 = (this.field863 + 1) % 5000;
                    if ((this.field845 + 4900) % 5000 == this.field863) {
                        throw new IOException();
                    }
                }
                if (this.field873 == null) {
                    this.field873 = this.field855.method309(3, (byte) -122, this);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I")
    public static final int method291(int arg0, int arg1, int arg2) {
        field878++;
        int var3 = arg1 + arg0 * 57;
        int var4 = var3 ^ var3 << 13;
        int var5 = arg2 & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final void method292(int arg0) {
        field847++;
        if (this.field874) {
            return;
        }
        synchronized (this) {
            this.field874 = true;
            this.notifyAll();
            if (arg0 != 25830) {
                this.field880 = null;
            }
        }
        if (this.field873 != null) {
            while (this.field873.field1826 == 0) {
                class141.method1122(arg0 - 8305, 1L);
            }
            if (this.field873.field1826 == 1) {
                try {
                    ((Thread) this.field873.field1823).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field873 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[BII)V")
    public final void method293(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field856++;
        if (this.field874 || arg3 != 0) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field865.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZB)V")
    public static final void method294(boolean arg0, byte arg1) {
        field859++;
        class145.field3464 = arg0;
        if (class145.field3464) {
            int var2 = class77.field1752.method482(255);
            int var3 = class77.field1752.method475((byte) 98);
            int var4 = class77.field1752.method475((byte) 118);
            int var5 = class77.field1752.method475((byte) 87);
            int var6 = class77.field1752.method480((byte) 52);
            class77.field1752.method1056(-114);
            for (int var7 = 0; var7 < 4; var7++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class77.field1752.method1050((byte) 42, 1);
                        if (var24 == 1) {
                            class3.field18[var7][var22][var23] = class77.field1752.method1050((byte) 69, 26);
                        } else {
                            class3.field18[var7][var22][var23] = -1;
                        }
                    }
                }
            }
            class77.field1752.method1055((byte) 61);
            int var8 = (class74.field1697 - class77.field1752.field1227) / 16;
            class29.field583 = new int[var8][4];
            for (int var9 = 0; var9 < var8; var9++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class29.field583[var9][var21] = class77.field1752.method470((byte) 121);
                }
            }
            class74.field1708 = new int[var8];
            class39.field821 = new byte[var8][];
            class13.field291 = new byte[var8][];
            class34.field669 = new int[var8];
            class73.field1660 = new int[var8];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class3.field18[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 14 & 0x3FF;
                            int var16 = var14 >> 3 & 0x7FF;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class74.field1708[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                int var19 = var17 >> 8 & 0xFF;
                                int var20 = var17 & 0xFF;
                                class74.field1708[var10] = var17;
                                class73.field1660[var10] = class100.field2298.method766(class101.method786((byte) 127, new class114[] { client.field406, class14.method113(var19, -31766), class63.field1357, class14.method113(var20, -31766) }), (byte) -101);
                                class34.field669[var10] = class100.field2298.method766(class101.method786((byte) 127, new class114[] { class111.field2600, class14.method113(var19, -31766), class63.field1357, class14.method113(var20, class120.method939(arg1, 31809)) }), (byte) -109);
                                var10++;
                            }
                        }
                    }
                }
            }
            class26.method199(var4, arg1 + 84, var3, var2, var6, var5);
        } else {
            int var25 = class77.field1752.method482(arg1 + 340);
            int var26 = class77.field1752.method467(255);
            int var27 = class77.field1752.method480((byte) 46);
            int var28 = (class74.field1697 - class77.field1752.field1227) / 16;
            class29.field583 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class29.field583[var29][var37] = class77.field1752.method442((byte) -122);
                }
            }
            int var30 = class77.field1752.method467(arg1 + 340);
            boolean var31 = false;
            int var32 = class77.field1752.method475((byte) 81);
            class73.field1660 = new int[var28];
            class34.field669 = new int[var28];
            class74.field1708 = new int[var28];
            if ((var32 / 8 == 48 || var32 / 8 == 49) && var26 / 8 == 48) {
                var31 = true;
            }
            class39.field821 = new byte[var28][];
            if (var32 / 8 == 48 && var26 / 8 == 148) {
                var31 = true;
            }
            class13.field291 = new byte[var28][];
            int var33 = 0;
            for (int var34 = (var32 - 6) / 8; var34 <= (var32 + 6) / 8; var34++) {
                for (int var35 = (var26 - 6) / 8; var35 <= (var26 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var31 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class74.field1708[var33] = var36;
                        class73.field1660[var33] = class100.field2298.method766(class101.method786((byte) 125, new class114[] { client.field406, class14.method113(var34, -31766), class63.field1357, class14.method113(var35, -31766) }), (byte) -94);
                        class34.field669[var33] = class100.field2298.method766(class101.method786((byte) 125, new class114[] { class111.field2600, class14.method113(var34, -31766), class63.field1357, class14.method113(var35, -31766) }), (byte) -128);
                        var33++;
                    }
                }
            }
            class26.method199(var30, arg1 + 84, var27, var25, var32, var26);
        }
        if (arg1 != -85) {
            field846 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method292(25830);
        field869++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)Lrd;")
    public static final class114 method295(int arg0, long arg1) {
        field879++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            if (arg0 != -26567) {
                method298(-42, -19);
            }
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class12.field270[(int) (var8 - arg1 * 37L)];
            }
            class114 var7 = new class114();
            var7.field2676 = var6;
            var7.field2660 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ff", name = "run", descriptor = "()V")
    public final void run() {
        field851++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field863 == this.field845) {
                        if (this.field874) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field845 <= this.field863) {
                        var2 = this.field863 - this.field845;
                    } else {
                        var2 = 5000 - this.field845;
                    }
                    var3 = this.field845;
                }
                if (var2 > 0) {
                    try {
                        this.field861.write(this.field848, var3, var2);
                    } catch (IOException var9) {
                        this.field868 = true;
                    }
                    this.field845 = (this.field845 + var2) % 5000;
                    try {
                        if (this.field863 == this.field845) {
                            this.field861.flush();
                        }
                    } catch (IOException var8) {
                        this.field868 = true;
                    }
                }
            }
            try {
                if (this.field865 != null) {
                    this.field865.close();
                }
                if (this.field861 != null) {
                    this.field861.close();
                }
                if (this.field880 != null) {
                    this.field880.close();
                }
            } catch (IOException var7) {
            }
            this.field848 = null;
        } catch (Exception var12) {
            class121.method943((byte) 13, var12, null);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public static void method296(byte arg0) {
        field870 = null;
        if (arg0 >= -43) {
            field870 = null;
        }
        field850 = null;
        field857 = null;
        field864 = null;
        field867 = null;
        field872 = null;
        field853 = null;
        field852 = null;
        field862 = null;
        field846 = null;
        field866 = null;
        field876 = null;
        field858 = null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I")
    public final int method297(int arg0) throws IOException {
        if (arg0 < 101) {
            field872 = null;
        }
        field877++;
        return this.field874 ? 0 : this.field865.read();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
    public static final void method298(int arg0, int arg1) {
        field871++;
        int[] var2 = class102.field2389.field1129;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 512 * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class22.field430[arg1][var21][var5] & 0x18) == 0) {
                    class101.field2325.method1039(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class22.field430[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class101.field2325.method1039(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8) + 238 - 10;
        class102.field2389.method393();
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class22.field430[arg1][var19][var8] & 0x18) == 0) {
                    class55.method413(var8, 0, var19, var6, var7, arg1);
                }
                if (arg1 < 3 && (class22.field430[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class55.method413(var8, 0, var19, var6, var7, arg1 + 1);
                }
            }
        }
        class77.field1759 = 0;
        int var9 = 0;
        if (arg0 < 118) {
            method294(true, (byte) -123);
        }
        while (var9 < 104) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class101.field2325.method1035(class20.field346, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class130.method1048(-66, var12).field266;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class90.field2132[class20.field346].field1983;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && var9 - 3 < var15 && (var16[var15 - 1][var14] & 0x1280108) == 0) {
                                    var15--;
                                }
                                if (var18 == 1 && var15 < 103 && var9 + 3 > var15 && (var16[var15 + 1][var14] & 0x1280180) == 0) {
                                    var15++;
                                }
                                if (var18 == 2 && var14 > 0 && var14 > var10 - 3 && (var16[var15][var14 - 1] & 0x1280102) == 0) {
                                    var14--;
                                }
                                if (var18 == 3 && var14 < 103 && var10 + 3 > var14 && (var16[var15][var14 + 1] & 0x1280120) == 0) {
                                    var14++;
                                }
                            }
                        }
                        class58.field1197[class77.field1759] = class125.field2981[var13];
                        class125.field2976[class77.field1759] = var15;
                        class121.field2833[class77.field1759] = var14;
                        class77.field1759++;
                    }
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljava/net/Socket;Lg;)V")
    public class42(Socket arg0, class43 arg1) throws IOException {
        this.field880 = arg0;
        this.field855 = arg1;
        this.field880.setSoTimeout(30000);
        this.field880.setTcpNoDelay(true);
        this.field865 = this.field880.getInputStream();
        this.field861 = this.field880.getOutputStream();
    }
}
