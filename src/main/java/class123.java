import jaggl.OpenGL;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class123 implements Runnable {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Ldh;")
    public static class320 field1287 = new class320(65, 1);

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "[I")
    public static int[] field1300 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Lof;")
    public static class620 field1291 = new class620(128, 4);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "Lsb;")
    private class290 field1298;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field1297;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Z")
    private volatile boolean field1288;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "[Luaa;")
    private class116[] field1289;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB)Ljava/lang/String;", line = 4)
    public static final String method787(int arg0, int arg1, byte arg2) {
        field1295++;
        if (arg2 >= -93) {
            field1287 = null;
        }
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)Luaa;", line = 50)
    public final class116 method788(boolean arg0, int arg1) {
        field1294++;
        if (!arg0) {
            field1287 = null;
        }
        return this.field1289 == null || arg1 < 0 || arg1 >= this.field1289.length ? null : this.field1289[arg1];
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILai;[BI)Let;", line = 68)
    public static final class592 method789(int arg0, class597 arg1, byte[] arg2, int arg3) {
        field1293++;
        if (arg2 == null || arg2.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceRawARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class100.field1042, 0);
        int var6 = -18 / ((-arg3 - 69) / 56);
        if (class100.field1042[0] == 0) {
            if (class100.field1042[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class100.field1042, 1);
            if (class100.field1042[1] > 1) {
                byte[] var7 = new byte[class100.field1042[1]];
                OpenGL.glGetInfoLogARB(var4, class100.field1042[1], class100.field1042, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class100.field1042[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class592(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!gm", name = "run", descriptor = "()V", line = 114)
    public final void run() {
        field1302++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field1298.field3577));
            String var2 = var1.readLine();
            class619 var3 = class447.method2766(true);
            while (var2 != null) {
                var3.method3534(var2, false);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3536(-10512);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field1289 = new class116[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field1289[var5 / 3] = new class116(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field1288 = true;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z", line = 155)
    public static final boolean method790(int arg0) {
        field1286++;
        if (arg0 != 0) {
            method794((byte) -54, 117);
        }
        try {
            return class756.method4203(0);
        } catch (IOException var4) {
            class94.method633(arg0 ^ 0xFFFFFF8C);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class691.field9738 == null ? -1 : class691.field9738.method1911(false)) + "," + (class668.field9500 == null ? -1 : class668.field9500.method1911(false)) + "," + (class97.field1022 == null ? -1 : class97.field1022.method1911(false)) + " - " + class741.field10364 + "," + (class90.field937.field7187[0] + class464.field6624) + "," + (class90.field937.field7193[0] + class181.field2144) + " - ";
            for (int var3 = 0; var3 < class741.field10364 && var3 < 50; var3++) {
                var2 = var2 + class248.field3008.field2912[var3] + ",";
            }
            class151.method936(var2, var5, 87);
            class7.method25(false, (byte) 94);
            return true;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjava/lang/String;)I", line = 189)
    public static final int method791(int arg0, String arg1) {
        field1292++;
        if (!class70.field742.field7851) {
            return -1;
        } else if (class326.field4234.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class144.method898(arg1, 0);
            if (var2 == null) {
                return -1;
            }
            String var3 = class211.field2486 + var2;
            if (!class519.field7383.method2462(var3, "", arg0 - 101)) {
                return -1;
            } else if (class519.field7383.method2466(var3, arg0 ^ 0xFFFFFFEF)) {
                byte[] var4 = class519.field7383.method2471((byte) -77, var3, "");
                if (arg0 != 100) {
                    method790(-49);
                }
                Object var5 = null;
                File var6;
                try {
                    var6 = class580.method3342(var2, arg0 - 84);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class105.method722(var6, 111);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class70.field742.method3199(-111, var6, var4);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class79.method559((byte) 125, arg1, var6);
                return 100;
            } else {
                return class519.field7383.method2476(false, var3);
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)Z", line = 285)
    public final boolean method792(int arg0) {
        field1301++;
        if (this.field1288) {
            return true;
        }
        if (this.field1298 == null) {
            try {
                int var2 = class342.field4425 == class237.field2829 ? 80 : class593.field8383.field6435 + 7000;
                this.field1298 = class289.field3549.method3204(new URL("http://" + class593.field8383.field6430 + ":" + var2 + "/news.ws?game=" + class99.field1034.field3752), -18528);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (arg0 != 80) {
            this.field1289 = null;
        }
        if (this.field1298 == null || this.field1298.field3573 == 2) {
            return true;
        } else if (this.field1298.field3573 == 1) {
            if (this.field1297 == null) {
                this.field1297 = new Thread(this);
                this.field1297.start();
            }
            return this.field1288;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V", line = 331)
    public static void method793(boolean arg0) {
        field1291 = null;
        field1287 = null;
        field1300 = null;
        if (arg0) {
            field1290 = -33;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V", line = 347)
    public static final void method794(byte arg0, int arg1) {
        class430.field6248.method3539((byte) 121, arg1);
        field1296++;
        if (arg0 != 85) {
            field1290 = 70;
        }
    }
}
