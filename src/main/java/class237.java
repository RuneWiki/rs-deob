import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class237 extends OutputStream {

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Lpi;")
    public static class342 field3430 = new class342("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Lcq;")
    public static class324 field3426;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Llh;")
    public static class364 field3429;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "[[Lng;")
    public static class226[][] field3431;

    @OriginalMember(owner = "client!du", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3428++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IZIIFIII)[I")
    public static final int[] method1555(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
        field3427++;
        int[] var8 = new int[arg5];
        class25 var9 = new class25();
        var9.field545 = arg6;
        var9.field539 = arg3;
        var9.field553 = arg1;
        var9.field548 = (int) (arg4 * 4096.0F);
        var9.field537 = arg7;
        var9.field544 = arg2;
        if (arg0 > -76) {
            method1555(9, true, -88, -7, 0.5991361F, 81, 97, -111);
        }
        var9.method38(4095);
        class121.method910(arg5, 1, -104);
        var9.method308(0, var8, (byte) 126);
        return var8;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static void method1556(int arg0) {
        field3429 = null;
        field3431 = null;
        field3426 = null;
        int var1 = 124 / ((arg0 + 38) / 42);
        field3430 = null;
    }
}
