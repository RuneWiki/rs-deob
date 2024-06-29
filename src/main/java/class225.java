import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class225 extends class621 implements class585 {

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    private int field2818;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "Lrga;")
    public static class280 field2813 = new class280(77, -1);

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Lbc;", line = 3)
    public static final class669 method1352(int arg0) {
        ++field2812;
        try {
            return new class118();
        } catch (Throwable var2) {
            try {
                return (class669) Class.forName("ne").newInstance();
            } catch (Throwable var1) {
                return arg0 != 15902 ? null : new class471();
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZI)Z", line = 26)
    public static final boolean method1353(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        } else {
            ++field2819;
            return ~(arg2 & 32) != -1;
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lqj;ILjaclib/memory/Buffer;)V", line = 37)
    public class225(class548 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field2818 = arg1;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V", line = 45)
    public static final void method1354(byte arg0) {
        class145 var1 = (class145) class1.field7.method237(107);
        int var2 = 29 / ((-51 - arg0) / 38);
        while (var1 != null) {
            if (class323.method1851(var1.field1873, 49)) {
                class112.method626(-30036, var1);
            }
            var1 = (class145) class1.field7.method245((byte) 84);
        }
        ++field2816;
        if (class463.field5904 == 1) {
            class670.method3764(-8234);
        } else {
            class51.method328(class672.field9461, class88.field1231, class50.field720, (byte) 31, class219.field2680);
            int var3 = class546.field7269.method3269((byte) 99, class83.field1132.method476((byte) -99, class250.field3068));
            for (class145 var4 = (class145) class1.field7.method237(96); var4 != null; var4 = (class145) class1.field7.method245((byte) 36)) {
                int var5 = class199.method1205(25322, var4);
                if (var3 < var5) {
                    var3 = var5;
                }
            }
            class50.field720 = (!class9.field186 ? 22 : 26) + class463.field5904 * 16;
            class672.field9461 = var3 + 8;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B[BLlm;I)Lml;", line = 97)
    public static final class36 method1355(byte arg0, byte[] arg1, class337 arg2, int arg3) {
        ++field2820;
        if (arg1 == null) {
            return null;
        } else if (arg0 < 94) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg3, var4);
            OpenGL.glProgramRawARB(arg3, 34933, arg1);
            OpenGL.glGetIntegerv(34379, class431.field5397, 0);
            if (~class431.field5397[0] != 0) {
                OpenGL.glBindProgramARB(arg3, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg3, 0);
                return new class36(arg2, arg3, var4);
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)I", line = 128)
    public final int method828(int arg0) {
        ++field2817;
        return arg0 != 13003 ? 87 : 0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)J", line = 140)
    public final long method825(byte arg0) {
        ++field2814;
        int var2 = 58 % ((arg0 - -48) / 35);
        return super.field8673.getAddress();
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([BIIB)V", line = 155)
    public final void method829(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -80) {
            this.method829((byte[]) null, 117, 49, (byte) -52);
        }
        this.method3406(arg0, arg1);
        ++field2815;
        this.field2818 = arg2;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V", line = 168)
    public static void method1356(int arg0) {
        if (arg0 == 30987) {
            field2813 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lqj;I[BI)V", line = 178)
    public class225(class548 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2818 = arg1;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)I", line = 186)
    public final int method824(int arg0) {
        if (arg0 != 30991) {
            return 87;
        } else {
            ++field2811;
            return this.field2818;
        }
    }
}
