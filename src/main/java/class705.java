import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class705 implements Runnable {

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10125 = new String[] { method5130(method5129("\u0010Dv\u0005\"")), method5130(method5129("\u0018S4(")), method5130(method5129("\u0010Dv\u0000\"")), method5130(method5129("\r\bvjw")), method5130(method5129("\u0010Dv\u0001\"")), method5130(method5129("YH=3yXQ+{m\u0017K=y")), method5130(method5129("\u001eR,40Y\t")), method5130(method5129("\u0010Dv\u0006\"")), method5130(method5129("\u0010Dv\u0007\"")), method5130(method5129("\u0010Dv6\u007f\u0018\u000e")) };

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field10118 = 0;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Z")
    public static boolean field10122 = false;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field10113;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field10114;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field10115;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field10119;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field10120;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Luga;")
    private class218 field10123;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field10124;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Z")
    private volatile boolean field10117;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "[Liw;")
    private class333[] field10121;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([FII)[F", line = 3)
    public static final float[] method5124(float[] arg0, int arg1, int arg2) {
        try {
            field10116++;
            float[] var3 = new float[arg1];
            class405.method3258(arg0, arg2, var3, 0, arg1);
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10125[2] + (arg0 == null ? field10125[1] : field10125[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[BIBII)Z", line = 15)
    public static final boolean method5125(int arg0, byte[] arg1, int arg2, byte arg3, int arg4, int arg5) {
        try {
            field10113++;
            int var6 = -113 % ((arg3 - 29) / 54);
            boolean var7 = true;
            class176 var8 = new class176(arg1);
            int var9 = -1;
            label85: while (true) {
                int var10 = var8.method1649((byte) 82);
                if (var10 == 0) {
                    return var7;
                }
                var9 += var10;
                int var11 = 0;
                boolean var12 = false;
                while (true) {
                    int var16;
                    class362 var19;
                    do {
                        int var17;
                        int var18;
                        do {
                            do {
                                do {
                                    do {
                                        while (var12) {
                                            int var20 = var8.method1660(false);
                                            if (var20 == 0) {
                                                continue label85;
                                            }
                                            var8.method1645((byte) -88);
                                        }
                                        int var13 = var8.method1660(false);
                                        if (var13 == 0) {
                                            continue label85;
                                        }
                                        var11 += var13 - 1;
                                        int var14 = var11 & 0x3F;
                                        int var15 = (var11 & 0xFC9) >> 6;
                                        var16 = var8.method1645((byte) -76) >> 2;
                                        var17 = arg0 + var15;
                                        var18 = var14 + arg4;
                                    } while (var17 <= 0);
                                } while (var18 <= 0);
                            } while (arg5 - 1 <= var17);
                        } while (var18 >= arg2 - 1);
                        var19 = class370.field5999.method4002(116, var9);
                    } while (var16 == 22 && class623.field8996.field6371.method3911(true) == 0 && var19.field5843 == 0 && var19.field5916 != 1 && !var19.field5910);
                    if (!var19.method3000((byte) 92)) {
                        class140.field1957++;
                        var7 = false;
                    }
                    var12 = true;
                }
            }
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field10125[8] + arg0 + ',' + (arg1 == null ? field10125[1] : field10125[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILpea;II)V", line = 103)
    public static final void method5126(int arg0, class758 arg1, int arg2, int arg3) {
        try {
            field10112++;
            class603.field8714[arg3][arg2] = arg1;
            if (arg0 != -5327) {
                field10118 = 99;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10125[4] + arg0 + ',' + (arg1 == null ? field10125[1] : field10125[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z", line = 125)
    public final boolean method5127(int arg0) {
        try {
            field10120++;
            if (this.field10117) {
                return true;
            }
            if (this.field10123 == null) {
                try {
                    int var2 = class710.field10281 == class417.field6596 ? 80 : class13.field156.field7676 + 7000;
                    this.field10123 = class393.field6256.method638(30975, new URL(field10125[6] + class13.field156.field7671 + ":" + var2 + field10125[5] + class305.field4924.field8482));
                } catch (MalformedURLException var4) {
                    return true;
                }
            }
            if (this.field10123 == null || this.field10123.field3402 == 2) {
                return true;
            } else if (this.field10123.field3402 == 1) {
                if (arg0 != 30191) {
                    field10118 = 39;
                }
                if (this.field10124 == null) {
                    this.field10124 = new Thread(this);
                    this.field10124.start();
                }
                return this.field10117;
            } else {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10125[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "run", descriptor = "()V", line = 169)
    public final void run() {
        try {
            field10115++;
            try {
                BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field10123.field3407));
                String var2 = var1.readLine();
                class324 var3 = class654.method4770((byte) 102);
                while (var2 != null) {
                    var3.method2749((byte) -43, var2);
                    var2 = var1.readLine();
                }
                String[] var4 = var3.method2750(-123);
                if (var4.length % 3 != 0) {
                    return;
                }
                this.field10121 = new class333[var4.length / 3];
                for (int var5 = 0; var5 < var4.length; var5 += 3) {
                    this.field10121[var5 / 3] = new class333(var4[var5], var4[var5 + 1], var4[var5 + 2]);
                }
            } catch (IOException var7) {
            }
            this.field10117 = true;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10125[9] + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)Liw;", line = 212)
    public final class333 method5128(byte arg0, int arg1) {
        try {
            if (arg0 == -99) {
                field10119++;
                return this.field10121 == null || arg1 < 0 || arg1 >= this.field10121.length ? null : this.field10121[arg1];
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10125[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5129(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xA);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5130(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
