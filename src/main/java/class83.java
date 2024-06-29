import java.awt.Canvas;
import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class83 implements Runnable {

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    private int field1305 = 0;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "Z")
    private boolean field1311 = false;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    private int field1304 = 0;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "Z")
    private boolean field1321 = false;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Ljava/net/Socket;")
    private Socket field1302;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "Lec;")
    private class109 field1325;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field1310;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1313;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field1306 = 0;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "[Lvi;")
    public static class480[] field1327;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "Luv;")
    public static class2 field1328;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "Z")
    public static boolean field1330;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "Ltf;")
    private class533 field1329;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "[B")
    private byte[] field1320;

    static {
        new class347("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field1327 = new class480[2048];
        field1328 = new class2(18, 10);
        field1330 = false;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III[B)V", line = 5)
    public final void method658(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1319++;
        if (this.field1311) {
            return;
        }
        if (this.field1321) {
            this.field1321 = false;
            throw new IOException();
        }
        if (arg0 != 14812) {
            this.method661(11);
        }
        if (this.field1320 == null) {
            this.field1320 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1320[this.field1304] = arg3[arg1 + var6];
                this.field1304 = (this.field1304 + 1) % 5000;
                if (((this.field1305 + 4900) % 5000) == this.field1304) {
                    throw new IOException();
                }
            }
            if (this.field1329 == null) {
                this.field1329 = this.field1325.method828(this, 53, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;ILec;IZLga;)Lya;", line = 58)
    public static final class11 method659(Canvas arg0, int arg1, class109 arg2, int arg3, boolean arg4, class243 arg5) {
        if (!arg4) {
            field1306 = 126;
        }
        field1303++;
        return new class258(arg1, arg0, arg5, arg3, arg2);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 69)
    public static final void method660(int arg0) {
        field1316++;
        if (class116.field1742) {
            return;
        }
        class116.field1745 = true;
        class116.field1742 = true;
        if (arg0 != -12778) {
            method659(null, 99, null, 5, true, null);
        }
        if (class454.field6661.field969) {
            class254.field3443 = ((int) class254.field3443 + 47 & 0xFFFFFFF0);
        } else {
            class161.field2413 += (12.0F - class161.field2413) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 95)
    public final void method661(int arg0) {
        int var2 = 119 % ((-arg0 - 7) / 48);
        field1324++;
        if (!this.field1311) {
            this.field1310 = new class373();
            this.field1313 = new class159();
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I", line = 110)
    public final int method662(int arg0) throws IOException {
        field1317++;
        if (this.field1311) {
            return 0;
        } else if (arg0 == 0) {
            return this.field1310.read();
        } else {
            return 74;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 126)
    public final void method663(byte arg0) throws IOException {
        field1318++;
        if (!this.field1311 && arg0 == -7 && this.field1321) {
            this.field1321 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!um", name = "run", descriptor = "()V", line = 148)
    public final void run() {
        field1331++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1305 == this.field1304) {
                        if (this.field1311) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field1305 > this.field1304) {
                        var2 = 5000 - this.field1305;
                    } else {
                        var2 = this.field1304 - this.field1305;
                    }
                    var3 = this.field1305;
                }
                if (var2 > 0) {
                    try {
                        this.field1313.write(this.field1320, var3, var2);
                    } catch (IOException var9) {
                        this.field1321 = true;
                    }
                    this.field1305 = (this.field1305 + var2) % 5000;
                    try {
                        if (this.field1305 == this.field1304) {
                            this.field1313.flush();
                        }
                    } catch (IOException var8) {
                        this.field1321 = true;
                    }
                }
            }
            try {
                if (this.field1310 != null) {
                    this.field1310.close();
                }
                if (this.field1313 != null) {
                    this.field1313.close();
                }
                if (this.field1302 != null) {
                    this.field1302.close();
                }
            } catch (IOException var7) {
            }
            this.field1320 = null;
        } catch (Exception var12) {
            class488.method2913(0, var12, null);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([BBII)V", line = 225)
    public final void method664(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field1301++;
        if (this.field1311) {
            return;
        }
        if (arg1 < 78) {
            field1327 = null;
        }
        while (arg3 > 0) {
            int var5 = this.field1310.read(arg0, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V", line = 251)
    public static void method665(byte arg0) {
        if (arg0 != 113) {
            method670(null, -54);
        }
        field1328 = null;
        field1327 = null;
    }

    @OriginalMember(owner = "client!um", name = "finalize", descriptor = "()V", line = 262)
    protected final void finalize() {
        this.method669((byte) 50);
        field1308++;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ljava/net/Socket;Lec;)V", line = 469)
    public class83(Socket arg0, class109 arg1) throws IOException {
        this.field1302 = arg0;
        this.field1325 = arg1;
        this.field1302.setSoTimeout(30000);
        this.field1302.setTcpNoDelay(true);
        this.field1310 = this.field1302.getInputStream();
        this.field1313 = this.field1302.getOutputStream();
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)V", line = 275)
    public static final void method666(byte arg0) {
        field1322++;
        int var1 = -99 % ((-arg0 - 58) / 59);
        for (class312 var2 = (class312) class216.field3116.method2957(-113); var2 != null; var2 = (class312) class216.field3116.method2947(-85)) {
            class55 var3 = var2.field4843;
            if (class521.field7651 != var3.field7686 || class86.field1350 > var3.field756) {
                var2.method876((byte) -96);
                var3.method407(1020735655);
            } else if (class86.field1350 >= var3.field732) {
                if (var3.field728 > 0) {
                    class351 var4 = class88.field1375[var3.field728 - 1];
                    if (var4 != null && var4.field7681 >= 0 && (class50.field640 * 128) > var4.field7681 && var4.field7671 >= 0 && class448.field6611 * 128 > var4.field7671) {
                        var3.method404(class50.method373(var3.field7686, 14966, var4.field7671, var4.field7681) - var3.field726, var4.field7681, (byte) -47, class86.field1350, var4.field7671);
                    }
                }
                if (var3.field728 < 0) {
                    int var5 = -var3.field728 - 1;
                    class480 var6;
                    if (class449.field6615 == var5) {
                        var6 = class410.field6198;
                    } else {
                        var6 = field1327[var5];
                    }
                    if (var6 != null && var6.field7681 >= 0 && (class50.field640 * 128) > var6.field7681 && var6.field7671 >= 0 && var6.field7671 < (class448.field6611 * 128)) {
                        var3.method404(class50.method373(var3.field7686, 14966, var6.field7671, var6.field7681) - var3.field726, var6.field7681, (byte) -105, class86.field1350, var6.field7671);
                    }
                }
                var3.method406(125, class469.field6876);
                class89.method691(var3, true);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;II)Z", line = 337)
    public static final boolean method667(String arg0, int arg1, int arg2) {
        field1323++;
        if (class109.field1613 != 3) {
            class141.field2122 = new class210();
            class141.field2122.field3023 = arg2;
            class141.field2122.field3021 = arg0;
            if (class52.field674 != class149.field2269) {
                class141.field2122.field3026 = class141.field2122.field3023 + 40000;
                class141.field2122.field3025 = class141.field2122.field3023 + 50000;
            }
            return true;
        }
        String var3 = "";
        if (arg1 != 28637) {
            method670(null, -106);
        }
        if (class52.field674 != class149.field2269) {
            var3 = ":" + (arg2 + 7000);
        }
        String var4 = "";
        if (class339.field5232 != null) {
            var4 = "/p=" + class339.field5232;
        }
        String var5 = "http://" + arg0 + var3 + "/l=" + class30.field430 + "/a=" + class86.field1357 + var4 + "/j" + (class134.field2005 ? "1" : "0") + ",o" + (class197.field2893 ? "1" : "0") + ",a2";
        try {
            class197.field2894.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)I", line = 381)
    public final int method668(int arg0) throws IOException {
        field1315++;
        if (this.field1311) {
            return 0;
        } else if (arg0 >= -98) {
            return -88;
        } else {
            return this.field1310.available();
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(B)V", line = 398)
    public final void method669(byte arg0) {
        field1314++;
        if (arg0 <= 24 || this.field1311) {
            return;
        }
        synchronized (this) {
            this.field1311 = true;
            this.notifyAll();
        }
        if (this.field1329 != null) {
            while (this.field1329.field7848 == 0) {
                class389.method2332(113, 1L);
            }
            if (this.field1329.field7848 == 1) {
                try {
                    ((Thread) this.field1329.field7849).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1329 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Component;I)Ljv;", line = 440)
    public static final class483 method670(Component arg0, int arg1) {
        field1312++;
        if (arg1 != -25974) {
            field1330 = true;
        }
        return new class302(arg0);
    }
}
