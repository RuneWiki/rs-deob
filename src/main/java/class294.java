import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class294 extends class687 {

    @OriginalMember(owner = "client!dka", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field4144 = new String[] { method2380(method2379("4\tU$\u0010x")), method2380(method2379("4\tU$\u0014x")), method2380(method2379("4\tU$\u0013x")), method2380(method2379("4\tU$\u0011x")), method2380(method2379("4\tU$\u0016x")), method2380(method2379("4\tU$\u001fx")), method2380(method2379("4\tU$k9\f]~ix")), method2380(method2379(">\u0017Xf")), method2380(method2379("}O\u0019o94\u0005Dzz}O")), method2380(method2379("+L\u001a$*")), method2380(method2379("7\u0012];w \rG0")), method2380(method2379("p\u0012Gc-5X")), method2380(method2379("4\tU$\u0012x")), method2380(method2379("4\tU$\u0015x")) };

    @OriginalMember(owner = "client!dka", name = "B", descriptor = "Lsb;")
    public static class261 field4138 = new class261(19, -1);

    @OriginalMember(owner = "client!dka", name = "w", descriptor = "Lsb;")
    public static class261 field4141 = new class261(12, 2);

    @OriginalMember(owner = "client!dka", name = "E", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!dka", name = "v", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!dka", name = "t", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!dka", name = "D", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!dka", name = "A", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!dka", name = "z", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!dka", name = "C", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!dka", name = "F", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!dka", name = "u", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!dka", name = "x", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!dka", name = "y", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!dka", name = "G", descriptor = "Ljava/lang/String;")
    public String field4135;

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(B)J", line = 3)
    public final long method2371(byte arg0) {
        try {
            if (arg0 != 10) {
                field4141 = null;
            }
            ++field4130;
            return 72057594037927935L & super.field8378;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4144[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "j", descriptor = "(I)I", line = 14)
    public final int method2372(int arg0) {
        try {
            ++field4134;
            if (arg0 != 0) {
                this.field4133 = -79;
            }
            return (int) (255L & super.field8378 >>> 56);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4144[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "c", descriptor = "(B)V", line = 27)
    public static final void method2373(byte arg0) {
        try {
            ++field4131;
            int var1 = class689.field9642;
            int[] var2 = class599.field8595;
            for (int var3 = 0; var1 > var3; ++var3) {
                class339 var4 = class748.field10666[var2[var3]];
                if (var4 != null) {
                    class677.method4849(512, var4, var4.method1437((byte) -28));
                }
            }
            int var5 = -31 % ((arg0 - -61) / 46);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4144[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(ILeea;I)V", line = 54)
    public static final void method2374(int arg0, class476 arg1, int arg2) {
        try {
            ++field4142;
            class176.field2305 = arg0;
            class293.field4128 = false;
            class663.method4793(arg1, true);
            class584.method4322(arg1, -92);
            if (class293.field4128) {
                System.out.println(field4144[8]);
            }
            if (~arg1.field9945 != ~arg2) {
                throw new RuntimeException(field4144[10] + arg1.field9945 + field4144[11] + arg2);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4144[12] + arg0 + ',' + (arg1 != null ? field4144[9] : field4144[7]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "g", descriptor = "(I)J", line = 76)
    public final long method2375(int arg0) {
        try {
            ++field4137;
            return arg0 != 19 ? 16L : Long.MAX_VALUE & super.field9630;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4144[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(I)V", line = 90)
    public final void method2376(int arg0) {
        try {
            int var2 = 0 % ((62 - arg0) / 55);
            ++field4132;
            super.field9630 = Long.MIN_VALUE & super.field9630 | 500L + class614.method4531(-101);
            class290.field4097.method3937(true, this);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4144[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "i", descriptor = "(I)V", line = 107)
    public static void method2377(int arg0) {
        try {
            field4141 = null;
            if (arg0 == 4707) {
                field4138 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4144[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "h", descriptor = "(I)V", line = 119)
    public final void method2378(int arg0) {
        try {
            super.field9630 |= Long.MIN_VALUE;
            ++field4143;
            if (this.method2375(19) == 0L) {
                class713.field10085.method3937(true, this);
            }
            if (arg0 >= -47) {
                this.field4136 = 46;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4144[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(IJ)V", line = 138)
    public class294(int arg0, long arg1) {
        try {
            super.field8378 = (long) arg0 << 56 | arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4144[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2379(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 87);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2380(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 80;
                    break;
                case 1:
                    var10005 = 98;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
