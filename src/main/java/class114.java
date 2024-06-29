import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class114 {

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public int field2034 = -1;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2038 = 0;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Ldc;")
    private static class37 field2030 = class185.method1233((byte) 86, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Ldc;")
    private static class37 field2031 = class185.method1233((byte) 86, "Error loading your profile)3");

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
    public static int[] field2036 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[I")
    public static int[] field2042 = new int[32];

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Ldc;")
    private static class37 field2039 = class185.method1233((byte) 86, "Loading textures )2 ");

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Ldc;")
    public static class37 field2033 = field2039;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Ldc;")
    public static class37 field2035 = field2031;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Ldc;")
    public static class37 field2046 = class185.method1233((byte) 86, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Ldc;")
    public static class37 field2029 = field2030;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lu;")
    public class217 field2040;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[I")
    public int[] field2047;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[Ldc;")
    public class37[] field2044;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method797(int arg0) {
        field2042 = null;
        field2039 = null;
        field2029 = null;
        field2046 = null;
        field2031 = null;
        field2036 = null;
        field2033 = null;
        if (arg0 < 22) {
            field2031 = null;
        }
        field2035 = null;
        field2030 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 + arg6;
        field2045++;
        int var8 = arg0 - arg1;
        int var9 = arg3 + arg1;
        int var10 = arg2 - arg1;
        for (int var11 = arg6; var11 < var7; var11++) {
            class29.method242(arg2, (byte) -30, arg5, class11.field156[var11], arg3);
        }
        int var12 = arg0;
        if (arg4 < 24) {
            return;
        }
        while (var8 < var12) {
            class29.method242(arg2, (byte) -30, arg5, class11.field156[var12], arg3);
            var12--;
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class11.field156[var13];
            class29.method242(var9, (byte) -30, arg5, var14, arg3);
            class29.method242(arg2, (byte) -30, arg5, var14, var10);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)Lt;")
    public static final class207 method799(int arg0, boolean arg1) {
        class207 var2 = (class207) class9.field113.method87(125, (long) arg0);
        field2032++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class168.field3205.method1547(arg0, 0, 5);
        class207 var4 = new class207();
        if (var3 != null) {
            var4.method1372(new class28(var3), 128);
        }
        class9.field113.method92((long) arg0, var4, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Lng;")
    public static final class148 method800(byte arg0) {
        int var1 = -22 / ((arg0 + 27) / 57);
        class148 var2 = new class148(class67.field1207, class160.field3030, class166.field3162[0], class7.field77[0], class174.field3308[0], class238.field4336[0], class217.field4040[0], class5.field42);
        field2037++;
        class97.method644(true);
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public static final void method801(byte arg0) {
        field2041++;
        class97 var1 = (class97) class191.field3566.method1338(-109);
        if (arg0 != 32) {
            return;
        }
        while (var1 != null) {
            class185 var2 = var1.field1704;
            if (class125.field2246 != var2.field3422 || var2.field3425) {
                var1.method433(0);
            } else if (class203.field3758 >= var2.field3415) {
                var2.method1236(class201.field3749, -2);
                if (var2.field3425) {
                    var1.method433(0);
                } else {
                    class88.method586(var2.field3422, var2.field3429, var2.field3424, var2.field3427, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class97) class191.field3566.method1332((byte) -89);
        }
    }
}
