import java.awt.Frame;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class104 implements Runnable {

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    private int field1196 = 0;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    private int field1195 = 0;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1194;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "[B")
    private byte[] field1205;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field1211;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "Lpha;")
    public static class174 field1202 = new class174("", 18);

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "[I")
    public static int[] field1207 = new int[2];

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "Lai;")
    public static class624 field1210;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "Ljava/io/IOException;")
    private IOException field1209;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public final void method728(int arg0) {
        if (arg0 > -120) {
            this.method731((byte) 59);
        }
        field1198++;
        synchronized (this) {
            if (this.field1209 == null) {
                this.field1209 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1211.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
    public static void method729(int arg0) {
        field1207 = null;
        field1202 = null;
        if (arg0 != 16671) {
            method734(-36, 39, -11);
        }
        field1210 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III[B)V")
    public final void method730(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1201++;
        if (arg0 != 8800) {
            method729(69);
        }
        if (arg1 < 0 || arg2 < 0 || (arg1 + arg2) > arg3.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field1209 != null) {
                throw new IOException(this.field1209.toString());
            }
            int var6;
            if (this.field1196 < this.field1195) {
                var6 = this.field1195 - this.field1196 - 1;
            } else {
                var6 = this.field1199 + this.field1195 - this.field1196 - 1;
            }
            if (var6 < arg1) {
                throw new IOException("");
            }
            if ((this.field1196 + arg1) <= this.field1199) {
                class595.method3467(arg3, arg2, this.field1205, this.field1196, arg1);
            } else {
                int var7 = this.field1199 - this.field1196;
                class595.method3467(arg3, arg2, this.field1205, this.field1196, var7);
                class595.method3467(arg3, arg2 + var7, this.field1205, 0, arg1 - var7);
            }
            this.field1196 = (this.field1196 + arg1) % this.field1199;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    public final void method731(byte arg0) {
        if (arg0 != -62) {
            this.field1199 = -105;
        }
        this.field1194 = new class361();
        field1200++;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
    public static final void method732(int arg0) {
        field1197++;
        class652 var1 = class670.field9316;
        synchronized (class670.field9316) {
            class670.field9316.method3735(2);
        }
        if (arg0 > -79) {
            method733(null, 5, -70, 47, (byte) -51, 31);
        }
        class652 var2 = class640.field8972;
        synchronized (class640.field8972) {
            class640.field8972.method3735(2);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ltd;IIIBI)Ljava/awt/Frame;")
    public static final Frame method733(class477 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1203++;
        if (!arg0.method2843(1)) {
            return null;
        }
        if (arg2 == 0) {
            class293[] var6 = class439.method2619(arg0, 0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4281 == arg5 && var6[var8].field4275 == arg3 && (arg1 == 0 || var6[var8].field4277 == arg1) && (!var7 || var6[var8].field4280 > arg2)) {
                    var7 = true;
                    arg2 = var6[var8].field4280;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class141 var9 = arg0.method2844(arg2, true, arg5, arg1, arg3);
        while (var9.field2089 == 0) {
            class107.method828(10L, (byte) 108);
        }
        int var10 = 60 % ((70 - arg4) / 48);
        Frame var11 = (Frame) var9.field2092;
        if (var11 == null) {
            return null;
        } else if (var9.field2089 == 2) {
            class432.method2587(var11, -4286143, arg0);
            return null;
        } else {
            return var11;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)B")
    public static final byte method734(int arg0, int arg1, int arg2) {
        field1208++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == arg1 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)V")
    public static final void method735(int arg0) {
        for (class746 var1 = (class746) class239.field3583.method1731((byte) -114); var1 != null; var1 = (class746) class239.field3583.method1724(0)) {
            if (class618.method3570(-31, var1.field10340)) {
                class784.method4302(32, var1);
            }
        }
        if (arg0 != 0) {
            method729(71);
        }
        field1204++;
    }

    @OriginalMember(owner = "client!qu", name = "run", descriptor = "()V")
    public final void run() {
        field1212++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1209 != null) {
                        return;
                    }
                    if (this.field1196 < this.field1195) {
                        var2 = this.field1199 + this.field1196 - this.field1195;
                    } else {
                        var2 = this.field1196 - this.field1195;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field1194.flush();
                    } catch (IOException var16) {
                        this.field1209 = var16;
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var15) {
                    }
                }
            }
            try {
                if ((this.field1195 + var2) <= this.field1199) {
                    this.field1194.write(this.field1205, this.field1195, var2);
                } else {
                    int var4 = this.field1199 - this.field1195;
                    this.field1194.write(this.field1205, this.field1195, var4);
                    this.field1194.write(this.field1205, 0, var2 - var4);
                }
            } catch (IOException var18) {
                IOException var5 = var18;
                synchronized (this) {
                    this.field1209 = var5;
                    return;
                }
            }
            synchronized (this) {
                this.field1195 = (this.field1195 + var2) % this.field1199;
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class104(OutputStream arg0, int arg1) {
        this.field1194 = arg0;
        this.field1199 = arg1 + 1;
        this.field1205 = new byte[this.field1199];
        this.field1211 = new Thread(this);
        this.field1211.setDaemon(true);
        this.field1211.start();
    }
}
