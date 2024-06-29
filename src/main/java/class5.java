import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class5 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Z")
    public static boolean field27 = false;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field24 = 0;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBILqg;IILna;Lgg;)V", line = 4)
    public static final void method10(int arg0, byte arg1, int arg2, class195 arg3, int arg4, int arg5, class22 arg6, class69 arg7) {
        field26++;
        if (arg1 != -128) {
            return;
        }
        class252 var8 = new class252();
        var8.field3762 = arg4 * 128;
        var8.field3764 = arg2 * 128;
        var8.field3772 = arg5;
        if (arg6 != null) {
            var8.field3761 = arg6.field279;
            var8.field3754 = arg6.field304;
            var8.field3755 = arg6.field303;
            var8.field3759 = arg6.field326;
            var8.field3758 = arg6.field284 * 128;
            var8.field3767 = arg6;
            int var9 = arg6.field293;
            int var10 = arg6.field330;
            if (arg0 == 1 || arg0 == 3) {
                var10 = arg6.field293;
                var9 = arg6.field330;
            }
            var8.field3766 = (arg4 + var9) * 128;
            var8.field3760 = (arg2 + var10) * 128;
            if (arg6.field336 != null) {
                var8.field3768 = true;
                var8.method1701((byte) -58);
            }
            if (var8.field3759 != null) {
                var8.field3775 = var8.field3754 + (int) ((double) (var8.field3761 - var8.field3754) * Math.random());
            }
            class162.field2444.method1108(var8, 65280);
        } else if (arg7 != null) {
            var8.field3765 = arg7;
            class58 var11 = arg7.field914;
            if (var11.field756 != null) {
                var8.field3768 = true;
                var11 = var11.method390(109);
            }
            if (var11 != null) {
                var8.field3766 = (var11.field759 + arg4) * 128;
                var8.field3760 = (var11.field759 + arg2) * 128;
                var8.field3755 = class145.method1039(arg7, 120);
                var8.field3758 = var11.field773 * 128;
            }
            class316.field4775.method1108(var8, 65280);
        } else if (arg3 != null) {
            var8.field3753 = arg3;
            var8.field3760 = (arg3.method696((byte) 117) + arg2) * 128;
            var8.field3766 = (arg4 + arg3.method696((byte) 117)) * 128;
            var8.field3755 = class152.method1094(arg3, -1753104468);
            var8.field3758 = arg3.field2920 * 128;
            class141.field2129.method1319(103, class242.method1638(arg3.field2934, -14393), var8);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIII)Ltb;", line = 102)
    public static final class167 method12(byte arg0, int arg1, int arg2, int arg3) {
        field28++;
        class167 var4 = new class167();
        var4.field2513 = arg3;
        var4.field2505 = arg2;
        class295.field4522.method1319(81, (long) arg1, var4);
        class251.method1693(arg2, 23440);
        int var5 = -61 / ((28 - arg0) / 60);
        class329 var6 = class80.method541((byte) 96, arg1);
        if (var6 != null) {
            class247.method1666(var6, -125);
        }
        if (class194.field2910 != null) {
            class247.method1666(class194.field2910, -128);
            class194.field2910 = null;
        }
        int var7 = class190.field2829;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class96.method680(class201.field2998[var8], 1003)) {
                class110.method769(var8, 25);
            }
        }
        if (class190.field2829 == 1) {
            field27 = false;
            class252.method1704(class23.field347, false, class242.field3633, class176.field2609, class163.field2466);
        } else {
            class252.method1704(class23.field347, false, class242.field3633, class176.field2609, class163.field2466);
            int var9 = class217.field3299.method632(class154.field2312);
            for (int var10 = 0; var10 < class190.field2829; var10++) {
                int var11 = class217.field3299.method632(class163.method1152(-76, var10));
                if (var11 > var9) {
                    var9 = var11;
                }
            }
            class163.field2466 = var9 + 8;
            class176.field2609 = (class30.field401 ? 26 : 22) + class190.field2829 * 15;
        }
        if (var6 != null) {
            class67.method444(var6, false, -1245723888);
        }
        class64.method428(arg2, (byte) 56);
        if (class123.field1926 != -1) {
            class136.method991(class123.field1926, 1, 27011);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 181)
    public static final int method13(String arg0, int arg1) {
        field25++;
        if (class155.field2325 == null || arg0.length() == 0) {
            return -1;
        }
        if (arg1 != 128) {
            method12((byte) -54, -42, -86, -62);
        }
        for (int var2 = 0; var2 < class155.field2325.field1996; var2++) {
            if (class201.method1379("<br>", -96, class155.field2325.field2007[var2], " ").equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILpg;)Lpg;")
    public abstract class321 method11(int arg0, class321 arg1);
}
