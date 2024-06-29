import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class248 extends class319 {

    @OriginalMember(owner = "client!ffa", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field3562 = new String[] { method2026(method2025(") \\)\u000bg")), method2026(method2025(") \\)\ng")), method2026(method2025(") \\)\u000eg")), method2026(method2025(") \\)\u000fg")), method2026(method2025(") \\)\fg")) };

    @OriginalMember(owner = "client!ffa", name = "L", descriptor = "Luu;")
    public static class240 field3553 = new class240(7, 2);

    @OriginalMember(owner = "client!ffa", name = "J", descriptor = "Lsb;")
    public static class261 field3558 = new class261(97, -1);

    @OriginalMember(owner = "client!ffa", name = "D", descriptor = "Lfs;")
    public static class796 field3561 = new class796(method2026(method2025("('Pb~")), method2026(method2025("\b'Pbm|")), 2);

    @OriginalMember(owner = "client!ffa", name = "N", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ffa", name = "M", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ffa", name = "K", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ffa", name = "E", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ffa", name = "I", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!ffa", name = "H", descriptor = "Lnha;")
    public class335 field3559;

    @OriginalMember(owner = "client!ffa", name = "G", descriptor = "Ltb;")
    public static class392 field3560;

    @OriginalMember(owner = "client!ffa", name = "F", descriptor = "Lnba;")
    public static class78 field3552;

    @OriginalMember(owner = "client!ffa", name = "C", descriptor = "[B")
    public byte[] field3556;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZIII)V", line = 3)
    public static final void method2020(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        try {
            if (!arg1) {
                field3558 = null;
            }
            ++field3551;
            if (arg4 - arg3 >= class335.field4844 && ~(arg4 - -arg3) >= ~class507.field7453 && class557.field8113 <= -arg3 + arg2 && ~class50.field717 <= ~(arg2 + arg3)) {
                class737.method5349(arg0, arg3, arg2, arg1, arg4);
            } else {
                class791.method5702(arg4, arg0, arg2, (byte) -23, arg3);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3562[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "(I)V", line = 28)
    public static void method2021(int arg0) {
        try {
            if (arg0 != 100) {
                method2024('\u007f', (byte) -50);
            }
            field3552 = null;
            field3561 = null;
            field3558 = null;
            field3560 = null;
            field3553 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3562[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "(I)I", line = 44)
    public final int method2022(int arg0) {
        try {
            if (arg0 != 100) {
                return 76;
            } else {
                ++field3554;
                return super.field4364 ? 0 : 100;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3562[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "(I)[B", line = 58)
    public final byte[] method2023(int arg0) {
        try {
            ++field3550;
            if (super.field4364) {
                throw new RuntimeException();
            } else {
                if (arg0 != 97) {
                    field3553 = null;
                }
                return this.field3556;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3562[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(CB)Z", line = 83)
    public static final boolean method2024(char arg0, byte arg1) {
        try {
            ++field3555;
            if (arg1 < 10) {
                method2021(-57);
            }
            return ~arg0 <= -49 && ~arg0 >= -58 || arg0 >= 'A' && ~arg0 >= -91 || arg0 >= 'a' && arg0 <= 'z';
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3562[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2025(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2026(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
