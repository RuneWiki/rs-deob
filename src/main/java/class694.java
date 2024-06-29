import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class694 extends class759 {

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9704 = new String[] { method4952(method4951("`Pn\n")), method4952(method4951("u\u000b,H`")), method4952(method4951("kU,*5")), method4952(method4951("kU,,5")), method4952(method4951("kU,+5")), method4952(method4951("kU,-5")) };

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "D")
    public static double field9692 = -1.0D;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field9697 = 0;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Luu;")
    public static class240 field9695 = new class240(8, 1);

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field9700 = 0;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field9701 = 0;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field9703 = -1;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Lsb;")
    public static class261 field9702 = new class261(5, -1);

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "[S")
    public static short[] field9694;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public static void method4947(int arg0) {
        try {
            if (arg0 == 0) {
                field9695 = null;
                field9694 = null;
                field9702 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9704[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Llga;Llga;Llga;Llga;B)V")
    public static final void method4948(class47 arg0, class47 arg1, class47 arg2, class47 arg3, byte arg4) {
        try {
            class33.field411 = arg3;
            if (arg4 <= 36) {
                field9701 = -97;
            }
            class169.field2159 = arg1;
            class745.field10573 = arg0;
            field9693++;
            class9.field117 = new class782[class169.field2159.method535((byte) -110)][];
            class443.field6542 = new boolean[class169.field2159.method535((byte) -110)];
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9704[2] + (arg0 == null ? field9704[0] : field9704[1]) + ',' + (arg1 == null ? field9704[0] : field9704[1]) + ',' + (arg2 == null ? field9704[0] : field9704[1]) + ',' + (arg3 == null ? field9704[0] : field9704[1]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLlq;Llq;IIZI)I")
    public static final int method4949(boolean arg0, class728 arg1, class728 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        try {
            field9698++;
            int var7 = class572.method4257(arg5, (byte) -116, arg1, arg3, arg2);
            if (var7 != 0) {
                return arg5 ? -var7 : var7;
            } else if (arg4 == -1) {
                return 0;
            } else if (arg6 >= -120) {
                return 87;
            } else {
                int var8 = class572.method4257(arg0, (byte) -120, arg1, arg4, arg2);
                return arg0 ? -var8 : var8;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field9704[4] + arg0 + ',' + (arg1 == null ? field9704[0] : field9704[1]) + ',' + (arg2 == null ? field9704[0] : field9704[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
    public static final void method4950(boolean arg0) {
        try {
            class341.field4966.method5607(-45);
            field9696++;
            class341.field4966.field11105 = 0;
            class341.field4966.field11113 = null;
            class341.field4966.field11106 = 0;
            class341.field4966.field11111 = null;
            class341.field4966.field11099.field9945 = 0;
            class341.field4966.field11112 = null;
            class341.field4966.field11103 = null;
            class179.field2331 = 0;
            class239.method1980(6977);
            class315.method2504((byte) -102);
            for (int var1 = 0; var1 < 2048; var1++) {
                class748.field10666[var1] = null;
            }
            class203.field2988 = null;
            for (int var2 = 0; var2 < class715.field10182; var2++) {
                class717 var3 = class677.field9494[var2].field7672;
                if (var3 != null) {
                    var3.field2219 = -1;
                }
            }
            class455.method3513(4);
            class596.field8579 = 1;
            class301.field4188 = -1;
            class171.field2267 = -1;
            if (arg0) {
                field9695 = null;
            }
            class699.method5035(11, 31754);
            for (int var4 = 0; var4 < 100; var4++) {
                class752.field10742[var4] = true;
            }
            class357.method2856(-31902);
            class558.field8118 = 0L;
            class299.field4174 = null;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9704[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4951(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4952(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
