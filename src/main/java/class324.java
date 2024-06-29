import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class324 extends OutputStream {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[F", line = 5)
    public static final float[] method2200(int arg0, int arg1) {
        field5044++;
        float var2 = class250.method1728() + class250.method1731();
        int var3 = class250.method1729();
        float var4 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var5 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        class5.field55[3] = 1.0F;
        if (arg1 != 27182) {
            return (float[]) null;
        }
        float var7 = 0.58823526F;
        class5.field55[1] = var4 * ((float) (class270.method1860(arg0, 65451) >> 8) / 255.0F) * var7 * var2;
        class5.field55[0] = var2 * (float) (class270.method1860(arg0, 16768328) >> 16) / 255.0F * var5 * var7;
        class5.field55[2] = var2 * (float) class270.method1860(255, arg0) / 255.0F * var6 * var7;
        return class5.field55;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)I", line = 33)
    public static final int method2201(int arg0, int arg1) {
        if (arg1 != -485) {
            method2202(49, -74, 71, 107, (class253) null, -109L, false);
        }
        int var2 = arg0 >>> 1;
        field5045++;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIILwb;JZ)V", line = 50)
    public static final void method2202(int arg0, int arg1, int arg2, int arg3, class253 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class279 var8 = new class279();
        var8.field4297 = arg4;
        var8.field4295 = arg1 * 128 + 64;
        var8.field4293 = arg2 * 128 + 64;
        var8.field4294 = arg3;
        var8.field4300 = arg5;
        var8.field4291 = arg6;
        if (class256.field4013[arg0][arg1][arg2] == null) {
            class256.field4013[arg0][arg1][arg2] = new class142(arg0, arg1, arg2);
        }
        class256.field4013[arg0][arg1][arg2].field2196 = var8;
    }

    @OriginalMember(owner = "client!jb", name = "write", descriptor = "(I)V", line = 72)
    public final void write(int arg0) throws IOException {
        field5046++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V", line = 87)
    public static final void method2203(int arg0, boolean arg1) {
        field5047++;
        class338 var2 = class195.method1391(10, (byte) -92, arg0);
        var2.method2347(arg1);
    }
}
