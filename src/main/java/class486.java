import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class486 extends class46 implements class482 {

    @OriginalMember(owner = "client!vq", name = "G", descriptor = "I")
    private int field6994 = -1;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
    private int field7000 = -1;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
    public int field6996;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public int field6999;

    @OriginalMember(owner = "client!vq", name = "I", descriptor = "I")
    private int field6995;

    @OriginalMember(owner = "client!vq", name = "H", descriptor = "Lffa;")
    private class197 field7001;

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
    private int field7006;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    private int field7004;

    @OriginalMember(owner = "client!vq", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field7012 = new String[] { method3698(method3697("cmxl`{u\"n!")), method3698(method3697("{i:<")), method3698(method3697("n2x~t")), method3698(method3697("cmx\u0019!")), method3698(method3697("cmx\u001a!")), method3698(method3697("cmx\u001b!")), method3698(method3697("cmx\u0017!")), method3698(method3697("cmx\u0016!")), method3698(method3697("cmx6`{}:9sp4")), method3698(method3697("cmx\u0018!")) };

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "Lwia;")
    public static class790 field7007 = new class790(69, -1);

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "[F")
    public static float[] field7009 = new float[4];

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    public static int field7010 = 0;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field7011 = 0;

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)Z", line = 3)
    public static final boolean method3692(int arg0) {
        try {
            field6998++;
            try {
                if (arg0 != 9804) {
                    method3695(-23);
                }
                class128 var1 = new class128();
                byte[] var2 = var1.method1118(-51, class437.field6422);
                class247.method2111(4699, var2);
                return true;
            } catch (Exception var4) {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7012[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lffa;III)V", line = 151)
    public class486(class197 arg0, int arg1, int arg2, int arg3) {
        try {
            this.field6996 = arg2;
            this.field6999 = arg3;
            this.field6995 = arg1;
            this.field7001 = arg0;
            OpenGL.glGenRenderbuffersEXT(1, class102.field1129, 0);
            this.field7006 = class102.field1129[0];
            OpenGL.glBindRenderbufferEXT(36161, this.field7006);
            OpenGL.glRenderbufferStorageEXT(36161, this.field6995, this.field6996, this.field6999);
            this.field7004 = this.field6999 * this.field6996 * this.field7001.method1709(this.field6995, -6403);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7012[0] + (arg0 == null ? field7012[1] : field7012[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lffa;IIII)V", line = 170)
    public class486(class197 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field6996 = arg2;
            this.field7001 = arg0;
            this.field6999 = arg3;
            this.field6995 = arg1;
            OpenGL.glGenRenderbuffersEXT(1, class102.field1129, 0);
            this.field7006 = class102.field1129[0];
            OpenGL.glBindRenderbufferEXT(36161, this.field7006);
            OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6995, this.field6996, this.field6999);
            this.field7004 = this.field6999 * this.field6996 * this.field7001.method1709(this.field6995, -6403);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7012[0] + (arg0 == null ? field7012[1] : field7012[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)V", line = 33)
    public final void method3693(int arg0, int arg1, int arg2) {
        try {
            field7005++;
            OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.field7006);
            if (arg2 >= 123) {
                this.field6994 = arg0;
                this.field7000 = arg1;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7012[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(B)V", line = 46)
    public static void method3694(byte arg0) {
        try {
            if (arg0 == -126) {
                field7009 = null;
                field7007 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7012[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "finalize", descriptor = "()V", line = 60)
    protected final void finalize() throws Throwable {
        try {
            this.method3696(true);
            field7008++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7012[8] + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V", line = 73)
    public static final void method3695(int arg0) {
        try {
            field6997++;
            class320.field5054 = null;
            if (class235.field3549 && class451.method3463(1) != 1) {
                class375.method3022(class185.method1616(arg0 ^ 0x62), 10, 0, class138.field1645 == 3 || class138.field1645 == 7, class771.method5582((byte) -124), 0);
            }
            int var1 = 0;
            int var2 = 0;
            if (class235.field3549) {
                var1 = class398.method3141(1);
                var2 = class779.method5635((byte) 32);
            }
            class593.method4418(arg0, var2, var1, class94.field1062 + var2, var1 - -class179.field2489, var2, class742.field10801, -1, var1);
            if (class320.field5054 != null) {
                class726.method5288(class320.field5054, class94.field1062 + var2, class179.field2489 + var1, class252.field3907, class533.field7816.field7993, -1412584499, 35, true, class90.field1022, var1, var2);
                class320.field5054 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7012[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)V", line = 104)
    public final void method3696(boolean arg0) {
        try {
            if (this.field7006 > 0) {
                this.field7001.method1692(this.field7004, this.field7006, -24185);
                this.field7006 = 0;
            }
            field7002++;
            if (!arg0) {
                this.field7006 = -119;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7012[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V", line = 123)
    public final void method705(int arg0) {
        try {
            field7003++;
            OpenGL.glFramebufferRenderbufferEXT(this.field6994, this.field7000, 36161, 0);
            if (arg0 > -115) {
                field7009 = null;
            }
            this.field6994 = -1;
            this.field7000 = -1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7012[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3697(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3698(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 28;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
