import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class572 extends class551 {

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    public static int field8051 = -1;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "D")
    public static double field8053;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "Z")
    public static boolean field8046;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
    public static final String method3213(int arg0, String[] arg1, int arg2, int arg3) {
        ++field8054;
        if (~arg0 == -1) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg1[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            for (int var7 = arg2; ~var7 > ~var5; ++var7) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var5 > var9; ++var9) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            if (arg3 != -17120) {
                method3215(-109, (class218) null, -36, -75);
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Z")
    public static final boolean method3214(int arg0, int arg1, int arg2) {
        if (arg2 < 70) {
            field8053 = -0.3046933013113084D;
        }
        ++field8052;
        return (540800 & arg1) != 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILsba;II)V")
    public static final void method3215(int arg0, class218 arg1, int arg2, int arg3) {
        ++field8048;
        if (arg1 != null) {
            if (arg3 != -6838) {
                method3213(67, (String[]) null, -92, 84);
            }
            if (arg1.field2717 != null) {
                class404 var4 = new class404();
                var4.field5714 = arg1;
                var4.field5709 = arg1.field2717;
                class498.method2775(var4);
            }
            class595.field8291 = true;
            class77.field944 = arg0;
            class372.field5190 = arg2;
            class631.field8779 = arg1.field2708;
            class553.field7817 = arg1.field2791;
            class355.field4735 = arg1.field2769;
            class169.field2109 = arg1.field2771;
            class387.field5461 = arg1.field2778;
            class277.method1652(arg3 ^ -6837, arg1);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(FI)V")
    public final void method2921(float arg0, int arg1) {
        ++field8050;
        if (arg1 < 12) {
            method3215(-34, (class218) null, 53, 96);
        }
        super.field7798 = arg0;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIF)V")
    public class572(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBII)V")
    public final void method2926(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -120) {
            method3215(-97, (class218) null, 25, 43);
        }
        super.field7800 = arg2;
        super.field7793 = arg3;
        ++field8047;
        super.field7801 = arg0;
    }
}
