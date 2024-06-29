import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class27 extends class25 {

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Lcd;")
    public static class64 field434 = class44.method335((byte) 71, "Stufe:");

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "[J")
    public static long[] field433 = new long[32];

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field438 = 0;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field439 = 0;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lig;")
    public static class168 field435 = new class168(30);

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field445 = 10;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Lqd;")
    public static class40 field436;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Ljava/awt/Frame;")
    public static Frame field441;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lwh;BLwh;ZI)I", line = 5)
    public static final int method240(class9 arg0, byte arg1, class9 arg2, boolean arg3, int arg4) {
        field442++;
        if (arg4 == 1) {
            int var5 = arg2.field4576;
            int var6 = arg0.field4576;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg4 == 2) {
            return arg0.method83((byte) -26).field1219.method512(arg2.method83((byte) -104).field1219, false);
        } else {
            if (arg1 != 101) {
                field439 = 39;
            }
            if (arg4 == 3) {
                return arg0.field191.method512(arg2.field191, false);
            } else if (arg4 == 4) {
                return arg0.method1860(arg1 ^ 0xFFFFFFEC) ? (arg2.method1860(-127) ? 0 : 1) : (arg2.method1860(-124) ? -1 : 0);
            } else if (arg4 == 5) {
                return arg0.method1862(false) ? (arg2.method1862(false) ? 0 : 1) : (arg2.method1862(false) ? -1 : 0);
            } else if (arg4 == 6) {
                return arg0.method1863(343) ? (arg2.method1863(343) ? 0 : 1) : (arg2.method1863(arg1 + 242) ? -1 : 0);
            } else if (arg4 == 7) {
                return arg0.method1864((byte) 103) ? (arg2.method1864((byte) 75) ? 0 : 1) : (arg2.method1864((byte) 43) ? -1 : 0);
            } else {
                return arg0.field186 - arg2.field186;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 63)
    public static void method241(boolean arg0) {
        field433 = null;
        field441 = null;
        field434 = null;
        if (!arg0) {
            field435 = (class168) null;
        }
        field436 = null;
        field435 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[JI[II)V", line = 82)
    public static final void method242(int arg0, long[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 != -8731) {
            return;
        }
        if (arg0 < arg2) {
            int var5 = arg0;
            int var6 = (arg0 + arg2) / 2;
            long var7 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var7;
            int var9 = arg3[var6];
            arg3[var6] = arg3[arg2];
            arg3[arg2] = var9;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if ((var7 + ((long) (var10 & 0x1))) > arg1[var10]) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var5];
                    arg1[var5] = var11;
                    int var13 = arg3[var10];
                    arg3[var10] = arg3[var5];
                    arg3[var5++] = var13;
                }
            }
            arg1[arg2] = arg1[var5];
            arg1[var5] = var7;
            arg3[arg2] = arg3[var5];
            arg3[var5] = var9;
            method242(arg0, arg1, var5 - 1, arg3, -8731);
            method242(var5 + 1, arg1, arg2, arg3, -8731);
        }
        field443++;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V", line = 135)
    public static final void method243(int arg0) {
        field432++;
        Container var1;
        if (class263.field4514 != null) {
            var1 = class263.field4514;
        } else if (field441 == null) {
            var1 = class228.field3876.field4845;
        } else {
            var1 = field441;
        }
        if (arg0 < 67) {
            return;
        }
        class34.field549 = var1.getSize().width;
        class2.field7 = var1.getSize().height;
        if (field441 == var1) {
            Insets var2 = field441.getInsets();
            class2.field7 -= var2.top + var2.bottom;
            class34.field549 -= var2.right + var2.left;
        }
        if (class97.method731(29983) < 2) {
            class2.field14 = (class34.field549 - 765) / 2;
            class13.field290 = 765;
            class58.field960 = 503;
            class277.field4774 = 0;
        } else {
            class13.field290 = class34.field549;
            class277.field4774 = 0;
            class2.field14 = 0;
            class58.field960 = class2.field7;
        }
        if (class123.field2216) {
            class123.method887(class13.field290, class58.field960);
        }
        class307.field5251.setSize(class13.field290, class58.field960);
        if (field441 == var1) {
            Insets var3 = field441.getInsets();
            class307.field5251.setLocation(class2.field14 + var3.left, class277.field4774 + var3.top);
        } else {
            class307.field5251.setLocation(class2.field14, class277.field4774);
        }
        if (class83.field1524 != -1) {
            class267.method1866(true, 65);
        }
        class109.method795(0);
    }
}
