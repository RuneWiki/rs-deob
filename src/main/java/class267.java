import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class267 extends class203 implements class5 {

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "[Lna;")
    public static class320[] field3413 = new class320[14];

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3416 = new Rectangle[100];

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "Lkm;")
    public static class120 field3415;

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lph;IZ[[I)V")
    public class267(class442 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class532.field7430, class280.field3663, arg1 * 6 * arg1, arg2);
        super.field2672.method3344(29639, this);
        if (arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                this.method1300(false, arg3[var5], arg1, arg1, 34069 - -var5);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, this.method1301(34843), arg1, arg1, 0, class562.method3158((byte) 4, super.field2656), super.field2672.field6096, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(III)Z")
    public static final boolean method1641(int arg0, int arg1, int arg2) {
        ++field3414;
        if (arg1 != 34069) {
            field3413 = null;
        }
        return class195.method1248(-67, arg2, arg0) & class529.method2952(arg0, -1, arg2);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
    public static void method1642(byte arg0) {
        field3413 = null;
        field3416 = null;
        field3415 = null;
        int var1 = 114 / ((-46 - arg0) / 61);
    }
}
