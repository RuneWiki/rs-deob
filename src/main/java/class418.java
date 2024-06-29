import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class418 {

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
    public int field5723 = class352.method2231((byte) 25);

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "I")
    public int field5728;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
    public int field5725;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public int field5721;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "Ljava/lang/String;")
    public String field5720;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
    public int field5718;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "Ljava/lang/String;")
    public String field5729;

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "Ljava/lang/String;")
    public String field5727;

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "Ljava/lang/String;")
    public String field5726;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "Ljava/lang/String;")
    public String field5717;

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "[Lvv;")
    public static class343[] field5724 = new class343[5];

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
    public static int field5722 = 0;

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "Z")
    public static boolean field5731;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
    public static int field5730;

    static {
        for (int var0 = 0; var0 < field5724.length; var0++) {
            field5724[var0] = new class343();
        }
        field5731 = false;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V", line = 8)
    public static void method2538(int arg0) {
        int var1 = 83 / ((-arg0 - 43) / 48);
        field5724 = null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIBIII)V", line = 17)
    public static final void method2539(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5730++;
        int var6 = arg3 - arg1;
        int var7 = arg4 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class66.method560(arg4, arg1, arg5, arg0, 0);
            }
        } else if (var7 == 0) {
            class284.method1848((byte) -124, arg1, arg3, arg0, arg5);
        } else {
            if (arg2 < 29) {
                field5722 = 127;
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class618.field8645) {
                var10 = (class618.field8645 * var8 >> 12) + var9;
                var11 = class618.field8645;
            } else if (class463.field6533 < arg3) {
                var10 = (class463.field6533 * var8 >> 12) + var9;
                var11 = class463.field6533;
            } else {
                var10 = arg4;
                var11 = arg3;
            }
            int var12;
            int var13;
            if (arg1 < class618.field8645) {
                var12 = class618.field8645;
                var13 = (class618.field8645 * var8 >> 12) + var9;
            } else if (class463.field6533 >= arg1) {
                var12 = arg1;
                var13 = arg5;
            } else {
                var13 = (class463.field6533 * var8 >> 12) + var9;
                var12 = class463.field6533;
            }
            if (var13 < class734.field10153) {
                var12 = (class734.field10153 - var9 << 12) / var8;
                var13 = class734.field10153;
            } else if (class407.field5535 < var13) {
                var12 = (class407.field5535 - var9 << 12) / var8;
                var13 = class407.field5535;
            }
            if (var10 < class734.field10153) {
                var10 = class734.field10153;
                var11 = (class734.field10153 - var9 << 12) / var8;
            } else if (class407.field5535 < var10) {
                var10 = class407.field5535;
                var11 = (class407.field5535 - var9 << 12) / var8;
            }
            class128.method956(arg0, var11, var10, var12, (byte) 85, var13);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", line = 121)
    public final void method2540(String arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, String arg7, String arg8) {
        if (arg2 != -12273) {
            this.method2540(null, -67, 46, -45, null, null, -100, null, null);
        }
        field5719++;
        this.field5723 = class352.method2231((byte) 26);
        this.field5728 = arg3;
        this.field5725 = arg6;
        this.field5726 = arg8;
        this.field5720 = arg7;
        this.field5717 = arg4;
        this.field5729 = arg0;
        this.field5721 = class192.field2961;
        this.field5727 = arg5;
        this.field5718 = arg1;
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 155)
    public class418(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field5728 = arg0;
        this.field5725 = arg6;
        this.field5721 = class192.field2961;
        this.field5720 = arg5;
        this.field5718 = arg1;
        this.field5729 = arg2;
        this.field5727 = arg7;
        this.field5726 = arg4;
        this.field5717 = arg3;
    }
}
