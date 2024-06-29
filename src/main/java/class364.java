import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class364 implements Runnable {

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Lufa;")
    public static class740 field5326 = new class740(13, 4);

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Lla;")
    public static class423 field5328;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Lsca;")
    private class432 field5315;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field5321;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
    private volatile boolean field5322;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "[Lmu;")
    private class216[] field5324;

    @OriginalMember(owner = "client!ul", name = "run", descriptor = "()V", line = 6)
    public final void run() {
        field5318++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field5315.field6200));
            String var2 = var1.readLine();
            class757 var3 = class601.method3506(-86);
            while (var2 != null) {
                var3.method4211((byte) 32, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method4206(false);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field5324 = new class216[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field5324[var5 / 3] = new class216(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field5322 = true;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V", line = 48)
    public static final void method2288(int arg0, int arg1) {
        class192.field2820 = new int[arg0];
        class726.field10208 = new int[arg0];
        class738.field10308 = new int[arg0];
        class721.field10155 = new int[arg0];
        class403.field5757 = new int[arg0];
        if (arg1 < -34) {
            field5317++;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 65)
    public static void method2289(byte arg0) {
        if (arg0 < 101) {
            method2294((byte) 114, -0.2541971F, 98, -0.28299838F, 2.8116834F);
        }
        field5328 = null;
        field5326 = null;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)Lmu;", line = 77)
    public final class216 method2290(int arg0, int arg1) {
        if (arg1 == 16383) {
            field5319++;
            return this.field5324 == null || arg0 < 0 || this.field5324.length <= arg0 ? null : this.field5324[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIILcs;)V", line = 91)
    public static final void method2291(int arg0, int arg1, int arg2, int arg3, class335 arg4) {
        field5325++;
        class83 var5 = arg4.method2052(-5569);
        int var6 = -12 % ((27 - arg0) / 40);
        int var7 = arg4.field4538 - arg4.field4598.field4729 & 0x3FFF;
        if (arg1 == -1) {
            if (var7 != 0 || arg4.field4606 > 25) {
                if (arg3 < 0 && var5.field1189 != -1) {
                    arg4.field4595 = false;
                    arg4.field4575 = var5.field1189;
                } else if (arg3 <= 0 || var5.field1238 == -1) {
                    arg4.field4575 = var5.field1199;
                } else {
                    arg4.field4575 = var5.field1238;
                }
                arg4.field4595 = false;
            } else if (!arg4.field4595 || !var5.method672(arg4.field4575, 0)) {
                arg4.field4575 = var5.method669((byte) -87);
                arg4.field4595 = arg4.field4575 != -1;
            }
        } else if (arg4.field4576 != -1 && (var7 >= 10240 || var7 <= 2048)) {
            int var8 = class193.field2836[arg2] - arg4.field4598.field4729 & 0x3FFF;
            if (arg1 == 2 && var5.field1228 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var5.field1227 != -1) {
                    arg4.field4575 = var5.field1227;
                } else if (var8 >= 10240 && var8 < 14336 && var5.field1222 != -1) {
                    arg4.field4575 = var5.field1222;
                } else if (var8 <= 6144 || var8 >= 10240 || var5.field1235 == -1) {
                    arg4.field4575 = var5.field1228;
                } else {
                    arg4.field4575 = var5.field1235;
                }
            } else if (arg1 == 0 && var5.field1206 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var5.field1223 != -1) {
                    arg4.field4575 = var5.field1223;
                } else if (var8 >= 10240 && var8 < 14336 && var5.field1226 != -1) {
                    arg4.field4575 = var5.field1226;
                } else if (var8 <= 6144 || var8 >= 10240 || var5.field1205 == -1) {
                    arg4.field4575 = var5.field1206;
                } else {
                    arg4.field4575 = var5.field1205;
                }
            } else if (var8 > 2048 && var8 <= 6144 && var5.field1191 != -1) {
                arg4.field4575 = var5.field1191;
            } else if (var8 >= 10240 && var8 < 14336 && var5.field1224 != -1) {
                arg4.field4575 = var5.field1224;
            } else if (var8 <= 6144 || var8 >= 10240 || var5.field1234 == -1) {
                arg4.field4575 = var5.field1199;
            } else {
                arg4.field4575 = var5.field1234;
            }
            arg4.field4595 = false;
        } else if (var7 == 0 && arg4.field4606 <= 25) {
            if (arg1 == 2 && var5.field1228 != -1) {
                arg4.field4575 = var5.field1228;
            } else if (arg1 == 0 && var5.field1206 != -1) {
                arg4.field4575 = var5.field1206;
            } else {
                arg4.field4575 = var5.field1199;
            }
            arg4.field4595 = false;
        } else {
            if (arg1 == 2 && var5.field1228 != -1) {
                if (arg3 < 0 && var5.field1204 != -1) {
                    arg4.field4575 = var5.field1204;
                } else if (arg3 <= 0 || var5.field1193 == -1) {
                    arg4.field4575 = var5.field1228;
                } else {
                    arg4.field4575 = var5.field1193;
                }
            } else if (arg1 == 0 && var5.field1206 != -1) {
                if (arg3 < 0 && var5.field1203 != -1) {
                    arg4.field4575 = var5.field1203;
                } else if (arg3 <= 0 || var5.field1233 == -1) {
                    arg4.field4575 = var5.field1206;
                } else {
                    arg4.field4575 = var5.field1233;
                }
            } else if (arg3 < 0 && var5.field1236 != -1) {
                arg4.field4575 = var5.field1236;
            } else if (arg3 <= 0 || var5.field1192 == -1) {
                arg4.field4575 = var5.field1199;
            } else {
                arg4.field4575 = var5.field1192;
            }
            arg4.field4595 = false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Z", line = 259)
    public final boolean method2292(int arg0) {
        field5320++;
        if (this.field5322) {
            return true;
        }
        if (arg0 != -21299) {
            field5328 = null;
        }
        if (this.field5315 == null) {
            try {
                int var2 = class536.field7793 == class25.field223 ? 80 : class342.field4706.field7472 + 7000;
                this.field5315 = class345.field4749.method1871(-17071, new URL("http://" + class342.field4706.field7468 + ":" + var2 + "/news.ws?game=" + class528.field7683.field4258));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field5315 == null || this.field5315.field6198 == 2) {
            return true;
        } else if (this.field5315.field6198 == 1) {
            if (this.field5321 == null) {
                this.field5321 = new Thread(this);
                this.field5321.start();
            }
            return this.field5322;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 304)
    public static final void method2293(int arg0) {
        field5323++;
        class215[] var1 = class308.field4178;
        synchronized (class308.field4178) {
            for (int var2 = 0; var2 < class308.field4178.length; var2++) {
                class308.field4178[var2] = new class215();
                class372.field5405[var2] = 0;
            }
            if (arg0 >= -68) {
                method2293(-100);
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BFIFF)F", line = 326)
    public static final float method2294(byte arg0, float arg1, int arg2, float arg3, float arg4) {
        field5316++;
        if (arg0 != -16) {
            field5327 = 70;
        }
        float[] var5 = class449.field6434[arg2];
        return var5[2] * arg3 + var5[0] * arg4 + var5[1] * arg1;
    }
}
