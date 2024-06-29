import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class135 extends Canvas {

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field3303;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Loa;")
    public static class98 field3292 = class38.method349(255, "m");

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3289 = 0;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Loa;")
    public static class98 field3296 = class38.method349(255, "backvmid1");

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Loa;")
    public static class98 field3295 = class38.method349(255, "sl_button");

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Loa;")
    public static class98 field3291 = class38.method349(255, " )2> @lre@");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Loa;")
    private static class98 field3288 = class38.method349(255, "Choose Option");

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "[Lpb;")
    public static class106[] field3300 = new class106[50];

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Loa;")
    public static class98 field3299 = field3288;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Loa;")
    public static class98 field3294 = class38.method349(255, "Untersuchen");

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Ltb;")
    public static class130 field3304;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lkd;")
    public static class73 field3290;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1095(int arg0) {
        field3294 = null;
        field3290 = null;
        field3295 = null;
        if (arg0 <= 90) {
            method1095(-49);
        }
        field3291 = null;
        field3300 = null;
        field3304 = null;
        field3288 = null;
        field3296 = null;
        field3299 = null;
        field3292 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lae;I)V")
    public static final void method1096(class6 arg0, int arg1) {
        class8.field162 = arg0;
        int var2 = 86 % ((-arg1 - 15) / 49);
        field3302++;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public static final void method1097(int arg0) {
        if (arg0 != 59) {
            method1097(-88);
        }
        field3293++;
        if (class72.field1503.toLowerCase().indexOf("microsoft") != -1) {
            class73.field1522[222] = 59;
            class73.field1522[187] = 27;
            class73.field1522[219] = 42;
            class73.field1522[221] = 43;
            class73.field1522[192] = 58;
            class73.field1522[223] = 28;
            class73.field1522[220] = 74;
            class73.field1522[191] = 73;
            class73.field1522[188] = 71;
            class73.field1522[186] = 57;
            class73.field1522[189] = 26;
            class73.field1522[190] = 72;
            return;
        }
        class73.field1522[61] = 27;
        class73.field1522[92] = 74;
        class73.field1522[93] = 43;
        class73.field1522[59] = 57;
        class73.field1522[45] = 26;
        class73.field1522[46] = 72;
        class73.field1522[44] = 71;
        class73.field1522[91] = 42;
        if (class72.field1504 == null) {
            class73.field1522[222] = 59;
            class73.field1522[192] = 58;
        } else {
            class73.field1522[520] = 59;
            class73.field1522[222] = 58;
            class73.field1522[192] = 28;
        }
        class73.field1522[47] = 73;
    }

    @OriginalMember(owner = "client!ua", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3297++;
        this.field3303.update(arg0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLve;I[B)V")
    public static final void method1098(boolean arg0, class145 arg1, int arg2, byte[] arg3) {
        field3298++;
        class117 var4 = new class117();
        var4.field2609 = 0;
        var4.field2729 = arg2;
        var4.field2621 = arg1;
        var4.field2614 = arg3;
        class63 var5 = class53.field1184;
        synchronized (class53.field1184) {
            class53.field1184.method508(55, var4);
        }
        class125.method989(arg0);
    }

    @OriginalMember(owner = "client!ua", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3306++;
        this.field3303.paint(arg0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)I")
    public static final int method1099(int arg0, byte arg1, int arg2) {
        field3305++;
        class139 var3 = (class139) class67.field1422.method17(-16, (long) arg2);
        if (arg1 >= -100) {
            method1095(27);
        }
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field3389.length > arg0) {
            return var3.field3389[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
    public static final void method1100(int arg0, int arg1, int arg2) {
        field3301++;
        if (arg0 != 21794) {
            return;
        }
        int[] var3 = new int[4];
        int var4 = 1;
        int[] var5 = new int[4];
        var5[0] = arg2;
        var3[0] = arg1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class101.field2336[var6] != arg2) {
                var5[var4] = class101.field2336[var6];
                var3[var4] = class102.field2350[var6];
                var4++;
            }
        }
        class102.field2350 = var3;
        class101.field2336 = var5;
        class37.method345(-119, class102.field2350, class101.field2336, 0, class19.field427.length - 1, class19.field427);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class135(Component arg0) {
        this.field3303 = arg0;
    }
}
