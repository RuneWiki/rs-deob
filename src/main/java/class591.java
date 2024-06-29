import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class591 implements Runnable {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lrk;")
    private class419 field8737 = new class419();

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field8747 = new Thread(this);

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field8746 = -1;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lqp;")
    public static class586 field8738 = new class586(76, -1);

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Z")
    public static boolean field8751 = false;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "F")
    public static float field8752 = 0.0F;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public final void method3439(int arg0) {
        field8743++;
        if (this.field8747 == null) {
            return;
        }
        this.method3440(false, new class496());
        try {
            this.field8747.join();
            if (arg0 != 23407) {
                field8751 = true;
            }
        } catch (InterruptedException var2) {
        }
        this.field8747 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLjd;)V")
    private final void method3440(boolean arg0, class496 arg1) {
        class419 var3 = this.field8737;
        synchronized (this.field8737) {
            this.field8737.method2492(arg1, (byte) 65);
            this.field8737.notify();
        }
        field8742++;
        if (arg0) {
            method3444(-95, -2, -3, -17);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public static final void method3441(int arg0) {
        field8750++;
        if (class636.field9261 == class582.field8561) {
            return;
        }
        int var1 = 120 / ((-arg0 - 67) / 39);
        try {
            class222.method1460(false, "tbrefresh", class621.field9076);
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)Z")
    public static final boolean method3442(int arg0) {
        field8739++;
        try {
            if (class110.field1406 == 2) {
                if (class280.field4160 == null) {
                    class280.field4160 = class504.method3028(class42.field504, class62.field731, class534.field7910);
                    if (class280.field4160 == null) {
                        return false;
                    }
                }
                if (class127.field1682 == null) {
                    class127.field1682 = new class300(class278.field4132, class565.field8375);
                }
                if (class240.field3505.method2526(class580.field8544, class280.field4160, class127.field1682, 114, 22050)) {
                    class240.field3505.method2550(-28);
                    class240.field3505.method2548(class636.field9266, (byte) -74);
                    class240.field3505.method2529(class212.field3119, class280.field4160, true);
                    class42.field504 = null;
                    class280.field4160 = null;
                    class110.field1406 = 0;
                    class127.field1682 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class240.field3505.method2525(arg0 ^ 0x7344);
            class110.field1406 = 0;
            class42.field504 = null;
            class280.field4160 = null;
            class127.field1682 = null;
        }
        if (arg0 != 29510) {
            field8752 = -0.295476F;
        }
        return false;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/lang/String;)Lwv;")
    public final class387 method3443(int arg0, String arg1) {
        field8748++;
        if (this.field8747 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg0 != -7571) {
                method3446((byte) -121);
            }
            class387 var3 = new class387(arg1);
            this.method3440(false, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V")
    public static final void method3444(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 16755) {
            method3441(101);
        }
        field8749++;
        String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class77.method449(false, true, 35, var4);
    }

    @OriginalMember(owner = "client!gl", name = "run", descriptor = "()V")
    public final void run() {
        field8741++;
        while (true) {
            class419 var1 = this.field8737;
            class387 var3;
            synchronized (this.field8737) {
                class496 var2;
                for (var2 = this.field8737.method2498((byte) 117); var2 == null; var2 = this.field8737.method2498((byte) 36)) {
                    try {
                        this.field8737.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class387)) {
                    return;
                }
                var3 = (class387) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5660).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5662 = var5;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
    public static final void method3445(int arg0, int arg1) {
        field8740++;
        int var2 = class576.field8505 - class3.field32;
        if (var2 >= 100) {
            class287.field4232 = 1;
        } else if (arg1 == -1269786720) {
            int var3 = (int) class578.field8523;
            if (var3 < class261.field3844 >> 8) {
                var3 = class261.field3844 >> 8;
            }
            if (class41.field457[4] && var3 < (class306.field4466[4] + 128)) {
                var3 = class306.field4466[4] + 128;
            }
            int var4 = (int) field8752 + class6.field57 & 0x3FFF;
            class447.method2714(class300.field4403, arg0, var3, 7516, class541.field8103, class226.method1477(class355.field5157, true, class239.field3493.field3464, class239.field3493.field3463) - 50, (var3 >> 3) * 3 + 600 << 0, var4);
            float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
            class151.field1935 = (int) ((float) (class151.field1935 - class223.field3275) * var5 + (float) class223.field3275);
            class367.field5319 = (int) ((float) (class367.field5319 - class434.field6364) * var5 + (float) class434.field6364);
            class111.field1412 = (int) ((float) (class111.field1412 - class225.field3321) * var5 + (float) class225.field3321);
            class358.field5200 = (int) ((float) (class358.field5200 - class434.field6361) * var5 + (float) class434.field6361);
            int var6 = class543.field8120 - class117.field1531;
            if (var6 > 8192) {
                var6 -= 16384;
            } else if (var6 < -8192) {
                var6 += 16384;
            }
            class543.field8120 = (int) ((float) var6 * var5 + (float) class117.field1531);
            class543.field8120 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method3446(byte arg0) {
        int var1 = 105 / ((-arg0 - 16) / 48);
        field8738 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;IC)I")
    public static final int method3447(String arg0, int arg1, char arg2) {
        field8745++;
        int var3 = arg1;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class591() {
        this.field8747.setDaemon(true);
        this.field8747.start();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method3448(int arg0, int arg1, String[] arg2, int arg3) {
        field8744++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg2[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            if (arg0 != 100) {
                field8752 = -2.010262F;
            }
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }
}
