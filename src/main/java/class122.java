import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class122 {

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Leg;")
    public static class34 field1846 = new class34("", 12);

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[B")
    public static byte[] field1847 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lgt;")
    public static class66 field1844;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILgt;Ll;Ljava/awt/Canvas;II)Lza;")
    public static final class299 method907(int arg0, class66 arg1, class127 arg2, Canvas arg3, int arg4, int arg5) {
        if (arg0 != 0) {
            field1844 = null;
        }
        field1845++;
        return new class249(arg5, arg3, arg2, arg4, arg1);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method908(int arg0) {
        field1844 = null;
        field1847 = null;
        field1846 = null;
        if (arg0 != -3602) {
            method908(7);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
    public static final void method909(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1842++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        class262.method1831(arg1 + arg3, class402.field5946[arg2], (byte) 43, arg4, arg3 - arg1);
        if (arg0 >= -78) {
            method907(109, null, null, null, 66, 28);
        }
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class402.field5946[arg2 + var6];
                int[] var10 = class402.field5946[arg2 - var6];
                int var11 = arg3 + var5;
                int var12 = arg3 - var5;
                class262.method1831(var11, var9, (byte) 43, arg4, var12);
                class262.method1831(var11, var10, (byte) 43, arg4, var12);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class402.field5946[arg2 + var5];
            int[] var16 = class402.field5946[arg2 - var5];
            class262.method1831(var13, var15, (byte) 43, arg4, var14);
            class262.method1831(var13, var16, (byte) 43, arg4, var14);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Z")
    public static final boolean method910(byte arg0) {
        field1843++;
        int var1 = 11 % ((arg0 + 31) / 38);
        if (class73.field1242) {
            try {
                if ((Boolean) class220.method1510(124, "showingVideoAd", field1844.field1062)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }
}
