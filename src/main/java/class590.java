import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class590 {

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "Lgq;")
    private class540 field8671 = new class540();

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    private int field8674;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    private int field8668;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Lqha;")
    private class112 field8673;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8682 = new String[] { method4402(method4401("Hw\t_P")), method4402(method4401("D4\t2\u0005")), method4402(method4401("],K\u001d")), method4402(method4401("D4\t8\u0005")), method4402(method4401("D4\t:\u0005")), method4402(method4401("D4\t7\u0005")), method4402(method4401("D4\t3\u0005")), method4402(method4401("F:")), method4402(method4401("D4\t4\u0005")), method4402(method4401("D4\t0\u0005")), method4402(method4401("@gD\u0002")), method4402(method4401("D4\t=\u0005")), method4402(method4401("D4\t5\u0005")), method4402(method4401("D4\t;\u0005")), method4402(method4401("D4\t6\u0005")), method4402(method4401("D4\tMD]0SO\u0005")), method4402(method4401("D4\t9\u0005")) };

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "[I")
    public static int[] field8680 = new int[1024];

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILpt;Ljava/lang/Object;)V", line = 10)
    public final void method4389(int arg0, class556 arg1, Object arg2) {
        try {
            if (arg0 != -22897) {
                this.field8673 = null;
            }
            field8675++;
            this.method4394(arg2, arg0 + 23000, 1, arg1);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8682[3] + arg0 + ',' + (arg1 == null ? field8682[2] : field8682[0]) + ',' + (arg2 == null ? field8682[2] : field8682[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V", line = 22)
    public static void method4390(int arg0) {
        try {
            field8680 = null;
            if (arg0 > -43) {
                field8680 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8682[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)Lpq;", line = 37)
    public static final class205 method4391(int arg0) {
        try {
            field8666++;
            try {
                if (arg0 != 0) {
                    field8680 = null;
                }
                return (class205) Class.forName(field8682[7]).getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8682[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 55)
    public final void method4392(int arg0) {
        try {
            if (arg0 == 14575) {
                for (class283 var2 = (class283) this.field8671.method4068(false); var2 != null; var2 = (class283) this.field8671.method4072(-60)) {
                    if (var2.method449(arg0 ^ 0xFFFFD8EF)) {
                        var2.method1824(1);
                        var2.method362((byte) 72);
                        this.field8668 += var2.field4238;
                    }
                }
                field8672++;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8682[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLpt;)Ljava/lang/Object;", line = 81)
    public final Object method4393(byte arg0, class556 arg1) {
        try {
            field8669++;
            long var3 = arg1.method3598(~arg0);
            if (arg0 != 74) {
                this.field8668 = -11;
            }
            for (class283 var5 = (class283) this.field8673.method977(var3, 1); var5 != null; var5 = (class283) this.field8673.method969(-96)) {
                if (var5.field4233.method3600(arg0 ^ 0xFFFFFFFA, arg1)) {
                    Object var6 = var5.method450(arg0 ^ 0x58);
                    if (var6 != null) {
                        if (var5.method449(arg0 - 8266)) {
                            class148 var7 = new class148(arg1, var6, var5.field4238);
                            this.field8673.method968((byte) -111, var5.field3177, var7);
                            this.field8671.method4067((byte) 59, var7);
                            var7.field533 = 0L;
                            var5.method1824(1);
                            var5.method362((byte) 72);
                        } else {
                            this.field8671.method4067((byte) -125, var5);
                            var5.field533 = 0L;
                        }
                        return var6;
                    }
                    var5.method1824(1);
                    var5.method362((byte) 72);
                    this.field8668 += var5.field4238;
                }
            }
            return null;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8682[8] + arg0 + ',' + (arg1 == null ? field8682[2] : field8682[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/Object;IILpt;)V", line = 134)
    private final void method4394(Object arg0, int arg1, int arg2, class556 arg3) {
        try {
            field8670++;
            if (this.field8674 < arg2) {
                throw new IllegalStateException(field8682[10]);
            }
            this.method4399(arg3, false);
            if (arg1 < 63) {
                field8680 = null;
            }
            this.field8668 -= arg2;
            while (this.field8668 < 0) {
                class283 var5 = (class283) this.field8671.method4064(-21877);
                this.method4397(var5, 30118);
            }
            class148 var6 = new class148(arg3, arg0, arg2);
            this.field8673.method968((byte) -111, arg3.method3598(-61), var6);
            this.field8671.method4067((byte) -128, var6);
            var6.field533 = 0L;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field8682[11] + (arg0 == null ? field8682[2] : field8682[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8682[2] : field8682[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)I", line = 163)
    public final int method4395(int arg0) {
        try {
            if (arg0 != 0) {
                this.field8671 = null;
            }
            field8677++;
            return this.field8674;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8682[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V", line = 174)
    public final void method4396(int arg0, int arg1) {
        try {
            field8679++;
            if (class661.field9557 != null) {
                for (class283 var3 = (class283) this.field8671.method4068(false); var3 != null; var3 = (class283) this.field8671.method4072(-61)) {
                    if (var3.method449(arg1 - 8193)) {
                        if (var3.method450(arg1 + 17) == null) {
                            var3.method1824(1);
                            var3.method362((byte) 72);
                            this.field8668 += var3.field4238;
                        }
                    } else if ((long) arg0 < ++var3.field533) {
                        class283 var4 = class661.field9557.method204(64, var3);
                        this.field8673.method968((byte) -111, var3.field3177, var4);
                        class90.method770(var3, arg1 ^ 0x1, var4);
                        var3.method1824(1);
                        var3.method362((byte) 72);
                    }
                }
            }
            if (arg1 != 1) {
                this.field8673 = null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8682[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lkv;I)V", line = 222)
    private final void method4397(class283 arg0, int arg1) {
        try {
            if (arg0 != null) {
                arg0.method1824(arg1 ^ 0x75A7);
                arg0.method362((byte) 72);
                this.field8668 += arg0.field4238;
            }
            field8676++;
            if (arg1 != 30118) {
                this.field8673 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8682[13] + (arg0 == null ? field8682[2] : field8682[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)I", line = 240)
    public final int method4398(int arg0) {
        try {
            field8681++;
            if (arg0 != 1) {
                this.field8673 = null;
            }
            return this.field8668;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8682[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lpt;Z)V", line = 252)
    private final void method4399(class556 arg0, boolean arg1) {
        try {
            field8667++;
            long var3 = arg0.method3598(-108);
            for (class283 var5 = (class283) this.field8673.method977(var3, 1); var5 != null; var5 = (class283) this.field8673.method969(-101)) {
                if (var5.field4233.method3600(-93, arg0)) {
                    this.method4397(var5, 30118);
                    break;
                }
            }
            if (arg1) {
                this.method4397(null, 61);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field8682[1] + (arg0 == null ? field8682[2] : field8682[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V", line = 296)
    public class590(int arg0) {
        try {
            this.field8674 = arg0;
            this.field8668 = arg0;
            int var2;
            for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
            }
            this.field8673 = new class112(var2);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8682[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 281)
    public final void method4400(byte arg0) {
        try {
            this.field8671.method4069((byte) -60);
            field8678++;
            int var2 = 81 % ((arg0 + 24) / 34);
            this.field8673.method970(-91);
            this.field8668 = this.field8674;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8682[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4401(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4402(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
