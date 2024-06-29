import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class79 implements Runnable {

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1117 = new String[] { method792(method791("K\nA\u001fJVP")), method792(method791("K\nA(\u0017")), method792(method791("CVACB")), method792(method791("K\nA,\u0017")), method792(method791("V\r\u0003\u0001")), method792(method791("P\f\u001b\u001d\u0005\u0017W")), method792(method791("K\nA)\u0017")), method792(method791("\u0017\u0016\n\u001aL\u0016\u000f\u001cRXY\u0015\nP")), method792(method791("K\nA/\u0017")), method792(method791("K\nA.\u0017")) };

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "Lvn;")
    private class328 field1115;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field1107;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "Z")
    private volatile boolean field1108;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "[Lln;")
    private class720[] field1110;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IBZ)V", line = 5)
    public static final void method786(String arg0, String arg1, int arg2, byte arg3, boolean arg4) {
        try {
            if (arg3 != -33) {
                method786(null, null, -117, (byte) 110, true);
            }
            class751.method5437((byte) -24, arg4, true, arg0, arg2, arg1, -1);
            field1114++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1117[3] + (arg0 == null ? field1117[4] : field1117[2]) + ',' + (arg1 == null ? field1117[4] : field1117[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)Lln;", line = 16)
    public final class720 method787(byte arg0, int arg1) {
        try {
            field1112++;
            int var3 = -25 / ((arg0 + 35) / 54);
            return this.field1110 == null || arg1 < 0 || arg1 >= this.field1110.length ? null : this.field1110[arg1];
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1117[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Z", line = 36)
    public final boolean method788(byte arg0) {
        try {
            field1111++;
            if (this.field1108) {
                return true;
            }
            if (this.field1115 == null) {
                try {
                    int var2 = class398.field5793 == class35.field426 ? 80 : class405.field5878.field11524 + 7000;
                    this.field1115 = class651.field9249.method1575(109, new URL(field1117[5] + class405.field5878.field11516 + ":" + var2 + field1117[7] + class544.field7978.field11572));
                } catch (MalformedURLException var4) {
                    return true;
                }
            }
            if (this.field1115 == null || this.field1115.field4486 == 2) {
                return true;
            } else if (this.field1115.field4486 == 1) {
                if (this.field1107 == null) {
                    this.field1107 = new Thread(this);
                    this.field1107.start();
                }
                if (arg0 != 127) {
                    this.method787((byte) -90, -97);
                }
                return this.field1108;
            } else {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1117[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "run", descriptor = "()V", line = 77)
    public final void run() {
        try {
            field1113++;
            try {
                BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field1115.field4487));
                String var2 = var1.readLine();
                class776 var3 = class323.method2558(1);
                while (var2 != null) {
                    var3.method5590((byte) 123, var2);
                    var2 = var1.readLine();
                }
                String[] var4 = var3.method5588(0);
                if (var4.length % 3 != 0) {
                    return;
                }
                this.field1110 = new class720[var4.length / 3];
                for (int var5 = 0; var5 < var4.length; var5 += 3) {
                    this.field1110[var5 / 3] = new class720(var4[var5], var4[var5 + 1], var4[var5 + 2]);
                }
            } catch (IOException var7) {
            }
            this.field1108 = true;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field1117[0] + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Z", line = 124)
    public static final boolean method789(int arg0, int arg1, int arg2) {
        try {
            field1116++;
            if (arg1 != 579) {
                method786(null, null, -12, (byte) -26, true);
            }
            return (arg0 & 0x10000) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1117[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[FIIIBIIFF[FI)V", line = 136)
    public static final void method790(int arg0, float[] arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, float arg8, float arg9, float[] arg10, int arg11) {
        try {
            int var23 = arg7 - arg2;
            int var21 = arg4 - arg11;
            field1109++;
            int var22 = arg6 - arg3;
            float var12 = arg10[2] * (float) var22 + arg10[0] * (float) var21 + arg10[1] * (float) var23;
            float var13 = arg10[5] * (float) var22 + arg10[3] * (float) var21 + arg10[4] * (float) var23;
            float var14 = arg10[8] * (float) var22 + arg10[7] * (float) var23 + arg10[6] * (float) var21;
            float var15 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
            if (arg9 != 1.0F) {
                var15 = arg9 * var15;
            }
            float var16 = var13 + arg8 + 0.5F;
            if (arg0 == 1) {
                float var18 = var15;
                var15 = -var16;
                var16 = var18;
            } else if (arg0 == 2) {
                var16 = -var16;
                var15 = -var15;
            } else if (arg0 == 3) {
                float var17 = var15;
                var15 = var16;
                var16 = -var17;
            }
            arg1[0] = var15;
            arg1[1] = var16;
            if (arg5 != 123) {
                method786(null, null, 26, (byte) -40, false);
            }
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field1117[9] + arg0 + ',' + (arg1 == null ? field1117[4] : field1117[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field1117[4] : field1117[2]) + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method791(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method792(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
