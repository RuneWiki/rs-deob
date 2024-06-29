import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class57 {

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lqe;")
    public class295 field791;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field787 = 0;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lih;")
    public static class73 field790 = null;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Ljava/lang/String;")
    public static String field797 = "glow1:";

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lul;")
    public static class191 field794;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Luh;")
    public static class239 field795;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lce;I)V")
    public static final void method354(class197 arg0, int arg1) {
        field796++;
        int var2 = -1;
        long var3 = 0L;
        if (arg0.field3008 == 0) {
            var3 = class51.method312(arg0.field3021, arg0.field3009, arg0.field3006);
        }
        if (arg0.field3008 == 1) {
            var3 = class5.method27(arg0.field3021, arg0.field3009, arg0.field3006);
        }
        int var5 = 0;
        int var6 = 0;
        if (arg0.field3008 == 2) {
            var3 = class156.method970(arg0.field3021, arg0.field3009, arg0.field3006);
        }
        if (arg0.field3008 == 3) {
            var3 = class169.method1079(arg0.field3021, arg0.field3009, arg0.field3006);
        }
        if (var3 != 0L) {
            var6 = ((int) var3 & 0x335FB6) >> 20;
            var5 = (int) var3 >> 14 & 0x1F;
            var2 = Integer.MAX_VALUE & (int) (var3 >>> 32);
        }
        int var7 = -81 / ((arg1 + 23) / 38);
        arg0.field3003 = var2;
        arg0.field3002 = var6;
        arg0.field3007 = var5;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIZ)V")
    public static final void method355(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class207.field3086 = arg1;
        class265.field4271 = arg2;
        class307.field4936 = arg3;
        class174.field2456 = new class91[arg0][class207.field3086][class265.field4271];
        class2.field7 = new int[arg0][class207.field3086 + 1][class265.field4271 + 1];
        if (arg4) {
            class184.field2793 = new class91[1][class207.field3086][class265.field4271];
            class271.field4320 = new int[class207.field3086][class265.field4271];
            class228.field3576 = new int[1][class207.field3086 + 1][class265.field4271 + 1];
        } else {
            class184.field2793 = null;
            class271.field4320 = null;
            class228.field3576 = null;
        }
        class199.method1252(false);
        class288.field4590 = new class185[500];
        class195.field2991 = 0;
        class156.field2155 = new class185[500];
        class17.field302 = 0;
        class257.field4159 = new int[arg0][class207.field3086 + 1][class265.field4271 + 1];
        class126.field1764 = new class160[5000];
        field787 = 0;
        class120.field1713 = new class160[100];
        class267.field4284 = new boolean[class307.field4936 + class307.field4936 + 1][class307.field4936 + class307.field4936 + 1];
        class163.field2312 = new boolean[class307.field4936 + class307.field4936 + 2][class307.field4936 + class307.field4936 + 2];
        class151.field2097 = new byte[arg0][class207.field3086][class265.field4271];
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILnh;B)Lbf;")
    public static final class108 method356(int arg0, class305 arg1, byte arg2) {
        field789++;
        if (arg2 == -92) {
            return class109.method696(0, arg0, arg1) ? class102.method654(false) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method357(int arg0) {
        if (arg0 != -31038) {
            method356(12, (class305) null, (byte) -19);
        }
        field794 = null;
        field795 = null;
        field790 = null;
        field797 = null;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II)V")
    public class57(int arg0, int arg1) {
        this.field791 = class177.method1114(1, arg0);
        this.field793 = arg1;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lqe;I)V")
    public class57(class295 arg0, int arg1) {
        this.field793 = arg1;
        this.field791 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z")
    public static final boolean method358(int arg0, int arg1, int arg2) {
        int var3 = class257.field4159[arg0][arg1][arg2];
        if (-class2.field14 == var3) {
            return false;
        } else if (class2.field14 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class272.method1772(var4 + 1, class185.field2812[arg0][arg1][arg2], var5 + 1) && class272.method1772(var4 + 128 - 1, class185.field2812[arg0][arg1 + 1][arg2], var5 + 1) && class272.method1772(var4 + 128 - 1, class185.field2812[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class272.method1772(var4 + 1, class185.field2812[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class257.field4159[arg0][arg1][arg2] = class2.field14;
                return true;
            } else {
                class257.field4159[arg0][arg1][arg2] = -class2.field14;
                return false;
            }
        }
    }
}
