import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class491 implements Runnable {

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Lub;")
    private class18 field7161 = new class18();

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field7162 = new Thread(this);

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Lrs;")
    public static class464 field7152 = new class464(8);

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field7159 = 0;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Lfk;")
    public static class465 field7160;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 3)
    public static void method2974(int arg0) {
        field7152 = null;
        if (arg0 == -1) {
            field7160 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 15)
    public static final void method2975(int arg0) {
        field7158++;
        field7152 = new class464(8);
        class321.field4078 = 0;
        for (class67 var1 = (class67) class46.field563.method2097((byte) 86); var1 != null; var1 = (class67) class46.field563.method2091(arg0)) {
            var1.method589();
        }
        if (arg0 != -1) {
            method2974(-9);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILbf;IIIII)V", line = 40)
    public static final void method2976(int arg0, class375 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7151++;
        class409.method2431(arg1.field2666, arg6, arg2, arg3, arg4, arg0, arg5, arg1.field2676, true, arg1.field2677);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V", line = 50)
    public static final void method2977(int arg0) {
        if (class97.field1187 <= 0) {
            class113.field1505 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class99.field1199.length; var2++) {
                if (class99.field1199[var2].startsWith("--> ")) {
                    var1++;
                    if (class97.field1187 == var1) {
                        class113.field1505 = class99.field1199[var2].substring(4);
                        break;
                    }
                }
            }
        }
        field7149++;
        int var3 = -120 / ((arg0 + 38) / 54);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLjava/lang/String;)Lhn;", line = 82)
    public final class508 method2978(boolean arg0, String arg1) {
        field7153++;
        if (this.field7162 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class508 var3 = new class508(arg1);
            this.method2979((byte) -105, var3);
            return arg0 ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLnd;)V", line = 107)
    private final void method2979(byte arg0, class383 arg1) {
        field7155++;
        if (arg0 != -105) {
            this.field7162 = null;
        }
        class18 var3 = this.field7161;
        synchronized (this.field7161) {
            this.field7161.method163(arg1, 0);
            this.field7161.notify();
        }
    }

    @OriginalMember(owner = "client!cj", name = "run", descriptor = "()V", line = 121)
    public final void run() {
        field7156++;
        while (true) {
            class18 var1 = this.field7161;
            class508 var3;
            synchronized (this.field7161) {
                class383 var2;
                for (var2 = this.field7161.method158(-24557); var2 == null; var2 = this.field7161.method158(-24557)) {
                    try {
                        this.field7161.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class508)) {
                    return;
                }
                var3 = (class508) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field7313).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field7310 = var5;
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V", line = 164)
    public final void method2980(int arg0) {
        field7157++;
        if (this.field7162 == null) {
            return;
        }
        this.method2979((byte) -105, new class383());
        try {
            if (arg0 != 2) {
                return;
            }
            this.field7162.join();
        } catch (InterruptedException var2) {
        }
        this.field7162 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIZIFIII)[[I", line = 185)
    public static final int[][] method2981(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5, int arg6, int arg7, int arg8) {
        field7154++;
        int[][] var9 = new int[arg8][arg1];
        class468 var10 = new class468();
        var10.field6766 = (int) (arg5 * 4096.0F);
        var10.field6759 = arg3;
        var10.field6752 = arg6;
        var10.field6767 = arg7;
        var10.field6758 = arg0;
        var10.method109(false);
        class172.method1098(arg8, arg1, 78);
        for (int var11 = arg4; var11 < arg8; var11++) {
            var10.method2824((byte) 124, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILpc;BLfh;)V", line = 217)
    public static final void method2982(int arg0, class476 arg1, byte arg2, class463 arg3) {
        field7150++;
        class345 var4 = new class345();
        var4.field4427 = arg3.method2737(false);
        var4.field4432 = arg3.method2727(-88);
        var4.field4431 = new byte[var4.field4427][][];
        var4.field4433 = new int[var4.field4427];
        var4.field4423 = new class121[var4.field4427];
        var4.field4430 = new class121[var4.field4427];
        var4.field4424 = new int[var4.field4427];
        var4.field4428 = new int[var4.field4427];
        if (arg2 > -94) {
            method2981(-114, -127, 46, true, 82, 0.39425278F, 104, 40, -66);
        }
        for (int var5 = 0; var5 < var4.field4427; var5++) {
            try {
                int var6 = arg3.method2737(false);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method2768((byte) -48);
                    String var8 = arg3.method2768((byte) -92);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method2727(-96);
                    }
                    var4.field4433[var5] = var6;
                    var4.field4428[var5] = var9;
                    var4.field4423[var5] = arg1.method2885(var8, (byte) 123, class209.method1294(26, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method2768((byte) 44);
                    String var11 = arg3.method2768((byte) -66);
                    int var12 = arg3.method2737(false);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method2768((byte) 89);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method2727(-127);
                            var15[var16] = new byte[var17];
                            arg3.method2735(var15[var16], var17, 0, -447463096);
                        }
                    }
                    var4.field4433[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class209.method1294(-97, var13[var19]);
                    }
                    var4.field4430[var5] = arg1.method2876(false, var18, class209.method1294(-102, var10), var11);
                    var4.field4431[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4424[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4424[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4424[var5] = -3;
            } catch (Exception var23) {
                var4.field4424[var5] = -4;
            } catch (Throwable var24) {
                var4.field4424[var5] = -5;
            }
        }
        class250.field3196.method163(var4, 0);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 333)
    public class491() {
        this.field7162.setDaemon(true);
        this.field7162.start();
    }
}
