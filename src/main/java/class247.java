import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class247 {

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public int field3585 = 128;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public int field3594 = 128;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Leda;")
    public static class116 field3586 = new class116(96, 6);

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public int field3588;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public int field3590;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public int field3595;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public int field3600;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([Lsk;BLad;)Lig;")
    public static final class124 method1586(class446[] arg0, byte arg1, class669 arg2) {
        if (arg1 != 78) {
            method1587(114);
        }
        field3596++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field6453 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field6453);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class619.field8829, 0);
        if (class619.field8829[0] == 0) {
            if (class619.field8829[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class619.field8829, 1);
            if (class619.field8829[1] > 1) {
                byte[] var7 = new byte[class619.field8829[1]];
                OpenGL.glGetInfoLogARB(var4, class619.field8829[1], class619.field8829, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class619.field8829[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field6453);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class124(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public static void method1587(int arg0) {
        if (arg0 == -1) {
            field3586 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    public static final void method1588(int arg0) {
        field3592++;
        int var1 = class525.field7713.method3473(class76.field1182, -19799);
        if (arg0 >= -95) {
            field3586 = null;
        }
        if (var1 == 0) {
            class468.field6756 = null;
            class445.method2600(-1, 0);
        } else if (var1 == 1) {
            class150.method1142((byte) 0, (byte) 7);
            class445.method2600(-1, 512);
            if (class548.field8052 != null) {
                class552.method3234(0);
            }
        } else {
            class150.method1142((byte) (client.field1377 - 4 & 0xFF), (byte) 7);
            class445.method2600(-1, 2);
        }
        class84.field1271 = class416.field5926;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLos;)V")
    public final void method1589(byte arg0, class247 arg1) {
        this.field3599 = arg1.field3599;
        this.field3585 = arg1.field3585;
        this.field3594 = arg1.field3594;
        if (arg0 < 20) {
            this.field3598 = 77;
        }
        field3589++;
        this.field3597 = arg1.field3597;
        this.field3601 = arg1.field3601;
        this.field3602 = arg1.field3602;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lwv;ILjava/awt/Frame;)V")
    public static final void method1590(class705 arg0, int arg1, Frame arg2) {
        if (arg1 != -2) {
            method1588(93);
        }
        while (true) {
            class614 var3 = arg0.method3954(119, arg2);
            while (var3.field8787 == 0) {
                class564.method3300((byte) -113, 10L);
            }
            if (var3.field8787 == 1) {
                field3591++;
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class564.method3300((byte) -59, 100L);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)Los;")
    public final class247 method1591(byte arg0) {
        field3593++;
        if (arg0 < 27) {
            this.method1591((byte) -28);
        }
        return new class247(this.field3601, this.field3594, this.field3585, this.field3599, this.field3597, this.field3602);
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)[Lkq;")
    public static final class696[] method1592(int arg0) {
        if (arg0 != 0) {
            field3586 = null;
        }
        field3587++;
        return new class696[] { class258.field3707, class37.field491, class583.field8543, class584.field8558, class152.field2540, class126.field2066, class694.field9863, class329.field4557, class333.field4636, class484.field6905 };
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V")
    public class247(int arg0) {
        this.field3601 = arg0;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIIII)V")
    private class247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3585 = arg2;
        this.field3602 = arg5;
        this.field3599 = arg3;
        this.field3594 = arg1;
        this.field3601 = arg0;
        this.field3597 = arg4;
    }
}
