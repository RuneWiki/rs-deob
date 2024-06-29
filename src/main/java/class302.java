import java.awt.event.ActionEvent;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class302 implements Runnable {

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    private int field5130 = 0;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Z")
    private boolean field5127 = false;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    private int field5148 = 0;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "Z")
    private boolean field5155 = false;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field5131;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "Lsm;")
    private class120 field5156;

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "Ljava/io/InputStream;")
    private InputStream field5158;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5126;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field5144 = 7759444;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Lhi;")
    public static class82 field5129 = class95.method664((byte) -94, "headicons_pk");

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public static int field5152 = 0;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field5139 = 0;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "Lhi;")
    public static class82 field5132 = class95.method664((byte) -25, "Angreifen");

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "Lhi;")
    public static class82 field5149 = class95.method664((byte) -84, "<)4col>");

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "[Z")
    public static boolean[] field5151 = new boolean[100];

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "Lum;")
    public static class222 field5147;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "Lum;")
    public static class222 field5153;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "Lag;")
    private class301 field5150;

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "Lme;")
    public static class75 field5154;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "[B")
    private byte[] field5137;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLbc;)V", line = 9)
    public static final void method2079(byte arg0, class153 arg1) {
        field5138++;
        if (arg1.field2598.length - arg1.field2611 < 1) {
            return;
        }
        int var2 = arg1.method1082(-108);
        if (var2 < 0 || var2 > 8) {
            return;
        }
        byte var3;
        if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field2598.length - arg1.field2611 < var3) {
            return;
        }
        class112.field2032 = arg1.method1082(-119);
        if (class112.field2032 < 1) {
            class112.field2032 = 1;
        } else if (class112.field2032 > 4) {
            class112.field2032 = 4;
        }
        class137.method933(arg1.method1082(-64) == 1, true);
        class77.field1320 = arg1.method1082(-127) == 1;
        class256.field4409 = arg1.method1082(-55) == 1;
        class198.field3384 = arg1.method1082(arg0 - 20) == 1;
        class244.field4232 = arg1.method1082(-38) == 1;
        class133.field2295 = arg1.method1082(-74) == 1;
        class113.field2040 = arg1.method1082(arg0 ^ 0x3B) == 1;
        class208.field3641 = arg1.method1082(-71) == 1;
        class33.field504 = arg1.method1082(-42);
        if (class33.field504 > 2) {
            class33.field504 = 2;
        }
        if (var2 < 2) {
            class75.field1303 = arg1.method1082(-69) == 1;
            arg1.method1082(arg0 ^ 0x16);
        } else {
            class75.field1303 = arg1.method1082(-68) == 1;
        }
        class126.field2220 = arg1.method1082(-35) == 1;
        class52.field839 = arg1.method1082(-34) == 1;
        class61.field960 = arg1.method1082(-57);
        if (class61.field960 > 2) {
            class61.field960 = 2;
        }
        class146.field2467 = class61.field960;
        class308.field5238 = arg1.method1082(-59) == 1;
        class134.field2321 = arg1.method1082(-68);
        if (class134.field2321 > 127) {
            class134.field2321 = 127;
        }
        class284.field4771 = arg1.method1082(-45);
        class138.field2373 = arg1.method1082(-44);
        if (class138.field2373 > 127) {
            class138.field2373 = 127;
        }
        if (arg0 != -16) {
            field5139 = -18;
        }
        if (var2 >= 1) {
            class93.field1660 = arg1.method1090(false);
            class112.field2033 = arg1.method1090(false);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1082(-32);
        }
        if (var2 >= 4) {
            class295.method2024(arg1.method1082(-88));
        }
        if (var2 >= 5) {
            class123.field2155 = arg1.method1097((byte) -95);
        }
        if (var2 >= 6) {
            class261.field4470 = arg1.method1082(-102);
        }
        if (var2 >= 7) {
            class87.field1554 = arg1.method1082(-115) == 1;
        }
        if (var2 >= 8) {
            class300.field5098 = arg1.method1082(-66) == 1;
        }
    }

    @OriginalMember(owner = "client!vm", name = "run", descriptor = "()V", line = 148)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field5148 == this.field5130) {
                        if (this.field5155) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var12) {
                        }
                    }
                    var3 = this.field5148;
                    if (this.field5148 <= this.field5130) {
                        var4 = this.field5130 - this.field5148;
                    } else {
                        var4 = 5000 - this.field5148;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field5126.write(this.field5137, var3, var4);
                    } catch (IOException var11) {
                        this.field5127 = true;
                    }
                    this.field5148 = (this.field5148 + var4) % 5000;
                    try {
                        if (this.field5148 == this.field5130) {
                            this.field5126.flush();
                        }
                    } catch (IOException var10) {
                        this.field5127 = true;
                    }
                }
            }
            try {
                if (this.field5158 != null) {
                    this.field5158.close();
                }
                if (this.field5126 != null) {
                    this.field5126.close();
                }
                if (this.field5131 != null) {
                    this.field5131.close();
                }
            } catch (IOException var13) {
            }
            this.field5137 = null;
        } catch (Exception var15) {
            class48.method348(-2, (String) null, var15);
        }
        field5146++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZ)V", line = 220)
    public static final void method2080(int arg0, boolean arg1) {
        if (!arg1) {
            method2082(-8);
        }
        field5140++;
        class260.field4458.method2177(arg0, 92);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 231)
    public static final void method2081(byte arg0) {
        field5133++;
        for (int var1 = 0; var1 < 100; var1++) {
            class276.field4639[var1] = true;
        }
        if (arg0 != -9) {
            method2091((byte) -26, 23);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 258)
    public static void method2082(int arg0) {
        field5153 = null;
        field5149 = null;
        field5154 = null;
        field5147 = null;
        field5129 = null;
        field5132 = null;
        if (arg0 >= 53) {
            field5151 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZI[BI)V", line = 280)
    public final void method2083(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field5135++;
        if (this.field5155) {
            return;
        }
        if (this.field5127) {
            this.field5127 = false;
            throw new IOException();
        }
        if (this.field5137 == null) {
            this.field5137 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field5137[this.field5130] = arg2[arg3 + var6];
                this.field5130 = (this.field5130 + 1) % 5000;
                if (((this.field5148 + 4900) % 5000) == this.field5130) {
                    throw new IOException();
                }
            }
            if (this.field5150 == null) {
                this.field5150 = this.field5156.method821(this, 3, (byte) -34);
            }
            this.notifyAll();
        }
        if (!arg0) {
            field5132 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V", line = 329)
    public final void method2084(int arg0) throws IOException {
        field5142++;
        if (!this.field5155 && arg0 == 4 && this.field5127) {
            this.field5127 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Ljava/net/Socket;Lsm;)V", line = 525)
    public class302(Socket arg0, class120 arg1) throws IOException {
        this.field5131 = arg0;
        this.field5156 = arg1;
        this.field5131.setSoTimeout(30000);
        this.field5131.setTcpNoDelay(true);
        this.field5158 = this.field5131.getInputStream();
        this.field5126 = this.field5131.getOutputStream();
    }

    @OriginalMember(owner = "client!vm", name = "finalize", descriptor = "()V", line = 370)
    protected final void finalize() {
        this.method2085(true);
        field5141++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V", line = 389)
    public final void method2085(boolean arg0) {
        field5136++;
        if (this.field5155) {
            return;
        }
        synchronized (this) {
            this.field5155 = arg0;
            this.notifyAll();
        }
        if (this.field5150 != null) {
            while (this.field5150.field5121 == 0) {
                class290.method2001(1L, false);
            }
            if (this.field5150.field5121 == 1) {
                try {
                    ((Thread) this.field5150.field5122).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field5150 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZLjava/lang/Object;Lsm;)V", line = 423)
    public static final void method2086(boolean arg0, Object arg1, class120 arg2) {
        field5157++;
        if (arg2.field2121 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2121.peekEvent() != null; var3++) {
            class290.method2001(1L, false);
        }
        if (arg0) {
            field5147 = (class222) null;
        }
        if (arg1 != null) {
            arg2.field2121.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BIB)V", line = 446)
    public final void method2087(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field5143++;
        if (arg3 <= 106) {
            this.field5130 = 126;
        }
        if (this.field5155) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field5158.read(arg1, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)I", line = 470)
    public final int method2088(byte arg0) throws IOException {
        field5159++;
        if (arg0 != 91) {
            this.field5131 = (Socket) null;
        }
        return this.field5155 ? 0 : this.field5158.available();
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)I", line = 493)
    public final int method2089(int arg0) throws IOException {
        int var2 = 2 % ((arg0 + 51) / 33);
        field5145++;
        return this.field5155 ? 0 : this.field5158.read();
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V", line = 547)
    public final void method2090(int arg0) {
        field5128++;
        int var2 = -62 % ((2 - arg0) / 52);
        if (!this.field5155) {
            this.field5158 = new class224();
            this.field5126 = new class29();
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)Z", line = 563)
    public static final boolean method2091(byte arg0, int arg1) {
        class104.field1844 = true;
        if (arg0 <= 50) {
            method2082(61);
        }
        field5134++;
        class27.field359 = arg1 + 1 & 0xFFFF;
        return true;
    }
}
