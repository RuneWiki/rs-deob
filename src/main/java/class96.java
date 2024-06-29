import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class96 extends class158 {

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    private int field1386 = -1;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    private int field1388 = -1;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "Lgr;")
    public static class530 field1385 = new class530(56, 3);

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIBI)V")
    public final void method735(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 <= -108) {
            OpenGL.glFramebufferTexture2DEXT(arg4, arg0, arg1, super.field2269, arg2);
            ++field1387;
            this.field1388 = arg4;
            this.field1386 = arg0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lkw;IIZ[[I)V")
    public class96(class346 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field1391 = arg2;
        super.field2275.method2164(6, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field2272, arg2, arg2, 0, 32993, super.field2275.field5027, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class548.method3296(super.field2275.field5027, arg4[var7], (byte) 125, super.field2272, 32993, arg2, arg2, var7 + 34069);
            }
        }
        this.method1131((byte) 42, true);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lkw;IIZ[[BI)V")
    public class96(class346 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field1391 = arg2;
        super.field2275.method2164(6, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field2272, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1131((byte) 42, true);
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(B)V")
    public static void method736(byte arg0) {
        field1385 = null;
        int var1 = -88 % ((arg0 - 25) / 54);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lkw;II)V")
    public class96(class346 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field1391 = arg2;
        super.field2275.method2164(6, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field2272, arg2, arg2, 0, class347.method2202(super.field2272, (byte) 23), 5121, (byte[]) null, 0);
        }
        this.method1131((byte) 42, true);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public final void method463(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field1388, this.field1386, 3553, 0, 0);
        ++field1389;
        this.field1388 = -1;
        this.field1386 = -1;
        if (arg0 >= -96) {
            this.method463((byte) -3);
        }
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)I")
    public static final int method737(int arg0) {
        int var1 = -30 / ((arg0 - 20) / 50);
        ++field1390;
        class348 var2 = class675.field9603;
        synchronized (class675.field9603) {
            return class675.field9603.method2218(0);
        }
    }
}
