import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class232 {

    @OriginalMember(owner = "client!we", name = "A", descriptor = "B")
    public byte field3876 = 0;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "S")
    public short field3880;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "S")
    public short field3868;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "B")
    public byte field3874;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "B")
    public byte field3879;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[Z")
    public static boolean[] field3856 = new boolean[112];

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3859 = "Loading wordpack - ";

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3852 = "";

    @OriginalMember(owner = "client!we", name = "u", descriptor = "J")
    public static long field3870 = 0L;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3867 = 255;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field3888 = 50;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field3884 = new String[field3888];

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[I")
    public static int[] field3862 = new int[field3888];

    @OriginalMember(owner = "client!we", name = "G", descriptor = "[I")
    public static int[] field3882 = new int[field3888];

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
    public static int[] field3853 = new int[field3888];

    @OriginalMember(owner = "client!we", name = "f", descriptor = "[I")
    public static int[] field3855 = new int[field3888];

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[I")
    public static int[] field3854 = new int[field3888];

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
    public static int[] field3851 = new int[field3888];

    @OriginalMember(owner = "client!we", name = "t", descriptor = "B")
    public byte field3869;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "B")
    public byte field3875;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "B")
    public byte field3881;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "B")
    public byte field3890;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lop;")
    public class101 field3860;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Ltk;")
    public class191 field3864;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Ljp;")
    public class198 field3865;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lwe;")
    public class232 field3863;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lgr;")
    public class247 field3866;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "Lcb;")
    public class303 field3878;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "Lcb;")
    public class303 field3889;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "Laq;")
    public class89 field3872;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "Laq;")
    public class89 field3873;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "S")
    public short field3887;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "Z")
    public boolean field3883;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "Z")
    public boolean field3885;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "Z")
    public boolean field3886;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "[I")
    public static int[] field3877;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I", line = 7)
    public static final int method1645(int arg0) {
        if (arg0 == 6) {
            field3858++;
            return 6;
        } else {
            return 46;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)I", line = 20)
    public static final int method1646(int arg0, byte arg1, int arg2) {
        field3857++;
        if (arg2 == 1 || arg2 == 3) {
            return class252.field4106[arg0 & 0x3];
        } else {
            if (arg1 < 105) {
                field3856 = null;
            }
            return class198.field3200[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIIIII)V", line = 37)
    public static final void method1647(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            class296.method1997(-3660);
        }
        field3871++;
        if (class395.field5920 != null && (arg4 != 3 || class343.field5286 != arg2 || class417.field6163 != arg3)) {
            class303.method2036(-123, class63.field822, class395.field5920);
            class395.field5920 = null;
        }
        if (arg4 == 3 && class395.field5920 == null) {
            class395.field5920 = class361.method2342(-4490, class63.field822, arg3, arg2, 0, 0);
            if (class395.field5920 != null) {
                class417.field6163 = arg3;
                class343.field5286 = arg2;
                class306.method2062((byte) 97, class63.field822);
            }
        }
        if (arg4 == 3 && class395.field5920 == null) {
            method1647(true, 2, -1, -1, class317.field4970, arg5);
            return;
        }
        Container var6;
        if (class395.field5920 != null) {
            class318.field4984 = arg2;
            class284.field4567 = arg3;
            var6 = class395.field5920;
        } else if (class47.field587 == null) {
            var6 = class63.field822.field4464;
            class318.field4984 = var6.getSize().width;
            class284.field4567 = var6.getSize().height;
        } else {
            Insets var7 = class47.field587.getInsets();
            class318.field4984 = class47.field587.getSize().width - var7.left - var7.right;
            int var10001 = var7.top + var7.bottom;
            class284.field4567 = class47.field587.getSize().height - var10001;
            var6 = class47.field587;
        }
        if (arg4 == 1) {
            class13.field192 = (class318.field4984 - 765) / 2;
            class108.field1512 = 0;
            class369.field5615 = 765;
            class430.field6324 = 503;
        } else if (class27.field314 < 96 && class128.field2035 == 0) {
            int var8 = class318.field4984 <= 1024 ? class318.field4984 : 1024;
            class13.field192 = (class318.field4984 - var8) / 2;
            class369.field5615 = var8;
            int var9 = class284.field4567 > 768 ? 768 : class284.field4567;
            class108.field1512 = 0;
            class430.field6324 = var9;
        } else {
            class430.field6324 = class284.field4567;
            class13.field192 = 0;
            class369.field5615 = class318.field4984;
            class108.field1512 = 0;
        }
        if (class141.field2184 != 0) {
            boolean var10000;
            if (class369.field5615 < 1024 && class430.field6324 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0) {
            class221.method1586(arg1 ^ 0xFFFFFC0D, class128.field2035);
        } else {
            class86.field1073.setSize(class369.field5615, class430.field6324);
            if (class284.field4547 != null) {
                class284.field4547.method566();
            }
            if (class47.field587 == var6) {
                Insets var10 = class47.field587.getInsets();
                class86.field1073.setLocation(class13.field192 + var10.left, class108.field1512 + var10.top);
            } else {
                class86.field1073.setLocation(class13.field192, class108.field1512);
            }
        }
        if (arg1 <= arg4) {
            class9.field112 = true;
        } else {
            class9.field112 = false;
        }
        if (class306.field4847 != -1) {
            class354.method2307(127, true);
        }
        if (class421.field6216 != null && (class262.field4219 == 30 || class262.field4219 == 25)) {
            class277.method1865((byte) 123);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class267.field4296[var11] = true;
        }
        class208.field3353 = true;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(III)V", line = 189)
    public class232(int arg0, int arg1, int arg2) {
        this.field3880 = (short) arg2;
        this.field3868 = (short) arg1;
        this.field3879 = this.field3874 = (byte) arg0;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 204)
    public final void method1648(int arg0) {
        field3861++;
        while (this.field3866 != null) {
            class247 var2 = this.field3866.field4054;
            this.field3866.method1713(-1479);
            this.field3866 = var2;
        }
        this.field3876 = 0;
        if (arg0 != -8596) {
            method1647(true, -28, 82, 79, 7, -121);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(ZIIIII)V", line = 223)
    public static final void method1649(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3850++;
        if (!arg0) {
            field3859 = null;
        }
        for (int var6 = arg1; var6 <= arg4; var6++) {
            class256.method1769(arg5, class277.field4414[var6], (byte) 92, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 273)
    public static void method1650(byte arg0) {
        field3854 = null;
        if (arg0 != 43) {
            field3888 = 65;
        }
        field3855 = null;
        field3862 = null;
        field3859 = null;
        field3882 = null;
        field3853 = null;
        field3884 = null;
        field3856 = null;
        field3851 = null;
        field3852 = null;
        field3877 = null;
    }
}
