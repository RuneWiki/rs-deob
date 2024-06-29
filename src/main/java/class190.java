import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class190 extends class2 {

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    private int field3676 = -32768;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "[Z")
    public static boolean[] field3671 = new boolean[5];

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "Lob;")
    private static class141 field3673 = class175.method1195(40, "Drop");

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "Lob;")
    public static class141 field3677 = class175.method1195(40, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "Lob;")
    public static class141 field3672 = field3673;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "Z")
    public static boolean field3679 = false;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "Lob;")
    public static class141 field3681 = class175.method1195(40, "Konfig geladen)3");

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public int field3669;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
    public int field3678;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3675++;
        class56 var11 = class96.method645((byte) -61, this.field3669).method328(-121, null, this.field3678, 0);
        if (var11 != null) {
            var11.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3676 = var11.method16();
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V")
    public static final void method1261(int arg0, int arg1, int arg2) {
        field3680++;
        class158 var3 = class76.field1559[class66.field1287][arg2][arg1];
        if (var3 == null) {
            class58.method393(class66.field1287, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class190 var5 = null;
        for (class190 var6 = (class190) var3.method1103((byte) -9); var6 != null; var6 = (class190) var3.method1106((byte) -111)) {
            class50 var12 = class96.method645((byte) -61, var6.field3669);
            int var13 = var12.field980;
            if (var12.field945 == 1) {
                var13 = (var6.field3678 + 1) * var13;
            }
            if (var4 < var13) {
                var4 = var13;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class58.method393(class66.field1287, arg2, arg1);
            return;
        }
        var3.method1100(var5, true);
        if (arg0 != 0) {
            method1263(-11);
        }
        long var7 = (long) ((arg1 << 7) + arg2 + 1610612736);
        class190 var9 = null;
        class190 var10 = null;
        for (class190 var11 = (class190) var3.method1103((byte) -9); var11 != null; var11 = (class190) var3.method1106((byte) 109)) {
            if (var5.field3669 != var11.field3669) {
                if (var9 == null) {
                    var9 = var11;
                }
                if (var9.field3669 != var11.field3669 && var10 == null) {
                    var10 = var11;
                }
            }
        }
        class218.method1414(class66.field1287, arg2, arg1, class206.method1360(class66.field1287, arg2 * 128 + 64, (byte) 40, arg1 * 128 + 64), var5, var7, var9, var10);
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)V")
    public static final void method1262(int arg0) {
        class7.field120.method32(45, 12885);
        class108.field2072++;
        field3674++;
        for (class174 var1 = (class174) class173.field3437.method799((byte) 117); var1 != null; var1 = (class174) class173.field3437.method796((byte) -33)) {
            if (var1.field3459 == 0) {
                class12.method77(var1, arg0 ^ 0x6702FD1, true);
            }
        }
        if (arg0 == 108015568 && class181.field3555 != null) {
            class38.method252(class181.field3555, -105);
            class181.field3555 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "(I)V")
    public static void method1263(int arg0) {
        field3671 = null;
        field3673 = null;
        field3677 = null;
        field3672 = null;
        if (arg0 == 1610612736) {
            field3681 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3670++;
        int var7 = 2048 - arg1 & 0x7FF;
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg4;
        if (var8 != 0) {
            int var12 = class44.field854[var8];
            int var13 = class44.field843[var8];
            int var14 = var10 * var13 - arg4 * var12 >> 16;
            var11 = var10 * var12 + arg4 * var13 >> 16;
            var10 = var14;
        }
        if (var7 != 0) {
            int var15 = class44.field843[var7];
            int var16 = class44.field854[var7];
            int var17 = var9 * var15 + var11 * var16 >> 16;
            var11 = var11 * var15 - var9 * var16 >> 16;
            var9 = var17;
        }
        class175.field3474 = arg1;
        if (arg6 < 2) {
            field3681 = null;
        }
        class191.field3683 = arg0 - var10;
        class178.field3508 = arg5 - var9;
        class19.field338 = arg3;
        class184.field3589 = arg2 - var11;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()I")
    public final int method16() {
        field3668++;
        return this.field3676;
    }
}
