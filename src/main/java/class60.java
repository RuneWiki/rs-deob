import jaggl.OpenGL;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class60 extends class238 {

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field584 = -1;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "[I")
    public static int[] field585 = new int[4];

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "Ljava/awt/Image;")
    public static Image field588;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(BZ)V")
    public final void method345(byte arg0, boolean arg1) {
        super.field2988.method3083((byte) 78, this);
        if (arg0 != 116) {
            this.method345((byte) -104, true);
        }
        ++field583;
        OpenGL.glTexParameteri(super.field2973, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIII)V")
    public static final void method346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class611.field8872 = arg3;
        ++field587;
        class58.field543 = arg2;
        if (arg0 != 16383) {
            method347(-4);
        }
        class189.field2280 = arg1;
        class356.field4684 = arg4;
        class306.field3891 = arg5;
        if (class611.field8872 >= 100) {
            int var6 = class58.field543 * 128 + 64;
            int var7 = class306.field3891 * 128 + 64;
            int var8 = class426.method2400(arg0 + -16384, var7, var6, class442.field6099) - class356.field4684;
            int var9 = -class286.field3729 + var6;
            int var10 = -class521.field7321 + var8;
            int var11 = -class39.field303 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class482.field6748 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var10, (double) var12));
            class168.field2055 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 16383;
            if (class482.field6748 < 1024) {
                class482.field6748 = 1024;
            }
            class263.field3390 = 0;
            if (~class482.field6748 < -3073) {
                class482.field6748 = 3072;
            }
        }
        class617.field8931 = 2;
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
    public static void method347(int arg0) {
        field588 = null;
        field585 = null;
        if (arg0 < 88) {
            method347(6);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public final void method112(byte arg0) {
        if (arg0 == 53) {
            ++field582;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lmh;II[BI)V")
    public class60(class537 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field586 = arg2;
        super.field2988.method3083((byte) 74, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2973, 0, super.field2990, this.field586, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1358((byte) 103, true);
    }
}
