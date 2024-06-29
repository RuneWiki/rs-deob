import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class137 implements Runnable {

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    private int field1797 = 0;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    private int field1796 = 0;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1805;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    private int field1806;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "[B")
    private byte[] field1802;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field1798;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
    public static boolean field1794 = false;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "F")
    public static float field1803 = 0.25F;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Ljava/io/IOException;")
    private IOException field1801;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V")
    public static final void method857(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1807++;
        int var5 = 0;
        int var6 = arg4;
        if (arg2 != 10502) {
            field1803 = 1.2932909F;
        }
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class539.method3173(arg1 + arg4, (byte) 116, class392.field5514, class518.field7624);
        int var10 = class539.method3173(arg1 - arg4, (byte) 49, class392.field5514, class518.field7624);
        class447.method2605(arg2 ^ 0xFFFFD6FF, var10, arg0, var9, class112.field1523[arg3]);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (class303.field4422 <= var12 && class353.field5062 >= var11) {
                    int var13 = class539.method3173(arg1 + var5, (byte) 52, class392.field5514, class518.field7624);
                    int var14 = class539.method3173(arg1 - var5, (byte) 68, class392.field5514, class518.field7624);
                    if (class353.field5062 >= var12) {
                        class447.method2605(-7, var14, arg0, var13, class112.field1523[var12]);
                    }
                    if (var11 >= class303.field4422) {
                        class447.method2605(-7, var14, arg0, var13, class112.field1523[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (var16 >= class303.field4422 && var15 <= class353.field5062) {
                int var17 = class539.method3173(arg1 + var6, (byte) 42, class392.field5514, class518.field7624);
                int var18 = class539.method3173(arg1 - var6, (byte) 80, class392.field5514, class518.field7624);
                if (var16 <= class353.field5062) {
                    class447.method2605(arg2 ^ 0xFFFFD6FF, var18, arg0, var17, class112.field1523[var16]);
                }
                if (class303.field4422 <= var15) {
                    class447.method2605(-7, var18, arg0, var17, class112.field1523[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "run", descriptor = "()V")
    public final void run() {
        field1804++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1801 != null) {
                        return;
                    }
                    if (this.field1797 >= this.field1796) {
                        var2 = this.field1797 - this.field1796;
                    } else {
                        var2 = this.field1806 + this.field1797 - this.field1796;
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
            try {
                if ((this.field1796 + var2) > this.field1806) {
                    int var3 = this.field1806 - this.field1796;
                    this.field1805.write(this.field1802, this.field1796, var3);
                    this.field1805.write(this.field1802, 0, var2 - var3);
                } else {
                    this.field1805.write(this.field1802, this.field1796, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field1801 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field1796 = (this.field1796 + var2) % this.field1806;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Loi;IIIIIZ)V")
    public static final void method858(class53 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class102.field1358 = arg5;
        class234.field3410 = arg0;
        class123.field1680 = arg3;
        class15.field189 = 1;
        class346.field5017 = arg6;
        class464.field6495 = arg1;
        field1799++;
        class463.field6473 = class22.field267.method584(arg4 + 122) / arg2;
        if (~class463.field6473 > arg4) {
            class463.field6473 = 1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public final void method859(byte arg0) {
        if (arg0 != 58) {
            this.method861(-118);
        }
        this.field1805 = new class507();
        field1800++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[BIB)V")
    public final void method860(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field1793++;
        if (arg2 < 0 || arg0 < 0 || arg1.length < arg0 + arg2) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (this.field1801 != null) {
                throw new IOException(this.field1801.toString());
            }
            int var6;
            if (this.field1796 > this.field1797) {
                var6 = this.field1796 - (this.field1797 + 1);
            } else {
                var6 = this.field1806 + this.field1796 - this.field1797 - 1;
            }
            if (var6 < arg2) {
                throw new IOException("");
            } else if (arg3 > 78) {
                if ((this.field1797 + arg2) <= this.field1806) {
                    class182.method1135(arg1, arg0, this.field1802, this.field1797, arg2);
                } else {
                    int var7 = this.field1806 - this.field1797;
                    class182.method1135(arg1, arg0, this.field1802, this.field1797, var7);
                    class182.method1135(arg1, arg0 + var7, this.field1802, 0, arg2 - var7);
                }
                this.field1797 = (this.field1797 + arg2) % this.field1806;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public final void method861(int arg0) {
        field1795++;
        synchronized (this) {
            if (this.field1801 == null) {
                this.field1801 = new IOException("");
            }
            this.notifyAll();
            if (arg0 != 1) {
                field1803 = 1.6002092F;
            }
        }
        try {
            this.field1798.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class137(OutputStream arg0, int arg1) {
        this.field1805 = arg0;
        this.field1806 = arg1 + 1;
        this.field1802 = new byte[this.field1806];
        this.field1798 = new Thread(this);
        this.field1798.setDaemon(true);
        this.field1798.start();
    }
}
