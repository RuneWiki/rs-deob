import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class693 extends class518 {

    @OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
    private int field9690;

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field9691 = new String[] { method4946(method4945("-\u0014\u001a\"\u001b")), method4946(method4945("'H\u001aON")), method4946(method4945("8OX`")), method4946(method4945("'H\u001aKN")), method4946(method4945("'H\u001a0\u000f8S@2N")), method4946(method4945("'H\u001aNN")) };

    @OriginalMember(owner = "client!qr", name = "D", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!qr", name = "E", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!qr", name = "G", descriptor = "[I")
    public static int[] field9685;

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I)V", line = 3)
    public class693(int arg0) {
        super(0, true);
        this.field9690 = 4096;
        try {
            this.field9690 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9691[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjc;I)V", line = 15)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field9687;
            if (~arg0 == -1) {
                this.field9690 = (arg1.method5128(0) << 12) / 255;
            }
            if (arg2 != -3) {
                this.method17(-52, (class711) null, -109);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9691[1] + arg0 + ',' + (arg1 != null ? field9691[0] : field9691[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "(I)V", line = 42)
    public static void method4943(int arg0) {
        try {
            if (arg0 >= -98) {
                method4943(-52);
            }
            field9685 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9691[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)[I", line = 52)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field9688;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = 6 / ((arg1 - -57) / 55);
            if (super.field7564.field8652) {
                class569.method4243(var3, 0, class110.field1436, this.field9690);
            }
            return var3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9691[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIILgb;Lgb;)V", line = 75)
    public static final void method4944(int arg0, int arg1, int arg2, class571 arg3, class571 arg4) {
        class621 var5 = class598.method4412(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field8842 = arg3;
            var5.field8845 = arg4;
            int var6 = class677.field9474 == class107.field1413 ? 1 : 0;
            if (arg3.method582(false)) {
                if (arg3.method579(false)) {
                    arg3.field2977 = class210.field3050[var6];
                    class210.field3050[var6] = arg3;
                } else {
                    arg3.field2977 = class563.field8239[var6];
                    class563.field8239[var6] = arg3;
                    class710.field9925 = true;
                }
            } else {
                arg3.field2977 = class391.field5707[var6];
                class391.field5707[var6] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method582(false)) {
                    if (arg4.method579(false)) {
                        arg4.field2977 = class210.field3050[var6];
                        class210.field3050[var6] = arg4;
                        return;
                    }
                    arg4.field2977 = class563.field8239[var6];
                    class563.field8239[var6] = arg4;
                    class710.field9925 = true;
                    return;
                }
                arg4.field2977 = class391.field5707[var6];
                class391.field5707[var6] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V", line = 132)
    public class693() {
        this(4096);
    }

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4945(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 102);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4946(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 86;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 12;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
