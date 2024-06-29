import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class192 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field2222 = class175.method1068(0);

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Ljava/lang/String;")
    public String field2231;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Ljava/lang/String;")
    public String field2227;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Ljava/lang/String;")
    public String field2228;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Ljava/lang/String;")
    public String field2223;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/String;")
    public String field2230;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lib;")
    public static class14 field2221 = new class14(5, 1);

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1168(int arg0) {
        if (arg0 != 1) {
            field2221 = null;
        }
        field2221 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(JZ)V")
    public static final void method1169(long arg0, boolean arg1) {
        field2232++;
        class653 var3 = class496.method2869(-107);
        if (arg1) {
            return;
        }
        var3.field9158.method658(class249.field3124.field1673, (byte) 123);
        var3.field9158.method670((byte) 81, arg0);
        var3.field9158.method658(class504.field7267, (byte) 104);
        class568.method3220(var3, (byte) 112);
        class51.field514 = 0;
        class239.field2965 = -3;
        class227.field2811 = 0;
        class654.field9183 = 1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static final void method1170(byte arg0) {
        field2229++;
        class680.field9579.method88(71);
        if (arg0 != 17) {
            method1168(105);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)V")
    public final void method1171(int arg0, String arg1, int arg2, int arg3, String arg4, String arg5, byte arg6, String arg7, String arg8) {
        this.field2222 = class175.method1068(arg6 - 68);
        field2226++;
        this.field2227 = arg5;
        this.field2224 = arg2;
        this.field2223 = arg8;
        this.field2225 = class678.field9539;
        this.field2233 = arg0;
        this.field2220 = arg3;
        this.field2228 = arg1;
        if (arg6 != 68) {
            method1169(52L, false);
        }
        this.field2231 = arg7;
        this.field2230 = arg4;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class192(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field2231 = arg5;
        this.field2227 = arg4;
        this.field2228 = arg3;
        this.field2233 = arg1;
        this.field2220 = arg0;
        this.field2225 = class678.field9539;
        this.field2223 = arg7;
        this.field2230 = arg2;
        this.field2224 = arg6;
    }
}
