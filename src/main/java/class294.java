import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class294 extends class154 {

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    private int field4566;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    private int field4572;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    private int field4573;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    private int field4570;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Ldf;")
    public static class177 field4567 = new class177(128);

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Lfk;")
    public static class317 field4575 = new class317();

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Ll;")
    public static class66 field4576 = new class66(64);

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field4577 = 0;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIII)V", line = 4)
    public class294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4566 = arg0;
        this.field4572 = arg2;
        this.field4573 = arg3;
        this.field4570 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V", line = 20)
    public final void method1268(int arg0, int arg1, int arg2) {
        field4574++;
        if (arg1 <= 91) {
            return;
        }
        int var4 = this.field4572 * arg0 >> 12;
        int var5 = this.field4566 * arg0 >> 12;
        int var6 = this.field4573 * arg2 >> 12;
        int var7 = this.field4570 * arg2 >> 12;
        class10.method100(var4, var6, var5, this.field2498, var7, -28776);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IBI)V", line = 40)
    public final void method1269(int arg0, byte arg1, int arg2) {
        if (arg1 <= 37) {
            method2124(-76, false);
        }
        field4563++;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)Lkl;", line = 54)
    public static final class280 method2123(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5065;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)Z", line = 63)
    public static final boolean method2124(int arg0, boolean arg1) {
        field4568++;
        if (!arg1) {
            return false;
        }
        class316 var2 = class345.method2432(arg0, (byte) -25);
        if (var2 == null) {
            return false;
        } else if (class323.field4971 == 1 || class323.field4971 == 2 || class353.field5636 == 2) {
            class166.field2643 = var2.field4870;
            class207.field3196 = var2.field4875;
            if (class353.field5636 != 0) {
                class66.field1011 = class207.field3196 + 50000;
                class207.field3188 = class207.field3196 + 40000;
                class301.field4681 = class207.field3188;
            }
            return true;
        } else {
            String var3 = "";
            if (class353.field5636 != 0) {
                var3 = ":" + (var2.field4875 + 7000);
            }
            String var4 = "";
            if (class181.field2853 != null) {
                var4 = "/p=" + class181.field2853;
            }
            String var5 = "http://" + var2.field4870 + var3 + "/l=" + class339.field5211 + "/a=" + class350.field5549 + var4 + "/j" + (class23.field354 ? "1" : "0") + ",o" + (class89.field1266 ? "1" : "0") + ",a2,m" + (class148.field2428 ? "1" : "0");
            try {
                class110.field1674.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 113)
    public static final void method2125(int arg0) {
        if (arg0 != 10250) {
            method2123(56, 4, 33);
        }
        field4562++;
        for (class36 var1 = (class36) class135.field2251.method371(arg0 - 29389); var1 != null; var1 = (class36) class135.field2251.method378((byte) -66)) {
            int var2 = var1.field540;
            if (class328.method2321(0, var2)) {
                boolean var3 = true;
                class342[] var4 = class334.field5108[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field5340;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2734;
                    class342 var7 = class355.method2497(arg0 - 10250, var6);
                    if (var7 != null) {
                        class339.method2380(var7, 108);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 174)
    public static void method2126(int arg0) {
        field4575 = null;
        if (arg0 == -1313) {
            field4567 = null;
            field4576 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBI)V", line = 186)
    public final void method1265(int arg0, byte arg1, int arg2) {
        field4564++;
        int var4 = 9 % ((arg1 + 4) / 40);
    }
}
