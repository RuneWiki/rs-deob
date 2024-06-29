import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class498 extends class222 {

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    private int field6980 = -1;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    private int field6978 = -1;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public int field6976;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Liu;")
    public static class517 field6974 = new class517(113, 2);

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "Lbv;")
    public static class567 field6983 = new class567("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "[I")
    public static int[] field6985 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "Lbv;")
    public static class567 field6984 = new class567("Loaded JAGMISC", "JAGMISC geladen", "JAGMISC chargé", "JAGMISC carregado");

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field6986 = 1;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "F")
    public static float field6982;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "[Lha;")
    public static class116[] field6975;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(B)V")
    public static void method2836(byte arg0) {
        field6975 = null;
        if (arg0 > 107) {
            field6983 = null;
            field6974 = null;
            field6985 = null;
            field6984 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public final void method1492(int arg0) {
        ++field6977;
        OpenGL.glFramebufferTexture2DEXT(this.field6980, this.field6978, 3553, 0, 0);
        if (arg0 != -29948) {
            method2836((byte) -50);
        }
        this.field6978 = -1;
        this.field6980 = -1;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ljj;IIZ[[I)V")
    public class498(class66 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field6976 = arg2;
        super.field3332.method648(-119, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field3340, arg2, arg2, 0, 32993, super.field3332.field1159, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class352.method2131(-96, var7 + 34069, 32993, super.field3340, arg4[var7], arg2, arg2, super.field3332.field1159);
            }
        }
        this.method1490((byte) 77, true);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIBI)V")
    public final void method2837(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field6981;
        OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.field3328, arg4);
        this.field6978 = arg2;
        if (arg3 != 65) {
            method2836((byte) -4);
        }
        this.field6980 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ljj;II)V")
    public class498(class66 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field6976 = arg2;
        super.field3332.method648(96, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field3340, arg2, arg2, 0, class209.method1337(super.field3340, (byte) 127), 5121, (byte[]) null, 0);
        }
        this.method1490((byte) 84, true);
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V")
    public static final void method2838(int arg0, int arg1) {
        ++field6979;
        if (arg1 != -1) {
            method2836((byte) 41);
        }
        class21 var2 = class601.method3413(arg0, 14, (byte) 103);
        var2.method227(true);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ljj;IIZ[[BI)V")
    public class498(class66 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field6976 = arg2;
        super.field3332.method648(-101, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field3340, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1490((byte) 89, true);
    }
}
