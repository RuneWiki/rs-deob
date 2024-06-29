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

@OriginalClass("client!p")
public class class285 implements Runnable {

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Z")
    private boolean field5016 = false;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    private int field5026 = 0;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Z")
    private boolean field5015 = false;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    private int field5030 = 0;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lw;")
    private class143 field5032;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field5013;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field5011;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5012;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[[[B")
    public static byte[][][] field5023 = new byte[4][104][104];

    @OriginalMember(owner = "client!p", name = "x", descriptor = "[I")
    public static int[] field5033 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lla;")
    public static class95 field5025 = new class95(64);

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field5035 = 1;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lkd;")
    private class203 field5017;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "[B")
    private byte[] field5020;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I")
    public final int method1915(int arg0) throws IOException {
        field5010++;
        if (this.field5016) {
            return 0;
        } else if (arg0 == 1) {
            return this.field5011.available();
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static void method1916(boolean arg0) {
        field5033 = null;
        if (!arg0) {
            field5033 = null;
        }
        field5025 = null;
        field5023 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static final void method1917(byte arg0) {
        int var1 = -103 % ((-arg0 - 60) / 57);
        for (int var2 = 0; var2 < 100; var2++) {
            class129.field2476[var2] = true;
        }
        field5019++;
    }

    @OriginalMember(owner = "client!p", name = "run", descriptor = "()V")
    public final void run() {
        field5034++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field5030 == this.field5026) {
                        if (this.field5016) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field5026 >= this.field5030) {
                        var2 = this.field5026 - this.field5030;
                    } else {
                        var2 = 5000 - this.field5030;
                    }
                    var3 = this.field5030;
                }
                if (var2 > 0) {
                    try {
                        this.field5012.write(this.field5020, var3, var2);
                    } catch (IOException var9) {
                        this.field5015 = true;
                    }
                    this.field5030 = (this.field5030 + var2) % 5000;
                    try {
                        if (this.field5030 == this.field5026) {
                            this.field5012.flush();
                        }
                    } catch (IOException var8) {
                        this.field5015 = true;
                    }
                }
            }
            try {
                if (this.field5011 != null) {
                    this.field5011.close();
                }
                if (this.field5012 != null) {
                    this.field5012.close();
                }
                if (this.field5013 != null) {
                    this.field5013.close();
                }
            } catch (IOException var7) {
            }
            this.field5020 = null;
        } catch (Exception var12) {
            class78.method548((byte) -17, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)I")
    public final int method1918(byte arg0) throws IOException {
        field5022++;
        if (this.field5016) {
            return 0;
        } else {
            int var2 = -88 % ((1 - arg0) / 45);
            return this.field5011.read();
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    public final void method1919(byte arg0) throws IOException {
        if (arg0 != -86) {
            method1916(true);
        }
        field5021++;
        if (!this.field5016 && this.field5015) {
            this.field5015 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILhl;I)V")
    public static final void method1920(int arg0, class39 arg1, int arg2) {
        field5024++;
        if (arg2 >= -39) {
            method1916(false);
        }
        while (true) {
            class219 var3 = (class219) class102.field1965.method1119(20896);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3995; var5++) {
                if (var3.field3985[var5] != null) {
                    if (var3.field3985[var5].field3646 == 2) {
                        var3.field3989[var5] = -5;
                    }
                    if (var3.field3985[var5].field3646 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3982[var5] != null) {
                    if (var3.field3982[var5].field3646 == 2) {
                        var3.field3989[var5] = -6;
                    }
                    if (var3.field3982[var5].field3646 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method287((byte) 126, arg0);
            arg1.method773(-6385, 0);
            int var6 = arg1.field2085;
            arg1.method758(var3.field3988, 1469334200);
            for (int var7 = 0; var7 < var3.field3995; var7++) {
                if (var3.field3989[var7] == 0) {
                    try {
                        int var8 = var3.field3990[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3985[var7].field3642;
                            int var10 = var9.getInt((Object) null);
                            arg1.method773(-6385, 0);
                            arg1.method758(var10, 1469334200);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3985[var7].field3642;
                            var11.setInt((Object) null, var3.field3983[var7]);
                            arg1.method773(-6385, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field3985[var7].field3642;
                            int var13 = var12.getModifiers();
                            arg1.method773(-6385, 0);
                            arg1.method758(var13, 1469334200);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field3982[var7].field3642;
                            byte[][] var15 = var3.field3984[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method773(-6385, 0);
                            } else if ((var19 instanceof Number)) {
                                arg1.method773(-6385, 1);
                                arg1.method756(((Number) var19).longValue(), (byte) -116);
                            } else if (var19 instanceof class209) {
                                arg1.method773(-6385, 2);
                                arg1.method745((class209) var19, (byte) 79);
                            } else {
                                arg1.method773(-6385, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3982[var7].field3642;
                            int var21 = var20.getModifiers();
                            arg1.method773(-6385, 0);
                            arg1.method758(var21, 1469334200);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method773(-6385, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method773(-6385, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method773(-6385, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method773(-6385, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method773(-6385, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method773(-6385, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method773(-6385, -16);
                    } catch (SecurityException var29) {
                        arg1.method773(-6385, -17);
                    } catch (IOException var30) {
                        arg1.method773(-6385, -18);
                    } catch (NullPointerException var31) {
                        arg1.method773(-6385, -19);
                    } catch (Exception var32) {
                        arg1.method773(-6385, -20);
                    } catch (Throwable var33) {
                        arg1.method773(-6385, -21);
                    }
                } else {
                    arg1.method773(-6385, var3.field3989[var7]);
                }
            }
            arg1.method742(var6, (byte) -98);
            arg1.method779(124, arg1.field2085 - var6);
            var3.method269(-214950896);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([BIII)V")
    public final void method1921(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5014++;
        if (this.field5016) {
            return;
        }
        if (this.field5015) {
            this.field5015 = false;
            throw new IOException();
        }
        if (this.field5020 == null) {
            this.field5020 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field5020[this.field5026] = arg0[arg3 + var6];
                this.field5026 = (this.field5026 + 1) % 5000;
                if ((this.field5030 + 4900) % 5000 == this.field5026) {
                    throw new IOException();
                }
            }
            if (this.field5017 == null) {
                this.field5017 = this.field5032.method996(this, 3, false);
            }
            this.notifyAll();
            if (arg2 != -32362) {
                this.field5015 = false;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1924(false);
        field5027++;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([BIII)V")
    public final void method1922(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 != -1) {
            return;
        }
        field5029++;
        if (this.field5016) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field5011.read(arg0, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public final void method1923(int arg0) {
        if (arg0 >= -27) {
            this.field5026 = -100;
        }
        field5031++;
        if (!this.field5016) {
            this.field5011 = new class166();
            this.field5012 = new class268();
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
    public final void method1924(boolean arg0) {
        field5018++;
        if (this.field5016) {
            return;
        }
        synchronized (this) {
            this.field5016 = true;
            this.notifyAll();
        }
        if (arg0) {
            method1916(true);
        }
        if (this.field5017 != null) {
            while (this.field5017.field3646 == 0) {
                class174.method1196((byte) 117, 1L);
            }
            if (this.field5017.field3646 == 1) {
                try {
                    ((Thread) this.field5017.field3642).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field5017 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
    public static final void method1925(int arg0, int arg1, int arg2, int arg3) {
        field5028++;
        class195 var4 = class178.method1229(arg0, 4, 12);
        var4.method1338(0);
        if (arg3 == -17330) {
            var4.field3511 = arg1;
            var4.field3503 = arg2;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Ljava/net/Socket;Lw;)V")
    public class285(Socket arg0, class143 arg1) throws IOException {
        this.field5032 = arg1;
        this.field5013 = arg0;
        this.field5013.setSoTimeout(30000);
        this.field5013.setTcpNoDelay(true);
        this.field5011 = this.field5013.getInputStream();
        this.field5012 = this.field5013.getOutputStream();
    }
}
