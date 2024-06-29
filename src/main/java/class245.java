import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class245 extends class304 {

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field3705 = 0;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "[I")
    public static int[] field3708 = new int[2500];

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    public static int field3716 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
    public static int field3715 = 64;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "Lak;")
    public static class153 field3712;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "Ljd;")
    public static class95 field3711;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)[[I", line = 6)
    public final int[][] method75(int arg0, int arg1) {
        field3717++;
        if (arg1 != 0) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class218.field3333; var7++) {
                this.method1687(var7, arg0, true);
                int[][] var8 = this.method2082(0, (byte) -110, class178.field2835);
                var5[var7] = var8[0][class47.field655];
                var4[var7] = var8[1][class47.field655];
                var6[var7] = var8[2][class47.field655];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 52)
    public class245() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V", line = 59)
    public static void method1683(int arg0) {
        field3712 = null;
        field3711 = null;
        if (arg0 < 101) {
            method1685(24, (Component) null);
        }
        field3708 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I", line = 82)
    public final int[] method71(int arg0, int arg1) {
        field3707++;
        if (arg0 != 7) {
            return (int[]) null;
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            for (int var4 = 0; var4 < class218.field3333; var4++) {
                this.method1687(var4, arg1, true);
                int[] var5 = this.method2086(class178.field2835, 0, (byte) 112);
                var3[var4] = var5[class47.field655];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lwm;II)V", line = 114)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field3710++;
        if (arg2 == -2828 && arg1 == 0) {
            this.field4652 = arg0.method1774((byte) -107) == 1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V", line = 132)
    public static final void method1684(int arg0) {
        class220.field3362 = (byte[][]) null;
        class133.field2028 = null;
        class209.field3191 = null;
        class304.field4666 = null;
        class82.field1212 = null;
        if (arg0 == 255) {
            class27.field293 = null;
            field3713++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 152)
    public static final void method1685(int arg0, Component arg1) {
        field3714++;
        arg1.removeMouseListener(class209.field3195);
        arg1.removeMouseMotionListener(class209.field3195);
        if (arg0 != -2136) {
            method1684(-17);
        }
        arg1.removeFocusListener(class209.field3195);
        class161.field2489 = 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 167)
    public static final String[] method1686(String[] arg0, int arg1) {
        field3709++;
        if (arg1 != 2048) {
            method1684(42);
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZ)V", line = 195)
    private final void method1687(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1683(-8);
        }
        field3706++;
        int var4 = class162.field2631[arg0];
        int var5 = class84.field1225[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && -2.356194490192345D >= (double) var6) {
            class47.field655 = arg0;
            class178.field2835 = arg1;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class178.field2835 = arg0;
            class47.field655 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class47.field655 = class218.field3333 - arg1;
            class178.field2835 = arg0;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class178.field2835 = class109.field1648 - arg1;
            class47.field655 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class178.field2835 = class109.field1648 - arg1;
            class47.field655 = class218.field3333 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class178.field2835 = class109.field1648 - arg0;
            class47.field655 = class218.field3333 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class47.field655 = arg1;
            class178.field2835 = class109.field1648 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class178.field2835 = arg1;
            class47.field655 = class218.field3333 - arg0;
        }
        class178.field2835 &= class65.field941;
        class47.field655 &= class54.field721;
    }
}
