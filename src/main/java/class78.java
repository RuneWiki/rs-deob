import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class78 {

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Z")
    public boolean field1384 = true;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Z")
    public static boolean field1377 = false;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field1386 = 0;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lbj;")
    public static class155 field1383;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
    public static final void method546(boolean arg0, int arg1) {
        class30.field557 = new int[104];
        class200.field3480 = new int[104];
        field1385++;
        class133.field2320 = new int[104];
        class280.field4903 = new int[104];
        class80.field1416 = new int[104];
        class255.field4408 = 99;
        if (arg1 > -98) {
            field1386 = -39;
        }
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class24.field357 = new byte[var2][104][104];
        class13.field114 = new int[var2][105][105];
        class111.field2001 = new byte[var2][104][104];
        class224.field3897 = new byte[var2][104][104];
        class180.field3136 = new byte[var2][105][105];
        class69.field1148 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Lrg;")
    public static final class229 method547(int arg0, int arg1, int arg2) {
        field1380++;
        int var3 = -61 / ((-arg2 - 12) / 52);
        for (class229 var4 = (class229) class168.field3005.method529(10); var4 != null; var4 = (class229) class168.field3005.method533(-122)) {
            if (var4.field3955 && var4.method1506(arg0, arg1, true)) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIII)I")
    public static final int method548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg3;
            arg3 = var7;
        }
        int var8 = arg4 & 0x3;
        field1379++;
        if (var8 == 0) {
            return arg5;
        }
        if (arg0 != -4918) {
            field1383 = null;
        }
        if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg5;
        } else {
            return 7 - arg6 - (arg3 + -1);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static final void method549(int arg0) {
        field1381++;
        int var1 = class228.field3950.method480(class23.field333);
        for (int var2 = 0; var2 < class258.field4497; var2++) {
            int var6 = class228.field3950.method480(class165.method1111(var2, -1));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class258.field4497 * 15 + 21;
        int var4 = class1.field10 - (var1 / 2);
        if (class199.field3458 < var4 + var1) {
            var4 = class199.field3458 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (arg0 < 89) {
            field1386 = 62;
        }
        int var5 = class20.field237;
        if (var3 + var5 > class24.field373) {
            var5 = class24.field373 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class244.field4218 == 1) {
            if (class133.field2326 == class1.field10 && class207.field3593 == class20.field237) {
                class217.field3769 = class258.field4497 * 15 + 22;
                class244.field4209 = true;
                class284.field4938 = var5;
                class90.field1539 = var4;
                class244.field4218 = 0;
                class238.field4114 = var1;
            }
        } else if (class11.field97 == class1.field10 && class20.field237 == class122.field2133) {
            class284.field4938 = var5;
            class244.field4209 = true;
            class244.field4218 = 0;
            class217.field3769 = class258.field4497 * 15 + 22;
            class238.field4114 = var1;
            class90.field1539 = var4;
        } else {
            class244.field4218 = 1;
            class207.field3593 = class122.field2133;
            class133.field2326 = class11.field97;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method550(byte arg0) {
        int var1 = -61 % ((arg0 - 46) / 62);
        field1383 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1387 = arg1;
        this.field1378 = arg4;
        this.field1382 = arg0;
        this.field1389 = arg2;
        this.field1376 = arg3;
        this.field1384 = arg6;
        this.field1388 = arg5;
    }
}
