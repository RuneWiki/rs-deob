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

@OriginalClass("client!dr")
public class class52 implements Runnable {

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Z")
    private boolean field673 = false;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "Z")
    private boolean field687 = false;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    private int field685 = 0;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
    private int field690 = 0;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "Lcr;")
    private class112 field693;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field676;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field678;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field670;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "Z")
    public static boolean field683 = false;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "[F")
    public static float[] field684 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "[I")
    public static int[] field692 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "Lrp;")
    private class280 field691;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "Lim;")
    public static class675 field675;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "[B")
    private byte[] field694;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 7)
    public final void method292(int arg0) throws IOException {
        field672++;
        if (arg0 != -14) {
            field692 = null;
        }
        if (!this.field687 && this.field673) {
            this.field673 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V", line = 30)
    public final void method293(int arg0) {
        field671++;
        if (this.field687) {
            return;
        }
        synchronized (this) {
            this.field687 = true;
            this.notifyAll();
            if (arg0 != 29241) {
                this.field678 = null;
            }
        }
        if (this.field691 != null) {
            while (this.field691.field3773 == 0) {
                class660.method3668(-1, 1L);
            }
            if (this.field691.field3773 == 1) {
                try {
                    ((Thread) this.field691.field3772).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field691 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)I", line = 67)
    public final int method294(byte arg0) throws IOException {
        if (arg0 <= 75) {
            return -17;
        } else {
            field695++;
            return this.field687 ? 0 : this.field678.read();
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V", line = 81)
    public static void method295(int arg0) {
        if (arg0 < 39) {
            method297(-96, -74, null);
        }
        field684 = null;
        field692 = null;
        field675 = null;
    }

    @OriginalMember(owner = "client!dr", name = "run", descriptor = "()V", line = 93)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field690 == this.field685) {
                            if (this.field687) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field685;
                        if (this.field690 < this.field685) {
                            var3 = 5000 - this.field685;
                        } else {
                            var3 = this.field690 - this.field685;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field670.write(this.field694, var2, var3);
                    } catch (IOException var9) {
                        this.field673 = true;
                    }
                    this.field685 = (this.field685 + var3) % 5000;
                    try {
                        if (this.field690 == this.field685) {
                            this.field670.flush();
                        }
                    } catch (IOException var8) {
                        this.field673 = true;
                    }
                    continue;
                }
                try {
                    if (this.field678 != null) {
                        this.field678.close();
                    }
                    if (this.field670 != null) {
                        this.field670.close();
                    }
                    if (this.field676 != null) {
                        this.field676.close();
                    }
                } catch (IOException var7) {
                }
                this.field694 = null;
                break;
            }
        } catch (Exception var12) {
            class282.method1694(null, (byte) 47, var12);
        }
        field681++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII[B)V", line = 166)
    public final void method296(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field679++;
        if (this.field687) {
            return;
        }
        if (arg0 < 62) {
            this.finalize();
        }
        while (arg2 > 0) {
            int var5 = this.field678.read(arg3, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILqe;)V", line = 192)
    public static final void method297(int arg0, int arg1, class122 arg2) {
        if (arg0 <= 24) {
            field677 = -62;
        }
        field689++;
        while (true) {
            class101 var3 = (class101) class621.field8441.method374((byte) 55);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1223; var5++) {
                if (var3.field1225[var5] != null) {
                    if (var3.field1225[var5].field3773 == 2) {
                        var3.field1222[var5] = -5;
                    }
                    if (var3.field1225[var5].field3773 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1230[var5] != null) {
                    if (var3.field1230[var5].field3773 == 2) {
                        var3.field1222[var5] = -6;
                    }
                    if (var3.field1230[var5].field3773 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method749(-2079959225, arg1);
            arg2.method951((byte) -82, 0);
            int var6 = arg2.field1745;
            arg2.method906(-1, var3.field1228);
            for (int var7 = 0; var7 < var3.field1223; var7++) {
                if (var3.field1222[var7] == 0) {
                    try {
                        int var8 = var3.field1227[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1225[var7].field3772;
                            int var13 = var12.getInt(null);
                            arg2.method951((byte) -82, 0);
                            arg2.method906(-1, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1225[var7].field3772;
                            var11.setInt(null, var3.field1231[var7]);
                            arg2.method951((byte) -82, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field1225[var7].field3772;
                            int var10 = var9.getModifiers();
                            arg2.method951((byte) -82, 0);
                            arg2.method906(-1, var10);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1230[var7].field3772;
                            byte[][] var15 = var3.field1232[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method951((byte) -82, 0);
                            } else if (var19 instanceof Number) {
                                arg2.method951((byte) -82, 1);
                                arg2.method923(((Number) var19).longValue(), -22205);
                            } else if ((var19 instanceof String)) {
                                arg2.method951((byte) -82, 2);
                                arg2.method905((String) var19, 55);
                            } else {
                                arg2.method951((byte) -82, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1230[var7].field3772;
                            int var21 = var20.getModifiers();
                            arg2.method951((byte) -82, 0);
                            arg2.method906(-1, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method951((byte) -82, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method951((byte) -82, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method951((byte) -82, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method951((byte) -82, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method951((byte) -82, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method951((byte) -82, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method951((byte) -82, -16);
                    } catch (SecurityException var29) {
                        arg2.method951((byte) -82, -17);
                    } catch (IOException var30) {
                        arg2.method951((byte) -82, -18);
                    } catch (NullPointerException var31) {
                        arg2.method951((byte) -82, -19);
                    } catch (Exception var32) {
                        arg2.method951((byte) -82, -20);
                    } catch (Throwable var33) {
                        arg2.method951((byte) -82, -21);
                    }
                } else {
                    arg2.method951((byte) -82, var3.field1222[var7]);
                }
            }
            arg2.method921((byte) -117, var6);
            arg2.method901(-12951, arg2.field1745 - var6);
            var3.method175(30604);
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ljava/net/Socket;Lcr;)V", line = 518)
    public class52(Socket arg0, class112 arg1) throws IOException {
        this.field693 = arg1;
        this.field676 = arg0;
        this.field676.setSoTimeout(30000);
        this.field676.setTcpNoDelay(true);
        this.field678 = this.field676.getInputStream();
        this.field670 = this.field676.getOutputStream();
    }

    @OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V", line = 393)
    protected final void finalize() {
        this.method293(29241);
        field674++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III[B)V", line = 404)
    public final void method298(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field682++;
        if (this.field687) {
            return;
        }
        if (arg0 != 3) {
            this.field693 = null;
        }
        if (this.field673) {
            this.field673 = false;
            throw new IOException();
        }
        if (this.field694 == null) {
            this.field694 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field694[this.field690] = arg3[arg1 + var6];
                this.field690 = (this.field690 + 1) % 5000;
                if (((this.field685 + 4900) % 5000) == this.field690) {
                    throw new IOException();
                }
            }
            if (this.field691 == null) {
                this.field691 = this.field693.method612(3, this, (byte) 112);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)I", line = 462)
    public final int method299(int arg0) throws IOException {
        field688++;
        if (arg0 != 0) {
            this.method300(-36);
        }
        return this.field687 ? 0 : this.field678.available();
    }

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(I)V", line = 483)
    public final void method300(int arg0) {
        int var2 = -96 / ((63 - arg0) / 37);
        field686++;
        if (!this.field687) {
            this.field678 = new class336();
            this.field670 = new class75();
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([[IB)V", line = 499)
    public static final void method301(int[][] arg0, byte arg1) {
        field680++;
        if (arg1 < -25) {
            class319.field4673 = arg0;
        }
    }
}
