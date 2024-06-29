import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class667 {

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Lffa;")
    public class197 field9700;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Z")
    private boolean field9699;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    private int field9692;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    private int field9695;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public int field9696;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9703 = new String[] { method4915(method4914("\u000b\u000bw\u0017z")), method4915(method4914("\u000b\u000bwf;\u0006\t-dz")), method4915(method4914("\u0013Nwt/")), method4915(method4914("\u0006\u001556")), method4915(method4914("\u000b\u000bw\u0011z")), method4915(method4914("\u000b\u000bw<;\u0006\u000153(\rH")), method4915(method4914("\u000b\u000bw\u0010z")), method4915(method4914("\u000b\u000bw\u0016z")) };

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Leu;")
    public static class505 field9691 = new class505(1);

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "F")
    public static float field9701;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field9702;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
    public abstract void method456(boolean arg0);

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public static final void method4910(int arg0) {
        try {
            class534.field7826 = new class305[50];
            field9698++;
            if (arg0 == -26130) {
                class86.field958 = 0;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9703[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            this.field9700.method1759(this.field9696, 5888, this.field9692);
            field9690++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9703[5] + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)I")
    public static final int method4911(byte arg0, int arg1) {
        try {
            int var2 = 107 / ((-arg0 - 64) / 37);
            field9694++;
            return arg1 & 0xFF;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9703[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B[BI)V")
    public final void method4912(byte arg0, byte[] arg1, int arg2) {
        try {
            field9693++;
            this.method456(false);
            int var4 = 57 / ((35 - arg0) / 37);
            if (arg2 > this.field9692) {
                OpenGL.glBufferDataARBub(this.field9695, arg2, arg1, 0, this.field9699 ? 35040 : 35044);
                this.field9700.field2868 += arg2 - this.field9692;
                this.field9692 = arg2;
            } else {
                OpenGL.glBufferSubDataARBub(this.field9695, 0, arg2, arg1, 0);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9703[4] + arg0 + ',' + (arg1 == null ? field9703[3] : field9703[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
    public static void method4913(byte arg0) {
        try {
            field9691 = null;
            int var1 = -69 % ((arg0 + 43) / 38);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9703[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lffa;I[BIZ)V")
    public class667(class197 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        try {
            this.field9700 = arg0;
            this.field9699 = arg4;
            this.field9692 = arg3;
            this.field9695 = arg1;
            OpenGL.glGenBuffersARB(1, class715.field10343, 0);
            this.field9696 = class715.field10343[0];
            this.method456(false);
            OpenGL.glBufferDataARBub(arg1, this.field9692, arg2, 0, this.field9699 ? 35040 : 35044);
            this.field9700.field2868 += this.field9692;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9703[1] + (arg0 == null ? field9703[3] : field9703[2]) + ',' + arg1 + ',' + (arg2 == null ? field9703[3] : field9703[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lffa;ILjaclib/memory/Buffer;IZ)V")
    public class667(class197 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        try {
            this.field9695 = arg1;
            this.field9699 = arg4;
            this.field9692 = arg3;
            this.field9700 = arg0;
            OpenGL.glGenBuffersARB(1, class715.field10343, 0);
            this.field9696 = class715.field10343[0];
            this.method456(false);
            OpenGL.glBufferDataARBa(arg1, this.field9692, arg2.getAddress(), this.field9699 ? 35040 : 35044);
            this.field9700.field2868 += this.field9692;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9703[1] + (arg0 == null ? field9703[3] : field9703[2]) + ',' + arg1 + ',' + (arg2 == null ? field9703[3] : field9703[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4914(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4915(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 104;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
