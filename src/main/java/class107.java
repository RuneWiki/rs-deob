import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class107 extends class205 {

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    private int field1500 = -1;

    @OriginalMember(owner = "client!iv", name = "E", descriptor = "I")
    private int field1510 = -1;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "Lmw;")
    public static class517 field1503 = new class517(77, 3);

    @OriginalMember(owner = "client!iv", name = "C", descriptor = "Lmw;")
    public static class517 field1508 = new class517(81, 3);

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "D")
    public static double field1504;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!iv", name = "D", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!iv", name = "F", descriptor = "Lbm;")
    public static class123 field1511;

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "Lkia;")
    public static class646 field1507;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIII)V", line = 3)
    public final void method803(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 97) {
            this.method804(-60);
        }
        ++field1505;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg3, super.field2637, arg4);
        this.field1510 = arg2;
        this.field1500 = arg1;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Llf;IIZ[[I)V", line = 17)
    public class107(class250 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field1502 = arg2;
        super.field2640.method1595((byte) 100, this);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class368.method2307(arg4[var6], super.field2644, arg2, 32993, var6 + 34069, arg2, -93, super.field2640.field3660);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field2644, arg2, arg2, 0, 32993, super.field2640.field3660, arg4[var7], 0);
            }
        }
        this.method1344(-15578, true);
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Llf;II)V", line = 57)
    public class107(class250 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field1502 = arg2;
        super.field2640.method1595((byte) 84, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field2644, arg2, arg2, 0, class172.method1167(4229, super.field2644), 5121, (byte[]) null, 0);
        }
        this.method1344(-15578, true);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 78)
    public final void method804(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field1510, this.field1500, 3553, arg0, 0);
        ++field1509;
        this.field1500 = -1;
        this.field1510 = -1;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Llf;IIZ[[BI)V", line = 142)
    public class107(class250 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field1502 = arg2;
        super.field2640.method1595((byte) 116, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field2644, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1344(-15578, true);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIILha;IIII)V", line = 91)
    public static final void method805(int arg0, int arg1, int arg2, class66 arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1506;
        class685.field9171 = arg3;
        class312.field4419 = class685.field9171.method541();
        class685.field9153 = class685.field9171.method541();
        class183.field2406 = class685.field9171.method541();
        class593.field8101 = null;
        class206.field2664 = arg1;
        class279.field4047 = 0;
        class520.field7234 = arg0;
        class56.field682 = arg7;
        class743.field10049 = 0;
        class533.field7397 = arg4;
        class607.field8210 = arg6;
        class306.method1982(-2, arg2, arg5);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BI)Z", line = 112)
    public static final boolean method806(byte arg0, int arg1) {
        if (arg0 <= 17) {
            field1508 = null;
        }
        ++field1501;
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)V", line = 127)
    public static void method807(byte arg0) {
        field1507 = null;
        int var1 = -110 / ((arg0 - -38) / 63);
        field1503 = null;
        field1508 = null;
        field1511 = null;
    }
}
