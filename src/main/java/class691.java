import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class691 extends class160 {

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
    private int field9666;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
    private int field9670;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
    private int field9672;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "I")
    private int field9669;

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9675 = new String[] { method4936(method4935("Tf\u0018\u0019\u001a\r")), method4936(method4935("Tf\u0018\u0019\u001f\r")), method4936(method4935("Tf\u0018\u0019\u001e\r")), method4936(method4935("Tf\u0018\u0019\u001c\r")), method4936(method4935("Tf\u0018\u0019\u001b\r")), method4936(method4935("Tf\u0018\u0019eLj\u0010Cg\r")), method4936(method4935("Tf\u0018\u0019\u001d\r")) };

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "Lmv;")
    public static class125 field9664 = new class125(0, 0);

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "Lsb;")
    public static class261 field9671 = new class261(103, 1);

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "I")
    public static int field9668;

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "Llga;")
    public static class47 field9674;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BZI)V", line = 4)
    public static final void method4932(byte arg0, boolean arg1, int arg2) {
        try {
            if (arg0 > 104) {
                ++field9665;
                class375 var3 = class279.method2276(arg1, 0, arg2);
                if (var3 != null) {
                    var3.method4294(0);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9675[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(III)V", line = 21)
    public final void method1350(int arg0, int arg1, int arg2) {
        try {
            ++field9663;
            int var4 = this.field9666 * arg0 >> 12;
            int var5 = this.field9670 * arg0 >> 12;
            if (arg1 == 5781) {
                int var6 = this.field9669 * arg2 >> 12;
                int var7 = this.field9672 * arg2 >> 12;
                class57.method604(var5, 22792, var6, var7, var4, super.field2050);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9675[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(IIIIIII)V", line = 41)
    public class691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        try {
            this.field9666 = arg0;
            this.field9670 = arg2;
            this.field9672 = arg3;
            this.field9669 = arg1;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9675[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V", line = 54)
    public static final void method4933(byte arg0) {
        try {
            ++field9668;
            int var1 = 0;
            if (arg0 <= 113) {
                method4934((byte) -40);
            }
            for (int var2 = 0; ~var2 > ~class625.field8929; ++var2) {
                for (int var3 = 0; ~class14.field187 < ~var3; ++var3) {
                    if (class434.method3378(class608.field8715, true, var1, var2, var3, 107)) {
                        ++var1;
                    }
                    if (var1 >= 512) {
                        return;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9675[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)V", line = 90)
    public static void method4934(byte arg0) {
        try {
            field9671 = null;
            field9664 = null;
            if (arg0 == -70) {
                field9674 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9675[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIB)V", line = 105)
    public final void method1348(int arg0, int arg1, byte arg2) {
        try {
            ++field9673;
            int var4 = this.field9666 * arg0 >> 12;
            int var5 = this.field9670 * arg0 >> 12;
            if (arg2 <= 13) {
                field9671 = null;
            }
            int var6 = this.field9669 * arg1 >> 12;
            int var7 = this.field9672 * arg1 >> 12;
            class239.method1978(var4, super.field2051, var5, super.field2049, (byte) 17, super.field2050, var7, var6);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9675[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V", line = 124)
    public final void method1349(int arg0, int arg1, int arg2) {
        try {
            ++field9667;
            int var4 = this.field9666 * arg1 >> 12;
            int var5 = this.field9670 * arg1 >> 12;
            if (arg0 == 3289650) {
                int var6 = this.field9669 * arg2 >> 12;
                int var7 = this.field9672 * arg2 >> 12;
                class329.method2584(98, var4, var7, var5, super.field2051, super.field2049, var6);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9675[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4935(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 89);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4936(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
