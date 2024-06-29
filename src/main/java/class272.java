import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class272 implements Runnable {

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "Lcka;")
    private class515 field3854 = new class507();

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "Lcka;")
    private class515 field3870 = null;

    @OriginalMember(owner = "client!tea", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field3871 = new String[] { method2237(method2236("_:ROg\u0003")), method2237(method2236("_:ROc\u0003")), method2237(method2236("_:ROk\u0003")), method2237(method2236("_:ROe\u0003")), method2237(method2236("_:ROl\u0003")), method2237(method2236("E*_\r")), method2237(method2236("Pq\u001dO[")), method2237(method2236("_:ROo\u0003")), method2237(method2236("_:ROd\u0003")), method2237(method2236("_:RO`\u0003")), method2237(method2236("_:ROa\u0003")), method2237(method2236("_:ROj\u0003")), method2237(method2236("_:ROm\u0003")), method2237(method2236("_:ROn\u0003")), method2237(method2236("_:ROb\u0003")), method2237(method2236("\u000bwa\u0004ED)V\u0013COv\u0013")), method2237(method2236("_:ROT^1\u001b")) };

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "S")
    public static short field3857 = 256;

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "Lsb;")
    public static class261 field3849 = new class261(90, -2);

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!tea", name = "w", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!tea", name = "x", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!tea", name = "t", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!tea", name = "v", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!tea", name = "y", descriptor = "I")
    private int field3863;

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
    private int field3864;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "J")
    private long field3862;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "J")
    private long field3867;

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "Lsl;")
    private class746 field3865;

    @OriginalMember(owner = "client!tea", name = "A", descriptor = "Lur;")
    public static class85 field3853;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "Ljava/lang/String;")
    private String field3868;

    @OriginalMember(owner = "client!tea", name = "u", descriptor = "Z")
    private volatile boolean field3850;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "Z")
    private boolean field3859;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "[I")
    public static int[] field3866;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)I", line = 4)
    public final int method2223(boolean arg0) {
        try {
            field3852++;
            if (this.field3865 == null) {
                return 0;
            }
            int var2 = this.field3865.method5398(27577);
            if (this.field3865.field10583 && this.field3865.field10580 > this.field3864) {
                return this.field3864 + 1;
            } else if (var2 >= 0 && var2 < (class758.field10827.length - 1)) {
                if (arg0) {
                    field3849 = null;
                }
                return this.field3865.field10585 == this.field3864 ? this.field3865.field10580 : this.field3865.field10585;
            } else {
                return 100;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3871[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lcka;B)V", line = 32)
    public final synchronized void method2224(class515 arg0, byte arg1) {
        try {
            field3855++;
            this.field3870 = this.field3854;
            this.field3854 = arg0;
            this.field3867 = class614.method4531(-75);
            if (arg1 > -83) {
                this.method2227((byte) -46);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3871[4] + (arg0 == null ? field3871[5] : field3871[6]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljn;I)V", line = 54)
    public static final void method2225(class528 arg0, int arg1) {
        try {
            arg0.field7676 = false;
            field3844++;
            if (arg0.field7675 != null) {
                arg0.field7675.field8962 = 0;
            }
            if (arg1 > -111) {
                method2228(-96);
            }
            for (class528 var2 = arg0.method931(); var2 != null; var2 = arg0.method919()) {
                method2225(var2, -123);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3871[14] + (arg0 == null ? field3871[5] : field3871[6]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(I)Ljava/lang/String;", line = 75)
    public final String method2226(int arg0) {
        try {
            if (arg0 == 20) {
                field3858++;
                return this.field3868;
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3871[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)Z", line = 88)
    public final synchronized boolean method2227(byte arg0) {
        try {
            field3861++;
            int var2 = -38 / ((arg0 + 40) / 42);
            return this.field3854.method809(true, this.field3867);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3871[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)V", line = 98)
    public static void method2228(int arg0) {
        try {
            field3849 = null;
            field3866 = null;
            if (arg0 != 0) {
                field3849 = null;
            }
            field3853 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3871[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "(I)I", line = 110)
    public final int method2229(int arg0) {
        try {
            if (arg0 != -1324) {
                this.method2230(-6);
            }
            field3851++;
            return this.field3863;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3871[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "run", descriptor = "()V", line = 122)
    public final void run() {
        try {
            field3856++;
            while (!this.field3850) {
                long var1 = class614.method4531(-114);
                synchronized (this) {
                    try {
                        this.field3863++;
                        if (this.field3854 instanceof class507) {
                            this.field3854.method810((byte) -48, this.field3859);
                        } else {
                            long var4 = class614.method4531(-107);
                            if (class236.field3418 == null || this.field3870 == null || this.field3870.method805((byte) -126) == 0 || this.field3867 < var4 - (long) this.field3870.method805((byte) -101)) {
                                if (this.field3870 != null) {
                                    this.field3859 = true;
                                    this.field3870.method804(false);
                                    this.field3870 = null;
                                }
                                if (this.field3859) {
                                    class595.method4389(8976);
                                    if (class236.field3418 != null) {
                                        class236.field3418.method243(0);
                                    }
                                }
                                this.field3854.method810((byte) -71, this.field3859 || class236.field3418 != null && class236.field3418.method215());
                            } else {
                                int var6 = (int) ((var4 - this.field3867) * 255L / (long) this.field3870.method805((byte) -100));
                                int var7 = 255 - var6;
                                class595.method4389(8976);
                                int var8 = var6 << 24 | 0xFFFFFF;
                                int var9 = var7 << 24 | 0xFFFFFF;
                                class236.field3418.method243(0);
                                class392 var10 = class236.field3418.method222(class391.field5700, class711.field9998, true);
                                class236.field3418.method162(var10, 1);
                                this.field3870.method810((byte) -81, true);
                                class236.field3418.method234();
                                var10.method874(0, 0, 0, var9, 1);
                                class236.field3418.method162(var10, 1);
                                class236.field3418.method243(0);
                                this.field3854.method810((byte) -68, true);
                                class236.field3418.method234();
                                var10.method874(0, 0, 0, var8, 1);
                            }
                            try {
                                if (class236.field3418 != null && !(this.field3854 instanceof class507)) {
                                    class236.field3418.method131((byte) 87);
                                }
                            } catch (class142 var19) {
                                class162.method1374(var19, var19.getMessage() + field3871[15] + class572.field8287.method4953(-83), (byte) -93);
                                class279.method2271(7, true, 0);
                            }
                        }
                        Container var12;
                        if (class543.field7942 != null) {
                            var12 = class543.field7942;
                        } else if (class290.field4091 == null) {
                            var12 = class743.field10561;
                        } else {
                            var12 = class290.field4091;
                        }
                        var12.getSize();
                        var12.getSize();
                        if (class543.field7942 == var12) {
                            class543.field7942.getInsets();
                        }
                        this.field3859 = false;
                        if (class236.field3418 != null && !(this.field3854 instanceof class507) && this.field3865.method5398(27577) < class746.field10605.method5398(27577)) {
                            class169.method1422((byte) 74);
                        }
                    } catch (Exception var20) {
                        continue;
                    }
                }
                long var13 = class614.method4531(-127);
                int var15 = (int) (var1 + 20L - var13);
                if (var15 > 0) {
                    class449.method3474(20817, (long) var15);
                }
            }
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field3871[16] + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V", line = 249)
    public final synchronized void method2230(int arg0) {
        try {
            this.field3859 = true;
            field3847++;
            if (arg0 != 1) {
                this.method2224(null, (byte) -128);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3871[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "(I)J", line = 263)
    public final long method2231(int arg0) {
        try {
            field3869++;
            if (arg0 != 0) {
                this.field3859 = true;
            }
            return this.field3862;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3871[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "(I)I", line = 279)
    public final int method2232(int arg0) {
        try {
            field3860++;
            int var2 = -30 % ((40 - arg0) / 33);
            return this.field3864;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3871[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(B)V", line = 291)
    public final void method2233(byte arg0) {
        try {
            this.field3850 = true;
            field3848++;
            if (arg0 != -2) {
                this.field3868 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3871[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)Lsl;", line = 303)
    public final class746 method2234(byte arg0) {
        try {
            if (arg0 > -106) {
                this.method2234((byte) 0);
            }
            field3845++;
            return this.field3865;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3871[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(BLsl;IJLjava/lang/String;)V", line = 314)
    public final synchronized void method2235(byte arg0, class746 arg1, int arg2, long arg3, String arg4) {
        try {
            field3846++;
            this.field3865 = arg1;
            if (arg0 > 48) {
                this.field3868 = arg4;
                this.field3864 = arg2;
                this.field3862 = arg3;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3871[11] + arg0 + ',' + (arg1 == null ? field3871[5] : field3871[6]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field3871[5] : field3871[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2236(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2237(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 43;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
