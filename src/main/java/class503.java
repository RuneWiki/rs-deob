import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class503 extends class601 {

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "Ldh;")
    public static class320 field7064 = new class320(86, 8);

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "Lpia;")
    public static class94 field7068 = new class94(17, 8);

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "[Lfba;")
    public static class25[] field7070 = new class25[14];

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Lpia;")
    public static class94 field7071 = new class94(26, 8);

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "Lrb;")
    public static class352 field7072 = new class352();

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)I", line = 7)
    public final int method2982(int arg0) {
        int var2 = -2 % ((arg0 - -59) / 61);
        ++field7069;
        return super.field8565;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V", line = 17)
    public static void method2983(int arg0) {
        field7064 = null;
        field7072 = null;
        field7068 = null;
        field7071 = null;
        field7070 = null;
        if (arg0 != -31398) {
            field7068 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lgn;)V", line = 31)
    public class503(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/awt/Canvas;ZLoh;Ld;)Lha;", line = 38)
    public static final class58 method2984(int arg0, Canvas arg1, boolean arg2, class404 arg3, class150 arg4) {
        ++field7062;
        if (!class675.method3841((byte) 72)) {
            throw new RuntimeException("");
        } else if (!class79.method555(33, "jaggl")) {
            throw new RuntimeException("");
        } else {
            if (arg2) {
                field7071 = null;
            }
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg1, 8, 8, 8, 24, 0, arg0);
            if (~var6 == -1L) {
                throw new RuntimeException("");
            } else {
                class597 var8 = new class597(var5, arg1, var6, arg4, arg3, arg0);
                var8.method2297(-38);
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)I", line = 70)
    public final int method39(byte arg0) {
        ++field7059;
        if (arg0 != -17) {
            method2984(66, (Canvas) null, false, (class404) null, (class150) null);
        }
        return super.field8563.method3926(53) == class101.field1048 && super.field8563.method3930(19) ? 0 : 1;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V", line = 85)
    public static final void method2985(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < -4) {
            ++field7066;
            if (~class338.field4355 >= ~(-arg4 + arg3) && class744.field10385 >= arg3 + arg4 && ~class224.field2571 >= ~(-arg4 + arg2) && arg2 + arg4 <= class578.field8182) {
                class108.method744(arg2, arg4, (byte) -125, arg1, arg3);
            } else {
                class296.method1761(106, arg2, arg1, arg3, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B[S[Ljava/lang/String;)V", line = 103)
    public static final void method2986(byte arg0, short[] arg1, String[] arg2) {
        ++field7060;
        if (arg0 == -103) {
            class652.method3701(arg2.length - 1, arg2, (byte) 89, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(ILgn;)V", line = 115)
    public class503(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V", line = 118)
    public final void method35(byte arg0) {
        if (arg0 >= -37) {
            method2987(-20, 59, -3);
        }
        ++field7063;
        super.field8565 = this.method39((byte) -17);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)V", line = 129)
    public final void method40(int arg0, boolean arg1) {
        ++field7061;
        super.field8565 = arg0;
        if (arg1) {
            method2987(-69, -11, -62);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)I", line = 144)
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            return -73;
        } else {
            ++field7067;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V", line = 157)
    public static final void method2987(int arg0, int arg1, int arg2) {
        if (arg1 <= -52) {
            ++field7065;
            class47 var3 = class258.method1546(13, arg2, (byte) 121);
            var3.method271((byte) 127);
            var3.field507 = arg0;
        }
    }
}
