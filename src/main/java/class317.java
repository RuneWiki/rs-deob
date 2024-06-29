import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class317 {

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "J")
    private long field4286 = -1L;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    private int field4287 = 0;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "J")
    private long field4295 = -1L;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Lsb;")
    private class169 field4292;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "J")
    private long field4281;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "J")
    private long field4297;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "[B")
    private byte[] field4290;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[B")
    private byte[] field4283;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "J")
    private long field4291;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Ltm;")
    public static class112 field4300 = new class112("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "Ltm;")
    public static class112 field4301 = new class112("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "Ltm;")
    public static class112 field4302 = new class112("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "[I")
    public static int[] field4304 = new int[50];

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public static int field4305 = -1;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "Ltm;")
    public static class112 field4303 = new class112("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "[I")
    public static int[] field4309 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "Lsq;")
    public static class454 field4307 = new class454(16);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    private int field4296;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "J")
    private long field4285;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4310;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "[Ldh;")
    public static class269[] field4306;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IJ)V")
    public final void method1907(int arg0, long arg1) throws IOException {
        if (arg0 != 24675) {
            method1911(29, (Color) null, (Color) null, true, -76, (Color) null, (String) null);
        }
        field4282++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1914((byte) -118));
        }
        this.field4291 = arg1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[B)V")
    public final void method1908(int arg0, byte[] arg1) throws IOException {
        field4294++;
        this.method1913(arg0 ^ 0x5F16, arg1.length, arg1, 0);
        if (arg0 != 27075) {
            this.field4285 = 67L;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    private final void method1909(int arg0) throws IOException {
        if (arg0 != 26573) {
            method1911(22, (Color) null, (Color) null, true, -90, (Color) null, (String) null);
        }
        field4284++;
        this.field4296 = 0;
        if (this.field4291 != this.field4285) {
            this.field4292.method1043(0, this.field4291);
            this.field4285 = this.field4291;
        }
        this.field4295 = this.field4291;
        while (this.field4290.length > this.field4296) {
            int var2 = this.field4290.length - this.field4296;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4292.method1046(var2, this.field4296, true, this.field4290);
            if (var3 == -1) {
                break;
            }
            this.field4296 += var3;
            this.field4285 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    private final void method1910(int arg0) throws IOException {
        field4280++;
        if (arg0 != -469) {
            field4305 = -50;
        }
        if (this.field4286 == -1L) {
            return;
        }
        if (this.field4286 != this.field4285) {
            this.field4292.method1043(arg0 + 469, this.field4286);
            this.field4285 = this.field4286;
        }
        this.field4292.method1048(0, this.field4283, this.field4287, false);
        this.field4285 += (long) this.field4287;
        if (this.field4285 > this.field4281) {
            this.field4281 = this.field4285;
        }
        long var2 = -1L;
        if (this.field4286 >= this.field4295 && (long) this.field4296 + this.field4295 > this.field4286) {
            var2 = this.field4286;
        } else if (this.field4286 <= this.field4295 && this.field4295 < ((long) this.field4287 + this.field4286)) {
            var2 = this.field4295;
        }
        long var4 = -1L;
        if ((long) this.field4287 + this.field4286 > this.field4295 && ((long) this.field4296 + this.field4295) >= ((long) this.field4287 + this.field4286)) {
            var4 = this.field4286 + ((long) this.field4287);
        } else if (this.field4286 < this.field4295 + ((long) this.field4296) && this.field4286 + ((long) this.field4287) >= (long) this.field4296 + this.field4295) {
            var4 = (long) this.field4296 + this.field4295;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class415.method2423(this.field4283, (int) (var2 - this.field4286), this.field4290, (int) (var2 - this.field4295), var6);
        }
        this.field4287 = 0;
        this.field4286 = -1L;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;ZILjava/awt/Color;Ljava/lang/String;)V")
    public static final void method1911(int arg0, Color arg1, Color arg2, boolean arg3, int arg4, Color arg5, String arg6) {
        field4299++;
        try {
            Graphics var7 = class138.field1965.getGraphics();
            if (class41.field690 == null) {
                class41.field690 = new Font("Helvetica", 1, 13);
            }
            if (arg3) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class67.field987, class371.field5248);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(255, 255, 255);
            }
            try {
                if (class167.field2451 == null) {
                    class167.field2451 = class138.field1965.createImage(304, 34);
                }
                Graphics var8 = class167.field2451.getGraphics();
                var8.setColor(arg5);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg2);
                var8.fillRect(2, 2, arg0 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect((arg0 * 3) + 2, 2, 300 - (arg0 * 3), 30);
                var8.setFont(class41.field690);
                var8.setColor(arg1);
                var8.drawString(arg6, (304 - arg6.length() * 6) / 2, 22);
                var7.drawImage(class167.field2451, class67.field987 / 2 - 152, class371.field5248 / 2 + -18, (ImageObserver) null);
                if (arg4 != 16) {
                    field4305 = -93;
                }
            } catch (Exception var11) {
                int var9 = class67.field987 / 2 - 152;
                int var10 = class371.field5248 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect((arg0 * 3) + var9 + 2, var10 + 2, 300 - arg0 * 3, 30);
                var7.setFont(class41.field690);
                var7.setColor(arg1);
                var7.drawString(arg6, (304 - (arg6.length() * 6)) / 2 + var9, var10 + 22);
            }
            if (class54.field885 != null) {
                var7.setFont(class41.field690);
                var7.setColor(arg1);
                var7.drawString(class54.field885, class67.field987 / 2 - class54.field885.length() * 6 / 2, class371.field5248 / 2 + -26);
            }
        } catch (Exception var12) {
            class138.field1965.repaint();
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)J")
    public final long method1912(int arg0) {
        if (arg0 != 301) {
            field4309 = null;
        }
        field4288++;
        return this.field4297;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[BI)V")
    public final void method1913(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4298++;
        try {
            if (arg2.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (arg0 != 14037) {
                this.field4297 = 0L;
            }
            if (this.field4286 != -1L && this.field4286 <= this.field4291 && (long) this.field4287 + this.field4286 >= this.field4291 - -((long) arg1)) {
                class415.method2423(this.field4283, (int) (this.field4291 - this.field4286), arg2, arg3, arg1);
                this.field4291 += (long) arg1;
                return;
            }
            long var5 = this.field4291;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field4291 >= this.field4295 && this.field4295 + ((long) this.field4296) > this.field4291) {
                int var9 = (int) ((long) this.field4296 - (this.field4291 - this.field4295));
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class415.method2423(this.field4290, (int) (this.field4291 - this.field4295), arg2, arg3, var9);
                this.field4291 += (long) var9;
                arg3 += var9;
                arg1 -= var9;
            }
            if (this.field4290.length < arg1) {
                this.field4292.method1043(arg0 - 14037, this.field4291);
                this.field4285 = this.field4291;
                while (arg1 > 0) {
                    int var11 = this.field4292.method1046(arg1, arg3, true, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    this.field4291 += (long) var11;
                    arg3 += var11;
                    arg1 -= var11;
                    this.field4285 += (long) var11;
                }
            } else if (arg1 > 0) {
                this.method1909(26573);
                int var10 = arg1;
                if (this.field4296 < arg1) {
                    var10 = this.field4296;
                }
                class415.method2423(this.field4290, 0, arg2, arg3, var10);
                arg3 += var10;
                this.field4291 += (long) var10;
                arg1 -= var10;
            }
            if (this.field4286 != -1L) {
                if (this.field4286 > this.field4291 && arg1 > 0) {
                    int var12 = (int) (this.field4286 - this.field4291) + arg3;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (arg3 < var12) {
                        arg1--;
                        arg2[arg3++] = 0;
                        this.field4291++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field4286 >= var5 && ((long) var8 + var5) > this.field4286) {
                    var13 = this.field4286;
                } else if (var5 >= this.field4286 && var5 < (long) this.field4287 + this.field4286) {
                    var13 = var5;
                }
                if ((long) this.field4287 + this.field4286 > var5 && (this.field4286 + ((long) this.field4287)) <= ((long) var8 + var5)) {
                    var15 = (long) this.field4287 + this.field4286;
                } else if ((var5 + ((long) var8)) > this.field4286 && (var5 + ((long) var8)) <= ((long) this.field4287 + this.field4286)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class415.method2423(this.field4283, (int) (var13 - this.field4286), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field4291 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field4291));
                        this.field4291 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4285 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method1914(byte arg0) {
        if (arg0 > -63) {
            return null;
        } else {
            field4293++;
            return this.field4292.method1047((byte) 37);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method1915(boolean arg0) {
        field4309 = null;
        field4300 = null;
        field4302 = null;
        field4304 = null;
        field4303 = null;
        field4310 = null;
        field4301 = null;
        field4306 = null;
        field4307 = null;
        if (!arg0) {
            method1911(11, (Color) null, (Color) null, false, -60, (Color) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI[BI)V")
    public final void method1916(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4289++;
        try {
            if (((long) arg1 + this.field4291) > this.field4297) {
                this.field4297 = (long) arg1 + this.field4291;
            }
            if (this.field4286 != -1L && (this.field4286 > this.field4291 || this.field4291 > (long) this.field4287 + this.field4286)) {
                this.method1910(-469);
            }
            if (arg0 <= 105) {
                this.method1912(62);
            }
            if (this.field4286 != -1L && ((long) this.field4283.length + this.field4286) < ((long) arg1 + this.field4291)) {
                int var5 = (int) ((long) this.field4283.length + this.field4286 - this.field4291);
                class415.method2423(arg2, arg3, this.field4283, (int) (this.field4291 - this.field4286), var5);
                this.field4291 += (long) var5;
                arg3 += var5;
                arg1 -= var5;
                this.field4287 = this.field4283.length;
                this.method1910(-469);
            }
            if (arg1 > this.field4283.length) {
                if (this.field4291 != this.field4285) {
                    this.field4292.method1043(0, this.field4291);
                    this.field4285 = this.field4291;
                }
                this.field4292.method1048(arg3, arg2, arg1, false);
                this.field4285 += (long) arg1;
                if (this.field4281 < this.field4285) {
                    this.field4281 = this.field4285;
                }
                long var6 = -1L;
                if (this.field4295 <= this.field4291 && this.field4291 < (long) this.field4296 + this.field4295) {
                    var6 = this.field4291;
                } else if (this.field4291 <= this.field4295 && ((long) arg1 + this.field4291) > this.field4295) {
                    var6 = this.field4295;
                }
                long var8 = -1L;
                if (this.field4295 < (long) arg1 + this.field4291 && this.field4295 + ((long) this.field4296) >= this.field4291 - -((long) arg1)) {
                    var8 = (long) arg1 + this.field4291;
                } else if (this.field4291 < ((long) this.field4296 + this.field4295) && ((long) this.field4296 + this.field4295) <= ((long) arg1 + this.field4291)) {
                    var8 = (long) this.field4296 + this.field4295;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class415.method2423(arg2, (int) (var6 + (long) arg3 - this.field4291), this.field4290, (int) (var6 - this.field4295), var10);
                }
                this.field4291 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field4286 == -1L) {
                    this.field4286 = this.field4291;
                }
                class415.method2423(arg2, arg3, this.field4283, (int) (this.field4291 - this.field4286), arg1);
                this.field4291 += (long) arg1;
                if ((long) this.field4287 < this.field4291 - this.field4286) {
                    this.field4287 = (int) (this.field4291 - this.field4286);
                }
            }
        } catch (IOException var12) {
            this.field4285 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lsb;II)V")
    public class317(class169 arg0, int arg1, int arg2) throws IOException {
        this.field4292 = arg0;
        this.field4297 = this.field4281 = arg0.method1045(-128);
        this.field4290 = new byte[arg1];
        this.field4283 = new byte[arg2];
        this.field4291 = 0L;
    }
}
