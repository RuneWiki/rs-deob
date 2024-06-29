import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 implements Runnable {

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Z")
    private boolean field1031 = false;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    private int field1030 = 0;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    private int field1040 = 0;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "Z")
    private boolean field1041 = false;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "Lje;")
    private class67 field1037;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field1020;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1012;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1021;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
    public static int[] field1010 = new int[128];

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Lic;")
    public static class59 field1017 = class59.method433(0, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1018 = 2;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "[I")
    public static int[] field1014 = new int[100];

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field1036 = 0;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "Lic;")
    public static class59 field1039 = class59.method433(0, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field1042 = 0;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lbe;")
    private class13 field1025;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Lmd;")
    public static class87 field1013;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[B")
    private byte[] field1011;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method301(int arg0) {
        field1010 = null;
        field1013 = null;
        field1014 = null;
        field1017 = null;
        if (arg0 == 100) {
            field1039 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)I")
    public final int method302(int arg0) throws IOException {
        if (arg0 >= -83) {
            method304(109, 93, 19);
        }
        field1033++;
        return this.field1031 ? 0 : this.field1012.read();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static final void method303(byte arg0) {
        class59.field1445 = 0;
        class106.field2526 = 0;
        field1032++;
        class126.method966(-80);
        if (arg0 > -6) {
            return;
        }
        class68.method546(3);
        class148.method1099(126);
        class29.method232(123);
        for (int var1 = 0; var1 < class59.field1445; var1++) {
            int var3 = class2.field34[var1];
            if (class23.field561 != class91.field2323[var3].field1749) {
                class91.field2323[var3] = null;
            }
        }
        if (class34.field914 != class10.field213.field3457) {
            throw new RuntimeException("gpp1 pos:" + class10.field213.field3457 + " psize:" + class34.field914);
        }
        for (int var2 = 0; var2 < class43.field1092; var2++) {
            if (class91.field2323[class31.field842[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class43.field1092);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
    public final void run() {
        field1038++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1040 == this.field1030) {
                        if (this.field1031) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field1030 > this.field1040) {
                        var2 = 5000 - this.field1030;
                    } else {
                        var2 = this.field1040 - this.field1030;
                    }
                    var3 = this.field1030;
                }
                if (var2 > 0) {
                    try {
                        this.field1021.write(this.field1011, var3, var2);
                    } catch (IOException var9) {
                        this.field1041 = true;
                    }
                    this.field1030 = (this.field1030 + var2) % 5000;
                    try {
                        if (this.field1040 == this.field1030) {
                            this.field1021.flush();
                        }
                    } catch (IOException var8) {
                        this.field1041 = true;
                    }
                }
            }
            try {
                if (this.field1012 != null) {
                    this.field1012.close();
                }
                if (this.field1021 != null) {
                    this.field1021.close();
                }
                if (this.field1020 != null) {
                    this.field1020.close();
                }
            } catch (IOException var7) {
            }
            this.field1011 = null;
        } catch (Exception var12) {
            class86.method704(var12, null, 4436);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)I")
    public static final int method304(int arg0, int arg1, int arg2) {
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        if (arg0 >= -21) {
            method307(-81, null);
        }
        field1026++;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method308(19401);
        field1023++;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)I")
    public final int method305(byte arg0) throws IOException {
        if (arg0 == 107) {
            field1015++;
            return this.field1031 ? 0 : this.field1012.available();
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[B)V")
    public final void method306(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1035++;
        if (this.field1031) {
            return;
        }
        if (this.field1041) {
            this.field1041 = false;
            throw new IOException();
        }
        if (this.field1011 == null) {
            this.field1011 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field1011[this.field1040] = arg3[arg1 + var6];
                this.field1040 = (this.field1040 + 1) % 5000;
                if ((this.field1030 + 4900) % 5000 == this.field1040) {
                    throw new IOException();
                }
            }
            if (arg2 != 15731) {
                this.run();
            }
            if (this.field1025 == null) {
                this.field1025 = this.field1037.method543(this, 3, 0);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method307(int arg0, Component arg1) {
        field1024++;
        arg1.removeKeyListener(class18.field353);
        arg1.removeFocusListener(class18.field353);
        if (arg0 == -19465) {
            class107.field2553 = -1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    public final void method308(int arg0) {
        field1019++;
        if (this.field1031) {
            return;
        }
        synchronized (this) {
            if (arg0 != 19401) {
                this.field1025 = null;
            }
            this.field1031 = true;
            this.notifyAll();
        }
        if (this.field1025 != null) {
            while (this.field1025.field252 == 0) {
                class126.method962(false, 1L);
            }
            if (this.field1025.field252 == 1) {
                try {
                    ((Thread) this.field1025.field254).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1025 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI[B)V")
    public final void method309(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field1016++;
        if (arg1 <= 20) {
            field1010 = null;
        }
        if (this.field1031) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field1012.read(arg3, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILwf;)Lic;")
    public static final class59 method310(int arg0, class159 arg1) {
        field1029++;
        if (~class49.method383(4269, class112.method915(arg1, -2042430560)) == arg0) {
            return null;
        } else if (arg1.field3651 == null || arg1.field3651.method429(-128).method437((byte) 52) == 0) {
            return class35.field925 ? class32.field855 : null;
        } else {
            return arg1.field3651;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/net/Socket;Lje;)V")
    public class40(Socket arg0, class67 arg1) throws IOException {
        this.field1037 = arg1;
        this.field1020 = arg0;
        this.field1020.setSoTimeout(30000);
        this.field1020.setTcpNoDelay(true);
        this.field1012 = this.field1020.getInputStream();
        this.field1021 = this.field1020.getOutputStream();
    }
}
