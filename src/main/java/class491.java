import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class491 implements Runnable {

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "Loe;")
    private class137 field7068 = new class137();

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field7062 = new Thread(this);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "[[S")
    public static short[][] field7053 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field7055 = -1;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "Lul;")
    public static class406 field7054;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "[Lta;")
    public static class145[] field7059;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZB)V", line = 3)
    public static final void method2915(boolean arg0, byte arg1) {
        class185.field2806 = 0;
        class121.field1827 = 0;
        field7061++;
        class331.method2097(false);
        class467.method2820(arg0, false);
        class224.method1601((byte) -123);
        int var2 = 0;
        if (arg1 > -111) {
            method2920((byte) 40, -6);
        }
        while (var2 < class185.field2806) {
            int var4 = class274.field4189[var2];
            if (class475.field6854 != class153.field2265[var4].field1882) {
                if (class153.field2265[var4].field1763.method253((byte) -100)) {
                    class134.method979((byte) -115, class153.field2265[var4]);
                }
                class153.field2265[var4].method877(null, 28766);
                class153.field2265[var4] = null;
            }
            var2++;
        }
        if (class142.field2164 != class238.field3819.field3556) {
            throw new RuntimeException("gnp1 pos:" + class238.field3819.field3556 + " psize:" + class142.field2164);
        }
        for (int var3 = 0; var3 < class167.field2471; var3++) {
            if (class153.field2265[class470.field6797[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class167.field2471);
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "([BIZ)Ljava/lang/Object;", line = 54)
    public static final Object method2916(byte[] arg0, int arg1, boolean arg2) {
        if (arg1 != -15460) {
            field7059 = null;
        }
        field7064++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class315.field4752) {
            try {
                class200 var3 = (class200) Class.forName("kj").getDeclaredConstructor().newInstance();
                var3.method1403(arg1 ^ 0xFFFFB374, arg0);
                return var3;
            } catch (Throwable var4) {
                class315.field4752 = true;
            }
        }
        return arg2 ? class168.method1130((byte) 118, arg0) : arg0;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lcf;I)V", line = 88)
    private final void method2917(class431 arg0, int arg1) {
        class137 var3 = this.field7068;
        synchronized (this.field7068) {
            this.field7068.method994(arg0, -3610);
            this.field7068.notify();
            if (arg1 != -30584) {
                this.method2917(null, -32);
            }
        }
        field7065++;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZIBII)V", line = 102)
    public static final void method2918(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        field7063++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class255.field3913 - class387.field5815) * var6 / 100 + class387.field5815;
        if (var7 < class374.field5587) {
            var7 = class374.field5587;
        } else if (class102.field1475 < var7) {
            var7 = class102.field1475;
        }
        if (arg3 != -94) {
            return;
        }
        int var8 = var7 * 512 * arg5 / (arg2 * 334);
        if (class283.field4305 > var8) {
            short var9 = class283.field4305;
            var7 = arg2 * var9 * 334 / (arg5 * 512);
            if (var7 > class102.field1475) {
                var7 = class102.field1475;
                int var10 = arg5 * var7 * 512 / (var9 * 334);
                int var11 = (arg2 - var10) / 2;
                if (arg1) {
                    class377.field5692.method267();
                    class377.field5692.method364(arg4, 1, -16777216, var11, arg0, arg5);
                    class377.field5692.method364(arg4, 1, -16777216, var11, arg0 + arg2 - var11, arg5);
                }
                arg2 -= var11 * 2;
                arg0 += var11;
            }
        } else if (var8 > class135.field2066) {
            short var12 = class135.field2066;
            var7 = arg2 * 334 * var12 / (arg5 * 512);
            if (var7 < class374.field5587) {
                var7 = class374.field5587;
                int var13 = arg2 * 334 * var12 / (var7 * 512);
                int var14 = (arg5 - var13) / 2;
                if (arg1) {
                    class377.field5692.method267();
                    class377.field5692.method364(arg4, 1, -16777216, arg2, arg0, var14);
                    class377.field5692.method364(arg5 + arg4 - var14, 1, -16777216, arg2, arg0, var14);
                }
                arg4 += var14;
                arg5 -= var14 * 2;
            }
        }
        class272.field4164 = (short) arg5;
        class336.field5003 = (short) arg2;
        class215.field3493 = arg5 * var7 / 334;
        class412.field6168 = arg0;
        class286.field4336 = arg4;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "([IZ[Ljava/lang/Object;)V", line = 202)
    public static final void method2919(int[] arg0, boolean arg1, Object[] arg2) {
        class18.method152(arg0.length - 1, 0, arg2, arg0, (byte) -44);
        if (!arg1) {
            field7055 = -63;
        }
        field7056++;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BI)I", line = 218)
    public static final int method2920(byte arg0, int arg1) {
        field7060++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            int var2 = 108 % ((arg0 + 48) / 63);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Ljava/lang/String;I)Lsk;", line = 254)
    public final class442 method2921(String arg0, int arg1) {
        field7066++;
        if (this.field7062 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else if (arg1 == 16) {
            class442 var3 = new class442(arg0);
            this.method2917(var3, -30584);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V", line = 275)
    public static void method2922(int arg0) {
        field7053 = null;
        if (arg0 == 25486) {
            field7054 = null;
            field7059 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V", line = 288)
    public final void method2923(int arg0) {
        field7057++;
        if (arg0 != -2) {
            method2918(39, false, 20, (byte) 118, 40, -65);
        }
        if (this.field7062 == null) {
            return;
        }
        this.method2917(new class431(), -30584);
        try {
            this.field7062.join();
        } catch (InterruptedException var2) {
        }
        this.field7062 = null;
    }

    @OriginalMember(owner = "client!ev", name = "run", descriptor = "()V", line = 316)
    public final void run() {
        field7058++;
        while (true) {
            class137 var1 = this.field7068;
            class442 var3;
            synchronized (this.field7068) {
                class431 var2;
                for (var2 = this.field7068.method1001(-16153); var2 == null; var2 = this.field7068.method1001(-16153)) {
                    try {
                        this.field7068.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class442)) {
                    return;
                }
                var3 = (class442) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field6491).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field6493 = var5;
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V", line = 358)
    public class491() {
        this.field7062.setDaemon(true);
        this.field7062.start();
    }
}
