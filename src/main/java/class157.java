import java.awt.event.ActionEvent;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class157 extends class12 {

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Lkh;")
    public static class117 field2851 = class224.method1450((byte) 121, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!od", name = "B", descriptor = "Lkh;")
    public static class117 field2853 = class224.method1450((byte) -109, "title_mute");

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Lkh;")
    private static class117 field2850 = class224.method1450((byte) -98, "Select a world");

    @OriginalMember(owner = "client!od", name = "F", descriptor = "Lkh;")
    public static class117 field2857 = field2850;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2846 = Calendar.getInstance();

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Lkh;")
    public static class117 field2865 = class224.method1450((byte) 107, "Passwort: ");

    @OriginalMember(owner = "client!od", name = "M", descriptor = "Lkh;")
    public static class117 field2864 = class224.method1450((byte) 127, "mapscene");

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field2863 = 0;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "Ljj;")
    public static class108 field2859;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "Lai;")
    public static class10 field2858;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "Ls;")
    public static class197 field2862;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static void method1111(int arg0) {
        field2865 = null;
        field2850 = null;
        field2853 = null;
        field2864 = null;
        field2862 = null;
        field2859 = null;
        field2846 = null;
        field2851 = null;
        field2857 = null;
        int var1 = 106 % ((arg0 - 60) / 47);
        field2858 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILli;)V")
    public static final void method1112(int arg0, class129 arg1) {
        if (arg1.field2382 != null) {
            arg1.field2382.field2753 = 0;
        }
        arg1.field2383 = false;
        field2860++;
        if (arg0 == -17921) {
            for (class129 var2 = arg1.method344(); var2 != null; var2 = arg1.method345()) {
                method1112(-17921, var2);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V")
    public static final void method1113(byte arg0, int arg1) {
        field2855++;
        class103 var2 = class199.field3581;
        synchronized (class199.field3581) {
            class26.field656 = arg1;
        }
        int var3 = 93 / ((68 - arg0) / 58);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Z")
    public static final boolean method1114(int arg0, int arg1, int arg2) {
        int var3 = class53.field1099[arg0][arg1][arg2];
        if (-class8.field146 == var3) {
            return false;
        } else if (class8.field146 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class140.method955(var4 + 1, class156.field2839[arg0][arg1][arg2], var5 + 1) && class140.method955(var4 + 128 - 1, class156.field2839[arg0][arg1 + 1][arg2], var5 + 1) && class140.method955(var4 + 128 - 1, class156.field2839[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class140.method955(var4 + 1, class156.field2839[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class53.field1099[arg0][arg1][arg2] = class8.field146;
                return true;
            } else {
                class53.field1099[arg0][arg1][arg2] = -class8.field146;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Object;ILmc;)V")
    public static final void method1115(Object arg0, int arg1, class134 arg2) {
        field2861++;
        if (arg2.field2417 == null || arg1 != -2228) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2417.peekEvent() != null; var3++) {
            class165.method1167(-22942, 1L);
        }
        if (arg0 != null) {
            arg2.field2417.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lve;Z)V")
    public static final void method1116(class234 arg0, boolean arg1) {
        if (arg0.field4264 == 0) {
            arg0.field4249 = 1024;
        }
        arg0.field4260 = 0;
        if (arg0.field4264 == 1) {
            arg0.field4249 = 1536;
        }
        if (arg0.field4264 == 2) {
            arg0.field4249 = 0;
        }
        field2847++;
        if (!arg1) {
            return;
        }
        if (arg0.field4264 == 3) {
            arg0.field4249 = 512;
        }
        int var2 = arg0.field4256 * 64 + arg0.field4239 * 128;
        int var3 = arg0.field4278 - class44.field966;
        arg0.field4244 += (var2 - arg0.field4244) / var3;
        int var4 = arg0.field4256 * 64 + arg0.field4227 * 128;
        arg0.field4221 += (var4 - arg0.field4221) / var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
    public static final int method1117(int arg0, int arg1) {
        field2849++;
        if (arg1 != -12192) {
            field2853 = null;
        }
        return arg0 >>> 7;
    }
}
