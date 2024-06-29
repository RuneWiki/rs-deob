import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class706 implements class540 {

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Lti;")
    public class463 field9845;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public int field9835;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lin;")
    public class97 field9843;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public int field9838;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public int field9840;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public int field9832;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public int field9837;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public int field9833;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public int field9834;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field9841;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Lsaa;", line = 17)
    public class345 method1656(int arg0) {
        field9841++;
        if (arg0 != 0) {
            method3994(31, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 28)
    public static final void method3992(boolean arg0) {
        if (class111.field1700 != null) {
            for (int var1 = 0; var1 < class169.field2647; var1++) {
                class111.field1700[var1] = null;
            }
            class111.field1700 = null;
        }
        field9836++;
        if (class481.field6754 != null) {
            for (int var2 = 0; var2 < class715.field9911; var2++) {
                class481.field6754[var2] = null;
            }
            class481.field6754 = null;
        }
        if (class626.field8776 != null) {
            for (int var3 = 0; var3 < class296.field4300; var3++) {
                class626.field8776[var3] = null;
            }
            class626.field8776 = null;
        }
        class335.field4721 = null;
        class485.field6828 = null;
        class440.field5978 = null;
        if (arg0) {
            class215.field3323 = -1;
            class476.field6672 = -1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lso;B)V", line = 82)
    public static final void method3993(class494 arg0, byte arg1) {
        field9839++;
        if (arg1 != -7) {
            method3994(13, null);
        }
        if ((arg0.field7050.length - arg0.field7042) < 1) {
            return;
        }
        int var2 = arg0.method2964((byte) 67);
        if (var2 < 0 || var2 > 1 || (arg0.field7050.length - arg0.field7042) < 2) {
            return;
        }
        int var3 = arg0.method2998(true);
        if (arg0.field7050.length - arg0.field7042 < var3 * 6) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2998(true);
            int var6 = arg0.method2976(-125);
            if (var5 < class672.field9369.length && class433.field5868[var5] && (class29.field415.method4288(var5, 9381).field2103 != '1' || var6 >= -1 && var6 <= 1)) {
                class672.field9369[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILso;)V", line = 131)
    public static final void method3994(int arg0, class494 arg1) {
        if (arg0 != -65536) {
            return;
        }
        for (int var2 = 0; var2 < class637.field8944; var2++) {
            int var3 = arg1.method2993(37);
            int var4 = arg1.method2998(true);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class266.field3888[var3] != null) {
                class266.field3888[var3].field7400 = var4;
            }
        }
        field9844++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lkv;IIIB)V", line = 159)
    public static final void method3995(class282 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field9842++;
        for (class513 var5 = (class513) class488.field6903.method1731((byte) -124); var5 != null; var5 = (class513) class488.field6903.method1724(0)) {
            if (var5.field7259 == arg3 && (arg2 << 9) == var5.field7256 && (arg1 << 9) == var5.field7264 && var5.field7261.field4100 == arg0.field4100) {
                if (var5.field7236 != null) {
                    class184.field2828.method426(var5.field7236);
                    var5.field7236 = null;
                }
                if (var5.field7252 != null) {
                    class184.field2828.method426(var5.field7252);
                    var5.field7252 = null;
                }
                var5.method3387((byte) -117);
                return;
            }
        }
        int var6 = -91 / ((59 - arg4) / 43);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lin;Lti;IIIIIII)V", line = 196)
    public class706(class97 arg0, class463 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field9845 = arg1;
        this.field9835 = arg8;
        this.field9843 = arg0;
        this.field9838 = arg2;
        this.field9840 = arg7;
        this.field9832 = arg3;
        this.field9837 = arg5;
        this.field9833 = arg4;
        this.field9834 = arg6;
    }
}
