import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class166 implements Runnable {

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lob;")
    private static class141 field3213 = class175.method1195(40, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lob;")
    public static class141 field3212 = field3213;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
    public static int[] field3214 = new int[256];

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field3211 = 0;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "[Lob;")
    public static class141[] field3217 = new class141[100];

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Lvc;")
    public static class212 field3218;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Lob;")
    public static class141 field3219;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lob;")
    public static class141 field3220;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!qg", name = "run", descriptor = "()V")
    public final void run() {
        field3209++;
        try {
            while (true) {
                class158 var1 = class109.field2097;
                class162 var2;
                synchronized (class109.field2097) {
                    var2 = (class162) class109.field2097.method1103((byte) -9);
                }
                if (var2 == null) {
                    class93.method638(100L, (byte) -8);
                    Object var6 = class123.field2355;
                    synchronized (class123.field2355) {
                        if (class158.field3062 <= 1) {
                            class158.field3062 = 0;
                            class123.field2355.notifyAll();
                            return;
                        }
                        class158.field3062--;
                    }
                } else {
                    if (var2.field3138 == 0) {
                        var2.field3133.method1135(true, var2.field3136.length, var2.field3136, (int) var2.field4067);
                        class158 var3 = class109.field2097;
                        synchronized (class109.field2097) {
                            var2.method1392(128);
                        }
                    } else if (var2.field3138 == 1) {
                        var2.field3136 = var2.field3133.method1136(112, (int) var2.field4067);
                        class158 var4 = class109.field2097;
                        synchronized (class109.field2097) {
                            class141.field2702.method1098(0, var2);
                        }
                    }
                    Object var5 = class123.field2355;
                    synchronized (class123.field2355) {
                        if (class158.field3062 <= 1) {
                            class158.field3062 = 0;
                            class123.field2355.notifyAll();
                            return;
                        }
                        class158.field3062 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class170.method1162(null, var17, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg4;
            arg4 = var7;
        }
        field3216++;
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg2;
        } else if (~var8 == arg6) {
            return 1 + 7 - arg5 - arg0;
        } else {
            return 1 + 7 - arg4 - arg2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static void method1144(boolean arg0) {
        field3219 = null;
        field3220 = null;
        field3214 = null;
        field3218 = null;
        field3213 = null;
        field3217 = null;
        field3212 = null;
        if (arg0) {
            method1145();
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
    public static final void method1145() {
        for (int var0 = 0; var0 < class108.field2090; var0++) {
            for (int var5 = 0; var5 < class163.field3158; var5++) {
                for (int var6 = 0; var6 < class220.field4172; var6++) {
                    class131.field2506[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class160.field3108; var1++) {
            for (int var4 = 0; var4 < class160.field3089[var1]; var4++) {
                class160.field3093[var1][var4] = null;
            }
            class160.field3089[var1] = 0;
        }
        for (int var2 = 0; var2 < class17.field304; var2++) {
            class113.field2165[var2] = null;
        }
        class17.field304 = 0;
        for (int var3 = 0; var3 < class158.field3051.length; var3++) {
            class158.field3051[var3] = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)Lob;")
    public static final class141 method1146(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return null;
        }
        field3210++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return class184.field3594;
        } else if (var3 < -6) {
            return class114.field2189;
        } else if (var3 < -3) {
            return class126.field2419;
        } else if (var3 < 0) {
            return class123.field2374;
        } else if (var3 > 9) {
            return class197.field3762;
        } else if (var3 > 6) {
            return class15.field266;
        } else if (var3 > 3) {
            return class26.field479;
        } else if (var3 > 0) {
            return class95.field1886;
        } else {
            return class19.field332;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Laa;III)V")
    public static final void method1147(class2 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class163.field3158) {
            class153 var4 = class131.field2506[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2926 != null && var4.field2926.field2379.method15()) {
                arg0.method13(var4.field2926.field2379, 128, 0, 0, true);
            }
        }
        if (arg3 < class163.field3158) {
            class153 var5 = class131.field2506[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2926 != null && var5.field2926.field2379.method15()) {
                arg0.method13(var5.field2926.field2379, 0, 0, 128, true);
            }
        }
        if (arg2 < class163.field3158 && arg3 < class220.field4172) {
            class153 var6 = class131.field2506[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2926 != null && var6.field2926.field2379.method15()) {
                arg0.method13(var6.field2926.field2379, 128, 0, 128, true);
            }
        }
        if (arg2 < class163.field3158 && arg3 > 0) {
            class153 var7 = class131.field2506[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2926 != null && var7.field2926.field2379.method15()) {
                arg0.method13(var7.field2926.field2379, 128, 0, -128, true);
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3214[var0] = var1;
        }
        field3218 = new class212(50);
        field3219 = class175.method1195(40, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");
        field3220 = class175.method1195(40, "RuneScape wird geladen )2 bitte warten)3)3)3");
    }
}
