import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class302 extends class407 implements class519 {

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    private int field4473;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    private int field4469;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    private int field4475;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "Z")
    public static boolean field4467 = false;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field4472 = -1;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Lfc;")
    public static class235 field4468 = new class235(67, -2);

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Lxa;")
    public static class461 field4470;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V", line = 5)
    public static final void method1865(boolean arg0, int arg1) {
        ++field4474;
        if (arg0) {
            class679 var2 = class669.method3708(14, arg1, 1403048928);
            var2.method3749(-35);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILuea;)V", line = 26)
    public static final void method1866(int arg0, class286 arg1) {
        ++field4471;
        if (arg0 != -27495) {
            method1868(false);
        }
        class572 var2 = (class572) class231.field3288.method2061(arg0 + 10190, (long) arg1.field6388);
        if (var2 != null) {
            if (var2.field7702 != null) {
                class135.field1907.method3309(var2.field7702);
                var2.field7702 = null;
            }
            var2.method2971(1);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 54)
    public static void method1867(boolean arg0) {
        field4468 = null;
        if (!arg0) {
            method1865(true, 59);
        }
        field4470 = null;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lmc;Lkf;III[B)V", line = 66)
    public class302(class120 arg0, class229 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class82.field1147, arg2 * arg3 * arg4, false);
        this.field4473 = arg3;
        this.field4469 = arg4;
        this.field4475 = arg2;
        super.field5749.method3232(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5733, 0, this.method2322(false), this.field4475, this.field4473, this.field4469, 0, class422.method2400((byte) 61, super.field5740), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(Z)I", line = 83)
    public static final int method1868(boolean arg0) {
        ++field4476;
        class638 var1 = class630.field8790;
        boolean var2 = false;
        if (class429.field6020 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class638.method3556(0, (byte) -48, var3, 0, (class132) null, (class489) null);
            var2 = true;
        }
        long var4 = class680.method3756(-111);
        for (int var6 = 0; ~var6 > -10001; ++var6) {
            var1.method384(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (-var4 + class680.method3756(-45));
        var1.method3558((byte) 59, 0, -16777216, 100, 100, 0);
        if (var2) {
            var1.method3554(true);
        }
        return !arg0 ? 6 : var7;
    }
}
