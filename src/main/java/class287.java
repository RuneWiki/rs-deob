import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class287 implements Runnable {

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lgq;")
    private class540 field4271 = new class540();

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Z")
    private boolean field4274 = false;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public int field4275 = 0;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field4273;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4276 = new String[] { method2338(method2337("\u0019F\u0019_")), method2338(method2337("\f\u001d[\u001dp")), method2338(method2337("\u0000W[\u000fd\u0019Z\u0001\r%")), method2338(method2337("\u0000W[{%")), method2338(method2337("\u0000W[q%")), method2338(method2337("\u0000W[u%")), method2338(method2337("\u0000W[r%")), method2338(method2337("\u0000W[w%")), method2338(method2337("\u0000W[v%")), method2338(method2337("\u0000W[p%")), method2338(method2337("\u0000W[t%")), method2338(method2337("\u0000W[Ax\u0019\u001b")) };

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field4267 = 0;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "F")
    public static float field4272;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZ)I")
    public static final int method2329(int arg0, int arg1, boolean arg2) {
        try {
            field4261++;
            if (arg2) {
                return 0;
            } else if (arg1 <= 30) {
                return -26;
            } else {
                class495 var3 = class668.method4916(arg0, arg2, 3);
                if (var3 == null) {
                    return class152.field1880.method1277(arg0, 221).field3442;
                }
                int var4 = 0;
                for (int var5 = 0; var5 < var3.field7103.length; var5++) {
                    if (var3.field7103[var5] == -1) {
                        var4++;
                    }
                }
                return var4 + (class152.field1880.method1277(arg0, 221).field3442 - var3.field7103.length);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4276[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static final void method2330(int arg0) {
        try {
            if (class396.field5930 <= 1) {
                class289.field4305.method655(17, 2, class289.field4305.field830);
            } else {
                class289.field4305.method655(17, 4, class289.field4305.field830);
            }
            if (arg0 != 4) {
                method2329(108, 127, false);
            }
            field4268++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4276[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "run", descriptor = "()V")
    public final void run() {
        try {
            field4264++;
            while (!this.field4274) {
                class540 var1 = this.field4271;
                class683 var2;
                synchronized (this.field4271) {
                    var2 = (class683) this.field4271.method4064(-21877);
                    if (var2 == null) {
                        try {
                            this.field4271.wait();
                        } catch (InterruptedException var8) {
                        }
                        continue;
                    }
                    this.field4275--;
                }
                try {
                    if (var2.field9898 == 2) {
                        var2.field9903.method3200(var2.field9901, (int) var2.field533, -17144, var2.field9901.length);
                    } else if (var2.field9898 == 3) {
                        var2.field9901 = var2.field9903.method3202(6, (int) var2.field533);
                    }
                } catch (Exception var7) {
                    class618.method4603((byte) -79, null, var7);
                }
                var2.field8473 = false;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field4276[11] + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public final void method2331(byte arg0) {
        try {
            field4270++;
            this.field4274 = true;
            class540 var2 = this.field4271;
            synchronized (this.field4271) {
                if (arg0 != -74) {
                    this.field4271 = null;
                }
                this.field4271.notifyAll();
            }
            try {
                this.field4273.join();
            } catch (InterruptedException var4) {
            }
            this.field4273 = null;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4276[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lqp;I)V")
    private final void method2332(class683 arg0, int arg1) {
        try {
            if (arg1 != 0) {
                this.method2336(-93, null, 126);
            }
            field4263++;
            class540 var3 = this.field4271;
            synchronized (this.field4271) {
                this.field4271.method4067((byte) 44, arg0);
                this.field4275++;
                this.field4271.notifyAll();
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4276[4] + (arg0 == null ? field4276[0] : field4276[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Llp;IB[B)Lqp;")
    public final class683 method2333(class411 arg0, int arg1, byte arg2, byte[] arg3) {
        try {
            int var5 = -75 % ((-arg2 - 65) / 48);
            field4265++;
            class683 var6 = new class683();
            var6.field8479 = false;
            var6.field9901 = arg3;
            var6.field9903 = arg0;
            var6.field533 = arg1;
            var6.field9898 = 2;
            this.method2332(var6, 0);
            return var6;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4276[8] + (arg0 == null ? field4276[0] : field4276[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field4276[0] : field4276[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBILpda;)V")
    public static final void method2334(int arg0, byte arg1, int arg2, class655 arg3) {
        try {
            field4269++;
            if (class216.field3297) {
                int var4 = 0;
                for (class417 var5 = (class417) arg3.field9457.method4068(false); var5 != null; var5 = (class417) arg3.field9457.method4072(-109)) {
                    int var6 = class706.method5160(var5, (byte) -86);
                    if (var6 > var4) {
                        var4 = var6;
                    }
                }
                int var7 = 19 % ((74 - arg1) / 35);
                var4 += 8;
                int var8 = arg3.field9459 * 16 + 21;
                class259.field3999 = arg3.field9459 * 16 + (class369.field5631 ? 26 : 22);
                int var9 = class476.field6905 + class371.field5655;
                if (var9 + var4 > class179.field2489) {
                    var9 = class476.field6905 - var4;
                }
                if (var9 < 0) {
                    var9 = 0;
                }
                int var10 = class369.field5631 ? 33 : 31;
                int var11 = arg0 + 13 - var10;
                if ((var8 + var11) > class94.field1062) {
                    var11 = class94.field1062 - var8;
                }
                class348.field5390 = var9;
                if (var11 < 0) {
                    var11 = 0;
                }
                class80.field903 = var11;
                class381.field5783 = arg3;
                class662.field9570 = var4;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field4276[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field4276[0] : field4276[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Llp;II)Lqp;")
    public final class683 method2335(class411 arg0, int arg1, int arg2) {
        try {
            field4266++;
            class683 var4 = new class683();
            if (arg2 != 0) {
                field4272 = 0.90093875F;
            }
            var4.field9898 = 1;
            class540 var5 = this.field4271;
            synchronized (this.field4271) {
                class683 var6 = (class683) this.field4271.method4068(false);
                while (true) {
                    if (var6 == null) {
                        break;
                    }
                    if ((long) arg1 == var6.field533 && var6.field9903 == arg0 && var6.field9898 == 2) {
                        var4.field9901 = var6.field9901;
                        var4.field8473 = false;
                        return var4;
                    }
                    var6 = (class683) this.field4271.method4072(arg2 - 84);
                }
            }
            var4.field9901 = arg0.method3202(6, arg1);
            var4.field8479 = true;
            var4.field8473 = false;
            return var4;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field4276[5] + (arg0 == null ? field4276[0] : field4276[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILlp;I)Lqp;")
    public final class683 method2336(int arg0, class411 arg1, int arg2) {
        try {
            field4262++;
            class683 var4 = new class683();
            var4.field8479 = false;
            var4.field9898 = 3;
            var4.field9903 = arg1;
            if (arg0 != 3) {
                field4267 = 5;
            }
            var4.field533 = arg2;
            this.method2332(var4, 0);
            return var4;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4276[6] + arg0 + ',' + (arg1 == null ? field4276[0] : field4276[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lmca;)V")
    public class287(class33 arg0) {
        try {
            class42 var2 = arg0.method227(false, this, 5);
            while (var2.field503 == 0) {
                class151.method1269(false, 10L);
            }
            if (var2.field503 == 2) {
                throw new RuntimeException();
            }
            this.field4273 = (Thread) var2.field499;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4276[2] + (arg0 == null ? field4276[0] : field4276[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2337(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2338(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
