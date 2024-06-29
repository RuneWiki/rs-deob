import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class637 extends class602 implements class542 {

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    private int field9015;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    private int field9018;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    private int field9016;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field9019 = new String[] { method4644(method4643("\u0004H\u0010<\u0000")), method4644(method4643("\u000bOR\u0014")), method4644(method4643("\u0004H\u00109\u0000")), method4644(method4643("\u001e\u0014\u0010VU")), method4644(method4643("\u0004H\u0010;\u0000")), method4644(method4643("\u0004H\u0010DA\u000bSJF\u0000")), method4644(method4643("\u0004H\u0010:\u0000")) };

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "[Ltha;")
    public static class296[] field9013;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lha;I)V")
    public static final void method4639(class18 arg0, int arg1) {
        try {
            ++field9014;
            if (arg1 == 0) {
                if (!class86.field1217) {
                    class380.method3002(arg1 + -25433, arg0);
                } else {
                    class687.method4913(arg0, 3);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9019[4] + (arg0 != null ? field9019[3] : field9019[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Ldga;Lhh;III[B)V")
    public class637(class713 arg0, class250 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class496.field7281, arg3 * arg4 * arg2, false);
        try {
            this.field9015 = arg2;
            this.field9018 = arg3;
            this.field9016 = arg4;
            super.field8615.method2668(24, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage3Dub(super.field8634, 0, this.method4454(false), this.field9015, this.field9018, this.field9016, 0, class341.method2740((byte) 56, super.field8635), 5121, arg5, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field9019[5] + (arg0 != null ? field9019[3] : field9019[1]) + ',' + (arg1 != null ? field9019[3] : field9019[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9019[3] : field9019[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method4640(String arg0, byte arg1) {
        try {
            if (arg1 == 89) {
                ++field9011;
                System.exit(1);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9019[2] + (arg0 != null ? field9019[3] : field9019[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIII)V")
    public static final void method4641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            int var7 = 30 / ((-21 - arg3) / 48);
            ++field9017;
            if (~class451.field6612.field9106.method2498(3) != -1 && arg2 != 0 && class347.field5048 < 50 && arg4 != -1) {
                class759.field10834[class347.field5048++] = new class441((byte) 1, arg4, arg2, arg0, arg1, arg5, arg6, (class202) null);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9019[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public static void method4642(int arg0) {
        try {
            field9013 = null;
            if (arg0 != -118) {
                method4641(41, -99, -44, 62, 103, -13, 33);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9019[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4643(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4644(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 101;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
