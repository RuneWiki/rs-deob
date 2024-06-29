import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class696 extends class136 {

    @OriginalMember(owner = "client!hda", name = "y", descriptor = "I")
    private int field9890 = -1;

    @OriginalMember(owner = "client!hda", name = "B", descriptor = "I")
    private int field9893 = -1;

    @OriginalMember(owner = "client!hda", name = "x", descriptor = "I")
    public int field9889;

    @OriginalMember(owner = "client!hda", name = "C", descriptor = "I")
    public static int field9894 = 0;

    @OriginalMember(owner = "client!hda", name = "v", descriptor = "J")
    public static long field9887 = 0L;

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field9891 = new String[200];

    @OriginalMember(owner = "client!hda", name = "u", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!hda", name = "w", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!hda", name = "A", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!hda", name = "D", descriptor = "Lov;")
    public static class171 field9895;

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Llj;IIZ[[I)V")
    public class696(class565 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field9889 = arg2;
        super.field1927.method3206(this, (byte) 26);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field1930, arg2, arg2, 0, 32993, super.field1927.field7942, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class86.method643(arg4[var7], 32993, 119, super.field1930, arg2, super.field1927.field7942, arg2, var7 + 34069);
            }
        }
        this.method944((byte) -111, true);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V")
    public final void method240(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field9890, this.field9893, 3553, 0, 0);
        ++field9888;
        if (arg0 != -8) {
            method3910(-56);
        }
        this.field9893 = -1;
        this.field9890 = -1;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIII)V")
    public final void method3908(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -7) {
            this.field9893 = -94;
        }
        OpenGL.glFramebufferTexture2DEXT(arg3, arg4, arg0, super.field1915, arg2);
        ++field9892;
        this.field9890 = arg3;
        this.field9893 = arg4;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Llj;IIZ[[BI)V")
    public class696(class565 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field9889 = arg2;
        super.field1927.method3206(this, (byte) 26);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field1930, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method944((byte) -111, true);
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Llj;II)V")
    public class696(class565 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field9889 = arg2;
        super.field1927.method3206(this, (byte) 26);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field1930, arg2, arg2, 0, class589.method3346(super.field1930, (byte) -111), 5121, (byte[]) null, 0);
        }
        this.method944((byte) -111, true);
    }

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "(B)V")
    public static final void method3909(byte arg0) {
        ++class48.field561;
        ++field9886;
        class352 var1 = class290.method1786(98, class199.field2836, class559.field7536);
        var1.field4686.method2837(class442.field6115, -2);
        class602.method3388(var1, (byte) 28);
        if (arg0 >= -17) {
            method3910(8);
        }
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "(I)V")
    public static void method3910(int arg0) {
        if (arg0 == -10645) {
            field9895 = null;
            field9891 = null;
        }
    }
}
