import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class348 extends class396 {

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5084 = "Loaded title screen";

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    public int field5093;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
    public int field5094;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "Lcj;")
    public static class412 field5086;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5096;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "Ljava/lang/String;")
    public String field5087;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;III)V", line = 3)
    public static final void method2213(String arg0, String arg1, String arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 99; var8 > 0; --var8) {
            class334.field4916[var8] = class334.field4916[var8 + -1];
            class260.field3568[var8] = class260.field3568[var8 + -1];
            class379.field5573[var8] = class379.field5573[var8 + -1];
            class298.field4257[var8] = class298.field4257[var8 - 1];
            class417.field5993[var8] = class417.field5993[var8 + -1];
            class343.field5040[var8] = class343.field5040[var8 + -1];
            class436.field6394[var8] = class436.field6394[var8 - 1];
        }
        ++field5088;
        class334.field4916[0] = arg6;
        class379.field5573[0] = arg2;
        if (arg5 < 122) {
            method2213((String) null, (String) null, (String) null, -36, (String) null, -12, 53, -124);
        }
        class260.field3568[0] = arg7;
        class298.field4257[0] = arg0;
        class417.field5993[0] = arg1;
        ++class219.field3013;
        class375.field5480 = class418.field6013;
        class436.field6394[0] = arg3;
        class343.field5040[0] = arg4;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(B)V", line = 37)
    public final void method2214(byte arg0) {
        if (arg0 != 121) {
            this.field5093 = 102;
        }
        super.field5780 = class203.method1299((byte) 5) + 500L | super.field5780 & Long.MIN_VALUE;
        ++field5085;
        class240.field3262.method6(arg0 ^ -3, this);
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(B)V", line = 49)
    public static void method2215(byte arg0) {
        field5086 = null;
        field5096 = null;
        if (arg0 != 86) {
            method2217(-123, -49, false);
        }
        field5084 = null;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(B)V", line = 62)
    public final void method2216(byte arg0) {
        ++field5083;
        super.field5780 |= Long.MIN_VALUE;
        if (~this.method2220(90) == -1L) {
            class228.field3110.method6(126, this);
        }
        if (arg0 != 23) {
            method2217(78, -93, false);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZ)I", line = 79)
    public static final int method2217(int arg0, int arg1, boolean arg2) {
        ++field5090;
        if (~arg0 == 0) {
            return 12345678;
        } else {
            if (!arg2) {
                method2213((String) null, (String) null, (String) null, -92, (String) null, 7, -82, 103);
            }
            int var3 = (127 & arg0) * arg1 >> 7;
            if (~var3 > -3) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (65408 & arg0) + var3;
        }
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(B)I", line = 107)
    public final int method2218(byte arg0) {
        ++field5095;
        int var2 = -99 / ((arg0 - -40) / 51);
        return (int) super.field5248;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)I", line = 125)
    public final int method2219(int arg0) {
        int var2 = 10 % ((arg0 - 55) / 63);
        ++field5092;
        return (int) (255L & super.field5248 >>> 32);
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)J", line = 136)
    public final long method2220(int arg0) {
        ++field5089;
        if (arg0 <= 15) {
            this.method2219(51);
        }
        return Long.MAX_VALUE & super.field5780;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(II)V", line = 150)
    public class348(int arg0, int arg1) {
        super.field5248 = (long) arg0 << 32 | (long) arg1;
    }
}
