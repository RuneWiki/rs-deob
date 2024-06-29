import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class643 implements Runnable {

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Lfha;")
    private class522 field9114 = new class522();

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field9118 = new Thread(this);

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field9119 = 0;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Lefa;")
    public static class528 field9115 = new class528();

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "Lffa;")
    public static class678 field9112;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public static void method3726(byte arg0) {
        field9112 = null;
        if (arg0 < 78) {
            method3731(-67);
        }
        field9115 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public final void method3727(int arg0) {
        field9120++;
        if (this.field9118 == null) {
            return;
        }
        this.method3728(new class513(), (byte) -11);
        try {
            this.field9118.join();
        } catch (InterruptedException var2) {
        }
        if (arg0 != 0) {
            method3726((byte) -67);
        }
        this.field9118 = null;
    }

    @OriginalMember(owner = "client!om", name = "run", descriptor = "()V")
    public final void run() {
        field9113++;
        while (true) {
            class522 var1 = this.field9114;
            class672 var3;
            synchronized (this.field9114) {
                class513 var2;
                for (var2 = this.field9114.method3115(true); var2 == null; var2 = this.field9114.method3115(true)) {
                    try {
                        this.field9114.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class672)) {
                    return;
                }
                var3 = (class672) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field9450).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field9454 = var5;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ltq;B)V")
    private final void method3728(class513 arg0, byte arg1) {
        field9121++;
        class522 var3 = this.field9114;
        synchronized (this.field9114) {
            this.field9114.method3116(29066, arg0);
            this.field9114.notify();
            if (arg1 != -11) {
                this.field9114 = null;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLjava/lang/String;)Lnga;")
    public final class672 method3729(byte arg0, String arg1) {
        field9122++;
        if (this.field9118 == null) {
            throw new IllegalStateException("");
        }
        if (arg0 >= 0) {
            field9119 = -24;
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("");
        }
        class672 var3 = new class672(arg1);
        this.method3728(var3, (byte) -11);
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lsb;[Ljr;B)Lwga;")
    public static final class484 method3730(class93 arg0, class133[] arg1, byte arg2) {
        field9116++;
        if (arg2 != 5) {
            method3731(69);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field1797 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field1797);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class461.field6324, 0);
        if (class461.field6324[0] == 0) {
            if (class461.field6324[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class461.field6324, 1);
            if (class461.field6324[1] > 1) {
                byte[] var7 = new byte[class461.field6324[1]];
                OpenGL.glGetInfoLogARB(var4, class461.field6324[1], class461.field6324, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class461.field6324[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field1797);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class484(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public static final void method3731(int arg0) {
        if (!class484.field6549) {
            class229.field3185 = class292.field3822 != -1 && class292.field3822 <= class605.field8642 || class582.field8281 < (class33.field496 ? 26 : 22) + class605.field8642 * 16;
        }
        field9117++;
        class384.field5397.method3122(0);
        class271.field3657.method3122(arg0 ^ arg0);
        for (class6 var1 = (class6) class478.field6510.method3118((byte) 73); var1 != null; var1 = (class6) class478.field6510.method3111(116)) {
            int var39 = var1.field60;
            if (var39 < 1000) {
                var1.method3065(-17363);
                if (var39 == 4 || var39 == 6 || var39 == 20 || var39 == 47 || var39 == 17 || var39 == 49 || var39 == 9) {
                    class271.field3657.method3116(29066, var1);
                } else {
                    class384.field5397.method3116(29066, var1);
                }
            }
        }
        class384.field5397.method3123(class478.field6510, (byte) 24);
        class271.field3657.method3123(class478.field6510, (byte) 117);
        if (class605.field8642 > 1) {
            if (class349.field4447 && class196.field2837.method315(81, 81) && class605.field8642 > 2) {
                class627.field8950 = (class6) class478.field6510.field7324.field7164.field7164;
            } else {
                class627.field8950 = (class6) class478.field6510.field7324.field7164;
            }
            class252.field3474 = (class6) class478.field6510.field7324.field7164;
        } else {
            class252.field3474 = null;
            class627.field8950 = null;
        }
        int var2 = -1;
        class12 var3 = (class12) class36.field508.method3118((byte) 73);
        if (var3 != null) {
            var2 = var3.method67((byte) -76);
        }
        if (!class484.field6549) {
            if (var2 == 0 && (class536.field7507 == 1 && class605.field8642 > 2 || class647.method3753(1002))) {
                var2 = 2;
            }
            if (var2 == 2 && class605.field8642 > 0 && var3 != null) {
                if (class740.field10315 == null && class392.field5462 == 0) {
                    class82.method487(22351, var3.method64(-1), var3.method63(5245));
                } else {
                    class559.field7945 = 2;
                }
            }
            if (var2 == 0) {
                if (class627.field8950 != null) {
                    class754.method4182((byte) 50);
                } else if (class13.field187) {
                    class254.method1598((byte) -79);
                }
            }
            if (class740.field10315 != null || class392.field5462 != 0) {
                return;
            }
            class559.field7945 = 0;
            class717.field10138 = null;
            return;
        }
        if (var2 == -1) {
            int var4 = class93.field1263.method805(0);
            int var5 = class93.field1263.method806(0);
            boolean var6 = false;
            if (class105.field1536 != null) {
                if (var4 >= (class729.field10220 - 10) && (class729.field10220 + class660.field9314 + 10) >= var4 && class495.field6946 - 10 <= var5 && (class695.field9701 + class495.field6946 + 10) >= var5) {
                    var6 = true;
                } else {
                    class114.method760((byte) -105);
                }
            }
            if (!var6) {
                if ((class463.field6345 - 10) > var4 || (class463.field6345 + class248.field3438 + 10) < var4 || class140.field1930 - 10 > var5 || (class148.field2046 + class140.field1930 + 10) < var5) {
                    class638.method3711(182763116);
                } else if (class229.field3185) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class367.field4714; var9++) {
                        if (class33.field496) {
                            int var11 = var9 * 16 + class140.field1930 + 33;
                            if ((var11 - 13) < var5 && (var11 + 4) > var5) {
                                var8 = var11 - 13;
                                var7 = var9;
                                break;
                            }
                        } else {
                            int var10 = class140.field1930 + (var9 * 16) + 31;
                            if (var5 > (var10 - 13) && var5 < (var10 + 3)) {
                                var8 = var10 - 13;
                                var7 = var9;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class609 var13 = new class609(class314.field4033);
                        for (class480 var14 = (class480) var13.method3562((byte) 8); var14 != null; var14 = (class480) var13.method3563(-96)) {
                            if (var7 == var12) {
                                if (var14.field6524 > 1) {
                                    class569.method3402(var5, var14, var8, (byte) -4);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method63(arg0 + 6006);
        int var16 = var3.method64(-1);
        if (class105.field1536 != null && class729.field10220 <= var15 && class729.field10220 + class660.field9314 >= var15 && class495.field6946 <= var16 && var16 <= (class695.field9701 + class495.field6946)) {
            int var17 = -1;
            for (int var18 = 0; var18 < class105.field1536.field6524; var18++) {
                if (class33.field496) {
                    int var22 = var18 * 16 + class495.field6946 + 33;
                    if (var16 > var22 - 13 && var16 < var22 + 4) {
                        var17 = var18;
                    }
                } else {
                    int var23 = var18 * 16 + class495.field6946 + 31;
                    if (var23 - 13 < var16 && var16 < (var23 + 3)) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class609 var20 = new class609(class105.field1536.field6519);
                for (class6 var21 = (class6) var20.method3562((byte) 49); var21 != null; var21 = (class6) var20.method3563(-113)) {
                    if (var17 == var19) {
                        class541.method3220(var21, true, var16, var15);
                        break;
                    }
                    var19++;
                }
            }
            class638.method3711(182763116);
            return;
        }
        if (var15 < class463.field6345 || (class463.field6345 + class248.field3438) < var15 || var16 < class140.field1930 || class148.field2046 + class140.field1930 < var16) {
            return;
        }
        if (!class229.field3185) {
            int var24 = -1;
            for (int var25 = 0; var25 < class605.field8642; var25++) {
                if (class33.field496) {
                    int var29 = class140.field1930 + ((class605.field8642 + -1 + -var25) * 16) + 33;
                    if (var16 > (var29 - 13) && var16 < var29 + 4) {
                        var24 = var25;
                    }
                } else {
                    int var30 = (class605.field8642 - var25 - 1) * 16 + class140.field1930 + 31;
                    if (var16 > var30 - 13 && var30 + 3 > var16) {
                        var24 = var25;
                    }
                }
            }
            if (var24 != -1) {
                int var26 = 0;
                class46 var27 = new class46(class478.field6510);
                for (class6 var28 = (class6) var27.method314((byte) 79); var28 != null; var28 = (class6) var27.method313(arg0 ^ 0xFFFFFEEF)) {
                    if (var24 == var26) {
                        class541.method3220(var28, true, var16, var15);
                        break;
                    }
                    var26++;
                }
            }
            class638.method3711(arg0 ^ 0xF51B436B);
            return;
        }
        int var31 = -1;
        int var32 = -1;
        for (int var33 = 0; var33 < class367.field4714; var33++) {
            if (class33.field496) {
                int var34 = var33 * 16 + class140.field1930 + 33;
                if (var16 > (var34 - 13) && var16 < (var34 + 4)) {
                    var31 = var33;
                    var32 = var34 - 13;
                    break;
                }
            } else {
                int var35 = class140.field1930 - (-(var33 * 16) - 31);
                if (var16 > var35 - 13 && (var35 + 3) > var16) {
                    var32 = var35 - 13;
                    var31 = var33;
                    break;
                }
            }
        }
        if (var31 == -1) {
            return;
        }
        int var36 = 0;
        class609 var37 = new class609(class314.field4033);
        for (class480 var38 = (class480) var37.method3562((byte) 88); var38 != null; var38 = (class480) var37.method3563(-79)) {
            if (var31 == var36) {
                if (var38.field6524 != 1) {
                    class569.method3402(var16, var38, var32, (byte) -4);
                    return;
                }
                class541.method3220((class6) var38.field6519.field1417.field3781, true, var16, var15);
                class638.method3711(182763116);
                return;
            }
            var36++;
        }
        return;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
    public class643() {
        this.field9118.setDaemon(true);
        this.field9118.start();
    }
}
