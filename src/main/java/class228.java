import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class228 extends class43 {

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Lwp;")
    public static class288 field2881 = new class288();

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Llk;")
    public static class272 field2880;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lwo;")
    public static class285 field2876;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "[I")
    public static int[] field2883;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[[I")
    public static int[][] field2877;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIBII)V")
    public static final void method1393(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2879++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg5 * arg5;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        if (arg3 < 106) {
            method1397((short[]) null, false);
        }
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class384.method2394(arg2, 103, field2877[arg0], arg4 + arg5, arg4 - arg5);
        int var20 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var21 = arg0 - var7;
            int var22 = arg0 + var7;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class384.method2394(arg2, 102, field2877[var21], var23, var24);
            class384.method2394(arg2, 127, field2877[var22], var23, var24);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1394(String arg0, int arg1) {
        field2884++;
        if (class431.field5878 == null) {
            class267.method1675(-5824);
        }
        String[] var2 = class349.method2225(-11337, '\n', arg0);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            for (int var4 = class5.field36; var4 > 0; var4--) {
                class431.field5878[var4] = class431.field5878[var4 - 1];
            }
            class431.field5878[0] = var2[var3];
            if (class5.field36 < (class431.field5878.length - 1)) {
                if (class278.field3592 > 0) {
                    class278.field3592++;
                }
                class5.field36++;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static void method1395(int arg0) {
        if (arg0 != 0) {
            field2881 = null;
        }
        field2883 = null;
        field2877 = null;
        field2880 = null;
        field2881 = null;
        field2876 = null;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
    public static final void method1396(int arg0) {
        class284.field3716.method1415(0);
        field2875++;
        class139.field1590 = arg0;
        class369.field5026 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([SZ)[S")
    public static final short[] method1397(short[] arg0, boolean arg1) {
        field2882++;
        if (arg0 == null) {
            return null;
        } else if (arg1) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class114.method663(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(II)V")
    public class228(int arg0, int arg1) {
        this.field2878 = arg1;
        this.field2885 = arg0;
    }
}
