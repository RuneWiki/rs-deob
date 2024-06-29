import jaggl.OpenGL;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class792 implements Runnable {

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    private int field10848 = 0;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    private int field10853 = 0;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    private int field10849;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field10855;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "[B")
    private byte[] field10856;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field10859;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field10847;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field10851;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field10852;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field10854;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public static int field10857;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field10858;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "Ljava/io/IOException;")
    private IOException field10850;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public final void method4333(byte arg0) {
        field10854++;
        int var2 = 125 % ((arg0 + 10) / 36);
        this.field10855 = new class479();
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Z")
    public final boolean method4334(int arg0, int arg1) throws IOException {
        field10847++;
        if (arg0 <= 0 || this.field10849 <= arg0) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field10848 > this.field10853) {
                var4 = this.field10853 + this.field10849 - this.field10848;
            } else {
                var4 = this.field10853 - this.field10848;
            }
            if (arg0 <= var4) {
                return arg1 == 0;
            } else if (this.field10850 == null) {
                return false;
            } else {
                throw new IOException(this.field10850.toString());
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II[BI)I")
    public final int method4335(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field10857++;
        if (arg3 < 0 || arg1 < 0 || (arg1 + arg3) > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field10853 < this.field10848) {
                var6 = this.field10849 + this.field10853 - this.field10848;
            } else {
                var6 = this.field10853 - this.field10848;
            }
            if (var6 < arg3) {
                arg3 = var6;
            }
            if (arg3 == 0 && this.field10850 != null) {
                throw new IOException(this.field10850.toString());
            }
            if (this.field10849 < this.field10848 + arg3) {
                int var7 = this.field10849 - this.field10848;
                class335.method2118(this.field10856, this.field10848, arg2, arg1, var7);
                class335.method2118(this.field10856, 0, arg2, arg1 + var7, -var7 + arg3);
            } else {
                class335.method2118(this.field10856, this.field10848, arg2, arg1, arg3);
            }
            this.field10848 = (this.field10848 + arg3) % this.field10849;
            this.notifyAll();
            if (arg0 != -4423) {
                this.field10856 = null;
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "([Lhh;ILpq;)Lon;")
    public static final class759 method4336(class190[] arg0, int arg1, class194 arg2) {
        field10858++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field2374 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field2374);
        }
        OpenGL.glLinkProgramARB(var4);
        if (arg1 != 35716) {
            return null;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35714, class617.field8660, 0);
        if (class617.field8660[0] == 0) {
            if (class617.field8660[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class617.field8660, 1);
            if (class617.field8660[1] > 1) {
                byte[] var7 = new byte[class617.field8660[1]];
                OpenGL.glGetInfoLogARB(var4, class617.field8660[1], class617.field8660, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class617.field8660[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field2374);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class759(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!wv", name = "run", descriptor = "()V")
    public final void run() {
        field10852++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field10850 != null) {
                        return;
                    }
                    if (this.field10848 == 0) {
                        var2 = this.field10849 - this.field10853 - 1;
                    } else if (this.field10853 <= this.field10848) {
                        var2 = this.field10848 - this.field10853 - 1;
                    } else {
                        var2 = this.field10849 - this.field10853;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            int var3;
            try {
                var3 = this.field10855.read(this.field10856, this.field10853, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field10850 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field10853 = (this.field10853 + var3) % this.field10849;
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public final void method4337(int arg0) {
        field10851++;
        synchronized (this) {
            if (this.field10850 == null) {
                this.field10850 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field10859.join();
            if (arg0 != -1) {
                this.field10856 = null;
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class792(InputStream arg0, int arg1) {
        this.field10849 = arg1 + 1;
        this.field10855 = arg0;
        this.field10856 = new byte[this.field10849];
        this.field10859 = new Thread(this);
        this.field10859.setDaemon(true);
        this.field10859.start();
    }
}
