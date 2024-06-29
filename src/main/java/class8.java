import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 implements Runnable {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
    private boolean field134 = false;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Z")
    private boolean field136 = false;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    private int field152 = 0;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    private int field157 = 0;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Ldc;")
    private class25 field140;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field137;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Ljava/io/InputStream;")
    private InputStream field147;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field145;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field142 = 10;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lec;")
    public static class32 field143 = class73.method594(" zuerst von Ihrer Freunde)2Liste(Q", true);

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Lec;")
    public static class32 field146 = class73.method594("VOLL", true);

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Lec;")
    public static class32 field149 = class73.method594("AUS", true);

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lec;")
    private static class32 field154 = class73.method594("Starting game engine)3)3)3", true);

    @OriginalMember(owner = "client!b", name = "x", descriptor = "Lec;")
    public static class32 field155 = field154;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lcc;")
    private class18 field148;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "[B")
    private byte[] field139;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "[S")
    public static short[] field141;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method45(int arg0) {
        while (true) {
            if (class158.field3614.method355((byte) -122, class115.field2702) >= 11) {
                int var1 = class158.field3614.method353(11, (byte) 69);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class52.field1176[var1] == null) {
                        class52.field1176[var1] = new class70();
                        if (class143.field3264[var1] != null) {
                            class52.field1176[var1].method577((byte) 120, class143.field3264[var1]);
                        }
                        var2 = true;
                    }
                    class137.field3189[class62.field1405++] = var1;
                    class70 var3 = class52.field1176[var1];
                    var3.field2715 = class140.field3219;
                    int var4 = class158.field3614.method353(5, (byte) 69);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class158.field3614.method353(5, (byte) 69);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class31.field614[class158.field3614.method353(3, (byte) 69)];
                    if (var2) {
                        var3.field2744 = var3.field2747 = var6;
                    }
                    int var7 = class158.field3614.method353(1, (byte) 69);
                    int var8 = class158.field3614.method353(1, (byte) 69);
                    if (var8 == 1) {
                        class62.field1419[class61.field1353++] = var1;
                    }
                    var3.method904(class20.field373.field2738[0] + var5, 19403, var7 == 1, class20.field373.field2761[0] + var4);
                    continue;
                }
            }
            if (arg0 != 11) {
                field149 = null;
            }
            field138++;
            class158.field3614.method356(7);
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)I")
    public final int method46(int arg0) throws IOException {
        if (arg0 == 860) {
            field156++;
            return this.field136 ? 0 : this.field147.read();
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method47(byte arg0) {
        field146 = null;
        field143 = null;
        field149 = null;
        field154 = null;
        field155 = null;
        field141 = null;
        if (arg0 != -50) {
            field143 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static final void method48(byte arg0) {
        if (arg0 < -8) {
            class85.field1988.method491(103);
            class126.field2924.method491(-120);
            class45.field1056.method491(-116);
            field153++;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BIIB)V")
    public final void method49(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field150++;
        if (arg3 < 120) {
            this.field145 = null;
        }
        if (this.field136) {
            return;
        }
        if (this.field134) {
            this.field134 = false;
            throw new IOException();
        }
        if (this.field139 == null) {
            this.field139 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field139[this.field152] = arg0[arg2 + var6];
                this.field152 = (this.field152 + 1) % 5000;
                if ((this.field157 + 4900) % 5000 == this.field152) {
                    throw new IOException();
                }
            }
            if (this.field148 == null) {
                this.field148 = this.field140.method175(3, this, 106);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II[BI)V")
    public final void method50(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field151++;
        if (arg0 <= 107) {
            method53(80);
        }
        if (this.field136) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field147.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field158++;
        this.method52(89);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)I")
    public final int method51(byte arg0) throws IOException {
        if (arg0 < 114) {
            field141 = null;
        }
        field133++;
        return this.field136 ? 0 : this.field147.available();
    }

    @OriginalMember(owner = "client!b", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field157 == this.field152) {
                            if (this.field136) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field152 < this.field157) {
                            var2 = 5000 - this.field157;
                        } else {
                            var2 = this.field152 - this.field157;
                        }
                        var3 = this.field157;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field145.write(this.field139, var3, var2);
                    } catch (IOException var9) {
                        this.field134 = true;
                    }
                    this.field157 = (this.field157 + var2) % 5000;
                    try {
                        if (this.field157 == this.field152) {
                            this.field145.flush();
                        }
                    } catch (IOException var8) {
                        this.field134 = true;
                    }
                    continue;
                }
                try {
                    if (this.field147 != null) {
                        this.field147.close();
                    }
                    if (this.field145 != null) {
                        this.field145.close();
                    }
                    if (this.field137 != null) {
                        this.field137.close();
                    }
                } catch (IOException var7) {
                }
                this.field139 = null;
                break;
            }
        } catch (Exception var12) {
            class110.method872(var12, null, 95);
        }
        field132++;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public final void method52(int arg0) {
        field135++;
        if (this.field136) {
            return;
        }
        synchronized (this) {
            this.field136 = true;
            this.notifyAll();
        }
        if (this.field148 != null) {
            while (this.field148.field355 == 0) {
                class54.method427(1L, -27166);
            }
            if (this.field148.field355 == 1) {
                try {
                    ((Thread) this.field148.field352).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field148 = null;
        int var3 = -82 / ((arg0 - 23) / 44);
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)Z")
    public static final boolean method53(int arg0) {
        field144++;
        try {
            if (class98.field2265 == 2) {
                if (class129.field2979 == null) {
                    class129.field2979 = class6.method25(class34.field719, class157.field3608, class126.field2930);
                    if (class129.field2979 == null) {
                        return false;
                    }
                }
                if (class159.field3646 == null) {
                    class159.field3646 = new class68(class105.field2501, class98.field2259);
                }
                if (class83.field1967.method96(22050, class97.field2239, class159.field3646, class129.field2979, 10599)) {
                    class83.field1967.method121(-24016);
                    class83.field1967.method89(-19402, class57.field1322);
                    class83.field1967.method84(21186, class121.field2872, class129.field2979);
                    class159.field3646 = null;
                    class98.field2265 = 0;
                    class129.field2979 = null;
                    class34.field719 = null;
                    return true;
                }
            }
            if (arg0 < 42) {
                method47((byte) -40);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class83.field1967.method115(21828);
            class129.field2979 = null;
            class34.field719 = null;
            class159.field3646 = null;
            class98.field2265 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Ljava/net/Socket;Ldc;)V")
    public class8(Socket arg0, class25 arg1) throws IOException {
        this.field140 = arg1;
        this.field137 = arg0;
        this.field137.setSoTimeout(30000);
        this.field137.setTcpNoDelay(true);
        this.field147 = this.field137.getInputStream();
        this.field145 = this.field137.getOutputStream();
    }
}
