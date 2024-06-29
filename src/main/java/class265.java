import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class265 extends class260 {

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public int field3659;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Z")
    public boolean field3655;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public int field3661;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public int field3662;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public int field3657;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "Lwj;")
    public static class270 field3664 = new class270(30, 6);

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)V")
    public static final void method1587(byte arg0, int arg1) {
        field3658++;
        if (arg1 == -1) {
            return;
        }
        if (arg0 >= -86) {
            method1587((byte) -123, -73);
        }
        if (class255.field3535[arg1]) {
            class136.field1958.method755(-1, arg1);
            class495.field7226[arg1] = null;
            class421.field6175[arg1] = null;
            class255.field3535[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
    public static void method1588(int arg0) {
        field3664 = null;
        if (arg0 != -2) {
            field3660 = 80;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([BI)Leh;")
    public static final class242 method1589(byte[] arg0, int arg1) {
        field3663++;
        class242 var2 = new class242();
        class391 var3 = new class391(arg0);
        var3.field5719 = var3.field5678.length - 2;
        int var4 = var3.method2353((byte) 95);
        int var5 = var3.field5678.length - var4 - 2 - 12;
        var3.field5719 = var5;
        int var6 = var3.method2361((byte) -56);
        var2.field3377 = var3.method2353((byte) 80);
        var2.field3383 = var3.method2353((byte) 107);
        var2.field3378 = var3.method2353((byte) 114);
        var2.field3376 = var3.method2353((byte) 119);
        int var7 = var3.method2348(-2);
        if (var7 > 0) {
            var2.field3387 = new class247[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2353((byte) 108);
                class247 var10 = new class247(class508.method3034(var9, true));
                var2.field3387[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method2361((byte) -56);
                    int var12 = var3.method2361((byte) -56);
                    var10.method1487(-117, (long) var11, new class500(var12));
                }
            }
        }
        var3.field5719 = 0;
        var2.field3374 = var3.method2304(true);
        var2.field3381 = new int[var6];
        var2.field3386 = new int[var6];
        var2.field3382 = new String[var6];
        int var13 = 0;
        while (var3.field5719 < var5) {
            int var14 = var3.method2353((byte) 64);
            if (var14 == 3) {
                var2.field3382[var13] = var3.method2347((byte) 46).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field3386[var13] = var3.method2348(-2);
            } else {
                var2.field3386[var13] = var3.method2361((byte) -56);
            }
            var2.field3381[var13++] = var14;
        }
        if (arg1 != 3) {
            field3664 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIIZ)V")
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3659 = arg0;
        this.field3656 = arg4;
        this.field3655 = arg5;
        this.field3661 = arg1;
        this.field3662 = arg3;
        this.field3657 = arg2;
    }
}
