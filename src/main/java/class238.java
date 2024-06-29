import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class238 implements Runnable {

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Lhh;")
    private class177 field4151 = new class177();

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public int field4161 = 0;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Z")
    private boolean field4167 = false;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field4162;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field4150 = 0;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lvf;")
    public static class265 field4156 = class87.method582(-46, "<col=ffffff>");

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Z")
    public static boolean field4163 = false;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field4166 = 0;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lvf;")
    private static class265 field4154 = class87.method582(-46, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Lvf;")
    public static class265 field4160 = field4154;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "Lvf;")
    private static class265 field4168 = class87.method582(-46, "glow1:");

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lvf;")
    public static class265 field4152 = field4168;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lvf;")
    public static class265 field4158 = field4168;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lel;")
    public static class100 field4145;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Laa;")
    public static final class8 method1585(int arg0, int arg1, int arg2) {
        class137 var3 = class200.field3577[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class8 var4 = var3.field2501;
            var3.field2501 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Li;BI)Lbf;")
    public final class283 method1586(class182 arg0, byte arg1, int arg2) {
        field4164++;
        if (arg1 != -91) {
            field4158 = null;
        }
        class283 var4 = new class283();
        var4.field727 = (long) arg2;
        var4.field4983 = arg0;
        var4.field4981 = 3;
        var4.field1314 = false;
        this.method1595(false, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([BZI)I")
    public static final int method1587(byte[] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field4163 = true;
        }
        field4146++;
        return class170.method1126(arg0, 0, -62, arg2);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II[BLi;)Lbf;")
    public final class283 method1588(int arg0, int arg1, byte[] arg2, class182 arg3) {
        field4159++;
        class283 var5 = new class283();
        var5.field4982 = arg2;
        var5.field4983 = arg3;
        var5.field727 = (long) arg0;
        var5.field4981 = 2;
        var5.field1314 = false;
        this.method1595(false, var5);
        if (arg1 > -121) {
            field4160 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lti;")
    public static final class189 method1589(int arg0, int arg1) {
        class189 var2 = (class189) class1.field24.method1887(127, (long) arg1);
        field4149++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field2644.method1332(true, arg1, 16);
        if (arg0 != -8318) {
            return null;
        }
        class189 var4 = new class189();
        if (var3 != null) {
            var4.method1289((byte) -36, new class135(var3));
        }
        class1.field24.method1892(var4, (long) arg1, (byte) 24);
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILng;)V")
    public static final void method1590(int arg0, class135 arg1) {
        field4155++;
        while (true) {
            while (arg1.field2449 < arg1.field2483.length) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg1.method920((byte) 64) == 1) {
                    var2 = arg1.method920((byte) 63);
                    var4 = true;
                    var3 = arg1.method920((byte) 30);
                }
                int var5 = arg1.method920((byte) 96);
                int var6 = arg1.method920((byte) 85);
                int var7 = var5 * 64 - class269.field4796;
                int var8 = class155.field2871 + class176.field3141 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && (var7 + 63) < class213.field3824 && var8 < class155.field2871) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var4 || (var2 * 8) <= var11 && var11 < (var2 * 8 + 8) && var12 >= var3 * 8 && var12 < (var3 * 8 + 8)) {
                                byte var13 = arg1.method929((byte) -3);
                                if (var13 != 0) {
                                    if (class182.field3245[var9][var10] == null) {
                                        class182.field3245[var9][var10] = new byte[4096];
                                    }
                                    class182.field3245[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method929((byte) -3);
                                    if (class18.field493[var9][var10] == null) {
                                        class18.field493[var9][var10] = new byte[4096];
                                    }
                                    class18.field493[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var4 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method929((byte) -3);
                        if (var16 != 0) {
                            arg1.field2449++;
                        }
                    }
                }
            }
            if (arg0 != 8686) {
                method1593(27);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public final void method1591(boolean arg0) {
        this.field4167 = arg0;
        class177 var2 = this.field4151;
        synchronized (this.field4151) {
            this.field4151.notifyAll();
        }
        field4157++;
        try {
            this.field4162.join();
        } catch (InterruptedException var3) {
        }
        this.field4162 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)I")
    public static final int method1592(int arg0, byte arg1) {
        field4147++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 & 0xFF) / 256.0D;
        double var6 = var2;
        double var8 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (var2 > var8) {
            var6 = var8;
        }
        if (var6 > var4) {
            var6 = var4;
        }
        double var10 = var2;
        int var12 = -85 / ((arg1 - 38) / 59);
        if (var8 > var2) {
            var10 = var8;
        }
        if (var10 < var4) {
            var10 = var4;
        }
        double var13 = 0.0D;
        double var15 = (var6 + var10) / 2.0D;
        double var17 = 0.0D;
        if (var6 != var10) {
            if (var15 < 0.5D) {
                var13 = (var10 - var6) / (var6 + var10);
            }
            if (var15 >= 0.5D) {
                var13 = (var10 - var6) / (2.0D - var10 - var6);
            }
            if (var2 == var10) {
                var17 = (var8 - var4) / (var10 - var6);
            } else if (var8 == var10) {
                var17 = (var4 - var2) / (var10 - var6) + 2.0D;
            } else if (var4 == var10) {
                var17 = (var2 - var8) / (var10 - var6) + 4.0D;
            }
        }
        int var19 = (int) (var13 * 256.0D);
        double var20 = var17 / 6.0D;
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        int var22 = (int) (var20 * 256.0D);
        int var23 = (int) (var15 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var19 >>= 0x4;
        } else if (var23 > 217) {
            var19 >>= 0x3;
        } else if (var23 > 192) {
            var19 >>= 0x2;
        } else if (var23 > 179) {
            var19 >>= 0x1;
        }
        return (var23 >> 1) + ((var22 >> 2 << 10) + (var19 >> 5 << 7));
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1593(int arg0) {
        field4158 = null;
        int var1 = -119 % ((arg0 + 5) / 39);
        field4160 = null;
        field4152 = null;
        field4145 = null;
        field4168 = null;
        field4156 = null;
        field4154 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILi;)Lbf;")
    public final class283 method1594(int arg0, int arg1, class182 arg2) {
        class283 var4 = new class283();
        var4.field4981 = 1;
        field4165++;
        class177 var5 = this.field4151;
        synchronized (this.field4151) {
            int var6 = 47 / ((41 - arg0) / 60);
            class283 var7 = (class283) this.field4151.method1148(-120);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if ((long) arg1 == var7.field727 && var7.field4983 == arg2 && var7.field4981 == 2) {
                    var4.field4982 = var7.field4982;
                    var4.field1315 = false;
                    return var4;
                }
                var7 = (class283) this.field4151.method1153(100);
            }
        }
        var4.field4982 = arg2.method1216(70, arg1);
        var4.field1314 = true;
        var4.field1315 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field4167) {
            class177 var1 = this.field4151;
            class283 var2;
            synchronized (this.field4151) {
                var2 = (class283) this.field4151.method1147(false);
                if (var2 == null) {
                    try {
                        this.field4151.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field4161--;
            }
            try {
                if (var2.field4981 == 2) {
                    var2.field4983.method1212((byte) -55, (int) var2.field727, var2.field4982.length, var2.field4982);
                } else if (var2.field4981 == 3) {
                    var2.field4982 = var2.field4983.method1216(-124, (int) var2.field727);
                }
            } catch (Exception var7) {
                class4.method28(-79, var7, (String) null);
            }
            var2.field1315 = false;
        }
        field4148++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLbf;)V")
    private final void method1595(boolean arg0, class283 arg1) {
        class177 var3 = this.field4151;
        synchronized (this.field4151) {
            this.field4151.method1154(arg1, -31849);
            this.field4161++;
            this.field4151.notifyAll();
            if (arg0) {
                method1590(117, (class135) null);
            }
        }
        field4153++;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class238() {
        class114 var1 = class281.field4957.method1531(5, -116, this);
        while (var1.field1996 == 0) {
            class19.method136(1, 10L);
        }
        if (var1.field1996 == 2) {
            throw new RuntimeException();
        }
        this.field4162 = (Thread) var1.field1997;
    }
}
