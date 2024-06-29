import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.awt.datatransfer.Clipboard;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class560 implements Runnable {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Ltf;")
    private class524 field8143 = new class524();

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field8152;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8156 = new String[] { method4195(method4194("\"\u0000\u0011\u0014\n")), method4195(method4194("-\u0016S;")), method4195(method4194("8M\u0011y_")), method4195(method4194("\"\u0000\u0011\u0013\n")), method4195(method4194("\"\u0000\u0011\u0015\n")), method4195(method4194("\"\u0000\u0011\u0011\n")), method4195(method4194("\"\u0000\u0011\u0010\n")), method4195(method4194("\u007f\u0000P;\u001f%\u0005Y1\u0012s]")), method4195(method4194("cK")), method4195(method4194("cN\u0001w\u001e \fSjD%\u0005Yg\u0012}")), method4195(method4194("\"\u0000\u0011\u0012\n")), method4195(method4194("\"\u0000\u0011%W-K")), method4195(method4194("\"\u0000\u0011\u0016\n")), method4195(method4194("\"\u0000\u0011kK-\nKi\n")) };

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field8153;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field8144;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
    public static int[] field8150;

    @OriginalMember(owner = "client!ac", name = "run", descriptor = "()V")
    public final void run() {
        try {
            field8149++;
            while (true) {
                class524 var1 = this.field8143;
                class532 var3;
                synchronized (this.field8143) {
                    class578 var2;
                    for (var2 = this.field8143.method3980(-27119); var2 == null; var2 = this.field8143.method3980(-27119)) {
                        try {
                            this.field8143.wait();
                        } catch (InterruptedException var9) {
                        }
                    }
                    if (!(var2 instanceof class532)) {
                        return;
                    }
                    var3 = (class532) var2;
                }
                int var5;
                try {
                    byte[] var4 = InetAddress.getByName(var3.field7705).getAddress();
                    var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
                } catch (Throwable var10) {
                    var5 = 1000;
                }
                var3.field7709 = var5;
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field8156[11] + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)Z")
    public static final boolean method4187(int arg0, int arg1, int arg2) {
        try {
            field8147++;
            if (arg1 != -1264) {
                method4187(42, 78, 0);
            }
            return (arg0 & 0x22) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8156[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public final void method4188(int arg0) {
        try {
            field8151++;
            if (this.field8152 != null && arg0 == 1) {
                this.method4190(arg0 - 125, new class578());
                try {
                    this.field8152.join();
                } catch (InterruptedException var3) {
                }
                this.field8152 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8156[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZLih;)V")
    public static final void method4189(boolean arg0, boolean arg1, class717 arg2) {
        try {
            field8146++;
            if (class72.field1049 < 400) {
                class134 var3 = arg2.field10229;
                String var4 = arg2.field10211;
                if (var3.field1659 != null) {
                    var3 = var3.method1178(class734.field10459, (byte) -92);
                    if (var3 == null) {
                        return;
                    }
                    var4 = var3.field1690;
                }
                if (!arg0) {
                    method4191(null, 90);
                }
                if (var3.field1678) {
                    if (arg2.field10214 != 0) {
                        String var5 = class544.field7978 == class316.field4323 ? class537.field7860.method4068((byte) -44, class405.field5883) : class537.field7858.method4068((byte) -100, class405.field5883);
                        var4 = var4 + class422.method3281(arg2.field10214, (byte) 98, class203.field2988.field4940) + field8156[8] + var5 + arg2.field10214 + ")";
                    }
                    if (class351.field5091 && !arg1) {
                        class573 var6 = class760.field10845 == -1 ? null : class202.field2972.method611(false, class760.field10845);
                        if ((class140.field1826 & 0x2) != 0 && (var6 == null || var3.method1172(class760.field10845, false, var6.field8295) != var6.field8295)) {
                            class250.field3570++;
                            class751.method5441(class121.field1534, class109.field1426 + field8156[9] + var4, 0, -1, (long) arg2.field2200, true, class268.field3795, -1, false, 0, false, 19, (long) arg2.field2200);
                        }
                    }
                    if (!arg1) {
                        String[] var7 = var3.field1712;
                        if (class800.field11625) {
                            var7 = class716.method5195(var7, (byte) -123);
                        }
                        if (var7 != null) {
                            for (int var8 = var7.length - 1; var8 >= 0; var8--) {
                                if (var7[var8] != null && (var3.field1685 == 0 || !var7[var8].equalsIgnoreCase(class537.field7853.method4068((byte) -39, class405.field5883)) && !var7[var8].equalsIgnoreCase(class537.field7852.method4068((byte) -83, class405.field5883)))) {
                                    short var9 = 0;
                                    if (var8 == 0) {
                                        var9 = 22;
                                    }
                                    int var10 = class487.field7153;
                                    if (var8 == 1) {
                                        var9 = 8;
                                    }
                                    if (var8 == 2) {
                                        var9 = 5;
                                    }
                                    if (var8 == 3) {
                                        var9 = 20;
                                    }
                                    if (var8 == 4) {
                                        var9 = 4;
                                    }
                                    if (var3.field1672 == var8) {
                                        var10 = var3.field1696;
                                    }
                                    if (var8 == 5) {
                                        var9 = 1003;
                                    }
                                    if (var3.field1733 == var8) {
                                        var10 = var3.field1736;
                                    }
                                    class751.method5441(var7[var8].equalsIgnoreCase(class537.field7853.method4068((byte) -75, class405.field5883)) ? var3.field1668 : var10, field8156[7] + var4, 0, -1, (long) arg2.field2200, true, var7[var8], -1, false, 0, false, var9, (long) arg2.field2200);
                                    class586.field8461++;
                                }
                            }
                            if (var3.field1685 == 1) {
                                for (int var11 = 0; var11 < var7.length; var11++) {
                                    if (var7[var11] != null && (var7[var11].equalsIgnoreCase(class537.field7853.method4068((byte) -46, class405.field5883)) || var7[var11].equalsIgnoreCase(class537.field7852.method4068((byte) -70, class405.field5883)))) {
                                        short var12 = 0;
                                        if (class203.field2988.field4940 < arg2.field10214) {
                                            var12 = 2000;
                                        }
                                        short var13 = 0;
                                        int var14 = class487.field7153;
                                        if (var11 == 0) {
                                            var13 = 22;
                                        }
                                        if (var11 == 1) {
                                            var13 = 8;
                                        }
                                        if (var11 == 2) {
                                            var13 = 5;
                                        }
                                        if (var11 == 3) {
                                            var13 = 20;
                                        }
                                        if (var11 == 4) {
                                            var13 = 4;
                                        }
                                        if (var11 == 5) {
                                            var13 = 1003;
                                        }
                                        if (var3.field1672 == var11) {
                                            var14 = var3.field1696;
                                        }
                                        if (var13 != 0) {
                                            var13 += var12;
                                        }
                                        if (var3.field1733 == var11) {
                                            var14 = var3.field1736;
                                        }
                                        class167.field2132++;
                                        class751.method5441(var7[var11].equalsIgnoreCase(class537.field7853.method4068((byte) -50, class405.field5883)) ? var3.field1668 : var14, field8156[7] + var4, 0, -1, (long) arg2.field2200, true, var7[var11], -1, false, 0, false, var13, (long) arg2.field2200);
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field8156[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8156[1] : field8156[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILwb;)V")
    private final void method4190(int arg0, class578 arg1) {
        try {
            int var3 = -50 % ((-arg0 - 56) / 32);
            class524 var4 = this.field8143;
            synchronized (this.field8143) {
                this.field8143.method3984(arg1, 0);
                this.field8143.notify();
            }
            field8145++;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8156[4] + arg0 + ',' + (arg1 == null ? field8156[1] : field8156[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method4191(String arg0, int arg1) {
        try {
            field8154++;
            if (arg0 != null) {
                if ((class210.field3062 < 200 || class282.field3975) && class210.field3062 < 200) {
                    if (arg1 != 22) {
                        method4187(-65, -30, -36);
                    }
                    String var2 = class492.method3797(arg1 ^ 0x16, arg0);
                    if (var2 != null) {
                        for (int var3 = 0; var3 < class210.field3062; var3++) {
                            String var4 = class492.method3797(arg1 ^ 0x16, class591.field8497[var3]);
                            if (var4 != null && var4.equals(var2)) {
                                class756.method5485(4, (byte) 8, arg0 + class537.field7868.method4068((byte) -75, class405.field5883));
                                return;
                            }
                            if (class653.field9272[var3] != null) {
                                String var5 = class492.method3797(0, class653.field9272[var3]);
                                if (var5 != null && var5.equals(var2)) {
                                    class756.method5485(4, (byte) 8, arg0 + class537.field7868.method4068((byte) -104, class405.field5883));
                                    return;
                                }
                            }
                        }
                        for (int var6 = 0; var6 < class692.field9683; var6++) {
                            String var7 = class492.method3797(0, class49.field710[var6]);
                            if (var7 != null && var7.equals(var2)) {
                                class756.method5485(4, (byte) 8, class537.field7873.method4068((byte) -101, class405.field5883) + arg0 + class537.field7874.method4068((byte) -118, class405.field5883));
                                return;
                            }
                            if (class180.field2342[var6] != null) {
                                String var8 = class492.method3797(0, class180.field2342[var6]);
                                if (var8 != null && var8.equals(var2)) {
                                    class756.method5485(4, (byte) 8, class537.field7873.method4068((byte) -93, class405.field5883) + arg0 + class537.field7874.method4068((byte) -66, class405.field5883));
                                    return;
                                }
                            }
                        }
                        if (class492.method3797(0, class203.field2988.field4905).equals(var2)) {
                            class756.method5485(4, (byte) 8, class537.field7871.method4068((byte) -127, class405.field5883));
                        } else {
                            class706.field9865++;
                            class779 var9 = class85.method851(false);
                            class274 var10 = class375.method2969((byte) 1, class303.field4224, var9.field11100);
                            var10.field3885.method5114(arg1 + 233, class101.method986(arg0, 6743));
                            var10.field3885.method5089(arg0, (byte) -123);
                            var9.method5608(var10, 29867);
                        }
                    }
                } else {
                    class756.method5485(4, (byte) 8, class537.field7841.method4068((byte) -104, class405.field5883));
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field8156[3] + (arg0 == null ? field8156[1] : field8156[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/lang/String;)Lqia;")
    public final class532 method4192(byte arg0, String arg1) {
        try {
            field8155++;
            if (this.field8152 == null) {
                throw new IllegalStateException("");
            } else if (arg1 == null) {
                throw new IllegalArgumentException("");
            } else if (arg0 >= -120) {
                return null;
            } else {
                class532 var3 = new class532(arg1);
                this.method4190(63, var3);
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8156[12] + arg0 + ',' + (arg1 == null ? field8156[1] : field8156[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method4193(int arg0) {
        try {
            if (arg0 <= -52) {
                field8150 = null;
                field8144 = null;
                field8153 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8156[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class560() {
        try {
            this.field8152 = new Thread(this);
            this.field8152.setDaemon(true);
            this.field8152.start();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8156[13] + ')');
        }
    }

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4194(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4195(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 99;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
