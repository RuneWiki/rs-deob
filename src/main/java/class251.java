import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class251 extends class13 implements class713 {

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    private int field3624 = -1;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    private int field3625 = -1;

    @OriginalMember(owner = "client!kw", name = "H", descriptor = "I")
    public int field3634;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "Lqo;")
    private class22 field3626;

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
    private int field3629;

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "I")
    private int field3631;

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
    private int field3633;

    @OriginalMember(owner = "client!kw", name = "I", descriptor = "J")
    public static long field3635 = 0L;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!kw", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3632++;
        this.method1704(4);
        super.finalize();
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method1703(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class44.field982 = arg0;
        class9.field124 = arg1;
        class719.field9783 = class9.field124 > 1 && class44.field982.method364();
        class130.field2185 = arg2;
        class1.field3 = 0x1 << class130.field2185;
        class72.field1328 = class1.field3 >> 1;
        Math.sqrt((double) (class72.field1328 * class72.field1328 + class72.field1328 * class72.field1328));
        class510.field7094 = arg3;
        class434.field6208 = arg4;
        class432.field6185 = arg5;
        class708.field9611 = arg6;
        class29.field765 = class225.method1588(15);
        class19.method144(-124);
        class690.field9324 = new class384[arg3][class434.field6208][class432.field6185];
        class465.field6517 = new class281[arg3];
        if (arg7) {
            class755.field10550 = new int[class434.field6208][class432.field6185];
            class208.field2981 = new byte[class434.field6208][class432.field6185];
            class315.field4362 = new short[class434.field6208][class432.field6185];
            class135.field2273 = new class384[1][class434.field6208][class432.field6185];
            class344.field4822 = new class281[1];
        } else {
            class755.field10550 = null;
            class208.field2981 = null;
            class315.field4362 = null;
            class135.field2273 = null;
            class344.field4822 = null;
        }
        if (arg8) {
            class582.field7967 = new long[arg3][arg4][arg5];
            class394.field5788 = new class2[65535];
            class184.field2781 = new boolean[65535];
            class234.field3398 = 0;
        } else {
            class582.field7967 = null;
            class394.field5788 = null;
            class184.field2781 = null;
            class234.field3398 = 0;
        }
        class174.method1308(false);
        class362.field5206 = new class404[2];
        class391.field5762 = new class404[2];
        class375.field5310 = new class404[2];
        class339.field4772 = new class404[10000];
        class729.field9867 = 0;
        class307.field4265 = new class404[5000];
        class587.field8008 = 0;
        class477.field6658 = new class494[5000];
        class612.field8367 = 0;
        class196.field2890 = new boolean[class708.field9611 + class708.field9611 + 1][class708.field9611 + class708.field9611 + 1];
        class272.field3824 = new boolean[class708.field9611 + class708.field9611 + 2][class708.field9611 + class708.field9611 + 2];
        class651.field8948 = new int[class708.field9611 + class708.field9611 + 2];
        class545.field7511 = class545.field7513;
        if (class719.field9783) {
            class375.field5307 = new boolean[arg3][class708.field9611 + class708.field9611 + 1][class708.field9611 + class708.field9611 + 1];
            class608.field8345 = new boolean[arg3][][];
            if (class170.field2657 != null) {
                class680.method3815();
            }
            class170.field2657 = new class702[class9.field124];
            class44.field982.method352(class170.field2657.length + 1);
            class44.field982.method249(0);
            for (int var9 = 0; var9 < class170.field2657.length; var9++) {
                class170.field2657[var9] = new class702(var9 + 1, class44.field982);
                (new Thread(class170.field2657[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class9.field124 == 2) {
                var10 = 4;
                class165.field2594 = 2;
            } else if (class9.field124 == 3) {
                var10 = 6;
                class165.field2594 = 3;
            } else {
                var10 = 8;
                class165.field2594 = 4;
            }
            class516.field7188 = new class613[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class516.field7188[var11] = new class613(class94.field1654[class9.field124 - 2][var11]);
            }
        } else {
            class165.field2594 = 1;
        }
        class691.field9346 = new int[class165.field2594 - 1];
        class488.field6756 = new int[class165.field2594 - 1];
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V")
    public final void method1704(int arg0) {
        field3628++;
        if (this.field3631 > 0) {
            this.field3626.method362(this.field3631, this.field3633, -101);
            this.field3631 = 0;
        }
        if (arg0 != 4) {
            method1703(null, 57, 49, -22, 43, -43, -45, true, true);
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(III)V")
    public final void method1705(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, arg0, this.field3631);
        field3630++;
        this.field3624 = arg2;
        this.field3625 = arg1;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public final void method457(int arg0) {
        field3623++;
        if (arg0 != -3022) {
            this.field3634 = 15;
        }
        OpenGL.glFramebufferRenderbufferEXT(this.field3624, this.field3625, 36161, 0);
        this.field3624 = -1;
        this.field3625 = -1;
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lqo;III)V")
    public class251(class22 arg0, int arg1, int arg2, int arg3) {
        this.field3634 = arg2;
        this.field3626 = arg0;
        this.field3627 = arg3;
        this.field3629 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class170.field2656, 0);
        this.field3631 = class170.field2656[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3631);
        OpenGL.glRenderbufferStorageEXT(36161, this.field3629, this.field3634, this.field3627);
        this.field3633 = this.field3634 * this.field3627 * this.field3626.method334(this.field3629, 2);
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lqo;IIII)V")
    public class251(class22 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3634 = arg2;
        this.field3629 = arg1;
        this.field3627 = arg3;
        this.field3626 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class170.field2656, 0);
        this.field3631 = class170.field2656[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3631);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field3629, this.field3634, this.field3627);
        this.field3633 = this.field3634 * this.field3627 * this.field3626.method334(this.field3629, 2);
    }
}
