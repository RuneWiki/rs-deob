import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class21 {

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Li;")
    public static class88 field325 = class208.method1425(105, "overlay)3dat");

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(JB)V")
    public static final void method98(long arg0, byte arg1) {
        field323++;
        if (arg0 <= 0L || arg1 != 38) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class199.method1367(-68, arg0 - 1L);
            class199.method1367(94, 1L);
        } else {
            class199.method1367(arg1 ^ 0xFFFFFF82, arg0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILef;)V")
    public static final void method99(int arg0, class51 arg1) {
        field326++;
        if (arg1.field935 != null) {
            arg1.field935.field1254 = 0;
        }
        arg1.field937 = false;
        if (arg0 > -29) {
            field325 = null;
        }
        for (class51 var2 = arg1.method385(); var2 != null; var2 = arg1.method380()) {
            method99(-112, var2);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)[Lrc;")
    public static final class188[] method100(byte arg0) {
        field329++;
        class188[] var1 = new class188[class172.field3347];
        for (int var2 = 0; var2 < class172.field3347; var2++) {
            int var3 = class67.field1218[var2] * class102.field1853[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class116.field2106[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class27.field456[class70.method470(255, var5[var6])];
            }
            var1[var2] = new class169(class15.field229, class129.field2426, class247.field4530[var2], class135.field2512[var2], class102.field1853[var2], class67.field1218[var2], var4);
        }
        if (arg0 > -13) {
            method98(25L, (byte) -48);
        }
        class239.method1580(68);
        return var1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field322++;
        int var7 = class156.method1060(class49.field919, class18.field279, -117, arg3);
        if (arg6 > -45) {
            field325 = null;
        }
        int var8 = class156.method1060(class49.field919, class18.field279, -103, arg0);
        int var9 = class156.method1060(class67.field1207, class12.field183, -107, arg2);
        int var10 = class156.method1060(class67.field1207, class12.field183, -122, arg4);
        int var11 = class156.method1060(class49.field919, class18.field279, -106, arg1 + arg3);
        int var12 = class156.method1060(class49.field919, class18.field279, -118, arg0 - arg1);
        for (int var13 = var7; var13 < var11; var13++) {
            class230.method1536(var9, arg5, -7, var10, class3.field42[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class230.method1536(var9, arg5, -7, var10, class3.field42[var14]);
        }
        int var15 = class156.method1060(class67.field1207, class12.field183, -103, arg1 + arg2);
        int var16 = class156.method1060(class67.field1207, class12.field183, -124, arg4 - arg1);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class3.field42[var17];
            class230.method1536(var9, arg5, -7, var15, var18);
            class230.method1536(var16, arg5, -7, var10, var18);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
    public static final int method102(int arg0, int arg1) {
        int var2 = 36 / ((arg0 - 58) / 37);
        field324++;
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lea;I)Li;")
    public static final class88 method103(class46 arg0, int arg1) {
        field327++;
        return arg1 <= 40 ? null : class78.method524(true, arg0, 32767);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method104(int arg0) {
        field325 = null;
        if (arg0 >= -14) {
            field325 = null;
        }
    }
}
