import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class523 {

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    private int field7607;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field7602 = 0;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)V", line = 3)
    public final void method3181(boolean arg0) {
        OpenGL.glEndList();
        if (!arg0) {
            method3182(null, 10);
        }
        field7601++;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lwq;I)I", line = 19)
    public static final int method3182(class674 arg0, int arg1) {
        field7604++;
        int var2 = -86 % ((-arg1 - 29) / 60);
        if (class674.field9587 == arg0) {
            return 5120;
        } else if (class674.field9588 == arg0) {
            return 5122;
        } else if (class674.field9589 == arg0) {
            return 5124;
        } else if (class674.field9590 == arg0) {
            return 5121;
        } else if (class674.field9591 == arg0) {
            return 5123;
        } else if (class674.field9592 == arg0) {
            return 5125;
        } else if (class674.field9593 == arg0) {
            return 5131;
        } else if (class674.field9594 == arg0) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Ldk;B)V", line = 62)
    public static final void method3183(class88 arg0, byte arg1) {
        class31.field288.method3559(arg0, (byte) 12);
        if (arg1 != 31) {
            field7608 = 26;
        }
        field7606++;
        arg0.field1259 = arg0.field1260.field6864;
        class340.field4683 += arg0.field1259;
        arg0.field1260.field6864 = 0;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)V", line = 82)
    public final void method3184(int arg0, int arg1) {
        int var3 = 0 / ((28 - arg1) / 34);
        OpenGL.glNewList(this.field7607 + arg0, 4864);
        field7603++;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IC)V", line = 95)
    public final void method3185(int arg0, char arg1) {
        if (arg0 <= 113) {
            method3183(null, (byte) -93);
        }
        OpenGL.glCallList(this.field7607 + arg1);
        field7609++;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lkw;I)V", line = 107)
    public class523(class346 arg0, int arg1) {
        this.field7607 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIII)V", line = 121)
    public static final void method3186(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if ((arg0 - arg1) >= class200.field2976 && (arg0 + arg1) <= class204.field3061 && arg3 - arg1 >= class377.field5458 && class362.field5291 >= arg1 + arg3) {
            class596.method3490(arg2, arg1, arg0, arg3, -86);
        } else {
            class365.method2301(arg1, arg0, arg2, arg3, 0);
        }
        if (arg4 == 5120) {
            field7605++;
        }
    }
}
