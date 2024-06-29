import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class131 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Ldf;")
    public static class51 field2189 = class46.method233("<col=80ff00>", 100);

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field2194 = 0;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field2193;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[Lg;")
    public static class254[] field2187;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public static void method961(boolean arg0) {
        field2193 = null;
        if (!arg0) {
            field2187 = null;
            field2189 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
    public static final void method962(boolean arg0) {
        try {
            if (class265.field4644 == null) {
                class265.field4644 = new class180(class25.field376, class20.method104(-123, new class51[] { class32.method164(-3850), class120.field1999 }).method298(0));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class265.field4644 = null;
        }
        field2190++;
        if (!arg0) {
            field2193 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ldf;I)V")
    public static final void method963(class51 arg0, int arg1) {
        class35.field528 = arg0;
        field2196++;
        if (class25.field376.field3999 == null) {
            return;
        }
        try {
            class51 var2 = class248.field4371.method308(25787, class25.field376.field3999);
            class51 var3 = class75.field1216.method308(25787, class25.field376.field3999);
            class51 var4 = class20.method104(-19, new class51[] { var2, class213.field3707, arg0, class26.field383, var3 });
            class51 var5;
            if (arg1 == arg0.method293(false)) {
                var5 = class20.method104(-122, new class51[] { var4, class95.field1561 });
            } else {
                var5 = class20.method104(-90, new class51[] { var4, class214.field3713, class85.method656(class7.method31((byte) -88) + 94608000000L, (byte) -105), class161.field2645, class105.method756(false, 94608000L) });
            }
            class20.method104(arg1 + 98, new class51[] { class114.field1942, var5, class69.field1116 }).method270(class25.field376.field3999, -119);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Ldf;")
    public static final class51 method964(int arg0, int arg1) {
        field2191++;
        class51 var2 = new class51();
        var2.field813 = new byte[arg1];
        var2.field855 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V")
    public static final void method965(byte arg0, int arg1) {
        class208.method1436(0);
        class42.method215(-25687);
        field2186++;
        int var2 = class115.method843((byte) -51, arg1).field2701;
        if (var2 == 0 || arg0 != 22) {
            return;
        }
        int var3 = class30.field439[arg1];
        if (var2 == 9) {
            class259.field4527 = var3;
        }
        if (var2 == 5) {
            class46.field728 = var3;
        }
        if (var2 == 6) {
            class82.field1368 = var3;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIILkb;IJ)Z")
    public static final boolean method966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class49 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class195.method1382(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILrb;IIII)V")
    public static final void method967(int arg0, int arg1, class247 arg2, int arg3, int arg4, int arg5, int arg6) {
        class249.method1694(arg5, arg4, arg1, arg2.field4348, arg2.field4319, arg6, arg3, (byte) -92);
        if (arg0 != 6) {
            field2187 = null;
        }
        field2192++;
    }
}
