import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.OutputStream;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class306 implements Runnable {

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
    private int field4157 = 0;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Z")
    private boolean field4142 = false;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "Z")
    private boolean field4162 = false;

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
    private int field4161 = 0;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field4152;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Lfl;")
    private class739 field4147;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field4154;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4148;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    private int field4146;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
    public static int field4164 = 0;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "Ljt;")
    private class107 field4145;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "[B")
    private byte[] field4158;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)I")
    public static final int method1845(int arg0) {
        field4153++;
        if (arg0 != -5133) {
            field4164 = -25;
        }
        int var1 = class704.field9876.method2261((byte) -10);
        if (var1 < (class727.field10142.length - 1)) {
            class704.field9876 = class727.field10142[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)I")
    public final int method1846(int arg0) throws IOException {
        field4150++;
        if (this.field4162) {
            return 0;
        } else {
            if (arg0 < 70) {
                this.field4154 = null;
            }
            return this.field4154.available();
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
    public final void method1847(boolean arg0) throws IOException {
        field4141++;
        if (!arg0) {
            this.field4146 = 96;
        }
        if (!this.field4162 && this.field4142) {
            this.field4142 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)I")
    public static final int method1848(int arg0) {
        if (arg0 == -13) {
            field4151++;
            return class401.method2321(false, (byte) 90);
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)I")
    public final int method1849(int arg0) throws IOException {
        field4149++;
        if (this.field4162) {
            return 0;
        } else if (arg0 == -14234) {
            return this.field4154.read();
        } else {
            return 33;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLbi;)V")
    public static final void method1850(byte arg0, class481 arg1) {
        field4163++;
        class590 var2 = (class590) class710.field9911.method724(32);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field8241; var4++) {
            if (var2.field8244[var4] != null) {
                if (var2.field8244[var4].field1419 == 2) {
                    var2.field8237[var4] = -5;
                }
                if (var2.field8244[var4].field1419 == 0) {
                    var3 = true;
                }
            }
            if (var2.field8243[var4] != null) {
                if (var2.field8243[var4].field1419 == 2) {
                    var2.field8237[var4] = -6;
                }
                if (var2.field8243[var4].field1419 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field8520;
        arg1.method3384(arg0 + 1571862949, var2.field8234);
        if (arg0 != -61) {
            field4164 = 82;
        }
        for (int var6 = 0; var6 < var2.field8241; var6++) {
            if (var2.field8237[var6] == 0) {
                try {
                    int var7 = var2.field8233[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field8244[var6].field1418;
                        int var9 = var8.getInt(null);
                        arg1.method3393(0, -99);
                        arg1.method3384(arg0 ^ 0xA24F46AB, var9);
                    } else if (var7 == 1) {
                        Field var10 = (Field) var2.field8244[var6].field1418;
                        var10.setInt(null, var2.field8240[var6]);
                        arg1.method3393(0, -48);
                    } else if (var7 == 2) {
                        Field var11 = (Field) var2.field8244[var6].field1418;
                        int var12 = var11.getModifiers();
                        arg1.method3393(0, -52);
                        arg1.method3384(1571862888, var12);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field8243[var6].field1418;
                        byte[][] var14 = var2.field8238[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg1.method3393(0, 115);
                        } else if ((var18 instanceof Number)) {
                            arg1.method3393(1, arg0 - 53);
                            arg1.method3420(arg0 - 65, ((Number) var18).longValue());
                        } else if (var18 instanceof String) {
                            arg1.method3393(2, -124);
                            arg1.method3387((String) var18, (byte) 113);
                        } else {
                            arg1.method3393(4, 101);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field8243[var6].field1418;
                        int var20 = var19.getModifiers();
                        arg1.method3393(0, 48);
                        arg1.method3384(1571862888, var20);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method3393(-10, arg0 - 20);
                } catch (InvalidClassException var22) {
                    arg1.method3393(-11, 85);
                } catch (StreamCorruptedException var23) {
                    arg1.method3393(-12, -87);
                } catch (OptionalDataException var24) {
                    arg1.method3393(-13, 79);
                } catch (IllegalAccessException var25) {
                    arg1.method3393(-14, arg0 ^ -115);
                } catch (IllegalArgumentException var26) {
                    arg1.method3393(-15, arg0 ^ -119);
                } catch (InvocationTargetException var27) {
                    arg1.method3393(-16, 125);
                } catch (SecurityException var28) {
                    arg1.method3393(-17, 43);
                } catch (IOException var29) {
                    arg1.method3393(-18, 48);
                } catch (NullPointerException var30) {
                    arg1.method3393(-19, 87);
                } catch (Exception var31) {
                    arg1.method3393(-20, 70);
                } catch (Throwable var32) {
                    arg1.method3393(-21, -120);
                }
            } else {
                arg1.method3393(var2.field8237[var6], arg0 ^ 0x9);
            }
        }
        arg1.method3395(var5, (byte) -32);
        var2.method315(95);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BII[B)V")
    public final void method1851(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4159++;
        if (this.field4162) {
            return;
        }
        if (this.field4142) {
            this.field4142 = false;
            throw new IOException();
        }
        if (this.field4158 == null) {
            this.field4158 = new byte[this.field4146];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field4158[this.field4157] = arg3[arg1 + var6];
                this.field4157 = (this.field4157 + 1) % this.field4146;
                if (((this.field4161 - (100 - this.field4146)) % this.field4146) == this.field4157) {
                    throw new IOException();
                }
            }
            if (arg0 != 77) {
                this.field4161 = 85;
            }
            if (this.field4145 == null) {
                this.field4145 = this.field4147.method4126(3, this, 1);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IZI[B)V")
    public final void method1852(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        if (!arg1) {
            this.finalize();
        }
        field4155++;
        if (this.field4162) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field4154.read(arg3, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)V")
    public final void method1853(int arg0) {
        field4143++;
        if (!this.field4162) {
            this.field4154 = new class523();
            this.field4148 = new class414();
            int var2 = -63 % ((4 - arg0) / 58);
        }
    }

    @OriginalMember(owner = "client!vt", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1854(-29789);
        field4156++;
    }

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)V")
    public final void method1854(int arg0) {
        field4160++;
        if (this.field4162) {
            return;
        }
        synchronized (this) {
            this.field4162 = true;
            if (arg0 != -29789) {
                this.method1853(-126);
            }
            this.notifyAll();
        }
        if (this.field4145 != null) {
            while (this.field4145.field1419 == 0) {
                class267.method1599(0, 1L);
            }
            if (this.field4145.field1419 == 1) {
                try {
                    ((Thread) this.field4145.field1418).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4145 = null;
    }

    @OriginalMember(owner = "client!vt", name = "run", descriptor = "()V")
    public final void run() {
        field4144++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4161 == this.field4157) {
                        if (this.field4162) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field4161;
                    if (this.field4157 < this.field4161) {
                        var3 = this.field4146 - this.field4161;
                    } else {
                        var3 = this.field4157 - this.field4161;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field4148.write(this.field4158, var2, var3);
                    } catch (IOException var9) {
                        this.field4142 = true;
                    }
                    this.field4161 = (this.field4161 + var3) % this.field4146;
                    try {
                        if (this.field4161 == this.field4157) {
                            this.field4148.flush();
                        }
                    } catch (IOException var8) {
                        this.field4142 = true;
                    }
                }
            }
            try {
                if (this.field4154 != null) {
                    this.field4154.close();
                }
                if (this.field4148 != null) {
                    this.field4148.close();
                }
                if (this.field4152 != null) {
                    this.field4152.close();
                }
            } catch (IOException var7) {
            }
            this.field4158 = null;
        } catch (Exception var12) {
            class760.method4223(var12, -128, null);
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Ljava/net/Socket;Lfl;I)V")
    public class306(Socket arg0, class739 arg1, int arg2) throws IOException {
        this.field4152 = arg0;
        this.field4147 = arg1;
        this.field4152.setSoTimeout(30000);
        this.field4152.setTcpNoDelay(true);
        this.field4154 = this.field4152.getInputStream();
        this.field4148 = this.field4152.getOutputStream();
        this.field4146 = arg2;
    }
}
