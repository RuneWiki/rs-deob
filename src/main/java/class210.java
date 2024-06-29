import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class210 extends class376 {

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public int field2827;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "[I")
    public static int[] field2824;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public static final void method1362(int arg0) {
        field2826++;
        if (arg0 != 17612) {
            method1363(false, (class296) null);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class259.field3553[var1] = true;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLqj;)V")
    public static final void method1363(boolean arg0, class296 arg1) {
        class153.field2163 = arg1.method1914(-1, "p11_full");
        field2825++;
        class8.field121 = arg1.method1914(-1, "p12_full");
        class132.field1838 = arg1.method1914(-1, "b12_full");
        class94.field1407 = arg1.method1914(-1, "hitmarks");
        class326.field4450 = arg1.method1914(-1, "hitbar_default");
        class60.field838 = arg1.method1914(-1, "timerbar_default");
        class169.field2406 = arg1.method1914(-1, "headicons_pk");
        client.field2331 = arg1.method1914(-1, "headicons_prayer");
        class237.field3226 = arg1.method1914(-1, "hint_headicons");
        class48.field734 = arg1.method1914(-1, "hint_mapmarkers");
        class9.field140 = arg1.method1914(-1, "mapflag");
        class24.field321 = arg1.method1914(-1, "cross");
        class232.field3122 = arg1.method1914(-1, "mapdots");
        if (arg0) {
            return;
        }
        class305.field4196 = arg1.method1914(-1, "scrollbar");
        class427.field6122 = arg1.method1914(-1, "name_icons");
        class424.field6094 = arg1.method1914(-1, "floorshadows");
        class431.field6204 = arg1.method1914(-1, "compass");
        class166.field2373 = arg1.method1914(-1, "hint_mapedge");
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
    public static void method1364(int arg0) {
        if (arg0 != 4) {
            method1366(23, (byte) 79);
        }
        field2824 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIB)V")
    public static final void method1365(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class204.field2764 == 1) {
            class157.field2230[class369.field5234 / 100].method867(class225.field3025 - 8, class27.field437 + -8);
        }
        field2830++;
        if (arg4 != -50) {
            field2824 = null;
        }
        if (class204.field2764 == 2) {
            class157.field2230[(class369.field5234 / 100) + 4].method867(class225.field3025 - 8, class27.field437 + -8);
        }
        class337.method2098(arg4 ^ 0xFFFFFFAD);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(II)V")
    public class210(int arg0, int arg1) {
        this.field2829 = arg0;
        this.field2827 = arg1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)I")
    public static final int method1366(int arg0, byte arg1) {
        if (arg1 >= -117) {
            return -12;
        } else {
            field2828++;
            return arg0 & 0xFF;
        }
    }
}
