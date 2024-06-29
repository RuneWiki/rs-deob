import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class123 extends InputStream {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "S")
    public static short field2191 = 256;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field2194 = 0;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Lcf;")
    public static class93 field2197 = null;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZIII)V")
    public static final void method904(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2195++;
        class58.method337(arg0 - arg3, class76.field1406[arg4], arg2, arg0 + arg3, false);
        if (!arg1) {
            field2197 = null;
        }
        int var5 = arg3;
        int var6 = 0;
        int var7 = -arg3;
        int var8 = -1;
        while (var6 < var5) {
            var6++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var5--;
                int[] var9 = class76.field1406[arg4 + var5];
                int[] var10 = class76.field1406[arg4 - var5];
                var7 -= var5 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                class58.method337(var11, var9, arg2, var12, false);
                class58.method337(var11, var10, arg2, var12, false);
            }
            int var13 = arg0 + var5;
            int var14 = arg0 - var5;
            int[] var15 = class76.field1406[arg4 + var6];
            int[] var16 = class76.field1406[arg4 - var6];
            class58.method337(var14, var15, arg2, var13, false);
            class58.method337(var14, var16, arg2, var13, false);
        }
    }

    @OriginalMember(owner = "client!dl", name = "read", descriptor = "()I")
    public final int read() {
        field2196++;
        class53.method290(30000L, true);
        return -1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Llf;")
    public static final class212 method905(int arg0, int arg1, int arg2) {
        class212 var3 = (class212) class45.field712.method135((long) arg1 << 32 | (long) arg2, true);
        if (arg0 != -1205364448) {
            field2197 = null;
        }
        field2190++;
        if (var3 == null) {
            var3 = new class212(arg1, arg2);
            class45.field712.method137(var3.field4006, var3, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)V")
    public static final void method906(int arg0, byte arg1) {
        class77.field1443.method298(true, arg0);
        class151.field2644.method298(true, arg0);
        if (arg1 <= 69) {
            method905(-42, -123, 58);
        }
        field2192++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    public static final void method907(int arg0, int arg1) {
        field2198++;
        class19.field258 = 3;
        class48.field780 = 20;
        class90.field1617 = arg0;
        if (arg1 != 0) {
            field2197 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method908(int arg0) {
        field2197 = null;
        int var1 = -42 % ((4 - arg0) / 59);
    }
}
