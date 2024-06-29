import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class300 implements Runnable {

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Z")
    private boolean field4678 = false;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    private int field4686 = 0;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    private int field4673 = 0;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Z")
    private boolean field4688 = false;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field4677;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "Lgn;")
    private class6 field4696;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "Ljava/io/InputStream;")
    private InputStream field4700;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4694;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "[I")
    public static int[] field4675 = new int[500];

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field4676 = 0;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field4690 = 0;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "Z")
    public static volatile boolean field4697 = true;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Lea;")
    private class217 field4680;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "[B")
    private byte[] field4681;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "[I")
    public static int[] field4685;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[BI)V", line = 6)
    public final void method2092(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4691++;
        if (arg1 != 15167 || this.field4688) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field4700.read(arg2, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!dm", name = "finalize", descriptor = "()V", line = 47)
    protected final void finalize() {
        field4692++;
        this.method2095(8737);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIIII)Z", line = 54)
    public static final boolean method2093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V", line = 81)
    public static final void method2094(String arg0, int arg1, String arg2, int arg3) {
        client.field4228 = arg2;
        class287.field4524 = arg0;
        class81.field1227 = arg3;
        field4684++;
        if (arg1 != -30309) {
            return;
        }
        if (client.field4228.equals("") || class287.field4524.equals("")) {
            class80.field1205 = 3;
        } else if (class94.field1452 == -1) {
            class169.field2709 = 1;
            class80.field1225 = 0;
            class253.field4022 = 0;
            class80.field1205 = -3;
            class192 var4 = new class192(128);
            var4.method1365(-32769, 10);
            var4.method1350((int) (Math.random() * 9.9999999E7D), -107);
            var4.method1375(class232.method1669(37, client.field4228), -89);
            var4.method1350((int) (Math.random() * 9.9999999E7D), -115);
            var4.method1374(class287.field4524, (byte) -116);
            var4.method1350((int) (Math.random() * 9.9999999E7D), -122);
            var4.method1348(class151.field2315, (byte) 106, class39.field547);
            class21.field313.field3129 = 0;
            class21.field313.method1365(-32769, 24);
            class21.field313.method1365(-32769, var4.field3129 + 2);
            class21.field313.method1368(545, 4796);
            class21.field313.method1367(var4.field3129, 0, var4.field3128, 504526352);
        } else {
            class227.method1656(112);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 126)
    public final void method2095(int arg0) {
        field4687++;
        if (this.field4688) {
            return;
        }
        synchronized (this) {
            this.field4688 = true;
            this.notifyAll();
            if (arg0 != 8737) {
                this.field4678 = true;
            }
        }
        if (this.field4680 != null) {
            while (this.field4680.field3488 == 0) {
                class20.method128(0, 1L);
            }
            if (this.field4680.field3488 == 1) {
                try {
                    ((Thread) this.field4680.field3490).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field4680 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 164)
    public final void method2096(byte arg0) throws IOException {
        int var2 = 37 / ((38 - arg0) / 47);
        field4689++;
        if (!this.field4688 && this.field4678) {
            this.field4678 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Ljava/net/Socket;Lgn;)V", line = 464)
    public class300(Socket arg0, class6 arg1) throws IOException {
        this.field4677 = arg0;
        this.field4696 = arg1;
        this.field4677.setSoTimeout(30000);
        this.field4677.setTcpNoDelay(true);
        this.field4700 = this.field4677.getInputStream();
        this.field4694 = this.field4677.getOutputStream();
    }

    @OriginalMember(owner = "client!dm", name = "run", descriptor = "()V", line = 199)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label88: {
                    synchronized (this) {
                        label89: {
                            if (this.field4686 == this.field4673) {
                                if (this.field4688) {
                                    break label89;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            if (this.field4673 <= this.field4686) {
                                var3 = this.field4686 - this.field4673;
                            } else {
                                var3 = 5000 - this.field4673;
                            }
                            var4 = this.field4673;
                            break label88;
                        }
                    }
                    try {
                        if (this.field4700 != null) {
                            this.field4700.close();
                        }
                        if (this.field4694 != null) {
                            this.field4694.close();
                        }
                        if (this.field4677 != null) {
                            this.field4677.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field4681 = null;
                    break;
                }
                if (var3 > 0) {
                    try {
                        this.field4694.write(this.field4681, var4, var3);
                    } catch (IOException var12) {
                        this.field4678 = true;
                    }
                    this.field4673 = (this.field4673 + var3) % 5000;
                    try {
                        if (this.field4686 == this.field4673) {
                            this.field4694.flush();
                        }
                    } catch (IOException var11) {
                        this.field4678 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class314.method2186((String) null, 125, var15);
        }
        field4682++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(JI)V", line = 271)
    public static final void method2097(long arg0, int arg1) {
        field4683++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class198.field3247 < 100 || class185.field2977) || class198.field3247 >= 200) {
            class245.method1740((byte) 81, 0, "", class331.field5153);
            return;
        }
        String var3 = class331.method2290((byte) 120, arg0);
        for (int var4 = 0; var4 < class198.field3247; var4++) {
            if (class87.field1314[var4] == arg0) {
                class245.method1740((byte) -110, 0, "", var3 + class201.field3290);
                return;
            }
        }
        for (int var5 = 0; var5 < class271.field4291; var5++) {
            if (class157.field2424[var5] == arg0) {
                class245.method1740((byte) -124, 0, "", class250.field3983 + var3 + class188.field3060);
                return;
            }
        }
        if (var3.equals(class13.field159.field5003)) {
            class245.method1740((byte) 36, 0, "", class59.field784);
            return;
        }
        class239.field3773[class198.field3247] = var3;
        class334.field5191++;
        class87.field1314[class198.field3247] = arg0;
        class36.field482[class198.field3247] = 0;
        class164.field2670[class198.field3247] = "";
        class239.field3783[class198.field3247] = 0;
        class183.field2957[class198.field3247] = false;
        class93.field1444 = class297.field4655;
        class198.field3247++;
        if (arg1 < 74) {
            field4676 = -13;
        }
        class21.field313.method1541(78, 94);
        class21.field313.method1375(arg0, -16);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V", line = 340)
    public static void method2098(int arg0) {
        field4675 = null;
        field4685 = null;
        if (arg0 != 30000) {
            method2093(31, 55, -104, 116, 111, 101, -68, -111);
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)I", line = 352)
    public final int method2099(int arg0) throws IOException {
        if (arg0 == 0) {
            field4695++;
            return this.field4688 ? 0 : this.field4700.read();
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)I", line = 368)
    public final int method2100(int arg0) throws IOException {
        field4674++;
        if (this.field4688) {
            return 0;
        } else if (arg0 == 0) {
            return this.field4700.available();
        } else {
            return -85;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([BBII)V", line = 389)
    public final void method2101(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field4693++;
        if (this.field4688) {
            return;
        }
        if (this.field4678) {
            this.field4678 = false;
            throw new IOException();
        }
        if (this.field4681 == null) {
            this.field4681 = new byte[5000];
        }
        synchronized (this) {
            if (arg1 != 18) {
                this.field4680 = (class217) null;
            }
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field4681[this.field4686] = arg0[arg2 + var6];
                this.field4686 = (this.field4686 + 1) % 5000;
                if ((this.field4673 + 4900) % 5000 == this.field4686) {
                    throw new IOException();
                }
            }
            if (this.field4680 == null) {
                this.field4680 = this.field4696.method40(3, this, -78);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V", line = 450)
    public final void method2102(int arg0) {
        field4679++;
        if (this.field4688) {
            return;
        }
        this.field4700 = new class183();
        this.field4694 = new class36();
        if (arg0 <= 111) {
            field4675 = (int[]) null;
        }
    }
}
