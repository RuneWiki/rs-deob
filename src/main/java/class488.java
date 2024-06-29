import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class488 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lda;")
    public class216 field7156 = null;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lcd;")
    public class161 field7159 = null;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7162 = new String[] { method3762(method3761("I?^K")), method3762(method3761("B/\u001c\u001b;I#F\u0019z")), method3762(method3761("\\d\u001c\t/")), method3762(method3761("B/\u001cez")), method3762(method3761("B/\u001cbz")), method3762(method3761("B/\u001cfz")), method3762(method3761("B/\u001ccz")), method3762(method3761("B/\u001cdz")) };

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "[I")
    public static int[] field7155 = new int[1];

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZ[B)V", line = 3)
    public static final void method3756(boolean arg0, boolean arg1, byte[] arg2) {
        try {
            if (arg1) {
                field7155 = null;
            }
            field7160++;
            if (class578.field8372 == null) {
                class578.field8372 = new class711(20000);
            }
            class578.field8372.method5086(0, arg2, arg2.length, -2);
            if (arg0) {
                class539.method4088(class578.field8372.field9996, 985);
                class390.field5689 = new class728[class353.field5119];
                int var3 = 0;
                for (int var4 = class391.field5713; var4 <= class631.field8968; var4++) {
                    class728 var5 = class378.method2990(var4, (byte) 75);
                    if (var5 != null) {
                        class390.field5689[var3++] = var5;
                    }
                }
                class242.field3481 = false;
                class56.field785 = class614.method4531(-93);
                class578.field8372 = null;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7162[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7162[0] : field7162[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V", line = 49)
    public static final void method3757(int arg0, boolean arg1) {
        try {
            field7157++;
            class742.field10549.method733(class349.field5060.method129());
            int[] var2 = class349.field5060.method157();
            class788.field11372 = var2[0];
            if (arg0 >= -57) {
                field7155 = null;
            }
            class126.field1583 = var2[2];
            class44.field640 = var2[3];
            class132.field1632 = var2[1];
            if (arg1) {
                class349.field5060.method233(class783.field11303, class703.field9831, class340.field4951, class800.field11633);
                class271.method2219(class124.field1568, -8546);
            } else {
                class349.field5060.method233(class283.field3983, class581.field8397, class319.field4358, class151.field1935);
                class271.method2219(class463.field6760, -8546);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7162[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 77)
    public static void method3758(int arg0) {
        try {
            field7155 = null;
            if (arg0 > -115) {
                method3760((byte) 113, null);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7162[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)[Lgia;", line = 91)
    public static final class173[] method3759(byte arg0) {
        try {
            if (arg0 > -48) {
                field7155 = null;
            }
            field7161++;
            return new class173[] { class714.field10153, class601.field8609, class490.field7184 };
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7162[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B[S)[S", line = 103)
    public static final short[] method3760(byte arg0, short[] arg1) {
        try {
            if (arg0 < 78) {
                method3760((byte) -121, null);
            }
            field7158++;
            if (arg1 == null) {
                return null;
            } else {
                short[] var2 = new short[arg1.length];
                class569.method4241(arg1, 0, var2, 0, arg1.length);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7162[4] + arg0 + ',' + (arg1 == null ? field7162[0] : field7162[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lda;)V", line = 130)
    public class488(class216 arg0) {
        try {
            this.field7156 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7162[1] + (arg0 == null ? field7162[0] : field7162[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lda;Lcd;)V", line = 137)
    public class488(class216 arg0, class161 arg1) {
        try {
            this.field7156 = arg0;
            this.field7159 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7162[1] + (arg0 == null ? field7162[0] : field7162[2]) + ',' + (arg1 == null ? field7162[0] : field7162[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3761(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3762(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
