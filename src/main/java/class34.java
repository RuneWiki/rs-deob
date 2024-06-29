import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class34 extends class18 {

    @OriginalMember(owner = "client!bja", name = "D", descriptor = "I")
    private int field572 = -1;

    @OriginalMember(owner = "client!bja", name = "F", descriptor = "I")
    private int field573 = -1;

    @OriginalMember(owner = "client!bja", name = "B", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!bja", name = "w", descriptor = "Lafa;")
    public static class365 field565 = new class365();

    @OriginalMember(owner = "client!bja", name = "A", descriptor = "[Lfha;")
    public static class401[] field569 = null;

    @OriginalMember(owner = "client!bja", name = "x", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!bja", name = "y", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!bja", name = "z", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!bja", name = "C", descriptor = "[Lwl;")
    public static class432[] field571;

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lhk;IIZ[[I)V")
    public class34(class111 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field570 = arg2;
        super.field434.method939(this, 8448);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class265.method1732(32993, arg4[var6], arg2, arg2, var6 + 34069, super.field427, super.field434.field2058, 28264);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field427, arg2, arg2, 0, 32993, super.field434.field2058, arg4[var7], 0);
            }
        }
        this.method126(true, -22513);
    }

    @OriginalMember(owner = "client!bja", name = "d", descriptor = "(B)V")
    public static void method200(byte arg0) {
        field565 = null;
        field571 = null;
        field569 = null;
        int var1 = -53 / ((-57 - arg0) / 50);
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lhk;II)V")
    public class34(class111 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field570 = arg2;
        super.field434.method939(this, 8448);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field427, arg2, arg2, 0, class628.method3531((byte) -123, super.field427), 5121, (byte[]) null, 0);
        }
        this.method126(true, -22513);
    }

    @OriginalMember(owner = "client!bja", name = "e", descriptor = "(B)V")
    public static final void method201(byte arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class727.field9991[var1] = false;
        }
        ++field567;
        class657.field9101 = 0;
        class415.field5691 = class440.field5977;
        class536.field7291 = 5;
        class100.field1626 = -1;
        class577.field8185 = -1;
        class281.field3906 = -1;
        class695.field9621 = class733.field10131;
        class355.field4849 = 0;
        class382.field5193 = class450.field6172;
        if (arg0 != -85) {
            field569 = null;
        }
        class289.field3991 = -1;
        class634.field8771 = class460.field6249;
        class366.field4971 = class605.field8452;
        class132.field2269 = class255.field3585;
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lhk;IIZ[[BI)V")
    public class34(class111 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field570 = arg2;
        super.field434.method939(this, 8448);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field427, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method126(true, -22513);
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V")
    public final void method129(int arg0) {
        ++field568;
        OpenGL.glFramebufferTexture2DEXT(this.field572, this.field573, 3553, 0, 0);
        if (arg0 <= -44) {
            this.field572 = -1;
            this.field573 = -1;
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(IIIII)V")
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg4, arg0, super.field433, arg1);
        ++field566;
        if (arg2 == 5) {
            this.field573 = arg4;
            this.field572 = arg3;
        }
    }
}
