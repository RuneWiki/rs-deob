import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class432 extends class354 {

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "I")
    public static int field5768 = 13156520;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "[[I")
    public static int[][] field5765;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        ++field5771;
        if (arg0 != 6384) {
            field5765 = null;
        }
        if (super.field4544.method4149((byte) 33)) {
            super.field4545 = 0;
        }
        if (super.field4545 < 0 && ~super.field4545 < -3) {
            super.field4545 = this.method393((byte) 119);
        }
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lwo;)V")
    public class432(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(CLjava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2469(char arg0, String arg1, String arg2, byte arg3) {
        ++field5770;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = var4;
        int var7 = var5 + -1;
        if (~var7 != -1) {
            int var8 = 0;
            while (true) {
                var8 = arg1.indexOf(arg0, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                ++var8;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        if (arg3 != 101) {
            method2469((char) 65431, (String) null, (String) null, (byte) 81);
        }
        while (true) {
            int var11 = arg1.indexOf(arg0, var10);
            if (~var11 > -1) {
                var9.append(arg1.substring(var10));
                return var9.toString();
            }
            var9.append(arg1.substring(var10, var11));
            var9.append(arg2);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        int var2 = -68 % ((arg0 - 37) / 63);
        ++field5767;
        return 1;
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field5764;
        if (super.field4544.method4149((byte) 33)) {
            return 3;
        } else {
            if (arg0 != 3) {
                field5765 = null;
            }
            return ~arg1 != -1 && super.field4544.field10405.method3198((byte) 95) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)I")
    public final int method2470(byte arg0) {
        ++field5769;
        int var2 = 97 / ((7 - arg0) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)Z")
    public final boolean method2471(int arg0) {
        ++field5763;
        int var2 = 42 / ((arg0 - -34) / 41);
        return !super.field4544.method4149((byte) 33);
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(ILwo;)V")
    public class432(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method393((byte) 48);
        }
        super.field4545 = arg1;
        ++field5766;
    }

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "(I)V")
    public static final void method2472(int arg0) {
        class417.field5308 = new class339(8);
        ++field5762;
        class686.field9558 = 0;
        for (class509 var1 = (class509) class259.field3282.method162(arg0 ^ -18125); var1 != null; var1 = (class509) class259.field3282.method158(false)) {
            var1.method2975();
        }
        if (arg0 != 4588) {
            field5768 = -82;
        }
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(B)V")
    public static void method2473(byte arg0) {
        if (arg0 >= 43) {
            field5765 = null;
        }
    }
}
